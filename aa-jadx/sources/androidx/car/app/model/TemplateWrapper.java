package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private java.lang.String mId;
    private boolean mIsRefresh;
    private defpackage.wi mTemplate;
    private java.util.List<androidx.car.app.model.TemplateInfo> mTemplateInfoForScreenStack;

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new java.util.ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }

    public static androidx.car.app.model.TemplateWrapper copyOf(androidx.car.app.model.TemplateWrapper templateWrapper) {
        androidx.car.app.model.TemplateWrapper templateWrapperWrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        templateWrapperWrap.setRefresh(templateWrapper.isRefresh());
        templateWrapperWrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        java.util.List<androidx.car.app.model.TemplateInfo> templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            templateWrapperWrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return templateWrapperWrap;
    }

    private static java.lang.String createRandomId() {
        return java.util.UUID.randomUUID().toString();
    }

    public static androidx.car.app.model.TemplateWrapper wrap(defpackage.wi wiVar, java.lang.String str) {
        wiVar.getClass();
        str.getClass();
        return new androidx.car.app.model.TemplateWrapper(wiVar, str);
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public java.lang.String getId() {
        java.lang.String str = this.mId;
        str.getClass();
        return str;
    }

    public defpackage.wi getTemplate() {
        defpackage.wi wiVar = this.mTemplate;
        wiVar.getClass();
        return wiVar;
    }

    public java.util.List<androidx.car.app.model.TemplateInfo> getTemplateInfosForScreenStack() {
        return defpackage.tq.a(this.mTemplateInfoForScreenStack);
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(java.lang.String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(defpackage.wi wiVar) {
        this.mTemplate = wiVar;
    }

    public void setTemplateInfosForScreenStack(java.util.List<androidx.car.app.model.TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public java.lang.String toString() {
        return "[template: " + this.mTemplate + ", ID: " + this.mId + "]";
    }

    public static androidx.car.app.model.TemplateWrapper wrap(defpackage.wi wiVar) {
        return wrap(wiVar, createRandomId());
    }

    private TemplateWrapper(defpackage.wi wiVar, java.lang.String str) {
        this.mTemplateInfoForScreenStack = new java.util.ArrayList();
        this.mTemplate = wiVar;
        this.mId = str;
    }
}
