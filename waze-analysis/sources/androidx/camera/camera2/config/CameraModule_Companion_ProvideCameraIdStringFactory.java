package androidx.camera.camera2.config;

import c.b.c;
import c.b.e;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraModule_Companion_ProvideCameraIdStringFactory implements c<String> {
    private final e<CameraConfig> configProvider;

    private CameraModule_Companion_ProvideCameraIdStringFactory(e<CameraConfig> eVar) {
        this.configProvider = eVar;
    }

    public static CameraModule_Companion_ProvideCameraIdStringFactory create(e<CameraConfig> eVar) {
        return new CameraModule_Companion_ProvideCameraIdStringFactory(eVar);
    }

    public static String provideCameraIdString(CameraConfig cameraConfig) {
        String strProvideCameraIdString = CameraModule.Companion.provideCameraIdString(cameraConfig);
        r.g(strProvideCameraIdString);
        return strProvideCameraIdString;
    }

    @Override // g.a.a, f.a.a
    public String get() {
        return provideCameraIdString(this.configProvider.get());
    }
}
