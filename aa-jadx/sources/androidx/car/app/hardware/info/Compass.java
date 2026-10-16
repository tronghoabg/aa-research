package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class Compass {
    private final androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> mOrientations;

    public Compass(androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> carValue) {
        carValue.getClass();
        this.mOrientations = carValue;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.Compass) {
            return j$.util.Objects.equals(this.mOrientations, ((androidx.car.app.hardware.info.Compass) obj).mOrientations);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Float>> getOrientations() {
        return this.mOrientations;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mOrientations);
    }

    public java.lang.String toString() {
        return "[ orientations: " + this.mOrientations + " ]";
    }

    private Compass() {
        this.mOrientations = androidx.car.app.hardware.common.CarValue.UNKNOWN_FLOAT_LIST;
    }
}
