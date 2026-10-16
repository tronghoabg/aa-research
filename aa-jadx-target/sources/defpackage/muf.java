package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class muf extends defpackage.ers {
    public final defpackage.eqs a;
    public final defpackage.eqp b;
    public final defpackage.eqs c;
    public final defpackage.eqp d;
    public final defpackage.eqp e;
    public final defpackage.eqp f;
    public final defpackage.eqp g;
    private final defpackage.eqp i;
    private final defpackage.muj j;
    private final defpackage.eqp k;

    public /* synthetic */ muf(int i) {
        defpackage.oen oenVar = (i & 1) != 0 ? new defpackage.oen() : null;
        defpackage.tnc tncVar = (i & 2) != 0 ? new defpackage.tnc() : null;
        int i2 = 4;
        int i3 = i & 4;
        defpackage.muj mujVarA = defpackage.muj.h.a();
        oenVar.getClass();
        tncVar.getClass();
        this.i = oenVar;
        this.j = mujVarA;
        defpackage.eqs eqsVar = new defpackage.eqs();
        this.a = eqsVar;
        this.b = defpackage.mps.e();
        java.lang.Float fValueOf = java.lang.Float.valueOf(0.0f);
        defpackage.afdo afdoVar = defpackage.tcu.a;
        defpackage.eqs eqsVar2 = new defpackage.eqs(fValueOf);
        this.c = eqsVar2;
        defpackage.eqp eqpVarV = i3 != 0 ? defpackage.tcu.v(eqsVar2, new defpackage.mtz(i2)) : defpackage.tcu.d;
        this.d = eqpVarV;
        defpackage.eqp eqpVarA = defpackage.tcu.a(defpackage.tcu.u(defpackage.ebo.n().j(), java.lang.Boolean.FALSE), new defpackage.tcn(defpackage.mps.f(), defpackage.ysr.cC(defpackage.acqe.f()), true, null, new defpackage.mjm(10)));
        this.k = eqpVarA;
        defpackage.ntb ntbVarB = defpackage.nte.c().b();
        int i4 = 5;
        defpackage.eqp eqpVarG = defpackage.ebo.g(defpackage.ebo.f(ntbVarB.A, new defpackage.npx(ntbVarB, i2)), new defpackage.mtz(i4));
        defpackage.eqp eqpVarD = defpackage.tcu.d(defpackage.nuz.b().a(), defpackage.ned.a.a().f, new defpackage.mjm(11));
        int i5 = 7;
        defpackage.eqp eqpVarE = defpackage.tcu.E(defpackage.tcu.v(defpackage.mvm.o().compareTo(j$.time.Duration.ZERO) > 0 ? defpackage.tcu.B(eqpVarD, new defpackage.nam(defpackage.mvm.o(), tncVar, 1, null)) : defpackage.tcu.v(eqpVarD, new defpackage.mtz(6)), new defpackage.mtz(i5)));
        defpackage.eqp eqpVarO = defpackage.tcu.o((defpackage.eqp) defpackage.nwy.a().c.b);
        defpackage.eqp eqpVarE2 = defpackage.tcu.e(eqpVarG, defpackage.ebo.e(defpackage.tcu.q(eqpVarE, defpackage.ebo.g(eqpVarO, new defpackage.glo(true ^ defpackage.laq.a.a().b(), eqpVarO, i4)))), eqsVar, new defpackage.kvb(16));
        defpackage.eqp eqpVarE3 = defpackage.ebo.e(defpackage.mvm.p().compareTo(j$.time.Duration.ZERO) > 0 ? defpackage.tcu.m(eqpVarE2, defpackage.mvm.p(), null) : eqpVarE2);
        defpackage.eqp eqpVarE4 = defpackage.ebo.e(defpackage.tcu.q(defpackage.mvm.q().compareTo(j$.time.Duration.ZERO) > 0 ? defpackage.tcu.A(eqpVarE3, defpackage.mvm.q(), new defpackage.mjm(i5)) : eqpVarE3, eqpVarV));
        this.e = eqpVarE4;
        this.f = defpackage.tcu.y(defpackage.tcu.x(eqsVar), defpackage.tcu.v(defpackage.tcu.u(eqpVarE4, defpackage.afce.a), new defpackage.mtz(3)));
        this.g = defpackage.ogv.a.c() ? defpackage.tcu.d(defpackage.ogm.a.a().d, eqpVarA, new defpackage.mjm(9)) : defpackage.tcu.d(defpackage.tcu.v(oenVar, new defpackage.mtz(2)), eqpVarA, new defpackage.mjm(8));
    }

    public final void a(boolean z) {
        boolean z2 = true;
        if (!z) {
            defpackage.leq.a.a();
            if (!defpackage.acyc.aD()) {
                z2 = false;
            }
        }
        this.a.m(java.lang.Boolean.valueOf(z2));
    }

    public final void b(java.util.List list) {
        this.j.t(list);
    }

    public muf() {
        this(15);
    }
}
