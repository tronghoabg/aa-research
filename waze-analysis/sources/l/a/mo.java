package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum mo implements com.google.v.eg {
    SERVICE_NAME_UNSPECIFIED(0),
    REPORTING(1),
    COMPANINIO(2),
    SEARCH_AGENT(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55104g;

    mo(int i2) {
        this.f55104g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55104g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55104g);
    }
}
