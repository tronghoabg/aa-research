package defpackage;

/* loaded from: classes.dex */
public final class cxz implements cyb {
    @Override // defpackage.cyb
    public final int a() {
        return 16;
    }

    @Override // defpackage.cyb
    public final void b(cxb cxbVar, long j, cwo cwoVar, int i, boolean z) {
        cxbVar.E(j, cwoVar, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [cfx] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.cyb
    public final boolean c(cwo cwoVar, cxb cxbVar) {
        cyc cycVarQ = cxbVar.q();
        int i = cyd.a;
        cfx cfxVarAb = cycVarQ.ab(false);
        if (cfxVarAb != null && cfxVarAb.A) {
            if (!cfxVarAb.M().A) {
                crt.c("visitLocalDescendants called on an unattached node");
            }
            cfx cfxVarM = cfxVarAb.M();
            if ((cfxVarM.s & 16) != 0) {
                while (cfxVarM != null) {
                    if ((cfxVarM.r & 16) != 0) {
                        cwe cweVarN = cfxVarM;
                        ?? bywVar = 0;
                        while (cweVarN != 0) {
                            if (cweVarN instanceof cys) {
                                if (((cys) cweVarN).C()) {
                                    cwoVar.a = cwoVar.a() - 1;
                                    return true;
                                }
                            } else if ((cweVarN.r & 16) != 0 && (cweVarN instanceof cwe)) {
                                cfx cfxVar = cweVarN.C;
                                int i2 = 0;
                                cweVarN = cweVarN;
                                bywVar = bywVar;
                                while (cfxVar != null) {
                                    if ((cfxVar.r & 16) != 0) {
                                        i2++;
                                        bywVar = bywVar;
                                        if (i2 == 1) {
                                            cweVarN = cfxVar;
                                        } else {
                                            if (bywVar == 0) {
                                                bywVar = new byw(new cfx[16]);
                                            }
                                            if (cweVarN != 0) {
                                                bywVar.n(cweVarN);
                                            }
                                            bywVar.n(cfxVar);
                                            cweVarN = 0;
                                        }
                                    }
                                    cfxVar = cfxVar.u;
                                    cweVarN = cweVarN;
                                    bywVar = bywVar;
                                }
                                if (i2 != 1) {
                                }
                            }
                            cweVarN = bzi.n(bywVar);
                        }
                    }
                    cfxVarM = cfxVarM.u;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cyb
    public final /* synthetic */ boolean d(cfx cfxVar) {
        return true;
    }

    @Override // defpackage.cyb
    public final boolean e(cxb cxbVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [byw] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [cfx] */
    /* JADX WARN: Type inference failed for: r7v1, types: [cfx] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [cfx] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.cyb
    public final void f(cfx cfxVar) {
        ?? bywVar = 0;
        while (cfxVar != 0) {
            if (cfxVar instanceof cys) {
                ((cys) cfxVar).E();
            } else if ((cfxVar.r & 16) != 0 && (cfxVar instanceof cwe)) {
                cfx cfxVar2 = cfxVar.C;
                int i = 0;
                bywVar = bywVar;
                cfxVar = cfxVar;
                while (cfxVar2 != null) {
                    if ((cfxVar2.r & 16) != 0) {
                        i++;
                        bywVar = bywVar;
                        if (i == 1) {
                            cfxVar = cfxVar2;
                        } else {
                            if (bywVar == 0) {
                                bywVar = new byw(new cfx[16]);
                            }
                            if (cfxVar != 0) {
                                bywVar.n(cfxVar);
                            }
                            bywVar.n(cfxVar2);
                            cfxVar = 0;
                        }
                    }
                    cfxVar2 = cfxVar2.u;
                    bywVar = bywVar;
                    cfxVar = cfxVar;
                }
                if (i != 1) {
                }
            }
            cfxVar = bzi.n(bywVar);
        }
    }
}
