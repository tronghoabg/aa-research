package androidx.window.layout.adapter;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import androidx.core.util.Consumer;
import androidx.window.layout.WindowEngagementInfo;
import androidx.window.layout.util.DeduplicateConsumer;
import androidx.window.layout.util.EngagementModeHelper;
import androidx.window.layout.util.RunOnExecutorConsumer;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class EngagementModeBackendApi0 implements EngagementModeBackend {
    private final Map<Consumer<WindowEngagementInfo.EngagementMode>, Context> callbackToContext;
    private final Map<Context, ConfigChangeCallback> contextRegistrations;
    private final Map<Consumer<WindowEngagementInfo.EngagementMode>, DeduplicateConsumer<WindowEngagementInfo.EngagementMode>> engagementChangeCallbacks;
    private final EngagementModeHelper engagementModeHelper;
    private final Consumer<Boolean> inputDeviceListener;
    private final InputDeviceTracker inputDeviceTracker;
    private final ReentrantLock lock;

    /* compiled from: WazeSource */
    final class ConfigChangeCallback implements ComponentCallbacks2 {
        public ConfigChangeCallback() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            x.f(configuration, "newConfig");
            EngagementModeBackendApi0.this.updateAllCallbacks();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i2) {
        }
    }

    public EngagementModeBackendApi0(EngagementModeHelper engagementModeHelper, InputDeviceTracker inputDeviceTracker) {
        x.f(engagementModeHelper, "engagementModeHelper");
        x.f(inputDeviceTracker, "inputDeviceTracker");
        this.engagementModeHelper = engagementModeHelper;
        this.inputDeviceTracker = inputDeviceTracker;
        this.lock = new ReentrantLock();
        this.engagementChangeCallbacks = new LinkedHashMap();
        this.callbackToContext = new LinkedHashMap();
        this.contextRegistrations = new LinkedHashMap();
        this.inputDeviceListener = new Consumer() { // from class: androidx.window.layout.adapter.EngagementModeBackendApi0$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                this.f$0.updateAllCallbacks();
            }
        };
    }

    private final WindowEngagementInfo.EngagementMode calculateEngagementMode(Context context) {
        if (Build.VERSION.SDK_INT < 30) {
            return WindowEngagementInfo.EngagementMode.TOUCH;
        }
        return (this.inputDeviceTracker.isMouseAndKeyboardConnected() && this.engagementModeHelper.hasLargeEnoughDisplay(context)) ? WindowEngagementInfo.EngagementMode.PRECISE_POINTER : WindowEngagementInfo.EngagementMode.TOUCH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAllCallbacks() {
        ArrayList<k> arrayList = new ArrayList();
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            for (Map.Entry<Consumer<WindowEngagementInfo.EngagementMode>, DeduplicateConsumer<WindowEngagementInfo.EngagementMode>> entry : this.engagementChangeCallbacks.entrySet()) {
                Consumer<WindowEngagementInfo.EngagementMode> key = entry.getKey();
                DeduplicateConsumer<WindowEngagementInfo.EngagementMode> value = entry.getValue();
                Context context = this.callbackToContext.get(key);
                x.c(context);
                arrayList.add(new k(value, calculateEngagementMode(context)));
            }
            reentrantLock.unlock();
            for (k kVar : arrayList) {
                ((DeduplicateConsumer) kVar.a()).accept((WindowEngagementInfo.EngagementMode) kVar.b());
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // androidx.window.layout.adapter.EngagementModeBackend
    public void addEngagementLayoutChangeCallback(Context context, Executor executor, Consumer<WindowEngagementInfo.EngagementMode> consumer) {
        x.f(context, "context");
        x.f(executor, "executor");
        x.f(consumer, "callback");
        if (Build.VERSION.SDK_INT < 30) {
            consumer.accept(WindowEngagementInfo.EngagementMode.TOUCH);
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.engagementChangeCallbacks.containsKey(consumer)) {
                return;
            }
            boolean zIsEmpty = this.engagementChangeCallbacks.isEmpty();
            DeduplicateConsumer<WindowEngagementInfo.EngagementMode> deduplicateConsumer = new DeduplicateConsumer<>(new RunOnExecutorConsumer(executor, consumer));
            this.engagementChangeCallbacks.put(consumer, deduplicateConsumer);
            this.callbackToContext.put(consumer, context);
            Map<Context, ConfigChangeCallback> map = this.contextRegistrations;
            ConfigChangeCallback configChangeCallback = map.get(context);
            if (configChangeCallback == null) {
                configChangeCallback = new ConfigChangeCallback();
                context.registerComponentCallbacks(configChangeCallback);
                map.put(context, configChangeCallback);
            }
            if (zIsEmpty) {
                this.inputDeviceTracker.registerListener(executor, this.inputDeviceListener);
            }
            deduplicateConsumer.accept(calculateEngagementMode(context));
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.window.layout.adapter.EngagementModeBackend
    public WindowEngagementInfo.EngagementMode engagementMode(Context context) {
        x.f(context, "context");
        return calculateEngagementMode(context);
    }

    public final InputDeviceTracker getInputDeviceTracker$window() {
        return this.inputDeviceTracker;
    }

    @Override // androidx.window.layout.adapter.EngagementModeBackend
    public void removeEngagementLayoutChangeCallback(Consumer<WindowEngagementInfo.EngagementMode> consumer) {
        ConfigChangeCallback configChangeCallbackRemove;
        x.f(consumer, "callback");
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            Context contextRemove = this.callbackToContext.remove(consumer);
            this.engagementChangeCallbacks.remove(consumer);
            if (contextRemove != null && !this.callbackToContext.values().contains(contextRemove) && (configChangeCallbackRemove = this.contextRegistrations.remove(contextRemove)) != null) {
                contextRemove.unregisterComponentCallbacks(configChangeCallbackRemove);
            }
            if (this.engagementChangeCallbacks.isEmpty()) {
                this.inputDeviceTracker.unregisterListener(this.inputDeviceListener);
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
