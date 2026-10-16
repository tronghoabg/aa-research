package i.b.v;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public enum gn implements com.google.v.eg {
    BABY_WAZER(1),
    INVALID_CHANGE(2),
    INACCURATE_HOUSE_NUMBER(3),
    MISSING_CATEGORIES_FIELD(4),
    INVALID_CATEGORY(5),
    MISSING_LOCATION_OR_POLYGON(6),
    INTERNAL_ERROR(7),
    LOCATION_NOT_IN_COUNTRY(8),
    INVALID_URL(9),
    INVALID_ENTRY_EXIT_POINT(10),
    INVALID_OPEN_HOURS(11),
    INVALID_SERVICE(12),
    INVALID_IMAGE(13),
    INVALID_IMAGE_MISSING_CREATOR_ID(14),
    INVALID_IMAGE_MISSING_DATE(15),
    INVALID_IMAGE_MISSING_LOCATION(16),
    INVALID_PHONE(17),
    MISSING_HOUSE_NUMBER(18),
    INVALID_OPEN_HOURS_SAME_FROM_AND_TO(19),
    INVALID_OPEN_HOURS_OVERLAP(20),
    CANNOT_TURN_RESIDENTIAL_TO_NON_RESIDENTIAL(21),
    NON_POLYGON_VENUE_CANNOT_HAVE_ENTRY_EXIT_POINTS(22),
    CANNOT_TURN_PARKING_LOT_TO_NON_PARKING_LOT(23),
    CANNOT_TURN_NON_PARKING_LOT_TO_PARKING_LOT(24),
    INVALID_PARKING_LOT_GEOMETRY(25),
    PARKING_LOT_WITH_OTHER_CATEGORIES(26),
    MULTIPLE_PRIMARY_ENTRY_EXIT_POINTS(27),
    ENTRY_EXIT_POINTS_SAME_NAME(28),
    RESIDENTIAL_WITH_NON_POINT_GEOMETRY(29),
    CONCURRENT_VENUE_MODIFICATION(30),
    DUPLICATE_VENUE(31),
    CANNOT_CONVERT_PL_WITH_UNSUPPORTED_SERVICES(32),
    INVALID_LOCATION(33),
    INVALID_POLYGON(34),
    CONTAINS_UNSCANNED_IMAGES(35);

    private final int K;

    gn(int i2) {
        this.K = i2;
    }

    public static gn a(int i2) {
        switch (i2) {
            case 1:
                return BABY_WAZER;
            case 2:
                return INVALID_CHANGE;
            case 3:
                return INACCURATE_HOUSE_NUMBER;
            case 4:
                return MISSING_CATEGORIES_FIELD;
            case 5:
                return INVALID_CATEGORY;
            case 6:
                return MISSING_LOCATION_OR_POLYGON;
            case 7:
                return INTERNAL_ERROR;
            case 8:
                return LOCATION_NOT_IN_COUNTRY;
            case 9:
                return INVALID_URL;
            case 10:
                return INVALID_ENTRY_EXIT_POINT;
            case 11:
                return INVALID_OPEN_HOURS;
            case 12:
                return INVALID_SERVICE;
            case 13:
                return INVALID_IMAGE;
            case 14:
                return INVALID_IMAGE_MISSING_CREATOR_ID;
            case 15:
                return INVALID_IMAGE_MISSING_DATE;
            case 16:
                return INVALID_IMAGE_MISSING_LOCATION;
            case 17:
                return INVALID_PHONE;
            case 18:
                return MISSING_HOUSE_NUMBER;
            case 19:
                return INVALID_OPEN_HOURS_SAME_FROM_AND_TO;
            case 20:
                return INVALID_OPEN_HOURS_OVERLAP;
            case 21:
                return CANNOT_TURN_RESIDENTIAL_TO_NON_RESIDENTIAL;
            case 22:
                return NON_POLYGON_VENUE_CANNOT_HAVE_ENTRY_EXIT_POINTS;
            case 23:
                return CANNOT_TURN_PARKING_LOT_TO_NON_PARKING_LOT;
            case 24:
                return CANNOT_TURN_NON_PARKING_LOT_TO_PARKING_LOT;
            case 25:
                return INVALID_PARKING_LOT_GEOMETRY;
            case 26:
                return PARKING_LOT_WITH_OTHER_CATEGORIES;
            case 27:
                return MULTIPLE_PRIMARY_ENTRY_EXIT_POINTS;
            case 28:
                return ENTRY_EXIT_POINTS_SAME_NAME;
            case 29:
                return RESIDENTIAL_WITH_NON_POINT_GEOMETRY;
            case 30:
                return CONCURRENT_VENUE_MODIFICATION;
            case 31:
                return DUPLICATE_VENUE;
            case 32:
                return CANNOT_CONVERT_PL_WITH_UNSUPPORTED_SERVICES;
            case 33:
                return INVALID_LOCATION;
            case 34:
                return INVALID_POLYGON;
            case 35:
                return CONTAINS_UNSCANNED_IMAGES;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.K;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.K);
    }
}
