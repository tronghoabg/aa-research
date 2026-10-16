package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes.dex */
public final class acl {
    public static final aft d;
    public static final aft e;
    private static final afec g = new abc(13);
    private static final afec h = new abc(14);
    public static final bii f = new bii(new abc(15), new abc(16), (byte[]) null);
    public static final aft a = new aft(1.0f, 400.0f, null);
    public static final aft b = new aft(1.0f, 400.0f, Float.valueOf(0.002f));
    public static final aft c = new aft(1.0f, 400.0f, null);

    static {
        Map map = ahc.a;
        d = new aft(1.0f, 400.0f, new dlo(4294967297L));
        e = new aft(1.0f, 400.0f, new dlq(4294967297L));
    }

    public static final acq A(agg aggVar, acq acqVar, adb adbVar, bux buxVar, int i) {
        acq acqVar2;
        boolean z = (((i & 14) ^ 6) > 4 && buxVar.C(aggVar)) || (i & 6) == 4;
        Object objG = buxVar.g();
        if (z || objG == buw.a) {
            objG = new ParcelableSnapshotMutableState(acqVar, bxp.c);
            buxVar.x(objG);
        }
        bwq bwqVar = (bwq) objG;
        if (aggVar.e() == aggVar.g() && aggVar.e() == acc.b) {
            if (aggVar.w()) {
                bwqVar.b(acqVar);
            } else {
                bwqVar.b(acq.a);
            }
        } else if (aggVar.g() != acc.b) {
            if (adbVar == null || !adbVar.i()) {
                acd acdVar = ((acq) bwqVar.a()).b;
                acr acrVar = ((acq) bwqVar.a()).b.a;
                acr acrVar2 = acrVar != null ? new acr(1.0f, acrVar.b) : null;
                acy acyVar = ((acq) bwqVar.a()).b.d;
                acy acyVar2 = acyVar != null ? new acy(1.0f, acyVar.b, acyVar.c) : null;
                adj adjVar = ((acq) bwqVar.a()).b.b;
                adj adjVar2 = adjVar != null ? new adj(g, adjVar.b) : null;
                abw abwVar = ((acq) bwqVar.a()).b.c;
                abw abwVar2 = abwVar != null ? new abw(abwVar.a, h, abwVar.c) : null;
                adm admVar = ((acq) bwqVar.a()).b.e;
                acqVar2 = new acq(new acd(acrVar2, adjVar2, abwVar2, acyVar2, acdVar.f, acdVar.g));
            } else {
                acqVar2 = (acq) bwqVar.a();
            }
            bwqVar.b(acqVar2.a(adbVar != null ? acq.a : acq.a).a(acqVar));
        }
        return (acq) bwqVar.a();
    }

    public static /* synthetic */ acp B(aew aewVar, int i) {
        if ((i & 1) != 0) {
            aewVar = new aft(1.0f, 400.0f, null);
        }
        return a(aewVar, BitmapDescriptorFactory.HUE_RED);
    }

    public static /* synthetic */ acq C(aew aewVar, int i) {
        if ((i & 1) != 0) {
            aewVar = new aft(1.0f, 400.0f, null);
        }
        return f(aewVar, BitmapDescriptorFactory.HUE_RED);
    }

    private static final cfn D(cfm cfmVar) {
        return affa.f(cfmVar, cfl.j) ? cfl.d : affa.f(cfmVar, cfl.l) ? cfl.f : cfl.e;
    }

    private static final cfn E(cfr cfrVar) {
        return affa.f(cfrVar, cfl.m) ? cfl.b : affa.f(cfrVar, cfl.o) ? cfl.h : cfl.e;
    }

    public static final acp a(aew aewVar, float f2) {
        return new acp(new acd(new acr(f2, aewVar), null, null, null, false, null, 126));
    }

    public static final acp b(aew aewVar, float f2, long j) {
        return new acp(new acd(null, null, null, new acy(f2, j, aewVar), false, null, 119));
    }

