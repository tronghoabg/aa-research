package androidx.camera.camera2.config;

import androidx.camera.camera2.compat.Camera2CameraControlCompat;
import androidx.camera.camera2.impl.ComboRequestListener;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.interop.Camera2CameraControl;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraModule_Companion_ProvideCamera2CameraControlFactory implements c<Camera2CameraControl> {
    private final e<Camera2CameraControlCompat> compatProvider;
    private final e<ComboRequestListener> requestListenerProvider;
    private final e<UseCaseThreads> threadsProvider;

    private CameraModule_Companion_ProvideCamera2CameraControlFactory(e<Camera2CameraControlCompat> eVar, e<UseCaseThreads> eVar2, e<ComboRequestListener> eVar3) {
        this.compatProvider = eVar;
        this.threadsProvider = eVar2;
        this.requestListenerProvider = eVar3;
    }

    public static CameraModule_Companion_ProvideCamera2CameraControlFactory create(e<Camera2CameraControlCompat> eVar, e<UseCaseThreads> eVar2, e<ComboRequestListener> eVar3) {
        return new CameraModule_Companion_ProvideCamera2CameraControlFactory(eVar, eVar2, eVar3);
    }

    public static Camera2CameraControl provideCamera2CameraControl(Camera2CameraControlCompat camera2CameraControlCompat, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener) {
        return CameraModule.Companion.provideCamera2CameraControl(camera2CameraControlCompat, useCaseThreads, comboRequestListener);
    }

    @Override // g.a.a, f.a.a
    public Camera2CameraControl get() {
        return provideCamera2CameraControl(this.compatProvider.get(), this.threadsProvider.get(), this.requestListenerProvider.get());
    }
}
