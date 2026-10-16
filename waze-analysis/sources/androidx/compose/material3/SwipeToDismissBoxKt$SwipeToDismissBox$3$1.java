package androidx.compose.material3;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SwipeToDismissBoxKt$SwipeToDismissBox$3$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ l<SwipeToDismissBoxValue, ab> $onDismiss;
    final /* synthetic */ SwipeToDismissBoxState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwipeToDismissBoxKt$SwipeToDismissBox$3$1(SwipeToDismissBoxState swipeToDismissBoxState, l<? super SwipeToDismissBoxValue, ab> lVar, e<? super SwipeToDismissBoxKt$SwipeToDismissBox$3$1> eVar) {
        super(2, eVar);
        this.$state = swipeToDismissBoxState;
        this.$onDismiss = lVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SwipeToDismissBoxKt$SwipeToDismissBox$3$1(this.$state, this.$onDismiss, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SwipeToDismissBoxKt$SwipeToDismissBox$3$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        if (this.$state.getSettledValue() != SwipeToDismissBoxValue.Settled) {
            this.$onDismiss.invoke(this.$state.getDismissDirection());
        }
        return ab.f48028a;
    }
}