    public static final acp c(aew aewVar, afec afecVar) {
        return new acp(new acd(null, new adj(afecVar, aewVar), null, null, false, null, 125));
    }

    public static final acp d(aew aewVar, afec afecVar) {
        return c(aewVar, new aai(afecVar, 13));
    }

    public static final acp e(aew aewVar, afec afecVar) {
        return c(aewVar, new aai(afecVar, 12));
    }

    public static final acq f(aew aewVar, float f2) {
        return new acq(new acd(new acr(f2, aewVar), null, null, null, false, null, 126));
    }

    public static final acq g(aew aewVar, float f2, long j) {
        return new acq(new acd(null, null, null, new acy(f2, j, aewVar), false, null, 119));
    }

    public static final acq h(aew aewVar, afec afecVar) {
        return new acq(new acd(null, new adj(afecVar, aewVar), null, null, false, null, 125));
    }

    public static final acq i(aew aewVar, afec afecVar) {
        return h(aewVar, new aai(afecVar, 14));
    }

    public static final acq j(aew aewVar, afec afecVar) {
        return h(aewVar, new aai(afecVar, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.adb k(defpackage.agg r9, defpackage.adb r10, defpackage.bux r11, int r12) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acl.k(agg, adb, bux, int):adb");
    }

    public static final void l(agg aggVar, afdr afdrVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1186853286);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.C(aggVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            boolean z = aggVar.f() != null;
            if (affa.f(aggVar.e(), aggVar.g()) && !z) {
                afdrVar.invoke();
            }
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            Object obj2 = objS;
            if (objS == obj) {
                boolean[] zArr = {z};
                bvvVar.ad(zArr);
                obj2 = zArr;
            }
            boolean[] zArr2 = (boolean[]) obj2;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new Object[1];
                bvvVar.ad(objS2);
            }
            Object[] objArr = (Object[]) objS2;
            if (!affa.f(objArr[0], aggVar.g())) {
                if (!z && !zArr2[0]) {
                    afdrVar.invoke();
                }
                objArr[0] = aggVar.g();
            }
            zArr2[0] = z;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(aggVar, afdrVar, i, i4);
        }
    }

