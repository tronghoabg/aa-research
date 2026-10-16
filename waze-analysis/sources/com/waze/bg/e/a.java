package com.waze.bg.e;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum a implements eg {
    UNSPECIFIED_DIRECTION(0),
    NORTH(1),
    NORTH_EAST(2),
    EAST(3),
    SOUTH_EAST(4),
    SOUTH(5),
    SOUTH_WEST(6),
    WEST(7),
    NORTH_WEST(8);


    /* renamed from: k, reason: collision with root package name */
    private final int f16608k;

    a(int i2) {
        this.f16608k = i2;
    }

    public static a a(int i2) {
        switch (i2) {
            case 0:
                return UNSPECIFIED_DIRECTION;
            case 1:
                return NORTH;
            case 2:
                return NORTH_EAST;
            case 3:
                return EAST;
            case 4:
                return SOUTH_EAST;
            case 5:
                return SOUTH;
            case 6:
                return SOUTH_WEST;
            case 7:
                return WEST;
            case 8:
                return NORTH_WEST;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f16608k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f16608k);
    }
}
