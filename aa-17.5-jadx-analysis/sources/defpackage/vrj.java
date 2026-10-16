package defpackage;

import android.os.health.HealthStats;

/* loaded from: classes3.dex */
final class vrj extends vri {
    public static final vrj a = new vrj();

    @Override // defpackage.vri
    public final /* synthetic */ abow a(String str, Object obj) {
        HealthStats healthStatsM345m = lk$$ExternalSyntheticApiModelOutline0.m345m(obj);
        abnp abnpVarN = ajes.a.n();
        int iM = (int) vuf.m(healthStatsM345m, 50001);
        if (iM != 0) {
            abnpVarN.t();
            ajes ajesVar = (ajes) abnpVarN.b;
            ajesVar.b |= 1;
            ajesVar.c = iM;
        }
        int iM2 = (int) vuf.m(healthStatsM345m, 50002);
        if (iM2 != 0) {
            abnpVarN.t();
            ajes ajesVar2 = (ajes) abnpVarN.b;
            ajesVar2.b |= 2;
            ajesVar2.d = iM2;
        }
        if (str != null) {
            ajeo ajeoVarP = vuf.p(str);
            abnpVarN.t();
            ajes ajesVar3 = (ajes) abnpVarN.b;
            ajeoVarP.getClass();
            ajesVar3.e = ajeoVarP;
            ajesVar3.b |= 4;
        }
        ajes ajesVar4 = (ajes) abnpVarN.q();
        if (vuf.v(ajesVar4)) {
            return null;
        }
        return ajesVar4;
    }

    @Override // defpackage.vri
    public final /* synthetic */ abow b(abow abowVar, abow abowVar2) {
        int i;
        int i2;
        ajes ajesVar = (ajes) abowVar;
        ajes ajesVar2 = (ajes) abowVar2;
        if (ajesVar == null || ajesVar2 == null) {
            return ajesVar;
        }
        abnp abnpVarN = ajes.a.n();
        if ((ajesVar.b & 1) != 0 && (i2 = ajesVar.c - ajesVar2.c) != 0) {
            abnpVarN.t();
            ajes ajesVar3 = (ajes) abnpVarN.b;
            ajesVar3.b |= 1;
            ajesVar3.c = i2;
        }
        if ((ajesVar.b & 2) != 0 && (i = ajesVar.d - ajesVar2.d) != 0) {
            abnpVarN.t();
            ajes ajesVar4 = (ajes) abnpVarN.b;
            ajesVar4.b |= 2;
            ajesVar4.d = i;
        }
        ajeo ajeoVar = ajesVar.e;
        if (ajeoVar == null) {
            ajeoVar = ajeo.a;
        }
        abnpVarN.t();
        ajes ajesVar5 = (ajes) abnpVarN.b;
        ajeoVar.getClass();
        ajesVar5.e = ajeoVar;
        ajesVar5.b |= 4;
        ajes ajesVar6 = (ajes) abnpVarN.q();
        if (vuf.v(ajesVar6)) {
            return null;
        }
        return ajesVar6;
    }

    @Override // defpackage.vri
    public final /* bridge */ /* synthetic */ String c(abow abowVar) {
        ajeo ajeoVar = ((ajes) abowVar).e;
        if (ajeoVar == null) {
            ajeoVar = ajeo.a;
        }
        return ajeoVar.d;
    }
}
