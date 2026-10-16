package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aer implements com.google.v.eg {
    SEGMENT_TYPE_UNSPECIFIED(0),
    SCHOOL_ZONE(1),
    TRAFFIC(2),
    ENFORCEMENT_ZONE(3),
    AVERAGE_SPEED_ZONE(4),
    GUARDIAN(5),
    DANGER_ZONE(6),
    GROUPED_SPEED_BUMPS(7),
    GROUPED_SHARP_CURVES(8),
    GROUPED_HOV_LANE_CAMERAS(9),
    GROUPED_CARPOOL_LANE_CAMERAS(10),
    GROUPED_BUS_LANE_CAMERAS(11),
    GROUPED_CONSTRUCTION(12),
    GROUPED_HAZARD_WEATHER(13),
    GROUPED_HAZARD_WEATHER_FOG(14),
    GROUPED_HAZARD_WEATHER_HAIL(15),
    GROUPED_HAZARD_WEATHER_HEAVY_RAIN(16),
    GROUPED_HAZARD_WEATHER_FLOOD(17),
    UNRECOGNIZED(-1);

    private final int u;

    aer(int i2) {
        this.u = i2;
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
