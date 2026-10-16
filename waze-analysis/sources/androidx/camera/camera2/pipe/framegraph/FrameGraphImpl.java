package androidx.camera.camera2.pipe.framegraph;

import android.hardware.camera2.params.MeteringRectangle;
import android.view.Surface;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraControls3A;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.ControlMode;
import androidx.camera.camera2.pipe.Converge3ABehavior;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.FrameBuffer;
import androidx.camera.camera2.pipe.FrameCapture;
import androidx.camera.camera2.pipe.FrameGraph;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.FrameNumber;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Parameters;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestListeners;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.camera2.pipe.config.FrameGraphCoroutineScope;
import androidx.camera.camera2.pipe.config.FrameGraphScope;
import androidx.camera.camera2.pipe.graph.Controller3A;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.media.ImageSource;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.q;
import h.g.b.x;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.am;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
@FrameGraphScope
/* loaded from: classes2.dex */
public final class FrameGraphImpl implements FrameGraph, CameraControls3A {
    private final CameraGraph cameraGraph;
    private final Controller3A controller3A;
    private final FrameDistributor frameDistributor;
    private final FrameGraphBuffers frameGraphBuffers;
    private final af frameGraphCoroutineScope;
    private final FrameGraphFrameCaptureQueue frameGraphFrameCaptureQueue;
    private final ch<GraphState> graphState;
    private boolean isForeground;
    private final k<FrameInfo> latestFrameInfo;
    private final k<FrameNumber> latestFrameNumber;
    private final StreamGraph streams;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$acquireSession$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FrameGraphImpl.this.acquireSession(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$useSession$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements q<af, CameraGraph.Session, e, Object> {
        final /* synthetic */ q<af, FrameGraph.Session, e, Object> $action;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(q<? super af, ? super FrameGraph.Session, ? super e, ? extends Object> qVar, e<? super AnonymousClass2> eVar) {
            super(3, eVar);
            this.$action = qVar;
        }

        @Override // h.g.a.q
        public final Object invoke(af afVar, CameraGraph.Session session, e eVar) {
            AnonymousClass2 anonymousClass2 = FrameGraphImpl.this.new AnonymousClass2(this.$action, eVar);
            anonymousClass2.L$0 = afVar;
            anonymousClass2.L$1 = session;
            return anonymousClass2.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Throwable th;
            AutoCloseable autoCloseable;
            a aVar = a.f48038a;
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
            af afVar = (af) this.L$0;
            FrameGraph.Session sessionCreateSession = FrameGraphImpl.this.createSession((CameraGraph.Session) this.L$1);
            q<af, FrameGraph.Session, e, Object> qVar = this.$action;
            try {
                this.L$0 = sessionCreateSession;
                this.label = 1;
                obj = qVar.invoke(afVar, sessionCreateSession, this);
                if (obj == aVar) {
                    return aVar;
                }
                autoCloseable = sessionCreateSession;
                r.y(autoCloseable, null);
                return obj;
            } catch (Throwable th4) {
                th = th4;
                autoCloseable = sessionCreateSession;
                throw th;
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$useSessionIn$1, reason: invalid class name and case insensitive filesystem */
    final class C01681 extends g implements q<af, CameraGraph.Session, e, Object> {
        final /* synthetic */ q<af, FrameGraph.Session, e, Object> $action;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C01681(q<? super af, ? super FrameGraph.Session, ? super e, ? extends Object> qVar, e<? super C01681> eVar) {
            super(3, eVar);
            this.$action = qVar;
        }

        @Override // h.g.a.q
        public final Object invoke(af afVar, CameraGraph.Session session, e eVar) {
            C01681 c01681 = FrameGraphImpl.this.new C01681(this.$action, eVar);
            c01681.L$0 = afVar;
            c01681.L$1 = session;
            return c01681.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Exception {
            Throwable th;
            AutoCloseable autoCloseable;
            a aVar = a.f48038a;
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
            af afVar = (af) this.L$0;
            FrameGraph.Session sessionCreateSession = FrameGraphImpl.this.createSession((CameraGraph.Session) this.L$1);
            q<af, FrameGraph.Session, e, Object> qVar = this.$action;
            try {
                this.L$0 = sessionCreateSession;
                this.label = 1;
                obj = qVar.invoke(afVar, sessionCreateSession, this);
                if (obj == aVar) {
                    return aVar;
                }
                autoCloseable = sessionCreateSession;
                r.y(autoCloseable, null);
                return obj;
            } catch (Throwable th4) {
                th = th4;
                autoCloseable = sessionCreateSession;
                throw th;
            }
        }
    }

    public FrameGraphImpl(CameraGraph cameraGraph, FrameDistributor frameDistributor, FrameGraphBuffers frameGraphBuffers, @FrameGraphCoroutineScope af afVar, Controller3A controller3A, FrameGraphFrameCaptureQueue frameGraphFrameCaptureQueue) {
        x.f(cameraGraph, "cameraGraph");
        x.f(frameDistributor, "frameDistributor");
        x.f(frameGraphBuffers, "frameGraphBuffers");
        x.f(afVar, "frameGraphCoroutineScope");
        x.f(controller3A, "controller3A");
        x.f(frameGraphFrameCaptureQueue, "frameGraphFrameCaptureQueue");
        this.cameraGraph = cameraGraph;
        this.frameDistributor = frameDistributor;
        this.frameGraphBuffers = frameGraphBuffers;
        this.frameGraphCoroutineScope = afVar;
        this.controller3A = controller3A;
        this.frameGraphFrameCaptureQueue = frameGraphFrameCaptureQueue;
        frameDistributor.setFrameStartedListener(frameGraphBuffers);
        this.streams = cameraGraph.getStreams();
        this.graphState = cameraGraph.getGraphState();
        this.latestFrameNumber = cameraGraph.getLatestFrameNumber();
        this.latestFrameInfo = cameraGraph.getLatestFrameInfo();
        this.isForeground = cameraGraph.isForeground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameGraph.Session createSession(CameraGraph.Session session) {
        return new FrameGraphSessionImpl(session, this.frameGraphBuffers, this.controller3A);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object acquireSession(h.c.e<? super androidx.camera.camera2.pipe.FrameGraph.Session> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.camera.camera2.pipe.framegraph.FrameGraphImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$acquireSession$1 r0 = (androidx.camera.camera2.pipe.framegraph.FrameGraphImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$acquireSession$1 r0 = new androidx.camera.camera2.pipe.framegraph.FrameGraphImpl$acquireSession$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            androidx.camera.camera2.pipe.framegraph.FrameGraphImpl r4 = (androidx.camera.camera2.pipe.framegraph.FrameGraphImpl) r4
            e.b.c.b(r5)
            goto L43
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r5)
            androidx.camera.camera2.pipe.CameraGraph r5 = r4.cameraGraph
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r5.acquireSession(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            androidx.camera.camera2.pipe.CameraGraph$Session r5 = (androidx.camera.camera2.pipe.CameraGraph.Session) r5
            androidx.camera.camera2.pipe.FrameGraph$Session r4 = r4.createSession(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.framegraph.FrameGraphImpl.acquireSession(h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public FrameGraph.Session acquireSessionOrNull() {
        CameraGraph.Session sessionAcquireSessionOrNull = this.cameraGraph.acquireSessionOrNull();
        if (sessionAcquireSessionOrNull != null) {
            return createSession(sessionAcquireSessionOrNull);
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.FrameGraph
    public FrameCapture capture(Request request) {
        x.f(request, "request");
        return this.frameGraphFrameCaptureQueue.enqueue(request);
    }

    @Override // androidx.camera.camera2.pipe.FrameGraph
    public FrameBuffer captureWith(Set<StreamId> set, Map<Object, ? extends Object> map, int i2) {
        x.f(set, "streamIds");
        x.f(map, "parameters");
        return this.frameGraphBuffers.attach$camera_camera2_pipe(set, map, i2);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        this.frameGraphFrameCaptureQueue.close();
        FrameGraphImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(this.cameraGraph);
        aj.h(this.frameGraphCoroutineScope, null);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: converge3A-3VUeUZc */
    public am<Result3A> mo425converge3A3VUeUZc(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Converge3ABehavior converge3ABehavior, Converge3ABehavior converge3ABehavior2, Converge3ABehavior converge3ABehavior3, l<? super FrameMetadata, Boolean> lVar, Integer num, Long l2) {
        return this.cameraGraph.mo425converge3A3VUeUZc(list, list2, list3, converge3ABehavior, converge3ABehavior2, converge3ABehavior3, lVar, num, l2);
    }

    @Override // androidx.camera.camera2.pipe.FrameGraph
    /* renamed from: drain-aKI5c8E */
    public void mo676drainaKI5c8E(int i2) {
        this.frameGraphBuffers.m1137trimAllaKI5c8E(i2);
        ImageSource imageSourceMo964getImageSourceaKI5c8E = this.cameraGraph.getStreams().mo964getImageSourceaKI5c8E(i2);
        if (imageSourceMo964getImageSourceaKI5c8E != null) {
            imageSourceMo964getImageSourceaKI5c8E.flush();
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public ch<GraphState> getGraphState() {
        return this.graphState;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public CameraGraphId getId() {
        return this.cameraGraph.getId();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public k<FrameInfo> getLatestFrameInfo() {
        return this.latestFrameInfo;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public k<FrameNumber> getLatestFrameNumber() {
        return this.latestFrameNumber;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public RequestListeners getListeners() {
        return this.cameraGraph.getListeners();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public Parameters getParameters() {
        return this.cameraGraph.getParameters();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public StreamGraph getStreams() {
        return this.streams;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public boolean isForeground() {
        return this.isForeground;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: lock3A-vIrNa9k */
    public am<Result3A> mo542lock3AvIrNa9k(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, l<? super FrameMetadata, Boolean> lVar, l<? super FrameMetadata, Boolean> lVar2, int i2, long j2, long j3) {
        return this.cameraGraph.mo542lock3AvIrNa9k(aeMode, afMode, awbMode, list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode2, lVar, lVar2, i2, j2, j3);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public void setForeground(boolean z) {
        this.isForeground = z;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: setSurface-NYG5g8E */
    public void mo543setSurfaceNYG5g8E(int i2, Surface surface) {
        this.cameraGraph.mo543setSurfaceNYG5g8E(i2, surface);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: setTorchOff-NqN7i0k */
    public am<Result3A> mo426setTorchOffNqN7i0k(AeMode aeMode) {
        return this.cameraGraph.mo426setTorchOffNqN7i0k(aeMode);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    public am<Result3A> setTorchOn() {
        return this.cameraGraph.setTorchOn();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public void start() {
        this.cameraGraph.start();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public void stop() {
        this.cameraGraph.stop();
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: submit3A-ydBZfZg */
    public am<Result3A> mo427submit3AydBZfZg(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3) {
        return this.cameraGraph.mo427submit3AydBZfZg(aeMode, afMode, awbMode, list, list2, list3);
    }

    public String toString() {
        return this.cameraGraph.toString();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public am<Result3A> unlock3A(Boolean bool, Boolean bool2, Boolean bool3, l<? super FrameMetadata, Boolean> lVar, int i2, long j2) {
        return this.cameraGraph.unlock3A(bool, bool2, bool3, lVar, i2, j2);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
    public <T> T unwrapAs(Class<T> cls) {
        x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (x.n(cls, CameraGraph.class)) {
            return (T) this.cameraGraph;
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: update3A-znct4lo */
    public am<Result3A> mo428update3Aznct4lo(AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, boolean z) {
        return this.cameraGraph.mo428update3Aznct4lo(aeMode, afMode, awbMode, controlMode, flashMode, list, list2, list3, z);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    /* renamed from: updateAudioRestrictionMode-LwUUkyU */
    public void mo544updateAudioRestrictionModeLwUUkyU(int i2) {
        this.cameraGraph.mo544updateAudioRestrictionModeLwUUkyU(i2);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public <T> Object useSession(q<? super af, ? super FrameGraph.Session, ? super e<? super T>, ? extends Object> qVar, e<? super T> eVar) {
        return this.cameraGraph.useSession(new AnonymousClass2(qVar, null), eVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraphBase
    public <T> am<T> useSessionIn(af afVar, q<? super af, ? super FrameGraph.Session, ? super e<? super T>, ? extends Object> qVar) {
        x.f(afVar, "scope");
        x.f(qVar, "action");
        return this.cameraGraph.useSessionIn(afVar, new C01681(qVar, null));
    }

    @Override // androidx.camera.camera2.pipe.FrameGraph
    public List<FrameCapture> capture(List<Request> list) {
        x.f(list, "requests");
        return this.frameGraphFrameCaptureQueue.enqueue(list);
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public /* synthetic */ Object unwrapAs(h.l.c cVar) {
        return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
    }
}
