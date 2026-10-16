package androidx.car.app.hardware.info;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
@RequiresCarApi(3)
/* loaded from: classes.dex */
public final class Model {
    private final CarValue<String> mManufacturer;
    private final CarValue<String> mName;
    private final CarValue<Integer> mYear;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
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
            Objects.requireNonNull(carValue);
            this.mManufacturer = carValue;
            return this;
        }

        public Builder setName(CarValue<String> carValue) {
            Objects.requireNonNull(carValue);
            this.mName = carValue;
            return this;
        }

        public Builder setYear(CarValue<Integer> carValue) {
            Objects.requireNonNull(carValue);
            this.mYear = carValue;
            return this;
        }
    }

    public Model(Builder builder) {
        CarValue<String> carValue = builder.mName;
        Objects.requireNonNull(carValue);
        this.mName = carValue;
        CarValue<String> carValue2 = builder.mManufacturer;
        Objects.requireNonNull(carValue2);
        this.mManufacturer = carValue2;
        CarValue<Integer> carValue3 = builder.mYear;
        Objects.requireNonNull(carValue3);
        this.mYear = carValue3;
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
        CarValue<String> carValue = this.mManufacturer;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<String> getName() {
        CarValue<String> carValue = this.mName;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Integer> getYear() {
        CarValue<Integer> carValue = this.mYear;
        Objects.requireNonNull(carValue);
        return carValue;
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
