package com.openxc.measurements;

import com.openxc.units.Percentage;
import com.openxc.util.Range;

/**
 * The BatteryLevel is the percentage of battery charge remaining.
 *
 * When the battery is fully charged, the value is 100%. When it is drained,
 * the value is 0%.
 */
public class BatteryLevel extends BaseMeasurement<Percentage> {
    private final static Range<Percentage> RANGE =
        new Range<Percentage>(new Percentage(0), new Percentage(100));
    public final static String ID = "battery_level";

    public BatteryLevel(Number value) {
        super(new Percentage(value), RANGE);
    }

    public BatteryLevel(Percentage value) {
        super(value, RANGE);
    }

    @Override
    public String getGenericName() {
        return ID;
    }
}
