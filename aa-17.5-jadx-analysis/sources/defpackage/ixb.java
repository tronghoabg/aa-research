package defpackage;

import com.google.android.gms.car.navigation.ChargingStationDetails;
import com.google.android.gms.car.navigation.DataAuthorization;
import com.google.android.gms.car.navigation.EnergyAtDistance;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final class ixb implements Function {
    private final /* synthetic */ int a;

    public ixb(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo329andThen(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        int i = this.a;
        if (i == 0) {
            abnp abnpVarN = aahx.a.n();
            String str = ((DataAuthorization) obj).a;
            if (str != null) {
                abnpVarN.t();
                ((aahx) abnpVarN.b).b = str;
            }
            return (aahx) abnpVarN.q();
        }
        if (i == 1) {
            ChargingStationDetails chargingStationDetails = (ChargingStationDetails) obj;
            abnp abnpVarN2 = aahw.a.n();
            int i2 = chargingStationDetails.a;
            abnpVarN2.t();
            ((aahw) abnpVarN2.b).b = i2;
            int i3 = chargingStationDetails.b;
            abnpVarN2.t();
            ((aahw) abnpVarN2.b).c = i3;
            int i4 = chargingStationDetails.c;
            abnpVarN2.t();
            ((aahw) abnpVarN2.b).d = i4;
            return (aahw) abnpVarN2.q();
        }
        if (i == 2) {
            EnergyAtDistance energyAtDistance = (EnergyAtDistance) obj;
            abnp abnpVarN3 = aahy.a.n();
            int i5 = energyAtDistance.a;
            abnpVarN3.t();
            ((aahy) abnpVarN3.b).b = i5;
            int i6 = energyAtDistance.b;
            abnpVarN3.t();
            ((aahy) abnpVarN3.b).c = i6;
            int i7 = energyAtDistance.c;
            abnpVarN3.t();
            ((aahy) abnpVarN3.b).d = i7;
            return (aahy) abnpVarN3.q();
        }
        if (i == 3) {
            acdf acdfVar = (acdf) obj;
            int iOrdinal = acdfVar.ordinal();
            if (iOrdinal == 0) {
                return uyf.UNKNOWN_UE3_REPORTER_FLUSH_STRATEGY;
            }
            if (iOrdinal == 1) {
                return uyf.NONE;
            }
            if (iOrdinal == 2) {
                return uyf.SEQUENTIAL_ON_UI_THREAD;
            }
            if (iOrdinal == 3) {
                return uyf.WAIT_ON_UI_THREAD;
            }
            throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(acdfVar))));
        }
        acdg acdgVar = (acdg) obj;
        int iOrdinal2 = acdgVar.ordinal();
        if (iOrdinal2 == 0) {
            return uyg.GMM_SERVER_ONLY;
        }
        if (iOrdinal2 == 1) {
            return uyg.CLEARCUT_SERVICE_ONLY;
        }
        if (iOrdinal2 == 2) {
            return uyg.DUAL_WRITE;
        }
        if (iOrdinal2 == 3) {
            return uyg.NON_LOG204_CLEARCUT_ONLY_LOG204_GMM_SERVER_ONLY;
        }
        if (iOrdinal2 == 4) {
            return uyg.NON_LOG204_CLEARCUT_ONLY_LOG204_DUAL_WRITE;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(acdgVar))));
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
    }
}
