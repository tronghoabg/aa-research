package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class cjn {
    public static cks a;

    public static final void a(String str) {
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    public static final int b(float f, float[] fArr, int i) {
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            f2 = f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(f2 - f) > 1.05E-6f) {
            f2 = Float.NaN;
        }
        fArr[i] = f2;
        return Float.isNaN(f2) ? 0 : 1;
    }

    public static final Paint c(cjk cjkVar) {
        if (!(cjkVar instanceof cjk)) {
            ckf.a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received ".concat(String.valueOf(affw.a.getOrCreateKotlinClass(cjkVar.getClass()).getQualifiedName())));
        }
        return cjkVar.a;
    }

    public static final void d(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final void e(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final cfy f(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new cjq(afecVar));
    }

    public static /* synthetic */ cfy g(cfy cfyVar, float f, float f2, float f3, float f4, float f5, ckv ckvVar, boolean z, int i, int i2) {
        long jAA = (i2 & 1024) != 0 ? roc.aA(0.5f, 0.5f) : 0L;
        ckv ckvVar2 = (i2 & 2048) != 0 ? ckq.a : ckvVar;
        boolean z2 = ((i2 & 4096) == 0) & z;
        long j = (i2 & 16384) != 0 ? -72057594037927936L : 0L;
        long j2 = (32768 & i2) != 0 ? -72057594037927936L : 0L;
        int i3 = ((65536 & i2) == 0 ? 1 : 0) & i;
        int i4 = i2 & 256;
        int i5 = i2 & 32;
        int i6 = i2 & 4;
        int i7 = i2 & 2;
        int i8 = i2 & 1;
        float f6 = (i2 & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? 8.0f : 0.0f;
        float f7 = i4 != 0 ? 0.0f : f5;
        float f8 = i5 != 0 ? 0.0f : f4;
        float f9 = i6 != 0 ? 1.0f : f3;
        return cfyVar.a(new ckd(1 == i8 ? 1.0f : f, i7 != 0 ? 1.0f : f2, f9, f8, f7, f6, jAA, ckvVar2, z2, j, j2, i3, ckg.a));
    }

    public static final int h(long j) {
        float[] fArr = clj.a;
        return (int) (cjv.e(j, clj.e) >>> 32);
    }

    public static final long i(int i) {
        return i << 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long j(float r20, float r21, float r22, float r23, defpackage.clh r24) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjn.j(float, float, float, float, clh):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long k(float r18, float r19, float r20, float r21, defpackage.clh r22) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjn.k(float, float, float, float, clh):long");
    }

    public static final long l(long j, long j2) {
        float[] fArr = clj.a;
        clh[] clhVarArr = clj.y;
        int i = (int) (63 & j2);
        long jE = cjv.e(j, clhVarArr[i]);
        float fA = cjv.a(jE);
        float fD = cjv.d(jE);
        float fD2 = cjv.d(j2);
        float fA2 = cjv.a(j2);
        float f = 1.0f - fA;
        float f2 = (fA2 * f) + fA;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        float f4 = f2 == BitmapDescriptorFactory.HUE_RED ? 0.0f : ((fD * fA) + ((fD2 * fA2) * f)) / f2;
        float fC = f2 == BitmapDescriptorFactory.HUE_RED ? 0.0f : ((cjv.c(jE) * fA) + ((cjv.c(j2) * fA2) * f)) / f2;
        float fB = cjv.b(jE);
        float fB2 = cjv.b(j2);
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            f3 = ((fB * fA) + ((fB2 * fA2) * f)) / f2;
        }
        return k(f4, fC, f3, f2, clhVarArr[i]);
    }

    public static /* synthetic */ long m(float f, float f2, float f3, float f4) {
        float[] fArr = clj.a;
        return j(f, f2, f3, f4, clj.e);
    }

    public static final long n() {
        float[] fArr = clj.a;
        return j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
    }

    public static /* synthetic */ cjs o(List list, float f, float f2) {
        return new ckh(list, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(cfx cfxVar, afdr afdrVar) {
        cyh cyhVar = cfxVar.v;
        if (cyhVar == null) {
            cyhVar = new cyh((cyg) cfxVar);
            cfxVar.v = cyhVar;
        }
        cyp cypVar = ((czq) bzi.s(cfxVar)).w;
        ((ces) cypVar.a).b(cyhVar, cyh.a, afdrVar);
    }

    public static final cfx q(cwd cwdVar, int i) {
        cfx cfxVar = cwdVar.M().u;
        if (cfxVar != null && (cfxVar.s & i) != 0) {
            while (cfxVar != null) {
                int i2 = cfxVar.r;
                if ((i2 & 2) != 0) {
                    return null;
                }
                if ((i2 & i) != 0) {
                    return cfxVar;
                }
                cfxVar = cfxVar.u;
            }
        }
        return null;
    }

    public static final int r(cfw cfwVar, cfw cfwVar2) {
        if (affa.f(cfwVar, cfwVar2)) {
            return 2;
        }
        return !bzi.l(cfwVar, cfwVar2) ? 0 : 1;
    }

    public static final boolean s(cxb cxbVar) {
        if (cxbVar.j == null) {
            return false;
        }
        cxb cxbVarL = cxbVar.l();
        return (cxbVarL != null ? cxbVarL.j : null) == null || cxbVar.w.b;
    }

    public static /* synthetic */ String t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "Idle" : "LookaheadLayingOut" : "LayingOut" : "LookaheadMeasuring" : "Measuring";
    }

    public static final void u(cwu cwuVar) {
        bzi.q(cwuVar).I();
    }

    public static final void v(cwu cwuVar, afec afecVar) {
        cyc cycVar;
        if (cwuVar.M().A && (cycVar = bzi.r(cwuVar, 2).w) != null) {
            cycVar.aw(afecVar, true);
        }
    }

    public static final void w(cwk cwkVar) {
        if (cwkVar.M().A) {
            bzi.r(cwkVar, 1).ak();
        }
    }
}
