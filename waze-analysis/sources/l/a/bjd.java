package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bjd implements com.google.v.eg {
    LOCATION_PROVIDER_UNSPECIFIED(0),
    CAR_GPS(1),
    GPS(2),
    NETWORK(3),
    FUSED(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f54079h;

    bjd(int i2) {
        this.f54079h = i2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54079h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54079h);
    }
}
