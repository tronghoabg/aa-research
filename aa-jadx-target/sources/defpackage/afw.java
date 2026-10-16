package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afw {
    public static final void A(defpackage.cgf cgfVar, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1162737955);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C("") ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.cgf cgfVarA = cgfVar.a(new defpackage.chi(affcVar));
            int i4 = i2 & 112;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (i4 == 32 || objS == defpackage.bvd.a) {
                objS = new defpackage.act(7);
                bwcVar.ad(objS);
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dea.a;
            defpackage.asq.A(cgfVarA.a(new defpackage.ddo(false, (defpackage.affc) objS)), bveVarC);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(cgfVar, affcVar, i, 3);
        }
    }

    public static final defpackage.ajl B(float f, long j) {
        return new defpackage.ajl(f, new defpackage.clf(j));
    }

    public static final long C(long j, float f) {
        float fMax = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = java.lang.Math.max(0.0f, java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) java.lang.Float.floatToRawIntBits(fMax)) << 32) | (((long) java.lang.Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final defpackage.cgf D(defpackage.cgf cgfVar, float f, long j, defpackage.cld cldVar) {
        return cgfVar.a(new defpackage.ajk(f, new defpackage.clf(j), cldVar));
    }

    public static final defpackage.cgf E(defpackage.cgf cgfVar, long j, defpackage.cld cldVar) {
        return cgfVar.a(new defpackage.ajc(j, cldVar));
    }

    public static final void G(defpackage.blw blwVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(2080741862);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(blwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            H(blwVar, affgVar, bveVarC, i2 & 126);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(blwVar, affgVar, i, 8);
        }
    }

    public static final void H(defpackage.blw blwVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1533506138);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(blwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            bveVarC.v(-885604480);
            defpackage.axd.Z(!blwVar.v() ? defpackage.cgf.e : new defpackage.bhg(new defpackage.ber(blwVar, (defpackage.afdk) null, 3)).a(new defpackage.bhl(blwVar.w, new defpackage.blm(blwVar, (defpackage.afdk) null, 0), new defpackage.bln(blwVar, (defpackage.afdk) null, 0), new defpackage.bjm(blwVar, 8))), affgVar, bveVarC, i2 & 112);
            ((defpackage.bwc) bveVarC).Y(false);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(blwVar, affgVar, i, 7);
        }
    }

    public static final java.util.List I(java.util.List list, defpackage.afer aferVar) {
        int iB;
        int iA;
        java.lang.Object bfdVar;
        if (!((java.lang.Boolean) aferVar.invoke()).booleanValue()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            defpackage.ctx ctxVar = (defpackage.ctx) list.get(i);
            java.lang.Object objG = ctxVar.g();
            objG.getClass();
            defpackage.cdz cdzVar = ((defpackage.bfn) objG).a;
            defpackage.dga dgaVarA = ((defpackage.bfk) cdzVar.b).a();
            if (dgaVarA == null) {
                bfdVar = new defpackage.acm(17);
            } else {
                defpackage.dfa dfaVarD = defpackage.bfk.d((defpackage.dfa) cdzVar.a, dgaVarA);
                if (dfaVarD == null) {
                    bfdVar = new defpackage.acm(18);
                } else {
                    defpackage.dlx dlxVarI = defpackage.dlv.i(dgaVarA.r(dfaVarD.b, dfaVarD.c).b());
                    iB = dlxVarI.b();
                    iA = dlxVarI.a();
                    bfdVar = new defpackage.bfd(dlxVarI, 3);
                }
                arrayList.add(new defpackage.afau(ctxVar.v(defpackage.dln.l(iB, iB, iA, iA)), bfdVar));
            }
            iB = 0;
            iA = 0;
            arrayList.add(new defpackage.afau(ctxVar.v(defpackage.dln.l(iB, iB, iA, iA)), bfdVar));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011a  */
    /* JADX WARN: Code duplicated, block: B:104:0x011e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0129  */
    /* JADX WARN: Code duplicated, block: B:110:0x0131  */
    /* JADX WARN: Code duplicated, block: B:111:0x0134  */
    /* JADX WARN: Code duplicated, block: B:115:0x0140  */
    /* JADX WARN: Code duplicated, block: B:116:0x0142  */
    /* JADX WARN: Code duplicated, block: B:119:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0150  */
    /* JADX WARN: Code duplicated, block: B:121:0x0154  */
    /* JADX WARN: Code duplicated, block: B:123:0x0157  */
    /* JADX WARN: Code duplicated, block: B:124:0x015b  */
    /* JADX WARN: Code duplicated, block: B:126:0x015e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0161  */
    /* JADX WARN: Code duplicated, block: B:130:0x016b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0170  */
    /* JADX WARN: Code duplicated, block: B:133:0x0173  */
    /* JADX WARN: Code duplicated, block: B:134:0x0175  */
    /* JADX WARN: Code duplicated, block: B:137:0x0184  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:141:0x01be  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:146:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:148:0x020a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0229  */
    /* JADX WARN: Code duplicated, block: B:152:0x0249  */
    /* JADX WARN: Code duplicated, block: B:155:0x0294  */
    /* JADX WARN: Code duplicated, block: B:156:0x0298  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:161:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00da  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(final java.lang.String str, defpackage.cgf cgfVar, defpackage.dgd dgdVar, int i, boolean z, int i2, int i3, defpackage.bve bveVar, final int i4, final int i5) {
        int i6;
        defpackage.cgf cgfVar2;
        int i7;
        defpackage.dgd dgdVar2;
        int i8;
        int i9;
        int i10;
        int i11;
        char c;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean zE;
        int i22;
        boolean z3;
        final boolean z4;
        final int i23;
        final defpackage.cgf cgfVar3;
        final defpackage.dgd dgdVar3;
        final int i24;
        final int i25;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        defpackage.dgd dgdVar4;
        int i26;
        boolean z5;
        int i27;
        defpackage.blh blhVar;
        defpackage.bjb bjbVar;
        boolean z6;
        defpackage.bvm bvmVar;
        defpackage.wde wdeVar;
        defpackage.dgd dgdVar5;
        boolean z7;
        defpackage.cgf cgfVar5;
        defpackage.cgf cgfVarAj;
        defpackage.bwc bwcVar;
        defpackage.afer aferVar;
        long j;
        boolean zE2;
        defpackage.bwc bwcVar2;
        java.lang.Object objS;
        long jLongValue;
        boolean zB;
        java.lang.Object objS2;
        int i28 = i4 & 6;
        defpackage.bve bveVarC = bveVar.c(-1040751001);
        if (i28 == 0) {
            i6 = (true != bveVarC.C(str) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        int i29 = i5 & 2;
        if (i29 == 0) {
            if ((i4 & 48) == 0) {
                cgfVar2 = cgfVar;
                i6 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i7 = i5 & 4;
            if (i7 != 0) {
                if ((i4 & 384) == 0) {
                    dgdVar2 = dgdVar;
                    if (true != bveVarC.C(dgdVar2)) {
                        i8 = 128;
                    } else {
                        i8 = 256;
                    }
                    i6 |= i8;
                }
                if ((i5 & 8) != 0) {
                    i6 |= 3072;
                } else if ((i4 & 3072) == 0) {
                    if (true != bveVarC.E(null)) {
                        i9 = 1024;
                    } else {
                        i9 = 2048;
                    }
                    i6 |= i9;
                }
                i10 = i5 & 16;
                if (i10 != 0) {
                    if ((i4 & 24576) == 0) {
                        i11 = i;
                        c = ' ';
                        if (true != bveVarC.A(i11)) {
                            i12 = 8192;
                        } else {
                            i12 = 16384;
                        }
                        i6 |= i12;
                    }
                    i13 = i5 & 32;
                    if (i13 != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (i13 != 0) {
                        i6 |= 196608;
                    } else if ((i4 & 196608) == 0) {
                        if (true != bveVarC.D(z)) {
                            i14 = 65536;
                        } else {
                            i14 = 131072;
                        }
                        i6 |= i14;
                    }
                    i15 = i5 & 64;
                    if (i15 != 0) {
                        i16 = i2;
                        if ((i4 & 1572864) == 0) {
                            i17 = 0;
                            if (true != bveVarC.A(i16)) {
                                i18 = 524288;
                            } else {
                                i18 = 1048576;
                            }
                            i6 |= i18;
                        }
                        i19 = i5 & 128;
                        if (i19 != 0) {
                            i6 |= 12582912;
                        } else if ((i4 & 12582912) == 0) {
                            int i30 = i6;
                            if (true != bveVarC.A(i3)) {
                                i20 = 4194304;
                            } else {
                                i20 = 8388608;
                            }
                            i6 = i30 | i20;
                        }
                        if ((i5 & 256) != 0) {
                            i6 |= 100663296;
                        } else if ((i4 & 100663296) == 0) {
                            if (true != bveVarC.E(null)) {
                                i21 = 33554432;
                            } else {
                                i21 = 67108864;
                            }
                            i6 |= i21;
                        }
                        if ((i5 & 512) != 0) {
                            i6 |= 805306368;
                        } else if ((i4 & 805306368) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zE = bveVarC.C(null);
                            } else {
                                zE = bveVarC.E(null);
                            }
                            if (true != zE) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i6 |= i22;
                        }
                        if ((306783379 & i6) != 306783378) {
                            z3 = 1;
                        } else {
                            z3 = i17;
                        }
                        if (bveVarC.I(z3, i6 & 1)) {
                            if (i29 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                            } else {
                                cgfVar4 = cgfVar2;
                            }
                            if (i7 != 0) {
                                dgdVar4 = defpackage.dgd.a;
                            } else {
                                dgdVar4 = dgdVar2;
                            }
                            if (i10 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i11;
                            }
                            z5 = (!z2) | z;
                            if (i15 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i16;
                            }
                            if (i19 != 0) {
                                i23 = 1;
                            } else {
                                i23 = i3;
                            }
                            defpackage.asq.ae(i23, i27);
                            blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                            if (blhVar != null) {
                                bveVarC.v(356427477);
                                j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                                java.lang.Object[] objArr = new java.lang.Object[1];
                                objArr[i17] = blhVar;
                                defpackage.cdz cdzVar = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                                zE2 = bveVarC.E(blhVar);
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS = bwcVar2.S();
                                if (zE2 || objS == defpackage.bvd.a) {
                                    objS = new defpackage.bav(blhVar, 12);
                                    bwcVar2.ad(objS);
                                }
                                jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr, cdzVar, (defpackage.afer) objS, bveVarC, i17)).longValue();
                                zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                                objS2 = bwcVar2.S();
                                if (zB || objS2 == defpackage.bvd.a) {
                                    objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                                    bwcVar2.ad(objS2);
                                }
                                z6 = false;
                                bwcVar2.Y(false);
                                bjbVar = (defpackage.bjb) objS2;
                            } else {
                                boolean z8 = i17;
                                bveVarC.v(357055103);
                                ((defpackage.bwc) bveVarC).Y(z8);
                                bjbVar = null;
                                z6 = z8;
                            }
                            bvmVar = defpackage.dbl.f;
                            wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                            defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                            if (bjbVar == null) {
                                bveVarC.v(358076243);
                                ((defpackage.bwc) bveVarC).Y(z6);
                                dgdVar5 = dgdVar4;
                                z7 = z5;
                                cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                                cgfVar5 = cgfVar4;
                            } else {
                                dgdVar5 = dgdVar4;
                                z7 = z5;
                                bveVarC.v(357432497);
                                cgfVar5 = cgfVar4;
                                cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                                ((defpackage.bwc) bveVarC).Y(false);
                            }
                            defpackage.bdx bdxVar = defpackage.bdx.a;
                            bwcVar = (defpackage.bwc) bveVarC;
                            long j2 = bwcVar.u;
                            long j3 = j2 ^ (j2 >>> c);
                            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarAj);
                            defpackage.cdd cddVarAh = bwcVar.ah();
                            aferVar = defpackage.cwl.a;
                            bveVarC.w();
                            if (bwcVar.t) {
                                bveVarC.j(aferVar);
                            } else {
                                bveVarC.y();
                            }
                            defpackage.byw.c(bveVarC, bdxVar, defpackage.cwl.e);
                            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
                            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
                            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j3), defpackage.cwl.f);
                            bwcVar.Y(true);
                            cgfVar3 = cgfVar5;
                            dgdVar3 = dgdVar5;
                            i25 = i26;
                            z4 = z7;
                            i24 = i27;
                        } else {
                            bveVarC.s();
                            z4 = z;
                            i23 = i3;
                            cgfVar3 = cgfVar2;
                            dgdVar3 = dgdVar2;
                            i24 = i16;
                            i25 = i11;
                        }
                        bxlVarJ = bveVarC.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new defpackage.affg() { // from class: bdf
                                @Override // defpackage.affg
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                                    ((java.lang.Integer) obj2).intValue();
                                    java.lang.String str2 = str;
                                    defpackage.cgf cgfVar6 = cgfVar3;
                                    defpackage.dgd dgdVar6 = dgdVar3;
                                    int i31 = i4 | 1;
                                    int i32 = 306783378 & i31;
                                    int i33 = 613566756 & i31;
                                    defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i31 & (-920350135)) | i32 | (i33 >> 1) | ((i32 + i32) & i33), i5);
                                    return defpackage.afbk.a;
                                }
                            };
                        }
                    }
                    i6 |= 1572864;
                    i16 = i2;
                    i17 = 0;
                    i19 = i5 & 128;
                    if (i19 != 0) {
                        i6 |= 12582912;
                    } else if ((i4 & 12582912) == 0) {
                        int i31 = i6;
                        if (true != bveVarC.A(i3)) {
                            i20 = 4194304;
                        } else {
                            i20 = 8388608;
                        }
                        i6 = i31 | i20;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if (true != bveVarC.E(null)) {
                            i21 = 33554432;
                        } else {
                            i21 = 67108864;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zE = bveVarC.C(null);
                        } else {
                            zE = bveVarC.E(null);
                        }
                        if (true != zE) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i6 |= i22;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i17;
                    }
                    if (bveVarC.I(z3, i6 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i7 != 0) {
                            dgdVar4 = defpackage.dgd.a;
                        } else {
                            dgdVar4 = dgdVar2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i11;
                        }
                        z5 = (!z2) | z;
                        if (i15 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i16;
                        }
                        if (i19 != 0) {
                            i23 = 1;
                        } else {
                            i23 = i3;
                        }
                        defpackage.asq.ae(i23, i27);
                        blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                        if (blhVar != null) {
                            bveVarC.v(356427477);
                            j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            objArr2[i17] = blhVar;
                            defpackage.cdz cdzVar2 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                            zE2 = bveVarC.E(blhVar);
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS = bwcVar2.S();
                            if (zE2) {
                                objS = new defpackage.bav(blhVar, 12);
                                bwcVar2.ad(objS);
                            } else {
                                objS = new defpackage.bav(blhVar, 12);
                                bwcVar2.ad(objS);
                            }
                            jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr2, cdzVar2, (defpackage.afer) objS, bveVarC, i17)).longValue();
                            zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                            objS2 = bwcVar2.S();
                            if (zB) {
                                objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                                bwcVar2.ad(objS2);
                            } else {
                                objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                                bwcVar2.ad(objS2);
                            }
                            z6 = false;
                            bwcVar2.Y(false);
                            bjbVar = (defpackage.bjb) objS2;
                        } else {
                            boolean z9 = i17;
                            bveVarC.v(357055103);
                            ((defpackage.bwc) bveVarC).Y(z9);
                            bjbVar = null;
                            z6 = z9;
                        }
                        bvmVar = defpackage.dbl.f;
                        wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                        defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                        if (bjbVar == null) {
                            bveVarC.v(358076243);
                            ((defpackage.bwc) bveVarC).Y(z6);
                            dgdVar5 = dgdVar4;
                            z7 = z5;
                            cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                            cgfVar5 = cgfVar4;
                        } else {
                            dgdVar5 = dgdVar4;
                            z7 = z5;
                            bveVarC.v(357432497);
                            cgfVar5 = cgfVar4;
                            cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                            ((defpackage.bwc) bveVarC).Y(false);
                        }
                        defpackage.bdx bdxVar2 = defpackage.bdx.a;
                        bwcVar = (defpackage.bwc) bveVarC;
                        long j4 = bwcVar.u;
                        long j5 = j4 ^ (j4 >>> c);
                        defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarAj);
                        defpackage.cdd cddVarAh2 = bwcVar.ah();
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, bdxVar2, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh2, defpackage.cwl.d);
                        bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                        defpackage.byw.c(bveVarC, cgfVarN2, defpackage.cwl.c);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j5), defpackage.cwl.f);
                        bwcVar.Y(true);
                        cgfVar3 = cgfVar5;
                        dgdVar3 = dgdVar5;
                        i25 = i26;
                        z4 = z7;
                        i24 = i27;
                    } else {
                        bveVarC.s();
                        z4 = z;
                        i23 = i3;
                        cgfVar3 = cgfVar2;
                        dgdVar3 = dgdVar2;
                        i24 = i16;
                        i25 = i11;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: bdf
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                java.lang.String str2 = str;
                                defpackage.cgf cgfVar6 = cgfVar3;
                                defpackage.dgd dgdVar6 = dgdVar3;
                                int i32 = i4 | 1;
                                int i33 = 306783378 & i32;
                                int i34 = 613566756 & i32;
                                defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i32 & (-920350135)) | i33 | (i34 >> 1) | ((i33 + i33) & i34), i5);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i6 |= 24576;
                i11 = i;
                c = ' ';
                i13 = i5 & 32;
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i13 != 0) {
                    i6 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (true != bveVarC.D(z)) {
                        i14 = 65536;
                    } else {
                        i14 = 131072;
                    }
                    i6 |= i14;
                }
                i15 = i5 & 64;
                if (i15 != 0) {
                    i16 = i2;
                    if ((i4 & 1572864) == 0) {
                        i17 = 0;
                        if (true != bveVarC.A(i16)) {
                            i18 = 524288;
                        } else {
                            i18 = 1048576;
                        }
                        i6 |= i18;
                    }
                    i19 = i5 & 128;
                    if (i19 != 0) {
                        i6 |= 12582912;
                    } else if ((i4 & 12582912) == 0) {
                        int i32 = i6;
                        if (true != bveVarC.A(i3)) {
                            i20 = 4194304;
                        } else {
                            i20 = 8388608;
                        }
                        i6 = i32 | i20;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if (true != bveVarC.E(null)) {
                            i21 = 33554432;
                        } else {
                            i21 = 67108864;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zE = bveVarC.C(null);
                        } else {
                            zE = bveVarC.E(null);
                        }
                        if (true != zE) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i6 |= i22;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i17;
                    }
                    if (bveVarC.I(z3, i6 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i7 != 0) {
                            dgdVar4 = defpackage.dgd.a;
                        } else {
                            dgdVar4 = dgdVar2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i11;
                        }
                        z5 = (!z2) | z;
                        if (i15 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i16;
                        }
                        if (i19 != 0) {
                            i23 = 1;
                        } else {
                            i23 = i3;
                        }
                        defpackage.asq.ae(i23, i27);
                        blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                        if (blhVar != null) {
                            bveVarC.v(356427477);
                            j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            objArr3[i17] = blhVar;
                            defpackage.cdz cdzVar3 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                            zE2 = bveVarC.E(blhVar);
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS = bwcVar2.S();
                            if (zE2) {
                                objS = new defpackage.bav(blhVar, 12);
                                bwcVar2.ad(objS);
                            } else {
                                objS = new defpackage.bav(blhVar, 12);
                                bwcVar2.ad(objS);
                            }
                            jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr3, cdzVar3, (defpackage.afer) objS, bveVarC, i17)).longValue();
                            zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                            objS2 = bwcVar2.S();
                            if (zB) {
                                objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                                bwcVar2.ad(objS2);
                            } else {
                                objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                                bwcVar2.ad(objS2);
                            }
                            z6 = false;
                            bwcVar2.Y(false);
                            bjbVar = (defpackage.bjb) objS2;
                        } else {
                            boolean z10 = i17;
                            bveVarC.v(357055103);
                            ((defpackage.bwc) bveVarC).Y(z10);
                            bjbVar = null;
                            z6 = z10;
                        }
                        bvmVar = defpackage.dbl.f;
                        wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                        defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                        if (bjbVar == null) {
                            bveVarC.v(358076243);
                            ((defpackage.bwc) bveVarC).Y(z6);
                            dgdVar5 = dgdVar4;
                            z7 = z5;
                            cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                            cgfVar5 = cgfVar4;
                        } else {
                            dgdVar5 = dgdVar4;
                            z7 = z5;
                            bveVarC.v(357432497);
                            cgfVar5 = cgfVar4;
                            cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                            ((defpackage.bwc) bveVarC).Y(false);
                        }
                        defpackage.bdx bdxVar3 = defpackage.bdx.a;
                        bwcVar = (defpackage.bwc) bveVarC;
                        long j6 = bwcVar.u;
                        long j7 = j6 ^ (j6 >>> c);
                        defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarAj);
                        defpackage.cdd cddVarAh3 = bwcVar.ah();
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, bdxVar3, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh3, defpackage.cwl.d);
                        bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                        defpackage.byw.c(bveVarC, cgfVarN3, defpackage.cwl.c);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j7), defpackage.cwl.f);
                        bwcVar.Y(true);
                        cgfVar3 = cgfVar5;
                        dgdVar3 = dgdVar5;
                        i25 = i26;
                        z4 = z7;
                        i24 = i27;
                    } else {
                        bveVarC.s();
                        z4 = z;
                        i23 = i3;
                        cgfVar3 = cgfVar2;
                        dgdVar3 = dgdVar2;
                        i24 = i16;
                        i25 = i11;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: bdf
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                java.lang.String str2 = str;
                                defpackage.cgf cgfVar6 = cgfVar3;
                                defpackage.dgd dgdVar6 = dgdVar3;
                                int i33 = i4 | 1;
                                int i34 = 306783378 & i33;
                                int i35 = 613566756 & i33;
                                defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i33 & (-920350135)) | i34 | (i35 >> 1) | ((i34 + i34) & i35), i5);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                i16 = i2;
                i17 = 0;
                i19 = i5 & 128;
                if (i19 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    int i33 = i6;
                    if (true != bveVarC.A(i3)) {
                        i20 = 4194304;
                    } else {
                        i20 = 8388608;
                    }
                    i6 = i33 | i20;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if (true != bveVarC.E(null)) {
                        i21 = 33554432;
                    } else {
                        i21 = 67108864;
                    }
                    i6 |= i21;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zE = bveVarC.C(null);
                    } else {
                        zE = bveVarC.E(null);
                    }
                    if (true != zE) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i6 |= i22;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i17;
                }
                if (bveVarC.I(z3, i6 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i7 != 0) {
                        dgdVar4 = defpackage.dgd.a;
                    } else {
                        dgdVar4 = dgdVar2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i11;
                    }
                    z5 = (!z2) | z;
                    if (i15 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i16;
                    }
                    if (i19 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i3;
                    }
                    defpackage.asq.ae(i23, i27);
                    blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                    if (blhVar != null) {
                        bveVarC.v(356427477);
                        j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        objArr4[i17] = blhVar;
                        defpackage.cdz cdzVar4 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                        zE2 = bveVarC.E(blhVar);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS = bwcVar2.S();
                        if (zE2) {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        } else {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        }
                        jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr4, cdzVar4, (defpackage.afer) objS, bveVarC, i17)).longValue();
                        zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                        objS2 = bwcVar2.S();
                        if (zB) {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        }
                        z6 = false;
                        bwcVar2.Y(false);
                        bjbVar = (defpackage.bjb) objS2;
                    } else {
                        boolean z11 = i17;
                        bveVarC.v(357055103);
                        ((defpackage.bwc) bveVarC).Y(z11);
                        bjbVar = null;
                        z6 = z11;
                    }
                    bvmVar = defpackage.dbl.f;
                    wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                    defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                    if (bjbVar == null) {
                        bveVarC.v(358076243);
                        ((defpackage.bwc) bveVarC).Y(z6);
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                        cgfVar5 = cgfVar4;
                    } else {
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        bveVarC.v(357432497);
                        cgfVar5 = cgfVar4;
                        cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    defpackage.bdx bdxVar4 = defpackage.bdx.a;
                    bwcVar = (defpackage.bwc) bveVarC;
                    long j8 = bwcVar.u;
                    long j9 = j8 ^ (j8 >>> c);
                    defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarAj);
                    defpackage.cdd cddVarAh4 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, bdxVar4, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh4, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN4, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j9), defpackage.cwl.f);
                    bwcVar.Y(true);
                    cgfVar3 = cgfVar5;
                    dgdVar3 = dgdVar5;
                    i25 = i26;
                    z4 = z7;
                    i24 = i27;
                } else {
                    bveVarC.s();
                    z4 = z;
                    i23 = i3;
                    cgfVar3 = cgfVar2;
                    dgdVar3 = dgdVar2;
                    i24 = i16;
                    i25 = i11;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: bdf
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar6 = cgfVar3;
                            defpackage.dgd dgdVar6 = dgdVar3;
                            int i34 = i4 | 1;
                            int i35 = 306783378 & i34;
                            int i36 = 613566756 & i34;
                            defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i34 & (-920350135)) | i35 | (i36 >> 1) | ((i35 + i35) & i36), i5);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i6 |= 384;
            dgdVar2 = dgdVar;
            if ((i5 & 8) != 0) {
                i6 |= 3072;
            } else if ((i4 & 3072) == 0) {
                if (true != bveVarC.E(null)) {
                    i9 = 1024;
                } else {
                    i9 = 2048;
                }
                i6 |= i9;
            }
            i10 = i5 & 16;
            if (i10 != 0) {
                if ((i4 & 24576) == 0) {
                    i11 = i;
                    c = ' ';
                    if (true != bveVarC.A(i11)) {
                        i12 = 8192;
                    } else {
                        i12 = 16384;
                    }
                    i6 |= i12;
                }
                i13 = i5 & 32;
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i13 != 0) {
                    i6 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (true != bveVarC.D(z)) {
                        i14 = 65536;
                    } else {
                        i14 = 131072;
                    }
                    i6 |= i14;
                }
                i15 = i5 & 64;
                if (i15 != 0) {
                    i16 = i2;
                    if ((i4 & 1572864) == 0) {
                        i17 = 0;
                        if (true != bveVarC.A(i16)) {
                            i18 = 524288;
                        } else {
                            i18 = 1048576;
                        }
                        i6 |= i18;
                    }
                    i19 = i5 & 128;
                    if (i19 != 0) {
                        i6 |= 12582912;
                    } else if ((i4 & 12582912) == 0) {
                        int i34 = i6;
                        if (true != bveVarC.A(i3)) {
                            i20 = 4194304;
                        } else {
                            i20 = 8388608;
                        }
                        i6 = i34 | i20;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if (true != bveVarC.E(null)) {
                            i21 = 33554432;
                        } else {
                            i21 = 67108864;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zE = bveVarC.C(null);
                        } else {
                            zE = bveVarC.E(null);
                        }
                        if (true != zE) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i6 |= i22;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i17;
                    }
                    if (bveVarC.I(z3, i6 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i7 != 0) {
                            dgdVar4 = defpackage.dgd.a;
                        } else {
                            dgdVar4 = dgdVar2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i11;
                        }
                        z5 = (!z2) | z;
                        if (i15 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i16;
                        }
                        if (i19 != 0) {
                            i23 = 1;
                        } else {
                            i23 = i3;
                        }
                        defpackage.asq.ae(i23, i27);
                        blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                        if (blhVar != null) {
                            bveVarC.v(356427477);
                            j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            objArr5[i17] = blhVar;
                            defpackage.cdz cdzVar5 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                            zE2 = bveVarC.E(blhVar);
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS = bwcVar2.S();
                            if (zE2) {
                                objS = new defpackage.bav(blhVar, 12);
                                bwcVar2.ad(objS);
                            } else {
                                objS = new defpackage.bav(blhVar, 12);
                                bwcVar2.ad(objS);
                            }
                            jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr5, cdzVar5, (defpackage.afer) objS, bveVarC, i17)).longValue();
                            zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                            objS2 = bwcVar2.S();
                            if (zB) {
                                objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                                bwcVar2.ad(objS2);
                            } else {
                                objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                                bwcVar2.ad(objS2);
                            }
                            z6 = false;
                            bwcVar2.Y(false);
                            bjbVar = (defpackage.bjb) objS2;
                        } else {
                            boolean z12 = i17;
                            bveVarC.v(357055103);
                            ((defpackage.bwc) bveVarC).Y(z12);
                            bjbVar = null;
                            z6 = z12;
                        }
                        bvmVar = defpackage.dbl.f;
                        wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                        defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                        if (bjbVar == null) {
                            bveVarC.v(358076243);
                            ((defpackage.bwc) bveVarC).Y(z6);
                            dgdVar5 = dgdVar4;
                            z7 = z5;
                            cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                            cgfVar5 = cgfVar4;
                        } else {
                            dgdVar5 = dgdVar4;
                            z7 = z5;
                            bveVarC.v(357432497);
                            cgfVar5 = cgfVar4;
                            cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                            ((defpackage.bwc) bveVarC).Y(false);
                        }
                        defpackage.bdx bdxVar5 = defpackage.bdx.a;
                        bwcVar = (defpackage.bwc) bveVarC;
                        long j10 = bwcVar.u;
                        long j11 = j10 ^ (j10 >>> c);
                        defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVarC, cgfVarAj);
                        defpackage.cdd cddVarAh5 = bwcVar.ah();
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, bdxVar5, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh5, defpackage.cwl.d);
                        bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                        defpackage.byw.c(bveVarC, cgfVarN5, defpackage.cwl.c);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j11), defpackage.cwl.f);
                        bwcVar.Y(true);
                        cgfVar3 = cgfVar5;
                        dgdVar3 = dgdVar5;
                        i25 = i26;
                        z4 = z7;
                        i24 = i27;
                    } else {
                        bveVarC.s();
                        z4 = z;
                        i23 = i3;
                        cgfVar3 = cgfVar2;
                        dgdVar3 = dgdVar2;
                        i24 = i16;
                        i25 = i11;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: bdf
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                java.lang.String str2 = str;
                                defpackage.cgf cgfVar6 = cgfVar3;
                                defpackage.dgd dgdVar6 = dgdVar3;
                                int i35 = i4 | 1;
                                int i36 = 306783378 & i35;
                                int i37 = 613566756 & i35;
                                defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i35 & (-920350135)) | i36 | (i37 >> 1) | ((i36 + i36) & i37), i5);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                i16 = i2;
                i17 = 0;
                i19 = i5 & 128;
                if (i19 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    int i35 = i6;
                    if (true != bveVarC.A(i3)) {
                        i20 = 4194304;
                    } else {
                        i20 = 8388608;
                    }
                    i6 = i35 | i20;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if (true != bveVarC.E(null)) {
                        i21 = 33554432;
                    } else {
                        i21 = 67108864;
                    }
                    i6 |= i21;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zE = bveVarC.C(null);
                    } else {
                        zE = bveVarC.E(null);
                    }
                    if (true != zE) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i6 |= i22;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i17;
                }
                if (bveVarC.I(z3, i6 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i7 != 0) {
                        dgdVar4 = defpackage.dgd.a;
                    } else {
                        dgdVar4 = dgdVar2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i11;
                    }
                    z5 = (!z2) | z;
                    if (i15 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i16;
                    }
                    if (i19 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i3;
                    }
                    defpackage.asq.ae(i23, i27);
                    blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                    if (blhVar != null) {
                        bveVarC.v(356427477);
                        j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        objArr6[i17] = blhVar;
                        defpackage.cdz cdzVar6 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                        zE2 = bveVarC.E(blhVar);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS = bwcVar2.S();
                        if (zE2) {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        } else {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        }
                        jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr6, cdzVar6, (defpackage.afer) objS, bveVarC, i17)).longValue();
                        zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                        objS2 = bwcVar2.S();
                        if (zB) {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        }
                        z6 = false;
                        bwcVar2.Y(false);
                        bjbVar = (defpackage.bjb) objS2;
                    } else {
                        boolean z13 = i17;
                        bveVarC.v(357055103);
                        ((defpackage.bwc) bveVarC).Y(z13);
                        bjbVar = null;
                        z6 = z13;
                    }
                    bvmVar = defpackage.dbl.f;
                    wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                    defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                    if (bjbVar == null) {
                        bveVarC.v(358076243);
                        ((defpackage.bwc) bveVarC).Y(z6);
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                        cgfVar5 = cgfVar4;
                    } else {
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        bveVarC.v(357432497);
                        cgfVar5 = cgfVar4;
                        cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    defpackage.bdx bdxVar6 = defpackage.bdx.a;
                    bwcVar = (defpackage.bwc) bveVarC;
                    long j12 = bwcVar.u;
                    long j13 = j12 ^ (j12 >>> c);
                    defpackage.cgf cgfVarN6 = defpackage.bzo.n(bveVarC, cgfVarAj);
                    defpackage.cdd cddVarAh6 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, bdxVar6, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh6, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN6, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j13), defpackage.cwl.f);
                    bwcVar.Y(true);
                    cgfVar3 = cgfVar5;
                    dgdVar3 = dgdVar5;
                    i25 = i26;
                    z4 = z7;
                    i24 = i27;
                } else {
                    bveVarC.s();
                    z4 = z;
                    i23 = i3;
                    cgfVar3 = cgfVar2;
                    dgdVar3 = dgdVar2;
                    i24 = i16;
                    i25 = i11;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: bdf
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar6 = cgfVar3;
                            defpackage.dgd dgdVar6 = dgdVar3;
                            int i36 = i4 | 1;
                            int i37 = 306783378 & i36;
                            int i38 = 613566756 & i36;
                            defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i36 & (-920350135)) | i37 | (i38 >> 1) | ((i37 + i37) & i38), i5);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i6 |= 24576;
            i11 = i;
            c = ' ';
            i13 = i5 & 32;
            if (i13 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i13 != 0) {
                i6 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (true != bveVarC.D(z)) {
                    i14 = 65536;
                } else {
                    i14 = 131072;
                }
                i6 |= i14;
            }
            i15 = i5 & 64;
            if (i15 != 0) {
                i16 = i2;
                if ((i4 & 1572864) == 0) {
                    i17 = 0;
                    if (true != bveVarC.A(i16)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i6 |= i18;
                }
                i19 = i5 & 128;
                if (i19 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    int i36 = i6;
                    if (true != bveVarC.A(i3)) {
                        i20 = 4194304;
                    } else {
                        i20 = 8388608;
                    }
                    i6 = i36 | i20;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if (true != bveVarC.E(null)) {
                        i21 = 33554432;
                    } else {
                        i21 = 67108864;
                    }
                    i6 |= i21;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zE = bveVarC.C(null);
                    } else {
                        zE = bveVarC.E(null);
                    }
                    if (true != zE) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i6 |= i22;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i17;
                }
                if (bveVarC.I(z3, i6 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i7 != 0) {
                        dgdVar4 = defpackage.dgd.a;
                    } else {
                        dgdVar4 = dgdVar2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i11;
                    }
                    z5 = (!z2) | z;
                    if (i15 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i16;
                    }
                    if (i19 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i3;
                    }
                    defpackage.asq.ae(i23, i27);
                    blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                    if (blhVar != null) {
                        bveVarC.v(356427477);
                        j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                        objArr7[i17] = blhVar;
                        defpackage.cdz cdzVar7 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                        zE2 = bveVarC.E(blhVar);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS = bwcVar2.S();
                        if (zE2) {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        } else {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        }
                        jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr7, cdzVar7, (defpackage.afer) objS, bveVarC, i17)).longValue();
                        zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                        objS2 = bwcVar2.S();
                        if (zB) {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        }
                        z6 = false;
                        bwcVar2.Y(false);
                        bjbVar = (defpackage.bjb) objS2;
                    } else {
                        boolean z14 = i17;
                        bveVarC.v(357055103);
                        ((defpackage.bwc) bveVarC).Y(z14);
                        bjbVar = null;
                        z6 = z14;
                    }
                    bvmVar = defpackage.dbl.f;
                    wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                    defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                    if (bjbVar == null) {
                        bveVarC.v(358076243);
                        ((defpackage.bwc) bveVarC).Y(z6);
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                        cgfVar5 = cgfVar4;
                    } else {
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        bveVarC.v(357432497);
                        cgfVar5 = cgfVar4;
                        cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    defpackage.bdx bdxVar7 = defpackage.bdx.a;
                    bwcVar = (defpackage.bwc) bveVarC;
                    long j14 = bwcVar.u;
                    long j15 = j14 ^ (j14 >>> c);
                    defpackage.cgf cgfVarN7 = defpackage.bzo.n(bveVarC, cgfVarAj);
                    defpackage.cdd cddVarAh7 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, bdxVar7, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh7, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN7, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j15), defpackage.cwl.f);
                    bwcVar.Y(true);
                    cgfVar3 = cgfVar5;
                    dgdVar3 = dgdVar5;
                    i25 = i26;
                    z4 = z7;
                    i24 = i27;
                } else {
                    bveVarC.s();
                    z4 = z;
                    i23 = i3;
                    cgfVar3 = cgfVar2;
                    dgdVar3 = dgdVar2;
                    i24 = i16;
                    i25 = i11;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: bdf
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar6 = cgfVar3;
                            defpackage.dgd dgdVar6 = dgdVar3;
                            int i37 = i4 | 1;
                            int i38 = 306783378 & i37;
                            int i39 = 613566756 & i37;
                            defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i37 & (-920350135)) | i38 | (i39 >> 1) | ((i38 + i38) & i39), i5);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i6 |= 1572864;
            i16 = i2;
            i17 = 0;
            i19 = i5 & 128;
            if (i19 != 0) {
                i6 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                int i37 = i6;
                if (true != bveVarC.A(i3)) {
                    i20 = 4194304;
                } else {
                    i20 = 8388608;
                }
                i6 = i37 | i20;
            }
            if ((i5 & 256) != 0) {
                i6 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if (true != bveVarC.E(null)) {
                    i21 = 33554432;
                } else {
                    i21 = 67108864;
                }
                i6 |= i21;
            }
            if ((i5 & 512) != 0) {
                i6 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if ((1073741824 & i4) == 0) {
                    zE = bveVarC.C(null);
                } else {
                    zE = bveVarC.E(null);
                }
                if (true != zE) {
                    i22 = 268435456;
                } else {
                    i22 = 536870912;
                }
                i6 |= i22;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = 1;
            } else {
                z3 = i17;
            }
            if (bveVarC.I(z3, i6 & 1)) {
                if (i29 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i7 != 0) {
                    dgdVar4 = defpackage.dgd.a;
                } else {
                    dgdVar4 = dgdVar2;
                }
                if (i10 != 0) {
                    i26 = 1;
                } else {
                    i26 = i11;
                }
                z5 = (!z2) | z;
                if (i15 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i16;
                }
                if (i19 != 0) {
                    i23 = 1;
                } else {
                    i23 = i3;
                }
                defpackage.asq.ae(i23, i27);
                blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                if (blhVar != null) {
                    bveVarC.v(356427477);
                    j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                    java.lang.Object[] objArr8 = new java.lang.Object[1];
                    objArr8[i17] = blhVar;
                    defpackage.cdz cdzVar8 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                    zE2 = bveVarC.E(blhVar);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS = bwcVar2.S();
                    if (zE2) {
                        objS = new defpackage.bav(blhVar, 12);
                        bwcVar2.ad(objS);
                    } else {
                        objS = new defpackage.bav(blhVar, 12);
                        bwcVar2.ad(objS);
                    }
                    jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr8, cdzVar8, (defpackage.afer) objS, bveVarC, i17)).longValue();
                    zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                    objS2 = bwcVar2.S();
                    if (zB) {
                        objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                        bwcVar2.ad(objS2);
                    } else {
                        objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                        bwcVar2.ad(objS2);
                    }
                    z6 = false;
                    bwcVar2.Y(false);
                    bjbVar = (defpackage.bjb) objS2;
                } else {
                    boolean z15 = i17;
                    bveVarC.v(357055103);
                    ((defpackage.bwc) bveVarC).Y(z15);
                    bjbVar = null;
                    z6 = z15;
                }
                bvmVar = defpackage.dbl.f;
                wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                if (bjbVar == null) {
                    bveVarC.v(358076243);
                    ((defpackage.bwc) bveVarC).Y(z6);
                    dgdVar5 = dgdVar4;
                    z7 = z5;
                    cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                    cgfVar5 = cgfVar4;
                } else {
                    dgdVar5 = dgdVar4;
                    z7 = z5;
                    bveVarC.v(357432497);
                    cgfVar5 = cgfVar4;
                    cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                defpackage.bdx bdxVar8 = defpackage.bdx.a;
                bwcVar = (defpackage.bwc) bveVarC;
                long j16 = bwcVar.u;
                long j17 = j16 ^ (j16 >>> c);
                defpackage.cgf cgfVarN8 = defpackage.bzo.n(bveVarC, cgfVarAj);
                defpackage.cdd cddVarAh8 = bwcVar.ah();
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, bdxVar8, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh8, defpackage.cwl.d);
                bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVarC, cgfVarN8, defpackage.cwl.c);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j17), defpackage.cwl.f);
                bwcVar.Y(true);
                cgfVar3 = cgfVar5;
                dgdVar3 = dgdVar5;
                i25 = i26;
                z4 = z7;
                i24 = i27;
            } else {
                bveVarC.s();
                z4 = z;
                i23 = i3;
                cgfVar3 = cgfVar2;
                dgdVar3 = dgdVar2;
                i24 = i16;
                i25 = i11;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: bdf
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        java.lang.String str2 = str;
                        defpackage.cgf cgfVar6 = cgfVar3;
                        defpackage.dgd dgdVar6 = dgdVar3;
                        int i38 = i4 | 1;
                        int i39 = 306783378 & i38;
                        int i310 = 613566756 & i38;
                        defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i38 & (-920350135)) | i39 | (i310 >> 1) | ((i39 + i39) & i310), i5);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i6 |= 48;
        cgfVar2 = cgfVar;
        i7 = i5 & 4;
        if (i7 != 0) {
            if ((i4 & 384) == 0) {
                dgdVar2 = dgdVar;
                if (true != bveVarC.C(dgdVar2)) {
                    i8 = 128;
                } else {
                    i8 = 256;
                }
                i6 |= i8;
            }
            if ((i5 & 8) != 0) {
                i6 |= 3072;
            } else if ((i4 & 3072) == 0) {
                if (true != bveVarC.E(null)) {
                    i9 = 1024;
                } else {
                    i9 = 2048;
                }
                i6 |= i9;
            }
            i10 = i5 & 16;
            if (i10 != 0) {
                if ((i4 & 24576) == 0) {
                    i11 = i;
                    c = ' ';
                    if (true != bveVarC.A(i11)) {
                        i12 = 8192;
                    } else {
                        i12 = 16384;
                    }
                    i6 |= i12;
                }
                i13 = i5 & 32;
                if (i13 != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (i13 != 0) {
                    i6 |= 196608;
                } else if ((i4 & 196608) == 0) {
                    if (true != bveVarC.D(z)) {
                        i14 = 65536;
                    } else {
                        i14 = 131072;
                    }
                    i6 |= i14;
                }
                i15 = i5 & 64;
                if (i15 != 0) {
                    i16 = i2;
                    if ((i4 & 1572864) == 0) {
                        i17 = 0;
                        if (true != bveVarC.A(i16)) {
                            i18 = 524288;
                        } else {
                            i18 = 1048576;
                        }
                        i6 |= i18;
                    }
                    i19 = i5 & 128;
                    if (i19 != 0) {
                        i6 |= 12582912;
                    } else if ((i4 & 12582912) == 0) {
                        int i38 = i6;
                        if (true != bveVarC.A(i3)) {
                            i20 = 4194304;
                        } else {
                            i20 = 8388608;
                        }
                        i6 = i38 | i20;
                    }
                    if ((i5 & 256) != 0) {
                        i6 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        if (true != bveVarC.E(null)) {
                            i21 = 33554432;
                        } else {
                            i21 = 67108864;
                        }
                        i6 |= i21;
                    }
                    if ((i5 & 512) != 0) {
                        i6 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zE = bveVarC.C(null);
                        } else {
                            zE = bveVarC.E(null);
                        }
                        if (true != zE) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i6 |= i22;
                    }
                    if ((306783379 & i6) != 306783378) {
                        z3 = 1;
                    } else {
                        z3 = i17;
                    }
                    if (bveVarC.I(z3, i6 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                        } else {
                            cgfVar4 = cgfVar2;
                        }
                        if (i7 != 0) {
                            dgdVar4 = defpackage.dgd.a;
                        } else {
                            dgdVar4 = dgdVar2;
                        }
                        if (i10 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i11;
                        }
                        z5 = (!z2) | z;
                        if (i15 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i16;
                        }
                        if (i19 != 0) {
                            i23 = 1;
                        } else {
                            i23 = i3;
                        }
                        defpackage.asq.ae(i23, i27);
                        blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                        if (blhVar != null) {
                            bveVarC.v(356427477);
                            j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                            java.lang.Object[] objArr9 = new java.lang.Object[1];
                            objArr9[i17] = blhVar;
                            defpackage.cdz cdzVar9 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                            zE2 = bveVarC.E(blhVar);
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS = bwcVar2.S();
                            if (zE2) {
                                objS = new defpackage.bav(blhVar, 12);
                                bwcVar2.ad(objS);
                            } else {
                                objS = new defpackage.bav(blhVar, 12);
                                bwcVar2.ad(objS);
                            }
                            jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr9, cdzVar9, (defpackage.afer) objS, bveVarC, i17)).longValue();
                            zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                            objS2 = bwcVar2.S();
                            if (zB) {
                                objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                                bwcVar2.ad(objS2);
                            } else {
                                objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                                bwcVar2.ad(objS2);
                            }
                            z6 = false;
                            bwcVar2.Y(false);
                            bjbVar = (defpackage.bjb) objS2;
                        } else {
                            boolean z16 = i17;
                            bveVarC.v(357055103);
                            ((defpackage.bwc) bveVarC).Y(z16);
                            bjbVar = null;
                            z6 = z16;
                        }
                        bvmVar = defpackage.dbl.f;
                        wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                        defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                        if (bjbVar == null) {
                            bveVarC.v(358076243);
                            ((defpackage.bwc) bveVarC).Y(z6);
                            dgdVar5 = dgdVar4;
                            z7 = z5;
                            cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                            cgfVar5 = cgfVar4;
                        } else {
                            dgdVar5 = dgdVar4;
                            z7 = z5;
                            bveVarC.v(357432497);
                            cgfVar5 = cgfVar4;
                            cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                            ((defpackage.bwc) bveVarC).Y(false);
                        }
                        defpackage.bdx bdxVar9 = defpackage.bdx.a;
                        bwcVar = (defpackage.bwc) bveVarC;
                        long j18 = bwcVar.u;
                        long j19 = j18 ^ (j18 >>> c);
                        defpackage.cgf cgfVarN9 = defpackage.bzo.n(bveVarC, cgfVarAj);
                        defpackage.cdd cddVarAh9 = bwcVar.ah();
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, bdxVar9, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh9, defpackage.cwl.d);
                        bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                        defpackage.byw.c(bveVarC, cgfVarN9, defpackage.cwl.c);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j19), defpackage.cwl.f);
                        bwcVar.Y(true);
                        cgfVar3 = cgfVar5;
                        dgdVar3 = dgdVar5;
                        i25 = i26;
                        z4 = z7;
                        i24 = i27;
                    } else {
                        bveVarC.s();
                        z4 = z;
                        i23 = i3;
                        cgfVar3 = cgfVar2;
                        dgdVar3 = dgdVar2;
                        i24 = i16;
                        i25 = i11;
                    }
                    bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: bdf
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                java.lang.String str2 = str;
                                defpackage.cgf cgfVar6 = cgfVar3;
                                defpackage.dgd dgdVar6 = dgdVar3;
                                int i39 = i4 | 1;
                                int i310 = 306783378 & i39;
                                int i311 = 613566756 & i39;
                                defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i39 & (-920350135)) | i310 | (i311 >> 1) | ((i310 + i310) & i311), i5);
                                return defpackage.afbk.a;
                            }
                        };
                    }
                }
                i6 |= 1572864;
                i16 = i2;
                i17 = 0;
                i19 = i5 & 128;
                if (i19 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    int i39 = i6;
                    if (true != bveVarC.A(i3)) {
                        i20 = 4194304;
                    } else {
                        i20 = 8388608;
                    }
                    i6 = i39 | i20;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if (true != bveVarC.E(null)) {
                        i21 = 33554432;
                    } else {
                        i21 = 67108864;
                    }
                    i6 |= i21;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zE = bveVarC.C(null);
                    } else {
                        zE = bveVarC.E(null);
                    }
                    if (true != zE) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i6 |= i22;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i17;
                }
                if (bveVarC.I(z3, i6 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i7 != 0) {
                        dgdVar4 = defpackage.dgd.a;
                    } else {
                        dgdVar4 = dgdVar2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i11;
                    }
                    z5 = (!z2) | z;
                    if (i15 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i16;
                    }
                    if (i19 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i3;
                    }
                    defpackage.asq.ae(i23, i27);
                    blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                    if (blhVar != null) {
                        bveVarC.v(356427477);
                        j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                        objArr10[i17] = blhVar;
                        defpackage.cdz cdzVar10 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                        zE2 = bveVarC.E(blhVar);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS = bwcVar2.S();
                        if (zE2) {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        } else {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        }
                        jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr10, cdzVar10, (defpackage.afer) objS, bveVarC, i17)).longValue();
                        zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                        objS2 = bwcVar2.S();
                        if (zB) {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        }
                        z6 = false;
                        bwcVar2.Y(false);
                        bjbVar = (defpackage.bjb) objS2;
                    } else {
                        boolean z17 = i17;
                        bveVarC.v(357055103);
                        ((defpackage.bwc) bveVarC).Y(z17);
                        bjbVar = null;
                        z6 = z17;
                    }
                    bvmVar = defpackage.dbl.f;
                    wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                    defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                    if (bjbVar == null) {
                        bveVarC.v(358076243);
                        ((defpackage.bwc) bveVarC).Y(z6);
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                        cgfVar5 = cgfVar4;
                    } else {
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        bveVarC.v(357432497);
                        cgfVar5 = cgfVar4;
                        cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    defpackage.bdx bdxVar10 = defpackage.bdx.a;
                    bwcVar = (defpackage.bwc) bveVarC;
                    long j110 = bwcVar.u;
                    long j111 = j110 ^ (j110 >>> c);
                    defpackage.cgf cgfVarN10 = defpackage.bzo.n(bveVarC, cgfVarAj);
                    defpackage.cdd cddVarAh10 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, bdxVar10, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh10, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN10, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j111), defpackage.cwl.f);
                    bwcVar.Y(true);
                    cgfVar3 = cgfVar5;
                    dgdVar3 = dgdVar5;
                    i25 = i26;
                    z4 = z7;
                    i24 = i27;
                } else {
                    bveVarC.s();
                    z4 = z;
                    i23 = i3;
                    cgfVar3 = cgfVar2;
                    dgdVar3 = dgdVar2;
                    i24 = i16;
                    i25 = i11;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: bdf
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar6 = cgfVar3;
                            defpackage.dgd dgdVar6 = dgdVar3;
                            int i310 = i4 | 1;
                            int i311 = 306783378 & i310;
                            int i312 = 613566756 & i310;
                            defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i310 & (-920350135)) | i311 | (i312 >> 1) | ((i311 + i311) & i312), i5);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i6 |= 24576;
            i11 = i;
            c = ' ';
            i13 = i5 & 32;
            if (i13 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i13 != 0) {
                i6 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (true != bveVarC.D(z)) {
                    i14 = 65536;
                } else {
                    i14 = 131072;
                }
                i6 |= i14;
            }
            i15 = i5 & 64;
            if (i15 != 0) {
                i16 = i2;
                if ((i4 & 1572864) == 0) {
                    i17 = 0;
                    if (true != bveVarC.A(i16)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i6 |= i18;
                }
                i19 = i5 & 128;
                if (i19 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    int i310 = i6;
                    if (true != bveVarC.A(i3)) {
                        i20 = 4194304;
                    } else {
                        i20 = 8388608;
                    }
                    i6 = i310 | i20;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if (true != bveVarC.E(null)) {
                        i21 = 33554432;
                    } else {
                        i21 = 67108864;
                    }
                    i6 |= i21;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zE = bveVarC.C(null);
                    } else {
                        zE = bveVarC.E(null);
                    }
                    if (true != zE) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i6 |= i22;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i17;
                }
                if (bveVarC.I(z3, i6 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i7 != 0) {
                        dgdVar4 = defpackage.dgd.a;
                    } else {
                        dgdVar4 = dgdVar2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i11;
                    }
                    z5 = (!z2) | z;
                    if (i15 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i16;
                    }
                    if (i19 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i3;
                    }
                    defpackage.asq.ae(i23, i27);
                    blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                    if (blhVar != null) {
                        bveVarC.v(356427477);
                        j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                        objArr11[i17] = blhVar;
                        defpackage.cdz cdzVar11 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                        zE2 = bveVarC.E(blhVar);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS = bwcVar2.S();
                        if (zE2) {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        } else {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        }
                        jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr11, cdzVar11, (defpackage.afer) objS, bveVarC, i17)).longValue();
                        zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                        objS2 = bwcVar2.S();
                        if (zB) {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        }
                        z6 = false;
                        bwcVar2.Y(false);
                        bjbVar = (defpackage.bjb) objS2;
                    } else {
                        boolean z18 = i17;
                        bveVarC.v(357055103);
                        ((defpackage.bwc) bveVarC).Y(z18);
                        bjbVar = null;
                        z6 = z18;
                    }
                    bvmVar = defpackage.dbl.f;
                    wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                    defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                    if (bjbVar == null) {
                        bveVarC.v(358076243);
                        ((defpackage.bwc) bveVarC).Y(z6);
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                        cgfVar5 = cgfVar4;
                    } else {
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        bveVarC.v(357432497);
                        cgfVar5 = cgfVar4;
                        cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    defpackage.bdx bdxVar11 = defpackage.bdx.a;
                    bwcVar = (defpackage.bwc) bveVarC;
                    long j112 = bwcVar.u;
                    long j113 = j112 ^ (j112 >>> c);
                    defpackage.cgf cgfVarN11 = defpackage.bzo.n(bveVarC, cgfVarAj);
                    defpackage.cdd cddVarAh11 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, bdxVar11, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh11, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN11, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j113), defpackage.cwl.f);
                    bwcVar.Y(true);
                    cgfVar3 = cgfVar5;
                    dgdVar3 = dgdVar5;
                    i25 = i26;
                    z4 = z7;
                    i24 = i27;
                } else {
                    bveVarC.s();
                    z4 = z;
                    i23 = i3;
                    cgfVar3 = cgfVar2;
                    dgdVar3 = dgdVar2;
                    i24 = i16;
                    i25 = i11;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: bdf
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar6 = cgfVar3;
                            defpackage.dgd dgdVar6 = dgdVar3;
                            int i311 = i4 | 1;
                            int i312 = 306783378 & i311;
                            int i313 = 613566756 & i311;
                            defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i311 & (-920350135)) | i312 | (i313 >> 1) | ((i312 + i312) & i313), i5);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i6 |= 1572864;
            i16 = i2;
            i17 = 0;
            i19 = i5 & 128;
            if (i19 != 0) {
                i6 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                int i311 = i6;
                if (true != bveVarC.A(i3)) {
                    i20 = 4194304;
                } else {
                    i20 = 8388608;
                }
                i6 = i311 | i20;
            }
            if ((i5 & 256) != 0) {
                i6 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if (true != bveVarC.E(null)) {
                    i21 = 33554432;
                } else {
                    i21 = 67108864;
                }
                i6 |= i21;
            }
            if ((i5 & 512) != 0) {
                i6 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if ((1073741824 & i4) == 0) {
                    zE = bveVarC.C(null);
                } else {
                    zE = bveVarC.E(null);
                }
                if (true != zE) {
                    i22 = 268435456;
                } else {
                    i22 = 536870912;
                }
                i6 |= i22;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = 1;
            } else {
                z3 = i17;
            }
            if (bveVarC.I(z3, i6 & 1)) {
                if (i29 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i7 != 0) {
                    dgdVar4 = defpackage.dgd.a;
                } else {
                    dgdVar4 = dgdVar2;
                }
                if (i10 != 0) {
                    i26 = 1;
                } else {
                    i26 = i11;
                }
                z5 = (!z2) | z;
                if (i15 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i16;
                }
                if (i19 != 0) {
                    i23 = 1;
                } else {
                    i23 = i3;
                }
                defpackage.asq.ae(i23, i27);
                blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                if (blhVar != null) {
                    bveVarC.v(356427477);
                    j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    objArr12[i17] = blhVar;
                    defpackage.cdz cdzVar12 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                    zE2 = bveVarC.E(blhVar);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS = bwcVar2.S();
                    if (zE2) {
                        objS = new defpackage.bav(blhVar, 12);
                        bwcVar2.ad(objS);
                    } else {
                        objS = new defpackage.bav(blhVar, 12);
                        bwcVar2.ad(objS);
                    }
                    jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr12, cdzVar12, (defpackage.afer) objS, bveVarC, i17)).longValue();
                    zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                    objS2 = bwcVar2.S();
                    if (zB) {
                        objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                        bwcVar2.ad(objS2);
                    } else {
                        objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                        bwcVar2.ad(objS2);
                    }
                    z6 = false;
                    bwcVar2.Y(false);
                    bjbVar = (defpackage.bjb) objS2;
                } else {
                    boolean z19 = i17;
                    bveVarC.v(357055103);
                    ((defpackage.bwc) bveVarC).Y(z19);
                    bjbVar = null;
                    z6 = z19;
                }
                bvmVar = defpackage.dbl.f;
                wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                if (bjbVar == null) {
                    bveVarC.v(358076243);
                    ((defpackage.bwc) bveVarC).Y(z6);
                    dgdVar5 = dgdVar4;
                    z7 = z5;
                    cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                    cgfVar5 = cgfVar4;
                } else {
                    dgdVar5 = dgdVar4;
                    z7 = z5;
                    bveVarC.v(357432497);
                    cgfVar5 = cgfVar4;
                    cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                defpackage.bdx bdxVar12 = defpackage.bdx.a;
                bwcVar = (defpackage.bwc) bveVarC;
                long j114 = bwcVar.u;
                long j115 = j114 ^ (j114 >>> c);
                defpackage.cgf cgfVarN12 = defpackage.bzo.n(bveVarC, cgfVarAj);
                defpackage.cdd cddVarAh12 = bwcVar.ah();
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, bdxVar12, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh12, defpackage.cwl.d);
                bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVarC, cgfVarN12, defpackage.cwl.c);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j115), defpackage.cwl.f);
                bwcVar.Y(true);
                cgfVar3 = cgfVar5;
                dgdVar3 = dgdVar5;
                i25 = i26;
                z4 = z7;
                i24 = i27;
            } else {
                bveVarC.s();
                z4 = z;
                i23 = i3;
                cgfVar3 = cgfVar2;
                dgdVar3 = dgdVar2;
                i24 = i16;
                i25 = i11;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: bdf
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        java.lang.String str2 = str;
                        defpackage.cgf cgfVar6 = cgfVar3;
                        defpackage.dgd dgdVar6 = dgdVar3;
                        int i312 = i4 | 1;
                        int i313 = 306783378 & i312;
                        int i314 = 613566756 & i312;
                        defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i312 & (-920350135)) | i313 | (i314 >> 1) | ((i313 + i313) & i314), i5);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i6 |= 384;
        dgdVar2 = dgdVar;
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 3072) == 0) {
            if (true != bveVarC.E(null)) {
                i9 = 1024;
            } else {
                i9 = 2048;
            }
            i6 |= i9;
        }
        i10 = i5 & 16;
        if (i10 != 0) {
            if ((i4 & 24576) == 0) {
                i11 = i;
                c = ' ';
                if (true != bveVarC.A(i11)) {
                    i12 = 8192;
                } else {
                    i12 = 16384;
                }
                i6 |= i12;
            }
            i13 = i5 & 32;
            if (i13 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i13 != 0) {
                i6 |= 196608;
            } else if ((i4 & 196608) == 0) {
                if (true != bveVarC.D(z)) {
                    i14 = 65536;
                } else {
                    i14 = 131072;
                }
                i6 |= i14;
            }
            i15 = i5 & 64;
            if (i15 != 0) {
                i16 = i2;
                if ((i4 & 1572864) == 0) {
                    i17 = 0;
                    if (true != bveVarC.A(i16)) {
                        i18 = 524288;
                    } else {
                        i18 = 1048576;
                    }
                    i6 |= i18;
                }
                i19 = i5 & 128;
                if (i19 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    int i312 = i6;
                    if (true != bveVarC.A(i3)) {
                        i20 = 4194304;
                    } else {
                        i20 = 8388608;
                    }
                    i6 = i312 | i20;
                }
                if ((i5 & 256) != 0) {
                    i6 |= 100663296;
                } else if ((i4 & 100663296) == 0) {
                    if (true != bveVarC.E(null)) {
                        i21 = 33554432;
                    } else {
                        i21 = 67108864;
                    }
                    i6 |= i21;
                }
                if ((i5 & 512) != 0) {
                    i6 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zE = bveVarC.C(null);
                    } else {
                        zE = bveVarC.E(null);
                    }
                    if (true != zE) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i6 |= i22;
                }
                if ((306783379 & i6) != 306783378) {
                    z3 = 1;
                } else {
                    z3 = i17;
                }
                if (bveVarC.I(z3, i6 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i7 != 0) {
                        dgdVar4 = defpackage.dgd.a;
                    } else {
                        dgdVar4 = dgdVar2;
                    }
                    if (i10 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i11;
                    }
                    z5 = (!z2) | z;
                    if (i15 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i16;
                    }
                    if (i19 != 0) {
                        i23 = 1;
                    } else {
                        i23 = i3;
                    }
                    defpackage.asq.ae(i23, i27);
                    blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                    if (blhVar != null) {
                        bveVarC.v(356427477);
                        j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                        java.lang.Object[] objArr13 = new java.lang.Object[1];
                        objArr13[i17] = blhVar;
                        defpackage.cdz cdzVar13 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                        zE2 = bveVarC.E(blhVar);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS = bwcVar2.S();
                        if (zE2) {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        } else {
                            objS = new defpackage.bav(blhVar, 12);
                            bwcVar2.ad(objS);
                        }
                        jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr13, cdzVar13, (defpackage.afer) objS, bveVarC, i17)).longValue();
                        zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                        objS2 = bwcVar2.S();
                        if (zB) {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        } else {
                            objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                            bwcVar2.ad(objS2);
                        }
                        z6 = false;
                        bwcVar2.Y(false);
                        bjbVar = (defpackage.bjb) objS2;
                    } else {
                        boolean z110 = i17;
                        bveVarC.v(357055103);
                        ((defpackage.bwc) bveVarC).Y(z110);
                        bjbVar = null;
                        z6 = z110;
                    }
                    bvmVar = defpackage.dbl.f;
                    wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                    defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                    if (bjbVar == null) {
                        bveVarC.v(358076243);
                        ((defpackage.bwc) bveVarC).Y(z6);
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                        cgfVar5 = cgfVar4;
                    } else {
                        dgdVar5 = dgdVar4;
                        z7 = z5;
                        bveVarC.v(357432497);
                        cgfVar5 = cgfVar4;
                        cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                        ((defpackage.bwc) bveVarC).Y(false);
                    }
                    defpackage.bdx bdxVar13 = defpackage.bdx.a;
                    bwcVar = (defpackage.bwc) bveVarC;
                    long j116 = bwcVar.u;
                    long j117 = j116 ^ (j116 >>> c);
                    defpackage.cgf cgfVarN13 = defpackage.bzo.n(bveVarC, cgfVarAj);
                    defpackage.cdd cddVarAh13 = bwcVar.ah();
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, bdxVar13, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh13, defpackage.cwl.d);
                    bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                    defpackage.byw.c(bveVarC, cgfVarN13, defpackage.cwl.c);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j117), defpackage.cwl.f);
                    bwcVar.Y(true);
                    cgfVar3 = cgfVar5;
                    dgdVar3 = dgdVar5;
                    i25 = i26;
                    z4 = z7;
                    i24 = i27;
                } else {
                    bveVarC.s();
                    z4 = z;
                    i23 = i3;
                    cgfVar3 = cgfVar2;
                    dgdVar3 = dgdVar2;
                    i24 = i16;
                    i25 = i11;
                }
                bxlVarJ = bveVarC.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new defpackage.affg() { // from class: bdf
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bve bveVar2 = (defpackage.bve) obj;
                            ((java.lang.Integer) obj2).intValue();
                            java.lang.String str2 = str;
                            defpackage.cgf cgfVar6 = cgfVar3;
                            defpackage.dgd dgdVar6 = dgdVar3;
                            int i313 = i4 | 1;
                            int i314 = 306783378 & i313;
                            int i315 = 613566756 & i313;
                            defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i313 & (-920350135)) | i314 | (i315 >> 1) | ((i314 + i314) & i315), i5);
                            return defpackage.afbk.a;
                        }
                    };
                }
            }
            i6 |= 1572864;
            i16 = i2;
            i17 = 0;
            i19 = i5 & 128;
            if (i19 != 0) {
                i6 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                int i313 = i6;
                if (true != bveVarC.A(i3)) {
                    i20 = 4194304;
                } else {
                    i20 = 8388608;
                }
                i6 = i313 | i20;
            }
            if ((i5 & 256) != 0) {
                i6 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if (true != bveVarC.E(null)) {
                    i21 = 33554432;
                } else {
                    i21 = 67108864;
                }
                i6 |= i21;
            }
            if ((i5 & 512) != 0) {
                i6 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if ((1073741824 & i4) == 0) {
                    zE = bveVarC.C(null);
                } else {
                    zE = bveVarC.E(null);
                }
                if (true != zE) {
                    i22 = 268435456;
                } else {
                    i22 = 536870912;
                }
                i6 |= i22;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = 1;
            } else {
                z3 = i17;
            }
            if (bveVarC.I(z3, i6 & 1)) {
                if (i29 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i7 != 0) {
                    dgdVar4 = defpackage.dgd.a;
                } else {
                    dgdVar4 = dgdVar2;
                }
                if (i10 != 0) {
                    i26 = 1;
                } else {
                    i26 = i11;
                }
                z5 = (!z2) | z;
                if (i15 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i16;
                }
                if (i19 != 0) {
                    i23 = 1;
                } else {
                    i23 = i3;
                }
                defpackage.asq.ae(i23, i27);
                blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                if (blhVar != null) {
                    bveVarC.v(356427477);
                    j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                    java.lang.Object[] objArr14 = new java.lang.Object[1];
                    objArr14[i17] = blhVar;
                    defpackage.cdz cdzVar14 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                    zE2 = bveVarC.E(blhVar);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS = bwcVar2.S();
                    if (zE2) {
                        objS = new defpackage.bav(blhVar, 12);
                        bwcVar2.ad(objS);
                    } else {
                        objS = new defpackage.bav(blhVar, 12);
                        bwcVar2.ad(objS);
                    }
                    jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr14, cdzVar14, (defpackage.afer) objS, bveVarC, i17)).longValue();
                    zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                    objS2 = bwcVar2.S();
                    if (zB) {
                        objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                        bwcVar2.ad(objS2);
                    } else {
                        objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                        bwcVar2.ad(objS2);
                    }
                    z6 = false;
                    bwcVar2.Y(false);
                    bjbVar = (defpackage.bjb) objS2;
                } else {
                    boolean z111 = i17;
                    bveVarC.v(357055103);
                    ((defpackage.bwc) bveVarC).Y(z111);
                    bjbVar = null;
                    z6 = z111;
                }
                bvmVar = defpackage.dbl.f;
                wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                if (bjbVar == null) {
                    bveVarC.v(358076243);
                    ((defpackage.bwc) bveVarC).Y(z6);
                    dgdVar5 = dgdVar4;
                    z7 = z5;
                    cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                    cgfVar5 = cgfVar4;
                } else {
                    dgdVar5 = dgdVar4;
                    z7 = z5;
                    bveVarC.v(357432497);
                    cgfVar5 = cgfVar4;
                    cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                defpackage.bdx bdxVar14 = defpackage.bdx.a;
                bwcVar = (defpackage.bwc) bveVarC;
                long j118 = bwcVar.u;
                long j119 = j118 ^ (j118 >>> c);
                defpackage.cgf cgfVarN14 = defpackage.bzo.n(bveVarC, cgfVarAj);
                defpackage.cdd cddVarAh14 = bwcVar.ah();
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, bdxVar14, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh14, defpackage.cwl.d);
                bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVarC, cgfVarN14, defpackage.cwl.c);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j119), defpackage.cwl.f);
                bwcVar.Y(true);
                cgfVar3 = cgfVar5;
                dgdVar3 = dgdVar5;
                i25 = i26;
                z4 = z7;
                i24 = i27;
            } else {
                bveVarC.s();
                z4 = z;
                i23 = i3;
                cgfVar3 = cgfVar2;
                dgdVar3 = dgdVar2;
                i24 = i16;
                i25 = i11;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: bdf
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        java.lang.String str2 = str;
                        defpackage.cgf cgfVar6 = cgfVar3;
                        defpackage.dgd dgdVar6 = dgdVar3;
                        int i314 = i4 | 1;
                        int i315 = 306783378 & i314;
                        int i316 = 613566756 & i314;
                        defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i314 & (-920350135)) | i315 | (i316 >> 1) | ((i315 + i315) & i316), i5);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i6 |= 24576;
        i11 = i;
        c = ' ';
        i13 = i5 & 32;
        if (i13 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i13 != 0) {
            i6 |= 196608;
        } else if ((i4 & 196608) == 0) {
            if (true != bveVarC.D(z)) {
                i14 = 65536;
            } else {
                i14 = 131072;
            }
            i6 |= i14;
        }
        i15 = i5 & 64;
        if (i15 != 0) {
            i16 = i2;
            if ((i4 & 1572864) == 0) {
                i17 = 0;
                if (true != bveVarC.A(i16)) {
                    i18 = 524288;
                } else {
                    i18 = 1048576;
                }
                i6 |= i18;
            }
            i19 = i5 & 128;
            if (i19 != 0) {
                i6 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                int i314 = i6;
                if (true != bveVarC.A(i3)) {
                    i20 = 4194304;
                } else {
                    i20 = 8388608;
                }
                i6 = i314 | i20;
            }
            if ((i5 & 256) != 0) {
                i6 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                if (true != bveVarC.E(null)) {
                    i21 = 33554432;
                } else {
                    i21 = 67108864;
                }
                i6 |= i21;
            }
            if ((i5 & 512) != 0) {
                i6 |= 805306368;
            } else if ((i4 & 805306368) == 0) {
                if ((1073741824 & i4) == 0) {
                    zE = bveVarC.C(null);
                } else {
                    zE = bveVarC.E(null);
                }
                if (true != zE) {
                    i22 = 268435456;
                } else {
                    i22 = 536870912;
                }
                i6 |= i22;
            }
            if ((306783379 & i6) != 306783378) {
                z3 = 1;
            } else {
                z3 = i17;
            }
            if (bveVarC.I(z3, i6 & 1)) {
                if (i29 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i7 != 0) {
                    dgdVar4 = defpackage.dgd.a;
                } else {
                    dgdVar4 = dgdVar2;
                }
                if (i10 != 0) {
                    i26 = 1;
                } else {
                    i26 = i11;
                }
                z5 = (!z2) | z;
                if (i15 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i16;
                }
                if (i19 != 0) {
                    i23 = 1;
                } else {
                    i23 = i3;
                }
                defpackage.asq.ae(i23, i27);
                blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
                if (blhVar != null) {
                    bveVarC.v(356427477);
                    j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                    java.lang.Object[] objArr15 = new java.lang.Object[1];
                    objArr15[i17] = blhVar;
                    defpackage.cdz cdzVar15 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                    zE2 = bveVarC.E(blhVar);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS = bwcVar2.S();
                    if (zE2) {
                        objS = new defpackage.bav(blhVar, 12);
                        bwcVar2.ad(objS);
                    } else {
                        objS = new defpackage.bav(blhVar, 12);
                        bwcVar2.ad(objS);
                    }
                    jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr15, cdzVar15, (defpackage.afer) objS, bveVarC, i17)).longValue();
                    zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                    objS2 = bwcVar2.S();
                    if (zB) {
                        objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                        bwcVar2.ad(objS2);
                    } else {
                        objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                        bwcVar2.ad(objS2);
                    }
                    z6 = false;
                    bwcVar2.Y(false);
                    bjbVar = (defpackage.bjb) objS2;
                } else {
                    boolean z112 = i17;
                    bveVarC.v(357055103);
                    ((defpackage.bwc) bveVarC).Y(z112);
                    bjbVar = null;
                    z6 = z112;
                }
                bvmVar = defpackage.dbl.f;
                wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
                defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
                if (bjbVar == null) {
                    bveVarC.v(358076243);
                    ((defpackage.bwc) bveVarC).Y(z6);
                    dgdVar5 = dgdVar4;
                    z7 = z5;
                    cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                    cgfVar5 = cgfVar4;
                } else {
                    dgdVar5 = dgdVar4;
                    z7 = z5;
                    bveVarC.v(357432497);
                    cgfVar5 = cgfVar4;
                    cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                    ((defpackage.bwc) bveVarC).Y(false);
                }
                defpackage.bdx bdxVar15 = defpackage.bdx.a;
                bwcVar = (defpackage.bwc) bveVarC;
                long j1110 = bwcVar.u;
                long j1111 = j1110 ^ (j1110 >>> c);
                defpackage.cgf cgfVarN15 = defpackage.bzo.n(bveVarC, cgfVarAj);
                defpackage.cdd cddVarAh15 = bwcVar.ah();
                aferVar = defpackage.cwl.a;
                bveVarC.w();
                if (bwcVar.t) {
                    bveVarC.j(aferVar);
                } else {
                    bveVarC.y();
                }
                defpackage.byw.c(bveVarC, bdxVar15, defpackage.cwl.e);
                defpackage.byw.c(bveVarC, cddVarAh15, defpackage.cwl.d);
                bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVarC, cgfVarN15, defpackage.cwl.c);
                defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j1111), defpackage.cwl.f);
                bwcVar.Y(true);
                cgfVar3 = cgfVar5;
                dgdVar3 = dgdVar5;
                i25 = i26;
                z4 = z7;
                i24 = i27;
            } else {
                bveVarC.s();
                z4 = z;
                i23 = i3;
                cgfVar3 = cgfVar2;
                dgdVar3 = dgdVar2;
                i24 = i16;
                i25 = i11;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new defpackage.affg() { // from class: bdf
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bve bveVar2 = (defpackage.bve) obj;
                        ((java.lang.Integer) obj2).intValue();
                        java.lang.String str2 = str;
                        defpackage.cgf cgfVar6 = cgfVar3;
                        defpackage.dgd dgdVar6 = dgdVar3;
                        int i315 = i4 | 1;
                        int i316 = 306783378 & i315;
                        int i317 = 613566756 & i315;
                        defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i315 & (-920350135)) | i316 | (i317 >> 1) | ((i316 + i316) & i317), i5);
                        return defpackage.afbk.a;
                    }
                };
            }
        }
        i6 |= 1572864;
        i16 = i2;
        i17 = 0;
        i19 = i5 & 128;
        if (i19 != 0) {
            i6 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            int i315 = i6;
            if (true != bveVarC.A(i3)) {
                i20 = 4194304;
            } else {
                i20 = 8388608;
            }
            i6 = i315 | i20;
        }
        if ((i5 & 256) != 0) {
            i6 |= 100663296;
        } else if ((i4 & 100663296) == 0) {
            if (true != bveVarC.E(null)) {
                i21 = 33554432;
            } else {
                i21 = 67108864;
            }
            i6 |= i21;
        }
        if ((i5 & 512) != 0) {
            i6 |= 805306368;
        } else if ((i4 & 805306368) == 0) {
            if ((1073741824 & i4) == 0) {
                zE = bveVarC.C(null);
            } else {
                zE = bveVarC.E(null);
            }
            if (true != zE) {
                i22 = 268435456;
            } else {
                i22 = 536870912;
            }
            i6 |= i22;
        }
        if ((306783379 & i6) != 306783378) {
            z3 = 1;
        } else {
            z3 = i17;
        }
        if (bveVarC.I(z3, i6 & 1)) {
            if (i29 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            if (i7 != 0) {
                dgdVar4 = defpackage.dgd.a;
            } else {
                dgdVar4 = dgdVar2;
            }
            if (i10 != 0) {
                i26 = 1;
            } else {
                i26 = i11;
            }
            z5 = (!z2) | z;
            if (i15 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i16;
            }
            if (i19 != 0) {
                i23 = 1;
            } else {
                i23 = i3;
            }
            defpackage.asq.ae(i23, i27);
            blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
            if (blhVar != null) {
                bveVarC.v(356427477);
                j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                objArr16[i17] = blhVar;
                defpackage.cdz cdzVar16 = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                zE2 = bveVarC.E(blhVar);
                bwcVar2 = (defpackage.bwc) bveVarC;
                objS = bwcVar2.S();
                if (zE2) {
                    objS = new defpackage.bav(blhVar, 12);
                    bwcVar2.ad(objS);
                } else {
                    objS = new defpackage.bav(blhVar, 12);
                    bwcVar2.ad(objS);
                }
                jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr16, cdzVar16, (defpackage.afer) objS, bveVarC, i17)).longValue();
                zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                objS2 = bwcVar2.S();
                if (zB) {
                    objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                    bwcVar2.ad(objS2);
                } else {
                    objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                    bwcVar2.ad(objS2);
                }
                z6 = false;
                bwcVar2.Y(false);
                bjbVar = (defpackage.bjb) objS2;
            } else {
                boolean z113 = i17;
                bveVarC.v(357055103);
                ((defpackage.bwc) bveVarC).Y(z113);
                bjbVar = null;
                z6 = z113;
            }
            bvmVar = defpackage.dbl.f;
            wdeVar = (defpackage.wde) bveVarC.f(bvmVar);
            defpackage.bdi.c(str, dgdVar4, wdeVar, z5, bveVarC);
            if (bjbVar == null) {
                bveVarC.v(358076243);
                ((defpackage.bwc) bveVarC).Y(z6);
                dgdVar5 = dgdVar4;
                z7 = z5;
                cgfVarAj = cgfVar4.a(new defpackage.bjl(str, dgdVar4, wdeVar, i26, z5, i27, i23));
                cgfVar5 = cgfVar4;
            } else {
                dgdVar5 = dgdVar4;
                z7 = z5;
                bveVarC.v(357432497);
                cgfVar5 = cgfVar4;
                cgfVarAj = aj(cgfVar5, new defpackage.dfb(str), dgdVar5, null, i26, z7, i27, i23, (defpackage.wde) bveVarC.f(bvmVar), null, null, bjbVar, null);
                ((defpackage.bwc) bveVarC).Y(false);
            }
            defpackage.bdx bdxVar16 = defpackage.bdx.a;
            bwcVar = (defpackage.bwc) bveVarC;
            long j1112 = bwcVar.u;
            long j1113 = j1112 ^ (j1112 >>> c);
            defpackage.cgf cgfVarN16 = defpackage.bzo.n(bveVarC, cgfVarAj);
            defpackage.cdd cddVarAh16 = bwcVar.ah();
            aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, bdxVar16, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh16, defpackage.cwl.d);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN16, defpackage.cwl.c);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j1113), defpackage.cwl.f);
            bwcVar.Y(true);
            cgfVar3 = cgfVar5;
            dgdVar3 = dgdVar5;
            i25 = i26;
            z4 = z7;
            i24 = i27;
        } else {
            bveVarC.s();
            z4 = z;
            i23 = i3;
            cgfVar3 = cgfVar2;
            dgdVar3 = dgdVar2;
            i24 = i16;
            i25 = i11;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: bdf
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    java.lang.String str2 = str;
                    defpackage.cgf cgfVar6 = cgfVar3;
                    defpackage.dgd dgdVar6 = dgdVar3;
                    int i316 = i4 | 1;
                    int i317 = 306783378 & i316;
                    int i318 = 613566756 & i316;
                    defpackage.afw.J(str2, cgfVar6, dgdVar6, i25, z4, i24, i23, bveVar2, (i316 & (-920350135)) | i317 | (i318 >> 1) | ((i317 + i317) & i318), i5);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void K(final defpackage.dfb dfbVar, final defpackage.cgf cgfVar, final defpackage.dgd dgdVar, final defpackage.affc affcVar, final int i, final boolean z, final int i2, final int i3, final java.util.Map map, defpackage.bve bveVar, final int i4, final int i5) {
        int i6;
        boolean z2;
        int i7;
        defpackage.bve bveVar2;
        int i8;
        defpackage.bjb bjbVar;
        boolean z3;
        int i9 = i4 & 6;
        defpackage.bve bveVarC = bveVar.c(-1343466571);
        if (i9 == 0) {
            i6 = (true != bveVarC.C(dfbVar) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != bveVarC.C(dgdVar) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i6 |= true != bveVarC.E(affcVar) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i6 |= true != bveVarC.A(i) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            z2 = z;
            i6 |= true != bveVarC.D(z2) ? 65536 : 131072;
        } else {
            z2 = z;
        }
        if ((1572864 & i4) == 0) {
            i6 |= true != bveVarC.A(i2) ? 524288 : 1048576;
        }
        if ((12582912 & i4) == 0) {
            i6 |= true != bveVarC.A(i3) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            i6 |= true != bveVarC.E(map) ? 33554432 : 67108864;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (true != ((i5 & 8) == 0 ? bveVarC.C(null) : bveVarC.E(null)) ? 2 : 4);
        } else {
            i7 = i5;
        }
        int i10 = i6 | 805306368;
        if (bveVarC.I(((i10 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true, i10 & 1)) {
            int i11 = i10 >> 3;
            int i12 = i10 & 14;
            defpackage.asq.ae(i3, i2);
            defpackage.blh blhVar = (defpackage.blh) bveVarC.f(defpackage.blj.a);
            if (blhVar != null) {
                bveVarC.v(1588272647);
                long j = ((defpackage.blz) bveVarC.f(defpackage.bma.a)).b;
                java.lang.Object[] objArr = {blhVar};
                defpackage.cdz cdzVar = new defpackage.cdz(new defpackage.amc(blhVar, 7), new defpackage.awl(14));
                boolean zE = bveVarC.E(blhVar);
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS = bwcVar.S();
                if (zE || objS == defpackage.bvd.a) {
                    objS = new defpackage.bav(blhVar, 13);
                    bwcVar.ad(objS);
                }
                long jLongValue = ((java.lang.Number) defpackage.bxi.i(objArr, cdzVar, (defpackage.afer) objS, bveVarC, 0)).longValue();
                boolean zB = bveVarC.B(jLongValue) | bveVarC.C(blhVar) | bveVarC.B(j);
                java.lang.Object objS2 = bwcVar.S();
                if (zB || objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.bjb(jLongValue, blhVar, j);
                    bwcVar.ad(objS2);
                }
                bjbVar = (defpackage.bjb) objS2;
                i8 = 0;
                bwcVar.Y(false);
            } else {
                i8 = 0;
                bveVarC.v(1588900273);
                ((defpackage.bwc) bveVarC).Y(false);
                bjbVar = null;
            }
            int length = dfbVar.b.length();
            java.util.List list = dfbVar.a;
            if (list == null) {
                z3 = false;
                break;
            }
            int size = list.size();
            int i13 = i8;
            while (true) {
                if (i13 >= size) {
                    z3 = false;
                    break;
                }
                defpackage.dfa dfaVar = (defpackage.dfa) list.get(i13);
                if ((dfaVar.a instanceof defpackage.dfv) && defpackage.afga.f("androidx.compose.foundation.text.inlineContent", dfaVar.d)) {
                    int i14 = dfaVar.b;
                    int i15 = dfaVar.c;
                    defpackage.dfb dfbVar2 = defpackage.dfc.a;
                    if ((((i14 == i15) | (length == 0)) & (i14 == 0)) | ((i15 > 0) & (i14 < length))) {
                        z3 = true;
                        break;
                    }
                }
                i13++;
            }
            boolean zH = dfbVar.h(dfbVar.a());
            defpackage.wde wdeVar = (defpackage.wde) bveVarC.f(defpackage.dbl.f);
            if (z3 || zH) {
                bveVar2 = bveVarC;
                defpackage.bjb bjbVar2 = bjbVar;
                bveVar2.v(1590195670);
                defpackage.bwc bwcVar2 = (defpackage.bwc) bveVar2;
                java.lang.Object objS3 = bwcVar2.S();
                if (i12 == 4 || objS3 == defpackage.bvd.a) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(dfbVar, defpackage.bxv.c);
                    bwcVar2.ad(parcelableSnapshotMutableState);
                    objS3 = parcelableSnapshotMutableState;
                }
                defpackage.bwx bwxVar = (defpackage.bwx) objS3;
                defpackage.dfb dfbVar3 = (defpackage.dfb) bwxVar.a();
                boolean zC = bveVar2.C(bwxVar);
                java.lang.Object objS4 = bwcVar2.S();
                if (zC || objS4 == defpackage.bvd.a) {
                    objS4 = new defpackage.bbs(bwxVar, 7);
                    bwcVar2.ad(objS4);
                }
                int i16 = i10 << 6;
                S(cgfVar, dfbVar3, affcVar, z3, map, dgdVar, i, z, i2, i3, wdeVar, bjbVar2, (defpackage.affc) objS4, bveVar2, (i11 & 910) | ((i10 >> 12) & 57344) | (458752 & (i10 << 9)) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (1879048192 & i16), ((i10 >> 21) & 896) | ((i7 << 12) & 57344));
                bwcVar2.Y(false);
            } else {
                bveVarC.v(1589148149);
                defpackage.bdi.b(dfbVar, dgdVar, wdeVar, null, z2, bveVarC);
                bveVar2 = bveVarC;
                defpackage.cgf cgfVarAj = aj(cgfVar, dfbVar, dgdVar, affcVar, i, z, i2, i3, wdeVar, null, null, bjbVar, null);
                defpackage.bdx bdxVar = defpackage.bdx.a;
                defpackage.bwc bwcVar3 = (defpackage.bwc) bveVar2;
                long j2 = bwcVar3.u;
                long j3 = j2 ^ (j2 >>> 32);
                defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarAj);
                defpackage.cdd cddVarAh = bwcVar3.ah();
                defpackage.afer aferVar = defpackage.cwl.a;
                bveVar2.w();
                if (bwcVar3.t) {
                    bveVar2.j(aferVar);
                } else {
                    bveVar2.y();
                }
                defpackage.byw.c(bveVar2, bdxVar, defpackage.cwl.e);
                defpackage.byw.c(bveVar2, cddVarAh, defpackage.cwl.d);
                bveVar2.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                defpackage.byw.c(bveVar2, java.lang.Integer.valueOf((int) j3), defpackage.cwl.f);
                bwcVar3.Y(true);
                bwcVar3.Y(false);
            }
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: bdd
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.dfb dfbVar4 = dfbVar;
                    defpackage.cgf cgfVar2 = cgfVar;
                    defpackage.dgd dgdVar2 = dgdVar;
                    defpackage.affc affcVar2 = affcVar;
                    int i17 = i;
                    int i18 = i4;
                    boolean z4 = z;
                    int i19 = i5;
                    int i20 = i18 | 1;
                    int i21 = i19 & 306783378;
                    int i22 = 306783378 & i20;
                    int i23 = i3;
                    int i24 = i19 & 613566756;
                    int i25 = i20 & 613566756;
                    java.util.Map map2 = map;
                    defpackage.afw.K(dfbVar4, cgfVar2, dgdVar2, affcVar2, i17, z4, i2, i23, map2, (defpackage.bve) obj, (i20 & (-920350135)) | i22 | (i25 >> 1) | ((i22 + i22) & i25), (i19 & (-920350135)) | i21 | (i24 >> 1) | ((i21 + i21) & i24));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void L(final defpackage.dkd dkdVar, final defpackage.affc affcVar, final defpackage.cgf cgfVar, final defpackage.dgd dgdVar, defpackage.bef befVar, defpackage.bee beeVar, int i, int i2, defpackage.dki dkiVar, defpackage.affc affcVar2, final defpackage.cka ckaVar, final defpackage.affh affhVar, defpackage.bve bveVar, final int i3, final int i4) {
        int i5;
        final defpackage.bef befVar2;
        final defpackage.bee beeVar2;
        final int i6;
        final int i7;
        final defpackage.dki dkiVar2;
        final defpackage.affc affcVar3;
        defpackage.affc affcVar4;
        defpackage.bef befVar3;
        defpackage.bee beeVar3;
        defpackage.dki dkiVar3;
        int i8;
        int i9;
        defpackage.bve bveVarC = bveVar.c(-971111025);
        if ((i3 & 6) == 0) {
            i5 = (true != bveVarC.C(dkdVar) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i5 |= true != bveVarC.D(false) ? 1024 : 2048;
        }
        int i10 = i5 | 24576;
        if ((i3 & 196608) == 0) {
            i10 |= true != bveVarC.C(dgdVar) ? 65536 : 131072;
        }
        int i11 = i10 | 14155776;
        if ((100663296 & i3) == 0) {
            i11 |= true != bveVarC.D(true) ? 33554432 : 67108864;
        }
        if ((805306368 & i3) == 0) {
            i11 |= 268435456;
        }
        int i12 = i4 | 3510;
        if ((i4 & 24576) == 0) {
            i12 |= true != bveVarC.C(ckaVar) ? 8192 : 16384;
        }
        if ((i4 & 196608) == 0) {
            i12 |= true != bveVarC.E(affhVar) ? 65536 : 131072;
        }
        if (bveVarC.I(((306783379 & i11) == 306783378 && (74899 & i12) == 74898) ? false : true, i11 & 1)) {
            int i13 = (-1879048193) & i11;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i3 & 1) == 0 || bveVarC.F()) {
                defpackage.bef befVar4 = defpackage.bef.a;
                defpackage.bee beeVar4 = defpackage.bee.a;
                defpackage.dki dkiVar4 = defpackage.dkh.a;
                java.lang.Object objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.awl(13);
                    bwcVar.ad(objS);
                }
                affcVar4 = (defpackage.affc) objS;
                befVar3 = befVar4;
                beeVar3 = beeVar4;
                dkiVar3 = dkiVar4;
                i8 = 1;
                i9 = 1;
            } else {
                bveVarC.s();
                befVar3 = befVar;
                beeVar3 = beeVar;
                i8 = i;
                i9 = i2;
                dkiVar3 = dkiVar;
                affcVar4 = affcVar2;
            }
            bveVarC.l();
            boolean z = (i11 & 14) == 4;
            boolean z2 = (i11 & 112) == 32;
            defpackage.djl djlVarA = befVar3.a(true);
            java.lang.Object objS2 = bwcVar.S();
            if ((z | z2) || objS2 == defpackage.bvd.a) {
                objS2 = new defpackage.ajy(dkdVar, affcVar, 19, null);
                bwcVar.ad(objS2);
            }
            int i14 = i12 << 9;
            int i15 = ((i13 >> 6) & 7168) | (i11 & 910) | (i14 & 57344) | (i14 & 458752) | (3670016 & i14) | (i14 & 29360128);
            int i16 = ((i13 >> 15) & 896) | (i11 & 7168) | (i11 & 57344) | (i12 & 458752);
            defpackage.bef befVar5 = befVar3;
            defpackage.dki dkiVar5 = dkiVar3;
            defpackage.affc affcVar5 = affcVar4;
            defpackage.asq.al(dkdVar, (defpackage.affc) objS2, cgfVar, dgdVar, dkiVar5, affcVar5, ckaVar, false, 1, 1, djlVarA, beeVar3, false, affhVar, bveVarC, i15, i16);
            dkiVar2 = dkiVar5;
            affcVar3 = affcVar5;
            beeVar2 = beeVar3;
            befVar2 = befVar5;
            i6 = i8;
            i7 = i9;
        } else {
            bveVarC.s();
            befVar2 = befVar;
            beeVar2 = beeVar;
            i6 = i;
            i7 = i2;
            dkiVar2 = dkiVar;
            affcVar3 = affcVar2;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: bdc
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.dkd dkdVar2 = dkdVar;
                    defpackage.affc affcVar6 = affcVar;
                    defpackage.cgf cgfVar2 = cgfVar;
                    defpackage.dgd dgdVar2 = dgdVar;
                    defpackage.bef befVar6 = befVar2;
                    defpackage.bee beeVar5 = beeVar2;
                    int i17 = i6;
                    int i18 = i7;
                    int i19 = i3;
                    defpackage.dki dkiVar6 = dkiVar2;
                    int i20 = i4;
                    int i21 = i19 | 1;
                    int i22 = i20 & 306783378;
                    int i23 = 306783378 & i21;
                    defpackage.cka ckaVar2 = ckaVar;
                    int i24 = i20 & 613566756;
                    int i25 = i21 & 613566756;
                    defpackage.affh affhVar2 = affhVar;
                    defpackage.afw.L(dkdVar2, affcVar6, cgfVar2, dgdVar2, befVar6, beeVar5, i17, i18, dkiVar6, affcVar3, ckaVar2, affhVar2, (defpackage.bve) obj, (i21 & (-920350135)) | i23 | (i25 >> 1) | ((i23 + i23) & i25), (i20 & (-920350135)) | i22 | (i24 >> 1) | ((i22 + i22) & i24));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void M(final java.lang.String str, final defpackage.affc affcVar, final defpackage.cgf cgfVar, boolean z, final defpackage.dgd dgdVar, defpackage.bef befVar, defpackage.bee beeVar, int i, int i2, defpackage.dki dkiVar, defpackage.affc affcVar2, defpackage.cka ckaVar, final defpackage.affh affhVar, defpackage.bve bveVar, final int i3, final int i4) {
        int i5;
        defpackage.bve bveVar2;
        final boolean z2;
        final defpackage.bef befVar2;
        final defpackage.bee beeVar2;
        final int i6;
        final int i7;
        final defpackage.dki dkiVar2;
        final defpackage.affc affcVar3;
        final defpackage.cka ckaVar2;
        defpackage.cka clfVar;
        int i8;
        defpackage.bee beeVar3;
        defpackage.affc affcVar4;
        defpackage.dki dkiVar3;
        int i9;
        boolean z3;
        defpackage.bef befVar3;
        int i10 = i3 & 6;
        defpackage.bve bveVarC = bveVar.c(2026950908);
        if (i10 == 0) {
            i5 = (true != bveVarC.C(str) ? 2 : 4) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i5 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        int i11 = i5 | 27648;
        if ((i3 & 196608) == 0) {
            i11 |= true != bveVarC.C(dgdVar) ? 65536 : 131072;
        }
        int i12 = 114819072 | i11;
        if ((805306368 & i3) == 0) {
            i12 = i11 | 383254528;
        }
        int i13 = i4 | 28086;
        if ((196608 & i4) == 0) {
            i13 |= true == bveVarC.E(affhVar) ? 131072 : 65536;
        }
        if (bveVarC.I(((306783379 & i12) == 306783378 && (74899 & i13) == 74898) ? false : true, i12 & 1)) {
            int i14 = (-1879048193) & i12;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i3 & 1) == 0 || bveVarC.F()) {
                defpackage.bef befVar4 = defpackage.bef.a;
                defpackage.bee beeVar4 = defpackage.bee.a;
                defpackage.dki dkiVar4 = defpackage.dkh.a;
                java.lang.Object objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.awl(12);
                    bwcVar.ad(objS);
                }
                clfVar = new defpackage.clf(-72057594037927936L);
                i8 = Integer.MAX_VALUE;
                beeVar3 = beeVar4;
                affcVar4 = (defpackage.affc) objS;
                dkiVar3 = dkiVar4;
                i9 = 1;
                z3 = true;
                befVar3 = befVar4;
            } else {
                bveVarC.s();
                z3 = z;
                befVar3 = befVar;
                beeVar3 = beeVar;
                i8 = i;
                i9 = i2;
                dkiVar3 = dkiVar;
                affcVar4 = affcVar2;
                clfVar = ckaVar;
            }
            bveVarC.l();
            java.lang.Object objS2 = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new defpackage.dkd(str, 0L, 6), defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS2 = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS2;
            defpackage.dkd dkdVar = (defpackage.dkd) bwxVar.a();
            int i15 = i13;
            defpackage.dkd dkdVar2 = new defpackage.dkd(new defpackage.dfb(str), dkdVar.b, dkdVar.c);
            boolean zC = bveVarC.C(dkdVar2);
            java.lang.Object objS3 = bwcVar.S();
            if (zC || objS3 == obj) {
                objS3 = new defpackage.ajz(dkdVar2, bwxVar, 8);
                bwcVar.ad(objS3);
            }
            bveVarC.r((defpackage.afer) objS3);
            int i16 = i12 & 14;
            java.lang.Object objS4 = bwcVar.S();
            if (i16 == 4 || objS4 == obj) {
                objS4 = new androidx.compose.runtime.ParcelableSnapshotMutableState(str, defpackage.bxv.c);
                bwcVar.ad(objS4);
            }
            defpackage.bwx bwxVar2 = (defpackage.bwx) objS4;
            defpackage.djl djlVarA = befVar3.a(false);
            boolean zC2 = bveVarC.C(bwxVar2) | ((i12 & 112) == 32);
            java.lang.Object objS5 = bwcVar.S();
            if (zC2 || objS5 == obj) {
                objS5 = new defpackage.acn(affcVar, bwxVar, bwxVar2, 4);
                bwcVar.ad(objS5);
            }
            int i17 = i15 << 9;
            bveVar2 = bveVarC;
            defpackage.asq.al(dkdVar2, (defpackage.affc) objS5, cgfVar, dgdVar, dkiVar3, affcVar4, clfVar, true, i8, i9, djlVarA, beeVar3, z3, affhVar, bveVar2, (i12 & 896) | ((i14 >> 6) & 7168) | (i17 & 57344) | (i17 & 458752) | (3670016 & i17) | (i17 & 29360128), ((i14 >> 15) & 896) | (i12 & 7168) | (i12 & 57344) | (i15 & 458752));
            befVar2 = befVar3;
            dkiVar2 = dkiVar3;
            affcVar3 = affcVar4;
            ckaVar2 = clfVar;
            i6 = i8;
            i7 = i9;
            beeVar2 = beeVar3;
            z2 = z3;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            z2 = z;
            befVar2 = befVar;
            beeVar2 = beeVar;
            i6 = i;
            i7 = i2;
            dkiVar2 = dkiVar;
            affcVar3 = affcVar2;
            ckaVar2 = ckaVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: bdb
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).intValue();
                    java.lang.String str2 = str;
                    defpackage.affc affcVar5 = affcVar;
                    defpackage.cgf cgfVar2 = cgfVar;
                    boolean z4 = z2;
                    defpackage.dgd dgdVar2 = dgdVar;
                    defpackage.bef befVar5 = befVar2;
                    defpackage.bee beeVar5 = beeVar2;
                    int i18 = i6;
                    int i19 = i7;
                    int i20 = i3;
                    defpackage.dki dkiVar5 = dkiVar2;
                    int i21 = i4;
                    int i22 = i20 | 1;
                    int i23 = i21 & 306783378;
                    int i24 = 306783378 & i22;
                    defpackage.cka ckaVar3 = ckaVar2;
                    int i25 = i21 & 613566756;
                    int i26 = i22 & 613566756;
                    defpackage.affh affhVar2 = affhVar;
                    defpackage.afw.M(str2, affcVar5, cgfVar2, z4, dgdVar2, befVar5, beeVar5, i18, i19, dkiVar5, affcVar3, ckaVar3, affhVar2, (defpackage.bve) obj2, (i22 & (-920350135)) | i24 | (i26 >> 1) | ((i24 + i24) & i26), (i21 & (-920350135)) | i23 | (i25 >> 1) | ((i23 + i23) & i25));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void N(final defpackage.cgf cgfVar, defpackage.bve bveVar, final int i, final int i2) {
        int i3;
        defpackage.bve bveVarC = bveVar.c(694251107);
        int i4 = 1;
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if (bveVarC.I((i3 & 3) != 2, i3 & 1)) {
            if (i2 != 0) {
                cgfVar = defpackage.cgf.e;
            }
            defpackage.asq.A(cgfVar.a(new defpackage.awi(20.710678f, 25.0f, 20.710678f, 25.0f, true)).a(new defpackage.chl(new defpackage.bdl(((defpackage.blz) bveVarC.f(defpackage.bma.a)).a, i4))), bveVarC);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: bcx
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    defpackage.cgf cgfVar2 = cgfVar;
                    defpackage.afw.N(cgfVar2, (defpackage.bve) obj, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7), i2);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final void O(defpackage.bkc bkcVar, defpackage.cgf cgfVar, final long j, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1776202187);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(bkcVar) : bveVarC.E(bkcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                j = 9205357640488583168L;
            } else {
                bveVarC.s();
            }
            bveVarC.l();
            int i4 = i2 & 14;
            boolean z = i4 == 4 || ((i2 & 8) != 0 && bveVarC.E(bkcVar));
            java.lang.Object objS = bwcVar.S();
            if (z || objS == defpackage.bvd.a) {
                objS = new defpackage.bbs(bkcVar, 5);
                bwcVar.ad(objS);
            }
            java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dea.a;
            final defpackage.cgf cgfVarA = cgfVar.a(new defpackage.ddo(false, (defpackage.affc) objS));
            defpackage.axd.v(bkcVar, defpackage.cfs.b, defpackage.dai.as(-1653527038, true, new defpackage.affg() { // from class: bcy
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    int i5 = iIntValue & 3;
                    if (bveVar2.I(i5 != 2, iIntValue & 1)) {
                        defpackage.cgf cgfVar2 = cgfVarA;
                        long j2 = j;
                        if (j2 != 9205357640488583168L) {
                            bveVar2.v(-1244013944);
                            defpackage.cgf cgfVarS = defpackage.awj.s(cgfVar2, java.lang.Float.intBitsToFloat((int) (j2 >> 32)) + 0.0f, java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) + 0.0f, 0.0f, 0.0f, 12);
                            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.b, false);
                            long jB = bveVar2.b();
                            long j3 = jB ^ (jB >>> 32);
                            defpackage.cdd cddVarN = bveVar2.N();
                            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarS);
                            defpackage.afer aferVar = defpackage.cwl.a;
                            bveVar2.M();
                            bveVar2.w();
                            if (bveVar2.G()) {
                                bveVar2.j(aferVar);
                            } else {
                                bveVar2.y();
                            }
                            defpackage.byw.c(bveVar2, ctyVarB, defpackage.cwl.e);
                            defpackage.byw.c(bveVar2, cddVarN, defpackage.cwl.d);
                            defpackage.byw.c(bveVar2, java.lang.Integer.valueOf((int) j3), defpackage.cwl.f);
                            bveVar2.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
                            defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
                            defpackage.afw.N(null, bveVar2, 0, 1);
                            bveVar2.n();
                            bveVar2.o();
                        } else {
                            bveVar2.v(-1243644858);
                            defpackage.afw.N(cgfVar2, bveVar2, 0, 0);
                            bveVar2.o();
                        }
                    } else {
                        bveVar2.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVarC), bveVarC, i4 | 432);
        } else {
            bveVarC.s();
        }
        long j2 = j;
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.btm(bkcVar, cgfVar, j2, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final defpackage.cgf P(defpackage.cgf cgfVar, boolean z, defpackage.ask askVar, defpackage.akl aklVar, boolean z2, defpackage.ddw ddwVar, defpackage.afer aferVar) {
        defpackage.cgf cgfVarA;
        if (aklVar instanceof defpackage.akr) {
            cgfVarA = new defpackage.bck(z, askVar, aklVar, z2, ddwVar, aferVar);
        } else if (aklVar == 0) {
            cgfVarA = new defpackage.bck(z, askVar, null, z2, ddwVar, aferVar);
        } else {
            cgfVarA = askVar != null ? defpackage.akn.a(defpackage.cgf.e, askVar, aklVar).a(new defpackage.bck(z, askVar, null, z2, ddwVar, aferVar)) : new defpackage.cgb(new defpackage.bcl(aklVar, z, z2, ddwVar, aferVar));
        }
        return cgfVar.a(cgfVarA);
    }

    public static final defpackage.cgf Q(defpackage.cgf cgfVar) {
        defpackage.awl awlVar = new defpackage.awl(11);
        java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.dea.a;
        return cgfVar.a(new defpackage.ddo(false, awlVar));
    }

    public static final defpackage.cgf R(defpackage.cgf cgfVar, defpackage.bcf bcfVar) {
        return cgfVar.a(new defpackage.bcd(bcfVar));
    }

    public static final void S(final defpackage.cgf cgfVar, final defpackage.dfb dfbVar, final defpackage.affc affcVar, final boolean z, final java.util.Map map, final defpackage.dgd dgdVar, final int i, final boolean z2, final int i2, final int i3, final defpackage.wde wdeVar, final defpackage.bjb bjbVar, final defpackage.affc affcVar2, defpackage.bve bveVar, final int i4, final int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z3;
        defpackage.bfk bfkVar;
        defpackage.afer aferVar;
        defpackage.afer aferVar2;
        defpackage.afau afauVar;
        java.lang.Object obj;
        defpackage.affc affcVar3;
        java.lang.Object bflVar;
        boolean z4;
        java.util.List arrayList;
        int i10;
        java.util.Map map2 = map;
        int i11 = i4 & 6;
        defpackage.bve bveVarC = bveVar.c(-2118572703);
        if (i11 == 0) {
            i6 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != bveVarC.C(dfbVar) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != bveVarC.E(affcVar) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i6 |= true != bveVarC.D(z) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            i6 |= true != bveVarC.E(map2) ? 8192 : 16384;
        }
        if ((196608 & i4) == 0) {
            i6 |= true != bveVarC.C(dgdVar) ? 65536 : 131072;
        }
        if ((1572864 & i4) == 0) {
            i6 |= true != bveVarC.A(i) ? 524288 : 1048576;
        }
        if ((12582912 & i4) == 0) {
            i6 |= true != bveVarC.D(z2) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            i7 = i2;
            i6 |= true != bveVarC.A(i7) ? 33554432 : 67108864;
        } else {
            i7 = i2;
        }
        if ((805306368 & i4) == 0) {
            i8 = i3;
            i6 |= true != bveVarC.A(i8) ? 268435456 : 536870912;
        } else {
            i8 = i3;
        }
        int i12 = i6;
        if ((i5 & 6) == 0) {
            i9 = (true != bveVarC.E(wdeVar) ? 2 : 4) | i5;
        } else {
            i9 = i5;
        }
        if ((i5 & 48) == 0) {
            i9 |= true != bveVarC.E(bjbVar) ? 16 : 32;
        }
        if ((i5 & 384) == 0) {
            z3 = true;
            i9 |= true != bveVarC.E(null) ? 128 : 256;
        } else {
            z3 = true;
        }
        if ((i5 & 3072) == 0) {
            i9 |= z3 == bveVarC.E(affcVar2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i9 |= true == ((32768 & i5) == 0 ? bveVarC.C(null) : bveVarC.E(null)) ? 16384 : 8192;
        }
        if (bveVarC.I(((306783379 & i12) == 306783378 && (i9 & 9363) == 9362) ? false : true, i12 & 1)) {
            int i13 = i12 & 112;
            if (dfbVar.h(dfbVar.a())) {
                bveVarC.v(145641571);
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS = bwcVar.S();
                if (i13 == 32 || objS == defpackage.bvd.a) {
                    objS = new defpackage.bfk(dfbVar);
                    bwcVar.ad(objS);
                }
                bwcVar.Y(false);
                bfkVar = (defpackage.bfk) objS;
            } else {
                bveVarC.v(145707228);
                ((defpackage.bwc) bveVarC).Y(false);
                bfkVar = null;
            }
            if (dfbVar.h(dfbVar.a())) {
                bveVarC.v(145905443);
                boolean zC = (i13 == 32) | bveVarC.C(bfkVar);
                defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
                java.lang.Object objS2 = bwcVar2.S();
                if (zC || objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.ajz(bfkVar, dfbVar, 9, null);
                    bwcVar2.ad(objS2);
                }
                aferVar = (defpackage.afer) objS2;
                bwcVar2.Y(false);
            } else {
                bveVarC.v(146002721);
                defpackage.bwc bwcVar3 = (defpackage.bwc) bveVarC;
                java.lang.Object objS3 = bwcVar3.S();
                if (i13 == 32 || objS3 == defpackage.bvd.a) {
                    objS3 = new defpackage.bav(dfbVar, 8);
                    bwcVar3.ad(objS3);
                }
                aferVar = (defpackage.afer) objS3;
                bwcVar3.Y(false);
            }
            if (!z) {
                aferVar2 = aferVar;
                afauVar = new defpackage.afau(null, null);
            } else if (map2 == null || map2.isEmpty()) {
                aferVar2 = aferVar;
                afauVar = defpackage.bcz.a;
            } else {
                int length = dfbVar.b.length();
                java.util.List list = dfbVar.a;
                if (list != null) {
                    arrayList = new java.util.ArrayList(list.size());
                    int size = list.size();
                    int i14 = 0;
                    while (i14 < size) {
                        int i15 = size;
                        defpackage.dfa dfaVar = (defpackage.dfa) list.get(i14);
                        java.util.List list2 = list;
                        if (dfaVar.a instanceof defpackage.dfv) {
                            i10 = i14;
                            if (defpackage.afga.f("androidx.compose.foundation.text.inlineContent", dfaVar.d)) {
                                int i16 = dfaVar.b;
                                int i17 = dfaVar.c;
                                defpackage.dfb dfbVar2 = defpackage.dfc.a;
                                boolean z5 = i16 < length;
                                if ((((i16 == i17) | (length == 0)) & (i16 == 0)) | ((i17 > 0) & z5)) {
                                    arrayList.add(defpackage.dai.t(dfaVar));
                                }
                            }
                        } else {
                            i10 = i14;
                        }
                        i14 = i10 + 1;
                        list = list2;
                        size = i15;
                    }
                } else {
                    arrayList = defpackage.afce.a;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                int size2 = arrayList.size();
                int i18 = 0;
                while (i18 < size2) {
                    int i19 = size2;
                    defpackage.dfa dfaVar2 = (defpackage.dfa) arrayList.get(i18);
                    java.util.List list3 = arrayList;
                    defpackage.bil bilVar = (defpackage.bil) map2.get(dfaVar2.a);
                    int i20 = i18;
                    if (bilVar != null) {
                        int i21 = dfaVar2.b;
                        int i22 = dfaVar2.c;
                        arrayList2.add(new defpackage.dfa(bilVar.a, i21, i22, ""));
                        arrayList3.add(new defpackage.dfa(bilVar.b, i21, i22, ""));
                    }
                    i18 = i20 + 1;
                    map2 = map;
                    arrayList = list3;
                    size2 = i19;
                    aferVar = aferVar;
                }
                aferVar2 = aferVar;
                afauVar = new defpackage.afau(arrayList2, arrayList3);
            }
            java.lang.Object obj2 = afauVar.b;
            java.util.List list4 = (java.util.List) afauVar.a;
            java.util.List list5 = (java.util.List) obj2;
            if (z) {
                bveVarC.v(146318828);
                defpackage.bwc bwcVar4 = (defpackage.bwc) bveVarC;
                java.lang.Object objS4 = bwcVar4.S();
                if (objS4 == defpackage.bvd.a) {
                    java.lang.Object parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.bxv.c);
                    bwcVar4.ad(parcelableSnapshotMutableState);
                    objS4 = parcelableSnapshotMutableState;
                }
                bwcVar4.Y(false);
                obj = (defpackage.bwx) objS4;
            } else {
                bveVarC.v(146406588);
                ((defpackage.bwc) bveVarC).Y(false);
                obj = null;
            }
            if (z) {
                bveVarC.v(146499837);
                boolean zC2 = bveVarC.C(obj);
                defpackage.bwc bwcVar5 = (defpackage.bwc) bveVarC;
                java.lang.Object objS5 = bwcVar5.S();
                if (zC2 || objS5 == defpackage.bvd.a) {
                    objS5 = new defpackage.bbs(obj, 8);
                    bwcVar5.ad(objS5);
                }
                bwcVar5.Y(false);
                affcVar3 = (defpackage.affc) objS5;
            } else {
                bveVarC.v(146571260);
                ((defpackage.bwc) bveVarC).Y(false);
                affcVar3 = null;
            }
            int i23 = i12 >> 3;
            defpackage.bdi.b(dfbVar, dgdVar, wdeVar, list4, z2, bveVarC);
            defpackage.dfb dfbVar3 = (defpackage.dfb) aferVar2.invoke();
            boolean zE = bveVarC.E(bfkVar) | ((i12 & 896) == 256);
            defpackage.bwc bwcVar6 = (defpackage.bwc) bveVarC;
            java.lang.Object objS6 = bwcVar6.S();
            if (zE || objS6 == defpackage.bvd.a) {
                objS6 = new defpackage.ajy(bfkVar, affcVar, 20, null);
                bwcVar6.ad(objS6);
            }
            defpackage.cgf cgfVarAj = aj(cgfVar, dfbVar3, dgdVar, (defpackage.affc) objS6, i, z2, i7, i8, wdeVar, list4, affcVar3, bjbVar, affcVar2);
            if (z) {
                bveVarC.v(147956465);
                boolean zE2 = bveVarC.E(bfkVar);
                java.lang.Object objS7 = bwcVar6.S();
                if (zE2 || objS7 == defpackage.bvd.a) {
                    objS7 = new defpackage.bav(bfkVar, 10);
                    bwcVar6.ad(objS7);
                }
                defpackage.afer aferVar3 = (defpackage.afer) objS7;
                boolean zC3 = bveVarC.C(obj);
                java.lang.Object objS8 = bwcVar6.S();
                if (zC3 || objS8 == defpackage.bvd.a) {
                    objS8 = new defpackage.bav(obj, 11);
                    bwcVar6.ad(objS8);
                }
                bflVar = new defpackage.bfl(aferVar3, (defpackage.afer) objS8);
                bwcVar6.Y(false);
            } else {
                bveVarC.v(147779703);
                boolean zE3 = bveVarC.E(bfkVar);
                java.lang.Object objS9 = bwcVar6.S();
                if (zE3 || objS9 == defpackage.bvd.a) {
                    objS9 = new defpackage.bav(bfkVar, 9);
                    bwcVar6.ad(objS9);
                }
                bflVar = new defpackage.bei((defpackage.afer) objS9);
                bwcVar6.Y(false);
            }
            long j = bwcVar6.u;
            long j2 = j ^ (j >>> 32);
            defpackage.cdd cddVarAh = bwcVar6.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarAj);
            defpackage.afer aferVar4 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar6.t) {
                bveVarC.j(aferVar4);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, bflVar, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            if (bfkVar == null) {
                bveVarC.v(-433557001);
                z4 = false;
            } else {
                z4 = false;
                bveVarC.v(-291080374);
                bfkVar.b(bveVarC, 0);
            }
            bwcVar6.Y(z4);
            if (list5 == null) {
                bveVarC.v(-433506223);
            } else {
                bveVarC.v(-433506222);
                defpackage.bcz.a(dfbVar, list5, bveVarC, i23 & 14);
            }
            bwcVar6.Y(z4);
            bwcVar6.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: bde
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    ((java.lang.Integer) obj4).intValue();
                    defpackage.cgf cgfVar2 = cgfVar;
                    defpackage.dfb dfbVar4 = dfbVar;
                    defpackage.affc affcVar4 = affcVar;
                    boolean z6 = z;
                    java.util.Map map3 = map;
                    defpackage.dgd dgdVar2 = dgdVar;
                    int i24 = i;
                    boolean z7 = z2;
                    int i25 = i2;
                    int i26 = i4;
                    int i27 = i3;
                    int i28 = i5;
                    int i29 = i26 | 1;
                    int i30 = i28 & 306783378;
                    int i31 = 306783378 & i29;
                    defpackage.bjb bjbVar2 = bjbVar;
                    int i32 = i28 & 613566756;
                    int i33 = i29 & 613566756;
                    defpackage.affc affcVar5 = affcVar2;
                    defpackage.afw.S(cgfVar2, dfbVar4, affcVar4, z6, map3, dgdVar2, i24, z7, i25, i27, wdeVar, bjbVar2, affcVar5, (defpackage.bve) obj3, (i29 & (-920350135)) | i31 | (i33 >> 1) | ((i31 + i31) & i33), (i28 & (-920350135)) | i30 | (i32 >> 1) | ((i30 + i30) & i32));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static final long T(defpackage.bby bbyVar) {
        return (((long) bbyVar.j()) * ((long) bbyVar.l())) + defpackage.afhi.m(bbyVar.c() * bbyVar.l());
    }

    public static final defpackage.bba U(defpackage.azp azpVar, int i, long j, defpackage.bbk bbkVar, long j2, defpackage.apn apnVar, defpackage.cft cftVar, defpackage.cfy cfyVar, defpackage.dlz dlzVar, defpackage.zo zoVar) {
        java.util.List list;
        java.lang.Object objD = bbkVar.d(i);
        java.util.List list2 = (java.util.List) zoVar.a(i);
        if (list2 != null) {
            list = list2;
        } else {
            java.util.List listR = azpVar.r(i);
            int size = listR.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((defpackage.ctx) listR.get(i2)).v(j));
            }
            zoVar.g(i, arrayList);
            list = arrayList;
        }
        return new defpackage.bba(i, list, j2, objD, apnVar, cftVar, cfyVar, dlzVar);
    }

    public static final int V(defpackage.bbo bboVar) {
        return (int) (bboVar.e == defpackage.apn.a ? bboVar.d() & 4294967295L : bboVar.d() >> 32);
    }

    public static final boolean W(defpackage.bby bbyVar, aiuw aiuwVar) {
        if (!bbyVar.g()) {
            return false;
        }
        ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.adh(bbyVar, (defpackage.afdk) null, 19), 3);
        return true;
    }

    public static final boolean X(defpackage.bby bbyVar, aiuw aiuwVar) {
        if (!bbyVar.h()) {
            return false;
        }
        ahoc.d(aiuwVar, (defpackage.afdo) null, 0, new defpackage.adh(bbyVar, (defpackage.afdk) null, 20, (byte[]) null), 3);
        return true;
    }

    public static final void Y(defpackage.bby bbyVar, defpackage.cgf cgfVar, defpackage.avv avvVar, defpackage.bbb bbbVar, float f, defpackage.cfy cfyVar, defpackage.ars arsVar, boolean z, defpackage.cqc cqcVar, defpackage.ary aryVar, defpackage.aiz aizVar, defpackage.and andVar, defpackage.affi affiVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        int i4;
        defpackage.avv avvVar2;
        defpackage.bbb bbbVar2;
        defpackage.cfy cfyVar2;
        boolean z2;
        defpackage.cqc cqcVarAc;
        defpackage.ary aryVar2;
        defpackage.aiz aizVar2;
        defpackage.and andVar2;
        defpackage.avv avxVar;
        defpackage.bbb bbbVar3;
        defpackage.cfy cfyVar3;
        defpackage.ary aryVar3;
        defpackage.aiz aizVarA;
        defpackage.and andVarAa;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1864473085);
        boolean z3 = true;
        if (i5 == 0) {
            i3 = i | (true != bveVarC.C(bbyVar) ? 2 : 4);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        int i6 = i3 | 28032;
        if ((i & 196608) == 0) {
            i6 |= true != bveVarC.z(f) ? 65536 : 131072;
        }
        int i7 = i6 | 1572864;
        if ((i & 12582912) == 0) {
            i7 |= true != bveVarC.C(arsVar) ? 4194304 : 8388608;
        }
        if ((i2 & 6) == 0) {
            i4 = (true == bveVarC.E(null) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        int i8 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i8 = i4 | 1408;
        }
        if ((i2 & 24576) == 0) {
            i8 |= 8192;
        }
        if ((i2 & 196608) == 0) {
            i8 |= true == bveVarC.E(affiVar) ? 131072 : 65536;
        }
        int i9 = i7 | 905969664;
        if (bveVarC.I(((306783379 & i9) == 306783378 && (74899 & i8) == 74898) ? false : true, i9 & 1)) {
            int i10 = (-64625) & i8;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                avxVar = new defpackage.avx(0.0f, 0.0f, 0.0f, 0.0f);
                int i11 = i9 & 14;
                defpackage.bbb bbbVar4 = defpackage.bbb.a;
                bbbVar3 = bbbVar4;
                cfyVar3 = defpackage.cfs.n;
                cqcVarAc = ac(bbyVar, defpackage.apn.b, bveVarC, i11 | 432);
                aryVar3 = defpackage.arx.a;
                aizVarA = defpackage.alc.a(bveVarC);
                andVarAa = aa(bbyVar, bveVarC, i11 | 48);
            } else {
                bveVarC.s();
                avxVar = avvVar;
                bbbVar3 = bbbVar;
                cfyVar3 = cfyVar;
                z3 = z;
                cqcVarAc = cqcVar;
                aryVar3 = aryVar;
                aizVarA = aizVar;
                andVarAa = andVar;
            }
            bveVarC.l();
            int i12 = i9 >> 6;
            int i13 = i9 << 12;
            int i14 = i10 << 6;
            int i15 = ((i9 >> 18) & 7168) | ((i9 >> 3) & 14) | 24576 | ((i9 << 3) & 112) | (i9 & 896) | (i12 & 458752) | (i12 & 3670016) | (i13 & 234881024) | (i13 & 1879048192);
            int i16 = ((i9 >> 9) & 14) | 3072 | (i14 & 896) | (i12 & 57344) | ((i10 << 9) & 458752) | (29360128 & i14);
            defpackage.avv avvVar3 = avxVar;
            ad(cgfVar, bbyVar, avvVar3, defpackage.apn.b, arsVar, z3, aizVarA, f, bbbVar3, cqcVarAc, defpackage.cfs.k, cfyVar3, aryVar3, andVarAa, affiVar, bveVarC, i15, i16);
            defpackage.cfy cfyVar4 = cfyVar3;
            aizVar2 = aizVarA;
            cfyVar2 = cfyVar4;
            avvVar2 = avvVar3;
            bbbVar2 = bbbVar3;
            aryVar2 = aryVar3;
            andVar2 = andVarAa;
            z2 = z3;
        } else {
            bveVarC.s();
            avvVar2 = avvVar;
            bbbVar2 = bbbVar;
            cfyVar2 = cfyVar;
            z2 = z;
            cqcVarAc = cqcVar;
            aryVar2 = aryVar;
            aizVar2 = aizVar;
            andVar2 = andVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bbh(bbyVar, cgfVar, avvVar2, bbbVar2, f, cfyVar2, arsVar, z2, cqcVarAc, aryVar2, aizVar2, andVar2, affiVar, i, i2, 0);
        }
    }

    public static final void Z(defpackage.bby bbyVar, defpackage.cgf cgfVar, defpackage.avv avvVar, defpackage.bbb bbbVar, float f, defpackage.cft cftVar, defpackage.ars arsVar, boolean z, defpackage.cqc cqcVar, defpackage.ary aryVar, defpackage.aiz aizVar, defpackage.and andVar, defpackage.affi affiVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        int i4;
        defpackage.avv avvVar2;
        defpackage.bbb bbbVar2;
        defpackage.cft cftVar2;
        boolean z2;
        defpackage.cqc cqcVarAc;
        defpackage.ary aryVar2;
        defpackage.aiz aizVar2;
        defpackage.and andVar2;
        defpackage.avv avxVar;
        defpackage.cft cftVar3;
        defpackage.bbb bbbVar3;
        defpackage.ary aryVar3;
        defpackage.aiz aizVarA;
        defpackage.and andVarAa;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1378394499);
        boolean z3 = true;
        if (i5 == 0) {
            i3 = i | (true != bveVarC.C(bbyVar) ? 2 : 4);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        int i6 = i3 | 28032;
        if ((i & 196608) == 0) {
            i6 |= true != bveVarC.z(f) ? 65536 : 131072;
        }
        int i7 = i6 | 1572864;
        if ((i & 12582912) == 0) {
            i7 |= true != bveVarC.C(arsVar) ? 4194304 : 8388608;
        }
        if ((i2 & 6) == 0) {
            i4 = (true == bveVarC.E(null) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= 16;
        }
        int i8 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i8 = i4 | 1408;
        }
        if ((i2 & 24576) == 0) {
            i8 |= 8192;
        }
        if ((i2 & 196608) == 0) {
            i8 |= true == bveVarC.E(affiVar) ? 131072 : 65536;
        }
        int i9 = i7 | 905969664;
        if (bveVarC.I(((306783379 & i9) == 306783378 && (74899 & i8) == 74898) ? false : true, i9 & 1)) {
            int i10 = (-64625) & i8;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                avxVar = new defpackage.avx(0.0f, 0.0f, 0.0f, 0.0f);
                int i11 = i9 & 14;
                defpackage.bbb bbbVar4 = defpackage.bbb.a;
                cftVar3 = defpackage.cfs.k;
                bbbVar3 = bbbVar4;
                cqcVarAc = ac(bbyVar, defpackage.apn.a, bveVarC, i11 | 432);
                aryVar3 = defpackage.arx.a;
                aizVarA = defpackage.alc.a(bveVarC);
                andVarAa = aa(bbyVar, bveVarC, i11 | 48);
            } else {
                bveVarC.s();
                avxVar = avvVar;
                bbbVar3 = bbbVar;
                cftVar3 = cftVar;
                z3 = z;
                cqcVarAc = cqcVar;
                aryVar3 = aryVar;
                aizVarA = aizVar;
                andVarAa = andVar;
            }
            bveVarC.l();
            int i12 = ((i9 >> 3) & 14) | 24576;
            int i13 = i9 << 3;
            int i14 = i9 & 896;
            int i15 = i9 >> 18;
            int i16 = i9 >> 6;
            int i17 = i9 << 12;
            int i18 = i9 >> 9;
            int i19 = i10 << 6;
            int i20 = (i18 & 7168) | (i18 & 14) | 24576 | (i19 & 896) | ((i10 << 9) & 458752) | (29360128 & i19);
            defpackage.avv avvVar3 = avxVar;
            ad(cgfVar, bbyVar, avvVar3, defpackage.apn.a, arsVar, z3, aizVarA, f, bbbVar3, cqcVarAc, cftVar3, defpackage.cfs.n, aryVar3, andVarAa, affiVar, bveVarC, (i15 & 7168) | i12 | (i13 & 112) | i14 | (i16 & 458752) | (i16 & 3670016) | (i17 & 234881024) | (i17 & 1879048192), i20);
            avvVar2 = avvVar3;
            aizVar2 = aizVarA;
            bbbVar2 = bbbVar3;
            cftVar2 = cftVar3;
            aryVar2 = aryVar3;
            andVar2 = andVarAa;
            z2 = z3;
        } else {
            bveVarC.s();
            avvVar2 = avvVar;
            bbbVar2 = bbbVar;
            cftVar2 = cftVar;
            z2 = z;
            cqcVarAc = cqcVar;
            aryVar2 = aryVar;
            aizVar2 = aizVar;
            andVar2 = andVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.bbh(bbyVar, cgfVar, avvVar2, bbbVar2, f, cftVar2, arsVar, z2, cqcVarAc, aryVar2, aizVar2, andVar2, affiVar, i, i2, 1);
        }
    }

    public static final void a(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str);
    }

    public static final defpackage.and aa(defpackage.bby bbyVar, defpackage.bve bveVar, int i) {
        defpackage.and andVar = (defpackage.and) bveVar.f(defpackage.anf.b);
        defpackage.dlz dlzVar = (defpackage.dlz) bveVar.f(defpackage.dbl.i);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !bveVar.C(bbyVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zC = bveVar.C(andVar) | z | bveVar.A(dlzVar.ordinal());
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (zC || objS == defpackage.bvd.a) {
            objS = new defpackage.bas(bbyVar, andVar, dlzVar);
            bwcVar.ad(objS);
        }
        return (defpackage.bas) objS;
    }

    public static final defpackage.ars ab(final defpackage.bby bbyVar, final float f, defpackage.bve bveVar, int i, int i2) {
        java.lang.Object bbrVar = (i2 & 2) != 0 ? new defpackage.bbr() : null;
        defpackage.kwv kwvVarA = (i2 & 4) != 0 ? defpackage.ads.a(bveVar) : null;
        defpackage.aga agaVar = (i2 & 8) != 0 ? new defpackage.aga(1.0f, 400.0f, java.lang.Float.valueOf(1.0f)) : null;
        if ((i2 & 16) != 0) {
            f = 0.5f;
        }
        if (f < 0.0f || f > 1.0f) {
            defpackage.asq.c(defpackage.a.bF(f, "snapPositionalThreshold should be a number between 0 and 1. You've specified "));
        }
        java.lang.Object obj = (defpackage.dlo) bveVar.f(defpackage.dbl.d);
        final defpackage.dlz dlzVar = (defpackage.dlz) bveVar.f(defpackage.dbl.i);
        boolean zC = ((((i & 14) ^ 6) > 4 && bveVar.C(bbyVar)) || (i & 6) == 4) | bveVar.C(kwvVarA) | bveVar.C(agaVar) | ((((i & 112) ^ 48) > 32 && bveVar.C(bbrVar)) || (i & 48) == 32) | bveVar.C(obj) | bveVar.A(dlzVar.ordinal());
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            objG = new defpackage.ars(new defpackage.arn(bbyVar, new defpackage.affh() { // from class: bbe
                /* JADX WARN: Code duplicated, block: B:28:0x007b  */
                @Override // defpackage.affh
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    float fFloatValue = ((java.lang.Float) obj2).floatValue();
                    float fFloatValue2 = ((java.lang.Float) obj3).floatValue();
                    float fFloatValue3 = ((java.lang.Float) obj4).floatValue();
                    defpackage.bby bbyVar2 = bbyVar;
                    boolean zP = defpackage.asq.p(bbyVar2, fFloatValue);
                    if (bbyVar2.w().e != defpackage.apn.a && dlzVar != defpackage.dlz.a) {
                        zP = !zP;
                    }
                    int i3 = bbyVar2.w().b;
                    float fO = i3 == 0 ? 0.0f : defpackage.asq.o(bbyVar2) / i3;
                    int iAw = defpackage.ca.aw(bbyVar2.o, fFloatValue);
                    if (iAw == 0) {
                        if (java.lang.Math.abs(fO - ((int) fO)) <= f ? java.lang.Math.abs(fO) < java.lang.Math.abs(bbyVar2.d()) ? java.lang.Math.abs(fFloatValue2) >= java.lang.Math.abs(fFloatValue3) : !zP : zP) {
                            fFloatValue2 = fFloatValue3;
                        }
                    } else if (iAw == 1) {
                        fFloatValue2 = fFloatValue3;
                    }
                    return java.lang.Float.valueOf(fFloatValue2);
                }
            }), kwvVarA, agaVar);
            bveVar.x(objG);
        }
        return (defpackage.ars) objG;
    }

    public static final defpackage.cqc ac(defpackage.bby bbyVar, defpackage.apn apnVar, defpackage.bve bveVar, int i) {
        defpackage.dlz dlzVar = (defpackage.dlz) bveVar.f(defpackage.dbl.i);
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !bveVar.C(bbyVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zA = bveVar.A(dlzVar.ordinal()) | z;
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (zA || objS == defpackage.bvd.a) {
            objS = new defpackage.bat(bbyVar, apnVar, dlzVar);
            bwcVar.ad(objS);
        }
        return (defpackage.bat) objS;
    }

    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v15 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v16 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v17 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r15v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v7 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r22v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r25v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r25v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r26v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v25 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v68 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v68 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r2v73 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v73 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r44v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r44v0 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r45v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r45v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r46v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r46v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v8 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v2 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r44v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r44v0 ??, new type: bve
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r45v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r45v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to set immutable type for var: r46v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r46v0 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void ad(defpackage.cgf r29, defpackage.bby r30, defpackage.avv r31, defpackage.apn r32, defpackage.ars r33, boolean r34, defpackage.aiz r35, float r36, defpackage.bbb r37, defpackage.cqc r38, defpackage.cft r39, defpackage.cfy r40, defpackage.ary r41, defpackage.and r42, defpackage.affi r43, defpackage.bve r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afw.ad(cgf, bby, avv, apn, ars, boolean, aiz, float, bbb, cqc, cft, cfy, ary, and, affi, bve, int, int):void");
    }

    public static final void ae(defpackage.affh affhVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-709502251);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != bveVarC.E(affhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (bveVarC.I((i2 & 3) != 2, i2 & 1)) {
            defpackage.bvm bvmVar = defpackage.cdx.a;
            defpackage.cdv cdvVar = (defpackage.cdv) bveVarC.f(bvmVar);
            bveVarC.v(1967007413);
            java.lang.Object[] objArr = new java.lang.Object[0];
            defpackage.cdz cdzVar = defpackage.cdu.d;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.bli(18);
                bwcVar.ad(objS);
            }
            defpackage.cdu cduVar = (defpackage.cdu) defpackage.bxi.i(objArr, cdzVar, (defpackage.afer) objS, bveVarC, 384);
            cduVar.b = (defpackage.cdv) bveVarC.f(bvmVar);
            bwcVar.Y(false);
            java.lang.Object[] objArr2 = {cdvVar};
            defpackage.cdz cdzVar2 = new defpackage.cdz(new defpackage.abw(5), new defpackage.ajy(cdvVar, cduVar, 16));
            boolean zE = bveVarC.E(cdvVar) | bveVarC.E(cduVar);
            java.lang.Object objS2 = bwcVar.S();
            if (zE || objS2 == obj) {
                objS2 = new defpackage.ajz(cdvVar, cduVar, i4);
                bwcVar.ad(objS2);
            }
            defpackage.bag bagVar = (defpackage.bag) defpackage.bxi.i(objArr2, cdzVar2, (defpackage.afer) objS2, bveVarC, 0);
            defpackage.dai.aA(bvmVar.b(bagVar), defpackage.dai.as(-412824043, true, new defpackage.aps(affhVar, bagVar, 6), bveVarC), bveVarC, 56);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.atn(affhVar, i, 3);
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [affc, java.lang.Object] */
    public static final defpackage.bys af(defpackage.agn agnVar, java.lang.Object obj, java.lang.Object obj2, defpackage.afd afdVar, defpackage.bil bilVar, defpackage.bve bveVar, int i) {
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = (i3 > 4 && bveVar.C(agnVar)) || (i & 6) == 4;
        java.lang.Object objG = bveVar.g();
        if (z || objG == defpackage.bvd.a) {
            defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
            defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
            defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
            try {
                defpackage.aep aepVar = (defpackage.aep) bilVar.b.invoke(obj2);
                aepVar.d();
                java.lang.Object aglVar = new defpackage.agl(agnVar, obj, aepVar, bilVar);
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                bveVar.x(aglVar);
                objG = aglVar;
            } catch (java.lang.Throwable th) {
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                throw th;
            }
        }
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        int i6 = (i4 << 9) | i2 | (i4 << 6) | (i5 & 896) | (i5 & 7168) | (57344 & i5);
        defpackage.agl aglVar2 = (defpackage.agl) objG;
        q(agnVar, aglVar2, obj, obj2, afdVar, bveVar, i6);
        boolean zC = bveVar.C(aglVar2) | ((i3 > 4 && bveVar.C(agnVar)) || (i & 6) == 4);
        java.lang.Object objG2 = bveVar.g();
        if (zC || objG2 == defpackage.bvd.a) {
            objG2 = new defpackage.abp(agnVar, aglVar2, 18);
            bveVar.x(objG2);
        }
        defpackage.bvx.c(aglVar2, (defpackage.affc) objG2, bveVar);
        return aglVar2;
    }

    public static final defpackage.agi ag(defpackage.agn agnVar, defpackage.bil bilVar, defpackage.bve bveVar, int i) {
        defpackage.agh aghVarA;
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && bveVar.C(agnVar)) || (i & 6) == 4;
        java.lang.Object objG = bveVar.g();
        if (z || objG == defpackage.bvd.a) {
            objG = new defpackage.agi(agnVar, bilVar);
            bveVar.x(objG);
        }
        defpackage.agi agiVar = (defpackage.agi) objG;
        boolean zE = bveVar.E(agiVar) | ((i2 > 4 && bveVar.C(agnVar)) || (i & 6) == 4);
        java.lang.Object objG2 = bveVar.g();
        if (zE || objG2 == defpackage.bvd.a) {
            objG2 = new defpackage.abp(agnVar, agiVar, 17);
            bveVar.x(objG2);
        }
        defpackage.bvx.c(agiVar, (defpackage.affc) objG2, bveVar);
        if (agnVar.w() && (aghVarA = agiVar.a()) != null) {
            defpackage.agn agnVar2 = agiVar.a;
            aghVarA.a.j(aghVarA.c.invoke(agnVar2.d().f()), aghVarA.c.invoke(agnVar2.d().g()), (defpackage.afd) aghVarA.b.invoke(agnVar2.d()));
        }
        return agiVar;
    }

    public static final java.lang.Object ah(defpackage.aek aekVar, defpackage.kwv kwvVar, boolean z, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        java.lang.Object objD = d(aekVar, new defpackage.aev(kwvVar, aekVar.e, aekVar.a(), aekVar.a), z ? aekVar.b : Long.MIN_VALUE, affcVar, afdkVar);
        return objD == defpackage.afdr.a ? objD : defpackage.afbk.a;
    }

    private static final java.lang.Object ai(defpackage.aeg aegVar, defpackage.affc affcVar, defpackage.afdk afdkVar) {
        if (aegVar.e()) {
            return m(affcVar, afdkVar);
        }
        return defpackage.bxi.d(afdkVar.gT()).a(new defpackage.act(affcVar, 4), afdkVar);
    }

    private static final defpackage.cgf aj(defpackage.cgf cgfVar, defpackage.dfb dfbVar, defpackage.dgd dgdVar, defpackage.affc affcVar, int i, boolean z, int i2, int i3, defpackage.wde wdeVar, java.util.List list, defpackage.affc affcVar2, defpackage.bjb bjbVar, defpackage.affc affcVar3) {
        if (bjbVar == null) {
            return cgfVar.a(defpackage.cgf.e).a(new defpackage.bji(dfbVar, dgdVar, wdeVar, affcVar, i, z, i2, i3, list, affcVar2, affcVar3));
        }
        return cgfVar.a(bjbVar.e).a(new defpackage.biz(dfbVar, dgdVar, wdeVar, affcVar, i, z, i2, i3, list, affcVar2, bjbVar));
    }

    public static final void b(java.lang.String str) {
        throw new java.lang.IllegalStateException(str);
    }

    public static final float c(defpackage.afdo afdoVar) {
        defpackage.cgh cghVar = (defpackage.cgh) afdoVar.get(defpackage.cgh.a);
        float fA = cghVar != null ? cghVar.a() : 1.0f;
        if (fA < 0.0f) {
            b("negative scale factor");
        }
        return fA;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [aeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final java.lang.Object d(final defpackage.aek aekVar, final defpackage.aeg aegVar, long j, final defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.age ageVar;
        defpackage.afgv afgvVar;
        defpackage.aek aekVar2;
        defpackage.afgv afgvVar2;
        ?? r3;
        ?? r5;
        defpackage.aei aeiVar;
        defpackage.aei aeiVar2;
        defpackage.obx obxVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        if (afdkVar instanceof defpackage.age) {
            ageVar = (defpackage.age) afdkVar;
            int i = ageVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ageVar.d = i - Integer.MIN_VALUE;
            } else {
                ageVar = new defpackage.age(afdkVar);
            }
        } else {
            ageVar = new defpackage.age(afdkVar);
        }
        defpackage.age ageVar2 = ageVar;
        java.lang.Object obj3 = ageVar2.c;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = ageVar2.d;
        if (i2 != 0) {
            if (i2 == 1) {
                afgvVar2 = ageVar2.f;
                obj = ageVar2.b;
                java.lang.Object obj4 = ageVar2.a;
                aekVar2 = ageVar2.e;
                obj2 = obj4;
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                afgvVar2 = ageVar2.f;
                obj = ageVar2.b;
                java.lang.Object obj5 = ageVar2.a;
                aekVar2 = ageVar2.e;
                obj2 = obj5;
            }
            try {
                defpackage.afga.cz(obj3);
                r5 = obj;
                r3 = obj2;
            } catch (java.util.concurrent.CancellationException e) {
                e = e;
                aeiVar = (defpackage.aei) afgvVar2.a;
                if (aeiVar != null) {
                    aeiVar.d();
                }
                aeiVar2 = (defpackage.aei) afgvVar2.a;
                if (aeiVar2 != null) {
                    aekVar2.d = false;
                }
                throw e;
            }
        } else {
            defpackage.afga.cz(obj3);
            final java.lang.Object objC = aegVar.c(0L);
            final defpackage.aep aepVarB = aegVar.b(0L);
            final defpackage.afgv afgvVar3 = new defpackage.afgv();
            try {
                if (j == Long.MIN_VALUE) {
                    try {
                        final float fC = c(ageVar2.gT());
                        try {
                            defpackage.affc affcVar2 = new defpackage.affc() { // from class: agd
                                @Override // defpackage.affc
                                public final java.lang.Object invoke(java.lang.Object obj6) {
                                    long jLongValue = ((java.lang.Long) obj6).longValue();
                                    defpackage.aeg aegVar2 = aegVar;
                                    defpackage.bil bilVarG = aegVar2.g();
                                    aegVar2.f();
                                    defpackage.aek aekVar3 = aekVar;
                                    defpackage.aei aeiVar3 = new defpackage.aei(objC, bilVarG, aepVarB, jLongValue, jLongValue, new defpackage.nz(aekVar3, 10));
                                    defpackage.afw.g(aeiVar3, jLongValue, fC, aegVar2, aekVar3, affcVar);
                                    afgvVar3.a = aeiVar3;
                                    return defpackage.afbk.a;
                                }
                            };
                            afgvVar = afgvVar3;
                            ageVar2.e = aekVar;
                            ageVar2.a = aegVar;
                            ageVar2.b = affcVar;
                            ageVar2.f = afgvVar;
                            ageVar2.d = 1;
                            if (ai(aegVar, affcVar2, ageVar2) != afdrVar) {
                            }
                            return afdrVar;
                        } catch (java.util.concurrent.CancellationException e2) {
                            e = e2;
                            afgvVar = afgvVar3;
                            aekVar2 = aekVar;
                            afgvVar2 = afgvVar;
                            aeiVar = (defpackage.aei) afgvVar2.a;
                            if (aeiVar != null) {
                                aeiVar.d();
                            }
                            aeiVar2 = (defpackage.aei) afgvVar2.a;
                            if (aeiVar2 != null && aeiVar2.d == aekVar2.b) {
                                aekVar2.d = false;
                            }
                            throw e;
                        }
                    } catch (java.util.concurrent.CancellationException e3) {
                        e = e3;
                    }
                } else {
                    afgvVar = afgvVar3;
                    defpackage.bil bilVarG = aegVar.g();
                    aegVar.f();
                    defpackage.aei aeiVar3 = new defpackage.aei(objC, bilVarG, aepVarB, j, j, new defpackage.nz(aekVar, 9));
                    g(aeiVar3, j, c(ageVar2.gT()), aegVar, aekVar, affcVar);
                    afgvVar.a = aeiVar3;
                }
                aekVar2 = aekVar;
                r3 = aegVar;
                r5 = affcVar;
                afgvVar2 = afgvVar;
            } catch (java.util.concurrent.CancellationException e4) {
                e = e4;
            }
        }
        do {
            java.lang.Object obj6 = afgvVar2.a;
            obj6.getClass();
            if (!((defpackage.aei) obj6).c()) {
                return defpackage.afbk.a;
            }
            obxVar = new defpackage.obx(afgvVar2, c(ageVar2.gT()), (defpackage.aeg) r3, aekVar2, (defpackage.affc) r5, 1);
            ageVar2.e = aekVar2;
            ageVar2.a = r3;
            ageVar2.b = r5;
            ageVar2.f = afgvVar2;
            ageVar2.d = 2;
        } while (ai(r3, obxVar, ageVar2) != afdrVar);
        return afdrVar;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [affc, java.lang.Object] */
    public static final java.lang.Object e(float f, float f2, float f3, defpackage.aej aejVar, defpackage.affg affgVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.bil bilVar = defpackage.agt.a;
        java.lang.Float f4 = new java.lang.Float(f);
        java.lang.Float f5 = new java.lang.Float(f2);
        java.lang.Float f6 = new java.lang.Float(f3);
        ?? r10 = bilVar.b;
        defpackage.aep aepVarC = (defpackage.aep) r10.invoke(f6);
        if (aepVarC == null) {
            aepVarC = ((defpackage.aep) r10.invoke(f4)).c();
        }
        defpackage.aep aepVar = aepVarC;
        java.lang.Object objD = d(new defpackage.aek(bilVar, f4, aepVar, Long.MIN_VALUE, Long.MIN_VALUE, false), new defpackage.agf(aejVar, bilVar, f4, f5, aepVar), Long.MIN_VALUE, new defpackage.abp(affgVar, bilVar, 14), afdkVar);
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (objD != afdrVar) {
            objD = defpackage.afbk.a;
        }
        return objD == afdrVar ? objD : defpackage.afbk.a;
    }

    public static final java.lang.Object f(defpackage.aek aekVar, java.lang.Object obj, defpackage.aej aejVar, boolean z, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        java.lang.Object objD = d(aekVar, new defpackage.agf(aejVar, aekVar.e, aekVar.a(), obj, aekVar.a), z ? aekVar.b : Long.MIN_VALUE, affcVar, afdkVar);
        return objD == defpackage.afdr.a ? objD : defpackage.afbk.a;
    }

    public static final void g(defpackage.aei aeiVar, long j, float f, defpackage.aeg aegVar, defpackage.aek aekVar, defpackage.affc affcVar) {
        long jA = f == 0.0f ? aegVar.a() : (long) ((j - aeiVar.a) / f);
        aeiVar.d = j;
        aeiVar.b.b(aegVar.c(jA));
        aeiVar.c = aegVar.b(jA);
        if (aegVar.d(jA)) {
            aeiVar.e = aeiVar.d;
            aeiVar.d();
        }
        h(aeiVar, aekVar);
        affcVar.invoke(aeiVar);
    }

    public static final void h(defpackage.aei aeiVar, defpackage.aek aekVar) {
        aekVar.c(aeiVar.a());
        defpackage.aep aepVar = aekVar.a;
        defpackage.aep aepVar2 = aeiVar.c;
        int iB = aepVar.b();
        for (int i = 0; i < iB; i++) {
            aepVar.e(i, aepVar2.a(i));
        }
        aekVar.c = aeiVar.e;
        aekVar.b = aeiVar.d;
        aekVar.d = aeiVar.c();
    }

    public static /* synthetic */ java.lang.Object i(float f, defpackage.aej aejVar, defpackage.affg affgVar, defpackage.afdk afdkVar, int i) {
        if ((i & 8) != 0) {
            aejVar = new defpackage.aga(1.0f, 1500.0f, null);
        }
        return e(0.0f, f, 0.0f, aejVar, affgVar, afdkVar);
    }

    public static /* synthetic */ java.lang.Object j(defpackage.aek aekVar, java.lang.Object obj, defpackage.aej aejVar, boolean z, defpackage.affc affcVar, defpackage.afdk afdkVar, int i) {
        if ((i & 2) != 0) {
            aejVar = new defpackage.aga(1.0f, 1500.0f, null);
        }
        defpackage.aej aejVar2 = aejVar;
        boolean z2 = ((i & 4) == 0) & z;
        if ((i & 8) != 0) {
            affcVar = new defpackage.acq(3);
        }
        return f(aekVar, obj, aejVar2, z2, affcVar, afdkVar);
    }

    public static final defpackage.bys k(defpackage.afo afoVar, float f, float f2, defpackage.afj afjVar, defpackage.bve bveVar, int i) {
        defpackage.afj afjVar2;
        java.lang.Float fValueOf = java.lang.Float.valueOf(f);
        java.lang.Float fValueOf2 = java.lang.Float.valueOf(f2);
        defpackage.bil bilVar = defpackage.agt.a;
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        java.lang.Object obj = defpackage.bvd.a;
        if (objS == obj) {
            defpackage.afk afkVar = new defpackage.afk(afoVar, fValueOf, fValueOf2, bilVar, afjVar);
            fValueOf = fValueOf;
            afjVar2 = afjVar;
            bwcVar.ad(afkVar);
            objS = afkVar;
        } else {
            afjVar2 = afjVar;
        }
        int i2 = i << 3;
        int i3 = (i2 & 458752) | (i & 1022) | (i2 & 57344);
        defpackage.afk afkVar2 = (defpackage.afk) objS;
        boolean z = ((((i3 & 112) ^ 48) > 32 && bveVar.E(fValueOf)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && bveVar.E(fValueOf2)) || (i3 & 384) == 256) | ((((i3 & 57344) ^ 24576) > 16384 && bveVar.E(afjVar2)) || (i3 & 24576) == 16384);
        java.lang.Object objS2 = bwcVar.S();
        if (z || objS2 == obj) {
            defpackage.bvz bvzVar = new defpackage.bvz(fValueOf, afkVar2, fValueOf2, afjVar2, 1);
            bwcVar.ad(bvzVar);
            objS2 = bvzVar;
        }
        bveVar.r((defpackage.afer) objS2);
        boolean zE = bveVar.E(afoVar);
        java.lang.Object objS3 = bwcVar.S();
        if (zE || objS3 == obj) {
            objS3 = new defpackage.abp(afoVar, afkVar2, 13);
            bwcVar.ad(objS3);
        }
        defpackage.bvx.c(afkVar2, (defpackage.affc) objS3, bveVar);
        return afkVar2;
    }

    public static final defpackage.afo l(defpackage.bve bveVar) {
        defpackage.bwc bwcVar = (defpackage.bwc) bveVar;
        java.lang.Object objS = bwcVar.S();
        if (objS == defpackage.bvd.a) {
            objS = new defpackage.afo();
            bwcVar.ad(objS);
        }
        defpackage.afo afoVar = (defpackage.afo) objS;
        afoVar.a(bveVar, 0);
        return afoVar;
    }

    public static final java.lang.Object m(defpackage.affc affcVar, defpackage.afdk afdkVar) {
        defpackage.dbu dbuVar = (defpackage.dbu) afdkVar.gT().get(defpackage.dbu.a);
        if (dbuVar == null) {
            return defpackage.bxi.d(afdkVar.gT()).a(affcVar, afdkVar);
        }
        new defpackage.blm(affcVar, (defpackage.afdk) null, 1);
        return dbuVar.a();
    }

    public static long n(defpackage.agx agxVar) {
        return ((long) (agxVar.f() + agxVar.g())) * 1000000;
    }

    public static defpackage.aep o(defpackage.agu aguVar, defpackage.aep aepVar, defpackage.aep aepVar2, defpackage.aep aepVar3) {
        return aguVar.d(aguVar.a(aepVar, aepVar2, aepVar3), aepVar, aepVar2, aepVar3);
    }

    public static final defpackage.agn p(java.lang.Object obj, java.lang.String str, defpackage.bve bveVar, int i, int i2) {
        java.lang.Object objG = bveVar.g();
        java.lang.Object obj2 = defpackage.bvd.a;
        if (objG == obj2) {
            if ((i2 & 2) != 0) {
                str = null;
            }
            defpackage.agn agnVar = new defpackage.agn(new defpackage.aft(obj), null, str);
            bveVar.x(agnVar);
            objG = agnVar;
        }
        defpackage.agn agnVar2 = (defpackage.agn) objG;
        agnVar2.h(obj, bveVar, (i & 8) | 48 | (i & 14));
        java.lang.Object objG2 = bveVar.g();
        if (objG2 == obj2) {
            objG2 = new defpackage.act(agnVar2, 6);
            bveVar.x(objG2);
        }
        defpackage.bvx.c(agnVar2, (defpackage.affc) objG2, bveVar);
        return agnVar2;
    }

    public static final void q(defpackage.agn agnVar, defpackage.agl aglVar, java.lang.Object obj, java.lang.Object obj2, defpackage.afd afdVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(867041821);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(agnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(aglVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & 512) == 0 ? bveVarC.C(obj) : bveVarC.E(obj)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? bveVarC.C(obj2) : bveVarC.E(obj2)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? bveVarC.C(afdVar) : bveVarC.E(afdVar)) ? 8192 : 16384;
        }
        if (!bveVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            bveVarC.s();
        } else if (agnVar.w()) {
            aglVar.j(obj, obj2, afdVar);
        } else {
            aglVar.k(obj2, afdVar, null, null);
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.ago(agnVar, aglVar, obj, obj2, afdVar, i, 0);
        }
    }

    public static final defpackage.agn r(defpackage.agr agrVar, java.lang.String str, defpackage.bve bveVar, int i) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !bveVar.C(agrVar)) && (i & 6) != 4) {
            z = false;
        }
        java.lang.Object objG = bveVar.g();
        if (z || objG == defpackage.bvd.a) {
            defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
            defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
            defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
            try {
                java.lang.Object agnVar = new defpackage.agn(agrVar, null, str);
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                bveVar.x(agnVar);
                objG = agnVar;
            } catch (java.lang.Throwable th) {
                defpackage.bzd.k(cejVar, cejVarH, affcVarI);
                throw th;
            }
        }
        defpackage.agn agnVar2 = (defpackage.agn) objG;
        bveVar.v(-1356407283);
        agnVar2.h(agrVar.b(), bveVar, 0);
        bveVar.o();
        boolean zC = bveVar.C(agnVar2);
        java.lang.Object objG2 = bveVar.g();
        if (zC || objG2 == defpackage.bvd.a) {
            objG2 = new defpackage.act(agnVar2, 5);
            bveVar.x(objG2);
        }
        defpackage.bvx.c(agnVar2, (defpackage.affc) objG2, bveVar);
        return agnVar2;
    }

    public static boolean s(defpackage.agj agjVar, java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.afga.f(obj, agjVar.f()) && defpackage.afga.f(obj2, agjVar.g());
    }

    public static final defpackage.cgf t(defpackage.cgf cgfVar, defpackage.apn apnVar) {
        return cgfVar.a(apnVar == defpackage.apn.a ? defpackage.cjv.h(defpackage.cgf.e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.alr.a, true, 0, 1042431) : defpackage.cjv.h(defpackage.cgf.e, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, defpackage.alr.b, true, 0, 1042431));
    }

    public static final boolean u(cpu cpuVar) {
        return (cpuVar.g || !cpuVar.f || cpuVar.d) ? false : true;
    }

    public static final boolean v(android.view.KeyEvent keyEvent) {
        long jI = defpackage.tn.i(keyEvent);
        return jI == defpackage.tn.e(23) || jI == defpackage.tn.e(66) || jI == defpackage.tn.e(160) || jI == defpackage.tn.e(62);
    }

    public static final defpackage.cgf w(defpackage.cgf cgfVar, defpackage.ask askVar, defpackage.akl aklVar, boolean z, defpackage.ddw ddwVar, defpackage.afer aferVar) {
        defpackage.cgf cgfVarA;
        if (aklVar instanceof defpackage.akr) {
            cgfVarA = new defpackage.ajm(askVar, (defpackage.akr) aklVar, false, z, null, ddwVar, aferVar);
        } else if (aklVar == null) {
            cgfVarA = new defpackage.ajm(askVar, null, false, z, null, ddwVar, aferVar);
        } else {
            cgfVarA = askVar != null ? defpackage.akn.a(defpackage.cgf.e, askVar, aklVar).a(new defpackage.ajm(askVar, null, false, z, null, ddwVar, aferVar)) : new defpackage.cgb(new defpackage.ajn(aklVar, z, ddwVar, aferVar));
        }
        return cgfVar.a(cgfVarA);
    }

    public static final defpackage.cgf x(defpackage.cgf cgfVar, boolean z, java.lang.String str, defpackage.ask askVar, defpackage.afer aferVar) {
        return cgfVar.a(new defpackage.ajm(askVar, null, true, z, str, null, aferVar));
    }

    public static final void y(long j, defpackage.apn apnVar) {
        if (apnVar == defpackage.apn.a) {
            if (defpackage.dlm.a(j) != Integer.MAX_VALUE) {
                return;
            }
            defpackage.asq.d("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else if (defpackage.dlm.b(j) == Integer.MAX_VALUE) {
            defpackage.asq.d("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final void z(defpackage.cgf cgfVar, defpackage.affc affcVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-932836462);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            defpackage.asq.A(cgfVar.a(new defpackage.chi(affcVar)), bveVarC);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(cgfVar, affcVar, i, i4);
        }
    }
}
