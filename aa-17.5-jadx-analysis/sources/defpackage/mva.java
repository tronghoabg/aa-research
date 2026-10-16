package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.gms.car.CarSensorEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class mva {
    public static View A(View view) {
        View view2 = null;
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.getVisibility() != 0 || (view.willNotDraw() && view.getForeground() == null && view.getBackground() == null)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View viewA = A(viewGroup.getChildAt(i));
                    if (viewA != null) {
                        if (view2 == null) {
                            view2 = viewA;
                        }
                    }
                }
            }
            return view2;
        }
        return view;
    }

    public static void B(View view, List list) {
        if (view.getId() == 16908288) {
            list.add(view);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                B(viewGroup.getChildAt(i), list);
            }
        }
    }

    public static opj C(bwq bwqVar) {
        return (opj) bwqVar.a();
    }

    public static String D(bwq bwqVar) {
        return (String) bwqVar.a();
    }

    public static void E(opm opmVar, boolean z, afdr afdrVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        cng cngVar;
        cng cngVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(182374259);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(opmVar) : buxVarC.E(opmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            cmw cmwVarC = ijl.c(opmVar.b, buxVarC);
            cfv cfvVar = cfy.e;
            cfy cfyVarX = afp.x(awd.r(cfvVar), true, null, null, afdrVar);
            float f = gjk.d.k;
            cfy cfyVarH = asl.H(cfyVarX, f);
            cfr cfrVar = cfl.n;
            ctp ctpVarA = avv.a(atd.g, cfrVar, buxVarC, 54);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarH);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
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
            ctp ctpVarA2 = avv.a(atd.a, cfrVar, buxVarC, 48);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfvVar);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            ca.bb(cmwVarC, null, awd.i(cfvVar, 48.0f), null, null, BitmapDescriptorFactory.HUE_RED, null, buxVarC, 56, 120);
            asl.A(awd.m(cfvVar, f), buxVarC);
            ctp ctpVarA3 = atp.a(atd.c, cfl.j, buxVarC, 0);
            int iG3 = a.g(bvvVar.u);
            ccx ccxVarAh3 = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfvVar);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA3, afegVar);
            byq.c(buxVarC, ccxVarAh3, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG3), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ3, afegVar4);
            buxVar2 = buxVarC;
            brp.b(opmVar.a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVarC).h, 0L, 0L, die.l, null, dao.k(dao.j(R.font.google_sans_text)), null, 0L, null, 0, 0, 0L, null, null, 16777179), buxVar2, 0, 0, 131070);
            List list = opmVar.c;
            brp.b(((Resources) buxVar2.f(daa.c)).getQuantityString(R.plurals.widgets_count, list.size(), Arrays.copyOf(new Object[]{Integer.valueOf(list.size())}, 1)), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVar2).k, czz.at(buxVar2).s, 0L, null, null, dao.k(dao.j(R.font.google_sans_text)), null, 0L, null, 0, 0, 0L, null, null, 16777182), buxVar2, 0, 0, 131070);
            bvvVar.Y(true);
            bvvVar.Y(true);
            if (z) {
                cngVar2 = vh.a;
                if (cngVar2 == null) {
                    float f2 = 24.0f;
                    cnf cnfVar = new cnf("Filled.KeyboardArrowUp", f2, f2, f2, f2, 0L, 0, false, 96);
                    ckx ckxVar = new ckx(-72057594037927936L);
                    ArrayList arrayList = new ArrayList(32);
                    rl.l(15.41f, arrayList);
                    rl.j(12.0f, 10.83f, arrayList);
                    rl.k(4.59f, 4.58f, arrayList);
                    rl.j(18.0f, 14.0f, arrayList);
                    rl.k(-6.0f, -6.0f, arrayList);
                    rl.k(-6.0f, 6.0f, arrayList);
                    rl.i(arrayList);
                    cnfVar.c(arrayList, 0, "", ckxVar, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
                    vh.a = cnfVar.a();
                    cngVar2 = vh.a;
                    cngVar2.getClass();
                }
            } else {
                cng cngVar3 = ty.a;
                if (cngVar3 == null) {
                    float f3 = 24.0f;
                    cnf cnfVar2 = new cnf("Filled.KeyboardArrowDown", f3, f3, f3, f3, 0L, 0, false, 96);
                    ckx ckxVar2 = new ckx(-72057594037927936L);
                    ArrayList arrayList2 = new ArrayList(32);
                    rl.l(8.59f, arrayList2);
                    rl.j(12.0f, 13.17f, arrayList2);
                    rl.k(4.59f, -4.58f, arrayList2);
                    rl.j(18.0f, 10.0f, arrayList2);
                    rl.k(-6.0f, 6.0f, arrayList2);
                    rl.k(-6.0f, -6.0f, arrayList2);
                    rl.k(1.41f, -1.41f, arrayList2);
                    rl.i(arrayList2);
                    cnfVar2.c(arrayList2, 0, "", ckxVar2, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
                    ty.a = cnfVar2.a();
                    cngVar2 = ty.a;
                    cngVar2.getClass();
                } else {
                    cngVar = cngVar3;
                    boc.b(cngVar, null, 0L, buxVar2, 48);
                    bvvVar.Y(true);
                }
            }
            cngVar = cngVar2;
            boc.b(cngVar, null, 0L, buxVar2, 48);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo(opmVar, z, afdrVar, i, 14, null);
        }
    }

    public static void F(List list, Set set, afec afecVar, afec afecVar2, axr axrVar, bux buxVar, int i) {
        int i2;
        afec afecVar3;
        afec afecVar4;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1722364161);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(set) : buxVarC.E(set)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            afecVar3 = afecVar;
            i2 |= true != buxVarC.E(afecVar3) ? 128 : 256;
        } else {
            afecVar3 = afecVar;
        }
        if ((i & 3072) == 0) {
            afecVar4 = afecVar2;
            i2 |= true != buxVarC.E(afecVar4) ? 1024 : 2048;
        } else {
            afecVar4 = afecVar2;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(axrVar) ? 8192 : 16384;
        }
        int i4 = i2;
        if (buxVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            kwp kwpVar = (kwp) buxVarC.f(dbc.g);
            cfy cfyVarC = awd.c(cfy.e, 1.0f);
            int i5 = i4 & 14;
            asx asxVarG = atd.g(2.0f);
            boolean zE = (i5 == 4 || ((i4 & 8) != 0 && buxVarC.E(list))) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && buxVarC.E(set))) | buxVarC.E(kwpVar);
            boolean z = (i4 & 896) == 256;
            boolean z2 = (i4 & 7168) == 2048;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if ((zE | z | z2) || objS == buw.a) {
                nze nzeVar = new nze(list, set, kwpVar, afecVar3, afecVar4, 5);
                bvvVar.ad(nzeVar);
                objS = nzeVar;
            }
            buxVar2 = buxVarC;
            awx.c(cfyVarC, axrVar, null, asxVarG, null, null, false, null, (afec) objS, buxVar2, ((i4 >> 9) & 112) | 24582, 492);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gbn(list, set, afecVar, afecVar2, axrVar, i, 6);
        }
    }

    public static void G(afdr afdrVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1310257943);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afdrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarR = awd.r(cfvVar);
            float f = gjk.e.k;
            float f2 = gjk.b.k;
            cfy cfyVarJ = asl.J(cfyVarR, f, f2, gjk.d.k, f2);
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarJ);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ2, cwb.c);
            rl.c(afdrVar, afp.E(awd.i(cfvVar, 40.0f), czz.at(buxVarC).H, bcr.a), false, null, null, ooj.a, buxVarC, (i2 & 14) | 1572864, 60);
            asl.A(awd.m(cfvVar, 20.0f), buxVarC);
            brp.b(vq.e(R.string.add_widget, buxVarC), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVarC).g, 0L, 0L, die.l, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211), buxVarC, 0, 0, 131070);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nqo(afdrVar, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0243  */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [asf, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20, types: [asf, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void H(defpackage.opt r47, boolean r48, defpackage.afec r49, defpackage.bux r50, int r51) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mva.H(opt, boolean, afec, bux, int):void");
    }

    public static void I(List list, afec afecVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1977709685);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            vy.a(asl.I(awd.t(awd.r(cfy.e), null, 3), gjk.e.k, BitmapDescriptorFactory.HUE_RED), bcr.b(24.0f), vs.c(czz.at(buxVarC).D, 0L, buxVarC, 14), vs.d(62), null, bxc.i(-1290265639, true, new nnw(list, afecVar, 5, null), buxVarC), buxVarC, 196608, 16);
            buxVarC = buxVarC;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nzv(list, afecVar, i, 4, null);
        }
    }

    public static void J(opt optVar, boolean z, afec afecVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        cfy cfyVarX;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(343039041);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(optVar) : buxVarC.E(optVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarR = awd.r(cfvVar);
            if (z) {
                buxVarC.v(-1051955639);
                ((bvv) buxVarC).Y(false);
                cfyVarX = cfvVar;
            } else {
                buxVarC.v(-1051954536);
                boolean z2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(optVar))) | ((i2 & 896) == 256);
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                byte[] bArr = null;
                if (z2 || objS == buw.a) {
                    objS = new oot(afecVar, optVar, 6, bArr);
                    bvvVar.ad(objS);
                }
                cfyVarX = afp.x(cfvVar, true, null, null, (afdr) objS);
                bvvVar.Y(false);
            }
            cfy cfyVarT = bxc.t(asl.H(cfyVarR.a(cfyVarX), gjk.d.k), true != z ? 1.0f : 0.6f);
            ctp ctpVarA = atp.a(atd.c, cfl.k, buxVarC, 48);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarT);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            P(optVar.c, cfvVar, null, false, null, buxVarC, 48, 28);
            asl.A(awd.d(cfvVar, gjk.b.k), buxVarC);
            brp.b(optVar.a, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVarC).h, 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744447), buxVarC, 0, 0, 131070);
            if (z) {
                buxVarC.v(1325088809);
                y(awd.r(cfvVar), atd.e, buxVarC, 54, 0);
                bvvVar2.Y(false);
            } else {
                buxVarC.v(1325225271);
                bvvVar2.Y(false);
            }
            String str = optVar.e;
            if (str == null) {
                buxVarC.v(1325260920);
                bvvVar2.Y(false);
                buxVar2 = buxVarC;
            } else {
                buxVarC.v(1325260921);
                buxVar2 = buxVarC;
                brp.b(str, null, czz.at(buxVarC).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVarC).o, 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744447), buxVar2, 0, 0, 131066);
                bvvVar2.Y(false);
            }
            bvvVar2.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo(optVar, z, afecVar, i, 13, null);
        }
    }

    public static void K(List list, List list2, AppWidgetProviderInfo appWidgetProviderInfo, afec afecVar, afdr afdrVar, bux buxVar, int i) {
        int i2;
        list.getClass();
        list2.getClass();
        afecVar.getClass();
        afdrVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-395609585);
        int i4 = i3 == 0 ? (true != ((i & 8) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 2 : 4) | i : i;
        if ((i & 48) == 0) {
            i4 |= true != ((i & 64) == 0 ? buxVarC.C(list2) : buxVarC.E(list2)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i4 |= true != buxVarC.E(appWidgetProviderInfo) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i4 |= true != buxVarC.E(afecVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != buxVarC.E(afdrVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(opj.a, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(afbg.a, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState2);
                objS2 = parcelableSnapshotMutableState2;
            }
            bwq bwqVar2 = (bwq) objS2;
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new ParcelableSnapshotMutableState("", bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState3);
                objS3 = parcelableSnapshotMutableState3;
            }
            bwq bwqVar3 = (bwq) objS3;
            axr axrVarA = axs.a(buxVarC);
            kwp kwpVar = (kwp) buxVarC.f(dbc.g);
            boolean zC = ((i4 & 14) == 4 || ((i4 & 8) != 0 && buxVarC.C(list))) | buxVarC.C(D(bwqVar3));
            Object objS4 = bvvVar.S();
            if (zC || objS4 == obj) {
                if (D(bwqVar3).length() == 0) {
                    objS4 = list;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        opm opmVar = (opm) it.next();
                        List list3 = opmVar.c;
                        int i5 = i4;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            Iterator it3 = it2;
                            Iterator it4 = it;
                            if (afyh.u(((opt) next).a, D(bwqVar3), true) || afyh.u(opmVar.a, D(bwqVar3), true)) {
                                arrayList2.add(next);
                            }
                            it2 = it3;
                            it = it4;
                        }
                        Iterator it5 = it;
                        opm opmVar2 = !arrayList2.isEmpty() ? new opm(opmVar.a, opmVar.b, arrayList2) : null;
                        if (opmVar2 != null) {
                            arrayList.add(opmVar2);
                        }
                        i4 = i5;
                        it = it5;
                    }
                    objS4 = arrayList;
                }
                i2 = i4;
                bvvVar.ad(objS4);
            } else {
                i2 = i4;
            }
            List list4 = (List) objS4;
            boolean zC2 = buxVarC.C(D(bwqVar3)) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && buxVarC.C(list2)));
            Object objS5 = bvvVar.S();
            if (zC2 || objS5 == obj) {
                if (D(bwqVar3).length() == 0) {
                    objS5 = list2;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : list2) {
                        opt optVar = (opt) obj2;
                        if (afyh.u(optVar.a, D(bwqVar3), true) || afyh.u(optVar.b, D(bwqVar3), true)) {
                            arrayList3.add(obj2);
                        }
                    }
                    objS5 = arrayList3;
                }
                bvvVar.ad(objS5);
            }
            z(bxc.i(-1188121911, true, new ooz(afdrVar, appWidgetProviderInfo, afecVar, bwqVar3, bwqVar, list4, axrVarA, (List) objS5, bwqVar2, kwpVar, 0), buxVarC), buxVarC, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gbn(list, list2, appWidgetProviderInfo, afecVar, afdrVar, i, 5);
        }
    }

    public static void L(boolean z, int i, String str, afdr afdrVar, cfy cfyVar, bux buxVar, int i2) {
        int i3;
        boolean z2;
        long jI;
        bvv bvvVar;
        boolean z3;
        long j;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(1073836601);
        if (i4 == 0) {
            i3 = (true != buxVarC.D(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.C(str) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.E(afdrVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i3 & 9363) != 9362, i3 & 1)) {
            bym bymVarB = ady.b(true != z ? 1.0f : 1.1f, new aft(0.5f, 1500.0f, null), null, null, buxVarC, 48, 28);
            cfy cfyVarI = asl.I(awd.b(cfyVar, 1.0f), BitmapDescriptorFactory.HUE_RED, gjk.b.k);
            if (z) {
                buxVarC.v(1164838891);
                jI = czz.at(buxVarC).h;
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1164839844);
                ((bvv) buxVarC).Y(false);
                jI = cjn.i(0);
            }
            bcm bcmVar = bcr.a;
            cfy cfyVarG = cjn.g(afp.E(cfyVarI, jI, bcmVar), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcmVar, true, 0, 1042431);
            int i5 = i3 & 7168;
            bvv bvvVar2 = (bvv) buxVarC;
            Object objS = bvvVar2.S();
            if (i5 == 2048 || objS == buw.a) {
                objS = new ooq(afdrVar, 9);
                bvvVar2.ad(objS);
            }
            cfy cfyVarX = afp.x(cfyVarG, true, null, null, (afdr) objS);
            ctp ctpVarB = atk.b(cfl.e, false);
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarX);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarB, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            cfr cfrVar = cfl.n;
            int i6 = i3;
            cfv cfvVar = cfy.e;
            float fFloatValue = ((Number) bymVarB.a()).floatValue();
            cfy cfyVarI2 = asl.I(bxc.n(cfvVar, fFloatValue, fFloatValue), gjk.e.k, BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarA = avv.a(atd.a, cfrVar, buxVarC, 48);
            int iG2 = a.g(bvvVar2.u);
            ccx ccxVarAh2 = bvvVar2.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarI2);
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            if (z) {
                buxVarC.v(-1218252398);
                bvvVar = bvvVar2;
                z3 = false;
                boc.a(dao.b(i, buxVarC, (i6 >> 3) & 14), null, awd.i(cfvVar, 20.0f), czz.at(buxVarC).i, buxVarC, 440, 0);
                buxVarC = buxVarC;
                asl.A(awd.m(cfvVar, gjk.a.k), buxVarC);
                bvvVar.Y(false);
            } else {
                bvvVar = bvvVar2;
                z3 = false;
                buxVarC.v(-1217974669);
                bvvVar.Y(false);
            }
            dfw dfwVarV = dfw.v(czz.av(buxVarC).m, 0L, 0L, z ? die.m : die.k, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744443);
            if (z) {
                buxVarC.v(-1217697653);
                j = czz.at(buxVarC).i;
                bvvVar.Y(z3);
                z3 = true;
            } else {
                buxVarC.v(-1217620401);
                j = czz.at(buxVarC).s;
                bvvVar.Y(z3);
            }
            bux buxVar2 = buxVarC;
            brp.b(str, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfwVarV, buxVar2, (i6 >> 6) & 14, 0, 131066);
            buxVarC = buxVar2;
            bvvVar.Y(true);
            bvvVar.Y(true);
            z2 = z3;
        } else {
            buxVarC.s();
            z2 = z;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nbi(z2, i, str, afdrVar, cfyVar, i2, 2);
        }
    }

    public static void M(String str, afec afecVar, afdr afdrVar, boolean z, cfy cfyVar, bux buxVar, int i) {
        int i2;
        boolean z2;
        boolean z3;
        long j;
        long j2;
        bcm bcmVar;
        long j3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(444249054);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        int i4 = i2 | 24576;
        if (buxVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarR = awd.r(cfvVar);
            float f = gjk.e.k;
            float f2 = gjk.d.k;
            cfy cfyVarI = asl.I(cfyVarR, f, f2);
            cfr cfrVar = cfl.n;
            asw aswVar = atd.a;
            ctp ctpVarA = avv.a(aswVar, cfrVar, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
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
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            avy avyVar = avy.a;
            cfy cfyVarD = awd.d(avyVar.b(cfvVar, 1.0f, true), 56.0f);
            long j4 = czz.at(buxVarC).D;
            bcm bcmVar2 = bcr.a;
            cfy cfyVarI2 = asl.I(afp.E(cfyVarD, j4, bcmVar2), f2, BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarA2 = avv.a(aswVar, cfrVar, buxVarC, 48);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarI2);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar2);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            boc.a(dao.b(R.drawable.gs_search_vd_theme_24, buxVarC, 0), null, null, czz.at(buxVarC).s, buxVarC, 56, 4);
            float f3 = gjk.c.k;
            asl.A(awd.m(cfvVar, f3), buxVarC);
            afp.M(str, afecVar, avyVar.b(cfvVar, 1.0f, true), false, dfw.v(czz.av(buxVarC).j, 0L, 0L, null, null, dao.k(dao.j(R.font.google_sans_display)), null, 0L, null, 0, 0, 0L, null, null, 16777183), null, null, 0, 0, null, null, null, bxc.i(579327715, true, new njt(str, 9), buxVarC), buxVarC, i4 & 126, 196608);
            bvvVar.Y(true);
            if (z) {
                buxVarC.v(-1613335813);
                asl.A(awd.m(cfvVar, f3), buxVarC);
                boolean zS = lxr.s();
                if (zS) {
                    buxVarC.v(1887625773);
                    z3 = false;
                    bvvVar.Y(false);
                    j = cjn.i(0);
                } else {
                    z3 = false;
                    buxVarC.v(1887627115);
                    j = ksp.j(krr.O, buxVarC);
                    bvvVar.Y(false);
                }
                if (zS) {
                    buxVarC.v(-1613026681);
                    j2 = kfn.i(buxVarC).m();
                    bvvVar.Y(z3);
                } else {
                    buxVarC.v(-1612964154);
                    j2 = ksp.j(krr.P, buxVarC);
                    bvvVar.Y(z3);
                }
                cfy cfyVarD2 = awd.d(cfvVar, 56.0f);
                cfyVarD2.getClass();
                bcmVar2.getClass();
                buxVarC.v(1490956545);
                if (lxr.s()) {
                    Object objS = bvvVar.S();
                    Object obj = buw.a;
                    if (objS == obj) {
                        ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(new dlq(0L), bxp.c);
                        bvvVar.ad(parcelableSnapshotMutableState);
                        objS = parcelableSnapshotMutableState;
                    }
                    bwq bwqVar = (bwq) objS;
                    Object objS2 = bvvVar.S();
                    if (objS2 == obj) {
                        objS2 = new njm(bwqVar, 20);
                        bvvVar.ad(objS2);
                    }
                    cfy cfyVarE = tt.e(cfyVarD2, (afec) objS2);
                    if (a.j(lxr.r(bwqVar), 0L)) {
                        bvvVar.Y(z3);
                        z2 = true;
                        cfyVar = cfvVar;
                        j3 = j;
                        bcmVar = bcmVar2;
                        cfyVarD2 = cfyVarE;
                    } else {
                        dlg dlgVar = (dlg) buxVarC.f(dbc.d);
                        float fEy = dlgVar.ey((int) (lxr.r(bwqVar) >> 32));
                        float fEy2 = dlgVar.ey((int) (lxr.r(bwqVar) & 4294967295L));
                        long jR = lxr.r(bwqVar) >> 32;
                        z2 = true;
                        cfyVar = cfvVar;
                        boolean z4 = z3;
                        bcmVar = bcmVar2;
                        long jFloatToRawIntBits = (Float.floatToRawIntBits((int) (lxr.r(bwqVar) & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) jR) << 32);
                        j3 = j;
                        float[] fArrF = xsz.f(dlgVar.ex(bcmVar.c.a(jFloatToRawIntBits, dlgVar)), dlgVar.ex(bcmVar.b.a(jFloatToRawIntBits, dlgVar)), dlgVar.ex(bcmVar.d.a(jFloatToRawIntBits, dlgVar)), dlgVar.ex(bcmVar.a.a(jFloatToRawIntBits, dlgVar)));
                        int iH = cjn.h(kfn.i(buxVarC).A());
                        int[] iArr = {iH, iH};
                        boolean z5 = buxVarC.z(fEy) | buxVarC.z(fEy2) | buxVarC.C(fArrF) | buxVarC.A(iH);
                        Object objS3 = bvvVar.S();
                        if (z5 || objS3 == obj) {
                            objS3 = new nol(fEy, fEy2, fArrF, Integer.valueOf(iH), iArr);
                            bvvVar.ad(objS3);
                        }
                        nol nolVar = (nol) objS3;
                        Object objS4 = bvvVar.S();
                        if (objS4 == obj) {
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(xqp.c, bxp.c);
                            bvvVar.ad(parcelableSnapshotMutableState2);
                            objS4 = parcelableSnapshotMutableState2;
                        }
                        bwq bwqVar2 = (bwq) objS4;
                        boolean zC = buxVarC.C(nolVar);
                        Object objS5 = bvvVar.S();
                        if (zC || objS5 == obj) {
                            objS5 = nolVar.j();
                            bvvVar.ad(objS5);
                        }
                        Map map = (Map) objS5;
                        xqq[] xqqVarArr = new xqq[5];
                        xqqVarArr[z4 ? 1 : 0] = nolVar.b();
                        xqqVarArr[1] = nolVar.d();
                        xqqVarArr[2] = nolVar.d();
                        xqqVarArr[3] = nolVar.d();
                        xqqVarArr[4] = nolVar.d();
                        xqq xqqVarAf = wpq.af(woy.bi(xqqVarArr));
                        xqp xqpVar = (xqp) bwqVar2.a();
                        Object objS6 = bvvVar.S();
                        if (objS6 == obj) {
                            objS6 = new njg(bwqVar2, 7);
                            bvvVar.ad(objS6);
                        }
                        cfyVarD2 = wpq.N(cfyVarE, xqqVarAf, xqpVar, map, (afeg) objS6, ((Context) buxVarC.f(daa.b)).getMainExecutor(), null, 480);
                        bvvVar.Y(z4);
                    }
                } else {
                    bvvVar.Y(z3);
                    z2 = true;
                    cfyVar = cfvVar;
                    j3 = j;
                    bcmVar = bcmVar2;
                }
                avp avpVar = bmo.a;
                czz.aw(afdrVar, cfyVarD2, false, bcmVar, bmo.e(j3, j2, 0L, 0L, buxVarC, 12), null, null, null, null, ooj.b, buxVarC, ((i4 >> 6) & 14) | 805306368, 484);
                buxVarC = buxVarC;
                bvvVar.Y(false);
            } else {
                z2 = true;
                cfyVar = cfvVar;
                buxVarC.v(-1612316192);
                bvvVar.Y(false);
            }
            bvvVar.Y(z2);
        } else {
            buxVarC.s();
        }
        cfy cfyVar2 = cfyVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mcg(str, afecVar, afdrVar, z, cfyVar2, i, 3);
        }
    }

    public static void N(opj opjVar, afec afecVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1540099297);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.A(opjVar.ordinal()) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (buxVarC.I((i4 & 147) != 146, i4 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarH = asl.H(afp.E(awd.v(awd.d(cfvVar, 64.0f), false, 3), czz.at(buxVarC).D, bcr.a), gjk.a.k);
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarH);
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
            boolean z = opjVar == opj.a;
            String strE = vq.e(R.string.featured, buxVarC);
            int i5 = i4 & 112;
            Object objS = bvvVar.S();
            if (i5 == 32 || objS == buw.a) {
                objS = new ooq(afecVar, 7);
                bvvVar.ad(objS);
            }
            float f = gjk.c.k;
            L(z, R.drawable.gs_star_fill1_vd_theme_24, strE, (afdr) objS, asl.J(cfvVar, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), buxVarC, 0);
            boolean z2 = opjVar == opj.b;
            String strE2 = vq.e(R.string.browse, buxVarC);
            Object objS2 = bvvVar.S();
            if (i5 == 32 || objS2 == buw.a) {
                objS2 = new ooq(afecVar, 8);
                bvvVar.ad(objS2);
            }
            L(z2, R.drawable.gs_list_vd_theme_24, strE2, (afdr) objS2, asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED), buxVarC, 0);
            bvvVar.Y(true);
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg((Object) opjVar, (Object) afecVar, cfyVar2, i, 16);
        }
    }

    public static mva O(bym bymVar) {
        return (mva) bymVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void P(android.appwidget.AppWidgetProviderInfo r24, defpackage.cfy r25, defpackage.mva r26, boolean r27, defpackage.afdr r28, defpackage.bux r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mva.P(android.appwidget.AppWidgetProviderInfo, cfy, mva, boolean, afdr, bux, int, int):void");
    }

    public static void Q(mva mvaVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1246251005);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(mvaVar) : buxVarC.E(mvaVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (!buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            buxVarC.s();
        } else if (mvaVar instanceof opi) {
            buxVarC.v(1366531544);
            ca.at(cfyVar, null, bxc.i(1631427275, true, new njt(mvaVar, 10), buxVarC), buxVarC, ((i2 >> 3) & 14) | 3072, 6);
            ((bvv) buxVarC).Y(false);
        } else if (mvaVar instanceof oph) {
            buxVarC.v(1367516879);
            ca.at(cfyVar, cfl.e, bxc.i(-1345530060, true, new njt(mvaVar, 11), buxVarC), buxVarC, ((i2 >> 3) & 14) | 3120, 4);
            ((bvv) buxVarC).Y(false);
        } else {
            boolean z = mvaVar instanceof opk;
            if (!z && !(mvaVar instanceof ooc)) {
                buxVarC.v(-648655072);
                ((bvv) buxVarC).Y(false);
                throw new aezs();
            }
            buxVarC.v(1368294483);
            ca.bb(ijl.c(z ? ((opk) mvaVar).a : ((ooc) mvaVar).a, buxVarC), null, cfyVar, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVarC, ((i2 << 3) & 896) | 56, 120);
            buxVarC = buxVarC;
            ((bvv) buxVarC).Y(false);
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nzv(mvaVar, cfyVar, i, 5);
        }
    }

    private static int R(AppWidgetProviderInfo appWidgetProviderInfo, int i, int i2, int i3) {
        return ((appWidgetProviderInfo.resizeMode & i3) == 0 || i2 <= 0) ? i : i <= 0 ? i2 : Math.min(i2, i);
    }

    public static mss a(bym bymVar) {
        return (mss) bymVar.a();
    }

    public static List b(bwq bwqVar) {
        return (List) bwqVar.a();
    }

    public static void c(mst mstVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-539560728);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(mstVar) : buxVarC.E(mstVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (!buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            buxVarC.s();
        } else if (affa.f(mstVar.a, msn.a)) {
            buxVarC.v(2009050729);
            d(mstVar.b, false, buxVarC, 0, 2);
            ((bvv) buxVarC).Y(false);
        } else {
            buxVarC.v(2009104669);
            lxw.p(mstVar, buxVarC, (i2 & 14) | 8);
            ((bvv) buxVarC).Y(false);
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(mstVar, i, 11);
        }
    }

    public static void d(cfy cfyVar, final boolean z, bux buxVar, int i, int i2) {
        int i3;
        cfy cfyVar2;
        cfyVar.getClass();
        bux buxVarC = buxVar.c(1497755415);
        if ((i & 6) == 0) {
            i3 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        boolean z2 = i4 == 0;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            z &= z2;
            if (z) {
                buxVarC.v(-783548171);
                ((bvv) buxVarC).Y(false);
                cfyVar2 = cfyVar;
            } else {
                buxVarC.v(-783518969);
                cfy cfyVarK = kfn.k(asl.H(cfyVar, gjk.b.k), null, buxVarC, 1);
                ((bvv) buxVarC).Y(false);
                cfyVar2 = cfyVarK;
            }
            ca.at(cfyVar2, null, bxc.i(787760257, true, new afeh() { // from class: mut
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ato atoVar = (ato) obj;
                    bux buxVar2 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    atoVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != buxVar2.C(atoVar) ? 2 : 4;
                    }
                    if (buxVar2.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        long jAA = roc.aA(atoVar.d(), atoVar.c());
                        eru eruVarA = esh.a(buxVar2);
                        if (eruVarA == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        mzy mzyVar = (mzy) epq.e(affw.b(mzy.class), eruVarA, null, null, ecw.g(eruVarA));
                        float fA = myv.a(atoVar.c(), myv.k((ComponentName) bxc.e(mzyVar.j(), buxVar2).a()));
                        Object objG = buxVar2.g();
                        Object obj4 = buw.a;
                        if (objG == obj4) {
                            objG = new cil();
                            buxVar2.x(objG);
                        }
                        cil cilVar = (cil) objG;
                        boolean zL = myv.l(atoVar.c(), false);
                        Object objG2 = buxVar2.g();
                        if (objG2 == obj4) {
                            objG2 = new muz(null);
                            buxVar2.x(objG2);
                        }
                        myi.n(zL, (afec) objG2, jAA, cilVar, fA, null, BitmapDescriptorFactory.HUE_RED, null, z, false, mzyVar, buxVar2, 3072, 8, 736);
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        boolean z3 = z;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nkm(cfyVar, z3, i, i2, 1);
        }
    }

    public static void e(final mtz mtzVar, oqc oqcVar, final boolean z, afei afeiVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        final afei afeiVar2;
        mtzVar.getClass();
        oqcVar.getClass();
        bux buxVarC = buxVar.c(2093556309);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(mtzVar) : buxVarC.E(mtzVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(oqcVar) : buxVarC.E(oqcVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        int i3 = i2 | 3072;
        if (buxVarC.I((i3 & 1171) != 1170, i3 & 1)) {
            eqj eqjVar = oqcVar.a;
            afeiVar2 = msv.a;
            final bym bymVarF = bxc.f(eqjVar, afbe.a, buxVarC);
            final boolean zG = lec.a.a().g();
            final bym bymVarE = bxc.e(mtzVar.g, buxVarC);
            float fD = 80.0f / jur.d(0, buxVarC, 1);
            gjk gjkVar = gjk.b;
            float f = fD + BitmapDescriptorFactory.HUE_RED;
            float f2 = gjkVar.k;
            cfy cfyVarC = awd.c(cfy.e, 1.0f);
            final float f3 = f + f2 + BitmapDescriptorFactory.HUE_RED;
            cct cctVarI = bxc.i(1530613419, true, new afeh() { // from class: muu
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i4;
                    ato atoVar = (ato) obj;
                    bux buxVar3 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    atoVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != buxVar3.C(atoVar) ? 2 : 4;
                    }
                    if (buxVar3.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        final bym bymVar = bymVarE;
                        bym bymVar2 = bymVarF;
                        float f4 = f3;
                        final boolean z2 = zG;
                        long jAA = roc.aA(atoVar.d(), atoVar.c());
                        bvf bvfVar = dbc.d;
                        float fA = ((dlg) buxVar3.f(bvfVar)).a();
                        float fEA = ((dlg) buxVar3.f(bvfVar)).eA(f4);
                        float fD2 = atoVar.d();
                        float f5 = gjk.b.k;
                        float f6 = f5 + f5 + BitmapDescriptorFactory.HUE_RED;
                        float fB = afpt.b((fD2 - f6) + BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) * fA;
                        float fB2 = afpt.b((atoVar.c() - f6) + BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) * fA;
                        if (z2 && !roc.ag(bymVar2).isEmpty() && mva.n(mva.a(bymVar))) {
                            fB2 -= fEA;
                        }
                        List listL = mva.l(roc.ag(bymVar2), fB, fB2, buxVar3);
                        Object objG = buxVar3.g();
                        Object obj4 = buw.a;
                        if (objG == obj4) {
                            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(listL, bxp.c);
                            buxVar3.x(parcelableSnapshotMutableState);
                            objG = parcelableSnapshotMutableState;
                        }
                        final bwq bwqVar = (bwq) objG;
                        final int size = mva.b(bwqVar).size() + 1;
                        boolean z3 = size > 1;
                        boolean zD = buxVar3.D(z3) | buxVar3.A(size);
                        Object objG2 = buxVar3.g();
                        if (zD || objG2 == obj4) {
                            objG2 = new mvd(z3, size, 1);
                            buxVar3.x(objG2);
                        }
                        final bbt bbtVarB = bbv.b(0, (afdr) objG2, buxVar3, 3);
                        boolean z4 = mcd.n(bbtVarB.j(), size) == 0 && (affa.f(mva.a(bymVar), msn.a) || affa.f(mva.a(bymVar), msm.a));
                        final boolean zM = mva.m(bbtVarB, size, buxVar3);
                        List listB = mva.b(bwqVar);
                        Object objG3 = buxVar3.g();
                        if (objG3 == obj4) {
                            objG3 = new mqm(bwqVar, 8);
                            buxVar3.x(objG3);
                        }
                        afec afecVar = (afec) objG3;
                        Object objG4 = buxVar3.g();
                        if (objG4 == obj4) {
                            objG4 = mux.a;
                            buxVar3.x(objG4);
                        }
                        afeg afegVar = (afeg) objG4;
                        Object objG5 = buxVar3.g();
                        if (objG5 == obj4) {
                            objG5 = muy.a;
                            buxVar3.x(objG5);
                        }
                        final boolean z5 = z3;
                        mva.k(bbtVarB, z5, size, listL, listB, afecVar, afegVar, (afeg) objG5, 0, 0, null, buxVar3, 14352384, 0, 1792);
                        boolean zC = buxVar3.C(bbtVarB) | buxVar3.A(size);
                        Object objG6 = buxVar3.g();
                        if (zC || objG6 == obj4) {
                            afdr afdrVar = new afdr() { // from class: muv
                                @Override // defpackage.afdr
                                public final Object invoke() {
                                    boolean z6 = z2;
                                    float f7 = BitmapDescriptorFactory.HUE_RED;
                                    if (z6) {
                                        int i5 = size;
                                        float fN = mcd.n(r3.j(), i5) + bbtVarB.c();
                                        if (i5 > 1) {
                                            float f8 = i5;
                                            float f9 = fN % f8;
                                            if (f9 < BitmapDescriptorFactory.HUE_RED) {
                                                f9 += f8;
                                            }
                                            f7 = f9;
                                        }
                                        if (f7 >= 1.0f) {
                                            float f10 = i5;
                                            f7 = f7 > (-1.0f) + f10 ? f10 - f7 : 1.0f;
                                        }
                                    }
                                    return Float.valueOf(f7);
                                }
                            };
                            lah lahVar = byj.a;
                            objG6 = new bvk(afdrVar, null);
                            buxVar3.x(objG6);
                        }
                        bym bymVar3 = (bym) objG6;
                        boolean z6 = z2 && mcd.n(bbtVarB.j(), size) > 0 && mva.n(mva.a(bymVar));
                        float f7 = z6 ? f4 : BitmapDescriptorFactory.HUE_RED;
                        cfv cfvVar = cfy.e;
                        cfy cfyVarC2 = awd.c(cfvVar, 1.0f);
                        cfn cfnVar = cfl.a;
                        ctp ctpVarB = atk.b(cfnVar, false);
                        int iG = a.g(buxVar3.b());
                        ccx ccxVarN = buxVar3.N();
                        cfy cfyVarJ = bzi.j(buxVar3, cfyVarC2);
                        afdr afdrVar2 = cwb.a;
                        buxVar3.M();
                        buxVar3.w();
                        if (buxVar3.G()) {
                            buxVar3.j(afdrVar2);
                        } else {
                            buxVar3.y();
                        }
                        final afei afeiVar3 = afeiVar2;
                        final mtz mtzVar2 = mtzVar;
                        final boolean z7 = z;
                        afeg afegVar2 = cwb.e;
                        byq.c(buxVar3, ctpVarB, afegVar2);
                        afeg afegVar3 = cwb.d;
                        byq.c(buxVar3, ccxVarN, afegVar3);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar4 = cwb.f;
                        byq.c(buxVar3, numValueOf, afegVar4);
                        afec afecVar2 = cwb.g;
                        byq.b(buxVar3, afecVar2);
                        afeg afegVar5 = cwb.c;
                        byq.c(buxVar3, cfyVarJ, afegVar5);
                        final atn atnVar = atn.a;
                        final float f8 = f7;
                        mcd.u(z7, bbtVarB, cjn.g(awd.c(cfvVar, 1.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, true, 0, 1044479), gjk.c.k, null, bxc.i(-736772069, true, new afei() { // from class: muw
                            @Override // defpackage.afei
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int iIntValue2 = ((Integer) obj6).intValue();
                                bux buxVar4 = (bux) obj7;
                                int iIntValue3 = ((Integer) obj8).intValue();
                                ((bbk) obj5).getClass();
                                if ((iIntValue3 & 48) == 0) {
                                    iIntValue3 |= true != buxVar4.A(iIntValue2) ? 16 : 32;
                                }
                                if (buxVar4.I((iIntValue3 & 145) != 144, iIntValue3 & 1)) {
                                    int iN = mcd.n(iIntValue2, size);
                                    if (iN == 0) {
                                        boolean z8 = z2;
                                        buxVar4.v(-1893711991);
                                        if (z8) {
                                            buxVar4.v(-1893687315);
                                            atk.c(awd.c(cfy.e, 1.0f), buxVar4, 6);
                                            buxVar4.o();
                                        } else {
                                            mtz mtzVar3 = mtzVar2;
                                            boolean z9 = z7;
                                            buxVar4.v(-1893427845);
                                            jur.b(bxc.i(1808148378, true, new jtl(z9, mtzVar3, 3), buxVar4), buxVar4, 6);
                                            buxVar4.o();
                                        }
                                        buxVar4.o();
                                    } else {
                                        bwq bwqVar2 = bwqVar;
                                        buxVar4.v(-1892981507);
                                        oqb oqbVar = (oqb) woy.bI(mva.b(bwqVar2), iN - 1);
                                        if (oqbVar == null) {
                                            buxVar4.v(-1892895328);
                                            buxVar4.o();
                                        } else {
                                            float f9 = f8;
                                            afei afeiVar4 = afeiVar3;
                                            buxVar4.v(-1892895327);
                                            int i5 = oqbVar.a;
                                            buxVar4.t(-1507927261, Integer.valueOf(i5));
                                            afeiVar4.invoke(oqbVar, das.d(asl.J(asl.H(awd.c(cfy.e, 1.0f), gjk.b.k), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f9), a.bp(i5, "earth_widget_card_")), buxVar4, 8);
                                            buxVar4.m();
                                            buxVar4.o();
                                        }
                                        buxVar4.o();
                                    }
                                } else {
                                    buxVar4.s();
                                }
                                return afak.a;
                            }
                        }, buxVar3), buxVar3, 1573248, 48);
                        int i5 = 6;
                        if (z2) {
                            buxVar3.v(642386496);
                            cfy cfyVarA = awd.c(cfvVar, 1.0f).a(new apu(bbtVarB, z7 ? api.a : api.b, true, true, afp.ab(bbtVarB, BitmapDescriptorFactory.HUE_RED, buxVar3, 196608, 30)));
                            if (((Number) bymVar3.a()).floatValue() < 1.0f) {
                                buxVar3.v(642844645);
                                boolean zC2 = buxVar3.C(bymVar3);
                                Object objG7 = buxVar3.g();
                                if (zC2 || objG7 == obj4) {
                                    objG7 = new mqm(bymVar3, i5);
                                    buxVar3.x(objG7);
                                }
                                cfy cfyVarF = cjn.f(cfyVarA, (afec) objG7);
                                ctp ctpVarB2 = atk.b(cfnVar, false);
                                int iG2 = a.g(buxVar3.b());
                                ccx ccxVarN2 = buxVar3.N();
                                cfy cfyVarJ2 = bzi.j(buxVar3, cfyVarF);
                                buxVar3.M();
                                buxVar3.w();
                                if (buxVar3.G()) {
                                    buxVar3.j(afdrVar2);
                                } else {
                                    buxVar3.y();
                                }
                                byq.c(buxVar3, ctpVarB2, afegVar2);
                                byq.c(buxVar3, ccxVarN2, afegVar3);
                                byq.c(buxVar3, Integer.valueOf(iG2), afegVar4);
                                byq.b(buxVar3, afecVar2);
                                byq.c(buxVar3, cfyVarJ2, afegVar5);
                                i4 = 2;
                                jur.b(bxc.i(-592097393, true, new jtl(z7, mtzVar2, i4), buxVar3), buxVar3, 6);
                                buxVar3.n();
                                buxVar3.o();
                            } else {
                                i4 = 2;
                                buxVar3.v(643348209);
                                buxVar3.o();
                            }
                            buxVar3.o();
                        } else {
                            i4 = 2;
                            buxVar3.v(643356145);
                            buxVar3.o();
                        }
                        final boolean z8 = z4;
                        jur.b(bxc.i(-1205830893, true, new afeg() { // from class: mus
                            @Override // defpackage.afeg
                            public final Object invoke(Object obj5, Object obj6) {
                                kso ksoVarI;
                                bux buxVar4 = (bux) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                int i6 = iIntValue2 & 3;
                                if (buxVar4.I(i6 != 2, iIntValue2 & 1)) {
                                    if (z8) {
                                        buxVar4.v(837683140);
                                        ksoVarI = ksp.f(buxVar4);
                                    } else {
                                        buxVar4.v(837684318);
                                        ksoVarI = kfn.i(buxVar4);
                                    }
                                    buxVar4.o();
                                    kso ksoVar = ksoVarI;
                                    bym bymVar4 = bymVar;
                                    float f9 = f8;
                                    atm atmVar = atnVar;
                                    bym bymVarA = adc.a(cjv.h(ksoVar.h(), 0.28f), null, buxVar4, 0, 14);
                                    bym bymVarA2 = adc.a(ksoVar.s(), null, buxVar4, 0, 14);
                                    long j = ((cjv) bymVarA.a()).a;
                                    long j2 = ((cjv) bymVarA2.a()).a;
                                    cfy cfyVarA2 = atmVar.a(das.d(cjn.g(asl.J(asl.H(cfy.e, gjk.c.k), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f9), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcr.d(), true, 0, 1042431), "earth_pager_indicator"), cfl.h);
                                    boolean zC3 = buxVar4.C(bymVar4);
                                    Object objG8 = buxVar4.g();
                                    if (zC3 || objG8 == buw.a) {
                                        objG8 = new mqm(bymVar4, 7);
                                        buxVar4.x(objG8);
                                    }
                                    boolean z9 = z5;
                                    int i7 = size;
                                    mcd.o(atmVar, zM, bbtVarB, cfyVarA2, z7, j2, j, true, i7, z9, null, (afec) objG8, buxVar4, 12582912, 0, sk.AUDIO_CONTENT_BUFFER_SIZE);
                                } else {
                                    buxVar4.s();
                                }
                                return afak.a;
                            }
                        }, buxVar3), buxVar3, 6);
                        Object objG8 = buxVar3.g();
                        if (objG8 == obj4) {
                            objG8 = new mtw(4);
                            buxVar3.x(objG8);
                        }
                        acp acpVarA = acl.w((afec) objG8).a(acl.B(null, 3));
                        Object objG9 = buxVar3.g();
                        if (objG9 == obj4) {
                            objG9 = new mtw(5);
                            buxVar3.x(objG9);
                        }
                        ca.M(z6, atnVar.a(cfvVar, cfl.h), acpVarA, acl.y((afec) objG9).a(acl.C(null, 3)), null, bxc.i(-523527543, true, new bne(jAA, bymVar, i4), buxVar3), buxVar3, 200064, 16);
                        buxVar3.n();
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC);
            buxVar2 = buxVarC;
            ca.at(cfyVarC, null, cctVarI, buxVar2, 3078, 6);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            afeiVar2 = afeiVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new hkv(mtzVar, oqcVar, z, afeiVar2, i, 3);
        }
    }

    public static void f(muq muqVar, bux buxVar, int i) {
        int i2;
        muq muqVar2;
        Bundle bundleM;
        muqVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2140587246);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(muqVar) : buxVarC.E(muqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            nsu nsuVarL = nsr.c().b().l();
            if (nsuVarL == null) {
                throw new IllegalArgumentException("can't construct widget shade without valid state");
            }
            int i4 = (i2 & 14) | 8;
            if (!lec.a.a().e() || nsuVarL.a()) {
                bundleM = lxr.m(nsuVarL.a());
            } else {
                boolean zA = nsuVarL.a();
                bundleM = new Bundle();
                bundleM.putBoolean("IS_HORIZONTAL", zA);
            }
            Bundle bundle = bundleM;
            if (nsuVarL.a()) {
                buxVarC.v(-1439181690);
                muqVar2 = muqVar;
                i(muqVar2, nsuVarL.b, nsuVarL.c, bundle, buxVarC, i4);
                ((bvv) buxVarC).Y(false);
            } else {
                muqVar2 = muqVar;
                buxVarC.v(-1439032611);
                h(muqVar2, nsuVarL.a, nsuVarL.b, nsuVarL.c, nsuVarL.d, bundle, buxVarC, i4);
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(false);
            }
        } else {
            muqVar2 = muqVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kda(muqVar2, i, 10);
        }
    }

    public static void g(final muq muqVar, final boolean z, boolean z2, bux buxVar, final int i, final int i2) {
        int i3;
        bux buxVar2;
        final boolean z3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-1990694077);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(muqVar) : buxVarC.E(muqVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.D(z) ? 16 : 32;
        }
        int i5 = i2 & 4;
        boolean z4 = i5 == 0;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != buxVarC.D(z2) ? 128 : 256;
        }
        if (buxVarC.I((i3 & 147) != 146, i3 & 1)) {
            final boolean z5 = z4 & z2;
            bym bymVarF = bxc.f(muqVar.b, true, buxVarC);
            final bym bymVarF2 = bxc.f(muqVar.a, mup.a, buxVarC);
            cfy cfyVarD = z ? awd.d(awd.r(cfy.e), 48.0f) : awd.m(awd.b(cfy.e, 1.0f), 48.0f);
            ctp ctpVarB = atk.b(cfl.e, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarD);
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
            aezu aezuVar = z ? new aezu(new dlj(80.0f), new dlj(24.0f)) : new aezu(new dlj(24.0f), new dlj(80.0f));
            final float f = ((dlj) aezuVar.a).a;
            final float f2 = ((dlj) aezuVar.b).a;
            final bcm bcmVarB = bcr.b(104.0f);
            buxVar2 = buxVarC;
            ca.M(((Boolean) bymVarF.a()).booleanValue(), null, acl.B(null, 3).a(acl.q(null, 0.33f, roc.aA(0.5f, 0.5f), 1)), acl.C(null, 3).a(acl.r(null, 0.33f, roc.aA(0.5f, 0.5f), 1)), null, bxc.i(-1210688223, true, new afeh() { // from class: muj
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    bux buxVar3 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((abu) obj).getClass();
                    int i6 = iIntValue & 17;
                    if (buxVar3.I(i6 != 16, iIntValue & 1)) {
                        bcm bcmVar = bcmVarB;
                        float f3 = f2;
                        float f4 = f;
                        cfv cfvVar = cfy.e;
                        cfy cfyVarG = cjn.g(afp.D(afp.E(kfn.k(awd.k(cfvVar, f4, f3), bcmVar, buxVar3, 0), ksp.j(krr.y, buxVar3), bcmVar), 1.0f, ksp.j(krr.n, buxVar3), bcmVar), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcmVar, true, 0, 1042431);
                        Object objG = buxVar3.g();
                        if (objG == buw.a) {
                            objG = new mto(2);
                            buxVar3.x(objG);
                        }
                        cfy cfyVarX = afp.x(cfyVarG, true, null, null, (afdr) objG);
                        ctp ctpVarB2 = atk.b(cfl.e, false);
                        int iG2 = a.g(buxVar3.b());
                        ccx ccxVarN = buxVar3.N();
                        cfy cfyVarJ2 = bzi.j(buxVar3, cfyVarX);
                        afdr afdrVar2 = cwb.a;
                        buxVar3.M();
                        buxVar3.w();
                        if (buxVar3.G()) {
                            buxVar3.j(afdrVar2);
                        } else {
                            buxVar3.y();
                        }
                        bym bymVar = bymVarF2;
                        boolean z6 = z5;
                        boolean z7 = z;
                        byq.c(buxVar3, ctpVarB2, cwb.e);
                        byq.c(buxVar3, ccxVarN, cwb.d);
                        byq.c(buxVar3, Integer.valueOf(iG2), cwb.f);
                        byq.b(buxVar3, cwb.g);
                        byq.c(buxVar3, cfyVarJ2, cwb.c);
                        mva.j((mup) bymVar.a(), z7, z6, awd.g(cfvVar, 16.0f, 40.0f), buxVar3, 3072);
                        buxVar3.n();
                    } else {
                        buxVar3.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVar2, 196608, 18);
            bvvVar.Y(true);
            z3 = z5;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            z3 = z2;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: muk
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar3 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i6 = i | 1;
                    int i7 = 306783378 & i6;
                    int i8 = 613566756 & i6;
                    mva.g(muqVar, z, z3, buxVar3, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8), i2);
                    return afak.a;
                }
            };
        }
    }

    public static void h(final muq muqVar, final int i, final float f, final float f2, final boolean z, final Bundle bundle, bux buxVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-785572375);
        if (i4 == 0) {
            i3 = (true != ((i2 & 8) == 0 ? buxVarC.C(muqVar) : buxVarC.E(muqVar)) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != buxVarC.z(f) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.z(f2) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != buxVarC.D(z) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != buxVarC.E(bundle) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i3) != 74898, i3 & 1)) {
            int i5 = i3 & 14;
            cfy cfyVarC = awd.c(cfy.e.a(new aix(cjn.i(0), ckq.a)), 1.0f);
            ctp ctpVarA = avv.a(atd.a, cfl.m, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarC);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            int i6 = i5 | 440;
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            avy avyVar = avy.a;
            cct cctVarI = bxc.i(-1152299671, true, new mum(avyVar, f, bundle, 0), buxVarC);
            cct cctVarI2 = bxc.i(129532292, true, new grm(i, avyVar, f2, 2), buxVarC);
            if (z) {
                buxVarC.v(136953984);
                g(muqVar, false, true, buxVarC, i6, 0);
                cctVarI.invoke(buxVarC, 6);
                cctVarI2.invoke(buxVarC, 6);
                bvvVar.Y(false);
            } else {
                buxVarC.v(137076031);
                cctVarI2.invoke(buxVarC, 6);
                cctVarI.invoke(buxVarC, 6);
                g(muqVar, false, false, buxVarC, i6, 0);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: mun
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    muq muqVar2 = muqVar;
                    int i7 = i;
                    int i8 = i2 | 1;
                    int i9 = 306783378 & i8;
                    int i10 = 613566756 & i8;
                    mva.h(muqVar2, i7, f, f2, z, bundle, buxVar2, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10));
                    return afak.a;
                }
            };
        }
    }

    public static void i(muq muqVar, float f, float f2, Bundle bundle, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1175972106);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(muqVar) : buxVarC.E(muqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.z(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.z(f2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(bundle) ? 1024 : 2048;
        }
        int i4 = i2;
        if (buxVarC.I((i4 & 1171) != 1170, i4 & 1)) {
            long jI = cjn.i(0);
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(cfvVar.a(new aix(jI, ckq.a)), 1.0f);
            ctp ctpVarA = atp.a(atd.c, cfl.j, buxVarC, 0);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarC);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
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
            g(muqVar, true, false, buxVarC, (i4 & 14) | 56, 4);
            cfy cfyVarR = awd.r(ats.b(cfvVar, f, true));
            int i5 = i4 >> 3;
            vo voVarD = dtv.d(buxVarC);
            bvf bvfVar = erz.a;
            eps epsVar = (eps) dyz.c(((eqa) buxVarC.f(bvfVar)).getLifecycle(), buxVarC).a();
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = muo.e;
                bvvVar.ad(objS);
            }
            buxVarC = buxVarC;
            dtk.i(msx.class, cfyVarR, voVarD, bundle, epsVar, (afec) objS, buxVarC, ((i5 & 896) << 3) & 7168);
            cfy cfyVarR2 = awd.r(ats.b(cfvVar, f2, true));
            ctp ctpVarA2 = avv.a(atd.g(8.0f), cfl.m, buxVarC, 6);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarR2);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            avy avyVar = avy.a;
            cfy cfyVarC2 = awd.c(avyVar.b(cfvVar, 0.5f, true), 1.0f);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("column_number", 0);
            vo voVarD2 = dtv.d(buxVarC);
            eps epsVar2 = (eps) dyz.c(((eqa) buxVarC.f(bvfVar)).getLifecycle(), buxVarC).a();
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = muo.f;
                bvvVar.ad(objS2);
            }
            dtk.i(mvb.class, cfyVarC2, voVarD2, bundle2, epsVar2, (afec) objS2, buxVarC, 0);
            cfy cfyVarC3 = awd.c(avyVar.b(cfvVar, 0.5f, true), 1.0f);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("column_number", 1);
            vo voVarD3 = dtv.d(buxVarC);
            eps epsVar3 = (eps) dyz.c(((eqa) buxVarC.f(bvfVar)).getLifecycle(), buxVarC).a();
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                objS3 = muo.g;
                bvvVar.ad(objS3);
            }
            dtk.i(mvb.class, cfyVarC3, voVarD3, bundle3, epsVar3, (afec) objS3, buxVarC, 0);
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mul(muqVar, f, f2, bundle, i, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0099, code lost:
    
        if (r23 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j(defpackage.mup r22, boolean r23, boolean r24, defpackage.cfy r25, defpackage.bux r26, int r27) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mva.j(mup, boolean, boolean, cfy, bux, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:195:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(final defpackage.bbt r22, final boolean r23, final int r24, final java.util.List r25, final java.util.List r26, final defpackage.afec r27, final defpackage.afeg r28, final defpackage.afeg r29, int r30, int r31, defpackage.opr r32, defpackage.bux r33, final int r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mva.k(bbt, boolean, int, java.util.List, java.util.List, afec, afeg, afeg, int, int, opr, bux, int, int, int):void");
    }

    public static List l(List list, float f, float f2, bux buxVar) {
        list.getClass();
        boolean zC = buxVar.C(list) | buxVar.z(f) | buxVar.z(f2);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((oqb) obj).b != null && (x(r3) > f || w(r3) > f2)) {
                    arrayList2.add(obj);
                } else {
                    arrayList.add(obj);
                }
            }
            Object aezuVar = new aezu(arrayList, arrayList2);
            buxVar.x(aezuVar);
            objG = aezuVar;
        }
        aezu aezuVar2 = (aezu) objG;
        List list2 = (List) aezuVar2.a;
        List list3 = (List) aezuVar2.b;
        Float fValueOf = Float.valueOf(f);
        Float fValueOf2 = Float.valueOf(f2);
        boolean zE = buxVar.E(list3) | buxVar.z(f) | buxVar.z(f2);
        Object objG2 = buxVar.g();
        if (zE || objG2 == buw.a) {
            objG2 = new mvp(list3, f, f2, null);
            buxVar.x(objG2);
        }
        bvq.e(list3, fValueOf, fValueOf2, (afeg) objG2, buxVar);
        return list2;
    }

    public static boolean m(bbt bbtVar, int i, bux buxVar) {
        bbtVar.getClass();
        boolean z = (bbtVar.i() || ((Boolean) bxc.f(mud.h.a().b(), false, buxVar).a()).booleanValue()) && i > 1;
        Object objG = buxVar.g();
        Object obj = buw.a;
        if (objG == obj) {
            Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Boolean.valueOf(z), bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG;
        Object objG2 = buxVar.g();
        if (objG2 == obj) {
            Object xyaVar = new xya((xyi) oit.a().b);
            buxVar.x(xyaVar);
            objG2 = xyaVar;
        }
        objG2.getClass();
        xya xyaVar2 = (xya) objG2;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zD = buxVar.D(z) | buxVar.E(xyaVar2);
        Object objG3 = buxVar.g();
        if (zD || objG3 == obj) {
            Object farVar = new far(z, xyaVar2, bwqVar, (afck) null, 3);
            buxVar.x(farVar);
            objG3 = farVar;
        }
        bvq.g(boolValueOf, (afeg) objG3, buxVar);
        return ((Boolean) bwqVar.a()).booleanValue();
    }

    public static boolean n(mss mssVar) {
        return (mssVar instanceof msn) || (mssVar instanceof msp);
    }

    public static void o(long j, mss mssVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 48;
        bux buxVarC = buxVar.c(-1299562636);
        if (i3 == 0) {
            i2 = (true != ((i & 64) == 0 ? buxVarC.C(mssVar) : buxVarC.E(mssVar)) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (!buxVarC.I((i2 & 145) != 144, i2 & 1)) {
            buxVarC.s();
        } else if (mssVar instanceof msn) {
            buxVarC.v(-435109981);
            d(cfyVar, true, buxVarC, ((i2 >> 6) & 14) | 48, 0);
            ((bvv) buxVarC).Y(false);
        } else if (mssVar instanceof msp) {
            buxVarC.v(-434990631);
            ndj.h(((msp) mssVar).a, cfyVar, null, null, true, buxVarC, ((i2 >> 3) & 112) | 24576, 12);
            ((bvv) buxVarC).Y(false);
        } else {
            buxVarC.v(-434832872);
            ((bvv) buxVarC).Y(false);
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gaw(j, mssVar, cfyVar, i, 3);
        }
    }

    public static /* synthetic */ afak p(byd bydVar) {
        bydVar.h(bydVar.e() - 1);
        return afak.a;
    }

    public static boolean q(Context context) {
        return ((WifiManager) context.getSystemService(WifiManager.class)).isWifiApEnabled();
    }

    public static CarSensorEvent r(int i, long j, float[] fArr, byte[] bArr) {
        int length = fArr.length;
        int length2 = bArr.length;
        CarSensorEvent carSensorEvent = new CarSensorEvent(i, j, length, length2);
        System.arraycopy(fArr, 0, carSensorEvent.d, 0, length);
        System.arraycopy(bArr, 0, carSensorEvent.e, 0, length2);
        return carSensorEvent;
    }

    public static Boolean s(bym bymVar) {
        return (Boolean) bymVar.a();
    }

    public static void t(cfy cfyVar, afec afecVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-42245119);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            eru eruVarA = esh.a(buxVarC);
            if (eruVarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            nel nelVar = (nel) epq.e(affw.b(nel.class), eruVarA, null, null, ecw.g(eruVarA));
            int i4 = i2 & 14;
            int i5 = i2 << 6;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new asg();
                bvvVar.ad(objS);
            }
            ca.at(cfyVar, null, bxc.i(-56396680, true, new ndv(afecVar, nelVar, 2, null), buxVarC), buxVarC, (((i5 & 7168) | i4) & 14) | 3072, 6);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nad(cfyVar, afecVar, i, 4, null);
        }
    }

    public static void u(orm ormVar, abnp abnpVar) {
        ormVar.getClass();
        abnpVar.t();
        orn ornVar = (orn) abnpVar.b;
        orn ornVar2 = orn.a;
        ornVar.d = ormVar;
        ornVar.c = 7;
    }

    public static /* synthetic */ orm v(abnp abnpVar) {
        abnv abnvVarQ = abnpVar.q();
        abnvVarQ.getClass();
        return (orm) abnvVarQ;
    }

    public static int w(AppWidgetProviderInfo appWidgetProviderInfo) {
        return R(appWidgetProviderInfo, appWidgetProviderInfo.minHeight, appWidgetProviderInfo.minResizeHeight, 2);
    }

    public static int x(AppWidgetProviderInfo appWidgetProviderInfo) {
        return R(appWidgetProviderInfo, appWidgetProviderInfo.minWidth, appWidgetProviderInfo.minResizeWidth, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void y(defpackage.cfy r25, defpackage.asw r26, defpackage.bux r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mva.y(cfy, asw, bux, int, int):void");
    }

    public static void z(afeg afegVar, bux buxVar, int i) {
        int i2;
        bng bngVar;
        afegVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-66260317);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afegVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            if (ca.bl(buxVarC)) {
                long j = btz.z;
                bngVar = new bng(j, btz.j, btz.A, btz.k, btz.e, btz.E, btz.n, btz.F, btz.o, btz.R, btz.t, btz.S, btz.u, btz.a, btz.g, btz.I, btz.r, btz.Q, btz.s, j, btz.f, btz.d, btz.b, btz.h, btz.c, btz.i, btz.x, btz.y, btz.D, btz.J, btz.P, btz.K, btz.L, btz.M, btz.N, btz.O, btz.B, btz.C, btz.l, btz.m, btz.G, btz.H, btz.p, btz.q, btz.T, btz.U, btz.v, btz.w);
            } else {
                long j2 = bua.z;
                bngVar = new bng(j2, bua.j, bua.A, bua.k, bua.e, bua.E, bua.n, bua.F, bua.o, bua.R, bua.t, bua.S, bua.u, bua.a, bua.g, bua.I, bua.r, bua.Q, bua.s, j2, bua.f, bua.d, bua.b, bua.h, bua.c, bua.i, bua.x, bua.y, bua.D, bua.J, bua.P, bua.K, bua.L, bua.M, bua.N, bua.O, bua.B, bua.C, bua.l, bua.m, bua.G, bua.H, bua.p, bua.q, bua.T, bua.U, bua.v, bua.w);
            }
            boh.a(bngVar, null, ops.a, afegVar, buxVarC, (i2 << 9) & 7168, 2);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nqo(afegVar, i, 7);
        }
    }
}
