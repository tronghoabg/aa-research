package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* loaded from: classes3.dex */
public final class ujn implements aboa {
    private final /* synthetic */ int a;

    public ujn(int i) {
        this.a = i;
    }

    @Override // defpackage.aboa
    public final /* synthetic */ abnz a(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            if (i == 0) {
                return ujo.DEFAULT;
            }
            if (i == 1) {
                return ujo.DRAW_OVER_LABELS;
            }
            if (i == 2) {
                return ujo.DRAW_OVER_LABELS_AND_CALLOUTS;
            }
            if (i == 3) {
                return ujo.DRAW_OVER_BUILDINGS;
            }
            if (i != 5) {
                return null;
            }
            return ujo.MAGIC_CARPET;
        }
        if (i2 == 1) {
            if (i == 0) {
                return ujm.DEFAULT_LABEL_DRAW_ORDER;
            }
            if (i == 1) {
                return ujm.CLIENT_INJECTED_LABELS;
            }
            if (i != 2) {
                return null;
            }
            return ujm.CLIENT_INJECTED_LABELS_ABOVE_CALLOUTS;
        }
        if (i2 == 2) {
            if (i == 0) {
                return ujp.WINDING_DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return ujp.WINDING_NON_ZERO;
        }
        if (i == 65) {
            return abfv.TYPE_TRANSIT_LINE;
        }
        if (i == 66) {
            return abfv.TYPE_TRANSIT_STATION;
        }
        if (i == 81) {
            return abfv.TYPE_MAN_MADE_STRUCTURE;
        }
        if (i == 82) {
            return abfv.TYPE_NATURAL_FEATURE;
        }
        if (i == 817) {
            return abfv.TYPE_LOCAL_DRIVABLE_ROAD;
        }
        if (i == 818) {
            return abfv.TYPE_TRAIL;
        }
        switch (i) {
            case 0:
                return abfv.TYPE_ALL;
            case 1:
                return abfv.TYPE_ADMINISTRATIVE;
            case 2:
                return abfv.TYPE_POI;
            case 3:
                return abfv.TYPE_ROAD;
            case 4:
                return abfv.TYPE_TRANSIT;
            case 5:
                return abfv.TYPE_LANDSCAPE;
            case 6:
                return abfv.TYPE_WATER;
            default:
                switch (i) {
                    case 17:
                        return abfv.TYPE_COUNTRY;
                    case 18:
                        return abfv.TYPE_ADMINISTRATIVE_AREA1;
                    case 19:
                        return abfv.TYPE_LOCALITY;
                    case 20:
                        return abfv.TYPE_NEIGHBORHOOD;
                    case 21:
                        return abfv.TYPE_LAND_PARCEL;
                    default:
                        switch (i) {
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                return abfv.TYPE_BUSINESS;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                return abfv.TYPE_GOVERNMENT;
                            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                return abfv.TYPE_SCHOOL;
                            case Maneuver.TYPE_STRAIGHT /* 36 */:
                                return abfv.TYPE_MEDICAL;
                            case 37:
                                return abfv.TYPE_ATTRACTION;
                            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                return abfv.TYPE_PLACE_OF_WORSHIP;
                            case Maneuver.TYPE_DESTINATION /* 39 */:
                                return abfv.TYPE_SPORTS_COMPLEX;
                            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                return abfv.TYPE_PARK;
                            case 785:
                                return abfv.TYPE_CONTROLLED_ACCESS_HIGHWAY;
                            case 1057:
                                return abfv.TYPE_RAIL_STATION;
                            case 1058:
                                return abfv.TYPE_BUS_STOP;
                            case 1059:
                                return abfv.TYPE_AIRPORT;
                            case 1060:
                                return abfv.TYPE_FERRY_TERMINAL;
                            case 1297:
                                return abfv.TYPE_BUILDING;
                            case 1298:
                                return abfv.TYPE_BUILT_UP_AREA;
                            case 1299:
                                return abfv.TYPE_AREA_OF_INTEREST;
                            case 1313:
                                return abfv.TYPE_LANDCOVER;
                            case 1314:
                                return abfv.TYPE_TERRAIN;
                            default:
                                switch (i) {
                                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                        return abfv.TYPE_HIGHWAY;
                                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                        return abfv.TYPE_ARTERIAL_ROAD;
                                    case 51:
                                        return abfv.TYPE_LOCAL_ROAD;
                                    case 52:
                                        return abfv.TYPE_LANE;
                                    default:
                                        switch (i) {
                                            case 273:
                                                return abfv.TYPE_INTERNATIONAL_DISPUTED_BORDER;
                                            case 274:
                                                return abfv.TYPE_TREATY_OR_PROVISIONAL_INTERNATIONAL_BORDER;
                                            case 275:
                                                return abfv.TYPE_BORDER_ADMINISTRATIVE;
                                            default:
                                                switch (i) {
                                                    case 529:
                                                        return abfv.TYPE_SHOPPING;
                                                    case 530:
                                                        return abfv.TYPE_FOOD_AND_DRINK;
                                                    case 531:
                                                        return abfv.TYPE_GAS_STATION;
                                                    case 532:
                                                        return abfv.TYPE_CAR_RENTAL;
                                                    case 533:
                                                        return abfv.TYPE_LODGING;
                                                    default:
                                                        switch (i) {
                                                            case 1041:
                                                                return abfv.TYPE_RAIL_LINE;
                                                            case 1042:
                                                                return abfv.TYPE_FERRY_LINE;
                                                            case 1043:
                                                                return abfv.TYPE_TRANSIT_LAYER_LINE;
                                                            default:
                                                                return null;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }
}
