package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraController;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.ControlMode;
import androidx.camera.camera2.pipe.Converge3ABehavior;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.compat.AudioRestrictionController;
import androidx.camera.camera2.pipe.config.CameraGraphScope;
import androidx.camera.camera2.pipe.config.ForCameraGraph;
import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.internal.GraphSessionLock;
import androidx.media3.extractor.text.ttml.TtmlNode;
import h.a.r;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.e.b;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public final class CameraGraphImpl implements CameraGraph {
    private final AudioRestrictionController audioRestrictionController;
    private final CameraController cameraController;
    private final kotlinx.a.a closed;
    private final Controller3A controller3A;
    private final FrameCaptureQueue frameCaptureQueue;
    private final FrameDistributor frameDistributor;
    private final GraphListener graphListener;
    private final GraphProcessor graphProcessor;
    private final af graphScope;
    private final CameraGraphId id;
    private boolean isForeground;
    private final CameraGraphRequestListenersImpl listeners;
    private final CameraGraphParametersImpl parameters;
    private final GraphSessionLock sessionLock;
    private final StreamGraphImpl streamGraph;
    private final SurfaceGraph surfaceGraph;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CameraGraphImpl.this.acquireSession(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$1, reason: invalid class name and case insensitive filesystem */
    final class C01711<T> extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01711(e<? super C01711> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CameraGraphImpl.this.useSession(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSessionIn$1, reason: invalid class name and case insensitive filesystem */
    final class C01721 extends g implements p<Token, e, Object> {
        final /* synthetic */ q<af, CameraGraph.Session, e, Object> $action;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01721(q<? super af, ? super CameraGraph.Session, ? super e, ? extends Object> qVar, e<? super C01721> eVar) {
            super(2, eVar);
            this.$action = qVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C01721 c01721 = CameraGraphImpl.this.new C01721(this.$action, eVar);
            c01721.L$0 = obj;
            return c01721;
        }

        @Override // h.g.a.p
        public final Object invoke(Token token, e eVar) {
            return ((C01721) create(token, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Throwable th;
            AutoCloseable autoCloseable;
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                autoCloseable = (AutoCloseable) this.L$0;
                try {
                    e.b.c.b(obj);
                    r.y(autoCloseable, null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        r.y(autoCloseable, th);
                        throw th3;
                    }
                }
            }
            e.b.c.b(obj);
            CameraGraphSessionImpl cameraGraphSessionImplCreateSessionFromToken = CameraGraphImpl.this.createSessionFromToken((Token) this.L$0);
            try {
                CameraGraphImpl$useSessionIn$1$1$1 cameraGraphImpl$useSessionIn$1$1$1 = new CameraGraphImpl$useSessionIn$1$1$1(this.$action, cameraGraphSessionImplCreateSessionFromToken, null);
                this.L$0 = cameraGraphSessionImplCreateSessionFromToken;
                this.label = 1;
                Object objD = aj.d(cameraGraphImpl$useSessionIn$1$1$1, this);
                if (objD == aVar) {
                    return aVar;
                }
                obj = objD;
                autoCloseable = cameraGraphSessionImplCreateSessionFromToken;
                r.y(autoCloseable, null);
                return obj;
            } catch (Throwable th4) {
                th = th4;
                autoCloseable = cameraGraphSessionImplCreateSessionFromToken;
                throw th;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1, reason: invalid class name and case insensitive filesystem */
    final class C01731 extends g implements p<Token, e<? super am>, Object> {
        final /* synthetic */ p<af, e<? super am>, Object> $block;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.camera.camera2.pipe.graph.CameraGraphImpl$withSessionLockAsync$1$1, reason: invalid class name and collision with other inner class name */
        final class C00131 extends g implements p<af, e<? super am>, Object> {
            final /* synthetic */ p<af, e<? super am>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C00131(p<? super af, ? super e<? super am>, ? extends Object> pVar, e<? super C00131> eVar) {
                super(2, eVar);
                this.$block = pVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C00131 c00131 = new C00131(this.$block, eVar);
                c00131.L$0 = obj;
                return c00131;
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super am> eVar) {
                return ((C00131) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
                    return obj;
                }
                e.b.c.b(obj);
                af afVar = (af) this.L$0;
                p<af, e<? super am>, Object> pVar = this.$block;
                this.label = 1;
                Object objInvoke = pVar.invoke(afVar, this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01731(p<? super af, ? super e<? super am>, ? extends Object> pVar, e<? super C01731> eVar) {
            super(2, eVar);
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C01731(this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(Token token, e<? super am> eVar) {
            return ((C01731) create(token, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                return obj;
            }
            e.b.c.b(obj);
            this.label = 1;
            Object objD = aj.d(new C00131(this.$block, null), this);
            return objD == aVar ? aVar : objD;
        }
    }

    public CameraGraphImpl(CameraGraph.Config config, CameraMetadata cameraMetadata, GraphProcessor graphProcessor, GraphListener graphListener, StreamGraphImpl streamGraphImpl, SurfaceGraph surfaceGraph, CameraController cameraController, FrameDistributor frameDistributor, FrameCaptureQueue frameCaptureQueue, AudioRestrictionController audioRestrictionController, CameraGraphId cameraGraphId, CameraGraphParametersImpl cameraGraphParametersImpl, CameraGraphRequestListenersImpl cameraGraphRequestListenersImpl, GraphSessionLock graphSessionLock, @ForCameraGraph af afVar, Controller3A controller3A) {
        CameraGraph.Config config2;
        x.f(config, "graphConfig");
        x.f(cameraMetadata, TtmlNode.TAG_METADATA);
        x.f(graphProcessor, "graphProcessor");
        x.f(graphListener, "graphListener");
        x.f(streamGraphImpl, "streamGraph");
        x.f(surfaceGraph, "surfaceGraph");
        x.f(cameraController, "cameraController");
        x.f(frameDistributor, "frameDistributor");
        x.f(frameCaptureQueue, "frameCaptureQueue");
        x.f(audioRestrictionController, "audioRestrictionController");
        x.f(cameraGraphId, TtmlNode.ATTR_ID);
        x.f(cameraGraphParametersImpl, "parameters");
        x.f(cameraGraphRequestListenersImpl, "listeners");
        x.f(graphSessionLock, "sessionLock");
        x.f(afVar, "graphScope");
        x.f(controller3A, "controller3A");
        this.graphProcessor = graphProcessor;
        this.graphListener = graphListener;
        this.streamGraph = streamGraphImpl;
        this.surfaceGraph = surfaceGraph;
        this.cameraController = cameraController;
        this.frameDistributor = frameDistributor;
        this.frameCaptureQueue = frameCaptureQueue;
        this.audioRestrictionController = audioRestrictionController;
        this.id = cameraGraphId;
        this.parameters = cameraGraphParametersImpl;
        this.listeners = cameraGraphRequestListenersImpl;
        this.sessionLock = graphSessionLock;
        this.graphScope = afVar;
        this.controller3A = controller3A;
        this.closed = b.e(false);
        if (Log.INSTANCE.getINFO_LOGGABLE()) {
            config2 = config;
            android.util.Log.i(Log.TAG, Debug.INSTANCE.formatCameraGraphProperties(cameraMetadata, config2, this));
        } else {
            config2 = config;
        }
        if (CameraGraph.OperatingMode.m530equalsimpl0(config2.m509getSessionMode2uNL3no(), CameraGraph.OperatingMode.Companion.m536getHIGH_SPEED2uNL3no())) {
            if (streamGraphImpl.getOutputs().isEmpty()) {
                throw new IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph without outputs.");
            }
            if (streamGraphImpl.getOutputs().size() > 2) {
                List<OutputStream> outputs = streamGraphImpl.getOutputs();
                Objects.toString(outputs);
                throw new IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are ".concat(String.valueOf(outputs)));
            }
            List<OutputStream> outputs2 = streamGraphImpl.getOutputs();
            if (!(outputs2 instanceof Collection) || !outputs2.isEmpty()) {
                Iterator<T> it = outputs2.iterator();
                while (it.hasNext()) {
                    if (!((OutputStream) it.next()).isValidForHighSpeedOperatingMode()) {
                        List<OutputStream> outputs3 = this.streamGraph.getOutputs();
                        Objects.toString(outputs3);
                        throw new IllegalArgumentException("HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ".concat(String.valueOf(outputs3)));
                    }
                }
            }
        }
        if (config2.getInput() != null) {
            if (config2.getInput().isEmpty()) {
                throw new IllegalArgumentException("At least one InputConfiguration is required for reprocessing");
            }
            if (Build.VERSION.SDK_INT < 31 && config2.getInput().size() > 1) {
                throw new IllegalArgumentException("Multi resolution reprocessing not supported under Android S");
            }
        }
        if (!this.streamGraph.getImageSourceMap$camera_camera2_pipe().isEmpty()) {
            this.surfaceGraph.maybeUpdateSurfaces$camera_camera2_pipe();
        }
        this.isForeground = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraGraphSessionImpl createSessionFromToken(Token token) {
        return new CameraGraphSessionImpl(token, this.graphProcessor, this.controller3A, this.frameCaptureQueue, getParameters(), getListeners());
    }

    private final <T> am<T> withSessionLockAsync(p<? super af, ? super e<? super am<? extends T>>, ? extends Object> pVar) {
        return this.sessionLock.withTokenInAsync$camera_camera2_pipe(this.graphScope, new C01731(pVar, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object acquireSession(h.c.e<? super androidx.camera.camera2.pipe.CameraGraph.Session> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.camera.camera2.pipe.graph.CameraGraphImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1 r0 = (androidx.camera.camera2.pipe.graph.CameraGraphImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1 r0 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$acquireSession$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            e.b.c.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            e.b.c.b(r5)
            androidx.camera.camera2.pipe.internal.GraphSessionLock r5 = r4.sessionLock
            r0.label = r3
            java.lang.Object r5 = r5.acquireToken$camera_camera2_pipe(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            androidx.camera.camera2.pipe.core.Token r5 = (androidx.camera.camera2.pipe.core.Token) r5
            androidx.camera.camera2.pipe.graph.CameraGraphSessionImpl r4 = r4.createSessionFromToken(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.CameraGraphImpl.acquireSession(h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public CameraGraph.Session acquireSessionOrNull() {
        Token tokenTryAcquireToken$camera_camera2_pipe = this.sessionLock.tryAcquireToken$camera_camera2_pipe();
        if (tokenTryAcquireToken$camera_camera2_pipe == null) {
            return null;
        }
        return createSessionFromToken(tokenTryAcquireToken$camera_camera2_pipe);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        if (this.closed.b(false, true)) {
            toString();
            Trace.beginSection(toString().concat("#close"));
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                toString();
                android.util.Log.i(Log.TAG, "Closing ".concat(toString()));
            }
            this.graphProcessor.close();
            this.cameraController.close();
            this.frameDistributor.close();
            this.frameCaptureQueue.close();
            this.surfaceGraph.close();
            this.streamGraph.close();
            this.audioRestrictionController.removeCameraGraph(this);
            aj.h(this.graphScope, null);
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: converge3A-3VUeUZc */
    public am<Result3A> mo425converge3A3VUeUZc(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Converge3ABehavior converge3ABehavior, Converge3ABehavior converge3ABehavior2, Converge3ABehavior converge3ABehavior3, l<? super FrameMetadata, Boolean> lVar, Integer num, Long l2) {
        return this.controller3A.m1147converge3A3VUeUZc(list, list2, list3, converge3ABehavior, converge3ABehavior2, converge3ABehavior3, lVar, num, l2);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public ch<GraphState> getGraphState() {
        return this.graphProcessor.getGraphState();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public CameraGraphId getId() {
        return this.id;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public k<FrameInfo> getLatestFrameInfo() {
        return ai.n(new CameraGraphImpl$latestFrameInfo$1(this, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public k<FrameNumber> getLatestFrameNumber() {
        return ai.n(new CameraGraphImpl$latestFrameNumber$1(this, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public StreamGraph getStreams() {
        return this.streamGraph;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public boolean isForeground() {
        return this.isForeground;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: lock3A-vIrNa9k */
    public am<Result3A> mo542lock3AvIrNa9k(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, l<? super FrameMetadata, Boolean> lVar, l<? super FrameMetadata, Boolean> lVar2, int i2, long j2, long j3) {
        return withSessionLockAsync(new CameraGraphImpl$lock3A$1(this, list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode2, lVar, lVar2, i2, j2, j3, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public void setForeground(boolean z) {
        this.isForeground = z;
        this.cameraController.setForeground(z);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: setSurface-NYG5g8E */
    public void mo543setSurfaceNYG5g8E(int i2, Surface surface) {
        Trace.beginSection(StreamId.m979toStringimpl(i2).concat("#setSurface"));
        if (surface != null && !surface.isValid() && Log.INSTANCE.getWARN_LOGGABLE()) {
            android.util.Log.w(Log.TAG, this + "#setSurface: " + surface + " is invalid");
        }
        this.surfaceGraph.m1201setNYG5g8E(i2, surface);
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: setTorchOff-NqN7i0k */
    public am<Result3A> mo426setTorchOffNqN7i0k(AeMode aeMode) {
        return withSessionLockAsync(new CameraGraphImpl$setTorchOff$1(this, aeMode, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    public am<Result3A> setTorchOn() {
        return withSessionLockAsync(new C01691(null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public void start() {
        if (this.closed.c()) {
            throw new IllegalStateException(a.a(this, "Cannot start ", " after calling close()"));
        }
        toString();
        Trace.beginSection(toString().concat("#start"));
        if (Log.INSTANCE.getINFO_LOGGABLE()) {
            toString();
            android.util.Log.i(Log.TAG, "Starting ".concat(toString()));
        }
        this.graphListener.onGraphStarting();
        this.cameraController.start();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public void stop() {
        if (this.closed.c()) {
            throw new IllegalStateException(a.a(this, "Cannot stop ", " after calling close()"));
        }
        toString();
        Trace.beginSection(toString().concat("#stop"));
        if (Log.INSTANCE.getINFO_LOGGABLE()) {
            toString();
            android.util.Log.i(Log.TAG, "Stopping ".concat(toString()));
        }
        this.graphListener.onGraphStopping();
        this.cameraController.stop();
        Trace.endSection();
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: submit3A-ydBZfZg */
    public am<Result3A> mo427submit3AydBZfZg(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3) {
        return withSessionLockAsync(new CameraGraphImpl$submit3A$1(this, aeMode, afMode, awbMode, list, list2, list3, null));
    }

    public String toString() {
        return getId().toString();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public am<Result3A> unlock3A(Boolean bool, Boolean bool2, Boolean bool3, l<? super FrameMetadata, Boolean> lVar, int i2, long j2) {
        return withSessionLockAsync(new C01701(bool, bool2, bool3, lVar, i2, j2, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: update3A-znct4lo */
    public am<Result3A> mo428update3Aznct4lo(AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, boolean z) {
        return withSessionLockAsync(new CameraGraphImpl$update3A$1(this, aeMode, afMode, awbMode, flashMode, controlMode, list, list2, list3, z, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: updateAudioRestrictionMode-LwUUkyU */
    public void mo544updateAudioRestrictionModeLwUUkyU(int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.audioRestrictionController.mo1003updateCameraGraphAudioRestrictionModeTyYSX5E(this, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [androidx.camera.camera2.pipe.graph.CameraGraphImpl] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object useSession(h.g.a.q<? super kotlinx.coroutines.af, ? super androidx.camera.camera2.pipe.CameraGraph.Session, ? super h.c.e<? super T>, ? extends java.lang.Object> r7, h.c.e<? super T> r8) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r8 instanceof androidx.camera.camera2.pipe.graph.CameraGraphImpl.C01711
            if (r0 == 0) goto L13
            r0 = r8
            androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$1 r0 = (androidx.camera.camera2.pipe.graph.CameraGraphImpl.C01711) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$1 r0 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r6 = r0.L$0
            java.lang.AutoCloseable r6 = (java.lang.AutoCloseable) r6
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L67
        L2f:
            r7 = move-exception
            goto L6b
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            java.lang.Object r6 = r0.L$0
            r7 = r6
            h.g.a.q r7 = (h.g.a.q) r7
            e.b.c.b(r8)
            goto L4f
        L42:
            e.b.c.b(r8)
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r6.acquireSession(r0)
            if (r8 == r1) goto L71
        L4f:
            r6 = r8
            java.lang.AutoCloseable r6 = (java.lang.AutoCloseable) r6
            r8 = r6
            androidx.camera.camera2.pipe.CameraGraph$Session r8 = (androidx.camera.camera2.pipe.CameraGraph.Session) r8     // Catch: java.lang.Throwable -> L2f
            androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$2$1 r2 = new androidx.camera.camera2.pipe.graph.CameraGraphImpl$useSession$2$1     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r7, r8, r3)     // Catch: java.lang.Throwable -> L2f
            h.g.a.p r2 = (h.g.a.p) r2     // Catch: java.lang.Throwable -> L2f
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2f
            r0.label = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = kotlinx.coroutines.aj.d(r2, r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L67
            goto L71
        L67:
            h.a.r.y(r6, r3)
            return r8
        L6b:
            throw r7     // Catch: java.lang.Throwable -> L6c
        L6c:
            r8 = move-exception
            h.a.r.y(r6, r7)
            throw r8
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.CameraGraphImpl.useSession(h.g.a.q, h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public <T> am<T> useSessionIn(af afVar, q<? super af, ? super CameraGraph.Session, ? super e<? super T>, ? extends Object> qVar) {
        x.f(afVar, "scope");
        x.f(qVar, "action");
        return this.sessionLock.withTokenIn$camera_camera2_pipe(afVar, new C01721(qVar, null));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public CameraGraphRequestListenersImpl getListeners() {
        return this.listeners;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public CameraGraphParametersImpl getParameters() {
        return this.parameters;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.CameraGraphImpl$setTorchOn$1, reason: invalid class name and case insensitive filesystem */
    final class C01691 extends g implements p<af, e<? super am<? extends Result3A>>, Object> {
        int label;

        C01691(e<? super C01691> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CameraGraphImpl.this.new C01691(eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(af afVar, e<? super am<Result3A>> eVar) {
            return ((C01691) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            return CameraGraphImpl.this.controller3A.setTorchOn();
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(af afVar, e<? super am<? extends Result3A>> eVar) {
            return invoke2(afVar, (e<? super am<Result3A>>) eVar);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.CameraGraphImpl$unlock3A$1, reason: invalid class name and case insensitive filesystem */
    final class C01701 extends g implements p<af, e<? super am<? extends Result3A>>, Object> {
        final /* synthetic */ Boolean $ae;
        final /* synthetic */ Boolean $af;
        final /* synthetic */ Boolean $awb;
        final /* synthetic */ int $frameLimit;
        final /* synthetic */ long $timeLimitNs;
        final /* synthetic */ l<FrameMetadata, Boolean> $unlockedCondition;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01701(Boolean bool, Boolean bool2, Boolean bool3, l<? super FrameMetadata, Boolean> lVar, int i2, long j2, e<? super C01701> eVar) {
            super(2, eVar);
            this.$ae = bool;
            this.$af = bool2;
            this.$awb = bool3;
            this.$unlockedCondition = lVar;
            this.$frameLimit = i2;
            this.$timeLimitNs = j2;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CameraGraphImpl.this.new C01701(this.$ae, this.$af, this.$awb, this.$unlockedCondition, this.$frameLimit, this.$timeLimitNs, eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(af afVar, e<? super am<Result3A>> eVar) {
            return ((C01701) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
            CameraGraphImpl cameraGraphImpl = CameraGraphImpl.this;
            return cameraGraphImpl.controller3A.unlock3A(this.$ae, this.$af, this.$awb, this.$unlockedCondition, this.$frameLimit, new Long(this.$timeLimitNs));
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ Object invoke(af afVar, e<? super am<? extends Result3A>> eVar) {
            return invoke2(afVar, (e<? super am<Result3A>>) eVar);
        }
    }
}
