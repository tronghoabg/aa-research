package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraExtensionSession;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.ConcurrentCameraGraphs;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.SurfaceTracker;
import androidx.camera.camera2.pipe.config.Camera2ControllerScope;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.core.TimestampNs;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.internal.CameraStatusMonitor;
import h.a.i;
import h.ab;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
@Camera2ControllerScope
/* loaded from: classes2.dex */
public final class Camera2CameraController implements CameraController {
    public static final Companion Companion = new Companion(null);
    private static final boolean DEBUG = false;
    private static final int MS_TO_NS = 1000000;
    private static final long PRIORITIES_CHANGED_THRESHOLD;
    private static final long RESTART_TIMEOUT_WHEN_ENABLED;
    private boolean _isForeground;
    private final Camera2DeviceManager camera2DeviceManager;
    private final Camera2Quirks camera2Quirks;
    private final Camera2SystemState camera2SystemState;
    private CameraStatusMonitor.CameraStatus cameraAvailability;
    private br cameraAvailabilityJob;
    private final CameraGraphId cameraGraphId;
    private br cameraPrioritiesJob;
    private final CameraStatusMonitor cameraStatusMonitor;
    private final CameraSurfaceManager cameraSurfaceManager;
    private final Camera2CaptureSequenceProcessorFactory captureSequenceProcessorFactory;
    private final CaptureSessionFactory captureSessionFactory;
    private final CompletableDeferred<ab> closedDeferred;
    private final ConcurrentSessionSequencer concurrentSessionSequencer;
    private CameraController.ControllerState controllerState;
    private VirtualCamera currentCamera;
    private br currentCameraStateJob;
    private CaptureSessionState currentSession;
    private Map<StreamId, ? extends Surface> currentSurfaceMap;
    private final CameraGraph.Config graphConfig;
    private final GraphListener graphListener;
    private CameraError lastCameraError;
    private TimestampNs lastCameraPrioritiesChangedTs;
    private final Object lock;
    private br restartJob;
    private final af scope;
    private final ShutdownListener shutdownListener;
    private final StreamGraphImpl streamGraph;
    private final StrictMode strictMode;
    private final SurfaceTracker surfaceTracker;
    private final Threads threads;
    private final TimeSource timeSource;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
        int label;

