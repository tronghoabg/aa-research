package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MonotonicFrameClockKt;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NonTouchScrollingLogicKt$busyReceive$2$job$1 extends g implements p<af, e<? super ab>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    NonTouchScrollingLogicKt$busyReceive$2$job$1(e<? super NonTouchScrollingLogicKt$busyReceive$2$job$1> eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        NonTouchScrollingLogicKt$busyReceive$2$job$1 nonTouchScrollingLogicKt$busyReceive$2$job$1 = new NonTouchScrollingLogicKt$busyReceive$2$job$1(eVar);
        nonTouchScrollingLogicKt$busyReceive$2$job$1.L$0 = obj;
        return nonTouchScrollingLogicKt$busyReceive$2$job$1;
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((NonTouchScrollingLogicKt$busyReceive$2$job$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        af afVar;
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            afVar = (af) this.L$0;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            afVar = (af) this.L$0;
            c.b(obj);
        }
        while (o.h(afVar.getCoroutineContext())) {
            this.L$0 = afVar;
            this.label = 1;
            if (MonotonicFrameClockKt.withFrameNanos(new l() { // from class: androidx.compose.foundation.gestures.NonTouchScrollingLogicKt$busyReceive$2$job$1$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    ((Long) obj2).longValue();
                    return ab.f48028a;
                }
            }, this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
