package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class clu {
    private final defpackage.clp a;
    private final defpackage.clp b;
    private final defpackage.clp c;

    /* JADX WARN: Illegal instructions before constructor call */
    public clu(defpackage.clp clpVar, defpackage.clp clpVar2) {
        defpackage.clp clpVarAb;
        if (clpVar.b == 12884901888L) {
            defpackage.cmf cmfVar = defpackage.clx.a;
            clpVar = defpackage.dai.ab(clpVar, defpackage.clx.b, defpackage.cln.b);
        }
        if (clpVar2.b == 12884901888L) {
            defpackage.cmf cmfVar2 = defpackage.clx.a;
            clpVarAb = defpackage.dai.ab(clpVar2, defpackage.clx.b, defpackage.cln.b);
        } else {
            clpVarAb = clpVar2;
        }
        this(clpVar2, clpVar, clpVarAb);
    }

    public long a(long j) {
        defpackage.clp clpVar = this.b;
        float fD = defpackage.ckd.d(j);
        float fC = defpackage.ckd.c(j);
        float fB = defpackage.ckd.b(j);
        long jD = clpVar.d(fD, fC, fB);
        return this.c.e(java.lang.Float.intBitsToFloat((int) (jD >> 32)), java.lang.Float.intBitsToFloat((int) (jD & 4294967295L)), clpVar.c(fD, fC, fB), defpackage.ckd.a(j), this.a);
    }

    public clu(defpackage.clp clpVar, defpackage.clp clpVar2, defpackage.clp clpVar3) {
        this.a = clpVar;
        this.b = clpVar2;
        this.c = clpVar3;
    }
}
