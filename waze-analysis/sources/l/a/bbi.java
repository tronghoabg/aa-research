package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bbi implements com.google.v.eg {
    LOCATION_TYPE_UNSPECIFIED(0),
    HOME(1),
    WORK(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53660f;

    bbi(int i2) {
        this.f53660f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53660f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53660f);
    }
}
