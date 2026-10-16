package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aaeb implements aadp {
    public static final double[] a = {-180.0d, 180.0d};
    public static final double[] b = {0.0d, 360.0d};
    public static final double c = 1.0d / Math.log(2.0d);
    private final CameraPosition d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final long h;
    private final int i;
    private boolean j;
    private aady k;
    private long l;
    private long m;
    private zro n;

    public aaeb(CameraPosition cameraPosition, boolean z, boolean z2, long j, int i) {
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static double b(double r18, double r20, double[] r22, double r23) {
        /*
            boolean r0 = java.lang.Double.isNaN(r20)
            if (r0 == 0) goto L10
            boolean r0 = java.lang.Double.isNaN(r18)
            if (r0 != 0) goto L10
            r0 = r18
        Le:
            r2 = r0
            goto L23
        L10:
            boolean r0 = java.lang.Double.isNaN(r18)
            if (r0 == 0) goto L1f
            boolean r0 = java.lang.Double.isNaN(r20)
            if (r0 != 0) goto L1f
            r0 = r20
            goto Le
        L1f:
            r2 = r18
            r0 = r20
        L23:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = r4 - r23
            double r8 = r23 * r0
            double r6 = r6 * r2
            double r6 = r6 + r8
            if (r22 != 0) goto L2e
            goto L4a
        L2e:
            double r8 = r0 - r2
            double r8 = java.lang.Math.abs(r8)
            double r10 = java.lang.Math.min(r2, r0)
            r12 = 0
            r13 = r22[r12]
            double r10 = r10 - r13
            r13 = 1
            r14 = r22[r13]
            double r16 = java.lang.Math.max(r2, r0)
            double r14 = r14 - r16
            double r10 = r10 + r14
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 > 0) goto L4b
        L4a:
            return r6
        L4b:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L51
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L51:
            double r4 = r4 * r10
            double r4 = r4 * r23
            double r2 = r2 + r4
            r0 = r22[r12]
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L60
            r4 = r22[r13]
            double r0 = r0 - r2
            double r4 = r4 - r0
            return r4
        L60:
            r4 = r22[r13]
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L69
            double r2 = r2 - r4
            double r0 = r0 + r2
            return r0
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaeb.b(double, double, double[], double):double");
    }

    private final synchronized void f(aaet aaetVar, long j) {
        CameraPosition cameraPositionG = aaetVar.g();
        CameraPosition cameraPosition = this.d;
        if (a.C(cameraPositionG, cameraPosition)) {
            this.j = true;
        }
        boolean z = this.f;
        long j2 = this.h;
        this.k = z ? new aaea(cameraPositionG, cameraPosition, j2) : new aadz(cameraPositionG, cameraPosition, j2);
        this.l = j;
        this.n = new zro(cameraPosition, Long.valueOf(j + this.h));
    }

    @Override // defpackage.aadp
    public final int a() {
        return this.i;
    }

    @Override // defpackage.aadp
    @ResultIgnorabilityUnspecified
    public final synchronized CameraPosition c(aaet aaetVar, long j) {
        CameraPosition cameraPosition;
        if (this.k == null) {
            f(aaetVar, j);
        }
        this.m = j;
        aady aadyVar = this.k;
        long j2 = j - this.l;
        boolean z = true;
        Object[] objArr = {Long.valueOf(j2)};
        if (j2 < 0) {
            z = false;
        }
        aclh.o(z, "invalid relativeTimeMs: %s", objArr);
        long j3 = aadyVar.c;
        if (j2 >= j3) {
            cameraPosition = aadyVar.b;
        } else if (j2 <= 0) {
            cameraPosition = aadyVar.a;
        } else {
            double dA = aadyVar.a(j2 / j3);
            CameraPosition cameraPosition2 = aadyVar.a;
            double d = cameraPosition2.target.latitude;
            CameraPosition cameraPosition3 = aadyVar.b;
            cameraPosition = new CameraPosition(new LatLng(b(d, cameraPosition3.target.latitude, null, dA), b(cameraPosition2.target.longitude, cameraPosition3.target.longitude, a, dA)), (float) aadyVar.b(cameraPosition2.zoom, cameraPosition3.zoom, dA), (float) b(cameraPosition2.tilt, cameraPosition3.tilt, null, dA), (float) b(cameraPosition2.bearing, cameraPosition3.bearing, b, dA));
        }
        return cameraPosition;
    }

    @Override // defpackage.aadp
    public final CameraPosition d() {
        if (this.h == 0) {
            return this.d;
        }
        return null;
    }

    @Override // defpackage.aadp
    public final synchronized zro e() {
        return this.n;
    }

    public final synchronized boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaeb)) {
            return false;
        }
        aaeb aaebVar = (aaeb) obj;
        synchronized (aaebVar) {
            if (!a.C(this.d, aaebVar.d) || this.e != aaebVar.e || this.f != aaebVar.f || this.g != aaebVar.g || this.h != aaebVar.h || this.l != aaebVar.l || this.i != aaebVar.i) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.aadp
    public final synchronized boolean h() {
        if (!this.j) {
            if (this.m - this.l < this.h) {
                return false;
            }
        }
        return true;
    }

    public final synchronized int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g), Long.valueOf(this.h), Long.valueOf(this.l), Integer.valueOf(this.i)});
    }

    @Override // defpackage.aadp
    public final boolean i() {
        return this.e;
    }

    @Override // defpackage.aadp
    public final boolean j(CameraPosition cameraPosition, aaet aaetVar) {
        return this.g;
    }

    public final synchronized String toString() {
        zsa zsaVarA;
        zsaVarA = zsa.a(this);
        zsaVarA.b("endPosition", this.d);
        zsaVarA.g("isNoopAnimation", this.j);
        zsaVarA.g("isUserGesture", this.e);
        zsaVarA.g("isLinear", this.f);
        zsaVarA.g("allowClampedCamera", this.g);
        zsaVarA.f("durationMs", this.h);
        zsaVarA.f("startWorldTimeMs", this.l);
        zsaVarA.f("currWorldTimeMs", this.m);
        zsaVarA.e("animationReason", this.i);
        return zsaVarA.toString();
    }

    @Override // defpackage.aadp
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.aadp
    public final void g(boolean z) {
    }
}
