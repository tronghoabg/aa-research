package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kbs implements hlv {
    private static final defpackage.yqm b = defpackage.yqm.c("CarApp.H.Tem");
    public static final defpackage.kbs a = new defpackage.kbs();
    private static final defpackage.yhx c = defpackage.yhx.t(com.android.car.libraries.apphost.external.model.GridWrapperTemplate.class, androidx.car.app.model.MessageTemplate.class, androidx.car.app.model.LongMessageTemplate.class, his.class, androidx.car.app.model.SearchTemplate.class, androidx.car.app.model.signin.SignInTemplate.class, com.android.car.libraries.apphost.internal.model.TabTemplateInternal.class, androidx.car.app.media.model.MediaPlaybackTemplate.class);

    public final hlu a(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper) {
        return b(gfaVar, templateWrapper, gzl.a);
    }

    public final hlu b(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, gzl gzlVar) {
        java.lang.Class<?> cls = templateWrapper.getTemplate().getClass();
        int iC = gfaVar.i().c();
        if (iC >= 2) {
            if (cls == androidx.car.app.model.LongMessageTemplate.class) {
                kbt kbtVar = new kbt(gfaVar, templateWrapper, gzlVar);
                kbtVar.f();
                return kbtVar;
            }
            if (cls == androidx.car.app.model.signin.SignInTemplate.class) {
                kca kcaVar = new kca(gfaVar, templateWrapper, gzlVar);
                kcaVar.m();
                return kcaVar;
            }
        }
        if (cls == com.android.car.libraries.apphost.external.model.GridWrapperTemplate.class) {
            defpackage.lem.a();
            kbu kbuVar = new kbu(gfaVar, templateWrapper, gzlVar);
            kbuVar.f();
            return kbuVar;
        }
        if (cls == androidx.car.app.model.MessageTemplate.class) {
            kby kbyVar = new kby(gfaVar, templateWrapper, gzlVar);
            kbyVar.f();
            return kbyVar;
        }
        if (cls == his.class) {
            defpackage.lem.a();
            gnl gnlVar = new gnl(gfaVar, templateWrapper, gzlVar);
            gnlVar.h();
            return gnlVar;
        }
        if (cls == androidx.car.app.model.SearchTemplate.class) {
            defpackage.lem.a();
            kbw kbwVar = new kbw(gfaVar, templateWrapper, gzlVar);
            kbwVar.h();
            return kbwVar;
        }
        if (cls == com.android.car.libraries.apphost.internal.model.TabTemplateInternal.class) {
            defpackage.lem.a();
            gfaVar.getClass();
            kbx kbxVar = new kbx(gfaVar, templateWrapper, gzlVar);
            kbxVar.d();
            return kbxVar;
        }
        if (cls == androidx.car.app.media.model.MediaPlaybackTemplate.class && iC >= 8) {
            defpackage.lem.a();
            return new kcc(gfaVar, templateWrapper);
        }
        ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 2905)).y("Don't know how to create a presenter for template: %s", cls.getSimpleName());
        return null;
    }

    public final java.util.Collection c() {
        return c;
    }
}
