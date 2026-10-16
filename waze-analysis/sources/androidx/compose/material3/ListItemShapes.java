package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ListItemShapes {
    public static final int $stable = 0;
    private final Shape draggedShape;
    private final Shape focusedShape;
    private final Shape hoveredShape;
    private final Shape pressedShape;
    private final Shape selectedShape;
    private final Shape shape;

    public ListItemShapes(Shape shape, Shape shape2, Shape shape3, Shape shape4, Shape shape5, Shape shape6) {
        this.shape = shape;
        this.selectedShape = shape2;
        this.pressedShape = shape3;
        this.focusedShape = shape4;
        this.hoveredShape = shape5;
        this.draggedShape = shape6;
    }

    public static /* synthetic */ ListItemShapes copy$default(ListItemShapes listItemShapes, Shape shape, Shape shape2, Shape shape3, Shape shape4, Shape shape5, Shape shape6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = listItemShapes.shape;
        }
        if ((i2 & 2) != 0) {
            shape2 = listItemShapes.selectedShape;
        }
        if ((i2 & 4) != 0) {
            shape3 = listItemShapes.pressedShape;
        }
        if ((i2 & 8) != 0) {
            shape4 = listItemShapes.focusedShape;
        }
        if ((i2 & 16) != 0) {
            shape5 = listItemShapes.hoveredShape;
        }
        if ((i2 & 32) != 0) {
            shape6 = listItemShapes.draggedShape;
        }
        Shape shape7 = shape5;
        Shape shape8 = shape6;
        return listItemShapes.copy(shape, shape2, shape3, shape4, shape7, shape8);
    }

    public final ListItemShapes copy(Shape shape, Shape shape2, Shape shape3, Shape shape4, Shape shape5, Shape shape6) {
        return new ListItemShapes(takeOrElse$material3(shape, new a() { // from class: androidx.compose.material3.ListItemShapes$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.shape;
            }
        }), takeOrElse$material3(shape2, new a() { // from class: androidx.compose.material3.ListItemShapes$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.selectedShape;
            }
        }), takeOrElse$material3(shape3, new a() { // from class: androidx.compose.material3.ListItemShapes$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.pressedShape;
            }
        }), takeOrElse$material3(shape4, new a() { // from class: androidx.compose.material3.ListItemShapes$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.focusedShape;
            }
        }), takeOrElse$material3(shape5, new a() { // from class: androidx.compose.material3.ListItemShapes$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.hoveredShape;
            }
        }), takeOrElse$material3(shape6, new a() { // from class: androidx.compose.material3.ListItemShapes$$ExternalSyntheticLambda5
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.draggedShape;
            }
        }));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ListItemShapes)) {
            return false;
        }
        ListItemShapes listItemShapes = (ListItemShapes) obj;
        return x.n(this.shape, listItemShapes.shape) && x.n(this.selectedShape, listItemShapes.selectedShape) && x.n(this.pressedShape, listItemShapes.pressedShape) && x.n(this.focusedShape, listItemShapes.focusedShape) && x.n(this.hoveredShape, listItemShapes.hoveredShape) && x.n(this.draggedShape, listItemShapes.draggedShape);
    }

    public final Shape getDraggedShape() {
        return this.draggedShape;
    }

    public final Shape getFocusedShape() {
        return this.focusedShape;
    }

    public final Shape getHoveredShape() {
        return this.hoveredShape;
    }

    public final Shape getPressedShape() {
        return this.pressedShape;
    }

    public final Shape getSelectedShape() {
        return this.selectedShape;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return (((((((((this.shape.hashCode() * 31) + this.selectedShape.hashCode()) * 31) + this.pressedShape.hashCode()) * 31) + this.focusedShape.hashCode()) * 31) + this.hoveredShape.hashCode()) * 31) + this.draggedShape.hashCode();
    }

    public final Shape takeOrElse$material3(Shape shape, a<? extends Shape> aVar) {
        return shape == null ? aVar.invoke() : shape;
    }
}
