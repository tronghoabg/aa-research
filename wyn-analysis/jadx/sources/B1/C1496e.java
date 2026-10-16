package b1;

import android.graphics.Path;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import p7.AbstractC3772b;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496e {

    /* renamed from: a, reason: collision with root package name */
    public char f19126a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f19127b;

    public C1496e(char c10, float[] fArr) {
        this.f19126a = c10;
        this.f19127b = fArr;
    }

    public static void a(Path path, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z2, boolean z10) {
        double d3;
        double d5;
        double radians = Math.toRadians(f16);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = f10;
        double d11 = f11;
        double d12 = f14;
        double d13 = ((d11 * dSin) + (d10 * dCos)) / d12;
        double d14 = f15;
        double d15 = ((d11 * dCos) + ((-f10) * dSin)) / d14;
        double d16 = f13;
        double d17 = ((d16 * dSin) + (f12 * dCos)) / d12;
        double d18 = ((d16 * dCos) + ((-f12) * dSin)) / d14;
        double d19 = d13 - d17;
        double d20 = d15 - d18;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = (d15 + d18) / 2.0d;
        double d23 = (d20 * d20) + (d19 * d19);
        if (d23 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d24 = (1.0d / d23) - 0.25d;
        if (d24 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d23);
            float fSqrt = (float) (Math.sqrt(d23) / 1.99999d);
            a(path, f10, f11, f12, f13, f14 * fSqrt, fSqrt * f15, f16, z2, z10);
            return;
        }
        double dSqrt = Math.sqrt(d24);
        double d25 = dSqrt * d19;
        double d26 = dSqrt * d20;
        if (z2 == z10) {
            d3 = d21 - d26;
            d5 = d22 + d25;
        } else {
            d3 = d21 + d26;
            d5 = d22 - d25;
        }
        double dAtan2 = Math.atan2(d15 - d5, d13 - d3);
        double dAtan22 = Math.atan2(d18 - d5, d17 - d3) - dAtan2;
        if (z10 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d27 = d3 * d12;
        double d28 = d5 * d14;
        double d29 = (d27 * dCos) - (d28 * dSin);
        double d30 = (d28 * dCos) + (d27 * dSin);
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * 4.0d) / 3.141592653589793d));
        double dCos2 = Math.cos(radians);
        double dSin2 = Math.sin(radians);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d31 = -d12;
        double d32 = d31 * dCos2;
        double d33 = d14 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d14 * dCos2;
        double d37 = dAtan22 / iCeil;
        double d38 = (dCos3 * d36) + (dSin3 * d35);
        double d39 = d10;
        double d40 = d11;
        int i5 = 0;
        double d41 = dAtan2;
        while (i5 < iCeil) {
            double d42 = d41 + d37;
            double dSin4 = Math.sin(d42);
            double dCos4 = Math.cos(d42);
            int i10 = iCeil;
            double d43 = (((d12 * dCos2) * dCos4) + d29) - (d33 * dSin4);
            double d44 = (d36 * dSin4) + (d12 * dSin2 * dCos4) + d30;
            double d45 = (d32 * dSin4) - (d33 * dCos4);
            double d46 = (dCos4 * d36) + (dSin4 * d35);
            double d47 = d42 - d41;
            double dTan = Math.tan(d47 / 2.0d);
            double dSqrt2 = ((Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.cubicTo((float) ((d34 * dSqrt2) + d39), (float) ((d38 * dSqrt2) + d40), (float) (d43 - (dSqrt2 * d45)), (float) (d44 - (dSqrt2 * d46)), (float) d43, (float) d44);
            i5++;
            d40 = d44;
            dCos2 = dCos2;
            d35 = d35;
            d41 = d42;
            d38 = d46;
            d39 = d43;
            iCeil = i10;
            d34 = d45;
            d37 = d37;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(C1496e[] c1496eArr, Path path) {
        int i5;
        int i10;
        C1496e c1496e;
        int i11;
        char c10;
        float f10;
        float f11;
        float f12;
        float f13;
        C1496e c1496e2;
        boolean z2;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = c1496eArr.length;
        char c11 = 'm';
        int i12 = 0;
        char c12 = 'm';
        int i13 = 0;
        while (i13 < length) {
            C1496e c1496e3 = c1496eArr[i13];
            char c13 = c1496e3.f19126a;
            float f22 = fArr[i12];
            float f23 = fArr[1];
            float f24 = fArr[2];
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c13) {
                case 'A':
                case 'a':
                    i5 = 7;
                    break;
                case 'C':
                case 'c':
                    i5 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i5 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i5 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                default:
                    i5 = 2;
                    break;
            }
            float f28 = f23;
            float f29 = f26;
            float f30 = f27;
            float f31 = f22;
            int i14 = i12;
            while (true) {
                float[] fArr2 = c1496e3.f19127b;
                if (i14 < fArr2.length) {
                    int i15 = i12;
                    if (c13 == 'A') {
                        i10 = i14;
                        c1496e = c1496e3;
                        float f32 = f31;
                        float f33 = f28;
                        i11 = i13;
                        c10 = c13;
                        int i16 = i10 + 5;
                        int i17 = i10 + 6;
                        a(path, f32, f33, fArr2[i16], fArr2[i17], fArr2[i10], fArr2[i10 + 1], fArr2[i10 + 2], fArr2[i10 + 3] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i15, fArr2[i10 + 4] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i15);
                        f24 = fArr2[i16];
                        f10 = fArr2[i17];
                        f25 = f10;
                        f11 = f24;
                    } else if (c13 == 'C') {
                        i10 = i14;
                        i11 = i13;
                        c1496e = c1496e3;
                        c10 = c13;
                        int i18 = i10 + 2;
                        int i19 = i10 + 3;
                        int i20 = i10 + 4;
                        int i21 = i10 + 5;
                        path2.cubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i18], fArr2[i19], fArr2[i20], fArr2[i21]);
                        float f34 = fArr2[i20];
                        float f35 = fArr2[i21];
                        f24 = fArr2[i18];
                        f25 = fArr2[i19];
                        f10 = f35;
                        f11 = f34;
                    } else if (c13 != 'H') {
                        if (c13 == 'Q') {
                            i10 = i14;
                            i11 = i13;
                            c1496e = c1496e3;
                            c10 = c13;
                            int i22 = i10 + 1;
                            int i23 = i10 + 2;
                            int i24 = i10 + 3;
                            path2.quadTo(fArr2[i10], fArr2[i22], fArr2[i23], fArr2[i24]);
                            f12 = fArr2[i10];
                            float f36 = fArr2[i22];
                            f13 = fArr2[i23];
                            f25 = f36;
                            f10 = fArr2[i24];
                        } else if (c13 == 'V') {
                            i10 = i14;
                            i11 = i13;
                            c1496e = c1496e3;
                            f11 = f31;
                            c10 = c13;
                            path2.lineTo(f11, fArr2[i10]);
                            f10 = fArr2[i10];
                        } else if (c13 != 'a') {
                            if (c13 == 'c') {
                                i10 = i14;
                                int i25 = i10 + 2;
                                int i26 = i10 + 3;
                                int i27 = i10 + 4;
                                int i28 = i10 + 5;
                                path2.rCubicTo(fArr2[i10], fArr2[i10 + 1], fArr2[i25], fArr2[i26], fArr2[i27], fArr2[i28]);
                                float f37 = fArr2[i25] + f31;
                                float f38 = f28 + fArr2[i26];
                                f31 += fArr2[i27];
                                f28 += fArr2[i28];
                                f24 = f37;
                                f25 = f38;
                            } else if (c13 != 'h') {
                                if (c13 != 'q') {
                                    if (c13 != 'v') {
                                        if (c13 == 'L') {
                                            i10 = i14;
                                            int i29 = i10 + 1;
                                            path2.lineTo(fArr2[i10], fArr2[i29]);
                                            f11 = fArr2[i10];
                                            f10 = fArr2[i29];
                                        } else if (c13 == 'M') {
                                            i10 = i14;
                                            f11 = fArr2[i10];
                                            f10 = fArr2[i10 + 1];
                                            if (i10 > 0) {
                                                path2.lineTo(f11, f10);
                                            } else {
                                                path2.moveTo(f11, f10);
                                                f29 = f11;
                                                f30 = f10;
                                            }
                                        } else if (c13 == 'S') {
                                            i10 = i14;
                                            if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                f31 = (f31 * 2.0f) - f24;
                                                f28 = (f28 * 2.0f) - f25;
                                            }
                                            float f39 = f31;
                                            float f40 = f28;
                                            int i30 = i10 + 1;
                                            int i31 = i10 + 2;
                                            int i32 = i10 + 3;
                                            path2.cubicTo(f39, f40, fArr2[i10], fArr2[i30], fArr2[i31], fArr2[i32]);
                                            f12 = fArr2[i10];
                                            float f41 = fArr2[i30];
                                            f13 = fArr2[i31];
                                            f25 = f41;
                                            f10 = fArr2[i32];
                                            i11 = i13;
                                            c1496e = c1496e3;
                                            c10 = c13;
                                        } else if (c13 == 'T') {
                                            i10 = i14;
                                            if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                f31 = (f31 * 2.0f) - f24;
                                                f28 = (f28 * 2.0f) - f25;
                                            }
                                            float f42 = f28;
                                            float f43 = fArr2[i10];
                                            int i33 = i10 + 1;
                                            path2.quadTo(f31, f42, f43, fArr2[i33]);
                                            f25 = f42;
                                            f11 = fArr2[i10];
                                            f10 = fArr2[i33];
                                            i11 = i13;
                                            c1496e = c1496e3;
                                            f24 = f31;
                                            c10 = c13;
                                        } else if (c13 == 'l') {
                                            i10 = i14;
                                            int i34 = i10 + 1;
                                            path2.rLineTo(fArr2[i10], fArr2[i34]);
                                            f31 += fArr2[i10];
                                            f17 = fArr2[i34];
                                        } else if (c13 == c11) {
                                            i10 = i14;
                                            float f44 = fArr2[i10];
                                            f31 += f44;
                                            float f45 = fArr2[i10 + 1];
                                            f28 += f45;
                                            if (i10 > 0) {
                                                path2.rLineTo(f44, f45);
                                            } else {
                                                path2.rMoveTo(f44, f45);
                                                c1496e = c1496e3;
                                                f11 = f31;
                                                f29 = f11;
                                                f10 = f28;
                                                f30 = f10;
                                                i11 = i13;
                                                c10 = c13;
                                            }
                                        } else if (c13 == 's') {
                                            if (c12 == 'c' || c12 == 's' || c12 == 'C' || c12 == 'S') {
                                                f18 = f28 - f25;
                                                f19 = f31 - f24;
                                            } else {
                                                f19 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                f18 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                            }
                                            int i35 = i14 + 1;
                                            int i36 = i14 + 2;
                                            int i37 = i14 + 3;
                                            i10 = i14;
                                            path2.rCubicTo(f19, f18, fArr2[i14], fArr2[i35], fArr2[i36], fArr2[i37]);
                                            f14 = fArr2[i10] + f31;
                                            f15 = f28 + fArr2[i35];
                                            f31 += fArr2[i36];
                                            f16 = fArr2[i37];
                                        } else if (c13 != 't') {
                                            i10 = i14;
                                        } else {
                                            if (c12 == 'q' || c12 == 't' || c12 == 'Q' || c12 == 'T') {
                                                f20 = f31 - f24;
                                                f21 = f28 - f25;
                                            } else {
                                                f21 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                                f20 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                            }
                                            int i38 = i14 + 1;
                                            path2.rQuadTo(f20, f21, fArr2[i14], fArr2[i38]);
                                            float f46 = f20 + f31;
                                            float f47 = f28 + f21;
                                            float f48 = f31 + fArr2[i14];
                                            f28 += fArr2[i38];
                                            f25 = f47;
                                            i10 = i14;
                                            c1496e = c1496e3;
                                            f11 = f48;
                                            f24 = f46;
                                            f10 = f28;
                                            i11 = i13;
                                            c10 = c13;
                                        }
                                        i11 = i13;
                                        c1496e = c1496e3;
                                        c10 = c13;
                                    } else {
                                        i10 = i14;
                                        path2.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fArr2[i10]);
                                        f17 = fArr2[i10];
                                    }
                                    f28 += f17;
                                } else {
                                    i10 = i14;
                                    int i39 = i10 + 1;
                                    int i40 = i10 + 2;
                                    int i41 = i10 + 3;
                                    path2.rQuadTo(fArr2[i10], fArr2[i39], fArr2[i40], fArr2[i41]);
                                    f14 = fArr2[i10] + f31;
                                    f15 = f28 + fArr2[i39];
                                    f31 += fArr2[i40];
                                    f16 = fArr2[i41];
                                }
                                f28 += f16;
                                f24 = f14;
                                f25 = f15;
                            } else {
                                i10 = i14;
                                path2.rLineTo(fArr2[i10], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                f31 += fArr2[i10];
                            }
                            c1496e = c1496e3;
                            f11 = f31;
                            f10 = f28;
                            i11 = i13;
                            c10 = c13;
                        } else {
                            i10 = i14;
                            int i42 = i10 + 5;
                            float f49 = fArr2[i42] + f31;
                            int i43 = i10 + 6;
                            float f50 = fArr2[i43] + f28;
                            float f51 = fArr2[i10];
                            float f52 = fArr2[i10 + 1];
                            float f53 = fArr2[i10 + 2];
                            if (fArr2[i10 + 3] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                c1496e2 = c1496e3;
                                z2 = 1;
                            } else {
                                c1496e2 = c1496e3;
                                z2 = i15;
                            }
                            c1496e = c1496e2;
                            float f54 = f31;
                            c10 = c13;
                            float f55 = f28;
                            i11 = i13;
                            a(path, f54, f55, f49, f50, f51, f52, f53, z2, fArr2[i10 + 4] != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : i15);
                            f11 = f54 + fArr2[i42];
                            f10 = f55 + fArr2[i43];
                            f24 = f11;
                            f25 = f10;
                        }
                        f24 = f12;
                        f11 = f13;
                    } else {
                        i10 = i14;
                        c1496e = c1496e3;
                        c10 = c13;
                        f10 = f28;
                        i11 = i13;
                        path2.lineTo(fArr2[i10], f10);
                        f11 = fArr2[i10];
                    }
                    c13 = c10;
                    c1496e3 = c1496e;
                    i13 = i11;
                    i12 = i15;
                    c11 = 'm';
                    f31 = f11;
                    f28 = f10;
                    c12 = c13;
                    i14 = i10 + i5;
                    path2 = path;
                }
            }
            int i44 = i12;
            fArr[i44] = f31;
            fArr[1] = f28;
            fArr[2] = f24;
            fArr[3] = f25;
            fArr[4] = f29;
            fArr[5] = f30;
            c12 = c1496e3.f19126a;
            i13++;
            path2 = path;
            i12 = i44;
            c11 = 'm';
        }
    }

    public C1496e(C1496e c1496e) {
        this.f19126a = c1496e.f19126a;
        float[] fArr = c1496e.f19127b;
        this.f19127b = AbstractC3772b.l(fArr, fArr.length);
    }
}
