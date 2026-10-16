package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum avq implements com.google.v.eg {
    IGNORE_REASON_UNSPECIFIED(0),
    CLOSE_TO_SHOWN_REASSURANCE_DETOUR(1),
    CLOSE_TO_SPLIT_POINT(2),
    EXPLICIT(3),
    INVALID_CASE(4),
    NO_SPLIT_POINT(5),
    PREVIOUS_REROUTE_NOT_RESOLVED(6),
    RECENT_USER_DECLINE(7),
    TIMEOUT(8),
    ACCEPTED_FRESHER_SUGGESTION(9),
    CARPLAY_IN_DASHBOARD_MODE(10),
    UNRECOGNIZED(-1);

    private final int n;

    avq(int i2) {
        this.n = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.n;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.n);
    }
}
