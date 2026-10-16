package androidx.compose.material3;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SliderKt$rangeSliderPressDragModifier$1$1$1$7$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ DragInteraction.Start $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$rangeSliderPressDragModifier$1$1$1$7$1(MutableInteractionSource mutableInteractionSource, DragInteraction.Start start, e<? super SliderKt$rangeSliderPressDragModifier$1$1$1$7$1> eVar) {
        super(2, eVar);
        this.$interactionSource = mutableInteractionSource;
        this.$it = start;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SliderKt$rangeSliderPressDragModifier$1$1$1$7$1(this.$interactionSource, this.$it, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SliderKt$rangeSliderPressDragModifier$1$1$1$7$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            this.label = 1;
            if (this.$interactionSource.emit(new DragInteraction.Cancel(this.$it), this) == aVar) {
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
