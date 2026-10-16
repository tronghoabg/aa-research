package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jfq implements defpackage.rqs {
    private static final defpackage.yqm a = defpackage.yqm.c("CAR.ANALYTICS");
    private final defpackage.ikg b;

    public jfq(defpackage.ikg ikgVar) {
        this.b = ikgVar;
    }

    @Override // defpackage.rqs
    public final defpackage.rqo a() {
        defpackage.ild ildVar;
        defpackage.yzk yzkVar;
        j$.util.Optional optionalX = ((defpackage.imi) this.b).X();
        if (optionalX.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.f()).ai((char) 317)).u("CarConnection is missing, so returning null CarSensorService");
            ildVar = null;
        } else {
            ildVar = ((defpackage.iuk) optionalX.get()).C;
        }
        defpackage.wzs wzsVar = new defpackage.wzs(null);
        if (ildVar != null) {
            try {
                com.google.android.gms.car.CarSensorEvent carSensorEventI = ildVar.i(2);
                if (carSensorEventI != null) {
                    wzsVar.e((int) (carSensorEventI.d[0] * 1000.0f));
                }
                com.google.android.gms.car.CarSensorEvent carSensorEventI2 = ildVar.i(9);
                if (carSensorEventI2 != null) {
                    wzsVar.d(carSensorEventI2.e[0] != 0);
                }
                com.google.android.gms.car.CarSensorEvent carSensorEventI3 = ildVar.i(11);
                if (carSensorEventI3 != null) {
                    wzsVar.b(carSensorEventI3.e[0]);
                }
                com.google.android.gms.car.CarSensorEvent carSensorEventI4 = ildVar.i(7);
                if (carSensorEventI4 != null) {
                    byte b = carSensorEventI4.e[0];
                    switch (b) {
                        case defpackage.abnt.b /* 0 */:
                            yzkVar = defpackage.yzk.GEAR_NEUTRAL;
                            break;
                        case 1:
                            yzkVar = defpackage.yzk.GEAR_1;
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            yzkVar = defpackage.yzk.GEAR_2;
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            yzkVar = defpackage.yzk.GEAR_3;
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            yzkVar = defpackage.yzk.GEAR_4;
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            yzkVar = defpackage.yzk.GEAR_5;
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            yzkVar = defpackage.yzk.GEAR_6;
                            break;
                        default:
                            switch (b) {
                                case 100:
                                    yzkVar = defpackage.yzk.GEAR_DRIVE;
                                    break;
                                case 101:
                                    yzkVar = defpackage.yzk.GEAR_PARK;
                                    break;
                                case 102:
                                    yzkVar = defpackage.yzk.GEAR_REVERSE;
                                    break;
                                default:
                                    yzkVar = defpackage.yzk.UNKNOWN_GEAR;
                                    break;
                            }
                            break;
                    }
                } else {
                    yzkVar = defpackage.yzk.UNKNOWN_GEAR;
                }
                wzsVar.c(yzkVar);
            } catch (java.lang.IllegalStateException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e)).ai((char) 1993)).u("Failure reading sensor info");
            }
        }
        return wzsVar.a();
    }
}
