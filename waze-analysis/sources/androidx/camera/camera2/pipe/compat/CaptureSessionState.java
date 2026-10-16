package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraExtensionSession;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.CameraSurfaceManager;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.TimeSource;
import androidx.camera.camera2.pipe.core.TimestampNs;
import androidx.camera.camera2.pipe.graph.GraphListener;
import androidx.camera.camera2.pipe.graph.GraphRequestProcessor;
import h.a.i;
import h.a.r;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CaptureSessionState implements CameraCaptureSessionWrapper.StateCallback {
    private static final long ABORT_CAPTURES_TIMEOUT;
    private static final long CAPTURE_SESSION_TIMEOUT;
    private static final long CLOSE_SESSION_TIMEOUT;
    private static final Companion Companion = new Companion(null);
    private CameraDeviceWrapper _cameraDevice;
    private Map<StreamId, ? extends Surface> _surfaceMap;
    private final Map<Surface, AutoCloseable> _surfaceTokenMap;
    private final Map<OutputId, Surface> activeOutputSurfaceMap;
    private final Map<StreamId, Surface> activeStreamSurfaceMap;
    private ConfiguredCameraCaptureSession cameraCaptureSession;
    private final CameraGraph.Flags cameraGraphFlags;
    private final CameraSurfaceManager cameraSurfaceManager;
    private final Camera2CaptureSequenceProcessorFactory captureSequenceProcessorFactory;
    private final CountDownLatch captureSessionAttemptCompleted;
    private final CaptureSessionFactory captureSessionFactory;
    private final ConcurrentSessionSequencer concurrentSessionSequencer;
    private final int debugId;
    private final kotlinx.a.d<Boolean> finalized;
    private final GraphListener graphListener;
    private boolean hasAttemptedCaptureSession;
    private final Object lock;
    private Map<StreamId, ? extends OutputConfigurationWrapper> pendingOutputMap;
    private Map<StreamId, ? extends Surface> pendingSurfaceMap;
    private final af scope;
    private TimestampNs sessionCreatingTimestamp;
    private final CountDownLatch sessionDisconnected;
    private final SessionSequencer sessionSequencer;
    private State state;
    private final StreamGraph streamGraph;
    private final StrictMode strictMode;
    private final Threads threads;
    private final TimeSource timeSource;

    /* compiled from: WazeSource */
    final class ConfiguredCameraCaptureSession {
        private final Camera2CaptureSequenceProcessor captureSequenceProcessor;
        private final GraphRequestProcessor processor;
        private final CameraCaptureSessionWrapper session;

        public ConfiguredCameraCaptureSession(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, GraphRequestProcessor graphRequestProcessor, Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor) {
            x.f(cameraCaptureSessionWrapper, "session");
            x.f(graphRequestProcessor, "processor");
            this.session = cameraCaptureSessionWrapper;
            this.processor = graphRequestProcessor;
            this.captureSequenceProcessor = camera2CaptureSequenceProcessor;
        }

        public static /* synthetic */ ConfiguredCameraCaptureSession copy$default(ConfiguredCameraCaptureSession configuredCameraCaptureSession, CameraCaptureSessionWrapper cameraCaptureSessionWrapper, GraphRequestProcessor graphRequestProcessor, Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cameraCaptureSessionWrapper = configuredCameraCaptureSession.session;
            }
            if ((i2 & 2) != 0) {
                graphRequestProcessor = configuredCameraCaptureSession.processor;
            }
            if ((i2 & 4) != 0) {
                camera2CaptureSequenceProcessor = configuredCameraCaptureSession.captureSequenceProcessor;
            }
            return configuredCameraCaptureSession.copy(cameraCaptureSessionWrapper, graphRequestProcessor, camera2CaptureSequenceProcessor);
        }

        public final CameraCaptureSessionWrapper component1() {
            return this.session;
        }

        public final GraphRequestProcessor component2() {
            return this.processor;
        }

        public final Camera2CaptureSequenceProcessor component3() {
            return this.captureSequenceProcessor;
        }

        public final ConfiguredCameraCaptureSession copy(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, GraphRequestProcessor graphRequestProcessor, Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor) {
            x.f(cameraCaptureSessionWrapper, "session");
            x.f(graphRequestProcessor, "processor");
            return new ConfiguredCameraCaptureSession(cameraCaptureSessionWrapper, graphRequestProcessor, camera2CaptureSequenceProcessor);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfiguredCameraCaptureSession)) {
                return false;
            }
            ConfiguredCameraCaptureSession configuredCameraCaptureSession = (ConfiguredCameraCaptureSession) obj;
            return x.n(this.session, configuredCameraCaptureSession.session) && x.n(this.processor, configuredCameraCaptureSession.processor) && x.n(this.captureSequenceProcessor, configuredCameraCaptureSession.captureSequenceProcessor);
        }

        public final Camera2CaptureSequenceProcessor getCaptureSequenceProcessor() {
            return this.captureSequenceProcessor;
        }

        public final GraphRequestProcessor getProcessor() {
            return this.processor;
        }

        public final CameraCaptureSessionWrapper getSession() {
            return this.session;
        }

        public int hashCode() {
            int iHashCode = (this.session.hashCode() * 31) + this.processor.hashCode();
            Camera2CaptureSequenceProcessor camera2CaptureSequenceProcessor = this.captureSequenceProcessor;
            return (iHashCode * 31) + (camera2CaptureSequenceProcessor == null ? 0 : camera2CaptureSequenceProcessor.hashCode());
        }

        public String toString() {
            return "ConfiguredCameraCaptureSession(session=" + this.session + ", processor=" + this.processor + ", captureSequenceProcessor=" + this.captureSequenceProcessor + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    final class State {
        private static final /* synthetic */ h.d.a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State PENDING = new State("PENDING", 0);
        public static final State CREATING = new State("CREATING", 1);
        public static final State CREATED = new State("CREATED", 2);
        public static final State CLOSING = new State("CLOSING", 3);
        public static final State CLOSED = new State("CLOSED", 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{PENDING, CREATING, CREATED, CLOSING, CLOSED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = h.d.b.a(stateArr$values);
        }

        private State(String str, int i2) {
        }

        public static h.d.a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$12, reason: invalid class name */
    final class AnonymousClass12 extends h.c.b.a.g implements l<h.c.e<? super ab>, Object> {
        final /* synthetic */ ConfiguredCameraCaptureSession $captureSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass12(ConfiguredCameraCaptureSession configuredCameraCaptureSession, h.c.e<? super AnonymousClass12> eVar) {
            super(1, eVar);
            this.$captureSession = configuredCameraCaptureSession;
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(h.c.e<?> eVar) {
            return CaptureSessionState.this.new AnonymousClass12(this.$captureSession, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(h.c.e<? super ab> eVar) {
            return ((AnonymousClass12) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            CaptureSessionState captureSessionState = CaptureSessionState.this;
            Objects.toString(captureSessionState);
            ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.$captureSession;
            CaptureSessionState captureSessionState2 = CaptureSessionState.this;
            try {
                Trace.beginSection(String.valueOf(captureSessionState).concat(" CameraCaptureSessionWrapper#close"));
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Closing capture session for " + captureSessionState2);
                }
                CaptureSessionState$disconnect$12$$ExternalSyntheticAutoCloseableDispatcher0.m(configuredCameraCaptureSession.getSession());
                Trace.endSection();
                return ab.f48028a;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$3, reason: invalid class name */
    final class AnonymousClass3 extends h.c.b.a.g implements l<h.c.e<? super ab>, Object> {
        int label;

        AnonymousClass3(h.c.e<? super AnonymousClass3> eVar) {
            super(1, eVar);
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(h.c.e<?> eVar) {
            return CaptureSessionState.this.new AnonymousClass3(eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(h.c.e<? super ab> eVar) {
            return ((AnonymousClass3) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            CaptureSessionState.this.captureSessionAttemptCompleted.await();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.CaptureSessionState$disconnect$9, reason: invalid class name */
    final class AnonymousClass9 extends h.c.b.a.g implements l<h.c.e<? super ab>, Object> {
        final /* synthetic */ GraphRequestProcessor $graphProcessor;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(GraphRequestProcessor graphRequestProcessor, h.c.e<? super AnonymousClass9> eVar) {
            super(1, eVar);
            this.$graphProcessor = graphRequestProcessor;
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(h.c.e<?> eVar) {
            return CaptureSessionState.this.new AnonymousClass9(this.$graphProcessor, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(h.c.e<? super ab> eVar) {
            return ((AnonymousClass9) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            CaptureSessionState captureSessionState = CaptureSessionState.this;
            Objects.toString(captureSessionState);
            GraphRequestProcessor graphRequestProcessor = this.$graphProcessor;
            try {
                Trace.beginSection(String.valueOf(captureSessionState).concat(" stopRepeating"));
                graphRequestProcessor.stopRepeating$camera_camera2_pipe();
                Trace.endSection();
                CaptureSessionState captureSessionState2 = CaptureSessionState.this;
                Objects.toString(captureSessionState2);
                GraphRequestProcessor graphRequestProcessor2 = this.$graphProcessor;
                try {
                    Trace.beginSection(String.valueOf(captureSessionState2).concat(" abortCaptures"));
                    graphRequestProcessor2.abortCaptures$camera_camera2_pipe();
                    Trace.endSection();
                    return ab.f48028a;
                } finally {
                }
            } finally {
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.CaptureSessionState$tryCreateCaptureSession$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(h.c.e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CaptureSessionState.this.tryCreateCaptureSession(this);
        }
    }

    static {
        h.o.c cVar = h.o.a.f48264a;
        CAPTURE_SESSION_TIMEOUT = h.o.c.i(3, h.o.d.f48273d);
        ABORT_CAPTURES_TIMEOUT = h.o.c.i(2, h.o.d.f48273d);
        CLOSE_SESSION_TIMEOUT = h.o.c.i(3, h.o.d.f48273d);
    }

    public CaptureSessionState(GraphListener graphListener, CaptureSessionFactory captureSessionFactory, Camera2CaptureSequenceProcessorFactory camera2CaptureSequenceProcessorFactory, CameraSurfaceManager cameraSurfaceManager, TimeSource timeSource, CameraGraph.Flags flags, ConcurrentSessionSequencer concurrentSessionSequencer, StreamGraph streamGraph, StrictMode strictMode, Threads threads, af afVar) {
        x.f(graphListener, "graphListener");
        x.f(captureSessionFactory, "captureSessionFactory");
        x.f(camera2CaptureSequenceProcessorFactory, "captureSequenceProcessorFactory");
        x.f(cameraSurfaceManager, "cameraSurfaceManager");
        x.f(timeSource, "timeSource");
        x.f(flags, "cameraGraphFlags");
        x.f(streamGraph, "streamGraph");
        x.f(strictMode, "strictMode");
        x.f(threads, "threads");
        x.f(afVar, "scope");
        this.graphListener = graphListener;
        this.captureSessionFactory = captureSessionFactory;
        this.captureSequenceProcessorFactory = camera2CaptureSequenceProcessorFactory;
        this.cameraSurfaceManager = cameraSurfaceManager;
        this.timeSource = timeSource;
        this.cameraGraphFlags = flags;
        this.concurrentSessionSequencer = concurrentSessionSequencer;
        this.streamGraph = streamGraph;
        this.strictMode = strictMode;
        this.threads = threads;
        this.scope = afVar;
        this.debugId = CaptureSessionStateKt.getCaptureSessionDebugIds().e();
        this.lock = new Object();
        this.finalized = h.e.b.h(false);
        this.activeStreamSurfaceMap = DesugarCollections.synchronizedMap(new HashMap());
        this.activeOutputSurfaceMap = DesugarCollections.synchronizedMap(new HashMap());
        this.sessionSequencer = concurrentSessionSequencer != null ? new SessionSequencer(concurrentSessionSequencer) : null;
        this.state = State.PENDING;
        this.sessionDisconnected = new CountDownLatch(1);
        this.captureSessionAttemptCompleted = new CountDownLatch(1);
        this._surfaceTokenMap = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void configure(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper r12) {
        /*
            r11 = this;
            java.lang.String r0 = "Configured "
            java.lang.Object r1 = r11.lock
            monitor-enter(r1)
            androidx.camera.camera2.pipe.compat.CaptureSessionState$ConfiguredCameraCaptureSession r2 = r11.cameraCaptureSession     // Catch: java.lang.Throwable -> Lca
            r3 = 0
            if (r2 != 0) goto L40
            if (r12 == 0) goto L40
            androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessorFactory r2 = r11.captureSequenceProcessorFactory     // Catch: java.lang.Throwable -> Lca
            java.util.Map<androidx.camera.camera2.pipe.StreamId, android.view.Surface> r4 = r11.activeStreamSurfaceMap     // Catch: java.lang.Throwable -> Lca
            java.lang.String r5 = "activeStreamSurfaceMap"
            h.g.b.x.e(r4, r5)     // Catch: java.lang.Throwable -> Lca
            java.util.Map<androidx.camera.camera2.pipe.OutputId, android.view.Surface> r5 = r11.activeOutputSurfaceMap     // Catch: java.lang.Throwable -> Lca
            java.lang.String r6 = "activeOutputSurfaceMap"
            h.g.b.x.e(r5, r6)     // Catch: java.lang.Throwable -> Lca
            androidx.camera.camera2.pipe.CaptureSequenceProcessor r2 = r2.create(r12, r4, r5)     // Catch: java.lang.Throwable -> Lca
            boolean r4 = r2 instanceof androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor     // Catch: java.lang.Throwable -> Lca
            if (r4 == 0) goto L32
            androidx.camera.camera2.pipe.compat.CaptureSessionState$ConfiguredCameraCaptureSession r4 = new androidx.camera.camera2.pipe.compat.CaptureSessionState$ConfiguredCameraCaptureSession     // Catch: java.lang.Throwable -> Lca
            androidx.camera.camera2.pipe.graph.GraphRequestProcessor$Companion r5 = androidx.camera.camera2.pipe.graph.GraphRequestProcessor.Companion     // Catch: java.lang.Throwable -> Lca
            androidx.camera.camera2.pipe.graph.GraphRequestProcessor r5 = r5.from(r2)     // Catch: java.lang.Throwable -> Lca
            androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor r2 = (androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor) r2     // Catch: java.lang.Throwable -> Lca
            r4.<init>(r12, r5, r2)     // Catch: java.lang.Throwable -> Lca
            goto L3d
        L32:
            androidx.camera.camera2.pipe.compat.CaptureSessionState$ConfiguredCameraCaptureSession r4 = new androidx.camera.camera2.pipe.compat.CaptureSessionState$ConfiguredCameraCaptureSession     // Catch: java.lang.Throwable -> Lca
            androidx.camera.camera2.pipe.graph.GraphRequestProcessor$Companion r5 = androidx.camera.camera2.pipe.graph.GraphRequestProcessor.Companion     // Catch: java.lang.Throwable -> Lca
            androidx.camera.camera2.pipe.graph.GraphRequestProcessor r2 = r5.from(r2)     // Catch: java.lang.Throwable -> Lca
            r4.<init>(r12, r2, r3)     // Catch: java.lang.Throwable -> Lca
        L3d:
            r2 = r4
            r11.cameraCaptureSession = r2     // Catch: java.lang.Throwable -> Lca
        L40:
            androidx.camera.camera2.pipe.compat.CaptureSessionState$State r12 = r11.state     // Catch: java.lang.Throwable -> Lca
            androidx.camera.camera2.pipe.compat.CaptureSessionState$State r4 = androidx.camera.camera2.pipe.compat.CaptureSessionState.State.CREATED     // Catch: java.lang.Throwable -> Lca
            if (r12 != r4) goto Lc8
            if (r2 != 0) goto L4a
            goto Lc8
        L4a:
            java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends androidx.camera.camera2.pipe.compat.OutputConfigurationWrapper> r12 = r11.pendingOutputMap     // Catch: java.lang.Throwable -> Lca
            r4 = 1
            r5 = 0
            if (r12 == 0) goto L56
            java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> r12 = r11.pendingSurfaceMap     // Catch: java.lang.Throwable -> Lca
            if (r12 == 0) goto L56
            r12 = r4
            goto L57
        L56:
            r12 = r5
        L57:
            monitor-exit(r1)
            if (r12 == 0) goto L5d
            r11.finalizeOutputsIfAvailable(r5)
        L5d:
            java.lang.Object r12 = r11.lock
            monitor-enter(r12)
            androidx.camera.camera2.pipe.core.Log r1 = androidx.camera.camera2.pipe.core.Log.INSTANCE     // Catch: java.lang.Throwable -> Lc5
            boolean r1 = r1.getINFO_LOGGABLE()     // Catch: java.lang.Throwable -> Lc5
            if (r1 == 0) goto Lba
            java.lang.String r1 = "CXCP"
            androidx.camera.camera2.pipe.core.TimeSource r6 = access$getTimeSource$p(r11)     // Catch: java.lang.Throwable -> Lc5
            long r6 = r6.mo1117nowvQl9yQU()     // Catch: java.lang.Throwable -> Lc5
            androidx.camera.camera2.pipe.core.TimestampNs r8 = access$getSessionCreatingTimestamp$p(r11)     // Catch: java.lang.Throwable -> Lc5
            h.g.b.x.c(r8)     // Catch: java.lang.Throwable -> Lc5
            long r8 = r8.m1128unboximpl()     // Catch: java.lang.Throwable -> Lc5
            h.o.c r10 = h.o.a.f48264a     // Catch: java.lang.Throwable -> Lc5
            long r6 = r6 - r8
            h.o.d r8 = h.o.d.f48270a     // Catch: java.lang.Throwable -> Lc5
            long r6 = h.o.c.j(r6, r8)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r8 = "%.3f ms"
            h.o.d r9 = h.o.d.f48272c     // Catch: java.lang.Throwable -> Lc5
            double r6 = h.o.a.b(r6, r9)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lc5
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r7, r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r3 = java.lang.String.format(r3, r8, r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r4 = "format(...)"
            h.g.b.x.e(r3, r4)     // Catch: java.lang.Throwable -> Lc5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Lc5
            r4.append(r11)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = " in "
            r4.append(r0)     // Catch: java.lang.Throwable -> Lc5
            r4.append(r3)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Lc5
            android.util.Log.i(r1, r0)     // Catch: java.lang.Throwable -> Lc5
        Lba:
            androidx.camera.camera2.pipe.graph.GraphListener r11 = r11.graphListener     // Catch: java.lang.Throwable -> Lc5
            androidx.camera.camera2.pipe.graph.GraphRequestProcessor r0 = r2.getProcessor()     // Catch: java.lang.Throwable -> Lc5
            r11.onGraphStarted(r0)     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r12)
            return
        Lc5:
            r11 = move-exception
            monitor-exit(r12)
            throw r11
        Lc8:
            monitor-exit(r1)
            return
        Lca:
            r11 = move-exception
            monitor-exit(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.CaptureSessionState.configure(androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finalizeOutputsIfAvailable(boolean z) {
        boolean z2;
        synchronized (this.lock) {
            ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.cameraCaptureSession;
            Map<StreamId, ? extends OutputConfigurationWrapper> map = this.pendingOutputMap;
            Map<StreamId, ? extends Surface> map2 = this.pendingSurfaceMap;
            if (configuredCameraCaptureSession != null && map != null && map2 != null) {
                this.pendingOutputMap = null;
                this.pendingSurfaceMap = null;
                toString();
                Trace.beginSection(toString().concat("#finalizeOutputConfigurations"));
                long jMo1117nowvQl9yQU = this.timeSource.mo1117nowvQl9yQU();
                for (Map.Entry<StreamId, ? extends OutputConfigurationWrapper> entry : map.entrySet()) {
                    int iM980unboximpl = entry.getKey().m980unboximpl();
                    OutputConfigurationWrapper value = entry.getValue();
                    Surface surface = map2.get(StreamId.m974boximpl(iM980unboximpl));
                    if (surface == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    value.addSurface(surface);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator<Map.Entry<StreamId, ? extends OutputConfigurationWrapper>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(it.next().getValue());
                }
                configuredCameraCaptureSession.getSession().finalizeOutputConfigurations(i.ao(linkedHashSet));
                synchronized (this.lock) {
                    z2 = false;
                    if (this.state == State.CREATED) {
                        this.activeStreamSurfaceMap.putAll(map2);
                        for (Map.Entry<StreamId, ? extends Surface> entry2 : map2.entrySet()) {
                            int iM980unboximpl2 = entry2.getKey().m980unboximpl();
                            Surface value2 = entry2.getValue();
                            CameraStream cameraStreamMo962getaKI5c8E = this.streamGraph.mo962getaKI5c8E(iM980unboximpl2);
                            if (cameraStreamMo962getaKI5c8E == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            if (cameraStreamMo962getaKI5c8E.getOutputs().size() != 1) {
                                throw new IllegalStateException("Cannot finalize a multi-output stream!");
                            }
                            Map<OutputId, Surface> map3 = this.activeOutputSurfaceMap;
                            x.e(map3, "activeOutputSurfaceMap");
                            map3.put(OutputId.m734boximpl(((OutputStream) i.X(cameraStreamMo962getaKI5c8E.getOutputs())).mo758getId4LaLFng()), value2);
                        }
                        if (Log.INSTANCE.getINFO_LOGGABLE()) {
                            long jMo1117nowvQl9yQU2 = this.timeSource.mo1117nowvQl9yQU();
                            h.o.c cVar = h.o.a.f48264a;
                            long j2 = h.o.c.j(jMo1117nowvQl9yQU2 - jMo1117nowvQl9yQU, h.o.d.f48270a);
                            ArrayList arrayList = new ArrayList(map.size());
                            Iterator<Map.Entry<StreamId, ? extends OutputConfigurationWrapper>> it2 = map.entrySet().iterator();
                            while (it2.hasNext()) {
                                arrayList.add(StreamId.m974boximpl(it2.next().getKey().m980unboximpl()));
                            }
                            String str = String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(h.o.a.b(j2, h.o.d.f48272c))}, 1));
                            x.e(str, "format(...)");
                            android.util.Log.i(Log.TAG, "Finalized " + arrayList + " for " + this + " in " + str);
                        }
                        z2 = true;
                    }
                }
                if (z2 && z) {
                    this.graphListener.onGraphModified(configuredCameraCaptureSession.getProcessor());
                }
                Trace.endSection();
            }
        }
    }

    /* renamed from: finalizeSession-LRDsOJo$camera_camera2_pipe$default, reason: not valid java name */
    public static /* synthetic */ void m1077finalizeSessionLRDsOJo$camera_camera2_pipe$default(CaptureSessionState captureSessionState, long j2, int i2, Object obj) throws Exception {
        if ((i2 & 1) != 0) {
            h.o.c cVar = h.o.a.f48264a;
            j2 = h.o.c.i(0, h.o.d.f48272c);
        }
        captureSessionState.m1078finalizeSessionLRDsOJo$camera_camera2_pipe(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryCreateCaptureSession(h.c.e<? super h.ab> r11) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.CaptureSessionState.tryCreateCaptureSession(h.c.e):java.lang.Object");
    }

    private final void updateTrackedSurfaces(Map<StreamId, ? extends Surface> map, Map<StreamId, ? extends Surface> map2) throws Exception {
        Set setAu = i.au(map.values());
        Set setAu2 = i.au(map2.values());
        for (Surface surface : e.c.d.a.t(setAu, setAu2)) {
            AutoCloseable autoCloseableRemove = this._surfaceTokenMap.remove(surface);
            if (autoCloseableRemove != null) {
                CaptureSessionState$$ExternalSyntheticAutoCloseableDispatcher0.m(autoCloseableRemove);
            } else {
                autoCloseableRemove = null;
            }
            if (autoCloseableRemove == null) {
                throw new IllegalStateException(a.a(surface, "Surface ", " doesn't have a matching surface token!"));
            }
        }
        for (Surface surface2 : e.c.d.a.t(setAu2, setAu)) {
            this._surfaceTokenMap.put(surface2, this.cameraSurfaceManager.registerSurface$camera_camera2_pipe(surface2));
        }
    }

    public final void configureSurfaceMap(Map<StreamId, ? extends Surface> map) {
        x.f(map, "surfaces");
        synchronized (this.lock) {
            if (this.state != State.CLOSING && this.state != State.CLOSED) {
                Map<StreamId, ? extends Surface> mapJ = this._surfaceMap;
                if (mapJ == null) {
                    mapJ = r.j();
                }
                updateTrackedSurfaces(mapJ, map);
                this._surfaceMap = map;
                Map<StreamId, ? extends OutputConfigurationWrapper> map2 = this.pendingOutputMap;
                if (map2 != null && this.pendingSurfaceMap == null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<StreamId, ? extends Surface> entry : map.entrySet()) {
                        if (map2.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (linkedHashMap.size() == map2.size()) {
                        this.pendingSurfaceMap = linkedHashMap;
                        aj.z(this.scope, null, null, new CaptureSessionState$configureSurfaceMap$1$1(this, null), 3);
                    }
                }
                aj.z(this.scope, null, null, new CaptureSessionState$configureSurfaceMap$1$2(this, null), 3);
            }
        }
    }

    public final void disconnect() {
        synchronized (this.lock) {
            State state = this.state;
            State state2 = State.CLOSING;
            if (state == state2 || this.state == State.CLOSED) {
                return;
            }
            this.state = state2;
            ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.cameraCaptureSession;
            boolean z = false;
            if (configuredCameraCaptureSession != null) {
                this.cameraCaptureSession = null;
            } else {
                if (this.cameraGraphFlags.getCloseCaptureSessionOnDisconnect() && this.hasAttemptedCaptureSession) {
                    z = true;
                }
                configuredCameraCaptureSession = null;
            }
            SessionSequencer sessionSequencer = this.sessionSequencer;
            if (sessionSequencer != null) {
                sessionSequencer.release();
            }
            if (z) {
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, "Waiting for CameraCaptureSession configuration");
                }
                if (((ab) this.threads.m1119runBlockingCheckedOrNullVtjQ1oo(CAPTURE_SESSION_TIMEOUT, new AnonymousClass3(null))) == null && Log.INSTANCE.getERROR_LOGGABLE()) {
                    android.util.Log.e(Log.TAG, "Waiting for CameraCaptureSession configuration timed out");
                }
                synchronized (this.lock) {
                    configuredCameraCaptureSession = this.cameraCaptureSession;
                    this.cameraCaptureSession = null;
                }
            }
            GraphListener graphListener = this.graphListener;
            Objects.toString(graphListener);
            Trace.beginSection(String.valueOf(graphListener).concat("#onGraphStopping"));
            this.graphListener.onGraphStopping();
            Trace.endSection();
            if (configuredCameraCaptureSession != null) {
                GraphRequestProcessor processor = configuredCameraCaptureSession.getProcessor();
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    toString();
                    android.util.Log.d(Log.TAG, toString().concat(" Shutdown"));
                }
                toString();
                Trace.beginSection(toString().concat("#shutdown"));
                if (this.cameraGraphFlags.getAbortCapturesOnStop() && ((ab) this.threads.m1119runBlockingCheckedOrNullVtjQ1oo(ABORT_CAPTURES_TIMEOUT, new AnonymousClass9(processor, null))) == null && Log.INSTANCE.getERROR_LOGGABLE()) {
                    android.util.Log.e(Log.TAG, "Failed to abort captures in ".concat(h.o.a.y(ABORT_CAPTURES_TIMEOUT)));
                }
                toString();
                Trace.beginSection(toString().concat("#disconnect"));
                Camera2CaptureSequenceProcessor captureSequenceProcessor = configuredCameraCaptureSession.getCaptureSequenceProcessor();
                if (captureSequenceProcessor != null) {
                    captureSequenceProcessor.disconnect$camera_camera2_pipe();
                }
                Trace.endSection();
                if (this.cameraGraphFlags.getCloseCaptureSessionOnDisconnect() && ((ab) this.threads.m1119runBlockingCheckedOrNullVtjQ1oo(CLOSE_SESSION_TIMEOUT, new AnonymousClass12(configuredCameraCaptureSession, null))) == null && Log.INSTANCE.getERROR_LOGGABLE()) {
                    android.util.Log.e(Log.TAG, "Failed to close the capture session in ".concat(h.o.a.y(CLOSE_SESSION_TIMEOUT)));
                }
                GraphListener graphListener2 = this.graphListener;
                Objects.toString(graphListener2);
                Trace.beginSection(String.valueOf(graphListener2).concat("#onGraphStopped"));
                this.graphListener.onGraphStopped(processor);
                Trace.endSection();
                Trace.endSection();
            } else {
                GraphListener graphListener3 = this.graphListener;
                Objects.toString(graphListener3);
                Trace.beginSection(String.valueOf(graphListener3).concat("#onGraphStopped"));
                this.graphListener.onGraphStopped(null);
                Trace.endSection();
            }
            this.sessionDisconnected.countDown();
        }
    }

    /* renamed from: finalizeSession-LRDsOJo$camera_camera2_pipe, reason: not valid java name */
    public final void m1078finalizeSessionLRDsOJo$camera_camera2_pipe(long j2) throws Exception {
        List listAo;
        h.o.c cVar = h.o.a.f48264a;
        if (!h.o.a.A(j2, h.o.c.i(0, h.o.d.f48272c))) {
            aj.z(this.scope, null, null, new CaptureSessionState$finalizeSession$1(j2, this, null), 3);
            return;
        }
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, "Finalizing ".concat(toString()));
        }
        synchronized (this.lock) {
            listAo = i.ao(this._surfaceTokenMap.values());
            this._surfaceTokenMap.clear();
        }
        Iterator it = listAo.iterator();
        while (it.hasNext()) {
            CaptureSessionState$$ExternalSyntheticAutoCloseableDispatcher0.m((AutoCloseable) it.next());
        }
    }

    public final CameraDeviceWrapper getCameraDevice() {
        CameraDeviceWrapper cameraDeviceWrapper;
        synchronized (this.lock) {
            cameraDeviceWrapper = this._cameraDevice;
        }
        return cameraDeviceWrapper;
    }

    public final CameraExtensionSession.StillCaptureLatency getRealtimeCaptureLatency() {
        if (Build.VERSION.SDK_INT >= 31) {
            ConfiguredCameraCaptureSession configuredCameraCaptureSession = this.cameraCaptureSession;
            CameraCaptureSessionWrapper session = configuredCameraCaptureSession != null ? configuredCameraCaptureSession.getSession() : null;
            AndroidCameraExtensionSession androidCameraExtensionSession = session instanceof AndroidCameraExtensionSession ? (AndroidCameraExtensionSession) session : null;
            if (androidCameraExtensionSession != null) {
                return androidCameraExtensionSession.getRealTimeCaptureLatency();
            }
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onActive(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        x.f(cameraCaptureSessionWrapper, "session");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" Active"));
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        x.f(cameraCaptureSessionWrapper, "session");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" CaptureQueueEmpty"));
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onClosed(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        x.f(cameraCaptureSessionWrapper, "session");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" Closed"));
        }
        toString();
        Trace.beginSection(toString().concat("#onClosed"));
        shutdown();
        this.captureSessionAttemptCompleted.countDown();
        SessionSequencer sessionSequencer = this.sessionSequencer;
        if (sessionSequencer != null) {
            sessionSequencer.release();
        }
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onConfigureFailed(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        x.f(cameraCaptureSessionWrapper, "session");
        if (Log.INSTANCE.getWARN_LOGGABLE()) {
            toString();
            android.util.Log.w(Log.TAG, toString().concat(" Configuration Failed"));
        }
        toString();
        Trace.beginSection(toString().concat("#onConfigureFailed"));
        this.graphListener.onGraphError(new GraphState.GraphStateError(CameraError.Companion.m491getERROR_GRAPH_CONFIGv7Vf74A(), false, null));
        shutdown();
        this.captureSessionAttemptCompleted.countDown();
        SessionSequencer sessionSequencer = this.sessionSequencer;
        if (sessionSequencer != null) {
            sessionSequencer.release();
        }
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onConfigured(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        x.f(cameraCaptureSessionWrapper, "session");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" Configured"));
        }
        toString();
        Trace.beginSection(toString().concat("#configure"));
        configure(cameraCaptureSessionWrapper);
        this.captureSessionAttemptCompleted.countDown();
        SessionSequencer sessionSequencer = this.sessionSequencer;
        if (sessionSequencer != null) {
            sessionSequencer.release();
        }
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.compat.CameraCaptureSessionWrapper.StateCallback
    public void onReady(CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        x.f(cameraCaptureSessionWrapper, "session");
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" Ready"));
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public void onSessionDisconnected() {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, toString().concat(" session disconnecting"));
        }
        toString();
        Trace.beginSection(toString().concat("#onSessionDisconnected"));
        disconnect();
        toString();
        try {
            Trace.beginSection(toString().concat("#onSessionDisconnected Await"));
            this.sessionDisconnected.await();
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.compat.SessionStateCallback
    public void onSessionFinalized() throws Exception {
        if (this.finalized.e(false, true)) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                toString();
                android.util.Log.d(Log.TAG, toString().concat(" session finalizing"));
            }
            toString();
            Trace.beginSection(toString().concat("#onSessionFinalized"));
            shutdown();
            m1077finalizeSessionLRDsOJo$camera_camera2_pipe$default(this, 0L, 1, null);
            Trace.endSection();
        }
    }

    public final void setCameraDevice(CameraDeviceWrapper cameraDeviceWrapper) {
        synchronized (this.lock) {
            if (this.state != State.CLOSING && this.state != State.CLOSED) {
                this._cameraDevice = cameraDeviceWrapper;
                if (cameraDeviceWrapper != null) {
                    aj.z(this.scope, null, null, new CaptureSessionState$cameraDevice$2$1(this, null), 3);
                }
            }
        }
    }

    public final void shutdown() {
        disconnect();
        h.o.c cVar = h.o.a.f48264a;
        boolean z = false;
        long jI = h.o.c.i(0, h.o.d.f48272c);
        synchronized (this.lock) {
            if (this.state != State.CLOSED) {
                if (this._cameraDevice == null || !this.hasAttemptedCaptureSession) {
                    z = true;
                } else {
                    int iM515getFinalizeSessionOnCloseBehaviorBm6Tfm4 = this.cameraGraphFlags.m515getFinalizeSessionOnCloseBehaviorBm6Tfm4();
                    if (!CameraGraph.Flags.FinalizeSessionOnCloseBehavior.m519equalsimpl0(iM515getFinalizeSessionOnCloseBehaviorBm6Tfm4, CameraGraph.Flags.FinalizeSessionOnCloseBehavior.Companion.m523getIMMEDIATEBm6Tfm4())) {
                        if (CameraGraph.Flags.FinalizeSessionOnCloseBehavior.m519equalsimpl0(iM515getFinalizeSessionOnCloseBehaviorBm6Tfm4, CameraGraph.Flags.FinalizeSessionOnCloseBehavior.Companion.m525getTIMEOUTBm6Tfm4())) {
                            jI = h.o.c.i(2, h.o.d.f48273d);
                        }
                    }
                    z = true;
                }
            }
            this._cameraDevice = null;
            this.state = State.CLOSED;
        }
        if (z) {
            m1078finalizeSessionLRDsOJo$camera_camera2_pipe(jI);
        }
    }

    public String toString() {
        return "CaptureSessionState-" + this.debugId;
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        /* renamed from: getABORT_CAPTURES_TIMEOUT-UwyO8pc, reason: not valid java name */
        public final long m1079getABORT_CAPTURES_TIMEOUTUwyO8pc() {
            return CaptureSessionState.ABORT_CAPTURES_TIMEOUT;
        }

        /* renamed from: getCAPTURE_SESSION_TIMEOUT-UwyO8pc, reason: not valid java name */
        public final long m1080getCAPTURE_SESSION_TIMEOUTUwyO8pc() {
            return CaptureSessionState.CAPTURE_SESSION_TIMEOUT;
        }

        /* renamed from: getCLOSE_SESSION_TIMEOUT-UwyO8pc, reason: not valid java name */
        public final long m1081getCLOSE_SESSION_TIMEOUTUwyO8pc() {
            return CaptureSessionState.CLOSE_SESSION_TIMEOUT;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
