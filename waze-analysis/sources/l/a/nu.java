package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum nu implements com.google.v.eg {
    VARIANT_UNSPECIFIED(0),
    VARIANT_A(1),
    VARIANT_B(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55160f;

    nu(int i2) {
        this.f55160f = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55160f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55160f);
    }
}
