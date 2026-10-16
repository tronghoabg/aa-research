package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class IconToggleButtonShapes {
    public static final int $stable = 0;
    private final Shape checkedShape;
    private final Shape pressedShape;
    private final Shape shape;

    public /* synthetic */ IconToggleButtonShapes(Shape shape, Shape shape2, Shape shape3, int i2, o oVar) {
        this(shape, (i2 & 2) != 0 ? shape : shape2, (i2 & 4) != 0 ? shape : shape3);
    }

    public static /* synthetic */ IconToggleButtonShapes copy$default(IconToggleButtonShapes iconToggleButtonShapes, Shape shape, Shape shape2, Shape shape3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = iconToggleButtonShapes.shape;
        }
        if ((i2 & 2) != 0) {
            shape2 = iconToggleButtonShapes.pressedShape;
        }
        if ((i2 & 4) != 0) {
            shape3 = iconToggleButtonShapes.checkedShape;
        }
        return iconToggleButtonShapes.copy(shape, shape2, shape3);
    }

    public final IconToggleButtonShapes copy(Shape shape, Shape shape2, Shape shape3) {
        return new IconToggleButtonShapes(takeOrElse$material3(shape, new a() { // from class: androidx.compose.material3.IconToggleButtonShapes$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.shape;
            }
        }), takeOrElse$material3(shape2, new a() { // from class: androidx.compose.material3.IconToggleButtonShapes$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.pressedShape;
            }
        }), takeOrElse$material3(shape3, new a() { // from class: androidx.compose.material3.IconToggleButtonShapes$$ExternalSyntheticLambda2
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
        if (obj == null || !(obj instanceof IconToggleButtonShapes)) {
            return false;
        }
        IconToggleButtonShapes iconToggleButtonShapes = (IconToggleButtonShapes) obj;
        return x.n(this.shape, iconToggleButtonShapes.shape) && x.n(this.pressedShape, iconToggleButtonShapes.pressedShape) && x.n(this.checkedShape, iconToggleButtonShapes.checkedShape);
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

    public IconToggleButtonShapes(Shape shape, Shape shape2, Shape shape3) {
        this.shape = shape;
        this.pressedShape = shape2;
        this.checkedShape = shape3;
    }
}
