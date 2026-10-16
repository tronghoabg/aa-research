package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum bf implements com.google.v.eg {
    UNKNOWN(0),
    RETURN_WAZE_ACCOUNT(1),
    RETURN_NEW_WAZE_ACCOUNT(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f48621e;

    bf(int i2) {
        this.f48621e = i2;
    }

    public static bf a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return RETURN_WAZE_ACCOUNT;
        }
        if (i2 != 2) {
            return null;
        }
        return RETURN_NEW_WAZE_ACCOUNT;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48621e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48621e);
    }
}
