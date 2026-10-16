package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Mileage {
    private final androidx.car.app.hardware.common.CarValue<java.lang.Integer> mDistanceDisplayUnit;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Float> mOdometerMeters;

    public Mileage(defpackage.sf sfVar) {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = sfVar.a;
        carValue.getClass();
        this.mOdometerMeters = carValue;
        androidx.car.app.hardware.common.CarValue<java.lang.Integer> carValue2 = sfVar.b;
        carValue2.getClass();
        this.mDistanceDisplayUnit = carValue2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.hardware.info.Mileage)) {
            return false;
        }
        androidx.car.app.hardware.info.Mileage mileage = (androidx.car.app.hardware.info.Mileage) obj;
        return j$.util.Objects.equals(getOdometerInKilometers(), mileage.getOdometerInKilometers()) && j$.util.Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Integer> getDistanceDisplayUnit() {
        androidx.car.app.hardware.common.CarValue<java.lang.Integer> carValue = this.mDistanceDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Float> getOdometerInKilometers() {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = this.mOdometerMeters;
        carValue.getClass();
        return carValue;
    }

    @java.lang.Deprecated
    public androidx.car.app.hardware.common.CarValue<java.lang.Float> getOdometerMeters() {
        return getOdometerInKilometers();
    }

    public int hashCode() {
        return j$.util.Objects.hash(getOdometerInKilometers(), this.mDistanceDisplayUnit);
    }

    public java.lang.String toString() {
        return "[ odometer: " + getOdometerInKilometers() + ", distance display unit: " + this.mDistanceDisplayUnit + "]";
    }

    private Mileage() {
        this.mOdometerMeters = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
    }
}
