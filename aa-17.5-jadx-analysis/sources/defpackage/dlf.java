package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dlf {
    public static final int a(int i) {
        if (i < 8191) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i >= 262143 ? 255 : 18;
    }

    public static final int b(long j, int i) {
        int iC = dle.c(j);
        if (i < iC) {
            i = iC;
        }
        int iA = dle.a(j);
        return i > iA ? iA : i;
    }

    public static final int c(long j, int i) {
        int iD = dle.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = dle.b(j);
        return i > iB ? iB : i;
    }

    public static final long d(int i, int i2, int i3, int i4) {
        if (!((i3 >= 0) & (i2 >= i) & (i4 >= i3) & (i >= 0))) {
            dln.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return g(i, i2, i3, i4);
    }

    public static final long e(long j, long j2) {
        int i = (int) (j2 >> 32);
        int iD = dle.d(j);
        if (i < iD) {
            i = iD;
        }
        int iB = dle.b(j);
        if (i > iB) {
            i = iB;
        }
        long j3 = i << 32;
        int iA = dle.a(j);
        int i2 = (int) (j2 & 4294967295L);
        int iC = dle.c(j);
        if (i2 < iC) {
            i2 = iC;
        }
        if (i2 <= iA) {
            iA = i2;
        }
        return iA | j3;
    }

    public static final long f(long j, long j2) {
        int iD = dle.d(j2);
        int iD2 = dle.d(j);
        if (iD < iD2) {
            iD = iD2;
        }
        int iB = dle.b(j);
        if (iD > iB) {
            iD = iB;
        }
        int iB2 = dle.b(j2);
        if (iB2 >= iD2) {
            iD2 = iB2;
        }
        if (iD2 <= iB) {
            iB = iD2;
        }
        int iC = dle.c(j2);
        int iC2 = dle.c(j);
        if (iC < iC2) {
            iC = iC2;
        }
        int iA = dle.a(j);
        if (iC > iA) {
            iC = iA;
        }
        int iA2 = dle.a(j2);
        if (iA2 >= iC2) {
            iC2 = iA2;
        }
        if (iC2 <= iA) {
            iA = iC2;
        }
        return d(iD, iB, iC, iA);
    }

    public static final long g(int i, int i2, int i3, int i4) {
        int i5 = i4 == Integer.MAX_VALUE ? i3 : i4;
        int i6 = i2 == Integer.MAX_VALUE ? i : i2;
        int iA = a(i5);
        int iA2 = a(i6);
        if (iA + iA2 > 31) {
            j(i6, i5);
        }
        int i7 = i2 + 1;
        int i8 = i4 + 1;
        int i9 = iA2 - 13;
        return (((~(i7 >> 31)) & i7) << 33) | (i << 2) | ((i9 >> 1) + (i9 & 1)) | (i3 << (iA2 + 2)) | (((~(i8 >> 31)) & i8) << (iA2 + 33));
    }

    public static final long h(long j, int i, int i2) {
        int iB = dle.b(j);
        if (iB != Integer.MAX_VALUE && (iB = iB + i) < 0) {
            iB = 0;
        }
        int iC = dle.c(j) + i2;
        if (iC < 0) {
            iC = 0;
        }
        int iA = dle.a(j);
        if (iA != Integer.MAX_VALUE && (iA = iA + i2) < 0) {
            iA = 0;
        }
        int iD = dle.d(j) + i;
        return d(iD >= 0 ? iD : 0, iB, iC, iA);
    }

    public static final Void i(int i) {
        throw new IllegalArgumentException(a.bn(i, "Can't represent a size of ", " in Constraints"));
    }

    public static final void j(int i, int i2) {
        throw new IllegalArgumentException(a.bB(i2, i, "Can't represent a width of ", " and height of ", " in Constraints"));
    }

    public static float k(dlg dlgVar, long j) {
        if (dlt.a[(int) ((1095216660480L & j) >>> 32)].a != 4294967296L) {
            dln.b("Only Sp can convert to Px");
        }
        return dlgVar.eA(dlgVar.ew(j));
    }

    public static int l(dlg dlgVar, float f) {
        float fEA = dlgVar.eA(f);
        return Float.isInfinite(fEA) ? Alert.DURATION_SHOW_INDEFINITELY : Math.round(fEA);
    }

    public static long m(dlg dlgVar, long j) {
        if (j != 9205357640488583168L) {
            return roc.aA(dlgVar.ex(Float.intBitsToFloat((int) (j >> 32))), dlgVar.ex(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    public static long n(dlg dlgVar, long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fEA = dlgVar.eA(Float.intBitsToFloat((int) (j >> 32)) + BitmapDescriptorFactory.HUE_RED);
        float fEA2 = dlgVar.eA(Float.intBitsToFloat((int) (j & 4294967295L)) + BitmapDescriptorFactory.HUE_RED);
        return (Float.floatToRawIntBits(fEA) << 32) | (Float.floatToRawIntBits(fEA2) & 4294967295L);
    }

    public static final cjb o(dlp dlpVar) {
        return new cjb(dlpVar.b, dlpVar.c, dlpVar.d, dlpVar.e);
    }

    public static final dlp p(long j, long j2) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        return new dlp(i2, i, ((int) (j2 >> 32)) + i2, ((int) (j2 & 4294967295L)) + i);
    }

    public static final dlp q(cjb cjbVar) {
        return new dlp(Math.round(cjbVar.b), Math.round(cjbVar.c), Math.round(cjbVar.d), Math.round(cjbVar.e));
    }

    public static final long r(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static final long s(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final long t(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i3, 262142);
        int iMin2 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin3 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    i(i6);
                    throw new aezp();
                }
                i5 = 8190;
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i2);
        }
        return d(Math.min(i5, i), iMin2, iMin, iMin3);
    }

    public static final long u(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int iMin = Math.min(i, 262142);
        int iMin2 = Alert.DURATION_SHOW_INDEFINITELY;
        int iMin3 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = iMin3 == Integer.MAX_VALUE ? iMin : iMin3;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = 65534;
            } else if (i6 < 65535) {
                i5 = 32766;
            } else {
                if (i6 >= 262143) {
                    i(i6);
                    throw new aezp();
                }
                i5 = 8190;
            }
        }
        if (i4 != Integer.MAX_VALUE) {
            iMin2 = Math.min(i5, i4);
        }
        return d(iMin, iMin3, Math.min(i5, i3), iMin2);
    }

    public static final long v(int i, int i2) {
        if (!((i2 >= 0) & (i >= 0))) {
            dln.a("width and height must be >= 0");
        }
        return g(i, i, i2, i2);
    }

    public static final dlg w(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        int i = dlx.a;
        dlw dlwVarA = dlx.a(f);
        if (dlwVarA == null) {
            dlwVarA = new dls(f);
        }
        return new dli(f2, f, dlwVarA);
    }

    public static final dkx x(long j) {
        return j != 16 ? new dko(j) : dkw.a;
    }

    public static dkx y(dkx dkxVar, dkx dkxVar2) {
        boolean z = dkxVar2 instanceof dkn;
        if (!z || !(dkxVar instanceof dkn)) {
            return (!z || (dkxVar instanceof dkn)) ? (z || !(dkxVar instanceof dkn)) ? dkxVar2.d(new deh(dkxVar, 6)) : dkxVar : dkxVar2;
        }
        throw null;
    }

    public static dkx z(dkx dkxVar, afdr afdrVar) {
        return !affa.f(dkxVar, dkw.a) ? dkxVar : (dkx) afdrVar.invoke();
    }
}
