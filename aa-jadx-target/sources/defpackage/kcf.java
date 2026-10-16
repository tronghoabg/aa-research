package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kcf implements hlv {
    private static final defpackage.yqm b = defpackage.yqm.c("CarApp.H.Tem");
    public static final defpackage.kcf a = new defpackage.kcf();
    private static final defpackage.yhx c = new defpackage.ynu(androidx.car.app.model.PlaceListMapTemplate.class);

    public final hlu a(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper) {
        return b(gfaVar, templateWrapper, gzl.c);
    }

    public final hlu b(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, gzl gzlVar) {
        java.lang.Class<?> cls = templateWrapper.getTemplate().getClass();
        if (cls != androidx.car.app.model.PlaceListMapTemplate.class) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 2915)).y("Don't know how to create a presenter for template: %s", cls.getSimpleName());
            return null;
        }
        defpackage.lem.a();
        kcg kcgVar = new kcg(gfaVar, templateWrapper, gzlVar);
        kcgVar.f();
        return kcgVar;
    }

    public final java.util.Collection c() {
        return c;
    }
}
