package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameRateModifierNode extends Modifier.Node implements TraversableNode, DrawModifierNode {
    public static final int $stable = 8;
    private float frameRate;
    private boolean shouldUpdateFrameRates = true;
    private final String traverseKey = "TRAVERSAL_NODE_KEY_FRAME_RATE_MODIFIER_NODE";

    public FrameRateModifierNode(float f2) {
        this.frameRate = f2;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        OwnedLayer layer;
        if (this.shouldUpdateFrameRates) {
            NodeCoordinator coordinator$ui = getCoordinator$ui();
            if (coordinator$ui != null && (layer = coordinator$ui.getLayer()) != null) {
                layer.setFrameRate(this.frameRate);
            }
            NodeCoordinator coordinator$ui2 = getCoordinator$ui();
            setChildrenLayerFrameRate(coordinator$ui2 != null ? coordinator$ui2.getWrapped$ui() : null, this.frameRate);
            this.shouldUpdateFrameRates = false;
        }
        contentDrawScope.drawContent();
    }

    public final float getFrameRate() {
        return this.frameRate;
    }

    public final boolean getShouldUpdateFrameRates() {
        return this.shouldUpdateFrameRates;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.shouldUpdateFrameRates = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        FrameRateModifierNode frameRateModifierNode = (FrameRateModifierNode) TraversableNodeKt.findNearestAncestor(this);
        if (frameRateModifierNode != null) {
            NodeCoordinator coordinator$ui = getCoordinator$ui();
            setChildrenLayerFrameRate(coordinator$ui != null ? coordinator$ui.getWrapped$ui() : null, frameRateModifierNode.frameRate);
        } else {
            NodeCoordinator coordinator$ui2 = getCoordinator$ui();
            setChildrenLayerFrameRate(coordinator$ui2 != null ? coordinator$ui2.getWrapped$ui() : null, 0.0f);
        }
    }

    public final void setChildrenLayerFrameRate(NodeCoordinator nodeCoordinator, float f2) {
        LayoutNode layoutNode;
        OwnedLayer layer;
        NodeCoordinator wrapped$ui = nodeCoordinator;
        while (true) {
            if (wrapped$ui == null) {
                if (nodeCoordinator == null) {
                    nodeCoordinator = getCoordinator$ui();
                }
                if (nodeCoordinator == null || (layoutNode = nodeCoordinator.getLayoutNode()) == null) {
                    return;
                }
                List<LayoutNode> children$ui = layoutNode.getChildren$ui();
                int size = children$ui.size();
                for (int i2 = 0; i2 < size; i2++) {
                    setChildrenLayerFrameRate(children$ui.get(i2).getOuterCoordinator$ui(), f2);
                }
                return;
            }
            if (nodeCoordinator != null && (layer = nodeCoordinator.getLayer()) != null) {
                if (layer.getFrameRate() != 0.0f && !layer.isFrameRateFromParent()) {
                    return;
                }
                layer.setFrameRate(f2);
                layer.setFrameRateFromParent(f2 != 0.0f);
            }
            wrapped$ui = wrapped$ui.getWrapped$ui();
        }
    }

    public final void setFrameRate(float f2) {
        this.frameRate = f2;
    }

    public final void setShouldUpdateFrameRates(boolean z) {
        this.shouldUpdateFrameRates = z;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public String getTraverseKey() {
        return this.traverseKey;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }
}
