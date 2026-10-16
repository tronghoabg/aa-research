package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import h.ab;
import h.g.a.l;
import h.g.b.aq;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraStateOpener$tryOpenCamera$2$result$1$4 extends h.c.b.a.g implements l<h.c.e<? super OpenCameraResult>, Object> {
    final /* synthetic */ aq<br> $cameraOpenCancelJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2$result$1$4(aq<br> aqVar, h.c.e<? super CameraStateOpener$tryOpenCamera$2$result$1$4> eVar) {
        super(1, eVar);
        this.$cameraOpenCancelJob = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(h.c.e<?> eVar) {
        return new CameraStateOpener$tryOpenCamera$2$result$1$4(this.$cameraOpenCancelJob, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(h.c.e<? super OpenCameraResult> eVar) {
        return ((CameraStateOpener$tryOpenCamera$2$result$1$4) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        this.$cameraOpenCancelJob.f48105a = null;
        return new OpenCameraResult(null, CameraError.m471boximpl(CameraError.Companion.m488getERROR_CAMERA_OPEN_TIMEOUTv7Vf74A()), 1, null);
    }
}
