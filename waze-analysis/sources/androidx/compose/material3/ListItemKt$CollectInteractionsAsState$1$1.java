package androidx.compose.material3;

import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ListItemKt$CollectInteractionsAsState$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ MutableState<Boolean> $draggedState;
    final /* synthetic */ MutableState<Boolean> $focusedState;
    final /* synthetic */ MutableState<Boolean> $hoveredState;
    final /* synthetic */ MutableState<Boolean> $pressedState;
    final /* synthetic */ InteractionSource $this_CollectInteractionsAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListItemKt$CollectInteractionsAsState$1$1(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, InteractionSource interactionSource, e<? super ListItemKt$CollectInteractionsAsState$1$1> eVar) {
        super(2, eVar);
        this.$pressedState = mutableState;
        this.$focusedState = mutableState2;
        this.$hoveredState = mutableState3;
        this.$draggedState = mutableState4;
        this.$this_CollectInteractionsAsState = interactionSource;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new ListItemKt$CollectInteractionsAsState$1$1(this.$pressedState, this.$focusedState, this.$hoveredState, this.$draggedState, this.$this_CollectInteractionsAsState, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((ListItemKt$CollectInteractionsAsState$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            final ArrayList arrayList = this.$pressedState != null ? new ArrayList() : null;
            final ArrayList arrayList2 = this.$focusedState != null ? new ArrayList() : null;
            final ArrayList arrayList3 = this.$hoveredState != null ? new ArrayList() : null;
            final ArrayList arrayList4 = this.$draggedState != null ? new ArrayList() : null;
            InteractionSource interactionSource = this.$this_CollectInteractionsAsState;
            final MutableState<Boolean> mutableState = this.$pressedState;
            final MutableState<Boolean> mutableState2 = this.$focusedState;
            final MutableState<Boolean> mutableState3 = this.$hoveredState;
            final MutableState<Boolean> mutableState4 = this.$draggedState;
            this.label = 1;
            if (interactionSource.getInteractions().collect(new l() { // from class: androidx.compose.material3.ListItemKt$CollectInteractionsAsState$1$1.1
                public final Object emit(Interaction interaction, e<? super ab> eVar) {
                    List<DragInteraction.Start> list;
                    List<DragInteraction.Start> list2;
                    List<HoverInteraction.Enter> list3;
                    List<FocusInteraction.Focus> list4;
                    List<PressInteraction.Press> list5;
                    if (interaction instanceof PressInteraction.Press) {
                        List<PressInteraction.Press> list6 = arrayList;
                        if (list6 != null) {
                            list6.add(interaction);
                        }
                    } else if (interaction instanceof PressInteraction.Release) {
                        List<PressInteraction.Press> list7 = arrayList;
                        if (list7 != null) {
                            list7.remove(((PressInteraction.Release) interaction).getPress());
                        }
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        List<PressInteraction.Press> list8 = arrayList;
                        if (list8 != null) {
                            list8.remove(((PressInteraction.Cancel) interaction).getPress());
                        }
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        List<FocusInteraction.Focus> list9 = arrayList2;
                        if (list9 != null) {
                            list9.add(interaction);
                        }
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        List<FocusInteraction.Focus> list10 = arrayList2;
                        if (list10 != null) {
                            list10.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                        }
                    } else if (interaction instanceof HoverInteraction.Enter) {
                        List<HoverInteraction.Enter> list11 = arrayList3;
                        if (list11 != null) {
                            list11.add(interaction);
                        }
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        List<HoverInteraction.Enter> list12 = arrayList3;
                        if (list12 != null) {
                            list12.remove(((HoverInteraction.Exit) interaction).getEnter());
                        }
                    } else if (interaction instanceof DragInteraction.Start) {
                        List<DragInteraction.Start> list13 = arrayList4;
                        if (list13 != null) {
                            list13.add(interaction);
                        }
                    } else if (interaction instanceof DragInteraction.Stop) {
                        List<DragInteraction.Start> list14 = arrayList4;
                        if (list14 != null) {
                            list14.remove(((DragInteraction.Stop) interaction).getStart());
                        }
                    } else if ((interaction instanceof DragInteraction.Cancel) && (list = arrayList4) != null) {
                        list.remove(((DragInteraction.Cancel) interaction).getStart());
                    }
                    MutableState<Boolean> mutableState5 = mutableState;
                    if (mutableState5 != null && (list5 = arrayList) != null) {
                        mutableState5.setValue(Boolean.valueOf(!list5.isEmpty()));
                    }
                    MutableState<Boolean> mutableState6 = mutableState2;
                    if (mutableState6 != null && (list4 = arrayList2) != null) {
                        mutableState6.setValue(Boolean.valueOf(!list4.isEmpty()));
                    }
                    MutableState<Boolean> mutableState7 = mutableState3;
                    if (mutableState7 != null && (list3 = arrayList3) != null) {
                        mutableState7.setValue(Boolean.valueOf(!list3.isEmpty()));
                    }
                    MutableState<Boolean> mutableState8 = mutableState4;
                    if (mutableState8 != null && (list2 = arrayList4) != null) {
                        mutableState8.setValue(Boolean.valueOf(!list2.isEmpty()));
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
