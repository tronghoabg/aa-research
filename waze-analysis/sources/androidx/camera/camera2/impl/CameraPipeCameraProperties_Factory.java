package androidx.camera.camera2.impl;

import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.pipe.CameraMetadata;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeCameraProperties_Factory implements c<CameraPipeCameraProperties> {
    private final e<CameraConfig> cameraConfigProvider;
    private final e<CameraMetadata> cameraMetadataProvider;

    private CameraPipeCameraProperties_Factory(e<CameraConfig> eVar, e<CameraMetadata> eVar2) {
        this.cameraConfigProvider = eVar;
        this.cameraMetadataProvider = eVar2;
    }

    public static CameraPipeCameraProperties_Factory create(e<CameraConfig> eVar, e<CameraMetadata> eVar2) {
        return new CameraPipeCameraProperties_Factory(eVar, eVar2);
    }

    public static CameraPipeCameraProperties newInstance(CameraConfig cameraConfig, CameraMetadata cameraMetadata) {
        return new CameraPipeCameraProperties(cameraConfig, cameraMetadata);
    }

    @Override // g.a.a, f.a.a
    public CameraPipeCameraProperties get() {
        return newInstance(this.cameraConfigProvider.get(), this.cameraMetadataProvider.get());
    }
}
