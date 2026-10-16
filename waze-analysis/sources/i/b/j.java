package i.b;

import androidx.media3.common.PlaybackException;
import com.google.v.eg;
import com.google.v.ei;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum j implements eg {
    NO_SUBTYPE(0),
    POLICE_VISIBLE(1),
    POLICE_HIDING(2),
    POLICE_WITH_MOBILE_CAMERA(41),
    ACCIDENT_MINOR(3),
    ACCIDENT_MAJOR(4),
    JAM_MODERATE_TRAFFIC(5),
    JAM_HEAVY_TRAFFIC(6),
    JAM_STAND_STILL_TRAFFIC(7),
    JAM_LIGHT_TRAFFIC(8),
    HAZARD_ON_ROAD(9),
    HAZARD_ON_SHOULDER(10),
    HAZARD_WEATHER(11),
    HAZARD_ON_ROAD_OBJECT(12),
    HAZARD_ON_ROAD_POT_HOLE(13),
    HAZARD_ON_ROAD_ROAD_KILL(14),
    HAZARD_ON_SHOULDER_CAR_STOPPED(15),
    HAZARD_ON_SHOULDER_ANIMALS(16),
    HAZARD_ON_SHOULDER_MISSING_SIGN(17),
    HAZARD_WEATHER_FOG(18),
    HAZARD_WEATHER_HAIL(19),
    HAZARD_WEATHER_HEAVY_RAIN(20),
    HAZARD_WEATHER_HEAVY_SNOW(21),
    HAZARD_WEATHER_FLOOD(22),
    HAZARD_WEATHER_MONSOON(23),
    HAZARD_WEATHER_TORNADO(24),
    HAZARD_WEATHER_HEAT_WAVE(25),
    HAZARD_WEATHER_HURRICANE(26),
    HAZARD_WEATHER_FREEZING_RAIN(27),
    HAZARD_ON_ROAD_LANE_CLOSED(28),
    HAZARD_ON_ROAD_OIL(29),
    HAZARD_ON_ROAD_ICE(30),
    HAZARD_ON_ROAD_CONSTRUCTION(31),
    HAZARD_ON_ROAD_CAR_STOPPED(32),
    HAZARD_ON_ROAD_TRAFFIC_LIGHT_FAULT(33),
    HAZARD_ON_ROAD_EMERGENCY_VEHICLE(39),
    ROAD_CLOSED_HAZARD(34),
    ROAD_CLOSED_CONSTRUCTION(35),
    ROAD_CLOSED_EVENT(36),
    TURN_CLOSED_EVENT(40),
    PARKED_ON(37),
    PARKED_OFF(38),
    SOS_FLAT_TIRE(1601),
    SOS_NO_FUEL(1602),
    SOS_MEDICAL_HELP(1603),
    SOS_MECHANICAL_PROBLEM(1604),
    SOS_OTHER(1605),
    SOS_BATTERY_ISSUE(1606),
    BAD_WEATHER_DEFAULT(DisplayStrings.DS_ETA_SCREEN_OVERVIEW_BUTTON),
    BAD_WEATHER_SLIPPERY_ROAD(DisplayStrings.DS_ETA_SCREEN_PLAN_DRIVE_BTN_NOW),
    LANE_CLOSURE_BLOCKED_LANES(DisplayStrings.DS_ETA_SCREEN_SECOND_STOP_ETA_PS),
    LANE_CLOSURE_LEFT_LANE(DisplayStrings.DS_CALENDAR_SETTINGS_REMINDER_OPTIONS),
    LANE_CLOSURE_RIGHT_LANE(DisplayStrings.DS_CALENDAR_REMINDER_OPTIONS_TITLE),
    LANE_CLOSURE_CENTER_LANE(DisplayStrings.DS_CALENDAR_REMINDER_OPTIONS_HEADER),
    DEFAULT_PERSONAL_SAFETY(PlaybackException.ERROR_CODE_DECODER_INIT_FAILED);

    private final int ae;

    j(int i2) {
        this.ae = i2;
    }

    public static ei a() {
        return k.f48520b;
    }

    public static j b(int i2) {
        if (i2 == 4001) {
            return DEFAULT_PERSONAL_SAFETY;
        }
        switch (i2) {
            case 0:
                return NO_SUBTYPE;
            case 1:
                return POLICE_VISIBLE;
            case 2:
                return POLICE_HIDING;
            case 3:
                return ACCIDENT_MINOR;
            case 4:
                return ACCIDENT_MAJOR;
            case 5:
                return JAM_MODERATE_TRAFFIC;
            case 6:
                return JAM_HEAVY_TRAFFIC;
            case 7:
                return JAM_STAND_STILL_TRAFFIC;
            case 8:
                return JAM_LIGHT_TRAFFIC;
            case 9:
                return HAZARD_ON_ROAD;
            case 10:
                return HAZARD_ON_SHOULDER;
            case 11:
                return HAZARD_WEATHER;
            case 12:
                return HAZARD_ON_ROAD_OBJECT;
            case 13:
                return HAZARD_ON_ROAD_POT_HOLE;
            case 14:
                return HAZARD_ON_ROAD_ROAD_KILL;
            case 15:
                return HAZARD_ON_SHOULDER_CAR_STOPPED;
            case 16:
                return HAZARD_ON_SHOULDER_ANIMALS;
            case 17:
                return HAZARD_ON_SHOULDER_MISSING_SIGN;
            case 18:
                return HAZARD_WEATHER_FOG;
            case 19:
                return HAZARD_WEATHER_HAIL;
            case 20:
                return HAZARD_WEATHER_HEAVY_RAIN;
            case 21:
                return HAZARD_WEATHER_HEAVY_SNOW;
            case 22:
                return HAZARD_WEATHER_FLOOD;
            case 23:
                return HAZARD_WEATHER_MONSOON;
            case 24:
                return HAZARD_WEATHER_TORNADO;
            case 25:
                return HAZARD_WEATHER_HEAT_WAVE;
            case 26:
                return HAZARD_WEATHER_HURRICANE;
            case 27:
                return HAZARD_WEATHER_FREEZING_RAIN;
            case 28:
                return HAZARD_ON_ROAD_LANE_CLOSED;
            case 29:
                return HAZARD_ON_ROAD_OIL;
            case 30:
                return HAZARD_ON_ROAD_ICE;
            case 31:
                return HAZARD_ON_ROAD_CONSTRUCTION;
            case 32:
                return HAZARD_ON_ROAD_CAR_STOPPED;
            case 33:
                return HAZARD_ON_ROAD_TRAFFIC_LIGHT_FAULT;
            case 34:
                return ROAD_CLOSED_HAZARD;
            case 35:
                return ROAD_CLOSED_CONSTRUCTION;
            case 36:
                return ROAD_CLOSED_EVENT;
            case 37:
                return PARKED_ON;
            case 38:
                return PARKED_OFF;
            case 39:
                return HAZARD_ON_ROAD_EMERGENCY_VEHICLE;
            case 40:
                return TURN_CLOSED_EVENT;
            case 41:
                return POLICE_WITH_MOBILE_CAMERA;
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
                            case DisplayStrings.DS_ETA_SCREEN_OVERVIEW_BUTTON /* 1701 */:
                                return BAD_WEATHER_DEFAULT;
                            case DisplayStrings.DS_ETA_SCREEN_PLAN_DRIVE_BTN_NOW /* 1702 */:
                                return BAD_WEATHER_SLIPPERY_ROAD;
                            case DisplayStrings.DS_ETA_SCREEN_SECOND_STOP_ETA_PS /* 1703 */:
                                return LANE_CLOSURE_BLOCKED_LANES;
                            case DisplayStrings.DS_CALENDAR_SETTINGS_REMINDER_OPTIONS /* 1704 */:
                                return LANE_CLOSURE_LEFT_LANE;
                            case DisplayStrings.DS_CALENDAR_REMINDER_OPTIONS_TITLE /* 1705 */:
                                return LANE_CLOSURE_RIGHT_LANE;
                            case DisplayStrings.DS_CALENDAR_REMINDER_OPTIONS_HEADER /* 1706 */:
                                return LANE_CLOSURE_CENTER_LANE;
                            default:
                                return null;
                        }
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.ae;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.ae);
    }
}
