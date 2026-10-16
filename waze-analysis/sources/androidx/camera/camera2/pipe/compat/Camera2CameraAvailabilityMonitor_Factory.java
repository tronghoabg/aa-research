package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.core.Threads;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraAvailabilityMonitor_Factory implements c.b.c<Camera2CameraAvailabilityMonitor> {
    private final c.b.e<CameraManager> cameraManagerProvider;
    private final c.b.e<br> cameraPipeJobProvider;
    private final c.b.e<Threads> threadsProvider;

    private Camera2CameraAvailabilityMonitor_Factory(c.b.e<CameraManager> eVar, c.b.e<Threads> eVar2, c.b.e<br> eVar3) {
        this.cameraManagerProvider = eVar;
        this.threadsProvider = eVar2;
        this.cameraPipeJobProvider = eVar3;
    }

    public static Camera2CameraAvailabilityMonitor_Factory create(c.b.e<CameraManager> eVar, c.b.e<Threads> eVar2, c.b.e<br> eVar3) {
        return new Camera2CameraAvailabilityMonitor_Factory(eVar, eVar2, eVar3);
    }

    public static Camera2CameraAvailabilityMonitor newInstance(g.a.a<CameraManager> aVar, Threads threads, br brVar) {
        return new Camera2CameraAvailabilityMonitor(aVar, threads, brVar);
    }

    @Override // g.a.a, f.a.a
    public Camera2CameraAvailabilityMonitor get() {
        return newInstance(this.cameraManagerProvider, this.threadsProvider.get(), this.cameraPipeJobProvider.get());
    }
}
