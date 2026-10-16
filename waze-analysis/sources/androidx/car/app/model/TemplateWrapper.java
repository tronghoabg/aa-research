package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.utils.CollectionUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private String mId;
    private boolean mIsRefresh;
    private Template mTemplate;
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

    public static TemplateWrapper wrap(Template template, String str) {
        return new TemplateWrapper((Template) Objects.requireNonNull(template), (String) Objects.requireNonNull(str));
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public String getId() {
        return (String) Objects.requireNonNull(this.mId);
    }

    public Template getTemplate() {
        return (Template) Objects.requireNonNull(this.mTemplate);
    }

    public List<TemplateInfo> getTemplateInfosForScreenStack() {
        return CollectionUtils.emptyIfNull(this.mTemplateInfoForScreenStack);
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i2) {
        this.mCurrentTaskStep = i2;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(Template template) {
        this.mTemplate = template;
    }

    public void setTemplateInfosForScreenStack(List<TemplateInfo> list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public String toString() {
        return "[template: " + this.mTemplate + ", ID: " + this.mId + "]";
    }

    private TemplateWrapper(Template template, String str) {
        this.mTemplateInfoForScreenStack = new ArrayList();
        this.mTemplate = template;
        this.mId = str;
    }

    public static TemplateWrapper wrap(Template template) {
        return wrap(template, createRandomId());
    }
}
