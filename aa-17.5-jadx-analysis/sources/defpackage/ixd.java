package defpackage;

import com.google.android.gms.car.navigation.ChargingStationDetails;
import com.google.android.gms.car.navigation.DataAuthorization;
import com.google.android.gms.car.navigation.EnergyAtDistance;
import com.google.android.gms.car.navigation.StopDetails;
import com.google.android.gms.car.navigation.VehicleEnergyForecast;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes2.dex */
abstract class ixd implements Function {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aaic apply(VehicleEnergyForecast vehicleEnergyForecast) {
        abnp abnpVarN = aaic.a.n();
        EnergyAtDistance energyAtDistance = vehicleEnergyForecast.a;
        if (energyAtDistance != null) {
            aahy aahyVar = (aahy) ixh.a.apply(energyAtDistance);
            abnpVarN.t();
            aaic aaicVar = (aaic) abnpVarN.b;
            aahyVar.getClass();
            aaicVar.c = aahyVar;
            aaicVar.b |= 1;
        }
        EnergyAtDistance energyAtDistance2 = vehicleEnergyForecast.b;
        if (energyAtDistance2 != null) {
            aahy aahyVar2 = (aahy) ixh.a.apply(energyAtDistance2);
            abnpVarN.t();
            aaic aaicVar2 = (aaic) abnpVarN.b;
            aahyVar2.getClass();
            aaicVar2.d = aahyVar2;
            aaicVar2.b |= 2;
        }
        b(vehicleEnergyForecast, abnpVarN);
        ChargingStationDetails chargingStationDetails = vehicleEnergyForecast.d;
        if (chargingStationDetails != null) {
            aahw aahwVar = (aahw) ixh.b.apply(chargingStationDetails);
            abnpVarN.t();
            aaic aaicVar3 = (aaic) abnpVarN.b;
            aahwVar.getClass();
            aaicVar3.f = aahwVar;
            aaicVar3.b |= 4;
        }
        if (vehicleEnergyForecast.b() != null) {
            yfq yfqVarB = vehicleEnergyForecast.b();
            int size = yfqVarB.size();
            for (int i = 0; i < size; i++) {
                aaib aaibVar = (aaib) ixh.c.apply((StopDetails) yfqVarB.get(i));
                abnpVarN.t();
                aaic aaicVar4 = (aaic) abnpVarN.b;
                aaibVar.getClass();
                aboh abohVar = aaicVar4.g;
                if (!abohVar.c()) {
                    aaicVar4.g = abnv.I(abohVar);
                }
                aaicVar4.g.add(aaibVar);
            }
        }
        if (vehicleEnergyForecast.a() != null) {
            yfq yfqVarA = vehicleEnergyForecast.a();
            int size2 = yfqVarA.size();
            for (int i2 = 0; i2 < size2; i2++) {
                aahx aahxVar = (aahx) ixh.d.apply((DataAuthorization) yfqVarA.get(i2));
                abnpVarN.t();
                aaic aaicVar5 = (aaic) abnpVarN.b;
                aahxVar.getClass();
                aboh abohVar2 = aaicVar5.h;
                if (!abohVar2.c()) {
                    aaicVar5.h = abnv.I(abohVar2);
                }
                aaicVar5.h.add(aahxVar);
            }
        }
        return (aaic) abnpVarN.q();
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public abstract void b(VehicleEnergyForecast vehicleEnergyForecast, abnp abnpVar);

    public final /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }
}
