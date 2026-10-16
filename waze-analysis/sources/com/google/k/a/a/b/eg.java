package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum eg implements com.google.v.eg {
    FLAG_ANY(0),
    FLAG_IN_LOCAL_LANGUAGE(1),
    FLAG_PREFERRED(2),
    FLAG_OFFICIAL(3),
    FLAG_OBSCURE(4),
    FLAG_ON_SIGNS(5),
    FLAG_EXIT_NAME_NUMBER(81),
    FLAG_EXIT_NAME(DisplayStrings.DS_LOCATION_PREVIEW_HOME_SET_GO_BUTTON),
    FLAG_INTERCHANGE_NAME(20753),
    FLAG_EXIT_NUMBER(DisplayStrings.DS_LOCATION_PREVIEW_WORK_SET_BUTTON),
    FLAG_INTERCHANGE_NUMBER(20769),
    FLAG_TRANSIT_HEADSIGN(82),
    FLAG_CONNECTS_DIRECTLY(83),
    FLAG_CONNECTS_INDIRECTLY(84),
    FLAG_INTERSECTION_NAME(85),
    FLAG_VANITY(6),
    FLAG_ROUTE_NUMBER(7),
    FLAG_COUNTRY_CODE_2(129),
    FLAG_ABBREVIATED(9),
    FLAG_ID(10),
    FLAG_DESIGNATED_MARKET_AREA_ID(161),
    FLAG_IATA_ID(163),
    FLAG_ICAO_ID(164),
    FLAG_ISO_3166_2(165),
    FLAG_COUNTRY_SPECIFIC_ID(166),
    FLAG_LANGUAGE_CODE(167),
    FLAG_TIMEZONE_ID(168),
    FLAG_PHONE_NUMBER_PREFIX(169),
    FLAG_PHONE_NUMBER_AREA_CODE(2705),
    FLAG_TRANSLITERATED(11),
    FLAG_NOT_ON_SIGNS(12),
    FLAG_NOT_IN_LOCAL_LANGUAGE(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_8),
    FLAG_ROUNDABOUT_ROUTE(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_2),
    FLAG_NEVER_DISPLAY(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_3),
    FLAG_BICYCLE_ROUTE(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_4),
    FLAG_MACHINE_GENERATED(215),
    FLAG_SUSPICIOUS(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_7),
    FLAG_TRADITIONAL(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_8);

    private final int N;

    eg(int i2) {
        this.N = i2;
    }

    public static eg a(int i2) {
        if (i2 == 129) {
            return FLAG_COUNTRY_CODE_2;
        }
        if (i2 == 161) {
            return FLAG_DESIGNATED_MARKET_AREA_ID;
        }
        if (i2 == 209) {
            return FLAG_NOT_IN_LOCAL_LANGUAGE;
        }
        if (i2 == 2705) {
            return FLAG_PHONE_NUMBER_AREA_CODE;
        }
        if (i2 == 20753) {
            return FLAG_INTERCHANGE_NAME;
        }
        if (i2 == 20769) {
            return FLAG_INTERCHANGE_NUMBER;
        }
        if (i2 == 1297) {
            return FLAG_EXIT_NAME;
        }
        if (i2 == 1298) {
            return FLAG_EXIT_NUMBER;
        }
        switch (i2) {
            case 0:
                return FLAG_ANY;
            case 1:
                return FLAG_IN_LOCAL_LANGUAGE;
            case 2:
                return FLAG_PREFERRED;
            case 3:
                return FLAG_OFFICIAL;
            case 4:
                return FLAG_OBSCURE;
            case 5:
                return FLAG_ON_SIGNS;
            case 6:
                return FLAG_VANITY;
            case 7:
                return FLAG_ROUTE_NUMBER;
            default:
                switch (i2) {
                    case 9:
                        return FLAG_ABBREVIATED;
                    case 10:
                        return FLAG_ID;
                    case 11:
                        return FLAG_TRANSLITERATED;
                    case 12:
                        return FLAG_NOT_ON_SIGNS;
                    default:
                        switch (i2) {
                            case 81:
                                return FLAG_EXIT_NAME_NUMBER;
                            case 82:
                                return FLAG_TRANSIT_HEADSIGN;
                            case 83:
                                return FLAG_CONNECTS_DIRECTLY;
                            case 84:
                                return FLAG_CONNECTS_INDIRECTLY;
                            case 85:
                                return FLAG_INTERSECTION_NAME;
                            default:
                                switch (i2) {
                                    case 163:
                                        return FLAG_IATA_ID;
                                    case 164:
                                        return FLAG_ICAO_ID;
                                    case 165:
                                        return FLAG_ISO_3166_2;
                                    case 166:
                                        return FLAG_COUNTRY_SPECIFIC_ID;
                                    case 167:
                                        return FLAG_LANGUAGE_CODE;
                                    case 168:
                                        return FLAG_TIMEZONE_ID;
                                    case 169:
                                        return FLAG_PHONE_NUMBER_PREFIX;
                                    default:
                                        switch (i2) {
                                            case DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_2 /* 211 */:
                                                return FLAG_ROUNDABOUT_ROUTE;
                                            case DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_3 /* 212 */:
                                                return FLAG_NEVER_DISPLAY;
                                            case DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_4 /* 213 */:
                                                return FLAG_BICYCLE_ROUTE;
                                            default:
                                                switch (i2) {
                                                    case 215:
                                                        return FLAG_MACHINE_GENERATED;
                                                    case DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_7 /* 216 */:
                                                        return FLAG_SUSPICIOUS;
                                                    case DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_8 /* 217 */:
                                                        return FLAG_TRADITIONAL;
                                                    default:
                                                        return null;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.N;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.N);
    }
}
