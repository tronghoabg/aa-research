package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aafd implements defpackage.aaer {
    public static final double[] a = {-180.0d, 180.0d};
    public static final double[] b = {0.0d, 360.0d};
    public static final double c = 1.4426950408889634d;
    private final com.google.android.libraries.maps.model.CameraPosition d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final long h;
    private final int i;
    private boolean j;
    private defpackage.aafa k;
    private long l;
    private long m;
    private defpackage.zss n;

    public aafd(com.google.android.libraries.maps.model.CameraPosition cameraPosition, boolean z, boolean z2, long j, int i) {
        synchronized (this) {
            this.d = cameraPosition;
            this.e = z;
            this.f = z2;
            this.g = true;
            this.h = j;
            this.i = i;
            this.j = false;
            this.k = null;
            this.n = null;
            this.l = 0L;
            this.m = 0L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:22:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x0069 A[RETURN] */
    static double b(double d, double d2, double[] dArr, double d3) {
        double d4;
        double d5;
        double dAbs;
        double dMin;
        double d6;
        double d7;
        double d8;
        if (!java.lang.Double.isNaN(d2) || java.lang.Double.isNaN(d)) {
            if (!java.lang.Double.isNaN(d) || java.lang.Double.isNaN(d2)) {
                d4 = d;
                d5 = d2;
            } else {
                d5 = d2;
            }
            double d9 = ((1.0d - d3) * d4) + (d3 * d5);
            if (dArr != null) {
                dAbs = java.lang.Math.abs(d5 - d4);
                dMin = (java.lang.Math.min(d4, d5) - dArr[0]) + (dArr[1] - java.lang.Math.max(d4, d5));
                if (dAbs > dMin) {
                    d6 = d4 + ((d4 < d5 ? -1.0d : 1.0d) * dMin * d3);
                    d7 = dArr[0];
                    if (d6 < d7) {
                        return dArr[1] - (d7 - d6);
                    }
                    d8 = dArr[1];
                    if (d6 > d8) {
                        return d7 + (d6 - d8);
                    }
                    return d6;
                }
            }
            return d9;
        }
        d5 = d;
        d4 = d5;
        double d10 = ((1.0d - d3) * d4) + (d3 * d5);
        if (dArr != null) {
            dAbs = java.lang.Math.abs(d5 - d4);
            dMin = (java.lang.Math.min(d4, d5) - dArr[0]) + (dArr[1] - java.lang.Math.max(d4, d5));
            if (dAbs > dMin) {
                d6 = d4 + ((d4 < d5 ? -1.0d : 1.0d) * dMin * d3);
                d7 = dArr[0];
                if (d6 < d7) {
                    return dArr[1] - (d7 - d6);
                }
                d8 = dArr[1];
                if (d6 > d8) {
                    return d7 + (d6 - d8);
                }
                return d6;
            }
        }
        return d10;
    }

    private final synchronized void f(defpackage.aafv aafvVar, long j) {
        com.google.android.libraries.maps.model.CameraPosition cameraPositionG = aafvVar.g();
        com.google.android.libraries.maps.model.CameraPosition cameraPosition = this.d;
        if (defpackage.a.B(cameraPositionG, cameraPosition)) {
            this.j = true;
        }
        boolean z = this.f;
        long j2 = this.h;
        this.k = z ? new defpackage.aafc(cameraPositionG, cameraPosition, j2) : new defpackage.aafb(cameraPositionG, cameraPosition, j2);
        this.l = j;
        this.n = new defpackage.zss(cameraPosition, java.lang.Long.valueOf(j + this.h));
    }

    @Override // defpackage.aaer
    public final int a() {
        return this.i;
    }

    @Override // defpackage.aaer
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final synchronized com.google.android.libraries.maps.model.CameraPosition c(defpackage.aafv aafvVar, long j) {
        com.google.android.libraries.maps.model.CameraPosition cameraPosition;
        if (this.k == null) {
            f(aafvVar, j);
        }
        this.m = j;
        defpackage.aafa aafaVar = this.k;
        long j2 = j - this.l;
        boolean z = true;
        java.lang.Object[] objArr = {java.lang.Long.valueOf(j2)};
        if (j2 < 0) {
            z = false;
        }
        defpackage.acmj.h(z, "invalid relativeTimeMs: %s", objArr);
        long j3 = aafaVar.c;
        if (j2 >= j3) {
            cameraPosition = aafaVar.b;
        } else if (j2 <= 0) {
            cameraPosition = aafaVar.a;
        } else {
            double dA = aafaVar.a(j2 / j3);
            com.google.android.libraries.maps.model.CameraPosition cameraPosition2 = aafaVar.a;
            double d = cameraPosition2.target.latitude;
            com.google.android.libraries.maps.model.CameraPosition cameraPosition3 = aafaVar.b;
            cameraPosition = new com.google.android.libraries.maps.model.CameraPosition(new com.google.android.libraries.maps.model.LatLng(b(d, cameraPosition3.target.latitude, null, dA), b(cameraPosition2.target.longitude, cameraPosition3.target.longitude, a, dA)), (float) aafaVar.b(cameraPosition2.zoom, cameraPosition3.zoom, dA), (float) b(cameraPosition2.tilt, cameraPosition3.tilt, null, dA), (float) b(cameraPosition2.bearing, cameraPosition3.bearing, b, dA));
        }
        return cameraPosition;
    }

    @Override // defpackage.aaer
    public final com.google.android.libraries.maps.model.CameraPosition d() {
        if (this.h == 0) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.aaer
    public final synchronized defpackage.zss e() {
        return this.n;
    }

    public final synchronized boolean equals(java.lang.Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aafd)) {
            return false;
        }
        defpackage.aafd aafdVar = (defpackage.aafd) obj;
        synchronized (aafdVar) {
            if (!defpackage.a.B(this.d, aafdVar.d) || this.e != aafdVar.e || this.f != aafdVar.f || this.g != aafdVar.g || this.h != aafdVar.h || this.l != aafdVar.l || this.i != aafdVar.i) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.aaer
    public final synchronized boolean h() {
        return this.j || this.m - this.l >= this.h;
    }

    public final synchronized int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.d, java.lang.Boolean.valueOf(this.e), java.lang.Boolean.valueOf(this.f), java.lang.Boolean.valueOf(this.g), java.lang.Long.valueOf(this.h), java.lang.Long.valueOf(this.l), java.lang.Integer.valueOf(this.i)});
    }

    @Override // defpackage.aaer
    public final boolean i() {
        return this.e;
    }

    @Override // defpackage.aaer
    public final boolean j(com.google.android.libraries.maps.model.CameraPosition cameraPosition, defpackage.aafv aafvVar) {
        return this.g;
    }

    public final synchronized java.lang.String toString() {
        defpackage.zte zteVarA;
        zteVarA = defpackage.zte.a(this);
        zteVarA.b("endPosition", this.d);
        zteVarA.g("isNoopAnimation", this.j);
        zteVarA.g("isUserGesture", this.e);
        zteVarA.g("isLinear", this.f);
        zteVarA.g("allowClampedCamera", this.g);
        zteVarA.f("durationMs", this.h);
        zteVarA.f("startWorldTimeMs", this.l);
        zteVarA.f("currWorldTimeMs", this.m);
        zteVarA.e("animationReason", this.i);
        return zteVarA.toString();
    }

    @Override // defpackage.aaer
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.aaer
    public final void g(boolean z) {
    }
}
