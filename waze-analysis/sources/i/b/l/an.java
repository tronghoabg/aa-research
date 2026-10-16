package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum an implements com.google.v.eg {
    STAGING(1),
    AUTOPUSH(2),
    PRODUCTION(3);


    /* renamed from: e, reason: collision with root package name */
    private final int f48579e;

    an(int i2) {
        this.f48579e = i2;
    }

    public static an a(int i2) {
        if (i2 == 1) {
            return STAGING;
        }
        if (i2 == 2) {
            return AUTOPUSH;
        }
        if (i2 != 3) {
            return null;
        }
        return PRODUCTION;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48579e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48579e);
    }
}
