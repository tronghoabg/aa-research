package androidx.camera.camera2.adapter;

import android.os.Looper;
import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.impl.Camera2Logger;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.CameraState;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.core.util.Consumer;
import androidx.lifecycle.MutableLiveData;
import h.a.i;
import h.g.b.o;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class CameraStateAdapter {
    public static final Companion Companion = new Companion(null);
    private final LiveDataObservable<CameraInternal.State> cameraInternalState;
    private final MutableLiveData<CameraState> cameraState;
    private final Map<Consumer<CameraState>, Executor> cameraStateListeners;
    private CameraGraph closedGraph;
    private CameraInternal.State currentCameraInternalState;
    private CameraState.StateError currentCameraStateError;
    private CameraGraph currentGraph;
    private boolean isRemoved;
    private final Object lock;
    private final CameraSessionLifecycleAdapter sessionLifecycleAdapter;

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CameraInternal.State.values().length];
            try {
                iArr[CameraInternal.State.CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CameraInternal.State.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CameraInternal.State.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CameraInternal.State.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CameraInternal.State.PENDING_OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CameraStateAdapter(CameraSessionLifecycleAdapter cameraSessionLifecycleAdapter) {
        x.f(cameraSessionLifecycleAdapter, "sessionLifecycleAdapter");
        this.sessionLifecycleAdapter = cameraSessionLifecycleAdapter;
        this.lock = new Object();
        this.cameraInternalState = new LiveDataObservable<>();
        this.cameraState = new MutableLiveData<>();
        this.currentCameraInternalState = CameraInternal.State.CLOSED;
        this.cameraStateListeners = new LinkedHashMap();
        postCameraState$default(this, CameraInternal.State.CLOSED, null, 2, null);
    }

    private final void handleStateTransition(CameraGraph cameraGraph, GraphState graphState) {
        CameraInternal.State state;
        if (!x.n(cameraGraph, this.currentGraph)) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Ignored stale transition " + graphState + " for " + cameraGraph);
                return;
            }
            return;
        }
        CameraGraph cameraGraph2 = this.currentGraph;
        boolean z = false;
        if (cameraGraph2 != null && !x.n(cameraGraph2, this.closedGraph)) {
            z = true;
        }
        CombinedCameraState combinedCameraStateCalculateNextState$camera_camera2 = calculateNextState$camera_camera2(this.currentCameraInternalState, graphState, this.currentCameraStateError, z);
        if (combinedCameraStateCalculateNextState$camera_camera2 == null) {
            Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
            if (Logger.isWarnEnabled(Log.TAG)) {
                android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Impermissible state transition: current camera internal state: " + this.currentCameraInternalState + ", received graph state: " + graphState);
                return;
            }
            return;
        }
        if (combinedCameraStateCalculateNextState$camera_camera2.getState() == CameraInternal.State.OPEN && ((state = this.currentCameraInternalState) == CameraInternal.State.CLOSED || state == CameraInternal.State.PENDING_OPEN)) {
            postCameraState$default(this, CameraInternal.State.OPENING, null, 2, null);
        }
        this.currentCameraInternalState = combinedCameraStateCalculateNextState$camera_camera2.getState();
        this.currentCameraStateError = combinedCameraStateCalculateNextState$camera_camera2.getError();
        Camera2Logger camera2Logger3 = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Updated current camera internal state: " + this.currentCameraInternalState + " to " + combinedCameraStateCalculateNextState$camera_camera2);
        }
        postCameraState(this.currentCameraInternalState, this.currentCameraStateError);
    }

    private final void postCameraState(CameraInternal.State state, CameraState.StateError stateError) {
        List<Map.Entry> listAo;
        this.cameraInternalState.postValue(state);
        Companion companion = Companion;
        final CameraState cameraStateCreate = CameraState.create(companion.toCameraState$camera_camera2(state), stateError);
        x.e(cameraStateCreate, "create(...)");
        companion.setOrPostValue$camera_camera2(this.cameraState, cameraStateCreate);
        synchronized (this.lock) {
            listAo = i.ao(this.cameraStateListeners.entrySet());
        }
        for (Map.Entry entry : listAo) {
            final Consumer consumer = (Consumer) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: androidx.camera.camera2.adapter.CameraStateAdapter$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    consumer.accept(cameraStateCreate);
                }
            });
        }
    }

    static /* synthetic */ void postCameraState$default(CameraStateAdapter cameraStateAdapter, CameraInternal.State state, CameraState.StateError stateError, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            stateError = null;
        }
        cameraStateAdapter.postCameraState(state, stateError);
    }

    public final void addCameraStateListener$camera_camera2(Executor executor, Consumer<CameraState> consumer) {
        x.f(executor, "executor");
        x.f(consumer, "listener");
        synchronized (this.lock) {
            this.cameraStateListeners.put(consumer, executor);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final CombinedCameraState calculateNextState$camera_camera2(CameraInternal.State state, GraphState graphState, CameraState.StateError stateError, boolean z) {
        x.f(state, "currentState");
        x.f(graphState, "graphState");
        CameraInternal.State state2 = CameraInternal.State.RELEASED;
        int iOrdinal = state.ordinal();
        CameraState.StateError stateError2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        int i2 = 2;
        if (iOrdinal == 2) {
            if (x.n(graphState, GraphState.GraphStateStarting.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.OPENING, objArr4 == true ? 1 : 0, i2, objArr3 == true ? 1 : 0);
            }
            if (x.n(graphState, GraphState.GraphStateStarted.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.OPEN, objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
            }
            return null;
        }
        if (iOrdinal == 3) {
            if (x.n(graphState, GraphState.GraphStateStarting.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.OPENING, objArr8 == true ? 1 : 0, i2, objArr7 == true ? 1 : 0);
            }
            if (x.n(graphState, GraphState.GraphStateStarted.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.OPEN, objArr6 == true ? 1 : 0, i2, objArr5 == true ? 1 : 0);
            }
            if (graphState instanceof GraphState.GraphStateError) {
                return new CombinedCameraState(CameraInternal.State.PENDING_OPEN, Companion.resolveErrorEvent((GraphState.GraphStateError) graphState, CameraInternal.State.OPENING).component2());
            }
            if (x.n(graphState, GraphState.GraphStateStopping.INSTANCE) || x.n(graphState, GraphState.GraphStateStopped.INSTANCE)) {
                return Companion.handleStateStop(graphState, z, stateError);
            }
            return null;
        }
        if (iOrdinal == 4) {
            if (x.n(graphState, GraphState.GraphStateStopped.INSTANCE)) {
                return Companion.handleStateStop(graphState, z, stateError);
            }
            if (x.n(graphState, GraphState.GraphStateStarting.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.OPENING, objArr10 == true ? 1 : 0, i2, objArr9 == true ? 1 : 0);
            }
            if (!(graphState instanceof GraphState.GraphStateError)) {
                return null;
            }
            if (z) {
                GraphState.GraphStateError graphStateError = (GraphState.GraphStateError) graphState;
                if (graphStateError.getWillAttemptRetry()) {
                    return Companion.resolveErrorEvent(graphStateError, CameraInternal.State.OPENING);
                }
            }
            return new CombinedCameraState(CameraInternal.State.CLOSING, Companion.m183toCameraStateError90vkdD0$camera_camera2(((GraphState.GraphStateError) graphState).m706getCameraErrorv7Vf74A()));
        }
        if (iOrdinal != 5) {
            if (iOrdinal != 6) {
                return null;
            }
            if (x.n(graphState, GraphState.GraphStateStopping.INSTANCE) || x.n(graphState, GraphState.GraphStateStopped.INSTANCE)) {
                return Companion.handleStateStop(graphState, z, stateError);
            }
            if (graphState instanceof GraphState.GraphStateError) {
                return Companion.resolveErrorEvent((GraphState.GraphStateError) graphState, CameraInternal.State.OPENING);
            }
            return null;
        }
        if (x.n(graphState, GraphState.GraphStateStarted.INSTANCE)) {
            return new CombinedCameraState(CameraInternal.State.OPEN, stateError2, i2, objArr11 == true ? 1 : 0);
        }
        if (graphState instanceof GraphState.GraphStateError) {
            return Companion.resolveErrorEvent((GraphState.GraphStateError) graphState, CameraInternal.State.OPENING);
        }
        if (x.n(graphState, GraphState.GraphStateStopping.INSTANCE) || x.n(graphState, GraphState.GraphStateStopped.INSTANCE)) {
            return Companion.handleStateStop(graphState, z, stateError);
        }
        return null;
    }

    public final LiveDataObservable<CameraInternal.State> getCameraInternalState$camera_camera2() {
        return this.cameraInternalState;
    }

    public final MutableLiveData<CameraState> getCameraState$camera_camera2() {
        return this.cameraState;
    }

    public final void onGraphClosed(CameraGraph cameraGraph) {
        x.f(cameraGraph, "cameraGraph");
        synchronized (this.lock) {
            if (x.n(this.currentGraph, cameraGraph)) {
                if (this.currentCameraInternalState != CameraInternal.State.CLOSED) {
                    postCameraState$default(this, CameraInternal.State.CLOSING, null, 2, null);
                    postCameraState$default(this, CameraInternal.State.CLOSED, null, 2, null);
                }
                this.closedGraph = cameraGraph;
                this.currentCameraInternalState = CameraInternal.State.CLOSED;
            }
        }
    }

    public final void onGraphStateUpdated(CameraGraph cameraGraph, GraphState graphState) {
        x.f(cameraGraph, "cameraGraph");
        x.f(graphState, "graphState");
        synchronized (this.lock) {
            if (this.isRemoved) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isWarnEnabled(Log.TAG)) {
                    android.util.Log.w(Camera2Logger.TRUNCATED_TAG, "Ignoring graph state update " + graphState + " on removed camera.");
                }
            } else {
                Camera2Logger camera2Logger2 = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, cameraGraph + " state updated to " + graphState);
                }
                handleStateTransition(cameraGraph, graphState);
                if (x.n(cameraGraph, this.currentGraph)) {
                    this.sessionLifecycleAdapter.dispatchSessionLifecycle$camera_camera2(graphState);
                }
            }
        }
    }

    public final void onGraphUpdated(CameraGraph cameraGraph) {
        x.f(cameraGraph, "cameraGraph");
        synchronized (this.lock) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Camera graph updated from " + this.currentGraph + " to " + cameraGraph);
            }
            if (this.currentCameraInternalState != CameraInternal.State.CLOSED) {
                postCameraState$default(this, CameraInternal.State.CLOSING, null, 2, null);
                postCameraState$default(this, CameraInternal.State.CLOSED, null, 2, null);
            }
            this.currentGraph = cameraGraph;
            this.closedGraph = null;
            this.currentCameraInternalState = CameraInternal.State.CLOSED;
            this.currentCameraStateError = null;
        }
    }

    public final void onRemoved() {
        CameraState.StateError stateErrorCreate = CameraState.StateError.create(8);
        x.e(stateErrorCreate, "create(...)");
        synchronized (this.lock) {
            if (!this.isRemoved) {
                Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
                if (Logger.isDebugEnabled(Log.TAG)) {
                    android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "Camera is removed, forcing state to CLOSED.");
                }
                this.isRemoved = true;
                CameraInternal.State state = CameraInternal.State.CLOSED;
                this.currentCameraInternalState = state;
                this.currentCameraStateError = stateErrorCreate;
                postCameraState(state, stateErrorCreate);
                this.currentGraph = null;
                this.closedGraph = null;
            }
        }
    }

    public final void removeCameraStateListener$camera_camera2(Consumer<CameraState> consumer) {
        x.f(consumer, "listener");
        synchronized (this.lock) {
            this.cameraStateListeners.remove(consumer);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {

        /* compiled from: WazeSource */
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CameraInternal.State.values().length];
                try {
                    iArr[CameraInternal.State.CLOSED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CameraInternal.State.OPENING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CameraInternal.State.OPEN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CameraInternal.State.CLOSING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CameraInternal.State.PENDING_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CombinedCameraState handleStateStop(GraphState graphState, boolean z, CameraState.StateError stateError) {
            if (z && stateError != null) {
                return new CombinedCameraState(CameraInternal.State.PENDING_OPEN, stateError);
            }
            if (x.n(graphState, GraphState.GraphStateStopping.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.CLOSING, stateError);
            }
            if (x.n(graphState, GraphState.GraphStateStopped.INSTANCE)) {
                return new CombinedCameraState(CameraInternal.State.CLOSED, stateError);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CombinedCameraState resolveErrorEvent(GraphState.GraphStateError graphStateError, CameraInternal.State state) {
            int iM706getCameraErrorv7Vf74A = graphStateError.m706getCameraErrorv7Vf74A();
            if (!m182isRecoverableError90vkdD0$camera_camera2(iM706getCameraErrorv7Vf74A) && !graphStateError.getWillAttemptRetry()) {
                return new CombinedCameraState(CameraInternal.State.CLOSING, m183toCameraStateError90vkdD0$camera_camera2(iM706getCameraErrorv7Vf74A));
            }
            CameraState.StateError stateErrorM183toCameraStateError90vkdD0$camera_camera2 = (!graphStateError.getWillAttemptRetry() || m182isRecoverableError90vkdD0$camera_camera2(iM706getCameraErrorv7Vf74A)) ? m183toCameraStateError90vkdD0$camera_camera2(iM706getCameraErrorv7Vf74A) : CameraState.StateError.create(3);
            if (!graphStateError.getWillAttemptRetry()) {
                state = CameraInternal.State.PENDING_OPEN;
            }
            return new CombinedCameraState(state, stateErrorM183toCameraStateError90vkdD0$camera_camera2);
        }

        /* renamed from: isRecoverableError-90vkdD0$camera_camera2, reason: not valid java name */
        public final boolean m182isRecoverableError90vkdD0$camera_camera2(int i2) {
            return CameraError.m474equalsimpl0(i2, CameraError.Companion.m484getERROR_CAMERA_DISCONNECTEDv7Vf74A()) || CameraError.m474equalsimpl0(i2, CameraError.Companion.m485getERROR_CAMERA_IN_USEv7Vf74A()) || CameraError.m474equalsimpl0(i2, CameraError.Companion.m486getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A()) || CameraError.m474equalsimpl0(i2, CameraError.Companion.m482getERROR_CAMERA_DEVICEv7Vf74A());
        }

        public final void setOrPostValue$camera_camera2(MutableLiveData<CameraState> mutableLiveData, CameraState cameraState) {
            x.f(mutableLiveData, "<this>");
            x.f(cameraState, "cameraState");
            if (x.n(Looper.myLooper(), Looper.getMainLooper())) {
                mutableLiveData.setValue(cameraState);
            } else {
                mutableLiveData.postValue(cameraState);
            }
        }

        public final CameraState.Type toCameraState$camera_camera2(CameraInternal.State state) {
            x.f(state, "<this>");
            CameraInternal.State state2 = CameraInternal.State.RELEASED;
            int iOrdinal = state.ordinal();
            if (iOrdinal == 2) {
                return CameraState.Type.CLOSED;
            }
            if (iOrdinal == 3) {
                return CameraState.Type.PENDING_OPEN;
            }
            if (iOrdinal == 4) {
                return CameraState.Type.CLOSING;
            }
            if (iOrdinal == 5) {
                return CameraState.Type.OPENING;
            }
            if (iOrdinal == 6) {
                return CameraState.Type.OPEN;
            }
            Objects.toString(state);
            throw new IllegalArgumentException("Unexpected CameraInternal state: ".concat(String.valueOf(state)));
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
        /* renamed from: toCameraStateError-90vkdD0$camera_camera2, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.camera.core.CameraState.StateError m183toCameraStateError90vkdD0$camera_camera2(int r3) {
            /*
                r2 = this;
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m494getERROR_UNDETERMINEDv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                r0 = 6
                if (r2 == 0) goto Lf
                goto Lc3
            Lf:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m485getERROR_CAMERA_IN_USEv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                r1 = 2
                if (r2 == 0) goto L1f
            L1c:
                r0 = r1
                goto Lc3
            L1f:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m486getERROR_CAMERA_LIMIT_EXCEEDEDv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto L2e
                r0 = 1
                goto Lc3
            L2e:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m483getERROR_CAMERA_DISABLEDv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto L3d
                r0 = 5
                goto Lc3
            L3d:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m482getERROR_CAMERA_DEVICEv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto L4c
                r0 = 3
                goto Lc3
            L4c:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m489getERROR_CAMERA_SERVICEv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto L5a
                goto Lc3
            L5a:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m484getERROR_CAMERA_DISCONNECTEDv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto L67
                goto L1c
            L67:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m492getERROR_ILLEGAL_ARGUMENT_EXCEPTIONv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto L74
                goto Lc3
            L74:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m493getERROR_SECURITY_EXCEPTIONv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto L81
                goto Lc3
            L81:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m491getERROR_GRAPH_CONFIGv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto L8f
                r0 = 4
                goto Lc3
            L8f:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m490getERROR_DO_NOT_DISTURB_ENABLEDv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto L9d
                r0 = 7
                goto Lc3
            L9d:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m495getERROR_UNKNOWN_EXCEPTIONv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto Laa
                goto Lc3
            Laa:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m487getERROR_CAMERA_OPENERv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto Lb7
                goto Lc3
            Lb7:
                androidx.camera.camera2.pipe.CameraError$Companion r2 = androidx.camera.camera2.pipe.CameraError.Companion
                int r2 = r2.m488getERROR_CAMERA_OPEN_TIMEOUTv7Vf74A()
                boolean r2 = androidx.camera.camera2.pipe.CameraError.m474equalsimpl0(r3, r2)
                if (r2 == 0) goto Lcd
            Lc3:
                androidx.camera.core.CameraState$StateError r2 = androidx.camera.core.CameraState.StateError.create(r0)
                java.lang.String r3 = "create(...)"
                h.g.b.x.e(r2, r3)
                return r2
            Lcd:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r3 = androidx.camera.camera2.pipe.CameraError.m477toStringimpl(r3)
                java.lang.String r0 = "Unexpected CameraError: "
                java.lang.String r3 = r0.concat(r3)
                r2.<init>(r3)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.adapter.CameraStateAdapter.Companion.m183toCameraStateError90vkdD0$camera_camera2(int):androidx.camera.core.CameraState$StateError");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public final class CombinedCameraState {
        private final CameraState.StateError error;
        private final CameraInternal.State state;

        public CombinedCameraState(CameraInternal.State state, CameraState.StateError stateError) {
            x.f(state, "state");
            this.state = state;
            this.error = stateError;
        }

        public static /* synthetic */ CombinedCameraState copy$default(CombinedCameraState combinedCameraState, CameraInternal.State state, CameraState.StateError stateError, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                state = combinedCameraState.state;
            }
            if ((i2 & 2) != 0) {
                stateError = combinedCameraState.error;
            }
            return combinedCameraState.copy(state, stateError);
        }

        public final CameraInternal.State component1() {
            return this.state;
        }

        public final CameraState.StateError component2() {
            return this.error;
        }

        public final CombinedCameraState copy(CameraInternal.State state, CameraState.StateError stateError) {
            x.f(state, "state");
            return new CombinedCameraState(state, stateError);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CombinedCameraState)) {
                return false;
            }
            CombinedCameraState combinedCameraState = (CombinedCameraState) obj;
            return this.state == combinedCameraState.state && x.n(this.error, combinedCameraState.error);
        }

        public final CameraState.StateError getError() {
            return this.error;
        }

        public final CameraInternal.State getState() {
            return this.state;
        }

        public int hashCode() {
            int iHashCode = this.state.hashCode() * 31;
            CameraState.StateError stateError = this.error;
            return iHashCode + (stateError == null ? 0 : stateError.hashCode());
        }

        public String toString() {
            return "CombinedCameraState(state=" + this.state + ", error=" + this.error + ")";
        }

        public /* synthetic */ CombinedCameraState(CameraInternal.State state, CameraState.StateError stateError, int i2, o oVar) {
            this(state, (i2 & 2) != 0 ? null : stateError);
        }
    }
}
