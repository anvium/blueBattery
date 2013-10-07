package unknown.bluebattery;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;

public class BlueBatteryService extends Service {
	private BlueBatteryBroadcastReceiver blueBatteryBroadcastReceiver;

	@Override
	public void onCreate() {
		super.onCreate();

		IntentFilter batteryChangedReceiverFilter = new IntentFilter();
		batteryChangedReceiverFilter.addAction(Intent.ACTION_BATTERY_CHANGED);

		this.blueBatteryBroadcastReceiver = new BlueBatteryBroadcastReceiver();
		registerReceiver(blueBatteryBroadcastReceiver,
				batteryChangedReceiverFilter);
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		return Service.START_STICKY;
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

}
