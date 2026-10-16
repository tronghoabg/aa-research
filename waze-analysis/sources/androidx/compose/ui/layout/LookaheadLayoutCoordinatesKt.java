package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinatesKt {
    public static final LookaheadDelegate getRootLookaheadDelegate(LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode parent$ui = layoutNode.getParent$ui();
            if ((parent$ui != null ? parent$ui.getLookaheadRoot$ui() : null) == null) {
                break;
            }
            LayoutNode parent$ui2 = layoutNode.getParent$ui();
            LayoutNode lookaheadRoot$ui = parent$ui2 != null ? parent$ui2.getLookaheadRoot$ui() : null;
            if (lookaheadRoot$ui == null) {
                x.g();
            }
            if (lookaheadRoot$ui.isVirtualLookaheadRoot$ui()) {
                layoutNode = layoutNode.getParent$ui();
                if (layoutNode == null) {
                    x.g();
                }
            } else {
                LayoutNode parent$ui3 = layoutNode.getParent$ui();
                if (parent$ui3 == null) {
                    x.g();
                }
                layoutNode = parent$ui3.getLookaheadRoot$ui();
                if (layoutNode == null) {
                    x.g();
                }
            }
        }
        LookaheadDelegate lookaheadDelegate2 = layoutNode.getOuterCoordinator$ui().getLookaheadDelegate();
        if (lookaheadDelegate2 == null) {
            x.g();
        }
        return lookaheadDelegate2;
    }
}
