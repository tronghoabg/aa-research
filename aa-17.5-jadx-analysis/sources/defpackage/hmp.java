package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hmp {
    public static final void a(fwe fweVar, afec afecVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(-887792438);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fweVar) : buxVarC.E(fweVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            gfj gfjVar = new gfj(R.drawable.gs_close_vd_theme_24);
            int i3 = i2 & 112;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i3 == 32 || objS == buw.a) {
                objS = new gzm(afecVar, 10);
                bvvVar.ad(objS);
            }
            gvq.g(new fxl((gfa) null, (gfk) gfjVar, (afdr) objS, false, fweVar, (ajh) null, false, false, 489), awd.i(cfyVar, 64.0f), buxVarC, 8, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gtu(fweVar, afecVar, cfyVar, i, 14);
        }
    }

    public static final void b(final hmq hmqVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        hmq hmqVar2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1522679942);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(hmqVar) : buxVarC.E(hmqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            final boolean zY = a.Y(((kwp) buxVarC.f(dbc.h)).o(), 2);
            boolean z = hmqVar.e == 1 && hmqVar.a != null;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new cil();
                bvvVar.ad(objS);
            }
            final cil cilVar = (cil) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new cil();
                bvvVar.ad(objS2);
            }
            final cil cilVar2 = (cil) objS2;
            int iH = cjn.h(gux.c(buxVarC).I());
            fwd fwdVar = new fwd(iH, iH);
            int iH2 = cjn.h(gux.c(buxVarC).u());
            fwd fwdVar2 = new fwd(iH2, iH2);
            int iH3 = cjn.h(gux.c(buxVarC).u());
            fwe fweVar = new fwe(fwdVar, fwdVar2, new fwd(iH3, iH3), null, null, null, null, null);
            fwi fwiVarE = hmqVar.a;
            if ((fwiVarE != null ? fwiVarE.a() : null) == null) {
                fxl fxlVar = fwiVarE instanceof fxl ? (fxl) fwiVarE : null;
                if (fxlVar != null) {
                    fwiVarE = fxl.e(fxlVar, null, fweVar, false, false, 495);
                    fweVar = fweVar;
                }
            }
            cfy cfyVarC = awd.c(cfyVar, 1.0f);
            int i4 = i2 & 14;
            afak afakVar = afak.a;
            boolean z2 = i4 == 4 || ((i2 & 8) != 0 && buxVarC.E(hmqVar));
            Object objS3 = bvvVar.S();
            if (z2 || objS3 == obj) {
                objS3 = new hgj(hmqVar, 2);
                bvvVar.ad(objS3);
            }
            cfy cfyVarA = crh.a(cfyVarC, afakVar, (PointerInputEventHandler) objS3);
            final fwi fwiVar = fwiVarE;
            final boolean z3 = z;
            final fwe fweVar2 = fweVar;
            hmqVar2 = hmqVar;
            buxVar2 = buxVarC;
            ca.at(cfyVarA, null, bxc.i(-932897052, true, new afeh() { // from class: hmn
                @Override // defpackage.afeh
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    boolean z4;
                    cil cilVar3;
                    fwe fweVar3;
                    char c;
                    boolean z5;
                    float f;
                    boolean z6;
                    boolean z7;
                    boolean z8;
                    hmq hmqVar3;
                    cil cilVar4;
                    boolean z9;
                    ato atoVar = (ato) obj2;
                    bux buxVar3 = (bux) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    atoVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != buxVar3.C(atoVar) ? 2 : 4;
                    }
                    if (buxVar3.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        cil cilVar5 = cilVar2;
                        cil cilVar6 = cilVar;
                        boolean z10 = zY;
                        boolean z11 = z3;
                        boolean z12 = dlj.a(atoVar.c(), atoVar.d()) > 0;
                        Boolean boolValueOf = Boolean.valueOf(z11);
                        Boolean boolValueOf2 = Boolean.valueOf(z10);
                        Boolean boolValueOf3 = Boolean.valueOf(z12);
                        boolean zD = buxVar3.D(z11) | buxVar3.D(z10);
                        Object objG = buxVar3.g();
                        if (zD || objG == buw.a) {
                            hmo hmoVar = new hmo(z11, cilVar6, z10, cilVar5, null);
                            z4 = z11;
                            cilVar3 = cilVar5;
                            buxVar3.x(hmoVar);
                            objG = hmoVar;
                        } else {
                            z4 = z11;
                            cilVar3 = cilVar5;
                        }
                        hmq hmqVar4 = hmqVar;
                        bvq.e(boolValueOf, boolValueOf2, boolValueOf3, (afeg) objG, buxVar3);
                        if (hmqVar4.e == 3) {
                            buxVar3.v(797652321);
                        } else {
                            fwi fwiVar2 = fwiVar;
                            fwe fweVar4 = fweVar2;
                            if (z12) {
                                buxVar3.v(797720428);
                                cfv cfvVar = cfy.e;
                                cfy cfyVarI = asl.I(awd.c(cfvVar, 1.0f), BitmapDescriptorFactory.HUE_RED, gjk.b.k);
                                ctp ctpVarA = atp.a(atd.c, cfl.k, buxVar3, 48);
                                int iG = a.g(buxVar3.b());
                                ccx ccxVarN = buxVar3.N();
                                cfy cfyVarJ = bzi.j(buxVar3, cfyVarI);
                                afdr afdrVar = cwb.a;
                                buxVar3.M();
                                buxVar3.w();
                                if (buxVar3.G()) {
                                    buxVar3.j(afdrVar);
                                } else {
                                    buxVar3.y();
                                }
                                byq.c(buxVar3, ctpVarA, cwb.e);
                                byq.c(buxVar3, ccxVarN, cwb.d);
                                byq.c(buxVar3, Integer.valueOf(iG), cwb.f);
                                byq.b(buxVar3, cwb.g);
                                byq.c(buxVar3, cfyVarJ, cwb.c);
                                if (z10) {
                                    buxVar3.v(536109158);
                                    hmp.a(fweVar4, hmqVar4.b, bxc.j(cfvVar, cilVar3), buxVar3, 0);
                                    buxVar3.o();
                                } else {
                                    buxVar3.v(536280216);
                                    buxVar3.o();
                                }
                                asl.A(ats.b(cfvVar, 1.0f, true), buxVar3);
                                if (z4) {
                                    buxVar3.v(294396730);
                                    if (fwiVar2 == null) {
                                        buxVar3.v(536364039);
                                        buxVar3.o();
                                    } else {
                                        buxVar3.v(294396730);
                                        gvq.g(fwiVar2, bxc.j(awd.i(cfvVar, 64.0f), cilVar6), buxVar3, 8, 0);
                                        buxVar3.o();
                                    }
                                    buxVar3.o();
                                } else {
                                    buxVar3.v(536481592);
                                    buxVar3.o();
                                }
                                buxVar3.n();
                            } else {
                                buxVar3.v(798346721);
                                cfv cfvVar2 = cfy.e;
                                cfy cfyVarC2 = awd.c(cfvVar2, 1.0f);
                                float f2 = gjk.b.k;
                                cfy cfyVarI2 = asl.I(cfyVarC2, f2, BitmapDescriptorFactory.HUE_RED);
                                cfr cfrVar = cfl.n;
                                ctp ctpVarA2 = avv.a(atd.a, cfrVar, buxVar3, 48);
                                int iG2 = a.g(buxVar3.b());
                                ccx ccxVarN2 = buxVar3.N();
                                cfy cfyVarJ2 = bzi.j(buxVar3, cfyVarI2);
                                afdr afdrVar2 = cwb.a;
                                buxVar3.M();
                                buxVar3.w();
                                if (buxVar3.G()) {
                                    buxVar3.j(afdrVar2);
                                } else {
                                    buxVar3.y();
                                }
                                cil cilVar7 = cilVar3;
                                afeg afegVar = cwb.e;
                                byq.c(buxVar3, ctpVarA2, afegVar);
                                afeg afegVar2 = cwb.d;
                                byq.c(buxVar3, ccxVarN2, afegVar2);
                                Integer numValueOf = Integer.valueOf(iG2);
                                afeg afegVar3 = cwb.f;
                                byq.c(buxVar3, numValueOf, afegVar3);
                                afec afecVar = cwb.g;
                                byq.b(buxVar3, afecVar);
                                afeg afegVar4 = cwb.c;
                                byq.c(buxVar3, cfyVarJ2, afegVar4);
                                avy avyVar = avy.a;
                                if (z4) {
                                    buxVar3.v(1687716876);
                                    if (fwiVar2 == null) {
                                        buxVar3.v(779615605);
                                        buxVar3.o();
                                        fweVar3 = fweVar4;
                                    } else {
                                        buxVar3.v(1687716876);
                                        fweVar3 = fweVar4;
                                        gvq.g(fwiVar2, bxc.j(awd.i(cfvVar2, 64.0f), cilVar6), buxVar3, 8, 0);
                                        buxVar3.o();
                                    }
                                    buxVar3.o();
                                    z7 = z10;
                                    z5 = true;
                                    f = 1.0f;
                                    z6 = true;
                                    c = 0;
                                } else {
                                    fweVar3 = fweVar4;
                                    if (z10) {
                                        buxVar3.v(779764654);
                                        c = 0;
                                        asl.A(awd.m(cfvVar2, 64.0f), buxVar3);
                                        buxVar3.o();
                                        z5 = false;
                                        f = 1.0f;
                                        z6 = true;
                                        z7 = true;
                                    } else {
                                        c = 0;
                                        buxVar3.v(779941478);
                                        buxVar3.o();
                                        z5 = false;
                                        f = 1.0f;
                                        z6 = true;
                                        z7 = false;
                                    }
                                }
                                cfy cfyVarB = avyVar.b(cfvVar2, f, z6);
                                ctp ctpVarA3 = avv.a(atd.e, cfrVar, buxVar3, 54);
                                int iG3 = a.g(buxVar3.b());
                                ccx ccxVarN3 = buxVar3.N();
                                cfy cfyVarJ3 = bzi.j(buxVar3, cfyVarB);
                                buxVar3.M();
                                buxVar3.w();
                                if (buxVar3.G()) {
                                    buxVar3.j(afdrVar2);
                                } else {
                                    buxVar3.y();
                                }
                                byq.c(buxVar3, ctpVarA3, afegVar);
                                byq.c(buxVar3, ccxVarN3, afegVar2);
                                byq.c(buxVar3, Integer.valueOf(iG3), afegVar3);
                                byq.b(buxVar3, afecVar);
                                byq.c(buxVar3, cfyVarJ3, afegVar4);
                                buxVar3.v(976462270);
                                gcq gcqVar = hmqVar4.d;
                                if (gcqVar != null) {
                                    buxVar3.v(976500338);
                                    fzp fzpVar = hmqVar4.c;
                                    if (fzpVar != null) {
                                        buxVar3.v(976537414);
                                        z9 = false;
                                        gvq.g(fzpVar, awd.i(cfvVar2, 24.0f), buxVar3, 56, 0);
                                        asl.A(awd.m(cfvVar2, f2), buxVar3);
                                        buxVar3.o();
                                    } else {
                                        z9 = false;
                                        buxVar3.v(976695018);
                                        buxVar3.o();
                                    }
                                    cilVar4 = cilVar7;
                                    z8 = z5;
                                    hmqVar3 = hmqVar4;
                                    fzc.g(gcqVar, null, 1, 0, 0L, null, 0L, null, 2, 0, null, null, null, false, false, buxVar3, 100663688, 0, 65274);
                                    buxVar3 = buxVar3;
                                    buxVar3.o();
                                } else {
                                    z8 = z5;
                                    hmqVar3 = hmqVar4;
                                    cilVar4 = cilVar7;
                                    buxVar3.v(976800170);
                                    buxVar3.o();
                                }
                                buxVar3.o();
                                buxVar3.n();
                                if (z7) {
                                    buxVar3.v(780599732);
                                    hmp.a(fweVar3, hmqVar3.b, bxc.j(cfvVar2, cilVar4), buxVar3, 0);
                                    buxVar3.o();
                                } else if (z8) {
                                    buxVar3.v(780798287);
                                    asl.A(awd.m(cfvVar2, 64.0f), buxVar3);
                                    buxVar3.o();
                                } else {
                                    buxVar3.v(780974150);
                                    buxVar3.o();
                                }
                                buxVar3.n();
                                buxVar3.o();
                            }
                        }
                        buxVar3.o();
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVar2, 3072, 6);
        } else {
            hmqVar2 = hmqVar;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) hmqVar2, cfyVar, i, 15);
        }
    }

    public static /* synthetic */ List c(List list, geu geuVar) {
        fyg fygVar = fwh.c;
        fwx fwxVar = fwx.b;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            geu geuVar2 = geuVar;
            arrayList.add(fvr.h((fvu) it.next(), geuVar2, fwxVar, false, fygVar, null, null, false, 0, 244));
            geuVar = geuVar2;
        }
        return arrayList;
    }
}
