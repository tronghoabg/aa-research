package defpackage;

import android.content.Context;
import android.telecom.DisconnectCause;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.gms.car.CarCall;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.util.List;

/* loaded from: classes.dex */
public class mjv {
    public mjv() {
    }

    public static CarCall.Details B(CarCall.Details details) {
        return new CarCall.Details(details.a, details.b, new DisconnectCause(0), details.d, details.e, details.f, details.g, details.h, details.i, details.j, details.k, details.l, details.m);
    }

    public static oec C() {
        return (oec) mki.a.i(oec.class);
    }

    public static void a() {
    }

    public static mkc b() {
        return (mkc) mki.a.i(mkc.class);
    }

    public static void c(kqg kqgVar, mlh mlhVar, Context context, boolean z) {
        String strG;
        String string;
        mlhVar.a(z);
        mlhVar.c = kqgVar;
        mlhVar.b = true;
        int i = kqgVar.d;
        if (i != 2) {
            strG = kqgVar.g();
        } else if (kqgVar.o() && z) {
            String strG2 = kqgVar.g();
            strG = strG2.length() > 20 ? context.getString(R.string.settings_connection_car_title_usb_wireless_available_truncated, strG2.subSequence(0, 20).toString().trim()) : context.getString(R.string.settings_connection_car_title_usb_wireless_available, strG2);
            i = 2;
        } else {
            i = 2;
            strG = kqgVar.g();
        }
        mlhVar.d = strG;
        if (i == 1) {
            string = context.getString(R.string.settings_connection_car_summary_wireless_projecting);
        } else if (i == 2) {
            string = context.getString(R.string.settings_connection_car_summary_usb_projecting);
        } else {
            int i2 = kqgVar.c;
            string = i2 == 2 ? context.getString(R.string.settings_connection_car_summary_wireless_supported) : i2 == 3 ? context.getString(R.string.settings_connection_car_summary_usb_only) : context.getString(R.string.settings_connection_car_summary_usb_only);
        }
        mlhVar.e = string;
    }

    public static mkd d() {
        return (mkd) mki.a.i(mkd.class);
    }

