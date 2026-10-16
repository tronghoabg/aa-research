package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum js implements com.google.v.eg {
    EMERGENCY(0),
    ASSISTANCE(1),
    OTHER(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f48808e;

    js(int i2) {
        this.f48808e = i2;
    }

    public static js a(int i2) {
        if (i2 == 0) {
            return EMERGENCY;
        }
        if (i2 == 1) {
            return ASSISTANCE;
        }
        if (i2 != 2) {
            return null;
        }
        return OTHER;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48808e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48808e);
    }
}
