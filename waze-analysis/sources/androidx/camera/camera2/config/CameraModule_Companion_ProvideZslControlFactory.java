package androidx.camera.camera2.config;

import androidx.camera.camera2.adapter.ZslControl;
import androidx.camera.camera2.impl.CameraProperties;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraModule_Companion_ProvideZslControlFactory implements c<ZslControl> {
    private final e<CameraProperties> cameraPropertiesProvider;

    private CameraModule_Companion_ProvideZslControlFactory(e<CameraProperties> eVar) {
        this.cameraPropertiesProvider = eVar;
    }

    public static CameraModule_Companion_ProvideZslControlFactory create(e<CameraProperties> eVar) {
        return new CameraModule_Companion_ProvideZslControlFactory(eVar);
    }

    public static ZslControl provideZslControl(CameraProperties cameraProperties) {
        return CameraModule.Companion.provideZslControl(cameraProperties);
    }

    @Override // g.a.a, f.a.a
    public ZslControl get() {
        return provideZslControl(this.cameraPropertiesProvider.get());
    }
}
