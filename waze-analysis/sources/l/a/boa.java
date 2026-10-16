package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum boa implements com.google.v.eg {
    UGC_SUBTYPE_UNSPECIFIED(0),
    BLOCKED_LANE_DEFAULT(1),
    BLOCKED_LANE_CENTER(2),
    BLOCKED_LANE_LEFT(3),
    BLOCKED_LANE_RIGHT(4),
    CLOSURE_DEFAULT(5),
    CLOSURE_CONSTRUCTION(6),
    CLOSURE_EVENT(7),
    CLOSURE_HAZARD(8),
    CRASH_DEFAULT(9),
    CRASH_MAJOR(10),
    CRASH_MINOR(11),
    CRASH_OTHER_SIDE(12),
    CRASH_PILE_UP(13),
    HAZARD_DEFAULT(14),
    HAZARD_ANIMALS(15),
    HAZARD_BROKEN_TRAFFIC_LIGHT(16),
    HAZARD_CONSTRUCTION(17),
    HAZARD_MISSING_SIGN(18),
    HAZARD_OBJECT_ON_ROAD(19),
    HAZARD_POTHOLE(20),
    HAZARD_ROAD_KILL(21),
    HAZARD_SHOULDER_VEHICLE_STOPPED(22),
    HAZARD_VEHICLE_STOPPED(23),
    MAP_CHAT_DEFAULT(24),
    MAP_ISSUE_DEFAULT(25),
    MAP_ISSUE_GENERAL_MAP_PROBLEM(26),
    MAP_ISSUE_INCORRECT_ADDRESS(27),
    MAP_ISSUE_INCORRECT_ROUTE(28),
    MAP_ISSUE_INCORRECT_TURN(29),
    MAP_ISSUE_ISSUE(30),
    MAP_ISSUE_MISSING_ROAD(31),
    MAP_ISSUE_MISSING_ROUNDABOUT(32),
    MAP_ISSUE_PAVE(33),
    POLICE_DEFAULT(34),
    POLICE_HIDDEN(35),
    POLICE_OTHER_SIDE(36),
    ROADSIDE_HELP_DEFAULT(37),
    ROADSIDE_HELP_BATTERY_ISSUE(38),
    ROADSIDE_HELP_EMPTY_TANK(39),
    ROADSIDE_HELP_FLAT_TIRE(40),
    ROADSIDE_HELP_MEDICAL_ISSUE(41),
    TRAFFIC_DEFAULT(42),
    TRAFFIC_HEAVY(43),
    TRAFFIC_MODERATE(44),
    TRAFFIC_STANDSTILL(45),
    WEATHER_DEFAULT(46),
    WEATHER_FLOOD(47),
    WEATHER_FOG(48),
    WEATHER_HAIL(49),
    WEATHER_ICY_ROAD(50),
    WEATHER_SLIPPERY_ROAD(51),
    WEATHER_UNPLOWED_ROAD(52),
    PERSONAL_SAFETY_DEFAULT(53),
    POLICE_MOBILE_CAMERA(54),
    ANIMAL_DEFAULT(55),
    ANIMAL_IN_LANE(56),
    ANIMAL_ON_SHOULDER(57),
    UNRECOGNIZED(-1);

    private final int ai;

    boa(int i2) {
        this.ai = i2;
    }

    public static boa a(int i2) {
        switch (i2) {
            case 0:
                return UGC_SUBTYPE_UNSPECIFIED;
            case 1:
                return BLOCKED_LANE_DEFAULT;
            case 2:
                return BLOCKED_LANE_CENTER;
            case 3:
                return BLOCKED_LANE_LEFT;
            case 4:
                return BLOCKED_LANE_RIGHT;
            case 5:
                return CLOSURE_DEFAULT;
            case 6:
                return CLOSURE_CONSTRUCTION;
            case 7:
                return CLOSURE_EVENT;
            case 8:
                return CLOSURE_HAZARD;
            case 9:
                return CRASH_DEFAULT;
            case 10:
                return CRASH_MAJOR;
            case 11:
                return CRASH_MINOR;
            case 12:
                return CRASH_OTHER_SIDE;
            case 13:
                return CRASH_PILE_UP;
            case 14:
                return HAZARD_DEFAULT;
            case 15:
                return HAZARD_ANIMALS;
            case 16:
                return HAZARD_BROKEN_TRAFFIC_LIGHT;
            case 17:
                return HAZARD_CONSTRUCTION;
            case 18:
                return HAZARD_MISSING_SIGN;
            case 19:
                return HAZARD_OBJECT_ON_ROAD;
            case 20:
                return HAZARD_POTHOLE;
            case 21:
                return HAZARD_ROAD_KILL;
            case 22:
                return HAZARD_SHOULDER_VEHICLE_STOPPED;
            case 23:
                return HAZARD_VEHICLE_STOPPED;
            case 24:
                return MAP_CHAT_DEFAULT;
            case 25:
                return MAP_ISSUE_DEFAULT;
            case 26:
                return MAP_ISSUE_GENERAL_MAP_PROBLEM;
            case 27:
                return MAP_ISSUE_INCORRECT_ADDRESS;
            case 28:
                return MAP_ISSUE_INCORRECT_ROUTE;
            case 29:
                return MAP_ISSUE_INCORRECT_TURN;
            case 30:
                return MAP_ISSUE_ISSUE;
            case 31:
                return MAP_ISSUE_MISSING_ROAD;
            case 32:
                return MAP_ISSUE_MISSING_ROUNDABOUT;
            case 33:
                return MAP_ISSUE_PAVE;
            case 34:
                return POLICE_DEFAULT;
            case 35:
                return POLICE_HIDDEN;
            case 36:
                return POLICE_OTHER_SIDE;
            case 37:
                return ROADSIDE_HELP_DEFAULT;
            case 38:
                return ROADSIDE_HELP_BATTERY_ISSUE;
            case 39:
                return ROADSIDE_HELP_EMPTY_TANK;
            case 40:
                return ROADSIDE_HELP_FLAT_TIRE;
            case 41:
                return ROADSIDE_HELP_MEDICAL_ISSUE;
            case 42:
                return TRAFFIC_DEFAULT;
            case 43:
                return TRAFFIC_HEAVY;
            case 44:
                return TRAFFIC_MODERATE;
            case 45:
                return TRAFFIC_STANDSTILL;
            case 46:
                return WEATHER_DEFAULT;
            case 47:
                return WEATHER_FLOOD;
            case 48:
                return WEATHER_FOG;
            case 49:
                return WEATHER_HAIL;
            case 50:
                return WEATHER_ICY_ROAD;
            case 51:
                return WEATHER_SLIPPERY_ROAD;
            case 52:
                return WEATHER_UNPLOWED_ROAD;
            case 53:
                return PERSONAL_SAFETY_DEFAULT;
            case 54:
                return POLICE_MOBILE_CAMERA;
            case 55:
                return ANIMAL_DEFAULT;
            case 56:
                return ANIMAL_IN_LANE;
            case 57:
                return ANIMAL_ON_SHOULDER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.ai;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ai);
    }
}
