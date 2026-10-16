package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lzm {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.ParkedNativeAppCheck");

    public static final boolean a(defpackage.qsh qshVar) {
        qshVar.getClass();
        return b(qshVar, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: lhz */
    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    public static final boolean b(defpackage.qsh qshVar, boolean z) throws lhz {
        boolean zI;
        qshVar.getClass();
        boolean zBooleanValue = ((java.lang.Boolean) defpackage.khg.u(new defpackage.wde("cradle_features", defpackage.zbe.PARKED_APP, defpackage.zbd.LN, "Could not check car module feature", new java.lang.Object[0]), new defpackage.lgy(qshVar, 17))).booleanValue();
        defpackage.yqm yqmVar = b;
        yqmVar.l().Q("hasNativeAppsModule: %b checkCarCompatibility: %b", zBooleanValue, z);
        if (android.os.Build.VERSION.SDK_INT < 35 || !zBooleanValue) {
            return false;
        }
        if (z) {
            if (defpackage.kit.b().r()) {
                try {
                    defpackage.mkp.a.f();
                    com.google.android.gms.car.CarInfo carInfoD = defpackage.ooa.d(qshVar);
                    if (carInfoD == null) {
                        yqmVar.l().u("CarInfo is null");
                    } else {
                        defpackage.absk abskVarF = defpackage.acqh.f();
                        defpackage.yqm yqmVar2 = defpackage.kjl.a;
                        int iAr = defpackage.a.ar(abskVarF.c);
                        if (iAr == 0) {
                            iAr = 1;
                        }
                        int i = iAr - 1;
                        if (i == 1) {
                            zI = false;
                        } else if (i == 4) {
                            zI = true;
                        } else if (i != 5) {
                            if (i != 6) {
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.kjl.a.g()).ai((char) 3190)).w("Undefined filter mode %d", i);
                            } else if (!defpackage.kjl.i(carInfoD, abskVarF.d)) {
                                zI = true;
                            }
                            zI = false;
                        } else {
                            zI = defpackage.kjl.i(carInfoD, abskVarF.d);
                        }
                        boolean zE = defpackage.nrr.a().e();
                        yqmVar.l().Q("Car allowed: %b Has touch: %b", zI, zE);
                        if (!zI || !zE) {
                            return false;
                        }
                    }
                } catch (defpackage.qst e) {
                    ((defpackage.yqj) b.l().p(e)).u("CarNotConnectedException");
                }
            } else {
                yqmVar.l().u("Car not connected");
            }
        }
        return true;
    }

    public static final boolean c() {
        defpackage.kit kitVarB = defpackage.kit.b();
        if (!kitVarB.q()) {
            ((defpackage.yqj) b.h()).u("Client not connected");
            return false;
        }
        defpackage.qsh qshVarE = kitVarB.e();
        qshVarE.getClass();
        return b(qshVarE, true);
    }
}
