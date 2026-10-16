package defpackage;

import com.google.android.gms.car.navigation.ChargingStationDetails;
import com.google.android.gms.car.navigation.EnergyAtDistance;
import com.google.android.gms.car.navigation.StopDetails;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes2.dex */
class ixc implements Function {
    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        StopDetails stopDetails = (StopDetails) obj;
        abnp abnpVarN = aaib.a.n();
        EnergyAtDistance energyAtDistance = stopDetails.a;
        if (energyAtDistance != null) {
            aahy aahyVar = (aahy) ixg.b.apply(energyAtDistance);
            abnpVarN.t();
            aaib aaibVar = (aaib) abnpVarN.b;
            aahyVar.getClass();
            aaibVar.c = aahyVar;
            aaibVar.b |= 1;
        }
        ChargingStationDetails chargingStationDetails = stopDetails.b;
        if (chargingStationDetails != null) {
            aahw aahwVar = (aahw) ixg.a.apply(chargingStationDetails);
            abnpVarN.t();
            aaib aaibVar2 = (aaib) abnpVarN.b;
            aahwVar.getClass();
            aaibVar2.d = aahwVar;
            aaibVar2.b |= 2;
        }
        return (aaib) abnpVarN.q();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
