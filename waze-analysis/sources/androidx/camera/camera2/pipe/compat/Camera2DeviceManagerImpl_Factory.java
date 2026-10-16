package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Permissions;
import androidx.camera.camera2.pipe.core.Threads;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2DeviceManagerImpl_Factory implements c.b.c<Camera2DeviceManagerImpl> {
    private final c.b.e<Camera2DeviceCloser> camera2DeviceCloserProvider;
    private final c.b.e<Camera2ErrorProcessor> camera2ErrorProcessorProvider;
    private final c.b.e<Camera2SystemState> camera2SystemStateProvider;
    private final c.b.e<CameraPipe.Flags> flagsProvider;
    private final c.b.e<Permissions> permissionsProvider;
    private final c.b.e<RetryingCameraStateOpener> retryingCameraStateOpenerProvider;
    private final c.b.e<Threads> threadsProvider;

    private Camera2DeviceManagerImpl_Factory(c.b.e<Permissions> eVar, c.b.e<RetryingCameraStateOpener> eVar2, c.b.e<Camera2DeviceCloser> eVar3, c.b.e<Camera2ErrorProcessor> eVar4, c.b.e<Camera2SystemState> eVar5, c.b.e<CameraPipe.Flags> eVar6, c.b.e<Threads> eVar7) {
        this.permissionsProvider = eVar;
        this.retryingCameraStateOpenerProvider = eVar2;
        this.camera2DeviceCloserProvider = eVar3;
        this.camera2ErrorProcessorProvider = eVar4;
        this.camera2SystemStateProvider = eVar5;
        this.flagsProvider = eVar6;
        this.threadsProvider = eVar7;
    }

    public static Camera2DeviceManagerImpl_Factory create(c.b.e<Permissions> eVar, c.b.e<RetryingCameraStateOpener> eVar2, c.b.e<Camera2DeviceCloser> eVar3, c.b.e<Camera2ErrorProcessor> eVar4, c.b.e<Camera2SystemState> eVar5, c.b.e<CameraPipe.Flags> eVar6, c.b.e<Threads> eVar7) {
        return new Camera2DeviceManagerImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7);
    }

    public static Camera2DeviceManagerImpl newInstance(Permissions permissions, RetryingCameraStateOpener retryingCameraStateOpener, Camera2DeviceCloser camera2DeviceCloser, Camera2ErrorProcessor camera2ErrorProcessor, Camera2SystemState camera2SystemState, CameraPipe.Flags flags, Threads threads) {
        return new Camera2DeviceManagerImpl(permissions, retryingCameraStateOpener, camera2DeviceCloser, camera2ErrorProcessor, camera2SystemState, flags, threads);
    }

    @Override // g.a.a, f.a.a
    public Camera2DeviceManagerImpl get() {
        return newInstance(this.permissionsProvider.get(), this.retryingCameraStateOpenerProvider.get(), this.camera2DeviceCloserProvider.get(), this.camera2ErrorProcessorProvider.get(), this.camera2SystemStateProvider.get(), this.flagsProvider.get(), this.threadsProvider.get());
    }
}
