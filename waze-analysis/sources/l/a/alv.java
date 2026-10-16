package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum alv implements com.google.v.eg {
    REASON_UNSPECIFIED(0),
    REACHED_DESTINATION(1),
    NEW_DESTINATION(2),
    NAVIGATION_STOPPED(3),
    APP_TERMINATED(4),
    PARKED(5),
    UNSUPPORTED_DISPLAY_TYPE(6),
    DESTINATION_NOT_FOUND(7),
    NAVIGATION_FAILED(8),
    NAVIGATION_CANCELLED(9),
    REPORT_TRIP_PERMISSION_DENIED(10),
    UNRECOGNIZED(-1);

    private final int n;

    alv(int i2) {
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
