package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class apj {
    public final defpackage.affg c;
    public defpackage.dlo d;
    public boolean e;
    public final defpackage.aqp f;
    public final defpackage.bil g = new defpackage.bil((int[]) null);

    public apj(defpackage.aqp aqpVar, defpackage.affg affgVar, defpackage.dlo dloVar) {
        this.f = aqpVar;
        this.c = affgVar;
        this.d = dloVar;
    }

    public static final void n(defpackage.cqu cquVar) {
        java.util.List list = cquVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.crd) list.get(i)).b();
        }
    }

    protected abstract boolean f(defpackage.cqu cquVar);

    protected abstract boolean j(defpackage.cqu cquVar);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(defpackage.affg affgVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.api apiVar;
        if (afdkVar instanceof defpackage.api) {
            apiVar = (defpackage.api) afdkVar;
            int i = apiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                apiVar.c = i - Integer.MIN_VALUE;
            } else {
                apiVar = new defpackage.api(this, afdkVar);
            }
        } else {
            apiVar = new defpackage.api(this, afdkVar);
        }
        java.lang.Object obj = apiVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = apiVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            this.e = true;
            defpackage.ais aisVar = new defpackage.ais(this, affgVar, (defpackage.afdk) null, 10);
            apiVar.c = 1;
            defpackage.aixf aixfVar = new defpackage.aixf(apiVar.gT(), apiVar);
            if (defpackage.afzh.T(aixfVar, true, aixfVar, aisVar) == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
        }
        this.e = false;
        return defpackage.afbk.a;
    }

    public final void o(defpackage.cqu cquVar, defpackage.cqv cqvVar) {
        java.util.List list = cquVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((defpackage.crd) list.get(i)).c()) {
                return;
            }
        }
        if (f(cquVar)) {
            if (cqvVar == defpackage.cqv.a && this.e) {
                j(cquVar);
                n(cquVar);
            }
            if (cqvVar == defpackage.cqv.b && !this.e && j(cquVar)) {
                n(cquVar);
            }
        }
    }
}
