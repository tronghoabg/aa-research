package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acmv implements defpackage.acmu {
    private static final defpackage.wdf a;
    private static final defpackage.wdf b;
    private static final defpackage.wdf c;

    static {
        defpackage.rkq rkqVar = defpackage.acmi.b;
        a = rkqVar.t("AndroidAuto__apps_url", "https://play.google.com/store/apps/category/ANDROID_AUTO_PROJECTED");
        b = rkqVar.t("AndroidAuto__companion_video_url", "https://www.youtube.com/watch?v=_eR9pS6tJDI");
        c = rkqVar.t("AndroidAuto__compatible_cars_url", "http://www.android.com/auto/#hit-the-road");
    }

    @Override // defpackage.acmu
    public final java.lang.String a() {
        return (java.lang.String) a.fF();
    }

    @Override // defpackage.acmu
    public final java.lang.String b() {
        return (java.lang.String) b.fF();
    }

    @Override // defpackage.acmu
    public final java.lang.String c() {
        return (java.lang.String) c.fF();
    }
}
