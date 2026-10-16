package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gp implements com.google.v.eg {
    ROAD_SIGN_SEMANTIC_TYPE_UNSPECIFIED(0),
    PRIORITY(1),
    PRIORITY_STOP(17),
    PRIORITY_STOP_AHEAD(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS),
    PRIORITY_YIELD(18),
    PRIORITY_YIELD_AHEAD(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_TOLLS),
    SPEED_LIMIT(2),
    SPEED_LIMIT_START(33),
    SPEED_LIMIT_START_MAX(DisplayStrings.DS_REPORT_MENU_V2_CRASH_DEFAULT_LABEL),
    SPEED_LIMIT_START_MIN(DisplayStrings.DS_REPORT_MENU_V2_CRASH_PILE_UP_LABEL),
    SPEED_LIMIT_START_SCHOOL(DisplayStrings.DS_REPORT_MENU_V2_CRASH_MAJOR_LABEL),
    SPEED_LIMIT_START_ZONE(DisplayStrings.DS_REPORT_MENU_V2_CRASH_MINOR_LABEL),
    SPEED_LIMIT_START_ADVISORY(DisplayStrings.DS_REPORT_MENU_V2_HAZARD_REPORT_TITLE),
    SPEED_LIMIT_START_AHEAD(DisplayStrings.DS_REPORT_MENU_V2_HAZARD_DEFAULT_LABEL),
    SPEED_LIMIT_END(34),
    SPEED_LIMIT_END_MAX(DisplayStrings.DS_REPORT_MENU_V2_WEATHER_BAD_WEATHER_LABEL),
    SPEED_LIMIT_END_MIN(DisplayStrings.DS_REPORT_MENU_V2_WEATHER_SLIPPERY_ROAD_LABEL),
    SPEED_LIMIT_END_SCHOOL(DisplayStrings.DS_REPORT_MENU_V2_WEATHER_FLOOD_LABEL),
    SPEED_LIMIT_END_ZONE(DisplayStrings.DS_REPORT_MENU_V2_WEATHER_UNPLOWED_ROAD_LABEL),
    RESTRICTION(3),
    RESTRICTION_TURN(49),
    RESTRICTION_TURN_NO_RIGHT(DisplayStrings.DS_SEARCH),
    RESTRICTION_TURN_NO_LEFT(DisplayStrings.DS_SENDING_COMMENT_FAILED),
    RESTRICTION_TURN_NO_U(DisplayStrings.DS_SENDING_MESSAGE_FAILED),
    RESTRICTION_TURN_NO_THRU(DisplayStrings.DS_SENDING_PING_FAILED__PLEASE_TRY_AGAIN_LATER),
    RESTRICTION_MOVEMENT(50),
    RESTRICTION_MOVEMENT_PASSING(801),
    RESTRICTION_ACCESS(51),
    RESTRICTION_ACCESS_NO_ENTRY(DisplayStrings.DS_TRAFFIC_IS_BUILDING_UP_AHEAD_),
    WARNING(4),
    WARNING_CROSSING(65),
    WARNING_CROSSING_CHILDREN(DisplayStrings.DS_CONFIRM_LOG_OUT_UNVERIFIED_EMAIL_TEXT),
    WARNING_CROSSING_PEDESTRIAN(DisplayStrings.DS_CONFIRM_CREATE_ACCOUNT_BUTTON),
    WARNING_CROSSING_RAILROAD(DisplayStrings.DS_CONFIRM_LOG_OUT_ANYWAY_BUTTON),
    WARNING_CROSSING_SCHOOL(DisplayStrings.DS_CONFIRM_LOG_OUT_TEXT),
    WARNING_ROAD_WORK(66),
    INFO(5),
    INFO_BOUNDARY(81),
    INFO_BOUNDARY_BUILT_UP_AREA(DisplayStrings.DS_LOCATION_PREVIEW_HOME_SET_GO_BUTTON),
    INFO_BOUNDARY_BUILT_UP_AREA_START(20753),
    INFO_BOUNDARY_BUILT_UP_AREA_END(20754),
    INFO_BOUNDARY_RESIDENTIAL(DisplayStrings.DS_LOCATION_PREVIEW_WORK_SET_BUTTON),
    INFO_BOUNDARY_RESIDENTIAL_START(20769),
    INFO_BOUNDARY_RESIDENTIAL_END(20770),
    INFO_TRANSIT(82),
    AUXILIARY(6),
    AUXILIARY_ANIMAL(97),
    AUXILIARY_DIRECTION(98),
    AUXILIARY_DISTANCE(99),
    AUXILIARY_TIME(100),
    AUXILIARY_WEATHER(101),
    AUXILIARY_WEIGHT(102),
    AUXILIARY_VEHICLE(103);

    private final int ac;

    gp(int i2) {
        this.ac = i2;
    }

    public static gp a(int i2) {
        if (i2 == 0) {
            return ROAD_SIGN_SEMANTIC_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return PRIORITY;
        }
        if (i2 == 2) {
            return SPEED_LIMIT;
        }
        if (i2 == 3) {
            return RESTRICTION;
        }
        if (i2 == 4) {
            return WARNING;
        }
        if (i2 == 5) {
            return INFO;
        }
        if (i2 != 6) {
            if (i2 == 17) {
                return PRIORITY_STOP;
            }
            if (i2 == 18) {
                return PRIORITY_YIELD;
            }
            if (i2 == 33) {
                return SPEED_LIMIT_START;
            }
            if (i2 == 34) {
                return SPEED_LIMIT_END;
            }
            if (i2 == 65) {
                return WARNING_CROSSING;
            }
            if (i2 == 66) {
                return WARNING_ROAD_WORK;
            }
            if (i2 == 81) {
                return INFO_BOUNDARY;
            }
            if (i2 == 82) {
                return INFO_TRANSIT;
            }
            switch (i2) {
                case 6:
                    break;
                case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS /* 273 */:
                    return PRIORITY_STOP_AHEAD;
                case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_TOLLS /* 289 */:
                    return PRIORITY_YIELD_AHEAD;
                case 801:
                    return RESTRICTION_MOVEMENT_PASSING;
                case DisplayStrings.DS_TRAFFIC_IS_BUILDING_UP_AHEAD_ /* 817 */:
                    return RESTRICTION_ACCESS_NO_ENTRY;
                case DisplayStrings.DS_CONFIRM_LOG_OUT_UNVERIFIED_EMAIL_TEXT /* 1042 */:
                    return WARNING_CROSSING_CHILDREN;
                case DisplayStrings.DS_CONFIRM_CREATE_ACCOUNT_BUTTON /* 1043 */:
                    return WARNING_CROSSING_PEDESTRIAN;
                case DisplayStrings.DS_CONFIRM_LOG_OUT_ANYWAY_BUTTON /* 1044 */:
                    return WARNING_CROSSING_RAILROAD;
                case DisplayStrings.DS_CONFIRM_LOG_OUT_TEXT /* 1045 */:
                    return WARNING_CROSSING_SCHOOL;
                case DisplayStrings.DS_LOCATION_PREVIEW_HOME_SET_GO_BUTTON /* 1297 */:
                    return INFO_BOUNDARY_BUILT_UP_AREA;
                case DisplayStrings.DS_LOCATION_PREVIEW_WORK_SET_BUTTON /* 1298 */:
                    return INFO_BOUNDARY_RESIDENTIAL;
                case 20753:
                    return INFO_BOUNDARY_BUILT_UP_AREA_START;
                case 20754:
                    return INFO_BOUNDARY_BUILT_UP_AREA_END;
                case 20769:
                    return INFO_BOUNDARY_RESIDENTIAL_START;
                case 20770:
                    return INFO_BOUNDARY_RESIDENTIAL_END;
                default:
                    switch (i2) {
                        case 49:
                            return RESTRICTION_TURN;
                        case 50:
                            return RESTRICTION_MOVEMENT;
                        case 51:
                            return RESTRICTION_ACCESS;
                        default:
                            switch (i2) {
                                case 97:
                                    return AUXILIARY_ANIMAL;
                                case 98:
                                    return AUXILIARY_DIRECTION;
                                case 99:
                                    return AUXILIARY_DISTANCE;
                                case 100:
                                    return AUXILIARY_TIME;
                                case 101:
                                    return AUXILIARY_WEATHER;
                                case 102:
                                    return AUXILIARY_WEIGHT;
                                case 103:
                                    return AUXILIARY_VEHICLE;
                                default:
                                    switch (i2) {
                                        case DisplayStrings.DS_REPORT_MENU_V2_CRASH_DEFAULT_LABEL /* 529 */:
                                            return SPEED_LIMIT_START_MAX;
                                        case DisplayStrings.DS_REPORT_MENU_V2_CRASH_PILE_UP_LABEL /* 530 */:
                                            return SPEED_LIMIT_START_MIN;
                                        case DisplayStrings.DS_REPORT_MENU_V2_CRASH_MAJOR_LABEL /* 531 */:
                                            return SPEED_LIMIT_START_SCHOOL;
                                        case DisplayStrings.DS_REPORT_MENU_V2_CRASH_MINOR_LABEL /* 532 */:
                                            return SPEED_LIMIT_START_ZONE;
                                        case DisplayStrings.DS_REPORT_MENU_V2_HAZARD_REPORT_TITLE /* 533 */:
                                            return SPEED_LIMIT_START_ADVISORY;
                                        case DisplayStrings.DS_REPORT_MENU_V2_HAZARD_DEFAULT_LABEL /* 534 */:
                                            return SPEED_LIMIT_START_AHEAD;
                                        default:
                                            switch (i2) {
                                                case DisplayStrings.DS_REPORT_MENU_V2_WEATHER_BAD_WEATHER_LABEL /* 545 */:
                                                    return SPEED_LIMIT_END_MAX;
                                                case DisplayStrings.DS_REPORT_MENU_V2_WEATHER_SLIPPERY_ROAD_LABEL /* 546 */:
                                                    return SPEED_LIMIT_END_MIN;
                                                case DisplayStrings.DS_REPORT_MENU_V2_WEATHER_FLOOD_LABEL /* 547 */:
                                                    return SPEED_LIMIT_END_SCHOOL;
                                                case DisplayStrings.DS_REPORT_MENU_V2_WEATHER_UNPLOWED_ROAD_LABEL /* 548 */:
                                                    return SPEED_LIMIT_END_ZONE;
                                                default:
                                                    switch (i2) {
                                                        case DisplayStrings.DS_SEARCH /* 785 */:
                                                            return RESTRICTION_TURN_NO_RIGHT;
                                                        case DisplayStrings.DS_SENDING_COMMENT_FAILED /* 786 */:
                                                            return RESTRICTION_TURN_NO_LEFT;
                                                        case DisplayStrings.DS_SENDING_MESSAGE_FAILED /* 787 */:
                                                            return RESTRICTION_TURN_NO_U;
                                                        case DisplayStrings.DS_SENDING_PING_FAILED__PLEASE_TRY_AGAIN_LATER /* 788 */:
                                                            return RESTRICTION_TURN_NO_THRU;
                                                        default:
                                                            return null;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return AUXILIARY;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.ac;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ac);
    }
}
