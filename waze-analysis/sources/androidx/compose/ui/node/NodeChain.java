package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ModifierInfo;
import h.a.ac;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class NodeChain {
    public static final int $stable = 8;
    private MutableVector<Modifier.Element> buffer;
    private Differ cachedDiffer;
    private MutableVector<Modifier.Element> current;
    private Modifier.Node head;
    private final InnerNodeCoordinator innerCoordinator;
    private final LayoutNode layoutNode;
    private Logger logger;
    private NodeCoordinator outerCoordinator;
    private final NodeChain$sentinelHead$1 sentinelHead;
    private final MutableVector<Modifier> stack;
    private final Modifier.Node tail;

    /* compiled from: WazeSource */
    final class Differ implements DiffCallback {
        private MutableVector<Modifier.Element> after;
        private MutableVector<Modifier.Element> before;
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public Differ(Modifier.Node node, int i2, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z) {
            this.node = node;
            this.offset = i2;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int i2, int i3) {
            MutableVector<Modifier.Element> mutableVector = this.before;
            int i4 = this.offset;
            return NodeChainKt.actionForModifiers(mutableVector.content[i2 + i4], this.after.content[i4 + i3]) != 0;
        }

        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        public final Modifier.Node getNode() {
            return this.node;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int i2) {
            int i3 = this.offset + i2;
            Modifier.Node node = this.node;
            this.node = NodeChain.this.createAndInsertNodeAsChild(this.after.content[i3], node);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeInserted(i3, i3, this.after.content[i3], node, this.node);
            }
            boolean z = this.shouldAttachOnInsert;
            Modifier.Node node2 = this.node;
            if (!z) {
                node2.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
            Modifier.Node child$ui = node2.getChild$ui();
            if (child$ui == null) {
                x.g();
            }
            NodeCoordinator coordinator$ui = child$ui.getCoordinator$ui();
            if (coordinator$ui == null) {
                x.g();
            }
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.node);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), layoutModifierNodeAsLayoutModifierNode);
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = layoutModifierNodeCoordinator;
                this.node.updateCoordinator$ui(layoutModifierNodeCoordinator2);
                NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator2);
                layoutModifierNodeCoordinator.setWrappedBy$ui(coordinator$ui.getWrappedBy$ui());
                layoutModifierNodeCoordinator.setWrapped$ui(coordinator$ui);
                coordinator$ui.setWrappedBy$ui(layoutModifierNodeCoordinator2);
            } else {
                this.node.updateCoordinator$ui(coordinator$ui);
            }
            this.node.markAsAttached$ui();
            this.node.runAttachLifecycle$ui();
            NodeKindKt.autoInvalidateInsertedNode(this.node);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int i2, int i3) {
            Modifier.Node child$ui = this.node.getChild$ui();
            if (child$ui == null) {
                x.g();
            }
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                MutableVector<Modifier.Element> mutableVector = this.before;
                logger.nodeRemoved(i3, mutableVector.content[this.offset + i3], child$ui);
            }
            if ((child$ui.getKindSet$ui() & 2) != 0) {
                NodeCoordinator coordinator$ui = child$ui.getCoordinator$ui();
                if (coordinator$ui == null) {
                    x.g();
                }
                NodeCoordinator wrappedBy$ui = coordinator$ui.getWrappedBy$ui();
                NodeCoordinator wrapped$ui = coordinator$ui.getWrapped$ui();
                if (wrapped$ui == null) {
                    x.g();
                }
                if (wrappedBy$ui != null) {
                    wrappedBy$ui.setWrapped$ui(wrapped$ui);
                }
                wrapped$ui.setWrappedBy$ui(wrappedBy$ui);
                NodeChain.this.propagateCoordinator(this.node, wrapped$ui);
            }
            this.node = NodeChain.this.detachAndRemoveNode(child$ui);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int i2, int i3) {
            Modifier.Node child$ui = this.node.getChild$ui();
            if (child$ui == null) {
                x.g();
            }
            this.node = child$ui;
            MutableVector<Modifier.Element> mutableVector = this.before;
            int i4 = this.offset;
            Modifier.Element element = mutableVector.content[i4 + i2];
            Modifier.Element element2 = this.after.content[i4 + i3];
            boolean zN = x.n(element, element2);
            NodeChain nodeChain = NodeChain.this;
            if (zN) {
                Logger logger = nodeChain.logger;
                if (logger != null) {
                    int i5 = this.offset;
                    logger.nodeReused(i5 + i2, i5 + i3, element, element2, this.node);
                    return;
                }
                return;
            }
            nodeChain.updateNode(element, element2, this.node);
            Logger logger2 = NodeChain.this.logger;
            if (logger2 != null) {
                int i6 = this.offset;
                logger2.nodeUpdated(i6 + i2, i6 + i3, element, element2, this.node);
            }
        }

        public final void setAfter(MutableVector<Modifier.Element> mutableVector) {
            this.after = mutableVector;
        }

        public final void setBefore(MutableVector<Modifier.Element> mutableVector) {
            this.before = mutableVector;
        }

        public final void setNode(Modifier.Node node) {
            this.node = node;
        }

        public final void setOffset(int i2) {
            this.offset = i2;
        }

        public final void setShouldAttachOnInsert(boolean z) {
            this.shouldAttachOnInsert = z;
        }
    }

    /* compiled from: WazeSource */
    public interface Logger {
        void linearDiffAborted(int i2, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeInserted(int i2, int i3, Modifier.Element element, Modifier.Node node, Modifier.Node node2);

        void nodeRemoved(int i2, Modifier.Element element, Modifier.Node node);

        void nodeReused(int i2, int i3, Modifier.Element element, Modifier.Element element2, Modifier.Node node);

        void nodeUpdated(int i2, int i3, Modifier.Element element, Modifier.Element element2, Modifier.Node node);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.NodeChain$sentinelHead$1] */
    public NodeChain(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        ?? r0 = new Modifier.Node() { // from class: androidx.compose.ui.node.NodeChain$sentinelHead$1
            public String toString() {
                return "<Head>";
            }
        };
        r0.setAggregateChildKindSet$ui(-1);
        this.sentinelHead = r0;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
        this.stack = new MutableVector<>(new Modifier[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node node) {
        BackwardsCompatNode backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui(true);
        insertChild(backwardsCompatNode, node);
        return backwardsCompatNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui();
            node.markAsDetached$ui();
        }
        return removeNode(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet$ui();
    }

    private final Differ getDiffer(Modifier.Node node, int i2, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(node, i2, mutableVector, mutableVector2, z);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(node);
        differ.setOffset(i2);
        differ.setBefore(mutableVector);
        differ.setAfter(mutableVector2);
        differ.setShouldAttachOnInsert(z);
        return differ;
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node child$ui = node2.getChild$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(node);
            node.setChild$ui(child$ui);
        }
        node2.setChild$ui(node);
        node.setParent$ui(node2);
        return node;
    }

    private final Modifier.Node padChain() {
        if (this.head == this.sentinelHead) {
            InlineClassHelperKt.throwIllegalStateException("padChain called on already padded chain");
        }
        Modifier.Node node = this.head;
        node.setParent$ui(this.sentinelHead);
        setChild$ui(node);
        return this.sentinelHead;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateCoordinator(Modifier.Node node, NodeCoordinator nodeCoordinator) {
        for (Modifier.Node parent$ui = node.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            if (parent$ui == this.sentinelHead) {
                LayoutNode parent$ui2 = this.layoutNode.getParent$ui();
                nodeCoordinator.setWrappedBy$ui(parent$ui2 != null ? parent$ui2.getInnerCoordinator$ui() : null);
                this.outerCoordinator = nodeCoordinator;
                return;
            } else {
                if ((parent$ui.getKindSet$ui() & 2) != 0) {
                    return;
                }
                parent$ui.updateCoordinator$ui(nodeCoordinator);
            }
        }
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui = node.getChild$ui();
        Modifier.Node parent$ui = node.getParent$ui();
        if (child$ui != null) {
            child$ui.setParent$ui(parent$ui);
            node.setChild$ui(null);
        }
        if (parent$ui != null) {
            parent$ui.setChild$ui(child$ui);
            node.setParent$ui(null);
        }
        if (parent$ui == null) {
            x.g();
        }
        return parent$ui;
    }

    private final void structuralUpdate(int i2, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, Modifier.Node node, boolean z) {
        MyersDiffKt.executeDiff(mutableVector.getSize() - i2, mutableVector2.getSize() - i2, getDiffer(node, i2, mutableVector, mutableVector2, z));
        syncAggregateChildKindSet();
    }

    private final void syncAggregateChildKindSet() {
        int kindSet$ui = 0;
        for (Modifier.Node parent$ui = this.tail.getParent$ui(); parent$ui != null && parent$ui != this.sentinelHead; parent$ui = parent$ui.getParent$ui()) {
            kindSet$ui |= parent$ui.getKindSet$ui();
            parent$ui.setAggregateChildKindSet$ui(kindSet$ui);
        }
    }

    private final Modifier.Node trimChain(Modifier.Node node) {
        if (node != this.sentinelHead) {
            InlineClassHelperKt.throwIllegalStateException("trimChain called on already trimmed chain");
        }
        Modifier.Node child$ui = getChild$ui();
        if (child$ui == null) {
            child$ui = this.tail;
        }
        child$ui.setParent$ui(null);
        setChild$ui(null);
        setAggregateChildKindSet$ui(-1);
        updateCoordinator$ui(null);
        if (child$ui == this.sentinelHead) {
            InlineClassHelperKt.throwIllegalStateException("trimChain did not update the head");
        }
        return child$ui;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNode(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.updateUnsafe((ModifierNodeElement) element2, node);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            InlineClassHelperKt.throwIllegalStateException("Unknown Modifier.Node type");
            return;
        }
        ((BackwardsCompatNode) node).setElement(element2);
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateUpdatedNode(node);
        } else {
            node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
        }
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui, reason: not valid java name */
    public final /* synthetic */ <T> T m10026firstFromHeadaLcG6gQ$ui(int i2, l<? super T, Boolean> lVar) {
        if ((getAggregateChildKindSet() & i2) != 0) {
            for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & i2) != 0) {
                    for (Modifier.Node nodePop = head$ui; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                        x.i();
                        if (lVar.invoke(nodePop).booleanValue()) {
                            return nodePop;
                        }
                    }
                }
                if ((head$ui.getAggregateChildKindSet$ui() & i2) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final Modifier.Node getHead$ui() {
        return this.head;
    }

    public final InnerNodeCoordinator getInnerCoordinator$ui() {
        return this.innerCoordinator;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return ac.f47967a;
        }
        int i2 = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head$ui = getHead$ui();
        while (head$ui != null && head$ui != getTail$ui()) {
            NodeCoordinator coordinator$ui = head$ui.getCoordinator$ui();
            if (coordinator$ui == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
            OwnedLayer layer = coordinator$ui.getLayer();
            OwnedLayer layer2 = innerNodeCoordinator.getLayer();
            Modifier.Node child$ui = head$ui.getChild$ui();
            if (child$ui != this.tail || head$ui.getCoordinator$ui() == child$ui.getCoordinator$ui()) {
                layer2 = null;
            }
            if (layer == null) {
                layer = layer2;
            }
            mutableVector2.add(new ModifierInfo(mutableVector.content[i2], coordinator$ui, layer));
            head$ui = head$ui.getChild$ui();
            i2++;
        }
        return mutableVector2.asMutableList();
    }

    public final NodeCoordinator getOuterCoordinator$ui() {
        return this.outerCoordinator;
    }

    public final Modifier.Node getTail$ui() {
        return this.tail;
    }

    public final boolean has$ui(int i2) {
        return (getAggregateChildKindSet() & i2) != 0;
    }

    /* renamed from: has-H91voCI$ui, reason: not valid java name */
    public final boolean m10027hasH91voCI$ui(int i2) {
        return (getAggregateChildKindSet() & i2) != 0;
    }

    /* renamed from: head-H91voCI$ui, reason: not valid java name */
    public final /* synthetic */ <T> T m10028headH91voCI$ui(int i2) {
        if ((getAggregateChildKindSet() & i2) == 0) {
            return null;
        }
        for (Object obj = (T) getHead$ui(); obj != null; obj = (T) ((Modifier.Node) obj).getChild$ui()) {
            if ((((Modifier.Node) obj).getKindSet$ui() & i2) != 0) {
                x.i();
                return (T) obj;
            }
            if ((((Modifier.Node) obj).getAggregateChildKindSet$ui() & i2) == 0) {
                return null;
            }
        }
        return null;
    }

    public final void headToTail$ui(int i2, l<? super Modifier.Node, ab> lVar) {
        if ((getAggregateChildKindSet() & i2) == 0) {
            return;
        }
        for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
            if ((head$ui.getKindSet$ui() & i2) != 0) {
                lVar.invoke(head$ui);
            }
            if ((head$ui.getAggregateChildKindSet$ui() & i2) == 0) {
                return;
            }
        }
    }

    /* renamed from: headToTail-aLcG6gQ$ui, reason: not valid java name */
    public final /* synthetic */ <T> void m10029headToTailaLcG6gQ$ui(int i2, l<? super T, ab> lVar) {
        if ((getAggregateChildKindSet() & i2) != 0) {
            for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
                if ((head$ui.getKindSet$ui() & i2) != 0) {
                    for (Modifier.Node nodePop = head$ui; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                        x.i();
                        lVar.invoke(nodePop);
                    }
                }
                if ((head$ui.getAggregateChildKindSet$ui() & i2) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui(l<? super Modifier.Node, ab> lVar) {
        for (Modifier.Node head$ui = getHead$ui(); head$ui != null && head$ui != getTail$ui(); head$ui = head$ui.getChild$ui()) {
            lVar.invoke(head$ui);
        }
    }

    public final boolean isUpdating$ui() {
        return getChild$ui() != null;
    }

    public final void markAsAttached() {
        for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
            head$ui.markAsAttached$ui();
        }
    }

    public final void markAsDetached$ui() {
        for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if (tail$ui.isAttached()) {
                tail$ui.markAsDetached$ui();
            }
        }
    }

    public final void resetState$ui() {
        for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if (tail$ui.isAttached()) {
                tail$ui.reset$ui();
            }
        }
        runDetachLifecycle$ui();
        markAsDetached$ui();
    }

    public final void runAttachLifecycle() {
        for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
            head$ui.runAttachLifecycle$ui();
            if (head$ui.getInsertedNodeAwaitingAttachForInvalidation$ui()) {
                NodeKindKt.autoInvalidateInsertedNode(head$ui);
            }
            if (head$ui.getUpdatedNodeAwaitingAttachForInvalidation$ui()) {
                NodeKindKt.autoInvalidateUpdatedNode(head$ui);
            }
            head$ui.setInsertedNodeAwaitingAttachForInvalidation$ui(false);
            head$ui.setUpdatedNodeAwaitingAttachForInvalidation$ui(false);
        }
    }

    public final void runDetachLifecycle$ui() {
        for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if (tail$ui.isAttached()) {
                tail$ui.runDetachLifecycle$ui();
            }
        }
    }

    public final void syncCoordinators() {
        LayoutModifierNodeCoordinator layoutModifierNodeCoordinator;
        Modifier.Node node = this.tail;
        InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
        for (Modifier.Node parent$ui = node.getParent$ui(); parent$ui != null; parent$ui = parent$ui.getParent$ui()) {
            LayoutModifierNode layoutModifierNodeAsLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent$ui);
            if (layoutModifierNodeAsLayoutModifierNode != null) {
                if (parent$ui.getCoordinator$ui() != null) {
                    NodeCoordinator coordinator$ui = parent$ui.getCoordinator$ui();
                    x.d(coordinator$ui, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui(layoutModifierNodeAsLayoutModifierNode);
                    if (layoutModifierNode != parent$ui) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    LayoutModifierNodeCoordinator layoutModifierNodeCoordinator2 = new LayoutModifierNodeCoordinator(this.layoutNode, layoutModifierNodeAsLayoutModifierNode);
                    parent$ui.updateCoordinator$ui(layoutModifierNodeCoordinator2);
                    layoutModifierNodeCoordinator = layoutModifierNodeCoordinator2;
                }
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator3 = layoutModifierNodeCoordinator;
                innerNodeCoordinator.setWrappedBy$ui(layoutModifierNodeCoordinator3);
                layoutModifierNodeCoordinator.setWrapped$ui(innerNodeCoordinator);
                innerNodeCoordinator = layoutModifierNodeCoordinator3;
            } else {
                parent$ui.updateCoordinator$ui(innerNodeCoordinator);
            }
        }
        LayoutNode parent$ui2 = this.layoutNode.getParent$ui();
        innerNodeCoordinator.setWrappedBy$ui(parent$ui2 != null ? parent$ui2.getInnerCoordinator$ui() : null);
        this.outerCoordinator = innerNodeCoordinator;
    }

    /* renamed from: tail-H91voCI$ui, reason: not valid java name */
    public final /* synthetic */ <T> T m10030tailH91voCI$ui(int i2) {
        if ((getAggregateChildKindSet() & i2) == 0) {
            return null;
        }
        for (Object obj = (T) getTail$ui(); obj != null; obj = (T) ((Modifier.Node) obj).getParent$ui()) {
            if ((((Modifier.Node) obj).getKindSet$ui() & i2) != 0) {
                x.i();
                return (T) obj;
            }
        }
        return null;
    }

    public final void tailToHead$ui(int i2, l<? super Modifier.Node, ab> lVar) {
        if ((getAggregateChildKindSet() & i2) == 0) {
            return;
        }
        for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            if ((tail$ui.getKindSet$ui() & i2) != 0) {
                lVar.invoke(tail$ui);
            }
        }
    }

    /* renamed from: tailToHead-aLcG6gQ$ui, reason: not valid java name */
    public final /* synthetic */ <T> void m10031tailToHeadaLcG6gQ$ui(int i2, l<? super T, ab> lVar) {
        if ((getAggregateChildKindSet() & i2) != 0) {
            for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
                if ((tail$ui.getKindSet$ui() & i2) != 0) {
                    for (Modifier.Node nodePop = tail$ui; nodePop != null; nodePop = DelegatableNodeKt.pop(null)) {
                        x.i();
                        lVar.invoke(nodePop);
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.head == this.tail) {
            sb.append("]");
        } else {
            Modifier.Node head$ui = getHead$ui();
            while (true) {
                if (head$ui == null || head$ui == getTail$ui()) {
                    break;
                }
                sb.append(head$ui.toString());
                if (head$ui.getChild$ui() == this.tail) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                head$ui = head$ui.getChild$ui();
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateFrom$ui(androidx.compose.ui.Modifier r18) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeChain.updateFrom$ui(androidx.compose.ui.Modifier):void");
    }

    public final void useLogger$ui(Logger logger) {
        this.logger = logger;
    }

    public final void tailToHead$ui(l<? super Modifier.Node, ab> lVar) {
        for (Modifier.Node tail$ui = getTail$ui(); tail$ui != null; tail$ui = tail$ui.getParent$ui()) {
            lVar.invoke(tail$ui);
        }
    }

    public final void headToTail$ui(l<? super Modifier.Node, ab> lVar) {
        for (Modifier.Node head$ui = getHead$ui(); head$ui != null; head$ui = head$ui.getChild$ui()) {
            lVar.invoke(head$ui);
        }
    }
}
