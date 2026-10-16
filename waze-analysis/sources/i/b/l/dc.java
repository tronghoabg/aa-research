package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum dc implements com.google.v.eg {
    UNKNOWN(0),
    REAL(1),
    FAKE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f48632e;

    dc(int i2) {
        this.f48632e = i2;
    }

    public static dc a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return REAL;
        }
        if (i2 != 2) {
            return null;
        }
        return FAKE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48632e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48632e);
    }
}
