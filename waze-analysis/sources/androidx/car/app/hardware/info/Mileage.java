package androidx.car.app.hardware.info;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(3)
/* loaded from: classes2.dex */
public final class Mileage {
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Float> mOdometerMeters;

    /* compiled from: WazeSource */
    public final class Builder {
        CarValue<Float> mOdometerMeters = CarValue.UNKNOWN_FLOAT;
        CarValue<Integer> mDistanceDisplayUnit = CarValue.UNKNOWN_INTEGER;

        public Mileage build() {
            return new Mileage(this);
        }

        public Builder setDistanceDisplayUnit(CarValue<Integer> carValue) {
            this.mDistanceDisplayUnit = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setOdometerMeters(CarValue<Float> carValue) {
            this.mOdometerMeters = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }
    }

    Mileage(Builder builder) {
        this.mOdometerMeters = (CarValue) Objects.requireNonNull(builder.mOdometerMeters);
        this.mDistanceDisplayUnit = (CarValue) Objects.requireNonNull(builder.mDistanceDisplayUnit);
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
        return (CarValue) Objects.requireNonNull(this.mDistanceDisplayUnit);
    }

    public CarValue<Float> getOdometerInKilometers() {
        return (CarValue) Objects.requireNonNull(this.mOdometerMeters);
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
