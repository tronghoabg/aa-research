package l.a;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public enum ayn implements com.google.v.eg {
    CATEGORY_UNSPECIFIED(0),
    CATEGORY_SAVED_PLACES(1),
    CATEGORY_DRIVE_THRU(2),
    CATEGORY_PARKING(3),
    CATEGORY_GAS_STATION(4),
    CATEGORY_FOOD(5),
    CATEGORY_MORE(6),
    CATEGORY_COFFEE(7),
    CATEGORY_SHOPPING(8),
    CATEGORY_PHARMACIES(9),
    CATEGORY_GROCERY_STORES(10),
    CATEGORY_CHARGING_STATION(11),
    CATEGORY_HOSPITAL_AND_MEDICAL_CARE(12),
    CATEGORY_HOTELS_AND_LODGING(13),
    CATEGORY_OUTDOOR_PARKS(14),
    CATEGORY_CRISIS_LOCATION(15),
    UNRECOGNIZED(-1);

    private final int s;

    ayn(int i2) {
        this.s = i2;
    }

    public static ayn a(int i2) {
        switch (i2) {
            case 0:
                return CATEGORY_UNSPECIFIED;
            case 1:
                return CATEGORY_SAVED_PLACES;
            case 2:
                return CATEGORY_DRIVE_THRU;
            case 3:
                return CATEGORY_PARKING;
            case 4:
                return CATEGORY_GAS_STATION;
            case 5:
                return CATEGORY_FOOD;
            case 6:
                return CATEGORY_MORE;
            case 7:
                return CATEGORY_COFFEE;
            case 8:
                return CATEGORY_SHOPPING;
            case 9:
                return CATEGORY_PHARMACIES;
            case 10:
                return CATEGORY_GROCERY_STORES;
            case 11:
                return CATEGORY_CHARGING_STATION;
            case 12:
                return CATEGORY_HOSPITAL_AND_MEDICAL_CARE;
            case 13:
                return CATEGORY_HOTELS_AND_LODGING;
            case 14:
                return CATEGORY_OUTDOOR_PARKS;
            case 15:
                return CATEGORY_CRISIS_LOCATION;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? com.google.v.ep.b() : this.s;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }
}
