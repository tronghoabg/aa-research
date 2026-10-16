package com.waze.bm.a.a;

import com.google.v.eg;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum o implements eg {
    ALERT_TYPE_UNSPECIFIED(0),
    POLICE_DEFAULT(1),
    POLICE_HIDDEN(2),
    CRASH_DEFAULT(3),
    CRASH_PILE_UP(4),
    CRASH_MAJOR(5),
    CRASH_MINOR(6),
    TRAFFIC_DEFAULT(7),
    TRAFFIC_STANDSTILL(8),
    TRAFFIC_LIGHT(9),
    TRAFFIC_MODERATE(10),
    TRAFFIC_HEAVY(11),
    HAZARD_DEFAULT(12),
    HAZARD_CONSTRUCTION(13),
    HAZARD_VEHICLE_STOPPED(14),
    HAZARD_OBJECT_ON_ROAD(15),
    HAZARD_POTHOLE(16),
    HAZARD_BROKEN_TRAFFIC_LIGHT(17),
    HAZARD_OIL(18),
    HAZARD_ANIMALS(19),
    HAZARD_MISSING_SIGN(20),
    HAZARD_ROAD_KILL(21),
    HAZARD_SHOULDER(22),
    HAZARD_SHOULDER_VEHICLE_STOPPED(23),
    HAZARD_EMERGENCY_VEHICLE(24),
    WEATHER_DEFAULT(25),
    WEATHER_SLIPPERY_ROAD(26),
    WEATHER_FLOOD(27),
    WEATHER_UNPLOWED_ROAD(28),
    WEATHER_FOG(29),
    WEATHER_ICY_ROAD(30),
    WEATHER_HEAT_WAVE(31),
    WEATHER_TORNADO(32),
    WEATHER_HEAVY_RAIN(33),
    WEATHER_HAIL(34),
    WEATHER_HURRICANE(35),
    WEATHER_MONSOON(36),
    BLOCKED_LANE_DEFAULT(37),
    BLOCKED_LANE_LEFT(38),
    BLOCKED_LANE_CENTER(39),
    BLOCKED_LANE_RIGHT(40),
    PERSONAL_SAFETY_DEFAULT(41),
    POLICE_MOBILE_CAMERA(42);

    private final int S;

    o(int i2) {
        this.S = i2;
    }

    public static o a(int i2) {
        switch (i2) {
            case 0:
                return ALERT_TYPE_UNSPECIFIED;
            case 1:
                return POLICE_DEFAULT;
            case 2:
                return POLICE_HIDDEN;
            case 3:
                return CRASH_DEFAULT;
            case 4:
                return CRASH_PILE_UP;
            case 5:
                return CRASH_MAJOR;
            case 6:
                return CRASH_MINOR;
            case 7:
                return TRAFFIC_DEFAULT;
            case 8:
                return TRAFFIC_STANDSTILL;
            case 9:
                return TRAFFIC_LIGHT;
            case 10:
                return TRAFFIC_MODERATE;
            case 11:
                return TRAFFIC_HEAVY;
            case 12:
                return HAZARD_DEFAULT;
            case 13:
                return HAZARD_CONSTRUCTION;
            case 14:
                return HAZARD_VEHICLE_STOPPED;
            case 15:
                return HAZARD_OBJECT_ON_ROAD;
            case 16:
                return HAZARD_POTHOLE;
            case 17:
                return HAZARD_BROKEN_TRAFFIC_LIGHT;
            case 18:
                return HAZARD_OIL;
            case 19:
                return HAZARD_ANIMALS;
            case 20:
                return HAZARD_MISSING_SIGN;
            case 21:
                return HAZARD_ROAD_KILL;
            case 22:
                return HAZARD_SHOULDER;
            case 23:
                return HAZARD_SHOULDER_VEHICLE_STOPPED;
            case 24:
                return HAZARD_EMERGENCY_VEHICLE;
            case 25:
                return WEATHER_DEFAULT;
            case 26:
                return WEATHER_SLIPPERY_ROAD;
            case 27:
                return WEATHER_FLOOD;
            case 28:
                return WEATHER_UNPLOWED_ROAD;
            case 29:
                return WEATHER_FOG;
            case 30:
                return WEATHER_ICY_ROAD;
            case 31:
                return WEATHER_HEAT_WAVE;
            case 32:
                return WEATHER_TORNADO;
            case 33:
                return WEATHER_HEAVY_RAIN;
            case 34:
                return WEATHER_HAIL;
            case 35:
                return WEATHER_HURRICANE;
            case 36:
                return WEATHER_MONSOON;
            case 37:
                return BLOCKED_LANE_DEFAULT;
            case 38:
                return BLOCKED_LANE_LEFT;
            case 39:
                return BLOCKED_LANE_CENTER;
            case 40:
                return BLOCKED_LANE_RIGHT;
            case 41:
                return PERSONAL_SAFETY_DEFAULT;
            case 42:
                return POLICE_MOBILE_CAMERA;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.S;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.S);
    }
}
