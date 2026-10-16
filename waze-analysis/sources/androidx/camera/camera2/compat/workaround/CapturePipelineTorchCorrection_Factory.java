package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseThreads;
import c.b.c;
import c.b.e;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CapturePipelineTorchCorrection_Factory implements c<CapturePipelineTorchCorrection> {
    private final e<CameraProperties> cameraPropertiesProvider;
    private final e<CapturePipelineImpl> capturePipelineImplProvider;
    private final e<UseCaseThreads> threadsProvider;
    private final e<TorchControl> torchControlProvider;

    private CapturePipelineTorchCorrection_Factory(e<CameraProperties> eVar, e<CapturePipelineImpl> eVar2, e<UseCaseThreads> eVar3, e<TorchControl> eVar4) {
        this.cameraPropertiesProvider = eVar;
        this.capturePipelineImplProvider = eVar2;
        this.threadsProvider = eVar3;
        this.torchControlProvider = eVar4;
    }

    public static CapturePipelineTorchCorrection_Factory create(e<CameraProperties> eVar, e<CapturePipelineImpl> eVar2, e<UseCaseThreads> eVar3, e<TorchControl> eVar4) {
        return new CapturePipelineTorchCorrection_Factory(eVar, eVar2, eVar3, eVar4);
    }

    public static CapturePipelineTorchCorrection newInstance(CameraProperties cameraProperties, g.a.a<CapturePipelineImpl> aVar, UseCaseThreads useCaseThreads, TorchControl torchControl) {
        return new CapturePipelineTorchCorrection(cameraProperties, aVar, useCaseThreads, torchControl);
    }

    @Override // g.a.a, f.a.a
    public CapturePipelineTorchCorrection get() {
        return newInstance(this.cameraPropertiesProvider.get(), this.capturePipelineImplProvider, this.threadsProvider.get(), this.torchControlProvider.get());
    }
}
