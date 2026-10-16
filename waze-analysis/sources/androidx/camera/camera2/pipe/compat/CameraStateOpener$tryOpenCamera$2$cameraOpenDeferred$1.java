package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.core.Log;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1 extends h.c.b.a.g implements p<af, h.c.e<? super OpenCameraResult>, Object> {
    final /* synthetic */ String $cameraId;
    final /* synthetic */ AndroidCameraState $cameraState;
    int label;
    final /* synthetic */ CameraStateOpener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1(CameraStateOpener cameraStateOpener, String str, AndroidCameraState androidCameraState, h.c.e<? super CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1> eVar) {
        super(2, eVar);
        this.this$0 = cameraStateOpener;
        this.$cameraId = str;
        this.$cameraState = androidCameraState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1(this.this$0, this.$cameraId, this.$cameraState, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super OpenCameraResult> eVar) {
        return ((CameraStateOpener$tryOpenCamera$2$cameraOpenDeferred$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                e.b.c.b(obj);
                this.label = 1;
                Object objMo1010openCameraRzXb1QE = this.this$0.cameraOpener.mo1010openCameraRzXb1QE(this.$cameraId, this.$cameraState, this);
                this = objMo1010openCameraRzXb1QE;
                if (objMo1010openCameraRzXb1QE == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
                this = this;
            }
            return null;
        } catch (Exception e2) {
            String str = this.$cameraId;
            Exception exc = e2;
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to open ".concat(CameraId.m552toStringimpl(str)), exc);
            }
            this.$cameraState.closeWith$camera_camera2_pipe(exc);
            CameraError.Companion.m481fromPVuDhNw$camera_camera2_pipe(exc);
            return null;
        }
    }
}
