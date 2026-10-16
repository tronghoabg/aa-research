package androidx.compose.foundation.gestures;

import h.d.a;
import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Orientation {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Orientation[] $VALUES;
    public static final Orientation Vertical = new Orientation("Vertical", 0);
    public static final Orientation Horizontal = new Orientation("Horizontal", 1);

    private static final /* synthetic */ Orientation[] $values() {
        return new Orientation[]{Vertical, Horizontal};
    }

    static {
        Orientation[] orientationArr$values = $values();
        $VALUES = orientationArr$values;
        $ENTRIES = b.a(orientationArr$values);
    }

    private Orientation(String str, int i2) {
    }

    public static a<Orientation> getEntries() {
        return $ENTRIES;
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) $VALUES.clone();
    }
}
