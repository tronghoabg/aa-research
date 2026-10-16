package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ft implements com.google.v.eg {
    METHOD_UNSPECIFIED(0),
    VISITS(1),
    SLC(2),
    OTHER(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54876g;

    ft(int i2) {
        this.f54876g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54876g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54876g);
    }
}
