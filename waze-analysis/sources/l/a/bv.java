package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bv implements com.google.v.eg {
    AGE_SCREEN_REGULATION_UNSPECIFIED(0),
    AGE_SCREEN_REGULATION_AADC(1),
    AGE_SCREEN_REGULATION_U18(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f54673f;

    bv(int i2) {
        this.f54673f = i2;
    }

    public static bv a(int i2) {
        if (i2 == 0) {
            return AGE_SCREEN_REGULATION_UNSPECIFIED;
        }
        if (i2 == 1) {
            return AGE_SCREEN_REGULATION_AADC;
        }
        if (i2 != 2) {
            return null;
        }
        return AGE_SCREEN_REGULATION_U18;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f54673f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f54673f);
    }
}
