package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BeyondBoundsLayoutKt {
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m7850searchBeyondBoundsOMvw8(FocusTargetNode focusTargetNode, int i2, l<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> lVar) {
        Modifier.Node nodePop;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int iM9730getBeforehoxUOeE;
        NodeChain nodes$ui;
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        if (!focusTargetNode2.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = focusTargetNode2.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            if (layoutNodeRequireLayoutNode == null) {
                nodePop = null;
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                        nodePop = parent$ui;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                            }
                                            mutableVector.add(delegate$ui);
                                            nodePop = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodePop;
        if ((focusTargetNode3 != null && x.n(focusTargetNode3.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
            return null;
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7866getUpdhqQ8s())) {
            iM9730getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m9728getAbovehoxUOeE();
        } else if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7859getDowndhqQ8s())) {
            iM9730getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m9731getBelowhoxUOeE();
        } else if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s())) {
            iM9730getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m9732getLefthoxUOeE();
        } else if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s())) {
            iM9730getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m9733getRighthoxUOeE();
        } else if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7863getNextdhqQ8s())) {
            iM9730getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m9729getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7864getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            iM9730getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m9730getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo2930layouto7g1Pn8(iM9730getBeforehoxUOeE, lVar);
    }
}
