package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.core.util.Consumer;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.BuildConfig;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExtensionsUtil$$ExternalSyntheticApiModelOutline0;
import androidx.window.core.VerificationMode;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.SplitAttributes;
import androidx.window.embedding.SplitController;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.reflection.Consumer2;
import h.ab;
import h.g.a.l;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.o;
import h.g.b.x;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    public static final Companion Companion = new Companion(null);
    public static final boolean DEBUG = true;
    private static final String TAG = "EmbeddingCompat";
    private final ActivityWindowInfoCallbackController activityWindowInfoCallbackController;
    private final EmbeddingAdapter adapter;
    private final Context applicationContext;
    private final ConsumerAdapter consumerAdapter;
    private final ActivityEmbeddingComponent embeddingExtension;
    private boolean isCustomSplitAttributeCalculatorSet;
    private final OverlayControllerImpl overlayController;
    private final WindowSdkExtensions windowSdkExtensions;

    public EmbeddingCompat(ActivityEmbeddingComponent activityEmbeddingComponent, EmbeddingAdapter embeddingAdapter, ConsumerAdapter consumerAdapter, Context context, OverlayControllerImpl overlayControllerImpl, ActivityWindowInfoCallbackController activityWindowInfoCallbackController) {
        x.f(activityEmbeddingComponent, "embeddingExtension");
        x.f(embeddingAdapter, "adapter");
        x.f(consumerAdapter, "consumerAdapter");
        x.f(context, "applicationContext");
        this.embeddingExtension = activityEmbeddingComponent;
        this.adapter = embeddingAdapter;
        this.consumerAdapter = consumerAdapter;
        this.applicationContext = context;
        this.overlayController = overlayControllerImpl;
        this.activityWindowInfoCallbackController = activityWindowInfoCallbackController;
        this.windowSdkExtensions = WindowSdkExtensions.Companion.getInstance();
    }

    private final void registerSplitInfoCallback(final EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface) {
        this.embeddingExtension.setSplitInfoCallback(new Consumer2() { // from class: androidx.window.embedding.EmbeddingCompat$$ExternalSyntheticLambda2
            @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                EmbeddingCompat.registerSplitInfoCallback$lambda$0(embeddingCallbackInterface, this, (List) obj);
            }
        });
    }

    static final void registerSplitInfoCallback$lambda$0(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, EmbeddingCompat embeddingCompat, List list) {
        x.f(list, "splitInfoList");
        embeddingCallbackInterface.onSplitInfoChanged(embeddingCompat.adapter.translate((List<? extends androidx.window.extensions.embedding.SplitInfo>) list));
    }

    private final void setDefaultSplitAttributeCalculatorIfNeeded() {
        if (this.windowSdkExtensions.getExtensionVersion() < 5 || this.isCustomSplitAttributeCalculatorSet || this.adapter.getEmbeddingConfiguration() == null) {
            return;
        }
        this.embeddingExtension.setSplitAttributesCalculator(new Function() { // from class: androidx.window.embedding.EmbeddingCompat$$ExternalSyntheticLambda3
            @Override // androidx.window.extensions.core.util.function.Function
            public final Object apply(Object obj) {
                return EmbeddingCompat.setDefaultSplitAttributeCalculatorIfNeeded$lambda$0(this.f$0, ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13436m(obj));
            }
        });
    }

    static final androidx.window.extensions.embedding.SplitAttributes setDefaultSplitAttributeCalculatorIfNeeded$lambda$0(EmbeddingCompat embeddingCompat, androidx.window.extensions.embedding.SplitAttributesCalculatorParams splitAttributesCalculatorParams) {
        if (!splitAttributesCalculatorParams.areDefaultConstraintsSatisfied()) {
            return embeddingCompat.adapter.translateSplitAttributes(new SplitAttributes.Builder().setSplitType(SplitAttributes.SplitType.SPLIT_TYPE_EXPAND).build());
        }
        EmbeddingAdapter embeddingAdapter = embeddingCompat.adapter;
        androidx.window.extensions.embedding.SplitAttributes defaultSplitAttributes = splitAttributesCalculatorParams.getDefaultSplitAttributes();
        x.e(defaultSplitAttributes, "getDefaultSplitAttributes(...)");
        return embeddingAdapter.translateSplitAttributes(embeddingAdapter.translate$window(defaultSplitAttributes));
    }

    static final ab setEmbeddingCallback$lambda$0(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface, EmbeddingCompat embeddingCompat, List list) {
        x.f(list, "values");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m13457m(obj)) {
                arrayList.add(obj);
            }
        }
        embeddingCallbackInterface.onSplitInfoChanged(embeddingCompat.adapter.translate(arrayList));
        return ab.f48028a;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void addEmbeddedActivityWindowInfoCallbackForActivity(Activity activity, Consumer<EmbeddedActivityWindowInfo> consumer) {
        x.f(activity, "activity");
        x.f(consumer, "callback");
        ActivityWindowInfoCallbackController activityWindowInfoCallbackController = this.activityWindowInfoCallbackController;
        if (activityWindowInfoCallbackController != null) {
            activityWindowInfoCallbackController.addCallback(activity, consumer);
        } else {
            Log.w(TAG, "EmbeddedActivityWindowInfo is not supported on device less than version 6");
        }
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void addOverlayInfoCallback(String str, Executor executor, Consumer<OverlayInfo> consumer) {
        x.f(str, "overlayTag");
        x.f(executor, "executor");
        x.f(consumer, "overlayInfoCallback");
        OverlayControllerImpl overlayControllerImpl = this.overlayController;
        if (overlayControllerImpl != null) {
            overlayControllerImpl.addOverlayInfoCallback(str, executor, consumer);
        } else {
            Log.w(TAG, "overlayInfo is not supported on device less than version 5");
            consumer.accept(new OverlayInfo(str, null, null));
        }
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void clearOverlayAttributesCalculator() {
        this.windowSdkExtensions.requireExtensionVersion$window(8);
        OverlayControllerImpl overlayControllerImpl = this.overlayController;
        x.c(overlayControllerImpl);
        overlayControllerImpl.setOverlayAttributesCalculator$window(null);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void clearSplitAttributesCalculator() {
        this.windowSdkExtensions.requireExtensionVersion$window(2);
        this.embeddingExtension.clearSplitAttributesCalculator();
        this.isCustomSplitAttributeCalculatorSet = false;
        setDefaultSplitAttributeCalculatorIfNeeded();
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void finishActivityStacks(Set<ActivityStack> set) {
        x.f(set, "activityStacks");
        this.windowSdkExtensions.requireExtensionVersion$window(5);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((ActivityStack) it.next()).getToken$window());
        }
        this.embeddingExtension.finishActivityStacksWithTokens(linkedHashSet);
    }

    public final OverlayControllerImpl getOverlayController$window() {
        return this.overlayController;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void invalidateVisibleActivityStacks() {
        this.windowSdkExtensions.requireExtensionVersion$window(3);
        invalidateVisibleActivityStacks(this.embeddingExtension);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public boolean isActivityEmbedded(Activity activity) {
        x.f(activity, "activity");
        return this.embeddingExtension.isActivityEmbedded(activity);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public boolean pinTopActivityStack(int i2, SplitPinRule splitPinRule) {
        x.f(splitPinRule, "splitPinRule");
        this.windowSdkExtensions.requireExtensionVersion$window(5);
        return this.embeddingExtension.pinTopActivityStack(i2, this.adapter.translateSplitPinRule(this.applicationContext, splitPinRule));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void removeEmbeddedActivityWindowInfoCallbackForActivity(Consumer<EmbeddedActivityWindowInfo> consumer) {
        x.f(consumer, "callback");
        ActivityWindowInfoCallbackController activityWindowInfoCallbackController = this.activityWindowInfoCallbackController;
        if (activityWindowInfoCallbackController != null) {
            activityWindowInfoCallbackController.removeCallback(consumer);
        }
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void removeOverlayInfoCallback(Consumer<OverlayInfo> consumer) {
        x.f(consumer, "overlayInfoCallback");
        OverlayControllerImpl overlayControllerImpl = this.overlayController;
        if (overlayControllerImpl != null) {
            overlayControllerImpl.removeOverlayInfoCallback(consumer);
        }
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingCallback(final EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        x.f(embeddingCallbackInterface, "embeddingCallback");
        int extensionVersion = this.windowSdkExtensions.getExtensionVersion();
        if (extensionVersion == 1) {
            ConsumerAdapter consumerAdapter = this.consumerAdapter;
            ActivityEmbeddingComponent activityEmbeddingComponent = this.embeddingExtension;
            int i2 = ar.f48106a;
            consumerAdapter.addConsumer(activityEmbeddingComponent, new m(List.class), "setSplitInfoCallback", new l() { // from class: androidx.window.embedding.EmbeddingCompat$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return EmbeddingCompat.setEmbeddingCallback$lambda$0(embeddingCallbackInterface, this, (List) obj);
                }
            });
            return;
        }
        if (extensionVersion >= 2 && extensionVersion < 5) {
            registerSplitInfoCallback(embeddingCallbackInterface);
        } else if (extensionVersion >= 5) {
            registerSplitInfoCallback(embeddingCallbackInterface);
            this.embeddingExtension.registerActivityStackCallback(new Executor() { // from class: androidx.window.embedding.EmbeddingCompat$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    runnable.run();
                }
            }, new ActivityStackConsumer(embeddingCallbackInterface, this.adapter));
        }
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setEmbeddingConfiguration(EmbeddingConfiguration embeddingConfiguration) {
        x.f(embeddingConfiguration, "embeddingConfig");
        this.windowSdkExtensions.requireExtensionVersion$window(5);
        this.adapter.setEmbeddingConfiguration(embeddingConfiguration);
        setDefaultSplitAttributeCalculatorIfNeeded();
        if (this.windowSdkExtensions.getExtensionVersion() >= 8) {
            this.embeddingExtension.setAutoSaveEmbeddingState(embeddingConfiguration.isAutoSaveEmbeddingState());
        }
        this.embeddingExtension.invalidateTopVisibleSplitAttributes();
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public Bundle setLaunchingActivityStack(Bundle bundle, ActivityStack activityStack) {
        x.f(bundle, "options");
        x.f(activityStack, "activityStack");
        this.windowSdkExtensions.requireExtensionVersion$window(5);
        ActivityEmbeddingOptionsImpl.INSTANCE.setActivityStackToken$window(bundle, activityStack.getToken$window());
        return bundle;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setOverlayAttributesCalculator(l<? super OverlayAttributesCalculatorParams, OverlayAttributes> lVar) {
        x.f(lVar, "calculator");
        this.windowSdkExtensions.requireExtensionVersion$window(8);
        OverlayControllerImpl overlayControllerImpl = this.overlayController;
        x.c(overlayControllerImpl);
        overlayControllerImpl.setOverlayAttributesCalculator$window(lVar);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public Bundle setOverlayCreateParams(Bundle bundle, OverlayCreateParams overlayCreateParams) {
        x.f(bundle, "options");
        x.f(overlayCreateParams, "overlayCreateParams");
        ActivityEmbeddingOptionsImpl.INSTANCE.setOverlayCreateParams$window(bundle, overlayCreateParams);
        return bundle;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setRules(Set<? extends EmbeddingRule> set) {
        x.f(set, "rules");
        Iterator<? extends EmbeddingRule> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (it.next() instanceof SplitRule) {
                if (!x.n(SplitController.Companion.getInstance(this.applicationContext).getSplitSupportStatus(), SplitController.SplitSupportStatus.SPLIT_AVAILABLE)) {
                    if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                        Log.w(TAG, "Cannot set SplitRule because ActivityEmbedding Split is not supported or PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED is not set.");
                        return;
                    }
                    return;
                }
            }
        }
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(this.applicationContext, set));
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void setSplitAttributesCalculator(l<? super SplitAttributesCalculatorParams, SplitAttributes> lVar) {
        x.f(lVar, "calculator");
        this.windowSdkExtensions.requireExtensionVersion$window(2);
        this.embeddingExtension.setSplitAttributesCalculator(this.adapter.translateSplitAttributesCalculator(lVar));
        this.isCustomSplitAttributeCalculatorSet = true;
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void unpinTopActivityStack(int i2) {
        this.windowSdkExtensions.requireExtensionVersion$window(5);
        this.embeddingExtension.unpinTopActivityStack(i2);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void updateOverlayAttributes(String str, OverlayAttributes overlayAttributes) {
        x.f(str, "overlayTag");
        x.f(overlayAttributes, "overlayAttributes");
        this.windowSdkExtensions.requireExtensionVersion$window(8);
        OverlayControllerImpl overlayControllerImpl = this.overlayController;
        x.c(overlayControllerImpl);
        overlayControllerImpl.updateOverlayAttributes$window(str, overlayAttributes);
    }

    @Override // androidx.window.embedding.EmbeddingInterfaceCompat
    public void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes) {
        x.f(splitInfo, "splitInfo");
        x.f(splitAttributes, "splitAttributes");
        this.windowSdkExtensions.requireExtensionVersion$window(3);
        int extensionVersion = this.windowSdkExtensions.getExtensionVersion();
        ActivityEmbeddingComponent activityEmbeddingComponent = this.embeddingExtension;
        if (extensionVersion >= 5) {
            activityEmbeddingComponent.updateSplitAttributes(splitInfo.getToken$window(), this.adapter.translateSplitAttributes(splitAttributes));
        } else {
            activityEmbeddingComponent.updateSplitAttributes(splitInfo.getBinder$window(), this.adapter.translateSplitAttributes(splitAttributes));
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final ActivityEmbeddingComponent emptyActivityEmbeddingProxy() throws IllegalArgumentException {
            Object objNewProxyInstance = Proxy.newProxyInstance(EmbeddingCompat.class.getClassLoader(), new Class[]{EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m$2()}, new InvocationHandler() { // from class: androidx.window.embedding.EmbeddingCompat$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    return ab.f48028a;
                }
            });
            x.d(objNewProxyInstance, "null cannot be cast to non-null type androidx.window.extensions.embedding.ActivityEmbeddingComponent");
            return EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m(objNewProxyInstance);
        }

        public final ActivityEmbeddingComponent embeddingComponent() {
            if (!isEmbeddingAvailable()) {
                return emptyActivityEmbeddingProxy();
            }
            ClassLoader classLoader = EmbeddingCompat.class.getClassLoader();
            if (classLoader != null) {
                ConsumerAdapter consumerAdapter = new ConsumerAdapter(classLoader);
                WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
                x.e(windowExtensions, "getWindowExtensions(...)");
                ActivityEmbeddingComponent activityEmbeddingComponent = new SafeActivityEmbeddingComponentProvider(classLoader, consumerAdapter, windowExtensions).getActivityEmbeddingComponent();
                if (activityEmbeddingComponent != null) {
                    return activityEmbeddingComponent;
                }
            }
            return emptyActivityEmbeddingProxy();
        }

        public final boolean isEmbeddingAvailable() {
            try {
                ClassLoader classLoader = EmbeddingCompat.class.getClassLoader();
                if (classLoader != null) {
                    ConsumerAdapter consumerAdapter = new ConsumerAdapter(classLoader);
                    WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
                    x.e(windowExtensions, "getWindowExtensions(...)");
                    if (new SafeActivityEmbeddingComponentProvider(classLoader, consumerAdapter, windowExtensions).getActivityEmbeddingComponent() != null) {
                        return true;
                    }
                }
                return false;
            } catch (NoClassDefFoundError unused) {
                Log.d(EmbeddingCompat.TAG, "Embedding extension version not found");
                return false;
            } catch (UnsupportedOperationException unused2) {
                Log.d(EmbeddingCompat.TAG, "Stub Extension");
                return false;
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    private final void invalidateVisibleActivityStacks(ActivityEmbeddingComponent activityEmbeddingComponent) {
        activityEmbeddingComponent.invalidateTopVisibleSplitAttributes();
    }
}
