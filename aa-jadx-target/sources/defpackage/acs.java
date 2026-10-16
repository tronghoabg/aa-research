package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acs {
    private static final defpackage.affc g = new defpackage.abj(13);
    private static final defpackage.affc h = new defpackage.abj(14);
    public static final defpackage.bil f = new defpackage.bil(new defpackage.abj(15), new defpackage.abj(16), (byte[]) null);
    public static final defpackage.aga a = new defpackage.aga(1.0f, 400.0f, null);
    public static final defpackage.aga b = new defpackage.aga(1.0f, 400.0f, java.lang.Float.valueOf(0.002f));
    public static final defpackage.aga c = new defpackage.aga(1.0f, 400.0f, null);
    public static final defpackage.aga d = new defpackage.aga(1.0f, 400.0f, new defpackage.dlw(4294967297L));
    public static final defpackage.aga e = new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L));

    public static /* synthetic */ defpackage.acx A(defpackage.afd afdVar, int i) {
        if ((i & 1) != 0) {
            afdVar = new defpackage.aga(1.0f, 400.0f, null);
        }
        return f(afdVar, 0.0f);
    }

    private static final defpackage.cfu B(defpackage.cft cftVar) {
        if (defpackage.afga.f(cftVar, defpackage.cfs.j)) {
            return defpackage.cfs.d;
        }
        return defpackage.afga.f(cftVar, defpackage.cfs.l) ? defpackage.cfs.f : defpackage.cfs.e;
    }

    private static final defpackage.cfu C(defpackage.cfy cfyVar) {
        if (defpackage.afga.f(cfyVar, defpackage.cfs.m)) {
            return defpackage.cfs.b;
        }
        return defpackage.afga.f(cfyVar, defpackage.cfs.o) ? defpackage.cfs.h : defpackage.cfs.e;
    }

    public static final defpackage.acw a(defpackage.afd afdVar, float f2) {
        return new defpackage.acw(new defpackage.ack(new defpackage.acy(f2, afdVar), null, null, null, false, null, 126));
    }

    public static final defpackage.acw b(defpackage.afd afdVar, float f2, long j) {
        return new defpackage.acw(new defpackage.ack(null, null, null, new defpackage.adf(f2, j, afdVar), false, null, 119));
    }

    public static final defpackage.acw c(defpackage.afd afdVar, defpackage.affc affcVar) {
        return new defpackage.acw(new defpackage.ack(null, new defpackage.adq(affcVar, afdVar), null, null, false, null, 125));
    }

    public static final defpackage.acw d(defpackage.afd afdVar, defpackage.affc affcVar) {
        return c(afdVar, new defpackage.aap(affcVar, 13));
    }

    public static final defpackage.acw e(defpackage.afd afdVar, defpackage.affc affcVar) {
        return c(afdVar, new defpackage.aap(affcVar, 12));
    }

    public static final defpackage.acx f(defpackage.afd afdVar, float f2) {
        return new defpackage.acx(new defpackage.ack(new defpackage.acy(f2, afdVar), null, null, null, false, null, 126));
    }

    public static final defpackage.acx g(defpackage.afd afdVar, float f2, long j) {
        return new defpackage.acx(new defpackage.ack(null, null, null, new defpackage.adf(f2, j, afdVar), false, null, 119));
    }

    public static final defpackage.acx h(defpackage.afd afdVar, defpackage.affc affcVar) {
        return new defpackage.acx(new defpackage.ack(null, new defpackage.adq(affcVar, afdVar), null, null, false, null, 125));
    }

    public static final defpackage.acx i(defpackage.afd afdVar, defpackage.affc affcVar) {
        return h(afdVar, new defpackage.aap(affcVar, 14));
    }

    public static final defpackage.acx j(defpackage.afd afdVar, defpackage.affc affcVar) {
        return h(afdVar, new defpackage.aap(affcVar, 15));
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    public static final defpackage.adi k(defpackage.agn agnVar, defpackage.adi adiVar, defpackage.bve bveVar, int i) {
        float fFloatValue;
        int i2 = i & 14;
        if (adiVar == null) {
            bveVar.v(-968938819);
            boolean z = ((i2 ^ 6) > 4 && bveVar.C(agnVar)) || (i & 6) == 4;
            java.lang.Object objG = bveVar.g();
            if (z || objG == defpackage.bvd.a) {
                objG = new defpackage.adi();
                bveVar.x(objG);
            }
            adiVar = (defpackage.adi) objG;
        } else {
            bveVar.v(-31257052);
        }
        bveVar.o();
        boolean z2 = (agnVar.f() == null || adiVar.v == null) ? false : true;
        boolean z3 = agnVar.e() == agnVar.g();
        defpackage.add addVarA = adiVar.a();
        if (z2) {
            if (addVarA == defpackage.add.a || addVarA == defpackage.add.e) {
                adiVar.r.e();
                adiVar.g(z3 ? defpackage.add.d : defpackage.add.b);
                adiVar.p = null;
                adiVar.q = null;
            }
        } else if (addVarA == defpackage.add.b || addVarA == defpackage.add.c || addVarA == defpackage.add.d) {
            adiVar.g(defpackage.add.e);
            defpackage.sr srVar = adiVar.s;
            if (srVar != null) {
                java.lang.Float fValueOf = java.lang.Float.valueOf(java.lang.Float.intBitsToFloat((int) (srVar.b() >> 32)));
                if (true == java.lang.Float.isNaN(fValueOf.floatValue())) {
                    fValueOf = null;
                }
                if (fValueOf != null) {
                    fFloatValue = fValueOf.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
            } else {
                fFloatValue = 0.0f;
            }
            adiVar.p = new defpackage.ael(fFloatValue);
            defpackage.ca caVar = adiVar.u;
            defpackage.sr srVar2 = adiVar.t;
            java.lang.Float fValueOf2 = java.lang.Float.valueOf(0.0f);
            if (true == java.lang.Float.isNaN(fValueOf2.floatValue())) {
                fValueOf2 = null;
            }
            float fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : 0.0f;
            java.lang.Float fValueOf3 = java.lang.Float.valueOf(0.0f);
            if (true == java.lang.Float.isNaN(fValueOf3.floatValue())) {
                fValueOf3 = null;
            }
            adiVar.q = new defpackage.aem(fFloatValue2, fValueOf3 != null ? fValueOf3.floatValue() : 0.0f);
        }
        java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z2);
        boolean zD = bveVar.D(z2) | bveVar.D(z3) | bveVar.E(adiVar);
        java.lang.Object objG2 = bveVar.g();
        if (zD || objG2 == defpackage.bvd.a) {
            objG2 = new defpackage.acr(z2, z3, adiVar, null);
            bveVar.x(objG2);
        }
        defpackage.bvx.g(boolValueOf, (defpackage.affg) objG2, bveVar);
        boolean zE = bveVar.E(adiVar);
        java.lang.Object objG3 = bveVar.g();
        if (zE || objG3 == defpackage.bvd.a) {
            objG3 = new defpackage.nz(adiVar, 7);
            bveVar.x(objG3);
        }
        l(agnVar, (defpackage.afer) objG3, bveVar, i2);
        return adiVar;
    }

    public static final void l(defpackage.agn agnVar, defpackage.afer aferVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-1186853286);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != bveVarC.C(agnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(aferVar) ? 16 : 32;
        }
        if (bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            boolean z = agnVar.f() != null;
            if (defpackage.afga.f(agnVar.e(), agnVar.g()) && !z) {
                aferVar.invoke();
            }
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar.S();
            java.lang.Object obj = defpackage.bvd.a;
            java.lang.Object obj2 = objS;
            if (objS == obj) {
                boolean[] zArr = {z};
                bwcVar.ad(zArr);
                obj2 = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj2;
            java.lang.Object objS2 = bwcVar.S();
            if (objS2 == obj) {
                objS2 = new java.lang.Object[1];
                bwcVar.ad(objS2);
            }
            java.lang.Object[] objArr = (java.lang.Object[]) objS2;
            if (!defpackage.afga.f(objArr[0], agnVar.g())) {
                if (!z && !zArr2[0]) {
                    aferVar.invoke();
                }
                objArr[0] = agnVar.g();
            }
            zArr2[0] = z;
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.agg(agnVar, aferVar, i, i4);
        }
    }

    public static final defpackage.cgf m(defpackage.agn agnVar, defpackage.acw acwVar, defpackage.acx acxVar, defpackage.adi adiVar, java.lang.String str, defpackage.bve bveVar, int i, int i2) {
        defpackage.afer aferVar;
        defpackage.acw acwVar2;
        defpackage.acx acxVar2;
        defpackage.bve bveVar2;
        boolean z;
        defpackage.agi agiVar;
        defpackage.agi agiVar2;
        defpackage.agi agiVar3;
        defpackage.adi adiVar2;
        defpackage.cgf aduVar;
        defpackage.agi agiVarAg;
        defpackage.agi agiVarAg2;
        defpackage.agi agiVarAg3;
        java.lang.Object acpVar;
        int i3 = 0;
        if ((i2 & 8) != 0) {
            java.lang.Object objG = bveVar.g();
            if (objG == defpackage.bvd.a) {
                objG = new defpackage.acm(i3);
                bveVar.x(objG);
            }
            aferVar = (defpackage.afer) objG;
        } else {
            aferVar = null;
        }
        int i4 = i & 14;
        boolean z2 = (i2 & 4) != 0;
        defpackage.adi adiVarK = (i2 & 16) != 0 ? null : adiVar;
        if (z2 || adiVarK == null) {
            bveVar.v(1017998816);
            adiVarK = k(agnVar, adiVarK, bveVar, ((i >> 12) & 112) | i4);
            bveVar.o();
        } else {
            bveVar.v(1018346543);
            bveVar.o();
        }
        if (z2) {
            bveVar.v(1018455074);
            defpackage.acw acwVarX = x(agnVar, acwVar, adiVarK, bveVar, i & 126);
            bveVar.o();
            acwVar2 = acwVarX;
        } else {
            bveVar.v(1018554181);
            bveVar.o();
            acwVar2 = acwVar;
        }
        if (z2) {
            bveVar.v(1018640485);
            defpackage.acx acxVarY = y(agnVar, acxVar, adiVarK, bveVar, ((i >> 3) & 112) | i4);
            bveVar.o();
            acxVar2 = acxVarY;
        } else {
            bveVar.v(1018736678);
            bveVar.o();
            acxVar2 = acxVar;
        }
        defpackage.ack ackVar = acwVar2.b;
        defpackage.ack ackVar2 = acxVar2.b;
        defpackage.adt adtVar = ackVar2.e;
        defpackage.afer aferVar2 = aferVar;
        long j = adiVarK.b;
        boolean z3 = (ackVar.b == null && ackVar2.b == null && adiVarK.f == 0) ? false : true;
        boolean z4 = (ackVar.c == null && ackVar2.c == null) ? false : true;
        if (z3) {
            int i5 = i4 | 384;
            bveVar2 = bveVar;
            bveVar2.v(1019286587);
            defpackage.bil bilVar = defpackage.agt.g;
            z = true;
            java.lang.Object objG2 = bveVar2.g();
            if (objG2 == defpackage.bvd.a) {
                objG2 = str.concat(" slide");
                bveVar2.x(objG2);
            }
            defpackage.agi agiVarAg4 = defpackage.afw.ag(agnVar, bilVar, bveVar2, i5);
            bveVar2.o();
            agiVar = agiVarAg4;
        } else {
            bveVar2 = bveVar;
            z = true;
            bveVar2.v(1019392390);
            bveVar2.o();
            agiVar = null;
        }
        if (z4) {
            int i6 = i4 | 384;
            bveVar2.v(1019484181);
            defpackage.bil bilVar2 = defpackage.agt.h;
            java.lang.Object objG3 = bveVar2.g();
            if (objG3 == defpackage.bvd.a) {
                objG3 = str.concat(" shrink/expand");
                bveVar2.x(objG3);
            }
            defpackage.agi agiVarAg5 = defpackage.afw.ag(agnVar, bilVar2, bveVar2, i6);
            bveVar2.o();
            agiVar2 = agiVarAg5;
        } else {
            bveVar2.v(1019595005);
            bveVar2.o();
            agiVar2 = null;
        }
        if (z4 != 0) {
            int i7 = i4 | 384;
            bveVar2.v(1019668631);
            defpackage.bil bilVar3 = defpackage.agt.g;
            java.lang.Object objG4 = bveVar2.g();
            if (objG4 == defpackage.bvd.a) {
                objG4 = str.concat(" InterruptionHandlingOffset");
                bveVar2.x(objG4);
            }
            defpackage.agi agiVarAg6 = defpackage.afw.ag(agnVar, bilVar3, bveVar2, i7);
            bveVar2.o();
            agiVar3 = agiVarAg6;
        } else {
            bveVar2.v(1019839037);
            bveVar2.o();
            agiVar3 = null;
        }
        defpackage.acd acdVar = ackVar2.c;
        boolean z5 = !z4;
        float[] fArr = defpackage.clr.a;
        defpackage.cmd cmdVar = defpackage.clr.e;
        if (j != 0) {
            int i8 = i4 | 384;
            bveVar2.v(1020378035);
            java.lang.Object objInvoke = defpackage.ace.a.invoke(cmdVar);
            java.lang.Object objG5 = bveVar2.g();
            if (objG5 == defpackage.bvd.a) {
                objG5 = str.concat(" veil");
                bveVar2.x(objG5);
            }
            defpackage.acw acwVar3 = acwVar2;
            defpackage.adi adiVar3 = adiVarK;
            aduVar = new defpackage.adu(agnVar, defpackage.afw.ag(agnVar, (defpackage.bil) objInvoke, bveVar2, i8), acwVar3, acxVar2, adiVar3);
            adiVar2 = adiVar3;
            acwVar2 = acwVar3;
            bveVar2.o();
        } else {
            adiVar2 = adiVarK;
            bveVar2.v(1020676162);
            bveVar2.o();
            aduVar = defpackage.cgf.e;
        }
        defpackage.cgf cgfVar = aduVar;
        java.lang.Boolean bool = adiVar2.v != null ? java.lang.Boolean.FALSE : null;
        if (bool != null) {
            bool.booleanValue();
        }
        int i9 = i >> 6;
        boolean z6 = (ackVar.a == null && ackVar2.a == null && adiVar2.c == 1.0f) ? false : z;
        boolean z7 = (ackVar.d == null && ackVar2.d == null && adiVar2.d == 1.0f) ? false : z;
        int i10 = (i9 & 57344) | i4;
        int i11 = i10 & 14;
        if (z6) {
            int i12 = i11 | 384;
            bveVar2.v(-1511857635);
            defpackage.bil bilVar4 = defpackage.agt.a;
            java.lang.Object objG6 = bveVar2.g();
            if (objG6 == defpackage.bvd.a) {
                objG6 = str.concat(" alpha");
                bveVar2.x(objG6);
            }
            agiVarAg = defpackage.afw.ag(agnVar, bilVar4, bveVar2, i12);
            bveVar2.o();
        } else {
            bveVar2.v(-1511688190);
            bveVar2.o();
            agiVarAg = null;
        }
        if (z7) {
            int i13 = i11 | 384;
            bveVar2.v(-1511620547);
            defpackage.bil bilVar5 = defpackage.agt.a;
            java.lang.Object objG7 = bveVar2.g();
            if (objG7 == defpackage.bvd.a) {
                objG7 = str.concat(" scale");
                bveVar2.x(objG7);
            }
            agiVarAg2 = defpackage.afw.ag(agnVar, bilVar5, bveVar2, i13);
            bveVar2.o();
        } else {
            bveVar2.v(-1511451102);
            bveVar2.o();
            agiVarAg2 = null;
        }
        if (z7) {
            bveVar2.v(-1511373446);
            agiVarAg3 = defpackage.afw.ag(agnVar, f, bveVar2, i11 | 384);
            bveVar2.o();
        } else {
            bveVar2.v(-1511201118);
            bveVar2.o();
            agiVarAg3 = null;
        }
        boolean zE = bveVar2.E(agiVarAg) | bveVar2.C(acwVar2) | bveVar2.C(acxVar2) | bveVar2.E(adiVar2) | bveVar2.E(agiVarAg2) | ((((i11 ^ 6) <= 4 || !bveVar2.C(agnVar)) && (i10 & 6) != 4) ? false : z) | bveVar2.E(agiVarAg3);
        java.lang.Object objG8 = bveVar2.g();
        if (zE || objG8 == defpackage.bvd.a) {
            defpackage.acx acxVar3 = acxVar2;
            acpVar = new defpackage.acp(agiVarAg, adiVar2, agiVarAg2, agnVar, acwVar2, acxVar3, agiVarAg3);
            acxVar2 = acxVar3;
            bveVar2.x(acpVar);
        } else {
            acpVar = objG8;
        }
        defpackage.acp acpVar2 = (defpackage.acp) acpVar;
        boolean zD = bveVar2.D(z5) | (((((i & 57344) ^ 24576) <= 16384 || !bveVar2.C(aferVar2)) && (i & 24576) != 16384) ? false : z);
        java.lang.Object objG9 = bveVar2.g();
        if (zD || objG9 == defpackage.bvd.a) {
            objG9 = new defpackage.njo(z5, aferVar2, z ? 1 : 0);
            bveVar2.x(objG9);
        }
        return new defpackage.cjy((defpackage.affc) objG9).a(new defpackage.acl(agnVar, agiVar2, agiVar3, agiVar, acwVar2, acxVar2, adiVar2, aferVar2, acpVar2)).a(cgfVar);
    }

    public static /* synthetic */ defpackage.acw n(defpackage.afd afdVar, defpackage.cft cftVar, int i) {
        if ((i & 1) != 0) {
            afdVar = new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L));
        }
        if ((i & 2) != 0) {
            cftVar = defpackage.cfs.l;
        }
        int i2 = 17;
        return o(afdVar, B(cftVar), new defpackage.aap(new defpackage.abj(i2), i2));
    }

    public static final defpackage.acw o(defpackage.afd afdVar, defpackage.cfu cfuVar, defpackage.affc affcVar) {
        return new defpackage.acw(new defpackage.ack(null, null, new defpackage.acd(cfuVar, affcVar, afdVar), null, false, null, 123));
    }

    public static /* synthetic */ defpackage.acw p(defpackage.cfy cfyVar, int i) {
        defpackage.aga agaVar = (i & 1) != 0 ? new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)) : null;
        if ((i & 2) != 0) {
            cfyVar = defpackage.cfs.o;
        }
        int i2 = 18;
        return o(agaVar, C(cfyVar), new defpackage.aap(new defpackage.abj(i2), i2));
    }

    public static /* synthetic */ defpackage.acw q(defpackage.afd afdVar, float f2, long j, int i) {
        if ((i & 1) != 0) {
            afdVar = b;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            j = defpackage.tna.aK(0.5f, 0.5f);
        }
        return b(afdVar, f2, j);
    }

    public static /* synthetic */ defpackage.acx r(defpackage.afd afdVar, float f2, long j, int i) {
        if ((i & 1) != 0) {
            afdVar = b;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            j = defpackage.tna.aK(0.5f, 0.5f);
        }
        return g(afdVar, f2, j);
    }

    public static /* synthetic */ defpackage.acx s(defpackage.afd afdVar, defpackage.cft cftVar, int i) {
        if ((i & 1) != 0) {
            afdVar = new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L));
        }
        if ((i & 2) != 0) {
            cftVar = defpackage.cfs.l;
        }
        return t(afdVar, B(cftVar), new defpackage.aap(new defpackage.abj(20), 16));
    }

    public static final defpackage.acx t(defpackage.afd afdVar, defpackage.cfu cfuVar, defpackage.affc affcVar) {
        return new defpackage.acx(new defpackage.ack(null, null, new defpackage.acd(cfuVar, affcVar, afdVar), null, false, null, 123));
    }

    public static /* synthetic */ defpackage.acx u(defpackage.cfy cfyVar, int i) {
        defpackage.aga agaVar = (i & 1) != 0 ? new defpackage.aga(1.0f, 400.0f, new defpackage.dly(4294967297L)) : null;
        if ((i & 2) != 0) {
            cfyVar = defpackage.cfs.o;
        }
        return t(agaVar, C(cfyVar), new defpackage.aap(new defpackage.acq(0), 19));
    }

    public static /* synthetic */ defpackage.acw v(defpackage.affc affcVar) {
        return c(new defpackage.aga(1.0f, 400.0f, new defpackage.dlw(4294967297L)), new defpackage.aap(affcVar, 13));
    }

    public static /* synthetic */ defpackage.acx w(defpackage.affc affcVar) {
        return h(new defpackage.aga(1.0f, 400.0f, new defpackage.dlw(4294967297L)), new defpackage.aap(affcVar, 14));
    }

    public static final defpackage.acw x(defpackage.agn agnVar, defpackage.acw acwVar, defpackage.adi adiVar, defpackage.bve bveVar, int i) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !bveVar.C(agnVar)) && (i & 6) != 4) {
            z = false;
        }
        java.lang.Object objG = bveVar.g();
        if (z || objG == defpackage.bvd.a) {
            androidx.compose.runtime.ParcelableSnapshotMutableState parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(acwVar, defpackage.bxv.c);
            bveVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objG;
        if (agnVar.e() == agnVar.g() && agnVar.e() == defpackage.acj.b) {
            if (agnVar.w()) {
                bwxVar.b(acwVar);
            } else {
                bwxVar.b(defpackage.acw.a);
            }
        } else if (agnVar.g() != defpackage.acj.c) {
            bwxVar.b(((defpackage.acw) bwxVar.a()).a((adiVar != null ? defpackage.acw.a : defpackage.acw.a).a(acwVar)));
        }
        return (defpackage.acw) bwxVar.a();
    }

    public static final defpackage.acx y(defpackage.agn agnVar, defpackage.acx acxVar, defpackage.adi adiVar, defpackage.bve bveVar, int i) {
        defpackage.adq adqVar;
        defpackage.acd acdVar;
        defpackage.acx acxVar2;
        boolean z = (((i & 14) ^ 6) > 4 && bveVar.C(agnVar)) || (i & 6) == 4;
        java.lang.Object objG = bveVar.g();
        if (z || objG == defpackage.bvd.a) {
            objG = new androidx.compose.runtime.ParcelableSnapshotMutableState(acxVar, defpackage.bxv.c);
            bveVar.x(objG);
        }
        defpackage.bwx bwxVar = (defpackage.bwx) objG;
        if (agnVar.e() == agnVar.g() && agnVar.e() == defpackage.acj.b) {
            if (agnVar.w()) {
                bwxVar.b(acxVar);
            } else {
                bwxVar.b(defpackage.acx.a);
            }
        } else if (agnVar.g() != defpackage.acj.b) {
            if (adiVar == null || !adiVar.i()) {
                defpackage.ack ackVar = ((defpackage.acx) bwxVar.a()).b;
                defpackage.acy acyVar = ((defpackage.acx) bwxVar.a()).b.a;
                defpackage.acy acyVar2 = acyVar != null ? new defpackage.acy(1.0f, acyVar.b) : null;
                defpackage.adf adfVar = ((defpackage.acx) bwxVar.a()).b.d;
                defpackage.adf adfVar2 = adfVar != null ? new defpackage.adf(1.0f, adfVar.b, adfVar.c) : null;
                defpackage.adq adqVar2 = ((defpackage.acx) bwxVar.a()).b.b;
                if (adqVar2 != null) {
                    adqVar = new defpackage.adq(g, adqVar2.b);
                } else {
                    adqVar = null;
                }
                defpackage.acd acdVar2 = ((defpackage.acx) bwxVar.a()).b.c;
                if (acdVar2 != null) {
                    acdVar = new defpackage.acd(acdVar2.a, h, acdVar2.c);
                } else {
                    acdVar = null;
                }
                defpackage.adt adtVar = ((defpackage.acx) bwxVar.a()).b.e;
                acxVar2 = new defpackage.acx(new defpackage.ack(acyVar2, adqVar, acdVar, adfVar2, ackVar.f, ackVar.g));
            } else {
                acxVar2 = (defpackage.acx) bwxVar.a();
            }
            bwxVar.b(acxVar2.a(adiVar != null ? defpackage.acx.a : defpackage.acx.a).a(acxVar));
        }
        return (defpackage.acx) bwxVar.a();
    }

    public static /* synthetic */ defpackage.acw z(defpackage.afd afdVar, int i) {
        if ((i & 1) != 0) {
            afdVar = new defpackage.aga(1.0f, 400.0f, null);
        }
        return a(afdVar, 0.0f);
    }
}
