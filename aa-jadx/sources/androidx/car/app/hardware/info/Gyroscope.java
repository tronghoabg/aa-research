package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Gyroscope {
    private final androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> mRotations;

    public Gyroscope(androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> carValue) {
        carValue.getClass();
        this.mRotations = carValue;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.Gyroscope) {
            return j$.util.Objects.equals(this.mRotations, ((androidx.car.app.hardware.info.Gyroscope) obj).mRotations);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> getRotations() {
        return this.mRotations;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mRotations);
    }

    public java.lang.String toString() {
        return "[ rotations: " + this.mRotations + " ]";
    }

    private Gyroscope() {
        this.mRotations = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT_LIST;
    }
}
