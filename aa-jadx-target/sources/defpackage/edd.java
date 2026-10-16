package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class edd {
    protected /* synthetic */ edd() {
    }

    public static defpackage.ntj A() {
        return (defpackage.ntj) defpackage.mkp.a.i(defpackage.ntj.class);
    }

    public static android.view.ViewParent b(android.view.View view) {
        view.getClass();
        android.view.ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        java.lang.Object tag = view.getTag(2131429868);
        if (tag instanceof android.view.ViewParent) {
            return (android.view.ViewParent) tag;
        }
        return null;
    }

    public static defpackage.eqg c(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(2131429869);
            defpackage.eqg eqgVar = tag instanceof defpackage.eqg ? (defpackage.eqg) tag : null;
            if (eqgVar != null) {
                return eqgVar;
            }
            java.lang.Object objB = b(view);
            view = objB instanceof android.view.View ? (android.view.View) objB : null;
        }
        return null;
    }

    public static void d(android.view.View view, defpackage.eqg eqgVar) {
        view.getClass();
        view.setTag(2131429869, eqgVar);
    }

    public static defpackage.erw e(defpackage.esa esaVar) {
        return esaVar instanceof defpackage.epu ? ((defpackage.epu) esaVar).getDefaultViewModelProviderFactory() : esp.a;
    }

    static int eR(int i) {
        int iM$2;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 += i3) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    iM$2 = bgp$.ExternalSyntheticApiModelOutline0.m$2();
                } else if (i3 == 2) {
                    iM$2 = bgp$.ExternalSyntheticApiModelOutline0.m$8();
                } else if (i3 == 4) {
                    iM$2 = bgp$.ExternalSyntheticApiModelOutline0.m$7();
                } else if (i3 == 8) {
                    iM$2 = bgp$.ExternalSyntheticApiModelOutline0.m$1();
                } else if (i3 == 16) {
                    iM$2 = bgp$.ExternalSyntheticApiModelOutline0.m$6();
                } else if (i3 == 32) {
                    iM$2 = bgp$.ExternalSyntheticApiModelOutline0.m$5();
                } else if (i3 == 64) {
                    iM$2 = bgp$.ExternalSyntheticApiModelOutline0.m$4();
                } else if (i3 == 128) {
                    iM$2 = bgp$.ExternalSyntheticApiModelOutline0.m$3();
                }
                i2 |= iM$2;
            }
        }
        return i2;
    }

    public static defpackage.esi f(defpackage.esa esaVar) {
        return esaVar instanceof defpackage.epu ? ((defpackage.epu) esaVar).getDefaultViewModelCreationExtras() : defpackage.esg.a;
    }

    public static boolean g() {
        return defpackage.acqe.a.fF().z() || defpackage.iml.a.a;
    }

    public static defpackage.cgf h(defpackage.cgf cgfVar, defpackage.ask askVar, float f, defpackage.afer aferVar) {
        cgfVar.getClass();
        askVar.getClass();
        aferVar.getClass();
        return defpackage.asq.J(defpackage.crq.a(l(cgfVar, f, f, f, f), defpackage.afbk.a, new gje(askVar, aferVar, 0)), f, f, f, f);
    }

    public static defpackage.cgf i(defpackage.cgf cgfVar, defpackage.afer aferVar) {
        cgfVar.getClass();
        aferVar.getClass();
        return cgfVar.a(new defpackage.cgb(new defpackage.boq(aferVar, 7)));
    }

    public static defpackage.cgf j(defpackage.cgf cgfVar, defpackage.avv avvVar) {
        cgfVar.getClass();
        return cgfVar.a(new defpackage.ctd(new defpackage.akm(avvVar, 6)));
    }

    public static defpackage.cgf k(defpackage.cgf cgfVar, float f) {
        cgfVar.getClass();
        return cgfVar.a(new defpackage.ctd(new defpackage.akm(new defpackage.avx(f, f, f, f), 6)));
    }

    public static defpackage.cgf l(defpackage.cgf cgfVar, float f, float f2, float f3, float f4) {
        cgfVar.getClass();
        return cgfVar.a(new defpackage.ctd(new defpackage.akm(new defpackage.avx(f, f2, f3, f4), 6)));
    }

    public static defpackage.cgf m(defpackage.cgf cgfVar, float f) {
        cgfVar.getClass();
        return l(cgfVar, f, 0.0f, f, 0.0f);
    }

    public static void n(defpackage.fdr fdrVar, java.lang.Throwable th) throws java.lang.Throwable {
        defpackage.fdl fdlVar = fdrVar.d;
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        long id = threadCurrentThread.getId();
        defpackage.fdo fdoVarA = fdlVar.a;
        defpackage.fdo fdoVar = fdlVar.b;
        if (fdoVarA == null || fdoVarA.a != id) {
            if (fdoVar == null || fdoVar.a != id) {
                android.system.Os.gettid();
                threadCurrentThread.getName();
                fdoVarA = fdlVar.a(id);
                fdlVar.b = fdlVar.a;
                fdlVar.a = fdoVarA;
            } else {
                fdoVarA = fdoVar;
            }
        }
        boolean z = fdoVarA.c.e;
        for (java.lang.StackTraceElement stackTraceElement : th.getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
            stackTraceElement.getFileName();
            stackTraceElement.getLineNumber();
        }
        throw th;
    }

    public static long o(boolean z, boolean z2, defpackage.obs obsVar) {
        if (z) {
            return obsVar.a();
        }
        return z2 ? obsVar.d() : obsVar.c();
    }

    public static void p(defpackage.obw obwVar, defpackage.afer aferVar, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-2105880744);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(obwVar) : bveVarC.E(obwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && bveVarC.E(obwVar));
            boolean z2 = (i2 & 112) == 32;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if ((z | z2) || objS == defpackage.bvd.a) {
                objS = new defpackage.err(obwVar, aferVar, 13, (byte[]) null);
                bwcVar.ad(objS);
            }
            defpackage.afw.z(cgfVar, (defpackage.affc) objS, bveVarC, (i2 >> 6) & 14);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new kld(obwVar, aferVar, cgfVar, i, 17);
        }
    }

    public static void q(defpackage.afer aferVar, defpackage.afer aferVar2, boolean z, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        defpackage.afer aferVar3;
        int i2;
        boolean z2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(880933296);
        if (i3 == 0) {
            aferVar3 = aferVar;
            i2 = (true != bveVarC.E(aferVar3) ? 2 : 4) | i;
        } else {
            aferVar3 = aferVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(aferVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= true != bveVarC.D(z2) ? 128 : 256;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 1024 : 2048;
        }
        if (bveVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            defpackage.ocd ocdVar = defpackage.obt.a;
            defpackage.ocd ocdVar2 = defpackage.obt.b;
            defpackage.cgf cgfVarH = defpackage.cjv.h(cgfVar, bveVarC.f(defpackage.dbl.i) == defpackage.dlz.b ? -1.0f : 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 0, 1048574);
            boolean z3 = (i2 & 14) == 4;
            boolean zE = ((i2 & 896) == 256) | ((i2 & 112) == 32) | z3 | bveVarC.E(ocdVar2);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new hgn(aferVar3, aferVar2, z2, ocdVar2, 5);
                bwcVar.ad(objS);
            }
            defpackage.afw.z(cgfVarH, (defpackage.affc) objS, bveVarC, 0);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new hdd(aferVar, aferVar2, z, cgfVar, i, 10);
        }
    }

    public static void r(final defpackage.ocd ocdVar, defpackage.afer aferVar, final boolean z, defpackage.afer aferVar2, defpackage.afer aferVar3, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.bve bveVar2;
        final defpackage.obs obsVar;
        int i3;
        defpackage.bwc bwcVar;
        boolean z2;
        ocdVar.getClass();
        int i4 = i & 6;
        defpackage.bve bveVarC = bveVar.c(1462487175);
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(ocdVar) : bveVarC.E(ocdVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != bveVarC.E(aferVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.E(aferVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.C("") ? 524288 : 1048576;
        }
        if (bveVarC.I((599187 & i2) != 599186, i2 & 1)) {
            boolean z3 = bveVarC.f(defpackage.dbl.i) == defpackage.dlz.b;
            final java.lang.Integer num = (java.lang.Integer) aferVar.invoke();
            defpackage.obs obsVar2 = (defpackage.obs) aferVar3.invoke();
            final boolean zBooleanValue = ((java.lang.Boolean) aferVar2.invoke()).booleanValue();
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            long j = bwcVar2.u;
            long j2 = j ^ (j >>> 32);
            defpackage.cdd cddVarAh = bwcVar2.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar4 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar2.t) {
                bveVarC.j(aferVar4);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.ats atsVar = defpackage.ats.a;
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarC = defpackage.awj.c(cgcVar, 1.0f);
            boolean zD = bveVarC.D(zBooleanValue) | ((i2 & 896) == 256) | bveVarC.E(obsVar2) | ((i2 & 14) == 4 || ((i2 & 8) != 0 && bveVarC.E(ocdVar))) | bveVarC.C(num) | bveVarC.D(z3);
            java.lang.Object objS = bwcVar2.S();
            if (zD || objS == defpackage.bvd.a) {
                final boolean z4 = z3;
                obsVar = obsVar2;
                i3 = i2;
                defpackage.affc affcVar = new defpackage.affc() { // from class: och
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r14v2, types: [izq] */
                    /* JADX WARN: Type inference failed for: r15v0 */
                    /* JADX WARN: Type inference failed for: r15v1 */
                    /* JADX WARN: Type inference failed for: r15v2, types: [float] */
                    /* JADX WARN: Type inference failed for: r1v2 */
                    /* JADX WARN: Type inference failed for: r1v3, types: [cmi] */
                    /* JADX WARN: Type inference failed for: r1v7 */
                    /* JADX WARN: Type inference failed for: r2v1 */
                    /* JADX WARN: Type inference failed for: r2v2, types: [long] */
                    /* JADX WARN: Type inference failed for: r2v5 */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.affc
                    public final java.lang.Object invoke(java.lang.Object obj) throws java.lang.Throwable {
                        ?? r1;
                        ?? r2;
                        ?? r15;
                        defpackage.cmi cmiVar;
                        long j3;
                        defpackage.cml cmlVar = (defpackage.cml) obj;
                        cmlVar.getClass();
                        boolean z5 = zBooleanValue;
                        boolean z6 = z;
                        defpackage.obs obsVar3 = obsVar;
                        long jO = defpackage.edd.o(z5, z6, obsVar3);
                        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (cmlVar.o() >> 32));
                        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (cmlVar.o() & 4294967295L));
                        defpackage.ocd ocdVar2 = ocdVar;
                        float fA = ocdVar2.a(fIntBitsToFloat, fIntBitsToFloat2);
                        defpackage.cmi cmiVarR = cmlVar.r();
                        long jA = cmiVarR.a();
                        cmiVarR.b().g();
                        try {
                            cmiVarR.c.k(fA, fA, 0L);
                            if (!z5) {
                                defpackage.dai.aH(cmlVar, ocdVar2.a, jO, null, 60);
                                java.lang.Integer num2 = num;
                                if (num2 != null) {
                                    try {
                                        if (num2.intValue() > 0) {
                                            double dCeil = java.lang.Math.ceil((num2.intValue() / 100.0f) * 24.0f);
                                            boolean z7 = z4;
                                            float f = (float) dCeil;
                                            r15 = !z7 ? 0.0f : 24.0f - f;
                                            float f2 = true != z7 ? f : 24.0f;
                                            try {
                                                defpackage.cmi cmiVarR2 = cmlVar.r();
                                                long jA2 = cmiVarR2.a();
                                                cmiVarR2.b().g();
                                                try {
                                                    cmiVarR2.c.h(r15, 0.0f, f2, 13.0f, 1);
                                                    cmiVar = cmiVarR2;
                                                    j3 = jA2;
                                                    try {
                                                        defpackage.dai.T(cmlVar, obsVar3.a(), 0L, 4737786809089523712L, 4647714816528482304L, 0.0f, 240);
                                                        cmiVar.b().e();
                                                        cmiVar.h(j3);
                                                    } catch (java.lang.Throwable th) {
                                                        th = th;
                                                        cmiVar.b().e();
                                                        cmiVar.h(j3);
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th2) {
                                                    th = th2;
                                                    cmiVar = cmiVarR2;
                                                    j3 = jA2;
                                                }
                                            } catch (java.lang.Throwable th3) {
                                                th = th3;
                                                r1 = obj;
                                                r2 = r15;
                                                r1.b().e();
                                                r1.h(r2);
                                                throw th;
                                            }
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        obj = cmiVarR;
                                        r15 = jA;
                                    }
                                }
                                cmiVarR.b().e();
                                cmiVarR.h(jA);
                                return defpackage.afbk.a;
                            }
                            defpackage.dai.aH(cmlVar, ocdVar2.a, jO, null, 60);
                            cmiVarR.b().e();
                            cmiVarR.h(jA);
                            return defpackage.afbk.a;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            r1 = cmiVarR;
                            r2 = jA;
                        }
                    }
                };
                bwcVar2.ad(affcVar);
                objS = affcVar;
            } else {
                obsVar = obsVar2;
                i3 = i2;
            }
            defpackage.afw.A(cgfVarC, (defpackage.affc) objS, bveVarC, ((i3 >> 15) & 112) | 6);
            if (!z || num == null) {
                bveVar2 = bveVarC;
                bwcVar = bwcVar2;
                z2 = true;
                bveVar2.v(-29129259);
                bwcVar.Y(false);
            } else {
                bveVarC.v(-30088523);
                java.lang.String strValueOf = java.lang.String.valueOf(num.intValue());
                long jE = obsVar.e();
                defpackage.cfu cfuVar = defpackage.cfs.e;
                defpackage.cgf cgfVarO = defpackage.awj.o(atsVar.a(cgcVar, cfuVar), cfuVar, true);
                defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
                defpackage.dil dilVar = defpackage.dil.k;
                int i5 = defpackage.dik.a;
                java.util.List listAsList = java.util.Arrays.asList(new defpackage.dip(2131296306, dilVar, 0, new defpackage.dij(new defpackage.dii(600), new defpackage.dih("wdth", 100.0f), new defpackage.dih("GRAD", 0.0f), new defpackage.dih("ROND", 100.0f), new defpackage.dih("slnt", 0.0f))));
                listAsList.getClass();
                defpackage.dgd dgdVar = new defpackage.dgd(0L, 5389680640L, null, new defpackage.dic(listAsList), 11754788618L, 3, 0L, 16744285);
                bwcVar = bwcVar2;
                z2 = true;
                defpackage.brv.b(strValueOf, cgfVarO, jE, 0L, null, 0L, null, 0L, 0, false, 0, 0, dgdVar, bveVarC, 0, 0, 131064);
                bveVar2 = bveVarC;
                bwcVar.Y(false);
            }
            bwcVar.Y(z2);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bof(ocdVar, aferVar, z, aferVar2, aferVar3, cgfVar, i, 12);
        }
    }

    public static void s(defpackage.obw obwVar, defpackage.afer aferVar, defpackage.afer aferVar2, boolean z, defpackage.afer aferVar3, defpackage.cgf cgfVar, defpackage.bve bveVar, int i) {
        int i2;
        defpackage.afer aferVar4;
        defpackage.afer aferVar5;
        boolean z2;
        aferVar.getClass();
        aferVar2.getClass();
        aferVar3.getClass();
        cgfVar.getClass();
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-779934128);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? bveVarC.C(obwVar) : bveVarC.E(obwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            aferVar4 = aferVar;
            i2 |= true != bveVarC.E(aferVar4) ? 16 : 32;
        } else {
            aferVar4 = aferVar;
        }
        if ((i & 384) == 0) {
            aferVar5 = aferVar2;
            i2 |= true != bveVarC.E(aferVar5) ? 128 : 256;
        } else {
            aferVar5 = aferVar2;
        }
        if ((i & 3072) == 0) {
            z2 = z;
            i2 |= true != bveVarC.D(z2) ? 1024 : 2048;
        } else {
            z2 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= true != bveVarC.E(aferVar3) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != bveVarC.C(cgfVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != bveVarC.C("") ? 524288 : 1048576;
        }
        int i5 = i2;
        if (bveVarC.I((599187 & i5) != 599186, i5 & 1)) {
            defpackage.ocb ocbVar = new defpackage.ocb(0);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS == obj) {
                objS = new defpackage.njn(i4);
                bwcVar.ad(objS);
            }
            defpackage.cgf cgfVarA = cgfVar.a(new defpackage.ctd((defpackage.affh) objS));
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new defpackage.nkn(17);
                bwcVar.ad(objS2);
            }
            defpackage.cgf cgfVarA2 = cgfVarA.a(new defpackage.cjy((defpackage.affc) objS2));
            long j = bwcVar.u;
            long j2 = j ^ (j >>> 32);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarA2);
            defpackage.afer aferVar6 = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar6);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ocbVar, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j2), defpackage.cwl.f);
            bveVarC.i(defpackage.afbk.a, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            defpackage.ocd ocdVar = defpackage.obt.a;
            int i6 = i5 >> 3;
            int i7 = i6 & 896;
            boolean z3 = z2;
            r(defpackage.obt.a, aferVar4, z3, aferVar5, aferVar3, new defpackage.cte(defpackage.oca.a), bveVarC, (i5 & 112) | 196616 | i7 | ((i5 << 3) & 7168) | (57344 & i5) | (3670016 & i5));
            if (obwVar != null) {
                bveVarC.v(930502253);
                p(obwVar, aferVar3, new defpackage.cte(new defpackage.oby(obwVar)), bveVarC, (i5 & 14) | ((i5 >> 9) & 112));
                bwcVar.Y(false);
            } else {
                bveVarC.v(930744146);
                q(aferVar3, aferVar2, z, new defpackage.cte(defpackage.obz.a), bveVarC, ((i5 >> 12) & 14) | 3072 | (i6 & 112) | i7);
                bwcVar.Y(false);
            }
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new bof(obwVar, aferVar, aferVar2, z, aferVar3, cgfVar, i, 11);
        }
    }

    public static void t(final defpackage.cgf cgfVar, final int i, final boolean z, final boolean z2, final boolean z3, final boolean z4, java.lang.String str, defpackage.bve bveVar, final int i2) {
        defpackage.cgf cgfVar2;
        int i3;
        final java.lang.String str2;
        defpackage.obu obuVar;
        defpackage.bve bveVarC = bveVar.c(-1746762028);
        if ((i2 & 6) == 0) {
            cgfVar2 = cgfVar;
            i3 = (true != bveVarC.C(cgfVar2) ? 2 : 4) | i2;
        } else {
            cgfVar2 = cgfVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != bveVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != bveVarC.D(z) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != bveVarC.D(z2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != bveVarC.D(z3) ? 8192 : 16384;
        }
        int i4 = i3 | 1572864;
        if (bveVarC.I((533651 & i4) != 533650, i4 & 1)) {
            final boolean zBl = defpackage.ca.bl(bveVarC);
            boolean z5 = (i4 & 896) == 256;
            boolean z6 = (i4 & 7168) == 2048;
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if ((z5 | z6) || objS == defpackage.bvd.a) {
                if (z) {
                    obuVar = defpackage.obu.a;
                } else {
                    obuVar = z2 ? obv.a : null;
                }
                objS = obuVar;
                bwcVar.ad(objS);
            }
            defpackage.obw obwVar = (defpackage.obw) objS;
            final boolean z7 = i <= 20 && !z;
            final boolean z8 = !z7 && i >= 95;
            boolean zD = bveVarC.D(zBl) | z5 | z6 | bveVarC.D(z7);
            java.lang.Object objS2 = bwcVar.S();
            if (zD || objS2 == defpackage.bvd.a) {
                objS2 = new defpackage.afer() { // from class: oci
                    @Override // defpackage.afer
                    public final java.lang.Object invoke() {
                        boolean z9 = zBl;
                        boolean z10 = z7;
                        boolean z11 = z;
                        boolean z12 = z2;
                        if (z9) {
                            if (z10) {
                                return obk.a;
                            }
                            if (z11) {
                                return obi.a;
                            }
                            return z12 ? obl.a : obj.a;
                        }
                        if (z10) {
                            return obp.a;
                        }
                        if (z11) {
                            return defpackage.obn.a;
                        }
                        return z12 ? obq.a : obo.a;
                    }
                };
                bwcVar.ad(objS2);
            }
            int i5 = i4 & 112;
            defpackage.afer aferVar = (defpackage.afer) objS2;
            java.lang.Object objS3 = bwcVar.S();
            if (i5 == 32 || objS3 == defpackage.bvd.a) {
                objS3 = new defpackage.afer() { // from class: oce
                    @Override // defpackage.afer
                    public final java.lang.Object invoke() {
                        return java.lang.Integer.valueOf(i);
                    }
                };
                bwcVar.ad(objS3);
            }
            defpackage.afer aferVar2 = (defpackage.afer) objS3;
            boolean zD2 = bveVarC.D(z8);
            java.lang.Object objS4 = bwcVar.S();
            if (zD2 || objS4 == defpackage.bvd.a) {
                objS4 = new defpackage.afer() { // from class: ocf
                    @Override // defpackage.afer
                    public final java.lang.Object invoke() {
                        return java.lang.Boolean.valueOf(z8);
                    }
                };
                bwcVar.ad(objS4);
            }
            s(obwVar, aferVar2, (defpackage.afer) objS4, z3, aferVar, cgfVar2, bveVarC, ((i4 >> 3) & 7168) | ((i4 << 15) & 458752) | (i4 & 3670016));
            str2 = "";
        } else {
            bveVarC.s();
            str2 = str;
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: ocg
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    defpackage.bve bveVar2 = (defpackage.bve) obj;
                    ((java.lang.Integer) obj2).intValue();
                    defpackage.cgf cgfVar3 = cgfVar;
                    int i6 = i;
                    boolean z9 = z;
                    int i7 = i2 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    defpackage.edd.t(cgfVar3, i6, z9, z2, z3, z4, str2, bveVar2, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static long u(defpackage.obw obwVar, float f) {
        float fB = obwVar.b() * f;
        return (((long) java.lang.Float.floatToRawIntBits(obwVar.a() * f)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fB) << 32);
    }

    public static boolean v(boolean z, int i, boolean z2, boolean z3) {
        if (z) {
            return true;
        }
        if (z3) {
            return false;
        }
        return i > 0 || z2;
    }

    public static void w(final defpackage.cgf cgfVar, final defpackage.dgd dgdVar, final long j, final java.lang.String str, final java.lang.String str2, final boolean z, defpackage.bve bveVar, final int i) {
        int i2;
        java.lang.String str3;
        java.lang.String str4;
        defpackage.bve bveVar2;
        defpackage.byl bylVar;
        defpackage.bve bveVarC = bveVar.c(-810397845);
        if ((i & 6) == 0) {
            i2 = (true != bveVarC.C(cgfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.C(dgdVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.B(j) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            str3 = str;
            i2 |= true != bveVarC.C(str3) ? 1024 : 2048;
        } else {
            str3 = str;
        }
        if ((i & 24576) == 0) {
            str4 = str2;
            i2 |= true != bveVarC.C(str4) ? 8192 : 16384;
        } else {
            str4 = str2;
        }
        int i3 = i2 | 196608;
        if (bveVarC.I((74899 & i3) != 74898, i3 & 1)) {
            android.content.Context context = (android.content.Context) bveVarC.f(defpackage.daj.b);
            j$.time.Duration duration = defpackage.nzt.a;
            boolean zC = bveVarC.C(null);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            if (zC || objS == defpackage.bvd.a) {
                objS = new androidx.compose.runtime.ParcelableSnapshotMutableLongState(java.lang.System.currentTimeMillis());
                bwcVar.ad(objS);
            }
            defpackage.byl bylVar2 = (defpackage.byl) objS;
            java.lang.Object objS2 = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            if (objS2 == obj) {
                androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(context)), defpackage.bxv.c);
                bwcVar.ad(parcelableSnapshotMutableState);
                objS2 = parcelableSnapshotMutableState;
            }
            defpackage.bwx bwxVar = (defpackage.bwx) objS2;
            defpackage.afbk afbkVar = defpackage.afbk.a;
            boolean zC2 = bveVarC.C(bylVar2);
            java.lang.Object objS3 = bwcVar.S();
            if (zC2 || objS3 == obj) {
                objS3 = new defpackage.btv(bylVar2, (defpackage.afdk) null, 3);
                bwcVar.ad(objS3);
            }
            defpackage.bvx.g(afbkVar, (defpackage.affg) objS3, bveVarC);
            boolean zC3 = bveVarC.C(bylVar2) | bveVarC.E(context);
            java.lang.Object objS4 = bwcVar.S();
            if (zC3 || objS4 == obj) {
                bylVar = bylVar2;
                defpackage.acn acnVar = new defpackage.acn((java.lang.Object) context, (java.lang.Object) bylVar, (java.lang.Object) bwxVar, 19, (char[]) null);
                bwcVar.ad(acnVar);
                objS4 = acnVar;
            } else {
                bylVar = bylVar2;
            }
            defpackage.bvx.b(context, null, (defpackage.affc) objS4, bveVarC);
            boolean zB = bveVarC.B(bylVar.e()) | ((458752 & i3) == 131072);
            java.lang.Object objS5 = bwcVar.S();
            java.lang.Object obj2 = objS5;
            if (zB || objS5 == obj) {
                java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault());
                calendar.setTimeInMillis(bylVar.e());
                bwcVar.ad(calendar);
                obj2 = calendar;
            }
            obj2.getClass();
            java.util.Calendar calendar2 = (java.util.Calendar) obj2;
            java.lang.String str5 = true != ((java.lang.Boolean) bwxVar.a()).booleanValue() ? str3 : str4;
            boolean zC4 = bveVarC.C(calendar2) | bveVarC.C(str5);
            java.lang.Object objS6 = bwcVar.S();
            if (zC4 || objS6 == obj) {
                objS6 = android.text.format.DateFormat.format(str5, calendar2).toString();
                bwcVar.ad(objS6);
            }
            java.lang.String str6 = (java.lang.String) objS6;
            defpackage.cfu cfuVar = defpackage.cfs.e;
            defpackage.cty ctyVarB = defpackage.atp.b(cfuVar, false);
            long j2 = bwcVar.u;
            long j3 = j2 ^ (j2 >>> 32);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVar);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf((int) j3), defpackage.cwl.f);
            bveVarC.i(afbkVar, new defpackage.amc(defpackage.cwl.g, 16));
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            bveVar2 = bveVarC;
            defpackage.brv.b(str6, defpackage.awj.o(defpackage.ats.a.a(defpackage.cgf.e, cfuVar), cfuVar, true), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, dgdVar, bveVar2, i3 & 896, (i3 << 18) & 29360128, 131064);
            bwcVar.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.affg() { // from class: nzu
                @Override // defpackage.affg
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    defpackage.bve bveVar3 = (defpackage.bve) obj3;
                    ((java.lang.Integer) obj4).intValue();
                    defpackage.cgf cgfVar2 = cgfVar;
                    defpackage.dgd dgdVar2 = dgdVar;
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    defpackage.edd.w(cgfVar2, dgdVar2, j, str, str2, z, bveVar3, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return defpackage.afbk.a;
                }
            };
        }
    }

    public static defpackage.nxj x(nvb nvbVar, defpackage.nve nveVar) {
        if (nvbVar == null) {
            return null;
        }
        int iY = y(nveVar);
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = nvbVar.a;
        if (ghIcon == null && nvbVar.b == null && iY == 1) {
            return null;
        }
        return new nxk(ghIcon, nvbVar.b, nvbVar.c, nvbVar.e);
    }

    public static int y(defpackage.nve nveVar) {
        int iOrdinal = nveVar.ordinal();
        if (iOrdinal == 3 || iOrdinal == 4) {
            return 2;
        }
        if (iOrdinal != 5) {
            return iOrdinal != 7 ? 1 : 4;
        }
        return 3;
    }

    public static /* synthetic */ java.lang.String z(int i) {
        switch (i) {
            case 1:
                return "DEFAULT";
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return "CALL_ACCEPT";
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return "CALL_DECLINE";
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return "SELECTED";
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return "PRIMARY";
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return "PERSONAL_RECOMMENDATION";
            default:
                return "null";
        }
    }
}
