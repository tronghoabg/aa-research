package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum ij implements com.google.v.eg {
    USAGE_ANY(0),
    USAGE_RAMP(17),
    USAGE_ON_RAMP(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS),
    USAGE_OFF_RAMP(DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION),
    USAGE_ON_OFF_RAMP(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER),
    USAGE_INTERCHANGE(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER_BEST),
    USAGE_SPECIAL_TRAFFIC_FIGURE(18),
    USAGE_ROUNDABOUT(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_TOLLS),
    USAGE_ROUNDABOUT_BYPASS(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_FERRIES),
    USAGE_ROUNDABOUT_INTERNAL_BYPASS(4641),
    USAGE_ROUNDABOUT_EXTERNAL_BYPASS(4642),
    USAGE_ENCLOSED_TRAFFIC_AREA(19),
    USAGE_PEDESTRIAN_MALL(20),
    USAGE_MAJOR_PEDESTRIAN_MALL(DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_USUAL_ROUTE),
    USAGE_MINOR_PEDESTRIAN_MALL(DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_CRASH_PS),
    USAGE_WALKWAY(21),
    USAGE_TRAIL(22),
    USAGE_STATION_PATH(23),
    USAGE_ACCESS_PATH(24),
    USAGE_CROSSING(25),
    USAGE_MARKED_CROSSING(401),
    USAGE_UNMARKED_CROSSING(402),
    USAGE_OVERPASS(26),
    USAGE_UNDERPASS(27),
    USAGE_HALLWAY(28),
    USAGE_TURN_SEGMENT(29),
    USAGE_INDOOR_CONNECTION_PATH(30);

    private final int C;

    ij(int i2) {
        this.C = i2;
    }

    public static ij a(int i2) {
        if (i2 == 0) {
            return USAGE_ANY;
        }
        if (i2 == 289) {
            return USAGE_ROUNDABOUT;
        }
        if (i2 == 290) {
            return USAGE_ROUNDABOUT_BYPASS;
        }
        if (i2 == 321) {
            return USAGE_MAJOR_PEDESTRIAN_MALL;
        }
        if (i2 == 322) {
            return USAGE_MINOR_PEDESTRIAN_MALL;
        }
        if (i2 == 401) {
            return USAGE_MARKED_CROSSING;
        }
        if (i2 == 402) {
            return USAGE_UNMARKED_CROSSING;
        }
        if (i2 == 4641) {
            return USAGE_ROUNDABOUT_INTERNAL_BYPASS;
        }
        if (i2 == 4642) {
            return USAGE_ROUNDABOUT_EXTERNAL_BYPASS;
        }
        switch (i2) {
            case 17:
                return USAGE_RAMP;
            case 18:
                return USAGE_SPECIAL_TRAFFIC_FIGURE;
            case 19:
                return USAGE_ENCLOSED_TRAFFIC_AREA;
            case 20:
                return USAGE_PEDESTRIAN_MALL;
            case 21:
                return USAGE_WALKWAY;
            case 22:
                return USAGE_TRAIL;
            case 23:
                return USAGE_STATION_PATH;
            case 24:
                return USAGE_ACCESS_PATH;
            case 25:
                return USAGE_CROSSING;
            case 26:
                return USAGE_OVERPASS;
            case 27:
                return USAGE_UNDERPASS;
            case 28:
                return USAGE_HALLWAY;
            case 29:
                return USAGE_TURN_SEGMENT;
            case 30:
                return USAGE_INDOOR_CONNECTION_PATH;
            default:
                switch (i2) {
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS /* 273 */:
                        return USAGE_ON_RAMP;
                    case DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION /* 274 */:
                        return USAGE_OFF_RAMP;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER /* 275 */:
                        return USAGE_ON_OFF_RAMP;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER_BEST /* 276 */:
                        return USAGE_INTERCHANGE;
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
