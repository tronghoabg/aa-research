package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cyi implements defpackage.cyk {
    @Override // defpackage.cyk
    public final int a() {
        return 16;
    }

    @Override // defpackage.cyk
    public final void b(defpackage.cxl cxlVar, long j, defpackage.cwy cwyVar, int i, boolean z) {
        cxlVar.E(j, cwyVar, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [cge] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // defpackage.cyk
    public final boolean c(defpackage.cwy cwyVar, defpackage.cxl cxlVar) {
        defpackage.cyl cylVarQ = cxlVar.q();
        int i = defpackage.cym.a;
        defpackage.cge cgeVarAb = cylVarQ.ab(false);
        if (cgeVarAb != null && cgeVarAb.A) {
            if (!cgeVarAb.M().A) {
                defpackage.csc.c("visitLocalDescendants called on an unattached node");
            }
            defpackage.cge cgeVarM = cgeVarAb.M();
            if ((cgeVarM.s & 16) != 0) {
                while (cgeVarM != null) {
                    if ((cgeVarM.r & 16) != 0) {
                        ?? O = cgeVarM;
                        ?? bzcVar = 0;
                        while (O != 0) {
                            if (O instanceof defpackage.cza) {
                                if (((defpackage.cza) O).C()) {
                                    cwyVar.a = cwyVar.a() - 1;
                                    return true;
                                }
                            } else if ((O.r & 16) != 0 && (O instanceof defpackage.cwo)) {
                                defpackage.cge cgeVar = ((defpackage.cwo) O).C;
                                int i2 = 0;
                                while (cgeVar != null) {
                                    if ((cgeVar.r & 16) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            O = O;
                                            bzcVar = bzcVar;
                                            bzcVar = bzcVar;
                                            O = cgeVar;
                                        } else {
                                            if (bzcVar == 0) {
                                                bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (O != 0) {
                                                bzcVar.n(O);
                                            }
                                            bzcVar.n(cgeVar);
                                            O = 0;
                                        }
                                    } else {
                                        O = O;
                                        bzcVar = bzcVar;
                                    }
                                    cgeVar = cgeVar.u;
                                    O = O;
                                    bzcVar = bzcVar;
                                }
                                if (i2 != 1) {
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
                    cgeVarM = cgeVarM.u;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cyk
    public final /* synthetic */ boolean d(defpackage.cge cgeVar) {
        return true;
    }

    @Override // defpackage.cyk
    public final boolean e(defpackage.cxl cxlVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [bzc] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [bzc] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [cge] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cge] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [cge] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.cyk
    public final void f(defpackage.cge cgeVar) {
        ?? bzcVar = 0;
        while (cgeVar != 0) {
            if (cgeVar instanceof defpackage.cza) {
                ((defpackage.cza) cgeVar).E();
            } else if ((cgeVar.r & 16) != 0 && (cgeVar instanceof defpackage.cwo)) {
                defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVar).C;
                int i = 0;
                bzcVar = bzcVar;
                cgeVar = cgeVar;
                while (cgeVar2 != null) {
                    if ((cgeVar2.r & 16) != 0) {
                        i++;
                        if (i == 1) {
                            bzcVar = bzcVar;
                            cgeVar = cgeVar2;
                        } else {
                            if (bzcVar == 0) {
                                bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                            }
                            if (cgeVar != 0) {
                                bzcVar.n(cgeVar);
                            }
                            bzcVar.n(cgeVar2);
                            cgeVar = 0;
                        }
                    }
                    cgeVar2 = cgeVar2.u;
                    bzcVar = bzcVar;
                    cgeVar = cgeVar;
                }
                if (i != 1) {
                }
            }
            cgeVar = defpackage.cjv.o(bzcVar);
        }
    }
}
