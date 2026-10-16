package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ga implements com.google.v.eg {
    RELATION_OVERLAPS(1),
    RELATION_CONTAINED_BY(17),
    RELATION_EQUAL_TO(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS),
    RELATION_POLITICAL_DEPRECATED(2),
    RELATION_CAPITAL_OF(3),
    RELATION_DISAMBIGUATED_BY(4),
    RELATION_NEIGHBOR_OF(65),
    RELATION_OPPOSITE_TO(DisplayStrings.DS_LOG_OUT_QUESTION),
    RELATION_NEXT_TO(DisplayStrings.DS_CONFIRM_LOG_OUT_UNVERIFIED_EMAIL_TEXT),
    RELATION_RIGHT_OF(16673),
    RELATION_LEFT_OF(16674),
    RELATION_BEHIND(DisplayStrings.DS_CONFIRM_CREATE_ACCOUNT_BUTTON),
    RELATION_IN_FRONT_OF(DisplayStrings.DS_CONFIRM_LOG_OUT_ANYWAY_BUTTON),
    RELATION_SAME_BUILDING(66),
    RELATION_ABOVE(DisplayStrings.DS_YOU_CANT_USE_THIS_USERNAME),
    RELATION_BELOW(DisplayStrings.DS_ENTER_USERNAME_OR_PHONE_NUMBER_FIRST),
    RELATION_NEAR(67),
    RELATION_ORGANIZATIONALLY_PART_OF(6),
    RELATION_DEPARTMENT_OF(97),
    RELATION_WORKS_AT(99),
    RELATION_INDEPENDENT_ESTABLISHMENT_IN(100),
    RELATION_ON_LEVEL(7),
    RELATION_OCCUPIES(8),
    RELATION_BUSINESS_LIFE_CYCLE(9),
    RELATION_BUSINESS_MOVED(145),
    RELATION_BUSINESS_REBRANDED(146),
    RELATION_MEMBER_OF_CHAIN(10),
    RELATION_AUTHORIZED_DEALER_FOR_CHAIN(161),
    RELATION_SUBSIDIARY_OF(11),
    RELATION_PRIMARILY_OCCUPIED_BY(12),
    RELATION_VARIATION(13),
    RELATION_HAS_VARIANT(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_8),
    RELATION_VARIANT_OF(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_1),
    RELATION_VARIANT_SIBLING(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_2),
    RELATION_CLIENT_DEFINED(15);

    private final int K;

    ga(int i2) {
        this.K = i2;
    }

    public static ga a(int i2) {
        if (i2 == 1) {
            return RELATION_OVERLAPS;
        }
        if (i2 == 2) {
            return RELATION_POLITICAL_DEPRECATED;
        }
        if (i2 == 3) {
            return RELATION_CAPITAL_OF;
        }
        if (i2 == 4) {
            return RELATION_DISAMBIGUATED_BY;
        }
        if (i2 == 15) {
            return RELATION_CLIENT_DEFINED;
        }
        if (i2 == 17) {
            return RELATION_CONTAINED_BY;
        }
        if (i2 == 97) {
            return RELATION_DEPARTMENT_OF;
        }
        if (i2 == 161) {
            return RELATION_AUTHORIZED_DEALER_FOR_CHAIN;
        }
        if (i2 == 273) {
            return RELATION_EQUAL_TO;
        }
        if (i2 == 99) {
            return RELATION_WORKS_AT;
        }
        if (i2 == 100) {
            return RELATION_INDEPENDENT_ESTABLISHMENT_IN;
        }
        if (i2 == 145) {
            return RELATION_BUSINESS_MOVED;
        }
        if (i2 == 146) {
            return RELATION_BUSINESS_REBRANDED;
        }
        if (i2 == 1057) {
            return RELATION_ABOVE;
        }
        if (i2 == 1058) {
            return RELATION_BELOW;
        }
        if (i2 == 16673) {
            return RELATION_RIGHT_OF;
        }
        if (i2 == 16674) {
            return RELATION_LEFT_OF;
        }
        switch (i2) {
            case 6:
                return RELATION_ORGANIZATIONALLY_PART_OF;
            case 7:
                return RELATION_ON_LEVEL;
            case 8:
                return RELATION_OCCUPIES;
            case 9:
                return RELATION_BUSINESS_LIFE_CYCLE;
            case 10:
                return RELATION_MEMBER_OF_CHAIN;
            case 11:
                return RELATION_SUBSIDIARY_OF;
            case 12:
                return RELATION_PRIMARILY_OCCUPIED_BY;
            case 13:
                return RELATION_VARIATION;
            default:
                switch (i2) {
                    case 65:
                        return RELATION_NEIGHBOR_OF;
                    case 66:
                        return RELATION_SAME_BUILDING;
                    case 67:
                        return RELATION_NEAR;
                    default:
                        switch (i2) {
                            case DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_8 /* 209 */:
                                return RELATION_HAS_VARIANT;
                            case DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_1 /* 210 */:
                                return RELATION_VARIANT_OF;
                            case DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_2 /* 211 */:
                                return RELATION_VARIANT_SIBLING;
                            default:
                                switch (i2) {
                                    case DisplayStrings.DS_LOG_OUT_QUESTION /* 1041 */:
                                        return RELATION_OPPOSITE_TO;
                                    case DisplayStrings.DS_CONFIRM_LOG_OUT_UNVERIFIED_EMAIL_TEXT /* 1042 */:
                                        return RELATION_NEXT_TO;
                                    case DisplayStrings.DS_CONFIRM_CREATE_ACCOUNT_BUTTON /* 1043 */:
                                        return RELATION_BEHIND;
                                    case DisplayStrings.DS_CONFIRM_LOG_OUT_ANYWAY_BUTTON /* 1044 */:
                                        return RELATION_IN_FRONT_OF;
                                    default:
                                        return null;
                                }
                        }
                }
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
