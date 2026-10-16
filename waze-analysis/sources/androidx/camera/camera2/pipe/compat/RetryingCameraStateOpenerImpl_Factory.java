package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RetryingCameraStateOpenerImpl_Factory implements c.b.c<RetryingCameraStateOpenerImpl> {
    private final c.b.e<AudioRestrictionController> audioRestrictionControllerProvider;
    private final c.b.e<CameraAvailabilityMonitor> cameraAvailabilityMonitorProvider;
    private final c.b.e<CameraErrorListener> cameraErrorListenerProvider;
    private final c.b.e<CameraPipe.CameraInteropConfig> cameraInteropConfigProvider;
    private final c.b.e<CameraStateOpener> cameraStateOpenerProvider;
    private final c.b.e<DevicePolicyManagerWrapper> devicePolicyManagerProvider;
    private final c.b.e<Threads> threadsProvider;
    private final c.b.e<TimeSource> timeSourceProvider;

    private RetryingCameraStateOpenerImpl_Factory(c.b.e<CameraStateOpener> eVar, c.b.e<CameraErrorListener> eVar2, c.b.e<CameraAvailabilityMonitor> eVar3, c.b.e<TimeSource> eVar4, c.b.e<DevicePolicyManagerWrapper> eVar5, c.b.e<AudioRestrictionController> eVar6, c.b.e<CameraPipe.CameraInteropConfig> eVar7, c.b.e<Threads> eVar8) {
        this.cameraStateOpenerProvider = eVar;
        this.cameraErrorListenerProvider = eVar2;
        this.cameraAvailabilityMonitorProvider = eVar3;
        this.timeSourceProvider = eVar4;
        this.devicePolicyManagerProvider = eVar5;
        this.audioRestrictionControllerProvider = eVar6;
        this.cameraInteropConfigProvider = eVar7;
        this.threadsProvider = eVar8;
    }

    public static RetryingCameraStateOpenerImpl_Factory create(c.b.e<CameraStateOpener> eVar, c.b.e<CameraErrorListener> eVar2, c.b.e<CameraAvailabilityMonitor> eVar3, c.b.e<TimeSource> eVar4, c.b.e<DevicePolicyManagerWrapper> eVar5, c.b.e<AudioRestrictionController> eVar6, c.b.e<CameraPipe.CameraInteropConfig> eVar7, c.b.e<Threads> eVar8) {
        return new RetryingCameraStateOpenerImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
    }

    public static RetryingCameraStateOpenerImpl newInstance(CameraStateOpener cameraStateOpener, CameraErrorListener cameraErrorListener, CameraAvailabilityMonitor cameraAvailabilityMonitor, TimeSource timeSource, DevicePolicyManagerWrapper devicePolicyManagerWrapper, AudioRestrictionController audioRestrictionController, CameraPipe.CameraInteropConfig cameraInteropConfig, Threads threads) {
        return new RetryingCameraStateOpenerImpl(cameraStateOpener, cameraErrorListener, cameraAvailabilityMonitor, timeSource, devicePolicyManagerWrapper, audioRestrictionController, cameraInteropConfig, threads);
    }

    @Override // g.a.a, f.a.a
    public RetryingCameraStateOpenerImpl get() {
        return newInstance(this.cameraStateOpenerProvider.get(), this.cameraErrorListenerProvider.get(), this.cameraAvailabilityMonitorProvider.get(), this.timeSourceProvider.get(), this.devicePolicyManagerProvider.get(), this.audioRestrictionControllerProvider.get(), this.cameraInteropConfigProvider.get(), this.threadsProvider.get());
    }
}
