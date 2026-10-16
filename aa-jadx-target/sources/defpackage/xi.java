package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class xi {
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void a(defpackage.cgf cgfVar, float f, long j, defpackage.bve bveVar, int i, int i2) {
        defpackage.cgf cgfVar2;
        int i3;
        float f2;
        long jF;
        boolean z;
        defpackage.cgf cgfVar3;
        float f3;
        long j2;
        defpackage.bxl bxlVarJ;
        int i4;
        defpackage.bwc bwcVar;
        boolean z2;
        boolean z3;
        java.lang.Object objS;
        int i5;
        int i6 = i2 & 1;
        defpackage.bve bveVarC = bveVar.c(75144485);
        if (i6 != 0) {
            i3 = i | 6;
            cgfVar2 = cgfVar;
        } else if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i3 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= true != bveVarC.z(f2) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                i5 = 128;
                if ((i2 & 4) == 0) {
                    jF = j;
                    if (bveVarC.B(jF)) {
                        i5 = 256;
                    }
                } else {
                    jF = j;
                }
                i3 |= i5;
            } else {
                jF = j;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                i4 = i2 & 4;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i6 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i7 != 0) {
                        f3 = 1.0f;
                    } else {
                        f3 = f2;
                    }
                    if (i4 != 0) {
                        i3 &= -897;
                        jF = defpackage.bnl.f(25, bveVarC);
                    }
                } else {
                    bveVarC.s();
                    if (i4 != 0) {
                        i3 &= -897;
                    }
                    cgfVar3 = cgfVar2;
                    f3 = f2;
                }
                bveVarC.l();
                defpackage.cgf cgfVarD = defpackage.awj.d(defpackage.awj.r(cgfVar3), f3);
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = ((((i3 & 896) ^ 384) <= 256 && bveVarC.B(jF)) || (i3 & 384) == 256) | z2;
                objS = bwcVar.S();
                if (z3 || objS == defpackage.bvd.a) {
                    objS = new bnu(f3, jF, 0);
                    bwcVar.ad(objS);
                }
                defpackage.afw.z(cgfVarD, (defpackage.affc) objS, bveVarC, 0);
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
                f3 = f2;
            }
            j2 = jF;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new bnv(cgfVar3, f3, j2, i, i2, 0);
            }
        }
        i3 |= 48;
        f2 = f;
        if ((i & 384) == 0) {
            i5 = 128;
            if ((i2 & 4) == 0) {
                jF = j;
                if (bveVarC.B(jF)) {
                    i5 = 256;
                }
            } else {
                jF = j;
            }
            i3 |= i5;
        } else {
            jF = j;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            i4 = i2 & 4;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i7 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    i3 &= -897;
                    jF = defpackage.bnl.f(25, bveVarC);
                }
            } else {
                if (i6 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i7 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f2;
                }
                if (i4 != 0) {
                    i3 &= -897;
                    jF = defpackage.bnl.f(25, bveVarC);
                }
            }
            bveVarC.l();
            defpackage.cgf cgfVarD2 = defpackage.awj.d(defpackage.awj.r(cgfVar3), f3);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = ((((i3 & 896) ^ 384) <= 256 && bveVarC.B(jF)) || (i3 & 384) == 256) | z2;
            objS = bwcVar.S();
            if (z3) {
                objS = new bnu(f3, jF, 0);
                bwcVar.ad(objS);
            } else {
                objS = new bnu(f3, jF, 0);
                bwcVar.ad(objS);
            }
            defpackage.afw.z(cgfVarD2, (defpackage.affc) objS, bveVarC, 0);
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
            f3 = f2;
        }
        j2 = jF;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bnv(cgfVar3, f3, j2, i, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void b(defpackage.cgf cgfVar, float f, long j, defpackage.bve bveVar, int i, int i2) {
        defpackage.cgf cgfVar2;
        int i3;
        float f2;
        boolean z;
        defpackage.cgf cgfVar3;
        float f3;
        defpackage.bxl bxlVarJ;
        defpackage.bwc bwcVar;
        boolean z2;
        boolean z3;
        java.lang.Object objS;
        int i4;
        int i5 = i2 & 1;
        defpackage.bve bveVarC = bveVar.c(-1534852205);
        if (i5 != 0) {
            i3 = i | 6;
            cgfVar2 = cgfVar;
        } else if ((i & 6) == 0) {
            cgfVar2 = cgfVar;
            i3 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= true != bveVarC.z(f2) ? 16 : 32;
            }
            if ((i & 384) == 0) {
                if (true != bveVarC.B(j)) {
                    i4 = 128;
                } else {
                    i4 = 256;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i5 != 0) {
                        cgfVar3 = defpackage.cgf.e;
                    } else {
                        cgfVar3 = cgfVar2;
                    }
                    if (i6 != 0) {
                        f2 = 1.0f;
                    }
                } else {
                    bveVarC.s();
                    cgfVar3 = cgfVar2;
                }
                bveVarC.l();
                defpackage.cgf cgfVarM = defpackage.awj.m(defpackage.awj.b(cgfVar3, 1.0f), f2);
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = ((((i3 & 896) ^ 384) <= 256 && bveVarC.B(j)) || (i3 & 384) == 256) | z2;
                objS = bwcVar.S();
                if (z3 || objS == defpackage.bvd.a) {
                    objS = new bnu(f2, j, 1);
                    bwcVar.ad(objS);
                }
                defpackage.afw.z(cgfVarM, (defpackage.affc) objS, bveVarC, 0);
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar2;
            }
            f3 = f2;
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new bnv(cgfVar3, f3, j, i, i2, 1);
            }
        }
        i3 |= 48;
        f2 = f;
        if ((i & 384) == 0) {
            if (true != bveVarC.B(j)) {
                i4 = 128;
            } else {
                i4 = 256;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i6 != 0) {
                    f2 = 1.0f;
                }
            } else {
                if (i5 != 0) {
                    cgfVar3 = defpackage.cgf.e;
                } else {
                    cgfVar3 = cgfVar2;
                }
                if (i6 != 0) {
                    f2 = 1.0f;
                }
            }
            bveVarC.l();
            defpackage.cgf cgfVarM2 = defpackage.awj.m(defpackage.awj.b(cgfVar3, 1.0f), f2);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            z3 = ((((i3 & 896) ^ 384) <= 256 && bveVarC.B(j)) || (i3 & 384) == 256) | z2;
            objS = bwcVar.S();
            if (z3) {
                objS = new bnu(f2, j, 1);
                bwcVar.ad(objS);
            } else {
                objS = new bnu(f2, j, 1);
                bwcVar.ad(objS);
            }
            defpackage.afw.z(cgfVarM2, (defpackage.affc) objS, bveVarC, 0);
        } else {
            bveVarC.s();
            cgfVar3 = cgfVar2;
        }
        f3 = f2;
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bnv(cgfVar3, f3, j, i, i2, 1);
        }
    }

    public static final void c(defpackage.cgx cgxVar, android.util.LongSparseArray longSparseArray) {
        android.view.translation.TranslationResponseValue translationResponseValueM;
        java.lang.CharSequence charSequenceM;
        defpackage.hio hioVar;
        java.lang.Object obj;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            android.view.translation.ViewTranslationResponse viewTranslationResponseM = a$.ExternalSyntheticApiModelOutline0.m(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM != null && (translationResponseValueM = a$.ExternalSyntheticApiModelOutline0.m(viewTranslationResponseM, "android:text")) != null && (charSequenceM = a$.ExternalSyntheticApiModelOutline0.m(translationResponseValueM)) != null && (hioVar = (defpackage.hio) cgxVar.h().a((int) jKeyAt)) != null && (obj = hioVar.b) != null) {
                defpackage.ddn ddnVar = (defpackage.ddn) ((defpackage.dec) obj).b.g(defpackage.ddy.l);
                if (ddnVar != null) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x023b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0245  */
    /* JADX WARN: Code duplicated, block: B:106:0x024b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0263  */
    /* JADX WARN: Code duplicated, block: B:109:0x0268  */
    /* JADX WARN: Code duplicated, block: B:111:0x0271  */
    /* JADX WARN: Code duplicated, block: B:112:0x0279  */
    /* JADX WARN: Code duplicated, block: B:117:0x028f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0296 A[LOOP:3: B:100:0x022b->B:119:0x0296, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:120:0x029e  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:129:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:132:0x02d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:134:0x02df  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:150:0x0342  */
    /* JADX WARN: Code duplicated, block: B:152:0x0346  */
    /* JADX WARN: Code duplicated, block: B:155:0x0350  */
    /* JADX WARN: Code duplicated, block: B:157:0x0358  */
    /* JADX WARN: Code duplicated, block: B:158:0x035a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0360 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x0362 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0364  */
    /* JADX WARN: Code duplicated, block: B:164:0x0368  */
    /* JADX WARN: Code duplicated, block: B:171:0x0390  */
    /* JADX WARN: Code duplicated, block: B:176:0x039f  */
    /* JADX WARN: Code duplicated, block: B:178:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:181:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:186:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:189:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:192:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:194:0x03d2 A[LOOP:5: B:193:0x03d0->B:194:0x03d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:198:0x0403 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x0412  */
    /* JADX WARN: Code duplicated, block: B:205:0x0419  */
    /* JADX WARN: Code duplicated, block: B:207:0x0422  */
    /* JADX WARN: Code duplicated, block: B:210:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x0434 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:231:0x02a2 A[EDGE_INSN: B:231:0x02a2->B:121:0x02a2 BREAK  A[LOOP:3: B:100:0x022b->B:119:0x0296], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x02a2 A[EDGE_INSN: B:232:0x02a2->B:121:0x02a2 BREAK  A[LOOP:3: B:100:0x022b->B:119:0x0296], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:97:0x021a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0227  */
    /* JADX WARN: Instruction removed from duplicated block: B:194:0x03d2, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r38v13 */
    /* JADX WARN: Type inference failed for: r38v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v15 */
    public static final void d(android.view.ViewStructure viewStructure, defpackage.cxl cxlVar, android.view.autofill.AutofillId autofillId, java.lang.String str, defpackage.dep depVar) {
        long j;
        long j2;
        char c;
        long j3;
        boolean zBooleanValue;
        defpackage.dfb dfbVar;
        defpackage.cgo cgoVar;
        boolean z;
        defpackage.det detVar;
        defpackage.ddw ddwVar;
        defpackage.cgm cgmVar;
        cgt cgtVar;
        java.lang.Boolean bool;
        boolean z2;
        java.lang.Integer num;
        java.lang.Object obj;
        defpackage.ddz ddzVarR;
        defpackage.ddw ddwVar2;
        int i;
        java.util.List list;
        java.lang.Integer numValueOf;
        int iIntValue;
        java.lang.Integer numValueOf2;
        defpackage.cxl cxlVar2;
        defpackage.ddw ddwVar3;
        ?? r2;
        ?? r3;
        ?? r4;
        java.lang.String strE;
        int size;
        java.lang.String str2;
        int i2;
        java.lang.String[] strArrD;
        boolean z3;
        ?? r5;
        java.lang.String[] strArrD2;
        java.lang.Object[] objArr;
        java.lang.Object[] objArr2;
        long[] jArr;
        int length;
        int i3;
        long j4;
        int i4;
        long[] jArr2;
        int i5;
        int i6;
        int i7;
        long[] jArr3;
        long j5;
        java.lang.Object obj2;
        defpackage.dej dejVar;
        defpackage.aan aanVar;
        defpackage.ddz ddzVarR2;
        boolean z4;
        boolean z5;
        defpackage.ddz ddzVarR3 = cxlVar.r();
        int i8 = 8;
        boolean z6 = true;
        ?? r38 = 1;
        if (ddzVarR3 != null) {
            defpackage.aau aauVar = ddzVarR3.c;
            java.lang.Object[] objArr3 = aauVar.b;
            j = 128;
            java.lang.Object[] objArr4 = aauVar.c;
            long[] jArr4 = aauVar.a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                zBooleanValue = true;
                int i9 = 0;
                boolean z7 = false;
                j2 = 255;
                cgmVar = null;
                defpackage.det detVar2 = null;
                defpackage.dfb dfbVar2 = null;
                defpackage.cgo cgoVar2 = null;
                cgtVar = null;
                bool = null;
                defpackage.ddw ddwVar4 = null;
                z2 = false;
                num = null;
                obj = null;
                c = 7;
                j3 = -9187201950435737472L;
                while (true) {
                    long j6 = jArr4[i9];
                    java.lang.Object[] objArr5 = objArr3;
                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j6 & 255) < 128) {
                                int i12 = (i9 << 3) + i11;
                                java.lang.Object obj3 = objArr5[i12];
                                java.lang.Object obj4 = objArr4[i12];
                                defpackage.dej dejVar2 = (defpackage.dej) obj3;
                                if (defpackage.afga.f(dejVar2, defpackage.def.s)) {
                                    obj4.getClass();
                                    cgmVar = (defpackage.cgm) obj4;
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.a)) {
                                    obj4.getClass();
                                    java.lang.String str3 = (java.lang.String) defpackage.afga.aB((java.util.List) obj4);
                                    if (str3 != null) {
                                        viewStructure.setContentDescription(str3);
                                    }
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.r)) {
                                    obj4.getClass();
                                    cgtVar = (cgt) obj4;
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.t)) {
                                    obj4.getClass();
                                    cgoVar2 = (defpackage.cgo) obj4;
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.H)) {
                                    obj4.getClass();
                                    dfbVar2 = (defpackage.dfb) obj4;
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.l)) {
                                    obj4.getClass();
                                    viewStructure.setFocused(((java.lang.Boolean) obj4).booleanValue());
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.S)) {
                                    obj4.getClass();
                                    num = (java.lang.Integer) obj4;
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.O)) {
                                    z2 = z6;
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.o)) {
                                    obj4.getClass();
                                    zBooleanValue = ((java.lang.Boolean) obj4).booleanValue();
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.A)) {
                                    obj4.getClass();
                                    ddwVar4 = (defpackage.ddw) obj4;
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.L)) {
                                    obj4.getClass();
                                    bool = (java.lang.Boolean) obj4;
                                } else if (defpackage.afga.f(dejVar2, defpackage.def.M)) {
                                    obj4.getClass();
                                    detVar2 = (defpackage.det) obj4;
                                } else if (defpackage.afga.f(dejVar2, defpackage.ddy.b)) {
                                    viewStructure.setClickable(z6);
                                } else if (defpackage.afga.f(dejVar2, defpackage.ddy.c)) {
                                    viewStructure.setLongClickable(z6);
                                } else if (defpackage.afga.f(dejVar2, defpackage.ddy.w)) {
                                    viewStructure.setFocusable(z6);
                                } else if (defpackage.afga.f(dejVar2, defpackage.ddy.k)) {
                                    z7 = z6;
                                }
                                z5 = z6;
                                if (android.os.Build.VERSION.SDK_INT >= 34 && defpackage.afga.f(dejVar2, defpackage.deg.c)) {
                                    obj = obj4;
                                }
                            } else {
                                z5 = z6;
                            }
                            j6 >>= 8;
                            i11++;
                            z6 = z5;
                        }
                        z4 = z6;
                        z4 = z4;
                        if (i10 != 8) {
                            break;
                        } else {
                            break;
                        }
                    }
                    z4 = z6 ? 1 : 0;
                    if (i9 == length2) {
                        break;
                    }
                    i9++;
                    objArr3 = objArr5;
                    z6 = z4 ? 1 : 0;
                }
                z = z7;
                detVar = detVar2;
                dfbVar = dfbVar2;
                cgoVar = cgoVar2;
                ddwVar = ddwVar4;
                r38 = z4;
            }
            ddzVarR = cxlVar.r();
            if (ddzVarR != null && ddzVarR.a && !ddzVarR.b) {
                ddzVarR = ddzVarR.b();
                aanVar = new defpackage.aan(cxlVar.v().size());
                aanVar.r(cxlVar.v());
                while (aanVar.g()) {
                    defpackage.cxl cxlVar3 = (defpackage.cxl) aanVar.h(aanVar.b - 1);
                    ddzVarR2 = cxlVar3.r();
                    if (ddzVarR2 == null && !ddzVarR2.a) {
                        ddzVarR.e(ddzVarR2);
                        if (!ddzVarR2.b) {
                            aanVar.r(cxlVar3.v());
                        }
                    }
                }
            }
            if (ddzVarR != null) {
                defpackage.aau aauVar2 = ddzVarR.c;
                objArr = aauVar2.b;
                objArr2 = aauVar2.c;
                jArr = aauVar2.a;
                length = jArr.length - 2;
                if (length >= 0) {
                    list = null;
                    i3 = 0;
                    while (true) {
                        j4 = jArr[i3];
                        i4 = i8;
                        ddwVar2 = ddwVar;
                        if ((((~j4) << c) & j4 & j3) != j3) {
                            i6 = 8 - ((~(i3 - length)) >>> 31);
                            i7 = 0;
                            while (i7 < i6) {
                                if ((j4 & j2) < j) {
                                    int i13 = (i3 << 3) + i7;
                                    java.lang.Object obj5 = objArr[i13];
                                    obj2 = objArr2[i13];
                                    jArr3 = jArr;
                                    dejVar = (defpackage.dej) obj5;
                                    j5 = j4;
                                    if (defpackage.afga.f(dejVar, defpackage.def.j)) {
                                        viewStructure.setEnabled(false);
                                    } else if (defpackage.afga.f(dejVar, defpackage.def.D)) {
                                        obj2.getClass();
                                        list = (java.util.List) obj2;
                                    }
                                } else {
                                    jArr3 = jArr;
                                    j5 = j4;
                                }
                                i7++;
                                j4 = j5 >> i4;
                                jArr = jArr3;
                            }
                            jArr2 = jArr;
                            i5 = i4;
                            i = 0;
                            if (i6 == i5) {
                                break;
                            } else {
                                break;
                            }
                        }
                        jArr2 = jArr;
                        i5 = i4;
                        i = 0;
                        if (i3 != length) {
                            break;
                        }
                        i3++;
                        i8 = i5;
                        ddwVar = ddwVar2;
                        jArr = jArr2;
                    }
                } else {
                    ddwVar2 = ddwVar;
                    i = 0;
                    list = null;
                }
            } else {
                ddwVar2 = ddwVar;
                i = 0;
                list = null;
            }
            numValueOf = java.lang.Integer.valueOf(cxlVar.c);
            numValueOf.intValue();
            if (cxlVar.l() == null) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = -1;
            }
            a$.ExternalSyntheticApiModelOutline1.m(viewStructure, autofillId, iIntValue);
            viewStructure.setId(iIntValue, str, null, null);
            if (cgmVar != null) {
                numValueOf2 = java.lang.Integer.valueOf(defpackage.dai.ao(cgmVar));
            } else if (z) {
                numValueOf2 = java.lang.Integer.valueOf((int) r38);
            } else if (detVar != null) {
                numValueOf2 = 2;
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 != null) {
                a$.ExternalSyntheticApiModelOutline1.m(viewStructure, numValueOf2.intValue());
            }
            if (dfbVar != null) {
                xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, defpackage.vz.g(dfbVar.b));
            }
            if (cgoVar != null) {
                xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, cgoVar.a);
            }
            if (cgtVar != null && (strArrD2 = defpackage.wf.d(cgtVar)) != null) {
                xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, strArrD2);
            }
            cxlVar2 = (defpackage.cxl) depVar.a.a(cxlVar.c);
            if (cxlVar2 == null && defpackage.dep.h(cxlVar2) == (r5 = r38)) {
                defpackage.den denVar = depVar.b;
                int iA = depVar.a(cxlVar2);
                long[] jArr5 = (long[]) denVar.b;
                long j7 = jArr5[iA];
                long j8 = jArr5[iA + (r5 == true ? 1 : 0)];
                int i14 = (int) j7;
                int i15 = (int) (j7 >> 32);
                viewStructure.setDimens(i15, i14, 0, 0, ((int) (j8 >> 32)) - i15, ((int) j8) - i14);
            }
            if (bool != null) {
                viewStructure.setSelected(bool.booleanValue());
            }
            if (detVar != null) {
                if (bool != null) {
                    if (ddwVar2 == null) {
                        ddwVar3 = ddwVar2;
                    } else {
                        ddwVar3 = ddwVar2;
                        if (!defpackage.a.X(ddwVar3.a, 4)) {
                        }
                    }
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                int i16 = cgt.b;
                java.lang.String str4 = (java.lang.String) defpackage.afga.bO(defpackage.wf.d(cgs.a));
                if (cgtVar == null && (strArrD = defpackage.wf.d(cgtVar)) != null && defpackage.afga.cg(strArrD, str4)) {
                    r2 = 1;
                } else {
                    r2 = i;
                }
                if (z2 && r2 == 0) {
                    r3 = i;
                } else {
                    r3 = 1;
                }
                if (r3 == 0 || zBooleanValue) {
                    r4 = 1;
                } else {
                    r4 = i;
                }
                xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, (boolean) r4);
                viewStructure.setVisibility(true != cxlVar.q().ay() ? i : 4);
                if (list != null) {
                    size = list.size();
                    str2 = "";
                    for (i2 = i; i2 < size; i2++) {
                        str2 = ((java.lang.Object) str2) + ((defpackage.dfb) list.get(i2)).b + "\n";
                    }
                    viewStructure.setText(str2);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (cxlVar.v().isEmpty() && ddwVar3 != null && (strE = defpackage.dbc.e(ddwVar3.a)) != null) {
                    viewStructure.setClassName(strE);
                }
                if (z) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (num != null) {
                        jx$.ExternalSyntheticApiModelOutline3.m(viewStructure, num.intValue());
                    }
                    if (r3 != 0) {
                        xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, 129);
                    }
                }
                if (android.os.Build.VERSION.SDK_INT >= 35 || obj == null) {
                }
                throw null;
            }
            viewStructure.setCheckable(true);
            if (detVar == defpackage.det.a) {
                z3 = true;
            } else {
                z3 = i;
            }
            viewStructure.setChecked(z3);
            ddwVar3 = ddwVar2;
            int i17 = cgt.b;
            java.lang.String str5 = (java.lang.String) defpackage.afga.bO(defpackage.wf.d(cgs.a));
            if (cgtVar == null) {
                r2 = i;
            } else {
                r2 = i;
            }
            if (z2) {
                r3 = 1;
            } else {
                r3 = 1;
            }
            if (r3 == 0) {
                r4 = 1;
            } else {
                r4 = 1;
            }
            xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, (boolean) r4);
            viewStructure.setVisibility(true != cxlVar.q().ay() ? i : 4);
            if (list != null) {
                size = list.size();
                str2 = "";
                while (i2 < size) {
                    str2 = ((java.lang.Object) str2) + ((defpackage.dfb) list.get(i2)).b + "\n";
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (cxlVar.v().isEmpty()) {
                viewStructure.setClassName(strE);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (num != null) {
                    jx$.ExternalSyntheticApiModelOutline3.m(viewStructure, num.intValue());
                }
                if (r3 != 0) {
                    xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, 129);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 35) {
            }
        }
        j = 128;
        j2 = 255;
        c = 7;
        j3 = -9187201950435737472L;
        zBooleanValue = z6;
        dfbVar = null;
        cgoVar = null;
        z = false;
        detVar = null;
        ddwVar = null;
        cgmVar = null;
        cgtVar = null;
        bool = null;
        z2 = false;
        num = null;
        obj = null;
        ddzVarR = cxlVar.r();
        if (ddzVarR != null) {
            ddzVarR = ddzVarR.b();
            aanVar = new defpackage.aan(cxlVar.v().size());
            aanVar.r(cxlVar.v());
            while (aanVar.g()) {
                defpackage.cxl cxlVar4 = (defpackage.cxl) aanVar.h(aanVar.b - 1);
                ddzVarR2 = cxlVar4.r();
                if (ddzVarR2 == null) {
                }
            }
        }
        if (ddzVarR != null) {
            defpackage.aau aauVar3 = ddzVarR.c;
            objArr = aauVar3.b;
            objArr2 = aauVar3.c;
            jArr = aauVar3.a;
            length = jArr.length - 2;
            if (length >= 0) {
                list = null;
                i3 = 0;
                while (true) {
                    j4 = jArr[i3];
                    i4 = i8;
                    ddwVar2 = ddwVar;
                    if ((((~j4) << c) & j4 & j3) != j3) {
                        i6 = 8 - ((~(i3 - length)) >>> 31);
                        i7 = 0;
                        while (i7 < i6) {
                            if ((j4 & j2) < j) {
                                int i18 = (i3 << 3) + i7;
                                java.lang.Object obj6 = objArr[i18];
                                obj2 = objArr2[i18];
                                jArr3 = jArr;
                                dejVar = (defpackage.dej) obj6;
                                j5 = j4;
                                if (defpackage.afga.f(dejVar, defpackage.def.j)) {
                                    viewStructure.setEnabled(false);
                                } else if (defpackage.afga.f(dejVar, defpackage.def.D)) {
                                    obj2.getClass();
                                    list = (java.util.List) obj2;
                                }
                            } else {
                                jArr3 = jArr;
                                j5 = j4;
                            }
                            i7++;
                            j4 = j5 >> i4;
                            jArr = jArr3;
                        }
                        jArr2 = jArr;
                        i5 = i4;
                        i = 0;
                        if (i6 == i5) {
                            break;
                        }
                        break;
                        break;
                    }
                    jArr2 = jArr;
                    i5 = i4;
                    i = 0;
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                    i8 = i5;
                    ddwVar = ddwVar2;
                    jArr = jArr2;
                }
            } else {
                ddwVar2 = ddwVar;
                i = 0;
                list = null;
            }
        } else {
            ddwVar2 = ddwVar;
            i = 0;
            list = null;
        }
        numValueOf = java.lang.Integer.valueOf(cxlVar.c);
        numValueOf.intValue();
        if (cxlVar.l() == null) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        a$.ExternalSyntheticApiModelOutline1.m(viewStructure, autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (cgmVar != null) {
            numValueOf2 = java.lang.Integer.valueOf(defpackage.dai.ao(cgmVar));
        } else if (z) {
            numValueOf2 = java.lang.Integer.valueOf((int) r38);
        } else if (detVar != null) {
            numValueOf2 = 2;
        } else {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            a$.ExternalSyntheticApiModelOutline1.m(viewStructure, numValueOf2.intValue());
        }
        if (dfbVar != null) {
            xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, defpackage.vz.g(dfbVar.b));
        }
        if (cgoVar != null) {
            xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, cgoVar.a);
        }
        if (cgtVar != null) {
            xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, strArrD2);
        }
        cxlVar2 = (defpackage.cxl) depVar.a.a(cxlVar.c);
        if (cxlVar2 == null) {
        }
        if (bool != null) {
            viewStructure.setSelected(bool.booleanValue());
        }
        if (detVar != null) {
            if (bool != null) {
                if (ddwVar2 == null) {
                    ddwVar3 = ddwVar2;
                } else {
                    ddwVar3 = ddwVar2;
                    if (!defpackage.a.X(ddwVar3.a, 4)) {
                    }
                }
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            int i19 = cgt.b;
            java.lang.String str6 = (java.lang.String) defpackage.afga.bO(defpackage.wf.d(cgs.a));
            if (cgtVar == null) {
                r2 = i;
            } else {
                r2 = i;
            }
            if (z2) {
                r3 = 1;
            } else {
                r3 = 1;
            }
            if (r3 == 0) {
                r4 = 1;
            } else {
                r4 = 1;
            }
            xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, (boolean) r4);
            viewStructure.setVisibility(true != cxlVar.q().ay() ? i : 4);
            if (list != null) {
                size = list.size();
                str2 = "";
                while (i2 < size) {
                    str2 = ((java.lang.Object) str2) + ((defpackage.dfb) list.get(i2)).b + "\n";
                }
                viewStructure.setText(str2);
                viewStructure.setClassName("android.widget.TextView");
            }
            if (cxlVar.v().isEmpty()) {
                viewStructure.setClassName(strE);
            }
            if (z) {
                viewStructure.setClassName("android.widget.EditText");
                if (num != null) {
                    jx$.ExternalSyntheticApiModelOutline3.m(viewStructure, num.intValue());
                }
                if (r3 != 0) {
                    xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, 129);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 35) {
            }
        }
        viewStructure.setCheckable(true);
        if (detVar == defpackage.det.a) {
            z3 = true;
        } else {
            z3 = i;
        }
        viewStructure.setChecked(z3);
        ddwVar3 = ddwVar2;
        int i110 = cgt.b;
        java.lang.String str7 = (java.lang.String) defpackage.afga.bO(defpackage.wf.d(cgs.a));
        if (cgtVar == null) {
            r2 = i;
        } else {
            r2 = i;
        }
        if (z2) {
            r3 = 1;
        } else {
            r3 = 1;
        }
        if (r3 == 0) {
            r4 = 1;
        } else {
            r4 = 1;
        }
        xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, (boolean) r4);
        viewStructure.setVisibility(true != cxlVar.q().ay() ? i : 4);
        if (list != null) {
            size = list.size();
            str2 = "";
            while (i2 < size) {
                str2 = ((java.lang.Object) str2) + ((defpackage.dfb) list.get(i2)).b + "\n";
            }
            viewStructure.setText(str2);
            viewStructure.setClassName("android.widget.TextView");
        }
        if (cxlVar.v().isEmpty()) {
            viewStructure.setClassName(strE);
        }
        if (z) {
            viewStructure.setClassName("android.widget.EditText");
            if (num != null) {
                jx$.ExternalSyntheticApiModelOutline3.m(viewStructure, num.intValue());
            }
            if (r3 != 0) {
                xi$.ExternalSyntheticApiModelOutline0.m(viewStructure, 129);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
        }
    }

    public static drq e(defpackage.dqv dqvVar, int i, java.util.ArrayList arrayList, drq drqVar) {
        int i2;
        int i3 = i == 0 ? dqvVar.ay : dqvVar.az;
        if (i3 != -1 && (drqVar == null || i3 != drqVar.c)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                drq drqVar2 = (drq) arrayList.get(i4);
                if (drqVar2.c == i3) {
                    if (drqVar != null) {
                        drqVar.c(i, drqVar2);
                        arrayList.remove(drqVar);
                    }
                    drqVar = drqVar2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return drqVar;
        }
        if (drqVar == null) {
            if (dqvVar instanceof defpackage.dra) {
                defpackage.dra draVar = (defpackage.dra) dqvVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= draVar.aM) {
                        i2 = -1;
                        break;
                    }
                    defpackage.dqv dqvVar2 = draVar.aL[i5];
                    if (i == 0) {
                        i2 = dqvVar2.ay;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = dqvVar2.az;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        drq drqVar3 = (drq) arrayList.get(i6);
                        if (drqVar3.c == i2) {
                            drqVar = drqVar3;
                            break;
                        }
                    }
                }
            }
            if (drqVar == null) {
                drqVar = new drq(i);
            }
            arrayList.add(drqVar);
        }
        if (drqVar.d(dqvVar)) {
            if (dqvVar instanceof defpackage.dqz) {
                defpackage.dqz dqzVar = (defpackage.dqz) dqvVar;
                dqzVar.d.d(dqzVar.e == 0 ? 1 : 0, arrayList, drqVar);
            }
            if (i == 0) {
                dqvVar.ay = drqVar.c;
                dqvVar.T.d(0, arrayList, drqVar);
                dqvVar.V.d(0, arrayList, drqVar);
            } else {
                dqvVar.az = drqVar.c;
                dqvVar.U.d(1, arrayList, drqVar);
                dqvVar.X.d(1, arrayList, drqVar);
                dqvVar.W.d(1, arrayList, drqVar);
            }
            dqvVar.aa.d(i, arrayList, drqVar);
        }
        return drqVar;
    }

    public static drq f(java.util.ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            drq drqVar = (drq) arrayList.get(i2);
            if (i == drqVar.c) {
                return drqVar;
            }
        }
        return null;
    }

    public static boolean g(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    /* JADX WARN: Code duplicated, block: B:178:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:197:0x030c  */
    /* JADX WARN: Code duplicated, block: B:199:0x0311  */
    /* JADX WARN: Code duplicated, block: B:201:0x0317  */
    /* JADX WARN: Code duplicated, block: B:225:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:227:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:229:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:242:0x043a  */
    /* JADX WARN: Code duplicated, block: B:244:0x0458  */
    /* JADX WARN: Code duplicated, block: B:406:0x070e  */
    /* JADX WARN: Code duplicated, block: B:409:0x0717  */
    /* JADX WARN: Code duplicated, block: B:410:0x071a  */
    /* JADX WARN: Code duplicated, block: B:413:0x0720  */
    /* JADX WARN: Code duplicated, block: B:414:0x0723  */
    /* JADX WARN: Code duplicated, block: B:416:0x0727  */
    /* JADX WARN: Code duplicated, block: B:418:0x072f  */
    /* JADX WARN: Code duplicated, block: B:419:0x0731 A[PHI: r9
  0x0731: PHI (r9v26 dpj) = (r9v25 dpj), (r9v31 dpj) binds: [B:415:0x0725, B:418:0x072f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:421:0x0735  */
    /* JADX WARN: Code duplicated, block: B:423:0x0739 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x0753 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x012c  */
    public static void h(defpackage.dqw dqwVar, defpackage.dpg dpgVar, java.util.ArrayList arrayList, int i) {
        int i2;
        defpackage.dqt[] dqtVarArr;
        int i3;
        int i4;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        defpackage.dqt[] dqtVarArr2;
        defpackage.dqv dqvVar;
        defpackage.dqv dqvVar2;
        defpackage.dqv dqvVar3;
        defpackage.dpg dpgVar2;
        defpackage.dqv dqvVar4;
        int i6;
        int i7;
        defpackage.dqv dqvVar5;
        defpackage.dpj dpjVar;
        defpackage.dpj dpjVar2;
        defpackage.dqu dquVar;
        defpackage.dpj dpjVar3;
        int i8;
        defpackage.dqv dqvVar6;
        defpackage.dqu dquVar2;
        defpackage.dpj dpjVar4;
        int i9;
        int i10;
        defpackage.dqu[] dquVarArr;
        defpackage.dqu dquVar3;
        defpackage.dqu dquVar4;
        defpackage.dpj dpjVar5;
        defpackage.dqu dquVar5;
        defpackage.dpj dpjVar6;
        defpackage.dqu dquVar6;
        int size;
        java.util.ArrayList arrayList2;
        float f2;
        float f3;
        defpackage.dpj dpjVar7;
        defpackage.dpj dpjVar8;
        defpackage.dpj dpjVar9;
        defpackage.dpj dpjVar10;
        defpackage.dpf dpfVarA;
        float f4;
        boolean z5;
        int i11;
        defpackage.dqu dquVar7;
        defpackage.dqv dqvVar7;
        int i12;
        int i13;
        defpackage.dqv dqvVar8;
        int iH;
        defpackage.dqw dqwVar2 = dqwVar;
        int i14 = 2;
        if (i == 0) {
            i2 = dqwVar2.h;
            dqtVarArr = dqwVar2.k;
            i3 = 0;
        } else {
            i2 = dqwVar2.i;
            dqtVarArr = dqwVar2.j;
            i3 = 2;
        }
        int i15 = i2;
        defpackage.dqt[] dqtVarArr3 = dqtVarArr;
        int i16 = 0;
        while (i16 < i15) {
            defpackage.dqt dqtVar = dqtVarArr3[i16];
            int i17 = 3;
            int i18 = 8;
            defpackage.dpj dpjVar11 = null;
            if (dqtVar.t) {
                i4 = i16;
                f = 0.0f;
            } else {
                int i19 = dqtVar.o;
                int i20 = i19 + i19;
                f = 0.0f;
                defpackage.dqv dqvVar9 = dqtVar.a;
                defpackage.dqv dqvVar10 = dqvVar9;
                defpackage.dqv dqvVar11 = dqvVar10;
                boolean z6 = false;
                while (!z6) {
                    int i21 = i20 + 1;
                    dqtVar.i++;
                    dqvVar10.ax[i19] = null;
                    dqvVar10.aw[i19] = null;
                    if (dqvVar10.ar != i18) {
                        dqtVar.l++;
                        if (dqvVar10.V(i19) != i17) {
                            int i22 = dqtVar.m;
                            if (i19 == 0) {
                                iH = dqvVar10.j();
                                i13 = 0;
                            } else {
                                iH = dqvVar10.h();
                                i13 = 1;
                            }
                            dqtVar.m = i22 + iH;
                        } else {
                            i13 = i19;
                        }
                        int i23 = dqtVar.m;
                        defpackage.dqu[] dquVarArr2 = dqvVar10.ab;
                        int iB = i23 + dquVarArr2[i20].b();
                        dqtVar.m = iB;
                        dqtVar.m = iB + dquVarArr2[i21].b();
                        int iB2 = dqtVar.n + dquVarArr2[i20].b();
                        dqtVar.n = iB2;
                        dqtVar.n = iB2 + dquVarArr2[i21].b();
                        if (dqtVar.b == null) {
                            dqtVar.b = dqvVar10;
                        }
                        dqtVar.d = dqvVar10;
                        int i24 = dqvVar10.aA[i13];
                        if (i24 == i17) {
                            int i25 = dqvVar10.E[i13];
                            if (i25 != 0 && i25 != i17) {
                                if (i25 == i14) {
                                    i25 = i14;
                                }
                            }
                            dqtVar.j++;
                            float f5 = dqvVar10.av[i13];
                            if (f5 > 0.0f) {
                                dqtVar.k += f5;
                            }
                            if (dqvVar10.ar != 8 && i24 == 3 && (i25 == 0 || i25 == 3)) {
                                if (f5 < 0.0f) {
                                    dqtVar.q = true;
                                } else {
                                    dqtVar.r = true;
                                }
                                if (dqtVar.h == null) {
                                    dqtVar.h = new java.util.ArrayList();
                                }
                                dqtVar.h.add(dqvVar10);
                            }
                            if (dqtVar.f == null) {
                                dqtVar.f = dqvVar10;
                            }
                            defpackage.dqv dqvVar12 = dqtVar.g;
                            if (dqvVar12 != null) {
                                dqvVar12.aw[i13] = dqvVar10;
                            }
                            dqtVar.g = dqvVar10;
                        }
                    } else {
                        i13 = i19;
                    }
                    defpackage.dqv dqvVar13 = dqvVar11;
                    if (dqvVar13 != dqvVar10) {
                        dqvVar13.ax[i13] = dqvVar10;
                    }
                    defpackage.dqu dquVar8 = dqvVar10.ab[i21].e;
                    if (dquVar8 != null) {
                        dqvVar8 = dquVar8.d;
                        defpackage.dqu dquVar9 = dqvVar8.ab[i20].e;
                        if (dquVar9 == null || dquVar9.d != dqvVar10) {
                            dqvVar8 = null;
                        }
                    } else {
                        dqvVar8 = null;
                    }
                    z6 = dqvVar8 == null;
                    if (dqvVar8 == null) {
                        dqvVar8 = dqvVar10;
                    }
                    dqvVar11 = dqvVar10;
                    i17 = 3;
                    i18 = 8;
                    i14 = 2;
                    dqvVar10 = dqvVar8;
                    i16 = i16;
                }
                i4 = i16;
                defpackage.dqv dqvVar14 = dqtVar.b;
                if (dqvVar14 != null) {
                    dqtVar.m -= dqvVar14.ab[i20].b();
                }
                defpackage.dqv dqvVar15 = dqtVar.d;
                if (dqvVar15 != null) {
                    dqtVar.m -= dqvVar15.ab[i20 + 1].b();
                }
                dqtVar.c = dqvVar10;
                if (i19 == 0 && dqtVar.p) {
                    dqtVar.e = dqtVar.c;
                } else {
                    dqtVar.e = dqvVar9;
                }
                dqtVar.s = dqtVar.r && dqtVar.q;
            }
            dqtVar.t = true;
            if (arrayList == 0 || arrayList.contains(dqtVar.a)) {
                defpackage.dqv dqvVar16 = dqtVar.a;
                defpackage.dqv dqvVar17 = dqtVar.c;
                defpackage.dqv dqvVar18 = dqtVar.b;
                defpackage.dqv dqvVar19 = dqtVar.d;
                defpackage.dqv dqvVar20 = dqtVar.e;
                float f6 = dqtVar.k;
                defpackage.dqv dqvVar21 = dqtVar.f;
                defpackage.dqv dqvVar22 = dqtVar.g;
                int i26 = dqwVar2.aA[i];
                if (i == 0) {
                    int i27 = dqvVar20.at;
                    boolean z7 = i27 == 0;
                    boolean z8 = i27 == 1;
                    z = i27 == 2;
                    z4 = z8;
                    z2 = z7;
                    z3 = false;
                } else {
                    int i28 = dqvVar20.au;
                    boolean z9 = i28 == 0;
                    boolean z10 = i28 == 1;
                    z = i28 == 2;
                    z2 = z9;
                    z3 = false;
                    z4 = z10;
                }
                while (!z3) {
                    int i29 = i3 + 1;
                    defpackage.dqu[] dquVarArr3 = dqvVar16.ab;
                    defpackage.dqu dquVar10 = dquVarArr3[i3];
                    int i30 = true != z ? 4 : 1;
                    int iB3 = dquVar10.b();
                    boolean z11 = z;
                    int[] iArr = dqvVar16.aA;
                    int iB4 = iB3;
                    boolean z12 = iArr[i] == 3 && dqvVar16.E[i] == 0;
                    defpackage.dqu dquVar11 = dquVar10.e;
                    if (dquVar11 != null && dqvVar16 != dqvVar16) {
                        iB4 += dquVar11.b();
                    }
                    boolean z13 = z12;
                    int i31 = iB4;
                    if (z11 && dqvVar16 != dqvVar16 && dqvVar16 != dqvVar18) {
                        i30 = 8;
                    }
                    if (dquVar11 != null) {
                        if (dqvVar16 == dqvVar18) {
                            dpgVar.g(dquVar10.h, dquVar11.h, i31, 6);
                        } else {
                            dpgVar.g(dquVar10.h, dquVar11.h, i31, 8);
                        }
                        if (z13 && !z11) {
                            i30 = 5;
                        }
                        dpgVar.m(dquVar10.h, dquVar10.e.h, i31, (dqvVar16 == dqvVar18 && z11 && dqvVar16.ad[i]) ? 5 : i30);
                    } else {
                        i15 = i15;
                        dqtVarArr3 = dqtVarArr3;
                    }
                    if (i26 == 2) {
                        if (dqvVar16.ar == 8 || iArr[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            dpgVar.g(dquVarArr3[i29].h, dquVarArr3[i3].h, 0, 5);
                        }
                        dpgVar.g(dquVarArr3[i3].h, dqwVar2.ab[i3].h, i12, 8);
                    }
                    defpackage.dqu dquVar12 = dquVarArr3[i29].e;
                    if (dquVar12 != null) {
                        dqvVar7 = dquVar12.d;
                        defpackage.dqu dquVar13 = dqvVar7.ab[i3].e;
                        if (dquVar13 == null || dquVar13.d != dqvVar16) {
                            dqvVar7 = null;
                        }
                    } else {
                        dqvVar7 = null;
                    }
                    z3 = dqvVar7 == null;
                    if (dqvVar7 != null) {
                        dqvVar16 = dqvVar7;
                    }
                    z = z11;
                    i15 = i15;
                    dqtVarArr3 = dqtVarArr3;
                }
                boolean z14 = z;
                i5 = i15;
                dqtVarArr2 = dqtVarArr3;
                if (dqvVar19 != null) {
                    int i32 = i3 + 1;
                    defpackage.dqu[] dquVarArr4 = dqvVar17.ab;
                    if (dquVarArr4[i32].e != null) {
                        defpackage.dqu dquVar14 = dqvVar19.ab[i32];
                        if (dqvVar19.aA[i] == 3 && dqvVar19.E[i] == 0 && !z14) {
                            defpackage.dqu dquVar15 = dquVar14.e;
                            if (dquVar15.d == dqwVar2) {
                                i11 = i32;
                                dpgVar.m(dquVar14.h, dquVar15.h, -dquVar14.b(), 5);
                            } else {
                                i11 = i32;
                                if (z14) {
                                    dquVar7 = dquVar14.e;
                                    if (dquVar7.d == dqwVar2) {
                                        dpgVar.m(dquVar14.h, dquVar7.h, -dquVar14.b(), 4);
                                    }
                                }
                            }
                        } else {
                            i11 = i32;
                            if (z14) {
                                dquVar7 = dquVar14.e;
                                if (dquVar7.d == dqwVar2) {
                                    dpgVar.m(dquVar14.h, dquVar7.h, -dquVar14.b(), 4);
                                }
                            }
                        }
                        dpgVar.h(dquVar14.h, dquVarArr4[i11].e.h, -dquVar14.b(), 6);
                    }
                }
                if (i26 == 2) {
                    int i33 = i3 + 1;
                    defpackage.dpj dpjVar12 = dqwVar2.ab[i33].h;
                    defpackage.dqu dquVar16 = dqvVar17.ab[i33];
                    dpgVar.g(dpjVar12, dquVar16.h, dquVar16.b(), 8);
                }
                java.util.ArrayList arrayList3 = dqtVar.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (dqtVar.q && !dqtVar.s) {
                        f6 = dqtVar.j;
                    }
                    defpackage.dqv dqvVar23 = null;
                    float f7 = f;
                    int i34 = 0;
                    while (i34 < size) {
                        defpackage.dqv dqvVar24 = (defpackage.dqv) arrayList3.get(i34);
                        float f8 = dqvVar24.av[i];
                        if (f8 >= f) {
                            arrayList2 = arrayList3;
                            if (f8 == f) {
                                defpackage.dqu[] dquVarArr5 = dqvVar24.ab;
                                z5 = false;
                                dpgVar.m(dquVarArr5[i3 + 1].h, dquVarArr5[i3].h, 0, 8);
                                size = size;
                                i34 = i34;
                                f3 = f;
                            } else {
                                if (dqvVar23 != null) {
                                    int i35 = i3 + 1;
                                    defpackage.dqu[] dquVarArr6 = dqvVar23.ab;
                                    dpjVar7 = dquVarArr6[i3].h;
                                    dpjVar8 = dquVarArr6[i35].h;
                                    defpackage.dqu[] dquVarArr7 = dqvVar24.ab;
                                    dpjVar9 = dquVarArr7[i3].h;
                                    dpjVar10 = dquVarArr7[i35].h;
                                    float f9 = f7;
                                    dpfVarA = dpgVar.a();
                                    f2 = f8;
                                    f4 = f;
                                    dpfVarA.b = f4;
                                    f3 = f4;
                                    if (f6 != f4 || f9 == f2) {
                                        dpfVarA.e.g(dpjVar7, 1.0f);
                                        dpfVarA.e.g(dpjVar8, -1.0f);
                                        dpfVarA.e.g(dpjVar10, 1.0f);
                                        dpfVarA.e.g(dpjVar9, -1.0f);
                                    } else if (f9 == f3) {
                                        dpfVarA.e.g(dpjVar7, 1.0f);
                                        dpfVarA.e.g(dpjVar8, -1.0f);
                                    } else if (f8 == f) {
                                        dpfVarA.e.g(dpjVar9, 1.0f);
                                        dpfVarA.e.g(dpjVar10, -1.0f);
                                    } else {
                                        dpfVarA.e.g(dpjVar7, 1.0f);
                                        dpfVarA.e.g(dpjVar8, -1.0f);
                                        float f10 = (f9 / f6) / (f2 / f6);
                                        dpfVarA.e.g(dpjVar10, f10);
                                        dpfVarA.e.g(dpjVar9, -f10);
                                    }
                                    dpgVar.e(dpfVarA);
                                } else {
                                    f2 = f8;
                                    i34 = i34;
                                    f3 = f;
                                }
                                dqvVar23 = dqvVar24;
                                f7 = f2;
                            }
                        } else {
                            if (dqtVar.s) {
                                defpackage.dqu[] dquVarArr8 = dqvVar24.ab;
                                arrayList2 = arrayList3;
                                dpgVar.m(dquVarArr8[i3 + 1].h, dquVarArr8[i3].h, 0, 4);
                                z5 = false;
                            } else {
                                f8 = 1.0f;
                                arrayList2 = arrayList3;
                                if (f8 == f) {
                                    defpackage.dqu[] dquVarArr9 = dqvVar24.ab;
                                    z5 = false;
                                    dpgVar.m(dquVarArr9[i3 + 1].h, dquVarArr9[i3].h, 0, 8);
                                } else {
                                    if (dqvVar23 != null) {
                                        int i36 = i3 + 1;
                                        defpackage.dqu[] dquVarArr10 = dqvVar23.ab;
                                        dpjVar7 = dquVarArr10[i3].h;
                                        dpjVar8 = dquVarArr10[i36].h;
                                        defpackage.dqu[] dquVarArr11 = dqvVar24.ab;
                                        dpjVar9 = dquVarArr11[i3].h;
                                        dpjVar10 = dquVarArr11[i36].h;
                                        float f11 = f7;
                                        dpfVarA = dpgVar.a();
                                        f2 = f8;
                                        f4 = f;
                                        dpfVarA.b = f4;
                                        f3 = f4;
                                        if (f6 != f4) {
                                            dpfVarA.e.g(dpjVar7, 1.0f);
                                            dpfVarA.e.g(dpjVar8, -1.0f);
                                            dpfVarA.e.g(dpjVar10, 1.0f);
                                            dpfVarA.e.g(dpjVar9, -1.0f);
                                        } else {
                                            dpfVarA.e.g(dpjVar7, 1.0f);
                                            dpfVarA.e.g(dpjVar8, -1.0f);
                                            dpfVarA.e.g(dpjVar10, 1.0f);
                                            dpfVarA.e.g(dpjVar9, -1.0f);
                                        }
                                        dpgVar.e(dpfVarA);
                                    } else {
                                        f2 = f8;
                                        i34 = i34;
                                        f3 = f;
                                    }
                                    dqvVar23 = dqvVar24;
                                    f7 = f2;
                                }
                            }
                            size = size;
                            i34 = i34;
                            f3 = f;
                        }
                        i34++;
                        arrayList3 = arrayList2;
                        size = size;
                        f = f3;
                    }
                }
                if (dqvVar18 == null || !(dqvVar18 == dqvVar19 || z14)) {
                    dqvVar = dqvVar18;
                    dqvVar2 = dqvVar19;
                    if (!z2) {
                        dqvVar3 = dqvVar;
                    } else if (dqvVar != null) {
                        int i37 = dqtVar.j;
                        boolean z15 = i37 > 0 && dqtVar.i == i37;
                        defpackage.dqv dqvVar25 = dqvVar;
                        defpackage.dqv dqvVar26 = dqvVar25;
                        while (dqvVar26 != null) {
                            defpackage.dqv dqvVar27 = dqvVar26.ax[i];
                            while (true) {
                                if (dqvVar27 == null) {
                                    i8 = 8;
                                    break;
                                }
                                i8 = 8;
                                if (dqvVar27.ar != 8) {
                                    break;
                                } else {
                                    dqvVar27 = dqvVar27.ax[i];
                                }
                            }
                            if (dqvVar27 != null || dqvVar26 == dqvVar2) {
                                int i38 = i3 + 1;
                                defpackage.dqu[] dquVarArr12 = dqvVar26.ab;
                                defpackage.dqu dquVar17 = dquVarArr12[i3];
                                defpackage.dpj dpjVar13 = dquVar17.h;
                                defpackage.dqu dquVar18 = dquVar17.e;
                                defpackage.dpj dpjVar14 = dquVar18 != null ? dquVar18.h : null;
                                if (dqvVar25 != dqvVar26) {
                                    dpjVar14 = dqvVar25.ab[i38].h;
                                } else if (dqvVar26 == dqvVar) {
                                    defpackage.dqu dquVar19 = dqvVar16.ab[i3].e;
                                    dpjVar14 = dquVar19 != null ? dquVar19.h : null;
                                }
                                int iB5 = dquVar17.b();
                                int iB6 = dquVarArr12[i38].b();
                                if (dqvVar27 != null) {
                                    dquVar2 = dqvVar27.ab[i3];
                                    dqvVar6 = dqvVar27;
                                    dpjVar4 = dquVar2.h;
                                } else {
                                    dqvVar6 = dqvVar27;
                                    dquVar2 = dqvVar17.ab[i38].e;
                                    dpjVar4 = dquVar2 != null ? dquVar2.h : null;
                                }
                                defpackage.dpj dpjVar15 = dquVarArr12[i38].h;
                                if (dquVar2 != null) {
                                    iB6 += dquVar2.b();
                                }
                                int iB7 = iB5 + dqvVar25.ab[i38].b();
                                if (dpjVar13 == null || dpjVar14 == null || dpjVar4 == null || dpjVar15 == null) {
                                    i9 = 8;
                                } else {
                                    if (dqvVar26 == dqvVar) {
                                        iB7 = dqvVar.ab[i3].b();
                                    }
                                    int i39 = iB7;
                                    if (dqvVar26 == dqvVar2) {
                                        iB6 = dqvVar2.ab[i38].b();
                                    }
                                    int i40 = true != z15 ? 5 : 8;
                                    i9 = 8;
                                    dpgVar.d(dpjVar13, dpjVar14, i39, 0.5f, dpjVar4, dpjVar15, iB6, i40);
                                }
                            } else {
                                dqvVar6 = dqvVar27;
                                i9 = i8;
                            }
                            dqvVar25 = dqvVar26.ar != i9 ? dqvVar26 : dqvVar25;
                            dqvVar26 = dqvVar6;
                            z15 = z15;
                        }
                    } else {
                        dqvVar3 = null;
                    }
                    int i41 = 8;
                    if (!z4 || dqvVar == null) {
                        dpgVar2 = dpgVar;
                        dqvVar3 = dqvVar3;
                    } else {
                        int i42 = i3 + 1;
                        int i43 = dqtVar.j;
                        boolean z16 = i43 > 0 && dqtVar.i == i43;
                        defpackage.dqv dqvVar28 = dqvVar;
                        defpackage.dqv dqvVar29 = dqvVar28;
                        while (dqvVar28 != null) {
                            defpackage.dqv dqvVar30 = dqvVar28.ax[i];
                            while (dqvVar30 != null && dqvVar30.ar == i41) {
                                dqvVar30 = dqvVar30.ax[i];
                            }
                            if (dqvVar28 == dqvVar || dqvVar28 == dqvVar2 || dqvVar30 == null) {
                                z16 = z16;
                                dqvVar5 = dqvVar28;
                                dqvVar29 = dqvVar29;
                                dqvVar28 = dqvVar30;
                            } else {
                                if (dqvVar30 == dqvVar2) {
                                    dqvVar30 = null;
                                }
                                defpackage.dqu[] dquVarArr13 = dqvVar28.ab;
                                defpackage.dqu dquVar20 = dquVarArr13[i3];
                                defpackage.dqv dqvVar31 = dqvVar28;
                                defpackage.dpj dpjVar16 = dquVar20.h;
                                defpackage.dqu dquVar21 = dquVar20.e;
                                defpackage.dqu[] dquVarArr14 = dqvVar29.ab;
                                defpackage.dpj dpjVar17 = dquVarArr14[i42].h;
                                int iB8 = dquVar20.b();
                                int iB9 = dquVarArr13[i42].b();
                                if (dqvVar30 != null) {
                                    dquVar = dqvVar30.ab[i3];
                                    dpjVar2 = dquVar.h;
                                    dpjVar = dpjVar16;
                                    defpackage.dqu dquVar22 = dquVar.e;
                                    dpjVar3 = dquVar22 != null ? dquVar22.h : null;
                                } else {
                                    dpjVar = dpjVar16;
                                    defpackage.dqu dquVar23 = dqvVar2.ab[i3];
                                    dpjVar2 = dquVar23 != null ? dquVar23.h : null;
                                    defpackage.dpj dpjVar18 = dquVarArr13[i42].h;
                                    dquVar = dquVar23;
                                    dpjVar3 = dpjVar18;
                                }
                                if (dquVar != null) {
                                    iB9 += dquVar.b();
                                }
                                int iB10 = iB8 + dquVarArr14[i42].b();
                                int i44 = true != z16 ? 4 : 8;
                                if (dpjVar == null || dpjVar17 == 0 || dpjVar2 == null || dpjVar3 == null) {
                                    dqvVar5 = dqvVar31;
                                } else {
                                    defpackage.dpj dpjVar19 = dpjVar2;
                                    dqvVar5 = dqvVar31;
                                    dpgVar.d(dpjVar, dpjVar17, iB10, 0.5f, dpjVar19, dpjVar3, iB9, i44);
                                }
                                dqvVar28 = dqvVar30;
                            }
                            dqvVar29 = dqvVar5.ar != 8 ? dqvVar5 : dqvVar29;
                            i41 = 8;
                            z16 = z16;
                        }
                        dpgVar2 = dpgVar;
                        defpackage.dqu dquVar24 = dqvVar.ab[i3];
                        defpackage.dqu dquVar25 = dqvVar16.ab[i3].e;
                        defpackage.dqu dquVar26 = dqvVar2.ab[i42];
                        defpackage.dqu dquVar27 = dqvVar17.ab[i42].e;
                        if (dquVar25 != null) {
                            if (dqvVar != dqvVar2) {
                                i7 = 5;
                                dpgVar2.m(dquVar24.h, dquVar25.h, dquVar24.b(), 5);
                            } else {
                                i7 = 5;
                                if (dquVar27 != null) {
                                    i6 = 5;
                                    dpgVar2.d(dquVar24.h, dquVar25.h, dquVar24.b(), 0.5f, dquVar26.h, dquVar27.h, dquVar26.b(), 5);
                                }
                            }
                            i6 = i7;
                        } else {
                            i6 = 5;
                        }
                        if (dquVar27 != null && dqvVar != dqvVar2) {
                            dpgVar2.m(dquVar26.h, dquVar27.h, -dquVar26.b(), i6);
                        }
                    }
                    dqvVar4 = dqvVar3;
                    if ((z2 || z4) && dqvVar4 != null && dqvVar4 != dqvVar2) {
                        i10 = i3 + 1;
                        dquVarArr = dqvVar4.ab;
                        defpackage.dqu dquVar28 = dquVarArr[i3];
                        if (dqvVar2 == null) {
                            dqvVar2 = dqvVar4;
                        }
                        defpackage.dqu[] dquVarArr15 = dqvVar2.ab;
                        dquVar3 = dquVarArr15[i10];
                        dquVar4 = dquVar28.e;
                        if (dquVar4 != null) {
                            dpjVar5 = dquVar4.h;
                        } else {
                            dpjVar5 = null;
                        }
                        dquVar5 = dquVar3.e;
                        if (dquVar5 != null) {
                            dpjVar6 = dquVar5.h;
                        } else {
                            dpjVar6 = null;
                        }
                        if (dqvVar17 == dqvVar2) {
                            dpjVar11 = dpjVar6;
                        } else {
                            dquVar6 = dqvVar17.ab[i10].e;
                            if (dquVar6 != null) {
                                dpjVar6 = dquVar6.h;
                                dpjVar11 = dpjVar6;
                            }
                        }
                        if (dqvVar4 == dqvVar2) {
                            dquVar3 = dquVarArr[i10];
                        }
                        if (dpjVar5 == null && dpjVar11 != null) {
                            dpgVar2.d(dquVar28.h, dpjVar5, dquVar28.b(), 0.5f, dpjVar11, dquVar3.h, dquVarArr15[i10].b(), 5);
                        }
                    }
                } else {
                    int i45 = i3 + 1;
                    defpackage.dqu dquVar29 = dqvVar16.ab[i3];
                    defpackage.dqu dquVar30 = dqvVar17.ab[i45];
                    defpackage.dqu dquVar31 = dquVar29.e;
                    defpackage.dpj dpjVar20 = dquVar31 != null ? dquVar31.h : null;
                    defpackage.dqu dquVar32 = dquVar30.e;
                    defpackage.dpj dpjVar21 = dquVar32 != null ? dquVar32.h : null;
                    defpackage.dqu dquVar33 = dqvVar18.ab[i3];
                    if (dqvVar19 != null) {
                        dquVar30 = dqvVar19.ab[i45];
                    }
                    if (dpjVar20 == null || dpjVar21 == null) {
                        dqvVar = dqvVar18;
                        dqvVar2 = dqvVar19;
                    } else {
                        dqvVar2 = dqvVar19;
                        dqvVar = dqvVar18;
                        dpgVar.d(dquVar33.h, dpjVar20, dquVar33.b(), i == 0 ? dqvVar20.ao : dqvVar20.ap, dpjVar21, dquVar30.h, dquVar30.b(), 7);
                    }
                }
                dpgVar2 = dpgVar;
                dqvVar4 = dqvVar;
                if (z2) {
                    i10 = i3 + 1;
                    dquVarArr = dqvVar4.ab;
                    defpackage.dqu dquVar210 = dquVarArr[i3];
                    if (dqvVar2 == null) {
                        dqvVar2 = dqvVar4;
                    }
                    defpackage.dqu[] dquVarArr16 = dqvVar2.ab;
                    dquVar3 = dquVarArr16[i10];
                    dquVar4 = dquVar210.e;
                    if (dquVar4 != null) {
                        dpjVar5 = dquVar4.h;
                    } else {
                        dpjVar5 = null;
                    }
                    dquVar5 = dquVar3.e;
                    if (dquVar5 != null) {
                        dpjVar6 = dquVar5.h;
                    } else {
                        dpjVar6 = null;
                    }
                    if (dqvVar17 == dqvVar2) {
                        dpjVar11 = dpjVar6;
                    } else {
                        dquVar6 = dqvVar17.ab[i10].e;
                        if (dquVar6 != null) {
                            dpjVar6 = dquVar6.h;
                            dpjVar11 = dpjVar6;
                        }
                    }
                    if (dqvVar4 == dqvVar2) {
                        dquVar3 = dquVarArr[i10];
                    }
                    if (dpjVar5 == null) {
                    }
                } else {
                    i10 = i3 + 1;
                    dquVarArr = dqvVar4.ab;
                    defpackage.dqu dquVar211 = dquVarArr[i3];
                    if (dqvVar2 == null) {
                        dqvVar2 = dqvVar4;
                    }
                    defpackage.dqu[] dquVarArr17 = dqvVar2.ab;
                    dquVar3 = dquVarArr17[i10];
                    dquVar4 = dquVar211.e;
                    if (dquVar4 != null) {
                        dpjVar5 = dquVar4.h;
                    } else {
                        dpjVar5 = null;
                    }
                    dquVar5 = dquVar3.e;
                    if (dquVar5 != null) {
                        dpjVar6 = dquVar5.h;
                    } else {
                        dpjVar6 = null;
                    }
                    if (dqvVar17 == dqvVar2) {
                        dpjVar11 = dpjVar6;
                    } else {
                        dquVar6 = dqvVar17.ab[i10].e;
                        if (dquVar6 != null) {
                            dpjVar6 = dquVar6.h;
                            dpjVar11 = dpjVar6;
                        }
                    }
                    if (dqvVar4 == dqvVar2) {
                        dquVar3 = dquVarArr[i10];
                    }
                    if (dpjVar5 == null) {
                    }
                }
            } else {
                i5 = i15;
                dqtVarArr2 = dqtVarArr3;
            }
            i16 = i4 + 1;
            dqwVar2 = dqwVar;
            i15 = i5;
            dqtVarArr3 = dqtVarArr2;
            i14 = 2;
        }
    }

    public static float i(dqh dqhVar, float f) {
        return dqhVar.l.P(f);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static dqc j(java.lang.String str) {
        dqc dqcVarA = dqc.a(0);
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    return dqc.c(dqc.b);
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    return new dqc(dqc.d);
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    return dqc.c(dqc.c);
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    return new dqc(dqc.b);
                }
                break;
        }
        if (str.endsWith("%")) {
            float f = java.lang.Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
            dqc dqcVar = new dqc(dqc.e);
            dqcVar.i = f;
            dqcVar.m = true;
            dqcVar.h = 0;
            return dqcVar;
        }
        if (!str.contains(":")) {
            return dqcVarA;
        }
        dqc dqcVar2 = new dqc(dqc.f);
        dqcVar2.k = str;
        dqcVar2.f(dqc.c);
        return dqcVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dpu */
    public static void k(int i, dqh dqhVar, dpn dpnVar) throws dpu {
        dpt dptVar;
        java.lang.String strO;
        dpt dptVarH = dpnVar.h(1);
        if ((dptVarH instanceof dpt) && (strO = (dptVar = dptVarH).o("id")) != null) {
            l(i, dqhVar, strO, dptVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[PHI: r10 r11 r12
  0x0078: PHI (r10v2 boolean) = 
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v9 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
 binds: [B:15:0x0045, B:32:0x0093, B:29:0x0080, B:30:0x0082, B:26:0x0077, B:24:0x006d, B:21:0x005d, B:22:0x005f, B:18:0x004d, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r11v2 boolean) = 
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v10 boolean)
  (r11v11 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v12 boolean)
  (r11v1 boolean)
  (r11v13 boolean)
 binds: [B:15:0x0045, B:32:0x0093, B:29:0x0080, B:30:0x0082, B:26:0x0077, B:24:0x006d, B:21:0x005d, B:22:0x005f, B:18:0x004d, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r12v2 float) = 
  (r12v1 float)
  (r12v1 float)
  (r12v1 float)
  (r12v10 float)
  (r12v11 float)
  (r12v1 float)
  (r12v1 float)
  (r12v13 float)
  (r12v1 float)
  (r12v14 float)
 binds: [B:15:0x0045, B:32:0x0093, B:29:0x0080, B:30:0x0082, B:26:0x0077, B:24:0x006d, B:21:0x005d, B:22:0x005f, B:18:0x004d, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0 A[PHI: r11
  0x00c0: PHI (r11v5 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v6 boolean), (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v9 boolean) binds: [B:39:0x00b5, B:52:0x00d9, B:53:0x00db, B:49:0x00cf, B:46:0x00c6, B:42:0x00bd, B:43:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    public static void l(int i, dqh dqhVar, java.lang.String str, dpt dptVar) throws dpu {
        boolean z;
        boolean z2;
        java.util.ArrayList arrayListP = dptVar.p();
        dpx dpxVarB = dqhVar.b(str);
        if (i == 0) {
            dqhVar.g(str, 0);
        } else {
            dqhVar.g(str, 1);
        }
        boolean z3 = !dqhVar.f() || i == 0;
        dqo dqoVar = dpxVarB.c;
        int size = arrayListP.size();
        boolean z4 = false;
        boolean z5 = true;
        float fB = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            java.lang.String str2 = (java.lang.String) arrayListP.get(i2);
            switch (str2) {
                case "percent":
                    dpn dpnVarE = dptVar.e(str2);
                    if (dpnVarE == null) {
                        fB = dptVar.b(str2);
                        z4 = true;
                        z5 = true;
                        z = false;
                        z2 = true;
                    } else {
                        z2 = true;
                        if (dpnVarE.d() > 1) {
                            z = false;
                            java.lang.String strM = dpnVarE.m(0);
                            float fA = dpnVarE.a(1);
                            switch (strM) {
                                case "end":
                                    z5 = !z3;
                                case "left":
                                    fB = fA;
                                    z4 = true;
                                    z5 = true;
                                    break;
                                case "right":
                                    fB = fA;
                                    z5 = false;
                                    break;
                                case "start":
                                    z5 = z3;
                                default:
                                    if (strM.equals("end")) {
                                        z5 = !z3;
                                    }
                                    fB = fA;
                                    break;
                            }
                        } else {
                            z = false;
                        }
                        z4 = true;
                    }
                    break;
                case "end":
                    z5 = !z3;
                    fB = i(dqhVar, dptVar.b(str2));
                case "left":
                    fB = i(dqhVar, dptVar.b(str2));
                    z5 = true;
                case "right":
                    fB = i(dqhVar, dptVar.b(str2));
                    z5 = false;
                case "start":
                    fB = i(dqhVar, dptVar.b(str2));
                    z5 = z3;
                default:
                    z = false;
                    z2 = true;
                    break;
            }
        }
        if (z4) {
            if (z5) {
                dqoVar.c(fB);
                return;
            } else {
                dqoVar.c(1.0f - fB);
                return;
            }
        }
        if (z5) {
            dqoVar.c = dqoVar.a.a(java.lang.Float.valueOf(fB));
            dqoVar.d = -1;
            dqoVar.e = 0.0f;
        } else {
            java.lang.Float fValueOf = java.lang.Float.valueOf(fB);
            dqoVar.c = -1;
            dqoVar.d = dqoVar.a.a(fValueOf);
            dqoVar.e = 0.0f;
        }
    }

    public static final java.lang.String m(defpackage.ctx ctxVar) {
        java.lang.String string;
        java.lang.Object objI = defpackage.dai.I(ctxVar);
        if (objI == null) {
            objI = defpackage.wf.e(ctxVar);
        }
        return (objI == null || (string = objI.toString()) == null) ? "null" : string;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dpu */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static void n(dqh dqhVar, defpackage.ndd nddVar, dpx dpxVar, dpt dptVar, java.lang.String str) throws dpu {
        java.lang.Object obj;
        long j;
        java.lang.Object obj2;
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    java.lang.String strN = dptVar.n(str);
                    if (strN.equals("parent")) {
                        obj = strN;
                        obj = dqh.a;
                    }
                    obj = strN;
                    dpx dpxVarB = dqhVar.b(obj);
                    dpxVar.v(dpxVarB);
                    dpxVar.i(dpxVarB);
                    return;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    java.lang.String strN2 = dptVar.n(str);
                    dpx dpxVarB2 = strN2.equals("parent") ? dqhVar.b(dqh.a) : dqhVar.b(strN2);
                    dpxVar.t(dpxVarB2);
                    dpxVar.l(dpxVarB2);
                    dpxVar.v(dpxVarB2);
                    dpxVar.i(dpxVarB2);
                    return;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    dpt dptVarL = dptVar.l(str);
                    if (dptVarL == null) {
                        return;
                    }
                    java.util.ArrayList arrayListP = dptVarL.p();
                    int size = arrayListP.size();
                    for (int i = 0; i < size; i++) {
                        java.lang.String str2 = (java.lang.String) arrayListP.get(i);
                        dpp dppVarI = dptVarL.i(str2);
                        if (dppVarI instanceof dpr) {
                            float fV = dppVarI.v();
                            if (dpxVar.ai == null) {
                                dpxVar.ai = new java.util.HashMap();
                            }
                            dpxVar.ai.put(str2, java.lang.Float.valueOf(fV));
                        } else if (dppVarI instanceof dpv) {
                            java.lang.String strX = dppVarI.x();
                            if (strX.startsWith("#")) {
                                java.lang.String strSubstring = strX.substring(1);
                                if (strSubstring.length() == 6) {
                                    strSubstring = "FF".concat(java.lang.String.valueOf(strSubstring));
                                }
                                j = java.lang.Long.parseLong(strSubstring, 16);
                            } else {
                                j = -1;
                            }
                            if (j != -1) {
                                dpxVar.ah.put(str2, java.lang.Integer.valueOf((int) j));
                            }
                        }
                    }
                    return;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    dpxVar.z = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    dpxVar.A = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    dpxVar.B = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    dpxVar.C = i(dqhVar, nddVar.I(dptVar.i(str)));
                    return;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    dpxVar.D = i(dqhVar, nddVar.I(dptVar.i(str)));
                    return;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    dpxVar.E = i(dqhVar, nddVar.I(dptVar.i(str)));
                    return;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    dpxVar.ae = t(dptVar, str, dqhVar, dqhVar.l);
                    return;
                }
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    dpt dptVarI = dptVar.i(str);
                    if (dptVarI instanceof dpt) {
                        dpt dptVar2 = dptVarI;
                        dpm dpmVar = new dpm();
                        java.util.ArrayList arrayListP2 = dptVar2.p();
                        int size2 = arrayListP2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            java.lang.String str3 = (java.lang.String) arrayListP2.get(i2);
                            switch (str3.hashCode()) {
                                case -1897525331:
                                    if (str3.equals("stagger")) {
                                        dpmVar.a(600, dptVar2.b(str3));
                                    }
                                    break;
                                case -1310311125:
                                    if (str3.equals("easing")) {
                                        dpmVar.c(603, dptVar2.n(str3));
                                    }
                                    break;
                                case -1285003983:
                                    if (str3.equals("quantize")) {
                                        dpn dpnVarI = dptVar2.i(str3);
                                        if (dpnVarI instanceof dpn) {
                                            dpn dpnVar = dpnVarI;
                                            int iD = dpnVar.d();
                                            if (iD > 0) {
                                                dpmVar.b(610, dpnVar.c(0));
                                                if (iD > 1) {
                                                    dpmVar.c(611, dpnVar.m(1));
                                                    if (iD > 2) {
                                                        dpmVar.a(602, dpnVar.a(2));
                                                    }
                                                }
                                            }
                                        } else {
                                            dpp dppVarI2 = dptVar2.i(str3);
                                            dppVarI2.getClass();
                                            dpmVar.b(610, dppVarI2.w());
                                        }
                                    }
                                    break;
                                case -791482387:
                                    if (str3.equals("pathArc")) {
                                        java.lang.String strN3 = dptVar2.n(str3);
                                        java.lang.String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= 6) {
                                                i3 = -1;
                                            } else if (!strArr[i3].equals(strN3)) {
                                                i3++;
                                            }
                                        }
                                        if (i3 == -1) {
                                            java.lang.System.err.println(defpackage.a.bp(strN3, "0 pathArc = '", "'"));
                                        } else {
                                            dpmVar.b(607, i3);
                                        }
                                    }
                                    break;
                                case -236944793:
                                    if (str3.equals("relativeTo")) {
                                        dpmVar.c(605, dptVar2.n(str3));
                                    }
                                    break;
                            }
                        }
                        dpxVar.aj = dpmVar;
                        return;
                    }
                    return;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    dpxVar.x = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    dpxVar.y = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    dpxVar.G = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    dpxVar.H = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    float fI = nddVar.I(dptVar.i(str));
                    if (dqhVar.f()) {
                        fI = 1.0f - fI;
                    }
                    dpxVar.h = fI;
                    return;
                }
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    dpxVar.g = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    dpxVar.F = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    dpxVar.h = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    dpxVar.i = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    dpxVar.ad = t(dptVar, str, dqhVar, dqhVar.l);
                    return;
                }
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    dpxVar.f = nddVar.I(dptVar.i(str));
                    return;
                }
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    java.lang.String strN4 = dptVar.n(str);
                    if (strN4.equals("parent")) {
                        obj2 = strN4;
                        obj2 = dqh.a;
                    }
                    obj2 = strN4;
                    dpx dpxVarB3 = dqhVar.b(obj2);
                    dpxVar.t(dpxVarB3);
                    dpxVar.l(dpxVarB3);
                    return;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    java.lang.String strN5 = dptVar.n(str);
                    int iHashCode = strN5.hashCode();
                    if (iHashCode == -1901805651) {
                        if (strN5.equals("invisible")) {
                            dpxVar.I = 4;
                            dpxVar.F = 0.0f;
                            return;
                        }
                        return;
                    }
                    if (iHashCode == 3178655) {
                        if (strN5.equals("gone")) {
                            dpxVar.I = 8;
                            return;
                        }
                        return;
                    } else {
                        if (iHashCode == 466743410 && strN5.equals("visible")) {
                            dpxVar.I = 0;
                            return;
                        }
                        return;
                    }
                }
                break;
        }
        p(dqhVar, nddVar, dptVar, dpxVar, str);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dpu */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    public static void o(int i, dqh dqhVar, defpackage.ndd nddVar, dpn dpnVar) throws dpu {
        java.lang.String strX;
        dqp dqpVarC = i == 0 ? dqhVar.c() : dqhVar.d();
        dpn dpnVarH = dpnVar.h(1);
        if (dpnVarH instanceof dpn) {
            dpn dpnVar2 = dpnVarH;
            if (dpnVar2.d() > 0) {
                for (int i2 = 0; i2 < dpnVar2.d(); i2++) {
                    dqpVarC.z(new java.lang.Object[]{dpnVar2.m(i2)});
                }
                if (dpnVar.d() > 2) {
                    dpt dptVarH = dpnVar.h(2);
                    if (dptVarH instanceof dpt) {
                        dpt dptVar = dptVarH;
                        java.util.ArrayList arrayListP = dptVar.p();
                        int size = arrayListP.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            java.lang.String str = (java.lang.String) arrayListP.get(i3);
                            if (str.hashCode() == 109780401 && str.equals("style")) {
                                dpn dpnVarI = dptVar.i(str);
                                if (dpnVarI instanceof dpn) {
                                    dpn dpnVar3 = dpnVarI;
                                    if (dpnVar3.d() > 1) {
                                        strX = dpnVar3.m(0);
                                        ((dqk) dqpVarC).ao = dpnVar3.a(1);
                                    } else {
                                        strX = dpnVarI.x();
                                    }
                                } else {
                                    strX = dpnVarI.x();
                                }
                                int iHashCode = strX.hashCode();
                                if (iHashCode != -995865480) {
                                    if (iHashCode == 1311368264 && strX.equals("spread_inside")) {
                                        ((dqk) dqpVarC).as = dqf.b;
                                    } else {
                                        ((dqk) dqpVarC).as = dqf.a;
                                    }
                                } else if (strX.equals("packed")) {
                                    ((dqk) dqpVarC).as = dqf.c;
                                } else {
                                    ((dqk) dqpVarC).as = dqf.a;
                                }
                            } else {
                                p(dqhVar, nddVar, dptVar, dqpVarC, str);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:113:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:24:0x0091  */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x008e. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void p(dqh dqhVar, defpackage.ndd nddVar, dpt dptVar, dpx dpxVar, java.lang.String str) throws dpu {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zF = dqhVar.f();
        boolean z5 = !zF;
        dpn dpnVarE = dptVar.e(str);
        if (dpnVarE == null || dpnVarE.d() <= 1) {
            java.lang.String strO = dptVar.o(str);
            if (strO != null) {
                dpx dpxVarB = strO.equals("parent") ? dqhVar.b(dqh.a) : dqhVar.b(strO);
                switch (str.hashCode()) {
                    case -1720785339:
                        if (str.equals("baseline")) {
                            dqhVar.e(dpxVar.a);
                            dqhVar.e(dpxVarB.a);
                            dpxVar.h(dpxVarB);
                        }
                        break;
                    case -1383228885:
                        if (str.equals("bottom")) {
                            dpxVar.i(dpxVarB);
                        }
                        break;
                    case 100571:
                        if (str.equals("end")) {
                            if (!zF) {
                                dpxVar.r(dpxVarB);
                            } else {
                                dpxVar.n(dpxVarB);
                            }
                        }
                        break;
                    case 115029:
                        if (str.equals("top")) {
                            dpxVar.v(dpxVarB);
                        }
                        break;
                    case 109757538:
                        if (str.equals("start")) {
                            if (!zF) {
                                dpxVar.n(dpxVarB);
                            } else {
                                dpxVar.r(dpxVarB);
                            }
                        }
                        break;
                }
            }
            return;
        }
        java.lang.String strM = dpnVarE.m(0);
        dpp dppVarJ = dpnVarE.j(1);
        java.lang.String strX = dppVarJ instanceof dpv ? dppVarJ.x() : null;
        float fI = dpnVarE.d() > 2 ? i(dqhVar, nddVar.I(dpnVarE.j(2))) : 0.0f;
        float fI2 = dpnVarE.d() > 3 ? i(dqhVar, nddVar.I(dpnVarE.j(3))) : 0.0f;
        dpx dpxVarB2 = strM.equals("parent") ? dqhVar.b(dqh.a) : dqhVar.b(strM);
        float f = fI2;
        switch (str.hashCode()) {
            case -1720785339:
                z = true;
                if (str.equals("baseline")) {
                    int iHashCode = strX.hashCode();
                    if (iHashCode != -1720785339) {
                        if (iHashCode != -1383228885) {
                            if (iHashCode == 115029 && strX.equals("top")) {
                                dqhVar.e(dpxVar.a);
                                dpxVar.ak = 16;
                                dpxVar.Y = dpxVarB2;
                            }
                        } else if (strX.equals("bottom")) {
                            dqhVar.e(dpxVar.a);
                            dpxVar.ak = 17;
                            dpxVar.Z = dpxVarB2;
                        }
                    } else if (strX.equals("baseline")) {
                        dqhVar.e(dpxVar.a);
                        dqhVar.e(dpxVarB2.a);
                        dpxVar.h(dpxVarB2);
                    }
                }
                z2 = z;
                z3 = false;
                break;
            case -1498085729:
                if (str.equals("circular")) {
                    float fI3 = nddVar.I(dpnVarE.h(1));
                    float fI4 = dpnVarE.d() > 2 ? i(dqhVar, nddVar.I(dpnVarE.j(2))) : 0.0f;
                    dpxVar.aa = dpxVar.c(dpxVarB2);
                    dpxVar.ab = fI3;
                    dpxVar.ac = fI4;
                    dpxVar.ak = 20;
                    z2 = true;
                    z = true;
                } else {
                    z = true;
                    z2 = z;
                }
                z3 = false;
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    int iHashCode2 = strX.hashCode();
                    if (iHashCode2 != -1720785339) {
                        if (iHashCode2 != -1383228885) {
                            if (iHashCode2 == 115029 && strX.equals("top")) {
                                dpxVar.j(dpxVarB2);
                            }
                        } else if (strX.equals("bottom")) {
                            dpxVar.i(dpxVarB2);
                        }
                    } else if (strX.equals("baseline")) {
                        dqhVar.e(dpxVarB2.a);
                        dpxVar.ak = 14;
                        dpxVar.W = dpxVarB2;
                    }
                    z2 = true;
                    z3 = false;
                    z = true;
                }
                z = true;
                z2 = z;
                z3 = false;
                break;
            case 100571:
                if (str.equals("end")) {
                    z2 = zF;
                    z3 = true;
                    z = true;
                }
                z = true;
                z2 = z;
                z3 = false;
                break;
            case 115029:
                if (str.equals("top")) {
                    int iHashCode3 = strX.hashCode();
                    if (iHashCode3 != -1720785339) {
                        if (iHashCode3 != -1383228885) {
                            if (iHashCode3 == 115029 && strX.equals("top")) {
                                dpxVar.v(dpxVarB2);
                            }
                        } else if (strX.equals("bottom")) {
                            dpxVar.u(dpxVarB2);
                        }
                    } else if (strX.equals("baseline")) {
                        dqhVar.e(dpxVarB2.a);
                        dpxVar.ak = 11;
                        dpxVar.T = dpxVarB2;
                    }
                    z2 = true;
                    z3 = false;
                    z = true;
                }
                z = true;
                z2 = z;
                z3 = false;
                break;
            case 3317767:
                if (str.equals("left")) {
                    z2 = true;
                    z3 = true;
                    z = true;
                }
                z = true;
                z2 = z;
                z3 = false;
                break;
            case 108511772:
                if (str.equals("right")) {
                    z2 = false;
                    z3 = true;
                    z = true;
                }
                z = true;
                z2 = z;
                z3 = false;
                break;
            case 109757538:
                if (str.equals("start")) {
                    z2 = z5;
                    z3 = true;
                    z = true;
                }
                z = true;
                z2 = z;
                z3 = false;
                break;
            default:
                z = true;
                z2 = z;
                z3 = false;
                break;
        }
        if (z3) {
            switch (strX.hashCode()) {
                case 100571:
                    if (!strX.equals("end")) {
                        z4 = z;
                    }
                    break;
                case 3317767:
                    strX.equals("left");
                    z4 = z;
                    break;
                case 108511772:
                    if (!strX.equals("right")) {
                        z4 = z;
                    } else {
                        z4 = false;
                    }
                    break;
                case 109757538:
                    if (!strX.equals("start")) {
                        z4 = z;
                    } else {
                        z4 = z5;
                    }
                    break;
                default:
                    z4 = z;
                    break;
            }
            if (z2) {
                if (z4) {
                    dpxVar.n(dpxVarB2);
                } else {
                    dpxVar.ak = 2;
                    dpxVar.K = dpxVarB2;
                }
            } else if (z4) {
                dpxVar.ak = 3;
                dpxVar.L = dpxVarB2;
            } else {
                dpxVar.r(dpxVarB2);
            }
        }
        dpxVar.w(java.lang.Float.valueOf(fI));
        dpxVar.q(java.lang.Float.valueOf(f));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dpu */
    /* JADX WARN: Code duplicated, block: B:110:0x0290  */
    /* JADX WARN: Code duplicated, block: B:138:0x0306  */
    /* JADX WARN: Code duplicated, block: B:149:0x034d  */
    /* JADX WARN: Code duplicated, block: B:167:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:190:0x040f  */
    /* JADX WARN: Code duplicated, block: B:191:0x0413  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:98:0x022e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void q(java.lang.String str, dqh dqhVar, java.lang.String str2, defpackage.ndd nddVar, dpt dptVar) throws dpu {
        java.lang.String strX;
        java.lang.String strM;
        java.lang.String strM2;
        java.lang.Float fValueOf;
        java.lang.Float f;
        java.lang.String strX2;
        java.lang.String strM3;
        java.lang.String strM4;
        float fW;
        float fC;
        float fC2;
        float fC3;
        java.lang.Float fValueOf2;
        java.lang.Float f2;
        float fA;
        float fI;
        float fI2;
        char cCharAt = str.charAt(0);
        dpx dpxVarB = dqhVar.b(str2);
        dql dqlVar = dpxVarB.c;
        if (dqlVar == null || !(dqlVar instanceof dqm)) {
            dpxVarB.g(cCharAt == 'v' ? new dqm(dqhVar, 8) : new dqm(dqhVar, 7));
        }
        dqm dqmVar = dpxVarB.c;
        java.util.ArrayList arrayListP = dptVar.p();
        int size = arrayListP.size();
        for (int i = 0; i < size; i++) {
            java.lang.String str3 = (java.lang.String) arrayListP.get(i);
            switch (str3.hashCode()) {
                case -1254185091:
                    if (str3.equals("hAlign")) {
                        java.lang.String strX3 = dptVar.i(str3).x();
                        int iHashCode = strX3.hashCode();
                        if (iHashCode != 100571) {
                            if (iHashCode == 109757538 && strX3.equals("start")) {
                                dqmVar.aA = 0;
                            } else {
                                dqmVar.aA = 2;
                            }
                        } else if (strX3.equals("end")) {
                            dqmVar.aA = 1;
                        } else {
                            dqmVar.aA = 2;
                        }
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case -1237307863:
                    if (str3.equals("hStyle")) {
                        dpn dpnVarI = dptVar.i(str3);
                        if (dpnVarI instanceof dpn) {
                            dpn dpnVar = dpnVarI;
                            if (dpnVar.d() > 1) {
                                strM = dpnVar.m(0);
                                strX = dpnVar.m(1);
                                strM2 = dpnVar.d() > 2 ? dpnVar.m(2) : "";
                            } else {
                                strX = dpnVarI.x();
                                strM = "";
                                strM2 = strM;
                            }
                        } else {
                            strX = dpnVarI.x();
                            strM = "";
                            strM2 = strM;
                        }
                        if (!strX.equals("")) {
                            dqmVar.aw = dqf.a(strX);
                        }
                        if (!strM.equals("")) {
                            dqmVar.ax = dqf.a(strM);
                        }
                        if (!strM2.equals("")) {
                            dqmVar.ay = dqf.a(strM2);
                        }
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case -1198076529:
                    if (str3.equals("hFlowBias")) {
                        dpn dpnVarI2 = dptVar.i(str3);
                        java.lang.Float fValueOf3 = java.lang.Float.valueOf(0.5f);
                        if (dpnVarI2 instanceof dpn) {
                            dpn dpnVar2 = dpnVarI2;
                            if (dpnVar2.d() > 1) {
                                java.lang.Float fValueOf4 = java.lang.Float.valueOf(dpnVar2.a(0));
                                fValueOf = java.lang.Float.valueOf(dpnVar2.a(1));
                                if (dpnVar2.d() > 2) {
                                    fValueOf3 = java.lang.Float.valueOf(dpnVar2.a(2));
                                }
                                java.lang.Float f3 = fValueOf3;
                                fValueOf3 = fValueOf4;
                                f = f3;
                            } else {
                                fValueOf = java.lang.Float.valueOf(dpnVarI2.v());
                                f = fValueOf3;
                            }
                        } else {
                            fValueOf = java.lang.Float.valueOf(dpnVarI2.v());
                            f = fValueOf3;
                        }
                        ((dpx) dqmVar).h = fValueOf.floatValue();
                        if (fValueOf3.floatValue() != 0.5f) {
                            dqmVar.aL = fValueOf3.floatValue();
                        }
                        if (f.floatValue() != 0.5f) {
                            dqmVar.aM = f.floatValue();
                        }
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case -853376977:
                    if (str3.equals("vAlign")) {
                        java.lang.String strX4 = dptVar.i(str3).x();
                        int iHashCode2 = strX4.hashCode();
                        if (iHashCode2 != -1720785339) {
                            if (iHashCode2 != -1383228885) {
                                if (iHashCode2 == 115029 && strX4.equals("top")) {
                                    dqmVar.az = 0;
                                } else {
                                    dqmVar.az = 2;
                                }
                            } else if (strX4.equals("bottom")) {
                                dqmVar.az = 1;
                            } else {
                                dqmVar.az = 2;
                            }
                        } else if (strX4.equals("baseline")) {
                            dqmVar.az = 3;
                        } else {
                            dqmVar.az = 2;
                        }
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case -836499749:
                    if (str3.equals("vStyle")) {
                        dpn dpnVarI3 = dptVar.i(str3);
                        if (dpnVarI3 instanceof dpn) {
                            dpn dpnVar3 = dpnVarI3;
                            if (dpnVar3.d() > 1) {
                                strM3 = dpnVar3.m(0);
                                strX2 = dpnVar3.m(1);
                                strM4 = dpnVar3.d() > 2 ? dpnVar3.m(2) : "";
                            } else {
                                strX2 = dpnVarI3.x();
                                strM3 = "";
                                strM4 = strM3;
                            }
                        } else {
                            strX2 = dpnVarI3.x();
                            strM3 = "";
                            strM4 = strM3;
                        }
                        if (!strX2.equals("")) {
                            dqmVar.at = dqf.a(strX2);
                        }
                        if (!strM3.equals("")) {
                            dqmVar.au = dqf.a(strM3);
                        }
                        if (!strM4.equals("")) {
                            dqmVar.av = dqf.a(strM4);
                        }
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case -806339567:
                    if (str3.equals("padding")) {
                        dpn dpnVarI4 = dptVar.i(str3);
                        if (dpnVarI4 instanceof dpn) {
                            dpn dpnVar4 = dpnVarI4;
                            if (dpnVar4.d() > 1) {
                                fW = dpnVar4.c(0);
                                fC2 = dpnVar4.c(1);
                                if (dpnVar4.d() > 2) {
                                    fC3 = dpnVar4.c(2);
                                    try {
                                        fC = dpnVar4.c(3);
                                    } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                                        fC = 0.0f;
                                    }
                                } else {
                                    fC3 = fW;
                                    fC = fC2;
                                }
                            } else {
                                fW = dpnVarI4.w();
                                fC = fW;
                                fC2 = fC;
                                fC3 = fC2;
                            }
                        } else {
                            fW = dpnVarI4.w();
                            fC = fW;
                            fC2 = fC;
                            fC3 = fC2;
                        }
                        dqmVar.aD = java.lang.Math.round(i(dqhVar, fW));
                        dqmVar.aF = java.lang.Math.round(i(dqhVar, fC2));
                        dqmVar.aE = java.lang.Math.round(i(dqhVar, fC3));
                        dqmVar.aG = java.lang.Math.round(i(dqhVar, fC));
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case -732635235:
                    if (str3.equals("vFlowBias")) {
                        dpn dpnVarI5 = dptVar.i(str3);
                        java.lang.Float fValueOf5 = java.lang.Float.valueOf(0.5f);
                        if (dpnVarI5 instanceof dpn) {
                            dpn dpnVar5 = dpnVarI5;
                            if (dpnVar5.d() > 1) {
                                java.lang.Float fValueOf6 = java.lang.Float.valueOf(dpnVar5.a(0));
                                fValueOf2 = java.lang.Float.valueOf(dpnVar5.a(1));
                                if (dpnVar5.d() > 2) {
                                    fValueOf5 = java.lang.Float.valueOf(dpnVar5.a(2));
                                }
                                java.lang.Float f4 = fValueOf5;
                                fValueOf5 = fValueOf6;
                                f2 = f4;
                            } else {
                                fValueOf2 = java.lang.Float.valueOf(dpnVarI5.v());
                                f2 = fValueOf5;
                            }
                        } else {
                            fValueOf2 = java.lang.Float.valueOf(dpnVarI5.v());
                            f2 = fValueOf5;
                        }
                        try {
                            ((dpx) dqmVar).i = fValueOf2.floatValue();
                            if (fValueOf5.floatValue() != 0.5f) {
                                dqmVar.aJ = fValueOf5.floatValue();
                            }
                            if (f2.floatValue() != 0.5f) {
                                dqmVar.aK = f2.floatValue();
                            }
                        } catch (java.lang.NumberFormatException unused2) {
                        }
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case -567445985:
                    if (str3.equals("contains")) {
                        dpn dpnVarI6 = dptVar.i(str3);
                        if (dpnVarI6 instanceof dpn) {
                            dpn dpnVar6 = dpnVarI6;
                            if (dpnVar6.d() > 0) {
                                for (int i2 = 0; i2 < dpnVar6.d(); i2++) {
                                    dpn dpnVarH = dpnVar6.h(i2);
                                    if (dpnVarH instanceof dpn) {
                                        dpn dpnVar7 = dpnVarH;
                                        if (dpnVar7.d() > 0) {
                                            java.lang.String strX5 = dpnVar7.h(0).x();
                                            int iD = dpnVar7.d();
                                            if (iD == 2) {
                                                fA = dpnVar7.a(1);
                                                fI = Float.NaN;
                                                fI2 = Float.NaN;
                                            } else if (iD == 3) {
                                                fA = dpnVar7.a(1);
                                                fI = i(dqhVar, dpnVar7.a(2));
                                                fI2 = fI;
                                            } else if (iD != 4) {
                                                fI = Float.NaN;
                                                fI2 = Float.NaN;
                                                fA = Float.NaN;
                                            } else {
                                                fA = dpnVar7.a(1);
                                                fI2 = i(dqhVar, dpnVar7.a(2));
                                                fI = i(dqhVar, dpnVar7.a(3));
                                            }
                                            dqmVar.A(strX5, fA, fI2, fI);
                                        }
                                    } else {
                                        dqmVar.z(new java.lang.Object[]{dpnVarH.x()});
                                    }
                                }
                                break;
                            }
                        }
                        java.lang.System.err.println(str2 + " contains should be an array \"" + dpnVarI6.x() + "\"");
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case -488900360:
                    if (str3.equals("maxElement")) {
                        dqmVar.aH = dptVar.i(str3).w();
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case 3169614:
                    if (str3.equals("hGap")) {
                        dqmVar.aC = dptVar.i(str3).w();
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case 3575610:
                    if (str3.equals("type")) {
                        if (dptVar.i(str3).x().equals("hFlow")) {
                            dqmVar.aI = 0;
                        } else {
                            dqmVar.aI = 1;
                        }
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case 3586688:
                    if (str3.equals("vGap")) {
                        dqmVar.aB = dptVar.i(str3).w();
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                case 3657802:
                    if (str3.equals("wrap")) {
                        java.lang.String strX6 = dptVar.i(str3).x();
                        java.util.Map map = dqg.e;
                        dqmVar.as = map.containsKey(strX6) ? ((java.lang.Integer) map.get(strX6)).intValue() : -1;
                    } else {
                        n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    }
                    break;
                default:
                    n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dpu */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x0208  */
    /* JADX WARN: Code duplicated, block: B:117:0x024d  */
    public static void r(java.lang.String str, dqh dqhVar, java.lang.String str2, defpackage.ndd nddVar, dpt dptVar) throws dpu {
        float fW;
        float fC;
        float fC2;
        float fC3;
        int iW;
        int i;
        dpx dpxVarB = dqhVar.b(str2);
        dql dqlVar = dpxVarB.c;
        int i2 = 10;
        if (dqlVar == null || !(dqlVar instanceof dqn)) {
            dpxVarB.g(new dqn(dqhVar, str.charAt(0) == 'r' ? 10 : str.charAt(0) == 'c' ? 11 : 9));
        }
        dqn dqnVar = dpxVarB.c;
        java.util.ArrayList arrayListP = dptVar.p();
        int size = arrayListP.size();
        int i3 = 0;
        while (i3 < size) {
            java.lang.String str3 = (java.lang.String) arrayListP.get(i3);
            switch (str3) {
                case "orientation":
                    dqnVar.as = dptVar.i(str3).w();
                    break;
                case "padding":
                    dpn dpnVarI = dptVar.i(str3);
                    if (dpnVarI instanceof dpn) {
                        dpn dpnVar = dpnVarI;
                        if (dpnVar.d() > 1) {
                            fW = dpnVar.c(0);
                            fC2 = dpnVar.c(1);
                            if (dpnVar.d() > 2) {
                                fC3 = dpnVar.c(2);
                                try {
                                    fC = dpnVar.c(3);
                                } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                                    fC = 0.0f;
                                }
                            } else {
                                fC3 = fW;
                                fC = fC2;
                            }
                        } else {
                            fW = dpnVarI.w();
                            fC = fW;
                            fC2 = fC;
                            fC3 = fC2;
                        }
                    } else {
                        fW = dpnVarI.w();
                        fC = fW;
                        fC2 = fC;
                        fC3 = fC2;
                    }
                    dqnVar.ao = java.lang.Math.round(i(dqhVar, fW));
                    dqnVar.aq = java.lang.Math.round(i(dqhVar, fC2));
                    dqnVar.ap = java.lang.Math.round(i(dqhVar, fC3));
                    dqnVar.ar = java.lang.Math.round(i(dqhVar, fC));
                    break;
                case "contains":
                    dpn dpnVarE = dptVar.e(str3);
                    if (dpnVarE != null) {
                        for (int i4 = 0; i4 < dpnVarE.d(); i4++) {
                            dqnVar.z(new java.lang.Object[]{dqhVar.b(dpnVarE.h(i4).x())});
                        }
                    }
                    break;
                case "hGap":
                    dqnVar.av = i(dqhVar, dptVar.i(str3).v());
                    break;
                case "rows":
                    int iW2 = dptVar.i(str3).w();
                    if (iW2 > 0 && ((dqd) dqnVar).an != 11) {
                        dqnVar.at = iW2;
                    }
                    break;
                case "vGap":
                    dqnVar.aw = i(dqhVar, dptVar.i(str3).v());
                    break;
                case "flags":
                    java.lang.String strX = "";
                    try {
                        dpp dppVarI = dptVar.i(str3);
                        if (dppVarI instanceof dpr) {
                            iW = dppVarI.w();
                        } else {
                            strX = dppVarI.x();
                            iW = 0;
                        }
                    } catch (java.lang.Exception e) {
                        java.lang.System.err.println("Error parsing grid flags ".concat(e.toString()));
                    }
                    if (strX.isEmpty()) {
                        dqnVar.aB = iW;
                    } else if (!strX.isEmpty()) {
                        java.lang.String[] strArrSplit = strX.split("\\|");
                        dqnVar.aB = 0;
                        for (java.lang.String str4 : strArrSplit) {
                            java.lang.String lowerCase = str4.toLowerCase();
                            int iHashCode = lowerCase.hashCode();
                            if (iHashCode != -578405641) {
                                if (iHashCode == 2144989229 && lowerCase.equals("spansrespectwidgetorder")) {
                                    i = dqnVar.aB | 2;
                                    dqnVar.aB = i;
                                }
                            } else if (lowerCase.equals("subgridbycolrow")) {
                                i = dqnVar.aB | 1;
                                dqnVar.aB = i;
                            }
                        }
                    }
                    break;
                case "skips":
                    java.lang.String strX2 = dptVar.i(str3).x();
                    if (strX2.contains(":")) {
                        dqnVar.aA = strX2;
                    }
                    break;
                case "spans":
                    java.lang.String strX3 = dptVar.i(str3).x();
                    if (strX3.contains(":")) {
                        dqnVar.az = strX3;
                    }
                    break;
                case "rowWeights":
                    java.lang.String strX4 = dptVar.i(str3).x();
                    if (strX4.contains(",")) {
                        dqnVar.ax = strX4;
                    }
                    break;
                case "columns":
                    int iW3 = dptVar.i(str3).w();
                    if (iW3 > 0 && ((dqd) dqnVar).an != i2) {
                        dqnVar.au = iW3;
                    }
                    break;
                case "columnWeights":
                    java.lang.String strX5 = dptVar.i(str3).x();
                    if (strX5.contains(",")) {
                        dqnVar.ay = strX5;
                    }
                    break;
                default:
                    n(dqhVar, nddVar, dqhVar.b(str2), dptVar, str3);
                    break;
            }
            i3++;
            i2 = 10;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: dpu */
    public static void s(dqh dqhVar, defpackage.ndd nddVar, java.lang.String str, dpt dptVar) throws dpu {
        dpx dpxVarB = dqhVar.b(str);
        if (dpxVarB.ad == null) {
            dpxVarB.ad = new dqc(dqc.b);
        }
        if (dpxVarB.ae == null) {
            dpxVarB.ae = new dqc(dqc.b);
        }
        java.util.ArrayList arrayListP = dptVar.p();
        int size = arrayListP.size();
        for (int i = 0; i < size; i++) {
            n(dqhVar, nddVar, dpxVarB, dptVar, (java.lang.String) arrayListP.get(i));
        }
    }

    static dqc t(dpt dptVar, java.lang.String str, dqh dqhVar, ajnd ajndVar) throws dpu {
        dpt dptVarI = dptVar.i(str);
        boolean z = dptVarI instanceof dpv;
        dqc dqcVarA = dqc.a(0);
        if (z) {
            return j(dptVarI.x());
        }
        if (dptVarI instanceof dpr) {
            return dqc.a(dqhVar.a(java.lang.Float.valueOf(ajndVar.P(dptVar.b(str)))));
        }
        if (dptVarI instanceof dpt) {
            dpt dptVar2 = dptVarI;
            java.lang.String strO = dptVar2.o("value");
            if (strO != null) {
                dqcVarA = j(strO);
            }
            dpr dprVarK = dptVar2.k("min");
            if (dprVarK != null) {
                if (dprVarK instanceof dpr) {
                    dqcVarA.e(dqhVar.a(java.lang.Float.valueOf(ajndVar.P(dprVarK.v()))));
                } else if (dprVarK instanceof dpv) {
                    dqcVarA.g = -2;
                }
            }
            dpr dprVarK2 = dptVar2.k("max");
            if (dprVarK2 != null) {
                if (dprVarK2 instanceof dpr) {
                    int iA = dqhVar.a(java.lang.Float.valueOf(ajndVar.P(dprVarK2.v())));
                    if (dqcVarA.h >= 0) {
                        dqcVarA.h = iA;
                        return dqcVarA;
                    }
                } else if (dprVarK2 instanceof dpv) {
                    java.lang.Object obj = dqc.b;
                    if (dqcVarA.m) {
                        dqcVarA.l = obj;
                        dqcVarA.h = Integer.MAX_VALUE;
                    }
                }
            }
        }
        return dqcVarA;
    }
}
