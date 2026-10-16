package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum hw implements com.google.v.eg {
    UNKNOWN(0),
    NONE(1),
    DATA(2);


    /* renamed from: e, reason: collision with root package name */
    private final int f48762e;

    hw(int i2) {
        this.f48762e = i2;
    }

    public static hw a(int i2) {
        if (i2 == 0) {
            return UNKNOWN;
        }
        if (i2 == 1) {
            return NONE;
        }
        if (i2 != 2) {
            return null;
        }
        return DATA;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48762e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48762e);
    }
}
