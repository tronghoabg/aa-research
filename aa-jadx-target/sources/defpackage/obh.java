package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class obh implements defpackage.erw {
    private final defpackage.qsh a;
    private final defpackage.eqp b;
    private final defpackage.eqp c;

    public /* synthetic */ obh(defpackage.qsh qshVar) {
        defpackage.nfg nfgVarA = defpackage.nfg.a.a();
        defpackage.eqr eqrVar = new defpackage.eqr();
        defpackage.afgq afgqVar = new defpackage.afgq();
        afgqVar.a = true;
        eqrVar.r(nfgVarA, new defpackage.kku(new defpackage.bet(eqrVar, afgqVar, 5, null), 9));
        defpackage.eqp eqpVarA = defpackage.nfn.a.a().a();
        eqpVarA.getClass();
        this.a = qshVar;
        this.b = eqrVar;
        this.c = eqpVarA;
    }

    @Override // defpackage.erw
    public final defpackage.ers a(java.lang.Class cls) {
        if (cls.isAssignableFrom(defpackage.obg.class)) {
            return new defpackage.obg(this.b, this.c, this.a);
        }
        throw new java.lang.IllegalArgumentException("Unknown ViewModel class: ".concat(java.lang.String.valueOf(cls.getName())));
    }

    @Override // defpackage.erw
    public final /* synthetic */ defpackage.ers b(java.lang.Class cls, defpackage.esi esiVar) {
        return a(cls);
    }

    @Override // defpackage.erw
    public final /* synthetic */ defpackage.ers c(defpackage.afie afieVar, defpackage.esi esiVar) {
        java.lang.Class<?> jClass = ((defpackage.affr) afieVar).getJClass();
        jClass.getClass();
        return a(jClass);
    }
}
