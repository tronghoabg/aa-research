package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class hmn implements hmm {
    public static final defpackage.hmn a = new defpackage.hmn();
    private static final java.util.Map b = new java.util.HashMap();

    public static final void a(java.lang.Class cls, hmm hmmVar) {
        cls.getClass();
        b.put(cls, hmmVar);
    }

    public final androidx.car.app.model.TemplateWrapper b(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper) {
        gfaVar.getClass();
        templateWrapper.getClass();
        hmm hmmVar = (hmm) b.get(templateWrapper.getTemplate().getClass());
        return hmmVar != null ? hmmVar.b(gfaVar, templateWrapper) : templateWrapper;
    }

    public final androidx.car.app.model.TemplateWrapper c(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, gzl gzlVar) {
        hmm hmmVar = (hmm) b.get(templateWrapper.getTemplate().getClass());
        return hmmVar != null ? hmmVar.c(gfaVar, templateWrapper, gzlVar) : templateWrapper;
    }
}
