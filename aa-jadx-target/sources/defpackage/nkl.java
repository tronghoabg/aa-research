package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nkl extends defpackage.ers {
    public final boolean a;
    public final defpackage.eqp b;
    public final defpackage.eqp c;
    public final defpackage.eqp d;
    public final defpackage.eqp e;
    public final long f;
    private final defpackage.qsh g;
    private final defpackage.kjx i;
    private final defpackage.eqp j;
    private final defpackage.eqp k;
    private final defpackage.eqp l;
    private final defpackage.eqp m;

    public nkl(defpackage.qsh qshVar) {
        java.lang.Object afavVar;
        this.g = qshVar;
        defpackage.kjx kjxVarA = defpackage.kjx.a.a();
        this.i = kjxVarA;
        if (defpackage.leo.a.a().c()) {
            kjxVarA.k(qshVar, false);
        }
        try {
            afavVar = kjxVarA.a();
        } catch (java.lang.Throwable th) {
            afavVar = new defpackage.afav(th);
        }
        defpackage.afce afceVar = defpackage.afce.a;
        defpackage.afdo afdoVar = defpackage.tcu.a;
        defpackage.eqp eqpVar = (defpackage.eqp) (true == (afavVar instanceof defpackage.afav) ? new defpackage.eqs(afceVar) : afavVar);
        this.j = eqpVar;
        defpackage.eqp eqpVarF = defpackage.ebo.f(eqpVar, new defpackage.ltq(17));
        this.k = eqpVarF;
        defpackage.eqp eqpVarF2 = defpackage.ebo.f(eqpVarF, new defpackage.ltq(18));
        this.l = eqpVarF2;
        defpackage.yqm yqmVar = defpackage.nte.a;
        boolean zJ = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b().J();
        this.a = zJ;
        defpackage.eqp eqpVarF3 = defpackage.ebo.f(eqpVarF2, new defpackage.nnp(this, 1));
        this.m = eqpVarF3;
        defpackage.ltq ltqVar = new defpackage.ltq(19);
        eqpVarF3.getClass();
        defpackage.eqp eqpVarF4 = defpackage.ebo.f(eqpVarF3, ltqVar);
        this.b = eqpVarF4;
        defpackage.ltq ltqVar2 = new defpackage.ltq(20);
        eqpVarF3.getClass();
        defpackage.eqp eqpVarF5 = defpackage.ebo.f(eqpVarF3, ltqVar2);
        this.c = eqpVarF5;
        this.d = zJ ? eqpVarF5 : eqpVarF4;
        this.e = zJ ? eqpVarF4 : eqpVarF5;
        this.f = 200L;
    }

    public static final int a(kjr kjrVar) {
        if (!(kjrVar instanceof kjq)) {
            return 1;
        }
        kjq kjqVar = (kjq) kjrVar;
        if (kjqVar.d.contains(1)) {
            return 1;
        }
        kkf kkfVar = kjqVar.a;
        int i = kkfVar.a.a;
        if (defpackage.a.X(i, 358614275) || defpackage.a.X(i, 627081341) || defpackage.a.X(i, 356517120)) {
            return 2;
        }
        if (defpackage.a.X(i, 356517131)) {
            kkb kkbVar = kkfVar.b;
            kkb kkbVar2 = kkbVar instanceof kkb ? kkbVar : null;
            return (kkbVar2 == null || kkbVar2.a >= 0 || kkbVar2.b <= 0) ? 1 : 2;
        }
        return 1;
    }
}
