package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class BlockInnerShadowElement extends ModifierNodeElement<BlockInnerShadowNode> {
    public static final int $stable = 0;
    private final l<InnerShadowScope, ab> block;
    private final Shape shape;

    /* JADX WARN: Multi-variable type inference failed */
    public BlockInnerShadowElement(Shape shape, l<? super InnerShadowScope, ab> lVar) {
        this.shape = shape;
        this.block = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public BlockInnerShadowNode create() {
        return new BlockInnerShadowNode(this.shape, this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BlockInnerShadowElement)) {
            return false;
        }
        BlockInnerShadowElement blockInnerShadowElement = (BlockInnerShadowElement) obj;
        return x.n(this.shape, blockInnerShadowElement.shape) && this.block == blockInnerShadowElement.block;
    }

    public final l<InnerShadowScope, ab> getBlock() {
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
        inspectorInfo.setName("innerShadow");
        inspectorInfo.getProperties().set("shape", this.shape);
        inspectorInfo.getProperties().set("block", this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(BlockInnerShadowNode blockInnerShadowNode) {
        blockInnerShadowNode.update(this.shape, this.block);
    }
}
