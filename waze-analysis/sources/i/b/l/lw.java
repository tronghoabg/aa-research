package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum lw implements com.google.v.eg {
    IMPACT_TYPE_UNSPECIFIED(0),
    SLOWER_ROUTE(1),
    LONGER_ROUTE(2),
    THEORETICAL(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48864f;

    lw(int i2) {
        this.f48864f = i2;
    }

    public static lw a(int i2) {
        if (i2 == 0) {
            return IMPACT_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return SLOWER_ROUTE;
        }
        if (i2 == 2) {
            return LONGER_ROUTE;
        }
        if (i2 != 3) {
            return null;
        }
        return THEORETICAL;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48864f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48864f);
    }
}
