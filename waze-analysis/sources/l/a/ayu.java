package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ayu implements com.google.v.eg {
    FILTER_FIELD_UNSPECIFIED(0),
    FILTER_FIELD_OPEN_NOW(1),
    FILTER_FIELD_TOP_RATED(2),
    FILTER_FIELD_WHEELCHAIR_ACCESSIBLE(3),
    FILTER_FIELD_DISABILITY_PARKING(4),
    FILTER_FIELD_RESTROOMS(5),
    FILTER_FIELD_PARKING_FOR_CUSTOMERS(6),
    FILTER_FIELD_EV_CHARGING_STATION(7),
    FILTER_FIELD_PRICE_RANGE(8),
    FILTER_FIELD_EV_PLUG_TYPE(9),
    FILTER_FIELD_FAST_CHARGE(10),
    FILTER_FIELD_NETWORK_TYPE(11),
    FILTER_FIELD_ATTENDANT(12),
    FILTER_FIELD_SECURITY(13),
    FILTER_FIELD_BRAND(14),
    FILTER_FIELD_GAS_PRODUCT(15),
    FILTER_FIELD_DRIVE_THRU(16),
    FILTER_FIELD_MORE(17),
    FILTER_FIELD_EV_PUBLIC_ACCESS(18),
    UNRECOGNIZED(-1);

    private final int v;

    ayu(int i2) {
        this.v = i2;
    }

    public static ayu a(int i2) {
        switch (i2) {
            case 0:
                return FILTER_FIELD_UNSPECIFIED;
            case 1:
                return FILTER_FIELD_OPEN_NOW;
            case 2:
                return FILTER_FIELD_TOP_RATED;
            case 3:
                return FILTER_FIELD_WHEELCHAIR_ACCESSIBLE;
            case 4:
                return FILTER_FIELD_DISABILITY_PARKING;
            case 5:
                return FILTER_FIELD_RESTROOMS;
            case 6:
                return FILTER_FIELD_PARKING_FOR_CUSTOMERS;
            case 7:
                return FILTER_FIELD_EV_CHARGING_STATION;
            case 8:
                return FILTER_FIELD_PRICE_RANGE;
            case 9:
                return FILTER_FIELD_EV_PLUG_TYPE;
            case 10:
                return FILTER_FIELD_FAST_CHARGE;
            case 11:
                return FILTER_FIELD_NETWORK_TYPE;
            case 12:
                return FILTER_FIELD_ATTENDANT;
            case 13:
                return FILTER_FIELD_SECURITY;
            case 14:
                return FILTER_FIELD_BRAND;
            case 15:
                return FILTER_FIELD_GAS_PRODUCT;
            case 16:
                return FILTER_FIELD_DRIVE_THRU;
            case 17:
                return FILTER_FIELD_MORE;
            case 18:
                return FILTER_FIELD_EV_PUBLIC_ACCESS;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.v;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.v);
    }
}
