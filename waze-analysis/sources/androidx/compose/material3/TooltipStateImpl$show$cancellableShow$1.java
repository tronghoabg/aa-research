package androidx.compose.material3;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.a.h;
import h.c.b.a.g;
import h.c.e;
import h.d.b;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class TooltipStateImpl$show$cancellableShow$1 extends g implements l<e<? super ab>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TooltipStateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TooltipStateImpl$show$cancellableShow$1(TooltipStateImpl tooltipStateImpl, e<? super TooltipStateImpl$show$cancellableShow$1> eVar) {
        super(1, eVar);
        this.this$0 = tooltipStateImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new TooltipStateImpl$show$cancellableShow$1(this.this$0, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((TooltipStateImpl$show$cancellableShow$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            TooltipStateImpl tooltipStateImpl = this.this$0;
            this.L$0 = tooltipStateImpl;
            this.label = 1;
            TooltipStateImpl$show$cancellableShow$1 tooltipStateImpl$show$cancellableShow$1 = this;
            kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.d(tooltipStateImpl$show$cancellableShow$1), 1);
            lVar.u();
            tooltipStateImpl.getTransition().setTargetState$animation_core(true);
            tooltipStateImpl.job = lVar;
            Object objJ = lVar.j();
            if (objJ == aVar) {
                b.c(tooltipStateImpl$show$cancellableShow$1);
            }
            if (objJ == aVar) {
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
