package androidx.compose.ui.node;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import h.ab;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LayoutModifierNodeKt {
    public static final void invalidateLayer(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.m9921requireCoordinator64DMado(layoutModifierNode, 2).invalidateLayer();
    }

    public static final void invalidateMeasurement(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).invalidateMeasurements$ui();
    }

    public static final void invalidatePlacement(LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRelayout$ui$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, 1, null);
    }

    public static final void remeasureSync(LayoutModifierNode layoutModifierNode) {
        DelegatableNodeKt.requireLayoutNode(layoutModifierNode).forceRemeasure();
    }

    public static final void requestRemeasure(LayoutModifierNode layoutModifierNode) {
        LayoutNode.requestRemeasure$ui$default(DelegatableNodeKt.requireLayoutNode(layoutModifierNode), false, false, false, 7, null);
    }

    public static final void updateLayerBlock(LayoutModifierNode layoutModifierNode, l<? super GraphicsLayerScope, ab> lVar) {
        NodeCoordinator wrapped$ui;
        if (layoutModifierNode.getNode().isAttached() && (wrapped$ui = DelegatableNodeKt.m9921requireCoordinator64DMado(layoutModifierNode, 2).getWrapped$ui()) != null) {
            wrapped$ui.updateLayerBlock(lVar, true);
        }
    }
}
