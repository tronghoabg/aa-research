package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.core.Threads;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2DeviceCloserImpl_Factory implements c.b.c<Camera2DeviceCloserImpl> {
    private final c.b.e<Camera2Quirks> camera2QuirksProvider;
    private final c.b.e<RetryingCameraStateOpener> retryingCameraStateOpenerProvider;
    private final c.b.e<Threads> threadsProvider;

    private Camera2DeviceCloserImpl_Factory(c.b.e<Threads> eVar, c.b.e<Camera2Quirks> eVar2, c.b.e<RetryingCameraStateOpener> eVar3) {
        this.threadsProvider = eVar;
        this.camera2QuirksProvider = eVar2;
        this.retryingCameraStateOpenerProvider = eVar3;
    }

    public static Camera2DeviceCloserImpl_Factory create(c.b.e<Threads> eVar, c.b.e<Camera2Quirks> eVar2, c.b.e<RetryingCameraStateOpener> eVar3) {
        return new Camera2DeviceCloserImpl_Factory(eVar, eVar2, eVar3);
    }

    public static Camera2DeviceCloserImpl newInstance(Threads threads, Camera2Quirks camera2Quirks, RetryingCameraStateOpener retryingCameraStateOpener) {
        return new Camera2DeviceCloserImpl(threads, camera2Quirks, retryingCameraStateOpener);
    }

    @Override // g.a.a, f.a.a
    public Camera2DeviceCloserImpl get() {
        return newInstance(this.threadsProvider.get(), this.camera2QuirksProvider.get(), this.retryingCameraStateOpenerProvider.get());
    }
}
