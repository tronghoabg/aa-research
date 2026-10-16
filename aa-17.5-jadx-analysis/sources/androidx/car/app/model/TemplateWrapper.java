package androidx.car.app.model;

import defpackage.rb;
import defpackage.tl;
import defpackage.wb;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@rb
/* loaded from: classes2.dex */
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private String mId;
    private boolean mIsRefresh;
    private wb mTemplate;
    private List<TemplateInfo> mTemplateInfoForScreenStack;

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }

    public static TemplateWrapper copyOf(TemplateWrapper templateWrapper) {
        TemplateWrapper templateWrapperWrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        templateWrapperWrap.setRefresh(templateWrapper.isRefresh());
        templateWrapperWrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        List<TemplateInfo> templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            templateWrapperWrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return templateWrapperWrap;
    }

    private static String createRandomId() {
        return UUID.randomUUID().toString();
    }

    public static TemplateWrapper wrap(wb wbVar, String str) {
        wbVar.getClass();
        str.getClass();
        return new TemplateWrapper(wbVar, str);
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public String getId() {
        String str = this.mId;
        str.getClass();
        return str;
    }

    public wb getTemplate() {
        wb wbVar = this.mTemplate;
        wbVar.getClass();
        return wbVar;
    }

    public List<TemplateInfo> getTemplateInfosForScreenStack() {
        return tl.a(this.mTemplateInfoForScreenStack);
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(wb wbVar) {
        this.mTemplate = wbVar;
    }

    public void setTemplateInfosForScreenStack(List<TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public String toString() {
        return "[template: " + this.mTemplate + ", ID: " + this.mId + "]";
    }

    public static TemplateWrapper wrap(wb wbVar) {
        return wrap(wbVar, createRandomId());
    }

    private TemplateWrapper(wb wbVar, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = wbVar;
        this.mId = str;
    }
}
