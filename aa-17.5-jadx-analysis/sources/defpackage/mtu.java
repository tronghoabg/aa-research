package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes2.dex */
public final class mtu implements mpb {
    final /* synthetic */ mtv a;
    final /* synthetic */ mtt b;

    public mtu(mtv mtvVar, mtt mttVar) {
        this.a = mtvVar;
        this.b = mttVar;
    }

    @Override // defpackage.mpb
    public final void e(Intent intent, CarRegionId carRegionId) {
        mqb mqbVarB;
        ComponentName component;
        intent.getClass();
        carRegionId.getClass();
        mtv mtvVar = this.a;
        nfh nfhVar = mtvVar.g;
        mtt mttVar = this.b;
        ProjectionWindowAnimationChoreography projectionWindowAnimationChoreographyH = nfhVar.h(intent, carRegionId, mttVar.g);
        if (projectionWindowAnimationChoreographyH != null) {
            khc.t(new wci("GH.DashShadeWinCtrl", yzz.DASHBOARD, yzy.y, "Unable to begin delayed choreography", new Object[0]), new lkd(projectionWindowAnimationChoreographyH, 18));
        }
        nso nsoVar = mttVar.a;
        if ((nsoVar.m() == nsv.e || nsoVar.m() == nsv.f) && carRegionId.b() && (intent.getFlags() & 1048576) == 0) {
            mtv.b.l().M("Closing dashboard with animation due to start of %s on %s", intent, carRegionId);
            mttVar.f = mttVar.f || mttVar.g;
            int i = mua.a;
            mtvVar.h(true, null);
        }
        if (nsoVar.m() != nsv.a) {
            yph yphVar = mpd.a;
            if (!intent.getBooleanExtra("ANDROID_AUTO_APP_LAUNCHER_INTENT", false) || (component = intent.getComponent()) == null || !lem.a().i(mpl.b(component))) {
                return;
            }
        }
        if (!affa.f(carRegionId.h, CarDisplayId.a) || (mqbVarB = mpe.a().b(intent)) == null) {
            return;
        }
        mqc mqcVarA = lem.a().a(kio.b().e(), mqbVarB);
        if ((mqcVarA != null ? mqcVarA.b : null) != mpz.b || affa.f(intent.getAction(), "android.intent.action.VIEW") || affa.f(intent.getAction(), "androidx.car.app.action.NAVIGATE") || (intent.getFlags() & 1048576) != 0 || intent.getBooleanExtra("com.google.android.apps.auto.components.system.dashboard.EXTRA_FOR_DASHBOARD", false) || intent.getBooleanExtra("CAR_ACTIVITY_EXTRA_CRASH_RECOVERY", false) || intent.getBooleanExtra("com.google.android.projection.gearhead.system.projectiontrampoline.EXTRA_FOR_STARTUP", false)) {
            return;
        }
        mtv.b.l().M("Closing dashboard due to start of %s on %s", intent, carRegionId);
        mtvVar.w();
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
