package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum amc implements com.google.v.eg {
    MODE_UNSPECIFIED(0),
    MODE_TURNS(1),
    MODE_REPORTS(2),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    private final int f52731f;

    amc(int i2) {
        this.f52731f = i2;
    }

    public static amc a(int i2) {
        if (i2 == 0) {
            return MODE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return MODE_TURNS;
        }
        if (i2 != 2) {
            return null;
        }
        return MODE_REPORTS;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f52731f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f52731f);
    }
}
