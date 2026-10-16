package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.rb;
import defpackage.sa;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class Mileage {
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Float> mOdometerMeters;

    public Mileage(sa saVar) {
        CarValue<Float> carValue = saVar.a;
        carValue.getClass();
        this.mOdometerMeters = carValue;
        CarValue<Integer> carValue2 = saVar.b;
        carValue2.getClass();
        this.mDistanceDisplayUnit = carValue2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mileage)) {
            return false;
        }
        Mileage mileage = (Mileage) obj;
        return Objects.equals(getOdometerInKilometers(), mileage.getOdometerInKilometers()) && Objects.equals(this.mDistanceDisplayUnit, mileage.mDistanceDisplayUnit);
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public CarValue<Float> getOdometerInKilometers() {
        CarValue<Float> carValue = this.mOdometerMeters;
        carValue.getClass();
        return carValue;
    }

    @Deprecated
    public CarValue<Float> getOdometerMeters() {
        return getOdometerInKilometers();
    }

    public int hashCode() {
        return Objects.hash(getOdometerInKilometers(), this.mDistanceDisplayUnit);
    }

    public String toString() {
        return "[ odometer: " + getOdometerInKilometers() + ", distance display unit: " + this.mDistanceDisplayUnit + "]";
    }

    private Mileage() {
        this.mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        this.mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }
}
