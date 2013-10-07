package unknown.bluebattery;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class EnterActivity extends Activity {
	private RadioGroup styleRadioGroup;

	public RadioGroup getStyleRadioGroup() {
		return styleRadioGroup;
	}

	public void setStyleRadioGroup(RadioGroup styleRadioGroup) {
		this.styleRadioGroup = styleRadioGroup;
	}

	private RadioButton defaultrRadio;

	public RadioButton getDefaultrRadio() {
		return defaultrRadio;
	}

	public void setDefaultrRadio(RadioButton defaultrRadio) {
		this.defaultrRadio = defaultrRadio;
	}

	private RadioButton numberRadio;

	public RadioButton getNumberRadio() {
		return numberRadio;
	}

	public void setNumberRadioButton(RadioButton numberRadio) {
		this.numberRadio = numberRadio;
	}

	private RadioButton diagramsRadio;

	public RadioButton getDiagramsRadio() {
		return diagramsRadio;
	}

	public void setDiagramsRadio(RadioButton diagramsRadio) {
		this.diagramsRadio = diagramsRadio;
	}

	private void initializeService() {
		Context context = this.getBaseContext();
		InitializeBroadcastReceiver.initializeService(context);
	}

	private void initializeView() {
		this.styleRadioGroup = (RadioGroup) this
				.findViewById(R.id.styleRadioGroup);
		this.defaultrRadio = (RadioButton) this
				.findViewById(R.id.defaultStyleRadio);
		this.numberRadio = (RadioButton) this
				.findViewById(R.id.numberStyleRadio);
		this.diagramsRadio = (RadioButton) this
				.findViewById(R.id.diagramsStyleRadio);

		Context context = this.getBaseContext();
		SharedPreferences batteryInformationSharedPreferences = context
				.getSharedPreferences(Preference.BATTERY_INFORMATION,
						Context.MODE_PRIVATE);
		int styleValue = batteryInformationSharedPreferences.getInt(
				Preference.BATTERY_INFORMATION_STYLE,
				BatteryInformation.DEFAULT_STYLE);
		switch (styleValue) {
		case BatteryInformation.DEFAULT_STYLE:
			this.defaultrRadio.setChecked(true);
			break;
		case BatteryInformation.NUMBER_STYLE:
			this.numberRadio.setChecked(true);
			break;
		case BatteryInformation.DIAGRAMS_STYLE:
			this.diagramsRadio.setChecked(true);
			break;
		default:
			break;
		}
	}

	private void processStyleRadioGroup() {
		final Context context = this.getBaseContext();
		this.styleRadioGroup
				.setOnCheckedChangeListener(new OnCheckedChangeListener() {

					@Override
					public void onCheckedChanged(RadioGroup group, int checkedId) {
						int styleValue = BatteryInformation.DEFAULT_STYLE;

						switch (checkedId) {
						case R.id.defaultStyleRadio:
							styleValue = BatteryInformation.DEFAULT_STYLE;
							break;
						case R.id.numberStyleRadio:
							styleValue = BatteryInformation.NUMBER_STYLE;
							break;
						case R.id.diagramsStyleRadio:
							styleValue = BatteryInformation.DIAGRAMS_STYLE;
							break;
						default:
							break;
						}

						SharedPreferences batteryInformationSharedPreferences = context
								.getSharedPreferences(
										Preference.BATTERY_INFORMATION,
										Context.MODE_PRIVATE);
						Editor editor = batteryInformationSharedPreferences
								.edit();
						editor.putInt(Preference.BATTERY_INFORMATION_STYLE,
								styleValue);
						editor.commit();

					}
				});
	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_enter);

		this.initializeService();
		this.initializeView();
		this.processStyleRadioGroup();
	}
}
