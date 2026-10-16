package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum auy implements com.google.v.eg {
    REPORTING_REASON_UNSPECIFIED(0),
    SESSION_STARTUP(1),
    COUNTRY_CHANGED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53223f;

    auy(int i2) {
        this.f53223f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53223f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53223f);
    }
}
