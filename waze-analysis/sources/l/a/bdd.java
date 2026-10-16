package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum bdd implements com.google.v.eg {
    SHARE_DRIVE_SCREEN_TYPE_UNSPECIFIED(0),
    PRE_SHARE_VIEW(1),
    JOIN_SHARE_VIEW(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f53759f;

    bdd(int i2) {
        this.f53759f = i2;
    }

    public static bdd a(int i2) {
        if (i2 == 0) {
            return SHARE_DRIVE_SCREEN_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return PRE_SHARE_VIEW;
        }
        if (i2 != 2) {
            return null;
        }
        return JOIN_SHARE_VIEW;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f53759f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f53759f);
    }
}
