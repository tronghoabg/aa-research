package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.core.Log;
import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class CaptureSessionState$finalizeSession$1 extends h.c.b.a.g implements p<af, h.c.e<? super ab>, Object> {
    final /* synthetic */ long $delay;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CaptureSessionState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CaptureSessionState$finalizeSession$1(long j2, CaptureSessionState captureSessionState, h.c.e<? super CaptureSessionState$finalizeSession$1> eVar) {
        super(2, eVar);
        this.$delay = j2;
        this.this$0 = captureSessionState;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        CaptureSessionState$finalizeSession$1 captureSessionState$finalizeSession$1 = new CaptureSessionState$finalizeSession$1(this.$delay, this.this$0, eVar);
        captureSessionState$finalizeSession$1.L$0 = obj;
        return captureSessionState$finalizeSession$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, h.c.e<? super ab> eVar) {
        return ((CaptureSessionState$finalizeSession$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            e.b.c.b(obj);
            af afVar = (af) this.L$0;
            long j2 = this.$delay;
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "Finalizing " + afVar + " in " + h.o.a.y(j2));
            }
            this.label = 1;
            if (aj.r(this.$delay, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.b.c.b(obj);
        }
        CaptureSessionState.m1077finalizeSessionLRDsOJo$camera_camera2_pipe$default(this.this$0, 0L, 1, null);
        return ab.f48028a;
    }
}
