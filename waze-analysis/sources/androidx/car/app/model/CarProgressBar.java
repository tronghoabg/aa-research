package androidx.car.app.model;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.model.constraints.CarColorConstraints;
import androidx.core.math.MathUtils;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(9)
/* loaded from: classes2.dex */
public final class CarProgressBar {
    private final CarColor mColor;
    private final float mProgress;

    /* compiled from: WazeSource */
    public final class Builder {
        CarColor mColor;
        float mProgress;

        public Builder(float f2) {
            if (Float.isNaN(f2) || Float.isInfinite(f2)) {
                throw new IllegalArgumentException("Progress cannot be NaN or infinite");
            }
            this.mProgress = MathUtils.clamp(f2, 0.0f, 1.0f);
        }

        public CarProgressBar build() {
            return new CarProgressBar(this);
        }

        public Builder setColor(CarColor carColor) {
            CarColorConstraints.UNCONSTRAINED.validateOrThrow((CarColor) Objects.requireNonNull(carColor));
            this.mColor = carColor;
            return this;
        }
    }

    CarProgressBar(Builder builder) {
        this.mProgress = builder.mProgress;
        this.mColor = builder.mColor;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarProgressBar)) {
            return false;
        }
        CarProgressBar carProgressBar = (CarProgressBar) obj;
        return this.mProgress == carProgressBar.mProgress && Objects.equals(this.mColor, carProgressBar.mColor);
    }

    public CarColor getColor() {
        return this.mColor;
    }

    public float getProgress() {
        return this.mProgress;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.mProgress), this.mColor);
    }

    public String toString() {
        return "[progress: " + this.mProgress + ", color: " + this.mColor + "]";
    }

    private CarProgressBar() {
        this.mProgress = 0.0f;
        this.mColor = null;
    }
}
