package com.waze.bg.a;

import androidx.media3.common.PlaybackException;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bk implements com.google.v.eg {
    NO_SUBTYPE(0),
    POLICE_VISIBLE(201),
    POLICE_HIDING(202),
    POLICE_WITH_MOBILE_CAMERA(203),
    ACCIDENT_MINOR(301),
    ACCIDENT_MAJOR(302),
    JAM_MODERATE_TRAFFIC(401),
    JAM_HEAVY_TRAFFIC(402),
    JAM_STAND_STILL_TRAFFIC(403),
    JAM_LIGHT_TRAFFIC(404),
    HAZARD_ON_ROAD(601),
    HAZARD_ON_SHOULDER(602),
    HAZARD_WEATHER(603),
    HAZARD_ON_ROAD_OBJECT(604),
    HAZARD_ON_ROAD_POT_HOLE(605),
    HAZARD_ON_ROAD_ROAD_KILL(606),
    HAZARD_ON_SHOULDER_CAR_STOPPED(607),
    HAZARD_ON_SHOULDER_ANIMALS(608),
    HAZARD_ON_SHOULDER_MISSING_SIGN(609),
    HAZARD_WEATHER_FOG(610),
    HAZARD_WEATHER_HAIL(611),
    HAZARD_WEATHER_HEAVY_RAIN(612),
    HAZARD_WEATHER_HEAVY_SNOW(DisplayStrings.DS_ALREADY_SENDING_LOGS),
    HAZARD_WEATHER_FLOOD(DisplayStrings.DS_DEBUG_MODE),
    HAZARD_WEATHER_MONSOON(DisplayStrings.DS_SORRY__YOU_HAVE_NO_NETWORK_CONNECTION_RIGHT_NOW__PLEASE_TRY_LATER),
    HAZARD_WEATHER_TORNADO(DisplayStrings.DS_LANGUAGE_CHANGED__PLEASE_RESTART_WAZE),
    HAZARD_WEATHER_HEAT_WAVE(DisplayStrings.DS_WARNING_BAR_NO_GPS_INIT),
    HAZARD_WEATHER_HURRICANE(DisplayStrings.DS_WARNING_BAR_NO_GPS),
    HAZARD_WEATHER_FREEZING_RAIN(DisplayStrings.DS_DOWNLOADING_VOICE____),
    HAZARD_ON_ROAD_LANE_CLOSED(620),
    HAZARD_ON_ROAD_OIL(621),
    HAZARD_ON_ROAD_ICE(DisplayStrings.DS_SHARE_DETAILS_HERE___),
    HAZARD_ON_ROAD_CONSTRUCTION(DisplayStrings.DS_MAP),
    HAZARD_ON_ROAD_CAR_STOPPED(DisplayStrings.DS_SEARCH_RESULTS),
    HAZARD_ON_ROAD_TRAFFIC_LIGHT_FAULT(DisplayStrings.DS_LIST),
    HAZARD_ON_ROAD_EMERGENCY_VEHICLE(DisplayStrings.DS_SEARCHING_______),
    ROAD_CLOSED_HAZARD(DisplayStrings.DS_LOCATION_PREVIEW_CLOSED),
    ROAD_CLOSED_CONSTRUCTION(DisplayStrings.DS_LOCATION_PREVIEW_CLOSES_AT_PS),
    ROAD_CLOSED_EVENT(DisplayStrings.DS_LOCATION_PREVIEW_ABOUT),
    TURN_CLOSED_EVENT(DisplayStrings.DS_CUSTOM_PROMPT_1000_METERS),
    __NOT_IN_USE__PARKED_ON(DisplayStrings.DS_CALENDAR_CONFIRM_BLOCK_ADDRESS_OK),
    __NOT_IN_USE__PARKED_OFF(DisplayStrings.DS_CALENDAR_SELECTION_MAIN_CALENDAR),
    SOS_FLAT_TIRE(1601),
    SOS_NO_FUEL(1602),
    SOS_MEDICAL_HELP(1603),
    SOS_MECHANICAL_PROBLEM(1604),
    SOS_OTHER(1605),
    SOS_BATTERY_ISSUE(1606),
    CRASH_PRONE_SHORT_ALERT_LENGTH(DisplayStrings.DS_ETA_SCREEN_OVERVIEW_BUTTON),
    CRASH_PRONE_LONG_ALERT_LENGTH(DisplayStrings.DS_ETA_SCREEN_PLAN_DRIVE_BTN_NOW),
    BAD_WEATHER_DEFAULT(2000),
    BAD_WEATHER_SLIPPERY_ROAD(2001),
    LANE_CLOSURE_BLOCKED_LANES(2002),
    LANE_CLOSURE_LEFT_LANE(2003),
    LANE_CLOSURE_RIGHT_LANE(2004),
    LANE_CLOSURE_CENTER_LANE(2005),
    ANIMAL_ALERT_DEFAULT(2006),
    ANIMAL_ALERT_ON_ROAD(2007),
    ANIMAL_ALERT_ON_SHOULDER(2008),
    PERMANENT_HAZARD_SPEED_BUMP(3001),
    PERMANENT_HAZARD_TOPES(3002),
    PERMANENT_HAZARD_TOLL_BOOTH(3003),
    PERMANENT_HAZARD_DANGEROUS_CURVE(3004),
    PERMANENT_HAZARD_DANGEROUS_INTERSECTION(3005),
    PERMANENT_HAZARD_DANGEROUS_SPLIT(3006),
    PERMANENT_HAZARD_DANGEROUS_MERGE(3007),
    PERMANENT_HAZARD_SCHOOL_ZONE(3008),
    DEFAULT_PERSONAL_SAFETY(PlaybackException.ERROR_CODE_DECODER_INIT_FAILED),
    DEFAULT_CAMERA(5001);

    private final int as;

    bk(int i2) {
        this.as = i2;
    }

    public static bk a(int i2) {
        if (i2 != 0) {
            if (i2 == 301) {
                return ACCIDENT_MINOR;
            }
            if (i2 == 302) {
                return ACCIDENT_MAJOR;
            }
            if (i2 == 1201) {
                return __NOT_IN_USE__PARKED_ON;
            }
            if (i2 == 1202) {
                return __NOT_IN_USE__PARKED_OFF;
            }
            if (i2 == 1701) {
                return CRASH_PRONE_SHORT_ALERT_LENGTH;
            }
            if (i2 == 1702) {
                return CRASH_PRONE_LONG_ALERT_LENGTH;
            }
            switch (i2) {
                case 0:
                    break;
                case 601:
                    return HAZARD_ON_ROAD;
                case 602:
                    return HAZARD_ON_SHOULDER;
                case 603:
                    return HAZARD_WEATHER;
                case 604:
                    return HAZARD_ON_ROAD_OBJECT;
                case 605:
                    return HAZARD_ON_ROAD_POT_HOLE;
                case 606:
                    return HAZARD_ON_ROAD_ROAD_KILL;
                case 607:
                    return HAZARD_ON_SHOULDER_CAR_STOPPED;
                case 608:
                    return HAZARD_ON_SHOULDER_ANIMALS;
                case 609:
                    return HAZARD_ON_SHOULDER_MISSING_SIGN;
                case 610:
                    return HAZARD_WEATHER_FOG;
                case 611:
                    return HAZARD_WEATHER_HAIL;
                case 612:
                    return HAZARD_WEATHER_HEAVY_RAIN;
                case DisplayStrings.DS_ALREADY_SENDING_LOGS /* 613 */:
                    return HAZARD_WEATHER_HEAVY_SNOW;
                case DisplayStrings.DS_DEBUG_MODE /* 614 */:
                    return HAZARD_WEATHER_FLOOD;
                case DisplayStrings.DS_SORRY__YOU_HAVE_NO_NETWORK_CONNECTION_RIGHT_NOW__PLEASE_TRY_LATER /* 615 */:
                    return HAZARD_WEATHER_MONSOON;
                case DisplayStrings.DS_LANGUAGE_CHANGED__PLEASE_RESTART_WAZE /* 616 */:
                    return HAZARD_WEATHER_TORNADO;
                case DisplayStrings.DS_WARNING_BAR_NO_GPS_INIT /* 617 */:
                    return HAZARD_WEATHER_HEAT_WAVE;
                case DisplayStrings.DS_WARNING_BAR_NO_GPS /* 618 */:
                    return HAZARD_WEATHER_HURRICANE;
                case DisplayStrings.DS_DOWNLOADING_VOICE____ /* 619 */:
                    return HAZARD_WEATHER_FREEZING_RAIN;
                case 620:
                    return HAZARD_ON_ROAD_LANE_CLOSED;
                case 621:
                    return HAZARD_ON_ROAD_OIL;
                case DisplayStrings.DS_SHARE_DETAILS_HERE___ /* 622 */:
                    return HAZARD_ON_ROAD_ICE;
                case DisplayStrings.DS_MAP /* 623 */:
                    return HAZARD_ON_ROAD_CONSTRUCTION;
                case DisplayStrings.DS_SEARCH_RESULTS /* 624 */:
                    return HAZARD_ON_ROAD_CAR_STOPPED;
                case DisplayStrings.DS_LIST /* 625 */:
                    return HAZARD_ON_ROAD_TRAFFIC_LIGHT_FAULT;
                case DisplayStrings.DS_SEARCHING_______ /* 626 */:
                    return HAZARD_ON_ROAD_EMERGENCY_VEHICLE;
                case DisplayStrings.DS_CUSTOM_PROMPT_1000_METERS /* 1901 */:
                    return TURN_CLOSED_EVENT;
                case PlaybackException.ERROR_CODE_DECODER_INIT_FAILED /* 4001 */:
                    return DEFAULT_PERSONAL_SAFETY;
                case 5001:
                    return DEFAULT_CAMERA;
                default:
                    switch (i2) {
                        case 201:
                            return POLICE_VISIBLE;
                        case 202:
                            return POLICE_HIDING;
                        case 203:
                            return POLICE_WITH_MOBILE_CAMERA;
                        default:
                            switch (i2) {
                                case 401:
                                    return JAM_MODERATE_TRAFFIC;
                                case 402:
                                    return JAM_HEAVY_TRAFFIC;
                                case 403:
                                    return JAM_STAND_STILL_TRAFFIC;
                                case 404:
                                    return JAM_LIGHT_TRAFFIC;
                                default:
                                    switch (i2) {
                                        case DisplayStrings.DS_LOCATION_PREVIEW_CLOSED /* 1301 */:
                                            return ROAD_CLOSED_HAZARD;
                                        case DisplayStrings.DS_LOCATION_PREVIEW_CLOSES_AT_PS /* 1302 */:
                                            return ROAD_CLOSED_CONSTRUCTION;
                                        case DisplayStrings.DS_LOCATION_PREVIEW_ABOUT /* 1303 */:
                                            return ROAD_CLOSED_EVENT;
                                        default:
                                            switch (i2) {
                                                case 1601:
                                                    return SOS_FLAT_TIRE;
                                                case 1602:
                                                    return SOS_NO_FUEL;
                                                case 1603:
                                                    return SOS_MEDICAL_HELP;
                                                case 1604:
                                                    return SOS_MECHANICAL_PROBLEM;
                                                case 1605:
                                                    return SOS_OTHER;
                                                case 1606:
                                                    return SOS_BATTERY_ISSUE;
                                                default:
                                                    switch (i2) {
                                                        case 2000:
                                                            return BAD_WEATHER_DEFAULT;
                                                        case 2001:
                                                            return BAD_WEATHER_SLIPPERY_ROAD;
                                                        case 2002:
                                                            return LANE_CLOSURE_BLOCKED_LANES;
                                                        case 2003:
                                                            return LANE_CLOSURE_LEFT_LANE;
                                                        case 2004:
                                                            return LANE_CLOSURE_RIGHT_LANE;
                                                        case 2005:
                                                            return LANE_CLOSURE_CENTER_LANE;
                                                        case 2006:
                                                            return ANIMAL_ALERT_DEFAULT;
                                                        case 2007:
                                                            return ANIMAL_ALERT_ON_ROAD;
                                                        case 2008:
                                                            return ANIMAL_ALERT_ON_SHOULDER;
                                                        default:
                                                            switch (i2) {
                                                                case 3001:
                                                                    return PERMANENT_HAZARD_SPEED_BUMP;
                                                                case 3002:
                                                                    return PERMANENT_HAZARD_TOPES;
                                                                case 3003:
                                                                    return PERMANENT_HAZARD_TOLL_BOOTH;
                                                                case 3004:
                                                                    return PERMANENT_HAZARD_DANGEROUS_CURVE;
                                                                case 3005:
                                                                    return PERMANENT_HAZARD_DANGEROUS_INTERSECTION;
                                                                case 3006:
                                                                    return PERMANENT_HAZARD_DANGEROUS_SPLIT;
                                                                case 3007:
                                                                    return PERMANENT_HAZARD_DANGEROUS_MERGE;
                                                                case 3008:
                                                                    return PERMANENT_HAZARD_SCHOOL_ZONE;
                                                                default:
                                                                    return null;
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return NO_SUBTYPE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.as;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.as);
    }
}
