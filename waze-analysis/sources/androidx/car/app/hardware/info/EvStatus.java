package androidx.car.app.hardware.info;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public class EvStatus {
    private final CarValue<Boolean> mEvChargePortConnected;
    private final CarValue<Boolean> mEvChargePortOpen;

    /* compiled from: WazeSource */
    public final class Builder {
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
            this.mEvChargePortConnected = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setEvChargePortOpen(CarValue<Boolean> carValue) {
            this.mEvChargePortOpen = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }
    }

    EvStatus(Builder builder) {
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
        return (CarValue) Objects.requireNonNull(this.mEvChargePortConnected);
    }

    public CarValue<Boolean> getEvChargePortOpen() {
        return (CarValue) Objects.requireNonNull(this.mEvChargePortOpen);
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
