package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ixj implements java.util.function.Function {
    private final /* synthetic */ int a;

    public ixj(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo330andThen(java.util.function.Function function) {
        int i = this.a;
        if (i == 0) {
            return j$.util.function.Function$CC.$default$andThen(this, function);
        }
        if (i == 1) {
            return j$.util.function.Function$CC.$default$andThen(this, function);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.Function$CC.$default$andThen(this, function) : j$.util.function.Function$CC.$default$andThen(this, function);
        }
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        int i = this.a;
        if (i == 0) {
            defpackage.abor aborVarN = defpackage.aaja.a.n();
            java.lang.String str = ((com.google.android.gms.car.navigation.DataAuthorization) obj).a;
            if (str != null) {
                aborVarN.t();
                ((defpackage.aaja) aborVarN.b).b = str;
            }
            return (defpackage.aaja) aborVarN.q();
        }
        if (i == 1) {
            com.google.android.gms.car.navigation.ChargingStationDetails chargingStationDetails = (com.google.android.gms.car.navigation.ChargingStationDetails) obj;
            defpackage.abor aborVarN2 = defpackage.aaiz.a.n();
            int i2 = chargingStationDetails.a;
            aborVarN2.t();
            ((defpackage.aaiz) aborVarN2.b).b = i2;
            int i3 = chargingStationDetails.b;
            aborVarN2.t();
            ((defpackage.aaiz) aborVarN2.b).c = i3;
            int i4 = chargingStationDetails.c;
            aborVarN2.t();
            ((defpackage.aaiz) aborVarN2.b).d = i4;
            return (defpackage.aaiz) aborVarN2.q();
        }
        if (i == 2) {
            com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistance = (com.google.android.gms.car.navigation.EnergyAtDistance) obj;
            defpackage.abor aborVarN3 = defpackage.aajb.a.n();
            int i5 = energyAtDistance.a;
            aborVarN3.t();
            ((defpackage.aajb) aborVarN3.b).b = i5;
            int i6 = energyAtDistance.b;
            aborVarN3.t();
            ((defpackage.aajb) aborVarN3.b).c = i6;
            int i7 = energyAtDistance.c;
            aborVarN3.t();
            ((defpackage.aajb) aborVarN3.b).d = i7;
            return (defpackage.aajb) aborVarN3.q();
        }
        if (i == 3) {
            defpackage.aceh acehVar = (defpackage.aceh) obj;
            int iOrdinal = acehVar.ordinal();
            if (iOrdinal == 0) {
                return defpackage.uzb.UNKNOWN_UE3_REPORTER_FLUSH_STRATEGY;
            }
            if (iOrdinal == 1) {
                return defpackage.uzb.NONE;
            }
            if (iOrdinal == 2) {
                return defpackage.uzb.SEQUENTIAL_ON_UI_THREAD;
            }
            if (iOrdinal == 3) {
                return defpackage.uzb.WAIT_ON_UI_THREAD;
            }
            throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(acehVar))));
        }
        defpackage.acei aceiVar = (defpackage.acei) obj;
        int iOrdinal2 = aceiVar.ordinal();
        if (iOrdinal2 == 0) {
            return defpackage.uzc.GMM_SERVER_ONLY;
        }
        if (iOrdinal2 == 1) {
            return defpackage.uzc.CLEARCUT_SERVICE_ONLY;
        }
        if (iOrdinal2 == 2) {
            return defpackage.uzc.DUAL_WRITE;
        }
        if (iOrdinal2 == 3) {
            return defpackage.uzc.NON_LOG204_CLEARCUT_ONLY_LOG204_GMM_SERVER_ONLY;
        }
        if (iOrdinal2 == 4) {
            return defpackage.uzc.NON_LOG204_CLEARCUT_ONLY_LOG204_DUAL_WRITE;
        }
        throw new java.lang.IllegalArgumentException("unknown enum value: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(aceiVar))));
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.a;
        if (i == 0) {
            return j$.util.function.Function$CC.$default$compose(this, function);
        }
        if (i == 1) {
            return j$.util.function.Function$CC.$default$compose(this, function);
        }
        if (i != 2) {
            return i != 3 ? j$.util.function.Function$CC.$default$compose(this, function) : j$.util.function.Function$CC.$default$compose(this, function);
        }
        return j$.util.function.Function$CC.$default$compose(this, function);
    }
}
