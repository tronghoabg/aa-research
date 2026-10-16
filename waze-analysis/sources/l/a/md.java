package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum md implements com.google.v.eg {
    CONVERSATION_CLIENT_FUNCTION_UNSPECIFIED(0),
    PLAY_SOUND(1),
    DISPLAY_TEXT(2),
    REPORT_MAP_ISSUE(3),
    REPORT_ALERT(4),
    UPDATE_FAVORITES(5),
    CALCULATE_ROUTE(6),
    SHOW_SEARCH_RESULTS(7),
    START_NAVIGATION(8),
    CHANGE_VOICE_GUIDANCE_MODE(9),
    SEND_USER_LOGS(10),
    STOP_NAVIGATION(11),
    GET_CLOSURE_CANDIDATES(12),
    REPORT_CLOSURE(13),
    SHOW_LOCATION_PREVIEW(14),
    SHOW_TRIP_OVERVIEW(15),
    UNRECOGNIZED(-1);

    private final int s;

    md(int i2) {
        this.s = i2;
    }

    public static md a(int i2) {
        switch (i2) {
            case 0:
                return CONVERSATION_CLIENT_FUNCTION_UNSPECIFIED;
            case 1:
                return PLAY_SOUND;
            case 2:
                return DISPLAY_TEXT;
            case 3:
                return REPORT_MAP_ISSUE;
            case 4:
                return REPORT_ALERT;
            case 5:
                return UPDATE_FAVORITES;
            case 6:
                return CALCULATE_ROUTE;
            case 7:
                return SHOW_SEARCH_RESULTS;
            case 8:
                return START_NAVIGATION;
            case 9:
                return CHANGE_VOICE_GUIDANCE_MODE;
            case 10:
                return SEND_USER_LOGS;
            case 11:
                return STOP_NAVIGATION;
            case 12:
                return GET_CLOSURE_CANDIDATES;
            case 13:
                return REPORT_CLOSURE;
            case 14:
                return SHOW_LOCATION_PREVIEW;
            case 15:
                return SHOW_TRIP_OVERVIEW;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
