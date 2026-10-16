package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum ef implements com.google.v.eg {
    NORMAL(0),
    SIGN_IN(1);


    /* renamed from: d, reason: collision with root package name */
    private final int f48693d;

    ef(int i2) {
        this.f48693d = i2;
    }

    public static ef a(int i2) {
        if (i2 == 0) {
            return NORMAL;
        }
        if (i2 != 1) {
            return null;
        }
        return SIGN_IN;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48693d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48693d);
    }
}
