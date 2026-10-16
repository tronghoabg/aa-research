package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class OnGloballyPositionedNode extends Modifier.Node implements GlobalPositionAwareModifierNode {
    private l<? super LayoutCoordinates, ab> callback;

    public OnGloballyPositionedNode(l<? super LayoutCoordinates, ab> lVar) {
        this.callback = lVar;
    }

    public final l<LayoutCoordinates, ab> getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(l<? super LayoutCoordinates, ab> lVar) {
        this.callback = lVar;
    }
}
