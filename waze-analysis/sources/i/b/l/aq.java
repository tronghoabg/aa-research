package i.b.l;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum aq implements com.google.v.eg {
    UNKNOWN(1),
    BUILT_IN(2),
    CARPLAY(3),
    ANDROID_AUTO(4),
    SMART_DEVICE_LINK(5),
    WEB_LINK(6),
    PIONEER(7),
    WEB(8);


    /* renamed from: j, reason: collision with root package name */
    private final int f48589j;

    aq(int i2) {
        this.f48589j = i2;
    }

    public static aq a(int i2) {
        switch (i2) {
            case 1:
                return UNKNOWN;
            case 2:
                return BUILT_IN;
            case 3:
                return CARPLAY;
            case 4:
                return ANDROID_AUTO;
            case 5:
                return SMART_DEVICE_LINK;
            case 6:
                return WEB_LINK;
            case 7:
                return PIONEER;
            case 8:
                return WEB;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f48589j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f48589j);
    }
}
