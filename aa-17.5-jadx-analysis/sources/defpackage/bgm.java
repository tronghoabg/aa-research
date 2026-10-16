package defpackage;

import android.content.Context;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bgm {
    private static final dnu a;

    static {
        boolean z = true;
        a = new dnu(z, z, 1002, 1536);
    }

    public static final void a(bfy bfyVar, bfu bfuVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1904307118);
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(bfyVar) : buxVarC.E(bfyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(bfuVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            buxVarC.v(-1009482584);
            Context context = (Context) buxVarC.f(daa.b);
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.Y(false);
            boolean zE = buxVarC.E(bfuVar);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !buxVarC.E(bfyVar))) {
                z = false;
            }
            boolean zE2 = zE | z | buxVarC.E(context);
            Object objS = bvvVar.S();
            if (zE2 || objS == buw.a) {
                acg acgVar = new acg((Object) bfuVar, (Object) context, (Object) bfyVar, 8, (short[]) null);
                bvvVar.ad(acgVar);
                objS = acgVar;
            }
            alw.c(null, null, (afec) objS, buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(bfyVar, bfuVar, i, 11, null);
        }
    }

    public static final void b(final int i, long j, bux buxVar, final int i2) {
        int i3;
        cjp cjpVar;
        final long j2 = j;
        int i4 = i2 & 6;
        bux buxVarC = buxVar.c(-1240244237);
        if (i4 == 0) {
            i3 = i2 | (true != buxVarC.A(i) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != buxVarC.B(j2) ? 16 : 32;
        }
        if (buxVarC.I((i3 & 19) != 18, i3 & 1)) {
            Context context = (Context) buxVarC.f(daa.b);
            boolean zC = buxVarC.C(context) | ((i3 & 14) == 4);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = Integer.valueOf(context.obtainStyledAttributes(new int[]{i}).getResourceId(0, -1));
                bvvVar.ad(objS);
            }
            int iIntValue = ((Number) objS).intValue();
            if (iIntValue == -1) {
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    final int i5 = 1;
                    bxfVarJ.c = new afeg() { // from class: bgk
                        @Override // defpackage.afeg
                        public final Object invoke(Object obj, Object obj2) {
                            if (i5 != 0) {
                                ((Integer) obj2).intValue();
                                int i6 = i2;
                                long j3 = j2;
                                int i7 = i6 | 1;
                                int i8 = i7 & 306783378;
                                int i9 = 613566756 & i7;
                                bgm.b(i, j3, (bux) obj, (i7 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                                return afak.a;
                            }
                            ((Integer) obj2).intValue();
                            int i10 = i2;
                            long j4 = j2;
                            int i11 = i10 | 1;
                            int i12 = i11 & 306783378;
                            int i13 = 613566756 & i11;
                            bgm.b(i, j4, (bux) obj, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
                            return afak.a;
                        }
                    };
                    return;
                }
                return;
            }
            cmw cmwVarB = dao.b(iIntValue, buxVarC, 0);
            int i6 = i3 & 112;
            Object objS2 = bvvVar.S();
            if (i6 == 32 || objS2 == buw.a) {
                if (j2 == 16) {
                    cjpVar = null;
                    j2 = 16;
                } else {
                    cjpVar = new cjp(j2, 5);
                }
                objS2 = cjpVar;
                bvvVar.ad(objS2);
            }
            cjw cjwVar = (cjw) objS2;
            cfv cfvVar = cfy.e;
            long j3 = als.a;
            atk.c(bxc.o(awd.i(cfvVar, 24.0f), cmwVarB, null, csh.b, BitmapDescriptorFactory.HUE_RED, cjwVar, 22), buxVarC, 0);
        } else {
            buxVarC.s();
        }
        final long j4 = j2;
        bxf bxfVarJ2 = buxVarC.J();
        if (bxfVarJ2 != null) {
            final int i7 = 0;
            bxfVarJ2.c = new afeg() { // from class: bgk
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    if (i7 != 0) {
                        ((Integer) obj2).intValue();
                        int i62 = i2;
                        long j32 = j4;
                        int i72 = i62 | 1;
                        int i8 = i72 & 306783378;
                        int i9 = 613566756 & i72;
                        bgm.b(i, j32, (bux) obj, (i72 & (-920350135)) | i8 | (i9 >> 1) | ((i8 + i8) & i9));
                        return afak.a;
                    }
                    ((Integer) obj2).intValue();
                    int i10 = i2;
                    long j42 = j4;
                    int i11 = i10 | 1;
                    int i12 = i11 & 306783378;
                    int i13 = 613566756 & i11;
                    bgm.b(i, j42, (bux) obj, (i11 & (-920350135)) | i12 | (i13 >> 1) | ((i12 + i12) & i13));
                    return afak.a;
                }
            };
        }
    }

    public static final void c(bfy bfyVar, bho bhoVar, afdr afdrVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2040393164);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(bfyVar) : buxVarC.E(bfyVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(bhoVar) : buxVarC.E(bhoVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afdrVar) ? 128 : 256;
        }
        boolean z = false;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            boolean z2 = (i2 & 112) == 32 || ((i2 & 64) != 0 && buxVarC.C(bhoVar));
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (z2 || objS == buw.a) {
                objS = new bgo(new alq(new aiy(bhoVar, afdrVar, 17)));
                bvvVar.ad(objS);
            }
            bgo bgoVar = (bgo) objS;
            int i4 = 8;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && buxVarC.E(bfyVar))) {
                z = true;
            }
            Object objS2 = bvvVar.S();
            if (z || objS2 == buw.a) {
                objS2 = new beg(bfyVar, 9);
                bvvVar.ad(objS2);
            }
            dnb.b(bgoVar, (afdr) objS2, a, bxc.i(1315155414, true, new apn(bhoVar, bfyVar, i4), buxVarC), buxVarC, 3456, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new alu(bfyVar, bhoVar, afdrVar, i, 5, null);
        }
    }

    public static final void d(cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2;
        afeg afegVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1392105195);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            cfyVar2 = cfyVar;
            afegVar2 = afegVar;
            awx.Y(cfyVar2, bhq.a, bgj.a, afegVar2, buxVarC, (i2 & 14) | 432 | ((i2 << 6) & 7168));
        } else {
            cfyVar2 = cfyVar;
            afegVar2 = afegVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(cfyVar2, afegVar2, i, 12);
        }
    }
}
