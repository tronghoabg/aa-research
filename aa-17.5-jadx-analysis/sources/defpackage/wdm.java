package defpackage;

/* loaded from: classes.dex */
public final class wdm {
    public final boolean a = true;
    public final boolean b;
    public final String c;
    public final abms d;
    public final yfy e;
    public final wdl f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wdm(defpackage.wbh r34, defpackage.wdl r35) {
        /*
            Method dump skipped, instructions count: 934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wdm.<init>(wbh, wdl):void");
    }

    public final boolean a() {
        return this.f.b == 3;
    }

    public final boolean b() {
        return this.f.a;
    }

    public wdm(wdo wdoVar, wdl wdlVar) {
        abms abmsVar;
        String str;
        this.b = wdo.a.equals(wdoVar);
        this.c = wdoVar.c;
        this.d = wdoVar.d;
        String str2 = wdoVar.e;
        long j = wdoVar.f;
        yly ylyVar = yly.a;
        yfu yfuVarH = yfy.h(wdoVar.g.size() + 3);
        for (wdp wdpVar : wdoVar.g) {
            int i = wdpVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                yfuVarH.e(wdpVar.e, Long.valueOf(i == 2 ? ((Long) wdpVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                yfuVarH.e(wdpVar.e, Boolean.valueOf(i == 3 ? ((Boolean) wdpVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                yfuVarH.e(wdpVar.e, Double.valueOf(i == 4 ? ((Double) wdpVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                String str3 = wdpVar.e;
                if (i == 5) {
                    str = (String) wdpVar.d;
                } else {
                    str = "";
                }
                yfuVarH.e(str3, str);
            } else if (i3 == 4) {
                String str4 = wdpVar.e;
                if (i == 6) {
                    abmsVar = (abms) wdpVar.d;
                } else {
                    abmsVar = abms.d;
                }
                yfuVarH.e(str4, abmsVar.D());
            }
        }
        yfuVarH.e("__phenotype_server_token", wdoVar.e);
        yfuVarH.e("__phenotype_snapshot_token", wdoVar.c);
        yfuVarH.e("__phenotype_configuration_version", Long.valueOf(wdoVar.f));
        this.e = yfuVarH.d(false);
        this.f = wdlVar;
    }
}
