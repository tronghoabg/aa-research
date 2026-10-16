package androidx.car.app.hardware.info;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(3)
/* loaded from: classes2.dex */
public final class Model {
    private final CarValue<String> mManufacturer;
    private final CarValue<String> mName;
    private final CarValue<Integer> mYear;

    /* compiled from: WazeSource */
    public final class Builder {
        CarValue<String> mManufacturer;
        CarValue<String> mName;
        CarValue<Integer> mYear;

        public Builder() {
            CarValue<String> carValue = CarValue.UNKNOWN_STRING;
            this.mName = carValue;
            this.mYear = CarValue.UNKNOWN_INTEGER;
            this.mManufacturer = carValue;
        }

        public Model build() {
            return new Model(this);
        }

        public Builder setManufacturer(CarValue<String> carValue) {
            this.mManufacturer = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setName(CarValue<String> carValue) {
            this.mName = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setYear(CarValue<Integer> carValue) {
            this.mYear = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }
    }

    Model(Builder builder) {
        this.mName = (CarValue) Objects.requireNonNull(builder.mName);
        this.mManufacturer = (CarValue) Objects.requireNonNull(builder.mManufacturer);
        this.mYear = (CarValue) Objects.requireNonNull(builder.mYear);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Model)) {
            return false;
        }
        Model model = (Model) obj;
        return Objects.equals(this.mName, model.mName) && Objects.equals(this.mYear, model.mYear) && Objects.equals(this.mManufacturer, model.mManufacturer);
    }

    public CarValue<String> getManufacturer() {
        return (CarValue) Objects.requireNonNull(this.mManufacturer);
    }

    public CarValue<String> getName() {
        return (CarValue) Objects.requireNonNull(this.mName);
    }

    public CarValue<Integer> getYear() {
        return (CarValue) Objects.requireNonNull(this.mYear);
    }

    public int hashCode() {
        return Objects.hash(this.mName, this.mYear, this.mManufacturer);
    }

    public String toString() {
        return "[ name: " + this.mName + ", year: " + this.mYear + ", manufacturer: " + this.mManufacturer + "]";
    }

    private Model() {
        CarValue<String> carValue = CarValue.UNKNOWN_STRING;
        this.mName = carValue;
        this.mManufacturer = carValue;
        this.mYear = CarValue.UNKNOWN_INTEGER;
    }
}
