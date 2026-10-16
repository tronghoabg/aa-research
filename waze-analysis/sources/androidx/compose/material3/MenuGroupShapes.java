package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MenuGroupShapes {
    public static final int $stable = 0;
    private final Shape inactiveShape;
    private final Shape shape;

    public MenuGroupShapes(Shape shape, Shape shape2) {
        this.shape = shape;
        this.inactiveShape = shape2;
    }

    public static /* synthetic */ MenuGroupShapes copy$default(MenuGroupShapes menuGroupShapes, Shape shape, Shape shape2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = menuGroupShapes.shape;
        }
        if ((i2 & 2) != 0) {
            shape2 = menuGroupShapes.inactiveShape;
        }
        return menuGroupShapes.copy(shape, shape2);
    }

    public final MenuGroupShapes copy(Shape shape, Shape shape2) {
        return new MenuGroupShapes(takeOrElse$material3(shape, new a() { // from class: androidx.compose.material3.MenuGroupShapes$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.shape;
            }
        }), takeOrElse$material3(shape2, new a() { // from class: androidx.compose.material3.MenuGroupShapes$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.inactiveShape;
            }
        }));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof MenuGroupShapes)) {
            MenuGroupShapes menuGroupShapes = (MenuGroupShapes) obj;
            if (x.n(this.shape, menuGroupShapes.shape) && x.n(this.inactiveShape, menuGroupShapes.inactiveShape)) {
                return true;
            }
        }
        return false;
    }

    public final Shape getInactiveShape() {
        return this.inactiveShape;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return (this.shape.hashCode() * 31) + this.inactiveShape.hashCode();
    }

    public final Shape takeOrElse$material3(Shape shape, a<? extends Shape> aVar) {
        return shape == null ? aVar.invoke() : shape;
    }
}
