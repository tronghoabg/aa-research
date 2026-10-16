package defpackage;

/* loaded from: classes3.dex */
public final class aclt implements acls {
    private static final wcj a;
    private static final wcj b;
    private static final wcj c;

    static {
        rju rjuVar = aclg.b;
        a = rjuVar.t("AndroidAuto__apps_url", "https://play.google.com/store/apps/category/ANDROID_AUTO_PROJECTED");
        b = rjuVar.t("AndroidAuto__companion_video_url", "https://www.youtube.com/watch?v=_eR9pS6tJDI");
        c = rjuVar.t("AndroidAuto__compatible_cars_url", "http://www.android.com/auto/#hit-the-road");
    }

    @Override // defpackage.acls
    public final String a() {
        return (String) a.gu();
    }

    @Override // defpackage.acls
    public final String b() {
        return (String) b.gu();
    }

    @Override // defpackage.acls
    public final String c() {
        return (String) c.gu();
    }
}
