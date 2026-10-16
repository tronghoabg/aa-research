package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionProcessor;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraImpl$close$$inlined$confineLaunch$1 extends g implements p<af, e<? super ab>, Object> {
    int label;
    final /* synthetic */ UseCaseCameraImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraImpl$close$$inlined$confineLaunch$1(e eVar, UseCaseCameraImpl useCaseCameraImpl) {
        super(2, eVar);
        this.this$0 = useCaseCameraImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new UseCaseCameraImpl$close$$inlined$confineLaunch$1(eVar, this.this$0);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((UseCaseCameraImpl$close$$inlined$confineLaunch$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws Exception {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                UseCaseCameraImpl useCaseCameraImpl = this.this$0;
                String str = Camera2Logger.TRUNCATED_TAG;
                Objects.toString(useCaseCameraImpl);
                android.util.Log.d(str, "Closing ".concat(String.valueOf(useCaseCameraImpl)));
            }
            SessionProcessor sessionProcessor = this.this$0.sessionProcessor;
            if (sessionProcessor != null) {
                sessionProcessor.setCaptureSessionRequestProcessor(null);
            }
            this.this$0.useCaseCameraContext.closeGraph();
            am<ab> amVarStopAsync = this.this$0.getUseCaseSurfaceManager().stopAsync();
            this.label = 1;
            if (amVarStopAsync.c(this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        return ab.f48028a;
    }
}
