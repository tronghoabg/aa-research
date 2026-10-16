package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Speed {
    private final androidx.car.app.hardware.common.CarValue<java.lang.Float> mDisplaySpeedMetersPerSecond;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Float> mRawSpeedMetersPerSecond;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Integer> mSpeedDisplayUnit;

    public Speed(defpackage.sj sjVar) {
        java.lang.Object obj = sjVar.a;
        obj.getClass();
        this.mRawSpeedMetersPerSecond = (androidx.car.app.hardware.common.CarValue) obj;
        java.lang.Object obj2 = sjVar.b;
        obj2.getClass();
        this.mDisplaySpeedMetersPerSecond = (androidx.car.app.hardware.common.CarValue) obj2;
        java.lang.Object obj3 = sjVar.c;
        obj3.getClass();
        this.mSpeedDisplayUnit = (androidx.car.app.hardware.common.CarValue) obj3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.hardware.info.Speed)) {
            return false;
        }
        androidx.car.app.hardware.info.Speed speed = (androidx.car.app.hardware.info.Speed) obj;
        return j$.util.Objects.equals(getRawSpeedMetersPerSecond(), speed.getRawSpeedMetersPerSecond()) && j$.util.Objects.equals(getDisplaySpeedMetersPerSecond(), speed.getDisplaySpeedMetersPerSecond()) && j$.util.Objects.equals(this.mSpeedDisplayUnit, speed.mSpeedDisplayUnit);
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Float> getDisplaySpeedMetersPerSecond() {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = this.mDisplaySpeedMetersPerSecond;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Float> getRawSpeedMetersPerSecond() {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = this.mRawSpeedMetersPerSecond;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Integer> getSpeedDisplayUnit() {
        androidx.car.app.hardware.common.CarValue<java.lang.Integer> carValue = this.mSpeedDisplayUnit;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return j$.util.Objects.hash(getRawSpeedMetersPerSecond(), getDisplaySpeedMetersPerSecond(), this.mSpeedDisplayUnit);
    }

    public java.lang.String toString() {
        return "[ raw speed: " + getRawSpeedMetersPerSecond() + ", display speed: " + getDisplaySpeedMetersPerSecond() + ", speed display unit: " + this.mSpeedDisplayUnit + "]";
    }

    private Speed() {
        androidx.car.app.hardware.common.CarValue<java.lang.Float> carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT;
        this.mRawSpeedMetersPerSecond = carValue;
        this.mDisplaySpeedMetersPerSecond = carValue;
        this.mSpeedDisplayUnit = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
    }
}
