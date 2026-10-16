package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.LayoutDirection;
import h.g.a.l;
import h.g.b.x;
import h.i;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FocusTraversalKt {

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m7904customFocusSearchOMvw8(FocusTargetNode focusTargetNode, int i2, LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester focusRequester;
        FocusRequester start;
        FocusProperties focusPropertiesFetchFocusProperties$ui = focusTargetNode.fetchFocusProperties$ui();
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7863getNextdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui.getNext();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7864getPreviousdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui.getPrevious();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7866getUpdhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui.getUp();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7859getDowndhqQ8s())) {
            return focusPropertiesFetchFocusProperties$ui.getDown();
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s())) {
            LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
            FocusStateImpl focusStateImpl = FocusStateImpl.Active;
            int iOrdinal = layoutDirection.ordinal();
            if (iOrdinal == 0) {
                start = focusPropertiesFetchFocusProperties$ui.getStart();
            } else {
                if (iOrdinal != 1) {
                    throw new i();
                }
                start = focusPropertiesFetchFocusProperties$ui.getEnd();
            }
            focusRequester = start != FocusRequester.Companion.getDefault() ? start : null;
            return focusRequester == null ? focusPropertiesFetchFocusProperties$ui.getLeft() : focusRequester;
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s())) {
            LayoutDirection layoutDirection3 = LayoutDirection.Ltr;
            FocusStateImpl focusStateImpl2 = FocusStateImpl.Active;
            int iOrdinal2 = layoutDirection.ordinal();
            if (iOrdinal2 == 0) {
                end = focusPropertiesFetchFocusProperties$ui.getEnd();
            } else {
                if (iOrdinal2 != 1) {
                    throw new i();
                }
                end = focusPropertiesFetchFocusProperties$ui.getStart();
            }
            focusRequester = end != FocusRequester.Companion.getDefault() ? end : null;
            return focusRequester == null ? focusPropertiesFetchFocusProperties$ui.getRight() : focusRequester;
        }
        if (!FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7860getEnterdhqQ8s()) && !FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7861getExitdhqQ8s())) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i2, null);
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7860getEnterdhqQ8s())) {
            focusPropertiesFetchFocusProperties$ui.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
        } else {
            focusPropertiesFetchFocusProperties$ui.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
        }
        return cancelIndicatingFocusBoundaryScope.isCanceled() ? FocusRequester.Companion.getCancel() : activeFocusTargetNode != focusOwner.getActiveFocusTargetNode() ? FocusRequester.Companion.getRedirect$ui() : FocusRequester.Companion.getDefault();
    }

    public static final FocusTargetNode findActiveFocusNode(FocusTargetNode focusTargetNode) {
        FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode == null || !activeFocusTargetNode.isAttached()) {
            return null;
        }
        return activeFocusTargetNode;
    }

    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui;
        FocusTargetNode focusTargetNode2 = focusTargetNode;
        if (!focusTargetNode2.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = focusTargetNode2.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 1024) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 1024) != 0) {
                        Modifier.Node nodePop = parent$ui;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) nodePop;
                                if (focusTargetNode3.fetchFocusProperties$ui().getCanFocus()) {
                                    return focusTargetNode3;
                                }
                            } else if ((nodePop.getKindSet$ui() & 1024) != 0 && (nodePop instanceof DelegatingNode)) {
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
        return null;
    }

    public static final Rect focusRect(FocusTargetNode focusTargetNode) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates;
        if (!focusTargetNode.isAttached()) {
            return Rect.Companion.getZero();
        }
        NodeCoordinator coordinator$ui = focusTargetNode.getCoordinator$ui();
        if (coordinator$ui != null && (layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(coordinator$ui)) != null) {
            if (true != layoutCoordinatesFindRootCoordinates.isAttached()) {
                layoutCoordinatesFindRootCoordinates = null;
            }
            if (layoutCoordinatesFindRootCoordinates != null) {
                return focusTargetNode.fetchFocusRect$ui(layoutCoordinatesFindRootCoordinates);
            }
        }
        return Rect.Companion.getZero();
    }

    /* renamed from: focusSearch-0X8WOeE, reason: not valid java name */
    public static final Boolean m7905focusSearch0X8WOeE(FocusTargetNode focusTargetNode, int i2, LayoutDirection layoutDirection, Rect rect, l<? super FocusTargetNode, Boolean> lVar) {
        int iM7865getRightdhqQ8s;
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7863getNextdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7864getPreviousdhqQ8s())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.m7919oneDimensionalFocusSearchOMvw8(focusTargetNode, i2, lVar));
        }
        if (FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7862getLeftdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7865getRightdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7866getUpdhqQ8s()) || FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7859getDowndhqQ8s())) {
            return TwoDimensionalFocusSearchKt.m7930twoDimensionalFocusSearchsMXa3k8(focusTargetNode, i2, rect, lVar);
        }
        if (!FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7860getEnterdhqQ8s())) {
            if (!FocusDirection.m7855equalsimpl0(i2, FocusDirection.Companion.m7861getExitdhqQ8s())) {
                String strM7857toStringimpl = FocusDirection.m7857toStringimpl(i2);
                Objects.toString(strM7857toStringimpl);
                throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(strM7857toStringimpl));
            }
            FocusTargetNode focusTargetNodeFindActiveFocusNode = findActiveFocusNode(focusTargetNode);
            FocusTargetNode focusTargetNodeFindNonDeactivatedParent = focusTargetNodeFindActiveFocusNode != null ? findNonDeactivatedParent(focusTargetNodeFindActiveFocusNode) : null;
            boolean zBooleanValue = false;
            if (focusTargetNodeFindNonDeactivatedParent != null && !x.n(focusTargetNodeFindNonDeactivatedParent, focusTargetNode)) {
                zBooleanValue = lVar.invoke(focusTargetNodeFindNonDeactivatedParent).booleanValue();
            }
            return Boolean.valueOf(zBooleanValue);
        }
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        FocusStateImpl focusStateImpl = FocusStateImpl.Active;
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal == 0) {
            iM7865getRightdhqQ8s = FocusDirection.Companion.m7865getRightdhqQ8s();
        } else {
            if (iOrdinal != 1) {
                throw new i();
            }
            iM7865getRightdhqQ8s = FocusDirection.Companion.m7862getLeftdhqQ8s();
        }
        FocusTargetNode focusTargetNodeFindActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
        if (focusTargetNodeFindActiveFocusNode2 == null) {
            return null;
        }
        return TwoDimensionalFocusSearchKt.m7930twoDimensionalFocusSearchsMXa3k8(focusTargetNodeFindActiveFocusNode2, iM7865getRightdhqQ8s, rect, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x003c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode getActiveChild(androidx.compose.ui.focus.FocusTargetNode r9) {
        /*
            androidx.compose.ui.Modifier$Node r0 = r9.getNode()
            boolean r0 = r0.isAttached()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            androidx.compose.ui.node.DelegatableNode r9 = (androidx.compose.ui.node.DelegatableNode) r9
            androidx.compose.ui.Modifier$Node r0 = r9.getNode()
            boolean r0 = r0.isAttached()
            if (r0 != 0) goto L1d
            java.lang.String r0 = "visitChildren called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r0)
        L1d:
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r0.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r9.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui()
            if (r3 != 0) goto L39
            androidx.compose.ui.Modifier$Node r9 = r9.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r0, r9, r4)
            goto L3c
        L39:
            r0.add(r3)
        L3c:
            int r9 = r0.getSize()
            if (r9 == 0) goto Lde
            int r9 = r0.getSize()
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.removeAt(r9)
            androidx.compose.ui.Modifier$Node r9 = (androidx.compose.ui.Modifier.Node) r9
            int r3 = r9.getAggregateChildKindSet$ui()
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L5a
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r0, r9, r4)
            goto L3c
        L5a:
            if (r9 == 0) goto L3c
            int r3 = r9.getKindSet$ui()
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto Ld8
            r3 = r1
        L65:
            if (r9 == 0) goto L3c
            boolean r5 = r9 instanceof androidx.compose.ui.focus.FocusTargetNode
            r6 = 1
            if (r5 == 0) goto L96
            androidx.compose.ui.focus.FocusTargetNode r9 = (androidx.compose.ui.focus.FocusTargetNode) r9
            androidx.compose.ui.Modifier$Node r5 = r9.getNode()
            boolean r5 = r5.isAttached()
            if (r5 == 0) goto Ld3
            androidx.compose.ui.focus.FocusStateImpl r5 = r9.getFocusState()
            androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.ui.unit.LayoutDirection.Ltr
            androidx.compose.ui.focus.FocusStateImpl r7 = androidx.compose.ui.focus.FocusStateImpl.Active
            int r5 = r5.ordinal()
            if (r5 == 0) goto L95
            if (r5 == r6) goto L95
            r6 = 2
            if (r5 == r6) goto L95
            r9 = 3
            if (r5 != r9) goto L8f
            goto Ld3
        L8f:
            h.i r9 = new h.i
            r9.<init>()
            throw r9
        L95:
            return r9
        L96:
            int r5 = r9.getKindSet$ui()
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto Ld3
            boolean r5 = r9 instanceof androidx.compose.ui.node.DelegatingNode
            if (r5 == 0) goto Ld3
            r5 = r9
            androidx.compose.ui.node.DelegatingNode r5 = (androidx.compose.ui.node.DelegatingNode) r5
            androidx.compose.ui.Modifier$Node r5 = r5.getDelegate$ui()
            r7 = r4
        Laa:
            if (r5 == 0) goto Ld1
            int r8 = r5.getKindSet$ui()
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Lcc
            int r7 = r7 + 1
            if (r7 != r6) goto Lba
            r9 = r5
            goto Lcc
        Lba:
            if (r3 != 0) goto Lc3
            androidx.compose.runtime.collection.MutableVector r3 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r2]
            r3.<init>(r8, r4)
        Lc3:
            if (r9 == 0) goto Lc8
            r3.add(r9)
        Lc8:
            r3.add(r5)
            r9 = r1
        Lcc:
            androidx.compose.ui.Modifier$Node r5 = r5.getChild$ui()
            goto Laa
        Ld1:
            if (r7 == r6) goto L65
        Ld3:
            androidx.compose.ui.Modifier$Node r9 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r3)
            goto L65
        Ld8:
            androidx.compose.ui.Modifier$Node r9 = r9.getChild$ui()
            goto L5a
        Lde:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean isEligibleForFocusSearch(FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator$ui;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator$ui2 = focusTargetNode.getCoordinator$ui();
        return (coordinator$ui2 == null || (layoutNode = coordinator$ui2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator$ui = focusTargetNode.getCoordinator$ui()) == null || (layoutNode2 = coordinator$ui.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }
}
