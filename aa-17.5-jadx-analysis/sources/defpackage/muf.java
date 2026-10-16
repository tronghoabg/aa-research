package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class muf implements mpb {
    final /* synthetic */ mug a;
    final /* synthetic */ mue b;
    final /* synthetic */ qrn c;

    public muf(mug mugVar, mue mueVar, qrn qrnVar) {
        this.a = mugVar;
        this.b = mueVar;
        this.c = qrnVar;
    }

    @Override // defpackage.mpb
    public final void e(Intent intent, CarRegionId carRegionId) {
        ComponentName component;
        intent.getClass();
        carRegionId.getClass();
        mug mugVar = this.a;
        nfh nfhVar = mugVar.d;
        mue mueVar = this.b;
        ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyH = nfhVar.h(intent, carRegionId, mueVar.d);
        if (projectionWindowAnimationChoreographyH != null) {
            khc.t(new wci("GH.DashWinController", yzz.DASHBOARD, yzy.y, "Unable to begin delayed choreography", new Object[0]), new lkd(projectionWindowAnimationChoreographyH, 20));
        }
        nso nsoVar = mueVar.a;
        if (nsoVar.m() == nsv.e && carRegionId.b() && mueVar.d && (intent.getFlags() & 1048576) == 0) {
            mugVar.b.l().M("Closing dashboard with animation due to start of %s on %s", intent, carRegionId);
            mueVar.f = true;
            mugVar.w();
        }
        if (nsoVar.m() != nsv.a) {
            yph yphVar = mpd.a;
            if (!intent.getBooleanExtra("ANDROID_AUTO_APP_LAUNCHER_INTENT", false) || (component = intent.getComponent()) == null || !lem.a().i(mpl.b(component))) {
                return;
            }
        }
        if (affa.f(carRegionId.h, CarDisplayId.a)) {
            qrn qrnVar = this.c;
            mqb mqbVarB = mpe.a().b(intent);
            if (mqbVarB != null) {
                mqc mqcVarA = lem.a().a(qrnVar, mqbVarB);
                if ((mqcVarA != null ? mqcVarA.b : null) != mpz.b || affa.f(intent.getAction(), "android.intent.action.VIEW") || affa.f(intent.getAction(), "androidx.car.app.action.NAVIGATE") || (intent.getFlags() & 1048576) != 0 || intent.getBooleanExtra("com.google.android.apps.auto.components.system.dashboard.EXTRA_FOR_DASHBOARD", false) || intent.getBooleanExtra("CAR_ACTIVITY_EXTRA_CRASH_RECOVERY", false) || intent.getBooleanExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", false)) {
                    return;
                }
                mugVar.b.l().M("Closing dashboard due to start of %s on %s", intent, carRegionId);
                int i = mua.a;
                mugVar.i(false, null);
            }
        }
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
