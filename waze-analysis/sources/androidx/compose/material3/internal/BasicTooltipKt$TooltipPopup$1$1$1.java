package androidx.compose.material3.internal;

import androidx.compose.material3.TooltipState;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class BasicTooltipKt$TooltipPopup$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ TooltipState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTooltipKt$TooltipPopup$1$1$1(TooltipState tooltipState, e<? super BasicTooltipKt$TooltipPopup$1$1$1> eVar) {
        super(2, eVar);
        this.$state = tooltipState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new BasicTooltipKt$TooltipPopup$1$1$1(this.$state, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((BasicTooltipKt$TooltipPopup$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.b(obj);
        this.$state.dismiss();
        return ab.f48028a;
    }
}
