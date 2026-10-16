package androidx.compose.ui.focus;

import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class RequestChildFocusKt {
    public static final boolean requestFocusForChildInRootBounds(DelegatableNode delegatableNode, int i2, int i3, int i4, int i5) {
        FocusTargetModifierNode focusTargetModifierNodeFindFocusableNodeFromRect$ui = DelegatableNodeKt.requireOwner(delegatableNode).getRectManager().findFocusableNodeFromRect$ui(i2, i3, i4, i5, DelegatableNodeKt.requireLayoutNode(delegatableNode).getSemanticsId());
        if (focusTargetModifierNodeFindFocusableNodeFromRect$ui != null) {
            return FocusTargetModifierNode.CC.m7890requestFocus3ESFkO8$default(focusTargetModifierNodeFindFocusableNodeFromRect$ui, 0, 1, null);
        }
        return false;
    }
}
