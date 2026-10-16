package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nrm extends defpackage.lhm implements defpackage.nqz {
    static final /* synthetic */ defpackage.afja[] b = {new defpackage.afgh(defpackage.nrm.class, "immersiveModeState", "getImmersiveModeState()Lcom/google/android/apps/auto/components/system/immersivemode/impl/ImmersiveModeControllerImpl$ImmersiveModeState;", 0)};
    public static final defpackage.yqm c = defpackage.yqm.c("GH.ImmersiveMode");
    public android.content.ComponentName d;
    public final android.os.Handler e;
    public final java.lang.Runnable f;
    public oxg g;
    private final defpackage.eqs h;
    private final defpackage.eqs i;
    private boolean k;
    private final defpackage.eqt l;
    private final defpackage.eqp m;
    private final defpackage.qxj n;

    public nrm() {
        defpackage.eqs eqsVar = new defpackage.eqs(defpackage.nrj.a);
        this.h = eqsVar;
        if (!(eqsVar.e() instanceof defpackage.nrl)) {
            throw new java.lang.IllegalStateException("MutableLiveData must be initialized to use as a delegate");
        }
        this.i = eqsVar;
        this.e = new android.os.Handler(android.os.Looper.getMainLooper());
        this.l = new defpackage.kkr(this, 6);
        defpackage.nkn nknVar = new defpackage.nkn(12);
        defpackage.afdo afdoVar = defpackage.tcu.a;
        this.m = defpackage.ebo.f(eqsVar, nknVar);
        this.n = new defpackage.qxj(this);
        this.f = new defpackage.iri(3);
    }

    private final void k(defpackage.nrl nrlVar) {
        b[0].getClass();
        this.i.m(nrlVar);
    }

    private static final defpackage.sax l() {
        return (defpackage.sax) defpackage.khg.u(new defpackage.wde("GH.ImmersiveMode", defpackage.zbe.IMMERSIVE_MODE, defpackage.zbd.Me, "Failed to get CarWindowManager", new java.lang.Object[0]), new defpackage.niq(19));
    }

    private static final boolean m(defpackage.nrl nrlVar) {
        defpackage.nrk nrkVar = nrlVar instanceof defpackage.nrk ? (defpackage.nrk) nrlVar : null;
        return nrkVar != null && nrkVar.a;
    }

    @Override // defpackage.nqz
    public final defpackage.eqp a() {
        return this.m;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.nqz
    public final void b(defpackage.qsh qshVar, android.content.ComponentName componentName) throws wfo {
        java.lang.Integer num;
        qshVar.getClass();
        defpackage.wfp.c();
        if (!this.k) {
            c.l().u("Not started, ignoring request to enter immersive mode");
            return;
        }
        if (i() instanceof defpackage.nrk) {
            c.l().u("Ignoring redundant request to enter immersive mode");
            return;
        }
        defpackage.yqm yqmVar = c;
        yqmVar.l().u("Entering immersive mode");
        this.d = componentName;
        defpackage.nti ntiVarD = defpackage.edd.A().d(com.google.android.gms.car.display.CarDisplayId.a);
        defpackage.ntb ntbVarB = defpackage.nte.c().b();
        if (ntiVarD != defpackage.nti.a || ntbVarB.F() || defpackage.acqh.o()) {
            k(new defpackage.nrk(false));
        } else {
            yqmVar.l().u("Forcing vertical rail");
            k(new defpackage.nrk(true));
            ntbVarB.M();
        }
        if (defpackage.acqh.o()) {
            defpackage.mkp.a.g();
            if (!defpackage.oml.z(qshVar, defpackage.rbf.W)) {
                defpackage.mpr.e().i(false);
                if (defpackage.acqh.m() && (num = (java.lang.Integer) defpackage.kpu.c().i().e()) != null && num.intValue() == 2) {
                    defpackage.mpr.e().g(true);
                }
            }
            if (defpackage.acqh.m() || defpackage.nrc.a.a().d()) {
                defpackage.sax saxVarL = l();
                if (saxVarL != null) {
                    try {
                        saxVarL.a.j(this.n);
                    } catch (android.os.RemoteException e) {
                        defpackage.rrx.c("CAR.WM", e, "registerCarFrameDebugCallback RemoteException");
                        yqmVar = c;
                        ((defpackage.yqj) yqmVar.h()).u("Registering gesture listener failed");
                    }
                } else {
                    yqmVar = c;
                    ((defpackage.yqj) yqmVar.h()).u("Registering gesture listener failed");
                }
                if (defpackage.acqh.m()) {
                    if (defpackage.mpr.e().k()) {
                        return;
                    }
                    yqmVar.l().u("System bars are hidden upon entering immersive mode with app controlled immersive mode enabled, triggering education opportunity");
                    this.e.post(this.f);
                    return;
                }
                j();
                android.os.Handler handler = this.e;
                java.lang.Runnable runnable = this.f;
                nrb nrbVar = defpackage.nrc.a;
                handler.postDelayed(runnable, aitq.e(nrb.b));
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhm, defpackage.lhn
    public final void d() throws wfo {
        super.d();
        defpackage.wfp.c();
        this.k = false;
        k(defpackage.nrj.a);
        if (defpackage.acqh.o()) {
            defpackage.nrc.a.a().a(true);
        }
        defpackage.kpu.c().i().k(this.l);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.nqz
    public final void e(defpackage.qsh qshVar) throws wfo {
        qshVar.getClass();
        defpackage.wfp.c();
        if (!this.k) {
            c.l().u("Not started, ignoring request to exit immersive mode");
            return;
        }
        this.d = null;
        defpackage.nrl nrlVarI = i();
        if (nrlVarI instanceof defpackage.nrj) {
            c.l().u("Ignoring redundant request to exit immersive mode");
            return;
        }
        c.l().u("Exiting immersive mode");
        k(defpackage.nrj.a);
        if (m(nrlVarI)) {
            defpackage.nte.c().b().M();
        }
        if (defpackage.acqh.o()) {
            defpackage.sax saxVarL = l();
            if (saxVarL != null) {
                try {
                    saxVarL.a.o(this.n);
                } catch (android.os.RemoteException e) {
                    defpackage.rrx.c("CAR.WM", e, "unregisterCarFrameDebugCallback RemoteException");
                }
            }
            defpackage.nrc.a.a().a(true);
            defpackage.mpr.e().i(true);
            this.e.removeCallbacks(this.f);
            oxg oxgVar = this.g;
            if (oxgVar != null) {
                oxgVar.c();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhm, defpackage.lhn
    public final void eQ() throws wfo {
        super.eQ();
        defpackage.wfp.c();
        this.k = true;
        defpackage.ngr.a().b(this, new defpackage.njq(this, 3));
        defpackage.kpu.c().i().i(this.l);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.nqz
    public final void f(boolean z) throws wfo {
        defpackage.wfp.c();
        if (!z && h() && defpackage.acqh.m()) {
            c.l().u("System bars are hidden, triggering education opportunity");
            this.e.post(this.f);
        }
    }

    @Override // defpackage.nqz
    public final boolean g() {
        return m(i());
    }

    @Override // defpackage.nqz
    public final boolean h() {
        return i() instanceof defpackage.nrk;
    }

    public final defpackage.nrl i() {
        b[0].getClass();
        return (defpackage.nrl) this.i.e();
    }

    public final void j() {
        if (i() instanceof defpackage.nrj) {
            c.l().u("Ignoring call to show toolbar in disabled state");
            return;
        }
        c.l().u("Showing toolbar");
        defpackage.nrc nrcVarA = defpackage.nrc.a.a();
        android.content.ComponentName componentName = this.d;
        if (componentName == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        nrcVarA.c(componentName);
    }
}
