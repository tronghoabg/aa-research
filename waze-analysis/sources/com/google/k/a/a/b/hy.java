package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hy implements com.google.v.eg {
    ELEVATION_NORMAL(1),
    ELEVATION_BRIDGE(2),
    ELEVATION_TUNNEL(3),
    ELEVATION_SKYWAY(4),
    ELEVATION_STAIRWAY(5),
    ELEVATION_ESCALATOR(6),
    ELEVATION_ELEVATOR(7),
    ELEVATION_SLOPEWAY(8),
    ELEVATION_MOVING_WALKWAY(9);


    /* renamed from: k, reason: collision with root package name */
    private final int f11525k;

    hy(int i2) {
        this.f11525k = i2;
    }

    public static hy a(int i2) {
        switch (i2) {
            case 1:
                return ELEVATION_NORMAL;
            case 2:
                return ELEVATION_BRIDGE;
            case 3:
                return ELEVATION_TUNNEL;
            case 4:
                return ELEVATION_SKYWAY;
            case 5:
                return ELEVATION_STAIRWAY;
            case 6:
                return ELEVATION_ESCALATOR;
            case 7:
                return ELEVATION_ELEVATOR;
            case 8:
                return ELEVATION_SLOPEWAY;
            case 9:
                return ELEVATION_MOVING_WALKWAY;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11525k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11525k);
    }
}
