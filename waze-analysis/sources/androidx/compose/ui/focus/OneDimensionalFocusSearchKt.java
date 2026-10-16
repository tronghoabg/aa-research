package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import h.i;
import h.k.j;
import h.k.n;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class OneDimensionalFocusSearchKt {
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final boolean backwardFocusSearch(FocusTargetNode focusTargetNode, l<? super FocusTargetNode, Boolean> lVar) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = focusState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
                if (activeChild == null) {
                    throw new IllegalStateException(NoActiveChild);
                }
                int iOrdinal2 = activeChild.getFocusState().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (backwardFocusSearch(activeChild, lVar) || m7918generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m7864getPreviousdhqQ8s(), lVar)) {
                            return true;
                        }
                        return activeChild.fetchFocusProperties$ui().getCanFocus() && lVar.invoke(activeChild).booleanValue();
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new i();
                        }
                        throw new IllegalStateException(NoActiveChild);
                    }
                }
                return m7918generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m7864getPreviousdhqQ8s(), lVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new i();
                }
                if (pickChildForBackwardSearch(focusTargetNode, lVar)) {
                    return true;
                }
                return focusTargetNode.fetchFocusProperties$ui().getCanFocus() && lVar.invoke(focusTargetNode).booleanValue();
            }
        }
        return pickChildForBackwardSearch(focusTargetNode, lVar);
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t, l<? super T, ab> lVar) {
        boolean zN = false;
        j jVarU = n.u(0, mutableVector.getSize());
        int iA = jVarU.a();
        int iB = jVarU.b();
        if (iA > iB) {
            return;
        }
        while (true) {
            if (zN) {
                lVar.invoke(mutableVector.content[iA]);
            }
            zN |= x.n(mutableVector.content[iA], t);
            if (iA == iB) {
                return;
            } else {
                iA++;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t, l<? super T, ab> lVar) {
        boolean zN = false;
        j jVarU = n.u(0, mutableVector.getSize());
        int iA = jVarU.a();
        int iB = jVarU.b();
        if (iA > iB) {
            return;
        }
        while (true) {
            if (zN) {
                lVar.invoke(mutableVector.content[iB]);
            }
            zN |= x.n(mutableVector.content[iB], t);
            if (iB == iA) {
                return;
            } else {
                iB--;
            }
        }
    }

    private static final boolean forwardFocusSearch(FocusTargetNode focusTargetNode, l<? super FocusTargetNode, Boolean> lVar) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = focusState.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
                if (activeChild != null) {
                    return forwardFocusSearch(activeChild, lVar) || m7918generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m7863getNextdhqQ8s(), lVar);
                }
                throw new IllegalStateException(NoActiveChild);
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return focusTargetNode.fetchFocusProperties$ui().getCanFocus() ? lVar.invoke(focusTargetNode).booleanValue() : pickChildForForwardSearch(focusTargetNode, lVar);
                }
                throw new i();
            }
        }
        return pickChildForForwardSearch(focusTargetNode, lVar);
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m7918generateAndSearchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i2, l<? super FocusTargetNode, Boolean> lVar) {
        if (m7920searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i2, lVar)) {
            return true;
        }
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m7850searchBeyondBoundsOMvw8(focusTargetNode, i2, new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode(), focusTargetNode, focusTargetNode2, i2, lVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean isRoot(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes$ui;
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        if (!focusTargetNode2.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = focusTargetNode2.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        loop0: while (true) {
            node = null;
            if (layoutNodeRequireLayoutNode == null) {
                break;
            }
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                        Modifier.Node nodePop = parent$ui;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                node = nodePop;
                                break loop0;
                            }
                            if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
                                if (i2 != 1) {
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
        return node == null;
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m7919oneDimensionalFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i2, l<? super FocusTargetNode, Boolean> lVar) {
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7863getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetNode, lVar);
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7864getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetNode, lVar);
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetNode focusTargetNode, l<? super FocusTargetNode, Boolean> lVar) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        if (!focusTargetNode2.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode2.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode2.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & 1024) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui() & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                            }
                                            mutableVector3.add(delegate$ui);
                                            nodePop = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[size];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && backwardFocusSearch(focusTargetNode3, lVar)) {
                    return true;
                }
                size--;
            }
        }
        return false;
    }

    private static final boolean pickChildForForwardSearch(FocusTargetNode focusTargetNode, l<? super FocusTargetNode, Boolean> lVar) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        if (!focusTargetNode2.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode2.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode2.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & 1024) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui() & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                            }
                                            mutableVector3.add(delegate$ui);
                                            nodePop = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i3 = 0; i3 < size; i3++) {
            FocusTargetNode focusTargetNode3 = (FocusTargetNode) objArr[i3];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && forwardFocusSearch(focusTargetNode3, lVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m7920searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i2, l<? super FocusTargetNode, Boolean> lVar) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        FocusTargetNode focusTargetNode3 = focusTargetNode;
        if (!focusTargetNode3.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = focusTargetNode3.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode3.getNode(), false);
        } else {
            mutableVector2.add(child$ui);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & 1024) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, nodePop, false);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui() & 1024) != 0) {
                        MutableVector mutableVector3 = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) nodePop);
                            } else if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector3.add(nodePop);
                                            }
                                            mutableVector3.add(delegate$ui);
                                            nodePop = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            nodePop = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7863getNextdhqQ8s())) {
            j jVarU = n.u(0, mutableVector.getSize());
            int iA = jVarU.a();
            int iB = jVarU.b();
            if (iA <= iB) {
                boolean zN = false;
                while (true) {
                    if (zN) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.content[iA];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && forwardFocusSearch(focusTargetNode4, lVar)) {
                            return true;
                        }
                    }
                    zN |= x.n(mutableVector.content[iA], focusTargetNode2);
                    if (iA == iB) {
                        break;
                    }
                    iA++;
                }
            }
        } else {
            if (!FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7864getPreviousdhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            j jVarU2 = n.u(0, mutableVector.getSize());
            int iA2 = jVarU2.a();
            int iB2 = jVarU2.b();
            if (iA2 <= iB2) {
                boolean zN2 = false;
                while (true) {
                    if (zN2) {
                        FocusTargetNode focusTargetNode5 = (FocusTargetNode) mutableVector.content[iB2];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode5) && backwardFocusSearch(focusTargetNode5, lVar)) {
                            return true;
                        }
                    }
                    zN2 |= x.n(mutableVector.content[iB2], focusTargetNode2);
                    if (iB2 == iA2) {
                        break;
                    }
                    iB2--;
                }
            }
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7863getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui().getCanFocus() || isRoot(focusTargetNode)) {
            return false;
        }
        return lVar.invoke(focusTargetNode).booleanValue();
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }
}
