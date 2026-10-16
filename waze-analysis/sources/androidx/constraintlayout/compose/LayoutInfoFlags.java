package androidx.constraintlayout.compose;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LayoutInfoFlags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LayoutInfoFlags[] $VALUES;
    public static final LayoutInfoFlags NONE = new LayoutInfoFlags("NONE", 0);
    public static final LayoutInfoFlags BOUNDS = new LayoutInfoFlags("BOUNDS", 1);

    private static final /* synthetic */ LayoutInfoFlags[] $values() {
        return new LayoutInfoFlags[]{NONE, BOUNDS};
    }

    static {
        LayoutInfoFlags[] layoutInfoFlagsArr$values = $values();
        $VALUES = layoutInfoFlagsArr$values;
        $ENTRIES = b.a(layoutInfoFlagsArr$values);
    }

    private LayoutInfoFlags(String str, int i2) {
    }

    public static a<LayoutInfoFlags> getEntries() {
        return $ENTRIES;
    }

    public static LayoutInfoFlags valueOf(String str) {
        return (LayoutInfoFlags) Enum.valueOf(LayoutInfoFlags.class, str);
    }

    public static LayoutInfoFlags[] values() {
        return (LayoutInfoFlags[]) $VALUES.clone();
    }
}
