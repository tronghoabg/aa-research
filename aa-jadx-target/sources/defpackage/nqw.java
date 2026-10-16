package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nqw extends defpackage.lhm {
    public static final defpackage.nqs a = new defpackage.nqs();
    public static final defpackage.yqm b = defpackage.yqm.c("GH.AssistantIM");
    public static final defpackage.afhl c = new defpackage.lco(defpackage.mkp.b, 20);
    public final defpackage.eqp d;
    public defpackage.nqt e;
    public defpackage.nta f;
    private final defpackage.eqp g;
    private defpackage.eqp h;
    private final defpackage.afar i;

    /* JADX WARN: Multi-variable type inference failed */
    public nqw() {
        defpackage.eqp eqpVar = (defpackage.eqp) defpackage.ngb.a().a;
        this.g = eqpVar;
        defpackage.afdo afdoVar = defpackage.tcu.a;
        this.d = defpackage.tcu.v(defpackage.tcu.v(eqpVar, new defpackage.npo(20)), new defpackage.nqv(1));
        this.e = new defpackage.nqt(false, (int) (0 == true ? 1 : 0), 6);
        this.i = defpackage.afga.cA(new defpackage.npq(this, 2));
    }

    public static final defpackage.nqw a() {
        return a.a();
    }

    private final defpackage.mph k() {
        return (defpackage.mph) this.i.a();
    }

    private final com.google.android.gms.car.display.CarRegionId l(defpackage.nta ntaVar) {
        return b().r(ntaVar);
    }

    private final void m(defpackage.nta ntaVar) {
        com.google.android.gms.car.display.CarRegionId carRegionIdL = l(ntaVar);
        defpackage.rcx rcxVar = new defpackage.rcx();
        rcxVar.b(carRegionIdL, 0);
        defpackage.muh muhVar = defpackage.muj.h;
        rcxVar.b(l(muhVar.a().e()), 1);
        rcxVar.a = true;
        rcxVar.d();
        p(rcxVar.a());
        muhVar.a().g(true);
        n(ntaVar);
    }

    private final void n(defpackage.nta ntaVar) {
        this.f = ntaVar;
        defpackage.rcx rcxVar = new defpackage.rcx();
        rcxVar.b(l(ntaVar), 1);
        rcxVar.b(l(defpackage.muj.h.a().e()), 0);
        rcxVar.a = true;
        rcxVar.d();
        p(rcxVar.a());
    }

    private final void o(defpackage.nta ntaVar) {
        defpackage.khg.u(new defpackage.wde("GH.AssistantIM", defpackage.zbe.ASSISTANT, defpackage.zbd.px, "Car not connected when trying to stop activity", new java.lang.Object[0]), new defpackage.npq(l(ntaVar), 4));
    }

    private static final void p(com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        defpackage.khg.u(new defpackage.wde("GH.AssistantIM", defpackage.zbe.ASSISTANT, defpackage.zbd.pw, "Car not connected when trying to begin choreography", new java.lang.Object[0]), new defpackage.npq(projectionWindowAnimationChoreography, 3));
    }

    private static final boolean q(defpackage.ntb ntbVar) {
        return ntbVar.m() != defpackage.nti.f;
    }

    public final defpackage.ntb b() {
        return defpackage.nte.c().b();
    }

    @Override // defpackage.lhm, defpackage.lhn
    public final void d() {
        super.d();
        defpackage.mpj.b().j(k());
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0039  */
    public final void e(android.content.Intent intent) {
        intent.getClass();
        defpackage.acmj.h(defpackage.nqs.b(intent), "Intent %s is not an immersive intent", new java.lang.Object[]{intent});
        if (defpackage.muj.h.a().u() && b().m() == defpackage.nti.e) {
            defpackage.mmi.c();
            if (!defpackage.mmi.h()) {
                m(defpackage.nta.w);
            } else if (this.f != null) {
                n(defpackage.nta.w);
            }
        } else if (this.f != null) {
            n(defpackage.nta.w);
        }
        if (q(b())) {
            defpackage.mpj mpjVarB = defpackage.mpj.b();
            defpackage.nta ntaVar = defpackage.nta.x;
            if (mpjVarB.e(l(ntaVar)) == null) {
                return;
            }
            defpackage.rcx rcxVar = new defpackage.rcx();
            rcxVar.b(l(defpackage.nta.w), 0);
            rcxVar.b(l(ntaVar), 1);
            rcxVar.c(l(ntaVar), new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772027, false, null, 0));
            rcxVar.a = true;
            p(rcxVar.a());
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() throws afbj {
        super.eQ();
        defpackage.eqs eqsVar = b().A;
        defpackage.eqp eqpVarG = defpackage.ebo.n().g();
        eqpVarG.getClass();
        this.h = defpackage.tcu.v(defpackage.sqs.aN(new defpackage.nkb(defpackage.tcu.d(eqsVar, eqpVarG, new defpackage.ncv(14)), this, 6)), new defpackage.nqv(0));
        defpackage.mpj.b().g(k());
        defpackage.eqp eqpVar = this.h;
        if (eqpVar == null) {
            defpackage.afga.d("fullscreenImmersiveState");
            eqpVar = null;
        }
        eqpVar.eM(this, new defpackage.nol(new defpackage.npx(this, 3), 2));
    }

    public final void f(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if ((this.f == defpackage.nta.x && j(carRegionId)) || (this.f == defpackage.nta.w && i(carRegionId))) {
            defpackage.muj.h.a().n();
            this.f = null;
        }
    }

    public final void g(android.content.Intent intent) {
        intent.getClass();
        defpackage.acmj.h(defpackage.nqs.b(intent), "Intent %s is not an immersive intent", new java.lang.Object[]{intent});
        if (defpackage.muj.h.a().u() && b().F()) {
            defpackage.mmi.c();
            if (!defpackage.mmi.h()) {
                m(defpackage.nta.x);
                return;
            }
        }
        if (this.f != null) {
            n(defpackage.nta.x);
        }
    }

    public final void h() {
        ((defpackage.yqj) b.f()).u("Stopping immersives");
        o(defpackage.nta.w);
        if (q(b())) {
            o(defpackage.nta.x);
        }
    }

    public final boolean i(com.google.android.gms.car.display.CarRegionId carRegionId) {
        return com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h) && q(b()) && defpackage.afga.f(carRegionId, l(defpackage.nta.w));
    }

    public final boolean j(com.google.android.gms.car.display.CarRegionId carRegionId) {
        return com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h) && q(b()) && defpackage.afga.f(carRegionId, l(defpackage.nta.x));
    }
}
