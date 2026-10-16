package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum atk implements com.google.v.eg {
    QUICK_ROUTE_SETTINGS_CONTEXT_UNSPECIFIED(0),
    QUICK_ROUTE_SETTINGS_CONTEXT_TRIP_OVERVIEW(1),
    QUICK_ROUTE_SETTINGS_CONTEXT_ALTERNATIVE_ROUTES(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53136f;

    atk(int i2) {
        this.f53136f = i2;
    }

    public static atk a(int i2) {
        if (i2 == 0) {
            return QUICK_ROUTE_SETTINGS_CONTEXT_UNSPECIFIED;
        }
        if (i2 == 1) {
            return QUICK_ROUTE_SETTINGS_CONTEXT_TRIP_OVERVIEW;
        }
        if (i2 != 2) {
            return null;
        }
        return QUICK_ROUTE_SETTINGS_CONTEXT_ALTERNATIVE_ROUTES;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53136f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53136f);
    }
}
