package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum sv implements com.google.v.eg {
    DRAWER_STATE_UNSPECIFIED(0),
    DRAWER_PARTIALLY_OPEN(1),
    DRAWER_COLLAPSED(2),
    DRAWER_FULLY_OPEN(3),
    DRAWER_REMOVED(4),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private final int f55420h;

    sv(int i2) {
        this.f55420h = i2;
    }

    public static sv a(int i2) {
        if (i2 == 0) {
            return DRAWER_STATE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return DRAWER_PARTIALLY_OPEN;
        }
        if (i2 == 2) {
            return DRAWER_COLLAPSED;
        }
        if (i2 == 3) {
            return DRAWER_FULLY_OPEN;
        }
        if (i2 != 4) {
            return null;
        }
        return DRAWER_REMOVED;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.f55420h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f55420h);
    }
}
