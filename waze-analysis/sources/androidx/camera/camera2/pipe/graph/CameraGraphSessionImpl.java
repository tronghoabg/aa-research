package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.ControlMode;
import androidx.camera.camera2.pipe.Converge3ABehavior;
import androidx.camera.camera2.pipe.FlashMode;
import androidx.camera.camera2.pipe.FrameCapture;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Lock3ABehavior;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.Result3A;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl;
import androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import h.c.e;
import h.g.a.l;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CameraGraphSessionImpl implements CameraGraph.Session {
    private final Controller3A controller3A;
    private final int debugId;
    private final FrameCaptureQueue frameCaptureQueue;
    private final GraphProcessor graphProcessor;
    private final CameraGraphRequestListenersImpl listeners;
    private final CameraGraphParametersImpl parameters;
    private final Token token;

    public CameraGraphSessionImpl(Token token, GraphProcessor graphProcessor, Controller3A controller3A, FrameCaptureQueue frameCaptureQueue, CameraGraphParametersImpl cameraGraphParametersImpl, CameraGraphRequestListenersImpl cameraGraphRequestListenersImpl) {
        x.f(token, "token");
        x.f(graphProcessor, "graphProcessor");
        x.f(controller3A, "controller3A");
        x.f(frameCaptureQueue, "frameCaptureQueue");
        x.f(cameraGraphParametersImpl, "parameters");
        x.f(cameraGraphRequestListenersImpl, "listeners");
        this.token = token;
        this.graphProcessor = graphProcessor;
        this.controller3A = controller3A;
        this.frameCaptureQueue = frameCaptureQueue;
        this.parameters = cameraGraphParametersImpl;
        this.listeners = cameraGraphRequestListenersImpl;
        this.debugId = CameraGraphSessionImplKt.getCameraGraphSessionIds().e();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void abort() {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call abort on ", " after close."));
        }
        this.graphProcessor.abort();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public FrameCapture capture(Request request) {
        x.f(request, "request");
        FrameCaptureQueue.FrameCaptureImpl frameCaptureImplEnqueue = this.frameCaptureQueue.enqueue(request);
        submit(request);
        return frameCaptureImplEnqueue;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.parameters.flush();
        this.listeners.flush();
        this.token.release();
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: converge3A-3VUeUZc */
    public am<Result3A> mo425converge3A3VUeUZc(List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Converge3ABehavior converge3ABehavior, Converge3ABehavior converge3ABehavior2, Converge3ABehavior converge3ABehavior3, l<? super FrameMetadata, Boolean> lVar, Integer num, Long l2) {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call converge3A on ", " after close."));
        }
        return this.controller3A.m1147converge3A3VUeUZc(list, list2, list3, converge3ABehavior, converge3ABehavior2, converge3ABehavior3, lVar, num, l2);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Request getRepeatingRequest() {
        return this.graphProcessor.getRepeatingRequest();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    /* renamed from: lock3A--tS25XM */
    public Object mo539lock3AtS25XM(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Lock3ABehavior lock3ABehavior, Lock3ABehavior lock3ABehavior2, Lock3ABehavior lock3ABehavior3, AeMode aeMode2, l<? super FrameMetadata, Boolean> lVar, l<? super FrameMetadata, Boolean> lVar2, int i2, long j2, long j3, e<? super am<Result3A>> eVar) {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call lock3A on ", " after close."));
        }
        return this.controller3A.m1148lock3AQz1gx5w(list, list2, list3, lock3ABehavior, lock3ABehavior2, lock3ABehavior3, aeMode2, lVar, lVar2, i2, new Long(j2), new Long(j3), eVar);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object lock3AForCapture(l<? super FrameMetadata, Boolean> lVar, int i2, long j2, e<? super am<Result3A>> eVar) {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call lock3AForCapture on ", " after close."));
        }
        return this.controller3A.lock3AForCapture(lVar, i2, j2);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void setRepeatingRequest(Request request) {
        this.graphProcessor.setRepeatingRequest(request);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: setTorchOff-NqN7i0k */
    public am<Result3A> mo426setTorchOffNqN7i0k(AeMode aeMode) {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call setTorchOff on ", " after close."));
        }
        return this.controller3A.m1149setTorchOffNqN7i0k(aeMode);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    public am<Result3A> setTorchOn() {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call setTorchOn on ", " after close."));
        }
        return this.controller3A.setTorchOn();
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void startRepeating(Request request) {
        x.f(request, "request");
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call startRepeating on ", " after close."));
        }
        this.graphProcessor.setRepeatingRequest(request);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void stopRepeating() {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call stopRepeating on ", " after close."));
        }
        this.graphProcessor.setRepeatingRequest(null);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void submit(List<Request> list) {
        x.f(list, "requests");
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call submit on ", " after close."));
        }
        if (list.isEmpty()) {
            throw new IllegalStateException("Cannot call submit with an empty list of Requests!");
        }
        this.graphProcessor.submit(list);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: submit3A-ydBZfZg */
    public am<Result3A> mo427submit3AydBZfZg(AeMode aeMode, AfMode afMode, AwbMode awbMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3) {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call submit3A on ", " after close."));
        }
        return this.controller3A.m1150submit3AydBZfZg(aeMode, afMode, awbMode, list, list2, list3);
    }

    public String toString() {
        return "CameraGraph.Session-" + this.debugId;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object unlock3A(Boolean bool, Boolean bool2, Boolean bool3, l<? super FrameMetadata, Boolean> lVar, int i2, long j2, e<? super am<Result3A>> eVar) {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call unlock3A on ", " after close."));
        }
        return this.controller3A.unlock3A(bool, bool2, bool3, lVar, i2, new Long(j2));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object unlock3APostCapture(boolean z, e<? super am<Result3A>> eVar) {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call unlock3APostCapture on ", " after close."));
        }
        return this.controller3A.unlock3APostCapture(z);
    }

    @Override // androidx.camera.camera2.pipe.CameraControls3A
    /* renamed from: update3A-znct4lo */
    public am<Result3A> mo428update3Aznct4lo(AeMode aeMode, AfMode afMode, AwbMode awbMode, ControlMode controlMode, FlashMode flashMode, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, boolean z) {
        if (this.token.getReleased()) {
            throw new IllegalStateException(a.a(this, "Cannot call update3A on ", " after close."));
        }
        return this.controller3A.m1151update3A0Pt5STg(aeMode, afMode, awbMode, flashMode, controlMode, list, list2, list3, z);
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public List<FrameCapture> capture(List<Request> list) {
        x.f(list, "requests");
        List<FrameCapture> listEnqueue = this.frameCaptureQueue.enqueue(list);
        submit(list);
        return listEnqueue;
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public Object lock3AForCapture(boolean z, boolean z2, int i2, long j2, e<? super am<Result3A>> eVar) {
        if (!this.token.getReleased()) {
            return this.controller3A.lock3AForCapture(z, z2, i2, j2);
        }
        throw new IllegalStateException(a.a(this, "Cannot call lock3AForCapture on ", " after close."));
    }

    @Override // androidx.camera.camera2.pipe.CameraGraph.Session
    public void submit(Request request) {
        x.f(request, "request");
        if (!this.token.getReleased()) {
            this.graphProcessor.submit(request);
            return;
        }
        throw new IllegalStateException(a.a(this, "Cannot call submit on ", " after close."));
    }
}
