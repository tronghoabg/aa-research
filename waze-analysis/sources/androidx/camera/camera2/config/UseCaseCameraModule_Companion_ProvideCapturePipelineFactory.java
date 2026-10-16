package androidx.camera.camera2.config;

import androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection;
import androidx.camera.camera2.impl.CapturePipeline;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import c.b.c;
import c.b.e;
import com.waze.web.r;
import g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraModule_Companion_ProvideCapturePipelineFactory implements c<CapturePipeline> {
    private final e<CapturePipelineImpl> capturePipelineImplProvider;
    private final e<CapturePipelineTorchCorrection> capturePipelineTorchCorrectionProvider;

    private UseCaseCameraModule_Companion_ProvideCapturePipelineFactory(e<CapturePipelineImpl> eVar, e<CapturePipelineTorchCorrection> eVar2) {
        this.capturePipelineImplProvider = eVar;
        this.capturePipelineTorchCorrectionProvider = eVar2;
    }

    public static UseCaseCameraModule_Companion_ProvideCapturePipelineFactory create(e<CapturePipelineImpl> eVar, e<CapturePipelineTorchCorrection> eVar2) {
        return new UseCaseCameraModule_Companion_ProvideCapturePipelineFactory(eVar, eVar2);
    }

    public static CapturePipeline provideCapturePipeline(a<CapturePipelineImpl> aVar, a<CapturePipelineTorchCorrection> aVar2) {
        CapturePipeline capturePipelineProvideCapturePipeline = UseCaseCameraModule.Companion.provideCapturePipeline(aVar, aVar2);
        r.g(capturePipelineProvideCapturePipeline);
        return capturePipelineProvideCapturePipeline;
    }

    @Override // g.a.a, f.a.a
    public CapturePipeline get() {
        return provideCapturePipeline(this.capturePipelineImplProvider, this.capturePipelineTorchCorrectionProvider);
    }
}
