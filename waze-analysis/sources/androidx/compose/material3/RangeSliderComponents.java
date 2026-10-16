package androidx.compose.material3;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class RangeSliderComponents {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RangeSliderComponents[] $VALUES;
    public static final RangeSliderComponents ENDTHUMB = new RangeSliderComponents("ENDTHUMB", 0);
    public static final RangeSliderComponents STARTTHUMB = new RangeSliderComponents("STARTTHUMB", 1);
    public static final RangeSliderComponents TRACK = new RangeSliderComponents("TRACK", 2);

    private static final /* synthetic */ RangeSliderComponents[] $values() {
        return new RangeSliderComponents[]{ENDTHUMB, STARTTHUMB, TRACK};
    }

    static {
        RangeSliderComponents[] rangeSliderComponentsArr$values = $values();
        $VALUES = rangeSliderComponentsArr$values;
        $ENTRIES = b.a(rangeSliderComponentsArr$values);
    }

    private RangeSliderComponents(String str, int i2) {
    }

    public static a<RangeSliderComponents> getEntries() {
        return $ENTRIES;
    }

    public static RangeSliderComponents valueOf(String str) {
        return (RangeSliderComponents) Enum.valueOf(RangeSliderComponents.class, str);
    }

    public static RangeSliderComponents[] values() {
        return (RangeSliderComponents[]) $VALUES.clone();
    }
}
