package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Accelerometer {
    private final androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> mForces;

    public Accelerometer(androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> carValue) {
        carValue.getClass();
        this.mForces = carValue;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.Accelerometer) {
            return j$.util.Objects.equals(this.mForces, ((androidx.car.app.hardware.info.Accelerometer) obj).mForces);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> getForces() {
        return this.mForces;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mForces);
    }

    public java.lang.String toString() {
        return "[ forces: " + this.mForces + " ]";
    }

    private Accelerometer() {
        this.mForces = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT_LIST;
    }
}
