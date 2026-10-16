package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class NodeCoordinator$drawBlock$1 extends y implements p<Canvas, GraphicsLayer, ab> {
    final /* synthetic */ a<ab> $drawBlockCallToDrawModifiers;
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NodeCoordinator$drawBlock$1(NodeCoordinator nodeCoordinator, a<ab> aVar) {
        super(2);
        this.this$0 = nodeCoordinator;
        this.$drawBlockCallToDrawModifiers = aVar;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Canvas canvas, GraphicsLayer graphicsLayer) {
        boolean zIsPlaced = this.this$0.getLayoutNode().isPlaced();
        NodeCoordinator nodeCoordinator = this.this$0;
        if (!zIsPlaced) {
            nodeCoordinator.lastLayerDrawingWasSkipped = true;
            return;
        }
        nodeCoordinator.drawBlockCanvas = canvas;
        this.this$0.drawBlockParentLayer = graphicsLayer;
        NodeCoordinator nodeCoordinator2 = this.this$0;
        a<ab> aVar = this.$drawBlockCallToDrawModifiers;
        OwnerSnapshotObserver snapshotObserver = nodeCoordinator2.getSnapshotObserver();
        l lVar = NodeCoordinator.onCommitAffectingLayer;
        snapshotObserver.observer.observeReads(nodeCoordinator2, lVar, aVar);
        this.this$0.lastLayerDrawingWasSkipped = false;
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(Canvas canvas, GraphicsLayer graphicsLayer) {
        invoke2(canvas, graphicsLayer);
        return ab.f48028a;
    }
}
