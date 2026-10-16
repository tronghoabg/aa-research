package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class cli implements clo {
    private final /* synthetic */ int a;

    public /* synthetic */ cli(int i) {
        this.a = i;
    }

    @Override // defpackage.clo
    public final double a(double d) {
        int i = this.a;
        if (i == 0) {
            float[] fArr = clj.a;
            return Math.copySign(czz.O(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
        }
        if (i != 1) {
            return i != 2 ? i != 3 ? i != 4 ? i != 5 ? d : clj.c(clj.d, d) : clj.d(clj.d, d) : clj.a(clj.c, d) : clj.b(clj.c, d);
        }
        float[] fArr2 = clj.a;
        return Math.copySign(czz.N(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
    }
}
