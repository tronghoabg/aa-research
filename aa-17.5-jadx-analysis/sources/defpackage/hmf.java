package defpackage;

import androidx.car.app.model.TemplateWrapper;

/* loaded from: classes.dex */
public abstract class hmf implements hmg {
    public abstract wb a(geu geuVar, TemplateWrapper templateWrapper, wb wbVar);

    @Override // defpackage.hmg
    public final TemplateWrapper b(geu geuVar, TemplateWrapper templateWrapper) {
        TemplateWrapper templateWrapperWrap = TemplateWrapper.wrap(a(geuVar, templateWrapper, templateWrapper.getTemplate()), templateWrapper.getId());
        templateWrapperWrap.setRefresh(templateWrapper.isRefresh());
        templateWrapperWrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        return templateWrapperWrap;
    }

    @Override // defpackage.hmg
    public final /* synthetic */ TemplateWrapper c(geu geuVar, TemplateWrapper templateWrapper, gzc gzcVar) {
        return b(geuVar, templateWrapper);
    }
}
