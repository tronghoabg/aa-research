package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;
import androidx.camera.camera2.pipe.core.Threads;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CameraOpener_Factory implements c.b.c<Camera2CameraOpener> {
    private final c.b.e<CameraManager> cameraManagerProvider;
    private final c.b.e<Threads> threadsProvider;

    private Camera2CameraOpener_Factory(c.b.e<CameraManager> eVar, c.b.e<Threads> eVar2) {
        this.cameraManagerProvider = eVar;
        this.threadsProvider = eVar2;
    }

    public static Camera2CameraOpener_Factory create(c.b.e<CameraManager> eVar, c.b.e<Threads> eVar2) {
        return new Camera2CameraOpener_Factory(eVar, eVar2);
    }

    public static Camera2CameraOpener newInstance(g.a.a<CameraManager> aVar, Threads threads) {
        return new Camera2CameraOpener(aVar, threads);
    }

    @Override // g.a.a, f.a.a
    public Camera2CameraOpener get() {
        return newInstance(this.cameraManagerProvider, this.threadsProvider.get());
    }
}
