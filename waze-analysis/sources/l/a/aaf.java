package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum aaf implements com.google.v.eg {
    USER_ACTION_UNSPECIFIED(0),
    REPORT_CRASH(1),
    REPORT_HAZARD(2),
    REPORT_POLICE(3),
    REPORT_TRAFFIC(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f52084h;

    aaf(int i2) {
        this.f52084h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52084h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52084h);
    }
}
