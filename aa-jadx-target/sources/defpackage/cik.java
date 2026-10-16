package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cik {
    public final defpackage.cjf a;
    public final defpackage.cif c;
    private final defpackage.cyu f;
    private defpackage.cjc g;
    private defpackage.zx h;
    public final defpackage.cjc b = new defpackage.cjc(2, false, null, 14);
    public final defpackage.cgf d = new defpackage.cyc<defpackage.cjc>() { // from class: cik.1
        @Override // defpackage.cyc
        public final /* bridge */ /* synthetic */ defpackage.cge d() {
            return defpackage.cik.this.b;
        }

        @Override // defpackage.cyc
        public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        }

        public final boolean equals(java.lang.Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return defpackage.cik.this.b.hashCode();
        }
    };
    public final defpackage.aan e = new defpackage.aan(1);

    public cik(defpackage.cjf cjfVar, defpackage.cyu cyuVar) {
        this.a = cjfVar;
        this.f = cyuVar;
        this.c = new defpackage.cif(this, cyuVar);
    }

    private final void n() {
        defpackage.cyg cygVar;
        if (b() == null) {
            return;
        }
        defpackage.cjc cjcVarB = b();
        g(null);
        if (cjcVarB != null) {
            defpackage.cja cjaVar = defpackage.cja.a;
            defpackage.cja cjaVar2 = defpackage.cja.d;
            cjcVarB.l(cjaVar, cjaVar2);
            if (!cjcVarB.q.A) {
                defpackage.csc.c("visitAncestors called on an unattached node");
            }
            defpackage.cge cgeVar = cjcVarB.q.t;
            defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVarB);
            while (cxlVarR != null) {
                if ((cxlVarR.v.f.s & 1024) != 0) {
                    while (cgeVar != null) {
                        if ((cgeVar.r & 1024) != 0) {
                            defpackage.cge cgeVarO = cgeVar;
                            defpackage.bzc bzcVar = null;
                            while (cgeVarO != null) {
                                if (cgeVarO instanceof defpackage.cjc) {
                                    ((defpackage.cjc) cgeVarO).l(defpackage.cja.b, cjaVar2);
                                } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i = 0;
                                    for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                        if ((cgeVar2.r & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cgeVarO = cgeVar2;
                                            } else {
                                                if (bzcVar == null) {
                                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar.n(cgeVarO);
                                                }
                                                bzcVar.n(cgeVar2);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cgeVarO = defpackage.cjv.o(bzcVar);
                            }
                        }
                        cgeVar = cgeVar.t;
                    }
                }
                cxlVarR = cxlVarR.l();
                cgeVar = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
            }
        }
    }

    public final defpackage.cjc a() {
        return defpackage.mw.l(this.b);
    }

    public final defpackage.cjc b() {
        defpackage.cjc cjcVar = this.g;
        if (cjcVar == null || !cjcVar.A) {
            return null;
        }
        return cjcVar;
    }

    public final defpackage.cjj c() {
        defpackage.cjc cjcVarA = a();
        if (cjcVarA != null) {
            return defpackage.mw.n(cjcVarA);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01c4 A[LOOP:2: B:88:0x0169->B:117:0x01c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:213:0x01c7 A[EDGE_INSN: B:213:0x01c7->B:118:0x01c7 BREAK  A[LOOP:1: B:83:0x0153->B:219:0x0153], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:65:0x0104 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x010d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0113  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:74:0x0122  */
    /* JADX WARN: Code duplicated, block: B:76:0x0128  */
    /* JADX WARN: Code duplicated, block: B:78:0x0134  */
    /* JADX WARN: Code duplicated, block: B:81:0x0148  */
    /* JADX WARN: Code duplicated, block: B:82:0x0150  */
    /* JADX WARN: Code duplicated, block: B:85:0x0157  */
    /* JADX WARN: Code duplicated, block: B:89:0x016b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0175  */
    /* JADX WARN: Code duplicated, block: B:98:0x0189  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [cge] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [cge] */
    /* JADX WARN: Type inference failed for: r2v11, types: [cjc] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [cge] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [bzc] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [bzc] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r5v10, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v11, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [cge] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v9, types: [cge] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r9v19 */
    public final java.lang.Boolean d(int i, defpackage.cjj cjjVar, defpackage.affc affcVar) {
        java.lang.Boolean bool;
        ?? r2;
        defpackage.cyg cygVar;
        ?? r1;
        boolean zN;
        defpackage.cit citVar;
        defpackage.cit citVar2;
        defpackage.cit citVar3;
        defpackage.cit citVar4;
        defpackage.bzc bzcVar;
        int i2;
        java.lang.Object[] objArr;
        int i3;
        boolean z;
        defpackage.ciw ciwVar;
        defpackage.bzc bzcVar2;
        defpackage.cge cgeVar;
        int i4;
        ?? O;
        ?? bzcVar3;
        defpackage.cjc cjcVarA;
        defpackage.cjc cjcVarA2 = a();
        int i5 = 4;
        boolean zBooleanValue = false;
        boolean z2 = false;
        zBooleanValue = false;
        if (cjcVarA2 != null) {
            defpackage.dlz dlzVarS = this.f.s();
            defpackage.cim cimVarB = cjcVarA2.b();
            if (i == 1) {
                citVar = ((defpackage.cio) cimVarB).b;
            } else if (i == 2) {
                citVar = ((defpackage.cio) cimVarB).c;
            } else if (i == 5) {
                citVar = ((defpackage.cio) cimVarB).d;
            } else {
                if (i == 6) {
                    citVar = ((defpackage.cio) cimVarB).e;
                } else if (i == 3) {
                    int iOrdinal = dlzVarS.ordinal();
                    if (iOrdinal == 0) {
                        citVar = ((defpackage.cio) cimVarB).h;
                    } else {
                        if (iOrdinal != 1) {
                            throw new defpackage.afas();
                        }
                        citVar = ((defpackage.cio) cimVarB).i;
                    }
                    bool = null;
                    if (citVar == defpackage.cit.a) {
                        citVar = null;
                    }
                    if (citVar == null) {
                        citVar = ((defpackage.cio) cimVarB).f;
                    }
                } else {
                    bool = null;
                    if (i == 4) {
                        int iOrdinal2 = dlzVarS.ordinal();
                        if (iOrdinal2 == 0) {
                            citVar2 = ((defpackage.cio) cimVarB).i;
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new defpackage.afas();
                            }
                            citVar2 = ((defpackage.cio) cimVarB).h;
                        }
                        citVar = citVar2 == defpackage.cit.a ? null : citVar2;
                        if (citVar == null) {
                            citVar = ((defpackage.cio) cimVarB).g;
                        }
                    } else {
                        if (i != 7 && i != 8) {
                            throw new java.lang.IllegalStateException("invalid FocusDirection");
                        }
                        defpackage.chw chwVar = new defpackage.chw(i);
                        defpackage.cik cikVar = ((defpackage.czz) defpackage.cjv.t(cjcVarA2)).J;
                        defpackage.cjc cjcVarB = cikVar.b();
                        if (i == 7) {
                            ((defpackage.cio) cimVarB).j.invoke(chwVar);
                        } else {
                            ((defpackage.cio) cimVarB).k.invoke(chwVar);
                        }
                        citVar = chwVar.b ? defpackage.cit.b : cjcVarB != cikVar.b() ? defpackage.cit.c : defpackage.cit.a;
                    }
                }
                citVar3 = defpackage.cit.b;
                if (!defpackage.afga.f(citVar, citVar3)) {
                    return bool;
                }
                if (defpackage.afga.f(citVar, defpackage.cit.c)) {
                    cjcVarA = a();
                    if (cjcVarA != null) {
                        return (java.lang.Boolean) affcVar.invoke(cjcVarA);
                    }
                    return bool;
                }
                citVar4 = defpackage.cit.a;
                if (!defpackage.afga.f(citVar, citVar4)) {
                    if (citVar != citVar4) {
                        throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                    }
                    if (citVar != citVar3) {
                        throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                    }
                    bzcVar = citVar.d;
                    i2 = bzcVar.b;
                    if (i2 == 0) {
                        java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                    } else {
                        objArr = bzcVar.a;
                        z = false;
                        for (i3 = 0; i3 < i2; i3++) {
                            ciwVar = (defpackage.ciw) objArr[i3];
                            if (!ciwVar.M().A) {
                                defpackage.csc.c("visitChildren called on an unattached node");
                            }
                            bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                            cgeVar = ciwVar.M().u;
                            if (cgeVar == null) {
                                defpackage.cjv.x(bzcVar2, ciwVar.M());
                            } else {
                                bzcVar2.n(cgeVar);
                            }
                            while (true) {
                                i4 = bzcVar2.b;
                                if (i4 != 0) {
                                    break;
                                }
                                O = (defpackage.cge) bzcVar2.c(i4 - 1);
                                if ((O.s & 1024) == 0) {
                                    defpackage.cjv.x(bzcVar2, O);
                                } else {
                                    while (O != 0) {
                                        if ((O.r & 1024) != 0) {
                                            bzcVar3 = bool;
                                            while (O != 0) {
                                                if (O instanceof defpackage.cjc) {
                                                    if (((java.lang.Boolean) affcVar.invoke((defpackage.cjc) O)).booleanValue()) {
                                                        z = true;
                                                        break;
                                                    }
                                                } else if ((O.r & 1024) == 0 && (O instanceof defpackage.cwo)) {
                                                    defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                                                    int i6 = 0;
                                                    while (cgeVar2 != null) {
                                                        if ((cgeVar2.r & 1024) != 0) {
                                                            i6++;
                                                            if (i6 == 1) {
                                                                O = O;
                                                                bzcVar3 = bzcVar3;
                                                                bzcVar3 = bzcVar3;
                                                                O = cgeVar2;
                                                            } else {
                                                                if (bzcVar3 == 0) {
                                                                    bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                                                }
                                                                if (O != 0) {
                                                                    bzcVar3.n(O);
                                                                }
                                                                bzcVar3.n(cgeVar2);
                                                                O = bool;
                                                            }
                                                        } else {
                                                            O = O;
                                                            bzcVar3 = bzcVar3;
                                                        }
                                                        cgeVar2 = cgeVar2.u;
                                                        O = O;
                                                        bzcVar3 = bzcVar3;
                                                    }
                                                    if (i6 != 1) {
                                                        O = O;
                                                        bzcVar3 = bzcVar3;
                                                    } else {
                                                        O = O;
                                                        bzcVar3 = bzcVar3;
                                                    }
                                                }
                                                O = defpackage.cjv.o(bzcVar3);
                                            }
                                            break;
                                        }
                                        O = O.u;
                                    }
                                }
                            }
                        }
                        z2 = z;
                    }
                    return java.lang.Boolean.valueOf(z2);
                }
            }
            bool = null;
            citVar3 = defpackage.cit.b;
            if (!defpackage.afga.f(citVar, citVar3)) {
                return bool;
            }
            if (defpackage.afga.f(citVar, defpackage.cit.c)) {
                cjcVarA = a();
                if (cjcVarA != null) {
                    return (java.lang.Boolean) affcVar.invoke(cjcVarA);
                }
                return bool;
            }
            citVar4 = defpackage.cit.a;
            if (!defpackage.afga.f(citVar, citVar4)) {
                if (citVar != citVar4) {
                    throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                }
                if (citVar != citVar3) {
                    throw new java.lang.IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                }
                bzcVar = citVar.d;
                i2 = bzcVar.b;
                if (i2 == 0) {
                    java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                } else {
                    objArr = bzcVar.a;
                    z = false;
                    while (i3 < i2) {
                        ciwVar = (defpackage.ciw) objArr[i3];
                        if (!ciwVar.M().A) {
                            defpackage.csc.c("visitChildren called on an unattached node");
                        }
                        bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                        cgeVar = ciwVar.M().u;
                        if (cgeVar == null) {
                            defpackage.cjv.x(bzcVar2, ciwVar.M());
                        } else {
                            bzcVar2.n(cgeVar);
                        }
                        while (true) {
                            i4 = bzcVar2.b;
                            if (i4 != 0) {
                                break;
                                break;
                            }
                            O = (defpackage.cge) bzcVar2.c(i4 - 1);
                            if ((O.s & 1024) == 0) {
                                defpackage.cjv.x(bzcVar2, O);
                            } else {
                                while (O != 0) {
                                    if ((O.r & 1024) != 0) {
                                        bzcVar3 = bool;
                                        while (O != 0) {
                                            if (O instanceof defpackage.cjc) {
                                                if (((java.lang.Boolean) affcVar.invoke((defpackage.cjc) O)).booleanValue()) {
                                                    z = true;
                                                    break;
                                                    break;
                                                }
                                            } else if ((O.r & 1024) == 0) {
                                            }
                                            O = defpackage.cjv.o(bzcVar3);
                                        }
                                        break;
                                        break;
                                    }
                                    O = O.u;
                                }
                            }
                        }
                    }
                    z2 = z;
                }
                return java.lang.Boolean.valueOf(z2);
            }
        } else {
            bool = null;
            cjcVarA2 = null;
        }
        defpackage.cjc cjcVar = this.b;
        defpackage.dlz dlzVarS2 = this.f.s();
        defpackage.cij cijVar = new defpackage.cij(cjcVarA2, this, affcVar, zBooleanValue ? 1 : 0);
        if (i == 1) {
            zN = defpackage.rj.o(cjcVar, cijVar);
        } else {
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5 || i == 6) {
                    return defpackage.rj.j(cjcVar, i, cjjVar, cijVar);
                }
                if (i == 7) {
                    int iOrdinal3 = dlzVarS2.ordinal();
                    if (iOrdinal3 != 0) {
                        if (iOrdinal3 != 1) {
                            throw new defpackage.afas();
                        }
                        i5 = 3;
                    }
                    defpackage.cjc cjcVarL = defpackage.mw.l(cjcVar);
                    return cjcVarL != null ? defpackage.rj.j(cjcVarL, i5, cjjVar, cijVar) : bool;
                }
                defpackage.cjc cjcVarL2 = defpackage.mw.l(cjcVar);
                if (cjcVarL2 == null) {
                    r2 = bool;
                    break;
                }
                if (!cjcVarL2.q.A) {
                    defpackage.csc.c("visitAncestors called on an unattached node");
                }
                java.lang.Object obj = cjcVarL2.q.t;
                defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVarL2);
                loop5: while (true) {
                    if (cxlVarR == null) {
                        r2 = bool;
                        break;
                    }
                    if ((cxlVarR.v.f.s & 1024) != 0) {
                        while (r1 != 0) {
                            if ((r1.r & 1024) != 0) {
                                ?? O2 = r1;
                                ?? bzcVar4 = bool;
                                while (O2 != 0) {
                                    if (O2 instanceof defpackage.cjc) {
                                        r2 = (defpackage.cjc) O2;
                                        if (((defpackage.cio) r2.b()).a) {
                                            break loop5;
                                        }
                                    } else if ((O2.r & 1024) != 0 && (O2 instanceof defpackage.cwo)) {
                                        defpackage.cge cgeVar3 = ((defpackage.cwo) O2).C;
                                        int i7 = 0;
                                        while (cgeVar3 != null) {
                                            if ((cgeVar3.r & 1024) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    O2 = O2;
                                                    bzcVar4 = bzcVar4;
                                                    bzcVar4 = bzcVar4;
                                                    O2 = cgeVar3;
                                                } else {
                                                    if (bzcVar4 == 0) {
                                                        bzcVar4 = new defpackage.bzc(new defpackage.cge[16]);
                                                    }
                                                    if (O2 != 0) {
                                                        bzcVar4.n(O2);
                                                    }
                                                    bzcVar4.n(cgeVar3);
                                                    O2 = bool;
                                                }
                                            } else {
                                                O2 = O2;
                                                bzcVar4 = bzcVar4;
                                            }
                                            cgeVar3 = cgeVar3.u;
                                            O2 = O2;
                                            bzcVar4 = bzcVar4;
                                        }
                                        if (i7 != 1) {
                                            O2 = O2;
                                            bzcVar4 = bzcVar4;
                                        } else {
                                            O2 = O2;
                                            bzcVar4 = bzcVar4;
                                        }
                                    }
                                    O2 = defpackage.cjv.o(bzcVar4);
                                }
                            }
                            r1 = r1.t;
                        }
                    }
                    r1 = obj;
                    cxlVarR = cxlVarR.l();
                    obj = (cxlVarR == null || (cygVar = cxlVarR.v) == null) ? bool : cygVar.e;
                }
                if (r2 != 0 && !defpackage.afga.f(r2, cjcVar)) {
                    zBooleanValue = ((java.lang.Boolean) cijVar.invoke(r2)).booleanValue();
                }
                return java.lang.Boolean.valueOf(zBooleanValue);
            }
            zN = defpackage.rj.n(cjcVar, cijVar);
        }
        return java.lang.Boolean.valueOf(zN);
    }

    public final void e() {
        this.a.h();
    }

    public final void f() {
        this.c.a();
    }

    public final void g(defpackage.cjc cjcVar) {
        defpackage.cjc cjcVar2 = this.g;
        this.g = cjcVar;
        defpackage.aan aanVar = this.e;
        java.lang.Object[] objArr = aanVar.a;
        int i = aanVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((defpackage.cig) objArr[i2]).dX(cjcVar2, cjcVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:111:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:113:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:116:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:119:0x03d8 A[ADDED_TO_REGION, LOOP:14: B:119:0x03d8->B:147:0x0426, LOOP_START, PHI: r7
  0x03d8: PHI (r7v31 cge) = (r7v26 cge), (r7v32 cge) binds: [B:117:0x03d5, B:147:0x0426] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x03da  */
    /* JADX WARN: Code duplicated, block: B:122:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:127:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:157:0x043d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0443  */
    /* JADX WARN: Code duplicated, block: B:160:0x044b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0458  */
    /* JADX WARN: Code duplicated, block: B:166:0x0463 A[ADDED_TO_REGION, LOOP:18: B:166:0x0463->B:194:0x04b1, LOOP_START, PHI: r2
  0x0463: PHI (r2v19 cge) = (r2v14 cge), (r2v20 cge) binds: [B:164:0x0460, B:194:0x04b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:167:0x0465  */
    /* JADX WARN: Code duplicated, block: B:169:0x046b  */
    /* JADX WARN: Code duplicated, block: B:171:0x046f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0474  */
    /* JADX WARN: Code duplicated, block: B:176:0x047a  */
    /* JADX WARN: Code duplicated, block: B:197:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:205:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:246:0x054e A[PHI: r9
  0x054e: PHI (r9v29 bzc) = (r9v28 bzc), (r9v28 bzc), (r9v28 bzc), (r9v31 bzc) binds: [B:226:0x0514, B:228:0x051a, B:230:0x051e, B:245:0x054c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:384:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0439 A[EDGE_INSN: B:385:0x0439->B:155:0x0439 BREAK  A[LOOP:13: B:115:0x03cb->B:387:0x03cb, LOOP_LABEL: LOOP:13: B:115:0x03cb->B:387:0x03cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x0426 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x04c1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x04c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x04c4 A[EDGE_INSN: B:406:0x04c4->B:202:0x04c4 BREAK  A[LOOP:17: B:162:0x0456->B:408:0x0456, LOOP_LABEL: LOOP:17: B:162:0x0456->B:408:0x0456], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x04b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x04ac A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v11, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v16, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [bzc] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [bzc] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [bzc] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43, types: [bzc] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r2v71 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Type inference failed for: r2v73 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r7v126 */
    /* JADX WARN: Type inference failed for: r7v127 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [cge] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [cge] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10, types: [bzc] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13, types: [bzc] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26, types: [cge] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28, types: [cge] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /* JADX WARN: Type inference failed for: r8v86 */
    /* JADX WARN: Type inference failed for: r8v87 */
    /* JADX WARN: Type inference failed for: r8v88 */
    /* JADX WARN: Type inference failed for: r8v89 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [bzc] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [bzc] */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final boolean h(android.view.KeyEvent keyEvent, defpackage.afer aferVar) {
        int iNumberOfTrailingZeros;
        defpackage.cjc cjcVar;
        defpackage.cge cgeVar;
        defpackage.cxl cxlVarR;
        ?? O;
        defpackage.cpz cpzVar;
        defpackage.cge cgeVarM;
        defpackage.cyg cygVar;
        ?? bzcVar;
        defpackage.cge cgeVar2;
        defpackage.cxl cxlVarR2;
        ?? O2;
        defpackage.cpz cpzVar2;
        defpackage.cyg cygVar2;
        ?? bzcVar2;
        defpackage.cge cgeVarM2;
        ?? r0;
        ?? bzcVar3;
        ?? O3;
        int size;
        defpackage.cyg cygVar3;
        java.util.ArrayList arrayList;
        boolean z;
        long j;
        int iB;
        int i;
        if (this.c.a) {
            java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
            return false;
        }
        long jI = defpackage.tn.i(keyEvent);
        int iH = defpackage.tn.h(keyEvent);
        char c = '\b';
        if (iH == 2) {
            defpackage.zx zxVar = this.h;
            if (zxVar == null) {
                zxVar = new defpackage.zx(3);
                this.h = zxVar;
            }
            defpackage.zx zxVar2 = zxVar;
            int i2 = -862048943;
            int i3 = ((int) (jI ^ (jI >>> 32))) * (-862048943);
            int i4 = (i3 << 16) ^ i3;
            int i5 = zxVar2.c;
            int i6 = i4 >>> 7;
            int i7 = i6 & i5;
            int i8 = 0;
            loop0: while (true) {
                long[] jArr = zxVar2.a;
                int i9 = i7 >> 3;
                int i10 = i2;
                int i11 = (i7 & 7) << 3;
                long j2 = (jArr[i9] >>> i11) | ((jArr[i9 + 1] << (64 - i11)) & ((-i11) >> 63));
                long j3 = i4 & 127;
                int i12 = 1;
                long j4 = j2 ^ (72340172838076673L * j3);
                long j5 = (j4 - 72340172838076673L) & (~j4) & (-9187201950435737472L);
                while (j5 != 0) {
                    iB = (i7 + (java.lang.Long.numberOfTrailingZeros(j5) >> 3)) & i5;
                    int i13 = i12;
                    if (zxVar2.b[iB] == jI) {
                        break loop0;
                    }
                    j5 &= j5 - 1;
                    i12 = i13;
                }
                int i14 = i12;
                if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                    int iB2 = zxVar2.b(i6);
                    if (zxVar2.e != 0 || ((zxVar2.a[iB2 >> 3] >> ((iB2 & 7) << 3)) & 255) == 254) {
                        j = 128;
                        iB = iB2;
                    } else {
                        int i15 = zxVar2.c;
                        if (i15 > 8) {
                            j = 128;
                            if (java.lang.Long.compare((((long) zxVar2.d) * 32) ^ Long.MIN_VALUE, (((long) i15) * 25) ^ Long.MIN_VALUE) <= 0) {
                                long[] jArr2 = zxVar2.a;
                                int i16 = zxVar2.c;
                                long[] jArr3 = zxVar2.b;
                                int i17 = 0;
                                for (int i18 = (i16 + 7) >> 3; i17 < i18; i18 = i18) {
                                    long j6 = jArr2[i17] & (-9187201950435737472L);
                                    jArr2[i17] = ((~j6) + (j6 >>> 7)) & (-72340172838076674L);
                                    i17++;
                                    jArr3 = jArr3;
                                }
                                long[] jArr4 = jArr3;
                                int iBG = defpackage.afga.bG(jArr2);
                                int i19 = iBG - 1;
                                jArr2[i19] = (jArr2[i19] & 72057594037927935L) | (-72057594037927936L);
                                jArr2[iBG] = jArr2[0];
                                int i20 = 0;
                                while (i20 != i16) {
                                    int i21 = i20 >> 3;
                                    int i22 = (i20 & 7) << 3;
                                    long j7 = (jArr2[i21] >> i22) & 255;
                                    if (j7 != 128 && j7 == 254) {
                                        long j8 = jArr4[i20];
                                        int i23 = ((int) (j8 ^ (j8 >>> 32))) * i10;
                                        int i24 = i23 ^ (i23 << 16);
                                        int i25 = i24 >>> 7;
                                        int iB3 = zxVar2.b(i25);
                                        int i26 = i25 & i16;
                                        char c2 = c;
                                        if (((iB3 - i26) & i16) / 8 == ((i20 - i26) & i16) / 8) {
                                            jArr2[i21] = ((~(255 << i22)) & jArr2[i21]) | (((long) (i24 & 127)) << i22);
                                            jArr2[defpackage.afga.bG(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                            i20++;
                                        } else {
                                            int i27 = i20;
                                            int i28 = iB3 >> 3;
                                            long j9 = jArr2[i28];
                                            int i29 = i24 & 127;
                                            int i30 = (iB3 & 7) << 3;
                                            long j10 = ~(255 << i30);
                                            long j11 = i29;
                                            if (((j9 >> i30) & 255) == 128) {
                                                jArr2[i28] = (j11 << i30) | (j9 & j10);
                                                jArr2[i21] = (jArr2[i21] & (~(255 << i22))) | (128 << i22);
                                                jArr4[iB3] = jArr4[i27];
                                                jArr4[i27] = 0;
                                                i = i27;
                                            } else {
                                                jArr2[i28] = (j11 << i30) | (j9 & j10);
                                                long j12 = jArr4[iB3];
                                                jArr4[iB3] = jArr4[i27];
                                                jArr4[i27] = j12;
                                                i = i27 - 1;
                                            }
                                            jArr2[defpackage.afga.bG(jArr2)] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                            i20 = i + 1;
                                        }
                                        i16 = i16;
                                        c = c2;
                                    } else {
                                        i20++;
                                    }
                                }
                                zxVar2.c();
                            }
                            iB = zxVar2.b(i6);
                        } else {
                            j = 128;
                        }
                        int iB4 = defpackage.aav.b(zxVar2.c);
                        long[] jArr5 = zxVar2.a;
                        long[] jArr6 = zxVar2.b;
                        int i31 = zxVar2.c;
                        zxVar2.d(iB4);
                        long[] jArr7 = zxVar2.a;
                        long[] jArr8 = zxVar2.b;
                        int i32 = zxVar2.c;
                        int i33 = 0;
                        while (i33 < i31) {
                            if (((jArr5[i33 >> 3] >> ((i33 & 7) << 3)) & 255) < j) {
                                long j13 = jArr6[i33];
                                int i34 = ((int) (j13 ^ (j13 >>> 32))) * i10;
                                int i35 = i34 ^ (i34 << 16);
                                int iB5 = zxVar2.b(i35 >>> 7);
                                int i36 = iB5 >> 3;
                                int i37 = (iB5 & 7) << 3;
                                long j14 = (jArr7[i36] & (~(255 << i37))) | (((long) (i35 & 127)) << i37);
                                jArr7[i36] = j14;
                                jArr7[(((iB5 - 7) & i32) + (i32 & 7)) >> 3] = j14;
                                jArr8[iB5] = j13;
                            }
                            i33++;
                            jArr5 = jArr5;
                            jArr6 = jArr6;
                        }
                        iB = zxVar2.b(i6);
                    }
                    zxVar2.d++;
                    int i38 = zxVar2.e;
                    long[] jArr9 = zxVar2.a;
                    int i39 = iB >> 3;
                    long j15 = jArr9[i39];
                    int i40 = (iB & 7) << 3;
                    zxVar2.e = i38 - (((j15 >> i40) & 255) == j ? i14 : 0);
                    int i41 = zxVar2.c;
                    long j16 = (j15 & (~(255 << i40))) | (j3 << i40);
                    jArr9[i39] = j16;
                    jArr9[(((iB - 7) & i41) + (i41 & 7)) >> 3] = j16;
                    break;
                }
                i8 += 8;
                i7 = (i7 + i8) & i5;
                i2 = i10;
            }
            zxVar2.b[iB] = jI;
        } else if (iH == 1) {
            defpackage.zx zxVar3 = this.h;
            if (zxVar3 == null || !zxVar3.a(jI)) {
                return false;
            }
            defpackage.zx zxVar4 = this.h;
            if (zxVar4 != null) {
                int i42 = ((int) ((jI >>> 32) ^ jI)) * (-862048943);
                int i43 = i42 ^ (i42 << 16);
                int i44 = zxVar4.c;
                int i45 = (i43 >>> 7) & i44;
                int i46 = 0;
                loop24: while (true) {
                    long[] jArr10 = zxVar4.a;
                    int i47 = i45 >> 3;
                    int i48 = (i45 & 7) << 3;
                    long j17 = ((jArr10[i47 + 1] << (64 - i48)) & ((-i48) >> 63)) | (jArr10[i47] >>> i48);
                    long j18 = (((long) (i43 & 127)) * 72340172838076673L) ^ j17;
                    for (long j19 = (j18 - 72340172838076673L) & (~j18) & (-9187201950435737472L); j19 != 0; j19 &= j19 - 1) {
                        iNumberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j19) >> 3) + i45) & i44;
                        if (zxVar4.b[iNumberOfTrailingZeros] == jI) {
                            break loop24;
                        }
                    }
                    if ((j17 & ((~j17) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i46 += 8;
                    i45 = (i45 + i46) & i44;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    zxVar4.d--;
                    long[] jArr11 = zxVar4.a;
                    int i49 = zxVar4.c;
                    int i50 = iNumberOfTrailingZeros >> 3;
                    int i51 = (iNumberOfTrailingZeros & 7) << 3;
                    long j20 = (jArr11[i50] & (~(255 << i51))) | (254 << i51);
                    jArr11[i50] = j20;
                    jArr11[(((iNumberOfTrailingZeros - 7) & i49) + (i49 & 7)) >> 3] = j20;
                }
            }
        }
        defpackage.cjc cjcVarA = a();
        if (cjcVarA != null) {
            if (!cjcVarA.q.A) {
                defpackage.csc.c("visitLocalDescendants called on an unattached node");
            }
            defpackage.cge cgeVar3 = cjcVarA.q;
            if ((cgeVar3.s & 9216) != 0) {
                cgeVarM = null;
                for (defpackage.cge cgeVar4 = cgeVar3.u; cgeVar4 != null; cgeVar4 = cgeVar4.u) {
                    int i52 = cgeVar4.r;
                    if ((i52 & 9216) != 0) {
                        if ((i52 & 1024) != 0) {
                            break;
                        }
                        cgeVarM = cgeVar4;
                    }
                }
            } else {
                cgeVarM = null;
            }
            if (cgeVarM == null) {
                if (cjcVarA == null) {
                    cjcVar = this.b;
                    if (!cjcVar.q.A) {
                        defpackage.csc.c("visitAncestors called on an unattached node");
                    }
                    cgeVar = cjcVar.q.t;
                    cxlVarR = defpackage.cjv.r(cjcVar);
                    loop17: while (true) {
                        if (cxlVarR != null) {
                            O = 0;
                            break;
                        }
                        if ((cxlVarR.v.f.s & 8192) != 0) {
                            while (cgeVar != null) {
                                if ((cgeVar.r & 8192) != 0) {
                                    O = cgeVar;
                                    bzcVar = 0;
                                    while (O != 0) {
                                        if (O instanceof defpackage.cpz) {
                                            break loop17;
                                            break loop17;
                                        }
                                        if ((O.r & 8192) == 0) {
                                        }
                                        O = defpackage.cjv.o(bzcVar);
                                    }
                                }
                                cgeVar = cgeVar.t;
                            }
                        }
                        cxlVarR = cxlVarR.l();
                        if (cxlVarR != null) {
                        }
                    }
                    cpzVar = (defpackage.cpz) O;
                    if (cpzVar != null) {
                        cgeVarM = cpzVar.M();
                    } else {
                        cgeVarM = null;
                    }
                } else {
                    if (!cjcVarA.q.A) {
                        defpackage.csc.c("visitAncestors called on an unattached node");
                    }
                    cgeVar2 = cjcVarA.q;
                    cxlVarR2 = defpackage.cjv.r(cjcVarA);
                    loop13: while (true) {
                        if (cxlVarR2 != null) {
                            O2 = 0;
                            break;
                        }
                        if ((cxlVarR2.v.f.s & 8192) != 0) {
                            while (cgeVar2 != null) {
                                if ((cgeVar2.r & 8192) != 0) {
                                    bzcVar2 = 0;
                                    O2 = cgeVar2;
                                    while (O2 != 0) {
                                        if (O2 instanceof defpackage.cpz) {
                                            break loop13;
                                            break loop13;
                                        }
                                        if ((O2.r & 8192) == 0) {
                                        }
                                        O2 = defpackage.cjv.o(bzcVar2);
                                    }
                                }
                                cgeVar2 = cgeVar2.t;
                            }
                        }
                        cxlVarR2 = cxlVarR2.l();
                        if (cxlVarR2 != null) {
                        }
                    }
                    cpzVar2 = (defpackage.cpz) O2;
                    if (cpzVar2 != null) {
                        cgeVarM = cpzVar2.M();
                    } else {
                        cjcVar = this.b;
                        if (!cjcVar.q.A) {
                            defpackage.csc.c("visitAncestors called on an unattached node");
                        }
                        cgeVar = cjcVar.q.t;
                        cxlVarR = defpackage.cjv.r(cjcVar);
                        loop17: while (true) {
                            if (cxlVarR != null) {
                                O = 0;
                                break;
                            }
                            if ((cxlVarR.v.f.s & 8192) != 0) {
                                while (cgeVar != null) {
                                    if ((cgeVar.r & 8192) != 0) {
                                        O = cgeVar;
                                        bzcVar = 0;
                                        while (O != 0) {
                                            if (O instanceof defpackage.cpz) {
                                                break loop17;
                                                break loop17;
                                            }
                                            if ((O.r & 8192) == 0) {
                                            }
                                            O = defpackage.cjv.o(bzcVar);
                                        }
                                    }
                                    cgeVar = cgeVar.t;
                                }
                            }
                            cxlVarR = cxlVarR.l();
                            if (cxlVarR != null) {
                            }
                        }
                        cpzVar = (defpackage.cpz) O;
                        if (cpzVar != null) {
                            cgeVarM = cpzVar.M();
                        } else {
                            cgeVarM = null;
                        }
                    }
                }
            }
        } else if (cjcVarA == null) {
            cjcVar = this.b;
            if (!cjcVar.q.A) {
                defpackage.csc.c("visitAncestors called on an unattached node");
            }
            cgeVar = cjcVar.q.t;
            cxlVarR = defpackage.cjv.r(cjcVar);
            loop17: while (true) {
                if (cxlVarR != null) {
                    O = 0;
                    break;
                }
                if ((cxlVarR.v.f.s & 8192) != 0) {
                    while (cgeVar != null) {
                        if ((cgeVar.r & 8192) != 0) {
                            O = cgeVar;
                            bzcVar = 0;
                            while (O != 0) {
                                if (O instanceof defpackage.cpz) {
                                    break loop17;
                                }
                                if ((O.r & 8192) == 0 && (O instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar5 = ((defpackage.cwo) O).C;
                                    int i53 = 0;
                                    while (cgeVar5 != null) {
                                        if ((cgeVar5.r & 8192) != 0) {
                                            i53++;
                                            if (i53 == 1) {
                                                O = O;
                                                bzcVar = bzcVar;
                                                bzcVar = bzcVar;
                                                O = cgeVar5;
                                            } else {
                                                if (bzcVar == 0) {
                                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (O != 0) {
                                                    bzcVar.n(O);
                                                }
                                                bzcVar.n(cgeVar5);
                                                O = 0;
                                            }
                                        } else {
                                            O = O;
                                            bzcVar = bzcVar;
                                        }
                                        cgeVar5 = cgeVar5.u;
                                        O = O;
                                        bzcVar = bzcVar;
                                    }
                                    O = O;
                                    bzcVar = bzcVar;
                                    if (i53 != 1) {
                                    }
                                }
                                O = defpackage.cjv.o(bzcVar);
                            }
                        }
                        cgeVar = cgeVar.t;
                    }
                }
                cxlVarR = cxlVarR.l();
                cgeVar = (cxlVarR != null || (cygVar = cxlVarR.v) == null) ? null : cygVar.e;
            }
            cpzVar = (defpackage.cpz) O;
            if (cpzVar != null) {
                cgeVarM = cpzVar.M();
            } else {
                cgeVarM = null;
            }
        } else {
            if (!cjcVarA.q.A) {
                defpackage.csc.c("visitAncestors called on an unattached node");
            }
            cgeVar2 = cjcVarA.q;
            cxlVarR2 = defpackage.cjv.r(cjcVarA);
            loop13: while (true) {
                if (cxlVarR2 != null) {
                    O2 = 0;
                    break;
                }
                if ((cxlVarR2.v.f.s & 8192) != 0) {
                    while (cgeVar2 != null) {
                        if ((cgeVar2.r & 8192) != 0) {
                            bzcVar2 = 0;
                            O2 = cgeVar2;
                            while (O2 != 0) {
                                if (O2 instanceof defpackage.cpz) {
                                    break loop13;
                                }
                                if ((O2.r & 8192) == 0 && (O2 instanceof defpackage.cwo)) {
                                    defpackage.cge cgeVar6 = ((defpackage.cwo) O2).C;
                                    int i54 = 0;
                                    while (cgeVar6 != null) {
                                        if ((cgeVar6.r & 8192) != 0) {
                                            i54++;
                                            if (i54 == 1) {
                                                O2 = O2;
                                                bzcVar2 = bzcVar2;
                                                bzcVar2 = bzcVar2;
                                                O2 = cgeVar6;
                                            } else {
                                                if (bzcVar2 == 0) {
                                                    bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (O2 != 0) {
                                                    bzcVar2.n(O2);
                                                }
                                                bzcVar2.n(cgeVar6);
                                                O2 = 0;
                                            }
                                        } else {
                                            O2 = O2;
                                            bzcVar2 = bzcVar2;
                                        }
                                        cgeVar6 = cgeVar6.u;
                                        O2 = O2;
                                        bzcVar2 = bzcVar2;
                                    }
                                    O2 = O2;
                                    bzcVar2 = bzcVar2;
                                    if (i54 != 1) {
                                    }
                                }
                                O2 = defpackage.cjv.o(bzcVar2);
                            }
                        }
                        cgeVar2 = cgeVar2.t;
                    }
                }
                cxlVarR2 = cxlVarR2.l();
                cgeVar2 = (cxlVarR2 != null || (cygVar2 = cxlVarR2.v) == null) ? null : cygVar2.e;
            }
            cpzVar2 = (defpackage.cpz) O2;
            if (cpzVar2 != null) {
                cgeVarM = cpzVar2.M();
            } else {
                cjcVar = this.b;
                if (!cjcVar.q.A) {
                    defpackage.csc.c("visitAncestors called on an unattached node");
                }
                cgeVar = cjcVar.q.t;
                cxlVarR = defpackage.cjv.r(cjcVar);
                loop17: while (true) {
                    if (cxlVarR != null) {
                        O = 0;
                        break;
                    }
                    if ((cxlVarR.v.f.s & 8192) != 0) {
                        while (cgeVar != null) {
                            if ((cgeVar.r & 8192) != 0) {
                                O = cgeVar;
                                bzcVar = 0;
                                while (O != 0) {
                                    if (O instanceof defpackage.cpz) {
                                        break loop17;
                                        break loop17;
                                    }
                                    if ((O.r & 8192) == 0) {
                                    }
                                    O = defpackage.cjv.o(bzcVar);
                                }
                            }
                            cgeVar = cgeVar.t;
                        }
                    }
                    cxlVarR = cxlVarR.l();
                    if (cxlVarR != null) {
                    }
                }
                cpzVar = (defpackage.cpz) O;
                if (cpzVar != null) {
                    cgeVarM = cpzVar.M();
                } else {
                    cgeVarM = null;
                }
            }
        }
        if (cgeVarM != null) {
            if (!cgeVarM.M().A) {
                defpackage.csc.c("visitAncestors called on an unattached node");
            }
            defpackage.cge cgeVar7 = cgeVarM.M().t;
            defpackage.cxl cxlVarR3 = defpackage.cjv.r(cgeVarM);
            java.util.ArrayList arrayList2 = null;
            while (cxlVarR3 != null) {
                if ((cxlVarR3.v.f.s & 8192) != 0) {
                    while (cgeVar7 != null) {
                        if ((cgeVar7.r & 8192) != 0) {
                            defpackage.cge cgeVarO = cgeVar7;
                            defpackage.bzc bzcVar4 = null;
                            while (cgeVarO != null) {
                                if (cgeVarO instanceof defpackage.cpz) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new java.util.ArrayList();
                                    }
                                    arrayList2.add(cgeVarO);
                                    arrayList = arrayList2;
                                    z = false;
                                } else {
                                    arrayList = arrayList2;
                                    z = true;
                                }
                                if (z && (cgeVarO.r & 8192) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i55 = 0;
                                    for (defpackage.cge cgeVar8 = ((defpackage.cwo) cgeVarO).C; cgeVar8 != null; cgeVar8 = cgeVar8.u) {
                                        if ((cgeVar8.r & 8192) != 0) {
                                            i55++;
                                            if (i55 == 1) {
                                                cgeVarO = cgeVar8;
                                            } else {
                                                if (bzcVar4 == null) {
                                                    bzcVar4 = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar4.n(cgeVarO);
                                                }
                                                bzcVar4.n(cgeVar8);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i55 != 1) {
                                        cgeVarO = defpackage.cjv.o(bzcVar4);
                                    }
                                } else {
                                    cgeVarO = defpackage.cjv.o(bzcVar4);
                                }
                                arrayList2 = arrayList;
                            }
                        }
                        cgeVar7 = cgeVar7.t;
                    }
                }
                cxlVarR3 = cxlVarR3.l();
                cgeVar7 = (cxlVarR3 == null || (cygVar3 = cxlVarR3.v) == null) ? null : cygVar3.e;
            }
            if (arrayList2 != null && (size = arrayList2.size() - 1) >= 0) {
                while (true) {
                    int i56 = size - 1;
                    if (((defpackage.cpz) arrayList2.get(size)).B(keyEvent)) {
                        return true;
                    }
                    if (i56 < 0) {
                        break;
                    }
                    size = i56;
                }
            }
            ?? M = cgeVarM.M();
            ?? bzcVar5 = 0;
            while (M != 0) {
                if (M instanceof defpackage.cpz) {
                    if (((defpackage.cpz) M).B(keyEvent)) {
                        return true;
                    }
                } else if ((M.r & 8192) != 0 && (M instanceof defpackage.cwo)) {
                    defpackage.cge cgeVar9 = ((defpackage.cwo) M).C;
                    int i57 = 0;
                    while (cgeVar9 != null) {
                        if ((cgeVar9.r & 8192) != 0) {
                            i57++;
                            if (i57 == 1) {
                                M = M;
                                bzcVar5 = bzcVar5;
                                bzcVar5 = bzcVar5;
                                M = cgeVar9;
                            } else {
                                if (bzcVar5 == 0) {
                                    bzcVar5 = new defpackage.bzc(new defpackage.cge[16]);
                                }
                                if (M != 0) {
                                    bzcVar5.n(M);
                                }
                                bzcVar5.n(cgeVar9);
                                M = 0;
                            }
                        } else {
                            M = M;
                            bzcVar5 = bzcVar5;
                        }
                        cgeVar9 = cgeVar9.u;
                        M = M;
                        bzcVar5 = bzcVar5;
                    }
                    M = M;
                    bzcVar5 = bzcVar5;
                    if (i57 != 1) {
                    }
                }
                M = defpackage.cjv.o(bzcVar5);
            }
            boolean z2 = true;
            if (((java.lang.Boolean) aferVar.invoke()).booleanValue()) {
                return true;
            }
            cgeVarM2 = cgeVarM.M();
            ?? r2 = 0;
            while (r0 != 0) {
                if (!(r0 instanceof defpackage.cpz)) {
                    if ((r0.r & 8192) != 0 && (r0 instanceof defpackage.cwo)) {
                        defpackage.cge cgeVar10 = ((defpackage.cwo) r0).C;
                        int i58 = 0;
                        while (cgeVar10 != null) {
                            if ((cgeVar10.r & 8192) != 0) {
                                i58++;
                                if (i58 == 1) {
                                    r0 = cgeVarM2;
                                    bzcVar3 = r2;
                                    bzcVar3 = r2;
                                    O3 = r0;
                                    bzcVar3 = r2;
                                    bzcVar3 = bzcVar3;
                                    O3 = cgeVar10;
                                } else {
                                    if (bzcVar3 == 0) {
                                        bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                    }
                                    if (O3 != 0) {
                                        bzcVar3.n(O3);
                                    }
                                    bzcVar3.n(cgeVar10);
                                    O3 = 0;
                                }
                            } else {
                                r0 = cgeVarM2;
                                bzcVar3 = r2;
                                bzcVar3 = r2;
                                O3 = r0;
                                bzcVar3 = r2;
                            }
                            cgeVar10 = cgeVar10.u;
                            O3 = O3;
                            bzcVar3 = bzcVar3;
                        }
                        r0 = cgeVarM2;
                        bzcVar3 = r2;
                        bzcVar3 = r2;
                        O3 = r0;
                        bzcVar3 = r2;
                        bzcVar3 = bzcVar3;
                        if (i58 != 1) {
                        }
                    }
                    z2 = true;
                    r0 = O3;
                    r2 = bzcVar3;
                } else if (((defpackage.cpz) r0).A(keyEvent)) {
                    r0 = cgeVarM2;
                    bzcVar3 = r2;
                    return z2;
                }
                r0 = cgeVarM2;
                bzcVar3 = r2;
                bzcVar3 = r2;
                r0 = cgeVarM2;
                bzcVar3 = r2;
                r0 = cgeVarM2;
                bzcVar3 = r2;
                O3 = defpackage.cjv.o(bzcVar3);
                z2 = true;
                r0 = O3;
                r2 = bzcVar3;
            }
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i59 = 0; i59 < size2; i59++) {
                    if (((defpackage.cpz) arrayList2.get(i59)).A(keyEvent)) {
                        r0 = cgeVarM2;
                        return true;
                    }
                    r0 = cgeVarM2;
                }
                r0 = cgeVarM2;
            }
        }
        r0 = cgeVarM2;
        return false;
    }

    public final boolean i(int i, boolean z) {
        java.lang.Boolean boolD;
        defpackage.cjc cjcVarB = b();
        if (cjcVarB != null && cjcVarB.a && this.a.i(i)) {
            return true;
        }
        defpackage.afgv afgvVar = new defpackage.afgv();
        afgvVar.a = java.lang.Boolean.FALSE;
        defpackage.cjc cjcVarB2 = b();
        java.lang.Boolean boolD2 = d(i, this.a.g(), new defpackage.aif(afgvVar, i, 5));
        if (defpackage.afga.f(boolD2, java.lang.Boolean.TRUE) && cjcVarB2 != b()) {
            return true;
        }
        if (boolD2 != null && afgvVar.a != null) {
            if (boolD2.booleanValue() && ((java.lang.Boolean) afgvVar.a).booleanValue()) {
                return true;
            }
            if (defpackage.ly.p(i) && z && k(false, false, i) && (boolD = d(i, null, new defpackage.cii(i, 1))) != null && boolD.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(int i) {
        if (!k(false, false, i)) {
            return false;
        }
        java.lang.Boolean boolD = d(i, null, new defpackage.cii(i, 0));
        boolean zBooleanValue = boolD != null ? boolD.booleanValue() : false;
        if (!zBooleanValue) {
            e();
        }
        return zBooleanValue;
    }

    public final boolean k(boolean z, boolean z2, int i) {
        boolean z3;
        if (!z) {
            int iR = defpackage.mw.r(this.b, i);
            int i2 = iR - 1;
            if (iR == 0) {
                throw null;
            }
            if (i2 == 0) {
                n();
            } else {
                if (i2 != 1 && i2 != 2) {
                    throw new defpackage.afas();
                }
                z3 = false;
            }
            if (z3 || !z2) {
                return z3;
            }
            e();
            return true;
        }
        n();
        z3 = true;
        if (z3) {
        }
        return z3;
    }

    public final defpackage.cja l() {
        return this.b.g();
    }

    public final boolean m() {
        return this.a.j();
    }
}
