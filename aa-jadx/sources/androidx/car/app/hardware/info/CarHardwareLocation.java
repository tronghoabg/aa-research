package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class CarHardwareLocation {
    public static final androidx.car.app.hardware.common.CarValue<android.location.Location> UNIMPLEMENTED_LOCATION = new androidx.car.app.hardware.common.CarValue<>(null, 0, 2);
    public static final androidx.car.app.hardware.common.CarValue<android.location.Location> UNKNOWN_LOCATION = new androidx.car.app.hardware.common.CarValue<>(null, 0, 0);
    private final androidx.car.app.hardware.common.CarValue<android.location.Location> mLocation;

    public CarHardwareLocation(androidx.car.app.hardware.common.CarValue<android.location.Location> carValue) {
        carValue.getClass();
        this.mLocation = carValue;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.hardware.info.CarHardwareLocation) {
            return j$.util.Objects.equals(this.mLocation, ((androidx.car.app.hardware.info.CarHardwareLocation) obj).mLocation);
        }
        return false;
    }

    public androidx.car.app.hardware.common.CarValue<android.location.Location> getLocation() {
        return this.mLocation;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mLocation);
    }

    public java.lang.String toString() {
        return "[ location: " + this.mLocation + " ]";
    }

    private CarHardwareLocation() {
        this.mLocation = UNKNOWN_LOCATION;
    }
}
