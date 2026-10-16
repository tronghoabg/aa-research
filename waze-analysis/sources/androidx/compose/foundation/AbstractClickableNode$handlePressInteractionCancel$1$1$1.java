package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ax;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AbstractClickableNode$handlePressInteractionCancel$1$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ PressInteraction.Cancel $endInteraction;
    final /* synthetic */ ax $handler;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$handlePressInteractionCancel$1$1$1(MutableInteractionSource mutableInteractionSource, PressInteraction.Cancel cancel, ax axVar, e<? super AbstractClickableNode$handlePressInteractionCancel$1$1$1> eVar) {
        super(2, eVar);
        this.$interactionSource = mutableInteractionSource;
        this.$endInteraction = cancel;
        this.$handler = axVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new AbstractClickableNode$handlePressInteractionCancel$1$1$1(this.$interactionSource, this.$endInteraction, this.$handler, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((AbstractClickableNode$handlePressInteractionCancel$1$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (this.$interactionSource.emit(this.$endInteraction, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        ax axVar = this.$handler;
        if (axVar != null) {
            axVar.dispose();
        }
        return ab.f48028a;
    }
}
