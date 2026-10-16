package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mhw {
    private static final defpackage.yqm c = defpackage.yqm.c("GH.PreflightToast");
    final android.os.Handler a = new android.os.Handler(android.os.Looper.getMainLooper());
    final java.lang.Runnable b = new defpackage.jpa(this, 14, null);
    private final defpackage.mhv d;

    public mhw(defpackage.mhv mhvVar, defpackage.eqg eqgVar) {
        this.d = mhvVar;
        eqgVar.getLifecycle().c(new defpackage.mhu(this));
    }

    public final void a() {
        this.a.removeCallbacks(this.b);
        java.lang.Object obj = this.d;
        defpackage.bt childFragmentManager = ((android.support.v4.app.Fragment) obj).getChildFragmentManager();
        android.support.v4.app.Fragment fragmentF = childFragmentManager.f("GhPreflightToast");
        if (fragmentF != null) {
            defpackage.w wVar = new defpackage.w(childFragmentManager);
            wVar.k(fragmentF);
            wVar.i(true, true);
        }
        ((defpackage.mgm) obj).b().setVisibility(8);
    }

    public final void b(java.lang.CharSequence charSequence) {
        try {
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.yzd yzdVar = defpackage.yzd.FRX;
            defpackage.zbe zbeVar = defpackage.zbe.PREFLIGHT_TOAST_CONTEXT;
            oimVarU.F(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.nQ).l());
            java.lang.Object obj = this.d;
            if (((android.support.v4.app.Fragment) obj).getChildFragmentManager().f("GhPreflightToast") != null || ((defpackage.mgm) obj).b().getVisibility() == 0) {
                defpackage.omf.u().F(defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.nR).l());
            }
            a();
            defpackage.ocq ocqVarA = defpackage.ocq.a(charSequence);
            ((defpackage.mgm) obj).b().setVisibility(0);
            defpackage.w wVar = new defpackage.w(((android.support.v4.app.Fragment) obj).getChildFragmentManager());
            wVar.q(com.google.android.projection.gearhead.R.id.preflight_toast_container, ocqVarA, "GhPreflightToast");
            wVar.c();
            this.a.postDelayed(this.b, 2000L);
        } catch (java.lang.IllegalStateException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).ai((char) 4955)).u("Unable to show toast.");
        }
    }
}
