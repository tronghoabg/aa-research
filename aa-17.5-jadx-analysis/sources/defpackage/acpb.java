package defpackage;

/* loaded from: classes.dex */
public final class acpb implements acpa {
    private static final wcj a;
    private static final wcj b;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.t("ControlSupportedNavApps__allowlisted_nav_packages", "com.google.android.apps.gmm.dev,com.google.android.apps.gmm.car,com.google.android.apps.gmm.fishfood,com.google.android.apps.gmm,com.google.android.apps.gmm.qp,com.google.android.apps.maps,com.waze,com.waze.alpha,com.google.android.apps.auto.sdk.samples.chargingstations,com.google.android.apps.auto.sdk.samples.navigation,com.locnall.KimGiSa:21000");
        b = rjuVar.t("ControlSupportedNavApps__denylisted_nav_packages", "");
    }

    @Override // defpackage.acpa
    public final String a() {
        return (String) a.gu();
    }

    @Override // defpackage.acpa
    public final String b() {
        return (String) b.gu();
    }
}
