package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;
import androidx.camera.camera2.pipe.internal.CriticalCameraErrorListener;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ErrorProcessor implements CameraErrorListener {
    private final g.a.a<CriticalCameraErrorListener> criticalCameraErrorListener;
    private final Object lock;
    private final Map<CameraId, VirtualCameraState> virtualCameraStateMap;

    public Camera2ErrorProcessor(g.a.a<CriticalCameraErrorListener> aVar) {
        x.f(aVar, "criticalCameraErrorListener");
        this.criticalCameraErrorListener = aVar;
        this.lock = new Object();
        this.virtualCameraStateMap = new LinkedHashMap();
    }

    @Override // androidx.camera.camera2.pipe.internal.CameraErrorListener
    /* renamed from: onCameraError-3M5Xam4, reason: not valid java name */
    public void mo1038onCameraError3M5Xam4(String str, int i2, boolean z) {
        VirtualCameraState virtualCameraState;
        x.f(str, "cameraId");
        synchronized (this.lock) {
            virtualCameraState = this.virtualCameraStateMap.get(CameraId.m546boximpl(str));
        }
        if (virtualCameraState == null) {
            return;
        }
        virtualCameraState.getGraphListener().onGraphError(new GraphState.GraphStateError(i2, z, null));
        if (CameraError.m474equalsimpl0(i2, CameraError.Companion.m482getERROR_CAMERA_DEVICEv7Vf74A())) {
            this.criticalCameraErrorListener.get().mo1020onCriticalCameraErrorEfqyGwQ(str);
        }
    }

    /* renamed from: setActiveVirtualCamera-0r8Bogc$camera_camera2_pipe, reason: not valid java name */
    public final void m1039setActiveVirtualCamera0r8Bogc$camera_camera2_pipe(String str, VirtualCameraState virtualCameraState) {
        x.f(str, "cameraId");
        x.f(virtualCameraState, "virtualCameraState");
        synchronized (this.lock) {
            this.virtualCameraStateMap.put(CameraId.m546boximpl(str), virtualCameraState);
        }
    }
}
