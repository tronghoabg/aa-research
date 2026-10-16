package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {
    private l<? super FocusState, ab> onFocusEvent;

    public FocusEventNode(l<? super FocusState, ab> lVar) {
        this.onFocusEvent = lVar;
    }

    public final l<FocusState, ab> getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.onFocusEvent.invoke(focusState);
    }

    public final void setOnFocusEvent(l<? super FocusState, ab> lVar) {
        this.onFocusEvent = lVar;
    }
}
