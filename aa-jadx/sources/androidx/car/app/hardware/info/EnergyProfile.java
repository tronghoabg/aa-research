package androidx.car.app.hardware.info;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
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
    private final androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Integer>> mEvConnectorTypes;
    private final androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Integer>> mFuelTypes;

    public EnergyProfile(defpackage.sd sdVar) {
        java.lang.Object obj = sdVar.a;
        obj.getClass();
        this.mEvConnectorTypes = (androidx.car.app.hardware.common.CarValue) obj;
        java.lang.Object obj2 = sdVar.b;
        obj2.getClass();
        this.mFuelTypes = (androidx.car.app.hardware.common.CarValue) obj2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.car.app.hardware.info.EnergyProfile)) {
            return false;
        }
        androidx.car.app.hardware.info.EnergyProfile energyProfile = (androidx.car.app.hardware.info.EnergyProfile) obj;
        return j$.util.Objects.equals(this.mEvConnectorTypes, energyProfile.mEvConnectorTypes) && j$.util.Objects.equals(this.mFuelTypes, energyProfile.mFuelTypes);
    }

    public androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Integer>> getEvConnectorTypes() {
        androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Integer>> carValue = this.mEvConnectorTypes;
        carValue.getClass();
        return carValue;
    }

    public androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Integer>> getFuelTypes() {
        androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Integer>> carValue = this.mFuelTypes;
        carValue.getClass();
        return carValue;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.mEvConnectorTypes, this.mFuelTypes);
    }

    public java.lang.String toString() {
        return "[ evConnectorTypes: " + this.mEvConnectorTypes + ", fuelTypes: " + this.mFuelTypes + "]";
    }

    private EnergyProfile() {
        androidx.car.app.hardware.common.CarValue<java.util.List<java.lang.Integer>> carValue = androidx.car.app.hardware.common.CarValue.UNKNOWN_INTEGER_LIST;
        this.mEvConnectorTypes = carValue;
        this.mFuelTypes = carValue;
    }
}
