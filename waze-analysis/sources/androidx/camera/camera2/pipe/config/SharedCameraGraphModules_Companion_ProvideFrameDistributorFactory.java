package androidx.camera.camera2.pipe.config;

import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.core.SystemClockOffsets;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory implements c<FrameDistributor> {
    private final e<CameraMetadata> cameraMetadataProvider;
    private final e<FrameCaptureQueue> frameCaptureQueueProvider;
    private final e<StreamGraphImpl> streamGraphImplProvider;
    private final e<SystemClockOffsets> systemClockOffsetsProvider;

    private SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory(e<StreamGraphImpl> eVar, e<FrameCaptureQueue> eVar2, e<CameraMetadata> eVar3, e<SystemClockOffsets> eVar4) {
        this.streamGraphImplProvider = eVar;
        this.frameCaptureQueueProvider = eVar2;
        this.cameraMetadataProvider = eVar3;
        this.systemClockOffsetsProvider = eVar4;
    }

    public static SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory create(e<StreamGraphImpl> eVar, e<FrameCaptureQueue> eVar2, e<CameraMetadata> eVar3, e<SystemClockOffsets> eVar4) {
        return new SharedCameraGraphModules_Companion_ProvideFrameDistributorFactory(eVar, eVar2, eVar3, eVar4);
    }

    public static FrameDistributor provideFrameDistributor(StreamGraphImpl streamGraphImpl, FrameCaptureQueue frameCaptureQueue, CameraMetadata cameraMetadata, SystemClockOffsets systemClockOffsets) {
        return SharedCameraGraphModules.Companion.provideFrameDistributor(streamGraphImpl, frameCaptureQueue, cameraMetadata, systemClockOffsets);
    }

    @Override // g.a.a, f.a.a
    public FrameDistributor get() {
        return provideFrameDistributor(this.streamGraphImplProvider.get(), this.frameCaptureQueueProvider.get(), this.cameraMetadataProvider.get(), this.systemClockOffsetsProvider.get());
    }
}
