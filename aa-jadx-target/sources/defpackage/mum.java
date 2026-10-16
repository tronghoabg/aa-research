package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mum implements defpackage.mph {
    final /* synthetic */ defpackage.mun a;
    final /* synthetic */ defpackage.mul b;
    final /* synthetic */ defpackage.qsh c;

    public mum(defpackage.mun munVar, defpackage.mul mulVar, defpackage.qsh qshVar) {
        this.a = munVar;
        this.b = mulVar;
        this.c = qshVar;
    }

    @Override // defpackage.mph
    public final void e(android.content.Intent intent, com.google.android.gms.car.display.CarRegionId carRegionId) {
        android.content.ComponentName component;
        intent.getClass();
        carRegionId.getClass();
        defpackage.mun munVar = this.a;
        defpackage.ngb ngbVar = munVar.d;
        defpackage.mul mulVar = this.b;
        com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyH = ngbVar.h(intent, carRegionId, mulVar.d);
        if (projectionWindowAnimationChoreographyH != null) {
            defpackage.khg.u(new defpackage.wde("GH.DashWinController", defpackage.zbe.DASHBOARD, defpackage.zbd.y, "Unable to begin delayed choreography", new java.lang.Object[0]), new defpackage.muk(projectionWindowAnimationChoreographyH, 2));
        }
        defpackage.ntb ntbVar = mulVar.a;
        if (ntbVar.m() == defpackage.nti.e && carRegionId.b() && mulVar.d && (intent.getFlags() & 1048576) == 0) {
            munVar.b.l().M("Closing dashboard with animation due to start of %s on %s", intent, carRegionId);
            mulVar.f = true;
            munVar.x();
        }
        if (ntbVar.m() != defpackage.nti.a) {
            defpackage.yqm yqmVar = defpackage.mpj.a;
            if (!intent.getBooleanExtra("ANDROID_AUTO_APP_LAUNCHER_INTENT", false) || (component = intent.getComponent()) == null || !defpackage.ler.a().i(defpackage.mpr.b(component))) {
                return;
            }
        }
        if (defpackage.afga.f(carRegionId.h, com.google.android.gms.car.display.CarDisplayId.a)) {
            defpackage.qsh qshVar = this.c;
            defpackage.mqi mqiVarB = defpackage.mpk.a().b(intent);
            if (mqiVarB != null) {
                defpackage.mqj mqjVarA = defpackage.ler.a().a(qshVar, mqiVarB);
                if ((mqjVarA != null ? mqjVarA.b : null) != defpackage.mqg.NAVIGATION || defpackage.afga.f(intent.getAction(), "android.intent.action.VIEW") || defpackage.afga.f(intent.getAction(), "androidx.car.app.action.NAVIGATE") || (intent.getFlags() & 1048576) != 0 || intent.getBooleanExtra("com.google.android.apps.auto.components.system.dashboard.EXTRA_FOR_DASHBOARD", false) || intent.getBooleanExtra("CAR_ACTIVITY_EXTRA_CRASH_RECOVERY", false) || intent.getBooleanExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", false)) {
                    return;
                }
                munVar.b.l().M("Closing dashboard due to start of %s on %s", intent, carRegionId);
                int i = defpackage.mug.a;
                munVar.i(false, null);
            }
        }
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
