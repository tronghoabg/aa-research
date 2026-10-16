package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.compat.AudioRestrictionController;
import androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.internal.GraphSessionLock;
import c.b.c;
import c.b.e;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraGraphImpl_Factory implements c<CameraGraphImpl> {
    private final e<AudioRestrictionController> audioRestrictionControllerProvider;
    private final e<CameraController> cameraControllerProvider;
    private final e<Controller3A> controller3AProvider;
    private final e<FrameCaptureQueue> frameCaptureQueueProvider;
    private final e<FrameDistributor> frameDistributorProvider;
    private final e<CameraGraph.Config> graphConfigProvider;
    private final e<GraphListener> graphListenerProvider;
    private final e<GraphProcessor> graphProcessorProvider;
    private final e<af> graphScopeProvider;
    private final e<CameraGraphId> idProvider;
    private final e<CameraGraphRequestListenersImpl> listenersProvider;
    private final e<CameraMetadata> metadataProvider;
    private final e<CameraGraphParametersImpl> parametersProvider;
    private final e<GraphSessionLock> sessionLockProvider;
    private final e<StreamGraphImpl> streamGraphProvider;
    private final e<SurfaceGraph> surfaceGraphProvider;

    private CameraGraphImpl_Factory(e<CameraGraph.Config> eVar, e<CameraMetadata> eVar2, e<GraphProcessor> eVar3, e<GraphListener> eVar4, e<StreamGraphImpl> eVar5, e<SurfaceGraph> eVar6, e<CameraController> eVar7, e<FrameDistributor> eVar8, e<FrameCaptureQueue> eVar9, e<AudioRestrictionController> eVar10, e<CameraGraphId> eVar11, e<CameraGraphParametersImpl> eVar12, e<CameraGraphRequestListenersImpl> eVar13, e<GraphSessionLock> eVar14, e<af> eVar15, e<Controller3A> eVar16) {
        this.graphConfigProvider = eVar;
        this.metadataProvider = eVar2;
        this.graphProcessorProvider = eVar3;
        this.graphListenerProvider = eVar4;
        this.streamGraphProvider = eVar5;
        this.surfaceGraphProvider = eVar6;
        this.cameraControllerProvider = eVar7;
        this.frameDistributorProvider = eVar8;
        this.frameCaptureQueueProvider = eVar9;
        this.audioRestrictionControllerProvider = eVar10;
        this.idProvider = eVar11;
        this.parametersProvider = eVar12;
        this.listenersProvider = eVar13;
        this.sessionLockProvider = eVar14;
        this.graphScopeProvider = eVar15;
        this.controller3AProvider = eVar16;
    }

    public static CameraGraphImpl_Factory create(e<CameraGraph.Config> eVar, e<CameraMetadata> eVar2, e<GraphProcessor> eVar3, e<GraphListener> eVar4, e<StreamGraphImpl> eVar5, e<SurfaceGraph> eVar6, e<CameraController> eVar7, e<FrameDistributor> eVar8, e<FrameCaptureQueue> eVar9, e<AudioRestrictionController> eVar10, e<CameraGraphId> eVar11, e<CameraGraphParametersImpl> eVar12, e<CameraGraphRequestListenersImpl> eVar13, e<GraphSessionLock> eVar14, e<af> eVar15, e<Controller3A> eVar16) {
        return new CameraGraphImpl_Factory(eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11, eVar12, eVar13, eVar14, eVar15, eVar16);
    }

    public static CameraGraphImpl newInstance(CameraGraph.Config config, CameraMetadata cameraMetadata, GraphProcessor graphProcessor, GraphListener graphListener, StreamGraphImpl streamGraphImpl, SurfaceGraph surfaceGraph, CameraController cameraController, FrameDistributor frameDistributor, FrameCaptureQueue frameCaptureQueue, AudioRestrictionController audioRestrictionController, CameraGraphId cameraGraphId, CameraGraphParametersImpl cameraGraphParametersImpl, CameraGraphRequestListenersImpl cameraGraphRequestListenersImpl, GraphSessionLock graphSessionLock, af afVar, Controller3A controller3A) {
        return new CameraGraphImpl(config, cameraMetadata, graphProcessor, graphListener, streamGraphImpl, surfaceGraph, cameraController, frameDistributor, frameCaptureQueue, audioRestrictionController, cameraGraphId, cameraGraphParametersImpl, cameraGraphRequestListenersImpl, graphSessionLock, afVar, controller3A);
    }

    @Override // g.a.a, f.a.a
    public CameraGraphImpl get() {
        return newInstance(this.graphConfigProvider.get(), this.metadataProvider.get(), this.graphProcessorProvider.get(), this.graphListenerProvider.get(), this.streamGraphProvider.get(), this.surfaceGraphProvider.get(), this.cameraControllerProvider.get(), this.frameDistributorProvider.get(), this.frameCaptureQueueProvider.get(), this.audioRestrictionControllerProvider.get(), this.idProvider.get(), this.parametersProvider.get(), this.listenersProvider.get(), this.sessionLockProvider.get(), this.graphScopeProvider.get(), this.controller3AProvider.get());
    }
}
