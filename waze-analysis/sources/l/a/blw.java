package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum blw implements com.google.v.eg {
    ORIGIN_PROVIDER_UNSPECIFIED(0),
    BEACON(1),
    GPS(2),
    NETWORK(3),
    NOT_APPLICABLE(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f54266h;

    blw(int i2) {
        this.f54266h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54266h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54266h);
    }
}
