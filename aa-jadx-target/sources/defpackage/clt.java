package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class clt extends defpackage.clu {
    private final defpackage.cmd a;
    private final defpackage.cmd b;
    private final float[] c;

    public clt(defpackage.cmd cmdVar, defpackage.cmd cmdVar2) {
        float[] fArrAf;
        super(cmdVar2, cmdVar, cmdVar2);
        this.a = cmdVar;
        this.b = cmdVar2;
        if (defpackage.dai.ac(cmdVar.d, cmdVar2.d)) {
            fArrAf = defpackage.dai.af(cmdVar2.j, cmdVar.i);
        } else {
            float[] fArr = cmdVar.i;
            float[] fArr2 = cmdVar2.j;
            float[] fArrA = cmdVar.d.a();
            float[] fArrA2 = cmdVar2.d.a();
            defpackage.cmf cmfVar = cmdVar.d;
            defpackage.cmf cmfVar2 = defpackage.clx.a;
            defpackage.cmf cmfVar3 = defpackage.clx.b;
            fArrAf = defpackage.dai.af(defpackage.dai.ac(cmdVar2.d, cmfVar3) ? fArr2 : defpackage.dai.ae(defpackage.dai.af(defpackage.dai.ad(defpackage.cln.b.c, fArrA2, defpackage.clx.a()), cmdVar2.i)), defpackage.dai.ac(cmfVar, cmfVar3) ? fArr : defpackage.dai.af(defpackage.dai.ad(defpackage.cln.b.c, fArrA, defpackage.clx.a()), cmdVar.i));
        }
        this.c = fArrAf;
    }

    @Override // defpackage.clu
    public final long a(long j) {
        double d = defpackage.ckd.d(j);
        float fC = defpackage.ckd.c(j);
        float fB = defpackage.ckd.b(j);
        defpackage.clw clwVar = this.a.p;
        float fA = (float) clwVar.a(d);
        float fA2 = (float) clwVar.a(fC);
        float fA3 = (float) clwVar.a(fB);
        float[] fArr = this.c;
        float f = fArr[0] * fA;
        float f2 = fArr[3] * fA2;
        float f3 = fArr[6] * fA3;
        float f4 = fArr[1] * fA;
        float f5 = fArr[4] * fA2;
        float f6 = fArr[7] * fA3;
        float f7 = fArr[2] * fA;
        float f8 = fArr[5] * fA2;
        float f9 = fArr[8] * fA3;
        defpackage.cmd cmdVar = this.b;
        defpackage.clw clwVar2 = cmdVar.m;
        return defpackage.cjv.k((float) clwVar2.a(f + f2 + f3), (float) clwVar2.a(f4 + f5 + f6), (float) clwVar2.a(f7 + f8 + f9), defpackage.ckd.a(j), cmdVar);
    }
}
