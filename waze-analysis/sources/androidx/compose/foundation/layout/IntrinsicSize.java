package androidx.compose.foundation.layout;

import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class IntrinsicSize {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ IntrinsicSize[] $VALUES;
    public static final IntrinsicSize Min = new IntrinsicSize("Min", 0);
    public static final IntrinsicSize Max = new IntrinsicSize("Max", 1);

    private static final /* synthetic */ IntrinsicSize[] $values() {
        return new IntrinsicSize[]{Min, Max};
    }

    static {
        IntrinsicSize[] intrinsicSizeArr$values = $values();
        $VALUES = intrinsicSizeArr$values;
        $ENTRIES = b.a(intrinsicSizeArr$values);
    }

    private IntrinsicSize(String str, int i2) {
    }

    public static h.d.a<IntrinsicSize> getEntries() {
        return $ENTRIES;
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) $VALUES.clone();
    }
}
