package androidx.window.embedding;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.ArrayMap;
import android.view.WindowMetrics;
import androidx.core.util.Consumer;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.ExtensionsUtil$$ExternalSyntheticApiModelOutline0;
import androidx.window.extensions.core.util.function.Function;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.ActivityStackAttributes;
import androidx.window.extensions.embedding.ActivityStackAttributesCalculatorParams;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.WindowMetricsCalculator;
import androidx.window.layout.adapter.extensions.ExtensionsWindowLayoutInfoAdapter;
import androidx.window.layout.util.DensityCompatHelper;
import androidx.window.reflection.Consumer2;
import h.a.i;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class OverlayControllerImpl {
    private final EmbeddingAdapter adapter;
    private final ActivityEmbeddingComponent embeddingExtension;
    private final ReentrantLock globalLock;
    private l<? super OverlayAttributesCalculatorParams, OverlayAttributes> overlayAttributesCalculator;
    private final ArrayMap<Consumer<OverlayInfo>, androidx.window.extensions.core.util.function.Consumer<List<androidx.window.extensions.embedding.ActivityStack>>> overlayInfoToActivityStackCallbackMap;
    private final ArrayMap<String, androidx.window.extensions.embedding.ActivityStack> overlayTagToContainerMap;
    private final ArrayMap<String, OverlayAttributes> overlayTagToCurrentAttributesMap;
    private final Map<String, OverlayAttributes> overlayTagToDefaultAttributesMap;

    public OverlayControllerImpl(ActivityEmbeddingComponent activityEmbeddingComponent, EmbeddingAdapter embeddingAdapter) {
        x.f(activityEmbeddingComponent, "embeddingExtension");
        x.f(embeddingAdapter, "adapter");
        this.embeddingExtension = activityEmbeddingComponent;
        this.adapter = embeddingAdapter;
        this.globalLock = new ReentrantLock();
        this.overlayTagToDefaultAttributesMap = new ArrayMap();
        this.overlayTagToCurrentAttributesMap = new ArrayMap<>();
        this.overlayTagToContainerMap = new ArrayMap<>();
        this.overlayInfoToActivityStackCallbackMap = new ArrayMap<>();
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(8);
        activityEmbeddingComponent.setActivityStackAttributesCalculator(new Function() { // from class: androidx.window.embedding.OverlayControllerImpl$$ExternalSyntheticLambda0
            @Override // androidx.window.extensions.core.util.function.Function
            public final Object apply(Object obj) {
                return OverlayControllerImpl._init_$lambda$0(this.f$0, EmbeddingCompat$$ExternalSyntheticApiModelOutline0.m13452m(obj));
            }
        });
        activityEmbeddingComponent.registerActivityStackCallback(new Executor() { // from class: androidx.window.embedding.OverlayControllerImpl$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new OverlayControllerActivityStackConsumer(new l() { // from class: androidx.window.embedding.OverlayControllerImpl$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return OverlayControllerImpl._init_$lambda$1(this.f$0, (List) obj);
            }
        }));
    }

    static final ActivityStackAttributes _init_$lambda$0(OverlayControllerImpl overlayControllerImpl, ActivityStackAttributesCalculatorParams activityStackAttributesCalculatorParams) {
        ReentrantLock reentrantLock = overlayControllerImpl.globalLock;
        reentrantLock.lock();
        try {
            androidx.window.extensions.embedding.ParentContainerInfo parentContainerInfo = activityStackAttributesCalculatorParams.getParentContainerInfo();
            x.e(parentContainerInfo, "getParentContainerInfo(...)");
            DensityCompatHelper companion = DensityCompatHelper.Companion.getInstance();
            Configuration configuration = parentContainerInfo.getConfiguration();
            x.e(configuration, "getConfiguration(...)");
            WindowMetrics windowMetrics = parentContainerInfo.getWindowMetrics();
            x.e(windowMetrics, "getWindowMetrics(...)");
            float fDensity = companion.density(configuration, windowMetrics);
            WindowMetricsCalculator.Companion companion2 = WindowMetricsCalculator.Companion;
            WindowMetrics windowMetrics2 = parentContainerInfo.getWindowMetrics();
            x.e(windowMetrics2, "getWindowMetrics(...)");
            androidx.window.layout.WindowMetrics windowMetricsTranslateWindowMetrics$window = companion2.translateWindowMetrics$window(windowMetrics2, fDensity);
            String activityStackTag = activityStackAttributesCalculatorParams.getActivityStackTag();
            x.e(activityStackTag, "getActivityStackTag(...)");
            ActivityEmbeddingOptionsImpl activityEmbeddingOptionsImpl = ActivityEmbeddingOptionsImpl.INSTANCE;
            Bundle launchOptions = activityStackAttributesCalculatorParams.getLaunchOptions();
            x.e(launchOptions, "getLaunchOptions(...)");
            OverlayAttributes overlayAttributes$window = activityEmbeddingOptionsImpl.getOverlayAttributes$window(launchOptions);
            WindowMetricsCalculator.Companion companion3 = WindowMetricsCalculator.Companion;
            WindowMetrics windowMetrics3 = activityStackAttributesCalculatorParams.getParentContainerInfo().getWindowMetrics();
            x.e(windowMetrics3, "getWindowMetrics(...)");
            androidx.window.layout.WindowMetrics windowMetricsTranslateWindowMetrics$window2 = companion3.translateWindowMetrics$window(windowMetrics3, fDensity);
            Configuration configuration2 = activityStackAttributesCalculatorParams.getParentContainerInfo().getConfiguration();
            x.e(configuration2, "getConfiguration(...)");
            ExtensionsWindowLayoutInfoAdapter extensionsWindowLayoutInfoAdapter = ExtensionsWindowLayoutInfoAdapter.INSTANCE;
            WindowLayoutInfo windowLayoutInfo = parentContainerInfo.getWindowLayoutInfo();
            x.e(windowLayoutInfo, "getWindowLayoutInfo(...)");
            OverlayAttributes overlayAttributesCalculateOverlayAttributes$window = overlayControllerImpl.calculateOverlayAttributes$window(activityStackTag, overlayAttributes$window, windowMetricsTranslateWindowMetrics$window2, configuration2, extensionsWindowLayoutInfoAdapter.translate$window(windowMetricsTranslateWindowMetrics$window, windowLayoutInfo));
            ActivityEmbeddingOptionsImpl activityEmbeddingOptionsImpl2 = ActivityEmbeddingOptionsImpl.INSTANCE;
            Bundle launchOptions2 = activityStackAttributesCalculatorParams.getLaunchOptions();
            x.e(launchOptions2, "getLaunchOptions(...)");
            activityEmbeddingOptionsImpl2.putActivityStackAlignment$window(launchOptions2, overlayAttributesCalculateOverlayAttributes$window.getBounds());
            return overlayControllerImpl.toActivityStackAttributes(overlayAttributesCalculateOverlayAttributes$window, parentContainerInfo);
        } finally {
            reentrantLock.unlock();
        }
    }

    static final ab _init_$lambda$1(OverlayControllerImpl overlayControllerImpl, List list) {
        x.f(list, "activityStacks");
        ReentrantLock reentrantLock = overlayControllerImpl.globalLock;
        reentrantLock.lock();
        try {
            Set<String> setKeySet = overlayControllerImpl.overlayTagToContainerMap.keySet();
            x.e(setKeySet, "<get-keys>(...)");
            overlayControllerImpl.overlayTagToContainerMap.clear();
            ArrayMap<String, androidx.window.extensions.embedding.ActivityStack> arrayMap = overlayControllerImpl.overlayTagToContainerMap;
            List<androidx.window.extensions.embedding.ActivityStack> overlayContainers = overlayControllerImpl.getOverlayContainers(list);
            ArrayList arrayList = new ArrayList(i.q(overlayContainers, 10));
            Iterator<T> it = overlayContainers.iterator();
            while (it.hasNext()) {
                androidx.window.extensions.embedding.ActivityStack activityStackM = ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m(it.next());
                String tag = activityStackM.getTag();
                x.c(tag);
                arrayList.add(new k(tag, activityStackM));
            }
            r.u(arrayMap, arrayList);
            overlayControllerImpl.cleanUpDismissedOverlayContainerRecords(setKeySet);
            reentrantLock.unlock();
            return ab.f48028a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOverlayInfoCallback$lambda$0$0(String str, OverlayControllerImpl overlayControllerImpl, Consumer consumer, List list) {
        x.f(list, "activityStacks");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (x.n(ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m(obj).getTag(), str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() > 1) {
            throw new IllegalStateException("There must be at most one overlay ActivityStack with ".concat(String.valueOf(str)));
        }
        consumer.accept(arrayList2.isEmpty() ? new OverlayInfo(str, null, null) : overlayControllerImpl.toOverlayInfo(ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m(i.P(arrayList2))));
    }

    private final void cleanUpDismissedOverlayContainerRecords(Set<String> set) {
        if (set.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Set<String> setKeySet = this.overlayTagToContainerMap.keySet();
        x.e(setKeySet, "<get-keys>(...)");
        for (String str : set) {
            if (!setKeySet.contains(str) && this.embeddingExtension.getActivityStackToken(str) == null) {
                arrayList.add(str);
            }
        }
        Iterator it = arrayList.iterator();
        x.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            x.e(next, "next(...)");
            String str2 = (String) next;
            this.overlayTagToDefaultAttributesMap.remove(str2);
            this.overlayTagToCurrentAttributesMap.remove(str2);
        }
    }

    private final List<androidx.window.extensions.embedding.ActivityStack> getOverlayContainers(List<? extends androidx.window.extensions.embedding.ActivityStack> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m(obj).getTag() != null) {
                arrayList.add(obj);
            }
        }
        return i.ao(arrayList);
    }

    private final ActivityStackAttributes toActivityStackAttributes(OverlayAttributes overlayAttributes, androidx.window.extensions.embedding.ParentContainerInfo parentContainerInfo) {
        ActivityStackAttributes activityStackAttributesBuild = new ActivityStackAttributes.Builder().setRelativeBounds(EmbeddingBounds.Companion.translateEmbeddingBounds$window(overlayAttributes.getBounds(), this.adapter.translate$window(parentContainerInfo)).toRect()).setWindowAttributes(this.adapter.translateWindowAttributes$window()).build();
        x.e(activityStackAttributesBuild, "build(...)");
        return activityStackAttributesBuild;
    }

    private final OverlayInfo toOverlayInfo(androidx.window.extensions.embedding.ActivityStack activityStack) {
        String tag = activityStack.getTag();
        x.c(tag);
        String tag2 = activityStack.getTag();
        x.c(tag2);
        return new OverlayInfo(tag, this.overlayTagToCurrentAttributesMap.get(tag2), this.adapter.translate$window(activityStack));
    }

    public void addOverlayInfoCallback(final String str, Executor executor, final Consumer<OverlayInfo> consumer) {
        x.f(str, "overlayTag");
        x.f(executor, "executor");
        x.f(consumer, "overlayInfoCallback");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            Consumer2 consumer2 = new Consumer2() { // from class: androidx.window.embedding.OverlayControllerImpl$$ExternalSyntheticLambda3
                @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
                public final void accept(Object obj) {
                    OverlayControllerImpl.addOverlayInfoCallback$lambda$0$0(str, this, consumer, (List) obj);
                }
            };
            this.overlayInfoToActivityStackCallbackMap.put(consumer, consumer2);
            this.embeddingExtension.registerActivityStackCallback(executor, consumer2);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final OverlayAttributes calculateOverlayAttributes$window(String str, OverlayAttributes overlayAttributes, androidx.window.layout.WindowMetrics windowMetrics, Configuration configuration, androidx.window.layout.WindowLayoutInfo windowLayoutInfo) {
        OverlayAttributes overlayAttributes2;
        String str2;
        x.f(str, "tag");
        x.f(windowMetrics, "windowMetrics");
        x.f(configuration, "configuration");
        x.f(windowLayoutInfo, "windowLayoutInfo");
        OverlayAttributes updatedOverlayAttributes$window = getUpdatedOverlayAttributes$window(str);
        if (updatedOverlayAttributes$window != null) {
            overlayAttributes2 = updatedOverlayAttributes$window;
        } else {
            if (overlayAttributes == null) {
                throw new IllegalArgumentException("Can't retrieve overlay attributes from launch options");
            }
            overlayAttributes2 = overlayAttributes;
        }
        l<OverlayAttributesCalculatorParams, OverlayAttributes> overlayAttributesCalculator$window = getOverlayAttributesCalculator$window();
        if (overlayAttributesCalculator$window != null) {
            str2 = str;
            OverlayAttributes overlayAttributesInvoke = overlayAttributesCalculator$window.invoke(new OverlayAttributesCalculatorParams(windowMetrics, configuration, windowLayoutInfo, str2, overlayAttributes2));
            if (overlayAttributesInvoke != null) {
                overlayAttributes2 = overlayAttributesInvoke;
            }
        } else {
            str2 = str;
        }
        this.overlayTagToCurrentAttributesMap.put(str2, overlayAttributes2);
        return overlayAttributes2;
    }

    public final l<OverlayAttributesCalculatorParams, OverlayAttributes> getOverlayAttributesCalculator$window() {
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            return this.overlayAttributesCalculator;
        } finally {
            reentrantLock.unlock();
        }
    }

    public OverlayAttributes getUpdatedOverlayAttributes$window(String str) {
        x.f(str, "overlayTag");
        return this.overlayTagToDefaultAttributesMap.get(str);
    }

    public void removeOverlayInfoCallback(Consumer<OverlayInfo> consumer) {
        x.f(consumer, "overlayInfoCallback");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            androidx.window.extensions.core.util.function.Consumer<List<androidx.window.extensions.embedding.ActivityStack>> consumerRemove = this.overlayInfoToActivityStackCallbackMap.remove(consumer);
            if (consumerRemove != null) {
                this.embeddingExtension.unregisterActivityStackCallback(consumerRemove);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setOverlayAttributesCalculator$window(l<? super OverlayAttributesCalculatorParams, OverlayAttributes> lVar) {
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            this.overlayAttributesCalculator = lVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void updateOverlayAttributes$window(String str, OverlayAttributes overlayAttributes) {
        ActivityStack.Token activityStackToken;
        x.f(str, "overlayTag");
        x.f(overlayAttributes, "overlayAttributes");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            androidx.window.extensions.embedding.ActivityStack activityStackM = ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m((Object) this.overlayTagToContainerMap.get(str));
            if ((activityStackM != null && (activityStackToken = activityStackM.getActivityStackToken()) != null) || (activityStackToken = this.embeddingExtension.getActivityStackToken(str)) != null) {
                ActivityEmbeddingComponent activityEmbeddingComponent = this.embeddingExtension;
                androidx.window.extensions.embedding.ParentContainerInfo parentContainerInfo = activityEmbeddingComponent.getParentContainerInfo(activityStackToken);
                x.c(parentContainerInfo);
                activityEmbeddingComponent.updateActivityStackAttributes(activityStackToken, toActivityStackAttributes(overlayAttributes, parentContainerInfo));
                this.overlayTagToDefaultAttributesMap.put(str, overlayAttributes);
                this.overlayTagToCurrentAttributesMap.put(str, overlayAttributes);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
