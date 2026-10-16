package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.util.Objects;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ujf {
    static final int[] a = new int[0];
    static final uke[] b;
    public static final ujf c;
    public final float A;
    public final float B;
    public final float C;
    public int D;
    public final float[] E;
    public final int F;
    public final float G;
    public final int H;
    public final int I;
    public final usf J;
    public final int K;
    public final usf L;
    public final int M;
    public final usf N;
    public final int O;
    public Integer P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    private final float Y;
    private final Float Z;
    private final Float aa;
    private final Float ab;
    private final Float ac;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final uke[] n;
    public final uke[] o;
    public final uke[] p;
    public final uke q;
    public final ukn r;
    public final ukl s;
    public final uja t;
    public final abau u;
    public final int v;
    public final abaf w;
    public final yfq x;
    public final abal y;
    public final int z;

    static {
        uke[] ukeVarArr = new uke[0];
        b = ukeVarArr;
        ukn uknVar = ukn.a;
        ukl uklVar = ukl.a;
        int i = yfq.d;
        c = new ujf(false, false, false, false, false, false, ukeVarArr, uknVar, uklVar, yls.a);
    }

    public ujf(uje ujeVar) {
        this.P = null;
        this.d = ujeVar.a;
        this.e = ujeVar.b;
        this.f = ujeVar.c;
        this.g = ujeVar.d;
        this.h = ujeVar.e;
        this.i = ujeVar.f;
        this.j = ujeVar.g;
        this.m = ujeVar.h;
        this.n = ujeVar.j;
        this.o = ujeVar.k;
        this.p = ujeVar.l;
        this.k = ujeVar.i;
        this.q = ujeVar.m;
        this.r = ujeVar.n;
        this.s = ujeVar.o;
        this.t = ujeVar.p;
        this.A = ujeVar.q;
        this.B = ujeVar.r;
        this.C = ujeVar.s;
        this.D = ujeVar.t;
        this.E = ujeVar.u;
        this.F = ujeVar.v;
        this.G = ujeVar.w;
        this.Y = ujeVar.x;
        this.H = ujeVar.y;
        this.I = ujeVar.z;
        this.J = ujeVar.A;
        this.K = ujeVar.B;
        this.L = ujeVar.C;
        this.S = ujeVar.R;
        this.T = ujeVar.S;
        this.U = ujeVar.T;
        this.M = ujeVar.D;
        this.N = ujeVar.E;
        this.V = ujeVar.U;
        this.W = ujeVar.V;
        this.X = ujeVar.W;
        this.Q = ujeVar.X;
        this.u = ujeVar.F;
        this.v = ujeVar.G;
        this.w = ujeVar.H;
        this.x = ujeVar.I;
        this.R = ujeVar.Y;
        this.y = ujeVar.J;
        this.z = ujeVar.K;
        this.O = ujeVar.L;
        this.Z = ujeVar.M;
        this.aa = ujeVar.N;
        this.ab = ujeVar.O;
        this.ac = ujeVar.P;
        this.l = ujeVar.Q;
    }

    private static int u(int i, int i2) {
        return Math.abs((i >>> 24) - (i2 >>> 24)) + Math.abs(((i >>> 16) & 255) - ((i2 >>> 16) & 255)) + Math.abs(((i >>> 8) & 255) - ((i2 >>> 8) & 255)) + Math.abs((i & 255) - (i2 & 255));
    }

    private static void v(int[] iArr, uke[] ukeVarArr, uke[] ukeVarArr2, ajlp ajlpVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 <= ukeVarArr.length; i4++) {
            while (i2 < iArr.length && iArr[i2] == i4) {
                i2++;
                i3++;
            }
            if (i4 < ukeVarArr.length) {
                int i5 = i3 + 1;
                uke ukeVar = ukeVarArr[i4];
                uke ukeVar2 = ukeVarArr2[i3];
                int iU = (u(ukeVar.b, ukeVar2.b) + u(ukeVar.c, ukeVar2.c)) / 2;
                if (ukeVar.c() != ukeVar2.c()) {
                    iU += 2048;
                }
                i += iU;
                i3 = i5;
            }
        }
        if (i < ajlpVar.a) {
            ajlpVar.a = i;
            System.arraycopy(iArr, 0, ajlpVar.b, 0, iArr.length);
        }
    }

    public final float a() {
        Float f = this.ac;
        return f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    public final float b() {
        Float f = this.aa;
        return f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    public final float c() {
        Float f = this.ab;
        return f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    public final float d() {
        Float f = this.Z;
        return f != null ? f.floatValue() : BitmapDescriptorFactory.HUE_RED;
    }

    public final int e() {
        int i;
        synchronized (this) {
            i = this.D;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ujf ujfVar = (ujf) obj;
        if (this.d != ujfVar.d || this.e != ujfVar.e || this.f != ujfVar.f || this.g != ujfVar.g || this.h != ujfVar.h || this.i != ujfVar.i || this.j != ujfVar.j || this.m != ujfVar.m || this.k != ujfVar.k || !Arrays.equals(this.n, ujfVar.n) || !Arrays.equals(this.o, ujfVar.o) || !Arrays.equals(this.p, ujfVar.p)) {
            return false;
        }
        uke ukeVar = this.q;
        if (ukeVar == null) {
            if (ujfVar.q != null) {
                return false;
            }
        } else if (!ukeVar.equals(ujfVar.q)) {
            return false;
        }
        ukl uklVar = this.s;
        if (uklVar == null) {
            if (ujfVar.s != null) {
                return false;
            }
        } else if (!uklVar.equals(ujfVar.s)) {
            return false;
        }
        ukn uknVar = this.r;
        if (uknVar == null) {
            if (ujfVar.r != null) {
                return false;
            }
        } else if (!uknVar.equals(ujfVar.r)) {
            return false;
        }
        if (this.F != ujfVar.F) {
            return false;
        }
        uja ujaVar = this.t;
        if (ujaVar == null) {
            if (ujfVar.t != null) {
                return false;
            }
        } else if (!ujaVar.equals(ujfVar.t)) {
            return false;
        }
        if (this.A != ujfVar.A || this.B != ujfVar.B || this.C != ujfVar.C || e() != ujfVar.e() || !Arrays.equals(this.E, ujfVar.E) || !this.J.equals(ujfVar.J) || this.K != ujfVar.K || !this.L.equals(ujfVar.L)) {
            return false;
        }
        int i = this.S;
        int i2 = ujfVar.S;
        if (i == 0) {
            throw null;
        }
        if (i != i2) {
            return false;
        }
        int i3 = this.T;
        int i4 = ujfVar.T;
        if (i3 == 0) {
            throw null;
        }
        if (i3 != i4) {
            return false;
        }
        int i5 = this.U;
        int i6 = ujfVar.U;
        if (i5 == 0) {
            throw null;
        }
        if (i5 != i6 || this.M != ujfVar.M || !this.N.equals(ujfVar.N)) {
            return false;
        }
        int i7 = this.V;
        int i8 = ujfVar.V;
        if (i7 == 0) {
            throw null;
        }
        if (i7 != i8) {
            return false;
        }
        int i9 = this.W;
        int i10 = ujfVar.W;
        if (i9 == 0) {
            throw null;
        }
        if (i9 != i10) {
            return false;
        }
        int i11 = this.X;
        int i12 = ujfVar.X;
        if (i11 != 0) {
            return i11 == i12 && this.Q == ujfVar.Q && Objects.equals(this.u, ujfVar.u) && this.v == ujfVar.v && Objects.equals(this.w, ujfVar.w) && yrm.W(this.x, ujfVar.x) && this.R == ujfVar.R && this.O == ujfVar.O && Objects.equals(this.Z, ujfVar.Z) && Objects.equals(this.aa, ujfVar.aa) && Objects.equals(this.ac, ujfVar.ac) && Objects.equals(this.ab, ujfVar.ab);
        }
        throw null;
    }

    public final uje f() {
        uje ujeVar = new uje();
        ujeVar.a = this.d;
        ujeVar.b = this.e;
        ujeVar.c = this.f;
        ujeVar.d = this.g;
        ujeVar.e = this.h;
        ujeVar.f = this.i;
        ujeVar.g = this.j;
        ujeVar.h = this.m;
        ujeVar.j = this.n;
        ujeVar.k = this.o;
        ujeVar.l = this.p;
        ujeVar.i = this.k;
        ujeVar.m = this.q;
        ujeVar.Q = this.l;
        ujeVar.n = this.r;
        ujeVar.o = this.s;
        ujeVar.p = this.t;
        ujeVar.q = this.A;
        ujeVar.r = this.B;
        ujeVar.s = this.C;
        ujeVar.u = this.E;
        ujeVar.v = this.F;
        ujeVar.w = this.G;
        ujeVar.x = this.Y;
        ujeVar.y = this.H;
        ujeVar.z = this.I;
        ujeVar.A = this.J;
        ujeVar.B = this.K;
        ujeVar.C = this.L;
        ujeVar.R = this.S;
        ujeVar.S = this.T;
        ujeVar.T = this.U;
        ujeVar.D = this.M;
        ujeVar.E = this.N;
        ujeVar.U = this.V;
        ujeVar.V = this.W;
        ujeVar.W = this.X;
        ujeVar.X = this.Q;
        ujeVar.F = this.u;
        ujeVar.G = this.v;
        ujeVar.H = this.w;
        ujeVar.I = this.x;
        ujeVar.Y = this.R;
        ujeVar.a(this.y);
        ujeVar.K = this.z;
        ujeVar.L = this.O;
        ujeVar.M = this.Z;
        ujeVar.N = this.aa;
        ujeVar.O = this.ab;
        ujeVar.P = this.ac;
        synchronized (this) {
            ujeVar.t = this.D;
        }
        return ujeVar;
    }

    public final ujf g(ujf ujfVar) {
        uke[] ukeVarArr = this.o;
        uke[] ukeVarArr2 = ujfVar.o;
        int length = ukeVarArr.length;
        int length2 = ukeVarArr2.length;
        if (length >= length2) {
            return this;
        }
        int i = length2 - length;
        int[] iArr = new int[i];
        ajlp ajlpVar = new ajlp(i);
        for (int i2 = 0; i2 <= length; i2++) {
            iArr[0] = i2;
            if (i > 1) {
                for (int i3 = i2; i3 <= length; i3++) {
                    iArr[1] = i3;
                    if (i > 2) {
                        for (int i4 = i3; i4 <= length; i4++) {
                            iArr[2] = i4;
                            if (i > 3) {
                                for (int i5 = i4; i5 <= length; i5++) {
                                    iArr[3] = i5;
                                    v(iArr, ukeVarArr, ukeVarArr2, ajlpVar);
                                }
                            } else {
                                v(iArr, ukeVarArr, ukeVarArr2, ajlpVar);
                            }
                        }
                    } else {
                        v(iArr, ukeVarArr, ukeVarArr2, ajlpVar);
                    }
                }
            } else {
                v(iArr, ukeVarArr, ukeVarArr2, ajlpVar);
            }
        }
        if (ajlpVar.a == Integer.MAX_VALUE) {
            throw new IllegalStateException("Couldn't find best insertion indices");
        }
        uke[] ukeVarArr3 = new uke[length2];
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 <= length; i8++) {
            while (true) {
                int[] iArr2 = (int[]) ajlpVar.b;
                if (i6 >= iArr2.length || iArr2[i6] != i8) {
                    break;
                }
                uke ukeVar = ukeVarArr2[i7];
                int i9 = ukeVar.b;
                int i10 = ukeVar.c;
                float f = ukeVar.h;
                int[] iArr3 = a;
                usf usfVar = usf.a;
                ukeVarArr3[i7] = new uke(i9, i10, BitmapDescriptorFactory.HUE_RED, iArr3, f, usfVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, usfVar, usfVar);
                i6++;
                i7++;
            }
            if (i8 < length) {
                ukeVarArr3[i7] = ukeVarArr[i8];
                i7++;
            }
        }
        uje ujeVarF = f();
        ujeVarF.k = ukeVarArr3;
        return new ujf(ujeVarF);
    }

    public final boolean h() {
        return (this.L.a() && this.N.a()) ? false : true;
    }

    public final int hashCode() {
        int i;
        Integer numValueOf = this.P;
        if (numValueOf == null) {
            boolean z = this.d;
            boolean z2 = this.e;
            boolean z3 = this.f;
            boolean z4 = this.g;
            boolean z5 = this.h;
            boolean z6 = this.i;
            int i2 = this.j;
            int i3 = this.m;
            int i4 = this.k;
            uke[] ukeVarArr = this.n;
            int i5 = true != z ? 1237 : 1231;
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i5 + 31) * 31) + (true != z2 ? 1237 : 1231)) * 31) + (true != z3 ? 1237 : 1231)) * 31) + (true != z4 ? 1237 : 1231)) * 31) + (true != z5 ? 1237 : 1231)) * 31) + (true == z6 ? 1231 : 1237)) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + Arrays.hashCode(ukeVarArr)) * 31) + Arrays.hashCode(this.o)) * 31) + Arrays.hashCode(this.p)) * 31) + Objects.hash(this.q)) * 31) + Objects.hash(this.r)) * 31) + Objects.hash(this.s)) * 31) + Objects.hash(this.t)) * 31) + Objects.hash(Float.valueOf(this.A))) * 31) + Objects.hash(Float.valueOf(this.B))) * 31) + Objects.hash(Float.valueOf(this.C))) * 31) + Objects.hash(Integer.valueOf(this.Q))) * 31) + Objects.hash(this.u)) * 31) + Objects.hash(Integer.valueOf(this.v))) * 31) + Objects.hash(this.w)) * 31) + this.x.hashCode()) * 31) + Objects.hash(Integer.valueOf(this.R))) * 31) + Objects.hash(this.J)) * 31) + this.K) * 31) + Objects.hash(this.L)) * 31) + Objects.hash(Integer.valueOf(this.S))) * 31) + Objects.hash(Integer.valueOf(this.T))) * 31) + Objects.hash(Integer.valueOf(this.U))) * 31) + this.M) * 31) + Objects.hash(this.N)) * 31) + Objects.hash(Integer.valueOf(this.V))) * 31) + Objects.hash(Integer.valueOf(this.W))) * 31) + Objects.hash(Integer.valueOf(this.X));
            synchronized (this) {
                i = (iHashCode * 31) + this.D;
            }
            int iHashCode2 = ((((i * 31) + Arrays.hashCode(this.E)) * 31) + this.F) * 31;
            int i6 = this.O;
            Float f = this.Z;
            int iHashCode3 = iHashCode2 + i6;
            if (f != null) {
                iHashCode3 = (iHashCode3 * 31) + f.hashCode();
            }
            Float f2 = this.aa;
            if (f2 != null) {
                iHashCode3 = (iHashCode3 * 31) + f2.hashCode();
            }
            Float f3 = this.ac;
            if (f3 != null) {
                iHashCode3 = (iHashCode3 * 31) + f3.hashCode();
            }
            Float f4 = this.ab;
            if (f4 != null) {
                iHashCode3 = (iHashCode3 * 31) + f4.hashCode();
            }
            numValueOf = Integer.valueOf(iHashCode3);
            this.P = numValueOf;
        }
        return numValueOf.intValue();
    }

    public final boolean i() {
        return this.t != null;
    }

    public final boolean j() {
        return this.ac != null;
    }

    public final boolean k() {
        return this.aa != null;
    }

    public final boolean l() {
        return this.ab != null;
    }

    public final boolean m() {
        return this.Z != null;
    }

    public final boolean n() {
        return this.w != null;
    }

    public final boolean o() {
        return this.R != 0;
    }

    public final boolean p() {
        return this.s != null;
    }

    public final boolean q() {
        return this.r != null;
    }

    public final boolean r() {
        return this.O != 0;
    }

    public final boolean s() {
        return this.m != 0;
    }

    public final boolean t() {
        boolean z;
        synchronized (this) {
            z = this.D != 0;
        }
        return z;
    }

    protected ujf(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, uke[] ukeVarArr, ukn uknVar, ukl uklVar, yfq yfqVar) {
        this.P = null;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = 0;
        this.m = 0;
        this.n = ukeVarArr;
        this.o = ukeVarArr;
        this.k = 0;
        this.l = BitmapDescriptorFactory.HUE_RED;
        this.q = null;
        this.p = ukeVarArr;
        this.r = uknVar;
        this.s = uklVar;
        this.t = null;
        this.A = BitmapDescriptorFactory.HUE_RED;
        this.B = BitmapDescriptorFactory.HUE_RED;
        this.C = BitmapDescriptorFactory.HUE_RED;
        this.R = 0;
        this.D = 0;
        this.E = null;
        this.F = 0;
        this.G = 0.375f;
        this.Y = 0.375f;
        this.H = 0;
        this.I = 0;
        usf usfVar = usf.a;
        this.J = usfVar;
        this.K = -1;
        this.L = usfVar;
        this.S = 1;
        this.T = 1;
        this.U = 1;
        this.M = -1;
        this.N = usfVar;
        this.V = 1;
        this.W = 1;
        this.X = 1;
        this.w = null;
        this.x = yfqVar;
        this.Q = 0;
        this.u = null;
        this.v = 0;
        this.y = null;
        this.z = 0;
        this.O = 0;
        this.Z = null;
        this.aa = null;
        this.ab = null;
        this.ac = null;
    }
}
