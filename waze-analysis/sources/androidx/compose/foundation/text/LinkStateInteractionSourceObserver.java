package androidx.compose.foundation.text;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import h.ab;
import h.c.a.a;
import h.c.e;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LinkStateInteractionSourceObserver {
    public static final int $stable = 0;
    private final InteractionSource interactionSource;
    private final int Focused = 1;
    private final int Hovered = 2;
    private final int Pressed = 4;
    private final MutableIntState interactionState = SnapshotIntStateKt.mutableIntStateOf(0);

    public LinkStateInteractionSourceObserver(InteractionSource interactionSource) {
        this.interactionSource = interactionSource;
    }

    public final Object collectInteractionsForLinks(e<? super ab> eVar) {
        final MutableObjectList mutableObjectList = new MutableObjectList(0, 1, null);
        Object objCollect = this.interactionSource.getInteractions().collect(new l() { // from class: androidx.compose.foundation.text.LinkStateInteractionSourceObserver.collectInteractionsForLinks.2
            public final Object emit(Interaction interaction, e<? super ab> eVar2) {
                int i2;
                if ((interaction instanceof HoverInteraction.Enter) || (interaction instanceof FocusInteraction.Focus) || (interaction instanceof PressInteraction.Press)) {
                    mutableObjectList.add(interaction);
                } else if (interaction instanceof HoverInteraction.Exit) {
                    mutableObjectList.remove(((HoverInteraction.Exit) interaction).getEnter());
                } else if (interaction instanceof FocusInteraction.Unfocus) {
                    mutableObjectList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                } else if (interaction instanceof PressInteraction.Release) {
                    mutableObjectList.remove(((PressInteraction.Release) interaction).getPress());
                } else if (interaction instanceof PressInteraction.Cancel) {
                    mutableObjectList.remove(((PressInteraction.Cancel) interaction).getPress());
                }
                MutableObjectList<Interaction> mutableObjectList2 = mutableObjectList;
                LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this;
                MutableObjectList<Interaction> mutableObjectList3 = mutableObjectList2;
                Object[] objArr = mutableObjectList3.content;
                int i3 = mutableObjectList3._size;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Interaction interaction2 = (Interaction) objArr[i5];
                    if (interaction2 instanceof HoverInteraction.Enter) {
                        i2 = linkStateInteractionSourceObserver.Hovered;
                    } else if (interaction2 instanceof FocusInteraction.Focus) {
                        i2 = linkStateInteractionSourceObserver.Focused;
                    } else if (interaction2 instanceof PressInteraction.Press) {
                        i2 = linkStateInteractionSourceObserver.Pressed;
                    }
                    i4 |= i2;
                }
                this.interactionState.setIntValue(i4);
                return ab.f48028a;
            }

            @Override // kotlinx.coroutines.b.l
            public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar2) {
                return emit((Interaction) obj, (e<? super ab>) eVar2);
            }
        }, eVar);
        return objCollect == a.f48038a ? objCollect : ab.f48028a;
    }

    public final boolean isFocused() {
        return (this.Focused & this.interactionState.getIntValue()) != 0;
    }

    public final boolean isHovered() {
        return (this.Hovered & this.interactionState.getIntValue()) != 0;
    }

    public final boolean isPressed() {
        return (this.Pressed & this.interactionState.getIntValue()) != 0;
    }
}
