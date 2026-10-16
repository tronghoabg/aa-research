package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.view.KeyEvent;
import androidx.car.app.CarAppMetadataHolderService;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public /* synthetic */ class rl {
    public static si a(qn qnVar) throws IllegalStateException, ClassNotFoundException {
        try {
            ServiceInfo serviceInfoA = CarAppMetadataHolderService.a(qnVar);
            String string = serviceInfoA.metaData != null ? serviceInfoA.metaData.getString("androidx.car.app.CarAppMetadataHolderService.RESULT_MANAGER") : null;
            if (string != null) {
                return (si) Class.forName(string).getConstructor(null).newInstance(null);
            }
            throw new ClassNotFoundException("ResultManager metadata could not be found");
        } catch (PackageManager.NameNotFoundException | ReflectiveOperationException unused) {
            throw new IllegalStateException("ResultManager not configured. Did you forget to add a dependency on the app-automotive artifact?");
        }
    }

    public static aew b(int i, bux buxVar) {
        bor borVar = ((bog) buxVar.f(boh.a)).d;
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? bor.g : bor.f : bor.e : bor.d : bor.c : bor.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(defpackage.afdr r24, defpackage.cfy r25, boolean r26, defpackage.bnz r27, defpackage.ckv r28, defpackage.afeg r29, defpackage.bux r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rl.c(afdr, cfy, boolean, bnz, ckv, afeg, bux, int, int):void");
    }

    public static void d(cfy cfyVar, afdr afdrVar, boolean z, ckv ckvVar, bnz bnzVar, afeg afegVar, bux buxVar, int i) {
        cfy cfyVar2;
        int i2;
        bux buxVar2;
        afeg afegVar2 = afegVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1134296466);
        if (i3 == 0) {
            cfyVar2 = cfyVar;
            i2 = (true != buxVarC.C(cfyVar2) ? 2 : 4) | i;
        } else {
            cfyVar2 = cfyVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.D(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(ckvVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.C(bnzVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.C(null) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar2) ? 524288 : 1048576;
        }
        int i4 = i2;
        if (buxVarC.I((i4 & 599187) != 599186, i4 & 1)) {
            buxVarC.v(976976045);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new asg();
                bvvVar.ad(objS);
            }
            asf asfVar = (asf) objS;
            bvvVar.Y(false);
            buxVar2 = buxVarC;
            cfy cfyVarA = afp.w(afp.E(cjn.g(awd.j(bof.a(cfyVar2), roc.aA((a.Y(1, 0) ? 8.0f : a.Y(1, 1) ? 16.0f : a.Y(1, 2) ? 28.0f : BitmapDescriptorFactory.HUE_RED) + 24.0f, 40.0f)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ckvVar, true, 0, 1042431), z ? bnzVar.a : bnzVar.c, ckvVar), asfVar, bpe.a(false, BitmapDescriptorFactory.HUE_RED, 0L, ckvVar, false, 247), z, new ddo(0), afdrVar).a(new bso(new bes(19)));
            ctp ctpVarB = atk.b(cfl.e, false);
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVar2, cfyVarA);
            afdr afdrVar2 = cwb.a;
            buxVar2.w();
            if (bvvVar.t) {
                buxVar2.j(afdrVar2);
            } else {
                buxVar2.y();
            }
            byq.c(buxVar2, ctpVarB, cwb.e);
            byq.c(buxVar2, ccxVarAh, cwb.d);
            byq.c(buxVar2, Integer.valueOf(iG), cwb.f);
            byq.b(buxVar2, cwb.g);
            byq.c(buxVar2, cfyVarJ, cwb.c);
            afegVar2 = afegVar;
            czz.am(bnm.a.b(new cjv(z ? bnzVar.b : bnzVar.d)), afegVar2, buxVar2, ((i4 >> 15) & 112) | 8);
            bvvVar.Y(true);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new boa(cfyVar, afdrVar, z, ckvVar, bnzVar, afegVar2, i, 0);
        }
    }

    public static int e(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static long f(KeyEvent keyEvent) {
        return ti.g(keyEvent.getKeyCode());
    }

    public static void g(final String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, final List list, final afeg afegVar, bux buxVar, final int i) {
        int i2;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1851426205);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            f8 = f;
            i2 |= true != buxVarC.z(f8) ? 16 : 32;
        } else {
            f8 = f;
        }
        if ((i & 384) == 0) {
            f9 = f2;
            i2 |= true != buxVarC.z(f9) ? 128 : 256;
        } else {
            f9 = f2;
        }
        if ((i & 3072) == 0) {
            f10 = f3;
            i2 |= true != buxVarC.z(f10) ? 1024 : 2048;
        } else {
            f10 = f3;
        }
        if ((i & 24576) == 0) {
            f11 = f4;
            i2 |= true != buxVarC.z(f11) ? 8192 : 16384;
        } else {
            f11 = f4;
        }
        if ((196608 & i) == 0) {
            f12 = f5;
            i2 |= true != buxVarC.z(f12) ? 65536 : 131072;
        } else {
            f12 = f5;
        }
        if ((1572864 & i) == 0) {
            f13 = f6;
            i2 |= true != buxVarC.z(f13) ? 524288 : 1048576;
        } else {
            f13 = f6;
        }
        if ((12582912 & i) == 0) {
            f14 = f7;
            i2 |= true != buxVarC.z(f14) ? 4194304 : 8388608;
        } else {
            f14 = f7;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != buxVarC.E(list) ? 33554432 : 67108864;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 268435456 : 536870912;
        }
        if (buxVarC.I((306783379 & i2) != 306783378, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            int i4 = i2;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new blz(4);
                bvvVar.ad(objS);
            }
            afdr afdrVar = (afdr) objS;
            if (!(bvvVar.a instanceof coe)) {
                throw new IllegalStateException("Invalid applier");
            }
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, str, new coi(3));
            byq.c(buxVarC, Float.valueOf(f8), new coi(4));
            byq.c(buxVarC, Float.valueOf(f9), new coi(5));
            byq.c(buxVarC, Float.valueOf(f10), new coi(6));
            byq.c(buxVarC, Float.valueOf(f11), new coi(7));
            byq.c(buxVarC, Float.valueOf(f12), new coi(8));
            byq.c(buxVarC, Float.valueOf(f13), new coi(9));
            byq.c(buxVarC, Float.valueOf(f14), new coi(10));
            byq.c(buxVarC, list, new bni(9));
            afegVar.invoke(buxVarC, Integer.valueOf((i4 >> 27) & 14));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            final float f15 = f8;
            final float f16 = f9;
            final float f17 = f10;
            final float f18 = f11;
            final float f19 = f12;
            final float f20 = f13;
            final float f21 = f14;
            bxfVarJ.c = new afeg() { // from class: coh
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    float f22 = f15;
                    float f23 = f16;
                    float f24 = f17;
                    float f25 = f18;
                    float f26 = f19;
                    int i5 = i;
                    int i6 = i5 | 1;
                    int i7 = 306783378 & i6;
                    List list2 = list;
                    int i8 = 613566756 & i6;
                    afeg afegVar2 = afegVar;
                    int i9 = (i6 & (-920350135)) | i7 | (i8 >> 1);
                    rl.g(str2, f22, f23, f24, f25, f26, f20, f21, list2, afegVar2, (bux) obj, ((i7 + i7) & i8) | i9);
                    return afak.a;
                }
            };
        }
    }

    public static void h(final List list, final int i, final String str, final cjs cjsVar, float f, final cjs cjsVar2, float f2, final float f3, final int i2, final int i3, final float f4, final float f5, float f6, final float f7, bux buxVar, final int i4, final int i5) {
        int i6;
        float f8;
        float f9;
        int i7;
        int i8;
        int i9;
        float f10;
        int i10;
        boolean z;
        int i11 = i4 & 6;
        bux buxVarC = buxVar.c(-1478270750);
        if (i11 == 0) {
            i6 = (true != buxVarC.E(list) ? 2 : 4) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= true != buxVarC.A(i) ? 16 : 32;
        }
        if ((i4 & 384) == 0) {
            i6 |= true != buxVarC.C(str) ? 128 : 256;
        }
        if ((i4 & 3072) == 0) {
            i6 |= true != buxVarC.C(cjsVar) ? 1024 : 2048;
        }
        if ((i4 & 24576) == 0) {
            f8 = f;
            i6 |= true != buxVarC.z(f8) ? 8192 : 16384;
        } else {
            f8 = f;
        }
        if ((196608 & i4) == 0) {
            i6 |= true != buxVarC.C(cjsVar2) ? 65536 : 131072;
        }
        if ((1572864 & i4) == 0) {
            f9 = f2;
            i6 |= true != buxVarC.z(f9) ? 524288 : 1048576;
        } else {
            f9 = f2;
        }
        if ((12582912 & i4) == 0) {
            i6 |= true != buxVarC.z(f3) ? 4194304 : 8388608;
        }
        if ((100663296 & i4) == 0) {
            i6 |= true != buxVarC.A(i2) ? 33554432 : 67108864;
        }
        if ((805306368 & i4) == 0) {
            i6 |= true != buxVarC.A(i3) ? 268435456 : 536870912;
        }
        if ((i5 & 6) == 0) {
            i7 = i6;
            i8 = (true != buxVarC.z(f4) ? 2 : 4) | i5;
        } else {
            i7 = i6;
            i8 = i5;
        }
        int i12 = i8;
        if ((i5 & 48) == 0) {
            i9 = i12 | (true != buxVarC.z(f5) ? 16 : 32);
        } else {
            i9 = i12;
        }
        if ((i5 & 384) == 0) {
            f10 = f6;
            int i13 = i9;
            z = true;
            i10 = i13 | (true == buxVarC.z(f10) ? 256 : 128);
        } else {
            f10 = f6;
            i10 = i9;
            z = true;
        }
        if ((i5 & 3072) == 0) {
            i10 |= z == buxVarC.z(f7) ? 2048 : 1024;
        }
        if (buxVarC.I(((i7 & 306783379) == 306783378 && (i10 & 1171) == 1170) ? false : true, i7 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i4 & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            Object objS = bvvVar.S();
            if (objS == buw.a) {
                objS = new blz(5);
                bvvVar.ad(objS);
            }
            afdr afdrVar = (afdr) objS;
            if (!(bvvVar.a instanceof coe)) {
                throw new IllegalStateException("Invalid applier");
            }
            buxVarC.u();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, str, new bni(15));
            byq.c(buxVarC, list, new bni(16));
            byq.c(buxVarC, new ckn(i), new bni(17));
            byq.c(buxVarC, cjsVar, new bni(18));
            byq.c(buxVarC, Float.valueOf(f8), new bni(19));
            byq.c(buxVarC, cjsVar2, new bni(20));
            byq.c(buxVarC, Float.valueOf(f9), new coi(1));
            byq.c(buxVarC, Float.valueOf(f3), new coi(0));
            byq.c(buxVarC, new ckz(i3), new coi(2));
            byq.c(buxVarC, new cky(i2), new bni(10));
            byq.c(buxVarC, Float.valueOf(f4), new bni(11));
            byq.c(buxVarC, Float.valueOf(f5), new bni(12));
            byq.c(buxVarC, Float.valueOf(f10), new bni(13));
            byq.c(buxVarC, Float.valueOf(f7), new bni(14));
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            final float f11 = f8;
            final float f12 = f9;
            final float f13 = f10;
            bxfVarJ.c = new afeg() { // from class: cog
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    int i14 = i;
                    String str2 = str;
                    cjs cjsVar3 = cjsVar;
                    float f14 = f11;
                    cjs cjsVar4 = cjsVar2;
                    float f15 = f12;
                    float f16 = f3;
                    int i15 = i2;
                    int i16 = i3;
                    int i17 = i4;
                    float f17 = f4;
                    int i18 = i5;
                    int i19 = i17 | 1;
                    int i20 = i18 & 306783378;
                    int i21 = i19 & 306783378;
                    float f18 = f13;
                    int i22 = i18 & 613566756;
                    int i23 = i19 & 613566756;
                    float f19 = f7;
                    rl.h(list2, i14, str2, cjsVar3, f14, cjsVar4, f15, f16, i15, i16, f17, f5, f18, f19, (bux) obj, (i19 & (-920350135)) | i21 | (i23 >> 1) | ((i21 + i21) & i23), (i18 & (-920350135)) | i20 | (i22 >> 1) | ((i20 + i20) & i22));
                    return afak.a;
                }
            };
        }
    }

    public static void i(ArrayList arrayList) {
        arrayList.add(cnj.a);
    }

    public static void j(float f, float f2, ArrayList arrayList) {
        arrayList.add(new cnm(f, f2));
    }

    public static void k(float f, float f2, ArrayList arrayList) {
        arrayList.add(new cnu(f, f2));
    }

    public static void l(float f, ArrayList arrayList) {
        arrayList.add(new cnn(7.41f, f));
    }
}
