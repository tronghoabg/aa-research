package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.internal.CameraErrorListener;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraStateOpener_Factory implements c.b.c<CameraStateOpener> {
    private final c.b.e<Camera2MetadataProvider> camera2MetadataProvider;
    private final c.b.e<Camera2Quirks> camera2QuirksProvider;
    private final c.b.e<Camera2SystemState> camera2SystemStateProvider;
    private final c.b.e<CameraErrorListener> cameraErrorListenerProvider;
    private final c.b.e<CameraPipe.CameraInteropConfig> cameraInteropConfigProvider;
    private final c.b.e<CameraOpener> cameraOpenerProvider;
    private final c.b.e<Threads> threadsProvider;
    private final c.b.e<TimeSource> timeSourceProvider;

    private CameraStateOpener_Factory(c.b.e<CameraOpener> eVar, c.b.e<Camera2MetadataProvider> eVar2, c.b.e<CameraErrorListener> eVar3, c.b.e<Camera2Quirks> eVar4, c.b.e<Camera2SystemState> eVar5, c.b.e<TimeSource> eVar6, c.b.e<CameraPipe.CameraInteropConfig> eVar7, c.b.e<Threads> eVar8) {
        this.cameraOpenerProvider = eVar;
        this.camera2MetadataProvider = eVar2;
        this.cameraErrorListenerProvider = eVar3;
        this.camera2QuirksProvider = eVar4;
        this.camera2SystemStateProvider = eVar5;
        this.timeSourceProvider = eVar6;
        this.cameraInteropConfigProvider = eVar7;
        this.threadsProvider = eVar8;
    }

    public static CameraStateOpener_Factory create(c.b.e<CameraOpener> eVar, c.b.e<Camera2MetadataProvider> eVar2, c.b.e<CameraErrorListener> eVar3, c.b.e<Camera2Quirks> eVar4, c.b.e<Camera2SystemState> eVar5, c.b.e<TimeSource> eVar6, c.b.e<CameraPipe.CameraInteropConfig> eVar7, c.b.e<Threads> eVar8) {
        return new CameraStateOpener_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8);
    }

    public static CameraStateOpener newInstance(CameraOpener cameraOpener, Camera2MetadataProvider camera2MetadataProvider, CameraErrorListener cameraErrorListener, Camera2Quirks camera2Quirks, Camera2SystemState camera2SystemState, TimeSource timeSource, CameraPipe.CameraInteropConfig cameraInteropConfig, Threads threads) {
        return new CameraStateOpener(cameraOpener, camera2MetadataProvider, cameraErrorListener, camera2Quirks, camera2SystemState, timeSource, cameraInteropConfig, threads);
    }

    @Override // g.a.a, f.a.a
    public CameraStateOpener get() {
        return newInstance(this.cameraOpenerProvider.get(), this.camera2MetadataProvider.get(), this.cameraErrorListenerProvider.get(), this.camera2QuirksProvider.get(), this.camera2SystemStateProvider.get(), this.timeSourceProvider.get(), this.cameraInteropConfigProvider.get(), this.threadsProvider.get());
    }
}
