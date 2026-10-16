package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kcm implements hlv {
    private static final defpackage.yqm b = defpackage.yqm.c("CarApp.H.Tem");
    public static final defpackage.kcm a = new defpackage.kcm();
    private static final defpackage.yhx c = defpackage.yhx.p(com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate.class, androidx.car.app.navigation.model.NavigationTemplate.class);

    public final hlu a(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper) {
        return b(gfaVar, templateWrapper, gzl.c);
    }

    public final hlu b(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, gzl gzlVar) {
        java.lang.Class<?> cls = templateWrapper.getTemplate().getClass();
        if (cls == androidx.car.app.navigation.model.NavigationTemplate.class) {
            kcl kclVar = new kcl(gfaVar, templateWrapper, gzlVar);
            kclVar.w();
            return kclVar;
        }
        if (cls != com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate.class) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 2916)).y("Don't know how to create a presenter for template: %s", cls.getSimpleName());
            return null;
        }
        gzl gzlVar2 = gzl.d;
        gfaVar.getClass();
        kcy kcyVar = new kcy(gfaVar, templateWrapper, gzlVar2);
        kcyVar.s();
        gnz gnzVarK = gfaVar.k();
        gnx gnxVarA = gny.a(21);
        gnxVarA.b(templateWrapper.getTemplate().getClass().getSimpleName());
        gnzVarK.d(gnxVarA);
        return kcyVar;
    }

    public final java.util.Collection c() {
        return c;
    }
}
