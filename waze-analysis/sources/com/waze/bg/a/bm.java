package com.waze.bg.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public enum bm implements com.google.v.eg {
    UNKNOWN_TYPE(0),
    CHIT_CHAT(1),
    POLICE(2),
    ACCIDENT(3),
    JAM(4),
    TRAFFIC_INFO(5),
    HAZARD(6),
    MISC(7),
    CONSTRUCTION(8),
    PARKING(9),
    DYNAMIC(10),
    CAMERA(11),
    __NOT_IN_USE__PARKED(12),
    ROAD_CLOSED(13),
    TURN_CLOSED(19),
    SYSTEM_ROAD_CLOSED(14),
    UNKNOWN(15),
    SOS(16),
    CRASH_PRONE(17),
    ANIMAL(20),
    NEW_BAD_WEATHER(100),
    NEW_LANE_CLOSED(101),
    PERMANENT_HAZARD(103),
    PERSONAL_SAFETY(104);

    private final int z;

    bm(int i2) {
        this.z = i2;
    }

    public static bm a(int i2) {
        if (i2 == 19) {
            return TURN_CLOSED;
        }
        if (i2 == 20) {
            return ANIMAL;
        }
        if (i2 == 100) {
            return NEW_BAD_WEATHER;
        }
        if (i2 == 101) {
            return NEW_LANE_CLOSED;
        }
        if (i2 == 103) {
            return PERMANENT_HAZARD;
        }
        if (i2 == 104) {
            return PERSONAL_SAFETY;
        }
        switch (i2) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return CHIT_CHAT;
            case 2:
                return POLICE;
            case 3:
                return ACCIDENT;
            case 4:
                return JAM;
            case 5:
                return TRAFFIC_INFO;
            case 6:
                return HAZARD;
            case 7:
                return MISC;
            case 8:
                return CONSTRUCTION;
            case 9:
                return PARKING;
            case 10:
                return DYNAMIC;
            case 11:
                return CAMERA;
            case 12:
                return __NOT_IN_USE__PARKED;
            case 13:
                return ROAD_CLOSED;
            case 14:
                return SYSTEM_ROAD_CLOSED;
            case 15:
                return UNKNOWN;
            case 16:
                return SOS;
            case 17:
                return CRASH_PRONE;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.z;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.z);
    }
}
