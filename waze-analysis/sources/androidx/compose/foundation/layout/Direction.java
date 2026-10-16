package androidx.compose.foundation.layout;

import h.d.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Direction {
    private static final /* synthetic */ h.d.a $ENTRIES;
    private static final /* synthetic */ Direction[] $VALUES;
    public static final Direction Vertical = new Direction("Vertical", 0);
    public static final Direction Horizontal = new Direction("Horizontal", 1);
    public static final Direction Both = new Direction("Both", 2);

    private static final /* synthetic */ Direction[] $values() {
        return new Direction[]{Vertical, Horizontal, Both};
    }

    static {
        Direction[] directionArr$values = $values();
        $VALUES = directionArr$values;
        $ENTRIES = b.a(directionArr$values);
    }

    private Direction(String str, int i2) {
    }

    public static h.d.a<Direction> getEntries() {
        return $ENTRIES;
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) $VALUES.clone();
    }
}
