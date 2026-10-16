package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ou implements com.google.v.eg {
    REPORTED_COARSE_VALUE_UNSPECIFIED(0),
    LOW(1),
    MEDIUM(2),
    HIGH(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f55204g;

    ou(int i2) {
        this.f55204g = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55204g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55204g);
    }
}
