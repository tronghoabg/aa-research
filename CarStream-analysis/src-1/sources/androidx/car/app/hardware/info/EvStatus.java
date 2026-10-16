package androidx.car.app.hardware.info;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.hardware.common.CarValue;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
@CarProtocol
/* loaded from: classes.dex */
public class EvStatus {
    private final CarValue<Boolean> mEvChargePortConnected;
    private final CarValue<Boolean> mEvChargePortOpen;

    /* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
    public static final class Builder {
        CarValue<Boolean> mEvChargePortConnected;
        CarValue<Boolean> mEvChargePortOpen;

        public Builder() {
            CarValue<Boolean> carValue = CarValue.UNKNOWN_BOOLEAN;
            this.mEvChargePortOpen = carValue;
            this.mEvChargePortConnected = carValue;
        }

        public EvStatus build() {
            return new EvStatus(this);
        }

        public Builder setEvChargePortConnected(CarValue<Boolean> carValue) {
            Objects.requireNonNull(carValue);
            this.mEvChargePortConnected = carValue;
            return this;
        }

        public Builder setEvChargePortOpen(CarValue<Boolean> carValue) {
            Objects.requireNonNull(carValue);
            this.mEvChargePortOpen = carValue;
            return this;
        }
    }

    public EvStatus(Builder builder) {
        this.mEvChargePortConnected = builder.mEvChargePortConnected;
        this.mEvChargePortOpen = builder.mEvChargePortOpen;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvStatus)) {
            return false;
        }
        EvStatus evStatus = (EvStatus) obj;
        return Objects.equals(this.mEvChargePortConnected, evStatus.mEvChargePortConnected) && Objects.equals(this.mEvChargePortOpen, evStatus.mEvChargePortOpen);
    }

    public CarValue<Boolean> getEvChargePortConnected() {
        CarValue<Boolean> carValue = this.mEvChargePortConnected;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public CarValue<Boolean> getEvChargePortOpen() {
        CarValue<Boolean> carValue = this.mEvChargePortOpen;
        Objects.requireNonNull(carValue);
        return carValue;
    }

    public int hashCode() {
        return Objects.hash(this.mEvChargePortOpen, this.mEvChargePortConnected);
    }

    public String toString() {
        return "[ EV charge port open: " + this.mEvChargePortOpen + ", EV charge port connected: " + this.mEvChargePortConnected + "]";
    }

    private EvStatus() {
        CarValue<Boolean> carValue = CarValue.UNKNOWN_BOOLEAN;
        this.mEvChargePortOpen = carValue;
        this.mEvChargePortConnected = carValue;
    }
}
