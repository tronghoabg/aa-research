package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.input.internal.DragAndDropHoverInteraction;
import androidx.compose.runtime.MutableState;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.ArrayList;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DragAndDropHoverInteractionKt$collectIsDragAndDropHoveredAsState$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableState<Boolean> $isHovered;
    final /* synthetic */ InteractionSource $this_collectIsDragAndDropHoveredAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragAndDropHoverInteractionKt$collectIsDragAndDropHoveredAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, e<? super DragAndDropHoverInteractionKt$collectIsDragAndDropHoveredAsState$1$1> eVar) {
        super(2, eVar);
        this.$this_collectIsDragAndDropHoveredAsState = interactionSource;
        this.$isHovered = mutableState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new DragAndDropHoverInteractionKt$collectIsDragAndDropHoveredAsState$1$1(this.$this_collectIsDragAndDropHoveredAsState, this.$isHovered, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((DragAndDropHoverInteractionKt$collectIsDragAndDropHoveredAsState$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final ArrayList arrayList = new ArrayList();
            InteractionSource interactionSource = this.$this_collectIsDragAndDropHoveredAsState;
            final MutableState<Boolean> mutableState = this.$isHovered;
            this.label = 1;
            if (interactionSource.getInteractions().collect(new l() { // from class: androidx.compose.foundation.text.input.internal.DragAndDropHoverInteractionKt$collectIsDragAndDropHoveredAsState$1$1.1
                public final Object emit(Interaction interaction, e<? super ab> eVar) {
                    if (interaction instanceof DragAndDropHoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof DragAndDropHoverInteraction.Exit) {
                        arrayList.remove(((DragAndDropHoverInteraction.Exit) interaction).getEnter());
                    }
                    mutableState.setValue(Boolean.valueOf(!arrayList.isEmpty()));
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
