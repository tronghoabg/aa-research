package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum mg implements com.google.v.eg {
    UNSPECIFIED_POSITIVE_FACTOR(0),
    PREFERRED_ROUTE(1),
    FAMILIAR_ROUTE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f48894e;

    mg(int i2) {
        this.f48894e = i2;
    }

    public static mg a(int i2) {
        if (i2 == 0) {
            return UNSPECIFIED_POSITIVE_FACTOR;
        }
        if (i2 == 1) {
            return PREFERRED_ROUTE;
        }
        if (i2 != 2) {
            return null;
        }
        return FAMILIAR_ROUTE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48894e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48894e);
    }
}
