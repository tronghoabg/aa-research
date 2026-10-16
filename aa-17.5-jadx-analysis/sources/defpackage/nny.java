package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class nny {
    public static final /* synthetic */ int a = 0;
    private static final aes b = new aen(0.18f, 0.89f, 0.32f, 1.28f);
    private static final aes c = new aen(0.48f, BitmapDescriptorFactory.HUE_RED, 0.48f, 0.99f);

    public static final void a(final nnl nnlVar, final bwq bwqVar, cil cilVar, cil cilVar2, final cil cilVar3, int i, bux buxVar, int i2) {
        int i3;
        cil cilVar4;
        cil cilVar5;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-1203355959);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? buxVarC.C(nnlVar) : buxVarC.E(nnlVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.C(bwqVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            cilVar4 = cilVar;
            i3 |= true != buxVarC.C(cilVar4) ? 128 : 256;
        } else {
            cilVar4 = cilVar;
        }
        if ((i2 & 3072) == 0) {
            cilVar5 = cilVar2;
            i3 |= true != buxVarC.C(cilVar5) ? 1024 : 2048;
        } else {
            cilVar5 = cilVar2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.C(cilVar3) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != buxVarC.A(i) ? 65536 : 131072;
        }
        boolean z = false;
        if (buxVarC.I((74899 & i3) != 74898, i3 & 1)) {
            boolean z2 = nnlVar.o != null && (i >= 3 || (i == 2 && nnlVar.q == null));
            boolean z3 = nnlVar.p != null && i > 0;
            if (nnlVar.q != null && i >= 2) {
                z = true;
            }
            final boolean z4 = z2;
            final cil cilVar6 = cilVar5;
            final boolean z5 = z3;
            final cil cilVar7 = cilVar4;
            final boolean z6 = z;
            czz.am(dbc.i.b(dlr.a), bxc.i(-1514745335, true, new afeg() { // from class: nnx
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i5 = iIntValue & 3;
                    int i6 = iIntValue & 1;
                    int i7 = nny.a;
                    if (buxVar2.I(i5 != 2, i6)) {
                        cfv cfvVar = cfy.e;
                        cfy cfyVarI = asl.I(cfvVar, 4.0f, BitmapDescriptorFactory.HUE_RED);
                        ctp ctpVarA = atp.a(atd.g(4.0f), cfl.j, buxVar2, 6);
                        int iG = a.g(buxVar2.b());
                        ccx ccxVarN = buxVar2.N();
                        cfy cfyVarJ = bzi.j(buxVar2, cfyVarI);
                        afdr afdrVar = cwb.a;
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        cil cilVar8 = cilVar3;
                        cil cilVar9 = cilVar6;
                        bwq bwqVar2 = bwqVar;
                        cil cilVar10 = cilVar7;
                        nnl nnlVar2 = nnlVar;
                        boolean z7 = z6;
                        boolean z8 = z5;
                        boolean z9 = z4;
                        byq.c(buxVar2, ctpVarA, cwb.e);
                        byq.c(buxVar2, ccxVarN, cwb.d);
                        byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
                        byq.b(buxVar2, cwb.g);
                        byq.c(buxVar2, cfyVarJ, cwb.c);
                        ats atsVar = ats.a;
                        acp acpVarB = acl.B(ca.F(300, 0, null, 6), 2);
                        acq acqVarC = acl.C(ca.F(300, 0, null, 6), 2);
                        cfy cfyVarV = awd.v(cfvVar, true, 1);
                        ca.P(atsVar, z9, ats.b(cfvVar, 1.0f, false), acpVarB, acqVarC, null, bxc.i(614039675, true, new fum(nnlVar2, cfyVarV, cilVar10, bwqVar2, 8), buxVar2), buxVar2, 1600518, 16);
                        ca.P(atsVar, z8, ats.b(cfvVar, 1.0f, false), acpVarB, acqVarC, null, bxc.i(-1027663452, true, new fum(nnlVar2, cfyVarV, cilVar9, bwqVar2, 9), buxVar2), buxVar2, 1600518, 16);
                        ca.P(atsVar, z7, ats.b(cfvVar, 1.0f, false), acpVarB, acqVarC, null, bxc.i(-267529213, true, new fum(nnlVar2, cfyVarV, cilVar8, bwqVar2, 10), buxVar2), buxVar2, 1600518, 16);
                        buxVar2.n();
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kul(nnlVar, bwqVar, cilVar, cilVar2, cilVar3, i, i2, 5);
        }
    }

    public static final void b(abg abgVar, nnl nnlVar, final bwq bwqVar, cil cilVar, final cil cilVar2, final boolean z, bux buxVar, int i) {
        int i2;
        final cil cilVar3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1032829766);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(abgVar) : buxVarC.E(abgVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(nnlVar) : buxVarC.E(nnlVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(bwqVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(cilVar2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            int i4 = i2;
            cfy cfyVarA = abgVar.a(cfy.e, acl.B(ca.F(450, 0, null, 6), 2).a(acl.q(ca.F(450, 0, b, 2), 0.5f, 0L, 4)), acl.C(ca.F(300, 100, null, 4), 2).a(acl.r(new agl(300, 100, c), 0.5f, 0L, 4)));
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new nle(9);
                bvvVar.ad(objS);
            }
            afec afecVar = (afec) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new nle(10);
                bvvVar.ad(objS2);
            }
            cilVar3 = cilVar;
            ca.V(nnlVar, null, afecVar, null, null, (afec) objS2, bxc.i(64455838, true, new afei() { // from class: nnv
                @Override // defpackage.afei
                public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                    nnk nnkVar;
                    GhIcon ghIcon;
                    nnl nnlVar2 = (nnl) obj3;
                    bux buxVar2 = (bux) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    int i5 = nny.a;
                    ((abg) obj2).getClass();
                    nnlVar2.getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= true != ((iIntValue & 64) == 0 ? buxVar2.C(nnlVar2) : buxVar2.E(nnlVar2)) ? 16 : 32;
                    }
                    if (buxVar2.I((iIntValue & 145) != 144, iIntValue & 1)) {
                        boolean z2 = z;
                        cil cilVar4 = cilVar2;
                        bwq bwqVar2 = bwqVar;
                        cil cilVar5 = cilVar3;
                        if (nnlVar2.c == null && (ghIcon = (nnkVar = nnlVar2.b).a) != null && ghIcon.b == 6 && nnlVar2.d == null) {
                            buxVar2.v(353729201);
                            nmj nmjVar = new nmj(ghIcon, nnlVar2.r, null, null, false, nnkVar.b);
                            cfy cfyVarH = asl.H(cfy.e, 6.0f);
                            boolean zC = buxVar2.C(cilVar5);
                            Object objG = buxVar2.g();
                            if (zC || objG == buw.a) {
                                objG = new njm(cilVar5, 12);
                                buxVar2.x(objG);
                            }
                            cfy cfyVarK = bxc.k(cfyVarH, (afec) objG);
                            boolean zC2 = buxVar2.C(bwqVar2);
                            Object objG2 = buxVar2.g();
                            if (zC2 || objG2 == buw.a) {
                                objG2 = new njm(bwqVar2, 13);
                                buxVar2.x(objG2);
                            }
                            kgq.m(das.d(bxc.j(bxc.l(cfyVarK, (afec) objG2), cilVar4), "appAction"), nmjVar, z2, false, buxVar2, 64, 8);
                            buxVar2.o();
                        } else {
                            buxVar2.v(354531791);
                            long jI = cjn.i(0);
                            cfy cfyVarH2 = cfy.e;
                            if (z2) {
                                cfyVarH2 = asl.H(cfyVarH2, 6.0f);
                            }
                            kfl.m(bxc.i(-1911659711, true, new njg(nnlVar2, 6), buxVar2), cfyVarH2, BitmapDescriptorFactory.HUE_RED, 0L, jI, null, 0L, bxc.i(-1554354406, true, new gvp(nnlVar2, cilVar5, bwqVar2, cilVar4, 4), buxVar2), buxVar2, 12607494, 108);
                            buxVar2.o();
                        }
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, ((i4 >> 3) & 14) | 1769864, 26);
            bvvVar.Y(true);
        } else {
            cilVar3 = cilVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(abgVar, nnlVar, bwqVar, cilVar3, cilVar2, z, i, 8);
        }
    }

    public static final void c(cfy cfyVar, nnk nnkVar, cil cilVar, bwq bwqVar, nmr nmrVar, String str, bux buxVar, int i) {
        int i2;
        String str2;
        bxf bxfVarJ;
        bpj bpjVar;
        long j;
        cjv cjvVar;
        bvv bvvVar;
        Object obj;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1981796479);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(nnkVar) : buxVarC.E(nnkVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cilVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(bwqVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.A(nmrVar.ordinal()) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(str) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            GhIcon ghIcon = nnkVar.a;
            if (ghIcon == null) {
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bpjVar = new bpj(cfyVar, nnkVar, cilVar, bwqVar, nmrVar, str, i, 8);
                    bxfVarJ.c = bpjVar;
                }
                return;
            }
            Context context = (Context) buxVarC.f(daa.b);
            if (ghIcon.t()) {
                buxVarC.v(-1078120550);
                ColorStateList colorStateListD = ghIcon.d(context);
                if (colorStateListD != null) {
                    buxVarC.v(-1835891496);
                    ((bvv) buxVarC).Y(false);
                    j = cjn.i(colorStateListD.getDefaultColor());
                } else {
                    buxVarC.v(-1835889686);
                    j = ksp.j(krr.w, buxVarC);
                    ((bvv) buxVarC).Y(false);
                }
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-1077965488);
                int i4 = nnkVar.c - 1;
                if (i4 == 1) {
                    buxVarC.v(-1835885174);
                    j = ksp.j(krr.I, buxVarC);
                    ((bvv) buxVarC).Y(false);
                } else if (i4 == 2) {
                    buxVarC.v(-1835882230);
                    j = ksp.j(krr.E, buxVarC);
                    ((bvv) buxVarC).Y(false);
                } else if (i4 != 3) {
                    buxVarC.v(-1835877494);
                    j = ksp.j(krr.w, buxVarC);
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(-1835879222);
                    j = ksp.j(krr.s, buxVarC);
                    ((bvv) buxVarC).Y(false);
                }
                ((bvv) buxVarC).Y(false);
            }
            int i5 = nnkVar.c - 1;
            boolean zA = buxVarC.A(i5);
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            if (zA || objS == buw.a) {
                objS = i5 != 3 ? null : krr.v;
                bvvVar2.ad(objS);
            }
            krr krrVar = (krr) objS;
            if (krrVar == null) {
                buxVarC.v(-1077334825);
                bvvVar2.Y(false);
                cjvVar = null;
            } else {
                buxVarC.v(-1835868054);
                long j2 = ksp.j(krrVar, buxVarC);
                bvvVar2.Y(false);
                cjvVar = new cjv(j2);
            }
            long jI = cjvVar != null ? cjvVar.a : cjn.i(0);
            aezr aezrVar = ktf.a;
            boolean z = true;
            long j3 = j;
            str2 = str;
            ktf ktfVarG = kgq.g(jI, j3, 0L, 0L, buxVarC, 252);
            cfy cfyVarJ = bxc.j(cfyVar, cilVar);
            boolean z2 = (i2 & 7168) == 2048;
            boolean z3 = (57344 & i2) == 16384;
            Object objS2 = bvvVar2.S();
            if ((z3 || z2) || objS2 == buw.a) {
                objS2 = new nje(bwqVar, nmrVar, 5);
                bvvVar = bvvVar2;
                bvvVar.ad(objS2);
            } else {
                bvvVar = bvvVar2;
            }
            cfy cfyVarD = das.d(bxc.l(cfyVarJ, (afec) objS2), str2);
            cmw cmwVarF = lgi.f(ghIcon, BitmapDescriptorFactory.HUE_RED, buxVarC, 3);
            if ((i2 & 112) != 32) {
                if ((i2 & 64) != 0) {
                    obj = nnkVar;
                    if (!buxVarC.E(obj)) {
                    }
                } else {
                    obj = nnkVar;
                }
                z = false;
            } else {
                obj = nnkVar;
            }
            Object objS3 = bvvVar.S();
            if (z || objS3 == buw.a) {
                objS3 = new njb(obj, 12);
                bvvVar.ad(objS3);
            }
            khc.l(cmwVarF, (afdr) objS3, cfyVarD, null, false, null, ktfVarG, null, null, buxVarC, 8, 0, 3832);
            buxVarC = buxVarC;
        } else {
            str2 = str;
            buxVarC.s();
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bpjVar = new bpj(cfyVar, nnkVar, cilVar, bwqVar, nmrVar, str2, i, 9);
            bxfVarJ.c = bpjVar;
        }
    }

    public static final void d(abg abgVar, nnl nnlVar, cfy cfyVar, cil cilVar, cil cilVar2, boolean z, int i, bux buxVar, int i2) {
        int i3;
        bux buxVar2;
        boolean z2;
        Object ofoVar;
        int i4;
        int i5;
        bvv bvvVar;
        cil cilVar3;
        cil cilVar4;
        cil cilVar5;
        cil cilVar6;
        cfy cfyVarG;
        cil cilVar7;
        nnlVar.getClass();
        int i6 = i2 & 6;
        bux buxVarC = buxVar.c(1437482796);
        if (i6 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? buxVarC.C(abgVar) : buxVarC.E(abgVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != ((i2 & 64) == 0 ? buxVarC.C(nnlVar) : buxVarC.E(nnlVar)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.C(cilVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.C(cilVar2) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != buxVarC.A(i) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i3) != 599186, i3 & 1)) {
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = cik.a;
                bvvVar2.ad(objS);
            }
            cil cilVar8 = new cil();
            cil cilVar9 = new cil();
            cil cilVar10 = new cil();
            cil cilVar11 = new cil();
            Object objS2 = bvvVar2.S();
            if (objS2 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(nmr.a, bxp.c);
                bvvVar2.ad(parcelableSnapshotMutableState);
                objS2 = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS2;
            Object objS3 = bvvVar2.S();
            if (objS3 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(nnlVar, bxp.c);
                bvvVar2.ad(parcelableSnapshotMutableState2);
                objS3 = parcelableSnapshotMutableState2;
            }
            int i7 = i3 & 112;
            bwq bwqVar2 = (bwq) objS3;
            boolean zC = (i7 == 32 || ((i3 & 64) != 0 && buxVarC.E(nnlVar))) | buxVarC.C(cilVar8);
            Object objS4 = bvvVar2.S();
            if (zC || objS4 == obj) {
                i4 = i3;
                i5 = i7;
                bvvVar = bvvVar2;
                cilVar3 = cilVar9;
                cilVar4 = cilVar10;
                cilVar5 = cilVar11;
                ofoVar = new ofo(nnlVar, bwqVar2, bwqVar, cilVar8, (afck) null, 1);
                cilVar6 = cilVar8;
                bvvVar.ad(ofoVar);
            } else {
                i4 = i3;
                ofoVar = objS4;
                cilVar6 = cilVar8;
                bvvVar = bvvVar2;
                i5 = i7;
                cilVar3 = cilVar9;
                cilVar4 = cilVar10;
                cilVar5 = cilVar11;
            }
            int i8 = i4 >> 3;
            bvq.g(nnlVar, (afeg) ofoVar, buxVarC);
            boolean z3 = nnlVar.f;
            boolean zD = buxVarC.D(z3);
            Object objS5 = bvvVar.S();
            if (zD || objS5 == obj) {
                objS5 = z3 ? bcr.d() : bcr.b(20.0f);
                bvvVar.ad(objS5);
            }
            bcm bcmVar = (bcm) objS5;
            cfy cfyVarE = afp.E(asl.I(!z ? awd.v(cfyVar, false, 3) : cfyVar, true != z ? 6.0f : 0.0f, BitmapDescriptorFactory.HUE_RED), ksp.j(krr.q, buxVarC), bcmVar);
            if (z) {
                cfyVarG = cjn.g(cfyVarE, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcmVar, true, 0, 1042431);
                z2 = true;
            } else {
                cfyVarG = cfyVarE;
                z2 = false;
            }
            cfy cfyVarJ = bxc.j(cfyVarG, cilVar2);
            boolean zC2 = buxVarC.C(cilVar6) | buxVarC.C(cilVar3) | buxVarC.C(cilVar4) | buxVarC.C(cilVar5);
            Object objS6 = bvvVar.S();
            if (zC2 || objS6 == obj) {
                cilVar7 = cilVar4;
                objS6 = new nze(bwqVar, cilVar6, cilVar3, cilVar7, cilVar5, 1);
                bvvVar.ad(objS6);
            } else {
                cilVar7 = cilVar4;
            }
            cfy cfyVarL = bxc.l(cfyVarJ, (afec) objS6);
            int i9 = i5;
            boolean z4 = i9 == 32 || ((i4 & 64) != 0 && buxVarC.E(nnlVar));
            Object objS7 = bvvVar.S();
            if (z4 || objS7 == obj) {
                objS7 = new njb(nnlVar, 13);
                bvvVar.ad(objS7);
            }
            cfy cfyVarD = das.d(ca.K(abgVar.a(afp.x(cfyVarL, true, null, null, (afdr) objS7), acl.B(ca.F(150, 0, null, 6), 2), acl.C(ca.F(150, 100, null, 4), 2)), null, null, 3), "widget");
            ctp ctpVarA = atp.a(atd.c, cfl.k, buxVarC, 48);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarD);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ2, cwb.c);
            int i10 = i4;
            buxVar2 = buxVarC;
            b(abgVar, nnlVar, bwqVar, cilVar, cilVar6, z, buxVar2, (i4 & 14) | 448 | i9 | (i10 & 7168) | (i10 & 458752));
            a(nnlVar, bwqVar, cilVar3, cilVar7, cilVar5, i, buxVar2, (i8 & 14) | 56 | (i8 & 458752));
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            z2 = z;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gqe(abgVar, nnlVar, cfyVar, cilVar, cilVar2, z2, i, i2, 4);
        }
    }
}
