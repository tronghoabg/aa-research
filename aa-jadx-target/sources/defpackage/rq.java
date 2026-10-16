package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public /* synthetic */ class rq {
    public static sn a(qs qsVar) throws java.lang.IllegalStateException {
        try {
            android.content.pm.ServiceInfo serviceInfoA = androidx.car.app.CarAppMetadataHolderService.a(qsVar);
            java.lang.String string = serviceInfoA.metaData != null ? serviceInfoA.metaData.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
            if (string != null) {
                return (sn) java.lang.Class.forName(string).getConstructor(null).newInstance(null);
            }
            throw new java.lang.ClassNotFoundException("ResultManager metadata could not be found");
        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.ReflectiveOperationException unused) {
            throw new java.lang.IllegalStateException("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
        }
    }

    public static defpackage.afd b(int i, defpackage.bve bveVar) {
        defpackage.bow bowVar = ((defpackage.bol) bveVar.f(defpackage.bom.a)).d;
        int i2 = i - 1;
        if (i2 == 0) {
            return defpackage.bow.b;
        }
        if (i2 == 1) {
            return defpackage.bow.c;
        }
        if (i2 == 2) {
            return defpackage.bow.d;
        }
        if (i2 != 3) {
            return i2 != 4 ? defpackage.bow.g : defpackage.bow.f;
        }
        return defpackage.bow.e;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0110  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114  */
    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    /* JADX WARN: Code duplicated, block: B:85:0x0156  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    public static void c(defpackage.afer aferVar, defpackage.cgf cgfVar, boolean z, boe boeVar, defpackage.cld cldVar, defpackage.affg affgVar, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        boolean z2;
        int i5;
        boe boeVar2;
        int i6;
        boolean z3;
        boolean z4;
        defpackage.cgf cgfVar3;
        boe boeVar3;
        defpackage.cld cldVar2;
        defpackage.bxl bxlVarJ;
        int i7;
        defpackage.cgf cgfVar4;
        boe boeVarB;
        defpackage.cld cldVarB;
        int i8;
        defpackage.cgf cgfVar5;
        boe boeVar4;
        long j;
        int i9;
        int i10;
        boolean z5 = z;
        int i11 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1413012038);
        if (i11 == 0) {
            i3 = (true != bveVarC.E(aferVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (true != bveVarC.D(z5)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                i10 = 1024;
                if ((i2 & 8) == 0) {
                    boeVar2 = boeVar;
                    if (bveVarC.C(boeVar2)) {
                        i10 = 2048;
                    }
                } else {
                    boeVar2 = boeVar;
                }
                i3 |= i10;
            } else {
                boeVar2 = boeVar;
            }
            i6 = i3 | 24576;
            if ((196608 & i) == 0) {
                i6 = i3 | 90112;
            }
            if ((1572864 & i) == 0) {
                if (true != bveVarC.E(affgVar)) {
                    i9 = 524288;
                } else {
                    i9 = 1048576;
                }
                i6 |= i9;
            }
            if ((599187 & i6) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bveVarC.I(z3, i6 & 1)) {
                i7 = i2 & 8;
                ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
                if ((i & 1) != 0 || bveVarC.F()) {
                    if (i12 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                    } else {
                        cgfVar4 = cgfVar2;
                    }
                    z5 |= true ^ z2;
                    if (i7 != 0) {
                        i6 &= -7169;
                        j = ((defpackage.ckd) bveVarC.f(defpackage.bnq.a)).a;
                        boeVarB = defpackage.rj.b(defpackage.bxi.n(bveVarC), j);
                        if (!defpackage.a.i(boeVarB.b, j)) {
                            boeVarB = boeVarB.a(boeVarB.a, j, boeVarB.c, defpackage.ckd.h(j, 0.38f));
                            i6 = i6;
                        }
                    } else {
                        boeVarB = boeVar2;
                    }
                    int i13 = i6 & (-458753);
                    cldVarB = defpackage.bqa.b(7, bveVarC);
                    i8 = i13;
                    cgfVar5 = cgfVar4;
                    boeVar4 = boeVarB;
                } else {
                    bveVarC.s();
                    if (i7 != 0) {
                        i6 &= -7169;
                    }
                    i8 = i6 & (-458753);
                    cldVarB = cldVar;
                    cgfVar5 = cgfVar2;
                    boeVar4 = boeVar2;
                }
                boolean z6 = z5;
                bveVarC.l();
                int i14 = i8 << 3;
                d(cgfVar5, aferVar, z6, cldVarB, boeVar4, affgVar, bveVarC, ((i8 >> 3) & 14) | (i14 & 112) | (i8 & 896) | (57344 & i14) | (i14 & 458752) | (i8 & 3670016));
                cgfVar3 = cgfVar5;
                z4 = z6;
                cldVar2 = cldVarB;
                boeVar3 = boeVar4;
            } else {
                bveVarC.s();
                z4 = z5;
                cgfVar3 = cgfVar2;
                boeVar3 = boeVar2;
                cldVar2 = cldVar;
            }
            bxlVarJ = bveVarC.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new gqo(aferVar, cgfVar3, z4, boeVar3, cldVar2, affgVar, i, i2, 1);
            }
        }
        i3 |= 48;
        cgfVar2 = cgfVar;
        i4 = i2 & 4;
        if (i4 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (true != bveVarC.D(z5)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i10 = 1024;
            if ((i2 & 8) == 0) {
                boeVar2 = boeVar;
                if (bveVarC.C(boeVar2)) {
                    i10 = 2048;
                }
            } else {
                boeVar2 = boeVar;
            }
            i3 |= i10;
        } else {
            boeVar2 = boeVar;
        }
        i6 = i3 | 24576;
        if ((196608 & i) == 0) {
            i6 = i3 | 90112;
        }
        if ((1572864 & i) == 0) {
            if (true != bveVarC.E(affgVar)) {
                i9 = 524288;
            } else {
                i9 = 1048576;
            }
            i6 |= i9;
        }
        if ((599187 & i6) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bveVarC.I(z3, i6 & 1)) {
            i7 = i2 & 8;
            ((defpackage.bwc) bveVarC).ab(-127, null, 0, null);
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                z5 |= true ^ z2;
                if (i7 != 0) {
                    i6 &= -7169;
                    j = ((defpackage.ckd) bveVarC.f(defpackage.bnq.a)).a;
                    boeVarB = defpackage.rj.b(defpackage.bxi.n(bveVarC), j);
                    if (!defpackage.a.i(boeVarB.b, j)) {
                        boeVarB = boeVarB.a(boeVarB.a, j, boeVarB.c, defpackage.ckd.h(j, 0.38f));
                        i6 = i6;
                    }
                } else {
                    boeVarB = boeVar2;
                }
                int i15 = i6 & (-458753);
                cldVarB = defpackage.bqa.b(7, bveVarC);
                i8 = i15;
                cgfVar5 = cgfVar4;
                boeVar4 = boeVarB;
            } else {
                if (i12 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                z5 |= true ^ z2;
                if (i7 != 0) {
                    i6 &= -7169;
                    j = ((defpackage.ckd) bveVarC.f(defpackage.bnq.a)).a;
                    boeVarB = defpackage.rj.b(defpackage.bxi.n(bveVarC), j);
                    if (!defpackage.a.i(boeVarB.b, j)) {
                        boeVarB = boeVarB.a(boeVarB.a, j, boeVarB.c, defpackage.ckd.h(j, 0.38f));
                        i6 = i6;
                    }
                } else {
                    boeVarB = boeVar2;
                }
                int i16 = i6 & (-458753);
                cldVarB = defpackage.bqa.b(7, bveVarC);
                i8 = i16;
                cgfVar5 = cgfVar4;
                boeVar4 = boeVarB;
            }
            boolean z7 = z5;
            bveVarC.l();
            int i17 = i8 << 3;
            d(cgfVar5, aferVar, z7, cldVarB, boeVar4, affgVar, bveVarC, ((i8 >> 3) & 14) | (i17 & 112) | (i8 & 896) | (57344 & i17) | (i17 & 458752) | (i8 & 3670016));
            cgfVar3 = cgfVar5;
            z4 = z7;
            cldVar2 = cldVarB;
            boeVar3 = boeVar4;
        } else {
            bveVarC.s();
            z4 = z5;
            cgfVar3 = cgfVar2;
            boeVar3 = boeVar2;
            cldVar2 = cldVar;
        }
        bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gqo(aferVar, cgfVar3, z4, boeVar3, cldVar2, affgVar, i, i2, 1);
        }
    }

    public static void d(defpackage.cgf cgfVar, defpackage.afer aferVar, boolean z, defpackage.cld cldVar, boe boeVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        defpackage.cgf cgfVar2;
        int i2;
        defpackage.bve bveVar2;
        float f;
        defpackage.affg affgVar2 = affgVar;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1134296466);
        if (i3 == 0) {
            cgfVar2 = cgfVar;
            i2 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i;
        } else {
            cgfVar2 = cgfVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(cldVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.C(boeVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.C(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.E(affgVar2) ? 524288 : 1048576;
        }
        int i4 = i2;
        if (bveVarC.I((i4 & 599187) != 599186, i4 & 1)) {
            bveVarC.v(976976045);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.asl();
                bwcVar.ad(objS);
            }
            defpackage.ask askVar = (defpackage.ask) objS;
            bwcVar.Y(false);
            defpackage.cgf cgfVarA = defpackage.bok.a(cgfVar2);
            if (defpackage.a.X(1, 0)) {
                f = 8.0f;
            } else if (defpackage.a.X(1, 1)) {
                f = 16.0f;
            } else {
                f = defpackage.a.X(1, 2) ? 28.0f : 0.0f;
            }
            bveVar2 = bveVarC;
            defpackage.cgf cgfVarA2 = defpackage.afw.w(defpackage.afw.E(defpackage.cjv.h(defpackage.awj.j(cgfVarA, defpackage.tna.aK(f + 24.0f, 40.0f)), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, cldVar, true, 0, 1042431), z ? boeVar.a : boeVar.c, cldVar), askVar, defpackage.bpk.a(false, 0.0f, 0L, cldVar, false, 247), z, new defpackage.ddw(0), aferVar).a(new defpackage.bsv(new defpackage.bev(19)));
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVar2, cgfVarA2);
            defpackage.afer aferVar2 = defpackage.cwl.a;
            bveVar2.w();
            if (bwcVar.t) {
                bveVar2.j(aferVar2);
            } else {
                bveVar2.y();
            }
            defpackage.byw.c(bveVar2, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVar2, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVar2, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVar2, defpackage.cwl.g);
            defpackage.byw.c(bveVar2, cgfVarN, defpackage.cwl.c);
            affgVar2 = affgVar;
            defpackage.dai.aA(defpackage.bnq.a.b(new defpackage.ckd(z ? boeVar.b : boeVar.d)), affgVar2, bveVar2, ((i4 >> 15) & 112) | 8);
            bwcVar.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bof(cgfVar, aferVar, z, cldVar, boeVar, affgVar2, i, 0);
        }
    }

    public static void e(final java.lang.String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, final java.util.List list, final defpackage.affg affgVar, defpackage.bve bveVar, final int i) {
        int i2;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1851426205);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f8 = f;
            i2 |= true != bveVarC.z(f8) ? 16 : 32;
        } else {
            f8 = f;
        }
        if ((i & 384) == 0) {
            f9 = f2;
            i2 |= true != bveVarC.z(f9) ? 128 : 256;
        } else {
            f9 = f2;
        }
        if ((i & 3072) == 0) {
            f10 = f3;
            i2 |= true != bveVarC.z(f10) ? 1024 : 2048;
        } else {
            f10 = f3;
        }
        if ((i & 24576) == 0) {
            f11 = f4;
            i2 |= true != bveVarC.z(f11) ? 8192 : 16384;
        } else {
            f11 = f4;
        }
        if ((196608 & i) == 0) {
            f12 = f5;
            i2 |= true != bveVarC.z(f12) ? 65536 : 131072;
        } else {
            f12 = f5;
        }
        if ((1572864 & i) == 0) {
            f13 = f6;
            i2 |= true != bveVarC.z(f13) ? 524288 : 1048576;
        } else {
            f13 = f6;
        }
        if ((12582912 & i) == 0) {
            f14 = f7;
            i2 |= true != bveVarC.z(f14) ? 4194304 : 8388608;
        } else {
            f14 = f7;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != bveVarC.E(list) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 268435456 : 536870912;
        }
        if (bveVarC.I((306783379 & i2) != 306783378, i2 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int i4 = i2;
            bwcVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.bmd(4);
                bwcVar.ad(objS);
            }
            defpackage.afer aferVar = (defpackage.afer) objS;
            if (!(bwcVar.a instanceof defpackage.com)) {
                throw new java.lang.IllegalStateException("Invalid applier");
            }
            bveVarC.u();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, str, new defpackage.cor(3));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f8), new defpackage.cor(4));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f9), new defpackage.cor(5));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f10), new defpackage.cor(6));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f11), new defpackage.cor(7));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f12), new defpackage.cor(8));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f13), new defpackage.cor(9));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f14), new defpackage.cor(10));
            defpackage.byw.c(bveVarC, list, new defpackage.bnm(9));
            affgVar.invoke(bveVarC, java.lang.Integer.valueOf((i4 >> 27) & 14));
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            final float f15 = f8;
            final float f16 = f9;
            final float f17 = f10;
            final float f18 = f11;
            final float f19 = f12;
            final float f20 = f13;
            final float f21 = f14;
            bxlVarJ.c = new defpackage.affg() { // from class: coq
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    java.lang.String str2 = str;
                    float f22 = f15;
                    float f23 = f16;
                    float f24 = f17;
                    float f25 = f18;
                    float f26 = f19;
                    int i5 = i;
                    int i6 = i5 | 1;
                    int i7 = 306783378 & i6;
                    java.util.List list2 = list;
                    int i8 = 613566756 & i6;
                    defpackage.affg affgVar2 = affgVar;
                    int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1);
                    defpackage.rq.e(str2, f22, f23, f24, f25, f26, f20, f21, list2, affgVar2, (defpackage.bve) obj, ((i7 + i7) & i8) | i9);
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static void f(final java.util.List list, final int i, final java.lang.String str, final defpackage.cka ckaVar, float f, final defpackage.cka ckaVar2, float f2, final float f3, final int i2, final int i3, final float f4, final float f5, float f6, final float f7, defpackage.bve bveVar, final int i4, final int i5) {
        int i6;
        float f8;
        float f9;
        int i7;
        int i8;
        float f10;
        int i9;
        boolean z;
        int i10 = i4 & 6;
        defpackage.bve bveVarC = bveVar.c(-1478270750);
        if (i10 == 0) {
            i6 = (true != bveVarC.E(list) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != bveVarC.A(i) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != bveVarC.C(str) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i6 |= true != bveVarC.C(ckaVar) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            f8 = f;
            i6 |= true != bveVarC.z(f8) ? 8192 : 16384;
        } else {
            f8 = f;
        }
        if ((196608 & i4) == 0) {
            i6 |= true != bveVarC.C(ckaVar2) ? 65536 : 131072;
        }
        if ((1572864 & i4) == 0) {
            f9 = f2;
            i6 |= true != bveVarC.z(f9) ? 524288 : 1048576;
        } else {
            f9 = f2;
        }
        if ((12582912 & i4) == 0) {
            i6 |= true != bveVarC.z(f3) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            i6 |= true != bveVarC.A(i2) ? 33554432 : 67108864;
        }
        if ((805306368 & i4) == 0) {
            i6 |= true != bveVarC.A(i3) ? 268435456 : 536870912;
        }
        if ((i5 & 6) == 0) {
            i7 = (true != bveVarC.z(f4) ? 2 : 4) | i5;
        } else {
            i7 = i5;
        }
        int i11 = i7;
        if ((i5 & 48) == 0) {
            i8 = i11 | (true != bveVarC.z(f5) ? 16 : 32);
        } else {
            i8 = i11;
        }
        if ((i5 & 384) == 0) {
            f10 = f6;
            int i12 = i8;
            z = true;
            i9 = i12 | (true == bveVarC.z(f10) ? 256 : 128);
        } else {
            f10 = f6;
            i9 = i8;
            z = true;
        }
        if ((i5 & 3072) == 0) {
            i9 |= z == bveVarC.z(f7) ? 2048 : 1024;
        }
        if (bveVarC.I(((i6 & 306783379) == 306783378 && (i9 & 1171) == 1170) ? false : true, i6 & 1)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if ((i4 & 1) != 0 && !bveVarC.F()) {
                bveVarC.s();
            }
            bveVarC.l();
            java.lang.Object objS = bwcVar.S();
            if (objS == defpackage.bvd.a) {
                objS = new defpackage.bmd(5);
                bwcVar.ad(objS);
            }
            defpackage.afer aferVar = (defpackage.afer) objS;
            if (!(bwcVar.a instanceof defpackage.com)) {
                throw new java.lang.IllegalStateException("Invalid applier");
            }
            bveVarC.u();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, str, new defpackage.bnm(15));
            defpackage.byw.c(bveVarC, list, new defpackage.bnm(16));
            defpackage.byw.c(bveVarC, new defpackage.ckv(i), new defpackage.bnm(17));
            defpackage.byw.c(bveVarC, ckaVar, new defpackage.bnm(18));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f8), new defpackage.bnm(19));
            defpackage.byw.c(bveVarC, ckaVar2, new defpackage.bnm(20));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f9), new defpackage.cor(1));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f3), new defpackage.cor(0));
            defpackage.byw.c(bveVarC, new defpackage.clh(i3), new defpackage.cor(2));
            defpackage.byw.c(bveVarC, new defpackage.clg(i2), new defpackage.bnm(10));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f4), new defpackage.bnm(11));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f5), new defpackage.bnm(12));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f10), new defpackage.bnm(13));
            defpackage.byw.c(bveVarC, java.lang.Float.valueOf(f7), new defpackage.bnm(14));
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            final float f11 = f8;
            final float f12 = f9;
            final float f13 = f10;
            bxlVarJ.c = new defpackage.affg() { // from class: cop
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).intValue();
                    java.util.List list2 = list;
                    int i13 = i;
                    java.lang.String str2 = str;
                    defpackage.cka ckaVar3 = ckaVar;
                    float f14 = f11;
                    defpackage.cka ckaVar4 = ckaVar2;
                    float f15 = f12;
                    float f16 = f3;
                    int i14 = i2;
                    int i15 = i3;
                    int i16 = i4;
                    float f17 = f4;
                    int i17 = i5;
                    int i18 = i16 | 1;
                    int i19 = i17 & 306783378;
                    int i20 = i18 & 306783378;
                    float f18 = f13;
                    int i21 = i17 & 613566756;
                    int i22 = i18 & 613566756;
                    float f19 = f7;
                    defpackage.rq.f(list2, i13, str2, ckaVar3, f14, ckaVar4, f15, f16, i14, i15, f17, f5, f18, f19, (defpackage.bve) obj, (i18 & (-920350135)) | i20 | (i22 >> 1) | ((i20 + i20) & i22), (i17 & (-920350135)) | i19 | (i21 >> 1) | ((i19 + i19) & i21));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static void g(java.util.ArrayList arrayList) {
        arrayList.add(defpackage.cnr.a);
    }

    public static void h(float f, java.util.ArrayList arrayList) {
        arrayList.add(new defpackage.cnt(f));
    }

    public static void i(float f, java.util.ArrayList arrayList) {
        arrayList.add(new defpackage.cob(f));
    }

    public static void j(float f, float f2, java.util.ArrayList arrayList) {
        arrayList.add(new defpackage.cnu(f, f2));
    }

    public static void k(float f, float f2, java.util.ArrayList arrayList) {
        arrayList.add(new defpackage.coc(f, f2));
    }

    public static void l(float f, float f2, java.util.ArrayList arrayList) {
        arrayList.add(new defpackage.cnv(f, f2));
    }

    public static void m(float f, float f2, java.util.ArrayList arrayList) {
        arrayList.add(new defpackage.cod(f, f2));
    }

    public static void n(float f, float f2, float f3, float f4, java.util.ArrayList arrayList) {
        arrayList.add(new defpackage.cnw(f, f2, f3, f4));
    }

    public static void o(float f, float f2, float f3, float f4, java.util.ArrayList arrayList) {
        arrayList.add(new defpackage.coe(f, f2, f3, f4));
    }

    public static void p(float f, float f2, java.util.ArrayList arrayList) {
        arrayList.add(new defpackage.cny(f, f2));
    }

    public static void q(float f, float f2, java.util.ArrayList arrayList) {
        arrayList.add(new defpackage.cog(f, f2));
    }

    public static /* synthetic */ defpackage.cnc r(defpackage.cjr cjrVar, int i) {
        defpackage.cnc cncVar = new defpackage.cnc(cjrVar, (((long) cjrVar.c()) << 32) | (((long) cjrVar.b()) & 4294967295L));
        cncVar.a = i;
        return cncVar;
    }
}
