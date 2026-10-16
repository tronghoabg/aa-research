package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gwl implements hlv {
    private final defpackage.affc a;

    public gwl(defpackage.affc affcVar) {
        this.a = affcVar;
    }

    public final hlu a(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper) {
        gfaVar.getClass();
        return b(gfaVar, templateWrapper, gzl.a);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [gfn, java.lang.Object] */
    public final hlu b(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, gzl gzlVar) {
        gfaVar.getClass();
        if (templateWrapper.getTemplate() instanceof gzj) {
            return new gwk(templateWrapper, gfaVar, gzlVar, (gfn) this.a.invoke(gfaVar));
        }
        return null;
    }

    public final java.util.Collection c() {
        return defpackage.afga.aa(gzj.class);
    }
}
