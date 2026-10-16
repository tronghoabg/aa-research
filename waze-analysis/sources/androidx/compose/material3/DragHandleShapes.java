package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class DragHandleShapes {
    public static final int $stable = 0;
    private final Shape draggedShape;
    private final Shape pressedShape;
    private final Shape shape;

    public DragHandleShapes(Shape shape, Shape shape2, Shape shape3) {
        this.shape = shape;
        this.pressedShape = shape2;
        this.draggedShape = shape3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DragHandleShapes)) {
            return false;
        }
        DragHandleShapes dragHandleShapes = (DragHandleShapes) obj;
        return x.n(this.shape, dragHandleShapes.shape) && x.n(this.pressedShape, dragHandleShapes.pressedShape) && x.n(this.draggedShape, dragHandleShapes.draggedShape);
    }

    public final Shape getDraggedShape() {
        return this.draggedShape;
    }

    public final Shape getPressedShape() {
        return this.pressedShape;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return (((this.shape.hashCode() * 31) + this.pressedShape.hashCode()) * 31) + this.draggedShape.hashCode();
    }
}
