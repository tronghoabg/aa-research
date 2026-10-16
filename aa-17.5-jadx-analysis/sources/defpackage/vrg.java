package defpackage;

import android.os.health.HealthStats;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class vrg extends vri {
    public static final vrg a = new vrg();

    @Override // defpackage.vri
    public final /* synthetic */ abow a(String str, Object obj) {
        HealthStats healthStatsM345m = lk$$ExternalSyntheticApiModelOutline0.m345m(obj);
        abnp abnpVarN = ajep.a.n();
        abnpVarN.ap(vrj.a.e(vuf.o(healthStatsM345m, 40001)));
        abnpVarN.aq(vrf.a.e((healthStatsM345m == null || !healthStatsM345m.hasMeasurements(40002)) ? Collections.EMPTY_MAP : healthStatsM345m.getMeasurements(40002)));
        if (str != null) {
            ajeo ajeoVarP = vuf.p(str);
            abnpVarN.t();
            ajep ajepVar = (ajep) abnpVarN.b;
            ajeoVarP.getClass();
            ajepVar.e = ajeoVarP;
            ajepVar.b |= 1;
        }
        ajep ajepVar2 = (ajep) abnpVarN.q();
        if (vuf.t(ajepVar2)) {
            return null;
        }
        return ajepVar2;
    }

    @Override // defpackage.vri
    public final /* synthetic */ abow b(abow abowVar, abow abowVar2) {
        ajep ajepVar = (ajep) abowVar;
        ajep ajepVar2 = (ajep) abowVar2;
        if (ajepVar == null || ajepVar2 == null) {
            return ajepVar;
        }
        abnp abnpVarN = ajep.a.n();
        abnpVarN.ap(vrj.a.f(ajepVar.c, ajepVar2.c));
        abnpVarN.aq(vrf.a.f(ajepVar.d, ajepVar2.d));
        ajeo ajeoVar = ajepVar.e;
        if (ajeoVar == null) {
            ajeoVar = ajeo.a;
        }
        abnpVarN.t();
        ajep ajepVar3 = (ajep) abnpVarN.b;
        ajeoVar.getClass();
        ajepVar3.e = ajeoVar;
        ajepVar3.b |= 1;
        ajep ajepVar4 = (ajep) abnpVarN.q();
        if (vuf.t(ajepVar4)) {
            return null;
        }
        return ajepVar4;
    }

    @Override // defpackage.vri
    public final /* bridge */ /* synthetic */ String c(abow abowVar) {
        ajeo ajeoVar = ((ajep) abowVar).e;
        if (ajeoVar == null) {
            ajeoVar = ajeo.a;
        }
        return ajeoVar.d;
    }
}
