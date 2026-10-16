package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum gn implements com.google.v.eg {
    DISTANCE_SOURCE_UNSPECIFIED(0),
    AERIAL(1),
    CLIENT(2),
    HUBCAPS(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54917g;

    gn(int i2) {
        this.f54917g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54917g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54917g);
    }
}
