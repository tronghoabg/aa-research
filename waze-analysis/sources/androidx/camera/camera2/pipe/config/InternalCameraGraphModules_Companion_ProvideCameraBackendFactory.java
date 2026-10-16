package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraBackends;
import androidx.camera.camera2.pipe.CameraContext;
import androidx.camera.camera2.pipe.CameraGraph;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class InternalCameraGraphModules_Companion_ProvideCameraBackendFactory implements c<CameraBackend> {
    private final e<CameraBackends> cameraBackendsProvider;
    private final e<CameraContext> cameraContextProvider;
    private final e<CameraGraph.Config> graphConfigProvider;

    private InternalCameraGraphModules_Companion_ProvideCameraBackendFactory(e<CameraBackends> eVar, e<CameraGraph.Config> eVar2, e<CameraContext> eVar3) {
        this.cameraBackendsProvider = eVar;
        this.graphConfigProvider = eVar2;
        this.cameraContextProvider = eVar3;
    }

    public static InternalCameraGraphModules_Companion_ProvideCameraBackendFactory create(e<CameraBackends> eVar, e<CameraGraph.Config> eVar2, e<CameraContext> eVar3) {
        return new InternalCameraGraphModules_Companion_ProvideCameraBackendFactory(eVar, eVar2, eVar3);
    }

    public static CameraBackend provideCameraBackend(CameraBackends cameraBackends, CameraGraph.Config config, CameraContext cameraContext) {
        CameraBackend cameraBackendProvideCameraBackend = InternalCameraGraphModules.Companion.provideCameraBackend(cameraBackends, config, cameraContext);
        r.g(cameraBackendProvideCameraBackend);
        return cameraBackendProvideCameraBackend;
    }

    @Override // g.a.a, f.a.a
    public CameraBackend get() {
        return provideCameraBackend(this.cameraBackendsProvider.get(), this.graphConfigProvider.get(), this.cameraContextProvider.get());
    }
}
