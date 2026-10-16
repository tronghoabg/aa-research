package defpackage;

/* loaded from: classes3.dex */
public enum uzt implements abnz {
    UNKNOWN(0),
    GMM_API(1),
    PAINT(2),
    CHIME(3),
    NAV_SDK_USAGE_SERVER(4),
    HTTP(5),
    MAPS_MOBILE_SDKS(6);

    private final int i;

    uzt(int i) {
        this.i = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
