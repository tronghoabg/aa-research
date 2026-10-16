package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum bn implements com.google.v.eg {
    MATCH_TYPE_UNKNOWN(0),
    PROVIDER(1),
    USER(2),
    AUTOMATIC(3),
    QUICKMATCH(4),
    QUICKMATCH_NO_GCID(5);


    /* renamed from: h, reason: collision with root package name */
    private final int f49402h;

    bn(int i2) {
        this.f49402h = i2;
    }

    public static bn a(int i2) {
        if (i2 == 0) {
            return MATCH_TYPE_UNKNOWN;
        }
        if (i2 == 1) {
            return PROVIDER;
        }
        if (i2 == 2) {
            return USER;
        }
        if (i2 == 3) {
            return AUTOMATIC;
        }
        if (i2 == 4) {
            return QUICKMATCH;
        }
        if (i2 != 5) {
            return null;
        }
        return QUICKMATCH_NO_GCID;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f49402h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f49402h);
    }
}
