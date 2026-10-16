package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum kl implements com.google.v.eg {
    VEHICLE_TYPE_ANY(0),
    VEHICLE_TYPE_RAIL(1),
    VEHICLE_TYPE_METRO_RAIL(17),
    VEHICLE_TYPE_SUBWAY(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS),
    VEHICLE_TYPE_TRAM(DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION),
    VEHICLE_TYPE_MONORAIL(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER),
    VEHICLE_TYPE_HEAVY_RAIL(18),
    VEHICLE_TYPE_COMMUTER_TRAIN(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_TOLLS),
    VEHICLE_TYPE_HIGH_SPEED_TRAIN(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_FERRIES),
    VEHICLE_TYPE_LONG_DISTANCE_TRAIN(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_DIALOG_TITLE_TEXT_PS),
    VEHICLE_TYPE_BUS(2),
    VEHICLE_TYPE_INTERCITY_BUS(33),
    VEHICLE_TYPE_TROLLEYBUS(34),
    VEHICLE_TYPE_SHARE_TAXI(35),
    VEHICLE_TYPE_FERRY(3),
    VEHICLE_TYPE_CABLE_CAR(4),
    VEHICLE_TYPE_GONDOLA_LIFT(65),
    VEHICLE_TYPE_FUNICULAR(66),
    VEHICLE_TYPE_SPECIAL(5),
    VEHICLE_TYPE_HORSE_CARRIAGE(81),
    VEHICLE_TYPE_AIRPLANE(6);

    private final int w;

    kl(int i2) {
        this.w = i2;
    }

    public static kl a(int i2) {
        if (i2 == 17) {
            return VEHICLE_TYPE_METRO_RAIL;
        }
        if (i2 == 18) {
            return VEHICLE_TYPE_HEAVY_RAIL;
        }
        if (i2 == 65) {
            return VEHICLE_TYPE_GONDOLA_LIFT;
        }
        if (i2 == 66) {
            return VEHICLE_TYPE_FUNICULAR;
        }
        if (i2 == 81) {
            return VEHICLE_TYPE_HORSE_CARRIAGE;
        }
        switch (i2) {
            case 0:
                return VEHICLE_TYPE_ANY;
            case 1:
                return VEHICLE_TYPE_RAIL;
            case 2:
                return VEHICLE_TYPE_BUS;
            case 3:
                return VEHICLE_TYPE_FERRY;
            case 4:
                return VEHICLE_TYPE_CABLE_CAR;
            case 5:
                return VEHICLE_TYPE_SPECIAL;
            case 6:
                return VEHICLE_TYPE_AIRPLANE;
            default:
                switch (i2) {
                    case 33:
                        return VEHICLE_TYPE_INTERCITY_BUS;
                    case 34:
                        return VEHICLE_TYPE_TROLLEYBUS;
                    case 35:
                        return VEHICLE_TYPE_SHARE_TAXI;
                    default:
                        switch (i2) {
                            case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS /* 273 */:
                                return VEHICLE_TYPE_SUBWAY;
                            case DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION /* 274 */:
                                return VEHICLE_TYPE_TRAM;
                            case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER /* 275 */:
                                return VEHICLE_TYPE_MONORAIL;
                            default:
                                switch (i2) {
                                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_TOLLS /* 289 */:
                                        return VEHICLE_TYPE_COMMUTER_TRAIN;
                                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_FERRIES /* 290 */:
                                        return VEHICLE_TYPE_HIGH_SPEED_TRAIN;
                                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_DIALOG_TITLE_TEXT_PS /* 291 */:
                                        return VEHICLE_TYPE_LONG_DISTANCE_TRAIN;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }
}
