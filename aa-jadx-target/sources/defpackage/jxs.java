package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jxs {
    public static final void a(jxw jxwVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1367406147);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(jxwVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 16 : 32;
        }
        int i4 = 0;
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            gfa gfaVar = (gfa) bveVarC.f(gfc.a);
            boolean zC = bveVarC.C(jxwVar.e);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = new jxm(java.lang.Boolean.FALSE);
                bwcVar.ad(objS);
            }
            jxm jxmVar = (jxm) objS;
            boolean zE = bveVarC.E(jxmVar) | bveVarC.E(jxwVar);
            java.lang.Object objS2 = bwcVar.S();
            if (zE || objS2 == defpackage.bvd.a) {
                objS2 = new defpackage.jxq(jxmVar, jxwVar, i4);
                bwcVar.ad(objS2);
            }
            defpackage.cgf cgfVarS = defpackage.bzd.s(cgfVar, (defpackage.affc) objS2);
            boolean zE2 = bveVarC.E(gfaVar);
            java.lang.Object objS3 = bwcVar.S();
            if (zE2 || objS3 == defpackage.bvd.a) {
                objS3 = new hmz(gfaVar, 14);
                bwcVar.ad(objS3);
            }
            defpackage.affc affcVar = (defpackage.affc) objS3;
            boolean zE3 = bveVarC.E(jxwVar) | bveVarC.E(gfaVar);
            java.lang.Object objS4 = bwcVar.S();
            if (zE3 || objS4 == defpackage.bvd.a) {
                objS4 = new jxr(jxwVar, gfaVar);
                bwcVar.ad(objS4);
            }
            jus.d(affcVar, cgfVarS, (defpackage.affc) objS4, bveVarC, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jtw(jxwVar, cgfVar, i, 18);
        }
    }

    public static int b(android.content.Context context, float f) {
        android.content.res.Resources resources = context.getResources();
        if (resources == null) {
            return 0;
        }
        return (int) (resources.getDisplayMetrics().widthPixels * ((1.0f - f) / 2.0f));
    }

    public static final defpackage.cld c(defpackage.cld cldVar, float f) {
        if (!(cldVar instanceof defpackage.bcr)) {
            return cldVar;
        }
        defpackage.bcr bcrVar = (defpackage.bcr) cldVar;
        return new defpackage.bcr(new kue(f, bcrVar.a), new kue(f, bcrVar.b), new kue(f, bcrVar.c), new kue(f, bcrVar.d));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0124  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:111:0x013f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:129:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x019d  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:136:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:147:0x0207  */
    /* JADX WARN: Code duplicated, block: B:149:0x0213  */
    /* JADX WARN: Code duplicated, block: B:152:0x025e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0274  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0094  */
    /* JADX WARN: Code duplicated, block: B:53:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    public static final void d(defpackage.cne cneVar, boolean z, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z2, defpackage.bsd bsdVar, defpackage.ktz ktzVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        boolean z3;
        int i6;
        defpackage.bsd bsdVarA;
        defpackage.ktz ktzVar2;
        defpackage.bmv bmvVar2;
        int i7;
        int i8;
        int i9;
        boolean z4;
        defpackage.bve bveVar2;
        defpackage.bmv bmvVar3;
        defpackage.cgf cgfVar3;
        defpackage.ktf ktfVar2;
        boolean z5;
        defpackage.bsd bsdVar2;
        defpackage.ktz ktzVar3;
        defpackage.ask askVar2;
        defpackage.bxl bxlVarJ;
        int i10;
        int i11;
        int i12;
        int i13;
        defpackage.bwc bwcVar;
        int i14;
        defpackage.ktf ktfVar3;
        int i15;
        defpackage.ktz ktzVarG;
        defpackage.bmv bmvVar4;
        defpackage.ask askVar3;
        java.lang.Object objS;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean zE;
        cneVar.getClass();
        affcVar.getClass();
        int i20 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1160016035);
        if (i20 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.E(affcVar) ? 128 : 256;
        }
        int i21 = i3 & 8;
        if (i21 == 0) {
            if ((i & 3072) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
            }
            if ((i & 24576) == 0) {
                i19 = 8192;
                if ((i3 & 16) == 0) {
                    if ((32768 & i) == 0) {
                        zE = bveVarC.C(ktfVar);
                    } else {
                        zE = bveVarC.E(ktfVar);
                    }
                    if (zE) {
                        i19 = 16384;
                    }
                }
                i4 |= i19;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i5 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(z2)) {
                    i6 = 65536;
                } else {
                    i6 = 131072;
                }
                i4 |= i6;
            }
            if ((1572864 & i) == 0) {
                i18 = 524288;
                if ((i3 & 64) == 0) {
                    bsdVarA = bsdVar;
                    if (bveVarC.C(bsdVarA)) {
                        i18 = 1048576;
                    }
                } else {
                    bsdVarA = bsdVar;
                }
                i4 |= i18;
            } else {
                bsdVarA = bsdVar;
            }
            if ((i & 12582912) == 0) {
                i17 = 4194304;
                if ((i3 & 128) == 0) {
                    ktzVar2 = ktzVar;
                    if (bveVarC.C(ktzVar2)) {
                        i17 = 8388608;
                    }
                } else {
                    ktzVar2 = ktzVar;
                }
                i4 |= i17;
            } else {
                ktzVar2 = ktzVar;
            }
            if ((i & 100663296) == 0) {
                i16 = 33554432;
                if ((i3 & 256) == 0) {
                    bmvVar2 = bmvVar;
                    if (bveVarC.C(bmvVar2)) {
                        i16 = 67108864;
                    }
                } else {
                    bmvVar2 = bmvVar;
                }
                i4 |= i16;
            } else {
                bmvVar2 = bmvVar;
            }
            i7 = i3 & 512;
            if (i7 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (true != bveVarC.C(askVar)) {
                    i8 = 268435456;
                } else {
                    i8 = 536870912;
                }
                i4 |= i8;
            }
            i9 = i2 | 6;
            if ((306783379 & i4) == 306783378 || (i9 & 3) != 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (bveVarC.I(z4, i4 & 1)) {
                i10 = i3 & 256;
                i11 = i3 & 128;
                i12 = i3 & 64;
                i13 = i3 & 16;
                bwcVar = (defpackage.bwc) bveVarC;
                i14 = i4;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i21 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i13 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                        i14 &= -57345;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    boolean z6 = (!z3) | z2;
                    if (i12 != 0) {
                        int i22 = defpackage.kun.a;
                        bsdVarA = defpackage.kun.a(bveVarC);
                        i14 &= -3670017;
                    }
                    i15 = i14;
                    if (i11 != 0) {
                        defpackage.afar afarVar = defpackage.ktz.a;
                        bveVar2 = bveVarC;
                        ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVar2, 32767);
                        i15 &= -29360129;
                    } else {
                        bveVar2 = bveVarC;
                        ktzVarG = ktzVar2;
                    }
                    if (i10 != 0) {
                        defpackage.avv avvVar = defpackage.bms.a;
                        int i23 = (-234881025) & i15;
                        bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        i14 = i23;
                    } else {
                        i14 = i15;
                        bmvVar4 = bmvVar2;
                    }
                    if (i7 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    z5 = z6;
                    ktfVar2 = ktfVar3;
                    cgfVar3 = cgfVar2;
                    bsdVar2 = bsdVarA;
                    ktzVar3 = ktzVarG;
                    askVar2 = askVar3;
                    bmvVar3 = bmvVar4;
                } else {
                    bveVarC.s();
                    if (i13 != 0) {
                        i14 &= -57345;
                    }
                    if (i12 != 0) {
                        i14 &= -3670017;
                    }
                    if (i11 != 0) {
                        i14 &= -29360129;
                    }
                    if (i10 != 0) {
                        i14 &= -234881025;
                    }
                    defpackage.cgf cgfVar4 = cgfVar2;
                    bmvVar3 = bmvVar2;
                    cgfVar3 = cgfVar4;
                    ktfVar2 = ktfVar;
                    z5 = z2;
                    bsdVar2 = bsdVarA;
                    bveVar2 = bveVarC;
                    ktzVar3 = ktzVar2;
                    askVar2 = askVar;
                }
                bveVar2.l();
                int i24 = i14 << 3;
                defpackage.ktf ktfVar4 = defpackage.ktf.a;
                e(cneVar, null, z, affcVar, cgfVar3, ktfVar2, z5, bsdVar2, ktzVar3, bmvVar3, askVar2, bveVar2, (i14 & 14) | 56 | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (3670016 & i24) | (29360128 & i24) | (234881024 & i24) | (i24 & 1879048192), ((i14 >> 27) & 14) | ((i9 << 3) & 112));
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                defpackage.cgf cgfVar5 = cgfVar2;
                bmvVar3 = bmvVar2;
                cgfVar3 = cgfVar5;
                ktfVar2 = ktfVar;
                z5 = z2;
                bsdVar2 = bsdVarA;
                ktzVar3 = ktzVar2;
                askVar2 = askVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new kup(cneVar, z, affcVar, cgfVar3, ktfVar2, z5, bsdVar2, ktzVar3, bmvVar3, askVar2, i, i2, i3);
            }
        }
        i4 |= 3072;
        cgfVar2 = cgfVar;
        if ((i & 24576) == 0) {
            i19 = 8192;
            if ((i3 & 16) == 0) {
                if ((32768 & i) == 0) {
                    zE = bveVarC.C(ktfVar);
                } else {
                    zE = bveVarC.E(ktfVar);
                }
                if (zE) {
                    i19 = 16384;
                }
            }
            i4 |= i19;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i5 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(z2)) {
                i6 = 65536;
            } else {
                i6 = 131072;
            }
            i4 |= i6;
        }
        if ((1572864 & i) == 0) {
            i18 = 524288;
            if ((i3 & 64) == 0) {
                bsdVarA = bsdVar;
                if (bveVarC.C(bsdVarA)) {
                    i18 = 1048576;
                }
            } else {
                bsdVarA = bsdVar;
            }
            i4 |= i18;
        } else {
            bsdVarA = bsdVar;
        }
        if ((i & 12582912) == 0) {
            i17 = 4194304;
            if ((i3 & 128) == 0) {
                ktzVar2 = ktzVar;
                if (bveVarC.C(ktzVar2)) {
                    i17 = 8388608;
                }
            } else {
                ktzVar2 = ktzVar;
            }
            i4 |= i17;
        } else {
            ktzVar2 = ktzVar;
        }
        if ((i & 100663296) == 0) {
            i16 = 33554432;
            if ((i3 & 256) == 0) {
                bmvVar2 = bmvVar;
                if (bveVarC.C(bmvVar2)) {
                    i16 = 67108864;
                }
            } else {
                bmvVar2 = bmvVar;
            }
            i4 |= i16;
        } else {
            bmvVar2 = bmvVar;
        }
        i7 = i3 & 512;
        if (i7 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (true != bveVarC.C(askVar)) {
                i8 = 268435456;
            } else {
                i8 = 536870912;
            }
            i4 |= i8;
        }
        i9 = i2 | 6;
        if ((306783379 & i4) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (bveVarC.I(z4, i4 & 1)) {
            i10 = i3 & 256;
            i11 = i3 & 128;
            i12 = i3 & 64;
            i13 = i3 & 16;
            bwcVar = (defpackage.bwc) bveVarC;
            i14 = i4;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i21 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i13 != 0) {
                    ktfVar3 = defpackage.ktf.c;
                    i14 &= -57345;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z7 = (!z3) | z2;
                if (i12 != 0) {
                    int i25 = defpackage.kun.a;
                    bsdVarA = defpackage.kun.a(bveVarC);
                    i14 &= -3670017;
                }
                i15 = i14;
                if (i11 != 0) {
                    defpackage.afar afarVar2 = defpackage.ktz.a;
                    bveVar2 = bveVarC;
                    ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVar2, 32767);
                    i15 &= -29360129;
                } else {
                    bveVar2 = bveVarC;
                    ktzVarG = ktzVar2;
                }
                if (i10 != 0) {
                    defpackage.avv avvVar2 = defpackage.bms.a;
                    int i26 = (-234881025) & i15;
                    bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i14 = i26;
                } else {
                    i14 = i15;
                    bmvVar4 = bmvVar2;
                }
                if (i7 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                z5 = z7;
                ktfVar2 = ktfVar3;
                cgfVar3 = cgfVar2;
                bsdVar2 = bsdVarA;
                ktzVar3 = ktzVarG;
                askVar2 = askVar3;
                bmvVar3 = bmvVar4;
            } else {
                if (i21 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i13 != 0) {
                    ktfVar3 = defpackage.ktf.c;
                    i14 &= -57345;
                } else {
                    ktfVar3 = ktfVar;
                }
                boolean z8 = (!z3) | z2;
                if (i12 != 0) {
                    int i27 = defpackage.kun.a;
                    bsdVarA = defpackage.kun.a(bveVarC);
                    i14 &= -3670017;
                }
                i15 = i14;
                if (i11 != 0) {
                    defpackage.afar afarVar3 = defpackage.ktz.a;
                    bveVar2 = bveVarC;
                    ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVar2, 32767);
                    i15 &= -29360129;
                } else {
                    bveVar2 = bveVarC;
                    ktzVarG = ktzVar2;
                }
                if (i10 != 0) {
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    int i28 = (-234881025) & i15;
                    bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    i14 = i28;
                } else {
                    i14 = i15;
                    bmvVar4 = bmvVar2;
                }
                if (i7 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                z5 = z8;
                ktfVar2 = ktfVar3;
                cgfVar3 = cgfVar2;
                bsdVar2 = bsdVarA;
                ktzVar3 = ktzVarG;
                askVar2 = askVar3;
                bmvVar3 = bmvVar4;
            }
            bveVar2.l();
            int i29 = i14 << 3;
            defpackage.ktf ktfVar5 = defpackage.ktf.a;
            e(cneVar, null, z, affcVar, cgfVar3, ktfVar2, z5, bsdVar2, ktzVar3, bmvVar3, askVar2, bveVar2, (i14 & 14) | 56 | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (29360128 & i29) | (234881024 & i29) | (i29 & 1879048192), ((i14 >> 27) & 14) | ((i9 << 3) & 112));
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            defpackage.cgf cgfVar6 = cgfVar2;
            bmvVar3 = bmvVar2;
            cgfVar3 = cgfVar6;
            ktfVar2 = ktfVar;
            z5 = z2;
            bsdVar2 = bsdVarA;
            ktzVar3 = ktzVar2;
            askVar2 = askVar;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kup(cneVar, z, affcVar, cgfVar3, ktfVar2, z5, bsdVar2, ktzVar3, bmvVar3, askVar2, i, i2, i3);
        }
    }

    public static final void e(defpackage.cne cneVar, defpackage.dfb dfbVar, boolean z, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z2, defpackage.bsd bsdVar, defpackage.ktz ktzVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        boolean z3;
        defpackage.affc affcVar2;
        defpackage.cgf cgfVar2;
        boolean z4;
        int i4;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1839742527);
        if (i5 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C(dfbVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i3 |= true != bveVarC.D(z3) ? 128 : 256;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            affcVar2 = affcVar;
            i3 |= true != bveVarC.E(affcVar2) ? 1024 : 2048;
        } else {
            affcVar2 = affcVar;
        }
        if ((i & 24576) == 0) {
            cgfVar2 = cgfVar;
            i3 |= true != bveVarC.C(cgfVar2) ? 8192 : 16384;
        } else {
            cgfVar2 = cgfVar;
        }
        if ((196608 & i) == 0) {
            i3 |= true != ((262144 & i) == 0 ? bveVarC.C(ktfVar) : bveVarC.E(ktfVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            z4 = z2;
            i3 |= true != bveVarC.D(z4) ? 524288 : 1048576;
        } else {
            z4 = z2;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != bveVarC.C(bsdVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= true != bveVarC.C(ktzVar) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i3 |= true != bveVarC.C(bmvVar) ? 268435456 : 536870912;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != bveVarC.C(askVar) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != bveVarC.C(null) ? 16 : 32;
        }
        if (bveVarC.I(((306783379 & i6) == 306783378 && (i4 & 19) == 18) ? false : true, i6 & 1)) {
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            defpackage.avv avvVarD = defpackage.khg.d(ktfVar, dfbVar != null ? dfbVar.a() : 0, cneVar != null);
            defpackage.ccz cczVarAs = defpackage.dai.as(1714381027, true, new defpackage.jtt(cneVar, dfbVar, ktfVar, 5, null), bveVarC);
            defpackage.ktf ktfVar2 = defpackage.ktf.a;
            int i7 = i6 >> 3;
            defpackage.affc affcVar3 = affcVar2;
            boolean z5 = z3;
            f(z5, affcVar3, cgfVar2, ktfVar, avvVarD, z4, bsdVar, ktzVar, bmvVar, askVar, false, cczVarAs, bveVarC, ((i6 >> 6) & 8190) | (458752 & i7) | (3670016 & i7) | (29360128 & i7) | (i7 & 234881024) | (1879048192 & (i4 << 27)), ((i4 >> 3) & 14) | 384, 2048);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kuq(cneVar, dfbVar, z, affcVar, cgfVar, ktfVar, z2, bsdVar, ktzVar, bmvVar, askVar, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0122  */
    /* JADX WARN: Code duplicated, block: B:102:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:108:0x0139  */
    /* JADX WARN: Code duplicated, block: B:110:0x013d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0144  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:115:0x014c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0151  */
    /* JADX WARN: Code duplicated, block: B:119:0x0158  */
    /* JADX WARN: Code duplicated, block: B:121:0x0160  */
    /* JADX WARN: Code duplicated, block: B:123:0x0169  */
    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0171  */
    /* JADX WARN: Code duplicated, block: B:129:0x0178  */
    /* JADX WARN: Code duplicated, block: B:131:0x0183  */
    /* JADX WARN: Code duplicated, block: B:133:0x0188  */
    /* JADX WARN: Code duplicated, block: B:136:0x0193  */
    /* JADX WARN: Code duplicated, block: B:140:0x019c  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:151:0x01df  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:157:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:161:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:163:0x0200  */
    /* JADX WARN: Code duplicated, block: B:164:0x0213  */
    /* JADX WARN: Code duplicated, block: B:166:0x0218  */
    /* JADX WARN: Code duplicated, block: B:167:0x0234  */
    /* JADX WARN: Code duplicated, block: B:169:0x0237  */
    /* JADX WARN: Code duplicated, block: B:171:0x023f  */
    /* JADX WARN: Code duplicated, block: B:173:0x024b  */
    /* JADX WARN: Code duplicated, block: B:175:0x024f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0257  */
    /* JADX WARN: Code duplicated, block: B:179:0x0269  */
    /* JADX WARN: Code duplicated, block: B:180:0x026c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:181:0x026e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0271  */
    /* JADX WARN: Code duplicated, block: B:184:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:187:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x010f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    public static final void f(final boolean z, final defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, defpackage.avv avvVar, boolean z2, defpackage.bsd bsdVar, defpackage.ktz ktzVar, defpackage.bmv bmvVar, defpackage.ask askVar, boolean z3, final defpackage.affh affhVar, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        defpackage.avv avvVar2;
        int i6;
        int i7;
        boolean z4;
        int i8;
        defpackage.bsd bsdVar2;
        defpackage.ktz ktzVar2;
        defpackage.bmv bmvVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z5;
        defpackage.bve bveVar2;
        defpackage.ktf ktfVar2;
        boolean z6;
        boolean z7;
        defpackage.cgf cgfVar3;
        defpackage.avv avvVar3;
        final defpackage.ktz ktzVar3;
        defpackage.bmv bmvVar3;
        final defpackage.bsd bsdVar3;
        defpackage.ask askVar2;
        defpackage.bxl bxlVarJ;
        int i19;
        defpackage.bwc bwcVar;
        int i20;
        int i21;
        int i22;
        defpackage.ktf ktfVar3;
        defpackage.avv avvVar4;
        boolean z8;
        final boolean z9;
        defpackage.bsd bsdVarA;
        defpackage.bve bveVar3;
        defpackage.ktz ktzVarG;
        defpackage.bmv bmvVar4;
        final defpackage.ask askVar3;
        final defpackage.bmv bmvVar5;
        final defpackage.cgf cgfVar4;
        final defpackage.ktf ktfVar4;
        final defpackage.avv avvVar5;
        final boolean z10;
        java.lang.Object objS;
        long j;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean zE;
        affcVar.getClass();
        affhVar.getClass();
        int i27 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1249479376);
        if (i27 == 0) {
            i4 = (true != bveVarC.D(z) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.E(affcVar) ? 16 : 32;
        }
        int i28 = i3 & 4;
        if (i28 == 0) {
            if ((i & 384) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 128 : 256;
            }
            if ((i & 3072) == 0) {
                i26 = 1024;
                if ((i3 & 8) == 0) {
                    if ((i & 4096) == 0) {
                        zE = bveVarC.C(ktfVar);
                    } else {
                        zE = bveVarC.E(ktfVar);
                    }
                    if (zE) {
                        i26 = 2048;
                    }
                }
                i4 |= i26;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i & 24576) == 0) {
                    avvVar2 = avvVar;
                    if (true != bveVarC.C(avvVar2)) {
                        i6 = 8192;
                    } else {
                        i6 = 16384;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (i7 != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (true != bveVarC.D(z2)) {
                        i8 = 65536;
                    } else {
                        i8 = 131072;
                    }
                    i4 |= i8;
                }
                if ((1572864 & i) == 0) {
                    i25 = 524288;
                    if ((i3 & 64) == 0) {
                        bsdVar2 = bsdVar;
                        if (bveVarC.C(bsdVar2)) {
                            i25 = 1048576;
                        }
                    } else {
                        bsdVar2 = bsdVar;
                    }
                    i4 |= i25;
                } else {
                    bsdVar2 = bsdVar;
                }
                if ((i & 12582912) == 0) {
                    i24 = 4194304;
                    if ((i3 & 128) == 0) {
                        ktzVar2 = ktzVar;
                        if (bveVarC.C(ktzVar2)) {
                            i24 = 8388608;
                        }
                    } else {
                        ktzVar2 = ktzVar;
                    }
                    i4 |= i24;
                } else {
                    ktzVar2 = ktzVar;
                }
                if ((i & 100663296) == 0) {
                    i23 = 33554432;
                    if ((i3 & 256) == 0) {
                        bmvVar2 = bmvVar;
                        if (bveVarC.C(bmvVar2)) {
                            i23 = 67108864;
                        }
                    } else {
                        bmvVar2 = bmvVar;
                    }
                    i4 |= i23;
                } else {
                    bmvVar2 = bmvVar;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                    i10 = i9;
                } else {
                    i10 = i9;
                    if ((i & 805306368) == 0) {
                        if (true != bveVarC.C(askVar)) {
                            i11 = 268435456;
                        } else {
                            i11 = 536870912;
                        }
                        i4 |= i11;
                    }
                }
                if ((i3 & 1024) != 0) {
                    i12 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.C(null)) {
                        i13 = 2;
                    } else {
                        i13 = 4;
                    }
                    i12 = i2 | i13;
                } else {
                    i12 = i2;
                }
                i14 = i3 & 2048;
                if (i14 != 0) {
                    i16 = i14;
                    i17 = i12 | 48;
                } else {
                    i15 = i12;
                    i16 = i14;
                    if ((i2 & 48) == 0) {
                        if (true != bveVarC.D(z3)) {
                            i18 = 16;
                        } else {
                            i18 = 32;
                        }
                        i17 = i15 | i18;
                    } else {
                        i17 = i15;
                    }
                }
                if ((i2 & 384) == 0) {
                    i17 |= true != bveVarC.E(affhVar) ? 128 : 256;
                }
                if ((306783379 & i4) == 306783378 || (i17 & 147) != 146) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (bveVarC.I(z5, i4 & 1)) {
                    i19 = i3 & 256;
                    bwcVar = (defpackage.bwc) bveVarC;
                    bwcVar.ab(-127, null, 0, null);
                    if ((i & 1) != 0 || bveVarC.F()) {
                        i20 = i3 & 128;
                        i21 = i3 & 64;
                        i22 = i3 & 8;
                        if (i28 != 0) {
                            cgfVar2 = defpackage.cgf.e;
                        }
                        if (i22 != 0) {
                            ktfVar3 = defpackage.ktf.c;
                        } else {
                            ktfVar3 = ktfVar;
                        }
                        if (i5 != 0) {
                            avvVar4 = defpackage.avu.a;
                        } else {
                            avvVar4 = avvVar2;
                        }
                        z8 = true;
                        z9 = (!z4) | z2;
                        if (i21 != 0) {
                            int i29 = defpackage.kun.a;
                            bsdVarA = defpackage.kun.a(bveVarC);
                        } else {
                            bsdVarA = bsdVar2;
                        }
                        if (i20 != 0) {
                            defpackage.afar afarVar = defpackage.ktz.a;
                            bveVar3 = bveVarC;
                            ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVar3, 32767);
                        } else {
                            bveVar3 = bveVarC;
                            ktzVarG = ktzVar2;
                        }
                        if (i19 != 0) {
                            defpackage.avv avvVar6 = defpackage.bms.a;
                            bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                        } else {
                            bmvVar4 = bmvVar2;
                        }
                        if (i10 != 0) {
                            objS = bwcVar.S();
                            if (objS == defpackage.bvd.a) {
                                objS = new defpackage.asl();
                                bwcVar.ad(objS);
                            }
                            askVar3 = (defpackage.ask) objS;
                        } else {
                            askVar3 = askVar;
                        }
                        if (i16 != 0) {
                            ktzVar3 = ktzVarG;
                            bsdVar3 = bsdVarA;
                            bmvVar5 = bmvVar4;
                            cgfVar4 = cgfVar2;
                            ktfVar4 = ktfVar3;
                            avvVar5 = avvVar4;
                            z10 = false;
                        } else {
                            ktzVar3 = ktzVarG;
                            bsdVar3 = bsdVarA;
                            bmvVar5 = bmvVar4;
                            cgfVar4 = cgfVar2;
                            ktfVar4 = ktfVar3;
                            avvVar5 = avvVar4;
                            z10 = z3;
                        }
                    } else {
                        bveVarC.s();
                        defpackage.bsd bsdVar4 = bsdVar2;
                        bmvVar5 = bmvVar2;
                        bsdVar3 = bsdVar4;
                        askVar3 = askVar;
                        z10 = z3;
                        bveVar3 = bveVarC;
                        cgfVar4 = cgfVar2;
                        avvVar5 = avvVar2;
                        ktzVar3 = ktzVar2;
                        z8 = true;
                        ktfVar4 = ktfVar;
                        z9 = z2;
                    }
                    bveVar3.l();
                    defpackage.bvm bvmVar = defpackage.bpk.b;
                    ktzVar3.getClass();
                    if (!z9) {
                        j = ktzVar3.k;
                    } else if (z) {
                        j = ktzVar3.m;
                    } else {
                        j = ktzVar3.e;
                    }
                    bveVar2 = bveVar3;
                    defpackage.dai.aA(bvmVar.b(defpackage.khg.f(j)), defpackage.dai.as(-1432401424, z8, new defpackage.affg() { // from class: kur
                        @Override // defpackage.affg
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            defpackage.bsd bsdVar5;
                            defpackage.cld cldVarI;
                            boolean z11;
                            long j2;
                            defpackage.bve bveVar4 = (defpackage.bve) obj;
                            int iIntValue = ((java.lang.Integer) obj2).intValue();
                            if (bveVar4.I((iIntValue & 3) != 2, iIntValue & 1)) {
                                defpackage.bsd bsdVar6 = bsdVar3;
                                boolean z12 = z10;
                                defpackage.ktf ktfVar5 = ktfVar4;
                                defpackage.cgf cgfVar5 = cgfVar4;
                                defpackage.ask askVar4 = askVar3;
                                defpackage.bys bysVarI = defpackage.asq.i(askVar4, bveVar4, 0);
                                float f = ktfVar5.h;
                                defpackage.cgf cgfVarN = defpackage.awj.n(defpackage.awj.e(cgfVar5, f, Float.NaN), f, Float.NaN);
                                if (z12) {
                                    float f2 = ktfVar5.o.a;
                                    bsdVar6.getClass();
                                    bsdVar5 = new defpackage.bsd(defpackage.jxs.c(bsdVar6.a, f2), defpackage.jxs.c(bsdVar6.b, f2), defpackage.jxs.c(bsdVar6.c, f2));
                                } else {
                                    bsdVar5 = bsdVar6;
                                }
                                boolean z13 = z;
                                if (((java.lang.Boolean) bysVarI.a()).booleanValue()) {
                                    cldVarI = bsdVar5.b;
                                } else {
                                    cldVarI = z13 ? bsdVar5.c : bsdVar5.a;
                                }
                                bsdVar5.getClass();
                                if ((bsdVar5.a instanceof defpackage.bcr) && (bsdVar5.b instanceof defpackage.bcr) && (bsdVar5.c instanceof defpackage.bcr)) {
                                    bveVar4.v(-1473180677);
                                    bveVar4.t(368120221, bsdVar5);
                                    cldVarI.getClass();
                                    cldVarI = defpackage.jxh.i((defpackage.bcr) cldVarI, bveVar4);
                                    bveVar4.m();
                                    bveVar4.o();
                                } else {
                                    bveVar4.v(-1473101224);
                                    bveVar4.o();
                                }
                                defpackage.ktz ktzVar4 = ktzVar3;
                                if (z13) {
                                    j2 = ktzVar4.n;
                                    z11 = true;
                                } else {
                                    z11 = false;
                                    j2 = ktzVar4.g;
                                }
                                defpackage.kvk kvkVar = ktfVar5.o;
                                long j3 = z11 ? ktzVar4.o : ktzVar4.h;
                                defpackage.affh affhVar2 = affhVar;
                                defpackage.avv avvVar7 = avvVar5;
                                long j4 = j3;
                                defpackage.bmv bmvVar6 = bmvVar5;
                                boolean z14 = z9;
                                defpackage.affc affcVar2 = affcVar;
                                defpackage.cgf cgfVarA = defpackage.kvi.a(cgfVarN, cldVarI, j2, j4, kvkVar, ktfVar5.p, askVar4, z12, z12, bveVar4, 0, 0);
                                ktzVar4.getClass();
                                long j5 = ktzVar4.m;
                                long j6 = ktzVar4.l;
                                defpackage.tw.h(z11, affcVar2, cgfVarA, z14, bsdVar6, new defpackage.bsa(ktzVar4.d, ktzVar4.e, ktzVar4.j, ktzVar4.k, j6, j5), bmvVar6, avvVar7, askVar4, defpackage.dai.as(-1036547310, true, new defpackage.klc(affhVar2, 13), bveVar4), bveVar4, 0, 6);
                            } else {
                                bveVar4.s();
                            }
                            return defpackage.afbk.a;
                        }
                    }, bveVar2), bveVar2, 56);
                    cgfVar3 = cgfVar4;
                    ktfVar2 = ktfVar4;
                    avvVar3 = avvVar5;
                    z7 = z10;
                    z6 = z9;
                    bmvVar3 = bmvVar5;
                    askVar2 = askVar3;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    ktfVar2 = ktfVar;
                    z6 = z2;
                    z7 = z3;
                    cgfVar3 = cgfVar2;
                    avvVar3 = avvVar2;
                    ktzVar3 = ktzVar2;
                    bmvVar3 = bmvVar2;
                    bsdVar3 = bsdVar2;
                    askVar2 = askVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new mwj(z, affcVar, cgfVar3, ktfVar2, avvVar3, z6, bsdVar3, ktzVar3, bmvVar3, askVar2, z7, affhVar, i, i2, i3, 1);
                }
            }
            i4 |= 24576;
            avvVar2 = avvVar;
            i7 = i3 & 32;
            if (i7 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(z2)) {
                    i8 = 65536;
                } else {
                    i8 = 131072;
                }
                i4 |= i8;
            }
            if ((1572864 & i) == 0) {
                i25 = 524288;
                if ((i3 & 64) == 0) {
                    bsdVar2 = bsdVar;
                    if (bveVarC.C(bsdVar2)) {
                        i25 = 1048576;
                    }
                } else {
                    bsdVar2 = bsdVar;
                }
                i4 |= i25;
            } else {
                bsdVar2 = bsdVar;
            }
            if ((i & 12582912) == 0) {
                i24 = 4194304;
                if ((i3 & 128) == 0) {
                    ktzVar2 = ktzVar;
                    if (bveVarC.C(ktzVar2)) {
                        i24 = 8388608;
                    }
                } else {
                    ktzVar2 = ktzVar;
                }
                i4 |= i24;
            } else {
                ktzVar2 = ktzVar;
            }
            if ((i & 100663296) == 0) {
                i23 = 33554432;
                if ((i3 & 256) == 0) {
                    bmvVar2 = bmvVar;
                    if (bveVarC.C(bmvVar2)) {
                        i23 = 67108864;
                    }
                } else {
                    bmvVar2 = bmvVar;
                }
                i4 |= i23;
            } else {
                bmvVar2 = bmvVar;
            }
            i9 = i3 & 512;
            if (i9 != 0) {
                i4 |= 805306368;
                i10 = i9;
            } else {
                i10 = i9;
                if ((i & 805306368) == 0) {
                    if (true != bveVarC.C(askVar)) {
                        i11 = 268435456;
                    } else {
                        i11 = 536870912;
                    }
                    i4 |= i11;
                }
            }
            if ((i3 & 1024) != 0) {
                i12 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.C(null)) {
                    i13 = 2;
                } else {
                    i13 = 4;
                }
                i12 = i2 | i13;
            } else {
                i12 = i2;
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
                i16 = i14;
                i17 = i12 | 48;
            } else {
                i15 = i12;
                i16 = i14;
                if ((i2 & 48) == 0) {
                    if (true != bveVarC.D(z3)) {
                        i18 = 16;
                    } else {
                        i18 = 32;
                    }
                    i17 = i15 | i18;
                } else {
                    i17 = i15;
                }
            }
            if ((i2 & 384) == 0) {
                i17 |= true != bveVarC.E(affhVar) ? 128 : 256;
            }
            if ((306783379 & i4) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (bveVarC.I(z5, i4 & 1)) {
                i19 = i3 & 256;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    i20 = i3 & 128;
                    i21 = i3 & 64;
                    i22 = i3 & 8;
                    if (i28 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i22 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    if (i5 != 0) {
                        avvVar4 = defpackage.avu.a;
                    } else {
                        avvVar4 = avvVar2;
                    }
                    z8 = true;
                    z9 = (!z4) | z2;
                    if (i21 != 0) {
                        int i210 = defpackage.kun.a;
                        bsdVarA = defpackage.kun.a(bveVarC);
                    } else {
                        bsdVarA = bsdVar2;
                    }
                    if (i20 != 0) {
                        defpackage.afar afarVar2 = defpackage.ktz.a;
                        bveVar3 = bveVarC;
                        ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVar3, 32767);
                    } else {
                        bveVar3 = bveVarC;
                        ktzVarG = ktzVar2;
                    }
                    if (i19 != 0) {
                        defpackage.avv avvVar7 = defpackage.bms.a;
                        bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar4 = bmvVar2;
                    }
                    if (i10 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    if (i16 != 0) {
                        ktzVar3 = ktzVarG;
                        bsdVar3 = bsdVarA;
                        bmvVar5 = bmvVar4;
                        cgfVar4 = cgfVar2;
                        ktfVar4 = ktfVar3;
                        avvVar5 = avvVar4;
                        z10 = false;
                    } else {
                        ktzVar3 = ktzVarG;
                        bsdVar3 = bsdVarA;
                        bmvVar5 = bmvVar4;
                        cgfVar4 = cgfVar2;
                        ktfVar4 = ktfVar3;
                        avvVar5 = avvVar4;
                        z10 = z3;
                    }
                } else {
                    i20 = i3 & 128;
                    i21 = i3 & 64;
                    i22 = i3 & 8;
                    if (i28 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i22 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    if (i5 != 0) {
                        avvVar4 = defpackage.avu.a;
                    } else {
                        avvVar4 = avvVar2;
                    }
                    z8 = true;
                    z9 = (!z4) | z2;
                    if (i21 != 0) {
                        int i211 = defpackage.kun.a;
                        bsdVarA = defpackage.kun.a(bveVarC);
                    } else {
                        bsdVarA = bsdVar2;
                    }
                    if (i20 != 0) {
                        defpackage.afar afarVar3 = defpackage.ktz.a;
                        bveVar3 = bveVarC;
                        ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVar3, 32767);
                    } else {
                        bveVar3 = bveVarC;
                        ktzVarG = ktzVar2;
                    }
                    if (i19 != 0) {
                        defpackage.avv avvVar8 = defpackage.bms.a;
                        bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar4 = bmvVar2;
                    }
                    if (i10 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    if (i16 != 0) {
                        ktzVar3 = ktzVarG;
                        bsdVar3 = bsdVarA;
                        bmvVar5 = bmvVar4;
                        cgfVar4 = cgfVar2;
                        ktfVar4 = ktfVar3;
                        avvVar5 = avvVar4;
                        z10 = false;
                    } else {
                        ktzVar3 = ktzVarG;
                        bsdVar3 = bsdVarA;
                        bmvVar5 = bmvVar4;
                        cgfVar4 = cgfVar2;
                        ktfVar4 = ktfVar3;
                        avvVar5 = avvVar4;
                        z10 = z3;
                    }
                }
                bveVar3.l();
                defpackage.bvm bvmVar2 = defpackage.bpk.b;
                ktzVar3.getClass();
                if (!z9) {
                    j = ktzVar3.k;
                } else if (z) {
                    j = ktzVar3.m;
                } else {
                    j = ktzVar3.e;
                }
                bveVar2 = bveVar3;
                defpackage.dai.aA(bvmVar2.b(defpackage.khg.f(j)), defpackage.dai.as(-1432401424, z8, new defpackage.affg() { // from class: kur
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bsd bsdVar5;
                        defpackage.cld cldVarI;
                        boolean z11;
                        long j2;
                        defpackage.bve bveVar4 = (defpackage.bve) obj;
                        int iIntValue = ((java.lang.Integer) obj2).intValue();
                        if (bveVar4.I((iIntValue & 3) != 2, iIntValue & 1)) {
                            defpackage.bsd bsdVar6 = bsdVar3;
                            boolean z12 = z10;
                            defpackage.ktf ktfVar5 = ktfVar4;
                            defpackage.cgf cgfVar5 = cgfVar4;
                            defpackage.ask askVar4 = askVar3;
                            defpackage.bys bysVarI = defpackage.asq.i(askVar4, bveVar4, 0);
                            float f = ktfVar5.h;
                            defpackage.cgf cgfVarN = defpackage.awj.n(defpackage.awj.e(cgfVar5, f, Float.NaN), f, Float.NaN);
                            if (z12) {
                                float f2 = ktfVar5.o.a;
                                bsdVar6.getClass();
                                bsdVar5 = new defpackage.bsd(defpackage.jxs.c(bsdVar6.a, f2), defpackage.jxs.c(bsdVar6.b, f2), defpackage.jxs.c(bsdVar6.c, f2));
                            } else {
                                bsdVar5 = bsdVar6;
                            }
                            boolean z13 = z;
                            if (((java.lang.Boolean) bysVarI.a()).booleanValue()) {
                                cldVarI = bsdVar5.b;
                            } else {
                                cldVarI = z13 ? bsdVar5.c : bsdVar5.a;
                            }
                            bsdVar5.getClass();
                            if ((bsdVar5.a instanceof defpackage.bcr) && (bsdVar5.b instanceof defpackage.bcr) && (bsdVar5.c instanceof defpackage.bcr)) {
                                bveVar4.v(-1473180677);
                                bveVar4.t(368120221, bsdVar5);
                                cldVarI.getClass();
                                cldVarI = defpackage.jxh.i((defpackage.bcr) cldVarI, bveVar4);
                                bveVar4.m();
                                bveVar4.o();
                            } else {
                                bveVar4.v(-1473101224);
                                bveVar4.o();
                            }
                            defpackage.ktz ktzVar4 = ktzVar3;
                            if (z13) {
                                j2 = ktzVar4.n;
                                z11 = true;
                            } else {
                                z11 = false;
                                j2 = ktzVar4.g;
                            }
                            defpackage.kvk kvkVar = ktfVar5.o;
                            long j3 = z11 ? ktzVar4.o : ktzVar4.h;
                            defpackage.affh affhVar2 = affhVar;
                            defpackage.avv avvVar9 = avvVar5;
                            long j4 = j3;
                            defpackage.bmv bmvVar6 = bmvVar5;
                            boolean z14 = z9;
                            defpackage.affc affcVar2 = affcVar;
                            defpackage.cgf cgfVarA = defpackage.kvi.a(cgfVarN, cldVarI, j2, j4, kvkVar, ktfVar5.p, askVar4, z12, z12, bveVar4, 0, 0);
                            ktzVar4.getClass();
                            long j5 = ktzVar4.m;
                            long j6 = ktzVar4.l;
                            defpackage.tw.h(z11, affcVar2, cgfVarA, z14, bsdVar6, new defpackage.bsa(ktzVar4.d, ktzVar4.e, ktzVar4.j, ktzVar4.k, j6, j5), bmvVar6, avvVar9, askVar4, defpackage.dai.as(-1036547310, true, new defpackage.klc(affhVar2, 13), bveVar4), bveVar4, 0, 6);
                        } else {
                            bveVar4.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVar2), bveVar2, 56);
                cgfVar3 = cgfVar4;
                ktfVar2 = ktfVar4;
                avvVar3 = avvVar5;
                z7 = z10;
                z6 = z9;
                bmvVar3 = bmvVar5;
                askVar2 = askVar3;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                ktfVar2 = ktfVar;
                z6 = z2;
                z7 = z3;
                cgfVar3 = cgfVar2;
                avvVar3 = avvVar2;
                ktzVar3 = ktzVar2;
                bmvVar3 = bmvVar2;
                bsdVar3 = bsdVar2;
                askVar2 = askVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mwj(z, affcVar, cgfVar3, ktfVar2, avvVar3, z6, bsdVar3, ktzVar3, bmvVar3, askVar2, z7, affhVar, i, i2, i3, 1);
            }
        }
        i4 |= 384;
        cgfVar2 = cgfVar;
        if ((i & 3072) == 0) {
            i26 = 1024;
            if ((i3 & 8) == 0) {
                if ((i & 4096) == 0) {
                    zE = bveVarC.C(ktfVar);
                } else {
                    zE = bveVarC.E(ktfVar);
                }
                if (zE) {
                    i26 = 2048;
                }
            }
            i4 |= i26;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i & 24576) == 0) {
                avvVar2 = avvVar;
                if (true != bveVarC.C(avvVar2)) {
                    i6 = 8192;
                } else {
                    i6 = 16384;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i7 != 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                if (true != bveVarC.D(z2)) {
                    i8 = 65536;
                } else {
                    i8 = 131072;
                }
                i4 |= i8;
            }
            if ((1572864 & i) == 0) {
                i25 = 524288;
                if ((i3 & 64) == 0) {
                    bsdVar2 = bsdVar;
                    if (bveVarC.C(bsdVar2)) {
                        i25 = 1048576;
                    }
                } else {
                    bsdVar2 = bsdVar;
                }
                i4 |= i25;
            } else {
                bsdVar2 = bsdVar;
            }
            if ((i & 12582912) == 0) {
                i24 = 4194304;
                if ((i3 & 128) == 0) {
                    ktzVar2 = ktzVar;
                    if (bveVarC.C(ktzVar2)) {
                        i24 = 8388608;
                    }
                } else {
                    ktzVar2 = ktzVar;
                }
                i4 |= i24;
            } else {
                ktzVar2 = ktzVar;
            }
            if ((i & 100663296) == 0) {
                i23 = 33554432;
                if ((i3 & 256) == 0) {
                    bmvVar2 = bmvVar;
                    if (bveVarC.C(bmvVar2)) {
                        i23 = 67108864;
                    }
                } else {
                    bmvVar2 = bmvVar;
                }
                i4 |= i23;
            } else {
                bmvVar2 = bmvVar;
            }
            i9 = i3 & 512;
            if (i9 != 0) {
                i4 |= 805306368;
                i10 = i9;
            } else {
                i10 = i9;
                if ((i & 805306368) == 0) {
                    if (true != bveVarC.C(askVar)) {
                        i11 = 268435456;
                    } else {
                        i11 = 536870912;
                    }
                    i4 |= i11;
                }
            }
            if ((i3 & 1024) != 0) {
                i12 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.C(null)) {
                    i13 = 2;
                } else {
                    i13 = 4;
                }
                i12 = i2 | i13;
            } else {
                i12 = i2;
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
                i16 = i14;
                i17 = i12 | 48;
            } else {
                i15 = i12;
                i16 = i14;
                if ((i2 & 48) == 0) {
                    if (true != bveVarC.D(z3)) {
                        i18 = 16;
                    } else {
                        i18 = 32;
                    }
                    i17 = i15 | i18;
                } else {
                    i17 = i15;
                }
            }
            if ((i2 & 384) == 0) {
                i17 |= true != bveVarC.E(affhVar) ? 128 : 256;
            }
            if ((306783379 & i4) == 306783378) {
                z5 = true;
            } else {
                z5 = true;
            }
            if (bveVarC.I(z5, i4 & 1)) {
                i19 = i3 & 256;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0) {
                    i20 = i3 & 128;
                    i21 = i3 & 64;
                    i22 = i3 & 8;
                    if (i28 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i22 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    if (i5 != 0) {
                        avvVar4 = defpackage.avu.a;
                    } else {
                        avvVar4 = avvVar2;
                    }
                    z8 = true;
                    z9 = (!z4) | z2;
                    if (i21 != 0) {
                        int i212 = defpackage.kun.a;
                        bsdVarA = defpackage.kun.a(bveVarC);
                    } else {
                        bsdVarA = bsdVar2;
                    }
                    if (i20 != 0) {
                        defpackage.afar afarVar4 = defpackage.ktz.a;
                        bveVar3 = bveVarC;
                        ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVar3, 32767);
                    } else {
                        bveVar3 = bveVarC;
                        ktzVarG = ktzVar2;
                    }
                    if (i19 != 0) {
                        defpackage.avv avvVar9 = defpackage.bms.a;
                        bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar4 = bmvVar2;
                    }
                    if (i10 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    if (i16 != 0) {
                        ktzVar3 = ktzVarG;
                        bsdVar3 = bsdVarA;
                        bmvVar5 = bmvVar4;
                        cgfVar4 = cgfVar2;
                        ktfVar4 = ktfVar3;
                        avvVar5 = avvVar4;
                        z10 = false;
                    } else {
                        ktzVar3 = ktzVarG;
                        bsdVar3 = bsdVarA;
                        bmvVar5 = bmvVar4;
                        cgfVar4 = cgfVar2;
                        ktfVar4 = ktfVar3;
                        avvVar5 = avvVar4;
                        z10 = z3;
                    }
                } else {
                    i20 = i3 & 128;
                    i21 = i3 & 64;
                    i22 = i3 & 8;
                    if (i28 != 0) {
                        cgfVar2 = defpackage.cgf.e;
                    }
                    if (i22 != 0) {
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    if (i5 != 0) {
                        avvVar4 = defpackage.avu.a;
                    } else {
                        avvVar4 = avvVar2;
                    }
                    z8 = true;
                    z9 = (!z4) | z2;
                    if (i21 != 0) {
                        int i213 = defpackage.kun.a;
                        bsdVarA = defpackage.kun.a(bveVarC);
                    } else {
                        bsdVarA = bsdVar2;
                    }
                    if (i20 != 0) {
                        defpackage.afar afarVar5 = defpackage.ktz.a;
                        bveVar3 = bveVarC;
                        ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVar3, 32767);
                    } else {
                        bveVar3 = bveVarC;
                        ktzVarG = ktzVar2;
                    }
                    if (i19 != 0) {
                        defpackage.avv avvVar10 = defpackage.bms.a;
                        bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                    } else {
                        bmvVar4 = bmvVar2;
                    }
                    if (i10 != 0) {
                        objS = bwcVar.S();
                        if (objS == defpackage.bvd.a) {
                            objS = new defpackage.asl();
                            bwcVar.ad(objS);
                        }
                        askVar3 = (defpackage.ask) objS;
                    } else {
                        askVar3 = askVar;
                    }
                    if (i16 != 0) {
                        ktzVar3 = ktzVarG;
                        bsdVar3 = bsdVarA;
                        bmvVar5 = bmvVar4;
                        cgfVar4 = cgfVar2;
                        ktfVar4 = ktfVar3;
                        avvVar5 = avvVar4;
                        z10 = false;
                    } else {
                        ktzVar3 = ktzVarG;
                        bsdVar3 = bsdVarA;
                        bmvVar5 = bmvVar4;
                        cgfVar4 = cgfVar2;
                        ktfVar4 = ktfVar3;
                        avvVar5 = avvVar4;
                        z10 = z3;
                    }
                }
                bveVar3.l();
                defpackage.bvm bvmVar3 = defpackage.bpk.b;
                ktzVar3.getClass();
                if (!z9) {
                    j = ktzVar3.k;
                } else if (z) {
                    j = ktzVar3.m;
                } else {
                    j = ktzVar3.e;
                }
                bveVar2 = bveVar3;
                defpackage.dai.aA(bvmVar3.b(defpackage.khg.f(j)), defpackage.dai.as(-1432401424, z8, new defpackage.affg() { // from class: kur
                    @Override // defpackage.affg
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        defpackage.bsd bsdVar5;
                        defpackage.cld cldVarI;
                        boolean z11;
                        long j2;
                        defpackage.bve bveVar4 = (defpackage.bve) obj;
                        int iIntValue = ((java.lang.Integer) obj2).intValue();
                        if (bveVar4.I((iIntValue & 3) != 2, iIntValue & 1)) {
                            defpackage.bsd bsdVar6 = bsdVar3;
                            boolean z12 = z10;
                            defpackage.ktf ktfVar5 = ktfVar4;
                            defpackage.cgf cgfVar5 = cgfVar4;
                            defpackage.ask askVar4 = askVar3;
                            defpackage.bys bysVarI = defpackage.asq.i(askVar4, bveVar4, 0);
                            float f = ktfVar5.h;
                            defpackage.cgf cgfVarN = defpackage.awj.n(defpackage.awj.e(cgfVar5, f, Float.NaN), f, Float.NaN);
                            if (z12) {
                                float f2 = ktfVar5.o.a;
                                bsdVar6.getClass();
                                bsdVar5 = new defpackage.bsd(defpackage.jxs.c(bsdVar6.a, f2), defpackage.jxs.c(bsdVar6.b, f2), defpackage.jxs.c(bsdVar6.c, f2));
                            } else {
                                bsdVar5 = bsdVar6;
                            }
                            boolean z13 = z;
                            if (((java.lang.Boolean) bysVarI.a()).booleanValue()) {
                                cldVarI = bsdVar5.b;
                            } else {
                                cldVarI = z13 ? bsdVar5.c : bsdVar5.a;
                            }
                            bsdVar5.getClass();
                            if ((bsdVar5.a instanceof defpackage.bcr) && (bsdVar5.b instanceof defpackage.bcr) && (bsdVar5.c instanceof defpackage.bcr)) {
                                bveVar4.v(-1473180677);
                                bveVar4.t(368120221, bsdVar5);
                                cldVarI.getClass();
                                cldVarI = defpackage.jxh.i((defpackage.bcr) cldVarI, bveVar4);
                                bveVar4.m();
                                bveVar4.o();
                            } else {
                                bveVar4.v(-1473101224);
                                bveVar4.o();
                            }
                            defpackage.ktz ktzVar4 = ktzVar3;
                            if (z13) {
                                j2 = ktzVar4.n;
                                z11 = true;
                            } else {
                                z11 = false;
                                j2 = ktzVar4.g;
                            }
                            defpackage.kvk kvkVar = ktfVar5.o;
                            long j3 = z11 ? ktzVar4.o : ktzVar4.h;
                            defpackage.affh affhVar2 = affhVar;
                            defpackage.avv avvVar11 = avvVar5;
                            long j4 = j3;
                            defpackage.bmv bmvVar6 = bmvVar5;
                            boolean z14 = z9;
                            defpackage.affc affcVar2 = affcVar;
                            defpackage.cgf cgfVarA = defpackage.kvi.a(cgfVarN, cldVarI, j2, j4, kvkVar, ktfVar5.p, askVar4, z12, z12, bveVar4, 0, 0);
                            ktzVar4.getClass();
                            long j5 = ktzVar4.m;
                            long j6 = ktzVar4.l;
                            defpackage.tw.h(z11, affcVar2, cgfVarA, z14, bsdVar6, new defpackage.bsa(ktzVar4.d, ktzVar4.e, ktzVar4.j, ktzVar4.k, j6, j5), bmvVar6, avvVar11, askVar4, defpackage.dai.as(-1036547310, true, new defpackage.klc(affhVar2, 13), bveVar4), bveVar4, 0, 6);
                        } else {
                            bveVar4.s();
                        }
                        return defpackage.afbk.a;
                    }
                }, bveVar2), bveVar2, 56);
                cgfVar3 = cgfVar4;
                ktfVar2 = ktfVar4;
                avvVar3 = avvVar5;
                z7 = z10;
                z6 = z9;
                bmvVar3 = bmvVar5;
                askVar2 = askVar3;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                ktfVar2 = ktfVar;
                z6 = z2;
                z7 = z3;
                cgfVar3 = cgfVar2;
                avvVar3 = avvVar2;
                ktzVar3 = ktzVar2;
                bmvVar3 = bmvVar2;
                bsdVar3 = bsdVar2;
                askVar2 = askVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new mwj(z, affcVar, cgfVar3, ktfVar2, avvVar3, z6, bsdVar3, ktzVar3, bmvVar3, askVar2, z7, affhVar, i, i2, i3, 1);
            }
        }
        i4 |= 24576;
        avvVar2 = avvVar;
        i7 = i3 & 32;
        if (i7 != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i7 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            if (true != bveVarC.D(z2)) {
                i8 = 65536;
            } else {
                i8 = 131072;
            }
            i4 |= i8;
        }
        if ((1572864 & i) == 0) {
            i25 = 524288;
            if ((i3 & 64) == 0) {
                bsdVar2 = bsdVar;
                if (bveVarC.C(bsdVar2)) {
                    i25 = 1048576;
                }
            } else {
                bsdVar2 = bsdVar;
            }
            i4 |= i25;
        } else {
            bsdVar2 = bsdVar;
        }
        if ((i & 12582912) == 0) {
            i24 = 4194304;
            if ((i3 & 128) == 0) {
                ktzVar2 = ktzVar;
                if (bveVarC.C(ktzVar2)) {
                    i24 = 8388608;
                }
            } else {
                ktzVar2 = ktzVar;
            }
            i4 |= i24;
        } else {
            ktzVar2 = ktzVar;
        }
        if ((i & 100663296) == 0) {
            i23 = 33554432;
            if ((i3 & 256) == 0) {
                bmvVar2 = bmvVar;
                if (bveVarC.C(bmvVar2)) {
                    i23 = 67108864;
                }
            } else {
                bmvVar2 = bmvVar;
            }
            i4 |= i23;
        } else {
            bmvVar2 = bmvVar;
        }
        i9 = i3 & 512;
        if (i9 != 0) {
            i4 |= 805306368;
            i10 = i9;
        } else {
            i10 = i9;
            if ((i & 805306368) == 0) {
                if (true != bveVarC.C(askVar)) {
                    i11 = 268435456;
                } else {
                    i11 = 536870912;
                }
                i4 |= i11;
            }
        }
        if ((i3 & 1024) != 0) {
            i12 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (true != bveVarC.C(null)) {
                i13 = 2;
            } else {
                i13 = 4;
            }
            i12 = i2 | i13;
        } else {
            i12 = i2;
        }
        i14 = i3 & 2048;
        if (i14 != 0) {
            i16 = i14;
            i17 = i12 | 48;
        } else {
            i15 = i12;
            i16 = i14;
            if ((i2 & 48) == 0) {
                if (true != bveVarC.D(z3)) {
                    i18 = 16;
                } else {
                    i18 = 32;
                }
                i17 = i15 | i18;
            } else {
                i17 = i15;
            }
        }
        if ((i2 & 384) == 0) {
            i17 |= true != bveVarC.E(affhVar) ? 128 : 256;
        }
        if ((306783379 & i4) == 306783378) {
            z5 = true;
        } else {
            z5 = true;
        }
        if (bveVarC.I(z5, i4 & 1)) {
            i19 = i3 & 256;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                i20 = i3 & 128;
                i21 = i3 & 64;
                i22 = i3 & 8;
                if (i28 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i22 != 0) {
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                if (i5 != 0) {
                    avvVar4 = defpackage.avu.a;
                } else {
                    avvVar4 = avvVar2;
                }
                z8 = true;
                z9 = (!z4) | z2;
                if (i21 != 0) {
                    int i214 = defpackage.kun.a;
                    bsdVarA = defpackage.kun.a(bveVarC);
                } else {
                    bsdVarA = bsdVar2;
                }
                if (i20 != 0) {
                    defpackage.afar afarVar6 = defpackage.ktz.a;
                    bveVar3 = bveVarC;
                    ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVar3, 32767);
                } else {
                    bveVar3 = bveVarC;
                    ktzVarG = ktzVar2;
                }
                if (i19 != 0) {
                    defpackage.avv avvVar11 = defpackage.bms.a;
                    bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                } else {
                    bmvVar4 = bmvVar2;
                }
                if (i10 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                if (i16 != 0) {
                    ktzVar3 = ktzVarG;
                    bsdVar3 = bsdVarA;
                    bmvVar5 = bmvVar4;
                    cgfVar4 = cgfVar2;
                    ktfVar4 = ktfVar3;
                    avvVar5 = avvVar4;
                    z10 = false;
                } else {
                    ktzVar3 = ktzVarG;
                    bsdVar3 = bsdVarA;
                    bmvVar5 = bmvVar4;
                    cgfVar4 = cgfVar2;
                    ktfVar4 = ktfVar3;
                    avvVar5 = avvVar4;
                    z10 = z3;
                }
            } else {
                i20 = i3 & 128;
                i21 = i3 & 64;
                i22 = i3 & 8;
                if (i28 != 0) {
                    cgfVar2 = defpackage.cgf.e;
                }
                if (i22 != 0) {
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                if (i5 != 0) {
                    avvVar4 = defpackage.avu.a;
                } else {
                    avvVar4 = avvVar2;
                }
                z8 = true;
                z9 = (!z4) | z2;
                if (i21 != 0) {
                    int i215 = defpackage.kun.a;
                    bsdVarA = defpackage.kun.a(bveVarC);
                } else {
                    bsdVarA = bsdVar2;
                }
                if (i20 != 0) {
                    defpackage.afar afarVar7 = defpackage.ktz.a;
                    bveVar3 = bveVarC;
                    ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVar3, 32767);
                } else {
                    bveVar3 = bveVarC;
                    ktzVarG = ktzVar2;
                }
                if (i19 != 0) {
                    defpackage.avv avvVar12 = defpackage.bms.a;
                    bmvVar4 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                } else {
                    bmvVar4 = bmvVar2;
                }
                if (i10 != 0) {
                    objS = bwcVar.S();
                    if (objS == defpackage.bvd.a) {
                        objS = new defpackage.asl();
                        bwcVar.ad(objS);
                    }
                    askVar3 = (defpackage.ask) objS;
                } else {
                    askVar3 = askVar;
                }
                if (i16 != 0) {
                    ktzVar3 = ktzVarG;
                    bsdVar3 = bsdVarA;
                    bmvVar5 = bmvVar4;
                    cgfVar4 = cgfVar2;
                    ktfVar4 = ktfVar3;
                    avvVar5 = avvVar4;
                    z10 = false;
                } else {
                    ktzVar3 = ktzVarG;
                    bsdVar3 = bsdVarA;
                    bmvVar5 = bmvVar4;
                    cgfVar4 = cgfVar2;
                    ktfVar4 = ktfVar3;
                    avvVar5 = avvVar4;
                    z10 = z3;
                }
            }
            bveVar3.l();
            defpackage.bvm bvmVar4 = defpackage.bpk.b;
            ktzVar3.getClass();
            if (!z9) {
                j = ktzVar3.k;
            } else if (z) {
                j = ktzVar3.m;
            } else {
                j = ktzVar3.e;
            }
            bveVar2 = bveVar3;
            defpackage.dai.aA(bvmVar4.b(defpackage.khg.f(j)), defpackage.dai.as(-1432401424, z8, new defpackage.affg() { // from class: kur
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bsd bsdVar5;
                    defpackage.cld cldVarI;
                    boolean z11;
                    long j2;
                    defpackage.bve bveVar4 = (defpackage.bve) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    if (bveVar4.I((iIntValue & 3) != 2, iIntValue & 1)) {
                        defpackage.bsd bsdVar6 = bsdVar3;
                        boolean z12 = z10;
                        defpackage.ktf ktfVar5 = ktfVar4;
                        defpackage.cgf cgfVar5 = cgfVar4;
                        defpackage.ask askVar4 = askVar3;
                        defpackage.bys bysVarI = defpackage.asq.i(askVar4, bveVar4, 0);
                        float f = ktfVar5.h;
                        defpackage.cgf cgfVarN = defpackage.awj.n(defpackage.awj.e(cgfVar5, f, Float.NaN), f, Float.NaN);
                        if (z12) {
                            float f2 = ktfVar5.o.a;
                            bsdVar6.getClass();
                            bsdVar5 = new defpackage.bsd(defpackage.jxs.c(bsdVar6.a, f2), defpackage.jxs.c(bsdVar6.b, f2), defpackage.jxs.c(bsdVar6.c, f2));
                        } else {
                            bsdVar5 = bsdVar6;
                        }
                        boolean z13 = z;
                        if (((java.lang.Boolean) bysVarI.a()).booleanValue()) {
                            cldVarI = bsdVar5.b;
                        } else {
                            cldVarI = z13 ? bsdVar5.c : bsdVar5.a;
                        }
                        bsdVar5.getClass();
                        if ((bsdVar5.a instanceof defpackage.bcr) && (bsdVar5.b instanceof defpackage.bcr) && (bsdVar5.c instanceof defpackage.bcr)) {
                            bveVar4.v(-1473180677);
                            bveVar4.t(368120221, bsdVar5);
                            cldVarI.getClass();
                            cldVarI = defpackage.jxh.i((defpackage.bcr) cldVarI, bveVar4);
                            bveVar4.m();
                            bveVar4.o();
                        } else {
                            bveVar4.v(-1473101224);
                            bveVar4.o();
                        }
                        defpackage.ktz ktzVar4 = ktzVar3;
                        if (z13) {
                            j2 = ktzVar4.n;
                            z11 = true;
                        } else {
                            z11 = false;
                            j2 = ktzVar4.g;
                        }
                        defpackage.kvk kvkVar = ktfVar5.o;
                        long j3 = z11 ? ktzVar4.o : ktzVar4.h;
                        defpackage.affh affhVar2 = affhVar;
                        defpackage.avv avvVar13 = avvVar5;
                        long j4 = j3;
                        defpackage.bmv bmvVar6 = bmvVar5;
                        boolean z14 = z9;
                        defpackage.affc affcVar2 = affcVar;
                        defpackage.cgf cgfVarA = defpackage.kvi.a(cgfVarN, cldVarI, j2, j4, kvkVar, ktfVar5.p, askVar4, z12, z12, bveVar4, 0, 0);
                        ktzVar4.getClass();
                        long j5 = ktzVar4.m;
                        long j6 = ktzVar4.l;
                        defpackage.tw.h(z11, affcVar2, cgfVarA, z14, bsdVar6, new defpackage.bsa(ktzVar4.d, ktzVar4.e, ktzVar4.j, ktzVar4.k, j6, j5), bmvVar6, avvVar13, askVar4, defpackage.dai.as(-1036547310, true, new defpackage.klc(affhVar2, 13), bveVar4), bveVar4, 0, 6);
                    } else {
                        bveVar4.s();
                    }
                    return defpackage.afbk.a;
                }
            }, bveVar2), bveVar2, 56);
            cgfVar3 = cgfVar4;
            ktfVar2 = ktfVar4;
            avvVar3 = avvVar5;
            z7 = z10;
            z6 = z9;
            bmvVar3 = bmvVar5;
            askVar2 = askVar3;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            ktfVar2 = ktfVar;
            z6 = z2;
            z7 = z3;
            cgfVar3 = cgfVar2;
            avvVar3 = avvVar2;
            ktzVar3 = ktzVar2;
            bmvVar3 = bmvVar2;
            bsdVar3 = bsdVar2;
            askVar2 = askVar;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new mwj(z, affcVar, cgfVar3, ktfVar2, avvVar3, z6, bsdVar3, ktzVar3, bmvVar3, askVar2, z7, affhVar, i, i2, i3, 1);
        }
    }

    public static final void g(defpackage.cne cneVar, boolean z, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z2, defpackage.bsd bsdVar, defpackage.ktz ktzVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        boolean z3;
        defpackage.cgf cgfVar2;
        defpackage.ktf ktfVar2;
        boolean z4;
        defpackage.bsd bsdVar2;
        defpackage.ktz ktzVar2;
        defpackage.bmv bmvVar2;
        defpackage.ask askVar2;
        defpackage.cgf cgfVar3;
        defpackage.bmv bmvVar3;
        cneVar.getClass();
        affcVar.getClass();
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1780460679);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i3 |= true != bveVarC.D(z3) ? 16 : 32;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.E(affcVar) ? 128 : 256;
        }
        int i5 = i3 | 3072;
        if ((i & 24576) == 0) {
            i5 = i3 | 11264;
        }
        int i6 = 196608 | i5;
        if ((1572864 & i) == 0) {
            i6 = i5 | 720896;
        }
        if ((12582912 & i) == 0) {
            i6 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i6 |= 33554432;
        }
        int i7 = i2 | 6;
        int i8 = i6 | 805306368;
        if (bveVarC.I(((306783379 & i8) == 306783378 && (i7 & 3) == 2) ? false : true, i8 & 1)) {
            int i9 = i8 >> 24;
            int i10 = (-267968513) & i8;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                cgfVar3 = defpackage.cgf.e;
                defpackage.ktf ktfVar3 = defpackage.ktf.c;
                int i11 = defpackage.kun.a;
                defpackage.bsd bsdVarA = defpackage.kun.a(bveVarC);
                defpackage.afar afarVar = defpackage.ktz.a;
                defpackage.ktz ktzVarF = defpackage.jxh.f(bveVarC);
                defpackage.avv avvVar = defpackage.bms.a;
                bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                java.lang.Object objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.asl();
                    bwcVar.ad(objS);
                }
                ktfVar2 = ktfVar3;
                bsdVar2 = bsdVarA;
                ktzVar2 = ktzVarF;
                askVar2 = (defpackage.ask) objS;
                z4 = true;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar;
                ktfVar2 = ktfVar;
                ktzVar2 = ktzVar;
                bmvVar3 = bmvVar;
                askVar2 = askVar;
                z4 = z2;
                bsdVar2 = bsdVar;
            }
            bveVarC.l();
            int i12 = i10 << 3;
            defpackage.ktf ktfVar4 = defpackage.ktf.a;
            int i13 = (i7 & 14) | (i9 & 112);
            boolean z5 = z3;
            cgfVar2 = cgfVar3;
            bmvVar2 = bmvVar3;
            e(cneVar, null, z5, affcVar, cgfVar2, ktfVar2, z4, bsdVar2, ktzVar2, bmvVar2, askVar2, bveVarC, (i8 & 14) | 56 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 3670016), i13);
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
            ktfVar2 = ktfVar;
            z4 = z2;
            bsdVar2 = bsdVar;
            ktzVar2 = ktzVar;
            bmvVar2 = bmvVar;
            askVar2 = askVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.kuo(cneVar, z, affcVar, cgfVar2, ktfVar2, z4, bsdVar2, ktzVar2, bmvVar2, askVar2, i, i2, 0);
        }
    }

    public static final void h(defpackage.cne cneVar, boolean z, defpackage.affc affcVar, defpackage.cgf cgfVar, defpackage.ktf ktfVar, boolean z2, defpackage.bsd bsdVar, defpackage.ktz ktzVar, defpackage.bmv bmvVar, defpackage.ask askVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        boolean z3;
        defpackage.cgf cgfVar2;
        defpackage.ktf ktfVar2;
        boolean z4;
        defpackage.bsd bsdVar2;
        defpackage.ktz ktzVar2;
        defpackage.bmv bmvVar2;
        defpackage.ask askVar2;
        defpackage.cgf cgfVar3;
        defpackage.ktz ktzVarF;
        boolean z5;
        affcVar.getClass();
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1790800555);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.C("Label") ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z3 = z;
            i3 |= true != bveVarC.D(z3) ? 128 : 256;
        } else {
            z3 = z;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.E(affcVar) ? 1024 : 2048;
        }
        int i5 = i3 | 24576;
        if ((196608 & i) == 0) {
            i5 = i3 | 90112;
        }
        int i6 = 1572864 | i5;
        if ((12582912 & i) == 0) {
            i6 = i5 | 5767168;
        }
        if ((100663296 & i) == 0) {
            i6 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i6 |= 268435456;
        }
        int i7 = i2 | 54;
        if (bveVarC.I(((306783379 & i6) == 306783378 && (i7 & 19) == 18) ? false : true, i6 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                cgfVar3 = defpackage.cgf.e;
                defpackage.ktf ktfVar3 = defpackage.ktf.c;
                int i8 = defpackage.kun.a;
                defpackage.bsd bsdVarA = defpackage.kun.a(bveVarC);
                defpackage.afar afarVar = defpackage.ktz.a;
                ktzVarF = defpackage.jxh.f(bveVarC);
                defpackage.avv avvVar = defpackage.bms.a;
                defpackage.bmv bmvVar3 = new defpackage.bmv(0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                java.lang.Object objS = bwcVar.S();
                if (objS == defpackage.bvd.a) {
                    objS = new defpackage.asl();
                    bwcVar.ad(objS);
                }
                ktfVar2 = ktfVar3;
                bsdVar2 = bsdVarA;
                bmvVar2 = bmvVar3;
                askVar2 = (defpackage.ask) objS;
                z5 = true;
            } else {
                bveVarC.s();
                cgfVar3 = cgfVar;
                ktfVar2 = ktfVar;
                z5 = z2;
                bsdVar2 = bsdVar;
                ktzVarF = ktzVar;
                bmvVar2 = bmvVar;
                askVar2 = askVar;
            }
            bveVarC.l();
            defpackage.dfb dfbVar = new defpackage.dfb("Label");
            int i9 = i6 & 7168;
            int i10 = i6 & 57344;
            defpackage.ktf ktfVar4 = defpackage.ktf.a;
            z4 = z5;
            cgfVar2 = cgfVar3;
            ktzVar2 = ktzVarF;
            e(cneVar, dfbVar, z3, affcVar, cgfVar2, ktfVar2, z4, bsdVar2, ktzVar2, bmvVar2, askVar2, bveVarC, i9 | (i6 & 14) | 8 | (i6 & 896) | i10 | (i6 & 3670016), ((i7 >> 3) & 14) | ((i7 << 3) & 112));
        } else {
            bveVarC.s();
            cgfVar2 = cgfVar;
            ktfVar2 = ktfVar;
            z4 = z2;
            bsdVar2 = bsdVar;
            ktzVar2 = ktzVar;
            bmvVar2 = bmvVar;
            askVar2 = askVar;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.kuo(cneVar, z, affcVar, cgfVar2, ktfVar2, z4, bsdVar2, ktzVar2, bmvVar2, askVar2, i, i2, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x016b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0174  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:147:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01db  */
    /* JADX WARN: Code duplicated, block: B:150:0x01de  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:155:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:156:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:158:0x0202  */
    /* JADX WARN: Code duplicated, block: B:159:0x0219  */
    /* JADX WARN: Code duplicated, block: B:161:0x021f  */
    /* JADX WARN: Code duplicated, block: B:162:0x0234  */
    /* JADX WARN: Code duplicated, block: B:164:0x0238  */
    /* JADX WARN: Code duplicated, block: B:165:0x0243  */
    /* JADX WARN: Code duplicated, block: B:168:0x0257  */
    /* JADX WARN: Code duplicated, block: B:169:0x0269  */
    /* JADX WARN: Code duplicated, block: B:172:0x027e  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:180:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:182:0x033f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0357  */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    public static final void i(defpackage.cne cneVar, defpackage.dfb dfbVar, long j, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.cgf cgfVar, long j2, defpackage.ktf ktfVar, defpackage.cld cldVar, defpackage.ktl ktlVar, defpackage.ktl ktlVar2, java.util.Map map, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        long j3;
        int i5;
        int i6;
        boolean z;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar3;
        long j4;
        defpackage.ktf ktfVar2;
        defpackage.cld cldVar2;
        defpackage.ktl ktlVar3;
        defpackage.ktl ktlVar4;
        java.util.Map map2;
        defpackage.bxl bxlVarJ;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVar4;
        defpackage.ktf ktfVar3;
        defpackage.cld cldVarE;
        defpackage.ktl ktlVarJ;
        int i12;
        defpackage.cld cldVar3;
        java.util.Map map3;
        java.lang.Object objS;
        java.lang.Object obj;
        defpackage.bwx bwxVar;
        float fA;
        int i13;
        java.lang.Object objS2;
        java.lang.Object objS3;
        int i14 = i & 6;
        defpackage.bve bveVarC = bveVar.c(232369166);
        if (i14 == 0) {
            i4 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= true != bveVarC.C(dfbVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != bveVarC.B(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != bveVarC.E(aferVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != bveVarC.E(aferVar2) ? 8192 : 16384;
        }
        int i15 = i3 & 32;
        if (i15 != 0) {
            i4 |= 196608;
            cgfVar2 = cgfVar;
        } else {
            cgfVar2 = cgfVar;
            if ((i & 196608) == 0) {
                i4 |= true != bveVarC.C(cgfVar2) ? 65536 : 131072;
            }
        }
        if ((1572864 & i) == 0) {
            int i16 = 524288;
            j3 = j2;
            if ((i3 & 64) == 0 && bveVarC.B(j3)) {
                i16 = 1048576;
            }
            i4 |= i16;
        } else {
            j3 = j2;
        }
        if ((i & 12582912) == 0) {
            int i17 = 4194304;
            if ((i3 & 128) == 0) {
                if ((16777216 & i) == 0 ? bveVarC.C(ktfVar) : bveVarC.E(ktfVar)) {
                    i17 = 8388608;
                }
            }
            i4 |= i17;
        }
        if ((100663296 & i) == 0) {
            int i18 = 33554432;
            if ((i3 & 256) == 0 && bveVarC.C(cldVar)) {
                i18 = 67108864;
            }
            i4 |= i18;
        }
        if ((i & 805306368) == 0) {
            int i19 = 268435456;
            if ((i3 & 512) == 0 && bveVarC.C(ktlVar)) {
                i19 = 536870912;
            }
            i4 |= i19;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (((i3 & 1024) == 0 && bveVarC.C(ktlVar2)) ? 4 : 2);
        } else {
            i5 = i2;
        }
        int i20 = i3 & 2048;
        if (i20 == 0) {
            if ((i2 & 48) == 0) {
                i5 |= true != ((i2 & 64) == 0 ? bveVarC.C(map) : bveVarC.E(map)) ? 16 : 32;
            }
            i6 = i5;
            if ((i4 & 306783379) == 306783378 || (i6 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i4 & 1)) {
                i7 = i3 & 1024;
                i8 = i3 & 512;
                i9 = i3 & 256;
                i10 = i3 & 128;
                i11 = i3 & 64;
                bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i15 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i11 != 0) {
                        i4 &= -3670017;
                        long j5 = aitq.a;
                        j3 = 0;
                    }
                    if (i10 != 0) {
                        i4 &= -29360129;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    if (i9 != 0) {
                        defpackage.avv avvVar = defpackage.bms.a;
                        cldVarE = defpackage.bms.e(bveVarC);
                        i4 &= -234881025;
                    } else {
                        cldVarE = cldVar;
                    }
                    if (i8 != 0) {
                        defpackage.afar afarVar = defpackage.ktl.a;
                        bveVarC = bveVarC;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                        i4 &= -1879048193;
                    } else {
                        bveVarC = bveVarC;
                        ktlVarJ = ktlVar;
                    }
                    if (i7 != 0) {
                        defpackage.afar afarVar2 = defpackage.ktl.a;
                        ktlVar2 = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVarC, 255);
                        i6 &= -15;
                    } else {
                        ktlVar2 = ktlVar2;
                    }
                    if (i20 != 0) {
                        defpackage.cld cldVar4 = cldVarE;
                        i12 = i4;
                        cldVar3 = cldVar4;
                        ktfVar = ktfVar3;
                        cgfVar2 = cgfVar4;
                        ktlVar = ktlVarJ;
                        j3 = j3;
                        map3 = defpackage.afcf.a;
                    } else {
                        defpackage.cld cldVar5 = cldVarE;
                        i12 = i4;
                        cldVar3 = cldVar5;
                        ktfVar = ktfVar3;
                        cgfVar2 = cgfVar4;
                        ktlVar = ktlVarJ;
                        j3 = j3;
                        map3 = map;
                    }
                } else {
                    bveVarC.s();
                    if (i11 != 0) {
                        i4 &= -3670017;
                    }
                    if (i10 != 0) {
                        i4 &= -29360129;
                    }
                    if (i9 != 0) {
                        i4 &= -234881025;
                    }
                    if (i8 != 0) {
                        i4 &= -1879048193;
                    }
                    if (i7 != 0) {
                        i6 &= -15;
                    }
                    map3 = map;
                    i12 = i4;
                    cldVar3 = cldVar;
                }
                bveVarC.l();
                objS = bwcVar.S();
                obj = defpackage.bvd.a;
                if (objS == obj) {
                    androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                    bwcVar.ad(parcelableSnapshotMutableState);
                    objS = parcelableSnapshotMutableState;
                }
                bwxVar = (defpackage.bwx) objS;
                defpackage.cld cldVar6 = cldVar3;
                fA = (float) aitq.a(j3, j);
                if (true == ((java.lang.Boolean) bwxVar.a()).booleanValue()) {
                    fA = 1.0f;
                }
                float f = fA;
                defpackage.ktf ktfVar4 = ktfVar;
                defpackage.ags agsVarF = defpackage.ca.F((int) aitq.e(aitq.g(j, aitq.i(j3))), 0, defpackage.afc.d, 2);
                i13 = 57344 & i12;
                objS2 = bwcVar.S();
                if (i13 != 16384 || objS2 == obj) {
                    objS2 = new defpackage.kgo(aferVar2, 16);
                    bwcVar.ad(objS2);
                }
                defpackage.bve bveVar3 = bveVarC;
                defpackage.bys bysVarB = defpackage.aef.b(f, agsVarF, "TimedProgressButton_Progress", (defpackage.affc) objS2, bveVar3, 3072, 4);
                defpackage.afbk afbkVar = defpackage.afbk.a;
                objS3 = bwcVar.S();
                if (objS3 == obj) {
                    objS3 = new defpackage.dxp(bwxVar, (defpackage.afdk) null, 17);
                    bwcVar.ad(objS3);
                }
                defpackage.bvx.g(afbkVar, (defpackage.affg) objS3, bveVar3);
                int i21 = i12 >> 6;
                defpackage.ktf ktfVar5 = defpackage.ktf.a;
                int i22 = i6 << 21;
                defpackage.cgf cgfVar5 = cgfVar2;
                long j6 = j3;
                defpackage.ktl ktlVar5 = ktlVar2;
                defpackage.ktl ktlVar6 = ktlVar;
                k(cneVar, dfbVar, ((java.lang.Number) bysVarB.a()).floatValue(), cgfVar5, cldVar6, ktfVar4, ktlVar6, ktlVar5, map3, aferVar, bveVar3, (i12 & 14) | 8 | (i12 & 112) | (i21 & 7168) | ((i12 >> 12) & 57344) | (458752 & i21) | (3670016 & (i12 >> 9)) | (i22 & 29360128) | (i22 & 234881024) | (1879048192 & (i12 << 18)));
                bveVar2 = bveVar3;
                cldVar2 = cldVar6;
                ktlVar3 = ktlVar6;
                ktlVar4 = ktlVar5;
                map2 = map3;
                j4 = j6;
                ktfVar2 = ktfVar4;
                cgfVar3 = cgfVar5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                long j7 = j3;
                cgfVar3 = cgfVar2;
                j4 = j7;
                ktfVar2 = ktfVar;
                cldVar2 = cldVar;
                ktlVar3 = ktlVar;
                ktlVar4 = ktlVar2;
                map2 = map;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new kuf(cneVar, dfbVar, j, aferVar, aferVar2, cgfVar3, j4, ktfVar2, cldVar2, ktlVar3, ktlVar4, map2, i, i2, i3);
            }
        }
        i5 |= 48;
        i6 = i5;
        if ((i4 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (bveVarC.I(z, i4 & 1)) {
            i7 = i3 & 1024;
            i8 = i3 & 512;
            i9 = i3 & 256;
            i10 = i3 & 128;
            i11 = i3 & 64;
            bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i11 != 0) {
                    i4 &= -3670017;
                    long j8 = aitq.a;
                    j3 = 0;
                }
                if (i10 != 0) {
                    i4 &= -29360129;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                if (i9 != 0) {
                    defpackage.avv avvVar2 = defpackage.bms.a;
                    cldVarE = defpackage.bms.e(bveVarC);
                    i4 &= -234881025;
                } else {
                    cldVarE = cldVar;
                }
                if (i8 != 0) {
                    defpackage.afar afarVar3 = defpackage.ktl.a;
                    bveVarC = bveVarC;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    i4 &= -1879048193;
                } else {
                    bveVarC = bveVarC;
                    ktlVarJ = ktlVar;
                }
                if (i7 != 0) {
                    defpackage.afar afarVar4 = defpackage.ktl.a;
                    ktlVar2 = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVarC, 255);
                    i6 &= -15;
                } else {
                    ktlVar2 = ktlVar2;
                }
                if (i20 != 0) {
                    defpackage.cld cldVar7 = cldVarE;
                    i12 = i4;
                    cldVar3 = cldVar7;
                    ktfVar = ktfVar3;
                    cgfVar2 = cgfVar4;
                    ktlVar = ktlVarJ;
                    j3 = j3;
                    map3 = defpackage.afcf.a;
                } else {
                    defpackage.cld cldVar8 = cldVarE;
                    i12 = i4;
                    cldVar3 = cldVar8;
                    ktfVar = ktfVar3;
                    cgfVar2 = cgfVar4;
                    ktlVar = ktlVarJ;
                    j3 = j3;
                    map3 = map;
                }
            } else {
                if (i15 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i11 != 0) {
                    i4 &= -3670017;
                    long j9 = aitq.a;
                    j3 = 0;
                }
                if (i10 != 0) {
                    i4 &= -29360129;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                if (i9 != 0) {
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    cldVarE = defpackage.bms.e(bveVarC);
                    i4 &= -234881025;
                } else {
                    cldVarE = cldVar;
                }
                if (i8 != 0) {
                    defpackage.afar afarVar5 = defpackage.ktl.a;
                    bveVarC = bveVarC;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVarC, 255);
                    i4 &= -1879048193;
                } else {
                    bveVarC = bveVarC;
                    ktlVarJ = ktlVar;
                }
                if (i7 != 0) {
                    defpackage.afar afarVar6 = defpackage.ktl.a;
                    ktlVar2 = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVarC, 255);
                    i6 &= -15;
                } else {
                    ktlVar2 = ktlVar2;
                }
                if (i20 != 0) {
                    defpackage.cld cldVar9 = cldVarE;
                    i12 = i4;
                    cldVar3 = cldVar9;
                    ktfVar = ktfVar3;
                    cgfVar2 = cgfVar4;
                    ktlVar = ktlVarJ;
                    j3 = j3;
                    map3 = defpackage.afcf.a;
                } else {
                    defpackage.cld cldVar10 = cldVarE;
                    i12 = i4;
                    cldVar3 = cldVar10;
                    ktfVar = ktfVar3;
                    cgfVar2 = cgfVar4;
                    ktlVar = ktlVarJ;
                    j3 = j3;
                    map3 = map;
                }
            }
            bveVarC.l();
            objS = bwcVar.S();
            obj = defpackage.bvd.a;
            if (objS == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState2);
                objS = parcelableSnapshotMutableState2;
            }
            bwxVar = (defpackage.bwx) objS;
            defpackage.cld cldVar11 = cldVar3;
            fA = (float) aitq.a(j3, j);
            if (true == ((java.lang.Boolean) bwxVar.a()).booleanValue()) {
                fA = 1.0f;
            }
            float f2 = fA;
            defpackage.ktf ktfVar6 = ktfVar;
            defpackage.ags agsVarF2 = defpackage.ca.F((int) aitq.e(aitq.g(j, aitq.i(j3))), 0, defpackage.afc.d, 2);
            i13 = 57344 & i12;
            objS2 = bwcVar.S();
            if (i13 != 16384) {
                objS2 = new defpackage.kgo(aferVar2, 16);
                bwcVar.ad(objS2);
            } else {
                objS2 = new defpackage.kgo(aferVar2, 16);
                bwcVar.ad(objS2);
            }
            defpackage.bve bveVar4 = bveVarC;
            defpackage.bys bysVarB2 = defpackage.aef.b(f2, agsVarF2, "TimedProgressButton_Progress", (defpackage.affc) objS2, bveVar4, 3072, 4);
            defpackage.afbk afbkVar2 = defpackage.afbk.a;
            objS3 = bwcVar.S();
            if (objS3 == obj) {
                objS3 = new defpackage.dxp(bwxVar, (defpackage.afdk) null, 17);
                bwcVar.ad(objS3);
            }
            defpackage.bvx.g(afbkVar2, (defpackage.affg) objS3, bveVar4);
            int i23 = i12 >> 6;
            defpackage.ktf ktfVar7 = defpackage.ktf.a;
            int i24 = i6 << 21;
            defpackage.cgf cgfVar6 = cgfVar2;
            long j10 = j3;
            defpackage.ktl ktlVar7 = ktlVar2;
            defpackage.ktl ktlVar8 = ktlVar;
            k(cneVar, dfbVar, ((java.lang.Number) bysVarB2.a()).floatValue(), cgfVar6, cldVar11, ktfVar6, ktlVar8, ktlVar7, map3, aferVar, bveVar4, (i12 & 14) | 8 | (i12 & 112) | (i23 & 7168) | ((i12 >> 12) & 57344) | (458752 & i23) | (3670016 & (i12 >> 9)) | (i24 & 29360128) | (i24 & 234881024) | (1879048192 & (i12 << 18)));
            bveVar2 = bveVar4;
            cldVar2 = cldVar11;
            ktlVar3 = ktlVar8;
            ktlVar4 = ktlVar7;
            map2 = map3;
            j4 = j10;
            ktfVar2 = ktfVar6;
            cgfVar3 = cgfVar6;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            long j11 = j3;
            cgfVar3 = cgfVar2;
            j4 = j11;
            ktfVar2 = ktfVar;
            cldVar2 = cldVar;
            ktlVar3 = ktlVar;
            ktlVar4 = ktlVar2;
            map2 = map;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kuf(cneVar, dfbVar, j, aferVar, aferVar2, cgfVar3, j4, ktfVar2, cldVar2, ktlVar3, ktlVar4, map2, i, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0127  */
    /* JADX WARN: Code duplicated, block: B:120:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0182  */
    /* JADX WARN: Code duplicated, block: B:122:0x0185  */
    /* JADX WARN: Code duplicated, block: B:124:0x0188  */
    /* JADX WARN: Code duplicated, block: B:125:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0196  */
    /* JADX WARN: Code duplicated, block: B:128:0x019d  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:140:0x0258  */
    /* JADX WARN: Code duplicated, block: B:143:0x026a  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:99:0x011c  */
    public static final void j(defpackage.cne cneVar, long j, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.cgf cgfVar, long j2, defpackage.ktf ktfVar, defpackage.cld cldVar, defpackage.ktl ktlVar, defpackage.ktl ktlVar2, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        long j3;
        defpackage.cld cldVar2;
        defpackage.ktl ktlVar3;
        defpackage.ktl ktlVar4;
        boolean z;
        defpackage.bve bveVar2;
        defpackage.ktf ktfVar2;
        defpackage.cgf cgfVar3;
        defpackage.cld cldVar3;
        defpackage.ktl ktlVar5;
        defpackage.ktl ktlVarF;
        defpackage.bxl bxlVarJ;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        defpackage.cgf cgfVar4;
        int i9;
        long j4;
        defpackage.ktf ktfVar3;
        defpackage.cld cldVarE;
        int i10;
        defpackage.bve bveVar3;
        defpackage.ktl ktlVarJ;
        long j5;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zE;
        int i15;
        cneVar.getClass();
        int i16 = i & 6;
        defpackage.bve bveVarC = bveVar.c(95159156);
        if (i16 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.E(aferVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.E(aferVar2) ? 1024 : 2048;
        }
        int i17 = i2 & 16;
        if (i17 == 0) {
            if ((i & 24576) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 8192 : 16384;
            }
            if ((196608 & i) == 0) {
                i15 = 65536;
                j3 = j2;
                if ((i2 & 32) == 0 && bveVarC.B(j3)) {
                    i15 = 131072;
                }
                i3 |= i15;
            } else {
                j3 = j2;
            }
            if ((1572864 & i) == 0) {
                i14 = 524288;
                if ((i2 & 64) == 0) {
                    if ((2097152 & i) == 0) {
                        zE = bveVarC.C(ktfVar);
                    } else {
                        zE = bveVarC.E(ktfVar);
                    }
                    if (zE) {
                        i14 = 1048576;
                    }
                }
                i3 |= i14;
            }
            if ((12582912 & i) == 0) {
                i13 = 4194304;
                if ((i2 & 128) == 0) {
                    cldVar2 = cldVar;
                    if (bveVarC.C(cldVar2)) {
                        i13 = 8388608;
                    }
                } else {
                    cldVar2 = cldVar;
                }
                i3 |= i13;
            } else {
                cldVar2 = cldVar;
            }
            if ((100663296 & i) == 0) {
                i12 = 33554432;
                if ((i2 & 256) == 0) {
                    ktlVar3 = ktlVar;
                    if (bveVarC.C(ktlVar3)) {
                        i12 = 67108864;
                    }
                } else {
                    ktlVar3 = ktlVar;
                }
                i3 |= i12;
            } else {
                ktlVar3 = ktlVar;
            }
            if ((805306368 & i) == 0) {
                i11 = 268435456;
                if ((i2 & 512) == 0) {
                    ktlVar4 = ktlVar2;
                    if (bveVarC.C(ktlVar4)) {
                        i11 = 536870912;
                    }
                } else {
                    ktlVar4 = ktlVar2;
                }
                i3 |= i11;
            } else {
                ktlVar4 = ktlVar2;
            }
            if ((i3 & 306783379) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (bveVarC.I(z, i3 & 1)) {
                i4 = i2 & 512;
                i5 = i2 & 256;
                i6 = i2 & 128;
                i7 = i2 & 64;
                i8 = i2 & 32;
                ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i17 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    if (i8 != 0) {
                        long j6 = aitq.a;
                        i9 = i3 & (-458753);
                        j4 = 0;
                    } else {
                        i9 = i3;
                        j4 = j3;
                    }
                    if (i7 != 0) {
                        i9 &= -3670017;
                        ktfVar3 = defpackage.ktf.c;
                    } else {
                        ktfVar3 = ktfVar;
                    }
                    if (i6 != 0) {
                        defpackage.avv avvVar = defpackage.bms.a;
                        i9 &= -29360129;
                        cldVarE = defpackage.bms.e(bveVarC);
                    } else {
                        cldVarE = cldVar2;
                    }
                    i10 = i9;
                    if (i5 != 0) {
                        defpackage.afar afarVar = defpackage.ktl.a;
                        bveVar3 = bveVarC;
                        ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar3, 255);
                        i10 &= -234881025;
                    } else {
                        bveVar3 = bveVarC;
                        ktlVarJ = ktlVar3;
                    }
                    if (i4 != 0) {
                        defpackage.afar afarVar2 = defpackage.ktl.a;
                        i10 &= -1879048193;
                        ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                        ktlVar5 = ktlVarJ;
                        cldVar3 = cldVarE;
                        ktfVar2 = ktfVar3;
                        long j7 = j4;
                        cgfVar3 = cgfVar4;
                        j5 = j7;
                    } else {
                        long j8 = j4;
                        cgfVar3 = cgfVar4;
                        j5 = j8;
                        ktlVarF = ktlVar2;
                        ktlVar5 = ktlVarJ;
                        cldVar3 = cldVarE;
                        ktfVar2 = ktfVar3;
                    }
                } else {
                    bveVarC.s();
                    if (i8 != 0) {
                        i3 &= -458753;
                    }
                    if (i7 != 0) {
                        i3 &= -3670017;
                    }
                    if (i6 != 0) {
                        i3 &= -29360129;
                    }
                    if (i5 != 0) {
                        i3 &= -234881025;
                    }
                    if (i4 != 0) {
                        i3 &= -1879048193;
                    }
                    ktfVar2 = ktfVar;
                    i10 = i3;
                    j5 = j3;
                    cgfVar3 = cgfVar2;
                    cldVar3 = cldVar2;
                    ktlVar5 = ktlVar3;
                    bveVar3 = bveVarC;
                    ktlVarF = ktlVar4;
                }
                bveVar3.l();
                long j9 = defpackage.afqt.k(new aitq(j5), new aitq(0L), new aitq(j)).c;
                defpackage.ktf ktfVar4 = defpackage.ktf.a;
                int i18 = i10 << 3;
                defpackage.bve bveVar4 = bveVar3;
                i(cneVar, null, j, aferVar, aferVar2, cgfVar3, j9, ktfVar2, cldVar3, ktlVar5, ktlVarF, null, bveVar4, (i10 & 14) | 56 | (i18 & 896) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (29360128 & i18) | (234881024 & i18) | (i18 & 1879048192), (i10 >> 27) & 14, 2048);
                bveVar2 = bveVar4;
                j3 = j5;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                ktfVar2 = ktfVar;
                cgfVar3 = cgfVar2;
                cldVar3 = cldVar2;
                ktlVar5 = ktlVar3;
                ktlVarF = ktlVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new kuh(cneVar, j, aferVar, aferVar2, cgfVar3, j3, ktfVar2, cldVar3, ktlVar5, ktlVarF, i, i2);
            }
        }
        i3 |= 24576;
        cgfVar2 = cgfVar;
        if ((196608 & i) == 0) {
            i15 = 65536;
            j3 = j2;
            if ((i2 & 32) == 0) {
                i15 = 131072;
            }
            i3 |= i15;
        } else {
            j3 = j2;
        }
        if ((1572864 & i) == 0) {
            i14 = 524288;
            if ((i2 & 64) == 0) {
                if ((2097152 & i) == 0) {
                    zE = bveVarC.C(ktfVar);
                } else {
                    zE = bveVarC.E(ktfVar);
                }
                if (zE) {
                    i14 = 1048576;
                }
            }
            i3 |= i14;
        }
        if ((12582912 & i) == 0) {
            i13 = 4194304;
            if ((i2 & 128) == 0) {
                cldVar2 = cldVar;
                if (bveVarC.C(cldVar2)) {
                    i13 = 8388608;
                }
            } else {
                cldVar2 = cldVar;
            }
            i3 |= i13;
        } else {
            cldVar2 = cldVar;
        }
        if ((100663296 & i) == 0) {
            i12 = 33554432;
            if ((i2 & 256) == 0) {
                ktlVar3 = ktlVar;
                if (bveVarC.C(ktlVar3)) {
                    i12 = 67108864;
                }
            } else {
                ktlVar3 = ktlVar;
            }
            i3 |= i12;
        } else {
            ktlVar3 = ktlVar;
        }
        if ((805306368 & i) == 0) {
            i11 = 268435456;
            if ((i2 & 512) == 0) {
                ktlVar4 = ktlVar2;
                if (bveVarC.C(ktlVar4)) {
                    i11 = 536870912;
                }
            } else {
                ktlVar4 = ktlVar2;
            }
            i3 |= i11;
        } else {
            ktlVar4 = ktlVar2;
        }
        if ((i3 & 306783379) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (bveVarC.I(z, i3 & 1)) {
            i4 = i2 & 512;
            i5 = i2 & 256;
            i6 = i2 & 128;
            i7 = i2 & 64;
            i8 = i2 & 32;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i17 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i8 != 0) {
                    long j10 = aitq.a;
                    i9 = i3 & (-458753);
                    j4 = 0;
                } else {
                    i9 = i3;
                    j4 = j3;
                }
                if (i7 != 0) {
                    i9 &= -3670017;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                if (i6 != 0) {
                    defpackage.avv avvVar2 = defpackage.bms.a;
                    i9 &= -29360129;
                    cldVarE = defpackage.bms.e(bveVarC);
                } else {
                    cldVarE = cldVar2;
                }
                i10 = i9;
                if (i5 != 0) {
                    defpackage.afar afarVar3 = defpackage.ktl.a;
                    bveVar3 = bveVarC;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar3, 255);
                    i10 &= -234881025;
                } else {
                    bveVar3 = bveVarC;
                    ktlVarJ = ktlVar3;
                }
                if (i4 != 0) {
                    defpackage.afar afarVar4 = defpackage.ktl.a;
                    i10 &= -1879048193;
                    ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                    ktlVar5 = ktlVarJ;
                    cldVar3 = cldVarE;
                    ktfVar2 = ktfVar3;
                    long j11 = j4;
                    cgfVar3 = cgfVar4;
                    j5 = j11;
                } else {
                    long j12 = j4;
                    cgfVar3 = cgfVar4;
                    j5 = j12;
                    ktlVarF = ktlVar2;
                    ktlVar5 = ktlVarJ;
                    cldVar3 = cldVarE;
                    ktfVar2 = ktfVar3;
                }
            } else {
                if (i17 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                if (i8 != 0) {
                    long j13 = aitq.a;
                    i9 = i3 & (-458753);
                    j4 = 0;
                } else {
                    i9 = i3;
                    j4 = j3;
                }
                if (i7 != 0) {
                    i9 &= -3670017;
                    ktfVar3 = defpackage.ktf.c;
                } else {
                    ktfVar3 = ktfVar;
                }
                if (i6 != 0) {
                    defpackage.avv avvVar3 = defpackage.bms.a;
                    i9 &= -29360129;
                    cldVarE = defpackage.bms.e(bveVarC);
                } else {
                    cldVarE = cldVar2;
                }
                i10 = i9;
                if (i5 != 0) {
                    defpackage.afar afarVar5 = defpackage.ktl.a;
                    bveVar3 = bveVarC;
                    ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar3, 255);
                    i10 &= -234881025;
                } else {
                    bveVar3 = bveVarC;
                    ktlVarJ = ktlVar3;
                }
                if (i4 != 0) {
                    defpackage.afar afarVar6 = defpackage.ktl.a;
                    i10 &= -1879048193;
                    ktlVarF = defpackage.kgu.f(0L, 0L, 0L, 0L, bveVar3, 255);
                    ktlVar5 = ktlVarJ;
                    cldVar3 = cldVarE;
                    ktfVar2 = ktfVar3;
                    long j14 = j4;
                    cgfVar3 = cgfVar4;
                    j5 = j14;
                } else {
                    long j15 = j4;
                    cgfVar3 = cgfVar4;
                    j5 = j15;
                    ktlVarF = ktlVar2;
                    ktlVar5 = ktlVarJ;
                    cldVar3 = cldVarE;
                    ktfVar2 = ktfVar3;
                }
            }
            bveVar3.l();
            long j16 = defpackage.afqt.k(new aitq(j5), new aitq(0L), new aitq(j)).c;
            defpackage.ktf ktfVar5 = defpackage.ktf.a;
            int i19 = i10 << 3;
            defpackage.bve bveVar5 = bveVar3;
            i(cneVar, null, j, aferVar, aferVar2, cgfVar3, j16, ktfVar2, cldVar3, ktlVar5, ktlVarF, null, bveVar5, (i10 & 14) | 56 | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i19) | (234881024 & i19) | (i19 & 1879048192), (i10 >> 27) & 14, 2048);
            bveVar2 = bveVar5;
            j3 = j5;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            ktfVar2 = ktfVar;
            cgfVar3 = cgfVar2;
            cldVar3 = cldVar2;
            ktlVar5 = ktlVar3;
            ktlVarF = ktlVar2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kuh(cneVar, j, aferVar, aferVar2, cgfVar3, j3, ktfVar2, cldVar3, ktlVar5, ktlVarF, i, i2);
        }
    }

    public static final void k(defpackage.cne cneVar, defpackage.dfb dfbVar, float f, defpackage.cgf cgfVar, defpackage.cld cldVar, defpackage.ktf ktfVar, defpackage.ktl ktlVar, defpackage.ktl ktlVar2, java.util.Map map, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.ktl ktlVar3;
        defpackage.afer aferVar2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(809289969);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(dfbVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.z(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.C(cldVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != ((262144 & i) == 0 ? bveVarC.C(ktfVar) : bveVarC.E(ktfVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.C(ktlVar) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            ktlVar3 = ktlVar2;
            i2 |= true != bveVarC.C(ktlVar3) ? 4194304 : 8388608;
        } else {
            ktlVar3 = ktlVar2;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != ((134217728 & i) == 0 ? bveVarC.C(map) : bveVarC.E(map)) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            aferVar2 = aferVar;
            i2 |= true != bveVarC.E(aferVar2) ? 268435456 : 536870912;
        } else {
            aferVar2 = aferVar;
        }
        if (bveVarC.I((306783379 & i2) != 306783378, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.asl();
                bwcVar.ad(objS);
            }
            defpackage.dai.aA(defpackage.bpk.b.b(defpackage.khg.e(ktlVar)), defpackage.dai.as(14892081, true, new kuk(aferVar2, cgfVar, ktfVar, ktlVar, cldVar, (defpackage.ask) objS, ktlVar, f, ktlVar3, dfbVar, cneVar, map), bveVarC), bveVarC, 56);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kul(cneVar, dfbVar, f, cgfVar, cldVar, ktfVar, ktlVar, ktlVar2, map, aferVar, i);
        }
    }

    public static final void l(defpackage.ktf ktfVar, defpackage.dfb dfbVar, defpackage.cne cneVar, java.util.Map map, defpackage.cld cldVar, defpackage.ktl ktlVar, defpackage.bve bveVar) {
        defpackage.bvm bvmVar = defpackage.brv.a;
        defpackage.dai.aB(new defpackage.bxk[]{defpackage.bnq.a.b(new defpackage.ckd(ktlVar.h)), bvmVar.b(((defpackage.dgd) bveVar.f(bvmVar)).k(defpackage.bxi.p(bveVar).m))}, defpackage.dai.as(-620271998, true, new kug(cldVar, ktlVar.g, ktfVar, dfbVar, cneVar, map), bveVar), bveVar, 48);
    }

    public static final void m(defpackage.dfb dfbVar, long j, defpackage.afer aferVar, defpackage.afer aferVar2, defpackage.cgf cgfVar, long j2, defpackage.ktf ktfVar, defpackage.cne cneVar, defpackage.cld cldVar, defpackage.ktl ktlVar, defpackage.ktl ktlVar2, java.util.Map map, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.afer aferVar3;
        defpackage.cgf cgfVar2;
        int i4;
        defpackage.bve bveVar2;
        defpackage.cld cldVar2;
        defpackage.ktl ktlVar3;
        defpackage.cld cldVarE;
        defpackage.ktl ktlVarJ;
        int i5 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1289662568);
        if (i5 == 0) {
            i3 = (true != bveVarC.C(dfbVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.B(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            aferVar3 = aferVar;
            i3 |= true != bveVarC.E(aferVar3) ? 128 : 256;
        } else {
            aferVar3 = aferVar;
        }
        if ((i & 3072) == 0) {
            i3 |= true != bveVarC.E(aferVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            cgfVar2 = cgfVar;
            i3 |= true != bveVarC.C(cgfVar2) ? 8192 : 16384;
        } else {
            cgfVar2 = cgfVar;
        }
        if ((196608 & i) == 0) {
            i3 |= true != bveVarC.B(j2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != ((2097152 & i) == 0 ? bveVarC.C(ktfVar) : bveVarC.E(ktfVar)) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != ((16777216 & i) == 0 ? bveVarC.C(cneVar) : bveVarC.E(cneVar)) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i3 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != bveVarC.C(ktlVar2) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != ((i2 & 64) == 0 ? bveVarC.C(map) : bveVarC.E(map)) ? 16 : 32;
        }
        int i6 = i4;
        if (bveVarC.I(((i3 & 306783379) == 306783378 && (i6 & 19) == 18) ? false : true, i3 & 1)) {
            int i7 = i3 >> 21;
            int i8 = (-2113929217) & i3;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || bveVarC.F()) {
                defpackage.avv avvVar = defpackage.bms.a;
                cldVarE = defpackage.bms.e(bveVarC);
                defpackage.afar afarVar = defpackage.ktl.a;
                bveVar2 = bveVarC;
                ktlVarJ = defpackage.kgu.j(0L, 0L, 0L, 0L, bveVar2, 255);
            } else {
                bveVarC.s();
                cldVarE = cldVar;
                ktlVarJ = ktlVar;
                bveVar2 = bveVarC;
            }
            bveVar2.l();
            int i9 = i8 << 3;
            defpackage.cld cldVar3 = cldVarE;
            i(cneVar, dfbVar, j, aferVar3, aferVar2, cgfVar2, defpackage.afqt.k(new aitq(j2), new aitq(0L), new aitq(j)).c, ktfVar, cldVar3, ktlVarJ, ktlVar2, map, bveVar2, (i7 & 14) | 8 | (i9 & 112) | (i9 & 896) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (i9 & 29360128), i6 & 126, 0);
            ktlVar3 = ktlVarJ;
            cldVar2 = cldVar3;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            cldVar2 = cldVar;
            ktlVar3 = ktlVar;
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kui(dfbVar, j, aferVar, aferVar2, cgfVar, j2, ktfVar, cneVar, cldVar2, ktlVar3, ktlVar2, map, i, i2);
        }
    }
}
