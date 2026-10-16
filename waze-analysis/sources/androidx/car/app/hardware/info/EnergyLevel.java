package androidx.car.app.hardware.info;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(3)
/* loaded from: classes2.dex */
public final class EnergyLevel {
    private final CarValue<Float> mBatteryPercent;
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Boolean> mEnergyIsLow;
    private final CarValue<Float> mFuelPercent;
    private final CarValue<Integer> mFuelVolumeDisplayUnit;
    private final CarValue<Float> mRangeRemainingMeters;

    /* compiled from: WazeSource */
    public final class Builder {
        CarValue<Float> mBatteryPercent;
        CarValue<Integer> mDistanceDisplayUnit;
        CarValue<Boolean> mEnergyIsLow;
        CarValue<Float> mFuelPercent;
        CarValue<Integer> mFuelVolumeDisplayUnit;
        CarValue<Float> mRangeRemainingMeters;

        public Builder() {
            CarValue<Float> carValue = CarValue.UNKNOWN_FLOAT;
            this.mBatteryPercent = carValue;
            this.mFuelPercent = carValue;
            this.mEnergyIsLow = CarValue.UNKNOWN_BOOLEAN;
            this.mRangeRemainingMeters = carValue;
            CarValue<Integer> carValue2 = CarValue.UNKNOWN_INTEGER;
            this.mDistanceDisplayUnit = carValue2;
            this.mFuelVolumeDisplayUnit = carValue2;
        }

        public EnergyLevel build() {
            return new EnergyLevel(this);
        }

        public Builder setBatteryPercent(CarValue<Float> carValue) {
            this.mBatteryPercent = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setDistanceDisplayUnit(CarValue<Integer> carValue) {
            this.mDistanceDisplayUnit = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setEnergyIsLow(CarValue<Boolean> carValue) {
            this.mEnergyIsLow = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setFuelPercent(CarValue<Float> carValue) {
            this.mFuelPercent = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setFuelVolumeDisplayUnit(CarValue<Integer> carValue) {
            this.mFuelVolumeDisplayUnit = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setRangeRemainingMeters(CarValue<Float> carValue) {
            this.mRangeRemainingMeters = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }
    }

    EnergyLevel(Builder builder) {
        this.mBatteryPercent = (CarValue) Objects.requireNonNull(builder.mBatteryPercent);
        this.mFuelPercent = (CarValue) Objects.requireNonNull(builder.mFuelPercent);
        this.mEnergyIsLow = (CarValue) Objects.requireNonNull(builder.mEnergyIsLow);
        this.mRangeRemainingMeters = (CarValue) Objects.requireNonNull(builder.mRangeRemainingMeters);
        this.mDistanceDisplayUnit = (CarValue) Objects.requireNonNull(builder.mDistanceDisplayUnit);
        this.mFuelVolumeDisplayUnit = (CarValue) Objects.requireNonNull(builder.mFuelVolumeDisplayUnit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyLevel)) {
            return false;
        }
        EnergyLevel energyLevel = (EnergyLevel) obj;
        return Objects.equals(this.mBatteryPercent, energyLevel.mBatteryPercent) && Objects.equals(this.mFuelPercent, energyLevel.mFuelPercent) && Objects.equals(this.mEnergyIsLow, energyLevel.mEnergyIsLow) && Objects.equals(getRangeRemainingMeters(), energyLevel.getRangeRemainingMeters()) && Objects.equals(this.mDistanceDisplayUnit, energyLevel.mDistanceDisplayUnit) && Objects.equals(this.mFuelVolumeDisplayUnit, energyLevel.mFuelVolumeDisplayUnit);
    }

    public CarValue<Float> getBatteryPercent() {
        return (CarValue) Objects.requireNonNull(this.mBatteryPercent);
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        return (CarValue) Objects.requireNonNull(this.mDistanceDisplayUnit);
    }

    public CarValue<Boolean> getEnergyIsLow() {
        return (CarValue) Objects.requireNonNull(this.mEnergyIsLow);
    }

    public CarValue<Float> getFuelPercent() {
        return (CarValue) Objects.requireNonNull(this.mFuelPercent);
    }

    public CarValue<Integer> getFuelVolumeDisplayUnit() {
        return (CarValue) Objects.requireNonNull(this.mFuelVolumeDisplayUnit);
    }

    public CarValue<Float> getRangeRemainingMeters() {
        return (CarValue) Objects.requireNonNull(this.mRangeRemainingMeters);
    }

    public int hashCode() {
        return Objects.hash(this.mBatteryPercent, this.mFuelPercent, this.mEnergyIsLow, getRangeRemainingMeters(), this.mDistanceDisplayUnit, this.mFuelVolumeDisplayUnit);
    }

    public String toString() {
        return "[ battery percent: " + this.mBatteryPercent + ", fuel percent: " + this.mFuelPercent + ", energyIsLow: " + this.mEnergyIsLow + ", range remaining: " + getRangeRemainingMeters() + ", distance display unit: " + this.mDistanceDisplayUnit + ", fuel volume display unit: " + this.mFuelVolumeDisplayUnit + "]";
    }

    private EnergyLevel() {
        CarValue<Float> carValue = CarValue.UNKNOWN_FLOAT;
        this.mBatteryPercent = carValue;
        this.mFuelPercent = carValue;
        this.mEnergyIsLow = CarValue.UNKNOWN_BOOLEAN;
        this.mRangeRemainingMeters = carValue;
        CarValue<Integer> carValue2 = CarValue.UNKNOWN_INTEGER;
        this.mDistanceDisplayUnit = carValue2;
        this.mFuelVolumeDisplayUnit = carValue2;
    }
}
