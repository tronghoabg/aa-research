package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum acq implements com.google.v.eg {
    LOCATION_UNSPECIFIED(0),
    MAP(1),
    TOP_BAR(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52216f;

    acq(int i2) {
        this.f52216f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52216f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52216f);
    }
}
