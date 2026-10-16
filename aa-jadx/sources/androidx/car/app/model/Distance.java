package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Distance {
    public static final int UNIT_FEET = 6;
    public static final int UNIT_KILOMETERS = 2;
    public static final int UNIT_KILOMETERS_P1 = 3;
    public static final int UNIT_METERS = 1;
    public static final int UNIT_MILES = 4;
    public static final int UNIT_MILES_P1 = 5;
    public static final int UNIT_YARDS = 7;
    private final double mDisplayDistance;
    private final int mDisplayUnit;

    private Distance() {
        this.mDisplayDistance = 0.0d;
        this.mDisplayUnit = 1;
    }

    public static androidx.car.app.model.Distance create(double d, int i) {
        if (d >= 0.0d) {
            return new androidx.car.app.model.Distance(d, i);
        }
        throw new java.lang.IllegalArgumentException("displayDistance must be a positive value");
    }

    private static java.lang.String unitToString(int i) {
        switch (i) {
            case 1:
                return "m";
            case 2:
                return "km";
            case 3:
                return "km_p1";
            case 4:
                return "mi";
            case 5:
                return "mi_p1";
            case 6:
                return "ft";
            case 7:
                return "yd";
            default:
                return "?";
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.Distance)) {
            return false;
        }
        androidx.car.app.model.Distance distance = (androidx.car.app.model.Distance) obj;
        return this.mDisplayUnit == distance.mDisplayUnit && this.mDisplayDistance == distance.mDisplayDistance;
    }

    public double getDisplayDistance() {
        return this.mDisplayDistance;
    }

    public int getDisplayUnit() {
        return this.mDisplayUnit;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Double.valueOf(this.mDisplayDistance), java.lang.Integer.valueOf(this.mDisplayUnit));
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "%.04f%s", java.lang.Double.valueOf(this.mDisplayDistance), unitToString(this.mDisplayUnit));
    }

    private Distance(double d, int i) {
        this.mDisplayDistance = d;
        this.mDisplayUnit = i;
    }
}
