package androidx.compose.material3;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SliderComponents {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SliderComponents[] $VALUES;
    public static final SliderComponents THUMB = new SliderComponents("THUMB", 0);
    public static final SliderComponents TRACK = new SliderComponents("TRACK", 1);

    private static final /* synthetic */ SliderComponents[] $values() {
        return new SliderComponents[]{THUMB, TRACK};
    }

    static {
        SliderComponents[] sliderComponentsArr$values = $values();
        $VALUES = sliderComponentsArr$values;
        $ENTRIES = b.a(sliderComponentsArr$values);
    }

    private SliderComponents(String str, int i2) {
    }

    public static a<SliderComponents> getEntries() {
        return $ENTRIES;
    }

    public static SliderComponents valueOf(String str) {
        return (SliderComponents) Enum.valueOf(SliderComponents.class, str);
    }

    public static SliderComponents[] values() {
        return (SliderComponents[]) $VALUES.clone();
    }
}
