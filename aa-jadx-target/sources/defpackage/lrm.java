package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lrm extends defpackage.lhm {
    public lrm() {
        defpackage.eqp eqpVarE;
        defpackage.eqp eqpVar;
        defpackage.ltn ltnVarE = defpackage.lmp.a().e() ? defpackage.ltu.e(defpackage.zbe.MEDIA_FACET, null, null, null, 14) : null;
        if (defpackage.lmp.a().e()) {
            ltnVarE.getClass();
            defpackage.ltt lttVar = (defpackage.ltt) ltnVarE;
            defpackage.eqp eqpVarE2 = defpackage.ebo.e(defpackage.tcu.u(defpackage.tcu.g(lttVar.a, lttVar.b, lttVar.t, lttVar.d, lttVar.s, new defpackage.mzr(1)), new defpackage.lrk(null, defpackage.lor.c, null, false)));
            eqpVarE = defpackage.ebo.e(defpackage.tcu.u(defpackage.tcu.e(lttVar.a, lttVar.b, lttVar.c, new defpackage.kvb(10)), new defpackage.lrg(null, null)));
            eqpVar = eqpVarE2;
        } else {
            defpackage.eqp eqpVarA = defpackage.lhe.b().a(defpackage.mqg.MEDIA);
            defpackage.eqr eqrVar = new defpackage.eqr();
            eqrVar.r(defpackage.ebo.e(eqpVarA), new lri(eqrVar));
            defpackage.eqr eqrVar2 = new defpackage.eqr();
            eqrVar2.r(defpackage.ebo.e(eqpVarA), new lrj(eqrVar2, 0));
            eqpVarE = eqrVar2;
            eqpVar = eqrVar;
        }
        defpackage.lro lroVar = new defpackage.lro();
        this.j.c(lroVar);
        eqpVar.eM(this, lroVar);
        eqpVar.eM(this, new defpackage.lrp());
        eqpVarE.eM(this, new defpackage.lrl());
        defpackage.lrr lrrVar = new defpackage.lrr();
        this.j.c(lrrVar);
        eqpVar.eM(this, lrrVar);
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() {
        super.eQ();
        if (defpackage.lmp.a().e()) {
            defpackage.lrq.b(defpackage.tcu.w(defpackage.lpx.i().e(), new defpackage.lqi(9)), this);
        } else {
            defpackage.lrq.b(defpackage.lpx.i().f(), this);
        }
        if (defpackage.actz.D()) {
            defpackage.eqp eqpVarW = defpackage.tcu.w(defpackage.lpx.i().b, new defpackage.lqi(10));
            lrn lrnVar = new lrn();
            this.j.c(lrnVar);
            eqpVarW.eM(this, lrnVar);
        }
    }
}
