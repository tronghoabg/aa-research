package androidx.compose.material3;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SearchBarKt$DetectClickFromInteractionSource$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ a<ab> $onClick;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchBarKt$DetectClickFromInteractionSource$1$1(InteractionSource interactionSource, a<ab> aVar, e<? super SearchBarKt$DetectClickFromInteractionSource$1$1> eVar) {
        super(2, eVar);
        this.$interactionSource = interactionSource;
        this.$onClick = aVar;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new SearchBarKt$DetectClickFromInteractionSource$1$1(this.$interactionSource, this.$onClick, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((SearchBarKt$DetectClickFromInteractionSource$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            InteractionSource interactionSource = this.$interactionSource;
            final a<ab> aVar2 = this.$onClick;
            this.label = 1;
            if (interactionSource.getInteractions().collect(new l() { // from class: androidx.compose.material3.SearchBarKt$DetectClickFromInteractionSource$1$1.1
                public final Object emit(Interaction interaction, e<? super ab> eVar) {
                    if (interaction instanceof PressInteraction.Release) {
                        aVar2.invoke();
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
