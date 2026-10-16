package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.util.Log;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.car.CarInfo;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.util.Locale;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class mlq {
    private static mlq a;

    public mlq() {
    }

    public static void A(oqc oqcVar, cfy cfyVar, afdr afdrVar, afec afecVar, bux buxVar, int i) {
        int i2;
        afdr afdrVar2;
        cfy cfyVar2;
        oqcVar.getClass();
        afdrVar.getClass();
        afecVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1331141200);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(oqcVar) : buxVarC.E(oqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i5 = i2 | 48;
        if ((i & 384) == 0) {
            afdrVar2 = afdrVar;
            i5 |= true != buxVarC.E(afdrVar2) ? 128 : 256;
        } else {
            afdrVar2 = afdrVar;
        }
        if ((i & 3072) == 0) {
            i5 |= true != buxVarC.E(afecVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i5 & 1171) != 1170, i5 & 1)) {
            eqj eqjVar = oqcVar.a;
            cfv cfvVar = cfy.e;
            bym bymVarF = bxc.f(eqjVar, afbe.a, buxVarC);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            mva.z(bxc.i(992829142, true, new hjg(cfvVar, afdrVar2, oqcVar, afecVar, bymVarF, bwqVar, 3), buxVarC), buxVarC, 6);
            if (((Boolean) bwqVar.a()).booleanValue()) {
                buxVarC.v(596037735);
                Object objS2 = bvvVar.S();
                if (objS2 == obj) {
                    objS2 = new ooq(bwqVar, i4);
                    bvvVar.ad(objS2);
                }
                s((afdr) objS2, buxVarC, 6);
                bvvVar.Y(false);
            } else {
                buxVarC.v(596109810);
                bvvVar.Y(false);
            }
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh((Object) oqcVar, cfyVar2, (Object) afdrVar, afecVar, i, 15);
        }
    }

    public static /* synthetic */ afak B(bux buxVar, int i) {
        if (buxVar.I((i & 3) != 2, i & 1)) {
            boc.a(dao.b(R.drawable.gs_arrow_back_vd_theme_24, buxVar, 0), null, null, czz.at(buxVar).s, buxVar, 56, 4);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static boolean J(int i) {
        return i != 1;
    }

    public static boolean K(Uri uri) {
        return "android.resource".equals(uri.getScheme());
    }

    public static boolean L(Uri uri) {
        return "content".equals(uri.getScheme()) || "file".equals(uri.getScheme());
    }

    public static boolean M(Uri uri) {
        return "shortcut.icon.resource".equals(uri.getScheme());
    }

    public static boolean N(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null) {
            scheme = scheme.toLowerCase(Locale.US);
        }
        return "http".equals(scheme) || "https".equals(scheme);
    }

    public static double Q(int i) {
        return (V(Color.red(i)) * 0.2126d) + (V(Color.green(i)) * 0.7152d) + (V(Color.blue(i)) * 0.0722d);
    }

    public static double R(int i, int i2) {
        double dQ = Q(i);
        double dQ2 = Q(i2);
        return (Math.max(dQ, dQ2) + 0.05d) / (Math.min(dQ, dQ2) + 0.05d);
    }

    public static void S(ViewGroup viewGroup, fgc fgcVar) {
        fgcVar.N(TabLayout.class);
        fgh.b(viewGroup, fgcVar);
    }

    public static mlq U() {
        mlq mlqVar = a;
        if (mlqVar != null) {
            return mlqVar;
        }
        mlq mlqVar2 = new mlq();
        a = mlqVar2;
        return mlqVar2;
    }

    private static double V(double d) {
        double d2 = d / 255.0d;
        return d2 <= 0.03928d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
    }

    public static boolean a(qrn qrnVar, String str, CarInfo carInfo) {
        if (carInfo != null) {
            return ((Boolean) kgq.c(new mmb(qrnVar, carInfo, str, 1), "GH.EVSettingMgr", yzz.SETTINGS_EV, yzy.dZ, true, "Cannot access car", new Object[0])).booleanValue();
        }
        throw new RuntimeException("Missing carInfo, cannot retrieve carService setting");
    }

    public static void b(final qrn qrnVar, final String str, final boolean z, final CarInfo carInfo) {
        if (carInfo == null) {
            throw new RuntimeException("Missing carInfo, cannot set carService setting");
        }
        kgq.d(new kiy() { // from class: mlp
            @Override // defpackage.kiy
            public final void a() throws qrz {
                mki.a.g();
                qrn qrnVar2 = qrnVar;
                CarInfo carInfo2 = carInfo;
                ((qsz) qrnVar2).d().n(String.format("%s_%s_%s_%s", carInfo2.a, carInfo2.b, carInfo2.c, str), z);
            }
        }, "GH.EVSettingMgr", yzz.SETTINGS_EV, yzy.dZ, "Cannot access car", new Object[0]);
    }

    public static void c() {
    }

    public static CarInfo d(qrn qrnVar) {
        return (CarInfo) kgq.c(new kiz(qrnVar, 2), "GH.CarSettingsService", yzz.SETTINGS_EV, yzy.dZ, true, "Cannot access car", new Object[0]);
    }

    public static mnq e() {
        return (mnq) mki.a.i(mnq.class);
    }

    public static mno f() {
        return (mno) mki.a.i(mno.class);
    }

    public static void g(Intent intent) {
        intent.putExtra("EXTRA_STARTED_BY_DASHBOARD", true);
        mpe.a().i(intent);
    }

    public static eqj h(Context context, Uri uri, nef nefVar, Object obj, boolean z) {
        Duration duration;
        if (nefVar != null) {
            duration = nefVar.a;
        } else {
            duration = Duration.ZERO;
            duration.getClass();
        }
        return new nec(context, uri, obj, duration, nefVar != null ? nefVar.b : null, nee.a, z);
    }

    public static String i(bym bymVar) {
        return (String) bymVar.a();
    }

    public static void j(cfy cfyVar, nea neaVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(1228191168);
        int i3 = 1;
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                eru eruVarA = esh.a(buxVarC);
                if (eruVarA == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                neaVar = (nea) epq.e(affw.b(nea.class), eruVarA, null, null, ecw.g(eruVarA));
            } else {
                buxVarC.s();
            }
            buxVarC.l();
            Pattern patternCompile = Pattern.compile("(\\d{1,2}:)?\\d{2}:\\d{2}$");
            patternCompile.getClass();
            boolean zE = buxVarC.E(neaVar);
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new kyo(neaVar, 6);
                bvvVar.ad(objS);
            }
            yph yphVar = nea.a;
            kmc.a(neaVar, (mnd) objS, buxVarC, 8, 0);
            Object objS2 = bvvVar.S();
            Object obj = buw.a;
            if (objS2 == obj) {
                objS2 = new ngv(i3);
                bvvVar.ad(objS2);
            }
            cfy cfyVarK = ebj.k(cfyVar, (afdr) objS2);
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                objS3 = new asg();
                bvvVar.ad(objS3);
            }
            ca.at(cfyVarK, null, bxc.i(-56396680, true, new ndv(neaVar, patternCompile, 0), buxVarC), buxVarC, 3072, 6);
        } else {
            buxVarC.s();
        }
        nea neaVar2 = neaVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nad(cfyVar, neaVar2, i, 3, null);
        }
    }

    public static void k(CharSequence charSequence, CharSequence charSequence2, cfy cfyVar, afeh afehVar, mvs mvsVar, afdr afdrVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        avy avyVar;
        afeg afegVar;
        bvv bvvVar;
        afec afecVar;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-1471204726);
        if (i4 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(charSequence) : buxVarC.E(charSequence)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(charSequence2) : buxVarC.E(charSequence2)) ? 16 : 32;
        }
        int i5 = i2 | 384;
        if ((i & 3072) == 0) {
            i5 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i5 |= true != ((32768 & i) == 0 ? buxVarC.C(mvsVar) : buxVarC.E(mvsVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i5 |= true != buxVarC.E(afdrVar) ? 65536 : 131072;
        }
        int i6 = i5;
        if (buxVarC.I((i6 & 74899) != 74898, i6 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarC = awd.c(das.d(cfvVar, "mini_notification_card"), 1.0f);
            if (afdrVar != null) {
                cfyVarC = afp.x(cfyVarC, true, null, null, afdrVar);
            }
            cfy cfyVarA = cfyVarC.a(new aix(kfn.i(buxVarC).G(), ckq.a));
            float f = gjk.b.k;
            cfy cfyVarI = asl.I(cfyVarA, f, BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarA = avv.a(atd.g, cfl.n, buxVarC, 54);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            afeg afegVar2 = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar2);
            afeg afegVar3 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar3);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar4 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar4);
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar5 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar5);
            avy avyVar2 = avy.a;
            if (mvsVar != null) {
                buxVarC.v(-1944281695);
                afecVar = afecVar2;
                avyVar = avyVar2;
                afegVar = afegVar3;
                bvvVar = bvvVar2;
                mvy.d(mvsVar, "mini_action_1", false, awd.m(cfvVar, 124.0f), buxVarC, ((i6 >> 12) & 14) | 432);
                z = false;
                bvvVar.Y(false);
            } else {
                avyVar = avyVar2;
                afegVar = afegVar3;
                bvvVar = bvvVar2;
                afecVar = afecVar2;
                z = false;
                buxVarC.v(-1944078924);
                bvvVar.Y(false);
            }
            cfy cfyVarJ2 = asl.J(avyVar.b(cfvVar, 1.0f, z), mvsVar != null ? f : BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, afehVar == null ? BitmapDescriptorFactory.HUE_RED : f, BitmapDescriptorFactory.HUE_RED);
            ctp ctpVarA2 = atp.a(atd.e, cfl.j, buxVarC, 6);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ3 = bzi.j(buxVarC, cfyVarJ2);
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar2);
            byq.c(buxVarC, ccxVarAh2, afegVar);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar4);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ3, afegVar5);
            if (charSequence == null || charSequence.length() == 0) {
                i3 = 6;
                cfyVar2 = cfvVar;
                z2 = true;
                z3 = false;
                buxVarC.v(1129367230);
                bvvVar.Y(false);
            } else {
                buxVarC.v(1129139225);
                cfyVar2 = cfvVar;
                i3 = 6;
                z2 = true;
                z3 = false;
                brp.b(charSequence.toString(), null, kfn.i(buxVarC).s(), 0L, null, 0L, null, 0L, 2, false, 1, 0, czz.av(buxVarC).h, buxVarC, 0, 24960, 110586);
                buxVarC = buxVarC;
                bvvVar.Y(false);
            }
            if (charSequence2 == null || charSequence2.length() == 0) {
                buxVarC.v(1129658878);
                bvvVar.Y(z3);
            } else {
                buxVarC.v(1129422224);
                bux buxVar2 = buxVarC;
                brp.b(charSequence2.toString(), null, kfn.i(buxVarC).t(), 0L, null, 0L, null, 0L, 2, false, 1, 0, czz.av(buxVarC).k, buxVar2, 0, 24960, 110586);
                buxVarC = buxVar2;
                bvvVar.Y(z3);
            }
            bvvVar.Y(z2);
            if (afehVar != null) {
                buxVarC.v(-1943174964);
                afehVar.invoke(das.d(awd.i(cfyVar2, 64.0f), "mini_icon"), buxVarC, Integer.valueOf(i3 | ((i6 >> 6) & 112)));
                bvvVar.Y(z3);
            } else {
                buxVarC.v(-1943105772);
                bvvVar.Y(z3);
            }
            bvvVar.Y(z2);
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bpj(charSequence, charSequence2, cfyVar2, afehVar, mvsVar, afdrVar, i, 6);
        }
    }

    public static afec l(bym bymVar) {
        return (afec) bymVar.a();
    }

    public static afec m(bym bymVar) {
        return (afec) bymVar.a();
    }

    public static afec n(bym bymVar) {
        return (afec) bymVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(final defpackage.afdr r26, defpackage.cfy r27, long r28, long r30, defpackage.asw r32, defpackage.bux r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mlq.o(afdr, cfy, long, long, asw, bux, int, int):void");
    }

    public static void p(bux buxVar, int i) {
        bux buxVar2;
        bux buxVarC = buxVar.c(-1846415309);
        if (buxVarC.I(i != 0, i & 1)) {
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
            Context context = (Context) buxVarC.f(daa.b);
            boolean zE = buxVarC.E(context);
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new ooq(context, 2);
                bvvVar.ad(objS);
            }
            rl.c((afdr) objS, afp.E(awd.i(cfvVar, 40.0f), czz.at(buxVarC).H, bcr.a), false, null, null, ooi.b, buxVarC, 1572864, 60);
            asl.A(awd.m(cfvVar, f2 + gjk.c.k + BitmapDescriptorFactory.HUE_RED), buxVarC);
            buxVar2 = buxVarC;
            brp.b(vq.e(R.string.car_widgets, buxVarC), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVarC).g, 0L, 0L, die.l, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211), buxVar2, 0, 0, 131070);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gug(i, 11);
        }
    }

    public static void q(final afeg afegVar, final int i, final afdr afdrVar, final bwq bwqVar, int i2, final int i3, bux buxVar, int i4) {
        boolean z = true;
        cct cctVarI = bxc.i(-798070717, true, new gug(i2, 10), buxVar);
        boolean zC = buxVar.C(afegVar) | buxVar.A(i);
        if ((((i4 & 112) ^ 48) <= 32 || !buxVar.A(i3)) && (i4 & 48) != 32) {
            z = false;
        }
        boolean zC2 = zC | z | buxVar.C(afdrVar);
        Object objG = buxVar.g();
        if (zC2 || objG == buw.a) {
            afdr afdrVar2 = new afdr() { // from class: ooo
                @Override // defpackage.afdr
                public final Object invoke() {
                    afeg afegVar2 = afegVar;
                    int i5 = i3;
                    afegVar2.invoke(Integer.valueOf(i), Integer.valueOf(i5));
                    if (i5 == 0) {
                        afdrVar.invoke();
                    }
                    bwqVar.b(Boolean.valueOf(false));
                    return afak.a;
                }
            };
            buxVar.x(afdrVar2);
            objG = afdrVar2;
        }
        bmj.b(cctVarI, (afdr) objG, null, false, null, null, buxVar, 6);
    }

    public static void r(afdr afdrVar, afdr afdrVar2, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        afdrVar.getClass();
        afdrVar2.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1852058496);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.E(afdrVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar2) ? 16 : 32;
        }
        int i4 = 18;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            buxVar2 = buxVarC;
            vq.a(afdrVar, bxc.i(-94466360, true, new njg(afdrVar2, 17), buxVarC), null, bxc.i(291396042, true, new njg(afdrVar, i4), buxVarC), ooi.g, ooi.h, ooi.i, null, 0L, 0L, 0L, 0L, null, buxVar2, (i2 & 14) | 1797168, 0, 16260);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nzv(afdrVar, afdrVar2, i, 2, null);
        }
    }

    public static void s(afdr afdrVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        afdrVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(554483079);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.E(afdrVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            buxVar2 = buxVarC;
            vq.a(afdrVar, bxc.i(-1667769393, true, new njg(afdrVar, 16), buxVarC), null, null, ooi.k, ooi.l, ooi.m, null, 0L, 0L, 0L, 0L, null, buxVar2, (i2 & 14) | 1794096, 0, 16268);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nqo(afdrVar, i, 5);
        }
    }

    public static void t(axr axrVar, int i, int i2, afeg afegVar) {
        if (i == axrVar.b() || i2 == axrVar.b()) {
            axrVar.j(axrVar.b(), axrVar.c());
        }
        afegVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static void u(afdr afdrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        afdr afdrVar2 = afdrVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-489337900);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afdrVar2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfy cfyVarC = awd.c(cfyVar, 1.0f);
            asx asxVar = atd.e;
            ctp ctpVarA = atp.a(asxVar, cfl.k, buxVarC, 54);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarC);
            afdr afdrVar3 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar3);
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
            cfn cfnVar = cfl.e;
            cfv cfvVar = cfy.e;
            ctp ctpVarB = atk.b(cfnVar, false);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfvVar);
            buxVarC.w();
            int i4 = i2;
            if (bvvVar.t) {
                buxVarC.j(afdrVar3);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, afegVar);
            byq.c(buxVarC, ccxVarAh2, afegVar2);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar4);
            ca.bb(dao.b(R.drawable.rounded_star, buxVarC, 0), null, awd.k(cfvVar, 144.0f, 160.0f), null, null, BitmapDescriptorFactory.HUE_RED, new cjp(czz.at(buxVarC).D, 5), buxVarC, 440, 56);
            boc.a(dao.b(R.drawable.gs_widgets_vd_theme_24, buxVarC, 0), null, awd.i(cfvVar, 64.0f), czz.at(buxVarC).s, buxVarC, 440, 0);
            bvvVar.Y(true);
            float f = gjk.e.k;
            asl.A(awd.d(cfvVar, f), buxVarC);
            brp.b(vq.e(R.string.no_widgets_title, buxVarC), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVarC).h, 0L, 0L, die.m, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744443), buxVarC, 0, 0, 131070);
            asl.A(awd.d(cfvVar, gjk.b.k), buxVarC);
            brp.b(vq.e(R.string.no_widgets_subtext, buxVarC), asl.I(cfvVar, f, BitmapDescriptorFactory.HUE_RED), 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, dfw.v(czz.av(buxVarC).k, czz.at(buxVarC).s, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 16744446), buxVarC, 0, 0, 131068);
            asl.A(awd.d(cfvVar, f), buxVarC);
            afdrVar2 = afdrVar;
            o(afdrVar2, null, czz.at(buxVarC).a, czz.at(buxVarC).b, asxVar, buxVarC, (i4 & 14) | 24576, 2);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nzv(afdrVar2, cfyVar, i, 3);
        }
    }

    public static void v(oqc oqcVar, afec afecVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        afec afecVar2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1935852483);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(oqcVar) : buxVarC.E(oqcVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            afecVar2 = afecVar;
            i2 |= true != buxVarC.E(afecVar2) ? 16 : 32;
        } else {
            afecVar2 = afecVar;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        int i4 = i2;
        if (buxVarC.I((i4 & 147) != 146, i4 & 1)) {
            bym bymVarF = bxc.f(oqcVar.a, afbe.a, buxVarC);
            bym bymVarF2 = bxc.f(oqcVar.b, -1, buxVarC);
            axr axrVarA = axs.a(buxVarC);
            Integer numValueOf = Integer.valueOf(((Number) bymVarF2.a()).intValue());
            Integer numValueOf2 = Integer.valueOf(roc.ag(bymVarF).size());
            boolean zC = buxVarC.C(bymVarF2) | buxVarC.C(bymVarF) | buxVarC.C(axrVarA);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                bqi bqiVar = new bqi(axrVarA, bymVarF2, bymVarF, (afck) null, 15);
                bvvVar.ad(bqiVar);
                objS = bqiVar;
            }
            bvq.f(numValueOf, numValueOf2, (afeg) objS, buxVarC);
            asx asxVarG = atd.g(2.0f);
            boolean zC2 = buxVarC.C(bymVarF) | buxVarC.C(bymVarF2) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && buxVarC.E(oqcVar))) | buxVarC.C(axrVarA);
            boolean z = (i4 & 112) == 32;
            Object objS2 = bvvVar.S();
            if ((zC2 | z) || objS2 == buw.a) {
                nze nzeVar = new nze(bymVarF, oqcVar, axrVarA, afecVar2, bymVarF2, 3);
                bvvVar.ad(nzeVar);
                objS2 = nzeVar;
            }
            buxVar2 = buxVarC;
            awx.c(cfyVar, axrVarA, null, asxVarG, null, null, false, null, (afec) objS2, buxVar2, ((i4 >> 6) & 14) | 24576, 492);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg((Object) oqcVar, (Object) afecVar, cfyVar, i, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9, types: [boolean, int] */
    public static void w(oqb oqbVar, boolean z, cfy cfyVar, bux buxVar, int i) {
        int i2;
        afeg afegVar;
        afeg afegVar2;
        afec afecVar;
        avy avyVar;
        afeg afegVar3;
        afdr afdrVar;
        ?? r5;
        bvv bvvVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(173242205);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(oqbVar) : buxVarC.E(oqbVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
            bvv bvvVar2 = (bvv) buxVarC;
            int iG = a.g(bvvVar2.u);
            ccx ccxVarAh = bvvVar2.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar2 = cwb.a;
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar2);
            } else {
                buxVarC.y();
            }
            afeg afegVar4 = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar4);
            afeg afegVar5 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar5);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar6 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar6);
            afec afecVar2 = cwb.g;
            byq.b(buxVarC, afecVar2);
            afeg afegVar7 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar7);
            AppWidgetProviderInfo appWidgetProviderInfo = oqbVar.b;
            avy avyVar2 = avy.a;
            if (appWidgetProviderInfo == null) {
                buxVarC.v(447245847);
                bvvVar2.Y(false);
                afegVar2 = afegVar6;
                afecVar = afecVar2;
                afdrVar = afdrVar2;
                afegVar = afegVar7;
                avyVar = avyVar2;
                r5 = 0;
                afegVar3 = afegVar4;
            } else {
                buxVarC.v(447245848);
                opi opiVar = oqbVar.a() ? new opi(oqbVar.a, appWidgetProviderInfo) : null;
                cfv cfvVar = cfy.e;
                afegVar = afegVar7;
                afegVar2 = afegVar6;
                afecVar = afecVar2;
                opi opiVar2 = opiVar;
                avyVar = avyVar2;
                afegVar3 = afegVar4;
                afdrVar = afdrVar2;
                mva.P(appWidgetProviderInfo, awd.i(cfvVar, 80.0f), opiVar2, false, null, buxVarC, 3632, 16);
                asl.A(awd.m(cfvVar, gjk.c.k), buxVarC);
                r5 = 0;
                bvvVar2.Y(false);
            }
            cfy cfyVarB = avyVar.b(cfy.e, 1.0f, r5);
            ctp ctpVarA2 = atp.a(atd.c, cfl.j, buxVarC, r5);
            int iG2 = a.g(bvvVar2.u);
            ccx ccxVarAh2 = bvvVar2.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarB);
            buxVarC.w();
            if (bvvVar2.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA2, afegVar3);
            byq.c(buxVarC, ccxVarAh2, afegVar5);
            byq.c(buxVarC, Integer.valueOf(iG2), afegVar2);
            byq.b(buxVarC, afecVar);
            byq.c(buxVarC, cfyVarJ2, afegVar);
            if (oqbVar.a()) {
                buxVarC.v(-1871778279);
                bvv bvvVar3 = bvvVar2;
                brp.b(vq.e(R.string.custom_widget, buxVarC), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVarC).h, buxVarC, 0, 0, 131070);
                buxVarC = buxVarC;
                bvvVar3.Y(r5);
                bvvVar = bvvVar3;
            } else {
                bvv bvvVar4 = bvvVar2;
                buxVarC.v(-1871621388);
                brp.b(oqbVar.d, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVarC).h, buxVarC, 0, 0, 131070);
                brp.b(oqbVar.c, null, czz.at(buxVarC).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVarC).k, buxVarC, 0, 0, 131066);
                buxVarC = buxVarC;
                if (z) {
                    buxVarC.v(-1871344868);
                    mva.y(null, null, buxVarC, r5, 3);
                    bvvVar4.Y(r5);
                } else {
                    buxVarC.v(-1871299701);
                    bvvVar4.Y(r5);
                }
                bvvVar4.Y(r5);
                bvvVar = bvvVar4;
            }
            bvvVar.Y(true);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvo(oqbVar, z, cfyVar, i, 11);
        }
    }

    public static void x(final oqb oqbVar, final int i, final int i2, final axr axrVar, final afeg afegVar, final afdr afdrVar, final afdr afdrVar2, cfy cfyVar, bux buxVar, int i3) {
        int i4;
        final boolean zJ;
        byd bydVar;
        Object oowVar;
        afak afakVar;
        bux buxVar2;
        byd bydVar2;
        boolean z;
        boolean z2;
        bym bymVar;
        byd bydVar3;
        bwq bwqVar;
        byb bybVar;
        axrVar.getClass();
        afegVar.getClass();
        afdrVar.getClass();
        afdrVar2.getClass();
        int i5 = i3 & 6;
        bux buxVarC = buxVar.c(-1052506797);
        if (i5 == 0) {
            i4 = (true != ((i3 & 8) == 0 ? buxVarC.C(oqbVar) : buxVarC.E(oqbVar)) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != buxVarC.A(i2) ? 128 : 256;
        }
        if ((i3 & 3072) == 0) {
            i4 |= true != buxVarC.C(axrVar) ? 1024 : 2048;
        }
        if ((i3 & 24576) == 0) {
            i4 |= true != buxVarC.E(afegVar) ? 8192 : 16384;
        }
        if ((196608 & i3) == 0) {
            i4 |= true != buxVarC.E(afdrVar) ? 65536 : 131072;
        }
        if ((1572864 & i3) == 0) {
            i4 |= true != buxVarC.E(afdrVar2) ? 524288 : 1048576;
        }
        if ((12582912 & i3) == 0) {
            i4 |= true != buxVarC.C(cfyVar) ? 4194304 : 8388608;
        }
        if (buxVarC.I((4793491 & i4) != 4793490, i4 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new ParcelableSnapshotMutableFloatState(BitmapDescriptorFactory.HUE_RED);
                bvvVar.ad(objS);
            }
            byb bybVar2 = (byb) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new ParcelableSnapshotMutableIntState(0);
                bvvVar.ad(objS2);
            }
            byd bydVar4 = (byd) objS2;
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                objS3 = new ParcelableSnapshotMutableIntState(i);
                bvvVar.ad(objS3);
            }
            byd bydVar5 = (byd) objS3;
            Object objS4 = bvvVar.S();
            if (objS4 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS4 = parcelableSnapshotMutableState;
            }
            final bwq bwqVar2 = (bwq) objS4;
            bym bymVarC = byx.c(Integer.valueOf(i), buxVarC);
            kwp kwpVar = (kwp) buxVarC.f(dbc.g);
            final bym bymVarB = ady.b(true != ((Boolean) bwqVar2.a()).booleanValue() ? 1.0f : 1.03f, new aft(1.0f, 1500.0f, null), null, null, buxVarC, 48, 28);
            final float fE = (!((Boolean) bwqVar2.a()).booleanValue() || bydVar4.e() <= 0) ? 0.0f : bybVar2.e() - ((((Number) bymVarC.a()).intValue() - bydVar5.e()) * bydVar4.e());
            float f = true != ((Boolean) bwqVar2.a()).booleanValue() ? 0.0f : 1.0f;
            bcm bcmVarB = i2 == 1 ? bcr.b(20.0f) : i == 0 ? bcr.c(20.0f, 20.0f, 4.0f, 4.0f) : i == i2 + (-1) ? bcr.c(4.0f, 4.0f, 20.0f, 20.0f) : bcr.b(4.0f);
            AppWidgetProviderInfo appWidgetProviderInfo = oqbVar.b;
            if (appWidgetProviderInfo != null) {
                opr oprVarA = opr.a.a();
                ComponentName componentName = appWidgetProviderInfo.provider;
                componentName.getClass();
                zJ = oprVarA.j(componentName);
            } else {
                zJ = false;
            }
            cfy cfyVarB = vq.b(awd.r(cfyVar), f);
            boolean z3 = buxVarC.z(fE) | buxVarC.C(bymVarB) | buxVarC.D(zJ);
            Object objS5 = bvvVar.S();
            if (z3 || objS5 == obj) {
                objS5 = new afec() { // from class: ook
                    @Override // defpackage.afec
                    public final Object invoke(Object obj2) {
                        float f2;
                        cks cksVar = (cks) obj2;
                        cksVar.getClass();
                        cksVar.G(fE);
                        if (((Boolean) bwqVar2.a()).booleanValue()) {
                            float fA = cksVar.a();
                            f2 = fA + fA;
                        } else {
                            f2 = BitmapDescriptorFactory.HUE_RED;
                        }
                        bym bymVar2 = bymVarB;
                        boolean z4 = zJ;
                        cksVar.B(f2);
                        cksVar.z(((Number) bymVar2.a()).floatValue());
                        cksVar.A(((Number) bymVar2.a()).floatValue());
                        cksVar.o(true != z4 ? 1.0f : 0.6f);
                        return afak.a;
                    }
                };
                bvvVar.ad(objS5);
            }
            cfy cfyVarI = asl.I(cjn.f(cfyVarB, (afec) objS5), gjk.d.k, BitmapDescriptorFactory.HUE_RED);
            Object objS6 = bvvVar.S();
            if (objS6 == obj) {
                bydVar = bydVar4;
                objS6 = new nzf(bydVar, 8);
                bvvVar.ad(objS6);
            } else {
                bydVar = bydVar4;
            }
            cfy cfyVarF = tt.f(cfyVarI, (afec) objS6);
            afak afakVar2 = afak.a;
            boolean zD = buxVarC.D(zJ) | buxVarC.E(kwpVar) | buxVarC.C(bymVarC);
            boolean z4 = (i4 & 896) == 256;
            boolean z5 = (i4 & 7168) == 2048;
            boolean z6 = (i4 & 57344) == 16384;
            Object objS7 = bvvVar.S();
            if (((z5 | zD | z4) || z6) || objS7 == obj) {
                afakVar = afakVar2;
                buxVar2 = buxVarC;
                bydVar2 = bydVar;
                boolean z7 = zJ;
                z = true;
                oowVar = new oow(z7, kwpVar, bymVarC, bydVar5, bybVar2, bwqVar2, i2, axrVar, afegVar, bydVar2);
                z2 = z7;
                bymVar = bymVarC;
                bydVar3 = bydVar5;
                bwqVar = bwqVar2;
                bybVar = bybVar2;
                bvvVar.ad(oowVar);
            } else {
                oowVar = objS7;
                afakVar = afakVar2;
                bwqVar = bwqVar2;
                buxVar2 = buxVarC;
                bydVar2 = bydVar;
                z2 = zJ;
                bymVar = bymVarC;
                bybVar = bybVar2;
                bydVar3 = bydVar5;
                z = true;
            }
            cfy cfyVarA = crh.a(cfyVarF, afakVar, (PointerInputEventHandler) oowVar);
            bux buxVar3 = buxVar2;
            bmv bmvVarC = vs.c(czz.at(buxVar2).D, 0L, buxVar3, 14);
            final byd bydVar6 = bydVar3;
            final bwq bwqVar3 = bwqVar;
            final bym bymVar2 = bymVar;
            final byd bydVar7 = bydVar2;
            final byb bybVar3 = bybVar;
            final boolean z8 = z2;
            vy.a(cfyVarA, bcmVarB, bmvVarC, null, null, bxc.i(-1357076959, z, new afeh() { // from class: ool
                @Override // defpackage.afeh
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    avy avyVar;
                    int i6;
                    ool oolVar;
                    Object obj5;
                    cfy cfyVarX;
                    bux buxVar4;
                    boolean z9;
                    oqb oqbVar2;
                    bux buxVar5;
                    bux buxVar6 = (bux) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((ats) obj2).getClass();
                    if (buxVar6.I((iIntValue & 17) != 16, iIntValue & 1)) {
                        cfv cfvVar = cfy.e;
                        cfy cfyVarR = awd.r(cfvVar);
                        float f2 = gjk.d.k;
                        float f3 = gjk.c.k;
                        cfy cfyVarI2 = asl.I(cfyVarR, f2, f3);
                        asx asxVar = atd.g;
                        cfr cfrVar = cfl.n;
                        ctp ctpVarA = avv.a(asxVar, cfrVar, buxVar6, 54);
                        int iG = a.g(buxVar6.b());
                        ccx ccxVarN = buxVar6.N();
                        cfy cfyVarJ = bzi.j(buxVar6, cfyVarI2);
                        afdr afdrVar3 = cwb.a;
                        buxVar6.M();
                        buxVar6.w();
                        if (buxVar6.G()) {
                            buxVar6.j(afdrVar3);
                        } else {
                            buxVar6.y();
                        }
                        byb bybVar4 = bybVar3;
                        byd bydVar8 = bydVar7;
                        byd bydVar9 = bydVar6;
                        bym bymVar3 = bymVar2;
                        afeg afegVar2 = cwb.e;
                        byq.c(buxVar6, ctpVarA, afegVar2);
                        afeg afegVar3 = cwb.d;
                        byq.c(buxVar6, ccxVarN, afegVar3);
                        Integer numValueOf = Integer.valueOf(iG);
                        afeg afegVar4 = cwb.f;
                        byq.c(buxVar6, numValueOf, afegVar4);
                        afec afecVar = cwb.g;
                        byq.b(buxVar6, afecVar);
                        afeg afegVar5 = cwb.c;
                        byq.c(buxVar6, cfyVarJ, afegVar5);
                        avy avyVar2 = avy.a;
                        int iIntValue2 = ((Number) bymVar3.a()).intValue();
                        int iE = bydVar9.e();
                        int iE2 = bydVar8.e();
                        float fE2 = bybVar4.e();
                        Object objG = buxVar6.g();
                        Object obj6 = buw.a;
                        if (objG == obj6) {
                            avyVar = avyVar2;
                            i6 = iE;
                            nzf nzfVar = new nzf(bwqVar3, 9);
                            buxVar6.x(nzfVar);
                            objG = nzfVar;
                        } else {
                            avyVar = avyVar2;
                            i6 = iE;
                        }
                        afec afecVar2 = (afec) objG;
                        Object objG2 = buxVar6.g();
                        if (objG2 == obj6) {
                            objG2 = new nzf(bybVar4, 10);
                            buxVar6.x(objG2);
                        }
                        afec afecVar3 = (afec) objG2;
                        Object objG3 = buxVar6.g();
                        if (objG3 == obj6) {
                            objG3 = new nzf(bydVar9, 11);
                            buxVar6.x(objG3);
                        }
                        oqb oqbVar3 = oqbVar;
                        afeg afegVar6 = afegVar;
                        axr axrVar2 = axrVar;
                        int i7 = i2;
                        avy avyVar3 = avyVar;
                        mlq.y(iIntValue2, i6, i7, iE2, fE2, axrVar2, afegVar6, afecVar2, afecVar3, (afec) objG3, null, buxVar6, 918552576, 0);
                        cfy cfyVarB2 = avyVar3.b(cfvVar, 1.0f, true);
                        if (oqbVar3.b()) {
                            oolVar = this;
                            afdr afdrVar4 = afdrVar2;
                            buxVar6.v(-1697127779);
                            boolean zC = buxVar6.C(afdrVar4);
                            Object objG4 = buxVar6.g();
                            obj5 = obj6;
                            if (zC || objG4 == obj5) {
                                objG4 = new nxb(afdrVar4, 20);
                                buxVar6.x(objG4);
                            }
                            cfyVarX = afp.x(cfvVar, true, null, null, (afdr) objG4);
                            buxVar6.o();
                        } else {
                            oolVar = this;
                            obj5 = obj6;
                            buxVar6.v(-1697051333);
                            buxVar6.o();
                            cfyVarX = cfvVar;
                        }
                        cfy cfyVarA2 = cfyVarB2.a(cfyVarX);
                        ctp ctpVarA2 = avv.a(atd.a, cfrVar, buxVar6, 48);
                        int iG2 = a.g(buxVar6.b());
                        ccx ccxVarN2 = buxVar6.N();
                        cfy cfyVarJ2 = bzi.j(buxVar6, cfyVarA2);
                        buxVar6.M();
                        buxVar6.w();
                        if (buxVar6.G()) {
                            buxVar6.j(afdrVar3);
                        } else {
                            buxVar6.y();
                        }
                        boolean z10 = z8;
                        byq.c(buxVar6, ctpVarA2, afegVar2);
                        byq.c(buxVar6, ccxVarN2, afegVar3);
                        byq.c(buxVar6, Integer.valueOf(iG2), afegVar4);
                        byq.b(buxVar6, afecVar);
                        byq.c(buxVar6, cfyVarJ2, afegVar5);
                        mlq.w(oqbVar3, z10, avyVar3.b(cfvVar, 1.0f, true), buxVar6, 8);
                        if (oqbVar3.b()) {
                            buxVar6.v(991526147);
                            z9 = false;
                            oqbVar2 = oqbVar3;
                            boc.a(dao.b(true != oqbVar3.a() ? R.drawable.gs_chevron_right_vd_theme_24 : R.drawable.gs_pen_spark_vd_theme_24, buxVar6, 0), null, asl.I(cfvVar, f3, BitmapDescriptorFactory.HUE_RED), 0L, buxVar6, 56, 8);
                            buxVar4 = buxVar6;
                            buxVar4.o();
                        } else {
                            buxVar4 = buxVar6;
                            z9 = false;
                            oqbVar2 = oqbVar3;
                            buxVar4.v(991931689);
                            buxVar4.o();
                        }
                        buxVar4.n();
                        if (oqbVar2.b()) {
                            buxVar4.v(-1696272489);
                            xb.b(awd.d(cfvVar, 32.0f), BitmapDescriptorFactory.HUE_RED, czz.at(buxVar4).A, buxVar4, 6, 2);
                            buxVar5 = buxVar4;
                            buxVar5.o();
                        } else {
                            buxVar5 = buxVar4;
                            buxVar5.v(-1696136027);
                            buxVar5.o();
                        }
                        int i8 = i;
                        boolean z11 = i8 == i7 + (-1) ? true : z9;
                        boolean zC2 = buxVar5.C(axrVar2) | buxVar5.C(afegVar6);
                        Object objG5 = buxVar5.g();
                        if (zC2 || objG5 == obj5) {
                            objG5 = new mxw(axrVar2, afegVar6, 10);
                            buxVar5.x(objG5);
                        }
                        afeg afegVar7 = (afeg) objG5;
                        boolean zC3 = buxVar5.C(axrVar2);
                        Object objG6 = buxVar5.g();
                        if (zC3 || objG6 == obj5) {
                            objG6 = new ooq(axrVar2, 1);
                            buxVar5.x(objG6);
                        }
                        mlq.z(i8, z11, afegVar7, afdrVar, (afdr) objG6, null, buxVar5, 0);
                        buxVar5.n();
                    } else {
                        buxVar6.s();
                    }
                    return afak.a;
                }
            }, buxVar3), buxVar3, 196608, 24);
            buxVarC = buxVar3;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new oom(oqbVar, i, i2, axrVar, afegVar, afdrVar, afdrVar2, cfyVar, i3, 0);
        }
    }

    public static void y(final int i, final int i2, final int i3, final int i4, final float f, final axr axrVar, final afeg afegVar, final afec afecVar, final afec afecVar2, final afec afecVar3, cfy cfyVar, bux buxVar, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        float f2;
        axr axrVar2;
        bux buxVar2;
        final cfy cfyVar2;
        bux buxVar3;
        afecVar.getClass();
        afecVar2.getClass();
        afecVar3.getClass();
        int i11 = i5 & 6;
        bux buxVarC = buxVar.c(-1090074665);
        if (i11 == 0) {
            i7 = (true != buxVarC.A(i) ? 2 : 4) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i8 = i2;
            i7 |= true != buxVarC.A(i8) ? 16 : 32;
        } else {
            i8 = i2;
        }
        if ((i5 & 384) == 0) {
            i9 = i3;
            i7 |= true != buxVarC.A(i9) ? 128 : 256;
        } else {
            i9 = i3;
        }
        if ((i5 & 3072) == 0) {
            i10 = i4;
            i7 |= true != buxVarC.A(i10) ? 1024 : 2048;
        } else {
            i10 = i4;
        }
        if ((i5 & 24576) == 0) {
            f2 = f;
            i7 |= true != buxVarC.z(f2) ? 8192 : 16384;
        } else {
            f2 = f;
        }
        if ((196608 & i5) == 0) {
            axrVar2 = axrVar;
            i7 |= true != buxVarC.C(axrVar2) ? 65536 : 131072;
        } else {
            axrVar2 = axrVar;
        }
        if ((1572864 & i5) == 0) {
            i7 |= true != buxVarC.E(afegVar) ? 524288 : 1048576;
        }
        if ((12582912 & i5) == 0) {
            i7 |= true != buxVarC.E(afecVar) ? 4194304 : 8388608;
        }
        if ((100663296 & i5) == 0) {
            i7 |= true != buxVarC.E(afecVar2) ? 33554432 : 67108864;
        }
        if ((805306368 & i5) == 0) {
            i7 |= true != buxVarC.E(afecVar3) ? 268435456 : 536870912;
        }
        if (buxVarC.I(((i7 & 306783379) == 306783378 && ((i6 | 6) & 3) == 2) ? false : true, i7 & 1)) {
            cfv cfvVar = cfy.e;
            bym bymVarC = byx.c(Integer.valueOf(i), buxVarC);
            bym bymVarC2 = byx.c(Integer.valueOf(i8), buxVarC);
            bym bymVarC3 = byx.c(Integer.valueOf(i9), buxVarC);
            int i12 = i7;
            bym bymVarC4 = byx.c(Integer.valueOf(i10), buxVarC);
            bym bymVarC5 = byx.c(Float.valueOf(f2), buxVarC);
            bym bymVarC6 = byx.c(afegVar, buxVarC);
            bym bymVarC7 = byx.c(afecVar, buxVarC);
            bym bymVarC8 = byx.c(afecVar2, buxVarC);
            bym bymVarC9 = byx.c(afecVar3, buxVarC);
            kwp kwpVar = (kwp) buxVarC.f(dbc.g);
            cmw cmwVarB = dao.b(R.drawable.gs_drag_handle_vd_theme_24, buxVarC, 0);
            cfy cfyVarJ = asl.J(cfvVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gjk.b.k, BitmapDescriptorFactory.HUE_RED);
            afak afakVar = afak.a;
            boolean zC = buxVarC.C(bymVarC6) | buxVarC.E(kwpVar) | buxVarC.C(bymVarC9) | buxVarC.C(bymVarC) | buxVarC.C(bymVarC8) | buxVarC.C(bymVarC7) | buxVarC.C(bymVarC5) | buxVarC.C(bymVarC4) | buxVarC.C(bymVarC2) | buxVarC.C(bymVarC3) | ((i12 & 458752) == 131072);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC) {
                buxVar3 = buxVarC;
            } else {
                buxVar3 = buxVarC;
                if (objS == buw.a) {
                }
                buxVar2 = buxVar3;
                boc.a(cmwVarB, null, crh.a(cfyVarJ, afakVar, (PointerInputEventHandler) objS), 0L, buxVar2, 56, 8);
                cfyVar2 = cfvVar;
            }
            objS = new oou(kwpVar, bymVarC9, bymVarC, bymVarC8, bymVarC7, axrVar2, bymVarC5, bymVarC4, bymVarC2, bymVarC3, bymVarC6);
            bvvVar.ad(objS);
            buxVar2 = buxVar3;
            boc.a(cmwVarB, null, crh.a(cfyVarJ, afakVar, (PointerInputEventHandler) objS), 0L, buxVar2, 56, 8);
            cfyVar2 = cfvVar;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: oop
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i13 = i;
                    int i14 = i2;
                    int i15 = i3;
                    int i16 = i4;
                    float f3 = f;
                    axr axrVar3 = axrVar;
                    afeg afegVar2 = afegVar;
                    int i17 = i5;
                    afec afecVar4 = afecVar;
                    int i18 = i6;
                    int i19 = i17 | 1;
                    int i20 = i18 & 306783378;
                    int i21 = 306783378 & i19;
                    afec afecVar5 = afecVar3;
                    int i22 = i18 & 613566756;
                    int i23 = i19 & 613566756;
                    cfy cfyVar3 = cfyVar2;
                    mlq.y(i13, i14, i15, i16, f3, axrVar3, afegVar2, afecVar4, afecVar2, afecVar5, cfyVar3, (bux) obj, (i19 & (-920350135)) | i21 | (i23 >> 1) | ((i21 + i21) & i23), (i18 & (-920350135)) | i20 | (i22 >> 1) | ((i20 + i20) & i22));
                    return afak.a;
                }
            };
        }
    }

    public static void z(final int i, final boolean z, afeg afegVar, afdr afdrVar, afdr afdrVar2, cfy cfyVar, bux buxVar, int i2) {
        int i3;
        afeg afegVar2;
        afdr afdrVar3;
        bwq bwqVar;
        afegVar.getClass();
        afdrVar2.getClass();
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-1221063693);
        if (i4 == 0) {
            i3 = (true != buxVarC.A(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            afegVar2 = afegVar;
            i3 |= true != buxVarC.E(afegVar2) ? 128 : 256;
        } else {
            afegVar2 = afegVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != buxVarC.E(afdrVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            afdrVar3 = afdrVar2;
            i3 |= true != buxVarC.E(afdrVar3) ? 8192 : 16384;
        } else {
            afdrVar3 = afdrVar2;
        }
        int i5 = i3 | 196608;
        if (buxVarC.I((74899 & i5) != 74898, i5 & 1)) {
            cfv cfvVar = cfy.e;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar2 = (bwq) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(false, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState2);
                objS2 = parcelableSnapshotMutableState2;
            }
            final bwq bwqVar3 = (bwq) objS2;
            ctp ctpVarB = atk.b(cfl.a, false);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar);
            afdr afdrVar4 = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar4);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            Object objS3 = bvvVar.S();
            if (objS3 == obj) {
                objS3 = new nxb(bwqVar2, 19);
                bvvVar.ad(objS3);
            }
            cfyVar = cfvVar;
            int i6 = 0;
            rl.c((afdr) objS3, null, false, null, null, ooi.c, buxVarC, 1572870, 62);
            boolean zBooleanValue = ((Boolean) bwqVar2.a()).booleanValue();
            Object objS4 = bvvVar.S();
            if (objS4 == obj) {
                bwqVar = bwqVar2;
                objS4 = new ooq(bwqVar, i6);
                bvvVar.ad(objS4);
            } else {
                bwqVar = bwqVar2;
            }
            final afeg afegVar3 = afegVar2;
            final afdr afdrVar5 = afdrVar3;
            final bwq bwqVar4 = bwqVar;
            bmj.a(zBooleanValue, (afdr) objS4, null, 0L, null, null, bcr.b(8.0f), 0L, BitmapDescriptorFactory.HUE_RED, bxc.i(313963048, true, new afeh() { // from class: oos
                @Override // defpackage.afeh
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    bux buxVar2 = (bux) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((ats) obj2).getClass();
                    if (buxVar2.I((iIntValue & 17) != 16, iIntValue & 1)) {
                        bwq bwqVar5 = bwqVar4;
                        afdr afdrVar6 = afdrVar5;
                        afeg afegVar4 = afegVar3;
                        int i7 = i;
                        if (i7 > 1) {
                            buxVar2.v(-1165552507);
                            mlq.q(afegVar4, i7, afdrVar6, bwqVar5, R.string.move_to_top, 0, buxVar2, 48);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-1165501574);
                            buxVar2.o();
                        }
                        if (i7 != 0) {
                            buxVar2.v(-1165478975);
                            mlq.q(afegVar4, i7, afdrVar6, bwqVar5, R.string.move_up, i7 - 1, buxVar2, 0);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-1165424198);
                            buxVar2.o();
                        }
                        if (z) {
                            buxVar2.v(-1165345830);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-1165402529);
                            mlq.q(afegVar4, i7, afdrVar6, bwqVar5, R.string.move_down, i7 + 1, buxVar2, 0);
                            buxVar2.o();
                        }
                        afeg afegVar5 = ooi.d;
                        Object objG = buxVar2.g();
                        if (objG == buw.a) {
                            objG = new nlh(bwqVar5, bwqVar3, 19);
                            buxVar2.x(objG);
                        }
                        bmj.b(afegVar5, (afdr) objG, null, false, null, null, buxVar2, 54);
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 48, 48);
            buxVarC = buxVarC;
            bvvVar.Y(true);
            if (((Boolean) bwqVar3.a()).booleanValue()) {
                buxVarC.v(1665942603);
                Object objS5 = bvvVar.S();
                if (objS5 == obj) {
                    objS5 = new ooq(bwqVar3, 3);
                    bvvVar.ad(objS5);
                }
                int i7 = i5 & 7168;
                afdr afdrVar6 = (afdr) objS5;
                Object objS6 = bvvVar.S();
                if (i7 == 2048 || objS6 == obj) {
                    objS6 = new nlh(afdrVar, bwqVar3, 20, null);
                    bvvVar.ad(objS6);
                }
                r(afdrVar6, (afdr) objS6, buxVarC, 6);
                bvvVar.Y(false);
            } else {
                buxVarC.v(1666100207);
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        cfy cfyVar2 = cfyVar;
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gvu(i, z, afegVar, afdrVar, afdrVar2, cfyVar2, i2, 7);
        }
    }

    public final int O(Context context, int i) {
        return P(4.5d, i, context.getResources().getColor(R.color.gearhead_sdk_tint_light), context.getResources().getColor(R.color.gearhead_sdk_tint_dark));
    }

    public final int P(double d, int i, int... iArr) {
        for (int i2 = 0; i2 < 2; i2++) {
            int i3 = iArr[i2];
            if (R(i, i3) >= d) {
                return i3;
            }
        }
        if (R(i, -1) >= R(i, -16777216)) {
            Log.w("GH.ColorChecker", "Tint color does not meet contrast requirements. Using white.");
            return -1;
        }
        Log.w("GH.ColorChecker", "Tint color does not meet contrast requirements. Using black.");
        return -16777216;
    }

    public mlq(byte[] bArr) {
    }

    public void C() {
    }

    public void D() {
    }

    public void E() {
    }

    public void F() {
    }

    public void G() {
    }

    public void H() {
    }

    public void I() {
    }
}
