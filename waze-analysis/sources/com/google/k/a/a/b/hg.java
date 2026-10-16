package com.google.k.a.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hg implements com.google.v.eg {
    ROAD_BARRIER_UNSPECIFIED(0),
    ROAD_BARRIER_NONE(1),
    ROAD_BARRIER_TERRAIN(2),
    ROAD_BARRIER_WIDE_UNPAVED(33),
    ROAD_BARRIER_EMBANKMENT(34),
    ROAD_BARRIER_DITCH(35),
    ROAD_BARRIER_CURB(3),
    ROAD_BARRIER_FLEXIBLE_DELINEATOR(4),
    ROAD_BARRIER_FENCE(5),
    ROAD_BARRIER_GUARDRAIL(6),
    ROAD_BARRIER_CABLE(7),
    ROAD_BARRIER_JERSEY(8),
    ROAD_BARRIER_WALL(9),
    ROAD_BARRIER_SOUND_WALL(145),
    ROAD_BARRIER_TUNNEL_WALL(146),
    ROAD_BARRIER_BARRELS(10),
    ROAD_BARRIER_TERRAIN_STRONG(11),
    ROAD_BARRIER_OTHER_STRONG(12),
    ROAD_BARRIER_OTHER_WEAK(13),
    ROAD_BARRIER_CONCRETE_BARRIER(14);

    private final int v;

    hg(int i2) {
        this.v = i2;
    }

    public static hg a(int i2) {
        if (i2 == 145) {
            return ROAD_BARRIER_SOUND_WALL;
        }
        if (i2 == 146) {
            return ROAD_BARRIER_TUNNEL_WALL;
        }
        switch (i2) {
            case 0:
                return ROAD_BARRIER_UNSPECIFIED;
            case 1:
                return ROAD_BARRIER_NONE;
            case 2:
                return ROAD_BARRIER_TERRAIN;
            case 3:
                return ROAD_BARRIER_CURB;
            case 4:
                return ROAD_BARRIER_FLEXIBLE_DELINEATOR;
            case 5:
                return ROAD_BARRIER_FENCE;
            case 6:
                return ROAD_BARRIER_GUARDRAIL;
            case 7:
                return ROAD_BARRIER_CABLE;
            case 8:
                return ROAD_BARRIER_JERSEY;
            case 9:
                return ROAD_BARRIER_WALL;
            case 10:
                return ROAD_BARRIER_BARRELS;
            case 11:
                return ROAD_BARRIER_TERRAIN_STRONG;
            case 12:
                return ROAD_BARRIER_OTHER_STRONG;
            case 13:
                return ROAD_BARRIER_OTHER_WEAK;
            case 14:
                return ROAD_BARRIER_CONCRETE_BARRIER;
            default:
                switch (i2) {
                    case 33:
                        return ROAD_BARRIER_WIDE_UNPAVED;
                    case 34:
                        return ROAD_BARRIER_EMBANKMENT;
                    case 35:
                        return ROAD_BARRIER_DITCH;
                    default:
                        return null;
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
