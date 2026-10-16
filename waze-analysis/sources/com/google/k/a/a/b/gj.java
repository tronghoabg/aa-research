package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gj implements com.google.v.eg {
    TRAVEL_ANY(0),
    TRAVEL_MOTOR_VEHICLE(17),
    TRAVEL_AUTO(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS),
    TRAVEL_CARPOOL(DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION),
    TRAVEL_MOTORCYCLE(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER),
    TRAVEL_BUS(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER_BEST),
    TRAVEL_TRUCK(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_LIGHTER),
    TRAVEL_DELIVERY(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_USUAL),
    TRAVEL_TAXI(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_UNITS_PS),
    TRAVEL_EMERGENCY(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_LINK),
    TRAVEL_THROUGH_TRAFFIC(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_DIALOG_TITLE),
    TRAVEL_AUTONOMOUS_VEHICLE(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_DIALOG_MESSAGE),
    TRAVEL_PEDESTRIAN(18),
    TRAVEL_BICYCLE(19);

    private final int p;

    gj(int i2) {
        this.p = i2;
    }

    public static gj a(int i2) {
        if (i2 == 0) {
            return TRAVEL_ANY;
        }
        switch (i2) {
            case 17:
                return TRAVEL_MOTOR_VEHICLE;
            case 18:
                return TRAVEL_PEDESTRIAN;
            case 19:
                return TRAVEL_BICYCLE;
            default:
                switch (i2) {
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS /* 273 */:
                        return TRAVEL_AUTO;
                    case DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION /* 274 */:
                        return TRAVEL_CARPOOL;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER /* 275 */:
                        return TRAVEL_MOTORCYCLE;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER_BEST /* 276 */:
                        return TRAVEL_BUS;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_LIGHTER /* 277 */:
                        return TRAVEL_TRUCK;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_USUAL /* 278 */:
                        return TRAVEL_DELIVERY;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_UNITS_PS /* 279 */:
                        return TRAVEL_TAXI;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_LINK /* 280 */:
                        return TRAVEL_EMERGENCY;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_DIALOG_TITLE /* 281 */:
                        return TRAVEL_THROUGH_TRAFFIC;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_DIALOG_MESSAGE /* 282 */:
                        return TRAVEL_AUTONOMOUS_VEHICLE;
                    default:
                        return null;
                }
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
