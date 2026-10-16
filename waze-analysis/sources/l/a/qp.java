package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum qp implements com.google.v.eg {
    DESTINATION_TYPE_UNSPECIFIED(0),
    HOME(1),
    WORK(2),
    FAVORITE(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55317g;

    qp(int i2) {
        this.f55317g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55317g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55317g);
    }
}
