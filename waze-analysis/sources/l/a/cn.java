package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum cn implements com.google.v.eg {
    LOCATION_RESOLVE_METHOD_UNSPECIFIED(0),
    CACHE(1),
    LOCATION_AND_AZYMUTH(2),
    SEGMENT_DATA(3),
    FAILURE_CALCULATING(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f54724h;

    cn(int i2) {
        this.f54724h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54724h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54724h);
    }
}
