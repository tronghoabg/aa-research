package com.waze.gw;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
final class HudAlertCodec {
    static final int ACCIDENT = 5;
    static final int ANIMAL = 47;
    static final int BLOCKED_LANE = 17;
    static final int BROKEN_LIGHT = 61;
    static final int CAMERA_BUS_LANE = 44;
    static final int CAMERA_DISTANCE = 43;
    static final int CAMERA_DUMMY = 41;
    static final int CAMERA_NOISE = 45;
    static final int CAMERA_PHONE = 40;
    static final int CAMERA_REDLIGHT = 3;
    static final int CAMERA_SEATBELT = 42;
    static final int CAMERA_SPEED = 2;
    static final int CAMERA_STOP_SIGN = 46;
    static final int CAR_LANE = 35;
    static final int CAR_NO_LEFT_AND_U_TURN = 69;
    static final int CAR_NO_LEFT_TURN = 72;
    static final int CAR_NO_RIGHT_AND_U_TURN = 70;
    static final int CAR_NO_RIGHT_TURN = 73;
    static final int CAR_NO_U_TURN = 74;
    static final int COMBINED_TURN_RESTRICTION = 39;
    static final int CONSTRUCTION = 14;
    static final int CYCLIST = 62;
    static final int DANGEROUS_CURVE = 59;
    static final int DANGEROUS_ROAD = 18;
    static final int EMERGENCY_VEHICLE = 63;
    static final int END_ALL_PROHIBITIONS = 25;
    static final int END_NO_PASSING = 10;
    static final int END_SPEED_RESTRICTION = 22;
    static final int EXPRESSWAY_EXIT = 19;
    static final int EXPRESSWAY_REST_STOP = 20;
    static final int FLOOD = 50;
    static final int FOG = 51;
    static final int FORK = 60;
    static final int HAIL = 52;
    static final int HAZARD = 4;
    static final int ICE = 54;
    static final int JAM_SEVERITY_CLOSED = 5;
    static final int JAM_SEVERITY_HEAVY = 3;
    static final int JAM_SEVERITY_LIGHT = 1;
    static final int JAM_SEVERITY_MODERATE = 2;
    static final int JAM_SEVERITY_STANDSTILL = 4;
    static final int JAM_SEVERITY_UNKNOWN = 0;
    static final int LANES_MERGING = 58;
    static final int MANDATORY_LEFT = 34;
    static final int MANDATORY_RIGHT = 33;
    static final int MANDATORY_STRAIGHT = 32;
    static final int MOTORCYCLE_LANE = 36;
    static final int NONE = 0;
    static final int NO_CAR = 26;
    static final int NO_LEFT_AND_RIGHT = 68;
    static final int NO_LEFT_AND_U_TURN = 66;
    static final int NO_LEFT_TURN = 28;
    static final int NO_MOTORCYCLE = 27;
    static final int NO_PASSING = 9;
    static final int NO_RIGHT_AND_U_TURN = 71;
    static final int NO_RIGHT_TURN = 29;
    static final int NO_STRAIGHT = 31;
    static final int NO_STRAIGHT_AND_LEFT = 67;
    static final int NO_STRAIGHT_AND_RIGHT = 65;
    static final int NO_U_TURN = 30;
    static final int OBJECT_ON_ROAD = 48;
    static final int ONE_WAY = 37;
    static final int PERSONAL_SAFETY = 64;
    static final int POLICE = 1;
    static final int POTHOLE = 15;
    static final int PROHIBITED_ROAD = 38;
    static final int RAILWAY = 11;
    static final int RESIDENTIAL_END = 24;
    static final int RESIDENTIAL_START = 23;
    static final int REST_STOP = 21;
    static final int ROADKILL = 49;
    static final int ROAD_CLOSED = 7;
    static final int SCHOOL_ZONE = 57;
    static final int SLIPPERY_ROAD = 55;
    static final int SNOW = 53;
    static final int SPEED_BUMP = 56;
    static final int SPEED_DROP = 8;
    static final int STOPPED_VEHICLE = 13;
    static final int TOLL_BOOTH = 12;
    static final int TRAFFIC_JAM = 6;
    static final int WEATHER = 16;

    private HudAlertCodec() {
    }

