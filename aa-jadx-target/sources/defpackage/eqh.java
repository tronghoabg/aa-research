package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eqh {
    public defpackage.epx a;
    private final defpackage.eqf b;
    private final defpackage.eqe c;

    public eqh(defpackage.eqf eqfVar, defpackage.epx epxVar) {
        defpackage.eqe eraVar;
        this.b = eqfVar;
        this.a = epxVar;
        boolean z = eqfVar instanceof defpackage.eqe;
        boolean z2 = eqfVar instanceof defpackage.epl;
        defpackage.eql eqlVar = defpackage.eql.a;
        if (z && z2) {
            eraVar = new defpackage.mha((defpackage.epl) eqfVar, (defpackage.eqe) eqfVar, 1);
        } else if (z2) {
            eraVar = new defpackage.mha((defpackage.epl) eqfVar, (defpackage.eqe) null, 1);
        } else if (z) {
            eraVar = (defpackage.eqe) eqfVar;
        } else {
            java.lang.Class<?> cls = eqfVar.getClass();
            if (defpackage.eql.a.a(cls) == 2) {
                java.lang.Object obj = defpackage.eql.b.get(cls);
                obj.getClass();
                java.util.List list = (java.util.List) obj;
                if (list.size() == 1) {
                    eraVar = new erq(defpackage.eql.b((java.lang.reflect.Constructor) list.get(0), eqfVar), 0);
                } else {
                    int size = list.size();
                    ept[] eptVarArr = new ept[size];
                    for (int i = 0; i < size; i++) {
                        eptVarArr[i] = defpackage.eql.b((java.lang.reflect.Constructor) list.get(i), eqfVar);
                    }
                    eraVar = new erq(eptVarArr, 1);
                }
            } else {
                eraVar = new defpackage.era(eqfVar);
            }
        }
        this.c = eraVar;
    }

    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        defpackage.epx epxVarA = epwVar.a();
        this.a = (defpackage.epx) defpackage.afga.z(this.a, epxVarA);
        defpackage.fdr fdrVar = defpackage.fdr.a;
        fdrVar.a("androidx.lifecycle");
        defpackage.fdm fdmVar = defpackage.fdm.b;
        try {
            this.c.a(eqgVar, epwVar);
            defpackage.acmj.o(fdmVar);
            this.a = epxVarA;
        } catch (java.lang.Throwable th) {
            try {
                defpackage.edd.n(fdrVar, th);
                throw new defpackage.afap();
            } catch (java.lang.Throwable th2) {
                defpackage.acmj.o(fdmVar);
                throw th2;
            }
        }
    }
}
