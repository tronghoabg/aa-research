package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Shape {
    public static final int TYPE_CORNER_EXTRA_LARGE = 6;
    public static final int TYPE_CORNER_EXTRA_SMALL = 2;
    public static final int TYPE_CORNER_FULL = 7;
    public static final int TYPE_CORNER_LARGE = 5;
    public static final int TYPE_CORNER_MEDIUM = 4;
    public static final int TYPE_CORNER_SMALL = 3;
    public static final int TYPE_NONE = 1;
    private final int mShapeType;
    public static final androidx.car.app.model.Shape NONE = new androidx.car.app.model.Shape(1);
    public static final androidx.car.app.model.Shape CORNER_EXTRA_SMALL = new androidx.car.app.model.Shape(2);
    public static final androidx.car.app.model.Shape CORNER_SMALL = new androidx.car.app.model.Shape(3);
    public static final androidx.car.app.model.Shape CORNER_MEDIUM = new androidx.car.app.model.Shape(4);
    public static final androidx.car.app.model.Shape CORNER_LARGE = new androidx.car.app.model.Shape(5);
    public static final androidx.car.app.model.Shape CORNER_EXTRA_LARGE = new androidx.car.app.model.Shape(6);
    public static final androidx.car.app.model.Shape CORNER_FULL = new androidx.car.app.model.Shape(7);

    private Shape() {
        this.mShapeType = 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof androidx.car.app.model.Shape) && this.mShapeType == ((androidx.car.app.model.Shape) obj).mShapeType;
    }

    public int getShapeType() {
        return this.mShapeType;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.mShapeType));
    }

    public java.lang.String toString() {
        return "Shape { shapeType: " + this.mShapeType + " }";
    }

    private Shape(int i) {
        this.mShapeType = i;
    }
}
