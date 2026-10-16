package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tno {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code duplicated, block: B:29:0x004d A[FALL_THROUGH] */
    /* JADX WARN: Switch 'out' block B:29:0x004d for B:26:0x0046 already processed. Defaulting to fallback option. */
    static {
        int[] iArrA = defpackage.abry.a();
        int iMax = 0;
        for (int i = 0; i < 86; i++) {
            int i2 = iArrA[i];
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            iMax = java.lang.Math.max(iMax, i3);
        }
        defpackage.adpj[] adpjVarArr = new defpackage.adpj[iMax + 1];
        int[] iArrA2 = defpackage.abry.a();
        for (int i4 = 0; i4 < 86; i4++) {
            int i5 = iArrA2[i4];
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 != 17 && i6 != 27 && i6 != 78 && i6 != 82 && i6 != 86 && i6 != 87) {
                switch (i6) {
                    default:
                        switch (i6) {
                            default:
                                switch (i6) {
                                    default:
                                        switch (i6) {
                                            case 56:
                                            case 57:
                                            case 58:
                                            case 59:
                                            case 60:
                                            case 61:
                                            case 62:
                                            case 63:
                                            case androidx.car.app.hardware.common.CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                            case 65:
                                            case 66:
                                            case 67:
                                            case 68:
                                            case 69:
                                            case 70:
                                            case 71:
                                            case 72:
                                            case 73:
                                                break;
                                            default:
                                                continue;
                                        }
                                    case 31:
                                    case 32:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_STRAIGHT /* 36 */:
                                    case 37:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION /* 39 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                                    case 48:
                                    case androidx.car.app.navigation.model.Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                        defpackage.adpj adpjVar = new defpackage.adpj();
                                        adpjVarArr[i6] = adpjVar;
                                        int i7 = defpackage.ygw.d;
                                        adpjVar.a = defpackage.ymx.a;
                                        break;
                                }
                            case 19:
                            case 20:
                            case 21:
                                defpackage.adpj adpjVar2 = new defpackage.adpj();
                                adpjVarArr[i6] = adpjVar2;
                                int i8 = defpackage.ygw.d;
                                adpjVar2.a = defpackage.ymx.a;
                                break;
                        }
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        defpackage.adpj adpjVar3 = new defpackage.adpj();
                        adpjVarArr[i6] = adpjVar3;
                        int i9 = defpackage.ygw.d;
                        adpjVar3.a = defpackage.ymx.a;
                        break;
                }
            } else {
                defpackage.adpj adpjVar4 = new defpackage.adpj();
                adpjVarArr[i6] = adpjVar4;
                int i10 = defpackage.ygw.d;
                adpjVar4.a = defpackage.ymx.a;
            }
        }
    }
}
