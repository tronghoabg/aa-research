package androidx.camera.camera2.pipe.framegraph;

import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.graph.Controller3A;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import c.b.c;
import c.b.e;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphImpl_Factory implements c<FrameGraphImpl> {
    private final e<CameraGraph> cameraGraphProvider;
    private final e<Controller3A> controller3AProvider;
    private final e<FrameDistributor> frameDistributorProvider;
    private final e<FrameGraphBuffers> frameGraphBuffersProvider;
    private final e<af> frameGraphCoroutineScopeProvider;
    private final e<FrameGraphFrameCaptureQueue> frameGraphFrameCaptureQueueProvider;

    private FrameGraphImpl_Factory(e<CameraGraph> eVar, e<FrameDistributor> eVar2, e<FrameGraphBuffers> eVar3, e<af> eVar4, e<Controller3A> eVar5, e<FrameGraphFrameCaptureQueue> eVar6) {
        this.cameraGraphProvider = eVar;
        this.frameDistributorProvider = eVar2;
        this.frameGraphBuffersProvider = eVar3;
        this.frameGraphCoroutineScopeProvider = eVar4;
        this.controller3AProvider = eVar5;
        this.frameGraphFrameCaptureQueueProvider = eVar6;
    }

    public static FrameGraphImpl_Factory create(e<CameraGraph> eVar, e<FrameDistributor> eVar2, e<FrameGraphBuffers> eVar3, e<af> eVar4, e<Controller3A> eVar5, e<FrameGraphFrameCaptureQueue> eVar6) {
        return new FrameGraphImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6);
    }

    public static FrameGraphImpl newInstance(CameraGraph cameraGraph, FrameDistributor frameDistributor, FrameGraphBuffers frameGraphBuffers, af afVar, Controller3A controller3A, FrameGraphFrameCaptureQueue frameGraphFrameCaptureQueue) {
        return new FrameGraphImpl(cameraGraph, frameDistributor, frameGraphBuffers, afVar, controller3A, frameGraphFrameCaptureQueue);
    }

    @Override // g.a.a, f.a.a
    public FrameGraphImpl get() {
        return newInstance(this.cameraGraphProvider.get(), this.frameDistributorProvider.get(), this.frameGraphBuffersProvider.get(), this.frameGraphCoroutineScopeProvider.get(), this.controller3AProvider.get(), this.frameGraphFrameCaptureQueueProvider.get());
    }
}
