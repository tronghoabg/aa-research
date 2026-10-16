package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum lk implements com.google.v.eg {
    IMPACT_TYPE_UNSPECIFIED(0),
    PREFERRED_NOT_OFFERED(1),
    NATURAL_NOT_OFFERED(2),
    TYPICALLY_BEST_NOT_OFFERED(3);


    /* renamed from: f, reason: collision with root package name */
    private final int f48832f;

    lk(int i2) {
        this.f48832f = i2;
    }

    public static lk a(int i2) {
        if (i2 == 0) {
            return IMPACT_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return PREFERRED_NOT_OFFERED;
        }
        if (i2 == 2) {
            return NATURAL_NOT_OFFERED;
        }
        if (i2 != 3) {
            return null;
        }
        return TYPICALLY_BEST_NOT_OFFERED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48832f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48832f);
    }
}
