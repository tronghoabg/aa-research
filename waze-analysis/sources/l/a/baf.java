package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum baf implements com.google.v.eg {
    SEGMENT_INSTRUCTION_UNSPECIFIED(0),
    SEGMENT_INSTRUCTION_TURN_LEFT(1),
    SEGMENT_INSTRUCTION_TURN_RIGHT(2),
    SEGMENT_INSTRUCTION_KEEP_LEFT(3),
    SEGMENT_INSTRUCTION_KEEP_RIGHT(4),
    SEGMENT_INSTRUCTION_CONTINUE_STRAIGHT(5),
    SEGMENT_INSTRUCTION_ROUNDABOUT_ENTER(6),
    SEGMENT_INSTRUCTION_ROUNDABOUT_EXIT(7),
    SEGMENT_INSTRUCTION_ROUNDABOUT_LEFT(8),
    SEGMENT_INSTRUCTION_ROUNDABOUT_EXIT_LEFT(9),
    SEGMENT_INSTRUCTION_ROUNDABOUT_STRAIGHT(10),
    SEGMENT_INSTRUCTION_ROUNDABOUT_EXIT_STRAIGHT(11),
    SEGMENT_INSTRUCTION_ROUNDABOUT_RIGHT(12),
    SEGMENT_INSTRUCTION_ROUNDABOUT_EXIT_RIGHT(13),
    SEGMENT_INSTRUCTION_ROUNDABOUT_U(14),
    SEGMENT_INSTRUCTION_ROUNDABOUT_EXIT_U(15),
    SEGMENT_INSTRUCTION_APPROACHING_DESTINATION(16),
    SEGMENT_INSTRUCTION_EXIT_LEFT(17),
    SEGMENT_INSTRUCTION_EXIT_RIGHT(18),
    SEGMENT_INSTRUCTION_WAYPOINT_DELAY(19),
    SEGMENT_INSTRUCTION_U_TURN(20),
    SEGMENT_INSTRUCTION_LAST_DIRECTION(21),
    SEGMENT_INSTRUCTION_SLIGHT_LEFT(22),
    SEGMENT_INSTRUCTION_SHARP_LEFT(23),
    SEGMENT_INSTRUCTION_SLIGHT_RIGHT(24),
    SEGMENT_INSTRUCTION_SHARP_RIGHT(25),
    SEGMENT_INSTRUCTION_ENTER_HOV_LANE(26),
    UNRECOGNIZED(-1);

    private final int D;

    baf(int i2) {
        this.D = i2;
    }

    public static baf a(int i2) {
        switch (i2) {
            case 0:
                return SEGMENT_INSTRUCTION_UNSPECIFIED;
            case 1:
                return SEGMENT_INSTRUCTION_TURN_LEFT;
            case 2:
                return SEGMENT_INSTRUCTION_TURN_RIGHT;
            case 3:
                return SEGMENT_INSTRUCTION_KEEP_LEFT;
            case 4:
                return SEGMENT_INSTRUCTION_KEEP_RIGHT;
            case 5:
                return SEGMENT_INSTRUCTION_CONTINUE_STRAIGHT;
            case 6:
                return SEGMENT_INSTRUCTION_ROUNDABOUT_ENTER;
            case 7:
                return SEGMENT_INSTRUCTION_ROUNDABOUT_EXIT;
            case 8:
                return SEGMENT_INSTRUCTION_ROUNDABOUT_LEFT;
            case 9:
                return SEGMENT_INSTRUCTION_ROUNDABOUT_EXIT_LEFT;
            case 10:
                return SEGMENT_INSTRUCTION_ROUNDABOUT_STRAIGHT;
            case 11:
                return SEGMENT_INSTRUCTION_ROUNDABOUT_EXIT_STRAIGHT;
            case 12:
                return SEGMENT_INSTRUCTION_ROUNDABOUT_RIGHT;
            case 13:
                return SEGMENT_INSTRUCTION_ROUNDABOUT_EXIT_RIGHT;
            case 14:
                return SEGMENT_INSTRUCTION_ROUNDABOUT_U;
            case 15:
                return SEGMENT_INSTRUCTION_ROUNDABOUT_EXIT_U;
            case 16:
                return SEGMENT_INSTRUCTION_APPROACHING_DESTINATION;
            case 17:
                return SEGMENT_INSTRUCTION_EXIT_LEFT;
            case 18:
                return SEGMENT_INSTRUCTION_EXIT_RIGHT;
            case 19:
                return SEGMENT_INSTRUCTION_WAYPOINT_DELAY;
            case 20:
                return SEGMENT_INSTRUCTION_U_TURN;
            case 21:
                return SEGMENT_INSTRUCTION_LAST_DIRECTION;
            case 22:
                return SEGMENT_INSTRUCTION_SLIGHT_LEFT;
            case 23:
                return SEGMENT_INSTRUCTION_SHARP_LEFT;
            case 24:
                return SEGMENT_INSTRUCTION_SLIGHT_RIGHT;
            case 25:
                return SEGMENT_INSTRUCTION_SHARP_RIGHT;
            case 26:
                return SEGMENT_INSTRUCTION_ENTER_HOV_LANE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.D;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.D);
    }
}
