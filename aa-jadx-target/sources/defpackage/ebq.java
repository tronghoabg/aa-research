package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ebq {
    public ebq(byte[] bArr) {
    }

    static android.view.View.AccessibilityDelegate a(android.view.View view) {
        return ep$.ExternalSyntheticApiModelOutline0.m(view);
    }

    static void b(android.view.View view, android.content.Context context, int[] iArr, android.util.AttributeSet attributeSet, android.content.res.TypedArray typedArray, int i, int i2) {
        ep$.ExternalSyntheticApiModelOutline0.m(view, context, iArr, attributeSet, typedArray, i, i2);
    }

    static int c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static defpackage.ers d(defpackage.erw erwVar, defpackage.afie afieVar, defpackage.esi esiVar) {
        java.lang.Class<?> jClass = ((defpackage.affr) afieVar).getJClass();
        jClass.getClass();
        return erwVar.b(jClass, esiVar);
    }

    public static defpackage.ery e(defpackage.esa esaVar, defpackage.erw erwVar, defpackage.esi esiVar) {
        erwVar.getClass();
        esiVar.getClass();
        return new defpackage.ery(esaVar.getViewModelStore(), erwVar, esiVar);
    }

    public static defpackage.fbm f(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(2131429872);
            defpackage.fbm fbmVar = tag instanceof defpackage.fbm ? (defpackage.fbm) tag : null;
            if (fbmVar != null) {
                return fbmVar;
            }
            java.lang.Object objB = defpackage.edd.b(view);
            view = objB instanceof android.view.View ? (android.view.View) objB : null;
        }
        return null;
    }

    public static void g(android.view.View view, defpackage.fbm fbmVar) {
        view.getClass();
        view.setTag(2131429872, fbmVar);
    }

    public static defpackage.fbl h(defpackage.fbm fbmVar) {
        return new defpackage.fbl(new defpackage.fbq(fbmVar, new defpackage.djm(fbmVar, 8)));
    }

    public static defpackage.cgf i(defpackage.cgf cgfVar, boolean z) {
        cgfVar.getClass();
        return z ? defpackage.bzd.u(cgfVar, -1.0f, 1.0f) : cgfVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0377  */
    /* JADX WARN: Code duplicated, block: B:102:0x037b  */
    /* JADX WARN: Code duplicated, block: B:106:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:109:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x0125  */
    /* JADX WARN: Code duplicated, block: B:76:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0178  */
    /* JADX WARN: Code duplicated, block: B:80:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0210  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214  */
    /* JADX WARN: Code duplicated, block: B:88:0x025b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0270  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:96:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:97:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:99:0x0347  */
    public static void j(defpackage.nkp nkpVar, boolean z, boolean z2, defpackage.cgf cgfVar, boolean z3, boolean z4, defpackage.bve bveVar, int i, int i2) {
        int i3;
        defpackage.cgf cgfVar2;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        boolean z7;
        boolean z8;
        defpackage.bve bveVar2;
        defpackage.cgf cgfVar3;
        defpackage.bxl bxlVarJ;
        defpackage.cgf cgfVar4;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z9;
        defpackage.cgc cgcVar;
        defpackage.cgf cgfVarI;
        defpackage.cgf cgfVarI2;
        boolean z10;
        defpackage.bwc bwcVar;
        defpackage.afer aferVar;
        defpackage.bve bveVar3;
        boolean z11;
        boolean z12;
        defpackage.bwc bwcVar2;
        defpackage.afer aferVar2;
        defpackage.bwc bwcVar3;
        defpackage.afer aferVar3;
        boolean z13;
        defpackage.bwc bwcVar4;
        defpackage.afer aferVar4;
        int i10;
        nkpVar.getClass();
        int i11 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1237006704);
        if (i11 == 0) {
            i3 = (true != ((i & 8) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != bveVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != bveVarC.D(z2) ? 128 : 256;
        }
        int i12 = i2 & 8;
        if (i12 == 0) {
            if ((i & 3072) == 0) {
                cgfVar2 = cgfVar;
                i3 |= true != bveVarC.C(cgfVar2) ? 1024 : 2048;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (i4 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (true != bveVarC.D(z3)) {
                    i5 = 8192;
                } else {
                    i5 = 16384;
                }
                i3 |= i5;
            }
            if ((196608 & i) != 0) {
                if (true != bveVarC.D(z4)) {
                    i10 = 65536;
                } else {
                    i10 = 131072;
                }
                i3 |= i10;
            }
            if ((74899 & i3) != 74898) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (bveVarC.I(z6, i3 & 1)) {
                int i13 = i3 >> 3;
                int i14 = i3 << 3;
                int i15 = i3 >> 6;
                int i16 = i14 & 112;
                if (i12 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                } else {
                    cgfVar4 = cgfVar2;
                }
                i6 = i15 & 7168;
                i7 = i16 | 448;
                i8 = i16 | 3520;
                i9 = i13 & 57344;
                z9 = z5 & z3;
                cgcVar = defpackage.cgf.e;
                cgfVarI = i(defpackage.dai.y(cgcVar, "home"), z9);
                cgfVarI2 = i(defpackage.dai.y(cgcVar, "nativeBackButton"), z9);
                if (z) {
                    bveVarC.v(847772189);
                    if (z2) {
                        bveVarC.v(847784682);
                        defpackage.cgf cgfVarC = defpackage.awj.c(cgcVar, 1.0f);
                        defpackage.cty ctyVarA = defpackage.awb.a(defpackage.ati.e, defpackage.cfs.n, bveVarC, 54);
                        bwcVar4 = (defpackage.bwc) bveVarC;
                        int iF = defpackage.a.f(bwcVar4.u);
                        defpackage.cdd cddVarAh = bwcVar4.ah();
                        defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarC);
                        aferVar4 = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar4.t) {
                            bveVarC.j(aferVar4);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.affg affgVar = defpackage.cwl.e;
                        defpackage.byw.c(bveVarC, ctyVarA, affgVar);
                        defpackage.affg affgVar2 = defpackage.cwl.d;
                        defpackage.byw.c(bveVarC, cddVarAh, affgVar2);
                        java.lang.Integer numValueOf = java.lang.Integer.valueOf(iF);
                        defpackage.affg affgVar3 = defpackage.cwl.f;
                        defpackage.byw.c(bveVarC, numValueOf, affgVar3);
                        defpackage.affc affcVar = defpackage.cwl.g;
                        defpackage.byw.b(bveVarC, affcVar);
                        defpackage.affg affgVar4 = defpackage.cwl.c;
                        defpackage.byw.c(bveVarC, cgfVarN, affgVar4);
                        defpackage.ksk kskVar = defpackage.nmr.a;
                        defpackage.cgf cgfVarB = defpackage.awj.b(defpackage.awj.m(cgcVar, 592.0f), 1.0f);
                        defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
                        int iF2 = defpackage.a.f(bwcVar4.u);
                        defpackage.cdd cddVarAh2 = bwcVar4.ah();
                        defpackage.cgf cgfVarN2 = defpackage.bzo.n(bveVarC, cgfVarB);
                        bveVarC.w();
                        if (bwcVar4.t) {
                            bveVarC.j(aferVar4);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarB, affgVar);
                        defpackage.byw.c(bveVarC, cddVarAh2, affgVar2);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF2), affgVar3);
                        defpackage.byw.b(bveVarC, affcVar);
                        defpackage.byw.c(bveVarC, cgfVarN2, affgVar4);
                        defpackage.ats atsVar = defpackage.ats.a;
                        z10 = z9;
                        k(i(defpackage.dai.y(atsVar.a(cgcVar, defpackage.cfs.d), "nativeBackButton"), z10), nkpVar, true, z4, bveVarC, i7 | i6);
                        m(i(defpackage.dai.y(atsVar.a(cgcVar, defpackage.cfs.e), "home"), z10), nkpVar, true, true, z4, bveVarC, i8 | i9);
                        bveVar3 = bveVarC;
                        bwcVar4.Y(true);
                        bwcVar4.Y(true);
                        z13 = false;
                        bwcVar4.Y(false);
                        z12 = true;
                    } else {
                        z10 = z9;
                        bveVarC.v(848659843);
                        defpackage.cgf cgfVarC2 = defpackage.awj.c(cgfVar4, 1.0f);
                        defpackage.cty ctyVarA2 = defpackage.awb.a(defpackage.ati.g, defpackage.cfs.n, bveVarC, 54);
                        bwcVar3 = (defpackage.bwc) bveVarC;
                        int iF3 = defpackage.a.f(bwcVar3.u);
                        defpackage.cdd cddVarAh3 = bwcVar3.ah();
                        defpackage.cgf cgfVarN3 = defpackage.bzo.n(bveVarC, cgfVarC2);
                        aferVar3 = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar3.t) {
                            bveVarC.j(aferVar3);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarA2, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh3, defpackage.cwl.d);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF3), defpackage.cwl.f);
                        defpackage.byw.b(bveVarC, defpackage.cwl.g);
                        defpackage.byw.c(bveVarC, cgfVarN3, defpackage.cwl.c);
                        k(cgfVarI2, nkpVar, false, z4, bveVarC, i7 | i6);
                        m(cgfVarI, nkpVar, false, false, z4, bveVarC, i8 | i9);
                        bveVar3 = bveVarC;
                        bwcVar3.Y(true);
                        z13 = false;
                        bwcVar3.Y(false);
                        z12 = false;
                    }
                    ((defpackage.bwc) bveVar3).Y(z13);
                } else {
                    z10 = z9;
                    bveVarC.v(849256407);
                    if (z2) {
                        bveVarC.v(849261243);
                        defpackage.cgf cgfVarC3 = defpackage.awj.c(cgcVar, 1.0f);
                        defpackage.cty ctyVarA3 = defpackage.atu.a(defpackage.ati.e, defpackage.cfs.k, bveVarC, 54);
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        int iF4 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh4 = bwcVar2.ah();
                        defpackage.cgf cgfVarN4 = defpackage.bzo.n(bveVarC, cgfVarC3);
                        aferVar2 = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar2.t) {
                            bveVarC.j(aferVar2);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.affg affgVar5 = defpackage.cwl.e;
                        defpackage.byw.c(bveVarC, ctyVarA3, affgVar5);
                        defpackage.affg affgVar6 = defpackage.cwl.d;
                        defpackage.byw.c(bveVarC, cddVarAh4, affgVar6);
                        java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iF4);
                        defpackage.affg affgVar7 = defpackage.cwl.f;
                        defpackage.byw.c(bveVarC, numValueOf2, affgVar7);
                        defpackage.affc affcVar2 = defpackage.cwl.g;
                        defpackage.byw.b(bveVarC, affcVar2);
                        defpackage.affg affgVar8 = defpackage.cwl.c;
                        defpackage.byw.c(bveVarC, cgfVarN4, affgVar8);
                        defpackage.ksk kskVar2 = defpackage.nmr.a;
                        defpackage.cgf cgfVarR = defpackage.awj.r(defpackage.awj.d(cgcVar, 384.0f));
                        defpackage.cty ctyVarB2 = defpackage.atp.b(defpackage.cfs.a, false);
                        int iF5 = defpackage.a.f(bwcVar2.u);
                        defpackage.cdd cddVarAh5 = bwcVar2.ah();
                        defpackage.cgf cgfVarN5 = defpackage.bzo.n(bveVarC, cgfVarR);
                        bveVarC.w();
                        if (bwcVar2.t) {
                            bveVarC.j(aferVar2);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarB2, affgVar5);
                        defpackage.byw.c(bveVarC, cddVarAh5, affgVar6);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF5), affgVar7);
                        defpackage.byw.b(bveVarC, affcVar2);
                        defpackage.byw.c(bveVarC, cgfVarN5, affgVar8);
                        defpackage.ats atsVar2 = defpackage.ats.a;
                        m(defpackage.dai.y(atsVar2.a(cgcVar, defpackage.cfs.e), "home"), nkpVar, true, true, z4, bveVarC, i8 | i9);
                        bveVar3 = bveVarC;
                        k(defpackage.dai.y(atsVar2.a(cgcVar, defpackage.cfs.h), "nativeBackButton"), nkpVar, true, z4, bveVar3, i7 | i6);
                        bwcVar2.Y(true);
                        bwcVar2.Y(true);
                        z11 = false;
                        bwcVar2.Y(false);
                        z12 = true;
                    } else {
                        bveVarC.v(850052766);
                        defpackage.cgf cgfVarC4 = defpackage.awj.c(cgfVar4, 1.0f);
                        defpackage.cty ctyVarA4 = defpackage.atu.a(defpackage.ati.g, defpackage.cfs.k, bveVarC, 54);
                        bwcVar = (defpackage.bwc) bveVarC;
                        int iF6 = defpackage.a.f(bwcVar.u);
                        defpackage.cdd cddVarAh6 = bwcVar.ah();
                        defpackage.cgf cgfVarN6 = defpackage.bzo.n(bveVarC, cgfVarC4);
                        aferVar = defpackage.cwl.a;
                        bveVarC.w();
                        if (bwcVar.t) {
                            bveVarC.j(aferVar);
                        } else {
                            bveVarC.y();
                        }
                        defpackage.byw.c(bveVarC, ctyVarA4, defpackage.cwl.e);
                        defpackage.byw.c(bveVarC, cddVarAh6, defpackage.cwl.d);
                        defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF6), defpackage.cwl.f);
                        defpackage.byw.b(bveVarC, defpackage.cwl.g);
                        defpackage.byw.c(bveVarC, cgfVarN6, defpackage.cwl.c);
                        m(cgfVarI, nkpVar, false, false, z4, bveVarC, i8 | i9);
                        bveVar3 = bveVarC;
                        k(cgfVarI2, nkpVar, false, z4, bveVar3, i7 | i6);
                        bwcVar.Y(true);
                        z11 = false;
                        bwcVar.Y(false);
                        z12 = false;
                    }
                    ((defpackage.bwc) bveVar3).Y(z11);
                }
                z7 = z12;
                bveVar2 = bveVar3;
                z8 = z10;
                cgfVar3 = cgfVar4;
            } else {
                bveVarC.s();
                z7 = z2;
                z8 = z3;
                bveVar2 = bveVarC;
                cgfVar3 = cgfVar2;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new nkv(nkpVar, z, z7, cgfVar3, z8, z4, i, i2);
            }
        }
        i3 |= 3072;
        cgfVar2 = cgfVar;
        i4 = i2 & 16;
        if (i4 != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (true != bveVarC.D(z3)) {
                i5 = 8192;
            } else {
                i5 = 16384;
            }
            i3 |= i5;
        }
        if ((196608 & i) != 0) {
            if (true != bveVarC.D(z4)) {
                i10 = 65536;
            } else {
                i10 = 131072;
            }
            i3 |= i10;
        }
        if ((74899 & i3) != 74898) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (bveVarC.I(z6, i3 & 1)) {
            int i17 = i3 >> 3;
            int i18 = i3 << 3;
            int i19 = i3 >> 6;
            int i110 = i18 & 112;
            if (i12 != 0) {
                cgfVar4 = defpackage.cgf.e;
            } else {
                cgfVar4 = cgfVar2;
            }
            i6 = i19 & 7168;
            i7 = i110 | 448;
            i8 = i110 | 3520;
            i9 = i17 & 57344;
            z9 = z5 & z3;
            cgcVar = defpackage.cgf.e;
            cgfVarI = i(defpackage.dai.y(cgcVar, "home"), z9);
            cgfVarI2 = i(defpackage.dai.y(cgcVar, "nativeBackButton"), z9);
            if (z) {
                bveVarC.v(847772189);
                if (z2) {
                    bveVarC.v(847784682);
                    defpackage.cgf cgfVarC5 = defpackage.awj.c(cgcVar, 1.0f);
                    defpackage.cty ctyVarA5 = defpackage.awb.a(defpackage.ati.e, defpackage.cfs.n, bveVarC, 54);
                    bwcVar4 = (defpackage.bwc) bveVarC;
                    int iF7 = defpackage.a.f(bwcVar4.u);
                    defpackage.cdd cddVarAh7 = bwcVar4.ah();
                    defpackage.cgf cgfVarN7 = defpackage.bzo.n(bveVarC, cgfVarC5);
                    aferVar4 = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar4.t) {
                        bveVarC.j(aferVar4);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.affg affgVar9 = defpackage.cwl.e;
                    defpackage.byw.c(bveVarC, ctyVarA5, affgVar9);
                    defpackage.affg affgVar10 = defpackage.cwl.d;
                    defpackage.byw.c(bveVarC, cddVarAh7, affgVar10);
                    java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(iF7);
                    defpackage.affg affgVar11 = defpackage.cwl.f;
                    defpackage.byw.c(bveVarC, numValueOf3, affgVar11);
                    defpackage.affc affcVar3 = defpackage.cwl.g;
                    defpackage.byw.b(bveVarC, affcVar3);
                    defpackage.affg affgVar12 = defpackage.cwl.c;
                    defpackage.byw.c(bveVarC, cgfVarN7, affgVar12);
                    defpackage.ksk kskVar3 = defpackage.nmr.a;
                    defpackage.cgf cgfVarB2 = defpackage.awj.b(defpackage.awj.m(cgcVar, 592.0f), 1.0f);
                    defpackage.cty ctyVarB3 = defpackage.atp.b(defpackage.cfs.a, false);
                    int iF8 = defpackage.a.f(bwcVar4.u);
                    defpackage.cdd cddVarAh8 = bwcVar4.ah();
                    defpackage.cgf cgfVarN8 = defpackage.bzo.n(bveVarC, cgfVarB2);
                    bveVarC.w();
                    if (bwcVar4.t) {
                        bveVarC.j(aferVar4);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB3, affgVar9);
                    defpackage.byw.c(bveVarC, cddVarAh8, affgVar10);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF8), affgVar11);
                    defpackage.byw.b(bveVarC, affcVar3);
                    defpackage.byw.c(bveVarC, cgfVarN8, affgVar12);
                    defpackage.ats atsVar3 = defpackage.ats.a;
                    z10 = z9;
                    k(i(defpackage.dai.y(atsVar3.a(cgcVar, defpackage.cfs.d), "nativeBackButton"), z10), nkpVar, true, z4, bveVarC, i7 | i6);
                    m(i(defpackage.dai.y(atsVar3.a(cgcVar, defpackage.cfs.e), "home"), z10), nkpVar, true, true, z4, bveVarC, i8 | i9);
                    bveVar3 = bveVarC;
                    bwcVar4.Y(true);
                    bwcVar4.Y(true);
                    z13 = false;
                    bwcVar4.Y(false);
                    z12 = true;
                } else {
                    z10 = z9;
                    bveVarC.v(848659843);
                    defpackage.cgf cgfVarC6 = defpackage.awj.c(cgfVar4, 1.0f);
                    defpackage.cty ctyVarA6 = defpackage.awb.a(defpackage.ati.g, defpackage.cfs.n, bveVarC, 54);
                    bwcVar3 = (defpackage.bwc) bveVarC;
                    int iF9 = defpackage.a.f(bwcVar3.u);
                    defpackage.cdd cddVarAh9 = bwcVar3.ah();
                    defpackage.cgf cgfVarN9 = defpackage.bzo.n(bveVarC, cgfVarC6);
                    aferVar3 = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar3.t) {
                        bveVarC.j(aferVar3);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarA6, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh9, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF9), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN9, defpackage.cwl.c);
                    k(cgfVarI2, nkpVar, false, z4, bveVarC, i7 | i6);
                    m(cgfVarI, nkpVar, false, false, z4, bveVarC, i8 | i9);
                    bveVar3 = bveVarC;
                    bwcVar3.Y(true);
                    z13 = false;
                    bwcVar3.Y(false);
                    z12 = false;
                }
                ((defpackage.bwc) bveVar3).Y(z13);
            } else {
                z10 = z9;
                bveVarC.v(849256407);
                if (z2) {
                    bveVarC.v(849261243);
                    defpackage.cgf cgfVarC7 = defpackage.awj.c(cgcVar, 1.0f);
                    defpackage.cty ctyVarA7 = defpackage.atu.a(defpackage.ati.e, defpackage.cfs.k, bveVarC, 54);
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    int iF10 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh10 = bwcVar2.ah();
                    defpackage.cgf cgfVarN10 = defpackage.bzo.n(bveVarC, cgfVarC7);
                    aferVar2 = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.affg affgVar13 = defpackage.cwl.e;
                    defpackage.byw.c(bveVarC, ctyVarA7, affgVar13);
                    defpackage.affg affgVar14 = defpackage.cwl.d;
                    defpackage.byw.c(bveVarC, cddVarAh10, affgVar14);
                    java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(iF10);
                    defpackage.affg affgVar15 = defpackage.cwl.f;
                    defpackage.byw.c(bveVarC, numValueOf4, affgVar15);
                    defpackage.affc affcVar4 = defpackage.cwl.g;
                    defpackage.byw.b(bveVarC, affcVar4);
                    defpackage.affg affgVar16 = defpackage.cwl.c;
                    defpackage.byw.c(bveVarC, cgfVarN10, affgVar16);
                    defpackage.ksk kskVar4 = defpackage.nmr.a;
                    defpackage.cgf cgfVarR2 = defpackage.awj.r(defpackage.awj.d(cgcVar, 384.0f));
                    defpackage.cty ctyVarB4 = defpackage.atp.b(defpackage.cfs.a, false);
                    int iF11 = defpackage.a.f(bwcVar2.u);
                    defpackage.cdd cddVarAh11 = bwcVar2.ah();
                    defpackage.cgf cgfVarN11 = defpackage.bzo.n(bveVarC, cgfVarR2);
                    bveVarC.w();
                    if (bwcVar2.t) {
                        bveVarC.j(aferVar2);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarB4, affgVar13);
                    defpackage.byw.c(bveVarC, cddVarAh11, affgVar14);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF11), affgVar15);
                    defpackage.byw.b(bveVarC, affcVar4);
                    defpackage.byw.c(bveVarC, cgfVarN11, affgVar16);
                    defpackage.ats atsVar4 = defpackage.ats.a;
                    m(defpackage.dai.y(atsVar4.a(cgcVar, defpackage.cfs.e), "home"), nkpVar, true, true, z4, bveVarC, i8 | i9);
                    bveVar3 = bveVarC;
                    k(defpackage.dai.y(atsVar4.a(cgcVar, defpackage.cfs.h), "nativeBackButton"), nkpVar, true, z4, bveVar3, i7 | i6);
                    bwcVar2.Y(true);
                    bwcVar2.Y(true);
                    z11 = false;
                    bwcVar2.Y(false);
                    z12 = true;
                } else {
                    bveVarC.v(850052766);
                    defpackage.cgf cgfVarC8 = defpackage.awj.c(cgfVar4, 1.0f);
                    defpackage.cty ctyVarA8 = defpackage.atu.a(defpackage.ati.g, defpackage.cfs.k, bveVarC, 54);
                    bwcVar = (defpackage.bwc) bveVarC;
                    int iF12 = defpackage.a.f(bwcVar.u);
                    defpackage.cdd cddVarAh12 = bwcVar.ah();
                    defpackage.cgf cgfVarN12 = defpackage.bzo.n(bveVarC, cgfVarC8);
                    aferVar = defpackage.cwl.a;
                    bveVarC.w();
                    if (bwcVar.t) {
                        bveVarC.j(aferVar);
                    } else {
                        bveVarC.y();
                    }
                    defpackage.byw.c(bveVarC, ctyVarA8, defpackage.cwl.e);
                    defpackage.byw.c(bveVarC, cddVarAh12, defpackage.cwl.d);
                    defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF12), defpackage.cwl.f);
                    defpackage.byw.b(bveVarC, defpackage.cwl.g);
                    defpackage.byw.c(bveVarC, cgfVarN12, defpackage.cwl.c);
                    m(cgfVarI, nkpVar, false, false, z4, bveVarC, i8 | i9);
                    bveVar3 = bveVarC;
                    k(cgfVarI2, nkpVar, false, z4, bveVar3, i7 | i6);
                    bwcVar.Y(true);
                    z11 = false;
                    bwcVar.Y(false);
                    z12 = false;
                }
                ((defpackage.bwc) bveVar3).Y(z11);
            }
            z7 = z12;
            bveVar2 = bveVar3;
            z8 = z10;
            cgfVar3 = cgfVar4;
        } else {
            bveVarC.s();
            z7 = z2;
            z8 = z3;
            bveVar2 = bveVarC;
            cgfVar3 = cgfVar2;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new nkv(nkpVar, z, z7, cgfVar3, z8, z4, i, i2);
        }
    }

    public static void k(defpackage.cgf cgfVar, defpackage.nkp nkpVar, boolean z, boolean z2, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-522016425);
        boolean z3 = true;
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.D(z2) ? 1024 : 2048;
        }
        if (bveVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.cne cneVarH = defpackage.day.h(z ? 2131231578 : 2131231580, bveVarC, 0);
            defpackage.ktf ktfVar = nmt.a;
            int i4 = i2 & 112;
            defpackage.ktf ktfVar2 = nmt.a;
            if (i4 != 32 && ((i2 & 64) == 0 || !bveVarC.E(nkpVar))) {
                z3 = false;
            }
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (z3 || objS == defpackage.bvd.a) {
                objS = new defpackage.niw(nkpVar, 6);
                bwcVar.ad(objS);
            }
            defpackage.khg.m(cneVarH, (defpackage.afer) objS, cgfVar, ktfVar2, z2, null, null, null, null, bveVarC, ((i2 << 6) & 896) | 8 | ((i2 << 3) & 57344), 0, 4064);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bqz(cgfVar, nkpVar, z, z2, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean] */
    public static void l(defpackage.cgf cgfVar, defpackage.nkp nkpVar, boolean z, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        ?? r0;
        defpackage.bys bysVar;
        defpackage.afau afauVar;
        int i3;
        boolean z2;
        java.lang.Object bvzVar;
        defpackage.bwc bwcVar;
        defpackage.cgf cgfVarA;
        int i4;
        defpackage.ktf ktfVarA;
        defpackage.ktf ktfVar;
        int i5;
        boolean z3 = z;
        nkpVar.getClass();
        int i6 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1729865428);
        if (i6 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(nkpVar) : bveVarC.E(nkpVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z3) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            defpackage.bys bysVarM = defpackage.bxi.m(nkpVar.e(), 0, bveVarC);
            defpackage.bys bysVarM2 = defpackage.bxi.m(nkpVar.c(), defpackage.kxh.a, bveVarC);
            boolean z4 = ((java.lang.Number) bysVarM.a()).intValue() != 3;
            defpackage.eqp eqpVar = nkpVar.d;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            defpackage.bys bysVarM3 = defpackage.bxi.m(eqpVar, bool, bveVarC);
            defpackage.eqp eqpVar2 = nkpVar.e;
            java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
            defpackage.bys bysVarM4 = defpackage.bxi.m(eqpVar2, bool2, bveVarC);
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            if (z3) {
                afauVar = new defpackage.afau(2131231136, bool);
                bysVar = bysVarM;
            } else if (((java.lang.Boolean) bysVarM4.a()).booleanValue()) {
                bysVar = bysVarM;
                int iL = (int) defpackage.acnf.a.fF().l();
                if (iL == 1) {
                    afauVar = new defpackage.afau(2131231505, bool2);
                } else if (iL != 2) {
                    afauVar = iL != 3 ? new defpackage.afau(2131231705, bool) : new defpackage.afau(2131233031, bool2);
                } else {
                    afauVar = new defpackage.afau(2131231136, bool);
                }
            } else {
                bysVar = bysVarM;
                afauVar = new defpackage.afau(2131231705, bool);
            }
            int iIntValue = ((java.lang.Number) afauVar.a).intValue();
            boolean zBooleanValue = ((java.lang.Boolean) afauVar.b).booleanValue();
            defpackage.ktl ktlVarK = defpackage.kfn.k(z3, bveVarC, 0);
            if (!zBooleanValue) {
                float[] fArr = defpackage.clr.a;
                defpackage.cmd cmdVar = defpackage.clr.u;
                ktlVarK = defpackage.ktl.a(ktlVarK, defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, cmdVar), defpackage.cjv.k(0.0f, 0.0f, 0.0f, 0.0f, cmdVar), 249);
            }
            defpackage.ktl ktlVar = ktlVarK;
            defpackage.acnf acnfVar = defpackage.acnf.a;
            if (((int) acnfVar.fF().l()) == 2 || ((int) acnfVar.fF().l()) == 3) {
                i3 = 0;
                z2 = true;
            } else {
                i3 = 0;
                z2 = false;
            }
            defpackage.cne cneVarH = defpackage.day.h(iIntValue, bveVarC, i3);
            boolean zC = ((i2 & 112) == 32 || ((i2 & 64) != 0 && bveVarC.E(nkpVar))) | bveVarC.C(bysVar) | bveVarC.C(bysVarM2) | bveVarC.E(context);
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar2.S();
            if (zC || objS == defpackage.bvd.a) {
                bwcVar = bwcVar2;
                bvzVar = new defpackage.bvz(nkpVar, context, bysVar, bysVarM2, 2);
                bwcVar.ad(bvzVar);
            } else {
                bvzVar = objS;
                bwcVar = bwcVar2;
            }
            defpackage.afer aferVar = (defpackage.afer) bvzVar;
            if (z3) {
                float f = defpackage.gjr.P0.k;
                cgfVarA = cgfVar.a(new defpackage.avr(f, f, f, f));
            } else {
                cgfVarA = cgfVar;
            }
            boolean zD = bveVarC.D(z4) | bveVarC.C(bysVarM3);
            java.lang.Object objS2 = bwcVar.S();
            if (zD || objS2 == defpackage.bvd.a) {
                i4 = 0;
                objS2 = new defpackage.njo(z4, bysVarM3, i4);
                bwcVar.ad(objS2);
            } else {
                i4 = 0;
            }
            defpackage.cgf cgfVarA2 = defpackage.bzd.r(cgfVarA, (defpackage.affc) objS2).a(new defpackage.dci("assistant"));
            if (z3) {
                ktfVar = defpackage.ktf.g;
                i5 = 1;
            } else {
                if (((java.lang.Boolean) bysVarM4.a()).booleanValue() && z2) {
                    defpackage.ksk kskVar = defpackage.nmr.a;
                    ktfVarA = defpackage.ktf.a(defpackage.nmr.d, 0.0f, 24.0f, new defpackage.dlr(24.0f), 0.0f, 505);
                } else {
                    defpackage.ksk kskVar2 = defpackage.nmr.a;
                    ktfVarA = defpackage.nmr.d;
                }
                ktfVar = ktfVarA;
                i5 = i4;
            }
            defpackage.bve bveVar3 = bveVarC;
            defpackage.khg.m(cneVarH, aferVar, cgfVarA2, ktfVar, (z4 && ((java.lang.Boolean) bysVarM3.a()).booleanValue()) ? 1 : i4, null, ktlVar, null, null, bveVar3, 8, 0, 3808);
            r0 = i5;
            bveVar2 = bveVar3;
        } else {
            defpackage.bve bveVar4 = bveVarC;
            bveVar4.s();
            r0 = z3;
            bveVar2 = bveVar4;
        }
        ?? r3 = r0;
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.nhv(cgfVar, nkpVar, r3, i, 2);
        }
    }

    public static void m(final defpackage.cgf cgfVar, defpackage.nkp nkpVar, boolean z, final boolean z2, final boolean z3, defpackage.bve bveVar, final int i) {
        int i2;
        defpackage.njl njlVar;
        defpackage.njk njkVar;
        defpackage.gja gjaVarA;
        int iA;
        defpackage.cgf cgfVarA;
        defpackage.ktf ktfVar;
        boolean z4;
        defpackage.ktz ktzVarG;
        final defpackage.nkp nkpVar2 = nkpVar;
        final boolean z5 = z;
        nkpVar2.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1726625260);
        if (i3 == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? bveVarC.C(nkpVar2) : bveVarC.E(nkpVar2)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z5) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.D(z2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.D(z3) ? 8192 : 16384;
        }
        if (bveVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            defpackage.eqp eqpVarB = nkpVar2.b();
            defpackage.bys bysVarM = defpackage.bxi.m(eqpVarB, eqpVarB.e(), bveVarC);
            defpackage.eqp eqpVar = nkpVar2.k.e;
            defpackage.bys bysVarM2 = defpackage.bxi.m(eqpVar, eqpVar.e(), bveVarC);
            defpackage.eqp eqpVarA = nkpVar2.a();
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            defpackage.bys bysVarM3 = defpackage.bxi.m(eqpVarA, bool, bveVarC);
            defpackage.bys bysVarM4 = defpackage.bxi.m(nkpVar2.e(), 0, bveVarC);
            defpackage.bys bysVarM5 = defpackage.bxi.m(nkpVar2.f, bool, bveVarC);
            if (((java.lang.Boolean) bysVarM5.a()).booleanValue()) {
                njlVar = defpackage.njl.LAUNCHER;
            } else {
                njlVar = (defpackage.njl) bysVarM.a();
                if (njlVar == null) {
                    defpackage.bxl bxlVarJ = bveVarC.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new defpackage.affg() { // from class: njj
                            @Override // defpackage.affg
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                defpackage.bve bveVar2 = (defpackage.bve) obj;
                                ((java.lang.Integer) obj2).intValue();
                                defpackage.cgf cgfVar2 = cgfVar;
                                int i4 = i | 1;
                                int i5 = 306783378 & i4;
                                int i6 = 613566756 & i4;
                                defpackage.ebq.m(cgfVar2, nkpVar2, z5, z2, z3, bveVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                                return defpackage.afbk.a;
                            }
                        };
                        return;
                    }
                    return;
                }
            }
            if (((java.lang.Boolean) bysVarM5.a()).booleanValue()) {
                njkVar = defpackage.njk.LAUNCHER;
            } else {
                njkVar = (defpackage.njk) bysVarM2.a();
                if (njkVar == null) {
                    defpackage.bxl bxlVarJ2 = bveVarC.J();
                    if (bxlVarJ2 != null) {
                        bxlVarJ2.c = new mvr(cgfVar, nkpVar, z, z2, z3, i, 2);
                        return;
                    }
                    return;
                }
            }
            nkpVar2 = nkpVar;
            defpackage.njk njkVar2 = njkVar;
            if (z) {
                bveVarC.v(-1363761723);
                boolean zA = bveVarC.A(((java.lang.Number) bysVarM4.a()).intValue()) | bveVarC.A(njkVar2.ordinal());
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                java.lang.Object objS = bwcVar.S();
                if (zA || objS == defpackage.bvd.a) {
                    objS = new defpackage.nng(new defpackage.lyb(njkVar2, nkpVar2, bysVarM4, 7), new defpackage.mtd(nkpVar2, bysVarM4, 19), null, null);
                    bwcVar.ad(objS);
                }
                gjaVarA = ((defpackage.nng) objS).a(njlVar, java.lang.Integer.valueOf(((java.lang.Number) bysVarM4.a()).intValue()), bveVarC, 0);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-1363112583);
                boolean zA2 = bveVarC.A(((java.lang.Number) bysVarM4.a()).intValue()) | bveVarC.A(njlVar.ordinal());
                defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
                java.lang.Object objS2 = bwcVar2.S();
                if (zA2 || objS2 == defpackage.bvd.a) {
                    objS2 = new defpackage.nng(new defpackage.lyb(njlVar, nkpVar2, bysVarM4, 8), new defpackage.mtd(nkpVar2, bysVarM4, 20), null, null);
                    bwcVar2.ad(objS2);
                }
                gjaVarA = ((defpackage.nng) objS2).a(njlVar, java.lang.Integer.valueOf(((java.lang.Number) bysVarM4.a()).intValue()), bveVarC, 0);
                bwcVar2.Y(false);
            }
            if (!z) {
                defpackage.yqm yqmVar = defpackage.nte.a;
                iA = njlVar.a(((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b());
            } else if (z2) {
                iA = 2131231636;
            } else {
                defpackage.yqm yqmVar2 = defpackage.nte.a;
                defpackage.ntb ntbVarB = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).b();
                if (ntbVarB.E()) {
                    iA = njkVar2.e;
                } else {
                    boolean zJ = ntbVarB.J();
                    defpackage.mmi.c();
                    iA = zJ != defpackage.mmi.h() ? njkVar2.d : njkVar2.c;
                }
            }
            defpackage.cne cneVarH = defpackage.day.h(iA, bveVarC, 0);
            boolean zBooleanValue = ((java.lang.Boolean) bysVarM3.a()).booleanValue();
            if (z) {
                float f = defpackage.gjr.P0.k;
                cgfVarA = cgfVar.a(new defpackage.avr(f, f, f, f));
            } else {
                cgfVarA = cgfVar;
            }
            if (z) {
                ktfVar = defpackage.ktf.g;
                z4 = true;
            } else {
                defpackage.ksk kskVar = defpackage.nmr.a;
                ktfVar = defpackage.nmr.d;
                z4 = false;
            }
            defpackage.ktf ktfVar2 = ktfVar;
            defpackage.ask askVar = gjaVarA.e;
            if (z2) {
                bveVarC.v(-1361587600);
                defpackage.afar afarVar = defpackage.ktz.a;
                ktzVarG = defpackage.jxh.g(0L, 0L, 0L, 0L, bveVarC, 32767);
                ((defpackage.bwc) bveVarC).Y(false);
            } else {
                bveVarC.v(-1361520454);
                defpackage.ktz ktzVarL = defpackage.kfn.l(z, bveVarC, 0);
                ((defpackage.bwc) bveVarC).Y(false);
                ktzVarG = ktzVarL;
            }
            defpackage.kry kryVar = defpackage.kry.a;
            defpackage.ksw kswVar = defpackage.ksx.a;
            int i4 = i2;
            defpackage.ktz ktzVar = new defpackage.ktz(ktzVarG.d, ktzVarG.e, ktzVarG.f, ktzVarG.g, ktzVarG.h, ktzVarG.i, ktzVarG.j, ktzVarG.k, defpackage.ksx.b(defpackage.kfp.i(bveVarC), kryVar), defpackage.ksx.b(defpackage.kfp.i(bveVarC), defpackage.kry.b), ktzVarG.n, ktzVarG.o, ktzVarG.p, ktzVarG.q, ktzVarG.r);
            defpackage.bwc bwcVar3 = (defpackage.bwc) bveVarC;
            java.lang.Object objS3 = bwcVar3.S();
            if (objS3 == defpackage.bvd.a) {
                objS3 = new defpackage.njy(1);
                bwcVar3.ad(objS3);
            }
            defpackage.jxs.d(cneVarH, zBooleanValue, (defpackage.affc) objS3, cgfVarA, ktfVar2, z3, null, ktzVar, null, askVar, bveVarC, ((i4 << 3) & 458752) | 392, 0, 1344);
            bveVarC = bveVarC;
            z5 = z4;
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ3 = bveVarC.J();
        if (bxlVarJ3 != null) {
            bxlVarJ3.c = new mvr(cgfVar, nkpVar2, z5, z2, z3, i, 3);
        }
    }

    public static boolean n(defpackage.qsh qshVar) {
        return ((java.lang.Boolean) defpackage.kgu.c(new defpackage.kjg(qshVar, 7), "GH.EtcStatusUtils", defpackage.zbe.ETC_STATUS, defpackage.zbd.ps, true, "Could not get toll card status", new java.lang.Object[0])).booleanValue();
    }

    public static boolean o() {
        defpackage.yqm yqmVar = defpackage.lfr.a;
        return !((defpackage.lfr) defpackage.mkp.a.i(defpackage.lfr.class)).g() || android.os.Build.DEVICE.equals("blueline") || android.os.Build.DEVICE.equals("crosshatch") || android.os.Build.DEVICE.equals("bonito") || android.os.Build.DEVICE.equals("sargo");
    }

    public static synchronized java.lang.String p(android.content.Context context) {
        defpackage.wfp.b();
        java.lang.String string = context.getSharedPreferences("DEVICE_ID_SHARED_PERF", 0).getString("DEVICE_ID", null);
        if (!android.text.TextUtils.isEmpty(string)) {
            return string;
        }
        java.lang.String string2 = java.util.UUID.randomUUID().toString();
        context.getSharedPreferences("DEVICE_ID_SHARED_PERF", 0).edit().putString("DEVICE_ID", string2).apply();
        return string2;
    }

    public static com.google.android.gms.carsetup.CarInfoInternal q(defpackage.xpc xpcVar, int i, int i2, java.lang.String str, long j, java.lang.String str2) {
        defpackage.xhs xhsVar;
        java.lang.String str3;
        if ((xpcVar.b & 16384) != 0) {
            xhsVar = xpcVar.q;
            if (xhsVar == null) {
                xhsVar = defpackage.xhs.a;
            }
        } else {
            defpackage.abor aborVarN = defpackage.xhs.a.n();
            java.lang.String str4 = xpcVar.i;
            aborVarN.t();
            defpackage.xhs xhsVar2 = (defpackage.xhs) aborVarN.b;
            str4.getClass();
            xhsVar2.b |= 16;
            xhsVar2.g = str4;
            java.lang.String str5 = xpcVar.j;
            aborVarN.t();
            defpackage.xhs xhsVar3 = (defpackage.xhs) aborVarN.b;
            str5.getClass();
            xhsVar3.b |= 32;
            xhsVar3.h = str5;
            java.lang.String str6 = xpcVar.k;
            aborVarN.t();
            defpackage.xhs xhsVar4 = (defpackage.xhs) aborVarN.b;
            str6.getClass();
            xhsVar4.b |= 64;
            xhsVar4.i = str6;
            java.lang.String str7 = xpcVar.l;
            aborVarN.t();
            defpackage.xhs xhsVar5 = (defpackage.xhs) aborVarN.b;
            str7.getClass();
            xhsVar5.b |= 128;
            xhsVar5.j = str7;
            java.lang.String str8 = xpcVar.g;
            aborVarN.t();
            defpackage.xhs xhsVar6 = (defpackage.xhs) aborVarN.b;
            str8.getClass();
            xhsVar6.b |= 8;
            xhsVar6.f = str8;
            java.lang.String str9 = xpcVar.f;
            aborVarN.t();
            defpackage.xhs xhsVar7 = (defpackage.xhs) aborVarN.b;
            str9.getClass();
            xhsVar7.b |= 4;
            xhsVar7.e = str9;
            java.lang.String str10 = xpcVar.d;
            aborVarN.t();
            defpackage.xhs xhsVar8 = (defpackage.xhs) aborVarN.b;
            str10.getClass();
            xhsVar8.b |= 1;
            xhsVar8.c = str10;
            java.lang.String str11 = xpcVar.e;
            aborVarN.t();
            defpackage.xhs xhsVar9 = (defpackage.xhs) aborVarN.b;
            str11.getClass();
            xhsVar9.b |= 2;
            xhsVar9.d = str11;
            int i3 = true != xpcVar.e.toLowerCase(java.util.Locale.ENGLISH).endsWith("truck") ? 1 : 2;
            aborVarN.t();
            defpackage.xhs xhsVar10 = (defpackage.xhs) aborVarN.b;
            xhsVar10.b |= 256;
            xhsVar10.k = i3;
            xhsVar = (defpackage.xhs) aborVarN.q();
        }
        java.util.Iterator<E> it = xpcVar.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            defpackage.xpa xpaVar = (defpackage.xpa) it.next();
            if ((xpaVar.b & 32) != 0) {
                defpackage.xiu xiuVar = xpaVar.h;
                if (xiuVar == null) {
                    xiuVar = defpackage.xiu.b;
                }
                str3 = xiuVar.c;
                break;
            }
        }
        java.lang.String str12 = str3;
        java.lang.String str13 = xpcVar.o;
        if (android.text.TextUtils.isEmpty(str13)) {
            str13 = xhsVar.c;
        }
        java.lang.String str14 = str13;
        int i4 = xpcVar.n;
        java.lang.String str15 = xhsVar.c;
        java.lang.String str16 = xhsVar.d;
        java.lang.String str17 = xhsVar.e;
        int i5 = i4 & 1;
        defpackage.xkf xkfVarB = defpackage.xkf.b(xpcVar.h);
        if (xkfVarB == null) {
            xkfVarB = defpackage.xkf.DRIVER_POSITION_LEFT;
        }
        com.google.android.gms.car.CarInfo carInfo = new com.google.android.gms.car.CarInfo(str15, str16, str17, null, i, i2, 1 == i5, xkfVarB.e, xhsVar.g, xhsVar.h, xhsVar.i, xhsVar.j, (i4 & 8) == 8, (i4 & 2) == 2, (i4 & 4) == 4, null, str14, xhsVar.k);
        if (xpcVar.m) {
            carInfo.m = true;
        }
        return new com.google.android.gms.carsetup.CarInfoInternal(carInfo, null, false, 0L, 0L, str12, null, null, null, -1, str, -1, -1, -1, false, false, j, false, "", -1, s(xhsVar.f, str2, str));
    }

    public static void r(defpackage.rqt rqtVar, defpackage.zbd zbdVar) {
        defpackage.abor aborVarN = defpackage.yyg.a.n();
        aborVarN.getClass();
        defpackage.abor aborVarN2 = defpackage.yzc.a.n();
        aborVarN2.getClass();
        aborVarN2.t();
        defpackage.yzc yzcVar = (defpackage.yzc) aborVarN2.b;
        yzcVar.b |= 1;
        yzcVar.c = 4;
        defpackage.abox aboxVarQ = aborVarN2.q();
        aboxVarQ.getClass();
        aborVarN.t();
        defpackage.yyg yygVar = (defpackage.yyg) aborVarN.b;
        yygVar.O = (defpackage.yzc) aboxVarQ;
        yygVar.c |= 32768;
        defpackage.abor aborVarN3 = defpackage.zbg.a.n();
        aborVarN3.getClass();
        aborVarN3.t();
        defpackage.zbg zbgVar = (defpackage.zbg) aborVarN3.b;
        zbgVar.b |= 1;
        zbgVar.d = 8300;
        int iA = zbdVar.a();
        aborVarN3.t();
        defpackage.zbg zbgVar2 = (defpackage.zbg) aborVarN3.b;
        zbgVar2.b |= 2;
        zbgVar2.e = iA;
        defpackage.abox aboxVarQ2 = aborVarN3.q();
        aboxVarQ2.getClass();
        aborVarN.t();
        defpackage.yyg yygVar2 = (defpackage.yyg) aborVarN.b;
        yygVar2.o = (defpackage.zbg) aboxVarQ2;
        yygVar2.b |= 4096;
        defpackage.abox aboxVarQ3 = aborVarN.q();
        aboxVarQ3.getClass();
        rqtVar.d(defpackage.yyh.UI, (defpackage.yyg) aboxVarQ3);
    }

    private static java.lang.String s(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        try {
            return defpackage.yuv.d.i(java.security.MessageDigest.getInstance("SHA-256").digest((str + str2 + str3).getBytes(java.nio.charset.StandardCharsets.UTF_8)));
        } catch (java.security.NoSuchAlgorithmException e) {
            return (java.lang.String) defpackage.rox.p("GH.CarInfoUtil", e, "Couldn't find hash algorithm implementation!", new java.lang.Object[0]);
        }
    }
}
