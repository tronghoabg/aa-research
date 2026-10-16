package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraGraphId;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraGraphConfigModule_ProvideCameraGraphIdFactory implements c<CameraGraphId> {
    private final CameraGraphConfigModule module;

    private CameraGraphConfigModule_ProvideCameraGraphIdFactory(CameraGraphConfigModule cameraGraphConfigModule) {
        this.module = cameraGraphConfigModule;
    }

    public static CameraGraphConfigModule_ProvideCameraGraphIdFactory create(CameraGraphConfigModule cameraGraphConfigModule) {
        return new CameraGraphConfigModule_ProvideCameraGraphIdFactory(cameraGraphConfigModule);
    }

    public static CameraGraphId provideCameraGraphId(CameraGraphConfigModule cameraGraphConfigModule) {
        CameraGraphId cameraGraphIdProvideCameraGraphId = cameraGraphConfigModule.provideCameraGraphId();
        r.g(cameraGraphIdProvideCameraGraphId);
        return cameraGraphIdProvideCameraGraphId;
    }

    @Override // g.a.a, f.a.a
    public CameraGraphId get() {
        return provideCameraGraphId(this.module);
    }
}
