package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ToggleButtonShapes {
    public static final int $stable = 0;
    private final Shape checkedShape;
    private final Shape pressedShape;
    private final Shape shape;

    public ToggleButtonShapes(Shape shape, Shape shape2, Shape shape3) {
        this.shape = shape;
        this.pressedShape = shape2;
        this.checkedShape = shape3;
    }

    public static /* synthetic */ ToggleButtonShapes copy$default(ToggleButtonShapes toggleButtonShapes, Shape shape, Shape shape2, Shape shape3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = toggleButtonShapes.shape;
        }
        if ((i2 & 2) != 0) {
            shape2 = toggleButtonShapes.pressedShape;
        }
        if ((i2 & 4) != 0) {
            shape3 = toggleButtonShapes.checkedShape;
        }
        return toggleButtonShapes.copy(shape, shape2, shape3);
    }

    public final ToggleButtonShapes copy(Shape shape, Shape shape2, Shape shape3) {
        return new ToggleButtonShapes(takeOrElse$material3(shape, new a() { // from class: androidx.compose.material3.ToggleButtonShapes$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.shape;
            }
        }), takeOrElse$material3(shape2, new a() { // from class: androidx.compose.material3.ToggleButtonShapes$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.pressedShape;
            }
        }), takeOrElse$material3(shape3, new a() { // from class: androidx.compose.material3.ToggleButtonShapes$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.checkedShape;
            }
        }));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ToggleButtonShapes)) {
            return false;
        }
        ToggleButtonShapes toggleButtonShapes = (ToggleButtonShapes) obj;
        return x.n(this.shape, toggleButtonShapes.shape) && x.n(this.pressedShape, toggleButtonShapes.pressedShape) && x.n(this.checkedShape, toggleButtonShapes.checkedShape);
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
        return (((this.shape.hashCode() * 31) + this.pressedShape.hashCode()) * 31) + this.checkedShape.hashCode();
    }

    public final Shape takeOrElse$material3(Shape shape, a<? extends Shape> aVar) {
        return shape == null ? aVar.invoke() : shape;
    }
}
