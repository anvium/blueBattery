package unknown.bluebattery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class InitializeBroadcastReceiver extends BroadcastReceiver {

	public static void initializeService(Context context) {
		Intent initializeActivityIntent = new Intent(context,
				BlueBatteryService.class);
		context.startService(initializeActivityIntent);
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		String action = intent.getAction();
		if (Intent.ACTION_BOOT_COMPLETED.equals(action)) {
			InitializeBroadcastReceiver.initializeService(context);
		}
	}

}
