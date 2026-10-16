package androidx.car.app.model;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class CarLocation {
    private final double mLat;
    private final double mLng;

    private CarLocation(double d, double d2) {
        this.mLat = d;
        this.mLng = d2;
    }

    public static androidx.car.app.model.CarLocation create(android.location.Location location) {
        location.getClass();
        return create(location.getLatitude(), location.getLongitude());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.model.CarLocation)) {
            return false;
        }
        androidx.car.app.model.CarLocation carLocation = (androidx.car.app.model.CarLocation) obj;
        return java.lang.Double.doubleToLongBits(this.mLat) == java.lang.Double.doubleToLongBits(carLocation.mLat) && java.lang.Double.doubleToLongBits(this.mLng) == java.lang.Double.doubleToLongBits(carLocation.mLng);
    }

    public double getLatitude() {
        return this.mLat;
    }

    public double getLongitude() {
        return this.mLng;
    }

    public int hashCode() {
        return j$.util.Objects.hash(java.lang.Double.valueOf(this.mLat), java.lang.Double.valueOf(this.mLng));
    }

    public java.lang.String toString() {
        return "[" + getLatitude() + ", " + getLongitude() + "]";
    }

    private CarLocation() {
        this(0.0d, 0.0d);
    }

    public static androidx.car.app.model.CarLocation create(double d, double d2) {
        return new androidx.car.app.model.CarLocation(d, d2);
    }
}
