package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ChipShapes {
    public static final int $stable = 0;
    private final Shape pressedShape;
    private final Shape selectedShape;
    private final Shape shape;

    public ChipShapes(Shape shape, Shape shape2, Shape shape3) {
        this.shape = shape;
        this.selectedShape = shape2;
        this.pressedShape = shape3;
    }

    public static /* synthetic */ ChipShapes copy$default(ChipShapes chipShapes, Shape shape, Shape shape2, Shape shape3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = chipShapes.shape;
        }
        if ((i2 & 2) != 0) {
            shape2 = chipShapes.selectedShape;
        }
        if ((i2 & 4) != 0) {
            shape3 = chipShapes.pressedShape;
        }
        return chipShapes.copy(shape, shape2, shape3);
    }

    public final ChipShapes copy(Shape shape, Shape shape2, Shape shape3) {
        return new ChipShapes(takeOrElse$material3(shape, new a() { // from class: androidx.compose.material3.ChipShapes$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.shape;
            }
        }), takeOrElse$material3(shape2, new a() { // from class: androidx.compose.material3.ChipShapes$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.selectedShape;
            }
        }), takeOrElse$material3(shape3, new a() { // from class: androidx.compose.material3.ChipShapes$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.pressedShape;
            }
        }));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipShapes)) {
            return false;
        }
        ChipShapes chipShapes = (ChipShapes) obj;
        return x.n(this.shape, chipShapes.shape) && x.n(this.selectedShape, chipShapes.selectedShape) && x.n(this.pressedShape, chipShapes.pressedShape);
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
        return (((this.shape.hashCode() * 31) + this.selectedShape.hashCode()) * 31) + this.pressedShape.hashCode();
    }

    public final Shape takeOrElse$material3(Shape shape, a<? extends Shape> aVar) {
        return shape == null ? aVar.invoke() : shape;
    }

    public /* synthetic */ ChipShapes(Shape shape, Shape shape2, Shape shape3, int i2, o oVar) {
        this(shape, shape2, (i2 & 4) != 0 ? shape2 : shape3);
    }
}
