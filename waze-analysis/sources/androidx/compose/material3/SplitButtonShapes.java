package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SplitButtonShapes {
    public static final int $stable = 0;
    private final Shape checkedShape;
    private final Shape pressedShape;
    private final Shape shape;

    public SplitButtonShapes(Shape shape, Shape shape2, Shape shape3) {
        this.shape = shape;
        this.pressedShape = shape2;
        this.checkedShape = shape3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SplitButtonShapes)) {
            return false;
        }
        SplitButtonShapes splitButtonShapes = (SplitButtonShapes) obj;
        return x.n(this.shape, splitButtonShapes.shape) && x.n(this.pressedShape, splitButtonShapes.pressedShape) && x.n(this.checkedShape, splitButtonShapes.checkedShape);
    }

    public final Shape getCheckedShape() {
        return this.checkedShape;
    }

    public final Shape getPressedShape() {
        return this.pressedShape;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        int iHashCode = this.shape.hashCode();
        Shape shape = this.pressedShape;
        if (shape != null) {
            iHashCode = (iHashCode * 31) + shape.hashCode();
        }
        Shape shape2 = this.checkedShape;
        return shape2 != null ? (iHashCode * 31) + shape2.hashCode() : iHashCode;
    }
}
