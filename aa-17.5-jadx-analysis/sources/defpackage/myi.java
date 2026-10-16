package defpackage;

import android.content.ComponentName;
import android.graphics.Bitmap;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class myi {
    public static final yph a = yph.c("GH.ComposeMediaPlayer");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v33, types: [avp] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A(final defpackage.afeh r31, final defpackage.afeh r32, final defpackage.afeh r33, final defpackage.ase r34, final long r35, final float r37, boolean r38, final boolean r39, final boolean r40, final boolean r41, final com.google.android.apps.auto.components.graphics.icon.GhIcon r42, final defpackage.mwy r43, defpackage.cfy r44, final float r45, boolean r46, boolean r47, defpackage.cfr r48, defpackage.bux r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.A(afeh, afeh, afeh, ase, long, float, boolean, boolean, boolean, boolean, com.google.android.apps.auto.components.graphics.icon.GhIcon, mwy, cfy, float, boolean, boolean, cfr, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void B(final defpackage.afeh r25, final defpackage.afeh r26, final defpackage.ase r27, final float r28, defpackage.cfy r29, boolean r30, defpackage.avp r31, defpackage.ckv r32, defpackage.cfm r33, final boolean r34, final defpackage.cfr r35, defpackage.bux r36, final int r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.B(afeh, afeh, ase, float, cfy, boolean, avp, ckv, cfm, boolean, cfr, bux, int, int, int):void");
    }

    public static final void C(ltr ltrVar, float f, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        bux buxVarC = buxVar.c(-869769817);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.E(ltrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.z(f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cfyVar2 = cfyVar;
            i2 |= true != buxVarC.C(cfyVar2) ? 128 : 256;
        } else {
            cfyVar2 = cfyVar;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            ca.bb(lgi.f(GhIcon.r(ltrVar.a, ltrVar.b), f, buxVarC, 1), null, cfyVar2, null, csh.a, BitmapDescriptorFactory.HUE_RED, null, buxVarC, (i2 & 896) | 24632, 104);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new grk(ltrVar, f, cfyVar, i, 2);
        }
    }

    public static final void D(afdr afdrVar, cfy cfyVar, long j, long j2, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        long j3;
        long j4;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1566836841);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afdrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cfyVar2 = cfyVar;
            i2 |= true != buxVarC.C(cfyVar2) ? 16 : 32;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i2 |= true != buxVarC.B(j3) ? 128 : 256;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            j4 = j2;
            i2 |= true != buxVarC.B(j4) ? 1024 : 2048;
        } else {
            j4 = j2;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            if (afdrVar == null) {
                buxVarC.v(68496124);
                boz.i(cfyVar2, j3, j4, BitmapDescriptorFactory.HUE_RED, buxVarC, (i2 >> 3) & 1022);
                bvvVar.Y(false);
            } else {
                buxVarC.v(68580754);
                boz.e(afdrVar, cfyVar, j, j2, 1, BitmapDescriptorFactory.HUE_RED, null, buxVarC, i2 & 8190, 96);
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ggx(afdrVar, cfyVar, j, j2, i, 2);
        }
    }

    public static final void E(final afdr afdrVar, final boolean z, final cfy cfyVar, final long j, final long j2, bux buxVar, final int i) {
        int i2;
        cfy cfyVar2;
        long j3;
        long j4;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-92132378);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afdrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            cfyVar2 = cfyVar;
            i2 |= true != buxVarC.C(cfyVar2) ? 128 : 256;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((i & 3072) == 0) {
            j3 = j;
            i2 |= true != buxVarC.B(j3) ? 1024 : 2048;
        } else {
            j3 = j;
        }
        if ((i & 24576) == 0) {
            j4 = j2;
            i2 |= true != buxVarC.B(j4) ? 8192 : 16384;
        } else {
            j4 = j2;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            if (afdrVar == null) {
                buxVarC.v(-231286117);
                bsc.b(cfyVar2, j3, j4, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, buxVarC, (i2 >> 6) & 1022);
                buxVarC = buxVarC;
                bvvVar.Y(false);
            } else {
                buxVarC.v(-231178764);
                Object objS = bvvVar.S();
                Object obj = buw.a;
                float f = BitmapDescriptorFactory.HUE_RED;
                if (objS == obj) {
                    objS = new ParcelableSnapshotMutableFloatState(BitmapDescriptorFactory.HUE_RED);
                    bvvVar.ad(objS);
                }
                if (true == z) {
                    f = 1.0f;
                }
                byb bybVar = (byb) objS;
                bybVar.h(f);
                Object objS2 = bvvVar.S();
                if (objS2 == obj) {
                    objS2 = new mqm(bybVar, 12);
                    bvvVar.ad(objS2);
                }
                int i4 = i2 & 14;
                int i5 = i2 >> 3;
                bsc.a(afdrVar, cfyVar, j, j2, null, null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (afec) objS2, BitmapDescriptorFactory.HUE_RED, buxVarC, i4 | 100663296 | (i5 & 112) | (i5 & 896) | (i5 & 7168), 6, 752);
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: mxz
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    bux buxVar2 = (bux) obj2;
                    ((Integer) obj3).intValue();
                    afdr afdrVar2 = afdrVar;
                    int i6 = i;
                    int i7 = i6 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = 613566756 & i7;
                    myi.E(afdrVar2, z, cfyVar, j, j2, buxVar2, (i9 >> 1) | i8 | (i7 & (-920350135)) | ((i8 + i8) & i9));
                    return afak.a;
                }
            };
        }
    }

    public static final void F(String str, afeg afegVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        bux buxVar2;
        bvv bvvVar;
        boolean z;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1078312639);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
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
            afegVar.invoke(buxVarC, Integer.valueOf((i2 >> 3) & 14));
            if (str == null) {
                buxVarC.v(-832410341);
                bvvVar2.Y(false);
                buxVar2 = buxVarC;
                z = true;
                bvvVar = bvvVar2;
            } else {
                buxVarC.v(-832410340);
                asl.A(awd.i(cfy.e, gjk.b.k), buxVarC);
                buxVar2 = buxVarC;
                brp.b(str, null, kfn.i(buxVarC).R(), 0L, null, 0L, null, 0L, 2, false, 1, 0, czz.av(buxVarC).l, buxVar2, 0, 24960, 110586);
                bvvVar = bvvVar2;
                bvvVar.Y(false);
                z = true;
            }
            bvvVar.Y(z);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg((Object) str, (Object) afegVar, cfyVar, i, 6);
        }
    }

    public static final void G(ats atsVar, GhIcon ghIcon, cjv cjvVar, boolean z, boolean z2, cfy cfyVar, bux buxVar, int i) {
        int i2;
        GhIcon ghIcon2;
        cjv cjvVar2;
        boolean z3;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-807766160);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(atsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            ghIcon2 = ghIcon;
            i2 |= true != buxVarC.C(ghIcon2) ? 16 : 32;
        } else {
            ghIcon2 = ghIcon;
        }
        if ((i & 384) == 0) {
            cjvVar2 = cjvVar;
            i2 |= true != buxVarC.C(cjvVar2) ? 128 : 256;
        } else {
            cjvVar2 = cjvVar;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.D(z2) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 65536 : 131072;
        }
        if (buxVarC.I((74899 & i2) != 74898, i2 & 1)) {
            cfy cfyVarA = ats.a(cfyVar, z ? cfl.l : cfl.j);
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
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
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            boolean z4 = z2 && lmi.a.a().d();
            int i4 = R.drawable.gs_devices_wght500fill1rond100_vd_theme_24;
            if (z4 && z) {
                buxVarC.v(-2111196875);
                p(true != ldz.a.a().b() ? R.drawable.gs_devices_vd_theme_24 : R.drawable.gs_devices_wght500fill1rond100_vd_theme_24, false, buxVarC, 0, 2);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-2110988338);
                bvvVar.Y(false);
            }
            int i5 = i2 >> 3;
            l(ghIcon2, cjvVar2, 24.0f, null, buxVarC, (i5 & 112) | (i5 & 14) | 384, 8);
            if (!z4 || z) {
                z3 = true;
                buxVarC.v(-2110659986);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-2110895431);
                z3 = true;
                if (true != ldz.a.a().b()) {
                    i4 = R.drawable.gs_devices_vd_theme_24;
                }
                p(i4, true, buxVarC, 48, 0);
                bvvVar.Y(false);
            }
            bvvVar.Y(z3);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mxm(atsVar, ghIcon, cjvVar, z, z2, cfyVar, i, 0);
        }
    }

    public static final void H(mwy mwyVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        mwy mwyVar2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1159742422);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(mwyVar) : buxVarC.E(mwyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            byte[] bArr = null;
            bvvVar.ab(2115946049, Boolean.valueOf(ca.bl(buxVarC)), 0, null);
            krt krtVar = mwyVar.a;
            mwyVar2 = mwyVar;
            bym bymVarA = adc.a(cjn.i(dvd.e(mwyVar.d(krtVar.b, 25, 32, 92, buxVarC), 153)), null, buxVarC, 0, 14);
            bvvVar.Y(false);
            bvvVar.ab(2115950293, Boolean.valueOf(ca.bl(buxVarC)), 0, null);
            bym bymVarA2 = adc.a(cjn.i(dvd.e(mwyVar2.d(krtVar.a, 25, 32, 92, buxVarC), 242)), null, buxVarC, 0, 14);
            buxVar2 = buxVarC;
            bvvVar.Y(false);
            cfy cfyVarC = awd.c(cfyVar, 1.0f);
            boolean zC = buxVar2.C(bymVarA) | buxVar2.C(bymVarA2);
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new lyb(bymVarA, bymVarA2, 10, bArr);
                bvvVar.ad(objS);
            }
            atk.c(bxc.q(cfyVarC, (afec) objS), buxVar2, 0);
        } else {
            mwyVar2 = mwyVar;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nad(mwyVar2, cfyVar, i, i4);
        }
    }

    public static final void I(afdr afdrVar, final boolean z, long j, long j2, cfy cfyVar, boolean z2, afeg afegVar, bux buxVar, int i) {
        final afdr afdrVar2;
        int i2;
        long j3;
        long j4;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1908096558);
        if (i3 == 0) {
            afdrVar2 = afdrVar;
            i2 = (true != buxVarC.E(afdrVar2) ? 2 : 4) | i;
        } else {
            afdrVar2 = afdrVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            j3 = j;
            i2 |= true != buxVarC.B(j3) ? 128 : 256;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            j4 = j2;
            i2 |= true != buxVarC.B(j4) ? 1024 : 2048;
        } else {
            j4 = j2;
        }
        if ((i & 24576) == 0) {
            cfyVar2 = cfyVar;
            i2 |= true != buxVarC.C(cfyVar2) ? 8192 : 16384;
        } else {
            cfyVar2 = cfyVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z2) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            final long j5 = j3;
            final long j6 = j4;
            final cfy cfyVar3 = cfyVar2;
            cct cctVarI = bxc.i(-67078232, true, new afeg() { // from class: myb
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i4 = iIntValue & 3;
                    int i5 = iIntValue & 1;
                    yph yphVar = myi.a;
                    if (buxVar2.I(i4 != 2, i5)) {
                        long jH = j6;
                        long jS = j5;
                        cfy cfyVar4 = cfyVar3;
                        afdr afdrVar3 = afdrVar2;
                        lmh lmhVar = lmi.a;
                        if (lmhVar.a().b()) {
                            boolean z3 = z;
                            buxVar2.v(-1167763829);
                            myi.E(afdrVar3, z3, cfyVar4, jS, jH, buxVar2, 0);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-1167542830);
                            if (lmhVar.a().d()) {
                                buxVar2.v(-1167391023);
                            } else {
                                buxVar2.v(-1167343655);
                                jS = kfn.i(buxVar2).s();
                            }
                            buxVar2.o();
                            long j7 = jS;
                            if (lmhVar.a().d()) {
                                buxVar2.v(-1167204558);
                            } else {
                                buxVar2.v(-1167157097);
                                jH = cjv.h(kfn.i(buxVar2).R(), 0.15f);
                            }
                            buxVar2.o();
                            myi.D(afdrVar3, cfyVar4, j7, jH, buxVar2, 0);
                            buxVar2.o();
                        }
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC);
            if (!z2 || afegVar == null) {
                buxVarC.v(-211026957);
                cctVarI.invoke(buxVarC, 6);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-211283668);
                cfv cfvVar = cfy.e;
                cfy cfyVarJ = asl.J(awd.r(cfvVar), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 10.0f);
                ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
                bvv bvvVar = (bvv) buxVarC;
                int iG = a.g(bvvVar.u);
                ccx ccxVarAh = bvvVar.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarJ);
                afdr afdrVar3 = cwb.a;
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar3);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarA, cwb.e);
                byq.c(buxVarC, ccxVarAh, cwb.d);
                byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
                byq.b(buxVarC, cwb.g);
                byq.c(buxVarC, cfyVarJ2, cwb.c);
                cctVarI.invoke(buxVarC, 6);
                asl.A(awd.m(cfvVar, gjk.b.k), buxVarC);
                afegVar.invoke(buxVarC, Integer.valueOf((i2 >> 18) & 14));
                bvvVar.Y(true);
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new myc(afdrVar, z, j, j2, cfyVar, z2, afegVar, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    public static final void J(final afeh afehVar, final afeh afehVar2, afeh afehVar3, final ase aseVar, long j, final mwy mwyVar, final float f, final boolean z, final cfy cfyVar, final boolean z2, final boolean z3, final cfr cfrVar, bux buxVar, final int i, final int i2) {
        int i3;
        ase aseVar2;
        boolean z4;
        int i4;
        afeh afehVar4;
        long j2;
        bux buxVar2;
        bux buxVar3;
        int i5;
        bvv bvvVar;
        ?? r0;
        cfm cfmVar;
        boolean z5;
        float f2;
        int i6 = i & 6;
        bux buxVarC = buxVar.c(-2034307104);
        if (i6 == 0) {
            i3 = (true != buxVarC.E(afehVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.E(afehVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(afehVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            aseVar2 = aseVar;
            i3 |= true != buxVarC.C(aseVar2) ? 1024 : 2048;
        } else {
            aseVar2 = aseVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.B(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= true != ((262144 & i) == 0 ? buxVarC.C(mwyVar) : buxVarC.E(mwyVar)) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.z(f) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            z4 = z;
            i3 |= true != buxVarC.D(z4) ? 4194304 : 8388608;
        } else {
            z4 = z;
        }
        if ((i & 100663296) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            i3 |= true != buxVarC.D(z2) ? 268435456 : 536870912;
        }
        int i7 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (true != buxVarC.D(z3) ? 2 : 4);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.C(cfrVar) ? 16 : 32;
        }
        int i8 = i4;
        if (buxVarC.I(((i7 & 306783379) == 306783378 && (i8 & 19) == 18) ? false : true, i7 & 1)) {
            int i9 = i7 >> 3;
            bvv bvvVar2 = (bvv) buxVarC;
            bvvVar2.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            int iN = N(j, z2);
            boolean z6 = z3 && dlj.a(dll.a(j), 350.0f) >= 0;
            boolean zX = x(j, z3);
            boolean z7 = (iN == 2 || z6) && !zX;
            buxVarC.v(-758974936);
            cfy cfyVarC = awd.c(cfyVar, 1.0f);
            if (z7) {
                buxVar3 = buxVarC;
                i5 = i9;
                bvvVar = bvvVar2;
                r0 = 0;
            } else {
                i5 = i9;
                r0 = 0;
                boolean z8 = z4;
                bvvVar = bvvVar2;
                buxVar3 = buxVarC;
                cfyVarC = U(cfyVarC, aseVar2, V(z8, f, f, BitmapDescriptorFactory.HUE_RED, z2, buxVarC, 8), czz.au(buxVarC).c, buxVar3, (i7 >> 6) & 112);
            }
            cfy cfyVar2 = cfyVarC;
            bvvVar.Y(r0);
            ctp ctpVarA = avv.a(atd.a, z7 ? cfl.n : cfrVar, buxVar3, r0);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVar3, cfyVar2);
            afdr afdrVar = cwb.a;
            buxVar3.w();
            if (bvvVar.t) {
                buxVar3.j(afdrVar);
            } else {
                buxVar3.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVar3, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVar3, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVar3, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVar3, afecVar);
            boolean z9 = z6;
            afeg afegVar4 = cwb.c;
            byq.c(buxVar3, cfyVarJ, afegVar4);
            avy avyVar = avy.a;
            cfm cfmVar2 = z7 ? cfl.k : cfl.j;
            cfv cfvVar = cfy.e;
            int i10 = i5;
            cfy cfyVarB = avyVar.b(cfvVar, 1.0f, true);
            ctp ctpVarA2 = atp.a(atd.c, cfmVar2, buxVar3, 0);
            int iG2 = a.g(bvvVar.u);
            ccx ccxVarAh2 = bvvVar.ah();
            cfy cfyVarJ2 = bzi.j(buxVar3, cfyVarB);
            buxVar3.w();
            if (bvvVar.t) {
                buxVar3.j(afdrVar);
            } else {
                buxVar3.y();
            }
            byq.c(buxVar3, ctpVarA2, afegVar);
            byq.c(buxVar3, ccxVarAh2, afegVar2);
            byq.c(buxVar3, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVar3, afecVar);
            byq.c(buxVar3, cfyVarJ2, afegVar4);
            if (z7) {
                int i11 = i10 & 112;
                buxVar3.v(989616570);
                cfy cfyVarB2 = ats.b(cfvVar, 1.0f, false);
                ctp ctpVarB = atk.b(cfl.a, false);
                cfmVar = cfmVar2;
                int iG3 = a.g(bvvVar.u);
                ccx ccxVarAh3 = bvvVar.ah();
                cfy cfyVarJ3 = bzi.j(buxVar3, cfyVarB2);
                buxVar3.w();
                if (bvvVar.t) {
                    buxVar3.j(afdrVar);
                } else {
                    buxVar3.y();
                }
                byq.c(buxVar3, ctpVarB, afegVar);
                byq.c(buxVar3, ccxVarAh3, afegVar2);
                byq.c(buxVar3, Integer.valueOf(iG3), afegVar3);
                byq.b(buxVar3, afecVar);
                byq.c(buxVar3, cfyVarJ3, afegVar4);
                j2 = j;
                afehVar4 = afehVar3;
                afehVar4.invoke(new myy(j2, mwyVar), buxVar3, Integer.valueOf(i11));
                bvvVar.Y(true);
                asl.A(awd.d(cfvVar, gjk.b.k), buxVar3);
                z5 = false;
                bvvVar.Y(false);
            } else {
                afehVar4 = afehVar3;
                j2 = j;
                cfmVar = cfmVar2;
                z5 = false;
                buxVar3.v(989937544);
                bvvVar.Y(false);
            }
            float fA = dll.a(j2);
            if (z3) {
                buxVar3.v(990336855);
                f2 = ((kvd) buxVar3.f(kvc.b)).d(buxVar3).a;
                bvvVar.Y(z5);
            } else {
                buxVar3.v(990422353);
                bvvVar.Y(z5);
                f2 = gjk.d.k;
            }
            bux buxVar4 = buxVar3;
            B(afehVar, afehVar2, aseVar, fA, null, z7, V(z, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, z2, buxVar4, 6), null, cfmVar, z3, cfrVar, buxVar4, (i10 & 896) | (i7 & 126) | ((i8 << 27) & 1879048192), (i8 >> 3) & 14, 144);
            buxVar2 = buxVar4;
            bvvVar.Y(true);
            if (zX || (iN == 1 && !z9)) {
                buxVar2.v(-281209862);
                asl.A(awd.i(cfvVar, gjk.d.k), buxVar2);
                afehVar4.invoke(new myy(j2, mwyVar), buxVar2, Integer.valueOf(i10 & 112));
                bvvVar.Y(false);
            } else {
                buxVar2.v(-281083010);
                bvvVar.Y(false);
            }
            bvvVar.Y(true);
        } else {
            afehVar4 = afehVar3;
            j2 = j;
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            final long j3 = j2;
            final afeh afehVar5 = afehVar4;
            bxfVarJ.c = new afeg() { // from class: mxr
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    afeh afehVar6 = afehVar;
                    afeh afehVar7 = afehVar2;
                    afeh afehVar8 = afehVar5;
                    ase aseVar3 = aseVar;
                    long j4 = j3;
                    mwy mwyVar2 = mwyVar;
                    float f3 = f;
                    boolean z10 = z;
                    int i12 = i;
                    cfy cfyVar3 = cfyVar;
                    int i13 = i2;
                    int i14 = i12 | 1;
                    int i15 = i13 & 306783378;
                    int i16 = 306783378 & i14;
                    boolean z11 = z3;
                    int i17 = i13 & 613566756;
                    int i18 = i14 & 613566756;
                    cfr cfrVar2 = cfrVar;
                    myi.J(afehVar6, afehVar7, afehVar8, aseVar3, j4, mwyVar2, f3, z10, cfyVar3, z2, z11, cfrVar2, (bux) obj, (i14 & (-920350135)) | i16 | (i18 >> 1) | ((i16 + i16) & i18), (i13 & (-920350135)) | i15 | (i17 >> 1) | ((i15 + i15) & i17));
                    return afak.a;
                }
            };
        }
    }

    public static final void K(Bitmap bitmap, cfy cfyVar, csi csiVar, bux buxVar, int i) {
        int i2;
        bxf bxfVarJ;
        kmg kmgVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1304023412);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(bitmap) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        byte[] bArr = null;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(csiVar) ? 1024 : 2048;
        }
        if (!buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            buxVarC.s();
        } else {
            if (!acxa.aY()) {
                buxVarC.v(182494178);
                ca.bc(new cjj(bitmap), cfyVar, csiVar, buxVarC, (i2 & 1008) | ((i2 << 3) & 57344), 232);
                ((bvv) buxVarC).Y(false);
                bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    kmgVar = new kmg((Object) bitmap, (Object) cfyVar, (Object) csiVar, i, 7);
                    bxfVarJ.c = kmgVar;
                }
                return;
            }
            buxVarC.v(182659470);
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.Y(false);
            boolean zE = ((i2 & 7168) == 2048) | buxVarC.E(bitmap);
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new lyb(bitmap, csiVar, 11, bArr);
                bvvVar.ad(objS);
            }
            asl.A(bxc.r(cfyVar, (afec) objS), buxVarC);
        }
        bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            kmgVar = new kmg((Object) bitmap, (Object) cfyVar, (Object) csiVar, i, 3);
            bxfVarJ.c = kmgVar;
        }
    }

    static /* synthetic */ List L(List list, long j, boolean z) {
        return i(list, j, true, z, lel.a.a().a());
    }

    static /* synthetic */ boolean M(long j, boolean z, boolean z2, int i) {
        if ((i & 4) != 0) {
            z2 = lel.a.a().b();
        }
        return y(j, z, z2, lel.a.a().a());
    }

    public static final int N(long j, boolean z) {
        if (dlj.a(dll.b(j), 500.0f) >= 0) {
            if (dlj.a(dll.a(j), true != z ? 280.0f : 400.0f) < 0) {
                return 3;
            }
        }
        return (dlj.a(dll.a(j), 400.0f) >= 0 || (dlj.a(dll.a(j), 350.0f) >= 0 && dlj.a(dll.b(j), 500.0f) < 0) || dlj.a(dll.a(j), dll.b(j)) > 0) ? 2 : 1;
    }

    static /* synthetic */ int O(long j) {
        return N(j, lel.a.a().b());
    }

    public static final void P(ltg ltgVar, ksy ksyVar, String str, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        cfv cfvVar;
        bvv bvvVar;
        asf asfVar;
        boolean z;
        Object obj;
        boolean z2;
        ktf ktfVarG;
        ksy ksyVar2 = ksyVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-380984182);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(ltgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(ksyVar2) : buxVarC.E(ksyVar2)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(str) ? 128 : 256;
        }
        int i4 = i2 | 3072;
        if (buxVarC.I((i4 & 1171) != 1170, i4 & 1)) {
            cfv cfvVar2 = cfy.e;
            if (ltgVar != null) {
                buxVarC.v(1698968271);
                bvv bvvVar2 = (bvv) buxVarC;
                Object objS = bvvVar2.S();
                Object obj2 = buw.a;
                if (objS == obj2) {
                    objS = new asg();
                    bvvVar2.ad(objS);
                }
                asf asfVar2 = (asf) objS;
                cmw cmwVarF = lgi.f(ltgVar.a, BitmapDescriptorFactory.HUE_RED, buxVarC, 3);
                cfy cfyVarD = das.d(cfvVar2, str);
                float f = gjk.a.k;
                boolean zE = buxVarC.E(ltgVar);
                Object objS2 = bvvVar2.S();
                if (zE || objS2 == obj2) {
                    objS2 = new mvg(ltgVar, 5);
                    bvvVar2.ad(objS2);
                }
                cfy cfyVarJ = ebj.j(cfyVarD, asfVar2, f, (afdr) objS2);
                boolean z3 = ltgVar.b;
                if (leh.a.a().b()) {
                    buxVarC.v(1699450352);
                    aezr aezrVar = ktf.a;
                    asfVar = asfVar2;
                    z2 = z3;
                    obj = obj2;
                    z = false;
                    bvvVar = bvvVar2;
                    ktfVarG = ktf.a(kgq.g(0L, 0L, 0L, 0L, buxVarC, 255), 0L, gux.c(buxVarC).T(), 251);
                    bvvVar.Y(false);
                } else {
                    bvvVar = bvvVar2;
                    asfVar = asfVar2;
                    z = false;
                    obj = obj2;
                    z2 = z3;
                    buxVarC.v(1699588736);
                    aezr aezrVar2 = ktf.a;
                    ktfVarG = kgq.g(0L, 0L, 0L, 0L, buxVarC, 255);
                    bvvVar.Y(false);
                }
                ktf ktfVar = ktfVarG;
                boolean zE2 = buxVarC.E(ltgVar);
                Object objS3 = bvvVar.S();
                int i5 = 6;
                if (zE2 || objS3 == obj) {
                    objS3 = new mvg(ltgVar, i5);
                    bvvVar.ad(objS3);
                }
                cfvVar = cfvVar2;
                khc.l(cmwVarF, (afdr) objS3, cfyVarJ, ksyVar, z2, null, ktfVar, null, asfVar, buxVarC, ((i4 << 6) & 7168) | 8, 6, 2784);
                ksyVar2 = ksyVar;
                buxVarC = buxVarC;
                bvvVar.Y(z);
            } else {
                cfvVar = cfvVar2;
                buxVarC.v(1699661338);
                asl.A(awd.i(cfvVar, ksyVar2.h), buxVarC);
                ((bvv) buxVarC).Y(false);
            }
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(ltgVar, ksyVar2, str, cfyVar2, i, 12);
        }
    }

    public static final void Q(final Bitmap bitmap, final mwy mwyVar, final float f, cfy cfyVar, final boolean z, bux buxVar, final int i) {
        int i2;
        final cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1719381556);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(bitmap) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(mwyVar) : buxVarC.E(mwyVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.z(f) ? 128 : 256;
        }
        int i4 = i2 | 3072;
        if ((i & 24576) == 0) {
            i4 |= true != buxVarC.D(z) ? 8192 : 16384;
        }
        if (buxVarC.I((i4 & 9363) != 9362, i4 & 1)) {
            final cfv cfvVar = cfy.e;
            ca.I(new nbh(bitmap), null, null, "albumArt", bxc.i(1865263564, true, new afeh() { // from class: mxc
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Integer num;
                    nbh nbhVar = (nbh) obj;
                    bux buxVar2 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    yph yphVar = myi.a;
                    nbhVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != buxVar2.C(nbhVar) ? 2 : 4;
                    }
                    if (buxVar2.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        cfv cfvVar2 = cfy.e;
                        cfy cfyVarC = awd.c(cfvVar2, 1.0f);
                        ctp ctpVarB = atk.b(cfl.a, false);
                        int iG = a.g(buxVar2.b());
                        ccx ccxVarN = buxVar2.N();
                        cfy cfyVarJ = bzi.j(buxVar2, cfyVarC);
                        afdr afdrVar = cwb.a;
                        buxVar2.M();
                        buxVar2.w();
                        if (buxVar2.G()) {
                            buxVar2.j(afdrVar);
                        } else {
                            buxVar2.y();
                        }
                        boolean z2 = z;
                        cfy cfyVar3 = cfvVar;
                        byq.c(buxVar2, ctpVarB, cwb.e);
                        byq.c(buxVar2, ccxVarN, cwb.d);
                        byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
                        byq.b(buxVar2, cwb.g);
                        byq.c(buxVar2, cfyVarJ, cwb.c);
                        Bitmap bitmap2 = nbhVar.a;
                        cfy cfyVarC2 = awd.c(cfyVar3, 1.0f);
                        if (z2) {
                            cfyVarC2 = cdj.b(cfyVarC2, (f / 10.0f) + BitmapDescriptorFactory.HUE_RED);
                        }
                        mwy mwyVar2 = mwyVar;
                        myi.K(bitmap2, cfyVarC2, csh.a, buxVar2, 3120);
                        if (lmi.a.a().d()) {
                            buxVar2.v(-1034537802);
                            cfy cfyVarC3 = awd.c(cfvVar2, 1.0f);
                            int iD = mwyVar2.d(mwyVar2.a.e, 15, 32, 95, buxVar2);
                            int iMin = 191;
                            if (mwyVar2.d && !mwyVar2.b && leh.a.a().b()) {
                                buxVar2.v(-1508096311);
                                boolean zBl = ca.bl(buxVar2);
                                buxVar2.o();
                                if (!zBl && (num = mwyVar2.c) != null) {
                                    int iIntValue2 = num.intValue();
                                    double[][] dArr = acaf.a;
                                    double dA = acaf.a(iD) + 16.0d;
                                    double dU = a.u((acaf.a(iIntValue2) + 16.0d) / 116.0d);
                                    double dU2 = (((a.u(0.9482758620689655d) * 100.0d) + 5.0d) / 7.1d) - 5.0d;
                                    double d = dU * 100.0d;
                                    iMin = d >= dU2 ? 0 : Math.min(191, afpt.g(afgi.j(((dU2 - d) / ((a.u(dA / 116.0d) * 100.0d) - d)) * 255.0d), 0, 255));
                                }
                            } else {
                                buxVar2.v(493655852);
                                buxVar2.o();
                            }
                            atk.c(cfyVarC3.a(new aix(cjn.i(dvd.e(iD, iMin)), ckq.a)), buxVar2, 0);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-1034432216);
                            myi.H(mwyVar2, cfyVar3, buxVar2, 0);
                            buxVar2.o();
                        }
                        buxVar2.n();
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 27648, 6);
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: mxd
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    Bitmap bitmap2 = bitmap;
                    int i5 = i | 1;
                    int i6 = 306783378 & i5;
                    int i7 = 613566756 & i5;
                    myi.Q(bitmap2, mwyVar, f, cfyVar2, z, buxVar2, (i5 & (-920350135)) | i6 | (i7 >> 1) | ((i6 + i6) & i7));
                    return afak.a;
                }
            };
        }
    }

    public static final void R(List list, ksy ksyVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        avy avyVar;
        afec afecVar;
        afeg afegVar;
        int i3;
        List list2 = list;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-547050594);
        boolean z = true;
        if (i4 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(list2) : buxVarC.E(list2)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(ksyVar) : buxVarC.E(ksyVar)) ? 16 : 32;
        }
        int i5 = i2 | 384;
        if (buxVarC.I((i5 & 147) != 146, i5 & 1)) {
            cfv cfvVar = cfy.e;
            cfy cfyVarR = awd.r(cfvVar);
            ctp ctpVarA = avv.a(atd.a, cfl.n, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
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
            buxVarC.v(-2011327176);
            int i6 = 0;
            while (i6 < 3) {
                ltg ltgVar = (ltg) woy.bI(list2, i6);
                int i7 = i5;
                cfy cfyVarB = avyVar2.b(cfvVar, 1.0f, z);
                ctp ctpVarB = atk.b(cfl.e, false);
                int iG2 = a.g(bvvVar.u);
                ccx ccxVarAh2 = bvvVar.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfyVarB);
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarB, afegVar2);
                byq.c(buxVarC, ccxVarAh2, afegVar3);
                byq.c(buxVarC, Integer.valueOf(iG2), afegVar4);
                byq.b(buxVarC, afecVar2);
                byq.c(buxVarC, cfyVarJ2, afegVar5);
                if (ltgVar != null) {
                    buxVarC.v(-1096065088);
                    afecVar = afecVar2;
                    afegVar = afegVar5;
                    i3 = i6;
                    avyVar = avyVar2;
                    P(ltgVar, ksyVar, "additional", null, buxVarC, (i7 & 112) | 384);
                    bvvVar.Y(false);
                } else {
                    avyVar = avyVar2;
                    afecVar = afecVar2;
                    afegVar = afegVar5;
                    i3 = i6;
                    buxVarC.v(-1095957456);
                    bvvVar.Y(false);
                }
                bvvVar.Y(true);
                i6 = i3 + 1;
                avy avyVar3 = avyVar;
                z = true;
                avyVar2 = avyVar3;
                afegVar5 = afegVar;
                afecVar2 = afecVar;
                i5 = i7;
                list2 = list;
            }
            bvvVar.Y(false);
            bvvVar.Y(z);
            cfyVar2 = cfvVar;
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(list, ksyVar, cfyVar2, i, 4);
        }
    }

    public static final void S(Bitmap bitmap, ltr ltrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1454845343);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.E(bitmap) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(ltrVar) ? 16 : 32;
        }
        int i4 = i2 | 384;
        if (buxVarC.I((i4 & 147) != 146, i4 & 1)) {
            cfyVar2 = cfy.e;
            cfy cfyVarG = cjn.g(awd.i(cfyVar2, 32.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bcr.b(4.0f), true, 0, 1042431);
            if (ltrVar != null) {
                buxVarC.v(782871458);
                C(ltrVar, 32.0f, cfyVarG, buxVarC, ((i4 >> 3) & 14) | 48);
                ((bvv) buxVarC).Y(false);
            } else if (bitmap != null) {
                buxVarC.v(782963187);
                ca.bc(new cjj(new nbh(bitmap).a), cfyVarG, null, buxVarC, 48, 248);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(783101571);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(bitmap, ltrVar, cfyVar2, i, 5, (byte[]) null);
        }
    }

    private static final GhIcon T(bym bymVar) {
        return (GhIcon) bymVar.a();
    }

    private static final cfy U(cfy cfyVar, ase aseVar, avp avpVar, ckv ckvVar, bux buxVar, int i) {
        int i2 = i >> 3;
        return asl.G(kvc.b(ebj.l(cfyVar, avpVar), aseVar, ckvVar, false, buxVar, (i & 112) | (i2 & 896), 252), avpVar);
    }

    private static final avp V(boolean z, float f, float f2, float f3, boolean z2, bux buxVar, int i) {
        if ((i & 2) != 0) {
            f = ((kvd) buxVar.f(kvc.b)).d(buxVar).a;
        }
        if ((i & 4) != 0) {
            f2 = ((kvd) buxVar.f(kvc.b)).d(buxVar).a;
        }
        if ((i & 8) != 0) {
            f3 = gjk.d.k;
        }
        float f4 = ((kvd) buxVar.f(kvc.b)).d(buxVar).a;
        if (z) {
            return new avr(f, 10.0f, f, f4);
        }
        if (true == z2) {
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        return new avr(f, f2, f, f3);
    }

    public static final ComponentName a(bym bymVar) {
        return (ComponentName) bymVar.a();
    }

    public static final Bitmap b(bym bymVar) {
        return (Bitmap) bymVar.a();
    }

    public static final dfw c(dfw dfwVar) {
        dkr.a(-1.0f);
        return dfw.v(dfwVar, 0L, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, new dks(-1.0f, 1), 15728639);
    }

    public static final ltr d(bym bymVar) {
        return (ltr) bymVar.a();
    }

    public static final mzb e(bym bymVar) {
        return (mzb) bymVar.a();
    }

    public static final Duration f(bym bymVar) {
        return (Duration) bymVar.a();
    }

    public static final Duration g(bym bymVar) {
        return (Duration) bymVar.a();
    }

    public static final String h(Duration duration, Duration duration2) {
        long millis = duration.toMillis() / 1000;
        long millis2 = duration2 != null ? duration2.toMillis() / 1000 : 0L;
        long j = millis / 3600;
        long j2 = millis2 % 3600;
        boolean z = j > 0 || millis2 / 3600 > 0;
        long j3 = (millis % 3600) / 60;
        boolean z2 = j2 / 60 >= 10 || j3 >= 10;
        long j4 = millis % 60;
        if (z) {
            String str = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j4)}, 3));
            str.getClass();
            return str;
        }
        String str2 = String.format(Locale.US, (true != z2 ? "%d" : "%02d").concat(":%02d"), Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
        str2.getClass();
        return str2;
    }

    public static final List i(List list, long j, boolean z, boolean z2, boolean z3) {
        boolean z4 = z3 && dlj.a(dll.a(j), 350.0f) >= 0 && dlj.a(dll.b(j), 540.0f) >= 0;
        Object obj = null;
        if (!lmi.a.a().d()) {
            return null;
        }
        if (z) {
            if ((dlj.a(dll.b(j), 500.0f) < 0 || dlj.a(dll.a(j), 280.0f) < 0) && dlj.a(dll.b(j), 600.0f) < 0) {
                if (!z4) {
                    return null;
                }
                z4 = true;
            }
        } else if (dlj.a(dll.b(j), 500.0f) < 0) {
            return null;
        }
        if (list == null || list.isEmpty()) {
            return afbe.a;
        }
        if (!z2 && !z4) {
            return (z || list.size() <= 1 || dlj.a(dll.b(j), 600.0f) < 0) ? list.subList(0, 1) : list.subList(0, 2);
        }
        float fB = dll.b(j);
        int size = list.size();
        afao afaoVar = new afao((afar) mza.f);
        while (true) {
            if (!afaoVar.hasNext()) {
                break;
            }
            Object next = afaoVar.next();
            if (dlj.a(fB, ((mza) next).g) >= 0) {
                obj = next;
                break;
            }
        }
        mza mzaVar = (mza) obj;
        return list.subList(0, Math.min(mzaVar != null ? mzaVar.h : 0, size));
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:211:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final defpackage.ltg r30, final defpackage.ltg r31, final defpackage.ltg r32, final java.util.List r33, final com.google.android.apps.auto.components.media.compat.AaPlaybackState r34, final boolean r35, final long r36, final boolean r38, final boolean r39, final boolean r40, final long r41, final long r43, final defpackage.cjv r45, defpackage.cfy r46, boolean r47, boolean r48, defpackage.bux r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.j(ltg, ltg, ltg, java.util.List, com.google.android.apps.auto.components.media.compat.AaPlaybackState, boolean, long, boolean, boolean, boolean, long, long, cjv, cfy, boolean, boolean, bux, int, int, int):void");
    }

    public static final void k(final boolean z, final boolean z2, bux buxVar, final int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(399423208);
        if (i3 == 0) {
            i2 = (true != buxVarC.D(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z2) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, 1 & i2)) {
            bym bymVarA = ady.a((z2 && ldz.a.a().b()) ? gjk.b.k : gjk.c.k, null, null, null, buxVarC, 0, 14);
            lmh lmhVar = lmi.a;
            asl.A(awd.d(awd.i(cfy.e, z ? BitmapDescriptorFactory.HUE_RED : lmhVar.a().b() ? ((dlj) bymVarA.a()).a : gjk.d.k), lmhVar.a().b() ? ((dlj) bymVarA.a()).a : gjk.d.k), buxVarC);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: mye
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    boolean z3 = z;
                    int i6 = 613566756 & i4;
                    boolean z4 = z2;
                    myi.k(z3, z4, (bux) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final com.google.android.apps.auto.components.graphics.icon.GhIcon r19, final defpackage.cjv r20, float r21, defpackage.cfy r22, defpackage.bux r23, final int r24, final int r25) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.l(com.google.android.apps.auto.components.graphics.icon.GhIcon, cjv, float, cfy, bux, int, int):void");
    }

    public static final void m(final ltg ltgVar, final ltg ltgVar2, final ltg ltgVar3, final AaPlaybackState aaPlaybackState, final ksy ksyVar, final boolean z, final long j, final long j2, final cjv cjvVar, bux buxVar, final int i) {
        ltg ltgVar4;
        int i2;
        bux buxVar2;
        int i3;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-271730320);
        if (i4 == 0) {
            ltgVar4 = ltgVar;
            i2 = (true != buxVarC.E(ltgVar4) ? 2 : 4) | i;
        } else {
            ltgVar4 = ltgVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(ltgVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(ltgVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(aaPlaybackState) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != ((32768 & i) == 0 ? buxVarC.C(ksyVar) : buxVarC.E(ksyVar)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.B(j) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.B(j2) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != buxVarC.C(cjvVar) ? 33554432 : 67108864;
        }
        int i5 = i2;
        if (buxVarC.I((i5 & 38347923) != 38347922, i5 & 1)) {
            int i6 = i5 >> 6;
            int i7 = (i5 >> 9) & 112;
            bux buxVar3 = buxVarC;
            P(ltgVar4, ksyVar, "previous", null, buxVar3, (i5 & 14) | 384 | i7);
            if (ltgVar2 != null) {
                buxVar3.v(895808590);
                float f = mvz.a;
                int i8 = i5 >> 3;
                i3 = i6;
                s(ltgVar2, aaPlaybackState, ksyVar, z, bcr.b(20.0f), j, j2, cjvVar, null, buxVar3, (i8 & 29360128) | (i8 & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (458752 & i8) | (3670016 & i8), 256);
                buxVar3 = buxVar3;
                ((bvv) buxVar3).Y(false);
            } else {
                i3 = i6;
                buxVar3.v(896058450);
                ((bvv) buxVar3).Y(false);
            }
            bux buxVar4 = buxVar3;
            P(ltgVar3, ksyVar, "next", null, buxVar4, (i3 & 14) | 384 | i7);
            buxVar2 = buxVar4;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: mxq
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ltg ltgVar5 = ltgVar;
                    ltg ltgVar6 = ltgVar2;
                    ltg ltgVar7 = ltgVar3;
                    AaPlaybackState aaPlaybackState2 = aaPlaybackState;
                    ksy ksyVar2 = ksyVar;
                    int i9 = i;
                    int i10 = i9 | 1;
                    int i11 = 306783378 & i10;
                    int i12 = i11 + i11;
                    int i13 = 613566756 & i10;
                    int i14 = i12 & i13;
                    myi.m(ltgVar5, ltgVar6, ltgVar7, aaPlaybackState2, ksyVar2, z, j, j2, cjvVar, (bux) obj, i14 | i11 | (i13 >> 1) | (i10 & (-920350135)));
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x0295, code lost:
    
        if (r59 == false) goto L190;
     */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x047c A[PHI: r9
  0x047c: PHI (r9v59 boolean) = (r9v51 boolean), (r9v60 boolean) binds: [B:245:0x0479, B:240:0x046f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x057b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final boolean r49, final defpackage.afec r50, final long r51, final defpackage.cil r53, final float r54, defpackage.bwq r55, float r56, defpackage.afeg r57, boolean r58, boolean r59, final defpackage.mzy r60, defpackage.bux r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.n(boolean, afec, long, cil, float, bwq, float, afeg, boolean, boolean, mzy, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final android.graphics.Bitmap r39, final defpackage.mwy r40, final defpackage.cjv r41, final com.google.android.apps.auto.components.graphics.icon.GhIcon r42, final boolean r43, final boolean r44, final java.lang.String r45, final defpackage.afeg r46, final float r47, final defpackage.afeh r48, final defpackage.afeh r49, final defpackage.afeh r50, final defpackage.afdr r51, final defpackage.ltg r52, final defpackage.ltg r53, final defpackage.ltg r54, final java.util.List r55, final boolean r56, final com.google.android.apps.auto.components.media.compat.AaPlaybackState r57, final long r58, final defpackage.cil r60, final defpackage.afdr r61, final boolean r62, final float r63, final boolean r64, defpackage.afeg r65, boolean r66, boolean r67, boolean r68, defpackage.bux r69, final int r70, final int r71, final int r72, final int r73) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.o(android.graphics.Bitmap, mwy, cjv, com.google.android.apps.auto.components.graphics.icon.GhIcon, boolean, boolean, java.lang.String, afeg, float, afeh, afeh, afeh, afdr, ltg, ltg, ltg, java.util.List, boolean, com.google.android.apps.auto.components.media.compat.AaPlaybackState, long, cil, afdr, boolean, float, boolean, afeg, boolean, boolean, boolean, bux, int, int, int, int):void");
    }

    public static final void p(final int i, final boolean z, bux buxVar, final int i2, final int i3) {
        int i4;
        int i5 = i2 & 6;
        bux buxVarC = buxVar.c(-1090067943);
        if (i5 == 0) {
            i4 = (true != buxVarC.A(i) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        boolean z2 = i6 == 0;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if (buxVarC.I((i4 & 19) != 18, i4 & 1)) {
            z &= z2;
            if (z) {
                buxVarC.v(33725107);
                asl.A(awd.i(cfy.e, gjk.a.k), buxVarC);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(33777001);
                ((bvv) buxVarC).Y(false);
            }
            boc.a(dao.b(i, buxVarC, i4 & 14), null, null, 0L, buxVarC, 56, 12);
            if (z) {
                buxVarC.v(33926793);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(33874899);
                asl.A(awd.i(cfy.e, gjk.a.k), buxVarC);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: mxk
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i7 = i2 | 1;
                    int i8 = 306783378 & i7;
                    int i9 = i;
                    int i10 = 613566756 & i7;
                    boolean z3 = z;
                    myi.p(i9, z3, (bux) obj, (i7 & (-920350135)) | i8 | (i10 >> 1) | ((i8 + i8) & i10), i3);
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0351  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final defpackage.avx r23, final defpackage.ltg r24, final defpackage.ltg r25, final defpackage.ltg r26, final java.util.List r27, final boolean r28, final com.google.android.apps.auto.components.media.compat.AaPlaybackState r29, final defpackage.ksy r30, final boolean r31, final long r32, final long r34, final defpackage.cjv r36, boolean r37, defpackage.bux r38, final int r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.q(avx, ltg, ltg, ltg, java.util.List, boolean, com.google.android.apps.auto.components.media.compat.AaPlaybackState, ksy, boolean, long, long, cjv, boolean, bux, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final long r51, final defpackage.cil r53, final float r54, final float r55, defpackage.afdr r56, com.google.android.apps.auto.components.graphics.icon.GhIcon r57, boolean r58, defpackage.cjv r59, boolean r60, boolean r61, boolean r62, boolean r63, defpackage.bux r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 878
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.r(long, cil, float, float, afdr, com.google.android.apps.auto.components.graphics.icon.GhIcon, boolean, cjv, boolean, boolean, boolean, boolean, bux, int, int, int):void");
    }

    public static final void s(final ltg ltgVar, final AaPlaybackState aaPlaybackState, final ksy ksyVar, final boolean z, final ckv ckvVar, final long j, final long j2, final cjv cjvVar, cfy cfyVar, bux buxVar, final int i, final int i2) {
        int i3;
        long j3;
        bux buxVar2;
        final cfy cfyVar2;
        long jH;
        ckvVar.getClass();
        int i4 = i & 6;
        bux buxVarC = buxVar.c(-483077984);
        if (i4 == 0) {
            i3 = (true != buxVarC.E(ltgVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != buxVarC.E(aaPlaybackState) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i3 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(ksyVar) : buxVarC.E(ksyVar)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.D(z) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i3 |= true != buxVarC.C(ckvVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            j3 = j;
            i3 |= true != buxVarC.B(j3) ? 65536 : 131072;
        } else {
            j3 = j;
        }
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.B(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i3 |= true != buxVarC.C(cjvVar) ? 4194304 : 8388608;
        }
        int i5 = i2 & 256;
        if (i5 != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= true != buxVarC.C(cfyVar) ? 33554432 : 67108864;
        }
        if (buxVarC.I((38347923 & i3) != 38347922, i3 & 1)) {
            cfy cfyVar3 = i5 != 0 ? cfy.e : cfyVar;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                objS = new asg();
                bvvVar.ad(objS);
            }
            asf asfVar = (asf) objS;
            int i6 = i3;
            cmw cmwVarF = lgi.f(ltgVar.a, BitmapDescriptorFactory.HUE_RED, buxVarC, 3);
            afdr afdrVar = ltgVar.c;
            cfy cfyVarJ = ebj.j(das.d(cfyVar3, "playPause"), asfVar, gjk.a.k, afdrVar);
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new mto(5);
                bvvVar.ad(objS2);
            }
            cfy cfyVarA = kml.a(cfyVarJ, (afdr) objS2);
            boolean z2 = aaPlaybackState != null;
            aezr aezrVar = ktf.a;
            boolean z3 = z2;
            long jH2 = cjv.h(kfn.i(buxVarC).t(), 0.12f);
            if (cjvVar == null) {
                buxVarC.v(-381436668);
                jH = cjv.h(kfn.i(buxVarC).t(), 0.38f);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-381438962);
                bvvVar.Y(false);
                jH = cjvVar.a;
            }
            buxVar2 = buxVarC;
            khc.i(cmwVarF, afdrVar, cfyVarA, ksyVar, z3, z, null, ckvVar, kgq.e(j3, j2, 0L, 0L, 0L, jH2, jH, buxVar2, 60), null, asfVar, null, buxVar2, ((i6 << 3) & 7168) | 8 | ((i6 << 6) & 458752) | (29360128 & (i6 << 9)), 6, 2624);
            cfyVar2 = cfyVar3;
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
            cfyVar2 = cfyVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: mxn
                @Override // defpackage.afeg
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    ltg ltgVar2 = ltgVar;
                    AaPlaybackState aaPlaybackState2 = aaPlaybackState;
                    ksy ksyVar2 = ksyVar;
                    boolean z4 = z;
                    ckv ckvVar2 = ckvVar;
                    int i7 = i;
                    int i8 = i7 | 1;
                    int i9 = 306783378 & i8;
                    cjv cjvVar2 = cjvVar;
                    int i10 = 613566756 & i8;
                    cfy cfyVar4 = cfyVar2;
                    myi.s(ltgVar2, aaPlaybackState2, ksyVar2, z4, ckvVar2, j, j2, cjvVar2, cfyVar4, (bux) obj2, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10), i2);
                    return afak.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v57, types: [cfy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(defpackage.afeh r46, defpackage.afeh r47, defpackage.afeh r48, defpackage.asf r49, long r50, float r52, boolean r53, boolean r54, boolean r55, boolean r56, com.google.android.apps.auto.components.graphics.icon.GhIcon r57, defpackage.mwy r58, float r59, boolean r60, defpackage.afdr r61, boolean r62, long r63, long r65, defpackage.afeg r67, defpackage.ltg r68, defpackage.ltg r69, defpackage.ltg r70, java.util.List r71, com.google.android.apps.auto.components.media.compat.AaPlaybackState r72, boolean r73, long r74, defpackage.cjv r76, defpackage.afdr r77, defpackage.cil r78, float r79, boolean r80, boolean r81, defpackage.bux r82, int r83, int r84, int r85, int r86) {
        /*
            Method dump skipped, instructions count: 1508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.t(afeh, afeh, afeh, asf, long, float, boolean, boolean, boolean, boolean, com.google.android.apps.auto.components.graphics.icon.GhIcon, mwy, float, boolean, afdr, boolean, long, long, afeg, ltg, ltg, ltg, java.util.List, com.google.android.apps.auto.components.media.compat.AaPlaybackState, boolean, long, cjv, afdr, cil, float, boolean, boolean, bux, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:268:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:360:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v41, types: [cfy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u(defpackage.afeh r47, defpackage.afeh r48, defpackage.afeh r49, defpackage.asf r50, long r51, float r53, boolean r54, boolean r55, boolean r56, boolean r57, com.google.android.apps.auto.components.graphics.icon.GhIcon r58, defpackage.mwy r59, float r60, boolean r61, defpackage.afdr r62, boolean r63, long r64, long r66, defpackage.afeg r68, defpackage.ltg r69, defpackage.ltg r70, defpackage.ltg r71, java.util.List r72, com.google.android.apps.auto.components.media.compat.AaPlaybackState r73, boolean r74, long r75, defpackage.cjv r77, defpackage.afdr r78, defpackage.cil r79, float r80, boolean r81, boolean r82, defpackage.bux r83, int r84, int r85, int r86, int r87) {
        /*
            Method dump skipped, instructions count: 1759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.u(afeh, afeh, afeh, asf, long, float, boolean, boolean, boolean, boolean, com.google.android.apps.auto.components.graphics.icon.GhIcon, mwy, float, boolean, afdr, boolean, long, long, afeg, ltg, ltg, ltg, java.util.List, com.google.android.apps.auto.components.media.compat.AaPlaybackState, boolean, long, cjv, afdr, cil, float, boolean, boolean, bux, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(defpackage.atm r22, defpackage.afdr r23, defpackage.asf r24, defpackage.cil r25, defpackage.cfy r26, defpackage.bux r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.v(atm, afdr, asf, cil, cfy, bux, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:350:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x09a6  */
    /* JADX WARN: Type inference failed for: r2v67, types: [cfy] */
    /* JADX WARN: Type inference failed for: r2v93, types: [cfy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w(final defpackage.afeh r67, final defpackage.afeh r68, defpackage.afeh r69, final defpackage.asf r70, long r71, final float r73, boolean r74, final boolean r75, final boolean r76, final boolean r77, final com.google.android.apps.auto.components.graphics.icon.GhIcon r78, defpackage.mwy r79, final float r80, boolean r81, final defpackage.afdr r82, final boolean r83, final long r84, final long r86, final defpackage.afeg r88, final defpackage.ltg r89, final defpackage.ltg r90, final defpackage.ltg r91, final java.util.List r92, final com.google.android.apps.auto.components.media.compat.AaPlaybackState r93, final boolean r94, final long r95, final defpackage.cjv r97, final defpackage.afdr r98, final defpackage.cil r99, final float r100, boolean r101, defpackage.bux r102, final int r103, final int r104, final int r105, final int r106) {
        /*
            Method dump skipped, instructions count: 2624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myi.w(afeh, afeh, afeh, asf, long, float, boolean, boolean, boolean, boolean, com.google.android.apps.auto.components.graphics.icon.GhIcon, mwy, float, boolean, afdr, boolean, long, long, afeg, ltg, ltg, ltg, java.util.List, com.google.android.apps.auto.components.media.compat.AaPlaybackState, boolean, long, cjv, afdr, cil, float, boolean, bux, int, int, int, int):void");
    }

    public static final boolean x(long j, boolean z) {
        return z && dlj.a(dll.b(j), 648.0f) > 0 && dlj.a(dll.a(j), 478.0f) < 0;
    }

    public static final boolean y(long j, boolean z, boolean z2, boolean z3) {
        if (!z) {
            if (z2 && N(j, true) == 3) {
                return true;
            }
            return z3 && dlj.a(dll.a(j), 350.0f) >= 0;
        }
        return false;
    }

    public static /* synthetic */ afak z(long j, cmd cmdVar) {
        cmdVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cmdVar.o() & 4294967295L)) / 2.0f;
        czz.H(cmdVar, j, 0L, 0L, (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), BitmapDescriptorFactory.HUE_RED, 246);
        return afak.a;
    }
}