    static int[] decode(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return result(0, 0);
        }
        String strField = field(strArr, 0);
        String strNormalize = normalize(field(strArr, 1));
        String strField2 = field(strArr, 4);
        String strNormalize2 = normalize(field(strArr, 5));
        if (strNormalize2.startsWith("wme:")) {
            return result(wmeType(parseInt(strNormalize2.substring(4), -1)), speedValue(strField));
        }
        if (strNormalize2.startsWith("roadpoint:") || strField.startsWith("roadpoint_")) {
            String strSubstring = strNormalize2.length() > 10 ? strNormalize2.substring(10) : strField.substring(10);
            if (strSubstring.contains("expressway_rest")) {
                return result(20, 0);
            }
            return strSubstring.contains("exit") ? result(19, 0) : result(21, 0);
        }
        int iSpeedValue = speedValue(strField);
        if (iSpeedValue > 0) {
            if (strNormalize.contains("het han che toc do") || strNormalize.contains("end speed")) {
                return result(22, iSpeedValue);
            }
            return result(8, iSpeedValue);
        }
        if (containsAny(strNormalize, "giao cat duong sat", "railway crossing", "railroad crossing", "railroad camera")) {
            return result(11, 0);
        }
        String strNormalize3 = normalize(strField + " " + strField2 + " " + strNormalize2);
        if (containsAny(strNormalize3, "no_passing_out", "end_no_passing", "het_cam_vuot")) {
            return result(10, 0);
        }
        if (containsAny(strNormalize3, "no_passing", "cam_vuot", "c_vuot", "average", "french")) {
            return result(9, 0);
        }
        if (containsAny(strNormalize3, "phone_camera", "cam_phone")) {
            return result(40, 0);
        }
        if (containsAny(strNormalize3, "dummy_camera", "camera_fake", "cam_fake")) {
            return result(41, 0);
        }
        if (strNormalize3.contains("seatbelt")) {
            return result(42, 0);
        }
        if (containsAny(strNormalize3, "distance_between", "distance_camera")) {
            return result(43, 0);
        }
        if (strNormalize3.contains("bus_lane")) {
            return result(44, 0);
        }
        if (strNormalize3.contains("noise_camera")) {
            return result(45, 0);
        }
        if (strNormalize3.contains("stop_sign_camera")) {
            return result(46, 0);
        }
        if (containsAny(strNormalize3, "railway", "railroad", "train")) {
            return result(11, 0);
        }
        if (containsAny(strNormalize3, "trafficlight", "traffic_light", "red_light")) {
            return result(3, 0);
        }
        if (strNormalize3.contains("camera") || strNormalize3.contains("cam")) {
            return result(2, 0);
        }
        if (strNormalize3.contains("toll")) {
            return result(12, 0);
        }
        if (containsAny(strNormalize3, "hazard_stopped", "stopped_vehicle", "car_on_shoulder")) {
            return result(13, 0);
        }
        if (strNormalize3.contains("construction")) {
            return result(14, 0);
        }
        if (strNormalize3.contains("pothole")) {
            return result(15, 0);
        }
        if (strNormalize3.contains("blocked_lane") || strNormalize3.contains("closed_lane")) {
            return result(17, 0);
        }
        if (strNormalize3.contains("weather_flood") || strNormalize3.contains("flood")) {
            return result(50, 0);
        }
        if (strNormalize3.contains("weather_fog") || strNormalize3.contains("fog")) {
            return result(51, 0);
        }
        if (strNormalize3.contains("weather_hail") || strNormalize3.contains("hail")) {
            return result(52, 0);
        }
        if (strNormalize3.contains("weather_snow") || strNormalize3.contains("snow")) {
            return result(53, 0);
        }
        if (strNormalize3.contains("weather_ice") || strNormalize3.contains("ice")) {
            return result(54, 0);
        }
        if (strNormalize3.contains("slippery")) {
            return result(55, 0);
        }
        if (strNormalize3.contains("speed_bump")) {
            return result(56, 0);
        }
        if (strNormalize3.contains("school_zone")) {
            return result(57, 0);
        }
        if (containsAny(strNormalize3, "lanes_merging", "lane_merge")) {
            return result(58, 0);
        }
        if (containsAny(strNormalize3, "dangerous_curves", "dangerous_curve")) {
            return result(59, 0);
        }
        if (strNormalize3.contains("fork")) {
            return result(60, 0);
        }
        if (strNormalize3.contains("intersection")) {
            return result(18, 0);
        }
        if (strNormalize3.contains("broken_light")) {
            return result(61, 0);
        }
        if (strNormalize3.contains("roadkill")) {
            return result(49, 0);
        }
        if (containsAny(strNormalize3, "object_on_road", "object_onroad")) {
            return result(48, 0);
        }
        if (strNormalize3.contains("animal")) {
            return result(47, 0);
        }
        if (strNormalize3.contains("cyclist")) {
            return result(62, 0);
        }
        if (strNormalize3.contains("emergency_vehicle")) {
            return result(63, 0);
        }
        if (strNormalize3.contains("personal_safety")) {
            return result(64, 0);
        }
        if (strNormalize3.contains("police") || strNormalize3.contains("checkpoint")) {
            return result(1, 0);
        }
        if (strNormalize3.contains("accident") || strNormalize3.contains("crash")) {
            return result(5, 0);
        }
        if (strNormalize3.contains("traffic") || strNormalize3.contains("jam")) {
            return result(6, 0);
        }
        if (strNormalize3.contains("closure") || strNormalize3.contains("closed")) {
            return result(7, 0);
        }
        if (strNormalize3.contains("bad_weather") || strNormalize3.contains("weather")) {
            return result(16, 0);
        }
        return result(4, 0);
    }

    static int jamSeverity(String[] strArr) {
        if (decode(strArr)[0] != 6) {
            return 0;
        }
        String strNormalize = normalize(field(strArr, 0) + " " + field(strArr, 1) + " " + field(strArr, 4) + " " + field(strArr, 5));
        if (containsAny(strNormalize, "closed_road", "road_closed", "duong dong", "duong bi dong")) {
            return 5;
        }
        if (containsAny(strNormalize, "stand_still", "standstill", "traffic_standstill", "dung im", "dung yen")) {
            return 4;
        }
        if (containsAny(strNormalize, "heavy_traffic", "traffic_heavy", "ket xe nang", "un tac nang")) {
            return 3;
        }
        if (containsAny(strNormalize, "moderate_traffic", "traffic_moderate", "ket xe vua", "un tac vua")) {
            return 2;
        }
        return containsAny(strNormalize, "light_traffic", "traffic_light", "ket xe nhe", "un tac nhe") ? 1 : 0;
    }

    static int jamDelayMinutes(String[] strArr) {
        if (decode(strArr)[0] != 6) {
            return 0;
        }
        try {
            Matcher matcher = Pattern.compile("(?:^|[^0-9])(\\d{1,3})\\s*(?:phut|min(?:ute)?s?)(?:[^a-z]|$)").matcher(normalize(field(strArr, 1) + " " + field(strArr, 4) + " " + field(strArr, 5)));
            if (!matcher.find()) {
                return 0;
            }
            int i2 = Integer.parseInt(matcher.group(1));
            if (i2 < 1 || i2 > 999) {
                return 0;
            }
            return i2;
        } catch (Throwable th) {
            return 0;
        }
    }

    private static int wmeType(int i2) {
        switch (i2) {
            case 1:
                return 65;
            case 2:
                return 66;
            case 3:
                return 67;
            case 4:
                return 68;
            case 5:
                return 69;
            case 6:
                return 70;
            case 7:
                return 71;
            case 8:
                return 28;
            case 9:
                return 29;
            case 10:
                return 31;
            case 11:
                return 30;
            case 12:
                return 22;
            case 13:
                return 8;
            case 14:
                return 9;
            case 15:
                return 10;
            case 16:
                return 72;
            case 17:
                return 73;
            case 18:
                return 74;
            case 19:
                return 26;
            case 20:
                return 27;
            case 21:
                return 32;
            case 22:
                return 33;
            case 23:
                return 34;
            case 24:
                return 35;
            case 25:
                return 36;
            case 26:
                return 23;
            case 27:
                return 24;
            case 28:
            case 29:
            case 30:
            case 31:
            case 34:
            default:
                return 4;
            case 32:
                return 38;
            case 33:
                return 37;
            case 35:
                return 25;
        }
    }

    private static int speedValue(String str) {
        int i2;
        String lowerCase = str == null ? "" : str.toLowerCase(Locale.US);
        if (lowerCase.startsWith("speeddrop_") && (i2 = parseInt(lowerCase.substring(10), 0)) >= 5 && i2 <= 200) {
            return i2;
        }
        return 0;
    }

    private static String field(String[] strArr, int i2) {
        return (strArr == null || i2 < 0 || i2 >= strArr.length || strArr[i2] == null) ? "" : strArr[i2];
    }

    private static String normalize(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("\\p{M}+", "").replace((char) 273, 'd').replace((char) 272, 'D').toLowerCase(Locale.US).trim();
        } catch (Throwable th) {
            return str.toLowerCase(Locale.US).trim();
        }
    }

    private static boolean containsAny(String str, String... strArr) {
        if (str == null || strArr == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str2 != null && str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private static int parseInt(String str, int i2) {
        try {
            return Integer.parseInt(str.trim());
        } catch (Throwable th) {
            return i2;
        }
    }

    private static int[] result(int i2, int i3) {
        return new int[]{i2, i3};
    }
}
