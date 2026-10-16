package androidx.compose.ui.draganddrop;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.unit.IntSize;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.am;
import h.g.b.aq;
import h.g.b.o;
import h.g.b.x;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class DragAndDropNode extends Modifier.Node implements TraversableNode, DragAndDropModifierNode, DragAndDropSourceModifierNode, DragAndDropTargetModifierNode, DragAndDropTarget {
    private DragAndDropNode lastChildDragAndDropModifierNode;
    private final l<DragAndDropEvent, DragAndDropTarget> onDropTargetValidate;
    private p<? super DragAndDropStartTransferScope, ? super Offset, ab> onStartTransfer;
    private long size;
    private DragAndDropTarget thisDragAndDropTarget;
    private final Object traverseKey;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draganddrop.DragAndDropNode$acceptDragAndDropTransfer$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends y implements l<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction> {
        final /* synthetic */ am $handled;
        final /* synthetic */ DragAndDropEvent $startEvent;
        final /* synthetic */ DragAndDropNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DragAndDropEvent dragAndDropEvent, DragAndDropNode dragAndDropNode, am amVar) {
            super(1);
            this.$startEvent = dragAndDropEvent;
            this.this$0 = dragAndDropNode;
            this.$handled = amVar;
        }

        @Override // h.g.a.l
        public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
            if (!dragAndDropNode.isAttached()) {
                return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }
            if (dragAndDropNode.thisDragAndDropTarget != null) {
                InlineClassHelperKt.throwIllegalStateException("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            l lVar = dragAndDropNode.onDropTargetValidate;
            dragAndDropNode.thisDragAndDropTarget = lVar != null ? (DragAndDropTarget) lVar.invoke(this.$startEvent) : null;
            boolean z = dragAndDropNode.thisDragAndDropTarget != null;
            if (z) {
                this.this$0.getDragAndDropManager().registerTargetInterest(dragAndDropNode);
            }
            am amVar = this.$handled;
            amVar.f48101a = amVar.f48101a || z;
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draganddrop.DragAndDropNode$onEnded$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    final class C03651 extends y implements l<DragAndDropNode, TraversableNode.Companion.TraverseDescendantsAction> {
        final /* synthetic */ DragAndDropEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03651(DragAndDropEvent dragAndDropEvent) {
            super(1);
            this.$event = dragAndDropEvent;
        }

        @Override // h.g.a.l
        public final TraversableNode.Companion.TraverseDescendantsAction invoke(DragAndDropNode dragAndDropNode) {
            if (!dragAndDropNode.getNode().isAttached()) {
                return TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            }
            DragAndDropTarget dragAndDropTarget = dragAndDropNode.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.onEnded(this.$event);
            }
            dragAndDropNode.thisDragAndDropTarget = null;
            dragAndDropNode.lastChildDragAndDropModifierNode = null;
            return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode(p<? super DragAndDropStartTransferScope, ? super Offset, ab> pVar, l<? super DragAndDropEvent, ? extends DragAndDropTarget> lVar) {
        this.onStartTransfer = pVar;
        this.onDropTargetValidate = lVar;
        this.traverseKey = Companion.DragAndDropTraversableKey.INSTANCE;
        this.size = IntSize.Companion.m11344getZeroYbymL2g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DragAndDropManager getDragAndDropManager() {
        return DelegatableNodeKt.requireOwner(this).getDragAndDropManager();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    public boolean acceptDragAndDropTransfer(DragAndDropEvent dragAndDropEvent) {
        am amVar = new am();
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new AnonymousClass1(dragAndDropEvent, this, amVar));
        return amVar.f48101a;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropModifierNode
    /* renamed from: drag-12SF9DM */
    public void mo7731drag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j2, l<? super DrawScope, ab> lVar) {
        if (this.onStartTransfer != null) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        this.onStartTransfer = new DragAndDropNode$drag$1(dragAndDropTransferData, j2, lVar);
        getDragAndDropManager().mo7729requestDragAndDropTransferUv8p0NA(this, Offset.Companion.m7995getUnspecifiedF1C5BW0());
        this.onStartTransfer = null;
    }

    /* renamed from: getSize-YbymL2g$ui, reason: not valid java name */
    public final long m7732getSizeYbymL2g$ui() {
        return this.size;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    public final boolean hasEligibleDropTarget() {
        return (this.lastChildDragAndDropModifierNode == null && this.thisDragAndDropTarget == null) ? false : true;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    public boolean isRequestDragAndDropTransferRequired() {
        return getDragAndDropManager().isRequestDragAndDropTransferRequired();
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onChanged(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onChanged(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onChanged(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.thisDragAndDropTarget = null;
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public boolean onDrop(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            return dragAndDropNode.onDrop(dragAndDropEvent);
        }
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget == null) {
            return false;
        }
        return dragAndDropTarget.onDrop(dragAndDropEvent);
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEnded(DragAndDropEvent dragAndDropEvent) {
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new C03651(dragAndDropEvent));
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onEntered(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onEntered(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onEntered(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onExited(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onExited(dragAndDropEvent);
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onExited(dragAndDropEvent);
        }
        this.lastChildDragAndDropModifierNode = null;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onMoved(DragAndDropEvent dragAndDropEvent) {
        TraversableNode traversableNode;
        DragAndDropNode dragAndDropNode;
        DragAndDropNode dragAndDropNode2 = this.lastChildDragAndDropModifierNode;
        DragAndDropNode dragAndDropNode3 = null;
        if (dragAndDropNode2 == null || !DragAndDropNodeKt.m7738containsUv8p0NA(dragAndDropNode2, DragAndDrop_androidKt.getPositionInRoot(dragAndDropEvent))) {
            DragAndDropNode dragAndDropNode4 = this;
            if (dragAndDropNode4.getNode().isAttached()) {
                aq aqVar = new aq();
                TraversableNodeKt.traverseDescendants(dragAndDropNode4, new DragAndDropNode$onMoved$$inlined$firstDescendantOrNull$1(aqVar, this, dragAndDropEvent));
                traversableNode = (TraversableNode) aqVar.f48105a;
            } else {
                traversableNode = null;
            }
            dragAndDropNode = (DragAndDropNode) traversableNode;
        } else {
            dragAndDropNode = dragAndDropNode2;
        }
        if (dragAndDropNode != null && dragAndDropNode2 == null) {
            DragAndDropNodeKt.dispatchEntered(dragAndDropNode, dragAndDropEvent);
            DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
            if (dragAndDropTarget != null) {
                dragAndDropTarget.onExited(dragAndDropEvent);
            }
        } else if (dragAndDropNode == null && dragAndDropNode2 != null) {
            DragAndDropTarget dragAndDropTarget2 = this.thisDragAndDropTarget;
            if (dragAndDropTarget2 != null) {
                DragAndDropNodeKt.dispatchEntered(dragAndDropTarget2, dragAndDropEvent);
            }
            dragAndDropNode2.onExited(dragAndDropEvent);
        } else if (!x.n(dragAndDropNode, dragAndDropNode2)) {
            if (dragAndDropNode != null) {
                DragAndDropNodeKt.dispatchEntered(dragAndDropNode, dragAndDropEvent);
                dragAndDropNode3 = dragAndDropNode;
            }
            if (dragAndDropNode2 != null) {
                dragAndDropNode2.onExited(dragAndDropEvent);
            }
            dragAndDropNode = dragAndDropNode3;
        } else if (dragAndDropNode != null) {
            dragAndDropNode.onMoved(dragAndDropEvent);
        } else {
            DragAndDropTarget dragAndDropTarget3 = this.thisDragAndDropTarget;
            if (dragAndDropTarget3 != null) {
                dragAndDropTarget3.onMoved(dragAndDropEvent);
            }
        }
        this.lastChildDragAndDropModifierNode = dragAndDropNode;
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo2116onRemeasuredozmzZPI(long j2) {
        this.size = j2;
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropTarget
    public void onStarted(DragAndDropEvent dragAndDropEvent) {
        DragAndDropTarget dragAndDropTarget = this.thisDragAndDropTarget;
        if (dragAndDropTarget != null) {
            dragAndDropTarget.onStarted(dragAndDropEvent);
            return;
        }
        DragAndDropNode dragAndDropNode = this.lastChildDragAndDropModifierNode;
        if (dragAndDropNode != null) {
            dragAndDropNode.onStarted(dragAndDropEvent);
        }
    }

    @Override // androidx.compose.ui.draganddrop.DragAndDropSourceModifierNode
    /* renamed from: requestDragAndDropTransfer-k-4lQ0M, reason: not valid java name */
    public void mo7733requestDragAndDropTransferk4lQ0M(long j2) {
        if (this.onStartTransfer == null) {
            InlineClassHelperKt.throwIllegalStateException("Check failed.");
        }
        getDragAndDropManager().mo7729requestDragAndDropTransferUv8p0NA(this, j2);
    }

    /* renamed from: setSize-ozmzZPI$ui, reason: not valid java name */
    public final void m7734setSizeozmzZPI$ui(long j2) {
        this.size = j2;
    }

    /* renamed from: startDragAndDropTransfer-d-4ec7I, reason: not valid java name */
    public final void m7735startDragAndDropTransferd4ec7I(DragAndDropStartTransferScope dragAndDropStartTransferScope, long j2, a<Boolean> aVar) {
        DragAndDropNodeKt.traverseSelfAndDescendants(this, new DragAndDropNode$startDragAndDropTransfer$1(j2, DelegatableNodeKt.requireLayoutNode(this).getCoordinates(), dragAndDropStartTransferScope, aVar));
    }

    /* compiled from: WazeSource */
    /* loaded from: classes2.dex */
    final class Companion {

        /* compiled from: WazeSource */
        final class DragAndDropTraversableKey {
            public static final DragAndDropTraversableKey INSTANCE = new DragAndDropTraversableKey();

            private DragAndDropTraversableKey() {
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DragAndDropNode() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DragAndDropNode(p pVar, l lVar, int i2, o oVar) {
        this(1 == (i2 & 1) ? null : pVar, (i2 & 2) != 0 ? null : lVar);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public /* synthetic */ void onPlaced(LayoutCoordinates layoutCoordinates) {
    }
}
