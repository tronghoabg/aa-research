package defpackage;

import android.util.SparseIntArray;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ukf {
    public static final ukf a;
    private static final yob g = yob.c("com/google/android/libraries/geo/mapcore/internal/model/StyleEntry");
    private static final ujf[] h = new ujf[0];
    private static final byte[] i = new byte[0];
    private static final ujf[] j = new ujf[23];
    private static final ujf k;
    public final long b;
    public final ujf[] c;
    public final byte[] d;
    public final SparseIntArray e;
    private final ujf[] l;
    private Boolean m = null;
    private ujf n = null;
    private boolean o = false;
    public Map f = null;

    static {
        uke[] ukeVarArr = ujf.b;
        int i2 = yfq.d;
        ujf ujfVar = new ujf(true, true, true, true, true, true, ukeVarArr, null, null, yls.a);
        k = ujfVar;
        a = k(ujfVar, false);
    }

    public ukf(long j2, ujf[] ujfVarArr, byte[] bArr, SparseIntArray sparseIntArray, boolean z) {
        this.b = j2;
        this.c = ujfVarArr == null ? h : ujfVarArr;
        this.d = bArr == null ? i : bArr;
        this.e = sparseIntArray;
        if (z) {
            this.l = j;
            return;
        }
        this.l = new ujf[23];
        for (int i2 = 0; i2 <= 22; i2++) {
            this.l[i2] = h(i2);
        }
    }

    public static ukf k(ujf ujfVar, boolean z) {
        return new ukf(-1L, new ujf[]{ujfVar}, new byte[]{0}, null, z);
    }

    private static float m(float f, float f2, int i2, int i3, float f3) {
        if (i2 == i3) {
            return f;
        }
        double d = i2;
        float fPow = (float) ((Math.pow(2.0d, f3) - Math.pow(2.0d, d)) / (Math.pow(2.0d, i3) - Math.pow(2.0d, d)));
        return (f2 * fPow) + (f * (1.0f - fPow));
    }

    private static int n(int i2, int i3, int i4, int i5, float f) {
        if (i4 == i5) {
            return i2;
        }
        float f2 = (f - i4) / (i5 - i4);
        float f3 = 1.0f - f2;
        return Math.round(((i3 & 255) * f2) + ((i2 & 255) * f3)) | (Math.round((((i3 >> 16) & 255) * f2) + (((i2 >> 16) & 255) * f3)) << 16) | (Math.round((((i3 >> 24) & 255) * f2) + (((i2 >> 24) & 255) * f3)) << 24) | (Math.round((((i3 >> 8) & 255) * f2) + (((i2 >> 8) & 255) * f3)) << 8);
    }

    private static uke[] o(uke[] ukeVarArr, uke[] ukeVarArr2, int i2, int i3, float f) {
        if (f == i2) {
            return ukeVarArr;
        }
        float f2 = i3;
        if (f == f2) {
            return ukeVarArr2;
        }
        uke[] ukeVarArr3 = new uke[Math.max(ukeVarArr.length, ukeVarArr2.length)];
        int i4 = 0;
        while (true) {
            int length = ukeVarArr.length;
            int length2 = ukeVarArr2.length;
            if (i4 >= Math.max(length, length2)) {
                return ukeVarArr3;
            }
            uke ukeVar = i4 < length ? ukeVarArr[i4] : uke.a;
            uke ukeVar2 = i4 < length2 ? ukeVarArr2[i4] : uke.a;
            int iN = n(ukeVar.b, ukeVar2.b, i2, i3, f);
            int iN2 = n(ukeVar.c, ukeVar2.c, i2, i3, f);
            float fM = m(ukeVar.d, ukeVar2.d, i2, i3, f);
            float fM2 = m(ukeVar.h, ukeVar2.h, i2, i3, f);
            float fM3 = m(ukeVar.l, ukeVar2.l, i2, i3, f);
            float fM4 = m(ukeVar.m, ukeVar2.m, i2, i3, f);
            if (f < f2) {
                ukeVar2 = ukeVar;
            }
            ukeVarArr3[i4] = new uke(iN, iN2, fM, ukeVar.e, fM2, ukeVar2.i, fM3, fM4, ukeVar2.j, ukeVar2.k);
            i4++;
        }
    }

    @Deprecated
    public final byte a(int i2) {
        return this.d[i2];
    }

    public final int b() {
        return this.c.length;
    }

    public final int c(int i2) {
        int i3 = 0;
        if (this.c.length == 0) {
            return 0;
        }
        int length = g(i2).o.length;
        if (length != 0) {
            while (true) {
                int i4 = i3 + i2;
                if (i4 >= 23 || g(i4).o.length != length) {
                    break;
                }
                i3++;
            }
        }
        return i3;
    }

    public final ujf d() {
        ujf[] ujfVarArr = this.c;
        return ujfVarArr.length == 0 ? k : ujfVarArr[0];
    }

    final ujf e() {
        ujf ujfVar = this.n;
        if (ujfVar != null) {
            return ujfVar;
        }
        uje ujeVarF = k.f();
        ujeVarF.v = d().F;
        ujf ujfVar2 = new ujf(ujeVarF);
        this.n = ujfVar2;
        return ujfVar2;
    }

    public final ujf f(float f) {
        ujf ujfVar;
        float fI = dlz.i(f, BitmapDescriptorFactory.HUE_RED, 22.0f);
        int iRound = Math.round(fI);
        return (fI != ((float) iRound) || (ujfVar = this.l[iRound]) == null) ? h(fI) : ujfVar;
    }

    public final ujf g(int i2) {
        return f(i2);
    }

    public final ujf h(float f) {
        byte b;
        ujf[] ujfVarArr = this.c;
        int length = ujfVarArr.length;
        float fI = dlz.i(f, 1.0f, 22.0f);
        if (length == 1) {
            return fI >= ((float) this.d[0]) ? ujfVarArr[0] : e();
        }
        int i2 = -1;
        int i3 = 0;
        byte b2 = 0;
        while (true) {
            if (i3 >= ujfVarArr.length) {
                b = 23;
                i3 = -1;
                break;
            }
            b = this.d[i3];
            if (b > fI) {
                break;
            }
            i2 = i3;
            i3++;
            b2 = b;
        }
        if (i2 == -1) {
            return e();
        }
        int i4 = i3 == -1 ? i2 : i3;
        if (i3 == -1) {
            b = b2;
        }
        ujf ujfVar = ujfVarArr[i2];
        ujf ujfVar2 = ujfVarArr[i4];
        uje ujeVar = new uje();
        int i5 = ujfVar.j;
        if (i5 != 0) {
            ujeVar.g = n(i5, ujfVar2.j, b2, b, fI);
        }
        ujeVar.a = ujfVar.d;
        uke[] ukeVarArr = ujfVar.n;
        if (ukeVarArr.length > 0) {
            uke[] ukeVarArr2 = ujfVar2.n;
            if (ukeVarArr2.length <= 0) {
                ukeVarArr2 = ukeVarArr;
            }
            ujeVar.j = o(ukeVarArr, ukeVarArr2, b2, b, fI);
        }
        ujeVar.b = ujfVar.e;
        ujeVar.w = ujfVar.G;
        usf usfVar = ujfVar.J;
        if (!usfVar.a()) {
            ujeVar.A = usfVar;
        }
        if (ujfVar.h()) {
            ujeVar.B = (int) fI;
            ujeVar.C = ujfVar.L;
            ujeVar.R = ujfVar.S;
            ujeVar.S = ujfVar.T;
            ujeVar.T = ujfVar.U;
        }
        if (ujfVar2.h() && b - fI <= 1.0f) {
            ujeVar.D = (int) (1.0f + fI);
            ujeVar.E = ujfVar2.L;
            ujeVar.U = ujfVar2.S;
            ujeVar.V = ujfVar2.T;
            ujeVar.W = ujfVar2.U;
        } else if (ujfVar.h()) {
            ujeVar.D = (int) (1.0f + fI);
            ujeVar.E = ujfVar.L;
            ujeVar.U = ujfVar.S;
            ujeVar.V = ujfVar.T;
            ujeVar.W = ujfVar.U;
        }
        int i6 = ujfVar.H;
        if (i6 != ujfVar2.H) {
            ((ynz) g.a(uys.a).ai(9393)).B("lineStrokeRenderingAttributes mismatch for zoom: %d, and zoom: %d", b2, b);
        } else {
            ujeVar.y = i6;
        }
        int i7 = ujfVar.I;
        if (i7 != ujfVar2.I) {
            ((ynz) g.a(uys.a).ai(9392)).B("areaStrokeRenderingAttributes mismatch for zoom: %d, and zoom: %d", b2, b);
        } else {
            ujeVar.z = i7;
        }
        if (ujfVar.q()) {
            ukn uknVar = ujfVar.r;
            ukn uknVar2 = ujfVar2.q() ? ujfVar2.r : uknVar;
            ujeVar.n = ukn.a(n(uknVar.b, uknVar2.b, b2, b, fI), n(uknVar.c, uknVar2.c, b2, b, fI), uknVar.d, uknVar.e, uknVar.f, uknVar.g, uknVar.h, uknVar.i);
        }
        if (ujfVar.p()) {
            ujeVar.o = ujfVar.s;
        }
        if (ujfVar.i()) {
            ujeVar.p = ujfVar.t;
        }
        float f2 = ujfVar.A;
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            ujeVar.q = f2;
        }
        float f3 = ujfVar.B;
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            ujeVar.r = f3;
        }
        float f4 = ujfVar.C;
        if (f4 != BitmapDescriptorFactory.HUE_RED) {
            ujeVar.s = f4;
        }
        int i8 = ujfVar.Q;
        if (i8 != 0) {
            ujeVar.X = i8;
        }
        abau abauVar = ujfVar.u;
        if (abauVar != null) {
            ujeVar.F = abauVar;
        }
        ujeVar.G = ujfVar.v;
        if (ujfVar.n()) {
            ujeVar.H = ujfVar.w;
        }
        yfq yfqVar = ujfVar.x;
        if (!yfqVar.isEmpty()) {
            ujeVar.I = yfqVar;
        }
        if (ujfVar.o()) {
            ujeVar.Y = ujfVar.R;
        }
        abal abalVar = ujfVar.y;
        if (abalVar != null) {
            ujeVar.a(abalVar);
        }
        ujeVar.K = ujfVar.z;
        ujeVar.c = ujfVar.f;
        uke[] ukeVarArr3 = ujfVar.o;
        if (ukeVarArr3.length > 0) {
            uke[] ukeVarArr4 = ujfVar2.o;
            if (ukeVarArr4.length <= 0) {
                ukeVarArr4 = ukeVarArr3;
            }
            ujeVar.k = o(ukeVarArr3, ukeVarArr4, b2, b, fI);
        }
        if (ujfVar.t()) {
            ujeVar.t = n(ujfVar.e(), ujfVar2.t() ? ujfVar2.e() : ujfVar.e(), b2, b, fI);
        }
        ujeVar.f = ujfVar.i;
        if (ujfVar.s()) {
            ujeVar.h = n(ujfVar.m, ujfVar2.s() ? ujfVar2.m : ujfVar.m, b2, b, fI);
            if (ujfVar.m()) {
                ujeVar.M = Float.valueOf(ujfVar.d());
            }
            if (ujfVar.k()) {
                ujeVar.N = Float.valueOf(ujfVar.b());
            }
            if (ujfVar.l()) {
                ujeVar.O = Float.valueOf(ujfVar.c());
            }
            if (ujfVar.j()) {
                ujeVar.P = Float.valueOf(ujfVar.a());
            }
        }
        if (ujfVar.r()) {
            ujeVar.L = n(ujfVar.O, ujfVar2.r() ? ujfVar2.O : ujfVar.O, b2, b, fI);
        }
        uke[] ukeVarArr5 = ujfVar.p;
        if (ukeVarArr5.length > 0) {
            uke[] ukeVarArr6 = ujfVar2.p;
            if (ukeVarArr6.length <= 0) {
                ukeVarArr6 = ukeVarArr5;
            }
            ujeVar.l = o(ukeVarArr5, ukeVarArr6, b2, b, fI);
        }
        ujeVar.d = ujfVar.g;
        ujeVar.u = ujfVar.E;
        ujeVar.e = ujfVar.h;
        ujeVar.i = n(ujfVar.k, ujfVar2.k, b2, b, fI);
        uke ukeVar = ujfVar.q;
        uke ukeVar2 = ujfVar2.q;
        if (ukeVar != null && ukeVar2 != null) {
            ujeVar.m = o(new uke[]{ukeVar}, new uke[]{ukeVar2}, b2, b, fI)[0];
        }
        if (ujfVar.l > BitmapDescriptorFactory.HUE_RED) {
            ujeVar.Q = (int) m(r4, ujfVar2.l, b2, b, fI);
        }
        ujeVar.v = ujfVar.F;
        ujf ujfVar3 = new ujf(ujeVar);
        return ujfVar3.equals(ujfVar) ? ujfVar : ujfVar3;
    }

    public final ukf i(abgx abgxVar) {
        Map map = this.f;
        if (map != null) {
            return (ukf) map.get(abgxVar);
        }
        return null;
    }

    public final boolean j() {
        if (this.m == null) {
            this.m = false;
            int i2 = 0;
            while (true) {
                ujf[] ujfVarArr = this.c;
                if (i2 >= ujfVarArr.length) {
                    break;
                }
                for (uke ukeVar : ujfVarArr[i2].o) {
                    if (ukeVar.d()) {
                        this.m = true;
                        return true;
                    }
                }
                i2++;
            }
        }
        return this.m.booleanValue();
    }

    public final void l() {
        if (this.o) {
            return;
        }
        ujf[] ujfVarArr = this.c;
        for (int length = ujfVarArr.length - 2; length >= 0; length--) {
            ujf ujfVar = ujfVarArr[length];
            int length2 = ujfVar.o.length;
            int i2 = length + 1;
            ujf ujfVar2 = ujfVarArr[i2];
            int length3 = ujfVar2.o.length;
            if (length2 < length3) {
                ujfVarArr[length] = ujfVar.g(ujfVar2);
            } else if (length2 > length3) {
                ujfVarArr[i2] = ujfVar2.g(ujfVar);
            }
        }
        this.o = true;
    }
}
