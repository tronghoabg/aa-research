package androidx.compose.foundation.draganddrop;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.DelegatingNode;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DragSourceNodeWithDefaultPainter extends DelegatingNode {
    private final CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback;
    private final DragAndDropSourceNode dragAndDropModifierNode;

    public DragSourceNodeWithDefaultPainter(p<? super DragAndDropStartDetectorScope, ? super e<? super ab>, ? extends Object> pVar, l<? super Offset, DragAndDropTransferData> lVar) {
        CacheDrawScopeDragShadowCallback cacheDrawScopeDragShadowCallback = new CacheDrawScopeDragShadowCallback();
        delegate(DrawModifierKt.CacheDrawModifierNode(new DragSourceNodeWithDefaultPainter$cacheDrawScopeDragShadowCallback$1$1(cacheDrawScopeDragShadowCallback)));
        this.cacheDrawScopeDragShadowCallback = cacheDrawScopeDragShadowCallback;
        DragAndDropSourceNode dragAndDropSourceNode = new DragAndDropSourceNode(new l() { // from class: androidx.compose.foundation.draganddrop.DragSourceNodeWithDefaultPainter$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DragSourceNodeWithDefaultPainter.dragAndDropModifierNode$lambda$0(this.f$0, (DrawScope) obj);
            }
        }, pVar, lVar);
        delegate(dragAndDropSourceNode);
        this.dragAndDropModifierNode = dragAndDropSourceNode;
    }

    static final ab dragAndDropModifierNode$lambda$0(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter, DrawScope drawScope) {
        dragSourceNodeWithDefaultPainter.cacheDrawScopeDragShadowCallback.drawDragShadow(drawScope);
        return ab.f48028a;
    }

    private static Object getDetectDragStart$delegate(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        return new h.g.b.ab(dragSourceNodeWithDefaultPainter.dragAndDropModifierNode, DragAndDropSourceNode.class, "detectDragStart", "getDetectDragStart()Lkotlin/jvm/functions/Function2;", 0);
    }

    private static Object getTransferData$delegate(DragSourceNodeWithDefaultPainter dragSourceNodeWithDefaultPainter) {
        return new h.g.b.ab(dragSourceNodeWithDefaultPainter.dragAndDropModifierNode, DragAndDropSourceNode.class, "transferData", "getTransferData()Lkotlin/jvm/functions/Function1;", 0);
    }

    public final p<DragAndDropStartDetectorScope, e<? super ab>, Object> getDetectDragStart() {
        return this.dragAndDropModifierNode.getDetectDragStart();
    }

    public final l<Offset, DragAndDropTransferData> getTransferData() {
        return this.dragAndDropModifierNode.getTransferData();
    }

    public final void setDetectDragStart(p<? super DragAndDropStartDetectorScope, ? super e<? super ab>, ? extends Object> pVar) {
        this.dragAndDropModifierNode.setDetectDragStart(pVar);
    }

    public final void setTransferData(l<? super Offset, DragAndDropTransferData> lVar) {
        this.dragAndDropModifierNode.setTransferData(lVar);
    }
}
