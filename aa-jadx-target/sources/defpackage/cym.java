package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cym {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.aal b;

    static {
        defpackage.aal aalVar = defpackage.aam.a;
        b = new defpackage.aal(6);
    }

    public static final int a(defpackage.cgd cgdVar) {
        int i = true == (cgdVar instanceof defpackage.cth) ? 3 : 1;
        if (cgdVar instanceof defpackage.chk) {
            i |= 4;
        }
        if (cgdVar instanceof defpackage.ddo) {
            i |= 8;
        }
        if (cgdVar instanceof defpackage.crj) {
            i |= 16;
        }
        if ((cgdVar instanceof defpackage.cvy) || (cgdVar instanceof defpackage.cwc)) {
            i |= 32;
        }
        if (cgdVar instanceof defpackage.cib) {
            i |= 4096;
        }
        if (cgdVar instanceof defpackage.cih) {
            i |= 2048;
        }
        if (cgdVar instanceof defpackage.cuj) {
            i |= 256;
        }
        if (cgdVar instanceof defpackage.cuu) {
            i |= 64;
        }
        if (cgdVar instanceof defpackage.cum) {
            i |= 4194304;
        }
        if (cgdVar instanceof defpackage.cuo) {
            i |= 128;
        }
        return cgdVar instanceof defpackage.dda ? 524288 | i : i;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0055  */
    /* JADX WARN: Code duplicated, block: B:43:0x005b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0061  */
    /* JADX WARN: Code duplicated, block: B:49:0x0067  */
    /* JADX WARN: Code duplicated, block: B:52:0x006d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0073  */
    /* JADX WARN: Code duplicated, block: B:58:0x0079  */
    /* JADX WARN: Code duplicated, block: B:61:0x007f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0087  */
    /* JADX WARN: Code duplicated, block: B:67:0x008e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0095  */
    /* JADX WARN: Code duplicated, block: B:73:0x009c  */
    /* JADX WARN: Code duplicated, block: B:76:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00aa  */
    public static final int b(defpackage.cge cgeVar) {
        int i;
        int i2 = cgeVar.r;
        if (i2 != 0) {
            return i2;
        }
        defpackage.aal aalVar = b;
        java.lang.Class<?> cls = cgeVar.getClass();
        int iA = aalVar.a(cls);
        if (iA >= 0) {
            return aalVar.c[iA];
        }
        int i3 = true == (cgeVar instanceof defpackage.cxe) ? 3 : 1;
        if (cgeVar instanceof defpackage.cwu) {
            i3 |= 4;
        }
        if (cgeVar instanceof defpackage.czc) {
            i3 |= 8;
        }
        if (cgeVar instanceof defpackage.cza) {
            i3 |= 16;
        }
        if (cgeVar instanceof defpackage.cwb) {
            i3 |= 32;
        }
        if (cgeVar instanceof defpackage.cyy) {
            i3 |= 64;
        }
        if (!(cgeVar instanceof defpackage.cun)) {
            if (cgeVar instanceof defpackage.cxc) {
                i = 4194432;
            } else if (cgeVar instanceof defpackage.cyb) {
                i3 |= 128;
            }
            if (cgeVar instanceof defpackage.cwv) {
                i3 |= 256;
            }
            if (cgeVar instanceof defpackage.csj) {
                i3 |= 512;
            }
            if (cgeVar instanceof defpackage.cjc) {
                i3 |= 1024;
            }
            if (cgeVar instanceof defpackage.ciq) {
                i3 |= 2048;
            }
            if (cgeVar instanceof defpackage.cic) {
                i3 |= 4096;
            }
            if (cgeVar instanceof defpackage.cpz) {
                i3 |= 8192;
            }
            if (cgeVar instanceof defpackage.crz) {
                i3 |= 16384;
            }
            if (cgeVar instanceof defpackage.cwm) {
                i3 |= 32768;
            }
            if (cgeVar instanceof defpackage.cqb) {
                i3 |= 131072;
            }
            if (cgeVar instanceof defpackage.czh) {
                i3 |= 262144;
            }
            if (cgeVar instanceof defpackage.dda) {
                i3 |= 524288;
            }
            if (cgeVar instanceof defpackage.czj) {
                i3 |= 1048576;
            }
            if (cgeVar instanceof defpackage.cpv) {
                i3 |= 2097152;
            }
            if (cgeVar instanceof defpackage.ayy) {
                i3 |= 8388608;
            }
            aalVar.g(cls, i3);
            return i3;
        }
        i = 4194304;
        i3 |= i;
        if (cgeVar instanceof defpackage.cwv) {
            i3 |= 256;
        }
        if (cgeVar instanceof defpackage.csj) {
            i3 |= 512;
        }
        if (cgeVar instanceof defpackage.cjc) {
            i3 |= 1024;
        }
        if (cgeVar instanceof defpackage.ciq) {
            i3 |= 2048;
        }
        if (cgeVar instanceof defpackage.cic) {
            i3 |= 4096;
        }
        if (cgeVar instanceof defpackage.cpz) {
            i3 |= 8192;
        }
        if (cgeVar instanceof defpackage.crz) {
            i3 |= 16384;
        }
        if (cgeVar instanceof defpackage.cwm) {
            i3 |= 32768;
        }
        if (cgeVar instanceof defpackage.cqb) {
            i3 |= 131072;
        }
        if (cgeVar instanceof defpackage.czh) {
            i3 |= 262144;
        }
        if (cgeVar instanceof defpackage.dda) {
            i3 |= 524288;
        }
        if (cgeVar instanceof defpackage.czj) {
            i3 |= 1048576;
        }
        if (cgeVar instanceof defpackage.cpv) {
            i3 |= 2097152;
        }
        if (cgeVar instanceof defpackage.ayy) {
            i3 |= 8388608;
        }
        aalVar.g(cls, i3);
        return i3;
    }

    public static final int c(defpackage.cge cgeVar) {
        if (!(cgeVar instanceof defpackage.cwo)) {
            return b(cgeVar);
        }
        defpackage.cwo cwoVar = (defpackage.cwo) cgeVar;
        int iC = cwoVar.B;
        for (defpackage.cge cgeVar2 = cwoVar.C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
            iC |= c(cgeVar2);
        }
        return iC;
    }

    public static final void d(defpackage.cge cgeVar) {
        if (!cgeVar.A) {
            defpackage.csc.c("autoInvalidateInsertedNode called on unattached node");
        }
        e(cgeVar, -1, 1);
    }

    public static final void e(defpackage.cge cgeVar, int i, int i2) {
        if (!(cgeVar instanceof defpackage.cwo)) {
            h(cgeVar, i & cgeVar.r, i2);
            return;
        }
        defpackage.cwo cwoVar = (defpackage.cwo) cgeVar;
        int i3 = cwoVar.B;
        h(cgeVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (defpackage.cge cgeVar2 = cwoVar.C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
            e(cgeVar2, i4, i2);
        }
    }

    public static final void f(defpackage.cge cgeVar) {
        if (!cgeVar.A) {
            defpackage.csc.c("autoInvalidateRemovedNode called on unattached node");
        }
        e(cgeVar, -1, 2);
    }

    public static final void g(defpackage.cge cgeVar) {
        if (!cgeVar.A) {
            defpackage.csc.c("autoInvalidateUpdatedNode called on unattached node");
        }
        e(cgeVar, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void h(defpackage.cge cgeVar, int i, int i2) {
        if (i2 != 0 || cgeVar.x()) {
            if ((i & 2) != 0 && (cgeVar instanceof defpackage.cxe)) {
                defpackage.cjv.r((defpackage.cxe) cgeVar).I();
                if (i2 == 2) {
                    defpackage.cjv.s(cgeVar, 2).ap();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                defpackage.cjv.r(cgeVar).I();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                defpackage.cjv.r(cgeVar).W(false);
            }
            if ((i & 256) != 0 && (cgeVar instanceof defpackage.cwv)) {
                if (i2 == 1) {
                    defpackage.cxl cxlVarR = defpackage.cjv.r(cgeVar);
                    cxlVarR.ac(cxlVarR.C + 1);
                } else if (i2 == 2) {
                    defpackage.cxl cxlVarR2 = defpackage.cjv.r(cgeVar);
                    cxlVarR2.ac(cxlVarR2.C - 1);
                }
                if (i2 != 2) {
                    defpackage.cxl cxlVarR3 = defpackage.cjv.r(cgeVar);
                    if (cxlVarR3.C != 0 && !cxlVarR3.ai() && !cxlVarR3.al() && !cxlVarR3.B) {
                        defpackage.cxo.a(cxlVarR3).D(cxlVarR3);
                    }
                }
            }
            if ((i & 4) != 0 && (cgeVar instanceof defpackage.cwu)) {
                defpackage.dai.G((defpackage.cwu) cgeVar);
            }
            if ((i & 8) != 0 && (cgeVar instanceof defpackage.czc)) {
                defpackage.cjv.r(cgeVar).o = true;
            }
            if ((i & 64) != 0 && (cgeVar instanceof defpackage.cyy)) {
                defpackage.cxp cxpVar = defpackage.cjv.r((defpackage.cyy) cgeVar).w;
                cxpVar.o.q = true;
                defpackage.cxw cxwVar = cxpVar.p;
                if (cxwVar != null) {
                    cxwVar.t = true;
                }
            }
            if ((i & 2048) != 0 && (cgeVar instanceof defpackage.ciq)) {
                defpackage.ciq ciqVar = (defpackage.ciq) cgeVar;
                defpackage.cwk.b = null;
                ciqVar.c(defpackage.cwk.a);
                if (defpackage.cwk.b != null) {
                    if (!ciqVar.M().A) {
                        defpackage.csc.c("visitChildren called on an unattached node");
                    }
                    defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                    defpackage.cge cgeVar2 = ciqVar.M().u;
                    if (cgeVar2 == null) {
                        defpackage.cjv.x(bzcVar, ciqVar.M());
                    } else {
                        bzcVar.n(cgeVar2);
                    }
                    while (true) {
                        int i3 = bzcVar.b;
                        if (i3 == 0) {
                            break;
                        }
                        defpackage.cge cgeVarO = (defpackage.cge) bzcVar.c(i3 - 1);
                        if ((cgeVarO.s & 1024) == 0) {
                            defpackage.cjv.x(bzcVar, cgeVarO);
                        } else {
                            while (cgeVarO != null) {
                                if ((cgeVarO.r & 1024) != 0) {
                                    defpackage.bzc bzcVar2 = null;
                                    while (cgeVarO != null) {
                                        if (cgeVarO instanceof defpackage.cjc) {
                                            defpackage.cjc cjcVar = (defpackage.cjc) cgeVarO;
                                            defpackage.cif cifVar = ((defpackage.czz) defpackage.cjv.t(cjcVar)).J.c;
                                            if (((defpackage.aaw) cifVar.c).j(cjcVar)) {
                                                cifVar.a();
                                            }
                                        } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                            int i4 = 0;
                                            for (defpackage.cge cgeVar3 = ((defpackage.cwo) cgeVarO).C; cgeVar3 != null; cgeVar3 = cgeVar3.u) {
                                                if ((cgeVar3.r & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        cgeVarO = cgeVar3;
                                                    } else {
                                                        if (bzcVar2 == null) {
                                                            bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                        }
                                                        if (cgeVarO != null) {
                                                            bzcVar2.n(cgeVarO);
                                                        }
                                                        bzcVar2.n(cgeVar3);
                                                        cgeVarO = null;
                                                    }
                                                }
                                            }
                                            if (i4 != 1) {
                                            }
                                        }
                                        cgeVarO = defpackage.cjv.o(bzcVar2);
                                    }
                                    break;
                                }
                                cgeVarO = cgeVarO.u;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (cgeVar instanceof defpackage.cic)) {
                defpackage.cic cicVar = (defpackage.cic) cgeVar;
                defpackage.cif cifVar2 = ((defpackage.czz) defpackage.cjv.t(cicVar)).J.c;
                if (((defpackage.aaw) cifVar2.d).j(cicVar)) {
                    cifVar2.a();
                }
            }
            if ((i & 2097152) != 0 && (cgeVar instanceof defpackage.cpv) && i2 == 2) {
                ((defpackage.cpv) cgeVar).I();
            }
        }
    }
}
