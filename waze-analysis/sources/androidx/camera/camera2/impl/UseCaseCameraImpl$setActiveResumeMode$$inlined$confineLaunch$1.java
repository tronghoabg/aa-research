package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraImpl$setActiveResumeMode$$inlined$confineLaunch$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ boolean $enabled$inlined;
    int label;
    final /* synthetic */ UseCaseCameraImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UseCaseCameraImpl$setActiveResumeMode$$inlined$confineLaunch$1(e eVar, UseCaseCameraImpl useCaseCameraImpl, boolean z) {
        super(2, eVar);
        this.this$0 = useCaseCameraImpl;
        this.$enabled$inlined = z;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new UseCaseCameraImpl$setActiveResumeMode$$inlined$confineLaunch$1(eVar, this.this$0, this.$enabled$inlined);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((UseCaseCameraImpl$setActiveResumeMode$$inlined$confineLaunch$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        if (this.this$0.closed.c()) {
            Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
            if (Logger.isDebugEnabled(Log.TAG)) {
                android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCamera is closed before setActiveResumeMode, skipping setup.");
            }
        } else {
            this.this$0.useCaseCameraContext.getGraph().setForeground(this.$enabled$inlined);
        }
        return ab.f48028a;
    }
}
