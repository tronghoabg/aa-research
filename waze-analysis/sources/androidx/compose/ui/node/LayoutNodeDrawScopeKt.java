package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutNodeDrawScopeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node nextDrawNode(DelegatableNode delegatableNode) {
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui != null && (child$ui.getAggregateChildKindSet$ui() & 4) != 0) {
            while (child$ui != null && (child$ui.getKindSet$ui() & 2) == 0) {
                if ((child$ui.getKindSet$ui() & 4) != 0) {
                    return child$ui;
                }
                child$ui = child$ui.getChild$ui();
            }
            return null;
        }
        return null;
    }
}
