package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum vh implements com.google.v.eg {
    SPECIAL_ROUTE_TYPE_UNSPECIFIED(0),
    TOLL(1),
    HOV(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55553f;

    vh(int i2) {
        this.f55553f = i2;
    }

    public static vh a(int i2) {
        if (i2 == 0) {
            return SPECIAL_ROUTE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return TOLL;
        }
        if (i2 != 2) {
            return null;
        }
        return HOV;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55553f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55553f);
    }
}
