package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class hml implements hmm {
    public abstract wi a(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, wi wiVar);

    public final androidx.car.app.model.TemplateWrapper b(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper) {
        androidx.car.app.model.TemplateWrapper templateWrapperWrap = androidx.car.app.model.TemplateWrapper.wrap(a(gfaVar, templateWrapper, templateWrapper.getTemplate()), templateWrapper.getId());
        templateWrapperWrap.setRefresh(templateWrapper.isRefresh());
        templateWrapperWrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        return templateWrapperWrap;
    }

    public final /* synthetic */ androidx.car.app.model.TemplateWrapper c(gfa gfaVar, androidx.car.app.model.TemplateWrapper templateWrapper, gzl gzlVar) {
        return b(gfaVar, templateWrapper);
    }
}
