package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum dw implements com.google.v.eg {
    UNKNOWN(0),
    EDITOR(1),
    CLIENT(2),
    ADS(3),
    SYSTEM(4);


    /* renamed from: g, reason: collision with root package name */
    private final int f49484g;

    dw(int i2) {
        this.f49484g = i2;
    }

    public static dw a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return EDITOR;
        }
        if (i2 == 2) {
            return CLIENT;
        }
        if (i2 == 3) {
            return ADS;
        }
        if (i2 != 4) {
            return null;
        }
        return SYSTEM;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49484g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49484g);
    }
}
