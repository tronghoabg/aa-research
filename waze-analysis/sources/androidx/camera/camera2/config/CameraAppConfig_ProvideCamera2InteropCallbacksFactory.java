package androidx.camera.camera2.config;

import androidx.camera.camera2.impl.CameraInteropStateCallbackRepository;
import c.b.c;
import com.waze.web.r;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraAppConfig_ProvideCamera2InteropCallbacksFactory implements c<CameraInteropStateCallbackRepository> {
    private final CameraAppConfig module;

    private CameraAppConfig_ProvideCamera2InteropCallbacksFactory(CameraAppConfig cameraAppConfig) {
        this.module = cameraAppConfig;
    }

    public static CameraAppConfig_ProvideCamera2InteropCallbacksFactory create(CameraAppConfig cameraAppConfig) {
        return new CameraAppConfig_ProvideCamera2InteropCallbacksFactory(cameraAppConfig);
    }

    public static CameraInteropStateCallbackRepository provideCamera2InteropCallbacks(CameraAppConfig cameraAppConfig) {
        CameraInteropStateCallbackRepository cameraInteropStateCallbackRepositoryProvideCamera2InteropCallbacks = cameraAppConfig.provideCamera2InteropCallbacks();
        r.g(cameraInteropStateCallbackRepositoryProvideCamera2InteropCallbacks);
        return cameraInteropStateCallbackRepositoryProvideCamera2InteropCallbacks;
    }

    @Override // g.a.a, f.a.a
    public CameraInteropStateCallbackRepository get() {
        return provideCamera2InteropCallbacks(this.module);
    }
}
