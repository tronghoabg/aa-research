package androidx.window.embedding;

import android.app.Activity;
import android.graphics.Rect;
import android.util.ArrayMap;
import androidx.core.util.Consumer;
import androidx.window.WindowSdkExtensions;
import androidx.window.core.ExtensionsUtil$$ExternalSyntheticApiModelOutline0;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.reflection.Consumer2;
import h.g.b.x;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class ActivityWindowInfoCallbackController {
    private Map<Consumer<EmbeddedActivityWindowInfo>, CallbackWrapper> callbacks;
    private final ActivityEmbeddingComponent embeddingExtension;
    private final androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.embedding.EmbeddedActivityWindowInfo> extensionsCallback;
    private final ReentrantLock globalLock;

    /* compiled from: WazeSource */
    public final class CallbackWrapper {
        private final Activity activity;
        private final Consumer<EmbeddedActivityWindowInfo> callback;
        private EmbeddedActivityWindowInfo lastReportedInfo;
        final /* synthetic */ ActivityWindowInfoCallbackController this$0;

        public CallbackWrapper(ActivityWindowInfoCallbackController activityWindowInfoCallbackController, Activity activity, Consumer<EmbeddedActivityWindowInfo> consumer) {
            x.f(activity, "activity");
            x.f(consumer, "callback");
            this.this$0 = activityWindowInfoCallbackController;
            this.activity = activity;
            this.callback = consumer;
        }

        private final boolean shouldReportInfo(EmbeddedActivityWindowInfo embeddedActivityWindowInfo) {
            EmbeddedActivityWindowInfo embeddedActivityWindowInfo2 = this.lastReportedInfo;
            if (embeddedActivityWindowInfo2 == null) {
                return embeddedActivityWindowInfo.isEmbedded();
            }
            if (embeddedActivityWindowInfo2.isEmbedded() != embeddedActivityWindowInfo.isEmbedded()) {
                return true;
            }
            return embeddedActivityWindowInfo.isEmbedded() && !x.n(embeddedActivityWindowInfo2, embeddedActivityWindowInfo);
        }

        public final void accept(androidx.window.extensions.embedding.EmbeddedActivityWindowInfo embeddedActivityWindowInfo) {
            x.f(embeddedActivityWindowInfo, "extensionsActivityWindowInfo");
            Activity activity = embeddedActivityWindowInfo.getActivity();
            x.e(activity, "getActivity(...)");
            if (x.n(this.activity, activity)) {
                EmbeddedActivityWindowInfo embeddedActivityWindowInfoTranslate$window = this.this$0.translate$window(embeddedActivityWindowInfo);
                if (shouldReportInfo(embeddedActivityWindowInfoTranslate$window)) {
                    this.lastReportedInfo = embeddedActivityWindowInfoTranslate$window;
                    this.callback.accept(embeddedActivityWindowInfoTranslate$window);
                }
            }
        }

        public final Consumer<EmbeddedActivityWindowInfo> getCallback() {
            return this.callback;
        }

        public final EmbeddedActivityWindowInfo getLastReportedInfo() {
            return this.lastReportedInfo;
        }

        public final void setLastReportedInfo(EmbeddedActivityWindowInfo embeddedActivityWindowInfo) {
            this.lastReportedInfo = embeddedActivityWindowInfo;
        }
    }

    public ActivityWindowInfoCallbackController(ActivityEmbeddingComponent activityEmbeddingComponent) {
        x.f(activityEmbeddingComponent, "embeddingExtension");
        this.embeddingExtension = activityEmbeddingComponent;
        this.globalLock = new ReentrantLock();
        this.callbacks = new ArrayMap();
        WindowSdkExtensions.Companion.getInstance().requireExtensionVersion$window(6);
        this.extensionsCallback = new Consumer2() { // from class: androidx.window.embedding.ActivityWindowInfoCallbackController$$ExternalSyntheticLambda0
            @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
            public final void accept(Object obj) {
                ActivityWindowInfoCallbackController._init_$lambda$0(this.f$0, ExtensionsUtil$$ExternalSyntheticApiModelOutline0.m13429m(obj));
            }
        };
    }

    static final void _init_$lambda$0(ActivityWindowInfoCallbackController activityWindowInfoCallbackController, androidx.window.extensions.embedding.EmbeddedActivityWindowInfo embeddedActivityWindowInfo) {
        x.f(embeddedActivityWindowInfo, "info");
        ReentrantLock reentrantLock = activityWindowInfoCallbackController.globalLock;
        reentrantLock.lock();
        try {
            Iterator<CallbackWrapper> it = activityWindowInfoCallbackController.callbacks.values().iterator();
            while (it.hasNext()) {
                it.next().accept(embeddedActivityWindowInfo);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static /* synthetic */ void getCallbacks$window$annotations() {
    }

    public final void addCallback(Activity activity, Consumer<EmbeddedActivityWindowInfo> consumer) {
        x.f(activity, "activity");
        x.f(consumer, "callback");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            if (this.callbacks.isEmpty()) {
                this.embeddingExtension.setEmbeddedActivityWindowInfoCallback(new Executor() { // from class: androidx.window.embedding.ActivityWindowInfoCallbackController$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, this.extensionsCallback);
            }
            CallbackWrapper callbackWrapper = new CallbackWrapper(this, activity, consumer);
            this.callbacks.put(consumer, callbackWrapper);
            androidx.window.extensions.embedding.EmbeddedActivityWindowInfo embeddedActivityWindowInfo = this.embeddingExtension.getEmbeddedActivityWindowInfo(activity);
            if (embeddedActivityWindowInfo != null) {
                callbackWrapper.accept(embeddedActivityWindowInfo);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Map<Consumer<EmbeddedActivityWindowInfo>, CallbackWrapper> getCallbacks$window() {
        return this.callbacks;
    }

    public final void removeCallback(Consumer<EmbeddedActivityWindowInfo> consumer) {
        x.f(consumer, "callback");
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            if (this.callbacks.remove(consumer) != null && this.callbacks.isEmpty()) {
                this.embeddingExtension.clearEmbeddedActivityWindowInfoCallback();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setCallbacks$window(Map<Consumer<EmbeddedActivityWindowInfo>, CallbackWrapper> map) {
        x.f(map, "<set-?>");
        this.callbacks = map;
    }

    public EmbeddedActivityWindowInfo translate$window(androidx.window.extensions.embedding.EmbeddedActivityWindowInfo embeddedActivityWindowInfo) {
        x.f(embeddedActivityWindowInfo, "info");
        Rect rect = new Rect(embeddedActivityWindowInfo.getTaskBounds());
        Rect rect2 = new Rect(embeddedActivityWindowInfo.getActivityStackBounds());
        rect2.offset(-rect.left, -rect.top);
        return new EmbeddedActivityWindowInfo(embeddedActivityWindowInfo.isEmbedded(), rect, rect2);
    }
}
