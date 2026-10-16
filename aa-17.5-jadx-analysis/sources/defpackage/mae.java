package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class mae implements lhg, mpb {
    private static final yph a = yph.c("GH.GhNavLifetimeComp");

    @Override // defpackage.lhg
    public final void c() {
        mpd.b().g(this);
    }

    @Override // defpackage.lhg
    public final void d() {
        mpd.b().j(this);
    }

    @Override // defpackage.mpb
    public final void e(Intent intent, CarRegionId carRegionId) {
        mqc mqcVarA;
        mqb mqbVarB = mpe.a().b(intent);
        if (mqbVarB == null || (mqcVarA = lem.a().a(kio.b().e(), mqbVarB)) == null) {
            return;
        }
        mpz mpzVar = mqcVarA.b;
        mpz mpzVar2 = mpz.b;
        if (mpzVar == mpzVar2) {
            ComponentName componentNameA = mqcVarA.a();
            luk.a().g(componentNameA);
            if (acxa.aM()) {
                ((ype) a.l().ai((char) 4623)).y("onAppStarted storing nav app %s", componentNameA);
                lgv.a().f(mpzVar2, componentNameA);
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
