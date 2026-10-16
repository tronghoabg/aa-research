package androidx.camera.camera2.impl;

import androidx.camera.camera2.config.CameraConfig;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.pipe.CameraMetadata;
import h.g.b.x;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class CameraPipeCameraProperties implements CameraProperties {
    private final CameraConfig cameraConfig;
    private final CameraMetadata cameraMetadata;
    private final CameraMetadata metadata;

    public CameraPipeCameraProperties(CameraConfig cameraConfig, CameraMetadata cameraMetadata) {
        x.f(cameraConfig, "cameraConfig");
        this.cameraConfig = cameraConfig;
        this.cameraMetadata = cameraMetadata;
        x.c(cameraMetadata);
        this.metadata = cameraMetadata;
    }

    @Override // androidx.camera.camera2.impl.CameraProperties
    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public String mo248getCameraIdDz_R5H8() {
        return this.cameraConfig.m231getCameraIdDz_R5H8();
    }

    @Override // androidx.camera.camera2.impl.CameraProperties
    public CameraMetadata getMetadata() {
        return this.metadata;
    }
}
