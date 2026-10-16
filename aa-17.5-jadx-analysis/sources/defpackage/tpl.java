package defpackage;

/* loaded from: classes3.dex */
public abstract class tpl {
    protected boolean e;

    public abstract int a();

    public abstract too c(int i);

    public tpk d() {
        throw null;
    }

    public abstract void e(int i, too[] tooVarArr);

    public abstract boolean g(too tooVar);

    public boolean j(tou touVar) {
        if (!d().j(touVar)) {
            return false;
        }
        if (g(touVar.e(0)) || touVar.f(c(0))) {
            return true;
        }
        int iA = a();
        too tooVar = ((tot) touVar).a;
        too[] tooVarArr = new too[2];
        for (int i = 0; i < iA; i++) {
            e(i, tooVarArr);
            int i2 = 0;
            too tooVar2 = tooVar;
            while (i2 < 4) {
                too tooVarE = touVar.e(i2);
                if (tss.l(tooVarArr[0], tooVarArr[1], tooVar2, tooVarE)) {
                    return true;
                }
                i2++;
                tooVar2 = tooVarE;
            }
        }
        return false;
    }
}
