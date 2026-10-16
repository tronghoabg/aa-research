package androidx.compose.ui.draganddrop;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.g.a.l;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DragAndDropNodeKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropModifierNode$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements l<DragAndDropEvent, DragAndDropTarget> {
        final /* synthetic */ l<DragAndDropEvent, Boolean> $shouldStartDragAndDrop;
        final /* synthetic */ DragAndDropTarget $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super DragAndDropEvent, Boolean> lVar, DragAndDropTarget dragAndDropTarget) {
            super(1);
            this.$shouldStartDragAndDrop = lVar;
            this.$target = dragAndDropTarget;
        }

        @Override // h.g.a.l
        public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
            if (this.$shouldStartDragAndDrop.invoke(dragAndDropEvent).booleanValue()) {
                return this.$target;
            }
            return null;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draganddrop.DragAndDropNodeKt$DragAndDropTargetModifierNode$1, reason: invalid class name and case insensitive filesystem */
    final class C03661 extends y implements l<DragAndDropEvent, DragAndDropTarget> {
        final /* synthetic */ l<DragAndDropEvent, Boolean> $shouldStartDragAndDrop;
        final /* synthetic */ DragAndDropTarget $target;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C03661(l<? super DragAndDropEvent, Boolean> lVar, DragAndDropTarget dragAndDropTarget) {
            super(1);
            this.$shouldStartDragAndDrop = lVar;
            this.$target = dragAndDropTarget;
        }

        @Override // h.g.a.l
        public final DragAndDropTarget invoke(DragAndDropEvent dragAndDropEvent) {
            if (this.$shouldStartDragAndDrop.invoke(dragAndDropEvent).booleanValue()) {
                return this.$target;
            }
            return null;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.draganddrop.DragAndDropNodeKt$firstDescendantOrNull$1, reason: invalid class name and case insensitive filesystem */
    public final class C03671 extends y implements l {
        final /* synthetic */ aq $match;
        final /* synthetic */ l $predicate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03671(l lVar, aq aqVar) {
            super(1);
            this.$predicate = lVar;
            this.$match = aqVar;
        }

        @Override // h.g.a.l
        public final TraversableNode.Companion.TraverseDescendantsAction invoke(TraversableNode traversableNode) {
            if (!((Boolean) this.$predicate.invoke(traversableNode)).booleanValue()) {
                return TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
            }
            this.$match.f48105a = traversableNode;
            return TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropModifierNode DragAndDropModifierNode(l<? super DragAndDropEvent, Boolean> lVar, DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new AnonymousClass1(lVar, dragAndDropTarget), 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropSourceModifierNode DragAndDropSourceModifierNode(p<? super DragAndDropStartTransferScope, ? super Offset, ab> pVar) {
        return new DragAndDropNode(pVar, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropTargetModifierNode DragAndDropTargetModifierNode(l<? super DragAndDropEvent, Boolean> lVar, DragAndDropTarget dragAndDropTarget) {
        return new DragAndDropNode(null, new C03661(lVar, dragAndDropTarget), 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: contains-Uv8p0NA, reason: not valid java name */
    public static final boolean m7738containsUv8p0NA(DragAndDropNode dragAndDropNode, long j2) {
        if (!dragAndDropNode.getNode().isAttached()) {
            return false;
        }
        LayoutCoordinates coordinates = DelegatableNodeKt.requireLayoutNode(dragAndDropNode).getCoordinates();
        if (!coordinates.isAttached()) {
            return false;
        }
        long jPositionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
        long j3 = jPositionInRoot >> 32;
        int i2 = (int) (jPositionInRoot & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
        float fIntBitsToFloat = Float.intBitsToFloat((int) j3);
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        float fM7732getSizeYbymL2g$ui = ((int) (dragAndDropNode.m7732getSizeYbymL2g$ui() >> 32)) + fIntBitsToFloat;
        float fM7732getSizeYbymL2g$ui2 = ((int) (dragAndDropNode.m7732getSizeYbymL2g$ui() & MuxerUtil.UNSIGNED_INT_MAX_VALUE)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= fM7732getSizeYbymL2g$ui) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= fM7732getSizeYbymL2g$ui2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchEntered(DragAndDropTarget dragAndDropTarget, DragAndDropEvent dragAndDropEvent) {
        dragAndDropTarget.onEntered(dragAndDropEvent);
        dragAndDropTarget.onMoved(dragAndDropEvent);
    }

    private static final <T extends TraversableNode> T firstDescendantOrNull(T t, l<? super T, Boolean> lVar) {
        if (!t.getNode().isAttached()) {
            return null;
        }
        aq aqVar = new aq();
        TraversableNodeKt.traverseDescendants(t, new C03671(lVar, aqVar));
        return (T) aqVar.f48105a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends TraversableNode> void traverseSelfAndDescendants(T t, l<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        if (lVar.invoke(t) != TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal) {
            return;
        }
        TraversableNodeKt.traverseDescendants(t, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DragAndDropModifierNode DragAndDropModifierNode() {
        return new DragAndDropNode(null, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }
}
