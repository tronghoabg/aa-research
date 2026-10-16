package androidx.camera.core;

import android.content.Context;
import android.view.OrientationEventListener;
import androidx.camera.core.RotationProvider;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RotationProvider {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "RotationProvider";
    private final boolean ignoreCanDetectForTest;
    private boolean isShutdown;
    private final Map<Listener, ListenerWrapper> listeners;
    private final Object lock;
    private final OrientationEventListener orientationListener;
    private volatile int rotation;

    /* compiled from: WazeSource */
    public interface Listener {
        void onRotationChanged(int i2);
    }

    /* compiled from: WazeSource */
    final class ListenerWrapper {
        private final AtomicBoolean enabled;
        private final Executor executor;
        private final Listener listener;

        public ListenerWrapper(Listener listener, Executor executor) {
            x.f(listener, "listener");
            x.f(executor, "executor");
            this.listener = listener;
            this.executor = executor;
            this.enabled = new AtomicBoolean(true);
        }

        static final void onRotationChanged$lambda$0(ListenerWrapper listenerWrapper, int i2) {
            if (listenerWrapper.enabled.get()) {
                listenerWrapper.listener.onRotationChanged(i2);
            }
        }

        public final void disable() {
            this.enabled.set(false);
        }

        public final void onRotationChanged(final int i2) {
            if (this.enabled.get()) {
                try {
                    this.executor.execute(new Runnable() { // from class: androidx.camera.core.RotationProvider$ListenerWrapper$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            RotationProvider.ListenerWrapper.onRotationChanged$lambda$0(this.f$0, i2);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    Logger.w(RotationProvider.TAG, "Failed to execute the command. Maybe the executor has been shutdown.");
                }
            }
        }
    }

    public RotationProvider(Context context, boolean z) {
        x.f(context, "appContext");
        this.lock = new Object();
        this.listeners = new LinkedHashMap();
        this.rotation = -1;
        this.ignoreCanDetectForTest = z;
        this.orientationListener = new OrientationEventListener(context) { // from class: androidx.camera.core.RotationProvider.1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int i2) {
                if (i2 == -1) {
                    return;
                }
                RotationProvider rotationProvider = this;
                rotationProvider.updateRotation(rotationProvider.orientationToSurfaceRotation(i2));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int orientationToSurfaceRotation(int i2) {
        if (this.rotation == -1) {
            if (i2 >= 0 && i2 < 45) {
                return 0;
            }
            if (i2 >= 45 && i2 < 135) {
                return 3;
            }
            if (i2 < 135 || i2 >= 225) {
                return (i2 < 225 || i2 >= 315) ? 0 : 1;
            }
            return 2;
        }
        if (i2 >= 0 && i2 < 40) {
            return 0;
        }
        if (i2 >= 320 && i2 < 360) {
            return 0;
        }
        if (i2 >= 50 && i2 < 130) {
            return 3;
        }
        if (i2 >= 140 && i2 < 220) {
            return 2;
        }
        if (i2 < 230 || i2 >= 310) {
            return this.rotation;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateRotation(int i2) {
        List listAo;
        if (this.rotation != i2) {
            this.rotation = i2;
            synchronized (this.lock) {
                listAo = i.ao(this.listeners.values());
            }
            Iterator it = listAo.iterator();
            while (it.hasNext()) {
                ((ListenerWrapper) it.next()).onRotationChanged(i2);
            }
        }
    }

    public final boolean addListener(Executor executor, Listener listener) {
        x.f(executor, "executor");
        x.f(listener, "listener");
        synchronized (this.lock) {
            if (!this.ignoreCanDetectForTest && !this.orientationListener.canDetectOrientation()) {
                return false;
            }
            ListenerWrapper listenerWrapper = new ListenerWrapper(listener, executor);
            this.listeners.put(listener, listenerWrapper);
            if (this.rotation != -1) {
                listenerWrapper.onRotationChanged(this.rotation);
            }
            if (this.listeners.size() == 1) {
                this.orientationListener.enable();
            }
            return true;
        }
    }

    public final boolean isShutdown() {
        return this.isShutdown;
    }

    public final void removeListener(Listener listener) {
        x.f(listener, "listener");
        synchronized (this.lock) {
            ListenerWrapper listenerWrapper = this.listeners.get(listener);
            if (listenerWrapper != null) {
                listenerWrapper.disable();
                this.listeners.remove(listener);
            }
            if (this.listeners.isEmpty()) {
                this.orientationListener.disable();
                this.rotation = -1;
            }
        }
    }

    public final void shutdown() {
        synchronized (this.lock) {
            this.orientationListener.disable();
            this.listeners.clear();
            this.isShutdown = true;
            this.rotation = -1;
        }
    }

    public final void updateOrientationForTesting(int i2) {
        updateRotation(orientationToSurfaceRotation(i2));
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RotationProvider(Context context) {
        this(context, false);
        x.f(context, "appContext");
    }

    public /* synthetic */ RotationProvider(Context context, boolean z, int i2, o oVar) {
        this(context, z & ((i2 & 2) == 0));
    }
}
