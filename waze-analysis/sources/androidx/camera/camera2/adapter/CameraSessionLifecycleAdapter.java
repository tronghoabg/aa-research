package androidx.camera.camera2.adapter;

import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.core.impl.CameraSessionLifecycleCallback;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class CameraSessionLifecycleAdapter {
    private final Object lock = new Object();
    private final Map<CameraSessionLifecycleCallback, Executor> sessionLifecycleCallbacks = new LinkedHashMap();

    static final ab dispatchSessionLifecycle$lambda$1(CameraSessionLifecycleCallback cameraSessionLifecycleCallback) {
        x.f(cameraSessionLifecycleCallback, "$this$dispatchToAll");
        cameraSessionLifecycleCallback.onSessionStarted();
        return ab.f48028a;
    }

    static final ab dispatchSessionLifecycle$lambda$2(CameraSessionLifecycleCallback cameraSessionLifecycleCallback) {
        x.f(cameraSessionLifecycleCallback, "$this$dispatchToAll");
        cameraSessionLifecycleCallback.onSessionStopped();
        return ab.f48028a;
    }

    static final ab dispatchSessionLifecycle$lambda$3(CameraSessionLifecycleCallback cameraSessionLifecycleCallback) {
        x.f(cameraSessionLifecycleCallback, "$this$dispatchToAll");
        cameraSessionLifecycleCallback.onSessionError();
        return ab.f48028a;
    }

    private final void dispatchToAll(Map<CameraSessionLifecycleCallback, ? extends Executor> map, final l<? super CameraSessionLifecycleCallback, ab> lVar) {
        for (Map.Entry<CameraSessionLifecycleCallback, ? extends Executor> entry : map.entrySet()) {
            final CameraSessionLifecycleCallback key = entry.getKey();
            entry.getValue().execute(new Runnable() { // from class: androidx.camera.camera2.adapter.CameraSessionLifecycleAdapter$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    lVar.invoke(key);
                }
            });
        }
    }

    public final void addSessionLifecycleCallback$camera_camera2(Executor executor, CameraSessionLifecycleCallback cameraSessionLifecycleCallback) {
        x.f(executor, "executor");
        x.f(cameraSessionLifecycleCallback, "callback");
        synchronized (this.lock) {
            this.sessionLifecycleCallbacks.put(cameraSessionLifecycleCallback, executor);
        }
    }

    public final void dispatchSessionLifecycle$camera_camera2(GraphState graphState) {
        Map<CameraSessionLifecycleCallback, ? extends Executor> mapR;
        x.f(graphState, "graphState");
        synchronized (this.lock) {
            mapR = this.sessionLifecycleCallbacks.isEmpty() ? null : r.r(this.sessionLifecycleCallbacks);
        }
        if (mapR == null) {
            return;
        }
        if (x.n(graphState, GraphState.GraphStateStarted.INSTANCE)) {
            dispatchToAll(mapR, new l() { // from class: androidx.camera.camera2.adapter.CameraSessionLifecycleAdapter$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CameraSessionLifecycleAdapter.dispatchSessionLifecycle$lambda$1((CameraSessionLifecycleCallback) obj);
                }
            });
        } else if (x.n(graphState, GraphState.GraphStateStopped.INSTANCE)) {
            dispatchToAll(mapR, new l() { // from class: androidx.camera.camera2.adapter.CameraSessionLifecycleAdapter$$ExternalSyntheticLambda1
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CameraSessionLifecycleAdapter.dispatchSessionLifecycle$lambda$2((CameraSessionLifecycleCallback) obj);
                }
            });
        } else if (graphState instanceof GraphState.GraphStateError) {
            dispatchToAll(mapR, new l() { // from class: androidx.camera.camera2.adapter.CameraSessionLifecycleAdapter$$ExternalSyntheticLambda2
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return CameraSessionLifecycleAdapter.dispatchSessionLifecycle$lambda$3((CameraSessionLifecycleCallback) obj);
                }
            });
        }
    }

    public final void removeSessionLifecycleCallback$camera_camera2(CameraSessionLifecycleCallback cameraSessionLifecycleCallback) {
        x.f(cameraSessionLifecycleCallback, "callback");
        synchronized (this.lock) {
            this.sessionLifecycleCallbacks.remove(cameraSessionLifecycleCallback);
        }
    }
}
