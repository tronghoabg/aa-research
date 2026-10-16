package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ae implements com.google.v.eg {
    COST_TYPE_UNSPECIFIED(0),
    FREE(1),
    FEE(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f49354e;

    ae(int i2) {
        this.f49354e = i2;
    }

    public static ae a(int i2) {
        if (i2 == 0) {
            return COST_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return FREE;
        }
        if (i2 != 2) {
            return null;
        }
        return FEE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49354e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49354e);
    }
}