    public static final cfy m(agg aggVar, acp acpVar, acq acqVar, adb adbVar, String str, bux buxVar, int i, int i2) {
        afdr afdrVar;
        acp acpVar2;
        acq acqVar2;
        bux buxVar2;
        adb adbVar2;
        boolean z;
        agb agbVar;
        boolean z2;
        agb agbVar2;
        agb agbVar3;
        adb adbVar3;
        cfy adnVar;
        int i3;
        int i4;
        agb agbVarAg;
        boolean z3;
        agb agbVarAg2;
        agb agbVarAg3;
        Object aciVar;
        boolean z4;
        int i5 = 0;
        if ((i2 & 8) != 0) {
            Object objG = buxVar.g();
            if (objG == buw.a) {
                objG = new acf(i5);
                buxVar.x(objG);
            }
            afdrVar = (afdr) objG;
        } else {
            afdrVar = null;
        }
        int i6 = i & 14;
        boolean z5 = (i2 & 4) != 0;
        adb adbVarK = (i2 & 16) != 0 ? null : adbVar;
        if (z5 || adbVarK == null) {
            buxVar.v(1017998816);
            adbVarK = k(aggVar, adbVarK, buxVar, ((i >> 12) & 112) | i6);
            buxVar.o();
        } else {
            buxVar.v(1018346543);
            buxVar.o();
        }
        if (z5) {
            buxVar.v(1018455074);
            acp acpVarZ = z(aggVar, acpVar, adbVarK, buxVar, i & 126);
            buxVar.o();
            acpVar2 = acpVarZ;
        } else {
            buxVar.v(1018554181);
            buxVar.o();
            acpVar2 = acpVar;
        }
        if (z5) {
            buxVar.v(1018640485);
            acq acqVarA = A(aggVar, acqVar, adbVarK, buxVar, ((i >> 3) & 112) | i6);
            buxVar.o();
            acqVar2 = acqVarA;
        } else {
            buxVar.v(1018736678);
            buxVar.o();
            acqVar2 = acqVar;
        }
        acd acdVar = acpVar2.b;
        acd acdVar2 = acqVar2.b;
        adm admVar = acdVar2.e;
        boolean z6 = false;
        afdr afdrVar2 = afdrVar;
        long j = adbVarK.b;
        boolean z7 = (acdVar.b == null && acdVar2.b == null && adbVarK.f == 0) ? false : true;
        boolean z8 = (acdVar.c == null && acdVar2.c == null) ? false : true;
        if (z7) {
            int i7 = i6 | 384;
            buxVar2 = buxVar;
            buxVar2.v(1019286587);
            bii biiVar = agm.g;
            z = true;
            Object objG2 = buxVar2.g();
            adbVar2 = adbVarK;
            if (objG2 == buw.a) {
                objG2 = str.concat(" slide");
                buxVar2.x(objG2);
            }
            agb agbVarAg4 = afp.ag(aggVar, biiVar, buxVar2, i7);
            buxVar2.o();
            agbVar = agbVarAg4;
        } else {
            buxVar2 = buxVar;
            adbVar2 = adbVarK;
            z = true;
            buxVar2.v(1019392390);
            buxVar2.o();
            agbVar = null;
        }
        if (z8) {
            int i8 = i6 | 384;
            buxVar2.v(1019484181);
            bii biiVar2 = agm.h;
            Object objG3 = buxVar2.g();
            z2 = z8;
            if (objG3 == buw.a) {
                objG3 = str.concat(" shrink/expand");
                buxVar2.x(objG3);
            }
            agb agbVarAg5 = afp.ag(aggVar, biiVar2, buxVar2, i8);
            buxVar2.o();
            agbVar2 = agbVarAg5;
        } else {
            z2 = z8;
            buxVar2.v(1019595005);
            buxVar2.o();
            agbVar2 = null;
        }
        if (z2) {
            int i9 = i6 | 384;
            buxVar2.v(1019668631);
            bii biiVar3 = agm.g;
            Object objG4 = buxVar2.g();
            if (objG4 == buw.a) {
                objG4 = str.concat(" InterruptionHandlingOffset");
                buxVar2.x(objG4);
            }
            agb agbVarAg6 = afp.ag(aggVar, biiVar3, buxVar2, i9);
            buxVar2.o();
            agbVar3 = agbVarAg6;
        } else {
            buxVar2.v(1019839037);
            buxVar2.o();
            agbVar3 = null;
        }
        abw abwVar = acdVar2.c;
        boolean z9 = !z2;
        float[] fArr = clj.a;
        clv clvVar = clj.e;
        if (j != 0) {
            int i10 = i6 | 384;
            buxVar2.v(1020378035);
            Object objInvoke = abx.a.invoke(clvVar);
            Object objG5 = buxVar2.g();
            if (objG5 == buw.a) {
                objG5 = str.concat(" veil");
                buxVar2.x(objG5);
            }
            acp acpVar3 = acpVar2;
            adb adbVar4 = adbVar2;
            adnVar = new adn(aggVar, afp.ag(aggVar, (bii) objInvoke, buxVar2, i10), acpVar3, acqVar2, adbVar4);
            adbVar3 = adbVar4;
            acpVar2 = acpVar3;
            buxVar2.o();
        } else {
            adbVar3 = adbVar2;
            buxVar2.v(1020676162);
            buxVar2.o();
            adnVar = cfy.e;
        }
        cfy cfyVar = adnVar;
        Boolean bool = adbVar3.v != null ? false : null;
        if (bool != null) {
            bool.booleanValue();
        }
        int i11 = i >> 6;
        boolean z10 = (acdVar.a == null && acdVar2.a == null && adbVar3.c == 1.0f) ? false : z;
        boolean z11 = (acdVar.d == null && acdVar2.d == null && adbVar3.d == 1.0f) ? false : z;
        int i12 = (i11 & 57344) | i6;
        int i13 = i12 & 14;
        if (z10) {
            int i14 = i13 | 384;
            buxVar2.v(-1511857635);
            bii biiVar4 = agm.a;
            i4 = 57344;
            Object objG6 = buxVar2.g();
            i3 = i12;
            if (objG6 == buw.a) {
                objG6 = str.concat(" alpha");
                buxVar2.x(objG6);
            }
            agbVarAg = afp.ag(aggVar, biiVar4, buxVar2, i14);
            buxVar2.o();
        } else {
            i3 = i12;
            i4 = 57344;
            buxVar2.v(-1511688190);
            buxVar2.o();
            agbVarAg = null;
        }
        if (z11) {
            int i15 = i13 | 384;
            buxVar2.v(-1511620547);
            bii biiVar5 = agm.a;
            Object objG7 = buxVar2.g();
            z3 = z9;
            if (objG7 == buw.a) {
                objG7 = str.concat(" scale");
                buxVar2.x(objG7);
            }
            agbVarAg2 = afp.ag(aggVar, biiVar5, buxVar2, i15);
            buxVar2.o();
        } else {
            z3 = z9;
            buxVar2.v(-1511451102);
            buxVar2.o();
            agbVarAg2 = null;
        }
        if (z11) {
            buxVar2.v(-1511373446);
            agbVarAg3 = afp.ag(aggVar, f, buxVar2, i13 | 384);
            buxVar2.o();
        } else {
            buxVar2.v(-1511201118);
            buxVar2.o();
            agbVarAg3 = null;
        }
        boolean zE = buxVar2.E(agbVarAg) | buxVar2.C(acpVar2) | buxVar2.C(acqVar2) | buxVar2.E(adbVar3) | buxVar2.E(agbVarAg2) | ((((i13 ^ 6) <= 4 || !buxVar2.C(aggVar)) && (i3 & 6) != 4) ? false : z) | buxVar2.E(agbVarAg3);
        Object objG8 = buxVar2.g();
        if (zE || objG8 == buw.a) {
            z4 = z3;
            acq acqVar3 = acqVar2;
            aciVar = new aci(agbVarAg, adbVar3, agbVarAg2, aggVar, acpVar2, acqVar3, agbVarAg3);
            acqVar2 = acqVar3;
            buxVar2.x(aciVar);
        } else {
            aciVar = objG8;
            z4 = z3;
        }
        aci aciVar2 = (aci) aciVar;
        boolean zD = buxVar2.D(z4);
        if ((((i & i4) ^ 24576) > 16384 && buxVar2.C(afdrVar2)) || (i & 24576) == 16384) {
            z6 = z;
        }
        boolean z12 = zD | z6;
        Object objG9 = buxVar2.g();
        if (z12 || objG9 == buw.a) {
            objG9 = new nis(z4, afdrVar2, z ? 1 : 0);
            buxVar2.x(objG9);
        }
        return new cjq((afec) objG9).a(new ace(aggVar, agbVar2, agbVar3, agbVar, acpVar2, acqVar2, adbVar3, afdrVar2, aciVar2)).a(cfyVar);
    }

