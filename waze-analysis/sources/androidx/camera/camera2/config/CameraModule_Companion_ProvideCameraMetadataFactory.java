package androidx.camera.camera2.config;

import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.CameraPipe;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraModule_Companion_ProvideCameraMetadataFactory implements c<CameraMetadata> {
    private final e<CameraPipe> cameraPipeProvider;
    private final e<CameraConfig> configProvider;

    private CameraModule_Companion_ProvideCameraMetadataFactory(e<CameraPipe> eVar, e<CameraConfig> eVar2) {
        this.cameraPipeProvider = eVar;
        this.configProvider = eVar2;
    }

    public static CameraModule_Companion_ProvideCameraMetadataFactory create(e<CameraPipe> eVar, e<CameraConfig> eVar2) {
        return new CameraModule_Companion_ProvideCameraMetadataFactory(eVar, eVar2);
    }

    public static CameraMetadata provideCameraMetadata(CameraPipe cameraPipe, CameraConfig cameraConfig) {
        return CameraModule.Companion.provideCameraMetadata(cameraPipe, cameraConfig);
    }

    @Override // g.a.a, f.a.a
    public CameraMetadata get() {
        return provideCameraMetadata(this.cameraPipeProvider.get(), this.configProvider.get());
    }
}
