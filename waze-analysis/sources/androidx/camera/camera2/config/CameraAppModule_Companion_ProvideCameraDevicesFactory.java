package androidx.camera.camera2.config;

import androidx.camera.camera2.pipe.CameraDevices;
import androidx.camera.camera2.pipe.CameraPipe;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraAppModule_Companion_ProvideCameraDevicesFactory implements c<CameraDevices> {
    private final e<CameraPipe> cameraPipeProvider;

    private CameraAppModule_Companion_ProvideCameraDevicesFactory(e<CameraPipe> eVar) {
        this.cameraPipeProvider = eVar;
    }

    public static CameraAppModule_Companion_ProvideCameraDevicesFactory create(e<CameraPipe> eVar) {
        return new CameraAppModule_Companion_ProvideCameraDevicesFactory(eVar);
    }

    public static CameraDevices provideCameraDevices(CameraPipe cameraPipe) {
        CameraDevices cameraDevicesProvideCameraDevices = CameraAppModule.Companion.provideCameraDevices(cameraPipe);
        r.g(cameraDevicesProvideCameraDevices);
        return cameraDevicesProvideCameraDevices;
    }

    @Override // g.a.a, f.a.a
    public CameraDevices get() {
        return provideCameraDevices(this.cameraPipeProvider.get());
    }
}
