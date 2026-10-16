package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusState;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class BasicTooltipKt$keyboardBehavior$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ FocusState $it;
    final /* synthetic */ MutableState<Boolean> $receivedKeyboardFocus;
    final /* synthetic */ TooltipState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTooltipKt$keyboardBehavior$1$1(FocusState focusState, MutableState<Boolean> mutableState, TooltipState tooltipState, e<? super BasicTooltipKt$keyboardBehavior$1$1> eVar) {
        super(2, eVar);
        this.$it = focusState;
        this.$receivedKeyboardFocus = mutableState;
        this.$state = tooltipState;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new BasicTooltipKt$keyboardBehavior$1$1(this.$it, this.$receivedKeyboardFocus, this.$state, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((BasicTooltipKt$keyboardBehavior$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            if (this.$it.isFocused()) {
                this.$receivedKeyboardFocus.setValue(true);
                this.label = 1;
                if (this.$state.show(MutatePriority.PreventUserInput, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
        }
        if (this.$receivedKeyboardFocus.getValue().booleanValue() && this.$state.isVisible() && !this.$it.isFocused()) {
            this.$receivedKeyboardFocus.setValue(false);
            this.$state.dismiss();
        }
        return ab.f48028a;
    }
}
