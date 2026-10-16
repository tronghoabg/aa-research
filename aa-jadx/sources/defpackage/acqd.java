package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acqd implements defpackage.acqc {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.t("ControlSupportedNavApps__allowlisted_nav_packages", "com.google.android.apps.gmm.dev,com.google.android.apps.gmm.car,com.google.android.apps.gmm.fishfood,com.google.android.apps.gmm,com.google.android.apps.gmm.qp,com.google.android.apps.maps,com.waze,com.waze.alpha,com.google.android.apps.auto.sdk.samples.chargingstations,com.google.android.apps.auto.sdk.samples.navigation,com.locnall.KimGiSa:21000");
        b = rkqVar.t("ControlSupportedNavApps__denylisted_nav_packages", "");
    }

    @Override // defpackage.acqc
    public final java.lang.String a() {
        return (java.lang.String) a.fF();
    }

    @Override // defpackage.acqc
    public final java.lang.String b() {
        return (java.lang.String) b.fF();
    }
}
