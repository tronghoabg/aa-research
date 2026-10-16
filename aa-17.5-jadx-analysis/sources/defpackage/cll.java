package defpackage;

/* loaded from: classes.dex */
public final class cll extends clm {
    private final clv a;
    private final clv b;
    private final float[] c;

    public cll(clv clvVar, clv clvVar2) {
        float[] fArrT;
        super(clvVar2, clvVar, clvVar2);
        this.a = clvVar;
        this.b = clvVar2;
        if (czz.Q(clvVar.d, clvVar2.d)) {
            fArrT = czz.T(clvVar2.j, clvVar.i);
        } else {
            float[] fArr = clvVar.i;
            float[] fArr2 = clvVar2.j;
            float[] fArrA = clvVar.d.a();
            float[] fArrA2 = clvVar2.d.a();
            clx clxVar = clvVar.d;
            clx clxVar2 = clp.a;
            clx clxVar3 = clp.b;
            fArrT = czz.T(czz.Q(clvVar2.d, clxVar3) ? fArr2 : czz.S(czz.T(czz.R(clf.b.c, fArrA2, clp.a()), clvVar2.i)), czz.Q(clxVar, clxVar3) ? fArr : czz.T(czz.R(clf.b.c, fArrA, clp.a()), clvVar.i));
        }
        this.c = fArrT;
    }

    @Override // defpackage.clm
    public final long a(long j) {
        double d = cjv.d(j);
        float fC = cjv.c(j);
        float fB = cjv.b(j);
        clo cloVar = this.a.p;
        float fA = (float) cloVar.a(d);
        float fA2 = (float) cloVar.a(fC);
        float fA3 = (float) cloVar.a(fB);
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
        clv clvVar = this.b;
        clo cloVar2 = clvVar.m;
        return cjn.j((float) cloVar2.a(f + f2 + f3), (float) cloVar2.a(f4 + f5 + f6), (float) cloVar2.a(f7 + f8 + f9), cjv.a(j), clvVar);
    }
}
