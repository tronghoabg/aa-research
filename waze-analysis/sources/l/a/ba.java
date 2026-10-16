package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ba implements com.google.v.eg {
    ADDRESS_PREVIEW_CONTEXT_UNSPECIFIED(0),
    LPP_PARKING_SUGGESTION(1),
    LPP_HOME(2),
    LPP_WORK(3),
    LPP_SET_HOME(4),
    LPP_SET_WORK(5),
    LPP_SEARCH_RESULT(6),
    LPP_LOCATION(7),
    LPP_FAVORITE(8),
    LPP_HISTORY(9),
    LPP_SHARED_LOCATION(10),
    LPP_PLANNED_DRIVE(11),
    LPP_CALENDAR_EVENT(12),
    LPP_VERIFY_CALENDAR(13),
    LPP_UNVERIFIED_CALENDAR_EVENT(14),
    LPP_EXTERNAL_POI(15),
    LPP_AD_BOTTOM_SHEET(16),
    LPP_VENUE_FRESHNESS(17),
    UNRECOGNIZED(-1);

    private final int u;

    ba(int i2) {
        this.u = i2;
    }

    public static ba a(int i2) {
        switch (i2) {
            case 0:
                return ADDRESS_PREVIEW_CONTEXT_UNSPECIFIED;
            case 1:
                return LPP_PARKING_SUGGESTION;
            case 2:
                return LPP_HOME;
            case 3:
                return LPP_WORK;
            case 4:
                return LPP_SET_HOME;
            case 5:
                return LPP_SET_WORK;
            case 6:
                return LPP_SEARCH_RESULT;
            case 7:
                return LPP_LOCATION;
            case 8:
                return LPP_FAVORITE;
            case 9:
                return LPP_HISTORY;
            case 10:
                return LPP_SHARED_LOCATION;
            case 11:
                return LPP_PLANNED_DRIVE;
            case 12:
                return LPP_CALENDAR_EVENT;
            case 13:
                return LPP_VERIFY_CALENDAR;
            case 14:
                return LPP_UNVERIFIED_CALENDAR_EVENT;
            case 15:
                return LPP_EXTERNAL_POI;
            case 16:
                return LPP_AD_BOTTOM_SHEET;
            case 17:
                return LPP_VENUE_FRESHNESS;
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
