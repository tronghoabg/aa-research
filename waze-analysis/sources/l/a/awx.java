package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum awx implements com.google.v.eg {
    USE_CASE_UNSPECIFIED(0),
    USE_CASE_ALTERNATIVE_ROUTES(1),
    USE_CASE_CLOSURE_REROUTE(2),
    USE_CASE_MAIN_NAVIGATION(3),
    USE_CASE_NA_1(4),
    USE_CASE_OFFLINE_RECOVERY(5),
    USE_CASE_REROUTE(6),
    USE_CASE_REROUTE_SUGGESTION(7),
    USE_CASE_RESUME_NAVIGATION(8),
    USE_CASE_SETTINGS_CHANGED(9),
    USE_CASE_TRIP_OVERVIEW(10),
    USE_CASE_WAYPOINT_MISSING(11),
    USE_CASE_USER_DEVIATION_REROUTE(12),
    USE_CASE_CANCEL_WAYPOINT(13),
    USE_CASE_DEBUG_REROUTE(14),
    USE_CASE_ETA_RANGE(15),
    USE_CASE_GET_WALKING_ETA_TO_PARKING_LOTS(16),
    USE_CASE_PARKING_ETA(17),
    USE_CASE_PERIODIC_RETRY(18),
    USE_CASE_SELECT_VENUE_ENTRY_POINT(19),
    USE_CASE_TRIP_OVERVIEW_V2(20),
    USE_CASE_SELECT_ROUTE(21),
    USE_CASE_START_NAVIGATION(22),
    USE_CASE_ERROR_RECOVERY(23),
    UNRECOGNIZED(-1);

    private final int A;

    awx(int i2) {
        this.A = i2;
    }

    public static awx a(int i2) {
        switch (i2) {
            case 0:
                return USE_CASE_UNSPECIFIED;
            case 1:
                return USE_CASE_ALTERNATIVE_ROUTES;
            case 2:
                return USE_CASE_CLOSURE_REROUTE;
            case 3:
                return USE_CASE_MAIN_NAVIGATION;
            case 4:
                return USE_CASE_NA_1;
            case 5:
                return USE_CASE_OFFLINE_RECOVERY;
            case 6:
                return USE_CASE_REROUTE;
            case 7:
                return USE_CASE_REROUTE_SUGGESTION;
            case 8:
                return USE_CASE_RESUME_NAVIGATION;
            case 9:
                return USE_CASE_SETTINGS_CHANGED;
            case 10:
                return USE_CASE_TRIP_OVERVIEW;
            case 11:
                return USE_CASE_WAYPOINT_MISSING;
            case 12:
                return USE_CASE_USER_DEVIATION_REROUTE;
            case 13:
                return USE_CASE_CANCEL_WAYPOINT;
            case 14:
                return USE_CASE_DEBUG_REROUTE;
            case 15:
                return USE_CASE_ETA_RANGE;
            case 16:
                return USE_CASE_GET_WALKING_ETA_TO_PARKING_LOTS;
            case 17:
                return USE_CASE_PARKING_ETA;
            case 18:
                return USE_CASE_PERIODIC_RETRY;
            case 19:
                return USE_CASE_SELECT_VENUE_ENTRY_POINT;
            case 20:
                return USE_CASE_TRIP_OVERVIEW_V2;
            case 21:
                return USE_CASE_SELECT_ROUTE;
            case 22:
                return USE_CASE_START_NAVIGATION;
            case 23:
                return USE_CASE_ERROR_RECOVERY;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
