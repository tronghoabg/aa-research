package androidx.car.app.hardware.info;

import androidx.car.app.annotations.CarProtocol;
import androidx.car.app.annotations.RequiresCarApi;
import androidx.car.app.hardware.common.CarValue;
import j$.util.Objects;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* compiled from: WazeSource */
@CarProtocol
@RequiresCarApi(3)
/* loaded from: classes2.dex */
public final class EnergyProfile {
    public static final int EVCONNECTOR_TYPE_CHADEMO = 3;
    public static final int EVCONNECTOR_TYPE_COMBO_1 = 4;
    public static final int EVCONNECTOR_TYPE_COMBO_2 = 5;
    public static final int EVCONNECTOR_TYPE_GBT = 9;
    public static final int EVCONNECTOR_TYPE_GBT_DC = 10;
    public static final int EVCONNECTOR_TYPE_J1772 = 1;
    public static final int EVCONNECTOR_TYPE_MENNEKES = 2;
    public static final int EVCONNECTOR_TYPE_OTHER = 101;
    public static final int EVCONNECTOR_TYPE_SCAME = 11;
    public static final int EVCONNECTOR_TYPE_TESLA_HPWC = 7;
    public static final int EVCONNECTOR_TYPE_TESLA_ROADSTER = 6;
    public static final int EVCONNECTOR_TYPE_TESLA_SUPERCHARGER = 8;
    public static final int EVCONNECTOR_TYPE_UNKNOWN = 0;
    public static final int FUEL_TYPE_BIODIESEL = 5;
    public static final int FUEL_TYPE_CNG = 8;
    public static final int FUEL_TYPE_DIESEL_1 = 3;
    public static final int FUEL_TYPE_DIESEL_2 = 4;
    public static final int FUEL_TYPE_E85 = 6;
    public static final int FUEL_TYPE_ELECTRIC = 10;
    public static final int FUEL_TYPE_HYDROGEN = 11;
    public static final int FUEL_TYPE_LEADED = 2;
    public static final int FUEL_TYPE_LNG = 9;
    public static final int FUEL_TYPE_LPG = 7;
    public static final int FUEL_TYPE_OTHER = 12;
    public static final int FUEL_TYPE_UNKNOWN = 0;
    public static final int FUEL_TYPE_UNLEADED = 1;
    private final CarValue<List<Integer>> mEvConnectorTypes;
    private final CarValue<List<Integer>> mFuelTypes;

    /* compiled from: WazeSource */
    public final class Builder {
        CarValue<List<Integer>> mEvConnectorTypes;
        CarValue<List<Integer>> mFuelTypes;

        public Builder() {
            CarValue<List<Integer>> carValue = CarValue.UNKNOWN_INTEGER_LIST;
            this.mEvConnectorTypes = carValue;
            this.mFuelTypes = carValue;
        }

        public EnergyProfile build() {
            return new EnergyProfile(this);
        }

        public Builder setEvConnectorTypes(CarValue<List<Integer>> carValue) {
            this.mEvConnectorTypes = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }

        public Builder setFuelTypes(CarValue<List<Integer>> carValue) {
            this.mFuelTypes = (CarValue) Objects.requireNonNull(carValue);
            return this;
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EvConnectorType {
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FuelType {
    }

    EnergyProfile(Builder builder) {
        this.mEvConnectorTypes = (CarValue) Objects.requireNonNull(builder.mEvConnectorTypes);
        this.mFuelTypes = (CarValue) Objects.requireNonNull(builder.mFuelTypes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnergyProfile)) {
            return false;
        }
        EnergyProfile energyProfile = (EnergyProfile) obj;
        return Objects.equals(this.mEvConnectorTypes, energyProfile.mEvConnectorTypes) && Objects.equals(this.mFuelTypes, energyProfile.mFuelTypes);
    }

    public CarValue<List<Integer>> getEvConnectorTypes() {
        return (CarValue) Objects.requireNonNull(this.mEvConnectorTypes);
    }

    public CarValue<List<Integer>> getFuelTypes() {
        return (CarValue) Objects.requireNonNull(this.mFuelTypes);
    }

    public int hashCode() {
        return Objects.hash(this.mEvConnectorTypes, this.mFuelTypes);
    }

    public String toString() {
        return "[ evConnectorTypes: " + this.mEvConnectorTypes + ", fuelTypes: " + this.mFuelTypes + "]";
    }

    private EnergyProfile() {
        CarValue<List<Integer>> carValue = CarValue.UNKNOWN_INTEGER_LIST;
        this.mEvConnectorTypes = carValue;
        this.mFuelTypes = carValue;
    }
}
