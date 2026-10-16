package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum rb implements com.google.v.eg {
    UNKNOWN(1),
    SIMILAR(2),
    SLOWER(3),
    FASTER(4),
    PREFERRED(5),
    TRAFFIC(6),
    ACCIDENT(7),
    CONSTRUCTION(8),
    POTHOLE(9),
    BROKEN_TRAFFIC_LIGHT(10),
    WEATHER(11),
    SLIPPERY_ROAD(12),
    FLOOD(13),
    UNPLOWED_ROAD(14),
    FOG(15),
    ICY_ROAD(16),
    BLOCKED_LANE(17);

    private final int s;

    rb(int i2) {
        this.s = i2;
    }

    public static rb a(int i2) {
        switch (i2) {
            case 1:
                return UNKNOWN;
            case 2:
                return SIMILAR;
            case 3:
                return SLOWER;
            case 4:
                return FASTER;
            case 5:
                return PREFERRED;
            case 6:
                return TRAFFIC;
            case 7:
                return ACCIDENT;
            case 8:
                return CONSTRUCTION;
            case 9:
                return POTHOLE;
            case 10:
                return BROKEN_TRAFFIC_LIGHT;
            case 11:
                return WEATHER;
            case 12:
                return SLIPPERY_ROAD;
            case 13:
                return FLOOD;
            case 14:
                return UNPLOWED_ROAD;
            case 15:
                return FOG;
            case 16:
                return ICY_ROAD;
            case 17:
                return BLOCKED_LANE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
