package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class aef {
    private static final defpackage.aga b = new defpackage.aga(1.0f, 1500.0f, null);
    private static final defpackage.aga c = new defpackage.aga(1.0f, 1500.0f, new defpackage.dlr(0.4f));
    public static final defpackage.aga a = new defpackage.aga(1.0f, 1500.0f, new defpackage.dlw(4294967297L));

    public static final defpackage.bys a(float f, defpackage.aej aejVar, java.lang.String str, defpackage.affc affcVar, defpackage.bve bveVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            aejVar = c;
        }
        defpackage.aej aejVar2 = aejVar;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        java.lang.String str2 = str;
        if ((i2 & 8) != 0) {
            affcVar = null;
        }
        int i3 = i << 6;
        return c(new defpackage.dlr(f), defpackage.agt.c, aejVar2, null, str2, affcVar, bveVar, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (458752 & i3), 8);
    }

    public static final defpackage.bys b(float f, defpackage.aej aejVar, java.lang.String str, defpackage.affc affcVar, defpackage.bve bveVar, int i, int i2) {
        defpackage.aej aejVar2 = (i2 & 2) != 0 ? b : aejVar;
        float f2 = (i2 & 4) != 0 ? 0.01f : 0.0f;
        java.lang.String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        defpackage.affc affcVar2 = (i2 & 16) != 0 ? null : affcVar;
        if (aejVar2 != b || f2 == 0.01f) {
            bveVar.v(1144320933);
            bveVar.o();
        } else {
            bveVar.v(1144211007);
            boolean z = true;
            if ((((i & 896) ^ 384) <= 256 || !bveVar.z(f2)) && (i & 384) != 256) {
                z = false;
            }
            java.lang.Object objG = bveVar.g();
            if (z || objG == defpackage.bvd.a) {
                defpackage.aga agaVar = new defpackage.aga(1.0f, 1500.0f, java.lang.Float.valueOf(f2));
                bveVar.x(agaVar);
                objG = agaVar;
            }
            aejVar2 = (defpackage.aga) objG;
            bveVar.o();
        }
        float f3 = f2;
        return c(java.lang.Float.valueOf(f), defpackage.agt.a, aejVar2, f2 != 0.01f ? java.lang.Float.valueOf(f3) : null, str2, affcVar2, bveVar, (i & 14) | ((i << 3) & 57344), 0);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009a  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e3 A[PHI: r9
  0x00e3: PHI (r9v20 java.lang.String) = (r9v17 java.lang.String), (r9v21 java.lang.String) binds: [B:63:0x00e1, B:59:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ff A[PHI: r10
  0x00ff: PHI (r10v13 affc) = (r10v10 affc), (r10v14 affc) binds: [B:73:0x00fd, B:69:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:77:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x010a  */
    public static final defpackage.bys c(final java.lang.Object obj, final defpackage.bil bilVar, defpackage.aej aejVar, java.lang.Object obj2, java.lang.String str, defpackage.affc affcVar, defpackage.bve bveVar, int i, int i2) {
        defpackage.aej aejVar2;
        boolean z;
        boolean z2;
        java.lang.String str2;
        boolean z3;
        defpackage.affc affcVar2;
        boolean z4;
        java.lang.Object objG;
        if ((i2 & 4) != 0) {
            java.lang.Object objG2 = bveVar.g();
            if (objG2 == defpackage.bvd.a) {
                objG2 = new defpackage.aga(1.0f, 1500.0f, null);
                bveVar.x(objG2);
            }
            aejVar2 = (defpackage.aga) objG2;
        } else {
            aejVar2 = aejVar;
        }
        java.lang.Object obj3 = (i2 & 8) != 0 ? null : obj2;
        java.lang.Object objG3 = bveVar.g();
        java.lang.Object obj4 = defpackage.bvd.a;
        if (objG3 == obj4) {
            defpackage.bxz bxzVar = new defpackage.bxz(bveVar.h(), defpackage.afdp.a);
            bveVar.x(bxzVar);
            objG3 = bxzVar;
        }
        aiuw aiuwVar = (aiuw) objG3;
        java.lang.Object objG4 = bveVar.g();
        if (objG4 == obj4) {
            defpackage.aed aedVar = new defpackage.aed(obj, bilVar, aejVar2, obj3, str, affcVar, aiuwVar);
            bveVar.x(aedVar);
            objG4 = aedVar;
            z = false;
        } else {
            z = true;
        }
        final defpackage.aed aedVar2 = (defpackage.aed) objG4;
        if (!z) {
            bveVar.v(-2111593986);
            bveVar.o();
            return aedVar2;
        }
        bveVar.v(-2111846729);
        boolean z5 = (((i & 14) ^ 6) > 4 && bveVar.E(obj)) || (i & 6) == 4;
        if (((i & 112) ^ 48) > 32 && bveVar.E(bilVar)) {
            z2 = true;
        } else if ((i & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z5 | z2 | ((((i & 896) ^ 384) > 256 && bveVar.E(aejVar2)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && bveVar.E(obj3)) || (i & 3072) == 2048);
        if (((57344 & i) ^ 24576) > 16384) {
            str2 = str;
            if (bveVar.C(str2)) {
                z3 = true;
            }
            boolean z7 = z6 | z3;
            if (((458752 & i) ^ 196608) > 131072) {
                affcVar2 = affcVar;
                if (!bveVar.C(affcVar2)) {
                }
                z4 = z7 | z;
                objG = bveVar.g();
                if (z4 || objG == obj4) {
                    final defpackage.affc affcVar3 = affcVar2;
                    final java.lang.String str3 = str2;
                    final java.lang.Object obj5 = obj3;
                    final defpackage.aej aejVar3 = aejVar2;
                    defpackage.afer aferVar = new defpackage.afer() { // from class: aee
                        @Override // defpackage.afer
                        public final java.lang.Object invoke() {
                            boolean z8;
                            defpackage.aga agaVar = defpackage.aef.a;
                            defpackage.aed aedVar3 = aedVar2;
                            defpackage.aeb aebVar = aedVar3.c;
                            defpackage.bil bilVar2 = aebVar.g;
                            defpackage.bil bilVar3 = bilVar;
                            java.lang.Object obj6 = obj5;
                            java.lang.String str4 = str3;
                            if (bilVar2 == bilVar3 && defpackage.afga.f(aebVar.a, str4)) {
                                z8 = false;
                            } else {
                                aedVar3.c = new defpackage.aeb(aedVar3.c.d(), bilVar3, obj6, str4);
                                z8 = true;
                            }
                            defpackage.affc affcVar4 = affcVar3;
                            defpackage.aej aejVar4 = aejVar3;
                            java.lang.Object obj7 = obj;
                            boolean z9 = !defpackage.afga.f(obj7, aedVar3.c.c());
                            aedVar3.d = defpackage.aed.b(aejVar4, obj6);
                            aedVar3.a = affcVar4;
                            if (z8 | z9) {
                                defpackage.aej aejVar5 = aedVar3.d;
                                aiwg aiwgVar = aedVar3.e;
                                if (aiwgVar != null) {
                                    aiwgVar.s((java.util.concurrent.CancellationException) null);
                                }
                                if (!defpackage.afga.f(aedVar3.c.c(), obj7)) {
                                    aedVar3.e = ahoc.d(aedVar3.b, (defpackage.afdo) null, 4, new defpackage.ait(aedVar3, obj7, aejVar5, (defpackage.afdk) null, 1), 1);
                                }
                            }
                            return defpackage.afbk.a;
                        }
                    };
                    bveVar.x(aferVar);
                    objG = aferVar;
                }
                bveVar.r((defpackage.afer) objG);
                bveVar.o();
                return aedVar2;
            }
            affcVar2 = affcVar;
            boolean z8 = (i & 196608) == 131072;
            z4 = z7 | z8;
            objG = bveVar.g();
            if (z4) {
                final defpackage.affc affcVar4 = affcVar2;
                final java.lang.String str4 = str2;
                final java.lang.Object obj6 = obj3;
                final defpackage.aej aejVar4 = aejVar2;
                defpackage.afer aferVar2 = new defpackage.afer() { // from class: aee
                    @Override // defpackage.afer
                    public final java.lang.Object invoke() {
                        boolean z9;
                        defpackage.aga agaVar = defpackage.aef.a;
                        defpackage.aed aedVar3 = aedVar2;
                        defpackage.aeb aebVar = aedVar3.c;
                        defpackage.bil bilVar2 = aebVar.g;
                        defpackage.bil bilVar3 = bilVar;
                        java.lang.Object obj7 = obj6;
                        java.lang.String str5 = str4;
                        if (bilVar2 == bilVar3 && defpackage.afga.f(aebVar.a, str5)) {
                            z9 = false;
                        } else {
                            aedVar3.c = new defpackage.aeb(aedVar3.c.d(), bilVar3, obj7, str5);
                            z9 = true;
                        }
                        defpackage.affc affcVar5 = affcVar4;
                        defpackage.aej aejVar5 = aejVar4;
                        java.lang.Object obj8 = obj;
                        boolean z10 = !defpackage.afga.f(obj8, aedVar3.c.c());
                        aedVar3.d = defpackage.aed.b(aejVar5, obj7);
                        aedVar3.a = affcVar5;
                        if (z9 | z10) {
                            defpackage.aej aejVar6 = aedVar3.d;
                            aiwg aiwgVar = aedVar3.e;
                            if (aiwgVar != null) {
                                aiwgVar.s((java.util.concurrent.CancellationException) null);
                            }
                            if (!defpackage.afga.f(aedVar3.c.c(), obj8)) {
                                aedVar3.e = ahoc.d(aedVar3.b, (defpackage.afdo) null, 4, new defpackage.ait(aedVar3, obj8, aejVar6, (defpackage.afdk) null, 1), 1);
                            }
                        }
                        return defpackage.afbk.a;
                    }
                };
                bveVar.x(aferVar2);
                objG = aferVar2;
            } else {
                final defpackage.affc affcVar5 = affcVar2;
                final java.lang.String str5 = str2;
                final java.lang.Object obj7 = obj3;
                final defpackage.aej aejVar5 = aejVar2;
                defpackage.afer aferVar3 = new defpackage.afer() { // from class: aee
                    @Override // defpackage.afer
                    public final java.lang.Object invoke() {
                        boolean z9;
                        defpackage.aga agaVar = defpackage.aef.a;
                        defpackage.aed aedVar3 = aedVar2;
                        defpackage.aeb aebVar = aedVar3.c;
                        defpackage.bil bilVar2 = aebVar.g;
                        defpackage.bil bilVar3 = bilVar;
                        java.lang.Object obj8 = obj7;
                        java.lang.String str6 = str5;
                        if (bilVar2 == bilVar3 && defpackage.afga.f(aebVar.a, str6)) {
                            z9 = false;
                        } else {
                            aedVar3.c = new defpackage.aeb(aedVar3.c.d(), bilVar3, obj8, str6);
                            z9 = true;
                        }
                        defpackage.affc affcVar6 = affcVar5;
                        defpackage.aej aejVar6 = aejVar5;
                        java.lang.Object obj9 = obj;
                        boolean z10 = !defpackage.afga.f(obj9, aedVar3.c.c());
                        aedVar3.d = defpackage.aed.b(aejVar6, obj8);
                        aedVar3.a = affcVar6;
                        if (z9 | z10) {
                            defpackage.aej aejVar7 = aedVar3.d;
                            aiwg aiwgVar = aedVar3.e;
                            if (aiwgVar != null) {
                                aiwgVar.s((java.util.concurrent.CancellationException) null);
                            }
                            if (!defpackage.afga.f(aedVar3.c.c(), obj9)) {
                                aedVar3.e = ahoc.d(aedVar3.b, (defpackage.afdo) null, 4, new defpackage.ait(aedVar3, obj9, aejVar7, (defpackage.afdk) null, 1), 1);
                            }
                        }
                        return defpackage.afbk.a;
                    }
                };
                bveVar.x(aferVar3);
                objG = aferVar3;
            }
            bveVar.r((defpackage.afer) objG);
            bveVar.o();
            return aedVar2;
        }
        str2 = str;
        if ((i & 24576) == 16384) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z9 = z6 | z3;
        if (((458752 & i) ^ 196608) > 131072) {
            affcVar2 = affcVar;
            if (!bveVar.C(affcVar2)) {
            }
            z4 = z9 | z8;
            objG = bveVar.g();
            if (z4) {
                final defpackage.affc affcVar6 = affcVar2;
                final java.lang.String str6 = str2;
                final java.lang.Object obj8 = obj3;
                final defpackage.aej aejVar6 = aejVar2;
                defpackage.afer aferVar4 = new defpackage.afer() { // from class: aee
                    @Override // defpackage.afer
                    public final java.lang.Object invoke() {
                        boolean z10;
                        defpackage.aga agaVar = defpackage.aef.a;
                        defpackage.aed aedVar3 = aedVar2;
                        defpackage.aeb aebVar = aedVar3.c;
                        defpackage.bil bilVar2 = aebVar.g;
                        defpackage.bil bilVar3 = bilVar;
                        java.lang.Object obj9 = obj8;
                        java.lang.String str7 = str6;
                        if (bilVar2 == bilVar3 && defpackage.afga.f(aebVar.a, str7)) {
                            z10 = false;
                        } else {
                            aedVar3.c = new defpackage.aeb(aedVar3.c.d(), bilVar3, obj9, str7);
                            z10 = true;
                        }
                        defpackage.affc affcVar7 = affcVar6;
                        defpackage.aej aejVar7 = aejVar6;
                        java.lang.Object obj10 = obj;
                        boolean z11 = !defpackage.afga.f(obj10, aedVar3.c.c());
                        aedVar3.d = defpackage.aed.b(aejVar7, obj9);
                        aedVar3.a = affcVar7;
                        if (z10 | z11) {
                            defpackage.aej aejVar8 = aedVar3.d;
                            aiwg aiwgVar = aedVar3.e;
                            if (aiwgVar != null) {
                                aiwgVar.s((java.util.concurrent.CancellationException) null);
                            }
                            if (!defpackage.afga.f(aedVar3.c.c(), obj10)) {
                                aedVar3.e = ahoc.d(aedVar3.b, (defpackage.afdo) null, 4, new defpackage.ait(aedVar3, obj10, aejVar8, (defpackage.afdk) null, 1), 1);
                            }
                        }
                        return defpackage.afbk.a;
                    }
                };
                bveVar.x(aferVar4);
                objG = aferVar4;
            } else {
                final defpackage.affc affcVar7 = affcVar2;
                final java.lang.String str7 = str2;
                final java.lang.Object obj9 = obj3;
                final defpackage.aej aejVar7 = aejVar2;
                defpackage.afer aferVar5 = new defpackage.afer() { // from class: aee
                    @Override // defpackage.afer
                    public final java.lang.Object invoke() {
                        boolean z10;
                        defpackage.aga agaVar = defpackage.aef.a;
                        defpackage.aed aedVar3 = aedVar2;
                        defpackage.aeb aebVar = aedVar3.c;
                        defpackage.bil bilVar2 = aebVar.g;
                        defpackage.bil bilVar3 = bilVar;
                        java.lang.Object obj10 = obj9;
                        java.lang.String str8 = str7;
                        if (bilVar2 == bilVar3 && defpackage.afga.f(aebVar.a, str8)) {
                            z10 = false;
                        } else {
                            aedVar3.c = new defpackage.aeb(aedVar3.c.d(), bilVar3, obj10, str8);
                            z10 = true;
                        }
                        defpackage.affc affcVar8 = affcVar7;
                        defpackage.aej aejVar8 = aejVar7;
                        java.lang.Object obj11 = obj;
                        boolean z11 = !defpackage.afga.f(obj11, aedVar3.c.c());
                        aedVar3.d = defpackage.aed.b(aejVar8, obj10);
                        aedVar3.a = affcVar8;
                        if (z10 | z11) {
                            defpackage.aej aejVar9 = aedVar3.d;
                            aiwg aiwgVar = aedVar3.e;
                            if (aiwgVar != null) {
                                aiwgVar.s((java.util.concurrent.CancellationException) null);
                            }
                            if (!defpackage.afga.f(aedVar3.c.c(), obj11)) {
                                aedVar3.e = ahoc.d(aedVar3.b, (defpackage.afdo) null, 4, new defpackage.ait(aedVar3, obj11, aejVar9, (defpackage.afdk) null, 1), 1);
                            }
                        }
                        return defpackage.afbk.a;
                    }
                };
                bveVar.x(aferVar5);
                objG = aferVar5;
            }
            bveVar.r((defpackage.afer) objG);
            bveVar.o();
            return aedVar2;
        }
        affcVar2 = affcVar;
        if ((i & 196608) == 131072) {
        }
        z4 = z9 | z8;
        objG = bveVar.g();
        if (z4) {
            final defpackage.affc affcVar8 = affcVar2;
            final java.lang.String str8 = str2;
            final java.lang.Object obj10 = obj3;
            final defpackage.aej aejVar8 = aejVar2;
            defpackage.afer aferVar6 = new defpackage.afer() { // from class: aee
                @Override // defpackage.afer
                public final java.lang.Object invoke() {
                    boolean z10;
                    defpackage.aga agaVar = defpackage.aef.a;
                    defpackage.aed aedVar3 = aedVar2;
                    defpackage.aeb aebVar = aedVar3.c;
                    defpackage.bil bilVar2 = aebVar.g;
                    defpackage.bil bilVar3 = bilVar;
                    java.lang.Object obj11 = obj10;
                    java.lang.String str9 = str8;
                    if (bilVar2 == bilVar3 && defpackage.afga.f(aebVar.a, str9)) {
                        z10 = false;
                    } else {
                        aedVar3.c = new defpackage.aeb(aedVar3.c.d(), bilVar3, obj11, str9);
                        z10 = true;
                    }
                    defpackage.affc affcVar9 = affcVar8;
                    defpackage.aej aejVar9 = aejVar8;
                    java.lang.Object obj12 = obj;
                    boolean z11 = !defpackage.afga.f(obj12, aedVar3.c.c());
                    aedVar3.d = defpackage.aed.b(aejVar9, obj11);
                    aedVar3.a = affcVar9;
                    if (z10 | z11) {
                        defpackage.aej aejVar10 = aedVar3.d;
                        aiwg aiwgVar = aedVar3.e;
                        if (aiwgVar != null) {
                            aiwgVar.s((java.util.concurrent.CancellationException) null);
                        }
                        if (!defpackage.afga.f(aedVar3.c.c(), obj12)) {
                            aedVar3.e = ahoc.d(aedVar3.b, (defpackage.afdo) null, 4, new defpackage.ait(aedVar3, obj12, aejVar10, (defpackage.afdk) null, 1), 1);
                        }
                    }
                    return defpackage.afbk.a;
                }
            };
            bveVar.x(aferVar6);
            objG = aferVar6;
        } else {
            final defpackage.affc affcVar9 = affcVar2;
            final java.lang.String str9 = str2;
            final java.lang.Object obj11 = obj3;
            final defpackage.aej aejVar9 = aejVar2;
            defpackage.afer aferVar7 = new defpackage.afer() { // from class: aee
                @Override // defpackage.afer
                public final java.lang.Object invoke() {
                    boolean z10;
                    defpackage.aga agaVar = defpackage.aef.a;
                    defpackage.aed aedVar3 = aedVar2;
                    defpackage.aeb aebVar = aedVar3.c;
                    defpackage.bil bilVar2 = aebVar.g;
                    defpackage.bil bilVar3 = bilVar;
                    java.lang.Object obj12 = obj11;
                    java.lang.String str10 = str9;
                    if (bilVar2 == bilVar3 && defpackage.afga.f(aebVar.a, str10)) {
                        z10 = false;
                    } else {
                        aedVar3.c = new defpackage.aeb(aedVar3.c.d(), bilVar3, obj12, str10);
                        z10 = true;
                    }
                    defpackage.affc affcVar10 = affcVar9;
                    defpackage.aej aejVar10 = aejVar9;
                    java.lang.Object obj13 = obj;
                    boolean z11 = !defpackage.afga.f(obj13, aedVar3.c.c());
                    aedVar3.d = defpackage.aed.b(aejVar10, obj12);
                    aedVar3.a = affcVar10;
                    if (z10 | z11) {
                        defpackage.aej aejVar11 = aedVar3.d;
                        aiwg aiwgVar = aedVar3.e;
                        if (aiwgVar != null) {
                            aiwgVar.s((java.util.concurrent.CancellationException) null);
                        }
                        if (!defpackage.afga.f(aedVar3.c.c(), obj13)) {
                            aedVar3.e = ahoc.d(aedVar3.b, (defpackage.afdo) null, 4, new defpackage.ait(aedVar3, obj13, aejVar11, (defpackage.afdk) null, 1), 1);
                        }
                    }
                    return defpackage.afbk.a;
                }
            };
            bveVar.x(aferVar7);
            objG = aferVar7;
        }
        bveVar.r((defpackage.afer) objG);
        bveVar.o();
        return aedVar2;
    }
}
