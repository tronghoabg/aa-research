package androidx.camera.camera2.config;

import androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection;
import androidx.camera.camera2.impl.CapturePipeline;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class UseCaseCameraModule {
    public static final Companion Companion = new Companion(null);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        @UseCaseCameraScope
        public final CapturePipeline provideCapturePipeline(a<CapturePipelineImpl> aVar, a<CapturePipelineTorchCorrection> aVar2) {
            x.f(aVar, "capturePipelineImplProvider");
            x.f(aVar2, "capturePipelineTorchCorrectionProvider");
            if (CapturePipelineTorchCorrection.Companion.isEnabled()) {
                CapturePipelineTorchCorrection capturePipelineTorchCorrection = aVar2.get();
                x.e(capturePipelineTorchCorrection, "get(...)");
                return capturePipelineTorchCorrection;
            }
            CapturePipelineImpl capturePipelineImpl = aVar.get();
            x.e(capturePipelineImpl, "get(...)");
            return capturePipelineImpl;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
