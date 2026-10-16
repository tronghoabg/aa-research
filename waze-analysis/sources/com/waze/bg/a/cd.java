package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum cd implements com.google.v.eg {
    MAP_ISSUE_UNSPECIFIED(0),
    MAP_ISSUE_OTHER(5),
    MAP_ISSUE_INCORRECT_TURN(6),
    MAP_ISSUE_INCORRECT_ADDRESS(7),
    MAP_ISSUE_INCORRECT_ROUTE(8),
    MAP_ISSUE_MISSING_ROUNDABOUT(9),
    MAP_ISSUE_GENERAL_PROBLEM(10),
    MAP_ISSUE_TURN_NOT_ALLOWED(11),
    MAP_ISSUE_INCORRECT_JUNCTION(12),
    MAP_ISSUE_MISSING_BRIDGE_OVERPASS(13),
    MAP_ISSUE_WRONG_DRIVING_DIRECTIONS(14),
    MAP_ISSUE_MISSING_EXIT(15),
    MAP_ISSUE_MISSING_ROAD_UPDATE_REQUEST(16),
    MAP_ISSUE_MISPLACED_GAS_STATION(17),
    MAP_ISSUE_MISSING_LANDMARK(18),
    MAP_ISSUE_MISSING_STREET_NAME(21),
    MAP_ISSUE_INCORRECT_STREET_PREFIX_OR_SUFFIX(22),
    MAP_ISSUE_MISSING_OR_INCORRECT_SPEED_LIMIT(23),
    MAP_ISSUE_BLOCKED_ROAD(24);

    private final int u;

    cd(int i2) {
        this.u = i2;
    }

    public static com.google.v.ei a() {
        return cc.f16509a;
    }

    public static cd b(int i2) {
        if (i2 == 0) {
            return MAP_ISSUE_UNSPECIFIED;
        }
        switch (i2) {
            case 5:
                return MAP_ISSUE_OTHER;
            case 6:
                return MAP_ISSUE_INCORRECT_TURN;
            case 7:
                return MAP_ISSUE_INCORRECT_ADDRESS;
            case 8:
                return MAP_ISSUE_INCORRECT_ROUTE;
            case 9:
                return MAP_ISSUE_MISSING_ROUNDABOUT;
            case 10:
                return MAP_ISSUE_GENERAL_PROBLEM;
            case 11:
                return MAP_ISSUE_TURN_NOT_ALLOWED;
            case 12:
                return MAP_ISSUE_INCORRECT_JUNCTION;
            case 13:
                return MAP_ISSUE_MISSING_BRIDGE_OVERPASS;
            case 14:
                return MAP_ISSUE_WRONG_DRIVING_DIRECTIONS;
            case 15:
                return MAP_ISSUE_MISSING_EXIT;
            case 16:
                return MAP_ISSUE_MISSING_ROAD_UPDATE_REQUEST;
            case 17:
                return MAP_ISSUE_MISPLACED_GAS_STATION;
            case 18:
                return MAP_ISSUE_MISSING_LANDMARK;
            default:
                switch (i2) {
                    case 21:
                        return MAP_ISSUE_MISSING_STREET_NAME;
                    case 22:
                        return MAP_ISSUE_INCORRECT_STREET_PREFIX_OR_SUFFIX;
                    case 23:
                        return MAP_ISSUE_MISSING_OR_INCORRECT_SPEED_LIMIT;
                    case 24:
                        return MAP_ISSUE_BLOCKED_ROAD;
                    default:
                        return null;
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
