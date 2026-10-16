package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.ClickableSpan;
import androidx.car.app.model.ForegroundCarColorSpan;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class fwl {
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(final defpackage.fwm r24, defpackage.cfy r25, defpackage.hjw r26, boolean r27, defpackage.ckv r28, defpackage.asf r29, defpackage.dlj r30, defpackage.dlj r31, defpackage.bux r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwl.a(fwm, cfy, hjw, boolean, ckv, asf, dlj, dlj, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(final defpackage.fxo r25, final defpackage.fwx r26, defpackage.cfy r27, defpackage.hjw r28, boolean r29, defpackage.ckv r30, defpackage.asf r31, defpackage.dlj r32, defpackage.dlj r33, defpackage.bux r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwl.b(fxo, fwx, cfy, hjw, boolean, ckv, asf, dlj, dlj, bux, int, int):void");
    }

    public static boolean c(fwm fwmVar) {
        fwmVar.getClass();
        fwi fwiVar = fwmVar.a;
        if (fwiVar != null) {
            return !fwiVar.b().a();
        }
        fxo fxoVar = fwmVar.b;
        if (fxoVar == null) {
            return false;
        }
        gcq gcqVarA = fxoVar.a();
        return gcqVarA == null || !gcqVarA.a.a();
    }

    public static gff d(geu geuVar, int i) {
        return new gff(geuVar, new CarIcon(new tj(IconCompat.m(geuVar, i))), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fwi e(defpackage.fvv r28, defpackage.geu r29, defpackage.fwh r30, defpackage.fwe r31, defpackage.hls r32, boolean r33, int r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwl.e(fvv, geu, fwh, fwe, hls, boolean, int, boolean, boolean):fwi");
    }

    public static /* synthetic */ fwi f(fvv fvvVar, geu geuVar, fwh fwhVar, fwe fweVar, hls hlsVar, boolean z, int i, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            fwhVar = fwh.c;
        }
        fwh fwhVar2 = fwhVar;
        if ((i2 & 4) != 0) {
            fweVar = null;
        }
        fwe fweVar2 = fweVar;
        if ((i2 & 8) != 0) {
            hlsVar = new hls(true, false, false);
        }
        return e(fvvVar, geuVar, fwhVar2, fweVar2, hlsVar, ((i2 & 16) == 0) & z, (i2 & 32) != 0 ? 1 : i, (!((i2 & 64) == 0)) | z2, true);
    }

    public static fwl g(fyj fyjVar) {
        CarColor carColor = fyjVar.a;
        if (carColor == null) {
            gag gagVar = fyjVar.b;
            if (gagVar == null) {
                return null;
            }
            return new fyu(fxy.d(gagVar));
        }
        switch (carColor.getType()) {
            case 0:
                return new fyl(new hjw(cjn.i(carColor.getColor()), cjn.i(carColor.getColorDark())));
            case 1:
                return fym.a;
            case 2:
                return fyo.a;
            case 3:
                return fyq.a;
            case 4:
                return fyp.a;
            case 5:
                return fyn.a;
            case 6:
                return fyk.a;
            case 7:
                return fys.a;
            default:
                return fym.a;
        }
    }

    public static void h(atm atmVar, gvl gvlVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-801500036);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(atmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.A(gvlVar.ordinal()) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            gvl gvlVar2 = gvl.a;
            if (gvlVar.ordinal() != 2) {
                buxVarC.v(-1763983100);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-1442382806);
                atk.c(heq.b(awd.d(awd.r(atmVar.a(cfyVar, cfl.h)), gvlVar.f.a), buxVarC), buxVarC, 0);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw(atmVar, gvlVar, cfyVar, i, 12, (byte[]) null);
        }
    }

    public static void i(aizz aizzVar, cfy cfyVar, cfy cfyVar2, bux buxVar, int i) {
        int i2;
        bxf bxfVarJ;
        cuw cuwVar;
        aizzVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-545947758);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(aizzVar) : buxVarC.E(aizzVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar2) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bym bymVarF = byx.f(aizzVar, null, null, buxVarC, 3);
            gvl gvlVar = (gvl) buxVarC.f(gfp.a);
            gvi gviVar = (gvi) bymVarF.a();
            if (gviVar == null) {
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    cuwVar = new cuw((Object) aizzVar, cfyVar, (Object) cfyVar2, i, 13);
                    bxfVarJ.c = cuwVar;
                }
                return;
            }
            cfy cfyVarJ = cfy.e;
            cfy cfyVarC = awd.c(cfyVarJ, 1.0f);
            ctp ctpVarB = atk.b(cfl.a, false);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarC);
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
            byq.c(buxVarC, cfyVarJ2, cwb.c);
            atn atnVar = atn.a;
            gvl gvlVar2 = gvl.a;
            int iOrdinal = gvlVar.ordinal();
            cfn cfnVar = (iOrdinal == 1 || iOrdinal == 2) ? cfl.h : (iOrdinal == 3 || iOrdinal != 4) ? cfl.i : cfl.i;
            int iOrdinal2 = gvlVar.ordinal();
            if (iOrdinal2 == 2) {
                float f = gjk.c.k;
                cfyVarJ = asl.J(asl.I(cfyVarJ, f, BitmapDescriptorFactory.HUE_RED), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f);
            } else if (iOrdinal2 == 3) {
                float f2 = gjk.d.k;
                cfyVarJ = asl.I(asl.J(cfyVarJ, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED), BitmapDescriptorFactory.HUE_RED, f2);
            } else if (iOrdinal2 == 4) {
                float f3 = gjk.d.k;
                cfyVarJ = asl.J(asl.I(cfyVarJ, f3, BitmapDescriptorFactory.HUE_RED), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f3);
            }
            cfy cfyVarA = atnVar.a(cfyVarJ, cfnVar);
            h(atnVar, gvlVar, cfyVar2, buxVarC, (i2 & 896) | 6);
            gvq.g(gviVar, cfyVarA.a(cfyVar).a(cfyVar2), buxVarC, 0, 0);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            cuwVar = new cuw((Object) aizzVar, cfyVar, (Object) cfyVar2, i, 14);
            bxfVarJ.c = cuwVar;
        }
    }

    public static void j(gfh gfhVar) {
        gfy gfyVarB = gfhVar.getA();
        View view = gfyVarB.a;
        if (view == null || !view.isLaidOut()) {
            return;
        }
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        config.getClass();
        if (!view.isLaidOut()) {
            throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-view.getScrollX(), -view.getScrollY());
        view.draw(canvas);
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        if (width > 0 && height > 0 && (width != bitmapCreateBitmap.getWidth() || height != bitmapCreateBitmap.getHeight())) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, view.getPaddingLeft(), view.getPaddingTop(), width, height);
        }
        bitmapCreateBitmap.getClass();
        gfyVarB.d.b(new cjj(bitmapCreateBitmap));
        gfyVarB.f = gfyVarB.e;
        gfyVarB.g.b(adv.a(BitmapDescriptorFactory.HUE_RED));
    }

    public static void k(gfh gfhVar, hju hjuVar, String str) {
        hjuVar.getClass();
        gfhVar.getA().f(hjuVar);
        gfy gfyVarB = gfhVar.getA();
        if (str == null) {
            str = String.valueOf(hjuVar.hashCode());
        }
        gfyVarB.c.b(str);
    }

    public static void l(gfh gfhVar, gzc gzcVar) {
        gzcVar.getClass();
        gfhVar.getA().b.b(gzcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (defpackage.dlj.a(r3, r4) > 0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float m(float r2, float r3, float r4, defpackage.csi r5) {
        /*
            csi r0 = defpackage.csh.b
            boolean r0 = defpackage.affa.f(r5, r0)
            r1 = 0
            if (r0 != 0) goto L30
            csi r0 = defpackage.csh.a
            boolean r0 = defpackage.affa.f(r5, r0)
            if (r0 != 0) goto L30
            csi r0 = defpackage.csh.g
            boolean r0 = defpackage.affa.f(r5, r0)
            if (r0 != 0) goto L30
            csi r0 = defpackage.csh.c
            boolean r0 = defpackage.affa.f(r5, r0)
            if (r0 == 0) goto L22
            goto L30
        L22:
            csi r0 = defpackage.csh.e
            boolean r0 = defpackage.affa.f(r5, r0)
            if (r0 == 0) goto L34
            int r5 = defpackage.dlj.a(r3, r4)
            if (r5 <= 0) goto L3c
        L30:
            float r4 = r4 * r2
            float r4 = r4 / r3
            float r4 = r4 + r1
            return r4
        L34:
            csj r3 = defpackage.csh.f
            boolean r3 = defpackage.affa.f(r5, r3)
            if (r3 == 0) goto L3d
        L3c:
            return r2
        L3d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "ContentScale."
            java.lang.String r4 = " isn't supported in AnnotatedStringProvider"
            java.lang.String r3 = defpackage.a.bm(r5, r3, r4)
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwl.m(float, float, float, csi):float");
    }

    public static dlj n(bwq bwqVar) {
        return (dlj) bwqVar.a();
    }

    public static Duration o(bwq bwqVar) {
        return (Duration) bwqVar.a();
    }

    public static List p(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        gft gftVar = (gft) it.next();
        while (it.hasNext()) {
            gft gftVar2 = (gft) it.next();
            gftVar.getClass();
            if (Math.min(gftVar2.b, gftVar.b) - Math.max(gftVar2.a, gftVar.a) <= 0) {
                arrayList.add(gftVar);
            }
            gftVar = gftVar2;
        }
        arrayList.add(gftVar);
        return arrayList;
    }

    public static void q(des desVar, ClickableSpan clickableSpan, boolean z, geu geuVar, gft gftVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(886907374);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(desVar) : buxVarC.E(desVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(clickableSpan) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(geuVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(gftVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            long j = czz.at(buxVarC).b;
            long j2 = czz.at(buxVarC).a;
            dku dkuVar = dku.b;
            dfm dfmVar = new dfm(j, 0L, null, null, null, null, null, 0L, null, null, j2, dkuVar, null, 59390);
            long j3 = -34153034476945408L;
            if (!ca.bl(buxVarC) && z) {
                j3 = -71961060352983040L;
            }
            dfu dfuVar = new dfu(new dfm(j3, 0L, null, null, null, null, null, 0L, null, null, 0L, dkuVar, null, 61438), dfmVar);
            boolean zE = buxVarC.E(geuVar) | buxVarC.E(clickableSpan);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new glf(geuVar, clickableSpan);
                bvvVar.ad(objS);
            }
            desVar.c.add(new der(new dex(dfuVar, (glf) objS), gftVar.a, gftVar.b, ""));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mcg(desVar, clickableSpan, z, geuVar, gftVar, i, 1);
        }
    }

    public static void r(des desVar, String str) {
        int iA = desVar.a(new dfm(0L, 0L, null, null, null, null, "\"tnum\"", 0L, null, null, 0L, null, null, 65471));
        try {
            desVar.f(str);
        } finally {
            desVar.h(iA);
        }
    }

    public static void s(des desVar, deu deuVar, int i, int i2) {
        long jT = czz.t(i, i2);
        if (dfv.i(jT)) {
            return;
        }
        desVar.e(deuVar.e(jT));
    }

    public static boolean t(gfa gfaVar, bux buxVar, int i) {
        deu deuVar = v(null, null, null, false, gfaVar, buxVar, (i << 15) & 458752, 31).a;
        return deuVar == null || afyh.v(deuVar);
    }

    public static String u(geu geuVar, long j, bux buxVar) {
        Object objG = buxVar.g();
        Object obj = buw.a;
        if (objG == obj) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Duration.ZERO, bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG;
        Long lValueOf = Long.valueOf(j);
        boolean zE = buxVar.E(geuVar) | buxVar.B(j);
        Object objG2 = buxVar.g();
        if (zE || objG2 == obj) {
            gty gtyVar = new gty(geuVar, j, bwqVar, (afck) null, 1);
            buxVar.x(gtyVar);
            objG2 = gtyVar;
        }
        bvq.g(lValueOf, (afeg) objG2, buxVar);
        Duration durationO = o(bwqVar);
        if (durationO.toHours() > 0) {
            String str = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(durationO.toHoursPart()), Integer.valueOf(durationO.toMinutesPart()), Integer.valueOf(durationO.toSecondsPart())}, 3));
            str.getClass();
            return str;
        }
        String str2 = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(durationO.toMinutesPart()), Integer.valueOf(durationO.toSecondsPart())}, 2));
        str2.getClass();
        return str2;
    }

    public static gez v(dfw dfwVar, dlj dljVar, cjv cjvVar, boolean z, gfa gfaVar, bux buxVar, int i, int i2) {
        gfaVar.getClass();
        if ((i2 & 1) != 0) {
            dfwVar = (dfw) buxVar.f(brp.a);
        }
        if ((i2 & 2) != 0) {
            dljVar = null;
        }
        if ((i2 & 4) != 0) {
            cjvVar = new cjv(cjn.n());
        }
        return gfaVar.b(dfwVar, dljVar, cjvVar, z & ((i2 & 16) == 0), buxVar, 524286 & i);
    }

    public static void w(des desVar, ForegroundCarColorSpan foregroundCarColorSpan, gft gftVar, jvb jvbVar, bux buxVar, int i) {
        int i2;
        Object next;
        bux buxVarC = buxVar.c(-224661926);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(desVar) : buxVarC.E(desVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(foregroundCarColorSpan) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(gftVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(jvbVar) ? 1024 : 2048;
        }
        if (!buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            buxVarC.s();
        } else if (((ggk) buxVarC.f(ggo.a)).o()) {
            buxVarC.v(-1344067307);
            CarColor color = foregroundCarColorSpan.getColor();
            color.getClass();
            hjw hjwVarG = gzw.g(color, jvbVar);
            hjw hjwVar = hjw.a;
            long jQ = fww.q(hjwVarG.b(buxVarC), 0L, 2, buxVarC, 10);
            if (!a.j(jQ, cjn.n())) {
                desVar.d(new dfm(jQ, 0L, null, null, null, null, null, 0L, null, null, 0L, null, null, 65534), gftVar.a, gftVar.b);
            }
            ((bvv) buxVarC).Y(false);
        } else {
            buxVarC.v(-1343601563);
            List listBi = woy.bi(new cjv(cjn.i(foregroundCarColorSpan.getColor().getColor())), new cjv(cjn.i(foregroundCarColorSpan.getColor().getColorDark())));
            if (ca.bl(buxVarC)) {
                listBi = woy.ca(listBi);
            }
            Iterator it = listBi.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (fww.p(0L, ((cjv) next).a, buxVarC, 1)) {
                        break;
                    }
                }
            }
            cjv cjvVar = (cjv) next;
            if (cjvVar != null) {
                desVar.d(new dfm(cjvVar.a, 0L, null, null, null, null, null, 0L, null, null, 0L, null, null, 65534), gftVar.a, gftVar.b);
            }
            ((bvv) buxVarC).Y(false);
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(desVar, foregroundCarColorSpan, gftVar, jvbVar, i, 3);
        }
    }
}
