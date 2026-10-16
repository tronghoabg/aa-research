package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum de implements com.google.v.eg {
    ALERTER_TYPE_UNSPECIFIED(0),
    BAD_WEATHER(1),
    CAMERA(2),
    CRASH(3),
    ECO_REGULATION(4),
    GTW_REROUTE_SUGGESTION(5),
    GUARDIAN(6),
    HAZARD(7),
    JAM(8),
    LANE_CLOSED(9),
    MAP_CHAT(10),
    MISC(11),
    POLICE(12),
    ROAD_CLOSED(13),
    SOS(14),
    SYSTEM_ROAD_CLOSED(15),
    TRAFFIC_INFO(16),
    SPEED_LIMIT_DECREASE(17),
    PERSONAL_SAFETY(18),
    TURN_CLOSURE(19),
    SCHOOL_ZONE(20),
    ANIMAL(21),
    UNRECOGNIZED(-1);

    private final int y;

    de(int i2) {
        this.y = i2;
    }

    public static de a(int i2) {
        switch (i2) {
            case 0:
                return ALERTER_TYPE_UNSPECIFIED;
            case 1:
                return BAD_WEATHER;
            case 2:
                return CAMERA;
            case 3:
                return CRASH;
            case 4:
                return ECO_REGULATION;
            case 5:
                return GTW_REROUTE_SUGGESTION;
            case 6:
                return GUARDIAN;
            case 7:
                return HAZARD;
            case 8:
                return JAM;
            case 9:
                return LANE_CLOSED;
            case 10:
                return MAP_CHAT;
            case 11:
                return MISC;
            case 12:
                return POLICE;
            case 13:
                return ROAD_CLOSED;
            case 14:
                return SOS;
            case 15:
                return SYSTEM_ROAD_CLOSED;
            case 16:
                return TRAFFIC_INFO;
            case 17:
                return SPEED_LIMIT_DECREASE;
            case 18:
                return PERSONAL_SAFETY;
            case 19:
                return TURN_CLOSURE;
            case 20:
                return SCHOOL_ZONE;
            case 21:
                return ANIMAL;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.y;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.y);
    }
}
