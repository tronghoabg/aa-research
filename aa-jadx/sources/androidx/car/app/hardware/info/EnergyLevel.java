package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class EnergyLevel {
    private final androidx.car.app.hardware.common.CarValue<java.lang.Float> mBatteryPercent;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Integer> mDistanceDisplayUnit;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Boolean> mEnergyIsLow;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Float> mFuelPercent;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Integer> mFuelVolumeDisplayUnit;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Float> mRangeRemainingMeters;

    public EnergyLevel(defpackage.sc scVar) {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = scVar.a;
        carValue.getClass();
        this.mBatteryPercent = carValue;
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue2 = scVar.b;
        carValue2.getClass();
        this.mFuelPercent = carValue2;
        androidx.car.app.hardware.common.CarValue<java.lang.Boolean> carValue3 = scVar.c;
        carValue3.getClass();
        this.mEnergyIsLow = carValue3;
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue4 = scVar.d;
        carValue4.getClass();
        this.mRangeRemainingMeters = carValue4;
        androidx.car.app.hardware.common.CarValue<java.lang.Integer> carValue5 = scVar.e;
        carValue5.getClass();
        this.mDistanceDisplayUnit = carValue5;
        androidx.car.app.hardware.common.CarValue<java.lang.Integer> carValue6 = scVar.f;
        carValue6.getClass();
        this.mFuelVolumeDisplayUnit = carValue6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.hardware.info.EnergyLevel)) {
            return false;
        }
        androidx.car.app.hardware.info.EnergyLevel energyLevel = (androidx.car.app.hardware.info.EnergyLevel) obj;
        return j$.util.Objects.equals(this.mBatteryPercent, energyLevel.mBatteryPercent) && j$.util.Objects.equals(this.mFuelPercent, energyLevel.mFuelPercent) && j$.util.Objects.equals(this.mEnergyIsLow, energyLevel.mEnergyIsLow) && j$.util.Objects.equals(getRangeRemainingMeters(), energyLevel.getRangeRemainingMeters()) && j$.util.Objects.equals(this.mDistanceDisplayUnit, energyLevel.mDistanceDisplayUnit) && j$.util.Objects.equals(this.mFuelVolumeDisplayUnit, energyLevel.mFuelVolumeDisplayUnit);
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Float> getBatteryPercent() {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = this.mBatteryPercent;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Integer> getDistanceDisplayUnit() {
        androidx.car.app.hardware.common.CarValue<java.lang.Integer> carValue = this.mDistanceDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Boolean> getEnergyIsLow() {
        androidx.car.app.hardware.common.CarValue<java.lang.Boolean> carValue = this.mEnergyIsLow;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Float> getFuelPercent() {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = this.mFuelPercent;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Integer> getFuelVolumeDisplayUnit() {
        androidx.car.app.hardware.common.CarValue<java.lang.Integer> carValue = this.mFuelVolumeDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Float> getRangeRemainingMeters() {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = this.mRangeRemainingMeters;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mBatteryPercent, this.mFuelPercent, this.mEnergyIsLow, getRangeRemainingMeters(), this.mDistanceDisplayUnit, this.mFuelVolumeDisplayUnit);
    }

    public java.lang.String toString() {
        return "[ battery percent: " + this.mBatteryPercent + ", fuel percent: " + this.mFuelPercent + ", energyIsLow: " + this.mEnergyIsLow + ", range remaining: " + getRangeRemainingMeters() + ", distance display unit: " + this.mDistanceDisplayUnit + ", fuel volume display unit: " + this.mFuelVolumeDisplayUnit + "]";
    }

    private EnergyLevel() {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT;
        this.mBatteryPercent = carValue;
        this.mFuelPercent = carValue;
        this.mEnergyIsLow = androidx.car.app.hardware.common.CarValue.UNKNOWN_BOOLEAN;
        this.mRangeRemainingMeters = carValue;
        androidx.car.app.hardware.common.CarValue<java.lang.Integer> carValue2 = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
        this.mDistanceDisplayUnit = carValue2;
        this.mFuelVolumeDisplayUnit = carValue2;
    }
}
