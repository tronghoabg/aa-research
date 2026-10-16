package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Threads;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2SystemState_Factory implements c.b.c<Camera2SystemState> {
    private final c.b.e<CameraPipe.CameraInteropConfig> cameraInteropConfigProvider;
    private final c.b.e<Threads> threadsProvider;

    private Camera2SystemState_Factory(c.b.e<CameraPipe.CameraInteropConfig> eVar, c.b.e<Threads> eVar2) {
        this.cameraInteropConfigProvider = eVar;
        this.threadsProvider = eVar2;
    }

    public static Camera2SystemState_Factory create(c.b.e<CameraPipe.CameraInteropConfig> eVar, c.b.e<Threads> eVar2) {
        return new Camera2SystemState_Factory(eVar, eVar2);
    }

    public static Camera2SystemState newInstance(CameraPipe.CameraInteropConfig cameraInteropConfig, Threads threads) {
        return new Camera2SystemState(cameraInteropConfig, threads);
    }

    @Override // g.a.a, f.a.a
    public Camera2SystemState get() {
        return newInstance(this.cameraInteropConfigProvider.get(), this.threadsProvider.get());
    }
}
