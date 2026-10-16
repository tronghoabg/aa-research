package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum alp implements com.google.v.eg {
    REQUEST_TYPE_UNSPECIFIED(0),
    VALIDATE_ACTION_TOKEN(1),
    REPORT_TRIP_PROGRESS(2),
    NAVIGATION_STOPPED(3),
    NAV_CONNECT_FAILED(4),
    CONSENT_DECLINED(5),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    private final int f52699i;

    alp(int i2) {
        this.f52699i = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52699i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52699i);
    }
}
