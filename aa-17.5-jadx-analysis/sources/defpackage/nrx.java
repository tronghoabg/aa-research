package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import j$.time.Duration;
import java.util.Map;

/* loaded from: classes2.dex */
public final class nrx implements mpb, eqn {
    public static final yph a = yph.c("GH.IrregularScrim");
    public static final Duration b = Duration.ofMillis(acxa.r());
    public mpi c;
    public nrv d;
    public boolean e = false;
    public final Handler f = new Handler(Looper.getMainLooper());
    public eqn g;

    public static nrx c() {
        return (nrx) mki.a.b(nrx.class, new may(16));
    }

    public final void d() {
        ((ype) a.l().ai((char) 5347)).u("hideIrregularActivityScrim");
        if (this.d != null) {
            kgq.d(new kyi(this, 11), "GH.IrregularScrim", yzz.IRREGULAR_DISPLAY_SCRIM, yzy.Ll, "Car not connected when trying to hide irregular activity scrim", new Object[0]);
        }
    }

    @Override // defpackage.mpb
    public final void e(Intent intent, CarRegionId carRegionId) {
        if (CarDisplayId.b(carRegionId.h)) {
            ComponentName component = intent.getComponent();
            if (component != null) {
                mqc mqcVarA = lem.a().a(kio.b().e(), new mqb(component));
                if (mqcVarA != null && mqcVarA.b == mpz.b) {
                    ((ype) a.l().ai((char) 5355)).u("Hiding irregular activity scrim in onAppStarted because Map app started");
                    d();
                    return;
                }
            }
            yph yphVar = mpd.a;
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("ANDROID_AUTO_APP_LAUNCHER_INTENT", false);
            boolean booleanExtra2 = intent.getBooleanExtra("EXTRA_STARTED_BY_DASHBOARD", false);
            if (carRegionId.equals(nsr.c().b().r(nsn.s)) && !booleanExtra && !booleanExtra2) {
                z = true;
            }
            ((ype) a.l().ai((char) 5354)).y("Showing irregular activity scrim, useSlide: %b", Boolean.valueOf(z));
            g(z);
        }
    }

    @Override // defpackage.eqn
    public final /* bridge */ /* synthetic */ void eS(Object obj) {
        if (((mqc) ((Map) obj).get(CarRegionId.a)) == null) {
            ((ype) a.l().ai((char) 5356)).u("Hiding irregular activity scrim because primary region is empty");
            d();
        }
    }

    public final void g(boolean z) {
        ((ype) a.l().ai((char) 5360)).y("showIrregularActivityScrim, useSlide: %b", Boolean.valueOf(z));
        kgq.d(new mjd(this, z, 2), "GH.IrregularScrim", yzz.IRREGULAR_DISPLAY_SCRIM, yzy.Lk, "Car not connected when trying to show irregular activity scrim", new Object[0]);
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
