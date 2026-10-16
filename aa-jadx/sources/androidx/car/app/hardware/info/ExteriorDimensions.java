package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class ExteriorDimensions {
    public static final int CURB_TO_CURB_TURNING_RADIUS_INDEX = 7;
    public static final int HEIGHT_INDEX = 0;
    public static final int LENGTH_INDEX = 1;
    public static final int TRACK_WIDTH_FRONT_INDEX = 5;
    public static final int TRACK_WIDTH_REAR_INDEX = 6;
    public static final int WHEEL_BASE_INDEX = 4;
    public static final int WIDTH_INCLUDING_MIRRORS_INDEX = 3;
    public static final int WIDTH_INDEX = 2;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Integer[]> mExteriorDimensions;

    public ExteriorDimensions() {
        this.mExteriorDimensions = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER_ARRAY;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.ExteriorDimensions) {
            return this.mExteriorDimensions.equals(((androidx.car.app.hardware.info.ExteriorDimensions) obj).mExteriorDimensions);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Integer[]> getExteriorDimensions() {
        return this.mExteriorDimensions;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mExteriorDimensions);
    }

    public java.lang.String toString() {
        return "[ exteriorDimensions: " + this.mExteriorDimensions + " ]";
    }

    public ExteriorDimensions(androidx.car.app.hardware.common.CarValue<java.lang.Integer[]> carValue) {
        this.mExteriorDimensions = carValue;
    }
}
