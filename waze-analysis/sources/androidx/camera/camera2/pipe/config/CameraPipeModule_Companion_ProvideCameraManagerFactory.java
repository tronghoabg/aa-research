package androidx.camera.camera2.pipe.config;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraPipeModule_Companion_ProvideCameraManagerFactory implements c<CameraManager> {
    private final e<Context> cameraPipeContextProvider;

    private CameraPipeModule_Companion_ProvideCameraManagerFactory(e<Context> eVar) {
        this.cameraPipeContextProvider = eVar;
    }

    public static CameraPipeModule_Companion_ProvideCameraManagerFactory create(e<Context> eVar) {
        return new CameraPipeModule_Companion_ProvideCameraManagerFactory(eVar);
    }

    public static CameraManager provideCameraManager(Context context) {
        CameraManager cameraManagerProvideCameraManager = CameraPipeModule.Companion.provideCameraManager(context);
        r.g(cameraManagerProvideCameraManager);
        return cameraManagerProvideCameraManager;
    }

    @Override // g.a.a, f.a.a
    public CameraManager get() {
        return provideCameraManager(this.cameraPipeContextProvider.get());
    }
}
