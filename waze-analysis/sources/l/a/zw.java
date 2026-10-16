package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum zw implements com.google.v.eg {
    ACTION_UNSPECIFIED(0),
    ALTERNATE_ROUTES(1),
    ETA_QUERY(2),
    NAVIGATE(3),
    RECENTER(4),
    REPORT_CRASH(5),
    REPORT_HAZARD(6),
    REPORT_POLICE(7),
    REPORT_TRAFFIC(8),
    ROUTE_OVERVIEW(9),
    ROUTE_PREFERENCE_HIGHWAYS(10),
    ROUTE_PREFERENCE_TOLLS(11),
    SEARCH(12),
    SET_HOME(13),
    SET_WORK(14),
    SHOW_DIRECTIONS(15),
    STOP_NAVIGATION(16),
    VOICE_DIRECTIONS(17),
    SEND_REPORT(18),
    UNRECOGNIZED(-1);

    private final int v;

    zw(int i2) {
        this.v = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
