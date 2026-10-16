package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum awt implements com.google.v.eg {
    ROUTES_SCREEN_VIEW_UNSPECIFIED(0),
    ROUTES_SCREEN_VIEW_LIST(1),
    ROUTES_SCREEN_VIEW_MAP(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53340f;

    awt(int i2) {
        this.f53340f = i2;
    }

    public static awt a(int i2) {
        if (i2 == 0) {
            return ROUTES_SCREEN_VIEW_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ROUTES_SCREEN_VIEW_LIST;
        }
        if (i2 != 2) {
            return null;
        }
        return ROUTES_SCREEN_VIEW_MAP;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53340f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53340f);
    }
}
