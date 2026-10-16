package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.adapter.CaptureConfigAdapter;
import androidx.camera.camera2.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.config.UseCaseCameraScope;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.CapturePipeline;
import androidx.camera.camera2.impl.CapturePipelineImpl;
import androidx.camera.camera2.impl.TorchControl;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.core.imagecapture.CameraCapturePipeline;
import androidx.camera.core.impl.CaptureConfig;
import h.c.e;
import h.f;
import h.g;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
@UseCaseCameraScope
/* loaded from: classes2.dex */
public final class CapturePipelineTorchCorrection implements CapturePipeline {
    public static final Companion Companion = new Companion(null);
    private static final boolean isEnabled;
    private final f capturePipelineImpl$delegate;
    private final g.a.a<CapturePipelineImpl> capturePipelineImplProvider;
    private final f isLegacyDevice$delegate;
    private int template;
    private final UseCaseThreads threads;
    private final TorchControl torchControl;

    static {
        isEnabled = DeviceQuirks.INSTANCE.get(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public CapturePipelineTorchCorrection(final CameraProperties cameraProperties, g.a.a<CapturePipelineImpl> aVar, UseCaseThreads useCaseThreads, TorchControl torchControl) {
        x.f(cameraProperties, "cameraProperties");
        x.f(aVar, "capturePipelineImplProvider");
        x.f(useCaseThreads, "threads");
        x.f(torchControl, "torchControl");
        this.capturePipelineImplProvider = aVar;
        this.threads = useCaseThreads;
        this.torchControl = torchControl;
        this.isLegacyDevice$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Boolean.valueOf(CameraMetadata.Companion.isHardwareLevelLegacy(cameraProperties.getMetadata()));
            }
        });
        this.capturePipelineImpl$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.capturePipelineImplProvider.get();
            }
        });
        this.template = 1;
    }

    private final CapturePipelineImpl getCapturePipelineImpl() {
        return (CapturePipelineImpl) this.capturePipelineImpl$delegate.getValue();
    }

    /* renamed from: isCorrectionRequired-0UCm73U, reason: not valid java name */
    private final boolean m223isCorrectionRequired0UCm73U(List<CaptureConfig> list, int i2) {
        List<CaptureConfig> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (CaptureConfigAdapter.Companion.m186getStillCaptureTemplateCMLptTo$camera_camera2((CaptureConfig) it.next(), i2, isLegacyDevice()) == 2) {
                return isTorchOn();
            }
        }
        return false;
    }

    private final boolean isLegacyDevice() {
        return ((Boolean) this.isLegacyDevice$delegate.getValue()).booleanValue();
    }

    private final boolean isTorchOn() {
        Integer value = this.torchControl.getTorchStateLiveData().getValue();
        return value != null && value.intValue() == 1;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public Object getCameraCapturePipeline(int i2, int i3, int i4, e<? super CameraCapturePipeline> eVar) {
        return getCapturePipelineImpl().getCameraCapturePipeline(i2, i3, i4, eVar);
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public int getTemplate() {
        return this.template;
    }

    @Override // androidx.camera.camera2.impl.CapturePipeline
    public void setTemplate(int i2) {
        getCapturePipelineImpl().setTemplate(i2);
        this.template = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // androidx.camera.camera2.impl.CapturePipeline
    /* renamed from: submitStillCaptures-BvXKQx0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo224submitStillCapturesBvXKQx0(java.util.List<androidx.camera.core.impl.CaptureConfig> r12, int r13, androidx.camera.core.impl.Config r14, int r15, int r16, int r17, h.c.e<? super java.util.List<? extends kotlinx.coroutines.am<java.lang.Void>>> r18) {
        /*
            r11 = this;
            r0 = r18
            boolean r1 = r0 instanceof androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1
            if (r1 == 0) goto L15
            r1 = r0
            androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1 r1 = (androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1 r1 = new androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$1
            r1.<init>(r11, r0)
        L1a:
            r9 = r1
            java.lang.Object r0 = r9.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r9.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            boolean r12 = r9.Z$0
            e.b.c.b(r0)
            goto L54
        L2c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L34:
            e.b.c.b(r0)
            boolean r0 = r11.m223isCorrectionRequired0UCm73U(r12, r13)
            androidx.camera.camera2.impl.CapturePipelineImpl r2 = r11.getCapturePipelineImpl()
            r9.Z$0 = r0
            r9.label = r3
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            java.lang.Object r12 = r2.mo224submitStillCapturesBvXKQx0(r3, r4, r5, r6, r7, r8, r9)
            if (r12 == r1) goto L6b
            r10 = r0
            r0 = r12
            r12 = r10
        L54:
            java.util.List r0 = (java.util.List) r0
            if (r12 == 0) goto L6a
            androidx.camera.camera2.impl.UseCaseThreads r12 = r11.threads
            kotlinx.coroutines.af r12 = r12.getSequentialScope()
            androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$2 r13 = new androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection$submitStillCaptures$2
            r14 = 0
            r13.<init>(r0, r11, r14)
            h.g.a.p r13 = (h.g.a.p) r13
            r11 = 3
            kotlinx.coroutines.aj.z(r12, r14, r14, r13, r11)
        L6a:
            return r0
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.compat.workaround.CapturePipelineTorchCorrection.mo224submitStillCapturesBvXKQx0(java.util.List, int, androidx.camera.core.impl.Config, int, int, int, h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isEnabled() {
            return CapturePipelineTorchCorrection.isEnabled;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
