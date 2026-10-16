package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.core.util.Consumer;
import androidx.window.WindowSdkExtensions;
import androidx.window.layout.WindowEngagementInfo;
import androidx.window.layout.WindowInfoTrackerImpl;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.EngagementModeBackend;
import androidx.window.layout.adapter.WindowBackend;
import androidx.window.layout.util.CombineLatestConsumerAdapter;
import androidx.window.layout.util.DeduplicateConsumer;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WindowInfoTrackerImpl implements WindowInfoTracker {
    private final Map<Consumer<WindowEngagementInfo>, CombineLatestConsumerAdapter<WindowLayoutInfo, WindowEngagementInfo.EngagementMode, WindowEngagementInfo>> consumerToAdapterMap;
    private final EngagementModeBackend engagementModeBackend;
    private final ReentrantLock lock;
    private final WindowBackend windowBackend;
    private final WindowMetricsCalculator windowMetricsCalculator;
    private final WindowSdkExtensions windowSdkExtensions;

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowEngagementInfo$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<ad<? super WindowEngagementInfo>, e<? super ab>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Context context, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$context = context;
        }

        static final ab invokeSuspend$lambda$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Consumer consumer) {
            windowInfoTrackerImpl.unregisterWindowEngagementInfoListener(consumer);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = WindowInfoTrackerImpl.this.new AnonymousClass1(this.$context, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(ad<? super WindowEngagementInfo> adVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final ad adVar = (ad) this.L$0;
                final Consumer<WindowEngagementInfo> consumer = new Consumer() { // from class: androidx.window.layout.WindowInfoTrackerImpl$windowEngagementInfo$1$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        adVar.i((WindowEngagementInfo) obj2);
                    }
                };
                WindowInfoTrackerImpl.this.registerWindowEngagementInfoListener(this.$context, new Executor() { // from class: androidx.window.layout.WindowInfoTrackerImpl$windowEngagementInfo$1$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, consumer);
                final WindowInfoTrackerImpl windowInfoTrackerImpl = WindowInfoTrackerImpl.this;
                this.label = 1;
                if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.window.layout.WindowInfoTrackerImpl$windowEngagementInfo$1$$ExternalSyntheticLambda2
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return WindowInfoTrackerImpl.AnonymousClass1.invokeSuspend$lambda$1(windowInfoTrackerImpl, consumer);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1, reason: invalid class name and case insensitive filesystem */
    final class C04791 extends g implements p<ad<? super WindowLayoutInfo>, e<? super ab>, Object> {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04791(Context context, e<? super C04791> eVar) {
            super(2, eVar);
            this.$context = context;
        }

        static final ab invokeSuspend$lambda$1(WindowInfoTrackerImpl windowInfoTrackerImpl, Consumer consumer) {
            windowInfoTrackerImpl.windowBackend.unregisterLayoutChangeCallback(consumer);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C04791 c04791 = WindowInfoTrackerImpl.this.new C04791(this.$context, eVar);
            c04791.L$0 = obj;
            return c04791;
        }

        @Override // h.g.a.p
        public final Object invoke(ad<? super WindowLayoutInfo> adVar, e<? super ab> eVar) {
            return ((C04791) create(adVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final ad adVar = (ad) this.L$0;
                final Consumer<WindowLayoutInfo> consumer = new Consumer() { // from class: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        adVar.i((WindowLayoutInfo) obj2);
                    }
                };
                WindowInfoTrackerImpl windowInfoTrackerImpl = WindowInfoTrackerImpl.this;
                windowInfoTrackerImpl.windowBackend.registerLayoutChangeCallback(this.$context, new Executor() { // from class: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, consumer);
                final WindowInfoTrackerImpl windowInfoTrackerImpl2 = WindowInfoTrackerImpl.this;
                this.label = 1;
                if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda2
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return WindowInfoTrackerImpl.C04791.invokeSuspend$lambda$1(windowInfoTrackerImpl2, consumer);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    public WindowInfoTrackerImpl(WindowMetricsCalculator windowMetricsCalculator, WindowBackend windowBackend, WindowSdkExtensions windowSdkExtensions, EngagementModeBackend engagementModeBackend) {
        x.f(windowMetricsCalculator, "windowMetricsCalculator");
        x.f(windowBackend, "windowBackend");
        x.f(windowSdkExtensions, "windowSdkExtensions");
        x.f(engagementModeBackend, "engagementModeBackend");
        this.windowMetricsCalculator = windowMetricsCalculator;
        this.windowBackend = windowBackend;
        this.windowSdkExtensions = windowSdkExtensions;
        this.engagementModeBackend = engagementModeBackend;
        this.lock = new ReentrantLock();
        this.consumerToAdapterMap = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowEngagementInfo combineEngagementInfo(WindowLayoutInfo windowLayoutInfo, WindowEngagementInfo.EngagementMode engagementMode) {
        Set<WindowLayoutInfo.EngagementMode> engagementModes = windowLayoutInfo.getEngagementModes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (engagementModes.contains(WindowLayoutInfo.EngagementMode.VISUALS_ON)) {
            linkedHashSet.add(WindowEngagementInfo.EngagementMode.VISUALS_ON);
        }
        if (engagementModes.contains(WindowLayoutInfo.EngagementMode.AUDIO_ON)) {
            linkedHashSet.add(WindowEngagementInfo.EngagementMode.AUDIO_ON);
        }
        linkedHashSet.add(engagementMode);
        return new WindowEngagementInfo(linkedHashSet);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public WindowLayoutInfo getCurrentWindowLayoutInfo(Context context) {
        x.f(context, "context");
        this.windowSdkExtensions.requireExtensionVersion$window(9);
        return this.windowBackend.getCurrentWindowLayoutInfo(context);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public List<SupportedPosture> getSupportedPostures() {
        this.windowSdkExtensions.requireExtensionVersion$window(6);
        return this.windowBackend.getSupportedPostures();
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public void registerWindowEngagementInfoListener(Context context, Executor executor, Consumer<WindowEngagementInfo> consumer) {
        x.f(context, "context");
        x.f(executor, "executor");
        x.f(consumer, "listener");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.consumerToAdapterMap.containsKey(consumer)) {
                return;
            }
            CombineLatestConsumerAdapter<WindowLayoutInfo, WindowEngagementInfo.EngagementMode, WindowEngagementInfo> combineLatestConsumerAdapter = new CombineLatestConsumerAdapter<>(new WindowInfoTrackerImpl$registerWindowEngagementInfoListener$adapter$1$1(this), new DeduplicateConsumer(consumer));
            this.consumerToAdapterMap.put(consumer, combineLatestConsumerAdapter);
            this.windowBackend.registerLayoutChangeCallback(context, executor, combineLatestConsumerAdapter.getConsumerT());
            reentrantLock.unlock();
            this.engagementModeBackend.addEngagementLayoutChangeCallback(context, executor, combineLatestConsumerAdapter.getConsumerU());
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public void registerWindowLayoutInfoListener(Context context, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        x.f(context, "context");
        x.f(executor, "executor");
        x.f(consumer, "listener");
        this.windowBackend.registerLayoutChangeCallback(context, executor, consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public void unregisterWindowEngagementInfoListener(Consumer<WindowEngagementInfo> consumer) {
        x.f(consumer, "listener");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            CombineLatestConsumerAdapter<WindowLayoutInfo, WindowEngagementInfo.EngagementMode, WindowEngagementInfo> combineLatestConsumerAdapterRemove = this.consumerToAdapterMap.remove(consumer);
            if (combineLatestConsumerAdapterRemove != null) {
                this.windowBackend.unregisterLayoutChangeCallback(combineLatestConsumerAdapterRemove.getConsumerT());
                this.engagementModeBackend.removeEngagementLayoutChangeCallback(combineLatestConsumerAdapterRemove.getConsumerU());
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public void unregisterWindowLayoutInfoListener(Consumer<WindowLayoutInfo> consumer) {
        x.f(consumer, "listener");
        this.windowBackend.unregisterLayoutChangeCallback(consumer);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public k<WindowEngagementInfo> windowEngagementInfo(Context context) {
        x.f(context, "context");
        k kVarN = ai.n(new AnonymousClass1(context, null));
        int i2 = av.f51370a;
        return ai.H(kVarN, ac.f51860a);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public k<WindowLayoutInfo> windowLayoutInfo(Context context) {
        x.f(context, "context");
        k kVarN = ai.n(new C04791(context, null));
        int i2 = av.f51370a;
        return ai.H(kVarN, ac.f51860a);
    }

    @Override // androidx.window.layout.WindowInfoTracker
    public k<WindowLayoutInfo> windowLayoutInfo(Activity activity) {
        x.f(activity, "activity");
        return windowLayoutInfo((Context) activity);
    }
}
