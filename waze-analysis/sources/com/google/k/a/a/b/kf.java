package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum kf implements com.google.v.eg {
    OCCASION_SEASON(1),
    OCCASION_SEASON_WINTER(257),
    OCCASION_SEASON_SUMMER(DisplayStrings.DS_TRIP_OVERVIEW_DEFAULT_SERVER_ERROR_PRIMARY_BUTTON_TITLE),
    OCCASION_DAYS(2),
    OCCASION_DAYS_SCHOOL(513),
    OCCASION_DAYS_HOLIDAY(DisplayStrings.DS_REPORT_MENU_V2_ALERTER_SUCCESS_FEEDBACK_WITH_TYPE_PS),
    OCCASION_DAYS_PRE_HOLIDAY(DisplayStrings.DS_REPORT_MENU_V2_TRAFFIC_REPORT_TITLE),
    OCCASION_HOURS(3),
    OCCASION_HOURS_PEAK(DisplayStrings.DS_RAW_GPS_IS_ON),
    OCCASION_HOURS_SCHOOL(DisplayStrings.DS_RECALCULATING_ROUTE___),
    OCCASION_HOURS_MARKET(DisplayStrings.DS_REC),
    OCCASION_HOURS_BUSINESS(DisplayStrings.DS_REFRESHING_MAP_TILES),
    OCCASION_HOURS_DUSK_TO_DAWN(DisplayStrings.DS_REGISTER),
    OCCASION_HOURS_HIGH_TIDE(DisplayStrings.DS_REMOVE),
    OCCASION_CONDITIONS(4),
    OCCASION_CONDITIONS_HIGH_WATER(1025),
    OCCASION_CONDITIONS_ADVERSE(1026),
    OCCASION_CONDITIONS_ADVERSE_RAIN(262657),
    OCCASION_CONDITIONS_ADVERSE_WET(262658),
    OCCASION_CONDITIONS_ADVERSE_FOG(262659),
    OCCASION_CONDITIONS_WINTERY(1027),
    OCCASION_CONDITIONS_WINTERY_AVALANCHE(262913),
    OCCASION_CONDITIONS_WINTERY_SNOW(262914),
    OCCASION_CONDITIONS_WINTERY_ICE(262915),
    OCCASION_CONDITIONS_EVENT(1028),
    OCCASION_CONDITIONS_POLLUTION(1029),
    OCCASION_CONDITIONS_LOW_WATER(1030),
    OCCASION_UNDEFINED(5),
    OCCASION_UNDEFINED_REGULAR(DisplayStrings.DS_LOCATION_PREVIEW_PERMANENTLY_CLOSED),
    OCCASION_UNDEFINED_SELDOM(DisplayStrings.DS_LOCATION_PREVIEW_24_HOURS);

    private final int F;

    kf(int i2) {
        this.F = i2;
    }

    public static kf a(int i2) {
        if (i2 == 1) {
            return OCCASION_SEASON;
        }
        if (i2 == 2) {
            return OCCASION_DAYS;
        }
        if (i2 == 3) {
            return OCCASION_HOURS;
        }
        if (i2 == 4) {
            return OCCASION_CONDITIONS;
        }
        if (i2 == 5) {
            return OCCASION_UNDEFINED;
        }
        if (i2 == 257) {
            return OCCASION_SEASON_WINTER;
        }
        if (i2 == 258) {
            return OCCASION_SEASON_SUMMER;
        }
        if (i2 == 1281) {
            return OCCASION_UNDEFINED_REGULAR;
        }
        if (i2 == 1282) {
            return OCCASION_UNDEFINED_SELDOM;
        }
        switch (i2) {
            case 513:
                return OCCASION_DAYS_SCHOOL;
            case DisplayStrings.DS_REPORT_MENU_V2_ALERTER_SUCCESS_FEEDBACK_WITH_TYPE_PS /* 514 */:
                return OCCASION_DAYS_HOLIDAY;
            case DisplayStrings.DS_REPORT_MENU_V2_TRAFFIC_REPORT_TITLE /* 515 */:
                return OCCASION_DAYS_PRE_HOLIDAY;
            default:
                switch (i2) {
                    case DisplayStrings.DS_RAW_GPS_IS_ON /* 769 */:
                        return OCCASION_HOURS_PEAK;
                    case DisplayStrings.DS_RECALCULATING_ROUTE___ /* 770 */:
                        return OCCASION_HOURS_SCHOOL;
                    case DisplayStrings.DS_REC /* 771 */:
                        return OCCASION_HOURS_MARKET;
                    case DisplayStrings.DS_REFRESHING_MAP_TILES /* 772 */:
                        return OCCASION_HOURS_BUSINESS;
                    case DisplayStrings.DS_REGISTER /* 773 */:
                        return OCCASION_HOURS_DUSK_TO_DAWN;
                    case DisplayStrings.DS_REMOVE /* 774 */:
                        return OCCASION_HOURS_HIGH_TIDE;
                    default:
                        switch (i2) {
                            case 1025:
                                return OCCASION_CONDITIONS_HIGH_WATER;
                            case 1026:
                                return OCCASION_CONDITIONS_ADVERSE;
                            case 1027:
                                return OCCASION_CONDITIONS_WINTERY;
                            case 1028:
                                return OCCASION_CONDITIONS_EVENT;
                            case 1029:
                                return OCCASION_CONDITIONS_POLLUTION;
                            case 1030:
                                return OCCASION_CONDITIONS_LOW_WATER;
                            default:
                                switch (i2) {
                                    case 262657:
                                        return OCCASION_CONDITIONS_ADVERSE_RAIN;
                                    case 262658:
                                        return OCCASION_CONDITIONS_ADVERSE_WET;
                                    case 262659:
                                        return OCCASION_CONDITIONS_ADVERSE_FOG;
                                    default:
                                        switch (i2) {
                                            case 262913:
                                                return OCCASION_CONDITIONS_WINTERY_AVALANCHE;
                                            case 262914:
                                                return OCCASION_CONDITIONS_WINTERY_SNOW;
                                            case 262915:
                                                return OCCASION_CONDITIONS_WINTERY_ICE;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.F;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.F);
    }
}
