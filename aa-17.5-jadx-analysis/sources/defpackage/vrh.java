package defpackage;

import android.os.health.HealthStats;

/* loaded from: classes3.dex */
public final class vrh extends vri {
    public static final vrh a = new vrh();

    @Override // defpackage.vri
    public final /* synthetic */ abow a(String str, Object obj) {
        HealthStats healthStatsM345m = lk$$ExternalSyntheticApiModelOutline0.m345m(obj);
        abnp abnpVarN = ajer.a.n();
        long jM = vuf.m(healthStatsM345m, 30001);
        if (jM != 0) {
            abnpVarN.t();
            ajer ajerVar = (ajer) abnpVarN.b;
            ajerVar.b |= 1;
            ajerVar.c = jM;
        }
        long jM2 = vuf.m(healthStatsM345m, 30002);
        if (jM2 != 0) {
            abnpVarN.t();
            ajer ajerVar2 = (ajer) abnpVarN.b;
            ajerVar2.b |= 2;
            ajerVar2.d = jM2;
        }
        long jM3 = vuf.m(healthStatsM345m, 30003);
        if (jM3 != 0) {
            abnpVarN.t();
            ajer ajerVar3 = (ajer) abnpVarN.b;
            ajerVar3.b |= 4;
            ajerVar3.e = jM3;
        }
        long jM4 = vuf.m(healthStatsM345m, 30004);
        if (jM4 != 0) {
            abnpVarN.t();
            ajer ajerVar4 = (ajer) abnpVarN.b;
            ajerVar4.b |= 8;
            ajerVar4.f = jM4;
        }
        long jM5 = vuf.m(healthStatsM345m, 30005);
        if (jM5 != 0) {
            abnpVarN.t();
            ajer ajerVar5 = (ajer) abnpVarN.b;
            ajerVar5.b |= 16;
            ajerVar5.g = jM5;
        }
        long jM6 = vuf.m(healthStatsM345m, 30006);
        if (jM6 != 0) {
            abnpVarN.t();
            ajer ajerVar6 = (ajer) abnpVarN.b;
            ajerVar6.b |= 32;
            ajerVar6.h = jM6;
        }
        if (str != null) {
            ajeo ajeoVarP = vuf.p(str);
            abnpVarN.t();
            ajer ajerVar7 = (ajer) abnpVarN.b;
            ajeoVarP.getClass();
            ajerVar7.i = ajeoVarP;
            ajerVar7.b |= 64;
        }
        ajer ajerVar8 = (ajer) abnpVarN.q();
        if (vuf.u(ajerVar8)) {
            return null;
        }
        return ajerVar8;
    }

    @Override // defpackage.vri
    public final /* synthetic */ abow b(abow abowVar, abow abowVar2) {
        ajer ajerVar = (ajer) abowVar;
        ajer ajerVar2 = (ajer) abowVar2;
        if (ajerVar == null || ajerVar2 == null) {
            return ajerVar;
        }
        abnp abnpVarN = ajer.a.n();
        if ((ajerVar.b & 1) != 0) {
            long j = ajerVar.c - ajerVar2.c;
            if (j != 0) {
                abnpVarN.t();
                ajer ajerVar3 = (ajer) abnpVarN.b;
                ajerVar3.b |= 1;
                ajerVar3.c = j;
            }
        }
        if ((ajerVar.b & 2) != 0) {
            long j2 = ajerVar.d - ajerVar2.d;
            if (j2 != 0) {
                abnpVarN.t();
                ajer ajerVar4 = (ajer) abnpVarN.b;
                ajerVar4.b |= 2;
                ajerVar4.d = j2;
            }
        }
        if ((ajerVar.b & 4) != 0) {
            long j3 = ajerVar.e - ajerVar2.e;
            if (j3 != 0) {
                abnpVarN.t();
                ajer ajerVar5 = (ajer) abnpVarN.b;
                ajerVar5.b |= 4;
                ajerVar5.e = j3;
            }
        }
        if ((ajerVar.b & 8) != 0) {
            long j4 = ajerVar.f - ajerVar2.f;
            if (j4 != 0) {
                abnpVarN.t();
                ajer ajerVar6 = (ajer) abnpVarN.b;
                ajerVar6.b |= 8;
                ajerVar6.f = j4;
            }
        }
        if ((ajerVar.b & 16) != 0) {
            long j5 = ajerVar.g - ajerVar2.g;
            if (j5 != 0) {
                abnpVarN.t();
                ajer ajerVar7 = (ajer) abnpVarN.b;
                ajerVar7.b |= 16;
                ajerVar7.g = j5;
            }
        }
        if ((ajerVar.b & 32) != 0) {
            long j6 = ajerVar.h - ajerVar2.h;
            if (j6 != 0) {
                abnpVarN.t();
                ajer ajerVar8 = (ajer) abnpVarN.b;
                ajerVar8.b |= 32;
                ajerVar8.h = j6;
            }
        }
        ajeo ajeoVar = ajerVar.i;
        if (ajeoVar == null) {
            ajeoVar = ajeo.a;
        }
        abnpVarN.t();
        ajer ajerVar9 = (ajer) abnpVarN.b;
        ajeoVar.getClass();
        ajerVar9.i = ajeoVar;
        ajerVar9.b |= 64;
        ajer ajerVar10 = (ajer) abnpVarN.q();
        if (vuf.u(ajerVar10)) {
            return null;
        }
        return ajerVar10;
    }

    @Override // defpackage.vri
    public final /* bridge */ /* synthetic */ String c(abow abowVar) {
        ajeo ajeoVar = ((ajer) abowVar).i;
        if (ajeoVar == null) {
            ajeoVar = ajeo.a;
        }
        return ajeoVar.d;
    }
}
