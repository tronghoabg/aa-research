package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tqj {
    protected boolean e;

    public abstract int a();

    public abstract defpackage.tpm c(int i);

    public defpackage.tqi d() {
        throw null;
    }

    public abstract void e(int i, defpackage.tpm[] tpmVarArr);

    public abstract boolean g(defpackage.tpm tpmVar);

    public boolean j(defpackage.tps tpsVar) {
        if (!d().j(tpsVar)) {
            return false;
        }
        if (g(tpsVar.e(0)) || tpsVar.f(c(0))) {
            return true;
        }
        int iA = a();
        defpackage.tpm tpmVar = ((defpackage.tpr) tpsVar).a;
        defpackage.tpm[] tpmVarArr = new defpackage.tpm[2];
        for (int i = 0; i < iA; i++) {
            e(i, tpmVarArr);
            int i2 = 0;
            defpackage.tpm tpmVar2 = tpmVar;
            while (i2 < 4) {
                defpackage.tpm tpmVarE = tpsVar.e(i2);
                if (defpackage.tnm.n(tpmVarArr[0], tpmVarArr[1], tpmVar2, tpmVarE)) {
                    return true;
                }
                i2++;
                tpmVar2 = tpmVarE;
            }
        }
        return false;
    }
}
