package androidx.camera.camera2.pipe.framegraph;

import androidx.camera.camera2.pipe.graph.GraphProcessor;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.GraphSessionLock;
import c.b.c;
import c.b.e;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameGraphFrameCaptureQueue_Factory implements c<FrameGraphFrameCaptureQueue> {
    private final e<FrameCaptureQueue> frameCaptureQueueProvider;
    private final e<af> frameGraphCoroutineScopeProvider;
    private final e<GraphProcessor> graphProcessorProvider;
    private final e<GraphSessionLock> sessionLockProvider;

    private FrameGraphFrameCaptureQueue_Factory(e<FrameCaptureQueue> eVar, e<GraphProcessor> eVar2, e<GraphSessionLock> eVar3, e<af> eVar4) {
        this.frameCaptureQueueProvider = eVar;
        this.graphProcessorProvider = eVar2;
        this.sessionLockProvider = eVar3;
        this.frameGraphCoroutineScopeProvider = eVar4;
    }

    public static FrameGraphFrameCaptureQueue_Factory create(e<FrameCaptureQueue> eVar, e<GraphProcessor> eVar2, e<GraphSessionLock> eVar3, e<af> eVar4) {
        return new FrameGraphFrameCaptureQueue_Factory(eVar, eVar2, eVar3, eVar4);
    }

    public static FrameGraphFrameCaptureQueue newInstance(FrameCaptureQueue frameCaptureQueue, GraphProcessor graphProcessor, GraphSessionLock graphSessionLock, af afVar) {
        return new FrameGraphFrameCaptureQueue(frameCaptureQueue, graphProcessor, graphSessionLock, afVar);
    }

    @Override // g.a.a, f.a.a
    public FrameGraphFrameCaptureQueue get() {
        return newInstance(this.frameCaptureQueueProvider.get(), this.graphProcessorProvider.get(), this.sessionLockProvider.get(), this.frameGraphCoroutineScopeProvider.get());
    }
}
