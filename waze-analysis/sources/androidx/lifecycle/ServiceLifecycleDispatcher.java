package androidx.lifecycle;

import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ServiceLifecycleDispatcher {
    private final Handler handler;
    private DispatchRunnable lastDispatchRunnable;
    private final LifecycleRegistry registry;

    /* compiled from: WazeSource */
    public final class DispatchRunnable implements Runnable {
        private final Lifecycle.Event event;
        private final LifecycleRegistry registry;
        private boolean wasExecuted;

        public DispatchRunnable(LifecycleRegistry lifecycleRegistry, Lifecycle.Event event) {
            x.f(lifecycleRegistry, "registry");
            x.f(event, NotificationCompat.CATEGORY_EVENT);
            this.registry = lifecycleRegistry;
            this.event = event;
        }

        public final Lifecycle.Event getEvent() {
            return this.event;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.wasExecuted) {
                return;
            }
            this.registry.handleLifecycleEvent(this.event);
            this.wasExecuted = true;
        }
    }

    public ServiceLifecycleDispatcher(LifecycleOwner lifecycleOwner) {
        x.f(lifecycleOwner, "provider");
        this.registry = new LifecycleRegistry(lifecycleOwner);
        this.handler = new Handler(Looper.getMainLooper());
    }

    private final void postDispatchRunnable(Lifecycle.Event event) {
        DispatchRunnable dispatchRunnable = this.lastDispatchRunnable;
        if (dispatchRunnable != null) {
            dispatchRunnable.run();
        }
        DispatchRunnable dispatchRunnable2 = new DispatchRunnable(this.registry, event);
        this.lastDispatchRunnable = dispatchRunnable2;
        this.handler.postAtFrontOfQueue(dispatchRunnable2);
    }

    public Lifecycle getLifecycle() {
        return this.registry;
    }

    public void onServicePreSuperOnBind() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }

    public void onServicePreSuperOnCreate() {
        postDispatchRunnable(Lifecycle.Event.ON_CREATE);
    }

    public void onServicePreSuperOnDestroy() {
        postDispatchRunnable(Lifecycle.Event.ON_STOP);
        postDispatchRunnable(Lifecycle.Event.ON_DESTROY);
    }

    public void onServicePreSuperOnStart() {
        postDispatchRunnable(Lifecycle.Event.ON_START);
    }
}
