package androidx.car.app;

import android.util.Log;
import androidx.car.app.model.Template;
import androidx.car.app.model.TemplateInfo;
import androidx.car.app.model.TemplateWrapper;
import androidx.car.app.utils.LogTags;
import androidx.car.app.utils.ThreadUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import defpackage.c0;
import defpackage.n9;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public abstract class Screen implements LifecycleOwner {
    private final CarContext mCarContext;
    private String mMarker;
    private Object mResult;
    private TemplateWrapper mTemplateWrapper;
    private boolean mUseLastTemplateId;
    private final LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);
    private OnScreenResultListener mOnScreenResultListener = new n9();

    public Screen(CarContext carContext) {
        Objects.requireNonNull(carContext);
        this.mCarContext = carContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$dispatchLifecycleEvent$1(Lifecycle.Event event) {
        if (this.mLifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.mOnScreenResultListener.onScreenResult(this.mResult);
            }
            this.mLifecycleRegistry.handleLifecycleEvent(event);
        }
    }

    public void dispatchLifecycleEvent(Lifecycle.Event event) {
        ThreadUtils.runOnMain(new c0(5, this, event));
    }

    public final void finish() {
        ((ScreenManager) this.mCarContext.getCarService(ScreenManager.class)).remove(this);
    }

    public final CarContext getCarContext() {
        return this.mCarContext;
    }

    public TemplateInfo getLastTemplateInfo() {
        if (this.mTemplateWrapper == null) {
            this.mTemplateWrapper = TemplateWrapper.wrap(onGetTemplate());
        }
        return new TemplateInfo(this.mTemplateWrapper.getTemplate().getClass(), this.mTemplateWrapper.getId());
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public String getMarker() {
        return this.mMarker;
    }

    public Object getResultInternal() {
        return this.mResult;
    }

    public final ScreenManager getScreenManager() {
        return (ScreenManager) this.mCarContext.getCarService(ScreenManager.class);
    }

    public TemplateWrapper getTemplateWrapper() {
        TemplateWrapper templateWrapper;
        Template templateOnGetTemplate = onGetTemplate();
        TemplateWrapper templateWrapperWrap = (!this.mUseLastTemplateId || (templateWrapper = this.mTemplateWrapper) == null) ? TemplateWrapper.wrap(templateOnGetTemplate) : TemplateWrapper.wrap(templateOnGetTemplate, getLastTemplateInfo(templateWrapper).getTemplateId());
        this.mUseLastTemplateId = false;
        this.mTemplateWrapper = templateWrapperWrap;
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Objects.toString(templateOnGetTemplate);
            toString();
        }
        return templateWrapperWrap;
    }

    public final void invalidate() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            ((AppManager) this.mCarContext.getCarService(AppManager.class)).invalidate();
        }
    }

    public abstract Template onGetTemplate();

    public void setMarker(String str) {
        this.mMarker = str;
    }

    public void setOnScreenResultListener(OnScreenResultListener onScreenResultListener) {
        this.mOnScreenResultListener = onScreenResultListener;
    }

    public void setResult(Object obj) {
        this.mResult = obj;
    }

    public void setUseLastTemplateId(boolean z) {
        this.mUseLastTemplateId = z;
    }

    private static TemplateInfo getLastTemplateInfo(TemplateWrapper templateWrapper) {
        return new TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Object obj) {
    }
}
