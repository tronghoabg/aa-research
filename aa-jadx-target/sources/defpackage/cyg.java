package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cyg {
    public final defpackage.cxl a;
    public final defpackage.cyf b;
    public final defpackage.cxa c;
    public defpackage.cyl d;
    public final defpackage.cge e;
    public defpackage.cge f;
    public defpackage.aan g;
    public defpackage.aan h;
    public defpackage.aan i;
    private defpackage.cye j;

    public cyg(defpackage.cxl cxlVar) {
        this.a = cxlVar;
        defpackage.cyf cyfVar = new defpackage.cyf();
        cyfVar.s = -1;
        this.b = cyfVar;
        defpackage.cxa cxaVar = new defpackage.cxa(cxlVar);
        this.c = cxaVar;
        this.d = cxaVar;
        defpackage.czf czfVar = cxaVar.f;
        this.e = czfVar;
        this.f = czfVar;
        this.g = new defpackage.aan(16);
    }

    public static final defpackage.cge k(defpackage.cgd cgdVar, defpackage.cge cgeVar) {
        defpackage.cge cwiVar;
        if (cgdVar instanceof defpackage.cyc) {
            cwiVar = ((defpackage.cyc) cgdVar).d();
            cwiVar.r = defpackage.cym.c(cwiVar);
        } else {
            cwiVar = new defpackage.cwi(cgdVar);
        }
        if (cwiVar.A) {
            defpackage.csc.c("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        cwiVar.x = true;
        defpackage.cge cgeVar2 = cgeVar.u;
        if (cgeVar2 != null) {
            cgeVar2.t = cwiVar;
            cwiVar.u = cgeVar2;
        }
        cgeVar.u = cwiVar;
        cwiVar.t = cgeVar;
        return cwiVar;
    }

    public static final defpackage.cge l(defpackage.cge cgeVar) {
        if (cgeVar.A) {
            defpackage.cym.f(cgeVar);
            cgeVar.S();
            cgeVar.P();
        }
        defpackage.cge cgeVar2 = cgeVar.u;
        defpackage.cge cgeVar3 = cgeVar.t;
        if (cgeVar2 != null) {
            cgeVar2.t = cgeVar3;
            cgeVar.u = null;
        }
        if (cgeVar3 != null) {
            cgeVar3.u = cgeVar2;
            cgeVar.t = null;
        }
        cgeVar3.getClass();
        return cgeVar3;
    }

    public static final void m(defpackage.cgd cgdVar, defpackage.cgd cgdVar2, defpackage.cge cgeVar) {
        if ((cgdVar instanceof defpackage.cyc) && (cgdVar2 instanceof defpackage.cyc)) {
            cgeVar.getClass();
            ((defpackage.cyc) cgdVar2).e(cgeVar);
            if (cgeVar.A) {
                defpackage.cym.g(cgeVar);
                return;
            } else {
                cgeVar.y = true;
                return;
            }
        }
        if (!(cgeVar instanceof defpackage.cwi)) {
            defpackage.csc.c("Unknown Modifier.Node type");
            return;
        }
        defpackage.cwi cwiVar = (defpackage.cwi) cgeVar;
        if (cwiVar.A) {
            cwiVar.u();
        }
        cwiVar.a = cgdVar2;
        cwiVar.r = defpackage.cym.a(cgdVar2);
        if (cwiVar.A) {
            cwiVar.r(false);
        }
        if (cgeVar.A) {
            defpackage.cym.g(cgeVar);
        } else {
            cgeVar.y = true;
        }
    }

    public final int a() {
        return this.f.s;
    }

    public final void b() {
        for (defpackage.cge cgeVar = this.f; cgeVar != null; cgeVar = cgeVar.u) {
            cgeVar.O();
        }
    }

    public final void c() {
        for (defpackage.cge cgeVar = this.e; cgeVar != null; cgeVar = cgeVar.t) {
            if (cgeVar.A) {
                cgeVar.P();
            }
        }
    }

    public final void d(defpackage.cge cgeVar, defpackage.cyl cylVar) {
        for (defpackage.cge cgeVar2 = cgeVar.t; cgeVar2 != null; cgeVar2 = cgeVar2.t) {
            if (cgeVar2 == this.b) {
                defpackage.cxl cxlVarL = this.a.l();
                cylVar.x = cxlVarL != null ? cxlVarL.p() : null;
                this.d = cylVar;
                return;
            } else {
                if ((cgeVar2.r & 2) != 0) {
                    return;
                }
                cgeVar2.U(cylVar);
            }
        }
    }

    public final void e() {
        for (defpackage.cge cgeVar = this.f; cgeVar != null; cgeVar = cgeVar.u) {
            cgeVar.R();
            if (cgeVar.x) {
                defpackage.cym.d(cgeVar);
            }
            if (cgeVar.y) {
                defpackage.cym.g(cgeVar);
            }
            cgeVar.x = false;
            cgeVar.y = false;
        }
    }

    public final void f() {
        for (defpackage.cge cgeVar = this.e; cgeVar != null; cgeVar = cgeVar.t) {
            if (cgeVar.A) {
                cgeVar.S();
            }
        }
    }

    public final void g() {
        int i = 0;
        for (defpackage.cge cgeVar = this.e.t; cgeVar != null && cgeVar != this.b; cgeVar = cgeVar.t) {
            i |= cgeVar.r;
            cgeVar.s = i;
        }
    }

    public final void h() {
        defpackage.cxh cxhVar;
        defpackage.cyl cylVar = this.c;
        for (defpackage.cge cgeVar = this.e.t; cgeVar != null; cgeVar = cgeVar.t) {
            defpackage.cxe cxeVarQ = defpackage.cjv.q(cgeVar);
            if (cxeVarQ != null) {
                defpackage.cyl cylVar2 = cgeVar.w;
                if (cylVar2 != null) {
                    cxhVar = (defpackage.cxh) cylVar2;
                    defpackage.cxe cxeVar = cxhVar.f;
                    cxhVar.H(cxeVarQ);
                    if (cxeVar != cgeVar) {
                        cxhVar.am();
                    }
                } else {
                    defpackage.cxh cxhVar2 = new defpackage.cxh(this.a, cxeVarQ);
                    cgeVar.U(cxhVar2);
                    cxhVar = cxhVar2;
                }
                cylVar.x = cxhVar;
                cxhVar.w = cylVar;
                cylVar = cxhVar;
            } else {
                cgeVar.U(cylVar);
            }
        }
        defpackage.cxl cxlVarL = this.a.l();
        cylVar.x = cxlVarL != null ? cxlVarL.p() : null;
        this.d = cylVar;
    }

    public final boolean i(int i) {
        return (a() & i) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0120 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0170  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:68:0x0177  */
    /* JADX WARN: Code duplicated, block: B:69:0x017a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v4 */
    /* JADX WARN: Type inference failed for: r32v5 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:71:0x017f
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void j(int r31, defpackage.aan r32, defpackage.aan r33, defpackage.cge r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyg.j(int, aan, aan, cge, boolean):void");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        defpackage.cge cgeVar = this.f;
        defpackage.cge cgeVar2 = this.e;
        if (cgeVar == cgeVar2) {
            sb.append("]");
        } else {
            while (cgeVar != null && cgeVar != cgeVar2) {
                sb.append(cgeVar.toString());
                if (cgeVar.u == cgeVar2) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                cgeVar = cgeVar.u;
            }
        }
        return sb.toString();
    }
}
