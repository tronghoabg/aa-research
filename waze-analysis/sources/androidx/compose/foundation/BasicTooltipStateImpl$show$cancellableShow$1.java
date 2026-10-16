package androidx.compose.foundation;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.a.h;
import h.c.b.a.g;
import h.c.e;
import h.d.b;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BasicTooltipStateImpl$show$cancellableShow$1 extends g implements l<e<? super ab>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BasicTooltipStateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTooltipStateImpl$show$cancellableShow$1(BasicTooltipStateImpl basicTooltipStateImpl, e<? super BasicTooltipStateImpl$show$cancellableShow$1> eVar) {
        super(1, eVar);
        this.this$0 = basicTooltipStateImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(this.this$0, eVar);
    }

    @Override // h.g.a.l
    public final Object invoke(e<? super ab> eVar) {
        return ((BasicTooltipStateImpl$show$cancellableShow$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            BasicTooltipStateImpl basicTooltipStateImpl = this.this$0;
            this.L$0 = basicTooltipStateImpl;
            this.label = 1;
            BasicTooltipStateImpl$show$cancellableShow$1 basicTooltipStateImpl$show$cancellableShow$1 = this;
            kotlinx.coroutines.l lVar = new kotlinx.coroutines.l(h.d(basicTooltipStateImpl$show$cancellableShow$1), 1);
            lVar.u();
            basicTooltipStateImpl.setVisible(true);
            basicTooltipStateImpl.job = lVar;
            Object objJ = lVar.j();
            if (objJ == aVar) {
                b.c(basicTooltipStateImpl$show$cancellableShow$1);
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
