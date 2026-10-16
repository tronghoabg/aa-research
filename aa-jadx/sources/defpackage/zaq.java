package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum zaq implements defpackage.abpb {
    UNKNOWN_APPLICATION(0),
    GEARHEAD(1),
    GSA(2),
    GMM(3),
    GPM(4),
    TTS(5),
    KAKAO_NAVI(6),
    WAZE(7);

    private final int j;

    zaq(int i2) {
        this.j = i2;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.j);
    }
}
