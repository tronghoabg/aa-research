package defpackage;

/* loaded from: classes3.dex */
public enum aauq implements abnz {
    UNKNOWN_MAP_FACTS_TYPE(0),
    POSTAL_CODE(1),
    ADMINISTRATIVE_AREA1(2),
    ADMINISTRATIVE_AREA2(3),
    COUNTRY(4),
    LOCALITY(5),
    DEPRECATED_NEIGHBORHOOD(6),
    DEPRECATED_SCHOOL_DISTRICT(7),
    ROAD(8),
    INTERSECTION(9),
    DEPRECATED_CLICKABLE_MAPS_ROAD(10),
    DEPRECATED_ADMINISTRATIVE_AREA3(11),
    DEPRECATED_ADMINISTRATIVE_AREA4(12),
    DEPRECATED_SUBLOCALITY_LEVEL_1(13),
    POSTAL_CODE_PREFIX(14),
    ROAD_PILOT(15),
    BUILDING(16),
    SCHOOL_DISTRICT_V2(17),
    NEIGHBORHOOD_PILOT(18),
    LOGGING_ONLY_DATASET(19);

    public final int u;

    aauq(int i) {
        this.u = i;
    }

    public static aauq b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MAP_FACTS_TYPE;
            case 1:
                return POSTAL_CODE;
            case 2:
                return ADMINISTRATIVE_AREA1;
            case 3:
                return ADMINISTRATIVE_AREA2;
            case 4:
                return COUNTRY;
            case 5:
                return LOCALITY;
            case 6:
                return DEPRECATED_NEIGHBORHOOD;
            case 7:
                return DEPRECATED_SCHOOL_DISTRICT;
            case 8:
                return ROAD;
            case 9:
                return INTERSECTION;
            case 10:
                return DEPRECATED_CLICKABLE_MAPS_ROAD;
            case 11:
                return DEPRECATED_ADMINISTRATIVE_AREA3;
            case 12:
                return DEPRECATED_ADMINISTRATIVE_AREA4;
            case 13:
                return DEPRECATED_SUBLOCALITY_LEVEL_1;
            case 14:
                return POSTAL_CODE_PREFIX;
            case 15:
                return ROAD_PILOT;
            case 16:
                return BUILDING;
            case 17:
                return SCHOOL_DISTRICT_V2;
            case 18:
                return NEIGHBORHOOD_PILOT;
            case 19:
                return LOGGING_ONLY_DATASET;
            default:
                return null;
        }
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.u);
    }
}