    public static /* synthetic */ acp n(aew aewVar, cfm cfmVar, int i) {
        if ((i & 1) != 0) {
            Map map = ahc.a;
            aewVar = new aft(1.0f, 400.0f, new dlq(4294967297L));
        }
        if ((i & 2) != 0) {
            cfmVar = cfl.l;
        }
        int i2 = 17;
        return o(aewVar, D(cfmVar), new aai(new abc(i2), i2));
    }

    public static final acp o(aew aewVar, cfn cfnVar, afec afecVar) {
        return new acp(new acd(null, null, new abw(cfnVar, afecVar, aewVar), null, false, null, 123));
    }

    public static /* synthetic */ acp p(cfr cfrVar, int i) {
        aft aftVar;
        if ((i & 1) != 0) {
            Map map = ahc.a;
            aftVar = new aft(1.0f, 400.0f, new dlq(4294967297L));
        } else {
            aftVar = null;
        }
        if ((i & 2) != 0) {
            cfrVar = cfl.o;
        }
        int i2 = 18;
        return o(aftVar, E(cfrVar), new aai(new abc(i2), i2));
    }

    public static /* synthetic */ acp q(aew aewVar, float f2, long j, int i) {
        if ((i & 1) != 0) {
            aewVar = b;
        }
        if ((i & 2) != 0) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if ((i & 4) != 0) {
            j = roc.aA(0.5f, 0.5f);
        }
        return b(aewVar, f2, j);
    }

