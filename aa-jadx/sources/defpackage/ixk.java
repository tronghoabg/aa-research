package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class ixk implements java.util.function.Function {
    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ java.util.function.Function mo330andThen(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
        com.google.android.gms.car.navigation.StopDetails stopDetails = (com.google.android.gms.car.navigation.StopDetails) obj;
        defpackage.abor aborVarN = defpackage.aaje.a.n();
        com.google.android.gms.car.navigation.EnergyAtDistance energyAtDistance = stopDetails.a;
        if (energyAtDistance != null) {
            defpackage.aajb aajbVar = (defpackage.aajb) defpackage.ixo.b.apply(energyAtDistance);
            aborVarN.t();
            defpackage.aaje aajeVar = (defpackage.aaje) aborVarN.b;
            aajbVar.getClass();
            aajeVar.c = aajbVar;
            aajeVar.b |= 1;
        }
        com.google.android.gms.car.navigation.ChargingStationDetails chargingStationDetails = stopDetails.b;
        if (chargingStationDetails != null) {
            defpackage.aaiz aaizVar = (defpackage.aaiz) defpackage.ixo.a.apply(chargingStationDetails);
            aborVarN.t();
            defpackage.aaje aajeVar2 = (defpackage.aaje) aborVarN.b;
            aaizVar.getClass();
            aajeVar2.d = aaizVar;
            aajeVar2.b |= 2;
        }
        return (defpackage.aaje) aborVarN.q();
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return j$.util.function.Function$CC.$default$compose(this, function);
    }
}
