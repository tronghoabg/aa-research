package androidx.camera.camera2.config;

import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraConfig {
    private final String cameraId;

    private CameraConfig(String str) {
        x.f(str, "cameraId");
        this.cameraId = str;
    }

    /* renamed from: getCameraId-Dz_R5H8, reason: not valid java name */
    public final String m231getCameraIdDz_R5H8() {
        return this.cameraId;
    }

    public /* synthetic */ CameraConfig(String str, o oVar) {
        this(str);
    }

    public final CameraConfig provideCameraConfig() {
        return this;
    }
}