        AnonymousClass1(h.c.e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            return Camera2CameraController.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                ch<CameraStatusMonitor.CameraStatus> cameraAvailability = Camera2CameraController.this.cameraStatusMonitor.getCameraAvailability();
                final Camera2CameraController camera2CameraController = Camera2CameraController.this;
                this.label = 1;
                if (cameraAvailability.collect(new l() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraController.1.1
                    public final Object emit(CameraStatusMonitor.CameraStatus cameraStatus, h.c.e<? super ab> eVar) {
                        if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraAvailable) {
                            if (!CameraId.m549equalsimpl0(((CameraStatusMonitor.CameraStatus.CameraAvailable) cameraStatus).m1205getCameraIdDz_R5H8(), camera2CameraController.mo423getCameraIdDz_R5H8())) {
                                throw new IllegalStateException("Check failed.");
                            }
                            camera2CameraController.onCameraStatusChanged(cameraStatus);
                        } else if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraUnavailable) {
                            if (!CameraId.m549equalsimpl0(((CameraStatusMonitor.CameraStatus.CameraUnavailable) cameraStatus).m1206getCameraIdDz_R5H8(), camera2CameraController.mo423getCameraIdDz_R5H8())) {
                                throw new IllegalStateException("Check failed.");
                            }
                            camera2CameraController.onCameraStatusChanged(cameraStatus);
                        }
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, h.c.e eVar) {
                        return emit((CameraStatusMonitor.CameraStatus) obj2, (h.c.e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            throw new h.e();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$2, reason: invalid class name */
    final class AnonymousClass2 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
        int label;

        AnonymousClass2(h.c.e<? super AnonymousClass2> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            return Camera2CameraController.this.new AnonymousClass2(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                bq<ab> cameraPriorities = Camera2CameraController.this.cameraStatusMonitor.getCameraPriorities();
                final Camera2CameraController camera2CameraController = Camera2CameraController.this;
                this.label = 1;
                if (cameraPriorities.collect(new l() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraController.2.1
                    public final Object emit(ab abVar, h.c.e<? super ab> eVar) {
                        camera2CameraController.onCameraStatusChanged(CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged.INSTANCE);
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, h.c.e eVar) {
                        return emit((ab) obj2, (h.c.e<? super ab>) eVar);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            throw new h.e();
        }
    }

    /* compiled from: WazeSource */
    public interface ShutdownListener {
        void onControllerClosed(CameraController cameraController);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$awaitClosed$1, reason: invalid class name and case insensitive filesystem */
    final class C01551 extends h.c.b.a.c {
        int label;
        /* synthetic */ Object result;

        C01551(h.c.e<? super C01551> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Camera2CameraController.this.awaitClosed(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$startLocked$5, reason: invalid class name */
    final class AnonymousClass5 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
        int label;

        AnonymousClass5(h.c.e<? super AnonymousClass5> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            return Camera2CameraController.this.new AnonymousClass5(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
            return ((AnonymousClass5) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                this.label = 1;
                if (Camera2CameraController.this.bindSessionToCamera(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CameraController$tryRestart$2, reason: invalid class name and case insensitive filesystem */
    final class C01562 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
        final /* synthetic */ long $restartDelay;
        int label;
        final /* synthetic */ Camera2CameraController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C01562(long j2, Camera2CameraController camera2CameraController, h.c.e<? super C01562> eVar) {
            super(2, eVar);
            this.$restartDelay = j2;
            this.this$0 = camera2CameraController;
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
            return new C01562(this.$restartDelay, this.this$0, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
            return ((C01562) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                this.label = 1;
                if (aj.r(this.$restartDelay, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            Camera2CameraController camera2CameraController = this.this$0;
            synchronized (camera2CameraController.lock) {
                if (!camera2CameraController.isClosed() && !x.n(camera2CameraController.getControllerState$camera_camera2_pipe(), CameraController.ControllerState.STOPPING.INSTANCE) && !x.n(camera2CameraController.getControllerState$camera_camera2_pipe(), CameraController.ControllerState.STOPPED.INSTANCE)) {
                    if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                        android.util.Log.d(Log.TAG, a.a(camera2CameraController, "Restarting ", "..."));
                    }
                    camera2CameraController.surfaceTracker.registerAllSurfaces();
                    camera2CameraController.stopLocked();
                    camera2CameraController.startLocked();
                }
            }
            return ab.f48028a;
        }
    }

    static {
        h.o.c cVar = h.o.a.f48264a;
        RESTART_TIMEOUT_WHEN_ENABLED = h.o.c.i(700, h.o.d.f48272c);
        PRIORITIES_CHANGED_THRESHOLD = h.o.c.i(200, h.o.d.f48272c);
    }

    public Camera2CameraController(CameraGraphId cameraGraphId, CameraGraph.Config config, af afVar, Threads threads, StrictMode strictMode, TimeSource timeSource, Camera2Quirks camera2Quirks, Camera2DeviceManager camera2DeviceManager, Camera2SystemState camera2SystemState, CameraStatusMonitor cameraStatusMonitor, ConcurrentSessionSequencers concurrentSessionSequencers, StreamGraphImpl streamGraphImpl, CameraSurfaceManager cameraSurfaceManager, SurfaceTracker surfaceTracker, CaptureSessionFactory captureSessionFactory, Camera2CaptureSequenceProcessorFactory camera2CaptureSequenceProcessorFactory, GraphListener graphListener, ShutdownListener shutdownListener) {
        x.f(cameraGraphId, "cameraGraphId");
        x.f(config, "graphConfig");
        x.f(afVar, "scope");
        x.f(threads, "threads");
        x.f(strictMode, "strictMode");
        x.f(timeSource, "timeSource");
        x.f(camera2Quirks, "camera2Quirks");
        x.f(camera2DeviceManager, "camera2DeviceManager");
        x.f(camera2SystemState, "camera2SystemState");
        x.f(cameraStatusMonitor, "cameraStatusMonitor");
        x.f(concurrentSessionSequencers, "concurrentSessionSequencers");
        x.f(streamGraphImpl, "streamGraph");
        x.f(cameraSurfaceManager, "cameraSurfaceManager");
        x.f(surfaceTracker, "surfaceTracker");
        x.f(captureSessionFactory, "captureSessionFactory");
        x.f(camera2CaptureSequenceProcessorFactory, "captureSequenceProcessorFactory");
        x.f(graphListener, "graphListener");
        x.f(shutdownListener, "shutdownListener");
        this.cameraGraphId = cameraGraphId;
        this.graphConfig = config;
        this.scope = afVar;
        this.threads = threads;
        this.strictMode = strictMode;
        this.timeSource = timeSource;
        this.camera2Quirks = camera2Quirks;
        this.camera2DeviceManager = camera2DeviceManager;
        this.camera2SystemState = camera2SystemState;
        this.cameraStatusMonitor = cameraStatusMonitor;
        this.streamGraph = streamGraphImpl;
        this.cameraSurfaceManager = cameraSurfaceManager;
        this.surfaceTracker = surfaceTracker;
        this.captureSessionFactory = captureSessionFactory;
        this.captureSequenceProcessorFactory = camera2CaptureSequenceProcessorFactory;
        this.graphListener = graphListener;
        this.shutdownListener = shutdownListener;
        this.lock = new Object();
        this._isForeground = true;
        this.controllerState = CameraController.ControllerState.STOPPED.INSTANCE;
        this.cameraAvailability = new CameraStatusMonitor.CameraStatus.CameraUnavailable(mo423getCameraIdDz_R5H8(), null);
        ConcurrentCameraGraphs concurrentCameraGraphs$camera_camera2_pipe = config.getConcurrentCameraGraphs$camera_camera2_pipe();
        this.concurrentSessionSequencer = concurrentCameraGraphs$camera_camera2_pipe != null ? concurrentSessionSequencers.getSequencer(getCameraGraphId(), concurrentCameraGraphs$camera_camera2_pipe) : null;
        this.closedDeferred = bo.j();
        this.cameraAvailabilityJob = aj.z(afVar, null, null, new AnonymousClass1(null), 3);
        this.cameraPrioritiesJob = aj.z(afVar, null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object bindSessionToCamera(h.c.e<? super ab> eVar) {
        VirtualCamera virtualCamera;
        Object objCollect;
        final aq aqVar = new aq();
        synchronized (this.lock) {
            virtualCamera = this.currentCamera;
            aqVar.f48105a = this.currentSession;
        }
        return (virtualCamera == null || aqVar.f48105a == null || (objCollect = virtualCamera.getState().collect(new l() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraController.bindSessionToCamera.3
            public final Object emit(CameraState cameraState, h.c.e<? super ab> eVar2) {
                if (cameraState instanceof CameraStateOpen) {
                    ((CaptureSessionState) aqVar.f48105a).setCameraDevice(((CameraStateOpen) cameraState).getCameraDevice());
                } else if (cameraState instanceof CameraStateClosing) {
                    ((CaptureSessionState) aqVar.f48105a).shutdown();
                } else if (cameraState instanceof CameraStateClosed) {
                    ((CaptureSessionState) aqVar.f48105a).shutdown();
                    this.onStateClosed((CameraStateClosed) cameraState);
                }
                return ab.f48028a;
            }

            @Override // kotlinx.coroutines.b.l
            public /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar2) {
                return emit((CameraState) obj, (h.c.e<? super ab>) eVar2);
            }
        }, eVar)) != h.c.a.a.f48038a) ? ab.f48028a : objCollect;
    }

    private final void detachSessionAndCamera(CaptureSessionState captureSessionState, VirtualCamera virtualCamera) {
        this.camera2SystemState.onGraphStopped(getCameraGraphId());
        br brVarZ = aj.z(this.scope, null, null, new Camera2CameraController$detachSessionAndCamera$job$1(captureSessionState, virtualCamera, null), 3);
        if (x.n(this.controllerState, CameraController.ControllerState.CLOSING.INSTANCE)) {
            brVarZ.bY(new h.g.a.l() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraController$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Camera2CameraController.detachSessionAndCamera$lambda$0(this.f$0, (Throwable) obj);
                }
            });
        }
    }

    static final ab detachSessionAndCamera$lambda$0(Camera2CameraController camera2CameraController, Throwable th) {
        synchronized (camera2CameraController.lock) {
            camera2CameraController.controllerState = CameraController.ControllerState.CLOSED.INSTANCE;
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, camera2CameraController + " is closed");
            }
        }
        camera2CameraController.shutdownListener.onControllerClosed(camera2CameraController);
        CompletableDeferred<ab> completableDeferred = camera2CameraController.closedDeferred;
        ab abVar = ab.f48028a;
        completableDeferred.a(abVar);
        aj.h(camera2CameraController.scope, null);
        return abVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosed() {
        return x.n(this.controllerState, CameraController.ControllerState.CLOSING.INSTANCE) || x.n(this.controllerState, CameraController.ControllerState.CLOSED.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCameraStatusChanged(CameraStatusMonitor.CameraStatus cameraStatus) {
        synchronized (this.lock) {
            if (!isClosed()) {
                if ((cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraAvailable) || (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraUnavailable)) {
                    this.cameraAvailability = cameraStatus;
                } else if (cameraStatus instanceof CameraStatusMonitor.CameraStatus.CameraPrioritiesChanged) {
                    this.lastCameraPrioritiesChangedTs = TimestampNs.m1120boximpl(this.timeSource.mo1117nowvQl9yQU());
                }
                tryRestart();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStateClosed(CameraStateClosed cameraStateClosed) {
        synchronized (this.lock) {
            if (!isClosed()) {
                if (cameraStateClosed.m1066getCameraErrorCodemVEW8x0() != null) {
                    this.lastCameraError = cameraStateClosed.m1066getCameraErrorCodemVEW8x0();
                    if (CameraError.m476isDisconnectedimpl(cameraStateClosed.m1066getCameraErrorCodemVEW8x0().m478unboximpl())) {
                        this.controllerState = CameraController.ControllerState.DISCONNECTED.INSTANCE;
                        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                            android.util.Log.d(Log.TAG, this + " is disconnected");
                        }
                    } else {
                        this.controllerState = CameraController.ControllerState.ERROR.INSTANCE;
                        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                            android.util.Log.d(Log.TAG, this + " encountered error: " + CameraError.m477toStringimpl(cameraStateClosed.m1066getCameraErrorCodemVEW8x0().m478unboximpl()));
                        }
                    }
                } else {
                    this.controllerState = CameraController.ControllerState.STOPPED.INSTANCE;
                }
                this.surfaceTracker.unregisterAllSurfaces();
                tryRestart();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startLocked() {
        Set<CameraId> setO;
        if (isClosed()) {
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                android.util.Log.i(Log.TAG, a.a(this, "Ignoring start(): ", " is already closed"));
                return;
            }
            return;
        }
        if (x.n(this.controllerState, CameraController.ControllerState.STARTED.INSTANCE)) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, a.a(this, "Ignoring start(): ", " is already started"));
                return;
            }
            return;
        }
        this.camera2SystemState.onGraphStarting(getCameraGraphId());
        this.lastCameraError = null;
        CameraGraph.Config config = this.graphConfig;
        String strM505getCameraDz_R5H8 = config.m505getCameraDz_R5H8();
        ConcurrentCameraGraphs concurrentCameraGraphs$camera_camera2_pipe = config.getConcurrentCameraGraphs$camera_camera2_pipe();
        if (concurrentCameraGraphs$camera_camera2_pipe == null || (setO = concurrentCameraGraphs$camera_camera2_pipe.getCameraIds()) == null) {
            setO = e.c.d.a.o(CameraId.m546boximpl(strM505getCameraDz_R5H8));
        }
        VirtualCamera virtualCameraMo1024openzDSwpeU = this.camera2DeviceManager.mo1024openzDSwpeU(strM505getCameraDz_R5H8, i.ao(e.c.d.a.u(setO, CameraId.m546boximpl(strM505getCameraDz_R5H8))), this.graphListener, false, new h.g.a.l() { // from class: androidx.camera.camera2.pipe.compat.Camera2CameraController$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Camera2CameraController.startLocked$lambda$2(this.f$0, (ab) obj));
            }
        });
        if (virtualCameraMo1024openzDSwpeU == null) {
            if (Log.INSTANCE.getERROR_LOGGABLE()) {
                android.util.Log.e(Log.TAG, a.a(this, "Failed to start ", ": Open request submission failed"));
                return;
            }
            return;
        }
        if (this.currentCamera != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.currentSession != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.currentCamera = virtualCameraMo1024openzDSwpeU;
        CaptureSessionState captureSessionState = new CaptureSessionState(this.graphListener, this.captureSessionFactory, this.captureSequenceProcessorFactory, this.cameraSurfaceManager, this.timeSource, this.graphConfig.getFlags(), this.concurrentSessionSequencer, this.streamGraph, this.strictMode, this.threads, this.scope);
        this.currentSession = captureSessionState;
        Map<StreamId, ? extends Surface> map = this.currentSurfaceMap;
        if (map != null) {
            captureSessionState.configureSurfaceMap(map);
        }
        this.controllerState = CameraController.ControllerState.STARTED.INSTANCE;
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, "Started ".concat(toString()));
        }
        br brVar = this.currentCameraStateJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.currentCameraStateJob = aj.z(this.scope, null, null, new AnonymousClass5(null), 3);
    }

    static final boolean startLocked$lambda$2(Camera2CameraController camera2CameraController, ab abVar) {
        x.f(abVar, "<unused var>");
        return camera2CameraController.isForeground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopLocked() {
        if (isClosed()) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, a.a(this, "Ignoring stop(): ", " is already closed"));
                return;
            }
            return;
        }
        if (x.n(this.controllerState, CameraController.ControllerState.STOPPING.INSTANCE) || x.n(this.controllerState, CameraController.ControllerState.STOPPED.INSTANCE)) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, a.a(this, "Ignoring stop(): ", " already stopping or stopped"));
                return;
            }
            return;
        }
        VirtualCamera virtualCamera = this.currentCamera;
        CaptureSessionState captureSessionState = this.currentSession;
        this.currentCamera = null;
        this.currentSession = null;
        this.controllerState = CameraController.ControllerState.STOPPING.INSTANCE;
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, "Stopping ".concat(toString()));
        }
        detachSessionAndCamera(captureSessionState, virtualCamera);
    }

    private final void tryRestart() {
        long jI;
        if (Companion.m1009shouldRestartX9Wt83s$camera_camera2_pipe(this.controllerState, this.lastCameraError, this.cameraAvailability, this.lastCameraPrioritiesChangedTs, this.timeSource.mo1117nowvQl9yQU())) {
            if (this.graphConfig.getFlags().getEnableRestartDelays()) {
                jI = RESTART_TIMEOUT_WHEN_ENABLED;
            } else {
                h.o.c cVar = h.o.a.f48264a;
                jI = h.o.c.i(0, h.o.d.f48272c);
            }
            br brVar = this.restartJob;
            if (brVar != null) {
                brVar.s(null);
            }
            this.restartJob = aj.z(this.scope, null, null, new C01562(jI, this, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitClosed(h.c.e<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.camera.camera2.pipe.compat.Camera2CameraController.C01551
            if (r0 == 0) goto L13
            r0 = r6
            androidx.camera.camera2.pipe.compat.Camera2CameraController$awaitClosed$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2CameraController.C01551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2CameraController$awaitClosed$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2CameraController$awaitClosed$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            e.b.c.b(r6)
            goto Lb9
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            e.b.c.b(r6)
            androidx.camera.camera2.pipe.core.Log r6 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r6 = r6.getDEBUG_LOGGABLE()
            if (r6 == 0) goto L4d
            r5.toString()
            java.lang.String r6 = "#awaitClosed"
            java.lang.String r2 = r5.toString()
            java.lang.String r6 = r2.concat(r6)
            java.lang.String r2 = "CXCP"
            android.util.Log.d(r2, r6)
        L4d:
            java.lang.Object r6 = r5.lock
            monitor-enter(r6)
            androidx.camera.camera2.pipe.CameraController$ControllerState r2 = r5.controllerState     // Catch: java.lang.Throwable -> Lbe
            androidx.camera.camera2.pipe.CameraController$ControllerState$CLOSED r4 = androidx.camera.camera2.pipe.CameraController.ControllerState.CLOSED.INSTANCE     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = h.g.b.x.n(r2, r4)     // Catch: java.lang.Throwable -> Lbe
            if (r2 == 0) goto L7e
            androidx.camera.camera2.pipe.core.Log r0 = androidx.camera.camera2.pipe.core.Log.INSTANCE     // Catch: java.lang.Throwable -> Lbe
            boolean r0 = r0.getDEBUG_LOGGABLE()     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto L78
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r1.<init>()     // Catch: java.lang.Throwable -> Lbe
            r1.append(r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = "#awaitClosed: Controller is already closed."
            r1.append(r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> Lbe
            android.util.Log.d(r0, r5)     // Catch: java.lang.Throwable -> Lbe
        L78:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r6)
            return r5
        L7e:
            androidx.camera.camera2.pipe.CameraController$ControllerState r2 = r5.controllerState     // Catch: java.lang.Throwable -> Lbe
            androidx.camera.camera2.pipe.CameraController$ControllerState$CLOSING r4 = androidx.camera.camera2.pipe.CameraController.ControllerState.CLOSING.INSTANCE     // Catch: java.lang.Throwable -> Lbe
            boolean r2 = h.g.b.x.n(r2, r4)     // Catch: java.lang.Throwable -> Lbe
            if (r2 != 0) goto Lad
            androidx.camera.camera2.pipe.core.Log r0 = androidx.camera.camera2.pipe.core.Log.INSTANCE     // Catch: java.lang.Throwable -> Lbe
            boolean r0 = r0.getWARN_LOGGABLE()     // Catch: java.lang.Throwable -> Lbe
            if (r0 == 0) goto La6
            java.lang.String r0 = "CXCP"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbe
            r1.<init>()     // Catch: java.lang.Throwable -> Lbe
            r1.append(r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = "#awaitClosed: Controller isn't closing!"
            r1.append(r5)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> Lbe
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> Lbe
        La6:
            r5 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r6)
            return r5
        Lad:
            monitor-exit(r6)
            kotlinx.coroutines.CompletableDeferred<h.ab> r5 = r5.closedDeferred
            r0.label = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto Lb9
            return r1
        Lb9:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        Lbe:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2CameraController.awaitClosed(h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public void close() {
        synchronized (this.lock) {
            if (!isClosed()) {
                this.controllerState = CameraController.ControllerState.CLOSING.INSTANCE;
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Closed " + this);
                }
                VirtualCamera virtualCamera = this.currentCamera;
                CaptureSessionState captureSessionState = this.currentSession;
                this.currentCamera = null;
                this.currentSession = null;
                br brVar = this.restartJob;
                if (brVar != null) {
                    brVar.s(null);
                }
                br brVar2 = this.currentCameraStateJob;
                if (brVar2 != null) {
                    brVar2.s(null);
                }
                this.currentCameraStateJob = null;
                br brVar3 = this.cameraAvailabilityJob;
                if (brVar3 != null) {
                    brVar3.s(null);
                }
                this.cameraAvailabilityJob = null;
                br brVar4 = this.cameraPrioritiesJob;
                if (brVar4 != null) {
                    brVar4.s(null);
                }
                this.cameraPrioritiesJob = null;
                Camera2CameraController$$ExternalSyntheticAutoCloseableDispatcher0.m(this.cameraStatusMonitor);
                detachSessionAndCamera(captureSessionState, virtualCamera);
                if (this.graphConfig.getFlags().getCloseCameraDeviceOnClose() || this.camera2Quirks.m1051x552c1673(mo423getCameraIdDz_R5H8())) {
                    if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                        android.util.Log.d(Log.TAG, "Quirk: Closing " + CameraId.m552toStringimpl(mo423getCameraIdDz_R5H8()) + " during " + this + "#close");
                    }
                    this.camera2DeviceManager.mo1023closeEfqyGwQ(mo423getCameraIdDz_R5H8());
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public CameraGraphId getCameraGraphId() {
        return this.cameraGraphId;
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    /* renamed from: getCameraId-Dz_R5H8 */
    public String mo423getCameraIdDz_R5H8() {
        return this.graphConfig.m505getCameraDz_R5H8();
    }

    public final CameraController.ControllerState getControllerState$camera_camera2_pipe() {
        return this.controllerState;
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    /* renamed from: getOutputLatency-n5Pu2dI */
    public StreamGraph.OutputLatency mo424getOutputLatencyn5Pu2dI(StreamId streamId) {
        CaptureSessionState captureSessionState;
        CameraExtensionSession.StillCaptureLatency realtimeCaptureLatency;
        if (Build.VERSION.SDK_INT < 34 || (captureSessionState = this.currentSession) == null || (realtimeCaptureLatency = captureSessionState.getRealtimeCaptureLatency()) == null) {
            return null;
        }
        return new StreamGraph.OutputLatency(realtimeCaptureLatency.getCaptureLatency() * 1000000, realtimeCaptureLatency.getProcessingLatency() * 1000000);
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public boolean isForeground() {
        boolean z;
        synchronized (this.lock) {
            z = this._isForeground;
        }
        return z;
    }

    public final void setControllerState$camera_camera2_pipe(CameraController.ControllerState controllerState) {
        x.f(controllerState, "<set-?>");
        this.controllerState = controllerState;
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public void setForeground(boolean z) {
        synchronized (this.lock) {
            this._isForeground = z;
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public void start() {
        synchronized (this.lock) {
            startLocked();
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public void stop() {
        synchronized (this.lock) {
            stopLocked();
        }
    }

    public String toString() {
        return "Camera2CameraController(" + getCameraGraphId() + ")";
    }

    @Override // androidx.camera.camera2.pipe.CameraController
    public void updateSurfaceMap(Map<StreamId, ? extends Surface> map) {
        x.f(map, "surfaceMap");
        synchronized (this.lock) {
            if (isClosed()) {
                return;
            }
            this.currentSurfaceMap = map;
            CaptureSessionState captureSessionState = this.currentSession;
            if (captureSessionState != null) {
                captureSessionState.configureSurfaceMap(map);
            }
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* renamed from: shouldRestart-X9Wt83s$camera_camera2_pipe, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean m1009shouldRestartX9Wt83s$camera_camera2_pipe(androidx.camera.camera2.pipe.CameraController.ControllerState r4, androidx.camera.camera2.pipe.CameraError r5, androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus r6, androidx.camera.camera2.pipe.core.TimestampNs r7, long r8) {
            /*
                r3 = this;
                java.lang.String r3 = "controllerState"
                h.g.b.x.f(r4, r3)
                java.lang.String r3 = "cameraAvailability"
                h.g.b.x.f(r6, r3)
                boolean r3 = r6 instanceof androidx.camera.camera2.pipe.internal.CameraStatusMonitor.CameraStatus.CameraAvailable
                r6 = 0
                r0 = 1
                if (r3 == 0) goto L25
                androidx.camera.camera2.pipe.CameraError$Companion r3 = androidx.camera.camera2.pipe.CameraError.Companion
                int r3 = r3.m483getERROR_CAMERA_DISABLEDv7Vf74A()
                if (r5 != 0) goto L1a
            L18:
                r3 = r0
                goto L26
            L1a:
                int r1 = r5.m478unboximpl()
                boolean r3 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r1, r3)
                if (r3 != 0) goto L25
                goto L18
            L25:
                r3 = r6
            L26:
                if (r7 != 0) goto L2a
            L28:
                r7 = r6
                goto L42
            L2a:
                long r1 = r7.m1128unboximpl()
                h.o.c r7 = h.o.a.f48264a
                long r8 = r8 - r1
                h.o.d r7 = h.o.d.f48270a
                long r7 = h.o.c.j(r8, r7)
                long r1 = androidx.camera.camera2.pipe.compat.Camera2CameraController.access$getPRIORITIES_CHANGED_THRESHOLD$cp()
                int r7 = h.o.a.c(r7, r1)
                if (r7 > 0) goto L28
                r7 = r0
            L42:
                androidx.camera.camera2.pipe.CameraController$ControllerState$DISCONNECTED r8 = androidx.camera.camera2.pipe.CameraController.ControllerState.DISCONNECTED.INSTANCE
                boolean r8 = h.g.b.x.n(r4, r8)
                if (r8 == 0) goto L65
                if (r3 != 0) goto L64
                if (r7 == 0) goto L4f
                goto L64
            L4f:
                int r3 = android.os.Build.VERSION.SDK_INT
                r4 = 33
                if (r3 >= r4) goto L96
                androidx.camera.camera2.pipe.core.Log r3 = androidx.camera.camera2.pipe.core.Log.INSTANCE
                boolean r3 = r3.getDEBUG_LOGGABLE()
                if (r3 == 0) goto L64
                java.lang.String r3 = "CXCP"
                java.lang.String r4 = "Quirk for multi-resume activated: Kicking off restart."
                android.util.Log.d(r3, r4)
            L64:
                return r0
            L65:
                androidx.camera.camera2.pipe.CameraController$ControllerState$ERROR r7 = androidx.camera.camera2.pipe.CameraController.ControllerState.ERROR.INSTANCE
                boolean r4 = h.g.b.x.n(r4, r7)
                if (r4 == 0) goto L96
                if (r3 == 0) goto L96
                androidx.camera.camera2.pipe.CameraError$Companion r3 = androidx.camera.camera2.pipe.CameraError.Companion
                int r3 = r3.m491getERROR_GRAPH_CONFIGv7Vf74A()
                if (r5 != 0) goto L78
                goto L82
            L78:
                int r4 = r5.m478unboximpl()
                boolean r3 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r4, r3)
                if (r3 != 0) goto L96
            L82:
                androidx.camera.camera2.pipe.CameraError$Companion r3 = androidx.camera.camera2.pipe.CameraError.Companion
                int r3 = r3.m493getERROR_SECURITY_EXCEPTIONv7Vf74A()
                if (r5 != 0) goto L8b
                goto L95
            L8b:
                int r4 = r5.m478unboximpl()
                boolean r3 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r4, r3)
                if (r3 != 0) goto L96
            L95:
                return r0
            L96:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2CameraController.Companion.m1009shouldRestartX9Wt83s$camera_camera2_pipe(androidx.camera.camera2.pipe.CameraController$ControllerState, androidx.camera.camera2.pipe.CameraError, androidx.camera.camera2.pipe.internal.CameraStatusMonitor$CameraStatus, androidx.camera.camera2.pipe.core.TimestampNs, long):boolean");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public static /* synthetic */ void getControllerState$camera_camera2_pipe$annotations() {
    }
}
