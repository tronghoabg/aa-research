package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dec {
    public final defpackage.cxl a;
    public final defpackage.ddz b;
    public final int c;
    private final defpackage.cge d;
    private final boolean e;
    private defpackage.dec f;

    public dec(defpackage.cge cgeVar, boolean z, defpackage.cxl cxlVar, defpackage.ddz ddzVar) {
        this.d = cgeVar;
        this.e = z;
        this.a = cxlVar;
        this.b = ddzVar;
        this.c = cxlVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [cge] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    private final defpackage.czc n() {
        ?? O;
        boolean z;
        ?? r0;
        boolean z2 = this.b.a;
        defpackage.cxl cxlVar = this.a;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        if (!z2) {
            defpackage.cyg cygVar = cxlVar.v;
            if ((cygVar.a() & 8) != 0) {
                loop3: for (defpackage.cge cgeVar = cygVar.f; cgeVar != null; cgeVar = cgeVar.u) {
                    if ((cgeVar.r & 8) != 0) {
                        O = cgeVar;
                        ?? bzcVar = 0;
                        while (true) {
                            if (O != 0) {
                                if (O instanceof defpackage.czc) {
                                    if (((defpackage.czc) O).z()) {
                                        r4 = O;
                                    }
                                } else if ((O.r & 8) != 0 && (O instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                                    int i = 0;
                                    while (cgeVar2 != null) {
                                        if ((cgeVar2.r & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                O = O;
                                                bzcVar = bzcVar;
                                                bzcVar = bzcVar;
                                                O = cgeVar2;
                                            } else {
                                                if (bzcVar == 0) {
                                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (O != 0) {
                                                    bzcVar.n(O);
                                                }
                                                bzcVar.n(cgeVar2);
                                                O = 0;
                                            }
                                        } else {
                                            O = O;
                                            bzcVar = bzcVar;
                                        }
                                        cgeVar2 = cgeVar2.u;
                                        O = O;
                                        bzcVar = bzcVar;
                                    }
                                    if (i != 1) {
                                        O = O;
                                        bzcVar = bzcVar;
                                    } else {
                                        O = O;
                                        bzcVar = bzcVar;
                                    }
                                }
                                O = defpackage.cjv.o(bzcVar);
                            }
                        }
                    }
                    if ((cgeVar.s & 8) == 0) {
                        break;
                    }
                }
            }
        } else {
            defpackage.cyg cygVar2 = cxlVar.v;
            if ((cygVar2.a() & 8) != 0) {
                defpackage.cge cgeVar3 = cygVar2.f;
                O = 0;
                while (cgeVar3 != null) {
                    if ((cgeVar3.r & 8) != 0) {
                        defpackage.cge cgeVarO = cgeVar3;
                        defpackage.bzc bzcVar2 = null;
                        while (cgeVarO != null) {
                            if (cgeVarO instanceof defpackage.czc) {
                                defpackage.czc czcVar = (defpackage.czc) cgeVarO;
                                if (czcVar.z()) {
                                    if (czcVar.y()) {
                                        r0 = O;
                                        r0 = O;
                                        return czcVar;
                                    }
                                    if (O == 0) {
                                        r0 = czcVar;
                                    }
                                }
                                r0 = O;
                                z = false;
                                O = r0;
                            } else {
                                z = true;
                            }
                            if (z) {
                                O = O;
                                if ((cgeVarO.r & 8) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i2 = 0;
                                    for (defpackage.cge cgeVar4 = ((defpackage.cwo) cgeVarO).C; cgeVar4 != null; cgeVar4 = cgeVar4.u) {
                                        if ((cgeVar4.r & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cgeVarO = cgeVar4;
                                            } else {
                                                if (bzcVar2 == null) {
                                                    bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar2.n(cgeVarO);
                                                }
                                                bzcVar2.n(cgeVar4);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                            } else {
                                O = O;
                            }
                            cgeVarO = defpackage.cjv.o(bzcVar2);
                        }
                    }
                    if ((cgeVar3.s & 8) == 0) {
                        break;
                    }
                    cgeVar3 = cgeVar3.u;
                    O = O;
                }
                r4 = O;
            }
        }
        return (defpackage.czc) r4;
    }

    private final defpackage.dec o(defpackage.ddw ddwVar, defpackage.affc affcVar) {
        defpackage.ddz ddzVar = new defpackage.ddz();
        ddzVar.a = false;
        ddzVar.b = false;
        affcVar.invoke(ddzVar);
        defpackage.dec decVar = new defpackage.dec(new defpackage.deb(affcVar), false, new defpackage.cxl(true, this.c + (ddwVar != null ? 1000000000 : 2000000000)), ddzVar);
        decVar.f = this;
        return decVar;
    }

    private final void p(java.util.List list, defpackage.ddz ddzVar) {
        if (this.b.b) {
            return;
        }
        m(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            defpackage.dec decVar = (defpackage.dec) list.get(size2);
            if (!decVar.q()) {
                ddzVar.e(decVar.b);
                decVar.p(list, ddzVar);
            }
        }
    }

    private final boolean q() {
        return this.e && this.b.a;
    }

    private final void r(defpackage.cxl cxlVar, java.util.List list) {
        defpackage.bzc bzcVarJ = cxlVar.j();
        java.lang.Object[] objArr = bzcVarJ.a;
        int i = bzcVarJ.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cxl cxlVar2 = (defpackage.cxl) objArr[i2];
            if (cxlVar2.am() && !cxlVar2.D) {
                if (cxlVar2.v.i(8)) {
                    list.add(defpackage.daz.c(cxlVar2, this.e));
                } else {
                    r(cxlVar2, list);
                }
            }
        }
    }

    private final void s(java.util.List list, java.util.List list2) {
        m(list, false);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            defpackage.dec decVar = (defpackage.dec) list.get(size2);
            if (decVar.q()) {
                list2.add(decVar);
            } else if (!decVar.b.b) {
                decVar.s(list, list2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [cge] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [cge] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final defpackage.cjj a(defpackage.ctc ctcVar) {
        ?? O;
        defpackage.dec decVarI = i();
        if (decVarI == null) {
            return defpackage.cjj.a;
        }
        defpackage.cyg cygVar = decVarI.a.v;
        if ((cygVar.a() & 8) == 0) {
            O = 0;
            break;
        }
        defpackage.cge cgeVar = cygVar.f;
        loop0: while (true) {
            if (cgeVar != null) {
                if ((cgeVar.r & 8) != 0) {
                    O = cgeVar;
                    ?? bzcVar = 0;
                    while (O != 0) {
                        if (O instanceof defpackage.czc) {
                            if (((defpackage.czc) O).z()) {
                                break loop0;
                            }
                        } else if ((O.r & 8) != 0 && (O instanceof defpackage.cwo)) {
                            defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                            int i = 0;
                            while (cgeVar2 != null) {
                                if ((cgeVar2.r & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        O = O;
                                        bzcVar = bzcVar;
                                        bzcVar = bzcVar;
                                        O = cgeVar2;
                                    } else {
                                        if (bzcVar == 0) {
                                            bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                        }
                                        if (O != 0) {
                                            bzcVar.n(O);
                                        }
                                        bzcVar.n(cgeVar2);
                                        O = 0;
                                    }
                                } else {
                                    O = O;
                                    bzcVar = bzcVar;
                                }
                                cgeVar2 = cgeVar2.u;
                                O = O;
                                bzcVar = bzcVar;
                            }
                            if (i != 1) {
                                O = O;
                                bzcVar = bzcVar;
                            } else {
                                O = O;
                                bzcVar = bzcVar;
                            }
                        }
                        O = defpackage.cjv.o(bzcVar);
                    }
                }
                if ((cgeVar.s & 8) != 0) {
                    cgeVar = cgeVar.u;
                }
            }
            O = 0;
            break;
        }
        defpackage.czc czcVar = (defpackage.czc) O;
        defpackage.cyl cylVarS = czcVar != null ? defpackage.cjv.s(czcVar, 8) : null;
        return cylVarS == null ? decVarI.a(ctcVar) : cylVarS.o(ctcVar, true);
    }

    public final defpackage.cjj b() {
        defpackage.cyl cylVarF = f();
        if (cylVarF != null) {
            if (true != cylVarF.t()) {
                cylVarF = null;
            }
            if (cylVarF != null) {
                return defpackage.csc.g(cylVarF).o(cylVarF, true);
            }
        }
        return defpackage.cjj.a;
    }

    public final defpackage.cjj c() {
        defpackage.cyl cylVarF = f();
        if (cylVarF != null) {
            if (true != cylVarF.t()) {
                cylVarF = null;
            }
            if (cylVarF != null) {
                return defpackage.csc.f(cylVarF, true);
            }
        }
        return defpackage.cjj.a;
    }

    public final defpackage.cjj d() {
        defpackage.czc czcVarN = n();
        if (czcVarN == null) {
            return this.a.p().ad();
        }
        return defpackage.dai.r(czcVarN.M(), defpackage.dai.s(this.b), true);
    }

    public final defpackage.cjj e() {
        defpackage.czc czcVarN = n();
        if (czcVarN == null) {
            defpackage.cyl cylVarP = this.a.p();
            return defpackage.csc.g(cylVarP).o(cylVarP, false);
        }
        return defpackage.dai.r(czcVarN.M(), defpackage.dai.s(this.b), false);
    }

    public final defpackage.cyl f() {
        if (!j()) {
            defpackage.czc czcVarN = n();
            return czcVarN != null ? defpackage.cjv.s(czcVarN, 8) : this.a.p();
        }
        defpackage.dec decVarI = i();
        if (decVarI != null) {
            return decVarI.f();
        }
        return null;
    }

    public final defpackage.ddz g() {
        boolean zQ = q();
        defpackage.ddz ddzVar = this.b;
        if (!zQ) {
            return ddzVar;
        }
        defpackage.ddz ddzVarB = ddzVar.b();
        p(new java.util.ArrayList(), ddzVarB);
        return ddzVarB;
    }

    public final defpackage.dec h() {
        return new defpackage.dec(this.d, true, this.a, this.b);
    }

    public final defpackage.dec i() {
        defpackage.cxl cxlVarL;
        defpackage.dec decVar = this.f;
        if (decVar != null) {
            return decVar;
        }
        boolean z = this.e;
        if (!z) {
            cxlVarL = null;
            break;
        }
        cxlVarL = this.a.l();
        while (true) {
            if (cxlVarL != null) {
                defpackage.ddz ddzVarR = cxlVarL.r();
                if (ddzVarR != null && ddzVarR.a) {
                    break;
                }
                cxlVarL = cxlVarL.l();
            } else {
                cxlVarL = null;
                break;
            }
        }
        if (cxlVarL == null) {
            cxlVarL = this.a.l();
            while (cxlVarL != null) {
                if (!cxlVarL.v.i(8)) {
                    cxlVarL = cxlVarL.l();
                }
            }
            cxlVarL = null;
        }
        if (cxlVarL == null) {
            return null;
        }
        return defpackage.daz.c(cxlVarL, z);
    }

    public final boolean j() {
        return this.f != null;
    }

    public final java.util.List k(boolean z, boolean z2) {
        if (!z && this.b.b) {
            return defpackage.afce.a;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!q()) {
            return m(arrayList, z2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        s(arrayList, arrayList2);
        return arrayList2;
    }

    public final java.util.List m(java.util.List list, boolean z) {
        if (j()) {
            return defpackage.afce.a;
        }
        r(this.a, list);
        if (z) {
            defpackage.ddz ddzVar = this.b;
            defpackage.ddw ddwVar = (defpackage.ddw) ddzVar.g(defpackage.def.A);
            if (ddwVar != null && ddzVar.a && !list.isEmpty()) {
                list.add(o(ddwVar, new defpackage.chs(ddwVar, 20)));
            }
            defpackage.dej dejVar = defpackage.def.a;
            if (ddzVar.f(dejVar) && !list.isEmpty() && ddzVar.a) {
                java.util.List list2 = (java.util.List) ddzVar.g(dejVar);
                java.lang.String str = list2 != null ? (java.lang.String) defpackage.afga.aB(list2) : null;
                if (str != null) {
                    list.add(0, o(null, new defpackage.deh(str, 1)));
                }
            }
        }
        return list;
    }
}
