package unknown.bluebattery;

public class BatteryInformation {
	public final static int DEFAULT_STYLE = 0;
	public final static int NUMBER_STYLE = 1;
	public final static int DIAGRAMS_STYLE = 2;
	public final static int[] BATTERY_LEVEL_DEFAULT_ICONS = {
			R.drawable.default_000, R.drawable.default_001,
			R.drawable.default_002, R.drawable.default_003,
			R.drawable.default_004, R.drawable.default_005,
			R.drawable.default_006, R.drawable.default_007,
			R.drawable.default_008, R.drawable.default_009,
			R.drawable.default_010, R.drawable.default_011,
			R.drawable.default_012, R.drawable.default_013,
			R.drawable.default_014, R.drawable.default_015,
			R.drawable.default_016, R.drawable.default_017,
			R.drawable.default_018, R.drawable.default_019,
			R.drawable.default_020, R.drawable.default_021,
			R.drawable.default_022, R.drawable.default_023,
			R.drawable.default_024, R.drawable.default_025,
			R.drawable.default_026, R.drawable.default_027,
			R.drawable.default_028, R.drawable.default_029,
			R.drawable.default_030, R.drawable.default_031,
			R.drawable.default_032, R.drawable.default_033,
			R.drawable.default_034, R.drawable.default_035,
			R.drawable.default_036, R.drawable.default_037,
			R.drawable.default_038, R.drawable.default_039,
			R.drawable.default_040, R.drawable.default_041,
			R.drawable.default_042, R.drawable.default_043,
			R.drawable.default_044, R.drawable.default_045,
			R.drawable.default_046, R.drawable.default_047,
			R.drawable.default_048, R.drawable.default_049,
			R.drawable.default_050, R.drawable.default_051,
			R.drawable.default_052, R.drawable.default_053,
			R.drawable.default_054, R.drawable.default_055,
			R.drawable.default_056, R.drawable.default_057,
			R.drawable.default_058, R.drawable.default_059,
			R.drawable.default_060, R.drawable.default_061,
			R.drawable.default_062, R.drawable.default_063,
			R.drawable.default_064, R.drawable.default_065,
			R.drawable.default_066, R.drawable.default_067,
			R.drawable.default_068, R.drawable.default_069,
			R.drawable.default_070, R.drawable.default_071,
			R.drawable.default_072, R.drawable.default_073,
			R.drawable.default_074, R.drawable.default_075,
			R.drawable.default_076, R.drawable.default_077,
			R.drawable.default_078, R.drawable.default_079,
			R.drawable.default_080, R.drawable.default_081,
			R.drawable.default_082, R.drawable.default_083,
			R.drawable.default_084, R.drawable.default_085,
			R.drawable.default_086, R.drawable.default_087,
			R.drawable.default_088, R.drawable.default_089,
			R.drawable.default_090, R.drawable.default_091,
			R.drawable.default_092, R.drawable.default_093,
			R.drawable.default_094, R.drawable.default_095,
			R.drawable.default_096, R.drawable.default_097,
			R.drawable.default_098, R.drawable.default_099,
			R.drawable.default_100 };
	public final static int[] BATTERY_LEVEL_NUMBER_ICONS = {
			R.drawable.number_000, R.drawable.number_001,
			R.drawable.number_002, R.drawable.number_003,
			R.drawable.number_004, R.drawable.number_005,
			R.drawable.number_006, R.drawable.number_007,
			R.drawable.number_008, R.drawable.number_009,
			R.drawable.number_010, R.drawable.number_011,
			R.drawable.number_012, R.drawable.number_013,
			R.drawable.number_014, R.drawable.number_015,
			R.drawable.number_016, R.drawable.number_017,
			R.drawable.number_018, R.drawable.number_019,
			R.drawable.number_020, R.drawable.number_021,
			R.drawable.number_022, R.drawable.number_023,
			R.drawable.number_024, R.drawable.number_025,
			R.drawable.number_026, R.drawable.number_027,
			R.drawable.number_028, R.drawable.number_029,
			R.drawable.number_030, R.drawable.number_031,
			R.drawable.number_032, R.drawable.number_033,
			R.drawable.number_034, R.drawable.number_035,
			R.drawable.number_036, R.drawable.number_037,
			R.drawable.number_038, R.drawable.number_039,
			R.drawable.number_040, R.drawable.number_041,
			R.drawable.number_042, R.drawable.number_043,
			R.drawable.number_044, R.drawable.number_045,
			R.drawable.number_046, R.drawable.number_047,
			R.drawable.number_048, R.drawable.number_049,
			R.drawable.number_050, R.drawable.number_051,
			R.drawable.number_052, R.drawable.number_053,
			R.drawable.number_054, R.drawable.number_055,
			R.drawable.number_056, R.drawable.number_057,
			R.drawable.number_058, R.drawable.number_059,
			R.drawable.number_060, R.drawable.number_061,
			R.drawable.number_062, R.drawable.number_063,
			R.drawable.number_064, R.drawable.number_065,
			R.drawable.number_066, R.drawable.number_067,
			R.drawable.number_068, R.drawable.number_069,
			R.drawable.number_070, R.drawable.number_071,
			R.drawable.number_072, R.drawable.number_073,
			R.drawable.number_074, R.drawable.number_075,
			R.drawable.number_076, R.drawable.number_077,
			R.drawable.number_078, R.drawable.number_079,
			R.drawable.number_080, R.drawable.number_081,
			R.drawable.number_082, R.drawable.number_083,
			R.drawable.number_084, R.drawable.number_085,
			R.drawable.number_086, R.drawable.number_087,
			R.drawable.number_088, R.drawable.number_089,
			R.drawable.number_090, R.drawable.number_091,
			R.drawable.number_092, R.drawable.number_093,
			R.drawable.number_094, R.drawable.number_095,
			R.drawable.number_096, R.drawable.number_097,
			R.drawable.number_098, R.drawable.number_099, R.drawable.number_100 };
	public final static int[] BATTERY_LEVEL_DIAGRAMS_ICONS = {
			R.drawable.diagrams_00_09, R.drawable.diagrams_00_09,
			R.drawable.diagrams_00_09, R.drawable.diagrams_00_09,
			R.drawable.diagrams_00_09, R.drawable.diagrams_00_09,
			R.drawable.diagrams_00_09, R.drawable.diagrams_00_09,
			R.drawable.diagrams_00_09, R.drawable.diagrams_00_09,
			R.drawable.diagrams_10_19, R.drawable.diagrams_10_19,
			R.drawable.diagrams_10_19, R.drawable.diagrams_10_19,
			R.drawable.diagrams_10_19, R.drawable.diagrams_10_19,
			R.drawable.diagrams_10_19, R.drawable.diagrams_10_19,
			R.drawable.diagrams_10_19, R.drawable.diagrams_10_19,
			R.drawable.diagrams_20_29, R.drawable.diagrams_20_29,
			R.drawable.diagrams_20_29, R.drawable.diagrams_20_29,
			R.drawable.diagrams_20_29, R.drawable.diagrams_20_29,
			R.drawable.diagrams_20_29, R.drawable.diagrams_20_29,
			R.drawable.diagrams_20_29, R.drawable.diagrams_20_29,
			R.drawable.diagrams_30_39, R.drawable.diagrams_30_39,
			R.drawable.diagrams_30_39, R.drawable.diagrams_30_39,
			R.drawable.diagrams_30_39, R.drawable.diagrams_30_39,
			R.drawable.diagrams_30_39, R.drawable.diagrams_30_39,
			R.drawable.diagrams_30_39, R.drawable.diagrams_30_39,
			R.drawable.diagrams_40_49, R.drawable.diagrams_40_49,
			R.drawable.diagrams_40_49, R.drawable.diagrams_40_49,
			R.drawable.diagrams_40_49, R.drawable.diagrams_40_49,
			R.drawable.diagrams_40_49, R.drawable.diagrams_40_49,
			R.drawable.diagrams_40_49, R.drawable.diagrams_40_49,
			R.drawable.diagrams_50_59, R.drawable.diagrams_50_59,
			R.drawable.diagrams_50_59, R.drawable.diagrams_50_59,
			R.drawable.diagrams_50_59, R.drawable.diagrams_50_59,
			R.drawable.diagrams_50_59, R.drawable.diagrams_50_59,
			R.drawable.diagrams_50_59, R.drawable.diagrams_50_59,
			R.drawable.diagrams_60_69, R.drawable.diagrams_60_69,
			R.drawable.diagrams_60_69, R.drawable.diagrams_60_69,
			R.drawable.diagrams_60_69, R.drawable.diagrams_60_69,
			R.drawable.diagrams_60_69, R.drawable.diagrams_60_69,
			R.drawable.diagrams_60_69, R.drawable.diagrams_60_69,
			R.drawable.diagrams_70_79, R.drawable.diagrams_70_79,
			R.drawable.diagrams_70_79, R.drawable.diagrams_70_79,
			R.drawable.diagrams_70_79, R.drawable.diagrams_70_79,
			R.drawable.diagrams_70_79, R.drawable.diagrams_70_79,
			R.drawable.diagrams_70_79, R.drawable.diagrams_70_79,
			R.drawable.diagrams_80_89, R.drawable.diagrams_80_89,
			R.drawable.diagrams_80_89, R.drawable.diagrams_80_89,
			R.drawable.diagrams_80_89, R.drawable.diagrams_80_89,
			R.drawable.diagrams_80_89, R.drawable.diagrams_80_89,
			R.drawable.diagrams_80_89, R.drawable.diagrams_80_89,
			R.drawable.diagrams_90_99, R.drawable.diagrams_90_99,
			R.drawable.diagrams_90_99, R.drawable.diagrams_90_99,
			R.drawable.diagrams_90_99, R.drawable.diagrams_90_99,
			R.drawable.diagrams_90_99, R.drawable.diagrams_90_99,
			R.drawable.diagrams_90_99, R.drawable.diagrams_90_99,
			R.drawable.diagrams_100 };
	public final static int[][] BATTERY_LEVEL_ICONS = {
			BatteryInformation.BATTERY_LEVEL_DEFAULT_ICONS,
			BATTERY_LEVEL_NUMBER_ICONS,
			BatteryInformation.BATTERY_LEVEL_DIAGRAMS_ICONS };

	private int style;

	public int getStyle() {
		return style;
	}

	public void setStyle(int style) {
		this.style = style;
	}

	private int level;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getBatteryLevelIcon() {
		int styleValue = this.getStyle();
		int levelValue = this.getLevel();
		return BatteryInformation.BATTERY_LEVEL_ICONS[styleValue][levelValue];
	}

	public String getBatteryLevelText() {
		int levelValue = this.getLevel();
		return String.format("%s%%", Integer.toString(levelValue));
	}
}
