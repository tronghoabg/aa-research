package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmAndAndroidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.TraversableNode;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TraversableNodeKt {
    public static final <T extends TraversableNode> T findNearestAncestor(T t) {
        NodeChain nodes$ui;
        T t2 = t;
        if (!t2.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = t2.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(t2);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        Modifier.Node nodePop = parent$ui;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof TraversableNode) {
                                T t3 = (T) nodePop;
                                if (x.n(t.getTraverseKey(), t3.getTraverseKey()) && Actual_jvmAndAndroidKt.areObjectsOfSameType(t, t3)) {
                                    return t3;
                                }
                            }
                            if ((nodePop.getKindSet$ui() & 262144) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & 262144) != 0) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final <T extends TraversableNode> void traverseAncestors(T t, l<? super T, Boolean> lVar) {
        NodeChain nodes$ui;
        T t2 = t;
        if (!t2.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = t2.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(t2);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        DelegatingNode delegatingNodePop = parent$ui;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (x.n(t.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmAndAndroidKt.areObjectsOfSameType(t, traversableNode) && !lVar.invoke(traversableNode).booleanValue()) {
                                    return;
                                }
                            } else if ((delegatingNodePop.getKindSet$ui() & 262144) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                                int i2 = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            delegatingNodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector.add(delegatingNodePop);
                                            }
                                            mutableVector.add(delegate$ui);
                                            delegatingNodePop = 0;
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i2 != 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0031, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r0v8, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void traverseChildren(T r11, h.g.a.l<? super T, java.lang.Boolean> r12) {
        /*
            r0 = r11
            androidx.compose.ui.node.DelegatableNode r0 = (androidx.compose.ui.node.DelegatableNode) r0
            androidx.compose.ui.Modifier$Node r1 = r0.getNode()
            boolean r1 = r1.isAttached()
            if (r1 != 0) goto L12
            java.lang.String r1 = "visitChildren called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        L12:
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r0.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui()
            if (r3 != 0) goto L2e
            androidx.compose.ui.Modifier$Node r0 = r0.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r0, r4)
            goto L31
        L2e:
            r1.add(r3)
        L31:
            int r0 = r1.getSize()
            if (r0 == 0) goto Lca
            int r0 = r1.getSize()
            int r0 = r0 + (-1)
            java.lang.Object r0 = r1.removeAt(r0)
            androidx.compose.ui.Modifier$Node r0 = (androidx.compose.ui.Modifier.Node) r0
            int r3 = r0.getAggregateChildKindSet$ui()
            r5 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 & r5
            if (r3 != 0) goto L50
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r0, r4)
            goto L31
        L50:
            if (r0 == 0) goto L31
            int r3 = r0.getKindSet$ui()
            r3 = r3 & r5
            if (r3 == 0) goto Lc5
            r3 = 0
            r6 = r3
        L5b:
            if (r0 == 0) goto L31
            boolean r7 = r0 instanceof androidx.compose.ui.node.TraversableNode
            if (r7 == 0) goto L84
            androidx.compose.ui.node.TraversableNode r0 = (androidx.compose.ui.node.TraversableNode) r0
            java.lang.Object r7 = r11.getTraverseKey()
            java.lang.Object r8 = r0.getTraverseKey()
            boolean r7 = h.g.b.x.n(r7, r8)
            if (r7 == 0) goto Lc0
            boolean r7 = androidx.compose.ui.Actual_jvmAndAndroidKt.areObjectsOfSameType(r11, r0)
            if (r7 == 0) goto Lc0
            java.lang.Object r0 = r12.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lca
            goto Lc0
        L84:
            int r7 = r0.getKindSet$ui()
            r7 = r7 & r5
            if (r7 == 0) goto Lc0
            boolean r7 = r0 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto Lc0
            r7 = r0
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui()
            r8 = r4
        L97:
            r9 = 1
            if (r7 == 0) goto Lbe
            int r10 = r7.getKindSet$ui()
            r10 = r10 & r5
            if (r10 == 0) goto Lb9
            int r8 = r8 + 1
            if (r8 != r9) goto La7
            r0 = r7
            goto Lb9
        La7:
            if (r6 != 0) goto Lb0
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r2]
            r6.<init>(r9, r4)
        Lb0:
            if (r0 == 0) goto Lb5
            r6.add(r0)
        Lb5:
            r6.add(r7)
            r0 = r3
        Lb9:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui()
            goto L97
        Lbe:
            if (r8 == r9) goto L5b
        Lc0:
            androidx.compose.ui.Modifier$Node r0 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L5b
        Lc5:
            androidx.compose.ui.Modifier$Node r0 = r0.getChild$ui()
            goto L50
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.TraversableNode, h.g.a.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    public static final <T extends TraversableNode> void traverseDescendants(T t, l<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        T t2 = t;
        if (!t2.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = t2.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, t2.getNode(), false);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui() & 262144) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & 262144) != 0) {
                        DelegatingNode delegatingNodePop = child$ui2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsActionInvoke = (x.n(t.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmAndAndroidKt.areObjectsOfSameType(t, traversableNode)) ? lVar.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((delegatingNodePop.getKindSet$ui() & 262144) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                                int i2 = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            delegatingNodePop = delegate$ui;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                            }
                                            mutableVector2.add(delegate$ui);
                                            delegatingNodePop = 0;
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i2 != 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
    }

    public static final TraversableNode findNearestAncestor(DelegatableNode delegatableNode, Object obj) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        Modifier.Node nodePop = parent$ui;
                        MutableVector mutableVector = null;
                        while (nodePop != null) {
                            if (nodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) nodePop;
                                if (x.n(obj, traversableNode.getTraverseKey())) {
                                    return traversableNode;
                                }
                            }
                            if ((nodePop.getKindSet$ui() & 262144) != 0 && (nodePop instanceof DelegatingNode)) {
                                int i2 = 0;
                                for (Modifier.Node delegate$ui = ((DelegatingNode) nodePop).getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
                                    if ((delegate$ui.getKindSet$ui() & 262144) != 0) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final void traverseAncestors(DelegatableNode delegatableNode, Object obj, l<? super TraversableNode, Boolean> lVar) {
        NodeChain nodes$ui;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (layoutNodeRequireLayoutNode != null) {
            if ((layoutNodeRequireLayoutNode.getNodes$ui().getHead$ui().getAggregateChildKindSet$ui() & 262144) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & 262144) != 0) {
                        DelegatingNode delegatingNodePop = parent$ui;
                        MutableVector mutableVector = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (x.n(obj, traversableNode.getTraverseKey()) && !lVar.invoke(traversableNode).booleanValue()) {
                                    return;
                                }
                            } else if ((delegatingNodePop.getKindSet$ui() & 262144) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                                int i2 = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            delegatingNodePop = delegate$ui;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector.add(delegatingNodePop);
                                            }
                                            mutableVector.add(delegate$ui);
                                            delegatingNodePop = 0;
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i2 != 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            layoutNodeRequireLayoutNode = layoutNodeRequireLayoutNode.getParent$ui();
            parent$ui = (layoutNodeRequireLayoutNode == null || (nodes$ui = layoutNodeRequireLayoutNode.getNodes$ui()) == null) ? null : nodes$ui.getTail$ui();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x002e, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void traverseChildren(androidx.compose.ui.node.DelegatableNode r10, java.lang.Object r11, h.g.a.l<? super androidx.compose.ui.node.TraversableNode, java.lang.Boolean> r12) {
        /*
            androidx.compose.ui.Modifier$Node r0 = r10.getNode()
            boolean r0 = r0.isAttached()
            if (r0 != 0) goto Lf
            java.lang.String r0 = "visitChildren called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r0)
        Lf:
            androidx.compose.runtime.collection.MutableVector r0 = new androidx.compose.runtime.collection.MutableVector
            r1 = 16
            androidx.compose.ui.Modifier$Node[] r2 = new androidx.compose.ui.Modifier.Node[r1]
            r3 = 0
            r0.<init>(r2, r3)
            androidx.compose.ui.Modifier$Node r2 = r10.getNode()
            androidx.compose.ui.Modifier$Node r2 = r2.getChild$ui()
            if (r2 != 0) goto L2b
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r0, r10, r3)
            goto L2e
        L2b:
            r0.add(r2)
        L2e:
            int r10 = r0.getSize()
            if (r10 == 0) goto Lbd
            int r10 = r0.getSize()
            int r10 = r10 + (-1)
            java.lang.Object r10 = r0.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.ui.Modifier.Node) r10
            int r2 = r10.getAggregateChildKindSet$ui()
            r4 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r4
            if (r2 != 0) goto L4d
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r0, r10, r3)
            goto L2e
        L4d:
            if (r10 == 0) goto L2e
            int r2 = r10.getKindSet$ui()
            r2 = r2 & r4
            if (r2 == 0) goto Lb8
            r2 = 0
            r5 = r2
        L58:
            if (r10 == 0) goto L2e
            boolean r6 = r10 instanceof androidx.compose.ui.node.TraversableNode
            if (r6 == 0) goto L77
            androidx.compose.ui.node.TraversableNode r10 = (androidx.compose.ui.node.TraversableNode) r10
            java.lang.Object r6 = r10.getTraverseKey()
            boolean r6 = h.g.b.x.n(r11, r6)
            if (r6 == 0) goto Lb3
            java.lang.Object r10 = r12.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lbd
            goto Lb3
        L77:
            int r6 = r10.getKindSet$ui()
            r6 = r6 & r4
            if (r6 == 0) goto Lb3
            boolean r6 = r10 instanceof androidx.compose.ui.node.DelegatingNode
            if (r6 == 0) goto Lb3
            r6 = r10
            androidx.compose.ui.node.DelegatingNode r6 = (androidx.compose.ui.node.DelegatingNode) r6
            androidx.compose.ui.Modifier$Node r6 = r6.getDelegate$ui()
            r7 = r3
        L8a:
            r8 = 1
            if (r6 == 0) goto Lb1
            int r9 = r6.getKindSet$ui()
            r9 = r9 & r4
            if (r9 == 0) goto Lac
            int r7 = r7 + 1
            if (r7 != r8) goto L9a
            r10 = r6
            goto Lac
        L9a:
            if (r5 != 0) goto La3
            androidx.compose.runtime.collection.MutableVector r5 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r8 = new androidx.compose.ui.Modifier.Node[r1]
            r5.<init>(r8, r3)
        La3:
            if (r10 == 0) goto La8
            r5.add(r10)
        La8:
            r5.add(r6)
            r10 = r2
        Lac:
            androidx.compose.ui.Modifier$Node r6 = r6.getChild$ui()
            goto L8a
        Lb1:
            if (r7 == r8) goto L58
        Lb3:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r5)
            goto L58
        Lb8:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui()
            goto L4d
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.DelegatableNode, java.lang.Object, h.g.a.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    public static final void traverseDescendants(DelegatableNode delegatableNode, Object obj, l<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsActionInvoke;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui = delegatableNode.getNode().getChild$ui();
        if (child$ui == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), false);
        } else {
            mutableVector.add(child$ui);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui() & 262144) != 0) {
                for (Modifier.Node child$ui2 = node; child$ui2 != null && child$ui2.isAttached(); child$ui2 = child$ui2.getChild$ui()) {
                    if ((child$ui2.getKindSet$ui() & 262144) != 0) {
                        DelegatingNode delegatingNodePop = child$ui2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNodePop;
                                if (x.n(obj, traversableNode.getTraverseKey())) {
                                    traverseDescendantsActionInvoke = lVar.invoke(traversableNode);
                                } else {
                                    traverseDescendantsActionInvoke = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                }
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsActionInvoke == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((delegatingNodePop.getKindSet$ui() & 262144) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui = delegatingNodePop.getDelegate$ui();
                                int i2 = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui != null) {
                                    if ((delegate$ui.getKindSet$ui() & 262144) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            delegatingNodePop = delegate$ui;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                            }
                                            mutableVector2.add(delegate$ui);
                                            delegatingNodePop = 0;
                                        }
                                    }
                                    delegate$ui = delegate$ui.getChild$ui();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i2 != 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
    }
}
