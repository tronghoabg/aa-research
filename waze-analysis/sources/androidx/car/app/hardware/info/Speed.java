package androidx.car.app.hardware.info;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(3)
/* loaded from: classes2.dex */
public final class Speed {
    private final CarValue<Float> mDisplaySpeedMetersPerSecond;
    private final CarValue<Float> mRawSpeedMetersPerSecond;
    private final CarValue<Integer> mSpeedDisplayUnit;

    /* compiled from: WazeSource */
    public final class Builder {
        CarValue<Float> mDisplaySpeedMetersPerSecond;
        CarValue<Float> mRawSpeedMetersPerSecond;
        CarValue<Integer> mSpeedDisplayUnit;

        public Builder() {
            CarValue<Float> carValue = CarValue.UNKNOWN_FLOAT;
            this.mRawSpeedMetersPerSecond = carValue;
            this.mDisplaySpeedMetersPerSecond = carValue;
            this.mSpeedDisplayUnit = CarValue.UNKNOWN_INTEGER;
        }

        public Speed build() {
            return new Speed(this);
        }

        public Builder setDisplaySpeedMetersPerSecond(CarValue<Float> carValue) {
            this.mDisplaySpeedMetersPerSecond = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setRawSpeedMetersPerSecond(CarValue<Float> carValue) {
            this.mRawSpeedMetersPerSecond = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setSpeedDisplayUnit(CarValue<Integer> carValue) {
            this.mSpeedDisplayUnit = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }
    }

    Speed(Builder builder) {
        this.mRawSpeedMetersPerSecond = (CarValue) Objects.requireNonNull(builder.mRawSpeedMetersPerSecond);
        this.mDisplaySpeedMetersPerSecond = (CarValue) Objects.requireNonNull(builder.mDisplaySpeedMetersPerSecond);
        this.mSpeedDisplayUnit = (CarValue) Objects.requireNonNull(builder.mSpeedDisplayUnit);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Speed)) {
            return false;
        }
        Speed speed = (Speed) obj;
        return Objects.equals(getRawSpeedMetersPerSecond(), speed.getRawSpeedMetersPerSecond()) && Objects.equals(getDisplaySpeedMetersPerSecond(), speed.getDisplaySpeedMetersPerSecond()) && Objects.equals(this.mSpeedDisplayUnit, speed.mSpeedDisplayUnit);
    }

    public CarValue<Float> getDisplaySpeedMetersPerSecond() {
        return (CarValue) Objects.requireNonNull(this.mDisplaySpeedMetersPerSecond);
    }

    public CarValue<Float> getRawSpeedMetersPerSecond() {
        return (CarValue) Objects.requireNonNull(this.mRawSpeedMetersPerSecond);
    }

    public CarValue<Integer> getSpeedDisplayUnit() {
        return (CarValue) Objects.requireNonNull(this.mSpeedDisplayUnit);
    }

    public int hashCode() {
        return Objects.hash(getRawSpeedMetersPerSecond(), getDisplaySpeedMetersPerSecond(), this.mSpeedDisplayUnit);
    }

    public String toString() {
        return "[ raw speed: " + getRawSpeedMetersPerSecond() + ", display speed: " + getDisplaySpeedMetersPerSecond() + ", speed display unit: " + this.mSpeedDisplayUnit + "]";
    }

    private Speed() {
        CarValue<Float> carValue = CarValue.UNKNOWN_FLOAT;
        this.mRawSpeedMetersPerSecond = carValue;
        this.mDisplaySpeedMetersPerSecond = carValue;
        this.mSpeedDisplayUnit = CarValue.UNKNOWN_INTEGER;
    }
}
