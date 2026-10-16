package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public class EvStatus {
    private final androidx.car.app.hardware.common.CarValue<java.lang.Boolean> mEvChargePortConnected;
    private final androidx.car.app.hardware.common.CarValue<java.lang.Boolean> mEvChargePortOpen;

    public EvStatus(defpackage.se seVar) {
        this.mEvChargePortConnected = (androidx.car.app.hardware.common.CarValue) seVar.b;
        this.mEvChargePortOpen = (androidx.car.app.hardware.common.CarValue) seVar.a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.hardware.info.EvStatus)) {
            return false;
        }
        androidx.car.app.hardware.info.EvStatus evStatus = (androidx.car.app.hardware.info.EvStatus) obj;
        return j$.util.Objects.equals(this.mEvChargePortConnected, evStatus.mEvChargePortConnected) && j$.util.Objects.equals(this.mEvChargePortOpen, evStatus.mEvChargePortOpen);
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Boolean> getEvChargePortConnected() {
        androidx.car.app.hardware.common.CarValue<java.lang.Boolean> carValue = this.mEvChargePortConnected;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.lang.Boolean> getEvChargePortOpen() {
        androidx.car.app.hardware.common.CarValue<java.lang.Boolean> carValue = this.mEvChargePortOpen;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mEvChargePortOpen, this.mEvChargePortConnected);
    }

    public java.lang.String toString() {
        return "[ EV charge port open: " + this.mEvChargePortOpen + ", EV charge port connected: " + this.mEvChargePortConnected + "]";
    }

    private EvStatus() {
        androidx.car.app.hardware.common.CarValue<java.lang.Boolean> carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_BOOLEAN;
        this.mEvChargePortOpen = carValue;
        this.mEvChargePortConnected = carValue;
    }
}
