package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {
    private FocusState focusState;
    private l<? super FocusState, ab> onFocusChanged;

    public FocusChangedNode(l<? super FocusState, ab> lVar) {
        this.onFocusChanged = lVar;
    }

    public final l<FocusState, ab> getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (x.n(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }

    public final void setOnFocusChanged(l<? super FocusState, ab> lVar) {
        this.onFocusChanged = lVar;
    }
}
