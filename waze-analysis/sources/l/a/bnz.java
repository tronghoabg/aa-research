package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bnz implements com.google.v.eg {
    UGC_MODE_UNSPECIFIED(0),
    COMPACT(1),
    EXPANDED(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54381f;

    bnz(int i2) {
        this.f54381f = i2;
    }

    public static bnz a(int i2) {
        if (i2 == 0) {
            return UGC_MODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return COMPACT;
        }
        if (i2 != 2) {
            return null;
        }
        return EXPANDED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54381f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54381f);
    }
}
