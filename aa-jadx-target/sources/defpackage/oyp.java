package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oyp implements defpackage.epl, defpackage.mph, sav {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.PrimaryDispCM");
    public defpackage.eqg b;
    android.content.ComponentName c;
    public android.content.ComponentName d;
    public boolean e;
    public boolean f;
    public boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final ajnd k = new ajnd(this);

    public static com.google.android.gms.car.display.CarRegionId g(defpackage.nta ntaVar) {
        return defpackage.nte.c().b().r(ntaVar);
    }

    public static final boolean k() {
        return defpackage.mpj.b().f() != null;
    }

    private static boolean l(android.content.Intent intent) {
        return (intent.getFlags() & 1048576) != 0;
    }

    private static final defpackage.sax m() {
        try {
            defpackage.mkp.a.g();
            return defpackage.oml.v(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a);
        } catch (defpackage.qst | defpackage.qsu e) {
            return (defpackage.sax) defpackage.rox.p("GH.PrimaryDispCM", e, "Could not get car window manager", new java.lang.Object[0]);
        }
    }

    private static final boolean n(com.google.android.gms.car.display.CarRegionId carRegionId) {
        if ((defpackage.acnf.s() && carRegionId.equals(g(defpackage.nta.b))) || carRegionId.equals(g(defpackage.nta.c)) || carRegionId.equals(g(defpackage.nta.w))) {
            return true;
        }
        return defpackage.nte.c().b().m() != defpackage.nti.f && carRegionId.equals(g(defpackage.nta.x));
    }

    @Override // defpackage.mph
    public final void e(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        if (com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) yqmVar.l().ai((char) 6136)).y("onAppStarted, %s", carRegionId);
            if (defpackage.acyc.aN() && !n(carRegionId)) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 6141)).u("Stopping immersive due to app start");
                defpackage.nqw.a().h();
            }
            android.content.ComponentName component = intent.getComponent();
            if (defpackage.laq.a().b() && !n(carRegionId) && !l(intent) && !intent.getBooleanExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", false) && intent.getLongExtra("handover-session-id", 0L) == 0) {
                defpackage.nqw.a().f = null;
                defpackage.kpu.c().j(defpackage.yxp.FACET_SWITCHED);
                ((defpackage.yqj) yqmVar.l().ai((char) 6140)).y("Closing assistant due to start of %s", intent);
            }
            boolean z = true;
            if (defpackage.mkt.e.equals(component)) {
                if (this.h) {
                    return;
                }
                m().e(this);
                this.h = true;
                return;
            }
            boolean z2 = carRegionId.equals(g(defpackage.nta.s)) || carRegionId.equals(g(defpackage.nta.t));
            boolean zI = defpackage.ler.a().i(component != null ? new defpackage.mqi(component) : null);
            defpackage.ntb ntbVarB = defpackage.nte.c().b();
            boolean zEquals = ntbVarB.m().equals(defpackage.nti.a);
            boolean zH = ntbVarB.H();
            if (this.i && z2) {
                if (!ntbVarB.K() || (!zI && zEquals)) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 6138)).y("Hiding dashboard due to start of %s after focus relinquished", component);
                    defpackage.mug.a().g(false);
                } else {
                    ((defpackage.yqj) yqmVar.l().ai((char) 6139)).y("Showing dashboard due to start of %s after focus relinquished", component);
                    defpackage.mug.a().l(false);
                }
                this.i = false;
            }
            if (!zEquals) {
                z = zH;
            } else if (!zH) {
                return;
            }
            if (ntbVarB.m().equals(defpackage.nti.g) || ntbVarB.m().equals(defpackage.nti.h)) {
                if (!zI) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 6137)).y("Showing dashboard due to start of nav app: %s", intent);
                    defpackage.mug.a().n();
                }
                if (!z) {
                    return;
                }
            }
            if ("android.intent.action.VIEW".equals(intent.getAction()) || "androidx.car.app.action.NAVIGATE".equals(intent.getAction()) || !z2) {
                return;
            }
            if (defpackage.mkt.A.equals(intent.getComponent())) {
                this.c = intent.getComponent();
                return;
            }
            if (intent.getBooleanExtra("CAR_ACTIVITY_EXTRA_CRASH_RECOVERY", false)) {
                ((defpackage.yqj) yqmVar.l().ai((char) 6134)).u("Intent launched due to crash recovery, ignoring");
                return;
            }
            if (l(intent)) {
                ((defpackage.yqj) yqmVar.l().ai((char) 6133)).u("Intent launched from history, ignoring");
                return;
            }
            if (intent.getBooleanExtra("com.google.android.apps.auto.system.internal.display.primary.PrimaryDisplayContentManager.EXTRA_FOR_RESIZING", false)) {
                ((defpackage.yqj) yqmVar.l().ai((char) 6132)).u("Ignoring launch due to resize");
                return;
            }
            if (intent.getBooleanExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", false)) {
                ((defpackage.yqj) yqmVar.l().ai((char) 6130)).u("Ignoring launch of initial intent");
                if (k()) {
                    return;
                }
                ((defpackage.yqj) yqmVar.l().ai((char) 6131)).u("Launching dashboard for startup");
                defpackage.mug.a().l(false);
                return;
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 6129)).y("Stopping primary region due to nav app %s starting", intent.getComponent());
            defpackage.kgu.d(new nsa(2), "GH.PrimaryDispCM", defpackage.zbe.APP_LAUNCHER, defpackage.zbd.kU, "Car not connected when trying to stop activity", new java.lang.Object[0]);
            defpackage.nye.b().d();
            defpackage.yqm yqmVar2 = defpackage.mpj.a;
            if (intent.getBooleanExtra("ANDROID_AUTO_APP_LAUNCHER_INTENT", false)) {
                defpackage.lhd lhdVarA = defpackage.ler.a();
                android.content.ComponentName component2 = intent.getComponent();
                component2.getClass();
                if (lhdVarA.i(new defpackage.mqi(component2))) {
                    return;
                }
            }
            ((defpackage.yqj) yqmVar.l().ai((char) 6135)).y("Showing dashboard for %s", intent);
            defpackage.mug.a().n();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.epl
    public final void eG(defpackage.eqg eqgVar) throws wfo {
        this.j = true;
        this.g = false;
        defpackage.mpj.b().g(this);
        this.f = false;
        defpackage.ntb ntbVarB = defpackage.nte.c().b();
        defpackage.wfp.c();
        java.util.Set set = ntbVarB.y;
        ajnd ajndVar = this.k;
        set.add(ajndVar);
        ajndVar.j(ntbVarB.v);
        if (this.h) {
            m().h(this);
            this.h = false;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) throws wfo {
        this.j = false;
        defpackage.mpj.b().j(this);
        defpackage.ntb ntbVarB = defpackage.nte.c().b();
        defpackage.wfp.c();
        ntbVarB.y.remove(this.k);
    }

    public final void h(boolean z) {
        android.content.ComponentName componentNameA;
        defpackage.nti ntiVarM = defpackage.nte.c().b().m();
        if ((ntiVarM.equals(defpackage.nti.e) || ntiVarM.equals(defpackage.nti.f)) && (componentNameA = defpackage.lhc.a().a(defpackage.mqg.NAVIGATION)) != null) {
            if (z) {
                j(componentNameA);
            } else {
                if (!defpackage.mkt.A.equals(this.c) || defpackage.ler.a().i(new defpackage.mqi(componentNameA))) {
                    return;
                }
                defpackage.mpk.a().i(new android.content.Intent().setComponent(componentNameA));
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void i(boolean z) throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 6142)).y("onVideoFocusChanged: hasVideoFocus %b", java.lang.Boolean.valueOf(z));
        if (!this.j) {
            ((defpackage.yqj) yqmVar.l().ai((char) 6143)).u("Video focus change out of lifetime, ignoring");
            return;
        }
        if (z) {
            m().h(this);
            this.h = false;
            return;
        }
        this.i = true;
        android.content.Intent component = new android.content.Intent().setComponent(defpackage.maw.a(defpackage.kit.b().e(), true));
        component.putExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", true);
        defpackage.mpk.a().i(component);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean j(android.content.ComponentName componentName) {
        if (defpackage.ler.a().i(new defpackage.mqi(componentName))) {
            return false;
        }
        ((defpackage.yqj) a.l().ai((char) 6128)).u("Starting default turn card activity");
        android.content.ComponentName componentName2 = defpackage.mkt.A;
        this.c = componentName2;
        defpackage.mpk.a().i(new android.content.Intent().setComponent(componentName2).putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1));
        return true;
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eE(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eF(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.mph
    public final /* synthetic */ void a(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }

    @Override // defpackage.mph
    public final /* synthetic */ void b(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }

    @Override // defpackage.mph
    public final /* synthetic */ void f(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
    }
}
