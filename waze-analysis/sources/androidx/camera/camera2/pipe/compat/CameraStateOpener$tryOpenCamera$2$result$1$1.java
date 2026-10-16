package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import h.g.b.aq;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraStateOpener$tryOpenCamera$2$result$1$1 extends h.c.b.a.g implements p<OpenCameraResult, h.c.e<? super OpenCameraResult>, Object> {
    final /* synthetic */ aq<am<OpenCameraResult>> $cameraOpenDeferred;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2$result$1$1(aq<am<OpenCameraResult>> aqVar, h.c.e<? super CameraStateOpener$tryOpenCamera$2$result$1$1> eVar) {
        super(2, eVar);
        this.$cameraOpenDeferred = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        CameraStateOpener$tryOpenCamera$2$result$1$1 cameraStateOpener$tryOpenCamera$2$result$1$1 = new CameraStateOpener$tryOpenCamera$2$result$1$1(this.$cameraOpenDeferred, eVar);
        cameraStateOpener$tryOpenCamera$2$result$1$1.L$0 = obj;
        return cameraStateOpener$tryOpenCamera$2$result$1$1;
    }

    @Override // h.g.a.p
    public final Object invoke(OpenCameraResult openCameraResult, h.c.e<? super OpenCameraResult> eVar) {
        return ((CameraStateOpener$tryOpenCamera$2$result$1$1) create(openCameraResult, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.b.c.b(obj);
        OpenCameraResult openCameraResult = (OpenCameraResult) this.L$0;
        this.$cameraOpenDeferred.f48105a = null;
        return openCameraResult;
    }
}
