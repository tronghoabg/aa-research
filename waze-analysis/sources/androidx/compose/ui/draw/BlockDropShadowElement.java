package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BlockDropShadowElement extends ModifierNodeElement<BlockDropShadowNode> {
    public static final int $stable = 0;
    private final l<DropShadowScope, ab> block;
    private final Shape shape;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockDropShadowElement(Shape shape, l<? super DropShadowScope, ab> lVar) {
        this.shape = shape;
        this.block = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BlockDropShadowNode create() {
        return new BlockDropShadowNode(this.shape, this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockDropShadowElement)) {
            return false;
        }
        BlockDropShadowElement blockDropShadowElement = (BlockDropShadowElement) obj;
        return x.n(this.shape, blockDropShadowElement.shape) && this.block == blockDropShadowElement.block;
    }

    public final l<DropShadowScope, ab> getBlock() {
        return this.block;
    }

    public final Shape getShape() {
        return this.shape;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.shape.hashCode() * 31) + this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("dropShadow");
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("block", this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockDropShadowNode blockDropShadowNode) {
        blockDropShadowNode.update(this.shape, this.block);
    }
}
