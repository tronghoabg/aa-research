package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Model {
    private final androidx.car.app.hardware.common.CarValue<java.lang.String> mManufacturer;
    private final androidx.car.app.hardware.common.CarValue<java.lang.String> mName;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Integer> mYear;

    public Model(defpackage.sg sgVar) {
        java.lang.Object obj = sgVar.a;
        obj.getClass();
        this.mName = (androidx.car.app.hardware.common.CarValue) obj;
        java.lang.Object obj2 = sgVar.c;
        obj2.getClass();
        this.mManufacturer = (androidx.car.app.hardware.common.CarValue) obj2;
        java.lang.Object obj3 = sgVar.b;
        obj3.getClass();
        this.mYear = (androidx.car.app.hardware.common.CarValue) obj3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.hardware.info.Model)) {
            return false;
        }
        androidx.car.app.hardware.info.Model model = (androidx.car.app.hardware.info.Model) obj;
        return j$.util.Objects.equals(this.mName, model.mName) && j$.util.Objects.equals(this.mYear, model.mYear) && j$.util.Objects.equals(this.mManufacturer, model.mManufacturer);
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.String> getManufacturer() {
        androidx.car.app.hardware.common.CarValue<java.lang.String> carValue = this.mManufacturer;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.String> getName() {
        androidx.car.app.hardware.common.CarValue<java.lang.String> carValue = this.mName;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Integer> getYear() {
        androidx.car.app.hardware.common.CarValue<java.lang.Integer> carValue = this.mYear;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mName, this.mYear, this.mManufacturer);
    }

    public java.lang.String toString() {
        return "[ name: " + this.mName + ", year: " + this.mYear + ", manufacturer: " + this.mManufacturer + "]";
    }

    private Model() {
        androidx.car.app.hardware.common.CarValue<java.lang.String> carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_STRING;
        this.mName = carValue;
        this.mManufacturer = carValue;
        this.mYear = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER;
    }
}
