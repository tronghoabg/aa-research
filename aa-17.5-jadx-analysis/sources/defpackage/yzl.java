package defpackage;

/* loaded from: classes3.dex */
public enum yzl implements abnz {
    UNKNOWN_APPLICATION(0),
    GEARHEAD(1),
    GSA(2),
    GMM(3),
    GPM(4),
    TTS(5),
    KAKAO_NAVI(6),
    WAZE(7);

    private final int j;

    yzl(int i2) {
        this.j = i2;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
