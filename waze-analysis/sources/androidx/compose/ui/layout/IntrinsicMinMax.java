package androidx.compose.ui.layout;

import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntrinsicMinMax {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ IntrinsicMinMax[] $VALUES;
    public static final IntrinsicMinMax Min = new IntrinsicMinMax("Min", 0);
    public static final IntrinsicMinMax Max = new IntrinsicMinMax("Max", 1);

    private static final /* synthetic */ IntrinsicMinMax[] $values() {
        return new IntrinsicMinMax[]{Min, Max};
    }

    static {
        IntrinsicMinMax[] intrinsicMinMaxArr$values = $values();
        $VALUES = intrinsicMinMaxArr$values;
        $ENTRIES = b.a(intrinsicMinMaxArr$values);
    }

    private IntrinsicMinMax(String str, int i2) {
    }

    public static h.d.a<IntrinsicMinMax> getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicMinMax valueOf(String str) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) $VALUES.clone();
    }
}
