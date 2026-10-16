package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ats implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    BAD_WEATHER(1),
    ACCIDENT(2),
    HAZARD(3),
    TRAFFIC(4),
    POLICE(5),
    LANE_BLOCKED(6),
    TURN_CLOSURE(7),
    ROAD_CLOSED(8),
    SYSTEM_ROAD_CLOSED(9),
    SOS(10),
    TRAFFIC_INFO(11),
    PERSONAL_SAFETY(12),
    UNRECOGNIZED(-1);

    private final int p;

    ats(int i2) {
        this.p = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
