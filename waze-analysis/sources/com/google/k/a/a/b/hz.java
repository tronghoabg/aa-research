package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hz implements com.google.v.eg {
    ENDPOINT_UNKNOWN(17),
    ENDPOINT_UNRESTRICTED(18),
    ENDPOINT_UNCONTROLLED(19),
    ENDPOINT_STOP_SIGN(20),
    ENDPOINT_ALL_WAY_STOP(DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_USUAL_ROUTE),
    ENDPOINT_TRAFFIC_LIGHT(21),
    ENDPOINT_THREE_WAY(DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_INFO_SCREEN_TOLL_MESSAGE),
    ENDPOINT_FLASHING_RED(DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_INFO_SCREEN_CARBON_EMISSION_TITLE),
    ENDPOINT_FLASHING_YELLOW(DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_INFO_SCREEN_CARBON_EMISSION_MESSAGE),
    ENDPOINT_YIELD(22),
    ENDPOINT_MERGE(23),
    ENDPOINT_ROUNDABOUT(24),
    ENDPOINT_RAILROAD_CROSSING(25),
    ENDPOINT_NO_EXIT(26),
    ENDPOINT_WRONG_WAY(27),
    ENDPOINT_TOLL_BOOTH(28);

    private final int r;

    hz(int i2) {
        this.r = i2;
    }

    public static hz a(int i2) {
        if (i2 == 321) {
            return ENDPOINT_ALL_WAY_STOP;
        }
        switch (i2) {
            case 17:
                return ENDPOINT_UNKNOWN;
            case 18:
                return ENDPOINT_UNRESTRICTED;
            case 19:
                return ENDPOINT_UNCONTROLLED;
            case 20:
                return ENDPOINT_STOP_SIGN;
            case 21:
                return ENDPOINT_TRAFFIC_LIGHT;
            case 22:
                return ENDPOINT_YIELD;
            case 23:
                return ENDPOINT_MERGE;
            case 24:
                return ENDPOINT_ROUNDABOUT;
            case 25:
                return ENDPOINT_RAILROAD_CROSSING;
            case 26:
                return ENDPOINT_NO_EXIT;
            case 27:
                return ENDPOINT_WRONG_WAY;
            case 28:
                return ENDPOINT_TOLL_BOOTH;
            default:
                switch (i2) {
                    case DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_INFO_SCREEN_TOLL_MESSAGE /* 337 */:
                        return ENDPOINT_THREE_WAY;
                    case DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_INFO_SCREEN_CARBON_EMISSION_TITLE /* 338 */:
                        return ENDPOINT_FLASHING_RED;
                    case DisplayStrings.DS_CARPLAY_TRIP_OVERVIEW_INFO_SCREEN_CARBON_EMISSION_MESSAGE /* 339 */:
                        return ENDPOINT_FLASHING_YELLOW;
                    default:
                        return null;
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.r;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.r);
    }
}
