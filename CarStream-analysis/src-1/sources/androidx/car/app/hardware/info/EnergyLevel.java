package androidx.car.app.hardware.info;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(3)
/* loaded from: classes.dex */
public final class EnergyLevel {
    private final CarValue<Float> mBatteryPercent;
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Boolean> mEnergyIsLow;
    private final CarValue<Float> mFuelPercent;
    private final CarValue<Integer> mFuelVolumeDisplayUnit;
    private final CarValue<Float> mRangeRemainingMeters;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
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
            Objects.requireNonNull(carValue);
            this.mBatteryPercent = carValue;
            return this;
        }

        public Builder setDistanceDisplayUnit(CarValue<Integer> carValue) {
            Objects.requireNonNull(carValue);
            this.mDistanceDisplayUnit = carValue;
            return this;
        }

        public Builder setEnergyIsLow(CarValue<Boolean> carValue) {
            Objects.requireNonNull(carValue);
            this.mEnergyIsLow = carValue;
            return this;
        }

        public Builder setFuelPercent(CarValue<Float> carValue) {
            Objects.requireNonNull(carValue);
            this.mFuelPercent = carValue;
            return this;
        }

        public Builder setFuelVolumeDisplayUnit(CarValue<Integer> carValue) {
            Objects.requireNonNull(carValue);
            this.mFuelVolumeDisplayUnit = carValue;
            return this;
        }

        public Builder setRangeRemainingMeters(CarValue<Float> carValue) {
            Objects.requireNonNull(carValue);
            this.mRangeRemainingMeters = carValue;
            return this;
        }
    }

    public EnergyLevel(Builder builder) {
        CarValue<Float> carValue = builder.mBatteryPercent;
        Objects.requireNonNull(carValue);
        this.mBatteryPercent = carValue;
        CarValue<Float> carValue2 = builder.mFuelPercent;
        Objects.requireNonNull(carValue2);
        this.mFuelPercent = carValue2;
        CarValue<Boolean> carValue3 = builder.mEnergyIsLow;
        Objects.requireNonNull(carValue3);
        this.mEnergyIsLow = carValue3;
        CarValue<Float> carValue4 = builder.mRangeRemainingMeters;
        Objects.requireNonNull(carValue4);
        this.mRangeRemainingMeters = carValue4;
        CarValue<Integer> carValue5 = builder.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue5);
        this.mDistanceDisplayUnit = carValue5;
        CarValue<Integer> carValue6 = builder.mFuelVolumeDisplayUnit;
        Objects.requireNonNull(carValue6);
        this.mFuelVolumeDisplayUnit = carValue6;
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
        CarValue<Float> carValue = this.mBatteryPercent;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Boolean> getEnergyIsLow() {
        CarValue<Boolean> carValue = this.mEnergyIsLow;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getFuelPercent() {
        CarValue<Float> carValue = this.mFuelPercent;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getFuelVolumeDisplayUnit() {
        CarValue<Integer> carValue = this.mFuelVolumeDisplayUnit;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Float> getRangeRemainingMeters() {
        CarValue<Float> carValue = this.mRangeRemainingMeters;
        Objects.requireNonNull(carValue);
        return carValue;
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
