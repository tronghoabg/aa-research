package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class clq implements defpackage.clw {
    private final /* synthetic */ int a;

    public /* synthetic */ clq(int i) {
        this.a = i;
    }

    @Override // defpackage.clw
    public final double a(double d) {
        int i = this.a;
        if (i == 0) {
            float[] fArr = defpackage.clr.a;
            return java.lang.Math.copySign(defpackage.dai.aa(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
        }
        if (i == 1) {
            float[] fArr2 = defpackage.clr.a;
            return java.lang.Math.copySign(defpackage.dai.Z(d < 0.0d ? -d : d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 2.4d), d);
        }
        if (i == 2) {
            return defpackage.clr.b(defpackage.clr.c, d);
        }
        if (i == 3) {
            return defpackage.clr.a(defpackage.clr.c, d);
        }
        if (i != 4) {
            return i != 5 ? d : defpackage.clr.c(defpackage.clr.d, d);
        }
        return defpackage.clr.d(defpackage.clr.d, d);
    }
}
