package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum lp implements com.google.v.eg {
    UNSPECIFIED(0),
    TRAFFIC(1),
    HEAVY_TRAFFIC(2),
    CRASH(3),
    CONSTRUCTION(4),
    BLOCKED_LANE(5),
    BROKEN_TRAFFIC_LIGHT(6),
    JAM(7),
    POTHOLE(8),
    POLICE(9),
    HAZARD(10);

    private final int m;

    lp(int i2) {
        this.m = i2;
    }

    public static lp a(int i2) {
        switch (i2) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return TRAFFIC;
            case 2:
                return HEAVY_TRAFFIC;
            case 3:
                return CRASH;
            case 4:
                return CONSTRUCTION;
            case 5:
                return BLOCKED_LANE;
            case 6:
                return BROKEN_TRAFFIC_LIGHT;
            case 7:
                return JAM;
            case 8:
                return POTHOLE;
            case 9:
                return POLICE;
            case 10:
                return HAZARD;
            default:
                return null;
        }
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
