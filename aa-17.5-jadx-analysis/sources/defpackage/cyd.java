package defpackage;

/* loaded from: classes.dex */
public final class cyd {
    public static final /* synthetic */ int a = 0;
    private static final aae b;

    static {
        aae aaeVar = aaf.a;
        b = new aae(6);
    }

    public static final int a(cfw cfwVar) {
        int i = true == (cfwVar instanceof csy) ? 3 : 1;
        if (cfwVar instanceof chd) {
            i |= 4;
        }
        if (cfwVar instanceof ddg) {
            i |= 8;
        }
        if (cfwVar instanceof cra) {
            i |= 16;
        }
        if ((cfwVar instanceof cvp) || (cfwVar instanceof cvt)) {
            i |= 32;
        }
        if (cfwVar instanceof cht) {
            i |= 4096;
        }
        if (cfwVar instanceof chz) {
            i |= 2048;
        }
        if (cfwVar instanceof cua) {
            i |= 256;
        }
        if (cfwVar instanceof cul) {
            i |= 64;
        }
        if (cfwVar instanceof cud) {
            i |= 4194304;
        }
        if (cfwVar instanceof cuf) {
            i |= 128;
        }
        return cfwVar instanceof dcs ? 524288 | i : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(defpackage.cfx r4) {
        /*
            int r0 = r4.r
            if (r0 == 0) goto L5
            return r0
        L5:
            aae r0 = defpackage.cyd.b
            java.lang.Class r1 = r4.getClass()
            int r2 = r0.a(r1)
            if (r2 < 0) goto L16
            int[] r4 = r0.c
            r4 = r4[r2]
            return r4
        L16:
            boolean r2 = r4 instanceof defpackage.cwu
            r3 = 1
            if (r3 == r2) goto L1c
            goto L1d
        L1c:
            r3 = 3
        L1d:
            boolean r2 = r4 instanceof defpackage.cwk
            if (r2 == 0) goto L23
            r3 = r3 | 4
        L23:
            boolean r2 = r4 instanceof defpackage.cyu
            if (r2 == 0) goto L29
            r3 = r3 | 8
        L29:
            boolean r2 = r4 instanceof defpackage.cys
            if (r2 == 0) goto L2f
            r3 = r3 | 16
        L2f:
            boolean r2 = r4 instanceof defpackage.cvs
            if (r2 == 0) goto L35
            r3 = r3 | 32
        L35:
            boolean r2 = r4 instanceof defpackage.cyq
            if (r2 == 0) goto L3b
            r3 = r3 | 64
        L3b:
            boolean r2 = r4 instanceof defpackage.cue
            if (r2 == 0) goto L43
            r2 = 4194304(0x400000, float:5.877472E-39)
        L41:
            r3 = r3 | r2
            goto L51
        L43:
            boolean r2 = r4 instanceof defpackage.cws
            if (r2 == 0) goto L4b
            r2 = 4194432(0x400080, float:5.877651E-39)
            goto L41
        L4b:
            boolean r2 = r4 instanceof defpackage.cxs
            if (r2 == 0) goto L51
            r3 = r3 | 128(0x80, float:1.8E-43)
        L51:
            boolean r2 = r4 instanceof defpackage.cwl
            if (r2 == 0) goto L57
            r3 = r3 | 256(0x100, float:3.59E-43)
        L57:
            boolean r2 = r4 instanceof defpackage.csa
            if (r2 == 0) goto L5d
            r3 = r3 | 512(0x200, float:7.17E-43)
        L5d:
            boolean r2 = r4 instanceof defpackage.ciu
            if (r2 == 0) goto L63
            r3 = r3 | 1024(0x400, float:1.435E-42)
        L63:
            boolean r2 = r4 instanceof defpackage.cii
            if (r2 == 0) goto L69
            r3 = r3 | 2048(0x800, float:2.87E-42)
        L69:
            boolean r2 = r4 instanceof defpackage.chu
            if (r2 == 0) goto L6f
            r3 = r3 | 4096(0x1000, float:5.74E-42)
        L6f:
            boolean r2 = r4 instanceof defpackage.cpq
            if (r2 == 0) goto L75
            r3 = r3 | 8192(0x2000, float:1.148E-41)
        L75:
            boolean r2 = r4 instanceof defpackage.crq
            if (r2 == 0) goto L7b
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
        L7b:
            boolean r2 = r4 instanceof defpackage.cwc
            if (r2 == 0) goto L83
            r2 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r2
        L83:
            boolean r2 = r4 instanceof defpackage.cps
            if (r2 == 0) goto L8a
            r2 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 | r2
        L8a:
            boolean r2 = r4 instanceof defpackage.cyz
            if (r2 == 0) goto L91
            r2 = 262144(0x40000, float:3.67342E-40)
            r3 = r3 | r2
        L91:
            boolean r2 = r4 instanceof defpackage.dcs
            if (r2 == 0) goto L98
            r2 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r2
        L98:
            boolean r2 = r4 instanceof defpackage.czb
            if (r2 == 0) goto L9f
            r2 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 | r2
        L9f:
            boolean r2 = r4 instanceof defpackage.cpm
            if (r2 == 0) goto La6
            r2 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 | r2
        La6:
            boolean r4 = r4 instanceof defpackage.ayt
            if (r4 == 0) goto Lad
            r4 = 8388608(0x800000, float:1.1754944E-38)
            r3 = r3 | r4
        Lad:
            r0.g(r1, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyd.b(cfx):int");
    }

    public static final int c(cfx cfxVar) {
        if (!(cfxVar instanceof cwe)) {
            return b(cfxVar);
        }
        cwe cweVar = (cwe) cfxVar;
        int iC = cweVar.B;
        for (cfx cfxVar2 = cweVar.C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
            iC |= c(cfxVar2);
        }
        return iC;
    }

    public static final void d(cfx cfxVar) {
        if (!cfxVar.A) {
            crt.c("autoInvalidateInsertedNode called on unattached node");
        }
        e(cfxVar, -1, 1);
    }

    public static final void e(cfx cfxVar, int i, int i2) {
        if (!(cfxVar instanceof cwe)) {
            h(cfxVar, i & cfxVar.r, i2);
            return;
        }
        cwe cweVar = (cwe) cfxVar;
        int i3 = cweVar.B;
        h(cfxVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (cfx cfxVar2 = cweVar.C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
            e(cfxVar2, i4, i2);
        }
    }

    public static final void f(cfx cfxVar) {
        if (!cfxVar.A) {
            crt.c("autoInvalidateRemovedNode called on unattached node");
        }
        e(cfxVar, -1, 2);
    }

    public static final void g(cfx cfxVar) {
        if (!cfxVar.A) {
            crt.c("autoInvalidateUpdatedNode called on unattached node");
        }
        e(cfxVar, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void h(cfx cfxVar, int i, int i2) {
        if (i2 != 0 || cfxVar.x()) {
            if ((i & 2) != 0 && (cfxVar instanceof cwu)) {
                bzi.q((cwu) cfxVar).I();
                if (i2 == 2) {
                    bzi.r(cfxVar, 2).ap();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                bzi.q(cfxVar).I();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                bzi.q(cfxVar).W(false);
            }
            if ((i & 256) != 0 && (cfxVar instanceof cwl)) {
                if (i2 == 1) {
                    cxb cxbVarQ = bzi.q(cfxVar);
                    cxbVarQ.ac(cxbVarQ.C + 1);
                } else if (i2 == 2) {
                    bzi.q(cfxVar).ac(r0.C - 1);
                }
                if (i2 != 2) {
                    cxb cxbVarQ2 = bzi.q(cfxVar);
                    if (cxbVarQ2.C != 0 && !cxbVarQ2.ai() && !cxbVarQ2.al() && !cxbVarQ2.B) {
                        cxe.a(cxbVarQ2).D(cxbVarQ2);
                    }
                }
            }
            if ((i & 4) != 0 && (cfxVar instanceof cwk)) {
                cjn.w((cwk) cfxVar);
            }
            if ((i & 8) != 0 && (cfxVar instanceof cyu)) {
                bzi.q(cfxVar).o = true;
            }
            if ((i & 64) != 0 && (cfxVar instanceof cyq)) {
                cxf cxfVar = bzi.q((cyq) cfxVar).w;
                cxfVar.o.q = true;
                cxn cxnVar = cxfVar.p;
                if (cxnVar != null) {
                    cxnVar.t = true;
                }
            }
            if ((i & 2048) != 0 && (cfxVar instanceof cii)) {
                cii ciiVar = (cii) cfxVar;
                cwa.b = null;
                ciiVar.c(cwa.a);
                if (cwa.b != null) {
                    if (!ciiVar.M().A) {
                        crt.c("visitChildren called on an unattached node");
                    }
                    byw bywVar = new byw(new cfx[16]);
                    cfx cfxVar2 = ciiVar.M().u;
                    if (cfxVar2 == null) {
                        bzi.w(bywVar, ciiVar.M());
                    } else {
                        bywVar.n(cfxVar2);
                    }
                    while (true) {
                        int i3 = bywVar.b;
                        if (i3 == 0) {
                            break;
                        }
                        cfx cfxVarN = (cfx) bywVar.c(i3 - 1);
                        if ((cfxVarN.s & 1024) == 0) {
                            bzi.w(bywVar, cfxVarN);
                        } else {
                            while (true) {
                                if (cfxVarN == null) {
                                    break;
                                }
                                if ((cfxVarN.r & 1024) != 0) {
                                    byw bywVar2 = null;
                                    while (cfxVarN != null) {
                                        if (cfxVarN instanceof ciu) {
                                            ciu ciuVar = (ciu) cfxVarN;
                                            chx chxVar = ((czq) bzi.s(ciuVar)).J.c;
                                            if (((aap) chxVar.c).j(ciuVar)) {
                                                chxVar.a();
                                            }
                                        } else if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                            int i4 = 0;
                                            for (cfx cfxVar3 = ((cwe) cfxVarN).C; cfxVar3 != null; cfxVar3 = cfxVar3.u) {
                                                if ((cfxVar3.r & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        cfxVarN = cfxVar3;
                                                    } else {
                                                        if (bywVar2 == null) {
                                                            bywVar2 = new byw(new cfx[16]);
                                                        }
                                                        if (cfxVarN != null) {
                                                            bywVar2.n(cfxVarN);
                                                        }
                                                        bywVar2.n(cfxVar3);
                                                        cfxVarN = null;
                                                    }
                                                }
                                            }
                                            if (i4 != 1) {
                                            }
                                        }
                                        cfxVarN = bzi.n(bywVar2);
                                    }
                                } else {
                                    cfxVarN = cfxVarN.u;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (cfxVar instanceof chu)) {
                chu chuVar = (chu) cfxVar;
                chx chxVar2 = ((czq) bzi.s(chuVar)).J.c;
                if (((aap) chxVar2.d).j(chuVar)) {
                    chxVar2.a();
                }
            }
            if ((i & 2097152) != 0 && (cfxVar instanceof cpm) && i2 == 2) {
                ((cpm) cfxVar).I();
            }
        }
    }
}