    public static /* synthetic */ acq r(aew aewVar, float f2, long j, int i) {
        if ((i & 1) != 0) {
            aewVar = b;
        }
        if ((i & 2) != 0) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        }
        if ((i & 4) != 0) {
            j = roc.aA(0.5f, 0.5f);
        }
        return g(aewVar, f2, j);
    }

    public static /* synthetic */ acq s(aew aewVar, cfm cfmVar, int i) {
        if ((i & 1) != 0) {
            Map map = ahc.a;
            aewVar = new aft(1.0f, 400.0f, new dlq(4294967297L));
        }
        if ((i & 2) != 0) {
            cfmVar = cfl.l;
        }
        return t(aewVar, D(cfmVar), new aai(new abc(20), 16));
    }

    public static final acq t(aew aewVar, cfn cfnVar, afec afecVar) {
        return new acq(new acd(null, null, new abw(cfnVar, afecVar, aewVar), null, false, null, 123));
    }

    public static /* synthetic */ acq u(cfr cfrVar, int i) {
        aft aftVar;
        if ((i & 1) != 0) {
            Map map = ahc.a;
            aftVar = new aft(1.0f, 400.0f, new dlq(4294967297L));
        } else {
            aftVar = null;
        }
        if ((i & 2) != 0) {
            cfrVar = cfl.o;
        }
        return t(aftVar, E(cfrVar), new aai(new acj(0), 19));
    }

    public static /* synthetic */ acp v(afec afecVar) {
        Map map = ahc.a;
        return c(new aft(1.0f, 400.0f, new dlo(4294967297L)), new aai(afecVar, 13));
    }

    public static /* synthetic */ acp w(afec afecVar) {
        Map map = ahc.a;
        return c(new aft(1.0f, 400.0f, new dlo(4294967297L)), new aai(afecVar, 12));
    }

    public static /* synthetic */ acq x(afec afecVar) {
        Map map = ahc.a;
        return h(new aft(1.0f, 400.0f, new dlo(4294967297L)), new aai(afecVar, 14));
    }

    public static /* synthetic */ acq y(afec afecVar) {
        Map map = ahc.a;
        return h(new aft(1.0f, 400.0f, new dlo(4294967297L)), new aai(afecVar, 15));
    }

    public static final acp z(agg aggVar, acp acpVar, adb adbVar, bux buxVar, int i) {
        boolean z = true;
        if ((((i & 14) ^ 6) <= 4 || !buxVar.C(aggVar)) && (i & 6) != 4) {
            z = false;
        }
        Object objG = buxVar.g();
        if (z || objG == buw.a) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(acpVar, bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG;
        if (aggVar.e() == aggVar.g() && aggVar.e() == acc.b) {
            if (aggVar.w()) {
                bwqVar.b(acpVar);
            } else {
                bwqVar.b(acp.a);
            }
        } else if (aggVar.g() != acc.c) {
            bwqVar.b(((acp) bwqVar.a()).a((adbVar != null ? acp.a : acp.a).a(acpVar)));
        }
        return (acp) bwqVar.a();
    }
}
