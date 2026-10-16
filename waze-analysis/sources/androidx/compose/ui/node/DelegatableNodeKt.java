package androidx.compose.ui.node;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import h.ab;
import h.e;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DelegatableNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node, boolean z) {
        MutableVector<LayoutNode> children = getChildren(requireLayoutNode(node), z);
        int size = children.getSize() - 1;
        LayoutNode[] layoutNodeArr = children.content;
        if (size < layoutNodeArr.length) {
            while (size >= 0) {
                mutableVector.add(layoutNodeArr[size].getNodes$ui().getHead$ui());
                size--;
            }
        }
    }

    /* renamed from: ancestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m9914ancestors6rFNWt0(DelegatableNode delegatableNode, int i2, boolean z) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i2) != 0) {
                        for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                            x.i();
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nodePop);
                        }
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return arrayList;
    }

    /* renamed from: ancestors-6rFNWt0$default, reason: not valid java name */
    public static /* synthetic */ List m9915ancestors6rFNWt0$default(DelegatableNode delegatableNode, int i2, boolean z, int i3, Object obj) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z & ((i3 & 2) == 0) ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i2) != 0) {
                        for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                            x.i();
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(nodePop);
                        }
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LayoutModifierNode asLayoutModifierNode(Modifier.Node node) {
        if ((node.getKindSet$ui() & 2) == 0) {
            return null;
        }
        if (node instanceof LayoutModifierNode) {
            return (LayoutModifierNode) node;
        }
        if (!(node instanceof DelegatingNode)) {
            return null;
        }
        Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui();
        while (delegate$ui != 0) {
            if (delegate$ui instanceof LayoutModifierNode) {
                return (LayoutModifierNode) delegate$ui;
            }
            delegate$ui = (!(delegate$ui instanceof DelegatingNode) || (delegate$ui.getKindSet$ui() & 2) == 0) ? delegate$ui.getChild$ui() : ((DelegatingNode) delegate$ui).getDelegate$ui();
        }
        return null;
    }

    /* renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m9916dispatchForKind6rFNWt0(Modifier.Node node, int i2, l<? super T, ab> lVar) {
        while (node != null) {
            x.i();
            lVar.invoke(node);
            node = pop(null);
        }
    }

    /* renamed from: dispatchForKind-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m9917dispatchForKindYYKmho(Modifier.Node node, int i2, boolean z, l<? super T, ab> lVar) {
        MutableVector mutableVector = null;
        while (node != null) {
            x.i();
            lVar.invoke(node);
            if (z && (node.getKindSet$ui() & i2) != 0 && (node instanceof DelegatingNode)) {
                int i3 = 0;
                for (Modifier.Node delegate$ui = ((DelegatingNode) node).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                    if ((delegate$ui.getKindSet$ui() & i2) != 0) {
                        i3++;
                        if (i3 == 1) {
                            node = delegate$ui;
                        } else {
                            if (mutableVector == null) {
                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                            }
                            if (node != null) {
                                mutableVector.add(node);
                                node = null;
                            }
                            mutableVector.add(delegate$ui);
                        }
                    }
                }
                if (i3 != 1) {
                }
            }
            node = pop(mutableVector);
        }
    }

    /* renamed from: dispatchOnScrollChanged-Uv8p0NA, reason: not valid java name */
    public static final void m9918dispatchOnScrollChangedUv8p0NA(DelegatableNode delegatableNode, long j2) {
        requireOwner(delegatableNode).mo10133dispatchOnScrollChangedk4lQ0M(j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v9, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.layout.BeyondBoundsLayout findNearestBeyondBoundsLayoutAncestor(androidx.compose.ui.node.DelegatableNode r7) {
        /*
            androidx.compose.ui.Modifier$Node r0 = r7.getNode()
            boolean r0 = r0.isAttached()
            if (r0 != 0) goto Lf
            java.lang.String r0 = "visitAncestors called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r0)
        Lf:
            androidx.compose.ui.Modifier$Node r0 = r7.getNode()
            androidx.compose.ui.Modifier$Node r0 = r0.getParent$ui()
            androidx.compose.ui.node.LayoutNode r7 = requireLayoutNode(r7)
        L1b:
            r1 = 0
            if (r7 == 0) goto Ld3
            androidx.compose.ui.node.NodeChain r2 = r7.getNodes$ui()
            androidx.compose.ui.Modifier$Node r2 = r2.getHead$ui()
            int r2 = r2.getAggregateChildKindSet$ui()
            r3 = 8388640(0x800020, float:1.1754988E-38)
            r2 = r2 & r3
            if (r2 != 0) goto L32
            goto Lbe
        L32:
            if (r0 == 0) goto Lbe
            int r2 = r0.getKindSet$ui()
            r2 = r2 & r3
            if (r2 == 0) goto Lb8
            int r2 = r0.getKindSet$ui()
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r2 = r2 & r4
            r4 = 1
            if (r2 == 0) goto L6b
            boolean r7 = r0 instanceof androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode
            if (r7 == 0) goto L4a
            goto L62
        L4a:
            boolean r7 = r0 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto L61
            androidx.compose.ui.node.DelegatingNode r0 = (androidx.compose.ui.node.DelegatingNode) r0
            androidx.compose.ui.Modifier$Node r7 = r0.getDelegate$ui()
            r0 = r1
        L55:
            if (r7 == 0) goto L62
            boolean r2 = r7 instanceof androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode
            if (r4 != r2) goto L5c
            r0 = r7
        L5c:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui()
            goto L55
        L61:
            r0 = r1
        L62:
            androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode r0 = (androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode) r0
            if (r0 == 0) goto Ld3
            androidx.compose.ui.layout.BeyondBoundsLayout r7 = r0.getBeyondBoundsLayout()
            return r7
        L6b:
            int r2 = r0.getKindSet$ui()
            r2 = r2 & 32
            if (r2 == 0) goto Lb8
            boolean r2 = r0 instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode
            if (r2 == 0) goto L79
            r5 = r0
            goto L92
        L79:
            boolean r2 = r0 instanceof androidx.compose.ui.node.DelegatingNode
            if (r2 == 0) goto L91
            r2 = r0
            androidx.compose.ui.node.DelegatingNode r2 = (androidx.compose.ui.node.DelegatingNode) r2
            androidx.compose.ui.Modifier$Node r2 = r2.getDelegate$ui()
            r5 = r1
        L85:
            if (r2 == 0) goto L92
            boolean r6 = r2 instanceof androidx.compose.ui.modifier.ModifierLocalModifierNode
            if (r4 != r6) goto L8c
            r5 = r2
        L8c:
            androidx.compose.ui.Modifier$Node r2 = r2.getChild$ui()
            goto L85
        L91:
            r5 = r1
        L92:
            androidx.compose.ui.modifier.ModifierLocalModifierNode r5 = (androidx.compose.ui.modifier.ModifierLocalModifierNode) r5
            if (r5 == 0) goto Lb8
            androidx.compose.ui.modifier.ModifierLocalMap r2 = r5.getProvidedValues()
            androidx.compose.ui.modifier.ProvidableModifierLocal r4 = androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout()
            androidx.compose.ui.modifier.ModifierLocal r4 = (androidx.compose.ui.modifier.ModifierLocal) r4
            boolean r2 = r2.contains$ui(r4)
            if (r2 != 0) goto La7
            goto Lb8
        La7:
            androidx.compose.ui.modifier.ModifierLocalMap r7 = r5.getProvidedValues()
            androidx.compose.ui.modifier.ProvidableModifierLocal r0 = androidx.compose.ui.layout.BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout()
            androidx.compose.ui.modifier.ModifierLocal r0 = (androidx.compose.ui.modifier.ModifierLocal) r0
            java.lang.Object r7 = r7.get$ui(r0)
            androidx.compose.ui.layout.BeyondBoundsLayout r7 = (androidx.compose.ui.layout.BeyondBoundsLayout) r7
            return r7
        Lb8:
            androidx.compose.ui.Modifier$Node r0 = r0.getParent$ui()
            goto L32
        Lbe:
            androidx.compose.ui.node.LayoutNode r7 = r7.getParent$ui()
            if (r7 == 0) goto Ld0
            androidx.compose.ui.node.NodeChain r0 = r7.getNodes$ui()
            if (r0 == 0) goto Ld0
            androidx.compose.ui.Modifier$Node r0 = r0.getTail$ui()
            goto L1b
        Ld0:
            r0 = r1
            goto L1b
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.DelegatableNodeKt.findNearestBeyondBoundsLayoutAncestor(androidx.compose.ui.node.DelegatableNode):androidx.compose.ui.layout.BeyondBoundsLayout");
    }

    private static final MutableVector<LayoutNode> getChildren(LayoutNode layoutNode, boolean z) {
        return z ? layoutNode.getZSortedChildren() : layoutNode.get_children$ui();
    }

    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m9919has64DMado(DelegatableNode delegatableNode, int i2) {
        return (delegatableNode.getNode().getAggregateChildKindSet$ui() & i2) != 0;
    }

    public static final void invalidateDrawForSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            requireLayoutNode(delegatableNode).invalidateDrawForSubtree(1 == ((false ? 1 : 0) | (1 & 1)));
        }
    }

    public static final void invalidateMeasurementForSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            requireLayoutNode(delegatableNode).invalidateMeasurementForSubtree();
        }
    }

    public static final void invalidateSubtree(DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            requireLayoutNode(delegatableNode).invalidateSubtree(1 == ((false ? 1 : 0) | (1 & 1)));
        }
    }

    public static final boolean isDelegationRoot(DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    public static final Modifier.Node nearestAncestor(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i2) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & i2) != 0) {
                        return parent$ui;
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return null;
    }

    /* renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m9920nearestAncestor64DMado(DelegatableNode delegatableNode, int i2) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Object parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i2) != 0) {
                while (parent$ui != null) {
                    if ((((Modifier.Node) parent$ui).getKindSet$ui() & i2) != 0) {
                        Object obj = parent$ui;
                        x.i();
                        return (T) parent$ui;
                    }
                    parent$ui = (T) ((Modifier.Node) parent$ui).getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? (T) null : (T) nodes$ui.getTail$ui();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.getSize() == 0) {
            return null;
        }
        return mutableVector.removeAt(mutableVector.getSize() - 1);
    }

    public static final void requestAutofill(DelegatableNode delegatableNode) {
        requireLayoutNode(delegatableNode).requestAutofill$ui();
    }

    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m9921requireCoordinator64DMado(DelegatableNode delegatableNode, int i2) {
        NodeCoordinator coordinator$ui = delegatableNode.getNode().getCoordinator$ui();
        if (coordinator$ui == null) {
            x.g();
        }
        if (coordinator$ui.getTail() != delegatableNode || !NodeKindKt.m10076getIncludeSelfInTraversalH91voCI(i2)) {
            return coordinator$ui;
        }
        NodeCoordinator wrapped$ui = coordinator$ui.getWrapped$ui();
        if (wrapped$ui == null) {
            x.g();
        }
        return wrapped$ui;
    }

    public static final Density requireDensity(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    public static final GraphicsContext requireGraphicsContext(DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    public static final LayoutCoordinates requireLayoutCoordinates(DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m9921requireCoordinator64DMado(delegatableNode, 2).getCoordinates();
        if (!coordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    public static final LayoutDirection requireLayoutDirection(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    public static final LayoutNode requireLayoutNode(DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui = delegatableNode.getNode().getCoordinator$ui();
        if (coordinator$ui != null) {
            return coordinator$ui.getLayoutNode();
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new e();
    }

    public static final Owner requireOwner(DelegatableNode delegatableNode) {
        Owner owner$ui = requireLayoutNode(delegatableNode).getOwner$ui();
        if (owner$ui != null) {
            return owner$ui;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("This node does not have an owner.");
        throw new e();
    }

    public static final SemanticsInfo requireSemanticsInfo(DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode);
    }

    /* renamed from: setOfAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> ScatterSet<T> m9922setOfAncestors6rFNWt0(DelegatableNode delegatableNode, int i2, boolean z) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        MutableScatterSet mutableScatterSetMutableScatterSetOf = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i2) != 0) {
                        for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                            x.i();
                            if (mutableScatterSetMutableScatterSetOf == null) {
                                mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                            }
                            mutableScatterSetMutableScatterSetOf.add(nodePop);
                        }
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return mutableScatterSetMutableScatterSetOf;
    }

    /* renamed from: setOfAncestors-6rFNWt0$default, reason: not valid java name */
    public static /* synthetic */ ScatterSet m9923setOfAncestors6rFNWt0$default(DelegatableNode delegatableNode, int i2, boolean z, int i3, Object obj) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z & ((i3 & 2) == 0) ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        MutableScatterSet mutableScatterSetMutableScatterSetOf = null;
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i2) != 0) {
                        for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                            x.i();
                            if (mutableScatterSetMutableScatterSetOf == null) {
                                mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
                            }
                            mutableScatterSetMutableScatterSetOf.add(nodePop);
                        }
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
        return mutableScatterSetMutableScatterSetOf;
    }

    public static final void visitAncestors(DelegatableNode delegatableNode, int i2, boolean z, l<? super Modifier.Node, ab> lVar) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i2) != 0) {
                        lVar.invoke(node);
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = null;
            if (layoutNodeRequireLayoutNode != null && (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) != null) {
                node = nodes$ui.getTail$ui();
            }
        }
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i2, boolean z, l lVar, int i3, Object obj) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z & ((i3 & 2) == 0) ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i2) != 0) {
                        lVar.invoke(node);
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = null;
            if (layoutNodeRequireLayoutNode != null && (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) != null) {
                node = nodes$ui.getTail$ui();
            }
        }
    }

    /* renamed from: visitAncestors-QFhIj7k, reason: not valid java name */
    public static final /* synthetic */ <T> void m9924visitAncestorsQFhIj7k(DelegatableNode delegatableNode, int i2, boolean z, boolean z2, l<? super T, ab> lVar) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i2) != 0) {
                        Modifier.Node nodePop = node;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            x.i();
                            lVar.invoke(nodePop);
                            if (z2 && (nodePop.getKindSet$ui() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i3 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & i2) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            nodePop = pop(mutableVector);
                        }
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* renamed from: visitAncestors-QFhIj7k$default, reason: not valid java name */
    public static /* synthetic */ void m9925visitAncestorsQFhIj7k$default(DelegatableNode delegatableNode, int i2, boolean z, boolean z2, l lVar, int i3, Object obj) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z & ((i3 & 2) == 0) ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i2) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & i2) != 0) {
                        Modifier.Node nodePop = node;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            boolean z3 = ((i3 & 4) == 0) & z2;
                            x.i();
                            lVar.invoke(nodePop);
                            if (z3 && (nodePop.getKindSet$ui() & i2) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i4 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & i2) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            nodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (nodePop != null) {
                                                mutableVector.add(nodePop);
                                                nodePop = null;
                                            }
                                            mutableVector.add(delegate$ui);
                                        }
                                    }
                                }
                                if (i4 != 1) {
                                }
                            }
                            nodePop = pop(mutableVector);
                        }
                    }
                    node = node.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    public static final void visitChildren(DelegatableNode delegatableNode, int i2, boolean z, l<? super Modifier.Node, ab> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node child$ui2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((child$ui2.getAggregateChildKindSet$ui() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, child$ui2, z);
            } else {
                while (true) {
                    if (child$ui2 == null) {
                        break;
                    }
                    if ((child$ui2.getKindSet$ui() & i2) != 0) {
                        lVar.invoke(child$ui2);
                        break;
                    }
                    child$ui2 = child$ui2.getChild$ui();
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m9926visitChildrenYYKmho(DelegatableNode delegatableNode, int i2, boolean z, l<? super T, ab> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui() & i2) != 0) {
                        while (nodePop != null) {
                            x.i();
                            lVar.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui();
                    }
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m9927visitChildrenYYKmho$default(DelegatableNode delegatableNode, int i2, boolean z, l lVar, int i3, Object obj) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        boolean z2 = z & ((i3 & 2) == 0);
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z2);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z2);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui() & i2) != 0) {
                        while (nodePop != null) {
                            x.i();
                            lVar.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui();
                    }
                }
            }
        }
    }

    public static final void visitLocalAncestors(DelegatableNode delegatableNode, int i2, l<? super Modifier.Node, ab> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if ((parent$ui.getKindSet$ui() & i2) != 0) {
                lVar.invoke(parent$ui);
            }
        }
    }

    /* renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m9928visitLocalAncestors6rFNWt0(DelegatableNode delegatableNode, int i2, l<? super T, ab> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if ((parent$ui.getKindSet$ui() & i2) != 0) {
                for (Modifier.Node nodePop = parent$ui; nodePop != null; nodePop = pop(null)) {
                    x.i();
                    lVar.invoke(nodePop);
                }
            }
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i2, boolean z, l<? super Modifier.Node, ab> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i2) == 0) {
            return;
        }
        if (!z) {
            node = node.getChild$ui();
        }
        while (node != null) {
            if ((node.getKindSet$ui() & i2) != 0) {
                lVar.invoke(node);
            }
            node = node.getChild$ui();
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(DelegatableNode delegatableNode, int i2, boolean z, l lVar, int i3, Object obj) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i2) == 0) {
            return;
        }
        if (!(z & ((i3 & 2) == 0))) {
            node = node.getChild$ui();
        }
        while (node != null) {
            if ((node.getKindSet$ui() & i2) != 0) {
                lVar.invoke(node);
            }
            node = node.getChild$ui();
        }
    }

    /* renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m9929visitLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i2, l<? super T, ab> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i2) != 0) {
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & i2) != 0) {
                    for (Modifier.Node nodePop = child$ui; nodePop != null; nodePop = pop(null)) {
                        x.i();
                        lVar.invoke(nodePop);
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m9930visitSelfAndAncestors5BbP62I(DelegatableNode delegatableNode, int i2, int i3, l<? super T, ab> lVar) {
        NodeChain nodes$ui;
        Modifier.Node node = delegatableNode.getNode();
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = delegatableNode.getNode();
        LayoutNode layoutNodeRequireLayoutNode = requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            int i4 = i2 | i3;
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & i4) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui() & i4) != 0) {
                        if (node2 != node && (node2.getKindSet$ui() & i3) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui() & i2) != 0) {
                            for (Modifier.Node nodePop = node2; nodePop != null; nodePop = pop(null)) {
                                x.i();
                                lVar.invoke(nodePop);
                            }
                        }
                    }
                    node2 = node2.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            node2 = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m9931visitSelfAndChildrenYYKmho(DelegatableNode delegatableNode, int i2, boolean z, l<? super T, ab> lVar) {
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = pop(null)) {
            x.i();
            lVar.invoke(node);
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui() & i2) != 0) {
                        while (nodePop != null) {
                            x.i();
                            lVar.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui();
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m9932visitSelfAndChildrenYYKmho$default(DelegatableNode delegatableNode, int i2, boolean z, l lVar, int i3, Object obj) {
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = pop(null)) {
            x.i();
            lVar.invoke(node);
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        boolean z2 = z & ((i3 & 2) == 0);
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z2);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node nodePop = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((nodePop.getAggregateChildKindSet$ui() & i2) == 0) {
                addLayoutNodeChildren(mutableVector, nodePop, z2);
            } else {
                while (true) {
                    if (nodePop == null) {
                        break;
                    }
                    if ((nodePop.getKindSet$ui() & i2) != 0) {
                        while (nodePop != null) {
                            x.i();
                            lVar.invoke(nodePop);
                            nodePop = pop(null);
                        }
                    } else {
                        nodePop = nodePop.getChild$ui();
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m9933visitSelfAndLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i2, l<? super T, ab> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i2) != 0) {
            while (node != null) {
                if ((node.getKindSet$ui() & i2) != 0) {
                    for (Modifier.Node nodePop = node; nodePop != null; nodePop = pop(null)) {
                        x.i();
                        lVar.invoke(nodePop);
                    }
                }
                node = node.getChild$ui();
            }
        }
    }

    /* renamed from: visitSubtree-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m9934visitSubtreeYYKmho(DelegatableNode delegatableNode, int i2, boolean z, l<? super T, ab> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui() & i2) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & i2) != 0) {
                        for (Modifier.Node nodePop = child$ui2; nodePop != null; nodePop = pop(null)) {
                            x.i();
                            lVar.invoke(nodePop);
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z);
        }
    }

    /* renamed from: visitSubtree-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m9935visitSubtreeYYKmho$default(DelegatableNode delegatableNode, int i2, boolean z, l lVar, int i3, Object obj) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        boolean z2 = z & ((i3 & 2) == 0);
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z2);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui() & i2) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & i2) != 0) {
                        for (Modifier.Node nodePop = child$ui2; nodePop != null; nodePop = pop(null)) {
                            x.i();
                            lVar.invoke(nodePop);
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z2);
        }
    }

    public static final void visitSubtreeIf(DelegatableNode delegatableNode, int i2, boolean z, l<? super Modifier.Node, Boolean> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui() & i2) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & i2) == 0 || lVar.invoke(child$ui2).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m9936visitSubtreeIfYYKmho(DelegatableNode delegatableNode, int i2, boolean z, l<? super T, Boolean> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui() & i2) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & i2) != 0) {
                        for (Modifier.Node nodePop = child$ui2; nodePop != null; nodePop = pop(null)) {
                            x.i();
                            if (!lVar.invoke(nodePop).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m9937visitSubtreeIfYYKmho$default(DelegatableNode delegatableNode, int i2, boolean z, l lVar, int i3, Object obj) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        boolean z2 = z & ((i3 & 2) == 0);
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z2);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui() & i2) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & i2) != 0) {
                        for (Modifier.Node nodePop = child$ui2; nodePop != null; nodePop = pop(null)) {
                            x.i();
                            if (!((Boolean) lVar.invoke(nodePop)).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z2);
        }
    }

    public static final void visitLocalDescendants(DelegatableNode delegatableNode, int i2, l<? super Modifier.Node, ab> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui() & i2) != 0) {
            for (Modifier.Node child$ui = node.getChild$ui(); child$ui != null; child$ui = child$ui.getChild$ui()) {
                if ((child$ui.getKindSet$ui() & i2) != 0) {
                    lVar.invoke(child$ui);
                }
            }
        }
    }
}
