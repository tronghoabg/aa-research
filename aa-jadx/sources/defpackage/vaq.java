package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum vaq implements defpackage.abpb {
    UNKNOWN(0),
    GMM_API(1),
    PAINT(2),
    CHIME(3),
    NAV_SDK_USAGE_SERVER(4),
    HTTP(5),
    MAPS_MOBILE_SDKS(6);

    private final int i;

    vaq(int i) {
        this.i = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.i);
    }
}
