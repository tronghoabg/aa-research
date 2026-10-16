package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraBackend;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraMetadata;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory implements c<CameraMetadata> {
    private final e<CameraBackend> cameraBackendProvider;
    private final e<CameraGraph.Config> graphConfigProvider;

    private InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory(e<CameraGraph.Config> eVar, e<CameraBackend> eVar2) {
        this.graphConfigProvider = eVar;
        this.cameraBackendProvider = eVar2;
    }

    public static InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory create(e<CameraGraph.Config> eVar, e<CameraBackend> eVar2) {
        return new InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory(eVar, eVar2);
    }

    public static CameraMetadata provideCameraMetadata(CameraGraph.Config config, CameraBackend cameraBackend) {
        return InternalCameraGraphModules.Companion.provideCameraMetadata(config, cameraBackend);
    }

    @Override // g.a.a, f.a.a
    public CameraMetadata get() {
        return provideCameraMetadata(this.graphConfigProvider.get(), this.cameraBackendProvider.get());
    }
}
