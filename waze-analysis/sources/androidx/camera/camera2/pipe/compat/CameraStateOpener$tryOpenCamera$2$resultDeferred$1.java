package androidx.camera.camera2.pipe.compat;

import h.ab;
import h.g.a.p;
import h.i;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CameraStateOpener$tryOpenCamera$2$resultDeferred$1 extends h.c.b.a.g implements p<af, h.c.e<? super OpenCameraResult>, Object> {
    final /* synthetic */ AndroidCameraState $cameraState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraStateOpener$tryOpenCamera$2$resultDeferred$1(AndroidCameraState androidCameraState, h.c.e<? super CameraStateOpener$tryOpenCamera$2$resultDeferred$1> eVar) {
        super(2, eVar);
        this.$cameraState = androidCameraState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new CameraStateOpener$tryOpenCamera$2$resultDeferred$1(this.$cameraState, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super OpenCameraResult> eVar) {
        return ((CameraStateOpener$tryOpenCamera$2$resultDeferred$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            e.b.c.b(obj);
            this.label = 1;
            obj = ai.i(this.$cameraState.getState(), new CameraStateOpener$tryOpenCamera$2$resultDeferred$1$result$1(null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
        }
        CameraState cameraState = (CameraState) obj;
        if (cameraState instanceof CameraStateOpen) {
            return new OpenCameraResult(this.$cameraState, null, 2, null);
        }
        if (cameraState instanceof CameraStateClosing) {
            this.$cameraState.close();
            return new OpenCameraResult(null, ((CameraStateClosing) cameraState).m1073getCameraErrorCodemVEW8x0(), 1, null);
        }
        if (cameraState instanceof CameraStateClosed) {
            this.$cameraState.close();
            return new OpenCameraResult(null, ((CameraStateClosed) cameraState).m1066getCameraErrorCodemVEW8x0(), 1, null);
        }
        if (!(cameraState instanceof CameraStateUnopened)) {
            throw new i();
        }
        this.$cameraState.close();
        Objects.toString(cameraState);
        throw new IllegalStateException("Unexpected CameraState: ".concat(String.valueOf(cameraState)));
    }
}
