package androidx.camera.camera2.pipe.framegraph;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.ControlMode;
import androidx.camera.camera2.pipe.Converge3ABehavior;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.FrameCapture;
import androidx.camera.camera2.pipe.FrameGraph;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.config.FrameGraphScope;
import androidx.camera.camera2.pipe.graph.Controller3A;
import androidx.camera.camera2.pipe.graph.State3A;
import h.c.e;
import h.e.b;
import h.g.a.l;
import h.g.b.x;
import java.util.List;
import kotlinx.a.a;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
@FrameGraphScope
/* loaded from: classes2.dex */
public final class FrameGraphSessionImpl implements FrameGraph.Session, CameraGraph.Session {
    private final CameraGraph.Session cameraGraphSession;
    private final a closed;
    private final Controller3A controller3A;
    private final FrameGraphBuffers frameGraphBuffers;
    private final State3A state3ASnapshot;

    public FrameGraphSessionImpl(CameraGraph.Session session, FrameGraphBuffers frameGraphBuffers, Controller3A controller3A) {
        x.f(session, "cameraGraphSession");
        x.f(frameGraphBuffers, "frameGraphBuffers");
        x.f(controller3A, "controller3A");
        this.cameraGraphSession = session;
        this.frameGraphBuffers = frameGraphBuffers;
        this.controller3A = controller3A;
        this.state3ASnapshot = controller3A.state3ASnapshot();
        this.closed = b.e(false);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void abort() {
        this.cameraGraphSession.abort();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public FrameCapture capture(Request request) {
        x.f(request, "request");
        return this.cameraGraphSession.capture(request);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        if (this.closed.b(false, true)) {
            this.controller3A.reset3A(this.state3ASnapshot);
            this.frameGraphBuffers.flush(this.cameraGraphSession);
            FrameGraphSessionImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(this.cameraGraphSession);
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: converge3A-3VUeUZc */
    public am<Result3A> mo425converge3A3VUeUZc(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Converge3ABehavior converge3ABehavior, Converge3ABehavior converge3ABehavior2, Converge3ABehavior converge3ABehavior3, l<? super FrameMetadata, Boolean> lVar, Integer num, Long l2) {
        return this.cameraGraphSession.mo425converge3A3VUeUZc(list, list2, list3, converge3ABehavior, converge3ABehavior2, converge3ABehavior3, lVar, num, l2);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Request getRepeatingRequest() {
        return this.cameraGraphSession.getRepeatingRequest();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    /* renamed from: lock3A--tS25XM */
    public Object mo539lock3AtS25XM(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, l<? super FrameMetadata, Boolean> lVar, l<? super FrameMetadata, Boolean> lVar2, int i2, long j2, long j3, e<? super am<Result3A>> eVar) {
        return this.cameraGraphSession.mo539lock3AtS25XM(aeMode, afMode, awbMode, list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode2, lVar, lVar2, i2, j2, j3, eVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object lock3AForCapture(l<? super FrameMetadata, Boolean> lVar, int i2, long j2, e<? super am<Result3A>> eVar) {
        return this.cameraGraphSession.lock3AForCapture(lVar, i2, j2, eVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void setRepeatingRequest(Request request) {
        this.cameraGraphSession.setRepeatingRequest(request);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: setTorchOff-NqN7i0k */
    public am<Result3A> mo426setTorchOffNqN7i0k(AeMode aeMode) {
        return this.cameraGraphSession.mo426setTorchOffNqN7i0k(aeMode);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    public am<Result3A> setTorchOn() {
        return this.cameraGraphSession.setTorchOn();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void startRepeating(Request request) {
        x.f(request, "request");
        this.cameraGraphSession.startRepeating(request);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void stopRepeating() {
        this.cameraGraphSession.stopRepeating();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void submit(Request request) {
        x.f(request, "request");
        this.cameraGraphSession.submit(request);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: submit3A-ydBZfZg */
    public am<Result3A> mo427submit3AydBZfZg(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3) {
        return this.cameraGraphSession.mo427submit3AydBZfZg(aeMode, afMode, awbMode, list, list2, list3);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object unlock3A(Boolean bool, Boolean bool2, Boolean bool3, l<? super FrameMetadata, Boolean> lVar, int i2, long j2, e<? super am<Result3A>> eVar) {
        return this.cameraGraphSession.unlock3A(bool, bool2, bool3, lVar, i2, j2, eVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object unlock3APostCapture(boolean z, e<? super am<Result3A>> eVar) {
        return this.cameraGraphSession.unlock3APostCapture(z, eVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: update3A-znct4lo */
    public am<Result3A> mo428update3Aznct4lo(AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, boolean z) {
        return this.cameraGraphSession.mo428update3Aznct4lo(aeMode, afMode, awbMode, controlMode, flashMode, list, list2, list3, z);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object lock3AForCapture(boolean z, boolean z2, int i2, long j2, e<? super am<Result3A>> eVar) {
        return this.cameraGraphSession.lock3AForCapture(z, z2, i2, j2, eVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void submit(List<Request> list) {
        x.f(list, "requests");
        this.cameraGraphSession.submit(list);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public List<FrameCapture> capture(List<Request> list) {
        x.f(list, "requests");
        return this.cameraGraphSession.capture(list);
    }
}
