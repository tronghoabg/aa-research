package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor;
import androidx.camera.camera2.pipe.config.CameraPipeJob;
import androidx.camera.camera2.pipe.core.Threads;
import h.g.b.x;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraAvailabilityMonitor implements CameraAvailabilityMonitor {
    private final k<CameraId> availableCameraFlow;
    private final g.a.a<CameraManager> cameraManager;
    private final br cameraPipeJob;
    private final Threads threads;

    public Camera2CameraAvailabilityMonitor(g.a.a<CameraManager> aVar, Threads threads, @CameraPipeJob br brVar) {
        x.f(aVar, "cameraManager");
        x.f(threads, "threads");
        x.f(brVar, "cameraPipeJob");
        this.cameraManager = aVar;
        this.threads = threads;
        this.cameraPipeJob = brVar;
        this.availableCameraFlow = ai.n(new Camera2CameraAvailabilityMonitor$availableCameraFlow$1(this, null));
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor
    /* renamed from: startMonitoring-0r8Bogc, reason: not valid java name */
    public Object mo1006startMonitoring0r8Bogc(String str, h.c.e<? super CameraAvailabilityMonitor.Session> eVar) {
        return new Camera2CameraAvailabilityMonitor$startMonitoring$2(this, str);
    }
}
