package androidx.camera.camera2.impl;

import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.Logger;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FocusMeteringControl$triggerFocusTimeout$$inlined$confineLaunch$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ long $delayMillis$inlined;
    final /* synthetic */ CompletableDeferred $resultToComplete$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusMeteringControl$triggerFocusTimeout$$inlined$confineLaunch$1(e eVar, long j2, CompletableDeferred completableDeferred) {
        super(2, eVar);
        this.$delayMillis$inlined = j2;
        this.$resultToComplete$inlined = completableDeferred;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new FocusMeteringControl$triggerFocusTimeout$$inlined$confineLaunch$1(eVar, this.$delayMillis$inlined, this.$resultToComplete$inlined);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((FocusMeteringControl$triggerFocusTimeout$$inlined$confineLaunch$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            long j2 = this.$delayMillis$inlined;
            this.label = 1;
            if (aj.q(j2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            long j3 = this.$delayMillis$inlined;
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "triggerFocusTimeout: completing with focus result unsuccessful after " + j3 + " ms");
        }
        CompletableDeferred completableDeferred = this.$resultToComplete$inlined;
        FocusMeteringResult focusMeteringResultCreate = FocusMeteringResult.create(false);
        x.e(focusMeteringResultCreate, "create(...)");
        completableDeferred.a(focusMeteringResultCreate);
        return ab.f48028a;
    }
}
