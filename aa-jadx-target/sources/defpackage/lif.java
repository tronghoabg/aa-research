package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lif extends defpackage.kfp {
    final /* synthetic */ defpackage.lin a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lif(defpackage.lin linVar) {
        super(null);
        this.a = linVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kfp
    public final void a(defpackage.qsh qshVar) throws wfo {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.lin.a.f()).ai((char) 3927)).u("Connected to Android Auto car");
        defpackage.wfp.c();
        this.a.m(true, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kfp
    public final void b() throws wfo {
        ((defpackage.yqj) ((defpackage.yqj) defpackage.lin.a.f()).ai((char) 3928)).u("Disconnected from Android Auto car");
        defpackage.wfp.c();
        this.a.m(false, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kfp
    public final void c(defpackage.qsh qshVar) throws wfo {
        boolean zR = defpackage.kit.b().r();
        defpackage.yqm yqmVar = defpackage.lin.a;
        this.a.l = 3;
        if (defpackage.omv.a) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.lin.a.f()).ai((char) 3940)).u("Overriding GMS log settings, since GH logging forced");
            try {
                defpackage.mkp.a.g();
                defpackage.oml.C(qshVar, "car_force_logging", true);
            } catch (defpackage.qst e) {
                defpackage.rox.p("GH.LifetimeManager", e, "Car not connected while force turning on logging!", new java.lang.Object[0]);
            }
        }
        defpackage.wfp.c();
        defpackage.lin linVar = this.a;
        java.util.Iterator it = linVar.i.iterator();
        while (it.hasNext()) {
            ((defpackage.lhs) it.next()).e();
        }
        if (zR) {
            return;
        }
        linVar.m(false, false);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kfp
    public final void d(rcp rcpVar) throws wfo {
        defpackage.wfp.c();
        ((defpackage.yqj) ((defpackage.yqj) defpackage.lin.a.g()).ai((char) 3930)).y("Connection failed: %s", rcpVar);
        defpackage.lin linVar = this.a;
        linVar.l = 1;
        java.util.Iterator it = linVar.i.iterator();
        while (it.hasNext() && !((defpackage.lhs) it.next()).g(rcpVar)) {
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.kfp
    public final void eH() throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = defpackage.lin.a;
        this.a.l = 1;
    }
}
