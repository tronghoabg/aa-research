package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bny implements com.google.v.eg {
    UGC_LEVEL_UNSPECIFIED(0),
    LEVEL_1(1),
    LEVEL_2(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54375f;

    bny(int i2) {
        this.f54375f = i2;
    }

    public static bny a(int i2) {
        if (i2 == 0) {
            return UGC_LEVEL_UNSPECIFIED;
        }
        if (i2 == 1) {
            return LEVEL_1;
        }
        if (i2 != 2) {
            return null;
        }
        return LEVEL_2;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54375f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54375f);
    }
}
