package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Set;

/* loaded from: classes.dex */
public final class oxs implements epf, mpb, rzz {
    public static final yph a = yph.c("GH.PrimaryDispCM");
    public eqa b;
    ComponentName c;
    public ComponentName d;
    public boolean e;
    public boolean f;
    public boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final ajmd k = new ajmd(this);

    public static CarRegionId g(nsn nsnVar) {
        return nsr.c().b().r(nsnVar);
    }

    public static final boolean k() {
        return mpd.b().f() != null;
    }

    private static boolean l(Intent intent) {
        return (intent.getFlags() & 1048576) != 0;
    }

    private static final sab m() {
        try {
            mki.a.g();
            return ols.v(kio.b().e(), CarDisplayId.a);
        } catch (qrz | qsa e) {
            return (sab) tss.r("GH.PrimaryDispCM", e, "Could not get car window manager", new Object[0]);
        }
    }

    private static final boolean n(CarRegionId carRegionId) {
        if ((acmd.s() && carRegionId.equals(g(nsn.b))) || carRegionId.equals(g(nsn.c)) || carRegionId.equals(g(nsn.w))) {
            return true;
        }
        return nsr.c().b().m() != nsv.f && carRegionId.equals(g(nsn.x));
    }

    @Override // defpackage.mpb
    public final void e(Intent intent, CarRegionId carRegionId) {
        if (CarDisplayId.b(carRegionId.h)) {
            yph yphVar = a;
            ((ype) yphVar.l().ai((char) 6110)).y("onAppStarted, %s", carRegionId);
            if (acxa.aK() && !n(carRegionId)) {
                ((ype) ((ype) yphVar.f()).ai((char) 6115)).u("Stopping immersive due to app start");
                nqd.a().h();
            }
            ComponentName component = intent.getComponent();
            if (lal.a().b() && !n(carRegionId) && !l(intent) && !intent.getBooleanExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", false) && intent.getLongExtra("handover-session-id", 0L) == 0) {
                nqd.a().f = null;
                lau.c().j(ywk.FACET_SWITCHED);
                ((ype) yphVar.l().ai((char) 6114)).y("Closing assistant due to start of %s", intent);
            }
            boolean z = true;
            if (mkn.e.equals(component)) {
                if (this.h) {
                    return;
                }
                m().e(this);
                this.h = true;
                return;
            }
            boolean z2 = carRegionId.equals(g(nsn.s)) || carRegionId.equals(g(nsn.t));
            boolean zI = lem.a().i(component != null ? new mqb(component) : null);
            nso nsoVarB = nsr.c().b();
            boolean zEquals = nsoVarB.m().equals(nsv.a);
            boolean zH = nsoVarB.H();
            if (this.i && z2) {
                if (!nsoVarB.K() || (!zI && zEquals)) {
                    ((ype) yphVar.l().ai((char) 6112)).y("Hiding dashboard due to start of %s after focus relinquished", component);
                    mua.a().g(false);
                } else {
                    ((ype) yphVar.l().ai((char) 6113)).y("Showing dashboard due to start of %s after focus relinquished", component);
                    mua.a().l(false);
                }
                this.i = false;
            }
            if (!zEquals) {
                z = zH;
            } else if (!zH) {
                return;
            }
            if (nsoVarB.m().equals(nsv.g) || nsoVarB.m().equals(nsv.h)) {
                if (!zI) {
                    ((ype) yphVar.l().ai((char) 6111)).y("Showing dashboard due to start of nav app: %s", intent);
                    mua.a().n();
                }
                if (!z) {
                    return;
                }
            }
            if ("android.intent.action.VIEW".equals(intent.getAction()) || "androidx.car.app.action.NAVIGATE".equals(intent.getAction()) || !z2) {
                return;
            }
            if (mkn.A.equals(intent.getComponent())) {
                this.c = intent.getComponent();
                return;
            }
            if (intent.getBooleanExtra("CAR_ACTIVITY_EXTRA_CRASH_RECOVERY", false)) {
                ((ype) yphVar.l().ai((char) 6108)).u("Intent launched due to crash recovery, ignoring");
                return;
            }
            if (l(intent)) {
                ((ype) yphVar.l().ai((char) 6107)).u("Intent launched from history, ignoring");
                return;
            }
            if (intent.getBooleanExtra("com.google.android.apps.auto.system.internal.display.primary.PrimaryDisplayContentManager.EXTRA_FOR_RESIZING", false)) {
                ((ype) yphVar.l().ai((char) 6106)).u("Ignoring launch due to resize");
                return;
            }
            if (intent.getBooleanExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", false)) {
                ((ype) yphVar.l().ai((char) 6104)).u("Ignoring launch of initial intent");
                if (k()) {
                    return;
                }
                ((ype) yphVar.l().ai((char) 6105)).u("Launching dashboard for startup");
                mua.a().l(false);
                return;
            }
            ((ype) yphVar.l().ai((char) 6103)).y("Stopping primary region due to nav app %s starting", intent.getComponent());
            kgq.d(new nrm(2), "GH.PrimaryDispCM", yzz.APP_LAUNCHER, yzy.kU, "Car not connected when trying to stop activity", new Object[0]);
            nxo.b().d();
            yph yphVar2 = mpd.a;
            if (intent.getBooleanExtra("ANDROID_AUTO_APP_LAUNCHER_INTENT", false)) {
                lgw lgwVarA = lem.a();
                ComponentName component2 = intent.getComponent();
                component2.getClass();
                if (lgwVarA.i(new mqb(component2))) {
                    return;
                }
            }
            ((ype) yphVar.l().ai((char) 6109)).y("Showing dashboard for %s", intent);
            mua.a().n();
        }
    }

