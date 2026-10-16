package androidx.compose.foundation.layout;

import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutOrientation {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ LayoutOrientation[] $VALUES;
    public static final LayoutOrientation Horizontal = new LayoutOrientation("Horizontal", 0);
    public static final LayoutOrientation Vertical = new LayoutOrientation("Vertical", 1);

    private static final /* synthetic */ LayoutOrientation[] $values() {
        return new LayoutOrientation[]{Horizontal, Vertical};
    }

    static {
        LayoutOrientation[] layoutOrientationArr$values = $values();
        $VALUES = layoutOrientationArr$values;
        $ENTRIES = b.a(layoutOrientationArr$values);
    }

    private LayoutOrientation(String str, int i2) {
    }

    public static h.d.a<LayoutOrientation> getEntries() {
        return $ENTRIES;
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) $VALUES.clone();
    }
}
