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

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AbstractClickableNode$handlePressInteractionRelease$1$2$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ PressInteraction.Press $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$handlePressInteractionRelease$1$2$1(PressInteraction.Press press, MutableInteractionSource mutableInteractionSource, e<? super AbstractClickableNode$handlePressInteractionRelease$1$2$1> eVar) {
        super(2, eVar);
        this.$it = press;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new AbstractClickableNode$handlePressInteractionRelease$1$2$1(this.$it, this.$interactionSource, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((AbstractClickableNode$handlePressInteractionRelease$1$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            PressInteraction.Release release = new PressInteraction.Release(this.$it);
            this.label = 1;
            if (this.$interactionSource.emit(release, this) == aVar) {
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
