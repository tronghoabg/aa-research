package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import h.ab;
import h.g.a.l;
import h.g.b.aq;
import kotlinx.coroutines.am;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraStateOpener$tryOpenCamera$2$result$1$3 extends h.c.b.a.g implements l<h.c.e<? super OpenCameraResult>, Object> {
    final /* synthetic */ aq<am<OpenCameraResult>> $cameraOpenDeferred;
    final /* synthetic */ AndroidCameraState $cameraState;
    final /* synthetic */ aq<br> $timeoutJob;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2$result$1$3(aq<br> aqVar, aq<am<OpenCameraResult>> aqVar2, AndroidCameraState androidCameraState, h.c.e<? super CameraStateOpener$tryOpenCamera$2$result$1$3> eVar) {
        super(1, eVar);
        this.$timeoutJob = aqVar;
        this.$cameraOpenDeferred = aqVar2;
        this.$cameraState = androidCameraState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(h.c.e<?> eVar) {
        return new CameraStateOpener$tryOpenCamera$2$result$1$3(this.$timeoutJob, this.$cameraOpenDeferred, this.$cameraState, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(h.c.e<? super OpenCameraResult> eVar) {
        return ((CameraStateOpener$tryOpenCamera$2$result$1$3) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        this.$timeoutJob.f48105a = null;
        if (this.$cameraOpenDeferred.f48105a == null) {
            return null;
        }
        this.$cameraState.close();
        return new OpenCameraResult(null, CameraError.m471boximpl(CameraError.Companion.m488getERROR_CAMERA_OPEN_TIMEOUTv7Vf74A()), 1, null);
    }
}
