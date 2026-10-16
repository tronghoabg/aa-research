package androidx.camera.camera2.pipe.config;

import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import c.b.c;
import c.b.e;
import g.a.a;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory implements c<CameraStatusMonitor> {
    private final e<CameraManager> cameraManagerProvider;
    private final e<br> cameraPipeJobProvider;
    private final e<CameraGraph.Config> graphConfigProvider;
    private final e<Threads> threadsProvider;

    private Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory(e<CameraManager> eVar, e<Threads> eVar2, e<CameraGraph.Config> eVar3, e<br> eVar4) {
        this.cameraManagerProvider = eVar;
        this.threadsProvider = eVar2;
        this.graphConfigProvider = eVar3;
        this.cameraPipeJobProvider = eVar4;
    }

    public static Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory create(e<CameraManager> eVar, e<Threads> eVar2, e<CameraGraph.Config> eVar3, e<br> eVar4) {
        return new Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory(eVar, eVar2, eVar3, eVar4);
    }

    public static CameraStatusMonitor provideCameraStatusMonitor(a<CameraManager> aVar, Threads threads, CameraGraph.Config config, br brVar) {
        return Camera2ControllerModule.Companion.provideCameraStatusMonitor(aVar, threads, config, brVar);
    }

    @Override // g.a.a, f.a.a
    public CameraStatusMonitor get() {
        return provideCameraStatusMonitor(this.cameraManagerProvider, this.threadsProvider.get(), this.graphConfigProvider.get(), this.cameraPipeJobProvider.get());
    }
}
