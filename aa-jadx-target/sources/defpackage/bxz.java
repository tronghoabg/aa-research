package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bxz implements aiuw, defpackage.bxw {
    public static final defpackage.afdo a = new defpackage.buw();
    public final defpackage.afdo b;
    public final defpackage.afdo c;
    private final java.lang.Object d = this;
    private volatile defpackage.afdo e;

    public bxz(defpackage.afdo afdoVar, defpackage.afdo afdoVar2) {
        this.b = afdoVar;
        this.c = afdoVar2;
    }

    public final defpackage.afdo c() {
        defpackage.afdo afdoVarPlus = this.e;
        if (afdoVarPlus == null || afdoVarPlus == a) {
            defpackage.afdo afdoVar = this.b;
            defpackage.cfm cfmVar = (defpackage.cfm) afdoVar.get(defpackage.cfm.a);
            defpackage.afdo bxyVar = cfmVar != null ? new defpackage.bxy(kotlinx.coroutines.CoroutineExceptionHandler.c, cfmVar, this) : defpackage.afdp.a;
            synchronized (this.d) {
                defpackage.afdo afdoVar2 = this.e;
                if (afdoVar2 == null) {
                    afdoVarPlus = afdoVar.plus(new aiwi(afdoVar.get(aiwg.d))).plus(this.c).plus(bxyVar);
                } else if (afdoVar2 == a) {
                    aiwi aiwiVar = new aiwi(afdoVar.get(aiwg.d));
                    aiwiVar.s(new defpackage.bvy());
                    afdoVarPlus = afdoVar.plus(aiwiVar).plus(this.c).plus(bxyVar);
                } else {
                    afdoVarPlus = afdoVar2;
                }
                this.e = afdoVarPlus;
            }
        }
        afdoVarPlus.getClass();
        return afdoVarPlus;
    }

    public final void d() {
        synchronized (this.d) {
            defpackage.afdo afdoVar = this.e;
            if (afdoVar == null) {
                this.e = a;
            } else {
                defpackage.afgz.r(afdoVar, new defpackage.bvy());
            }
        }
    }

    @Override // defpackage.bxw
    public final void ee() {
        d();
    }

    @Override // defpackage.bxw
    public final void ef() {
        d();
    }

    @Override // defpackage.bxw
    public final void dw() {
    }
}
