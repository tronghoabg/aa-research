package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum os implements com.google.v.eg {
    REPORTING_MODE_UNSPECIFIED(0),
    MODE_UCG_MENU(1),
    MODE_UGC_BUTTON(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f55197f;

    os(int i2) {
        this.f55197f = i2;
    }

    public static os a(int i2) {
        if (i2 == 0) {
            return REPORTING_MODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return MODE_UCG_MENU;
        }
        if (i2 != 2) {
            return null;
        }
        return MODE_UGC_BUTTON;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55197f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55197f);
    }
}
