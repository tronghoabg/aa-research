package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bob implements com.google.v.eg {
    UGC_TYPE_UNSPECIFIED(0),
    ADD_PLACE(1),
    BLOCKED_LANE(2),
    CLOSURE(3),
    CRASH(4),
    DEBUG(5),
    GAS(6),
    HAZARD_ON_ROAD(7),
    HAZARD(8),
    MAP_CHAT(9),
    MAP_ISSUE(10),
    POLICE(11),
    ROADSIDE_HELP(12),
    TRAFFIC(13),
    WEATHER(14),
    PERSONAL_SAFETY(15),
    ANIMAL(16),
    UNRECOGNIZED(-1);

    private final int t;

    bob(int i2) {
        this.t = i2;
    }

    public static bob a(int i2) {
        switch (i2) {
            case 0:
                return UGC_TYPE_UNSPECIFIED;
            case 1:
                return ADD_PLACE;
            case 2:
                return BLOCKED_LANE;
            case 3:
                return CLOSURE;
            case 4:
                return CRASH;
            case 5:
                return DEBUG;
            case 6:
                return GAS;
            case 7:
                return HAZARD_ON_ROAD;
            case 8:
                return HAZARD;
            case 9:
                return MAP_CHAT;
            case 10:
                return MAP_ISSUE;
            case 11:
                return POLICE;
            case 12:
                return ROADSIDE_HELP;
            case 13:
                return TRAFFIC;
            case 14:
                return WEATHER;
            case 15:
                return PERSONAL_SAFETY;
            case 16:
                return ANIMAL;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.t;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.t);
    }
}
