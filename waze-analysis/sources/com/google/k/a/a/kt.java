package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum kt implements com.google.v.eg {
    DIRECTION_NONE(0),
    DIRECTION_NORTH(1),
    DIRECTION_EAST(2),
    DIRECTION_SOUTH(3),
    DIRECTION_WEST(4),
    DIRECTION_NORTHEAST(5),
    DIRECTION_NORTHWEST(6),
    DIRECTION_SOUTHEAST(7),
    DIRECTION_SOUTHWEST(8),
    DIRECTION_INNER(9),
    DIRECTION_OUTER(10);

    private final int m;

    kt(int i2) {
        this.m = i2;
    }

    public static kt a(int i2) {
        switch (i2) {
            case 0:
                return DIRECTION_NONE;
            case 1:
                return DIRECTION_NORTH;
            case 2:
                return DIRECTION_EAST;
            case 3:
                return DIRECTION_SOUTH;
            case 4:
                return DIRECTION_WEST;
            case 5:
                return DIRECTION_NORTHEAST;
            case 6:
                return DIRECTION_NORTHWEST;
            case 7:
                return DIRECTION_SOUTHEAST;
            case 8:
                return DIRECTION_SOUTHWEST;
            case 9:
                return DIRECTION_INNER;
            case 10:
                return DIRECTION_OUTER;
            default:
                return null;
        }
    }

    public static com.google.v.ei b() {
        return ha.s;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
