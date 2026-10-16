package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bae implements com.google.v.eg {
    SEGMENT_TYPE_UNSPECIFIED(0),
    SEGMENT_TYPE_SCHOOL_ZONE(1),
    SEGMENT_TYPE_TRAFFIC(2),
    SEGMENT_TYPE_ENFORCEMENT_ZONE(3),
    SEGMENT_TYPE_AVERAGE_SPEED_ZONE(4),
    SEGMENT_TYPE_GUARDIAN(5),
    SEGMENT_TYPE_DANGER_ZONE(6),
    SEGMENT_TYPE_GROUPED_SPEED_BUMPS(7),
    SEGMENT_TYPE_GROUPED_SHARP_CURVES(8),
    SEGMENT_TYPE_GROUPED_HOV_LANE_CAMERAS(9),
    SEGMENT_TYPE_GROUPED_CARPOOL_LANE_CAMERAS(10),
    SEGMENT_TYPE_GROUPED_BUS_LANE_CAMERAS(11),
    SEGMENT_TYPE_GROUPED_CONSTRUCTION(12),
    SEGMENT_TYPE_GROUPED_HAZARD_WEATHER(13),
    SEGMENT_TYPE_GROUPED_HAZARD_WEATHER_FOG(14),
    SEGMENT_TYPE_GROUPED_HAZARD_WEATHER_HAIL(15),
    SEGMENT_TYPE_GROUPED_HAZARD_WEATHER_HEAVY_RAIN(16),
    SEGMENT_TYPE_GROUPED_HAZARD_WEATHER_FLOOD(17),
    UNRECOGNIZED(-1);

    private final int u;

    bae(int i2) {
        this.u = i2;
    }

    public static bae a(int i2) {
        switch (i2) {
            case 0:
                return SEGMENT_TYPE_UNSPECIFIED;
            case 1:
                return SEGMENT_TYPE_SCHOOL_ZONE;
            case 2:
                return SEGMENT_TYPE_TRAFFIC;
            case 3:
                return SEGMENT_TYPE_ENFORCEMENT_ZONE;
            case 4:
                return SEGMENT_TYPE_AVERAGE_SPEED_ZONE;
            case 5:
                return SEGMENT_TYPE_GUARDIAN;
            case 6:
                return SEGMENT_TYPE_DANGER_ZONE;
            case 7:
                return SEGMENT_TYPE_GROUPED_SPEED_BUMPS;
            case 8:
                return SEGMENT_TYPE_GROUPED_SHARP_CURVES;
            case 9:
                return SEGMENT_TYPE_GROUPED_HOV_LANE_CAMERAS;
            case 10:
                return SEGMENT_TYPE_GROUPED_CARPOOL_LANE_CAMERAS;
            case 11:
                return SEGMENT_TYPE_GROUPED_BUS_LANE_CAMERAS;
            case 12:
                return SEGMENT_TYPE_GROUPED_CONSTRUCTION;
            case 13:
                return SEGMENT_TYPE_GROUPED_HAZARD_WEATHER;
            case 14:
                return SEGMENT_TYPE_GROUPED_HAZARD_WEATHER_FOG;
            case 15:
                return SEGMENT_TYPE_GROUPED_HAZARD_WEATHER_HAIL;
            case 16:
                return SEGMENT_TYPE_GROUPED_HAZARD_WEATHER_HEAVY_RAIN;
            case 17:
                return SEGMENT_TYPE_GROUPED_HAZARD_WEATHER_FLOOD;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
