package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.rb;
import defpackage.rx;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class EnergyLevel {
    private final CarValue<Float> mBatteryPercent;
    private final CarValue<Integer> mDistanceDisplayUnit;
    private final CarValue<Boolean> mEnergyIsLow;
    private final CarValue<Float> mFuelPercent;
    private final CarValue<Integer> mFuelVolumeDisplayUnit;
    private final CarValue<Float> mRangeRemainingMeters;

    public EnergyLevel(rx rxVar) {
        CarValue<Float> carValue = rxVar.a;
        carValue.getClass();
        this.mBatteryPercent = carValue;
        CarValue<Float> carValue2 = rxVar.b;
        carValue2.getClass();
        this.mFuelPercent = carValue2;
        CarValue<Boolean> carValue3 = rxVar.c;
        carValue3.getClass();
        this.mEnergyIsLow = carValue3;
        CarValue<Float> carValue4 = rxVar.d;
        carValue4.getClass();
        this.mRangeRemainingMeters = carValue4;
        CarValue<Integer> carValue5 = rxVar.e;
        carValue5.getClass();
        this.mDistanceDisplayUnit = carValue5;
        CarValue<Integer> carValue6 = rxVar.f;
        carValue6.getClass();
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
        carValue.getClass();
        return carValue;
    }

    public CarValue<Integer> getDistanceDisplayUnit() {
        CarValue<Integer> carValue = this.mDistanceDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public CarValue<Boolean> getEnergyIsLow() {
        CarValue<Boolean> carValue = this.mEnergyIsLow;
        carValue.getClass();
        return carValue;
    }

    public CarValue<Float> getFuelPercent() {
        CarValue<Float> carValue = this.mFuelPercent;
        carValue.getClass();
        return carValue;
    }

    public CarValue<Integer> getFuelVolumeDisplayUnit() {
        CarValue<Integer> carValue = this.mFuelVolumeDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public CarValue<Float> getRangeRemainingMeters() {
        CarValue<Float> carValue = this.mRangeRemainingMeters;
        carValue.getClass();
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