    @Override // defpackage.epf
    public final void fL(eqa eqaVar) {
        this.j = false;
        mpd.b().j(this);
        nso nsoVarB = nsr.c().b();
        wer.c();
        nsoVarB.y.remove(this.k);
    }

    @Override // defpackage.epf
    public final void fy(eqa eqaVar) {
        this.j = true;
        this.g = false;
        mpd.b().g(this);
        this.f = false;
        nso nsoVarB = nsr.c().b();
        wer.c();
        Set set = nsoVarB.y;
        ajmd ajmdVar = this.k;
        set.add(ajmdVar);
        ajmdVar.h(nsoVarB.v);
        if (this.h) {
            m().h(this);
            this.h = false;
        }
    }

    public final void h(boolean z) {
        ComponentName componentNameA;
        nsv nsvVarM = nsr.c().b().m();
        if ((nsvVarM.equals(nsv.e) || nsvVarM.equals(nsv.f)) && (componentNameA = lgv.a().a(mpz.b)) != null) {
            if (z) {
                j(componentNameA);
            } else {
                if (!mkn.A.equals(this.c) || lem.a().i(new mqb(componentNameA))) {
                    return;
                }
                mpe.a().i(new Intent().setComponent(componentNameA));
            }
        }
    }

    @Override // defpackage.rzz
    public final void i(boolean z) {
        wer.c();
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 6116)).y("onVideoFocusChanged: hasVideoFocus %b", Boolean.valueOf(z));
        if (!this.j) {
            ((ype) yphVar.l().ai((char) 6117)).u("Video focus change out of lifetime, ignoring");
            return;
        }
        if (z) {
            m().h(this);
            this.h = false;
            return;
        }
        this.i = true;
        Intent component = new Intent().setComponent(map.a(kio.b().e(), true));
        component.putExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", true);
        mpe.a().i(component);
    }

    @ResultIgnorabilityUnspecified
    public final boolean j(ComponentName componentName) {
        if (lem.a().i(new mqb(componentName))) {
            return false;
        }
        ((ype) a.l().ai((char) 6102)).u("Starting default turn card activity");
        ComponentName componentName2 = mkn.A;
        this.c = componentName2;
        mpe.a().i(new Intent().setComponent(componentName2).putExtra("com.google.android.gms.car.EXTRA_CAR_ACTIVITY_FLAGS", 1));
        return true;
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fM() {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fv(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fw(eqa eqaVar) {
    }

    @Override // defpackage.epf
    public final /* synthetic */ void fx(eqa eqaVar) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void a(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void b(Intent intent, CarRegionId carRegionId) {
    }

    @Override // defpackage.mpb
    public final /* synthetic */ void f(Intent intent, CarRegionId carRegionId) {
    }
}
