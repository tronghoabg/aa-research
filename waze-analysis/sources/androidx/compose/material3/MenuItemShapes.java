package androidx.compose.material3;

import androidx.compose.ui.graphics.Shape;
import h.g.a.a;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class MenuItemShapes {
    public static final int $stable = 0;
    private final Shape selectedShape;
    private final Shape shape;

    public MenuItemShapes(Shape shape, Shape shape2) {
        this.shape = shape;
        this.selectedShape = shape2;
    }

    public static /* synthetic */ MenuItemShapes copy$default(MenuItemShapes menuItemShapes, Shape shape, Shape shape2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            shape = menuItemShapes.shape;
        }
        if ((i2 & 2) != 0) {
            shape2 = menuItemShapes.selectedShape;
        }
        return menuItemShapes.copy(shape, shape2);
    }

    public final MenuItemShapes copy(Shape shape, Shape shape2) {
        return new MenuItemShapes(takeOrElse$material3(shape, new a() { // from class: androidx.compose.material3.MenuItemShapes$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.shape;
            }
        }), takeOrElse$material3(shape2, new a() { // from class: androidx.compose.material3.MenuItemShapes$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.selectedShape;
            }
        }));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof MenuItemShapes)) {
            MenuItemShapes menuItemShapes = (MenuItemShapes) obj;
            if (x.n(this.shape, menuItemShapes.shape) && x.n(this.selectedShape, menuItemShapes.selectedShape)) {
                return true;
            }
        }
        return false;
    }

    public final Shape getSelectedShape() {
        return this.selectedShape;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public int hashCode() {
        return (this.shape.hashCode() * 31) + this.selectedShape.hashCode();
    }

    public final Shape takeOrElse$material3(Shape shape, a<? extends Shape> aVar) {
        return shape == null ? aVar.invoke() : shape;
    }
}
