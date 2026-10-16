package defpackage;

import android.graphics.drawable.BitmapDrawable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class jwt {
    public static final yob a = yob.c("com/google/android/apps/auto/components/apphost/itemwidget/ItemWidgetKt");

    public static final void a(final gmz gmzVar, final cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(476188425);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gmzVar) : buxVarC.E(gmzVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        boolean z = false;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new cil();
                bvvVar.ad(objS);
            }
            List list = gmzVar.b;
            final cil cilVar = (cil) objS;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(gmzVar))) {
                z = true;
            }
            Object objS2 = bvvVar.S();
            if (z || objS2 == obj) {
                objS2 = new dxa(gmzVar, cilVar, (afck) null, 13);
                bvvVar.ad(objS2);
            }
            bvq.g(list, (afeg) objS2, buxVarC);
            ca.at(awd.c(cfyVar, 1.0f), null, bxc.i(1059834611, true, new afeh() { // from class: jws
                @Override // defpackage.afeh
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    float f;
                    afeg afegVar;
                    afeg afegVar2;
                    afec afecVar;
                    cfv cfvVar;
                    gmz gmzVar2;
                    bux buxVar2;
                    afec afecVar2;
                    ato atoVar = (ato) obj2;
                    bux buxVar3 = (bux) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    atoVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != buxVar3.C(atoVar) ? 2 : 4;
                    }
                    if (buxVar3.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        cfy cfyVar2 = cfyVar;
                        int iB = hms.b(atoVar.d(), atoVar.c(), (gns) buxVar3.f(gnt.a));
                        cfy cfyVarB = awd.b(cfyVar2, 1.0f);
                        atc atcVar = iB == 1 ? atd.c : atd.g;
                        cfm cfmVar = cfl.j;
                        ctp ctpVarA = atp.a(atcVar, cfmVar, buxVar3, 0);
                        int iG = a.g(buxVar3.b());
                        ccx ccxVarN = buxVar3.N();
                        cfy cfyVarJ = bzi.j(buxVar3, cfyVarB);
                        afdr afdrVar = cwb.a;
                        buxVar3.M();
                        buxVar3.w();
                        if (buxVar3.G()) {
                            buxVar3.j(afdrVar);
                        } else {
                            buxVar3.y();
                        }
                        cil cilVar2 = cilVar;
                        gmz gmzVar3 = gmzVar;
                        afeg afegVar3 = cwb.e;
                        byq.c(buxVar3, ctpVarA, afegVar3);
                        afeg afegVar4 = cwb.d;
                        byq.c(buxVar3, ccxVarN, afegVar4);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar5 = cwb.f;
                        byq.c(buxVar3, numValueOf, afegVar5);
                        afec afecVar3 = cwb.g;
                        byq.b(buxVar3, afecVar3);
                        afeg afegVar6 = cwb.c;
                        byq.c(buxVar3, cfyVarJ, afegVar6);
                        int i4 = iB - 1;
                        if (i4 == 0 || i4 == 1) {
                            f = 0.0f;
                            afegVar = afegVar5;
                            afegVar2 = afegVar4;
                            buxVar3.v(1984045945);
                            cfv cfvVar2 = cfy.e;
                            cfy cfyVarB2 = ats.b(cfvVar2, 1.0f, true);
                            ctp ctpVarA2 = atp.a(atd.c, cfmVar, buxVar3, 0);
                            int iG2 = a.g(buxVar3.b());
                            ccx ccxVarN2 = buxVar3.N();
                            cfy cfyVarJ2 = bzi.j(buxVar3, cfyVarB2);
                            buxVar3.M();
                            buxVar3.w();
                            if (buxVar3.G()) {
                                buxVar3.j(afdrVar);
                            } else {
                                buxVar3.y();
                            }
                            byq.c(buxVar3, ctpVarA2, afegVar3);
                            byq.c(buxVar3, ccxVarN2, afegVar2);
                            byq.c(buxVar3, Integer.valueOf(iG2), afegVar);
                            byq.b(buxVar3, afecVar3);
                            byq.c(buxVar3, cfyVarJ2, afegVar6);
                            fza fzaVar = gmzVar3.a;
                            if (fzaVar != null) {
                                buxVar3.v(-1060238988);
                                cfvVar = cfvVar2;
                                afecVar = afecVar3;
                                fyz.a(new fza(fzaVar.a, fzaVar.b, fzaVar.c, afbe.a, fzaVar.e, fzaVar.f), asl.J(cfvVar2, BitmapDescriptorFactory.HUE_RED, gjk.d.k, BitmapDescriptorFactory.HUE_RED, gjk.a.k), Float.NaN, buxVar3, 384, 0);
                                buxVar3.o();
                            } else {
                                afecVar = afecVar3;
                                cfvVar = cfvVar2;
                                buxVar3.v(-1059549517);
                                buxVar3.o();
                            }
                            gmzVar2 = gmzVar3;
                            jwt.b(gmzVar2, iB == 2, asl.I(cfvVar, gjk.d.k, BitmapDescriptorFactory.HUE_RED), cilVar2, buxVar3, 3072);
                            buxVar2 = buxVar3;
                            buxVar2.n();
                            buxVar2.o();
                        } else {
                            if (i4 == 2) {
                                buxVar3.v(1986731692);
                                buxVar3.o();
                                ((ynz) jwt.a.g().o(ypi.a, "CarApp.H.ItemWidget").ai(2813)).u("Unsupported display state: NARROW_SHORT");
                                Objects.toString(hmu.b(iB));
                                throw new IllegalArgumentException("Unsupported display state in ItemWidget: ".concat(hmu.b(iB)));
                            }
                            if (i4 == 3) {
                                f = 0.0f;
                                afegVar2 = afegVar4;
                                afegVar = afegVar5;
                                buxVar3.v(1985203857);
                                fza fzaVar2 = gmzVar3.a;
                                if (fzaVar2 != null) {
                                    buxVar3.v(1985244994);
                                    fyz.a(fzaVar2, asl.J(cfy.e, BitmapDescriptorFactory.HUE_RED, fzaVar2.d.isEmpty() ? gjk.d.k : gjk.b.k, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), Float.NaN, buxVar3, 384, 0);
                                    buxVar3.o();
                                } else {
                                    buxVar3.v(1985782565);
                                    buxVar3.o();
                                }
                                afecVar2 = afecVar3;
                                gmzVar2 = gmzVar3;
                                jwt.c(gmzVar2, false, 96.0f, 64.0f, 1, ats.b(cfy.e, 1.0f, true), cilVar2, buxVar3, 1600944);
                                buxVar2 = buxVar3;
                                buxVar2.o();
                            } else {
                                if (i4 != 4) {
                                    buxVar3.v(1986981242);
                                    buxVar3.o();
                                    ((ynz) jwt.a.g().o(ypi.a, "CarApp.H.ItemWidget").ai(2814)).u("Unsupported display state: TINY");
                                    Objects.toString(hmu.b(iB));
                                    throw new IllegalArgumentException("Unsupported display state: ".concat(hmu.b(iB)));
                                }
                                buxVar3.v(1986172948);
                                cfy cfyVarB3 = ats.b(cfy.e, 1.0f, true);
                                float f2 = gjk.d.k;
                                cfy cfyVarD = awd.d(asl.J(asl.I(cfyVarB3, f2, BitmapDescriptorFactory.HUE_RED), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, gjk.c.k), 84.0f);
                                afecVar2 = afecVar3;
                                f = 0.0f;
                                afegVar = afegVar5;
                                gmzVar2 = gmzVar3;
                                afegVar2 = afegVar4;
                                jwt.c(gmzVar2, true, 56.0f, 24.0f, 2, cfyVarD, cilVar2, buxVar3, 1600944);
                                buxVar2 = buxVar3;
                                buxVar2.o();
                            }
                            afecVar = afecVar2;
                        }
                        cfy cfyVarR = awd.r(cfy.e);
                        float f3 = gjk.d.k;
                        cfy cfyVarJ3 = asl.J(cfyVarR, f3, f, f3, f3);
                        ctp ctpVarA3 = avv.a(atd.e, cfl.m, buxVar2, 6);
                        int iG3 = a.g(buxVar2.b());
                        ccx ccxVarN3 = buxVar2.N();
                        cfy cfyVarJ4 = bzi.j(buxVar2, cfyVarJ3);
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        byq.c(buxVar2, ctpVarA3, afegVar3);
                        byq.c(buxVar2, ccxVarN3, afegVar2);
                        byq.c(buxVar2, Integer.valueOf(iG3), afegVar);
                        byq.b(buxVar2, afecVar);
                        byq.c(buxVar2, cfyVarJ4, afegVar6);
                        hju hjuVar = gmzVar2.c;
                        if (hjuVar == null) {
                            buxVar2.v(-1257946529);
                        } else {
                            buxVar2.v(-1841694238);
                            gvq.g(hjuVar, null, buxVar2, 0, 1);
                        }
                        buxVar2.o();
                        buxVar2.n();
                        buxVar2.n();
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(gmzVar, cfyVar, i, 15);
        }
    }

    public static final void b(gmz gmzVar, boolean z, cfy cfyVar, cil cilVar, bux buxVar, int i) {
        bux buxVar2;
        boolean z2;
        cjv cjvVar;
        fzp fzpVar;
        int i2 = i & 6;
        bux buxVarC = buxVar.c(-375445875);
        int i3 = i2 == 0 ? (true != ((i & 8) == 0 ? buxVarC.C(gmzVar) : buxVarC.E(gmzVar)) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.C(cilVar) ? 1024 : 2048;
        }
        boolean z3 = false;
        if (buxVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
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
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVarC.v(1753862186);
            List list = gmzVar.b;
            int i4 = 0;
            for (gna gnaVar : woy.cd(list, 3)) {
                int i5 = i4 + 1;
                fzv fzvVar = gnaVar.a;
                boolean z4 = ((fzvVar == null || (fzpVar = fzvVar.c.b) == null) ? null : fzpVar.a) instanceof BitmapDrawable;
                float f = z4 ? 56.0f : 32.0f;
                dlj dljVar = z4 ? null : new dlj(56.0f);
                float f2 = z ? 102.0f : 80.0f;
                hbt hbtVar = new hbt(gnaVar.d, fzvVar, true, false, gnaVar.b, gnaVar.c, 5, false, null, 392);
                cfy cfyVarJ2 = cfy.e;
                cfy cfyVarD = awd.d(cfyVarJ2, f2);
                if (i4 == 0) {
                    cfyVarJ2 = bxc.j(cfyVarJ2, cilVar);
                    i4 = 0;
                }
                cfy cfyVarA = cfyVarD.a(cfyVarJ2);
                if (z4) {
                    buxVarC.v(-1463937510);
                    z2 = false;
                    bvvVar.Y(false);
                    cjvVar = null;
                } else {
                    z2 = false;
                    buxVarC.v(1753892689);
                    long jQ = gux.c(buxVarC).Q();
                    bvvVar.Y(false);
                    cjvVar = new cjv(jQ);
                }
                int i6 = i4;
                float f3 = f;
                List list2 = list;
                bux buxVar3 = buxVarC;
                bvv bvvVar2 = bvvVar;
                hbv.c(hbtVar, f3, cfyVarA, 2, gjk.b.k, dljVar, cjvVar, null, gjk.d.k, BitmapDescriptorFactory.HUE_RED, null, false, buxVar3, hbt.a | 805309440, 0, 3200);
                if (!z || i6 >= list2.size() - 1) {
                    z3 = false;
                    buxVar3.v(-1463585473);
                    bvvVar2.Y(false);
                } else {
                    buxVar3.v(-1463643133);
                    vja.k(null, 0L, buxVar3, 48);
                    z3 = false;
                    bvvVar2.Y(false);
                }
                bvvVar = bvvVar2;
                buxVarC = buxVar3;
                i4 = i5;
                list = list2;
            }
            buxVar2 = buxVarC;
            bvv bvvVar3 = bvvVar;
            bvvVar3.Y(z3);
            bvvVar3.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hkv(gmzVar, z, cfyVar, cilVar, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.gmz r36, final boolean r37, final float r38, final float r39, final int r40, final defpackage.cfy r41, final defpackage.cil r42, defpackage.bux r43, final int r44) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jwt.c(gmz, boolean, float, float, int, cfy, cil, bux, int):void");
    }
}
