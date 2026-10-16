package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uki implements defpackage.abpc {
    private final /* synthetic */ int a;

    public uki(int i) {
        this.a = i;
    }

    @Override // defpackage.abpc
    public final /* synthetic */ defpackage.abpb a(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            if (i == 0) {
                return defpackage.ukj.DEFAULT;
            }
            if (i == 1) {
                return defpackage.ukj.DRAW_OVER_LABELS;
            }
            if (i == 2) {
                return defpackage.ukj.DRAW_OVER_LABELS_AND_CALLOUTS;
            }
            if (i == 3) {
                return defpackage.ukj.DRAW_OVER_BUILDINGS;
            }
            if (i != 5) {
                return null;
            }
            return defpackage.ukj.MAGIC_CARPET;
        }
        if (i2 == 1) {
            if (i == 0) {
                return defpackage.ukh.DEFAULT_LABEL_DRAW_ORDER;
            }
            if (i == 1) {
                return defpackage.ukh.CLIENT_INJECTED_LABELS;
            }
            if (i != 2) {
                return null;
            }
            return defpackage.ukh.CLIENT_INJECTED_LABELS_ABOVE_CALLOUTS;
        }
        if (i2 == 2) {
            if (i == 0) {
                return defpackage.ukk.WINDING_DEFAULT;
            }
            if (i != 1) {
                return null;
            }
            return defpackage.ukk.WINDING_NON_ZERO;
        }
        if (i == 65) {
            return defpackage.abgy.TYPE_TRANSIT_LINE;
        }
        if (i == 66) {
            return defpackage.abgy.TYPE_TRANSIT_STATION;
        }
        if (i == 81) {
            return defpackage.abgy.TYPE_MAN_MADE_STRUCTURE;
        }
        if (i == 82) {
            return defpackage.abgy.TYPE_NATURAL_FEATURE;
        }
        if (i == 817) {
            return defpackage.abgy.TYPE_LOCAL_DRIVABLE_ROAD;
        }
        if (i == 818) {
            return defpackage.abgy.TYPE_TRAIL;
        }
        switch (i) {
            case 0:
                return defpackage.abgy.TYPE_ALL;
            case 1:
                return defpackage.abgy.TYPE_ADMINISTRATIVE;
            case 2:
                return defpackage.abgy.TYPE_POI;
            case 3:
                return defpackage.abgy.TYPE_ROAD;
            case 4:
                return defpackage.abgy.TYPE_TRANSIT;
            case 5:
                return defpackage.abgy.TYPE_LANDSCAPE;
            case 6:
                return defpackage.abgy.TYPE_WATER;
            default:
                switch (i) {
                    case 17:
                        return defpackage.abgy.TYPE_COUNTRY;
                    case 18:
                        return defpackage.abgy.TYPE_ADMINISTRATIVE_AREA1;
                    case 19:
                        return defpackage.abgy.TYPE_LOCALITY;
                    case 20:
                        return defpackage.abgy.TYPE_NEIGHBORHOOD;
                    case 21:
                        return defpackage.abgy.TYPE_LAND_PARCEL;
                    default:
                        switch (i) {
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                return defpackage.abgy.TYPE_BUSINESS;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                return defpackage.abgy.TYPE_GOVERNMENT;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                return defpackage.abgy.TYPE_SCHOOL;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                                return defpackage.abgy.TYPE_MEDICAL;
                            case 37:
                                return defpackage.abgy.TYPE_ATTRACTION;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                return defpackage.abgy.TYPE_PLACE_OF_WORSHIP;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                return defpackage.abgy.TYPE_SPORTS_COMPLEX;
                            case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                return defpackage.abgy.TYPE_PARK;
                            case 785:
                                return defpackage.abgy.TYPE_CONTROLLED_ACCESS_HIGHWAY;
                            case 1057:
                                return defpackage.abgy.TYPE_RAIL_STATION;
                            case 1058:
                                return defpackage.abgy.TYPE_BUS_STOP;
                            case 1059:
                                return defpackage.abgy.TYPE_AIRPORT;
                            case 1060:
                                return defpackage.abgy.TYPE_FERRY_TERMINAL;
                            case 1297:
                                return defpackage.abgy.TYPE_BUILDING;
                            case 1298:
                                return defpackage.abgy.TYPE_BUILT_UP_AREA;
                            case 1299:
                                return defpackage.abgy.TYPE_AREA_OF_INTEREST;
                            case 1313:
                                return defpackage.abgy.TYPE_LANDCOVER;
                            case 1314:
                                return defpackage.abgy.TYPE_TERRAIN;
                            default:
                                switch (i) {
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                        return defpackage.abgy.TYPE_HIGHWAY;
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                        return defpackage.abgy.TYPE_ARTERIAL_ROAD;
                                    case 51:
                                        return defpackage.abgy.TYPE_LOCAL_ROAD;
                                    case 52:
                                        return defpackage.abgy.TYPE_LANE;
                                    default:
                                        switch (i) {
                                            case 273:
                                                return defpackage.abgy.TYPE_INTERNATIONAL_DISPUTED_BORDER;
                                            case 274:
                                                return defpackage.abgy.TYPE_TREATY_OR_PROVISIONAL_INTERNATIONAL_BORDER;
                                            case 275:
                                                return defpackage.abgy.TYPE_BORDER_ADMINISTRATIVE;
                                            default:
                                                switch (i) {
                                                    case 529:
                                                        return defpackage.abgy.TYPE_SHOPPING;
                                                    case 530:
                                                        return defpackage.abgy.TYPE_FOOD_AND_DRINK;
                                                    case 531:
                                                        return defpackage.abgy.TYPE_GAS_STATION;
                                                    case 532:
                                                        return defpackage.abgy.TYPE_CAR_RENTAL;
                                                    case 533:
                                                        return defpackage.abgy.TYPE_LODGING;
                                                    default:
                                                        switch (i) {
                                                            case 1041:
                                                                return defpackage.abgy.TYPE_RAIL_LINE;
                                                            case 1042:
                                                                return defpackage.abgy.TYPE_FERRY_LINE;
                                                            case 1043:
                                                                return defpackage.abgy.TYPE_TRANSIT_LAYER_LINE;
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
