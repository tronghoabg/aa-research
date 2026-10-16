package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.gms.car.CarSensorEvent;
import j$.util.Optional;

/* loaded from: classes.dex */
public final class jfi implements rpy {
    private static final yph a = yph.c("CAR.ANALYTICS");
    private final ijx b;

    public jfi(ijx ijxVar) {
        this.b = ijxVar;
    }

    @Override // defpackage.rpy
    public final rpu a() {
        ikt iktVar;
        yyf yyfVar;
        Optional optionalX = ((ima) this.b).X();
        if (optionalX.isEmpty()) {
            ((ype) ((ype) ima.b.f()).ai((char) 317)).u("CarConnection is missing, so returning null CarSensorService");
            iktVar = null;
        } else {
            iktVar = ((iuc) optionalX.get()).C;
        }
        wyw wywVar = new wyw(null);
        if (iktVar != null) {
            try {
                CarSensorEvent carSensorEventI = iktVar.i(2);
                if (carSensorEventI != null) {
                    wywVar.e((int) (carSensorEventI.d[0] * 1000.0f));
                }
                CarSensorEvent carSensorEventI2 = iktVar.i(9);
                if (carSensorEventI2 != null) {
                    wywVar.d(carSensorEventI2.e[0] != 0);
                }
                CarSensorEvent carSensorEventI3 = iktVar.i(11);
                if (carSensorEventI3 != null) {
                    wywVar.b(carSensorEventI3.e[0]);
                }
                CarSensorEvent carSensorEventI4 = iktVar.i(7);
                if (carSensorEventI4 != null) {
                    byte b = carSensorEventI4.e[0];
                    switch (b) {
                        case 0:
                            yyfVar = yyf.GEAR_NEUTRAL;
                            break;
                        case 1:
                            yyfVar = yyf.GEAR_1;
                            break;
                        case 2:
                            yyfVar = yyf.GEAR_2;
                            break;
                        case 3:
                            yyfVar = yyf.GEAR_3;
                            break;
                        case 4:
                            yyfVar = yyf.GEAR_4;
                            break;
                        case 5:
                            yyfVar = yyf.GEAR_5;
                            break;
                        case 6:
                            yyfVar = yyf.GEAR_6;
                            break;
                        default:
                            switch (b) {
                                case 100:
                                    yyfVar = yyf.GEAR_DRIVE;
                                    break;
                                case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                                    yyfVar = yyf.GEAR_PARK;
                                    break;
                                case 102:
                                    yyfVar = yyf.GEAR_REVERSE;
                                    break;
                                default:
                                    yyfVar = yyf.UNKNOWN_GEAR;
                                    break;
                            }
                    }
                } else {
                    yyfVar = yyf.UNKNOWN_GEAR;
                }
                wywVar.c(yyfVar);
            } catch (IllegalStateException e) {
                ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 1993)).u("Failure reading sensor info");
            }
        }
        return wywVar.a();
    }
}
