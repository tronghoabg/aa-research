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
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class Screen implements LifecycleOwner {
    private final CarContext mCarContext;
    private String mMarker;
    private Object mResult;
    private TemplateWrapper mTemplateWrapper;
    private boolean mUseLastTemplateId;
    private final LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);
    private OnScreenResultListener mOnScreenResultListener = new OnScreenResultListener() { // from class: androidx.car.app.Screen$$ExternalSyntheticLambda0
        @Override // androidx.car.app.OnScreenResultListener
        public final void onScreenResult(Object obj) {
        }
    };

    protected Screen(CarContext carContext) {
        this.mCarContext = (CarContext) Objects.requireNonNull(carContext);
    }

    public void dispatchLifecycleEvent(final Lifecycle.Event event) {
        ThreadUtils.runOnMain(new Runnable() { // from class: androidx.car.app.Screen$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1598lambda$dispatchLifecycleEvent$1$androidxcarappScreen(event);
            }
        });
    }

    public final void finish() {
        ((ScreenManager) this.mCarContext.getCarService(ScreenManager.class)).remove(this);
    }

    public final CarContext getCarContext() {
        return this.mCarContext;
    }

    TemplateInfo getLastTemplateInfo() {
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

    TemplateWrapper getTemplateWrapper() {
        TemplateWrapper templateWrapper;
        Template templateOnGetTemplate = onGetTemplate();
        TemplateWrapper templateWrapperWrap = (!this.mUseLastTemplateId || (templateWrapper = this.mTemplateWrapper) == null) ? TemplateWrapper.wrap(templateOnGetTemplate) : TemplateWrapper.wrap(templateOnGetTemplate, getLastTemplateInfo(templateWrapper).getTemplateId());
        this.mUseLastTemplateId = false;
        this.mTemplateWrapper = templateWrapperWrap;
        if (Log.isLoggable(LogTags.TAG, 3)) {
            Log.d(LogTags.TAG, "Returning " + templateOnGetTemplate + " from screen " + this);
        }
        return templateWrapperWrap;
    }

    public final void invalidate() {
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            ((AppManager) this.mCarContext.getCarService(AppManager.class)).invalidate();
        }
    }

    /* renamed from: lambda$dispatchLifecycleEvent$1$androidx-car-app-Screen, reason: not valid java name */
    /* synthetic */ void m1598lambda$dispatchLifecycleEvent$1$androidxcarappScreen(Lifecycle.Event event) {
        if (this.mLifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.mOnScreenResultListener.onScreenResult(this.mResult);
            }
            this.mLifecycleRegistry.handleLifecycleEvent(event);
        }
    }

    public abstract Template onGetTemplate();

    public void setMarker(String str) {
        this.mMarker = str;
    }

    void setOnScreenResultListener(OnScreenResultListener onScreenResultListener) {
        this.mOnScreenResultListener = onScreenResultListener;
    }

    public void setResult(Object obj) {
        this.mResult = obj;
    }

    void setUseLastTemplateId(boolean z) {
        this.mUseLastTemplateId = z;
    }

    static /* synthetic */ void lambda$new$0(Object obj) {
    }

    private static TemplateInfo getLastTemplateInfo(TemplateWrapper templateWrapper) {
        return new TemplateInfo(templateWrapper.getTemplate().getClass(), templateWrapper.getId());
    }
}
