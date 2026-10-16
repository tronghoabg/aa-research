package androidx.compose.material3.carousel;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MaskParallaxNodeElement extends ModifierNodeElement<MaskParallaxNode> {
    private final Shape baseShape;
    private final MultiAspectCarouselItemDrawInfo drawInfo;

    public MaskParallaxNodeElement(Shape shape, MultiAspectCarouselItemDrawInfo multiAspectCarouselItemDrawInfo) {
        this.baseShape = shape;
        this.drawInfo = multiAspectCarouselItemDrawInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public MaskParallaxNode create() {
        return new MaskParallaxNode(this.baseShape, this.drawInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaskParallaxNodeElement)) {
            return false;
        }
        MaskParallaxNodeElement maskParallaxNodeElement = (MaskParallaxNodeElement) obj;
        return x.n(this.baseShape, maskParallaxNodeElement.baseShape) && x.n(this.drawInfo, maskParallaxNodeElement.drawInfo);
    }

    public final Shape getBaseShape() {
        return this.baseShape;
    }

    public final MultiAspectCarouselItemDrawInfo getDrawInfo() {
        return this.drawInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.baseShape.hashCode() * 31) + this.drawInfo.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("maskParallaxNodeElement");
        inspectorInfo.getProperties().set("baseShape", this.baseShape);
        inspectorInfo.getProperties().set("drawInfo", this.drawInfo);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(MaskParallaxNode maskParallaxNode) {
        maskParallaxNode.getMaskShape().setBaseShape(this.baseShape);
        maskParallaxNode.getMaskShape().setDrawInfo(this.drawInfo);
    }
}
