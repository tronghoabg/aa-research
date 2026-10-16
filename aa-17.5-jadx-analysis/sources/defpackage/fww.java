package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class fww {
    public static final void A(final afdr afdrVar, cfy cfyVar, final afeh afehVar, final afeh afehVar2, final afeh afehVar3, float f, float f2, long j, final afeh afehVar4, bux buxVar, final int i) {
        int i2;
        Object obj;
        Object obj2;
        bux buxVar2;
        final cfy cfyVar2;
        final float f3;
        final float f4;
        final long jI;
        boolean z;
        bmw bmwVarD;
        afdrVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-612207662);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afdrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            obj = afehVar;
            i4 |= true != buxVarC.E(obj) ? 128 : 256;
        } else {
            obj = afehVar;
        }
        if ((i & 3072) == 0) {
            i4 |= true != buxVarC.E(afehVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != buxVarC.E(afehVar3) ? 8192 : 16384;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            obj2 = afehVar4;
            i5 |= true != buxVarC.E(obj2) ? 33554432 : 67108864;
        } else {
            obj2 = afehVar4;
        }
        if (buxVarC.I((38347923 & i5) != 38347922, i5 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar, 1.0f);
            int i6 = i5 & 14;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (i6 == 4 || objS == buw.a) {
                objS = new kur(afdrVar, 12);
                bvvVar.ad(objS);
            }
            jI = cjn.i(1291845632);
            cfy cfyVarA = afp.x(cfyVarC, true, null, null, (afdr) objS).a(new aix(jI, ckq.a));
            ctp ctpVarB = atk.b(cfl.e, false);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarA);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            buxVarC.v(1840896132);
            if (ldz.a.a().b()) {
                buxVarC.v(-300645147);
                float f5 = ksc.d.g;
                bmwVarD = new bmw(f5, f5, f5, f5, ksc.a.g);
                z = false;
                bvvVar.Y(false);
            } else {
                z = false;
                buxVarC.v(-300282850);
                bvvVar.Y(false);
                bmwVarD = vs.d(63);
            }
            bvvVar.Y(z);
            buxVar2 = buxVarC;
            vy.a(awd.m(cfvVar, 625.0f), null, null, bmwVarD, null, bxc.i(-2074213174, true, new fum(obj, afehVar2, afehVar3, obj2, 7), buxVarC), buxVar2, 196608, 22);
            bvvVar.Y(true);
            f4 = 16.0f;
            cfyVar2 = cfvVar;
            f3 = 625.0f;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
            f3 = f;
            f4 = f2;
            jI = j;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: kux
                @Override // defpackage.afeg
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    afdr afdrVar3 = afdrVar;
                    cfy cfyVar3 = cfyVar2;
                    afeh afehVar5 = afehVar;
                    afeh afehVar6 = afehVar2;
                    afeh afehVar7 = afehVar3;
                    int i7 = i;
                    int i8 = i7 | 1;
                    int i9 = 306783378 & i8;
                    int i10 = i9 + i9;
                    int i11 = 613566756 & i8;
                    int i12 = i10 & i11;
                    fww.A(afdrVar3, cfyVar3, afehVar5, afehVar6, afehVar7, f3, f4, jI, afehVar4, (bux) obj3, i12 | i9 | (i11 >> 1) | (i8 & (-920350135)));
                    return afak.a;
                }
            };
        }
    }

    public static final void B(bux buxVar, int i) {
        bvv bvvVar;
        afdr afdrVar;
        bvv bvvVar2;
        bvv bvvVar3;
        afdr afdrVar2;
        bvv bvvVar4;
        bvv bvvVar5;
        afdr afdrVar3;
        bvv bvvVar6;
        bvv bvvVar7;
        bvv bvvVar8;
        bvv bvvVar9;
        bux buxVarC = buxVar.c(-1902271234);
        if (buxVarC.I(i != 0, i & 1)) {
            Context context = (Context) buxVarC.f(daa.b);
            alh alhVarAX = ca.aX(buxVarC);
            cfv cfvVar = cfy.e;
            cfy cfyVarR = awd.r(asl.H(w(ca.aY(cfvVar, alhVarAX), alhVarAX), 8.0f));
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
            bvv bvvVar10 = (bvv) buxVarC;
            int iG = a.g(bvvVar10.u);
            ccx ccxVarAh = bvvVar10.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
            afdr afdrVar4 = cwb.a;
            buxVarC.w();
            if (bvvVar10.t) {
                buxVarC.j(afdrVar4);
            } else {
                buxVarC.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            brp.b("Icon", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVarC).h, buxVarC, 6, 0, 131070);
            cmw cmwVarB = dao.b(R.drawable.ic_search_black, buxVarC, 0);
            boolean zE = buxVarC.E(context);
            Object objS = bvvVar10.S();
            if (zE || objS == buw.a) {
                objS = new kuq(context, 14);
                bvvVar = bvvVar10;
                bvvVar.ad(objS);
            } else {
                bvvVar = bvvVar10;
            }
            bvv bvvVar11 = bvvVar;
            khc.l(cmwVarB, (afdr) objS, null, null, false, null, null, null, null, buxVarC, 8, 0, 4092);
            brp.b("Outlined", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVarC, 6, 0, 262142);
            asw aswVar = atd.a;
            cfr cfrVar = cfl.m;
            ctp ctpVarA2 = avv.a(aswVar, cfrVar, buxVarC, 0);
            int iG2 = a.g(bvvVar11.u);
            ccx ccxVarAh2 = bvvVar11.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfvVar);
            buxVarC.w();
            if (bvvVar11.t) {
                afdrVar = afdrVar4;
                buxVarC.j(afdrVar);
            } else {
                afdrVar = afdrVar4;
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            cmw cmwVarB2 = dao.b(R.drawable.ic_search_black, buxVarC, 0);
            boolean zE2 = buxVarC.E(context);
            Object objS2 = bvvVar11.S();
            if (zE2 || objS2 == buw.a) {
                objS2 = new kuq(context, 15);
                bvvVar11.ad(objS2);
            }
            afdr afdrVar5 = afdrVar;
            khc.o(cmwVarB2, (afdr) objS2, null, null, false, null, null, null, null, null, buxVarC, 8, 0, 4092);
            asl.A(awd.i(cfvVar, 8.0f), buxVarC);
            cmw cmwVarB3 = dao.b(R.drawable.ic_search_black, buxVarC, 0);
            boolean zE3 = buxVarC.E(context);
            Object objS3 = bvvVar11.S();
            if (zE3 || objS3 == buw.a) {
                objS3 = new kuq(context, 16);
                bvvVar2 = bvvVar11;
                bvvVar2.ad(objS3);
            } else {
                bvvVar2 = bvvVar11;
            }
            bvv bvvVar12 = bvvVar2;
            khc.n(cmwVarB3, "Label", (afdr) objS3, null, null, false, null, null, null, null, null, buxVarC, 56, 0, 8184);
            asl.A(awd.i(cfvVar, 8.0f), buxVarC);
            boolean zE4 = buxVarC.E(context);
            Object objS4 = bvvVar12.S();
            if (zE4 || objS4 == buw.a) {
                objS4 = new kuq(context, 17);
                bvvVar3 = bvvVar12;
                bvvVar3.ad(objS4);
            } else {
                bvvVar3 = bvvVar12;
            }
            bvv bvvVar13 = bvvVar3;
            khc.n(null, "Label", (afdr) objS4, null, null, false, null, null, null, null, null, buxVarC, 54, 0, 8184);
            bvvVar13.Y(true);
            brp.b("Tonal", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVarC, 6, 0, 262142);
            ctp ctpVarA3 = avv.a(aswVar, cfrVar, buxVarC, 0);
            int iG3 = a.g(bvvVar13.u);
            ccx ccxVarAh3 = bvvVar13.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfvVar);
            buxVarC.w();
            if (bvvVar13.t) {
                afdrVar2 = afdrVar5;
                buxVarC.j(afdrVar2);
            } else {
                afdrVar2 = afdrVar5;
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA3, afegVar);
            byq.c(buxVarC, ccxVarAh3, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG3), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ3, afegVar4);
            cmw cmwVarB4 = dao.b(R.drawable.ic_search_black, buxVarC, 0);
            boolean zE5 = buxVarC.E(context);
            Object objS5 = bvvVar13.S();
            if (zE5 || objS5 == buw.a) {
                objS5 = new kuq(context, 18);
                bvvVar13.ad(objS5);
            }
            afdr afdrVar6 = afdrVar2;
            khc.r(cmwVarB4, (afdr) objS5, null, null, false, false, null, null, null, null, null, buxVarC, 8, 0, 4092);
            asl.A(awd.i(cfvVar, 8.0f), buxVarC);
            cmw cmwVarB5 = dao.b(R.drawable.ic_search_black, buxVarC, 0);
            boolean zE6 = buxVarC.E(context);
            Object objS6 = bvvVar13.S();
            if (zE6 || objS6 == buw.a) {
                objS6 = new kuq(context, 19);
                bvvVar4 = bvvVar13;
                bvvVar4.ad(objS6);
            } else {
                bvvVar4 = bvvVar13;
            }
            bvv bvvVar14 = bvvVar4;
            khc.q(cmwVarB5, "Label", (afdr) objS6, null, null, false, false, null, null, null, null, null, buxVarC, 56, 0, 8184);
            asl.A(awd.i(cfvVar, 8.0f), buxVarC);
            boolean zE7 = buxVarC.E(context);
            Object objS7 = bvvVar14.S();
            if (zE7 || objS7 == buw.a) {
                objS7 = new kuq(context, 20);
                bvvVar5 = bvvVar14;
                bvvVar5.ad(objS7);
            } else {
                bvvVar5 = bvvVar14;
            }
            bvv bvvVar15 = bvvVar5;
            khc.q(null, "Label", (afdr) objS7, null, null, false, false, null, null, null, null, null, buxVarC, 54, 0, 8184);
            bvvVar15.Y(true);
            brp.b("Filled", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVarC, 6, 0, 262142);
            ctp ctpVarA4 = avv.a(aswVar, cfrVar, buxVarC, 0);
            int iG4 = a.g(bvvVar15.u);
            ccx ccxVarAh4 = bvvVar15.ah();
            cfy cfyVarJ4 = bzi.j(buxVarC, cfvVar);
            buxVarC.w();
            if (bvvVar15.t) {
                afdrVar3 = afdrVar6;
                buxVarC.j(afdrVar3);
            } else {
                afdrVar3 = afdrVar6;
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA4, afegVar);
            byq.c(buxVarC, ccxVarAh4, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG4), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ4, afegVar4);
            cmw cmwVarB6 = dao.b(R.drawable.ic_search_black, buxVarC, 0);
            boolean zE8 = buxVarC.E(context);
            Object objS8 = bvvVar15.S();
            if (zE8 || objS8 == buw.a) {
                objS8 = new kuq(context, 8);
                bvvVar15.ad(objS8);
            }
            afdr afdrVar7 = afdrVar3;
            khc.i(cmwVarB6, (afdr) objS8, null, null, false, false, null, null, null, null, null, null, buxVarC, 8, 0, 4092);
            asl.A(awd.i(cfvVar, 8.0f), buxVarC);
            cmw cmwVarB7 = dao.b(R.drawable.ic_search_black, buxVarC, 0);
            boolean zE9 = buxVarC.E(context);
            Object objS9 = bvvVar15.S();
            if (zE9 || objS9 == buw.a) {
                objS9 = new kuq(context, 9);
                bvvVar6 = bvvVar15;
                bvvVar6.ad(objS9);
            } else {
                bvvVar6 = bvvVar15;
            }
            bvv bvvVar16 = bvvVar6;
            khc.k(cmwVarB7, "Label", (afdr) objS9, null, null, false, null, null, null, null, buxVarC, 56, 0, 8184);
            asl.A(awd.i(cfvVar, 8.0f), buxVarC);
            boolean zE10 = buxVarC.E(context);
            Object objS10 = bvvVar16.S();
            if (zE10 || objS10 == buw.a) {
                objS10 = new kuq(context, 10);
                bvvVar7 = bvvVar16;
                bvvVar7.ad(objS10);
            } else {
                bvvVar7 = bvvVar16;
            }
            bvv bvvVar17 = bvvVar7;
            khc.k(null, "Label", (afdr) objS10, null, null, false, null, null, null, null, buxVarC, 54, 0, 8184);
            bvvVar17.Y(true);
            brp.b("Colored", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVarC, 6, 0, 262142);
            ctp ctpVarA5 = avv.a(aswVar, cfrVar, buxVarC, 0);
            int iG5 = a.g(bvvVar17.u);
            ccx ccxVarAh5 = bvvVar17.ah();
            cfy cfyVarJ5 = bzi.j(buxVarC, cfvVar);
            buxVarC.w();
            if (bvvVar17.t) {
                buxVarC.j(afdrVar7);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA5, afegVar);
            byq.c(buxVarC, ccxVarAh5, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG5), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ5, afegVar4);
            cmw cmwVarB8 = dao.b(R.drawable.ic_search_black, buxVarC, 0);
            boolean zE11 = buxVarC.E(context);
            Object objS11 = bvvVar17.S();
            if (zE11 || objS11 == buw.a) {
                objS11 = new kuq(context, 11);
                bvvVar17.ad(objS11);
            }
            aezr aezrVar = ktf.a;
            khc.i(cmwVarB8, (afdr) objS11, null, null, false, false, null, null, kgq.e(kfn.i(buxVarC).C(), 0L, 0L, 0L, 0L, 0L, 0L, buxVarC, 254), null, null, null, buxVarC, 8, 0, 3836);
            asl.A(awd.i(cfvVar, 8.0f), buxVarC);
            cmw cmwVarB9 = dao.b(R.drawable.ic_search_black, buxVarC, 0);
            boolean zE12 = buxVarC.E(context);
            Object objS12 = bvvVar17.S();
            if (zE12 || objS12 == buw.a) {
                objS12 = new kuq(context, 12);
                bvvVar8 = bvvVar17;
                bvvVar8.ad(objS12);
            } else {
                bvvVar8 = bvvVar17;
            }
            bvv bvvVar18 = bvvVar8;
            khc.k(cmwVarB9, "Label", (afdr) objS12, null, null, false, null, kgq.e(kfn.i(buxVarC).C(), 0L, 0L, 0L, 0L, 0L, 0L, buxVarC, 254), null, null, buxVarC, 56, 0, 7672);
            asl.A(awd.i(cfvVar, 8.0f), buxVarC);
            boolean zE13 = buxVarC.E(context);
            Object objS13 = bvvVar18.S();
            if (zE13 || objS13 == buw.a) {
                objS13 = new kuq(context, 13);
                bvvVar9 = bvvVar18;
                bvvVar9.ad(objS13);
            } else {
                bvvVar9 = bvvVar18;
            }
            ktf ktfVarE = kgq.e(kfn.i(buxVarC).C(), 0L, 0L, 0L, 0L, 0L, 0L, buxVarC, 254);
            buxVarC = buxVarC;
            khc.k(null, "Label", (afdr) objS13, null, null, false, null, ktfVarE, null, null, buxVarC, 54, 0, 7672);
            bvvVar9.Y(true);
            bvvVar9.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gug(i, 6);
        }
    }

    public static final void C(bux buxVar, int i) {
        bux buxVarC = buxVar.c(1373392074);
        if (buxVarC.I(i != 0, i & 1)) {
            alh alhVarAX = ca.aX(buxVarC);
            ca.ao(awd.r(asl.H(w(ca.aY(cfy.e, alhVarAX), alhVarAX), 8.0f)), asv.a(4.0f, cfl.j), new asz(4.0f, false, new ass(cfl.m, 2)), null, 0, 0, kum.f, buxVarC, 1573296, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gug(i, 4);
        }
    }

    public static final void D(bux buxVar, int i) {
        afec afecVar;
        afeg afegVar;
        afeg afegVar2;
        afeg afegVar3;
        bux buxVar2;
        afeg afegVar4;
        afdr afdrVar;
        boolean z;
        bvv bvvVar;
        bvv bvvVar2;
        bvv bvvVar3;
        bvv bvvVar4;
        bvv bvvVar5;
        bvv bvvVar6;
        bvv bvvVar7;
        bvv bvvVar8;
        bvv bvvVar9;
        bvv bvvVar10;
        bvv bvvVar11;
        bvv bvvVar12;
        bux buxVarC = buxVar.c(1602054583);
        if (buxVarC.I(i != 0, i & 1)) {
            Context context = (Context) buxVarC.f(daa.b);
            cfv cfvVar = cfy.e;
            ctp ctpVarA = avv.a(atd.a, cfl.m, buxVarC, 0);
            bvv bvvVar13 = (bvv) buxVarC;
            int iG = a.g(bvvVar13.u);
            ccx ccxVarAh = bvvVar13.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar13.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            afeg afegVar5 = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar5);
            afeg afegVar6 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar6);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar7 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar7);
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar8 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar8);
            alh alhVarAX = ca.aX(buxVarC);
            if (alhVarAX.h() || alhVarAX.g()) {
                buxVarC.v(-1439304153);
                afecVar = afecVar2;
                afegVar = afegVar8;
                afegVar2 = afegVar7;
                afegVar3 = afegVar5;
                buxVar2 = buxVarC;
                afegVar4 = afegVar6;
                afdrVar = afdrVar2;
                v(alhVarAX, asl.J(awd.b(cfvVar, 1.0f), 4.0f, BitmapDescriptorFactory.HUE_RED, 8.0f, BitmapDescriptorFactory.HUE_RED), false, null, null, buxVar2, 48, 28);
                z = false;
                bvvVar13.Y(false);
            } else {
                buxVarC.v(-1439173457);
                bvvVar13.Y(false);
                afecVar = afecVar2;
                afegVar2 = afegVar7;
                afegVar3 = afegVar5;
                afegVar = afegVar8;
                buxVar2 = buxVarC;
                z = false;
                afegVar4 = afegVar6;
                afdrVar = afdrVar2;
            }
            cfy cfyVarR = awd.r(asl.H(w(ca.aY(cfvVar, alhVarAX), alhVarAX), 8.0f));
            ctp ctpVarA2 = atp.a(new asz(8.0f, z, null), cfl.k, buxVar2, 54);
            int iG2 = a.g(bvvVar13.u);
            ccx ccxVarAh2 = bvvVar13.ah();
            cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarR);
            buxVar2.w();
            if (bvvVar13.t) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            byq.c(buxVar2, ctpVarA2, afegVar3);
            byq.c(buxVar2, ccxVarAh2, afegVar4);
            byq.c(buxVar2, Integer.valueOf(iG2), afegVar2);
            byq.b(buxVar2, afecVar);
            byq.c(buxVar2, cfyVarJ2, afegVar);
            bux buxVar3 = buxVar2;
            int i2 = 1;
            brp.b("Simple Inline Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI = bxc.i(-226347867, true, new kus(context, 6), buxVar3);
            boolean zE = buxVar3.E(context);
            Object objS = bvvVar13.S();
            int i3 = 8;
            if (zE || objS == buw.a) {
                objS = new kur(context, i3);
                bvvVar = bvvVar13;
                bvvVar.ad(objS);
            } else {
                bvvVar = bvvVar13;
            }
            bvv bvvVar14 = bvvVar;
            mcd.g(cctVarI, (afdr) objS, null, 0, false, 0L, null, null, null, null, null, null, buxVar3, 6, 0, 4092);
            brp.b("Simple Inline Notification no Subtitle", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI2 = bxc.i(1652863822, true, new kus(context, 7), buxVar3);
            boolean zE2 = buxVar3.E(context);
            Object objS2 = bvvVar14.S();
            if (zE2 || objS2 == buw.a) {
                objS2 = new kur(context, 9);
                bvvVar2 = bvvVar14;
                bvvVar2.ad(objS2);
            } else {
                bvvVar2 = bvvVar14;
            }
            bvv bvvVar15 = bvvVar2;
            mcd.g(cctVarI2, (afdr) objS2, null, 0, false, 0L, null, null, null, null, null, null, buxVar3, 6, 0, 4092);
            brp.b("Simple Inline Notification no Icon", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI3 = bxc.i(-4244435, true, new juy(context, 13), buxVar3);
            boolean zE3 = buxVar3.E(context);
            Object objS3 = bvvVar15.S();
            if (zE3 || objS3 == buw.a) {
                objS3 = new kjy(context, 7);
                bvvVar3 = bvvVar15;
                bvvVar3.ad(objS3);
            } else {
                bvvVar3 = bvvVar15;
            }
            bvv bvvVar16 = bvvVar3;
            mcd.g(cctVarI3, (afdr) objS3, null, 0, false, 0L, null, null, null, null, null, null, buxVar3, 6, 0, 4092);
            brp.b("Simple Inline Notification with Icon in Subtitle", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI4 = bxc.i(-1661352692, true, new juy(context, 14), buxVar3);
            boolean zE4 = buxVar3.E(context);
            Object objS4 = bvvVar16.S();
            if (zE4 || objS4 == buw.a) {
                objS4 = new kjy(context, 8);
                bvvVar4 = bvvVar16;
                bvvVar4.ad(objS4);
            } else {
                bvvVar4 = bvvVar16;
            }
            bvv bvvVar17 = bvvVar4;
            mcd.g(cctVarI4, (afdr) objS4, null, 0, false, 0L, null, null, null, null, null, null, buxVar3, 6, 0, 4092);
            brp.b("Simple Inline Notification with Badged Icon", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI5 = bxc.i(976506347, true, new juy(context, 19), buxVar3);
            boolean zE5 = buxVar3.E(context);
            Object objS5 = bvvVar17.S();
            if (zE5 || objS5 == buw.a) {
                objS5 = new kur(context, i2);
                bvvVar5 = bvvVar17;
                bvvVar5.ad(objS5);
            } else {
                bvvVar5 = bvvVar17;
            }
            bvv bvvVar18 = bvvVar5;
            mcd.g(cctVarI5, (afdr) objS5, null, 0, false, 0L, null, null, null, null, null, null, buxVar3, 6, 0, 4092);
            brp.b("Simple Inline Work Profile Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI6 = bxc.i(-680601910, true, new juy(context, 20), buxVar3);
            boolean zE6 = buxVar3.E(context);
            Object objS6 = bvvVar18.S();
            if (zE6 || objS6 == buw.a) {
                objS6 = new kur(context, 0);
                bvvVar6 = bvvVar18;
                bvvVar6.ad(objS6);
            } else {
                bvvVar6 = bvvVar18;
            }
            bvv bvvVar19 = bvvVar6;
            mcd.g(cctVarI6, (afdr) objS6, null, 0, false, 0L, null, null, null, null, null, null, buxVar3, 6, 0, 4092);
            brp.b("Simple Inline Notification with Message Count", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI7 = bxc.i(1957257129, true, new kus(context, i2), buxVar3);
            boolean zE7 = buxVar3.E(context);
            Object objS7 = bvvVar19.S();
            int i4 = 2;
            if (zE7 || objS7 == buw.a) {
                objS7 = new kur(context, i4);
                bvvVar7 = bvvVar19;
                bvvVar7.ad(objS7);
            } else {
                bvvVar7 = bvvVar19;
            }
            bvv bvvVar20 = bvvVar7;
            mcd.g(cctVarI7, (afdr) objS7, null, 0, false, 0L, null, null, null, null, null, null, buxVar3, 6, 0, 4092);
            brp.b("Simple Inline Notification with Message Count over 9", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI8 = bxc.i(300148872, true, new kus(context, 0), buxVar3);
            boolean zE8 = buxVar3.E(context);
            Object objS8 = bvvVar20.S();
            int i5 = 3;
            if (zE8 || objS8 == buw.a) {
                objS8 = new kur(context, i5);
                bvvVar8 = bvvVar20;
                bvvVar8.ad(objS8);
            } else {
                bvvVar8 = bvvVar20;
            }
            bvv bvvVar21 = bvvVar8;
            mcd.g(cctVarI8, (afdr) objS8, null, 0, false, 0L, null, null, null, null, null, null, buxVar3, 6, 0, 4092);
            brp.b("Single Action Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI9 = bxc.i(-1356959385, true, new kus(context, 2), buxVar3);
            boolean zE9 = buxVar3.E(context);
            Object objS9 = bvvVar21.S();
            int i6 = 4;
            if (zE9 || objS9 == buw.a) {
                objS9 = new kur(context, i6);
                bvvVar9 = bvvVar21;
                bvvVar9.ad(objS9);
            } else {
                bvvVar9 = bvvVar21;
            }
            afdr afdrVar3 = (afdr) objS9;
            boolean zE10 = buxVar3.E(context);
            Object objS10 = bvvVar9.S();
            if (zE10 || objS10 == buw.a) {
                objS10 = new kut(context, i2);
                bvvVar9.ad(objS10);
            }
            bvv bvvVar22 = bvvVar9;
            mcd.g(cctVarI9, afdrVar3, null, 0, false, 0L, null, null, null, null, null, (afec) objS10, buxVar3, 6, 0, 2044);
            brp.b("Two Action Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI10 = bxc.i(1280899654, true, new kus(context, 3), buxVar3);
            boolean zE11 = buxVar3.E(context);
            Object objS11 = bvvVar22.S();
            int i7 = 5;
            if (zE11 || objS11 == buw.a) {
                objS11 = new kur(context, i7);
                bvvVar10 = bvvVar22;
                bvvVar10.ad(objS11);
            } else {
                bvvVar10 = bvvVar22;
            }
            afdr afdrVar4 = (afdr) objS11;
            boolean zE12 = buxVar3.E(context);
            Object objS12 = bvvVar10.S();
            if (zE12 || objS12 == buw.a) {
                objS12 = new kut(context, 0);
                bvvVar10.ad(objS12);
            }
            bvv bvvVar23 = bvvVar10;
            mcd.g(cctVarI10, afdrVar4, null, 0, false, 0L, null, null, null, null, null, (afec) objS12, buxVar3, 6, 0, 2044);
            brp.b("Message Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            cct cctVarI11 = bxc.i(1983823066, true, new kus(context, 4), buxVar3);
            boolean zE13 = buxVar3.E(context);
            Object objS13 = bvvVar23.S();
            if (zE13 || objS13 == buw.a) {
                objS13 = new kur(context, 6);
                bvvVar11 = bvvVar23;
                bvvVar11.ad(objS13);
            } else {
                bvvVar11 = bvvVar23;
            }
            afdr afdrVar5 = (afdr) objS13;
            cfy cfyVarK = awd.k(cfvVar, 650.0f, 200.0f);
            boolean zE14 = buxVar3.E(context);
            Object objS14 = bvvVar11.S();
            if (zE14 || objS14 == buw.a) {
                objS14 = new kut(context, 2);
                bvvVar11.ad(objS14);
            }
            bvv bvvVar24 = bvvVar11;
            mcd.g(cctVarI11, afdrVar5, cfyVarK, 0, false, 0L, null, null, null, null, null, (afec) objS14, buxVar3, 390, 0, 2040);
            brp.b("Incoming Call Notification", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, buxVar3, 6, 0, 262142);
            buxVarC = buxVar3;
            cct cctVarI12 = bxc.i(326714809, true, new kus(context, 5), buxVarC);
            boolean zE15 = buxVarC.E(context);
            Object objS15 = bvvVar24.S();
            if (zE15 || objS15 == buw.a) {
                objS15 = new kur(context, 7);
                bvvVar12 = bvvVar24;
                bvvVar12.ad(objS15);
            } else {
                bvvVar12 = bvvVar24;
            }
            afdr afdrVar6 = (afdr) objS15;
            cfy cfyVarK2 = awd.k(cfvVar, 650.0f, 200.0f);
            boolean zE16 = buxVarC.E(context);
            Object objS16 = bvvVar12.S();
            if (zE16 || objS16 == buw.a) {
                objS16 = new kut(context, 3);
                bvvVar12.ad(objS16);
            }
            bvv bvvVar25 = bvvVar12;
            mcd.g(cctVarI12, afdrVar6, cfyVarK2, 0, false, 0L, null, null, null, null, null, (afec) objS16, buxVarC, 390, 0, 2040);
            bvvVar25.Y(true);
            bvvVar25.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gug(i, 7);
        }
    }

    public static final void E(Context context, String str) {
        H(context, str.concat(" clicked"));
    }

    public static final void F(Context context, String str) {
        H(context, str.concat(" closed"));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0265  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(defpackage.bux r45, int r46) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fww.G(bux, int):void");
    }

    public static final void H(Context context, String str) {
        obs.a().g(context, new ComponentName(context, (Class<?>) kuo.class), str, 0);
    }

    public static /* synthetic */ afak I(bux buxVar, int i) {
        if (buxVar.I((i & 3) != 2, i & 1)) {
            boc.a(dao.b(R.drawable.gs_android_auto_vd_theme_24, buxVar, 0), null, awd.i(cfy.e, 40.0f), ksp.j(krr.h, buxVar), buxVar, 440, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static final void J(bux buxVar) {
        brp.b("Subtitle", null, ksp.j(krr.D, buxVar), 0L, null, 0L, null, 0L, 2, false, 1, 0, czz.av(buxVar).e, buxVar, 6, 24960, 110586);
    }

    public static final void K(cfy cfyVar, bux buxVar, int i) {
        brp.b("Title", i != 0 ? cfy.e : cfyVar, 0L, 0L, null, 0L, null, 0L, 2, false, 1, 0, czz.av(buxVar).d, buxVar, 6, 24960, 110588);
    }

    public static final void L(cfy cfyVar, ckv ckvVar, bmv bmvVar, bmw bmwVar, afeh afehVar, bux buxVar, int i, int i2) {
        cfy cfyVar2;
        int i3;
        ckv ckvVar2;
        bmv bmvVar2;
        afeh afehVar2;
        cfy cfyVar3;
        ckv ckvVar3;
        bmv bmvVar3;
        bmw bmwVar2;
        ckv ckvVarAr;
        bmv bmvVarC;
        cfy cfyVar4;
        bmv bmvVar4;
        ckv ckvVar4;
        int i4;
        bmw bmwVarD;
        afehVar.getClass();
        int i5 = i2 & 1;
        bux buxVarC = buxVar.c(-672961241);
        if (i5 != 0) {
            i3 = i | 6;
            cfyVar2 = cfyVar;
        } else if ((i & 6) == 0) {
            cfyVar2 = cfyVar;
            i3 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i6 = 16;
            if ((i2 & 2) == 0) {
                ckvVar2 = ckvVar;
                if (buxVarC.C(ckvVar2)) {
                    i6 = 32;
                }
            } else {
                ckvVar2 = ckvVar;
            }
            i3 |= i6;
        } else {
            ckvVar2 = ckvVar;
        }
        if ((i & 384) == 0) {
            int i7 = 128;
            if ((i2 & 4) == 0) {
                bmvVar2 = bmvVar;
                if (buxVarC.C(bmvVar2)) {
                    i7 = 256;
                }
            } else {
                bmvVar2 = bmvVar;
            }
            i3 |= i7;
        } else {
            bmvVar2 = bmvVar;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        int i8 = i3 | 24576;
        if ((196608 & i) == 0) {
            afehVar2 = afehVar;
            i8 |= true != buxVarC.E(afehVar2) ? 65536 : 131072;
        } else {
            afehVar2 = afehVar;
        }
        if (buxVarC.I((74899 & i8) != 74898, i8 & 1)) {
            int i9 = i2 & 4;
            int i10 = i2 & 2;
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfy cfyVar5 = i5 != 0 ? cfy.e : cfyVar2;
                if (i10 != 0) {
                    i8 &= -113;
                    ckvVarAr = czz.ar(13, buxVarC);
                } else {
                    ckvVarAr = ckvVar2;
                }
                if (i9 != 0) {
                    bmvVarC = jzg.c(0L, buxVarC, 15);
                    i8 &= -897;
                } else {
                    bmvVarC = bmvVar2;
                }
                cfyVar4 = cfyVar5;
                bmvVar4 = bmvVarC;
                ckvVar4 = ckvVarAr;
                i4 = i8 & (-7169);
                bmwVarD = vs.d(0);
            } else {
                buxVarC.s();
                if (i10 != 0) {
                    i8 &= -113;
                }
                if (i9 != 0) {
                    i8 &= -897;
                }
                i4 = i8 & (-7169);
                bmwVarD = bmwVar;
                cfyVar4 = cfyVar2;
                ckvVar4 = ckvVar2;
                bmvVar4 = bmvVar2;
            }
            buxVarC.l();
            vy.a(cfyVar4, ckvVar4, bmvVar4, bmwVarD, null, afehVar2, buxVarC, i4 & 517118, 0);
            cfyVar3 = cfyVar4;
            ckvVar3 = ckvVar4;
            bmvVar3 = bmvVar4;
            bmwVar2 = bmwVarD;
        } else {
            buxVarC.s();
            cfyVar3 = cfyVar2;
            ckvVar3 = ckvVar2;
            bmvVar3 = bmvVar2;
            bmwVar2 = bmwVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kul(cfyVar3, ckvVar3, bmvVar3, bmwVar2, afehVar, i, i2, 0);
        }
    }

    public static /* synthetic */ afak M(mcd mcdVar, bux buxVar, int i) {
        mcdVar.getClass();
        if (buxVar.I((i & 17) != 16, i & 1)) {
            J(buxVar);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static /* synthetic */ afak N(lxw lxwVar, bux buxVar, int i) {
        lxwVar.getClass();
        if (buxVar.I((i & 17) != 16, i & 1)) {
            K(null, buxVar, 1);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static final cfy a(cfy cfyVar) {
        cfyVar.getClass();
        return bzi.C(cfyVar, new bqy(5));
    }

    public static final void b(gbg gbgVar, gcq gcqVar, boolean z, boolean z2, boolean z3, bux buxVar, int i, int i2) {
        int i3;
        boolean z4;
        float f;
        int i4;
        boolean z5;
        boolean z6;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(1688467419);
        if (i5 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(gbgVar) : buxVarC.E(gbgVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(gcqVar) : buxVarC.E(gcqVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.D(z2) ? 1024 : 2048;
        }
        int i6 = i2 & 16;
        boolean z7 = i6 == 0;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= true != buxVarC.D(z3) ? 8192 : 16384;
        }
        if (buxVarC.I((i3 & 9363) != 9362, i3 & 1)) {
            boolean z8 = z7 & z3;
            float f2 = gux.g(buxVarC).d.d;
            boolean z9 = gcqVar != null && gcqVar.a.a();
            if (gbgVar != null) {
                buxVarC.v(-1523759094);
                i4 = i3;
                z6 = false;
                f = f2;
                gbf.d(gbgVar, awd.i(cfy.e, f2), null, null, new cjv(((cjv) buxVarC.f(bnm.a)).a), z8, true, null, null, false, buxVarC, (i3 & 14) | 1572864 | ((i3 << 3) & 458752), 908);
                z5 = z8;
                ((bvv) buxVarC).Y(false);
            } else {
                f = f2;
                i4 = i3;
                z5 = z8;
                z6 = false;
                buxVarC.v(-1523573497);
                ((bvv) buxVarC).Y(false);
            }
            if (gbgVar == null || !z9) {
                buxVarC.v(-1523457433);
                ((bvv) buxVarC).Y(z6);
            } else {
                buxVarC.v(-1523530469);
                cfv cfvVar = cfy.e;
                hir hirVar = gux.e(buxVarC).c;
                asl.A(awd.m(cfvVar, 12.0f), buxVarC);
                ((bvv) buxVarC).Y(z6);
            }
            if (z9) {
                buxVarC.v(-1523419148);
                fzc.g(gcqVar, null, 0, 0, ((cjv) buxVarC.f(bnm.a)).a, null, 0L, null, 0, 0, null, new dlj(f), z2 ? new cjv(cjn.n()) : null, !z, false, buxVarC, ((i4 >> 3) & 14) | 8, 0, 42990);
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-1523181657);
                ((bvv) buxVarC).Y(z6);
            }
            z4 = z5;
        } else {
            buxVarC.s();
            z4 = z3;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nki(gbgVar, gcqVar, z, z2, z4, i, i2, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.fwy r22, defpackage.cfy r23, defpackage.fwx r24, defpackage.hjw r25, defpackage.ckv r26, defpackage.bmr r27, defpackage.asf r28, boolean r29, defpackage.dlj r30, defpackage.dlj r31, defpackage.bux r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fww.c(fwy, cfy, fwx, hjw, ckv, bmr, asf, boolean, dlj, dlj, bux, int, int):void");
    }

    public static final avp d(boolean z, dlj dljVar, dlj dljVar2, bux buxVar, int i) {
        float f;
        hja hjaVarE = gux.e(buxVar);
        float fMin = Math.min(hjaVarE.a.d, hjaVarE.b.d);
        float f2 = 12.0f + fMin + BitmapDescriptorFactory.HUE_RED;
        if (z) {
            hir hirVar = hjaVarE.c;
            f = fMin + 24.0f + BitmapDescriptorFactory.HUE_RED;
        } else {
            hir hirVar2 = hjaVarE.c;
            f = f2;
        }
        if ((i & 2) != 0) {
            dljVar = null;
        }
        hir hirVar3 = hjaVarE.c;
        if (dljVar != null) {
            f = dljVar.a;
        }
        if ((i & 4) != 0) {
            dljVar2 = null;
        }
        if (dljVar2 != null) {
            f2 = dljVar2.a;
        }
        return new avr(f, f2, f, f2);
    }

    public static final ajh e(long j, bux buxVar, int i) {
        if (i != 0) {
            j = gux.c(buxVar).A();
        }
        return afp.B(2.0f, j);
    }

    public static final bpc f(fxe fxeVar, bux buxVar) {
        return new bpc(((cjv) fxeVar.i.invoke(buxVar, 0)).a, new blx(0.08f, 0.12f));
    }

    public static final void g(fwr fwrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        aezu aezuVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(397648617);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fwrVar) : buxVarC.E(fwrVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            if (fwrVar.a.g) {
                buxVarC.v(830395704);
                gcq gcqVarA = fwrVar.a();
                if (gcqVarA == null || !gcqVarA.a.a()) {
                    buxVarC.v(830524230);
                    aezuVar = new aezu(fwx.e, gux.f(buxVarC).a.c);
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(830463811);
                    ((bvv) buxVarC).Y(false);
                    aezuVar = new aezu(fwx.f, null);
                }
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-111762071);
                ((bvv) buxVarC).Y(false);
                aezuVar = new aezu(fwx.f, null);
            }
            fwn.f(fwrVar.b, 0, 0, bxc.i(-138601503, true, new fum(fwrVar, cfyVar, (fwx) aezuVar.a, (bcm) aezuVar.b, 2), buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(fwrVar, cfyVar, i, 8, null);
        }
    }

    public static final float h(bux buxVar) {
        avp avpVarD = d(false, null, null, buxVar, 6);
        float f = gux.g(buxVar).d.d;
        avr avrVar = (avr) avpVarD;
        float f2 = avrVar.a;
        return f + f2 + BitmapDescriptorFactory.HUE_RED + avrVar.b + BitmapDescriptorFactory.HUE_RED;
    }

    public static final fvu i(Action action, geu geuVar) {
        int type = action.getType();
        if (type != 1) {
            switch (type) {
                case Action.TYPE_APP_ICON /* 65538 */:
                    return new fvu(null, fvr.k(geuVar), null);
                case Action.TYPE_BACK /* 65539 */:
                    return fvl.c(action, geuVar, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12);
                default:
                    return null;
            }
        }
        CarIcon icon = action.getIcon();
        if (icon == null) {
            return null;
        }
        ghw ghwVar = ghw.b;
        ghv ghvVar = ghv.a;
        ghvVar.getClass();
        return new fvu(null, new fvz(gai.a(icon, geuVar, ghwVar, ghvVar, null, 8), null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.fzg j(androidx.car.app.model.Header r12, defpackage.geu r13) {
        /*
            ggl r0 = r13.i()
            int r0 = r0.c()
            r1 = 9
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L23
            androidx.car.app.model.Background r0 = r12.getBackground()
            if (r0 != 0) goto L22
            java.lang.Class<ggk> r0 = defpackage.ggk.class
            hem r0 = r13.F(r0)
            ggk r0 = (defpackage.ggk) r0
            boolean r0 = r0.F()
            if (r0 == 0) goto L23
        L22:
            r2 = r3
        L23:
            r0 = 0
            if (r2 == 0) goto L3c
            androidx.car.app.model.CarIcon r4 = r12.getStartHeaderImage()
            if (r4 == 0) goto L3c
            ghw r6 = defpackage.ghw.b
            ghv r7 = defpackage.ghv.a
            r7.getClass()
            r8 = 0
            r9 = 8
            r5 = r13
            gag r13 = defpackage.gai.a(r4, r5, r6, r7, r8, r9)
            goto L3e
        L3c:
            r5 = r13
            r13 = r0
        L3e:
            androidx.car.app.model.CarText r1 = r12.getTitle()
            androidx.car.app.model.CarText r4 = r12.getSubtitle()
            if (r3 == r2) goto L4a
            r10 = r0
            goto L4b
        L4a:
            r10 = r4
        L4b:
            androidx.car.app.model.Background r4 = r12.getBackground()
            if (r4 == 0) goto L5b
            if (r3 == r2) goto L54
            r4 = r0
        L54:
            if (r4 == 0) goto L5b
            fyj r2 = defpackage.fyh.b(r4, r5)
            goto L5c
        L5b:
            r2 = r0
        L5c:
            androidx.car.app.model.Action r3 = r12.getStartHeaderAction()
            if (r3 == 0) goto L66
            fvu r0 = i(r3, r5)
        L66:
            java.util.List r0 = defpackage.woy.bj(r0)
            java.util.List r3 = r12.getEndHeaderActions()
            r3.getClass()
            r4 = 3
            java.util.List r3 = defpackage.woy.cd(r3, r4)
            r11 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.woy.bp(r3, r4)
            r10.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L86:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r3.next()
            androidx.car.app.model.Action r4 = (androidx.car.app.model.Action) r4
            r4.getClass()
            java.lang.Class<ggk> r6 = defpackage.ggk.class
            hem r6 = r5.F(r6)
            ggk r6 = (defpackage.ggk) r6
            boolean r6 = r6.f()
            r8 = 0
            r9 = 12
            r7 = 0
            fvu r4 = defpackage.fvl.c(r4, r5, r6, r7, r8, r9)
            r10.add(r4)
            goto L86
        Lad:
            fzg r4 = new fzg
            r8 = r13
            r9 = r0
            r5 = r1
            r7 = r2
            r6 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            defpackage.gka.b(r4, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fww.j(androidx.car.app.model.Header, geu):fzg");
    }

    public static final fzg k(geu geuVar, CarText carText, Action action, List list) {
        List arrayList;
        List listBj = woy.bj(action != null ? i(action, geuVar) : null);
        if (list != null) {
            List listCd = woy.cd(list, 3);
            arrayList = new ArrayList(woy.bp(listCd, 10));
            Iterator it = listCd.iterator();
            while (it.hasNext()) {
                geu geuVar2 = geuVar;
                arrayList.add(fvl.c((Action) it.next(), geuVar2, ((ggk) geuVar.F(ggk.class)).f(), null, false, 12));
                geuVar = geuVar2;
            }
        } else {
            arrayList = afbe.a;
        }
        return new fzg(carText, null, null, null, listBj, arrayList);
    }

    public static final boolean l(geu geuVar) {
        return (geuVar.getResources().getConfiguration().uiMode & 48) == 32 || !((ggk) geuVar.F(ggk.class)).u();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(defpackage.cfy r54, final defpackage.deu r55, java.util.List r56, int r57, int r58, defpackage.dfw r59, long r60, int r62, defpackage.dku r63, int r64, java.util.Map r65, defpackage.die r66, boolean r67, defpackage.bux r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fww.m(cfy, deu, java.util.List, int, int, dfw, long, int, dku, int, java.util.Map, die, boolean, bux, int, int, int):void");
    }

    public static final void n(cfy cfyVar, List list, int i, int i2, final dfw dfwVar, long j, dku dkuVar, int i3, Map map, bux buxVar, final int i4, final int i5, final int i6) {
        cfy cfyVar2;
        int i7;
        dfw dfwVar2;
        bux buxVar2;
        final int i8;
        final int i9;
        final long j2;
        final dku dkuVar2;
        final int i10;
        final Map map2;
        final List list2;
        final cfy cfyVar3;
        long jG;
        int i11;
        int i12;
        dku dkuVar3;
        Map map3;
        List list3;
        int i13;
        int i14 = i6 & 1;
        bux buxVarC = buxVar.c(1140200497);
        if (i14 != 0) {
            i7 = i4 | 6;
            cfyVar2 = cfyVar;
        } else if ((i4 & 6) == 0) {
            cfyVar2 = cfyVar;
            i7 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i4;
        } else {
            cfyVar2 = cfyVar;
            i7 = i4;
        }
        String str = "·";
        if ((i4 & 48) == 0) {
            i7 |= true != buxVarC.C("·") ? 16 : 32;
        }
        int i15 = i6 & 4;
        if (i15 != 0) {
            i7 |= 384;
        } else if ((i4 & 384) == 0) {
            i7 |= true != ((i4 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 128 : 256;
        }
        int i16 = i7 | 27648;
        if ((196608 & i4) == 0) {
            dfwVar2 = dfwVar;
            i16 |= true != buxVarC.C(dfwVar2) ? 65536 : 131072;
        } else {
            dfwVar2 = dfwVar;
        }
        int i17 = 1572864 | i16;
        if ((12582912 & i4) == 0) {
            i17 = i16 | 5767168;
        }
        int i18 = i5 | 54;
        int i19 = 905969664 | i17;
        if (buxVarC.I(((306783379 & i19) == 306783378 && (i18 & 19) == 18) ? false : true, i19 & 1)) {
            ((bvv) buxVarC).ab(-127, null, 0, null);
            if ((i4 & 1) == 0 || buxVarC.F()) {
                if (i14 != 0) {
                    cfyVar2 = cfy.e;
                }
                List list4 = i15 == 0 ? list : null;
                dlu[] dluVarArr = dlt.a;
                jG = dln.g(0L, Float.NaN);
                i11 = 2;
                i12 = 1;
                dkuVar3 = dku.a;
                map3 = afbf.a;
                list3 = list4;
                i13 = 1;
            } else {
                buxVarC.s();
                i13 = i;
                i12 = i2;
                jG = j;
                dkuVar3 = dkuVar;
                i11 = i3;
                map3 = map;
                list3 = list;
            }
            cfy cfyVar4 = cfyVar2;
            buxVarC.l();
            buxVar2 = buxVarC;
            m(cfyVar4, new deu(str), list3, i13, i12, dfwVar2, jG, 0, dkuVar3, i11, map3, null, false, buxVar2, i19 & 2118123406, (i18 & 14) | ((i18 << 3) & 896), 2048);
            cfyVar3 = cfyVar4;
            list2 = list3;
            i8 = i13;
            i9 = i12;
            j2 = jG;
            dkuVar2 = dkuVar3;
            i10 = i11;
            map2 = map3;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            i8 = i;
            i9 = i2;
            j2 = j;
            dkuVar2 = dkuVar;
            i10 = i3;
            map2 = map;
            list2 = list;
            cfyVar3 = cfyVar2;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: ggc
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    cfy cfyVar5 = cfyVar3;
                    List list5 = list2;
                    int i20 = i8;
                    int i21 = i9;
                    dfw dfwVar3 = dfwVar;
                    int i22 = i4;
                    long j3 = j2;
                    int i23 = i5;
                    int i24 = i22 | 1;
                    int i25 = i23 & 306783378;
                    int i26 = i25 + i25;
                    int i27 = 306783378 & i24;
                    int i28 = i10;
                    int i29 = i23 & 613566756;
                    int i30 = i23 & (-920350135);
                    int i31 = i24 & 613566756;
                    Map map4 = map2;
                    fww.n(cfyVar5, list5, i20, i21, dfwVar3, j3, dkuVar2, i28, map4, (bux) obj, (i24 & (-920350135)) | i27 | (i31 >> 1) | ((i27 + i27) & i31), i30 | i25 | (i29 >> 1) | (i26 & i29), i6);
                    return afak.a;
                }
            };
        }
    }

    public static final boolean o(long j, long j2, boolean z) {
        return gbt.m(cjn.h(j), cjn.h(j2), true != z ? 3.0d : 4.5d);
    }

    public static final boolean p(long j, long j2, bux buxVar, int i) {
        if (i != 0) {
            j = ((cjv) buxVar.f(ggf.a)).a;
        }
        return gbt.m(cjn.h(j2), cjn.h(j), 4.5d);
    }

    public static final long q(List list, long j, int i, bux buxVar, int i2) {
        Object next;
        if ((i2 & 2) != 0) {
            j = ((cjv) buxVar.f(ggf.a)).a;
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        boolean z = (i2 & 8) != 0;
        int i3 = i - 1;
        cjv cjvVar = null;
        if (i == 0) {
            throw null;
        }
        if (i3 == 0) {
            buxVar.v(-513547013);
            list = woy.bY(list, ca.bl(buxVar) ? woy.bi(new cjv(-4294967296L), new cjv(-72057594037927936L)) : woy.bi(new cjv(-72057594037927936L), new cjv(-4294967296L)));
            buxVar.o();
        } else {
            if (i3 != 1) {
                buxVar.v(-513550636);
                buxVar.o();
                throw new aezs();
            }
            buxVar.v(-513539205);
            buxVar.o();
        }
        buxVar.v(322745523);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (o(((cjv) next).a, j, z)) {
                break;
            }
        }
        cjv cjvVar2 = (cjv) next;
        buxVar.o();
        if (cjvVar2 == null) {
            gks.k("CarApp.H.Tem", "Couldn't find contrast safe color for background %s from candidates %s, returning empty value.", new cjv(j), list);
        } else {
            cjvVar = cjvVar2;
        }
        if (i3 == 0 || i3 == 1) {
            return cjvVar != null ? cjvVar.a : cjn.n();
        }
        throw new aezs();
    }

    public static final long r(cjv cjvVar, long j, bux buxVar) {
        return q(woy.bg(new cjv(cjvVar.a)), j, 1, buxVar, 8);
    }

    public static final boolean s(hjw hjwVar, long j, bux buxVar) {
        hjwVar.getClass();
        return !a.j(t(hjwVar, 2, j, buxVar, 0), cjn.n());
    }

    public static final long t(hjw hjwVar, int i, long j, bux buxVar, int i2) {
        if ((i2 & 2) != 0) {
            j = ((cjv) buxVar.f(ggf.a)).a;
        }
        return q(hjwVar.b(buxVar), j, 1 == (i2 & 1) ? 1 : i, buxVar, 8);
    }

    public static final void u(View view, FocusInterceptor focusInterceptor) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new kwg(view, focusInterceptor, viewTreeObserver));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0180  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(defpackage.aqf r36, defpackage.cfy r37, boolean r38, defpackage.afeh r39, defpackage.afeh r40, defpackage.bux r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fww.v(aqf, cfy, boolean, afeh, afeh, bux, int, int):void");
    }

    public static /* synthetic */ cfy w(cfy cfyVar, aqf aqfVar) {
        afeg afegVar = kvw.a;
        long jN = cjn.n();
        kvs kvsVar = kvw.b;
        cfyVar.getClass();
        aqfVar.getClass();
        kvsVar.getClass();
        return cfyVar.a(new cfu(new kvq(jN, kvsVar, aqfVar, 0)));
    }

    public static final void y(cfy cfyVar, axr axrVar, float f, avp avpVar, atc atcVar, cfm cfmVar, aom aomVar, boolean z, aiu aiuVar, afec afecVar, bux buxVar, int i, int i2) {
        int i3;
        axr axrVar2;
        atc atcVar2;
        cfm cfmVar2;
        boolean z2;
        aiu aiuVar2;
        afec afecVar2;
        int i4;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(676079881);
        if (i5 == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            axrVar2 = axrVar;
            i3 |= true != buxVarC.C(axrVar2) ? 16 : 32;
        } else {
            axrVar2 = axrVar;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.z(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.C(avpVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.D(false) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            atcVar2 = atcVar;
            i3 |= true != buxVarC.C(atcVar2) ? 65536 : 131072;
        } else {
            atcVar2 = atcVar;
        }
        if ((1572864 & i) == 0) {
            cfmVar2 = cfmVar;
            i3 |= true != buxVarC.C(cfmVar2) ? 524288 : 1048576;
        } else {
            cfmVar2 = cfmVar;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != buxVarC.C(aomVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            z2 = z;
            i3 |= true != buxVarC.D(z2) ? 33554432 : 67108864;
        } else {
            z2 = z;
        }
        if ((805306368 & i) == 0) {
            aiuVar2 = aiuVar;
            i3 |= true != buxVarC.C(aiuVar2) ? 268435456 : 536870912;
        } else {
            aiuVar2 = aiuVar;
        }
        if ((i2 & 6) == 0) {
            afecVar2 = afecVar;
            i4 = i2 | (true != buxVarC.E(afecVar2) ? 2 : 4);
        } else {
            afecVar2 = afecVar;
            i4 = i2;
        }
        if (buxVarC.I(((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true, i3 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            dlg dlgVar = (dlg) buxVarC.f(dbc.d);
            boolean zC = ((((i3 & 7168) ^ 3072) > 2048 && buxVarC.C(avpVar)) || (i3 & 3072) == 2048) | buxVarC.C(dlgVar);
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                avr avrVar = (avr) avpVar;
                kvi kviVar = new kvi(dlgVar.eA(avrVar.a), dlgVar.eA(avrVar.b));
                bvvVar.ad(kviVar);
                objS = kviVar;
            }
            cfm cfmVar3 = cfmVar2;
            afec afecVar3 = afecVar2;
            czz.am(ana.b.b((kvi) objS), bxc.i(-1519215159, true, new gfv(cfyVar, axrVar2, avpVar, atcVar2, cfmVar3, aomVar, z2, aiuVar2, afecVar3, 2), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kvk(cfyVar, axrVar, f, avpVar, atcVar, cfmVar, aomVar, z, aiuVar, afecVar, i, i2, 0);
        }
    }

    public static final void z(final cfy cfyVar, final axr axrVar, final float f, final avp avpVar, final atc atcVar, cfm cfmVar, aom aomVar, boolean z, aiu aiuVar, final boolean z2, final afeh afehVar, afeh afehVar2, final afec afecVar, bux buxVar, final int i, final int i2) {
        int i3;
        int i4;
        afec afecVar2;
        final cfm cfmVar2;
        final aom aomVar2;
        final boolean z3;
        final aiu aiuVar2;
        final afeh afehVar3;
        cfm cfmVar3;
        float f2;
        Object arnVar;
        aom aomVar3;
        aiu aiuVarA;
        afeh afehVar4;
        boolean z4;
        afecVar.getClass();
        bux buxVarC = buxVar.c(-432474955);
        if ((i & 6) == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.C(axrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.z(f) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.C(avpVar) ? 1024 : 2048;
        }
        int i5 = i3 | 24576;
        if ((196608 & i) == 0) {
            i5 |= true != buxVarC.C(atcVar) ? 65536 : 131072;
        }
        int i6 = i5 | 1572864;
        if ((12582912 & i) == 0) {
            i6 = i5 | 5767168;
        }
        int i7 = i6 | 100663296;
        if ((805306368 & i) == 0) {
            i7 = i6 | 369098752;
        }
        if ((i2 & 6) == 0) {
            i4 = (true != buxVarC.D(z2) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != ((i2 & 64) == 0 ? buxVarC.C(afehVar) : buxVarC.E(afehVar)) ? 16 : 32;
        }
        int i8 = i4 | 384;
        if ((i2 & 3072) == 0) {
            afecVar2 = afecVar;
            i8 |= true != buxVarC.E(afecVar2) ? 1024 : 2048;
        } else {
            afecVar2 = afecVar;
        }
        if (buxVarC.I(((306783379 & i7) == 306783378 && (i8 & 1171) == 1170) ? false : true, i7 & 1)) {
            int i9 = i7 & (-1908408321);
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                int i10 = i7 >> 3;
                cfmVar3 = cfl.j;
                axrVar.getClass();
                Object objS = bvvVar.S();
                Object obj = buw.a;
                if (objS == obj) {
                    objS = new kvl();
                    bvvVar.ad(objS);
                }
                int i11 = (i10 & 14) | 48;
                kvl kvlVar = (kvl) objS;
                boolean z5 = (((i11 & 14) ^ 6) > 4 && buxVarC.C(axrVar)) || (i11 & 6) == 4;
                Object objS2 = bvvVar.S();
                if (z5 || objS2 == obj) {
                    objS2 = new arh(axrVar, kvlVar);
                    bvvVar.ad(objS2);
                }
                arr arrVar = (arr) objS2;
                dlg dlgVar = (dlg) buxVarC.f(dbc.d);
                kwp kwpVarA = adl.a(buxVarC);
                boolean zC = buxVarC.C(dlgVar) | buxVarC.C(arrVar) | buxVarC.C(kwpVarA);
                Object objS3 = bvvVar.S();
                if (zC || objS3 == obj) {
                    f2 = 1.0f;
                    arnVar = new arn(arrVar, kwpVarA, new aft(1.0f, 400.0f, null));
                    bvvVar.ad(arnVar);
                } else {
                    arnVar = objS3;
                    f2 = 1.0f;
                }
                aomVar3 = (arn) arnVar;
                aiuVarA = akx.a(buxVarC);
                afehVar4 = kvg.a;
                z4 = true;
            } else {
                buxVarC.s();
                cfmVar3 = cfmVar;
                aomVar3 = aomVar;
                z4 = z;
                aiuVarA = aiuVar;
                afehVar4 = afehVar2;
                f2 = 1.0f;
            }
            buxVarC.l();
            int i12 = i8;
            cfm cfmVar4 = cfmVar3;
            y(w(cfyVar, axrVar), axrVar, f, avpVar, atcVar, cfmVar4, aomVar3, z4, aiuVarA, afecVar2, buxVarC, 239075312 & i7, (i8 >> 9) & 14);
            aiu aiuVar3 = aiuVarA;
            buxVarC = buxVarC;
            boolean z6 = z4;
            int i13 = i12 << 6;
            afeh afehVar5 = afehVar4;
            v(axrVar, asl.I(awd.m(awd.b(cfy.e, f2), f), BitmapDescriptorFactory.HUE_RED, gjk.d.k), z2, afehVar, afehVar5, buxVarC, ((i9 >> 3) & 14) | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 0);
            afehVar3 = afehVar5;
            aomVar2 = aomVar3;
            z3 = z6;
            aiuVar2 = aiuVar3;
            cfmVar2 = cfmVar3;
        } else {
            buxVarC.s();
            cfmVar2 = cfmVar;
            aomVar2 = aomVar;
            z3 = z;
            aiuVar2 = aiuVar;
            afehVar3 = afehVar2;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: kvj
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    cfy cfyVar2 = cfyVar;
                    axr axrVar2 = axrVar;
                    float f3 = f;
                    avp avpVar2 = avpVar;
                    atc atcVar2 = atcVar;
                    cfm cfmVar5 = cfmVar2;
                    aom aomVar4 = aomVar2;
                    boolean z7 = z3;
                    aiu aiuVar4 = aiuVar2;
                    int i14 = i;
                    boolean z8 = z2;
                    int i15 = i2;
                    int i16 = i14 | 1;
                    int i17 = i15 & 306783378;
                    int i18 = 306783378 & i16;
                    afeh afehVar6 = afehVar3;
                    int i19 = i15 & 613566756;
                    int i20 = i16 & 613566756;
                    afec afecVar3 = afecVar;
                    fww.z(cfyVar2, axrVar2, f3, avpVar2, atcVar2, cfmVar5, aomVar4, z7, aiuVar4, z8, afehVar, afehVar6, afecVar3, (bux) obj2, (i16 & (-920350135)) | i18 | (i20 >> 1) | ((i18 + i18) & i20), (i15 & (-920350135)) | i17 | (i19 >> 1) | ((i17 + i17) & i19));
                    return afak.a;
                }
            };
        }
    }

    public final void x(cfy cfyVar, afeh afehVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(970077674);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new bca();
                bvvVar.ad(objS);
            }
            bca bcaVar = (bca) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = bvq.a(afcp.a, buxVarC);
                bvvVar.ad(objS2);
            }
            aitx aitxVar = (aitx) objS2;
            cfy cfyVarR = afp.R(cfyVar, bcaVar);
            boolean zE = buxVarC.E(aitxVar) | buxVarC.E(bcaVar);
            Object objS3 = bvvVar.S();
            if (zE || objS3 == obj) {
                objS3 = new jzi(aitxVar, bcaVar, 8, null);
                bvvVar.ad(objS3);
            }
            cfy cfyVarL = bxc.l(cfyVarR, (afec) objS3);
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarL);
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
            afehVar.invoke(atn.a, buxVarC, Integer.valueOf((i2 & 112) | 6));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg((Object) this, cfyVar, (Object) afehVar, i, 2);
        }
    }
}
