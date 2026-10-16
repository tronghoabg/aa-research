package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableIntState;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SegmentedButtonKt$interactionCountAsState$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableIntState $interactionCount;
    final /* synthetic */ InteractionSource $this_interactionCountAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SegmentedButtonKt$interactionCountAsState$1$1(InteractionSource interactionSource, MutableIntState mutableIntState, e<? super SegmentedButtonKt$interactionCountAsState$1$1> eVar) {
        super(2, eVar);
        this.$this_interactionCountAsState = interactionSource;
        this.$interactionCount = mutableIntState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SegmentedButtonKt$interactionCountAsState$1$1(this.$this_interactionCountAsState, this.$interactionCount, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SegmentedButtonKt$interactionCountAsState$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            InteractionSource interactionSource = this.$this_interactionCountAsState;
            final MutableIntState mutableIntState = this.$interactionCount;
            this.label = 1;
            if (interactionSource.getInteractions().collect(new l() { // from class: androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1.1
                public final Object emit(Interaction interaction, e<? super ab> eVar) {
                    if ((interaction instanceof PressInteraction.Press) || (interaction instanceof FocusInteraction.Focus)) {
                        MutableIntState mutableIntState2 = mutableIntState;
                        mutableIntState2.setIntValue(mutableIntState2.getIntValue() + 1);
                    } else if ((interaction instanceof PressInteraction.Release) || (interaction instanceof FocusInteraction.Unfocus) || (interaction instanceof PressInteraction.Cancel)) {
                        mutableIntState.setIntValue(r0.getIntValue() - 1);
                    }
                    return ab.f48028a;
                }

                @Override // kotlinx.coroutines.b.l
                public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                    return emit((Interaction) obj2, (e<? super ab>) eVar);
                }
            }, this) == aVar) {
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
