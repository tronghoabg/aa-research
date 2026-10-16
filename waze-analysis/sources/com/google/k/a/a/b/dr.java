package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum dr implements com.google.v.eg {
    TYPE_UNKNOWN(1),
    TYPE_NORMAL(2),
    TYPE_PASSING(3),
    TYPE_LEFT_TURN(4),
    TYPE_LEFT_TURN_OFF(65),
    TYPE_LEFT_TURN_ON_OFF(66),
    TYPE_RIGHT_TURN(5),
    TYPE_RIGHT_TURN_OFF(81),
    TYPE_RIGHT_TURN_ON_OFF(82),
    TYPE_BICYCLE(6),
    TYPE_PARKING(7),
    TYPE_PARKING_IMPLIED(113),
    TYPE_PARKING_MARKED(114),
    TYPE_EXIT_ENTRANCE(8),
    TYPE_EXIT_LANE(129),
    TYPE_ENTRANCE_LANE(130),
    TYPE_PEDESTRIAN(9),
    TYPE_SIDEWALK_SHOULDER(10),
    TYPE_VEHICLE_SHOULDER(11),
    TYPE_OFFSET(12),
    TYPE_THIN_SHOULDER(DisplayStrings.DS_TRIP_OVERVIEW_BADGE_POLICE),
    TYPE_MEDIAN(DisplayStrings.DS_TRIP_OVERVIEW_BADGE_POLICE_PLURAL),
    TYPE_PAINTED_MEDIAN(DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_PERSONALIZED_ADS_ON_MESSAGE),
    TYPE_OUTLINED_MEDIAN(49681),
    TYPE_HASHED_MEDIAN(49682),
    TYPE_PHYSICAL_MEDIAN(DisplayStrings.DS_AAOS_PRIVACY_SETTINGS_PERSONALIZED_ADS_OFF_MESSAGE),
    TYPE_REVERSIBLE(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_DEFAULT_7);

    private final int C;

    dr(int i2) {
        this.C = i2;
    }

    public static dr a(int i2) {
        if (i2 == 65) {
            return TYPE_LEFT_TURN_OFF;
        }
        if (i2 == 66) {
            return TYPE_LEFT_TURN_ON_OFF;
        }
        if (i2 == 81) {
            return TYPE_RIGHT_TURN_OFF;
        }
        if (i2 == 82) {
            return TYPE_RIGHT_TURN_ON_OFF;
        }
        if (i2 == 113) {
            return TYPE_PARKING_IMPLIED;
        }
        if (i2 == 114) {
            return TYPE_PARKING_MARKED;
        }
        if (i2 == 129) {
            return TYPE_EXIT_LANE;
        }
        if (i2 == 130) {
            return TYPE_ENTRANCE_LANE;
        }
        if (i2 == 193) {
            return TYPE_THIN_SHOULDER;
        }
        if (i2 == 194) {
            return TYPE_MEDIAN;
        }
        if (i2 == 208) {
            return TYPE_REVERSIBLE;
        }
        if (i2 == 3105) {
            return TYPE_PAINTED_MEDIAN;
        }
        if (i2 == 3106) {
            return TYPE_PHYSICAL_MEDIAN;
        }
        switch (i2) {
            case 1:
                return TYPE_UNKNOWN;
            case 2:
                return TYPE_NORMAL;
            case 3:
                return TYPE_PASSING;
            case 4:
                return TYPE_LEFT_TURN;
            case 5:
                return TYPE_RIGHT_TURN;
            case 6:
                return TYPE_BICYCLE;
            case 7:
                return TYPE_PARKING;
            case 8:
                return TYPE_EXIT_ENTRANCE;
            case 9:
                return TYPE_PEDESTRIAN;
            case 10:
                return TYPE_SIDEWALK_SHOULDER;
            case 11:
                return TYPE_VEHICLE_SHOULDER;
            case 12:
                return TYPE_OFFSET;
            default:
                switch (i2) {
                    case 49681:
                        return TYPE_OUTLINED_MEDIAN;
                    case 49682:
                        return TYPE_HASHED_MEDIAN;
                    default:
                        return null;
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.C;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.C);
    }
}
