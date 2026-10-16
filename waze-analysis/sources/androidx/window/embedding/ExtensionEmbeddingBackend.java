package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.collection.ArraySet;
import androidx.core.util.Consumer;
import androidx.window.WindowProperties;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.BuildConfig;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.PredicateAdapter;
import androidx.window.core.VerificationMode;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.embedding.SplitController;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import h.a.i;
import h.f;
import h.g;
import h.g.a.a;
import h.g.a.l;
import h.g.b.au;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {
    private static final String TAG = "EmbeddingBackend";
    private static volatile ExtensionEmbeddingBackend globalInstance;
    private final Context applicationContext;
    private final EmbeddingCallbackImpl embeddingCallback;
    private EmbeddingInterfaceCompat embeddingExtension;
    private final RuleTracker ruleTracker;
    private final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks;
    private final f splitSupportStatus$delegate;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock globalLock = new ReentrantLock();

    /* compiled from: WazeSource */
    final class Api31Impl {
        public static final Api31Impl INSTANCE = new Api31Impl();

        private Api31Impl() {
        }

        public final SplitController.SplitSupportStatus isSplitPropertyEnabled(Context context) throws PackageManager.NameNotFoundException {
            PackageManager.Property property;
            x.f(context, "context");
            try {
                property = context.getPackageManager().getProperty(WindowProperties.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED, context.getPackageName());
                x.c(property);
            } catch (PackageManager.NameNotFoundException unused) {
                if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                    Log.w(ExtensionEmbeddingBackend.TAG, "android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED must be set and enabled in AndroidManifest.xml to use splits APIs.");
                }
            } catch (Exception e2) {
                if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                    Log.e(ExtensionEmbeddingBackend.TAG, "PackageManager.getProperty is not supported", e2);
                }
            }
            if (property.isBoolean()) {
                return property.getBoolean() ? SplitController.SplitSupportStatus.SPLIT_AVAILABLE : SplitController.SplitSupportStatus.SPLIT_UNAVAILABLE;
            }
            if (BuildConfig.INSTANCE.getVerificationMode() == VerificationMode.LOG) {
                Log.w(ExtensionEmbeddingBackend.TAG, "android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED must have a boolean value");
            }
            return SplitController.SplitSupportStatus.SPLIT_ERROR_PROPERTY_NOT_DECLARED;
        }
    }

    /* compiled from: WazeSource */
    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        private List<SplitInfo> lastInfo = i.h();
        private List<ActivityStack> lastActivityStacks = i.h();

        public EmbeddingCallbackImpl() {
        }

        public final List<ActivityStack> getLastActivityStacks() {
            return this.lastActivityStacks;
        }

        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onActivityStackChanged(List<ActivityStack> list) {
            x.f(list, "activityStacks");
            this.lastActivityStacks = list;
        }

        @Override // androidx.window.embedding.EmbeddingInterfaceCompat.EmbeddingCallbackInterface
        public void onSplitInfoChanged(List<SplitInfo> list) {
            x.f(list, "splitInfo");
            this.lastInfo = list;
            Iterator<SplitListenerWrapper> it = ExtensionEmbeddingBackend.this.getSplitChangeCallbacks().iterator();
            x.e(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(list);
            }
        }

        public final void setLastActivityStacks(List<ActivityStack> list) {
            x.f(list, "<set-?>");
            this.lastActivityStacks = list;
        }

        public final void setLastInfo(List<SplitInfo> list) {
            x.f(list, "<set-?>");
            this.lastInfo = list;
        }
    }

    /* compiled from: WazeSource */
    final class RuleTracker {
        private final ArraySet<EmbeddingRule> splitRules = new ArraySet<>(0, 1, null);
        private final HashMap<String, EmbeddingRule> tagRuleMap = new HashMap<>();

        public static /* synthetic */ void addOrUpdateRule$default(RuleTracker ruleTracker, EmbeddingRule embeddingRule, boolean z, int i2, Object obj) {
            ruleTracker.addOrUpdateRule(embeddingRule, z & ((i2 & 2) == 0));
        }

        public final void addOrUpdateRule(EmbeddingRule embeddingRule, boolean z) {
            x.f(embeddingRule, "rule");
            if (this.splitRules.contains(embeddingRule)) {
                return;
            }
            String tag = embeddingRule.getTag();
            if (tag == null) {
                this.splitRules.add(embeddingRule);
                return;
            }
            if (!this.tagRuleMap.containsKey(tag)) {
                this.tagRuleMap.put(tag, embeddingRule);
                this.splitRules.add(embeddingRule);
            } else {
                if (z) {
                    throw new IllegalArgumentException("Duplicated tag: " + tag + ". Tag must be unique among all registered rules");
                }
                au.b(this.splitRules).remove(this.tagRuleMap.get(tag));
                this.tagRuleMap.put(tag, embeddingRule);
                this.splitRules.add(embeddingRule);
            }
        }

        public final void clearRules() {
            this.splitRules.clear();
            this.tagRuleMap.clear();
        }

        public final boolean contains(EmbeddingRule embeddingRule) {
            x.f(embeddingRule, "rule");
            return this.splitRules.contains(embeddingRule);
        }

        public final ArraySet<EmbeddingRule> getSplitRules() {
            return this.splitRules;
        }

        public final void removeRule(EmbeddingRule embeddingRule) {
            x.f(embeddingRule, "rule");
            if (this.splitRules.contains(embeddingRule)) {
                this.splitRules.remove(embeddingRule);
                if (embeddingRule.getTag() != null) {
                    this.tagRuleMap.remove(embeddingRule.getTag());
                }
            }
        }

        public final void setRules(Set<? extends EmbeddingRule> set) {
            x.f(set, "rules");
            clearRules();
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                addOrUpdateRule((EmbeddingRule) it.next(), true);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class SplitListenerWrapper {
        private final Activity activity;
        private final Consumer<List<SplitInfo>> callback;
        private final Executor executor;
        private List<SplitInfo> lastValue;

        public SplitListenerWrapper(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer) {
            x.f(activity, "activity");
            x.f(executor, "executor");
            x.f(consumer, "callback");
            this.activity = activity;
            this.executor = executor;
            this.callback = consumer;
        }

        public final void accept(List<SplitInfo> list) {
            x.f(list, "splitInfoList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SplitInfo) obj).contains(this.activity)) {
                    arrayList.add(obj);
                }
            }
            final ArrayList arrayList2 = arrayList;
            if (x.n(arrayList2, this.lastValue)) {
                return;
            }
            this.lastValue = arrayList2;
            this.executor.execute(new Runnable() { // from class: androidx.window.embedding.ExtensionEmbeddingBackend$SplitListenerWrapper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.callback.accept(arrayList2);
                }
            });
        }

        public final Consumer<List<SplitInfo>> getCallback() {
            return this.callback;
        }
    }

    public ExtensionEmbeddingBackend(Context context, EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        x.f(context, "applicationContext");
        this.applicationContext = context;
        this.embeddingExtension = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl();
        this.embeddingCallback = embeddingCallbackImpl;
        this.splitChangeCallbacks = new CopyOnWriteArrayList<>();
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.ruleTracker = new RuleTracker();
        this.splitSupportStatus$delegate = g.a(new a() { // from class: androidx.window.embedding.ExtensionEmbeddingBackend$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ExtensionEmbeddingBackend.splitSupportStatus_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final boolean areExtensionsAvailable() {
        return this.embeddingExtension != null;
    }

    private final ActivityStack getActivityStackFromSplitInfoList(Activity activity) {
        for (SplitInfo splitInfo : this.embeddingCallback.getLastInfo()) {
            if (splitInfo.contains(activity)) {
                if (splitInfo.getPrimaryActivityStack().contains(activity)) {
                    return splitInfo.getPrimaryActivityStack();
                }
                if (splitInfo.getSecondaryActivityStack().contains(activity)) {
                    return splitInfo.getSecondaryActivityStack();
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    static final SplitController.SplitSupportStatus splitSupportStatus_delegate$lambda$0(ExtensionEmbeddingBackend extensionEmbeddingBackend) {
        return !extensionEmbeddingBackend.areExtensionsAvailable() ? SplitController.SplitSupportStatus.SPLIT_UNAVAILABLE : Build.VERSION.SDK_INT >= 31 ? Api31Impl.INSTANCE.isSplitPropertyEnabled(extensionEmbeddingBackend.applicationContext) : SplitController.SplitSupportStatus.SPLIT_AVAILABLE;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void addEmbeddedActivityWindowInfoCallbackForActivity(Activity activity, Consumer<EmbeddedActivityWindowInfo> consumer) {
        x.f(activity, "activity");
        x.f(consumer, "callback");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.addEmbeddedActivityWindowInfoCallbackForActivity(activity, consumer);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void addOverlayInfoCallback(String str, Executor executor, Consumer<OverlayInfo> consumer) {
        x.f(str, "overlayTag");
        x.f(executor, "executor");
        x.f(consumer, "overlayInfoCallback");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.addOverlayInfoCallback(str, executor, consumer);
        } else {
            consumer.accept(new OverlayInfo(str, null, null));
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void addRule(EmbeddingRule embeddingRule) {
        x.f(embeddingRule, "rule");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (!this.ruleTracker.contains(embeddingRule)) {
                RuleTracker.addOrUpdateRule$default(this.ruleTracker, embeddingRule, false, 2, null);
                EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
                if (embeddingInterfaceCompat != null) {
                    embeddingInterfaceCompat.setRules(getRules());
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void addSplitListenerForActivity(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer) {
        x.f(activity, "activity");
        x.f(executor, "executor");
        x.f(consumer, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (this.embeddingExtension == null) {
                Log.v(TAG, "Extension not loaded, skipping callback registration.");
                consumer.accept(i.h());
            } else {
                SplitListenerWrapper splitListenerWrapper = new SplitListenerWrapper(activity, executor, consumer);
                this.splitChangeCallbacks.add(splitListenerWrapper);
                splitListenerWrapper.accept(this.embeddingCallback.getLastInfo());
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void clearOverlayAttributesCalculator() {
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.clearOverlayAttributesCalculator();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void clearSplitAttributesCalculator() {
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.clearSplitAttributesCalculator();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void finishActivityStacks(Set<ActivityStack> set) {
        x.f(set, "activityStacks");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.finishActivityStacks(set);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public ActivityStack getActivityStack(Activity activity) {
        Object next;
        x.f(activity, "activity");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.embeddingCallback.getLastActivityStacks().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ActivityStack) next).contains(activity)) {
                    break;
                }
            }
            ActivityStack activityStackFromSplitInfoList = (ActivityStack) next;
            if (activityStackFromSplitInfoList == null) {
                activityStackFromSplitInfoList = getActivityStackFromSplitInfoList(activity);
            }
            return activityStackFromSplitInfoList;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public Set<EmbeddingRule> getRules() {
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            return i.au(this.ruleTracker.getSplitRules());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public SplitController.SplitSupportStatus getSplitSupportStatus() {
        return (SplitController.SplitSupportStatus) this.splitSupportStatus$delegate.getValue();
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void invalidateVisibleActivityStacks() {
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.invalidateVisibleActivityStacks();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public boolean isActivityEmbedded(Activity activity) {
        x.f(activity, "activity");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            return embeddingInterfaceCompat.isActivityEmbedded(activity);
        }
        return false;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public boolean pinTopActivityStack(int i2, SplitPinRule splitPinRule) {
        x.f(splitPinRule, "splitPinRule");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            return embeddingInterfaceCompat.pinTopActivityStack(i2, splitPinRule);
        }
        return false;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void removeEmbeddedActivityWindowInfoCallbackForActivity(Consumer<EmbeddedActivityWindowInfo> consumer) {
        x.f(consumer, "callback");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.removeEmbeddedActivityWindowInfoCallbackForActivity(consumer);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void removeOverlayInfoCallback(Consumer<OverlayInfo> consumer) {
        x.f(consumer, "overlayInfoCallback");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.removeOverlayInfoCallback(consumer);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void removeRule(EmbeddingRule embeddingRule) {
        x.f(embeddingRule, "rule");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (this.ruleTracker.contains(embeddingRule)) {
                this.ruleTracker.removeRule(embeddingRule);
                EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
                if (embeddingInterfaceCompat != null) {
                    embeddingInterfaceCompat.setRules(getRules());
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        r4.splitChangeCallbacks.remove(r2);
     */
    @Override // androidx.window.embedding.EmbeddingBackend
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void removeSplitListenerForActivity(androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "consumer"
            h.g.b.x.f(r5, r0)
            java.util.concurrent.locks.ReentrantLock r0 = androidx.window.embedding.ExtensionEmbeddingBackend.globalLock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            java.util.concurrent.CopyOnWriteArrayList<androidx.window.embedding.ExtensionEmbeddingBackend$SplitListenerWrapper> r1 = r4.splitChangeCallbacks     // Catch: java.lang.Throwable -> L36
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "iterator(...)"
            h.g.b.x.e(r1, r2)     // Catch: java.lang.Throwable -> L36
        L17:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L36
            androidx.window.embedding.ExtensionEmbeddingBackend$SplitListenerWrapper r2 = (androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper) r2     // Catch: java.lang.Throwable -> L36
            androidx.core.util.Consumer r3 = r2.getCallback()     // Catch: java.lang.Throwable -> L36
            boolean r3 = h.g.b.x.n(r3, r5)     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L17
            java.util.concurrent.CopyOnWriteArrayList<androidx.window.embedding.ExtensionEmbeddingBackend$SplitListenerWrapper> r4 = r4.splitChangeCallbacks     // Catch: java.lang.Throwable -> L36
            r4.remove(r2)     // Catch: java.lang.Throwable -> L36
        L32:
            r0.unlock()
            return
        L36:
            r4 = move-exception
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.ExtensionEmbeddingBackend.removeSplitListenerForActivity(androidx.core.util.Consumer):void");
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setEmbeddingConfiguration(EmbeddingConfiguration embeddingConfiguration) {
        x.f(embeddingConfiguration, "embeddingConfig");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.setEmbeddingConfiguration(embeddingConfiguration);
        }
    }

    public final void setEmbeddingExtension(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public Bundle setLaunchingActivityStack(Bundle bundle, ActivityStack activityStack) {
        Bundle launchingActivityStack;
        x.f(bundle, "options");
        x.f(activityStack, "activityStack");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        return (embeddingInterfaceCompat == null || (launchingActivityStack = embeddingInterfaceCompat.setLaunchingActivityStack(bundle, activityStack)) == null) ? bundle : launchingActivityStack;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setOverlayAttributesCalculator(l<? super OverlayAttributesCalculatorParams, OverlayAttributes> lVar) {
        x.f(lVar, "calculator");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.setOverlayAttributesCalculator(lVar);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public Bundle setOverlayCreateParams(Bundle bundle, OverlayCreateParams overlayCreateParams) {
        Bundle overlayCreateParams2;
        x.f(bundle, "options");
        x.f(overlayCreateParams, "overlayCreateParams");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        return (embeddingInterfaceCompat == null || (overlayCreateParams2 = embeddingInterfaceCompat.setOverlayCreateParams(bundle, overlayCreateParams)) == null) ? bundle : overlayCreateParams2;
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setRules(Set<? extends EmbeddingRule> set) {
        x.f(set, "rules");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            this.ruleTracker.setRules(set);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setRules(getRules());
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void setSplitAttributesCalculator(l<? super SplitAttributesCalculatorParams, SplitAttributes> lVar) {
        x.f(lVar, "calculator");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitAttributesCalculator(lVar);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void unpinTopActivityStack(int i2) {
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.unpinTopActivityStack(i2);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void updateOverlayAttributes(String str, OverlayAttributes overlayAttributes) {
        x.f(str, "overlayTag");
        x.f(overlayAttributes, "overlayAttributes");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.updateOverlayAttributes(str, overlayAttributes);
        }
    }

    @Override // androidx.window.embedding.EmbeddingBackend
    public void updateSplitAttributes(SplitInfo splitInfo, SplitAttributes splitAttributes) {
        x.f(splitInfo, "splitInfo");
        x.f(splitAttributes, "splitAttributes");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.updateSplitAttributes(splitInfo, splitAttributes);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension(Context context) {
            EmbeddingCompat embeddingCompat;
            int extensionVersion = WindowSdkExtensions.Companion.getInstance().getExtensionVersion();
            EmbeddingCompat embeddingCompat2 = null;
            try {
                if (isExtensionVersionSupported(Integer.valueOf(extensionVersion)) && EmbeddingCompat.Companion.isEmbeddingAvailable()) {
                    ClassLoader classLoader = EmbeddingBackend.class.getClassLoader();
                    if (classLoader != null) {
                        ActivityEmbeddingComponent activityEmbeddingComponentEmbeddingComponent = EmbeddingCompat.Companion.embeddingComponent();
                        EmbeddingAdapter embeddingAdapter = new EmbeddingAdapter(new PredicateAdapter(classLoader));
                        embeddingCompat = new EmbeddingCompat(activityEmbeddingComponentEmbeddingComponent, embeddingAdapter, new ConsumerAdapter(classLoader), context, extensionVersion >= 8 ? new OverlayControllerImpl(activityEmbeddingComponentEmbeddingComponent, embeddingAdapter) : null, extensionVersion >= 6 ? new ActivityWindowInfoCallbackController(activityEmbeddingComponentEmbeddingComponent) : null);
                    } else {
                        embeddingCompat = null;
                    }
                    embeddingCompat2 = embeddingCompat;
                }
            } catch (Throwable th) {
                th.toString();
                Log.d(ExtensionEmbeddingBackend.TAG, "Failed to load embedding extension: ".concat(th.toString()));
            }
            if (embeddingCompat2 == null) {
                Log.d(ExtensionEmbeddingBackend.TAG, "No supported embedding extension found");
            }
            return embeddingCompat2;
        }

        public final EmbeddingBackend getInstance(Context context) {
            x.f(context, "context");
            if (ExtensionEmbeddingBackend.globalInstance == null) {
                ReentrantLock reentrantLock = ExtensionEmbeddingBackend.globalLock;
                reentrantLock.lock();
                try {
                    if (ExtensionEmbeddingBackend.globalInstance == null) {
                        Context applicationContext = context.getApplicationContext();
                        Companion companion = ExtensionEmbeddingBackend.Companion;
                        x.c(applicationContext);
                        ExtensionEmbeddingBackend.globalInstance = new ExtensionEmbeddingBackend(applicationContext, companion.initAndVerifyEmbeddingExtension(applicationContext));
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            ExtensionEmbeddingBackend extensionEmbeddingBackend = ExtensionEmbeddingBackend.globalInstance;
            x.c(extensionEmbeddingBackend);
            return extensionEmbeddingBackend;
        }

        public final boolean isExtensionVersionSupported(Integer num) {
            return num != null && num.intValue() > 0;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
