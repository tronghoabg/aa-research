package com.waze.jni.protos.alerters;

import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum AlerterType implements eg {
    CHITCHAT(0),
    POLICE(1),
    ACCIDENT(2),
    TRAFFIC_JAM(3),
    TRAFFIC_INFO(4),
    HAZARD(5),
    OTHER(6),
    CONSTRUCTION(7),
    PARKING(8),
    DYNAMIC(9),
    CAMERA(10),
    PARKED(11),
    CLOSURE(12),
    SOS(15),
    REROUTE(16),
    GUARDIAN(17),
    ECO(18),
    BLOCKED_LANE(19),
    BAD_WEATHER(20),
    PERMANENT_HAZARD(21),
    SPEED_LIMIT_DECREASE(23),
    PERSONAL_SAFETY(24),
    DANGER_ZONE(25),
    ANIMAL(26),
    UNRECOGNIZED(-1);

    public static final int ACCIDENT_VALUE = 2;
    public static final int ANIMAL_VALUE = 26;
    public static final int BAD_WEATHER_VALUE = 20;
    public static final int BLOCKED_LANE_VALUE = 19;
    public static final int CAMERA_VALUE = 10;
    public static final int CHITCHAT_VALUE = 0;
    public static final int CLOSURE_VALUE = 12;
    public static final int CONSTRUCTION_VALUE = 7;
    public static final int DANGER_ZONE_VALUE = 25;
    public static final int DYNAMIC_VALUE = 9;
    public static final int ECO_VALUE = 18;
    public static final int GUARDIAN_VALUE = 17;
    public static final int HAZARD_VALUE = 5;
    public static final int OTHER_VALUE = 6;
    public static final int PARKED_VALUE = 11;
    public static final int PARKING_VALUE = 8;
    public static final int PERMANENT_HAZARD_VALUE = 21;
    public static final int PERSONAL_SAFETY_VALUE = 24;
    public static final int POLICE_VALUE = 1;
    public static final int REROUTE_VALUE = 16;
    public static final int SOS_VALUE = 15;
    public static final int SPEED_LIMIT_DECREASE_VALUE = 23;
    public static final int TRAFFIC_INFO_VALUE = 4;
    public static final int TRAFFIC_JAM_VALUE = 3;
    private static final eh<AlerterType> internalValueMap = new eh<AlerterType>() { // from class: com.waze.jni.protos.alerters.AlerterType.1
        @Override // com.google.v.eh
        public AlerterType findValueByNumber(int i2) {
            return AlerterType.forNumber(i2);
        }
    };
    private final int value;

    /* compiled from: WazeSource */
    final class AlerterTypeVerifier implements ei {
        static final ei INSTANCE = new AlerterTypeVerifier();

        private AlerterTypeVerifier() {
        }

        @Override // com.google.v.ei
        public boolean isInRange(int i2) {
            return AlerterType.forNumber(i2) != null;
        }
    }

    AlerterType(int i2) {
        this.value = i2;
    }

    public static AlerterType forNumber(int i2) {
        switch (i2) {
            case 0:
                return CHITCHAT;
            case 1:
                return POLICE;
            case 2:
                return ACCIDENT;
            case 3:
                return TRAFFIC_JAM;
            case 4:
                return TRAFFIC_INFO;
            case 5:
                return HAZARD;
            case 6:
                return OTHER;
            case 7:
                return CONSTRUCTION;
            case 8:
                return PARKING;
            case 9:
                return DYNAMIC;
            case 10:
                return CAMERA;
            case 11:
                return PARKED;
            case 12:
                return CLOSURE;
            case 13:
            case 14:
            case 22:
            default:
                return null;
            case 15:
                return SOS;
            case 16:
                return REROUTE;
            case 17:
                return GUARDIAN;
            case 18:
                return ECO;
            case 19:
                return BLOCKED_LANE;
            case 20:
                return BAD_WEATHER;
            case 21:
                return PERMANENT_HAZARD;
            case 23:
                return SPEED_LIMIT_DECREASE;
            case 24:
                return PERSONAL_SAFETY;
            case 25:
                return DANGER_ZONE;
            case 26:
                return ANIMAL;
        }
    }

    public static eh<AlerterType> internalGetValueMap() {
        return internalValueMap;
    }

    public static ei internalGetVerifier() {
        return AlerterTypeVerifier.INSTANCE;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this == UNRECOGNIZED ? ep.b() : this.value;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.value);
    }
}
