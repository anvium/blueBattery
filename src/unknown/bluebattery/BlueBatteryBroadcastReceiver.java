package unknown.bluebattery;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.RemoteViews;

public class BlueBatteryBroadcastReceiver extends BroadcastReceiver {
	private final static int NOTIFICATION_DEFAULT_ID = 0;
	private NotificationManager notificationManager;
	private Notification notification;
	private BatteryInformation batteryInformation;

	@Override
	public void onReceive(Context context, Intent intent) {
		String action = intent.getAction();
		if (Intent.ACTION_BATTERY_CHANGED.equals(action)) {
			if (this.notificationManager == null) {
				this.notificationManager = (NotificationManager) context
						.getSystemService(Context.NOTIFICATION_SERVICE);
			}
			if (this.notification == null) {
				this.notification = new Notification();
			}
			if (this.batteryInformation == null) {
				this.batteryInformation = new BatteryInformation();
			}
			
			SharedPreferences batteryInformationSharedPreferences = context
					.getSharedPreferences(Preference.BATTERY_INFORMATION,
							Context.MODE_PRIVATE);
			int style = batteryInformationSharedPreferences.getInt(
					Preference.BATTERY_INFORMATION_STYLE,
					BatteryInformation.DEFAULT_STYLE);
			this.batteryInformation.setStyle(style);
			
			int batteryLevel = intent.getIntExtra("level", 0);
			this.batteryInformation.setLevel(batteryLevel);
			this.notification.icon = this.batteryInformation
					.getBatteryLevelIcon();
			this.notification.when = System.currentTimeMillis();
			this.notification.flags |= Notification.FLAG_ONGOING_EVENT;

			Intent runIntent = new Intent(
					android.provider.Settings.ACTION_APPLICATION_SETTINGS);
			PendingIntent pendingIntent = PendingIntent.getActivity(context, 0,
					runIntent, Intent.FLAG_ACTIVITY_NEW_TASK);
			RemoteViews remoteViews = new RemoteViews(context.getPackageName(),
					R.layout.notification);

			remoteViews.setImageViewResource(
					R.id.notificationBatteryLevelImageView,
					this.notification.icon);
			remoteViews.setTextViewText(R.id.notificationBatteryLevelTextView,
					this.batteryInformation.getBatteryLevelText());

			this.notification.contentView = remoteViews;
			this.notification.contentIntent = pendingIntent;

			this.notificationManager.notify(
					BlueBatteryBroadcastReceiver.NOTIFICATION_DEFAULT_ID,
					this.notification);
		}
	}
}