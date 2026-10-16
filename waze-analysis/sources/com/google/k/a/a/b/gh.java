package com.google.k.a.a.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum gh implements com.google.v.eg {
    RESTRICTION_TRAVEL_RESTRICTED(17),
    RESTRICTION_ILLEGAL(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS),
    RESTRICTION_PHYSICAL(DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION),
    RESTRICTION_LOGICAL(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER),
    RESTRICTION_GATE(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER_BEST),
    RESTRICTION_CONSTRUCTION(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_LIGHTER),
    RESTRICTION_SEASONAL_CLOSURE(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_USUAL),
    RESTRICTION_PRIVATE(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_UNITS_PS),
    RESTRICTION_WRONG_WAY(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_LINK),
    RESTRICTION_TERMINAL(DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_DIALOG_TITLE),
    RESTRICTION_PAYMENT_REQUIRED(18),
    RESTRICTION_TOLL_BOOTH(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_TOLLS),
    RESTRICTION_USAGE_FEE_REQUIRED(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_FERRIES),
    RESTRICTION_ENTRANCE_FEE_REQUIRED(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_DIALOG_TITLE_TEXT_PS),
    RESTRICTION_VIGNETTE_REQUIRED(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_DIALOG_TITLE_TEXT_PS_PS),
    RESTRICTION_TOLL_REQUIRED(DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_DIALOG_BODY_TEXT),
    RESTRICTION_TOLL_FULL(4689),
    RESTRICTION_TOLL_REDUCED(4690),
    RESTRICTION_ADVISORY(19),
    RESTRICTION_HIGH_CRIME(305),
    RESTRICTION_POLITICALLY_SENSITIVE(306),
    RESTRICTION_DISTURBED_BY_MAINTENANCE(307),
    RESTRICTION_CHECKPOINT(308),
    RESTRICTION_REGION_SPECIFIC(20);

    private final int z;

    gh(int i2) {
        this.z = i2;
    }

    public static gh a(int i2) {
        if (i2 == 4689) {
            return RESTRICTION_TOLL_FULL;
        }
        if (i2 == 4690) {
            return RESTRICTION_TOLL_REDUCED;
        }
        switch (i2) {
            case 17:
                return RESTRICTION_TRAVEL_RESTRICTED;
            case 18:
                return RESTRICTION_PAYMENT_REQUIRED;
            case 19:
                return RESTRICTION_ADVISORY;
            case 20:
                return RESTRICTION_REGION_SPECIFIC;
            default:
                switch (i2) {
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_CARD_EXTRA_INFO_PS_PS /* 273 */:
                        return RESTRICTION_ILLEGAL;
                    case DisplayStrings.DS_TRIP_OVERVIEW_CURRENT_LOCATION /* 274 */:
                        return RESTRICTION_PHYSICAL;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER /* 275 */:
                        return RESTRICTION_LOGICAL;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_HEAVIER_BEST /* 276 */:
                        return RESTRICTION_GATE;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_LIGHTER /* 277 */:
                        return RESTRICTION_CONSTRUCTION;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_LABEL_TRAFFIC_STATUS_USUAL /* 278 */:
                        return RESTRICTION_SEASONAL_CLOSURE;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_UNITS_PS /* 279 */:
                        return RESTRICTION_PRIVATE;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_LINK /* 280 */:
                        return RESTRICTION_WRONG_WAY;
                    case DisplayStrings.DS_TRIP_OVERVIEW_ECO_REGULATIONS_CARBON_EMISSION_DIALOG_TITLE /* 281 */:
                        return RESTRICTION_TERMINAL;
                    default:
                        switch (i2) {
                            case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_TOLLS /* 289 */:
                                return RESTRICTION_TOLL_BOOTH;
                            case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_PARAM_FERRIES /* 290 */:
                                return RESTRICTION_USAGE_FEE_REQUIRED;
                            case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_DIALOG_TITLE_TEXT_PS /* 291 */:
                                return RESTRICTION_ENTRANCE_FEE_REQUIRED;
                            case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_DIALOG_TITLE_TEXT_PS_PS /* 292 */:
                                return RESTRICTION_VIGNETTE_REQUIRED;
                            case DisplayStrings.DS_TRIP_OVERVIEW_ROUTE_SETTINGS_DIALOG_BODY_TEXT /* 293 */:
                                return RESTRICTION_TOLL_REQUIRED;
                            default:
                                switch (i2) {
                                    case 305:
                                        return RESTRICTION_HIGH_CRIME;
                                    case 306:
                                        return RESTRICTION_POLITICALLY_SENSITIVE;
                                    case 307:
                                        return RESTRICTION_DISTURBED_BY_MAINTENANCE;
                                    case 308:
                                        return RESTRICTION_CHECKPOINT;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static com.google.v.ei b() {
        return dq.f11280l;
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
