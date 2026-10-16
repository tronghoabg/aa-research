package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ht implements com.google.v.eg {
    BICYCLE_FACILITY_SEPARATE_TRAIL(1),
    BICYCLE_FACILITY_PEDESTRIAN_PATH(2),
    BICYCLE_FACILITY_BIKE_FRIENDLY_PEDESTRIAN_PATH(33),
    BICYCLE_FACILITY_SHARED_ROAD(3),
    BICYCLE_FACILITY_BIKE_LANE(49),
    BICYCLE_FACILITY_BIKE_LANE_WITH_PEDESTRIAN_PATH(DisplayStrings.DS_SEARCH),
    BICYCLE_FACILITY_BIKE_LANE_BUFFERED(DisplayStrings.DS_SENDING_COMMENT_FAILED),
    BICYCLE_FACILITY_WIDE_SHOULDER(50),
    BICYCLE_FACILITY_SHARROW(51),
    BICYCLE_FACILITY_SHARED_ROAD_WITH_PEDESTRIAN_PATH(52),
    BICYCLE_FACILITY_NEIGHBORHOOD_BIKEWAY(53);

    private final int m;

    ht(int i2) {
        this.m = i2;
    }

    public static ht a(int i2) {
        if (i2 == 1) {
            return BICYCLE_FACILITY_SEPARATE_TRAIL;
        }
        if (i2 == 2) {
            return BICYCLE_FACILITY_PEDESTRIAN_PATH;
        }
        if (i2 == 3) {
            return BICYCLE_FACILITY_SHARED_ROAD;
        }
        if (i2 == 33) {
            return BICYCLE_FACILITY_BIKE_FRIENDLY_PEDESTRIAN_PATH;
        }
        if (i2 == 785) {
            return BICYCLE_FACILITY_BIKE_LANE_WITH_PEDESTRIAN_PATH;
        }
        if (i2 == 786) {
            return BICYCLE_FACILITY_BIKE_LANE_BUFFERED;
        }
        switch (i2) {
            case 49:
                return BICYCLE_FACILITY_BIKE_LANE;
            case 50:
                return BICYCLE_FACILITY_WIDE_SHOULDER;
            case 51:
                return BICYCLE_FACILITY_SHARROW;
            case 52:
                return BICYCLE_FACILITY_SHARED_ROAD_WITH_PEDESTRIAN_PATH;
            case 53:
                return BICYCLE_FACILITY_NEIGHBORHOOD_BIKEWAY;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.m);
    }
}
