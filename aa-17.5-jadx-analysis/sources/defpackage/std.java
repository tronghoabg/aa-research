package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.location.LocationResult;
import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class std {
    public std(char[] cArr, byte[] bArr) {
        new AtomicLong(0L);
    }

    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 34962:
                return "VERTEX";
            case 34963:
                return "INDEX";
            default:
                return "null";
        }
    }

    private static afeg B(bym bymVar) {
        return (afeg) bymVar.a();
    }

    public static String b(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }

    public static String c(File file, String str) {
        int i = ssl.a;
        return new File(file, str).getPath();
    }

    public static void d(Runnable runnable) {
        Thread thread = new Thread(runnable, "PsdCollector");
        thread.setPriority(4);
        thread.start();
    }

    public static void e(tiw tiwVar, CarText carText, tjg tjgVar, boolean z, afeh afehVar, bux buxVar, int i) {
        int i2;
        afeh afehVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(184034002);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(carText) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(tjgVar) : buxVarC.E(tjgVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if ((i & 1572864) == 0) {
            afehVar2 = afehVar;
            i2 |= true != buxVarC.E(afehVar2) ? 524288 : 1048576;
        } else {
            afehVar2 = afehVar;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            int i4 = i2 & 7168;
            int i5 = 57344 & i2;
            int i6 = 458752 & i2;
            g(tiwVar, carText, tjgVar, z, true, afehVar2, buxVarC, (i2 & 14) | 1572864 | (i2 & 112) | (i2 & 896) | i4 | i5 | i6 | ((i2 << 3) & 29360128));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mcg(tiwVar, carText, tjgVar, z, afehVar, i, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void f(defpackage.tiw r16, java.lang.CharSequence r17, defpackage.tjg r18, boolean r19, defpackage.afeh r20, defpackage.bux r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.std.f(tiw, java.lang.CharSequence, tjg, boolean, afeh, bux, int, int):void");
    }

    public static void g(tiw tiwVar, CarText carText, tjg tjgVar, boolean z, boolean z2, afeh afehVar, bux buxVar, int i) {
        int i2;
        CarText carText2;
        boolean z3;
        boolean z4;
        afeh afehVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1972487122);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            carText2 = carText;
            i2 |= true != buxVarC.E(carText2) ? 16 : 32;
        } else {
            carText2 = carText;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(tjgVar) : buxVarC.E(tjgVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            z3 = z;
            i2 |= true != buxVarC.D(z3) ? 65536 : 131072;
        } else {
            z3 = z;
        }
        if ((1572864 & i) == 0) {
            z4 = z2;
            i2 |= true != buxVarC.D(z4) ? 524288 : 1048576;
        } else {
            z4 = z2;
        }
        if ((i & 12582912) == 0) {
            afehVar2 = afehVar;
            i2 |= true != buxVarC.E(afehVar2) ? 4194304 : 8388608;
        } else {
            afehVar2 = afehVar;
        }
        if (buxVarC.I((4793491 & i2) != 4793490, i2 & 1)) {
            int i4 = i2 & 896;
            int i5 = i2 & 7168;
            int i6 = 57344 & i2;
            int i7 = 458752 & i2;
            int i8 = 3670016 & i2;
            i(tiwVar, carText2, tjgVar, z3, z4, afehVar2, buxVarC, ((i2 << 3) & 234881024) | (i2 & 14) | 12582912 | (i2 & 112) | i4 | i5 | i6 | i7 | i8);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mxm(tiwVar, carText, tjgVar, z, z2, afehVar, i, 6);
        }
    }

    public static void h(final tiw tiwVar, final CharSequence charSequence, tjg tjgVar, boolean z, final boolean z2, afeh afehVar, bux buxVar, final int i, final int i2) {
        int i3;
        final tjg tjgVar2;
        final boolean z3;
        bux buxVar2;
        final afeh afehVar2;
        int i4 = i & 6;
        bux buxVarC = buxVar.c(379075948);
        if (i4 == 0) {
            i3 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != ((i & 64) == 0 ? buxVarC.C(charSequence) : buxVarC.E(charSequence)) ? 16 : 32;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= true != buxVarC.E(null) ? 128 : 256;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= true != ((i & 4096) == 0 ? buxVarC.C(tjgVar) : buxVarC.E(tjgVar)) ? 1024 : 2048;
        }
        int i6 = i3 | 221184;
        if ((1572864 & i) == 0) {
            i6 |= true != buxVarC.D(z2) ? 524288 : 1048576;
        }
        int i7 = i6 | 12582912;
        if (buxVarC.I((4793491 & i7) != 4793490, i7 & 1)) {
            tjg tjgVar3 = i5 != 0 ? null : tjgVar;
            afeh afehVar3 = tia.b;
            g(tiwVar, CarText.create(charSequence), tjgVar3, true, z2, afehVar3, buxVarC, i7 & 33554318);
            tjgVar2 = tjgVar3;
            buxVar2 = buxVarC;
            z3 = true;
            afehVar2 = afehVar3;
        } else {
            buxVarC.s();
            tjgVar2 = tjgVar;
            z3 = z;
            buxVar2 = buxVarC;
            afehVar2 = afehVar;
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: tiz
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar3 = (bux) obj;
                    ((Integer) obj2).intValue();
                    tiw tiwVar2 = tiwVar;
                    CharSequence charSequence2 = charSequence;
                    int i8 = i | 1;
                    int i9 = 306783378 & i8;
                    int i10 = 613566756 & i8;
                    std.h(tiwVar2, charSequence2, tjgVar2, z3, z2, afehVar2, buxVar3, (i8 & (-920350135)) | i9 | (i10 >> 1) | ((i9 + i9) & i10), i2);
                    return afak.a;
                }
            };
        }
    }

    public static void i(tiw tiwVar, CarText carText, tjg tjgVar, boolean z, boolean z2, afeh afehVar, bux buxVar, int i) {
        int i2;
        boolean z3;
        afeh afehVar2;
        int i3 = i & 48;
        bux buxVarC = buxVar.c(458564689);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(carText) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(tjgVar) : buxVarC.E(tjgVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            z3 = z2;
            i2 |= true != buxVarC.D(z3) ? 524288 : 1048576;
        } else {
            z3 = z2;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.A(-1) ? 4194304 : 8388608;
        }
        if ((100663296 & i) == 0) {
            afehVar2 = afehVar;
            i2 |= true != buxVarC.E(afehVar2) ? 33554432 : 67108864;
        } else {
            afehVar2 = afehVar;
        }
        if (buxVarC.I((38347921 & i2) != 38347920, i2 & 1)) {
            int i4 = i2 >> 3;
            int i5 = 458752 & i2;
            afeh afehVar3 = afehVar2;
            j(carText, tjgVar, z, z3, afehVar3, buxVarC, (i2 & 3670016) | ((i2 >> 15) & 896) | (i4 & 126) | (i2 & 7168) | (57344 & i2) | i5 | (i4 & 29360128));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mxm(tiwVar, carText, tjgVar, z, z2, afehVar, i, 5);
        }
    }

    public static void j(CarText carText, tjg tjgVar, final boolean z, boolean z2, afeh afehVar, bux buxVar, int i) {
        int i2;
        final boolean z3;
        final boolean z4;
        final us usVar;
        boolean z5;
        final CarText carText2 = carText;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1529937629);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(carText2) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.A(-1) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(tjgVar) : buxVarC.E(tjgVar)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(null) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            z3 = z2;
            i2 |= true != buxVarC.D(z3) ? 524288 : 1048576;
        } else {
            z3 = z2;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 4194304 : 8388608;
        }
        int i4 = i2;
        if (buxVarC.I((4793491 & i4) != 4793490, i4 & 1)) {
            boolean z6 = tjgVar instanceof tjc;
            afdr afdrVar = z6 ? ((tjc) tjgVar).a : tjgVar instanceof tjd ? ((tjd) tjgVar).a : null;
            if (tjgVar instanceof tjd) {
            }
            boolean z7 = (tjgVar instanceof tje) && ((tje) tjgVar).a;
            bym bymVarC = byx.c(afdrVar, buxVarC);
            boolean zD = buxVarC.D(k(bymVarC) == null) | buxVarC.D(false);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            int i5 = 18;
            if (zD || objS == buw.a) {
                afdr afdrVarK = k(bymVarC);
                objS = afdrVarK != null ? new mel(afdrVarK, i5) : null;
                bvvVar.ad(objS);
            }
            us usVar2 = (us) objS;
            boolean zD2 = buxVarC.D(z7) | ((3670016 & i4) == 1048576) | buxVarC.E(carText2) | buxVarC.E(null) | buxVarC.A(-1) | ((i4 & 896) == 256) | buxVarC.E(usVar2) | buxVarC.E(null) | buxVarC.D(z6);
            boolean z8 = (458752 & i4) == 131072;
            Object objS2 = bvvVar.S();
            if ((zD2 || z8) || objS2 == buw.a) {
                z4 = z6;
                final boolean z9 = z7;
                usVar = usVar2;
                afdr afdrVar2 = new afdr() { // from class: tiy
                    @Override // defpackage.afdr
                    public final Object invoke() {
                        return new tis(z9, z3, carText2, usVar, z4, z);
                    }
                };
                z5 = z9;
                carText2 = carText2;
                bvvVar.ad(afdrVar2);
                objS2 = afdrVar2;
            } else {
                z4 = z6;
                z5 = z7;
                usVar = usVar2;
            }
            afdr afdrVar3 = (afdr) objS2;
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar3);
            } else {
                buxVarC.y();
            }
            byq.d(buxVarC, Boolean.valueOf(z5), new gcl(16));
            byq.d(buxVarC, Boolean.valueOf(z2), new gcl(17));
            byq.d(buxVarC, carText2, new gcl(18));
            byq.d(buxVarC, null, new gcl(19));
            byq.d(buxVarC, null, new gcl(20));
            byq.d(buxVarC, -1, new tja(1));
            byq.d(buxVarC, usVar, new tja(0));
            byq.d(buxVarC, null, new tja(2));
            byq.d(buxVarC, Boolean.valueOf(z4), new tja(3));
            byq.d(buxVarC, Boolean.valueOf(z), new gcl(15));
            if (tjgVar instanceof tjf) {
                buxVarC.v(-146686550);
                ((tjf) tjgVar).a.invoke(tjb.a, buxVarC, 6);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-146646188);
                bvvVar.Y(false);
            }
            afehVar.invoke(tjb.a, buxVarC, Integer.valueOf(((i4 >> 18) & 112) | 6));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mym(carText2, tjgVar, z, z2, afehVar, i, 3);
        }
    }

    public static afdr k(bym bymVar) {
        return (afdr) bymVar.a();
    }

    public static void l(final tiw tiwVar, final CharSequence charSequence, final afeh afehVar, bux buxVar, final int i) {
        int i2;
        afehVar.getClass();
        int i3 = i & 48;
        bux buxVarC = buxVar.c(398027691);
        if (i3 == 0) {
            i2 = (true != ((i & 64) == 0 ? buxVarC.C(charSequence) : buxVarC.E(charSequence)) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 128 : 256;
        }
        boolean z = false;
        if (buxVarC.I((i2 & 145) != 144, i2 & 1)) {
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && buxVarC.E(charSequence))) {
                z = true;
            }
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (z || objS == buw.a) {
                objS = new tim(charSequence, 2);
                bvvVar.ad(objS);
            }
            afdr afdrVar = (afdr) objS;
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.d(buxVarC, charSequence, new gcl(14));
            r(tiw.a, null, afehVar, buxVarC, ((i2 << 3) & 7168) | 438);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: tiu
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    CharSequence charSequence2 = charSequence;
                    int i6 = 613566756 & i4;
                    afeh afehVar2 = afehVar;
                    std.l(tiwVar, charSequence2, afehVar2, (bux) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return afak.a;
                }
            };
        }
    }

    public static void m(tjq tjqVar, CharSequence charSequence, afeh afehVar, afeh afehVar2, afeh afehVar3, bux buxVar, int i, int i2) {
        int i3;
        afeh afehVar4;
        CharSequence charSequence2 = charSequence;
        afehVar3.getClass();
        int i4 = i2 & 1;
        bux buxVarC = buxVar.c(1129071430);
        if (i4 != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            i3 = (true != ((i & 64) == 0 ? buxVarC.C(charSequence2) : buxVarC.E(charSequence2)) ? 16 : 32) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | 384;
        if ((i & 3072) == 0) {
            i5 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        int i6 = i5 | 24576;
        if ((196608 & i) == 0) {
            i6 |= true != buxVarC.E(afehVar3) ? 65536 : 131072;
        }
        if (buxVarC.I((74897 & i6) != 74896, i6 & 1)) {
            if (1 == i4) {
                charSequence2 = null;
            }
            int i7 = i6 >> 6;
            int i8 = (i7 & 112) | 6 | (i7 & 896);
            afeh afehVar5 = thz.a;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new tiv(false);
                bvvVar.ad(objS);
            }
            afdr afdrVar = (afdr) objS;
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.d(buxVarC, false, new gcl(13));
            buxVarC.v(-1086463480);
            tiw tiwVar = tiw.a;
            bvvVar.Y(false);
            afehVar5.invoke(tiwVar, buxVarC, Integer.valueOf(((i8 >> 3) & 112) | 6));
            r(tiwVar, charSequence2, afehVar3, buxVarC, (i7 & 7168) | (i6 & 896) | (i6 & 112) | 6);
            bvvVar.Y(true);
            afehVar4 = afehVar5;
        } else {
            buxVarC.s();
            afehVar4 = afehVar2;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kul(tjqVar, charSequence2, afehVar, afehVar4, afehVar3, i, i2, 6);
        }
    }

    public static void n(tjq tjqVar, afeh afehVar, bux buxVar, int i) {
        int i2;
        bux buxVarC = buxVar.c(1600144151);
        if ((i & 48) == 0) {
            i2 = (true != buxVarC.E(afehVar) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 17) != 16, i2 & 1)) {
            tit titVar = new tit();
            int i3 = (i2 & 112) | 6;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new tiv(true);
                bvvVar.ad(objS);
            }
            afdr afdrVar = (afdr) objS;
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.d(buxVarC, true, new gcl(13));
            buxVarC.v(-1086463480);
            tiw tiwVar = tiw.a;
            bvvVar.Y(false);
            titVar.invoke(tiwVar, buxVarC, 6);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nzv(tjqVar, afehVar, i, 8, null);
        }
    }

    public static void o(tjq tjqVar, afec afecVar, afeh afehVar, afeh afehVar2, afeh afehVar3, bux buxVar, int i) {
        afeh afehVar4;
        afecVar.getClass();
        afehVar3.getClass();
        bux buxVarC = buxVar.c(-706713831);
        int i2 = i | 432;
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 8192 : 16384;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= true != buxVarC.E(afehVar3) ? 524288 : 1048576;
        }
        if (buxVarC.I((599185 & i3) != 599184, i3 & 1)) {
            int i4 = i3 >> 9;
            int i5 = (i4 & 896) | (i4 & 112) | 6;
            afeh afehVar5 = thz.b;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new tiv(false);
                bvvVar.ad(objS);
            }
            afdr afdrVar = (afdr) objS;
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.d(buxVarC, false, new gcl(13));
            buxVarC.v(-1086463480);
            tiw tiwVar = tiw.a;
            afehVar.invoke(tiwVar, buxVarC, Integer.valueOf((i5 & 112) | 6));
            bvvVar.Y(false);
            afehVar5.invoke(tiwVar, buxVarC, Integer.valueOf(((i5 >> 3) & 112) | 6));
            int i6 = i3 & 7168;
            s(tiwVar, afecVar, afehVar3, buxVarC, ((i3 >> 6) & 57344) | (i3 & 112) | 6 | (i3 & 896) | i6);
            bvvVar.Y(true);
            afehVar4 = afehVar5;
        } else {
            buxVarC.s();
            afehVar4 = afehVar2;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gbn(tjqVar, afecVar, afehVar, afehVar4, afehVar3, i, 7);
        }
    }

    public static void p(tjq tjqVar, afeh afehVar, afeh afehVar2, afeh afehVar3, bux buxVar, int i) {
        int i2;
        afeh afehVar4;
        afehVar3.getClass();
        bux buxVarC = buxVar.c(1533841551);
        if ((i & 48) == 0) {
            i2 = (true != buxVarC.E(afehVar) ? 16 : 32) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= true != buxVarC.E(afehVar3) ? 1024 : 2048;
        }
        if (buxVarC.I((i3 & 1169) != 1168, i3 & 1)) {
            int i4 = (i3 & 112) | 6 | (i3 & 896);
            afehVar4 = thz.c;
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new tiv(false);
                bvvVar.ad(objS);
            }
            afdr afdrVar = (afdr) objS;
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.d(buxVarC, false, new gcl(13));
            buxVarC.v(-1086463480);
            tiw tiwVar = tiw.a;
            bvvVar.Y(false);
            afehVar4.invoke(tiwVar, buxVarC, Integer.valueOf(((i4 >> 3) & 112) | 6));
            afehVar3.invoke(tiwVar, buxVarC, Integer.valueOf(((i3 >> 6) & 112) | 6));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
            afehVar4 = afehVar2;
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new dmh(tjqVar, afehVar, afehVar4, afehVar3, i, 16, null);
        }
    }

    public static afec q(bym bymVar) {
        return (afec) bymVar.a();
    }

    public static void r(tiw tiwVar, CharSequence charSequence, afeh afehVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(611152013);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(charSequence) : buxVarC.E(charSequence)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            cct cctVarI = bxc.i(-486794612, true, new nzv(afehVar, tiwVar, i2, 6), buxVarC);
            int i4 = i2 >> 3;
            t(charSequence, null, cctVarI, buxVarC, (i4 & 112) | (i4 & 14) | 3456);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(tiwVar, charSequence, afehVar, i, 19);
        }
    }

    public static void s(tiw tiwVar, afec afecVar, afeh afehVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1080157856);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(tiwVar) : buxVarC.E(tiwVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(null) : buxVarC.E(null)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(null) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 8192 : 16384;
        }
        if (buxVarC.I((i2 & 9363) != 9362, i2 & 1)) {
            cct cctVarI = bxc.i(1853591711, true, new nzv(afehVar, tiwVar, i2, 7), buxVarC);
            int i4 = i2 >> 3;
            t(null, afecVar, cctVarI, buxVarC, (i4 & 896) | (i4 & 14) | 3072 | (i4 & 112));
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(tiwVar, afecVar, afehVar, i, 18);
        }
    }

    public static void t(CharSequence charSequence, afec afecVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1845843334);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(charSequence) : buxVarC.E(charSequence)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afecVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 1024 : 2048;
        }
        boolean z = false;
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            bym bymVarC = byx.c(afecVar, buxVarC);
            bym bymVarC2 = byx.c(null, buxVarC);
            boolean zD = buxVarC.D(B(bymVarC2) == null);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zD || objS == buw.a) {
                final afeg afegVarB = B(bymVarC2);
                uh uhVar = afegVarB != null ? new uh() { // from class: tip
                    @Override // defpackage.uh
                    public final void a(int i4, int i5) {
                        afegVarB.invoke(Integer.valueOf(i4), Integer.valueOf(i5));
                    }
                } : null;
                bvvVar.ad(uhVar);
                objS = uhVar;
            }
            uh uhVar2 = (uh) objS;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(charSequence))) {
                z = true;
            }
            boolean zC = buxVarC.C(bymVarC) | z | buxVarC.E(uhVar2);
            Object objS2 = bvvVar.S();
            if (zC || objS2 == buw.a) {
                objS2 = new lxu(charSequence, uhVar2, bymVarC, 18);
                bvvVar.ad(objS2);
            }
            afdr afdrVar = (afdr) objS2;
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.d(buxVarC, charSequence, new gcl(11));
            byq.d(buxVarC, q(bymVarC), new ooh(11));
            byq.d(buxVarC, uhVar2, new gcl(12));
            afegVar.invoke(buxVarC, Integer.valueOf((i2 >> 9) & 14));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(charSequence, afecVar, afegVar, i, 20);
        }
    }

    public static void u(CarText carText, thx thxVar, afeh afehVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1556157239);
        int i4 = 4;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(carText) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(thxVar) : buxVarC.E(thxVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 128 : 256;
        }
        int i5 = 0;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i6 = i2 >> 3;
            boolean zE = buxVarC.E(carText);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zE || objS == buw.a) {
                objS = new tim(carText, i5);
                bvvVar.ad(objS);
            }
            afdr afdrVar = (afdr) objS;
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.d(buxVarC, carText, new gcl(10));
            if (thxVar != null) {
                buxVarC.v(-1655671195);
                Object objS2 = bvvVar.S();
                if (objS2 == buw.a) {
                    objS2 = new tic(i4);
                    bvvVar.ad(objS2);
                }
                afdr afdrVar2 = (afdr) objS2;
                buxVarC.u();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar2);
                } else {
                    buxVarC.y();
                }
                thxVar.a(buxVarC, (i6 & 14) | 8);
                bvvVar.Y(true);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1655579900);
                bvvVar.Y(false);
            }
            afehVar.invoke(tiw.b, buxVarC, Integer.valueOf((i6 & 112) | 6));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new kmg(carText, thxVar, afehVar, i, 17);
        }
    }

    public static tiw v(String str, thx thxVar, bux buxVar, int i) {
        if ((i & 2) != 0) {
            thxVar = null;
        }
        u(CarText.create(str), thxVar, thy.a, buxVar, 64);
        return tiw.b;
    }

    public static thw w() {
        return (thw) thw.a.a();
    }

    public static CarIcon x(int i, bux buxVar) {
        qn qnVar = (qn) buxVar.f(tii.c);
        buxVar.f(tii.a);
        boolean zC = buxVar.C(qnVar.getResources()) | buxVar.A(i);
        Object objG = buxVar.g();
        if (zC || objG == buw.a) {
            objG = new CarIcon(new tj(IconCompat.m(qnVar, i)));
            buxVar.x(objG);
        }
        objG.getClass();
        return (CarIcon) objG;
    }

    public static til y(CarIcon carIcon, afdr afdrVar, Boolean bool, bux buxVar) {
        int i = 17;
        mel melVar = afdrVar != null ? new mel(afdrVar, i) : null;
        boolean zE = buxVar.E(null) | buxVar.E(carIcon) | buxVar.E(melVar) | buxVar.C(bool) | buxVar.E(null) | buxVar.E(null);
        Object objG = buxVar.g();
        if (zE || objG == buw.a) {
            objG = new lxu(carIcon, (us) melVar, bool, i);
            buxVar.x(objG);
        }
        afdr afdrVar2 = (afdr) objG;
        buxVar.M();
        buxVar.u();
        if (buxVar.G()) {
            buxVar.j(afdrVar2);
        } else {
            buxVar.y();
        }
        byq.d(buxVar, null, new gcl(3));
        byq.d(buxVar, carIcon, new gcl(4));
        byq.d(buxVar, melVar, new gcl(5));
        byq.d(buxVar, bool, new gcl(6));
        byq.d(buxVar, null, new gcl(7));
        byq.d(buxVar, null, new gcl(8));
        buxVar.n();
        return til.a;
    }

    public static boolean z(uvp uvpVar, int i) {
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (i != 3) {
            return ((i == 4 || i == 5) && uvpVar == uvp.f) ? false : true;
        }
        int iOrdinal = uvpVar.ordinal();
        return iOrdinal == 0 || iOrdinal == 2 || iOrdinal == 4 || iOrdinal == 12 || iOrdinal == 15 || iOrdinal == 6 || iOrdinal == 7 || iOrdinal == 8;
    }

    public void a(LocationResult locationResult) {
        throw null;
    }

    public std(byte[] bArr) {
    }

    public std() {
    }
}
