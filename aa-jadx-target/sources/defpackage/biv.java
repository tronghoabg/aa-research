package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class biv {
    public final defpackage.dlz a;
    public final defpackage.dgd b;
    public final defpackage.dlo c;
    public final defpackage.wde d;
    private final defpackage.dgd e;
    private float f = Float.NaN;
    private float g = Float.NaN;

    public biv(defpackage.dlz dlzVar, defpackage.dgd dgdVar, defpackage.dlo dloVar, defpackage.wde wdeVar) {
        this.a = dlzVar;
        this.b = dgdVar;
        this.c = dloVar;
        this.d = wdeVar;
        this.e = defpackage.dax.f(dgdVar, dlzVar);
    }

    public final long a(long j, int i) {
        int iC;
        float f = this.g;
        float f2 = this.f;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            defpackage.dgd dgdVar = this.e;
            defpackage.dlo dloVar = this.c;
            defpackage.wde wdeVar = this.d;
            java.lang.String str = defpackage.biw.a;
            defpackage.afce afceVar = defpackage.afce.a;
            float f3 = new defpackage.deu(new defpackage.dew(str, dgdVar, afceVar, afceVar, wdeVar, dloVar), 1, 1, defpackage.dln.d(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE)).d;
            float f4 = new defpackage.deu(new defpackage.dew(defpackage.biw.b, dgdVar, afceVar, afceVar, wdeVar, dloVar), 2, 1, defpackage.dln.d(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE)).d - f3;
            this.g = f3;
            this.f = f4;
            f2 = f4;
            f = f3;
        }
        if (i != 1) {
            int iRound = java.lang.Math.round(f + (f2 * (i - 1)));
            iC = iRound >= 0 ? iRound : 0;
            int iA = defpackage.dlm.a(j);
            if (iC > iA) {
                iC = iA;
            }
        } else {
            iC = defpackage.dlm.c(j);
        }
        return defpackage.dln.d(defpackage.dlm.d(j), defpackage.dlm.b(j), iC, defpackage.dlm.a(j));
    }
}
