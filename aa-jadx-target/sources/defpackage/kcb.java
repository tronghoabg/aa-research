package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kcb implements hlv {
    private static final defpackage.yqm b = defpackage.yqm.c("CarApp.H.Tem");
    public static final defpackage.kcb a = new defpackage.kcb();
    private static final defpackage.yhx c = defpackage.yhx.q(com.android.car.libraries.apphost.external.model.WebViewTemplate.class, com.android.car.libraries.apphost.external.model.MediaPlaybackTemplate.class, com.android.car.libraries.apphost.external.model.DialpadTemplate.class);

    public final hlu a(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper) {
        java.lang.Class<?> cls = templateWrapper.getTemplate().getClass();
        if (cls == com.android.car.libraries.apphost.external.model.WebViewTemplate.class) {
            kce kceVar = new kce(gfaVar, templateWrapper);
            kceVar.f();
            return kceVar;
        }
        if (cls == com.android.car.libraries.apphost.external.model.MediaPlaybackTemplate.class) {
            defpackage.lem.a();
            return new kcc(gfaVar, templateWrapper);
        }
        if (cls == com.android.car.libraries.apphost.external.model.DialpadTemplate.class) {
            defpackage.lem.a();
            return new kae(gfaVar, templateWrapper);
        }
        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 2911)).y("Don't know how to create a presenter for template: %s", cls.getSimpleName());
        return null;
    }

    public final hlu b(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, gzl gzlVar) {
        return a(gfaVar, templateWrapper);
    }

    public final java.util.Collection c() {
        return c;
    }
}
