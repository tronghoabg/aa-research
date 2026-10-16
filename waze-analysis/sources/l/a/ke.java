package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ke implements com.google.v.eg {
    ALERTER_TYPE_UNSPECIFIED(0),
    NO_NETWORK(1),
    UNRECOGNIZED(-1);


    /* renamed from: e, reason: collision with root package name */
    private final int f55011e;

    ke(int i2) {
        this.f55011e = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55011e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55011e);
    }
}
