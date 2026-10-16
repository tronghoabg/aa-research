package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusTargetNodeKt {
    public static final void invalidateFocusTarget(FocusTargetNode focusTargetNode) {
        DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().scheduleInvalidation(focusTargetNode);
    }
}
