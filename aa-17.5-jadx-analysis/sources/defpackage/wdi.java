package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class wdi implements xwx {
    @Override // defpackage.xwx
    public final Object a(Object obj) {
        waw wawVar = (waw) obj;
        abnp abnpVarN = wdo.a.n();
        if (wawVar == null) {
            return (wdo) abnpVarN.q();
        }
        for (wax waxVar : wawVar.f) {
            abnp abnpVarN2 = wdp.a.n();
            String str = waxVar.e;
            abnpVarN2.t();
            wdp wdpVar = (wdp) abnpVarN2.b;
            str.getClass();
            wdpVar.b |= 1;
            wdpVar.e = str;
            int i = waxVar.c;
            int iAF = woy.aF(i);
            if (iAF == 0) {
                throw null;
            }
            int i2 = iAF - 1;
            if (i2 == 0) {
                long jLongValue = i == 1 ? ((Long) waxVar.d).longValue() : 0L;
                abnpVarN2.t();
                wdp wdpVar2 = (wdp) abnpVarN2.b;
                wdpVar2.c = 2;
                wdpVar2.d = Long.valueOf(jLongValue);
            } else if (i2 == 1) {
                boolean zBooleanValue = i == 2 ? ((Boolean) waxVar.d).booleanValue() : false;
                abnpVarN2.t();
                wdp wdpVar3 = (wdp) abnpVarN2.b;
                wdpVar3.c = 3;
                wdpVar3.d = Boolean.valueOf(zBooleanValue);
            } else if (i2 == 2) {
                double dDoubleValue = i == 3 ? ((Double) waxVar.d).doubleValue() : 0.0d;
                abnpVarN2.t();
                wdp wdpVar4 = (wdp) abnpVarN2.b;
                wdpVar4.c = 4;
                wdpVar4.d = Double.valueOf(dDoubleValue);
            } else if (i2 == 3) {
                String str2 = i == 4 ? (String) waxVar.d : "";
                abnpVarN2.t();
                wdp wdpVar5 = (wdp) abnpVarN2.b;
                str2.getClass();
                wdpVar5.c = 5;
                wdpVar5.d = str2;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("No known flag type");
                }
                abms abmsVar = i == 5 ? (abms) waxVar.d : abms.d;
                abnpVarN2.t();
                wdp wdpVar6 = (wdp) abnpVarN2.b;
                abmsVar.getClass();
                wdpVar6.c = 6;
                wdpVar6.d = abmsVar;
            }
            wdp wdpVar7 = (wdp) abnpVarN2.q();
            abnpVarN.t();
            wdo wdoVar = (wdo) abnpVarN.b;
            wdpVar7.getClass();
            aboh abohVar = wdoVar.g;
            if (!abohVar.c()) {
                wdoVar.g = abnv.I(abohVar);
            }
            wdoVar.g.add(wdpVar7);
        }
        String str3 = wawVar.e;
        abnpVarN.t();
        wdo wdoVar2 = (wdo) abnpVarN.b;
        str3.getClass();
        wdoVar2.b = 4 | wdoVar2.b;
        wdoVar2.e = str3;
        String str4 = wawVar.c;
        abnpVarN.t();
        wdo wdoVar3 = (wdo) abnpVarN.b;
        str4.getClass();
        wdoVar3.b = 1 | wdoVar3.b;
        wdoVar3.c = str4;
        long j = wawVar.i;
        abnpVarN.t();
        wdo wdoVar4 = (wdo) abnpVarN.b;
        wdoVar4.b |= 8;
        wdoVar4.f = j;
        if ((wawVar.b & 2) != 0) {
            abms abmsVar2 = wawVar.d;
            abnpVarN.t();
            wdo wdoVar5 = (wdo) abnpVarN.b;
            abmsVar2.getClass();
            wdoVar5.b |= 2;
            wdoVar5.d = abmsVar2;
        }
        return (wdo) abnpVarN.q();
    }
}
