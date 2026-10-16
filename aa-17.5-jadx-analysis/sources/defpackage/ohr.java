package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ohr implements rpy {
    private static final yph b = yph.c("GH.CarSensorReader");
    public final AtomicReference a = new AtomicReference();

    public ohr() {
        ohq ohqVar = new ohq(this);
        yph yphVar = kio.a;
        ((kio) mki.a.i(kio.class)).v(ohqVar);
    }

    private static boolean b(qsf qsfVar) {
        byte[] bArr;
        return (qsfVar == null || (bArr = qsfVar.d) == null || bArr.length <= 0) ? false : true;
    }

    @Override // defpackage.rpy
    public final rpu a() {
        qrn qrnVar;
        qsf qsfVarA;
        float[] fArr;
        yyf yyfVar;
        wyw wywVar = new wyw(null);
        try {
            mki.a.f();
            qrnVar = (qrn) this.a.get();
        } catch (IllegalStateException | qrz | qsa e) {
            ((ype) ((ype) ((ype) ((ype) b.h()).p(e)).l(10, TimeUnit.SECONDS)).ai(5945)).u("Could not completely fetch sensor data!");
        }
        if (qrnVar != null && qrnVar.b()) {
            roj rojVarY = qrnVar.a().y();
            if (((mdk) mki.a.i(mdk.class)).r() && (qsfVarA = rojVarY.a(2)) != null && (fArr = qsfVarA.c) != null && fArr.length > 0) {
                wywVar.e((int) (fArr[0] * 1000.0f));
            }
            qsf qsfVarA2 = rojVarY.a(9);
            if (b(qsfVarA2)) {
                wywVar.d(qsfVarA2.d[0] != 0);
            }
            qsf qsfVarA3 = rojVarY.a(11);
            if (b(qsfVarA3)) {
                wywVar.b(qsfVarA3.d[0]);
            }
            qsf qsfVarA4 = rojVarY.a(7);
            if (b(qsfVarA4)) {
                byte b2 = qsfVarA4.d[0];
                switch (b2) {
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
                        switch (b2) {
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
            return wywVar.a();
        }
        return wywVar.a();
    }
}
