package defpackage;

/* loaded from: classes3.dex */
final class adsn implements adsp {
    private final /* synthetic */ int a;

    public adsn(int i) {
        this.a = i;
    }

    @Override // defpackage.adsq
    public final /* synthetic */ int a(adxi adxiVar, int i, Object obj, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            adxiVar.k(i);
            return 0;
        }
        if (i3 != 1) {
            adxiVar.j((byte[]) obj, i2, i);
            return i2 + i;
        }
        return adxiVar.e();
    }
}
