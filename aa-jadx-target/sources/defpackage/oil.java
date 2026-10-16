package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oil implements defpackage.rqs {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.CarSensorReader");
    public final java.util.concurrent.atomic.AtomicReference a = new java.util.concurrent.atomic.AtomicReference();

    public oil() {
        defpackage.oik oikVar = new defpackage.oik(this);
        defpackage.yqm yqmVar = defpackage.kit.a;
        ((defpackage.kit) defpackage.mkp.a.i(defpackage.kit.class)).v(oikVar);
    }

    private static boolean b(defpackage.qsz qszVar) {
        byte[] bArr;
        return (qszVar == null || (bArr = qszVar.d) == null || bArr.length <= 0) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    @Override // defpackage.rqs
    public final defpackage.rqo a() throws rlo {
        defpackage.qsz qszVarA;
        float[] fArr;
        defpackage.yzk yzkVar;
        defpackage.wzs wzsVar = new defpackage.wzs(null);
        try {
            defpackage.mkp.a.f();
            defpackage.qsh qshVar = (defpackage.qsh) this.a.get();
            if (qshVar != null && qshVar.b()) {
                defpackage.rpe rpeVarY = qshVar.a().y();
                if (((defpackage.mds) defpackage.mkp.a.i(defpackage.mds.class)).r() && (qszVarA = rpeVarY.a(2)) != null && (fArr = qszVarA.c) != null && fArr.length > 0) {
                    wzsVar.e((int) (fArr[0] * 1000.0f));
                }
                defpackage.qsz qszVarA2 = rpeVarY.a(9);
                if (b(qszVarA2)) {
                    wzsVar.d(qszVarA2.d[0] != 0);
                }
                defpackage.qsz qszVarA3 = rpeVarY.a(11);
                if (b(qszVarA3)) {
                    wzsVar.b(qszVarA3.d[0]);
                }
                defpackage.qsz qszVarA4 = rpeVarY.a(7);
                if (b(qszVarA4)) {
                    byte b2 = qszVarA4.d[0];
                    switch (b2) {
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
                            switch (b2) {
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
                return wzsVar.a();
            }
            return wzsVar.a();
        } catch (java.lang.IllegalStateException | defpackage.qst | defpackage.qsu e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.h()).p(e)).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(5971)).u("Could not completely fetch sensor data!");
        }
    }
}
