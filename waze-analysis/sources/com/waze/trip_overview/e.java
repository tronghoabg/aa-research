package com.waze.trip_overview;

import com.waze.config.ConfigValues;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements cb {
    @Override // com.waze.trip_overview.cb
    public final boolean a(com.waze.modules.navigation.ah ahVar) {
        h.g.b.x.f(ahVar, "caller");
        com.waze.modules.navigation.ah ahVar2 = com.waze.modules.navigation.ah.f30285a;
        switch (ahVar.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            case 8:
            case 9:
                return false;
            case 10:
            case 11:
            case 12:
                return true;
            case 13:
                return false;
            case 14:
                return true;
            case 15:
            case 16:
            case 17:
                return false;
            case 18:
            case 19:
                return true;
            case 20:
                return ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_SHOW_FROM_AAOS_ADDRESS_PREVIEW.b().booleanValue() && ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_V2_API_ENABLED.b().booleanValue();
            case 21:
                return ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_SHOW_FROM_AAOS_SEARCH.b().booleanValue() && ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_V2_API_ENABLED.b().booleanValue();
            case 22:
                return ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_SHOW_FROM_AAOS_START_STATE.b().booleanValue() && ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_V2_API_ENABLED.b().booleanValue();
            case 23:
                return ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_SHOW_FROM_AAOS_PREDICTION_CARD.b().booleanValue() && ConfigValues.CONFIG_VALUE_TRIP_OVERVIEW_V2_API_ENABLED.b().booleanValue();
            case 24:
                return false;
            case 25:
                return true;
            case 26:
            case 27:
                return false;
            default:
                throw new h.i();
        }
    }
}
