package defpackage;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class umx implements uor {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/ApiTileStore");
    public static final abgl b = abgl.GMM_API_TILE_OVERLAY;
    public final uoo d;
    public final uof e;
    public final unu f;
    public final Executor g;
    public final zgt h;
    public final rhj i;
    private final tox k;
    public final ReentrantLock c = new ReentrantLock();
    public final gms j = new gms((short[]) null, (byte[]) null);

    public umx(tox toxVar, uoo uooVar, unu unuVar, rhj rhjVar, Executor executor, zgt zgtVar, uof uofVar) {
        woy.N(toxVar.c.equals(b));
        this.k = toxVar;
        this.d = uooVar;
        this.f = unuVar;
        this.i = rhjVar;
        this.g = executor;
        this.h = zgtVar;
        this.e = uofVar;
    }

    private final void l(ukp ukpVar, boolean z, uoq uoqVar) {
        j(this.g, new isq(this, ukpVar, z, uoqVar, 10));
    }

    @Override // defpackage.plg
    public final String a() {
        return null;
    }

    @Override // defpackage.uor
    public final ukr b() {
        return ukr.a;
    }

    @Override // defpackage.uor
    public final abgl c() {
        return b;
    }

    @Override // defpackage.uor
    public final void d() {
        j(this.h, new ueh(this, 16));
    }

    public final void e(ukp ukpVar, uoq uoqVar, uop uopVar, uko ukoVar) {
        this.g.execute(new saq(uoqVar, ukpVar, uopVar, ukoVar, 5));
    }

    @Override // defpackage.plg
    public final void f(float f) {
        this.d.j();
    }

    @Override // defpackage.uor
    public final void g(ukp ukpVar, uoq uoqVar, boolean z) {
        l(ukpVar, false, uoqVar);
    }

    public final abnp h(ukp ukpVar) {
        abnp abnpVarN = pka.a.n();
        pjy pjyVarM = uqw.m(this.k, ukr.a, ukpVar, "", Locale.getDefault().toLanguageTag());
        abnpVarN.t();
        pka pkaVar = (pka) abnpVarN.b;
        pjyVarM.getClass();
        pkaVar.c = pjyVarM;
        pkaVar.b |= 1;
        return abnpVarN;
    }

    @Override // defpackage.uor
    public final void i(ukp ukpVar, uoq uoqVar) {
        l(ukpVar, true, uoqVar);
    }

    public final void j(Executor executor, Runnable runnable) {
        executor.execute(new fku(this, runnable, 3));
    }

    @Override // defpackage.uor
    public final void k(urg urgVar) {
        this.j.u(urgVar);
    }
}
