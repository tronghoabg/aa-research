package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uka {
    static final int[] a = new int[0];
    static final defpackage.ukz[] b;
    public static final defpackage.uka c;
    public final float A;
    public final float B;
    public final float C;
    public int D;
    public final float[] E;
    public final int F;
    public final float G;
    public final int H;
    public final int I;
    public final defpackage.utb J;
    public final int K;
    public final defpackage.utb L;
    public final int M;
    public final defpackage.utb N;
    public final int O;
    public java.lang.Integer P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final int V;
    public final int W;
    public final int X;
    private final float Y;
    private final java.lang.Float Z;
    private final java.lang.Float aa;
    private final java.lang.Float ab;
    private final java.lang.Float ac;
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
    public final defpackage.ukz[] n;
    public final defpackage.ukz[] o;
    public final defpackage.ukz[] p;
    public final defpackage.ukz q;
    public final defpackage.uli r;
    public final defpackage.ulg s;
    public final defpackage.ujv t;
    public final defpackage.abbx u;
    public final int v;
    public final defpackage.abbi w;
    public final defpackage.ygw x;
    public final defpackage.abbo y;
    public final int z;

    static {
        defpackage.ukz[] ukzVarArr = new defpackage.ukz[0];
        b = ukzVarArr;
        defpackage.uli uliVar = defpackage.uli.a;
        defpackage.ulg ulgVar = defpackage.ulg.a;
        int i = defpackage.ygw.d;
        c = new defpackage.uka(false, false, false, false, false, false, ukzVarArr, uliVar, ulgVar, defpackage.ymx.a);
    }

    public uka(defpackage.ujz ujzVar) {
        this.P = null;
        this.d = ujzVar.a;
        this.e = ujzVar.b;
        this.f = ujzVar.c;
        this.g = ujzVar.d;
        this.h = ujzVar.e;
        this.i = ujzVar.f;
        this.j = ujzVar.g;
        this.m = ujzVar.h;
        this.n = ujzVar.j;
        this.o = ujzVar.k;
        this.p = ujzVar.l;
        this.k = ujzVar.i;
        this.q = ujzVar.m;
        this.r = ujzVar.n;
        this.s = ujzVar.o;
        this.t = ujzVar.p;
        this.A = ujzVar.q;
        this.B = ujzVar.r;
        this.C = ujzVar.s;
        this.D = ujzVar.t;
        this.E = ujzVar.u;
        this.F = ujzVar.v;
        this.G = ujzVar.w;
        this.Y = ujzVar.x;
        this.H = ujzVar.y;
        this.I = ujzVar.z;
        this.J = ujzVar.A;
        this.K = ujzVar.B;
        this.L = ujzVar.C;
        this.S = ujzVar.R;
        this.T = ujzVar.S;
        this.U = ujzVar.T;
        this.M = ujzVar.D;
        this.N = ujzVar.E;
        this.V = ujzVar.U;
        this.W = ujzVar.V;
        this.X = ujzVar.W;
        this.Q = ujzVar.X;
        this.u = ujzVar.F;
        this.v = ujzVar.G;
        this.w = ujzVar.H;
        this.x = ujzVar.I;
        this.R = ujzVar.Y;
        this.y = ujzVar.J;
        this.z = ujzVar.K;
        this.O = ujzVar.L;
        this.Z = ujzVar.M;
        this.aa = ujzVar.N;
        this.ab = ujzVar.O;
        this.ac = ujzVar.P;
        this.l = ujzVar.Q;
    }

    private static int u(int i, int i2) {
        return java.lang.Math.abs((i >>> 24) - (i2 >>> 24)) + java.lang.Math.abs(((i >>> 16) & 255) - ((i2 >>> 16) & 255)) + java.lang.Math.abs(((i >>> 8) & 255) - ((i2 >>> 8) & 255)) + java.lang.Math.abs((i & 255) - (i2 & 255));
    }

    private static void v(int[] iArr, defpackage.ukz[] ukzVarArr, defpackage.ukz[] ukzVarArr2, defpackage.ajmp ajmpVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 <= ukzVarArr.length; i4++) {
            while (i2 < iArr.length && iArr[i2] == i4) {
                i2++;
                i3++;
            }
            if (i4 < ukzVarArr.length) {
                int i5 = i3 + 1;
                defpackage.ukz ukzVar = ukzVarArr[i4];
                defpackage.ukz ukzVar2 = ukzVarArr2[i3];
                int iU = (u(ukzVar.b, ukzVar2.b) + u(ukzVar.c, ukzVar2.c)) / 2;
                if (ukzVar.c() != ukzVar2.c()) {
                    iU += 2048;
                }
                i += iU;
                i3 = i5;
            }
        }
        if (i < ajmpVar.a) {
            ajmpVar.a = i;
            java.lang.System.arraycopy(iArr, 0, ajmpVar.b, 0, iArr.length);
        }
    }

    public final float a() {
        java.lang.Float f = this.ac;
        return f != null ? f.floatValue() : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public final float b() {
        java.lang.Float f = this.aa;
        return f != null ? f.floatValue() : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public final float c() {
        java.lang.Float f = this.ab;
        return f != null ? f.floatValue() : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public final float d() {
        java.lang.Float f = this.Z;
        return f != null ? f.floatValue() : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
    }

    public final int e() {
        int i;
        synchronized (this) {
            i = this.D;
        }
        return i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.uka ukaVar = (defpackage.uka) obj;
        if (this.d != ukaVar.d || this.e != ukaVar.e || this.f != ukaVar.f || this.g != ukaVar.g || this.h != ukaVar.h || this.i != ukaVar.i || this.j != ukaVar.j || this.m != ukaVar.m || this.k != ukaVar.k || !java.util.Arrays.equals(this.n, ukaVar.n) || !java.util.Arrays.equals(this.o, ukaVar.o) || !java.util.Arrays.equals(this.p, ukaVar.p)) {
            return false;
        }
        defpackage.ukz ukzVar = this.q;
        if (ukzVar == null) {
            if (ukaVar.q != null) {
                return false;
            }
        } else if (!ukzVar.equals(ukaVar.q)) {
            return false;
        }
        defpackage.ulg ulgVar = this.s;
        if (ulgVar == null) {
            if (ukaVar.s != null) {
                return false;
            }
        } else if (!ulgVar.equals(ukaVar.s)) {
            return false;
        }
        defpackage.uli uliVar = this.r;
        if (uliVar == null) {
            if (ukaVar.r != null) {
                return false;
            }
        } else if (!uliVar.equals(ukaVar.r)) {
            return false;
        }
        if (this.F != ukaVar.F) {
            return false;
        }
        defpackage.ujv ujvVar = this.t;
        if (ujvVar == null) {
            if (ukaVar.t != null) {
                return false;
            }
        } else if (!ujvVar.equals(ukaVar.t)) {
            return false;
        }
        if (this.A != ukaVar.A || this.B != ukaVar.B || this.C != ukaVar.C || e() != ukaVar.e() || !java.util.Arrays.equals(this.E, ukaVar.E) || !this.J.equals(ukaVar.J) || this.K != ukaVar.K || !this.L.equals(ukaVar.L)) {
            return false;
        }
        int i = this.S;
        int i2 = ukaVar.S;
        if (i == 0) {
            throw null;
        }
        if (i != i2) {
            return false;
        }
        int i3 = this.T;
        int i4 = ukaVar.T;
        if (i3 == 0) {
            throw null;
        }
        if (i3 != i4) {
            return false;
        }
        int i5 = this.U;
        int i6 = ukaVar.U;
        if (i5 == 0) {
            throw null;
        }
        if (i5 != i6 || this.M != ukaVar.M || !this.N.equals(ukaVar.N)) {
            return false;
        }
        int i7 = this.V;
        int i8 = ukaVar.V;
        if (i7 == 0) {
            throw null;
        }
        if (i7 != i8) {
            return false;
        }
        int i9 = this.W;
        int i10 = ukaVar.W;
        if (i9 == 0) {
            throw null;
        }
        if (i9 != i10) {
            return false;
        }
        int i11 = this.X;
        int i12 = ukaVar.X;
        if (i11 != 0) {
            return i11 == i12 && this.Q == ukaVar.Q && j$.util.Objects.equals(this.u, ukaVar.u) && this.v == ukaVar.v && j$.util.Objects.equals(this.w, ukaVar.w) && defpackage.ysr.W(this.x, ukaVar.x) && this.R == ukaVar.R && this.O == ukaVar.O && j$.util.Objects.equals(this.Z, ukaVar.Z) && j$.util.Objects.equals(this.aa, ukaVar.aa) && j$.util.Objects.equals(this.ac, ukaVar.ac) && j$.util.Objects.equals(this.ab, ukaVar.ab);
        }
        throw null;
    }

    public final defpackage.ujz f() {
        defpackage.ujz ujzVar = new defpackage.ujz();
        ujzVar.a = this.d;
        ujzVar.b = this.e;
        ujzVar.c = this.f;
        ujzVar.d = this.g;
        ujzVar.e = this.h;
        ujzVar.f = this.i;
        ujzVar.g = this.j;
        ujzVar.h = this.m;
        ujzVar.j = this.n;
        ujzVar.k = this.o;
        ujzVar.l = this.p;
        ujzVar.i = this.k;
        ujzVar.m = this.q;
        ujzVar.Q = this.l;
        ujzVar.n = this.r;
        ujzVar.o = this.s;
        ujzVar.p = this.t;
        ujzVar.q = this.A;
        ujzVar.r = this.B;
        ujzVar.s = this.C;
        ujzVar.u = this.E;
        ujzVar.v = this.F;
        ujzVar.w = this.G;
        ujzVar.x = this.Y;
        ujzVar.y = this.H;
        ujzVar.z = this.I;
        ujzVar.A = this.J;
        ujzVar.B = this.K;
        ujzVar.C = this.L;
        ujzVar.R = this.S;
        ujzVar.S = this.T;
        ujzVar.T = this.U;
        ujzVar.D = this.M;
        ujzVar.E = this.N;
        ujzVar.U = this.V;
        ujzVar.V = this.W;
        ujzVar.W = this.X;
        ujzVar.X = this.Q;
        ujzVar.F = this.u;
        ujzVar.G = this.v;
        ujzVar.H = this.w;
        ujzVar.I = this.x;
        ujzVar.Y = this.R;
        ujzVar.a(this.y);
        ujzVar.K = this.z;
        ujzVar.L = this.O;
        ujzVar.M = this.Z;
        ujzVar.N = this.aa;
        ujzVar.O = this.ab;
        ujzVar.P = this.ac;
        synchronized (this) {
            ujzVar.t = this.D;
        }
        return ujzVar;
    }

    public final defpackage.uka g(defpackage.uka ukaVar) {
        defpackage.ukz[] ukzVarArr = this.o;
        defpackage.ukz[] ukzVarArr2 = ukaVar.o;
        int length = ukzVarArr.length;
        int length2 = ukzVarArr2.length;
        if (length >= length2) {
            return this;
        }
        int i = length2 - length;
        int[] iArr = new int[i];
        defpackage.ajmp ajmpVar = new defpackage.ajmp(i);
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
                                    v(iArr, ukzVarArr, ukzVarArr2, ajmpVar);
                                }
                            } else {
                                v(iArr, ukzVarArr, ukzVarArr2, ajmpVar);
                            }
                        }
                    } else {
                        v(iArr, ukzVarArr, ukzVarArr2, ajmpVar);
                    }
                }
            } else {
                v(iArr, ukzVarArr, ukzVarArr2, ajmpVar);
            }
        }
        if (ajmpVar.a == Integer.MAX_VALUE) {
            throw new java.lang.IllegalStateException("Couldn't find best insertion indices");
        }
        defpackage.ukz[] ukzVarArr3 = new defpackage.ukz[length2];
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 <= length; i8++) {
            while (true) {
                int[] iArr2 = (int[]) ajmpVar.b;
                if (i6 >= iArr2.length || iArr2[i6] != i8) {
                    break;
                }
                defpackage.ukz ukzVar = ukzVarArr2[i7];
                int i9 = ukzVar.b;
                int i10 = ukzVar.c;
                float f = ukzVar.h;
                int[] iArr3 = a;
                defpackage.utb utbVar = defpackage.utb.a;
                ukzVarArr3[i7] = new defpackage.ukz(i9, i10, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, iArr3, f, utbVar, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, utbVar, utbVar);
                i6++;
                i7++;
            }
            if (i8 < length) {
                ukzVarArr3[i7] = ukzVarArr[i8];
                i7++;
            }
        }
        defpackage.ujz ujzVarF = f();
        ujzVarF.k = ukzVarArr3;
        return new defpackage.uka(ujzVarF);
    }

    public final boolean h() {
        return (this.L.a() && this.N.a()) ? false : true;
    }

    public final int hashCode() {
        int i;
        java.lang.Integer numValueOf = this.P;
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
            defpackage.ukz[] ukzVarArr = this.n;
            int i5 = true != z ? 1237 : 1231;
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i5 + 31) * 31) + (true != z2 ? 1237 : 1231)) * 31) + (true != z3 ? 1237 : 1231)) * 31) + (true != z4 ? 1237 : 1231)) * 31) + (true != z5 ? 1237 : 1231)) * 31) + (true == z6 ? 1231 : 1237)) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + java.util.Arrays.hashCode(ukzVarArr)) * 31) + java.util.Arrays.hashCode(this.o)) * 31) + java.util.Arrays.hashCode(this.p)) * 31) + j$.util.Objects.hash(this.q)) * 31) + j$.util.Objects.hash(this.r)) * 31) + j$.util.Objects.hash(this.s)) * 31) + j$.util.Objects.hash(this.t)) * 31) + j$.util.Objects.hash(java.lang.Float.valueOf(this.A))) * 31) + j$.util.Objects.hash(java.lang.Float.valueOf(this.B))) * 31) + j$.util.Objects.hash(java.lang.Float.valueOf(this.C))) * 31) + j$.util.Objects.hash(java.lang.Integer.valueOf(this.Q))) * 31) + j$.util.Objects.hash(this.u)) * 31) + j$.util.Objects.hash(java.lang.Integer.valueOf(this.v))) * 31) + j$.util.Objects.hash(this.w)) * 31) + this.x.hashCode()) * 31) + j$.util.Objects.hash(java.lang.Integer.valueOf(this.R))) * 31) + j$.util.Objects.hash(this.J)) * 31) + this.K) * 31) + j$.util.Objects.hash(this.L)) * 31) + j$.util.Objects.hash(java.lang.Integer.valueOf(this.S))) * 31) + j$.util.Objects.hash(java.lang.Integer.valueOf(this.T))) * 31) + j$.util.Objects.hash(java.lang.Integer.valueOf(this.U))) * 31) + this.M) * 31) + j$.util.Objects.hash(this.N)) * 31) + j$.util.Objects.hash(java.lang.Integer.valueOf(this.V))) * 31) + j$.util.Objects.hash(java.lang.Integer.valueOf(this.W))) * 31) + j$.util.Objects.hash(java.lang.Integer.valueOf(this.X));
            synchronized (this) {
                i = (iHashCode * 31) + this.D;
            }
            int iHashCode2 = ((((i * 31) + java.util.Arrays.hashCode(this.E)) * 31) + this.F) * 31;
            int i6 = this.O;
            java.lang.Float f = this.Z;
            int iHashCode3 = iHashCode2 + i6;
            if (f != null) {
                iHashCode3 = (iHashCode3 * 31) + f.hashCode();
            }
            java.lang.Float f2 = this.aa;
            if (f2 != null) {
                iHashCode3 = (iHashCode3 * 31) + f2.hashCode();
            }
            java.lang.Float f3 = this.ac;
            if (f3 != null) {
                iHashCode3 = (iHashCode3 * 31) + f3.hashCode();
            }
            java.lang.Float f4 = this.ab;
            if (f4 != null) {
                iHashCode3 = (iHashCode3 * 31) + f4.hashCode();
            }
            numValueOf = java.lang.Integer.valueOf(iHashCode3);
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

    protected uka(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, defpackage.ukz[] ukzVarArr, defpackage.uli uliVar, defpackage.ulg ulgVar, defpackage.ygw ygwVar) {
        this.P = null;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = 0;
        this.m = 0;
        this.n = ukzVarArr;
        this.o = ukzVarArr;
        this.k = 0;
        this.l = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.q = null;
        this.p = ukzVarArr;
        this.r = uliVar;
        this.s = ulgVar;
        this.t = null;
        this.A = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.B = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.C = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.R = 0;
        this.D = 0;
        this.E = null;
        this.F = 0;
        this.G = 0.375f;
        this.Y = 0.375f;
        this.H = 0;
        this.I = 0;
        defpackage.utb utbVar = defpackage.utb.a;
        this.J = utbVar;
        this.K = -1;
        this.L = utbVar;
        this.S = 1;
        this.T = 1;
        this.U = 1;
        this.M = -1;
        this.N = utbVar;
        this.V = 1;
        this.W = 1;
        this.X = 1;
        this.w = null;
        this.x = ygwVar;
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
