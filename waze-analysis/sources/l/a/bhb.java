package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bhb implements com.google.v.eg {
    RESULT_UNSPECIFIED(0),
    RESUME_DRIVE(1),
    SERVER_SUGGESTION(2),
    NOTHING_TO_SUGGEST(3),
    TIMEOUT(4),
    SERVER_ERROR(5),
    NO_REQUEST_DUE_TO_NAVIGATION(6),
    NO_REQUEST_DUE_TO_TRIP_FORCAST_FLAG_OFF(7),
    RESUME_DRIVE_OLD_EXPERIENCE(8),
    NO_REQUEST_DUE_TO_SLEEP(9),
    UNRECOGNIZED(-1);

    private final int m;

    bhb(int i2) {
        this.m = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
