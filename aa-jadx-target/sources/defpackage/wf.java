package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class wf {
    public static defpackage.cgo a;
    public static defpackage.cgo b;

    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:88:0x011e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0161  */
    /* JADX WARN: Code duplicated, block: B:93:0x0171  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void a(defpackage.cgf cgfVar, defpackage.cld cldVar, defpackage.bmz bmzVar, defpackage.bna bnaVar, defpackage.ajl ajlVar, defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2) {
        defpackage.cgf cgfVar2;
        int i3;
        defpackage.cld cldVar2;
        defpackage.bmz bmzVarC;
        defpackage.bna bnaVarE;
        defpackage.ajl ajlVar2;
        boolean z;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar3;
        defpackage.cld cldVar3;
        defpackage.bmz bmzVar2;
        defpackage.bna bnaVar2;
        defpackage.ajl ajlVar3;
        defpackage.bxl bxlVarJ;
        int i4;
        int i5;
        int i6;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        defpackage.cld cldVarB;
        defpackage.bmz bmzVar3;
        defpackage.cgf cgfVar5;
        defpackage.bna bnaVar3;
        defpackage.cld cldVar4;
        java.lang.Object objS;
        int i7;
        int i8 = i2 & 1;
        defpackage.bve bveVarC = bveVar.c(1359693790);
        if (i8 != 0) {
            i3 = i | 6;
            cgfVar2 = cgfVar;
        } else if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i3 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i9 = 16;
            if ((i2 & 2) == 0) {
                cldVar2 = cldVar;
                if (bveVarC.C(cldVar2)) {
                    i9 = 32;
                }
            } else {
                cldVar2 = cldVar;
            }
            i3 |= i9;
        } else {
            cldVar2 = cldVar;
        }
        if ((i & 384) == 0) {
            int i10 = 128;
            if ((i2 & 4) == 0) {
                bmzVarC = bmzVar;
                if (bveVarC.C(bmzVarC)) {
                    i10 = 256;
                }
            } else {
                bmzVarC = bmzVar;
            }
            i3 |= i10;
        } else {
            bmzVarC = bmzVar;
        }
        if ((i & 3072) == 0) {
            int i11 = 1024;
            if ((i2 & 8) == 0) {
                bnaVarE = bnaVar;
                if (bveVarC.C(bnaVarE)) {
                    i11 = 2048;
                }
            } else {
                bnaVarE = bnaVar;
            }
            i3 |= i11;
        } else {
            bnaVarE = bnaVar;
        }
        int i12 = i2 & 16;
        if (i12 == 0) {
            if ((i & 24576) == 0) {
                ajlVar2 = ajlVar;
                i3 |= true != bveVarC.C(ajlVar2) ? 8192 : 16384;
            }
            if ((196608 & i) == 0) {
                if (true != bveVarC.E(affhVar)) {
                    i7 = 65536;
                } else {
                    i7 = 131072;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                i4 = i2 & 8;
                i5 = i2 & 4;
                i6 = i2 & 2;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i8 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cldVarB = defpackage.vz.b(bveVarC);
                    } else {
                        cldVarB = cldVar2;
                    }
                    if (i5 != 0) {
                        bmzVarC = defpackage.vz.c(bveVarC);
                    }
                    if (i4 != 0) {
                        bnaVarE = defpackage.vz.e(63);
                    }
                    if (i12 != 0) {
                        ajlVar2 = null;
                    }
                    bmzVar3 = bmzVarC;
                    cgfVar5 = cgfVar4;
                    bnaVar3 = bnaVarE;
                    cldVar4 = cldVarB;
                } else {
                    bveVarC.s();
                    bmzVar3 = bmzVarC;
                    bnaVar3 = bnaVarE;
                    cgfVar5 = cgfVar2;
                    cldVar4 = cldVar2;
                }
                bveVarC.l();
                bveVarC.v(-1763481333);
                bveVarC.v(167726411);
                objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dlr(bnaVar3.a), defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState);
                    objS = parcelableSnapshotMutableState;
                }
                long j = bmzVar3.b;
                defpackage.ajl ajlVar4 = ajlVar2;
                long j2 = bmzVar3.a;
                bwcVar.Y(false);
                bwcVar.Y(false);
                bveVar2 = bveVarC;
                defpackage.bqv.b(cgfVar5, cldVar4, j2, j, ((defpackage.dlr) ((defpackage.bwx) objS).a()).a, ajlVar4, defpackage.dai.as(-97109725, true, new defpackage.bmc(affhVar, 3), bveVarC), bveVar2, 16);
                bmzVar2 = bmzVar3;
                bnaVar2 = bnaVar3;
                cgfVar3 = cgfVar5;
                cldVar3 = cldVar4;
                ajlVar3 = ajlVar4;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                cgfVar3 = cgfVar2;
                cldVar3 = cldVar2;
                bmzVar2 = bmzVarC;
                bnaVar2 = bnaVarE;
                ajlVar3 = ajlVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.bps(cgfVar3, cldVar3, bmzVar2, bnaVar2, ajlVar3, affhVar, i, i2, 1);
            }
        }
        i3 |= 24576;
        ajlVar2 = ajlVar;
        if ((196608 & i) == 0) {
            if (true != bveVarC.E(affhVar)) {
                i7 = 65536;
            } else {
                i7 = 131072;
            }
            i3 |= i7;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            i4 = i2 & 8;
            i5 = i2 & 4;
            i6 = i2 & 2;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i6 != 0) {
                    cldVarB = defpackage.vz.b(bveVarC);
                } else {
                    cldVarB = cldVar2;
                }
                if (i5 != 0) {
                    bmzVarC = defpackage.vz.c(bveVarC);
                }
                if (i4 != 0) {
                    bnaVarE = defpackage.vz.e(63);
                }
                if (i12 != 0) {
                    ajlVar2 = null;
                }
                bmzVar3 = bmzVarC;
                cgfVar5 = cgfVar4;
                bnaVar3 = bnaVarE;
                cldVar4 = cldVarB;
            } else {
                if (i8 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i6 != 0) {
                    cldVarB = defpackage.vz.b(bveVarC);
                } else {
                    cldVarB = cldVar2;
                }
                if (i5 != 0) {
                    bmzVarC = defpackage.vz.c(bveVarC);
                }
                if (i4 != 0) {
                    bnaVarE = defpackage.vz.e(63);
                }
                if (i12 != 0) {
                    ajlVar2 = null;
                }
                bmzVar3 = bmzVarC;
                cgfVar5 = cgfVar4;
                bnaVar3 = bnaVarE;
                cldVar4 = cldVarB;
            }
            bveVarC.l();
            bveVarC.v(-1763481333);
            bveVarC.v(167726411);
            objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dlr(bnaVar3.a), defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState2);
                objS = parcelableSnapshotMutableState2;
            }
            long j3 = bmzVar3.b;
            defpackage.ajl ajlVar5 = ajlVar2;
            long j4 = bmzVar3.a;
            bwcVar.Y(false);
            bwcVar.Y(false);
            bveVar2 = bveVarC;
            defpackage.bqv.b(cgfVar5, cldVar4, j4, j3, ((defpackage.dlr) ((defpackage.bwx) objS).a()).a, ajlVar5, defpackage.dai.as(-97109725, true, new defpackage.bmc(affhVar, 3), bveVarC), bveVar2, 16);
            bmzVar2 = bmzVar3;
            bnaVar2 = bnaVar3;
            cgfVar3 = cgfVar5;
            cldVar3 = cldVar4;
            ajlVar3 = ajlVar5;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cgfVar3 = cgfVar2;
            cldVar3 = cldVar2;
            bmzVar2 = bmzVarC;
            bnaVar2 = bnaVarE;
            ajlVar3 = ajlVar2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bps(cgfVar3, cldVar3, bmzVar2, bnaVar2, ajlVar3, affhVar, i, i2, 1);
        }
    }

    public static final void b(defpackage.cgf cgfVar, defpackage.cld cldVar, defpackage.bmz bmzVar, defpackage.bna bnaVar, defpackage.ajl ajlVar, defpackage.affh affhVar, defpackage.bve bveVar, int i) {
        defpackage.cgf cgfVar2;
        int i2;
        defpackage.cld cldVar2;
        defpackage.bmz bmzVar2;
        defpackage.bna bnaVar2;
        defpackage.bmz bmzVar3;
        defpackage.cld cldVar3;
        defpackage.bmz bmzVar4;
        defpackage.bna bnaVar3;
        defpackage.bve bveVarC = bveVar.c(-1945643296);
        if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i2 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.C(ajlVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.E(affhVar) ? 65536 : 131072;
        }
        if (bveVarC.I((74899 & i2) != 74898, i2 & 1)) {
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                int i3 = defpackage.bqa.a;
                defpackage.bvm bvmVar = defpackage.bom.a;
                defpackage.cld cldVarA = defpackage.bqa.a(((defpackage.bol) bveVarC.f(bvmVar)).c, 13);
                defpackage.bnk bnkVar = ((defpackage.bol) bveVarC.f(bvmVar)).a;
                defpackage.bmz bmzVar5 = bnkVar.Z;
                if (bmzVar5 == null) {
                    bmzVar3 = new defpackage.bmz(defpackage.bnl.e(bnkVar, 35), defpackage.bnl.a(bnkVar, defpackage.bnl.e(bnkVar, 35)), defpackage.bnl.e(bnkVar, 35), defpackage.ckd.h(defpackage.bnl.a(bnkVar, defpackage.bnl.e(bnkVar, 35)), 0.38f));
                    bnkVar.Z = bmzVar3;
                } else {
                    bmzVar3 = bmzVar5;
                }
                cldVar3 = cldVarA;
                bmzVar4 = bmzVar3;
                bnaVar3 = new defpackage.bna(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                bveVarC.s();
                cldVar3 = cldVar;
                bmzVar4 = bmzVar;
                bnaVar3 = bnaVar;
            }
            bveVarC.l();
            a(cgfVar2, cldVar3, bmzVar4, bnaVar3, ajlVar, affhVar, bveVarC, i2 & 516110, 0);
            cldVar2 = cldVar3;
            bmzVar2 = bmzVar4;
            bnaVar2 = bnaVar3;
        } else {
            bveVarC.s();
            cldVar2 = cldVar;
            bmzVar2 = bmzVar;
            bnaVar2 = bnaVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bpo(cgfVar, cldVar2, bmzVar2, bnaVar2, ajlVar, affhVar, i, 1);
        }
    }

    public static final cgt c(java.lang.String str) {
        return new cgn(defpackage.afga.I(str));
    }

    public static final java.lang.String[] d(cgt cgtVar) {
        cgtVar.getClass();
        return (java.lang.String[]) ((cgn) cgtVar).a.toArray(new java.lang.String[0]);
    }

    public static final java.lang.Object e(defpackage.ctx ctxVar) {
        java.lang.Object objG = ctxVar.g();
        dox doxVar = objG instanceof dox ? (dox) objG : null;
        if (doxVar != null) {
            return doxVar.a();
        }
        return null;
    }

    public static final void f(dqh dqhVar, java.util.List list) {
        java.util.ArrayList arrayList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.ctx ctxVar = (defpackage.ctx) list.get(i);
            java.lang.Object objI = defpackage.dai.I(ctxVar);
            if (objI == null && (objI = e(ctxVar)) == null) {
                objI = new defpackage.wf();
            }
            dpx dpxVarB = dqhVar.b(objI.toString());
            if (dpxVarB != null) {
                dpxVarB.af = ctxVar;
                defpackage.dqv dqvVar = dpxVarB.ag;
                if (dqvVar != null) {
                    dqvVar.aq = dpxVarB.af;
                }
            }
            java.lang.Object objG = ctxVar.g();
            dox doxVar = objG instanceof dox ? (dox) objG : null;
            java.lang.String strB = doxVar != null ? doxVar.b() : null;
            if (strB != null && (objI instanceof java.lang.String)) {
                java.lang.String str = (java.lang.String) objI;
                if (dqhVar.b(str) instanceof dpx) {
                    java.util.HashMap map = dqhVar.e;
                    if (map.containsKey(strB)) {
                        arrayList = (java.util.ArrayList) map.get(strB);
                    } else {
                        arrayList = new java.util.ArrayList();
                        map.put(strB, arrayList);
                    }
                    arrayList.add(str);
                }
            }
        }
    }

    public static final java.lang.String g(int i) {
        return i != 0 ? "bottom" : "top";
    }

    public static final java.lang.String h(int i) {
        if (i == -2) {
            return "start";
        }
        if (i != -1) {
            return i != 0 ? "right" : "left";
        }
        return "end";
    }
}
