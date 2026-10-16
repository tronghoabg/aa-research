package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum agz implements com.google.v.eg {
    LOCATION_PROVIDER_UNSPECIFIED(0),
    LOCATION_PROVIDER_GPS(1),
    LOCATION_PROVIDER_NETWORK(2),
    LOCATION_PROVIDER_BEACON(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f52491g;

    agz(int i2) {
        this.f52491g = i2;
    }

    public static agz a(int i2) {
        if (i2 == 0) {
            return LOCATION_PROVIDER_UNSPECIFIED;
        }
        if (i2 == 1) {
            return LOCATION_PROVIDER_GPS;
        }
        if (i2 == 2) {
            return LOCATION_PROVIDER_NETWORK;
        }
        if (i2 != 3) {
            return null;
        }
        return LOCATION_PROVIDER_BEACON;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52491g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52491g);
    }
}
