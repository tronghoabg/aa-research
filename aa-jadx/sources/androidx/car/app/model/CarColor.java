package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class CarColor {
    public static final int TYPE_BLUE = 6;
    public static final int TYPE_CUSTOM = 0;
    public static final int TYPE_DEFAULT = 1;
    public static final int TYPE_GREEN = 5;
    public static final int TYPE_PRIMARY = 2;
    public static final int TYPE_RED = 4;
    public static final int TYPE_SECONDARY = 3;
    public static final int TYPE_YELLOW = 7;
    private final int mColor;
    private final int mColorDark;
    private final int mType;
    public static final androidx.car.app.model.CarColor DEFAULT = create(1);
    public static final androidx.car.app.model.CarColor PRIMARY = create(2);
    public static final androidx.car.app.model.CarColor SECONDARY = create(3);
    public static final androidx.car.app.model.CarColor RED = create(4);
    public static final androidx.car.app.model.CarColor GREEN = create(5);
    public static final androidx.car.app.model.CarColor BLUE = create(6);
    public static final androidx.car.app.model.CarColor YELLOW = create(7);

    private CarColor() {
        this.mType = 1;
        this.mColor = 0;
        this.mColorDark = 0;
    }

    private static androidx.car.app.model.CarColor create(int i) {
        return new androidx.car.app.model.CarColor(i, 0, 0);
    }

    public static androidx.car.app.model.CarColor createCustom(int i, int i2) {
        return new androidx.car.app.model.CarColor(0, i, i2);
    }

    private static java.lang.String typeToString(int i) {
        switch (i) {
            case 0:
                return "CUSTOM";
            case 1:
                return "DEFAULT";
            case 2:
                return "PRIMARY";
            case 3:
                return "SECONDARY";
            case 4:
                return "RED";
            case 5:
                return "GREEN";
            case 6:
                return "BLUE";
            case 7:
                return "YELLOW";
            default:
                return "<unknown>";
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.CarColor)) {
            return false;
        }
        androidx.car.app.model.CarColor carColor = (androidx.car.app.model.CarColor) obj;
        return this.mColor == carColor.mColor && this.mColorDark == carColor.mColorDark && this.mType == carColor.mType;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getColorDark() {
        return this.mColorDark;
    }

    public int getType() {
        return this.mType;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Integer.valueOf(this.mType), java.lang.Integer.valueOf(this.mColor), java.lang.Integer.valueOf(this.mColorDark));
    }

    public java.lang.String toString() {
        return "[type: " + typeToString(this.mType) + ", color: " + this.mColor + ", dark: " + this.mColorDark + "]";
    }

    private CarColor(int i, int i2, int i3) {
        this.mType = i;
        this.mColor = i2;
        this.mColorDark = i3;
    }
}
