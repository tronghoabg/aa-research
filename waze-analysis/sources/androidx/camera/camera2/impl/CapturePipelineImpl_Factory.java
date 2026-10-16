package androidx.camera.camera2.impl;

import androidx.camera.camera2.adapter.CaptureConfigAdapter;
import androidx.camera.camera2.compat.workaround.UseTorchAsFlash;
import androidx.camera.camera2.config.UseCaseCameraContext;
import c.b.c;
import c.b.e;
import g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CapturePipelineImpl_Factory implements c<CapturePipelineImpl> {
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<CaptureConfigAdapter> configAdapterProvider;
    private final e<FlashControl> flashControlProvider;
    private final e<ComboRequestListener> requestListenerProvider;
    private final e<UseCaseThreads> threadsProvider;
    private final e<TorchControl> torchControlProvider;
    private final e<UseCaseCameraContext> useCaseCameraContextProvider;
    private final e<UseCaseCameraState> useCaseCameraStateProvider;
    private final e<UseTorchAsFlash> useTorchAsFlashProvider;
    private final e<VideoUsageControl> videoUsageControlProvider;

    private CapturePipelineImpl_Factory(e<CaptureConfigAdapter> eVar, e<FlashControl> eVar2, e<TorchControl> eVar3, e<VideoUsageControl> eVar4, e<UseCaseThreads> eVar5, e<ComboRequestListener> eVar6, e<UseTorchAsFlash> eVar7, e<CameraProperties> eVar8, e<UseCaseCameraState> eVar9, e<UseCaseCameraContext> eVar10) {
        this.configAdapterProvider = eVar;
        this.flashControlProvider = eVar2;
        this.torchControlProvider = eVar3;
        this.videoUsageControlProvider = eVar4;
        this.threadsProvider = eVar5;
        this.requestListenerProvider = eVar6;
        this.useTorchAsFlashProvider = eVar7;
        this.cameraPropertiesProvider = eVar8;
        this.useCaseCameraStateProvider = eVar9;
        this.useCaseCameraContextProvider = eVar10;
    }

    public static CapturePipelineImpl_Factory create(e<CaptureConfigAdapter> eVar, e<FlashControl> eVar2, e<TorchControl> eVar3, e<VideoUsageControl> eVar4, e<UseCaseThreads> eVar5, e<ComboRequestListener> eVar6, e<UseTorchAsFlash> eVar7, e<CameraProperties> eVar8, e<UseCaseCameraState> eVar9, e<UseCaseCameraContext> eVar10) {
        return new CapturePipelineImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10);
    }

    public static CapturePipelineImpl newInstance(CaptureConfigAdapter captureConfigAdapter, FlashControl flashControl, TorchControl torchControl, VideoUsageControl videoUsageControl, UseCaseThreads useCaseThreads, ComboRequestListener comboRequestListener, UseTorchAsFlash useTorchAsFlash, CameraProperties cameraProperties, a<UseCaseCameraState> aVar, UseCaseCameraContext useCaseCameraContext) {
        return new CapturePipelineImpl(captureConfigAdapter, flashControl, torchControl, videoUsageControl, useCaseThreads, comboRequestListener, useTorchAsFlash, cameraProperties, aVar, useCaseCameraContext);
    }

    @Override // g.a.a, f.a.a
    public CapturePipelineImpl get() {
        return newInstance(this.configAdapterProvider.get(), this.flashControlProvider.get(), this.torchControlProvider.get(), this.videoUsageControlProvider.get(), this.threadsProvider.get(), this.requestListenerProvider.get(), this.useTorchAsFlashProvider.get(), this.cameraPropertiesProvider.get(), this.useCaseCameraStateProvider, this.useCaseCameraContextProvider.get());
    }
}
