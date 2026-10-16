package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import h.g.a.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class IconButtonShapes {
    public static final int $stable = 0;
    private final Shape pressedShape;
    private final Shape shape;

    public /* synthetic */ IconButtonShapes(Shape shape, Shape shape2, int i2, o oVar) {
        this(shape, (i2 & 2) != 0 ? shape : shape2);
    }

    public static /* synthetic */ IconButtonShapes copy$default(IconButtonShapes iconButtonShapes, Shape shape, Shape shape2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = iconButtonShapes.shape;
        }
        if ((i2 & 2) != 0) {
            shape2 = iconButtonShapes.pressedShape;
        }
        return iconButtonShapes.copy(shape, shape2);
    }

    public final IconButtonShapes copy(Shape shape, Shape shape2) {
        return new IconButtonShapes(takeOrElse$material3(shape, new a() { // from class: androidx.compose.material3.IconButtonShapes$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.shape;
            }
        }), takeOrElse$material3(shape2, new a() { // from class: androidx.compose.material3.IconButtonShapes$$ExternalSyntheticLambda1
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
        if (obj == null || !(obj instanceof IconButtonShapes)) {
            return false;
        }
        IconButtonShapes iconButtonShapes = (IconButtonShapes) obj;
        return x.n(this.shape, iconButtonShapes.shape) && x.n(this.pressedShape, iconButtonShapes.pressedShape);
    }

    public final Shape getPressedShape() {
        return this.pressedShape;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return (this.shape.hashCode() * 31) + this.pressedShape.hashCode();
    }

    public final Shape takeOrElse$material3(Shape shape, a<? extends Shape> aVar) {
        return shape == null ? aVar.invoke() : shape;
    }

    public IconButtonShapes(Shape shape, Shape shape2) {
        this.shape = shape;
        this.pressedShape = shape2;
    }
}
