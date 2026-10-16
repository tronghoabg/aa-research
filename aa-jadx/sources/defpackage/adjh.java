package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adjh implements defpackage.adjg {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;

    static {
        defpackage.rkq rkqVar = defpackage.adhr.b;
        a = rkqVar.u("14", true);
        b = rkqVar.t("15", "com.google.android.surveys.testapp,com.google.android.projection.gearhead,com.google.android.tvrecommendations,com.google.android.apps.tv.launcherx,com.google.android.gms");
    }

    @Override // defpackage.adjg
    public final java.lang.String a(android.content.Context context) {
        return (java.lang.String) b.fG(context);
    }

    @Override // defpackage.adjg
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) a.fG(context)).booleanValue();
    }
}
