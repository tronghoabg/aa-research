package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vwg extends defpackage.wag {
    public vwg(ajht ajhtVar) {
        super(ajhtVar);
    }

    @Override // defpackage.wag
    protected final void a(defpackage.rkq rkqVar) {
        ajht ajhtVar = this.b;
        if ((ajhtVar.b & 8) != 0) {
            ajgd ajgdVar = ajhtVar.f;
            if (ajgdVar == null) {
                ajgdVar = ajgd.a;
            }
            defpackage.yha yhaVar = new defpackage.yha(4);
            ajgc ajgcVar = ajgdVar.c;
            if (ajgcVar == null) {
                ajgcVar = ajgc.a;
            }
            ajga ajgaVar = ajgcVar.c;
            if (ajgaVar == null) {
                ajgaVar = ajga.a;
            }
            if ((ajgaVar.b & 1) != 0) {
                yhaVar.f("DPS", java.lang.Integer.valueOf(ajgaVar.c));
            }
            if ((ajgaVar.b & 2) != 0) {
                yhaVar.f("NPS", java.lang.Integer.valueOf(ajgaVar.d));
            }
            if ((ajgaVar.b & 4) != 0) {
                yhaVar.f("OPS", java.lang.Integer.valueOf(ajgaVar.e));
            }
            if ((ajgaVar.b & 8) != 0) {
                yhaVar.f("DPD", java.lang.Integer.valueOf(ajgaVar.f));
            }
            if ((ajgaVar.b & 16) != 0) {
                yhaVar.f("NPD", java.lang.Integer.valueOf(ajgaVar.g));
            }
            if ((ajgaVar.b & 32) != 0) {
                yhaVar.f("OPD", java.lang.Integer.valueOf(ajgaVar.h));
            }
            if ((ajgaVar.b & 256) != 0) {
                yhaVar.f("TSD", java.lang.Integer.valueOf(ajgaVar.j));
            }
            if ((ajgaVar.b & 524288) != 0) {
                yhaVar.f("RssHwm", java.lang.Long.valueOf(ajgaVar.t));
            }
            if ((ajgaVar.b & 1048576) != 0) {
                yhaVar.f("RSS", java.lang.Long.valueOf(ajgaVar.u));
            }
            if ((ajgaVar.b & 2097152) != 0) {
                yhaVar.f("RssAnon", java.lang.Long.valueOf(ajgaVar.v));
            }
            int i = ajgaVar.b;
            if ((2097152 & i) != 0 && (i & 4194304) != 0) {
                yhaVar.f("RssAnonSWAP", java.lang.Long.valueOf(ajgaVar.v + ajgaVar.w));
            }
            if ((ajgaVar.b & 4194304) != 0) {
                yhaVar.f("SWAP", java.lang.Long.valueOf(ajgaVar.w));
            }
            if ((ajgaVar.b & 8388608) != 0) {
                yhaVar.f("VMS", java.lang.Long.valueOf(ajgaVar.x));
            }
            ajgw ajgwVar = ajgdVar.d;
            if (ajgwVar == null) {
                ajgwVar = ajgw.a;
            }
            if ((ajgwVar.b & 1) != 0) {
                ajgw ajgwVar2 = ajgdVar.d;
                if (ajgwVar2 == null) {
                    ajgwVar2 = ajgw.a;
                }
                ajgv ajgvVar = ajgwVar2.c;
                if (ajgvVar == null) {
                    ajgvVar = ajgv.a;
                }
                if ((ajgvVar.b & 1) != 0) {
                    yhaVar.f("PET", java.lang.Long.valueOf(ajgvVar.c));
                }
                yhaVar.f("IF", java.lang.Integer.valueOf(ajgvVar.d ? 1 : 0));
                if ((4 & ajgvVar.b) != 0) {
                    yhaVar.f("THC", java.lang.Integer.valueOf(ajgvVar.e));
                }
            }
            yhaVar.f("TPD", java.lang.Integer.valueOf(ajgaVar.f + ajgaVar.g + ajgaVar.h));
            yhaVar.f("PSS", java.lang.Integer.valueOf(ajgaVar.c + ajgaVar.d + ajgaVar.e));
            if ((ajgaVar.b & 128) != 0) {
                yhaVar.f("TPC", java.lang.Integer.valueOf(ajgaVar.i));
            }
            if ((ajgaVar.b & 512) != 0) {
                yhaVar.f("TSP", java.lang.Integer.valueOf(ajgaVar.k));
            }
            if ((ajgaVar.b & 2048) != 0) {
                yhaVar.f("SJH", java.lang.Integer.valueOf(ajgaVar.l));
            }
            if ((ajgaVar.b & 8192) != 0) {
                yhaVar.f("SST", java.lang.Integer.valueOf(ajgaVar.n));
            }
            if ((ajgaVar.b & 4096) != 0) {
                yhaVar.f("SCO", java.lang.Integer.valueOf(ajgaVar.m));
            }
            if ((ajgaVar.b & 16384) != 0) {
                yhaVar.f("SGR", java.lang.Integer.valueOf(ajgaVar.o));
            }
            if ((ajgaVar.b & 32768) != 0) {
                yhaVar.f("SPO", java.lang.Integer.valueOf(ajgaVar.p));
            }
            if ((ajgaVar.b & 65536) != 0) {
                yhaVar.f("SSY", java.lang.Integer.valueOf(ajgaVar.q));
            }
            defpackage.yhe yheVarD = yhaVar.d(true);
            if (yheVarD.isEmpty()) {
                return;
            }
            ajgd ajgdVar2 = ajhtVar.f;
            if (ajgdVar2 == null) {
                ajgdVar2 = ajgd.a;
            }
            int iAC = defpackage.a.aC(ajgdVar2.e);
            rkqVar.x("MEC", java.lang.Integer.valueOf((iAC != 0 ? iAC : 1) - 1));
            defpackage.yot it = yheVarD.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                rkqVar.z((java.lang.String) entry.getKey(), (java.lang.Number) entry.getValue());
            }
        }
    }

    @Override // defpackage.wag
    protected final java.lang.String b() {
        ajht ajhtVar = this.b;
        java.lang.String strB = super.b();
        if ((ajhtVar.b & 8) == 0) {
            return strB;
        }
        ajgd ajgdVar = ajhtVar.f;
        if (ajgdVar == null) {
            ajgdVar = ajgd.a;
        }
        int iAC = defpackage.a.aC(ajgdVar.e);
        if (iAC == 0) {
            iAC = 1;
        }
        return (iAC == 1 || iAC == 7 || !strB.isEmpty()) ? strB : java.lang.Integer.toString(iAC - 1);
    }
}