    public static void e(final ltg ltgVar, final ltg ltgVar2, final ltg ltgVar3, final boolean z, final afeg afegVar, final long j, final long j2, final cjv cjvVar, final long j3, final cfy cfyVar, final AaPlaybackState aaPlaybackState, final boolean z2, bux buxVar, final int i, final int i2) {
        int i3;
        ltg ltgVar4;
        ltg ltgVar5;
        int i4;
        bux buxVar2;
        boolean z3;
        int i5 = i & 6;
        bux buxVarC = buxVar.c(-938580605);
        if (i5 == 0) {
            i3 = (true != buxVarC.E(ltgVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            ltgVar4 = ltgVar2;
            i3 |= true != buxVarC.E(ltgVar4) ? 16 : 32;
        } else {
            ltgVar4 = ltgVar2;
        }
        if ((i & 384) == 0) {
            ltgVar5 = ltgVar3;
            i3 |= true != buxVarC.E(ltgVar5) ? 128 : 256;
        } else {
            ltgVar5 = ltgVar3;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.E(afegVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != buxVarC.B(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.B(j2) ? 524288 : 1048576;
        }
        if ((i & 12582912) == 0) {
            i3 |= true != buxVarC.C(cjvVar) ? 4194304 : 8388608;
        }
        if ((i & 100663296) == 0) {
            i3 |= true != buxVarC.B(j3) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 268435456 : 536870912;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.E(aaPlaybackState) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.D(z2) ? 16 : 32;
        }
        int i6 = i4;
        if (buxVarC.I(((306783379 & i3) == 306783378 && (i6 & 19) == 18) ? false : true, i3 & 1)) {
            ksy ksyVarA = z2 ? ksy.a(ksy.b, BitmapDescriptorFactory.HUE_RED, 38.0f, null, BitmapDescriptorFactory.HUE_RED, 509) : ksy.a(ksy.c, BitmapDescriptorFactory.HUE_RED, 42.0f, null, BitmapDescriptorFactory.HUE_RED, 509);
            cfy cfyVarI = asl.I(cfyVar.a(new aix(j3, ckq.a)), (z2 ? gjk.c : gjk.d).k, gjk.b.k);
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int i7 = i3;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarI);
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
            int i8 = i7 << 3;
            int i9 = i6 << 18;
            avy avyVar = avy.a;
            myi.q(avyVar, ltgVar, ltgVar4, ltgVar5, null, false, aaPlaybackState, ksyVarA, z, j, j2, cjvVar, false, buxVarC, (i8 & 7168) | (i8 & 112) | 221190 | (i8 & 896) | (i9 & 3670016) | (234881024 & (i7 << 15)) | (1879048192 & (i7 << 12)), (i7 >> 18) & 126, 2048);
            buxVar2 = buxVarC;
            asl.A(avyVar.b(cfy.e, 1.0f, true), buxVar2);
            if (afegVar == null) {
                buxVar2.v(-940307302);
                z3 = false;
            } else {
                z3 = false;
                buxVar2.v(662404167);
                afegVar.invoke(buxVar2, Integer.valueOf((i7 >> 12) & 14));
            }
            bvvVar.Y(z3);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nbc
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ltg ltgVar6 = ltgVar;
                    ltg ltgVar7 = ltgVar2;
                    ltg ltgVar8 = ltgVar3;
                    boolean z4 = z;
                    afeg afegVar2 = afegVar;
                    long j4 = j;
                    long j5 = j2;
                    cjv cjvVar2 = cjvVar;
                    int i10 = i;
                    long j6 = j3;
                    int i11 = i2;
                    int i12 = i10 | 1;
                    int i13 = i11 & 306783378;
                    int i14 = i12 & 306783378;
                    AaPlaybackState aaPlaybackState2 = aaPlaybackState;
                    int i15 = i11 & 613566756;
                    int i16 = i12 & 613566756;
                    boolean z5 = z2;
                    mjv.e(ltgVar6, ltgVar7, ltgVar8, z4, afegVar2, j4, j5, cjvVar2, j6, cfyVar, aaPlaybackState2, z5, (bux) obj, (i12 & (-920350135)) | i14 | (i16 >> 1) | ((i14 + i14) & i16), (i11 & (-920350135)) | i13 | (i15 >> 1) | ((i13 + i13) & i15));
                    return afak.a;
                }
            };
        }
    }

    public static nap f(bym bymVar) {
        return (nap) bymVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(java.util.List r16, defpackage.cfy r17, int r18, defpackage.afec r19, defpackage.afeg r20, defpackage.afei r21, defpackage.bux r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjv.g(java.util.List, cfy, int, afec, afeg, afei, bux, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(defpackage.afeh r24, defpackage.afeg r25, defpackage.cfy r26, defpackage.afeg r27, defpackage.afdr r28, defpackage.bux r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjv.h(afeh, afeg, cfy, afeg, afdr, bux, int, int):void");
    }

    public static /* synthetic */ afak i(atm atmVar, bux buxVar, int i) {
        if (buxVar.I((i & 3) != 2, i & 1)) {
            k(atmVar.b(cfy.e), BitmapDescriptorFactory.HUE_RED, buxVar, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static void j(float f, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1350627560);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != buxVarC.z(f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            eru eruVarA = esh.a(buxVarC);
            if (eruVarA == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            naq naqVar = (naq) epq.e(affw.b(naq.class), eruVarA, null, null, ecw.g(eruVarA));
            cfv cfvVar = cfy.e;
            boolean zE = buxVarC.E(naqVar);
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new mvg(naqVar, 20);
                bvvVar.ad(objS);
            }
            fww.L(ebj.k(cfvVar, (afdr) objS), null, null, null, bxc.i(957161178, true, new hco(naqVar, f, i4), buxVarC), buxVarC, 196608, 30);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mzz(f, i, 0);
        }
    }

    public static void k(cfy cfyVar, float f, bux buxVar, int i) {
        int i2;
        long j;
        long j2;
        bux buxVarC = buxVar.c(-190619752);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            if (ca.bl(buxVarC)) {
                buxVarC.v(-806076395);
                j = ksp.j(krr.p, buxVarC);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-806017743);
                j = ksp.j(krr.v, buxVarC);
                ((bvv) buxVarC).Y(false);
            }
            cfy cfyVarA = cfyVar.a(new aix(j, ckq.a));
            ctp ctpVarB = atk.b(cfl.e, false);
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
            cmw cmwVarB = dao.b(R.drawable.gs_genres_vd_theme_24, buxVarC, 0);
            cfy cfyVarC = awd.c(cfy.e, 0.6f);
            if (ca.bl(buxVarC)) {
                buxVarC.v(2130785963);
                j2 = ksp.j(krr.v, buxVarC);
                bvvVar.Y(false);
            } else {
                buxVarC.v(2130848459);
                j2 = ksp.j(krr.n, buxVarC);
                bvvVar.Y(false);
            }
            boc.a(cmwVarB, "Placeholder album artwork", cfyVarC, j2, buxVarC, 56, 0);
            bvvVar.Y(true);
            f = 0.6f;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grm(cfyVar, f, i, 3);
        }
    }

    public static void l(boolean z, Duration duration, cfy cfyVar, acp acpVar, acq acqVar, String str, afeh afehVar, bux buxVar, int i) {
        boolean z2;
        int i2;
        cfy cfyVar2;
        acp acpVar2;
        acq acqVar2;
        String str2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1495802136);
        if (i3 == 0) {
            z2 = z;
            i2 = i | (true != buxVarC.D(z2) ? 2 : 4);
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(duration) ? 16 : 32;
        }
        int i4 = i2 | 224640;
        if ((i & 1572864) == 0) {
            i4 |= true != buxVarC.E(afehVar) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i4) != 599186, i4 & 1)) {
            cfv cfvVar = cfy.e;
            acp acpVarA = acl.B(null, 3).a(acl.n(null, null, 15));
            acq acqVarA = acl.C(null, 3).a(acl.s(null, null, 15));
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(true, bxp.c);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            afak afakVar = afak.a;
            boolean zE = buxVarC.E(duration);
            Object objS2 = bvvVar.S();
            if (zE || objS2 == obj) {
                objS2 = new ksw(duration, bwqVar, (afck) null, 12);
                bvvVar.ad(objS2);
            }
            bvq.g(afakVar, (afeg) objS2, buxVarC);
            int i5 = i4 & 14;
            int i6 = i4 >> 3;
            ca.M(z2, cfvVar, ((Boolean) bwqVar.a()).booleanValue() ? acp.a : acpVarA, ((Boolean) bwqVar.a()).booleanValue() ? acq.a : acqVarA, "AnimatedVisibility", afehVar, buxVarC, (i6 & 112) | i5 | (57344 & i6) | (i6 & 458752), 0);
            cfyVar2 = cfvVar;
            str2 = "AnimatedVisibility";
            acpVar2 = acpVarA;
            acqVar2 = acqVarA;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
            acpVar2 = acpVar;
            acqVar2 = acqVar;
            str2 = str;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nac(z, duration, cfyVar2, acpVar2, acqVar2, str2, afehVar, i, 0);
        }
    }

    public static void m(final boolean z, final boolean z2, cfy cfyVar, final float f, final afdr afdrVar, bux buxVar, final int i) {
        int i2;
        final cfy cfyVar2;
        cfy cfyVar3;
        Boolean bool;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1784362336);
        if (i3 == 0) {
            i2 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z2) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if ((i & 3072) == 0) {
            i4 |= true != buxVarC.z(f) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i4 |= true != buxVarC.E(afdrVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) == 0 || buxVarC.F()) {
                cfyVar3 = cfy.e;
            } else {
                buxVarC.s();
                cfyVar3 = cfyVar;
            }
            buxVarC.l();
            eqj eqjVarG = kfl.h().g();
            boolean zEquals = (eqjVarG == null || (bool = (Boolean) eqjVarG.e()) == null) ? false : bool.equals(true);
            float f2 = gjk.a.k;
            cfy cfyVarD = das.d(awd.r(asl.J(cfyVar3, f2, f2, (f - f2) + BitmapDescriptorFactory.HUE_RED, f2)), "header");
            float f3 = mvz.a;
            cfy cfyVarA = kvc.a(cfyVarD, mvz.b, 0L, 0L, null, null, null, true, false, buxVarC, 12582912, 190);
            boolean z3 = z2 && !zEquals;
            int i5 = 57344 & i4;
            Object objS = bvvVar.S();
            if (i5 == 16384 || objS == buw.a) {
                objS = new mvg(afdrVar, 18);
                bvvVar.ad(objS);
            }
            cfy cfyVarH = asl.H(afp.x(cfyVarA, z3, null, null, (afdr) objS), gjk.d.k);
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
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
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            cfy cfyVar4 = cfyVar3;
            buxVarC = buxVarC;
            l(z, wub.an(1), null, null, null, null, mwx.d, buxVarC, (i4 & 14) | 1572864);
            brp.b(vq.e(R.string.for_you_text, buxVarC), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, czz.av(buxVarC).h, buxVarC, 0, 0, 131070);
            if (zEquals) {
                buxVarC.v(-1460152282);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1460474217);
                l(z2 && !z, wub.an(1), null, null, null, null, mwx.e, buxVarC, 1572864);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
            cfyVar2 = cfyVar4;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: nab
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    boolean z4 = z;
                    int i6 = i | 1;
                    int i7 = 306783378 & i6;
                    int i8 = 613566756 & i6;
                    mjv.m(z4, z2, cfyVar2, f, afdrVar, buxVar2, (i6 & (-920350135)) | i7 | (i8 >> 1) | ((i7 + i7) & i8));
                    return afak.a;
                }
            };
        }
    }

    public static eqj n(eqj eqjVar) {
        return tby.w(o(eqjVar), new mzd(20));
    }

    public static eqj o(eqj eqjVar) {
        return tby.w(eqjVar, new mzd(19));
    }

    public static eqj p(eqj eqjVar) {
        eqjVar.getClass();
        return tby.w(tby.C(eqjVar, new mzd(17)), new mzd(18));
    }

    public static mzw q() {
        if (lmi.a.a().d()) {
            return new mzw(0);
        }
        return null;
    }

    public static yfy r(Context context, boolean z) {
        yfu yfuVar = new yfu(4);
        t(new inl(context, 11), z, yfuVar);
        t(new ojk(context, 3), z, yfuVar);
        t(new ojk(context, 4), z, yfuVar);
        t(new inl(context, 12), z, yfuVar);
        t(new inl(context, 13), z, yfuVar);
        t(new inl(context, 14), z, yfuVar);
        t(new inl(context, 15), z, yfuVar);
        t(new inl(context, 16), z, yfuVar);
        t(new inl(context, 17), z, yfuVar);
        t(new inl(context, 18), z, yfuVar);
        t(new inl(context, 19), z, yfuVar);
        t(new inl(context, 20), z, yfuVar);
        t(new ojk(context, 1), z, yfuVar);
        s(new ojk(context, 0), new joa(8), z, yfuVar);
        s(new ojk(context, 2), new joa(9), z, yfuVar);
        return yfuVar.d(true);
    }

    public static void s(xyc xycVar, xyc xycVar2, boolean z, yfu yfuVar) {
        if (!z || ((Boolean) xycVar2.gu()).booleanValue()) {
            ojj ojjVar = (ojj) xycVar.gu();
            yfuVar.e(ojjVar.c, ojjVar);
        }
    }

    public static void t(xyc xycVar, boolean z, yfu yfuVar) {
        s(xycVar, new joa(10), z, yfuVar);
    }

    public static void u(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = 0;
    }

    public static ohl v() {
        return (ohl) mki.a.i(ohl.class);
    }

    public static boolean w(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        return !mcd.A().t(carCall);
    }

    public static void x(thd thdVar, com.google.android.gms.car.CarCall carCall) {
        yyv yyvVar = (yyv) oen.b.get(thdVar);
        yyvVar.getClass();
        yxy yxyVar = yxy.GEARHEAD;
        rqu rquVarH = rqv.h(yxyVar, 35, yyvVar);
        rquVarH.i(yyw.CM_ADAPTER_API_FAILURE);
        if (carCall != null) {
            rquVarH.g(mkn.b.flattenToShortString());
        }
        ebf.j().f(rquVarH);
        yfy yfyVar = oen.c;
        if (yfyVar.containsKey(thdVar)) {
            rrb rrbVarH = rrc.h(yxyVar, yzz.PHONE_CALL, (yzy) yfyVar.get(thdVar));
            rrbVarH.v(zaa.TELECOM_ICS_API_FAILURE);
            if (carCall != null) {
                rrbVarH.p(mkn.b);
            }
            ebf.j().F(rrbVarH.l());
        }
    }

    public static void y(thd thdVar, com.google.android.gms.car.CarCall carCall) {
        yyv yyvVar = (yyv) oen.b.get(thdVar);
        yyvVar.getClass();
        yxy yxyVar = yxy.GEARHEAD;
        rqu rquVarH = rqv.h(yxyVar, 35, yyvVar);
        if (carCall != null || yyvVar.equals(yyv.PHONE_PLACE_CALL)) {
            rquVarH.g(mkn.b.flattenToShortString());
        }
        ebf.j().f(rquVarH);
        yfy yfyVar = oen.c;
        if (yfyVar.containsKey(thdVar)) {
            rrb rrbVarH = rrc.h(yxyVar, yzz.PHONE_CALL, (yzy) yfyVar.get(thdVar));
            if (carCall != null) {
                rrbVarH.p(mkn.b);
            }
            ebf.j().F(rrbVarH.l());
        }
    }

    public final com.google.android.gms.car.CarCall A(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        com.google.android.apps.auto.components.telecom.call.CarCall carCall2 = carCall.b;
        com.google.android.gms.car.CarCall carCallA = carCall2 != null ? A(carCall2) : null;
        int i = carCall.a;
        List list = carCall.c;
        String str = carCall.d;
        int i2 = carCall.e;
        CarCall.Details details = carCall.f;
        return new com.google.android.gms.car.CarCall(i, carCallA, list, str, i2, new CarCall.Details(details.a, details.b, "", details.d, details.e, details.f, details.g, details.h, details.i, details.j, details.k, details.l, details.m), carCall.g, null, null);
    }

    public final com.google.android.apps.auto.components.telecom.call.CarCall z(com.google.android.gms.car.CarCall carCall) {
        if (carCall == null) {
            return null;
        }
        com.google.android.gms.car.CarCall carCall2 = carCall.b;
        com.google.android.apps.auto.components.telecom.call.CarCall carCallZ = carCall2 != null ? z(carCall2) : null;
        return new com.google.android.apps.auto.components.telecom.call.CarCall(carCall.a, carCallZ, carCall.c, carCall.d, carCall.e, B(carCall.f), carCall.g);
    }

    public mjv(byte[] bArr) {
    }
}
