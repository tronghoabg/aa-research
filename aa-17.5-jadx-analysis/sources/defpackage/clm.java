package defpackage;

/* loaded from: classes.dex */
public class clm {
    private final clh a;
    private final clh b;
    private final clh c;

    /* JADX WARN: Illegal instructions before constructor call */
    public clm(clh clhVar, clh clhVar2) {
        clh clhVarP;
        if (clhVar.b == 12884901888L) {
            clx clxVar = clp.a;
            clhVar = czz.P(clhVar, clp.b, clf.b);
        }
        if (clhVar2.b == 12884901888L) {
            clx clxVar2 = clp.a;
            clhVarP = czz.P(clhVar2, clp.b, clf.b);
        } else {
            clhVarP = clhVar2;
        }
        this(clhVar2, clhVar, clhVarP);
    }

    public long a(long j) {
        clh clhVar = this.b;
        float fD = cjv.d(j);
        float fC = cjv.c(j);
        float fB = cjv.b(j);
        long jD = clhVar.d(fD, fC, fB);
        return this.c.e(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jD & 4294967295L)), clhVar.c(fD, fC, fB), cjv.a(j), this.a);
    }

    public clm(clh clhVar, clh clhVar2, clh clhVar3) {
        this.a = clhVar;
        this.b = clhVar2;
        this.c = clhVar3;
    }
}
