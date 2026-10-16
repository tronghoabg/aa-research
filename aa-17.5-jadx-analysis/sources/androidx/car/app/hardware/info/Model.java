package androidx.car.app.hardware.info;

import androidx.car.app.hardware.common.CarValue;
import defpackage.rb;
import defpackage.sb;
import j$.util.Objects;

@rb
/* loaded from: classes2.dex */
public final class Model {
    private final CarValue<String> mManufacturer;
    private final CarValue<String> mName;
    private final CarValue<Integer> mYear;

    public Model(sb sbVar) {
        Object obj = sbVar.a;
        obj.getClass();
        this.mName = (CarValue) obj;
        Object obj2 = sbVar.c;
        obj2.getClass();
        this.mManufacturer = (CarValue) obj2;
        Object obj3 = sbVar.b;
        obj3.getClass();
        this.mYear = (CarValue) obj3;
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
        carValue.getClass();
        return carValue;
    }

    public CarValue<String> getName() {
        CarValue<String> carValue = this.mName;
        carValue.getClass();
        return carValue;
    }

    public CarValue<Integer> getYear() {
        CarValue<Integer> carValue = this.mYear;
        carValue.getClass();
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
