package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;
    private Modifier.Node delegate;
    private final int selfKindSet = NodeKindKt.calculateNodeKindSetFrom(this);

    private final void updateNodeKindSet(int i2, boolean z) {
        Modifier.Node child$ui;
        int kindSet$ui = getKindSet$ui();
        setKindSet$ui(i2);
        if (kindSet$ui != i2) {
            if (DelegatableNodeKt.isDelegationRoot(this)) {
                setAggregateChildKindSet$ui(i2);
            }
            if (isAttached()) {
                Modifier.Node node = getNode();
                DelegatingNode parent$ui = this;
                while (parent$ui != null) {
                    i2 |= parent$ui.getKindSet$ui();
                    parent$ui.setKindSet$ui(i2);
                    if (parent$ui == node) {
                        break;
                    } else {
                        parent$ui = parent$ui.getParent$ui();
                    }
                }
                if (z && parent$ui == node) {
                    i2 = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui(i2);
                }
                int aggregateChildKindSet$ui = 0;
                if (parent$ui != null && (child$ui = parent$ui.getChild$ui()) != null) {
                    aggregateChildKindSet$ui = child$ui.getAggregateChildKindSet$ui();
                }
                int kindSet$ui2 = i2 | aggregateChildKindSet$ui;
                while (parent$ui != null) {
                    kindSet$ui2 |= parent$ui.getKindSet$ui();
                    parent$ui.setAggregateChildKindSet$ui(kindSet$ui2);
                    parent$ui = parent$ui.getParent$ui();
                }
            }
        }
    }

    private final void validateDelegateKindSet(int i2, Modifier.Node node) {
        int i3 = i2 & 2;
        int kindSet$ui = getKindSet$ui();
        if (i3 == 0 || (kindSet$ui & 2) == 0 || (this instanceof LayoutModifierNode)) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
    }

    protected final <T extends DelegatableNode> T delegate(T t) {
        Modifier.Node node = t.getNode();
        if (node != t) {
            Modifier.Node node2 = t instanceof Modifier.Node ? (Modifier.Node) t : null;
            Modifier.Node parent$ui = node2 != null ? node2.getParent$ui() : null;
            if (node != getNode() || !x.n(parent$ui, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (node.isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("Cannot delegate to an already attached node");
            }
            node.setAsDelegateTo$ui(getNode());
            int kindSet$ui = getKindSet$ui();
            int iCalculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
            node.setKindSet$ui(iCalculateNodeKindSetFromIncludingDelegates);
            validateDelegateKindSet(iCalculateNodeKindSetFromIncludingDelegates, node);
            node.setChild$ui(this.delegate);
            this.delegate = node;
            node.setParent$ui(this);
            updateNodeKindSet(getKindSet$ui() | iCalculateNodeKindSetFromIncludingDelegates, false);
            if (isAttached()) {
                if ((iCalculateNodeKindSetFromIncludingDelegates & 2) == 0 || (kindSet$ui & 2) != 0) {
                    updateCoordinator$ui(getCoordinator$ui());
                } else {
                    NodeChain nodes$ui = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui();
                    getNode().updateCoordinator$ui(null);
                    nodes$ui.syncCoordinators();
                }
                node.markAsAttached$ui();
                node.runAttachLifecycle$ui();
                NodeKindKt.autoInvalidateInsertedNode(node);
            }
        }
        return t;
    }

    public final <T extends DelegatableNode> T delegateUnprotected$ui(T t) {
        delegate(t);
        return t;
    }

    public final void forEachImmediateDelegate$ui(l<? super Modifier.Node, ab> lVar) {
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            lVar.invoke(delegate$ui);
        }
    }

    public final Modifier.Node getDelegate$ui() {
        return this.delegate;
    }

    public final int getSelfKindSet$ui() {
        return this.selfKindSet;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsAttached$ui() {
        super.markAsAttached$ui();
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.updateCoordinator$ui(getCoordinator$ui());
            if (!delegate$ui.isAttached()) {
                delegate$ui.markAsAttached$ui();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsDetached$ui() {
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.markAsDetached$ui();
        }
        super.markAsDetached$ui();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void reset$ui() {
        super.reset$ui();
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.reset$ui();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runAttachLifecycle$ui() {
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.runAttachLifecycle$ui();
        }
        super.runAttachLifecycle$ui();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runDetachLifecycle$ui() {
        super.runDetachLifecycle$ui();
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.runDetachLifecycle$ui();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void setAsDelegateTo$ui(Modifier.Node node) {
        super.setAsDelegateTo$ui(node);
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.setAsDelegateTo$ui(node);
        }
    }

    public final void setDelegate$ui(Modifier.Node node) {
        this.delegate = node;
    }

    protected final void undelegate(DelegatableNode delegatableNode) {
        Modifier.Node node = null;
        for (Modifier.Node child$ui = this.delegate; child$ui != null; child$ui = child$ui.getChild$ui()) {
            if (child$ui == delegatableNode) {
                if (child$ui.isAttached()) {
                    NodeKindKt.autoInvalidateRemovedNode(child$ui);
                    child$ui.runDetachLifecycle$ui();
                    child$ui.markAsDetached$ui();
                }
                child$ui.setAsDelegateTo$ui(child$ui);
                child$ui.setAggregateChildKindSet$ui(0);
                if (node == null) {
                    this.delegate = child$ui.getChild$ui();
                } else {
                    node.setChild$ui(child$ui.getChild$ui());
                }
                child$ui.setChild$ui(null);
                child$ui.setParent$ui(null);
                int kindSet$ui = getKindSet$ui();
                int iCalculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
                updateNodeKindSet(iCalculateNodeKindSetFromIncludingDelegates, true);
                if (isAttached() && (kindSet$ui & 2) != 0 && (iCalculateNodeKindSetFromIncludingDelegates & 2) == 0) {
                    NodeChain nodes$ui = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui();
                    getNode().updateCoordinator$ui(null);
                    nodes$ui.syncCoordinators();
                    return;
                }
                return;
            }
            node = child$ui;
        }
        Objects.toString(delegatableNode);
        throw new IllegalStateException("Could not find delegate: ".concat(String.valueOf(delegatableNode)));
    }

    public final void undelegateUnprotected$ui(DelegatableNode delegatableNode) {
        undelegate(delegatableNode);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void updateCoordinator$ui(NodeCoordinator nodeCoordinator) {
        super.updateCoordinator$ui(nodeCoordinator);
        for (Modifier.Node delegate$ui = getDelegate$ui(); delegate$ui != null; delegate$ui = delegate$ui.getChild$ui()) {
            delegate$ui.updateCoordinator$ui(nodeCoordinator);
        }
    }

    public static /* synthetic */ void getSelfKindSet$ui$annotations() {
    }
}
