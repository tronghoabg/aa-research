package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adjk implements defpackage.adjj {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;
    private static final defpackage.wdf d;

    static {
        defpackage.rkq rkqVar = defpackage.adhr.b;
        a = rkqVar.t("20", "com.google.android.surveys.testapp,com.google.android.tvrecommendations,com.google.android.apps.tv.launcherx");
        b = rkqVar.u("18", false);
        c = rkqVar.u("22", true);
        d = rkqVar.u("21", false);
    }

    @Override // defpackage.adjj
    public final java.lang.String a(android.content.Context context) {
        return (java.lang.String) a.fG(context);
    }

    @Override // defpackage.adjj
    public final boolean b(android.content.Context context) {
        return ((java.lang.Boolean) b.fG(context)).booleanValue();
    }

    @Override // defpackage.adjj
    public final boolean c(android.content.Context context) {
        return ((java.lang.Boolean) c.fG(context)).booleanValue();
    }

    @Override // defpackage.adjj
    public final boolean d(android.content.Context context) {
        return ((java.lang.Boolean) d.fG(context)).booleanValue();
    }
}
