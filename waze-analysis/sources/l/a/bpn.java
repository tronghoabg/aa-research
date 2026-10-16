package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bpn implements com.google.v.eg {
    TYPE_UNSPECIFIED(0),
    MOTORCYCLE(1),
    PRIVATE(2),
    TAXI(3),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    private final int f54468g;

    bpn(int i2) {
        this.f54468g = i2;
    }

    public static bpn a(int i2) {
        if (i2 == 0) {
            return TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return MOTORCYCLE;
        }
        if (i2 == 2) {
            return PRIVATE;
        }
        if (i2 != 3) {
            return null;
        }
        return TAXI;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54468g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54468g);
    }
}
