package defpackage;

import com.google.android.libraries.maps.model.CameraPosition;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aaec implements aadp {
    boolean a;
    private final float b;
    private final aadu c;
    private final long d;
    private final aacz e;
    private final int f;
    private aadp g;
    private CameraPosition h;
    private boolean i;

    public aaec(float f, aadu aaduVar, long j, aacz aaczVar) {
        synchronized (this) {
            this.b = f;
            this.c = aaduVar;
            this.d = j;
            this.e = aaczVar;
            this.f = 1;
            this.g = null;
            this.h = null;
            this.i = false;
            this.a = false;
        }
    }

    private final synchronized void b(aaet aaetVar) {
        CameraPosition cameraPositionF;
        aadu aaduVar = this.c;
        CameraPosition cameraPositionG = aaetVar.g();
        if (aaduVar == null) {
            CameraPosition.Builder builder = CameraPosition.builder(cameraPositionG);
            builder.zoom(cameraPositionG.zoom + this.b);
            cameraPositionF = builder.build();
        } else {
            cameraPositionF = aaetVar.f(cameraPositionG, this.b, aaduVar, this.e);
        }
        CameraPosition cameraPosition = cameraPositionF;
        long j = this.d;
        int i = this.f;
        this.g = j == 0 ? new aaen(cameraPosition, true, i) : new aaeb(cameraPosition, true, true, j, i);
    }

    @Override // defpackage.aadp
    public final int a() {
        return this.f;
    }

    @Override // defpackage.aadp
    @ResultIgnorabilityUnspecified
    public final synchronized CameraPosition c(aaet aaetVar, long j) {
        CameraPosition cameraPositionC;
        if (this.g == null) {
            b(aaetVar);
        }
        cameraPositionC = this.g.c(aaetVar, j);
        this.h = cameraPositionC;
        return cameraPositionC;
    }

    @Override // defpackage.aadp
    public final CameraPosition d() {
        return null;
    }

    @Override // defpackage.aadp
    public final zro e() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 1
            if (r7 != r8) goto L6
            monitor-exit(r7)
            return r0
        L6:
            boolean r1 = r8 instanceof defpackage.aaec     // Catch: java.lang.Throwable -> L46
            r2 = 0
            if (r1 != 0) goto Ld
            monitor-exit(r7)
            return r2
        Ld:
            aaec r8 = (defpackage.aaec) r8     // Catch: java.lang.Throwable -> L46
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L46
            float r1 = r7.b     // Catch: java.lang.Throwable -> L43
            float r3 = r8.b     // Catch: java.lang.Throwable -> L43
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L3f
            aadu r1 = r7.c     // Catch: java.lang.Throwable -> L43
            aadu r3 = r8.c     // Catch: java.lang.Throwable -> L43
            boolean r1 = defpackage.a.C(r1, r3)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L3f
            long r3 = r7.d     // Catch: java.lang.Throwable -> L43
            long r5 = r8.d     // Catch: java.lang.Throwable -> L43
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L3f
            aadp r1 = r7.g     // Catch: java.lang.Throwable -> L43
            aadp r3 = r8.g     // Catch: java.lang.Throwable -> L43
            boolean r1 = defpackage.a.C(r1, r3)     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L3f
            boolean r1 = r8.i     // Catch: java.lang.Throwable -> L43
            int r1 = r7.f     // Catch: java.lang.Throwable -> L43
            int r3 = r8.f     // Catch: java.lang.Throwable -> L43
            if (r1 != r3) goto L3f
            boolean r1 = r8.a     // Catch: java.lang.Throwable -> L43
            goto L40
        L3f:
            r0 = r2
        L40:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L43
            monitor-exit(r7)
            return r0
        L43:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L46
        L46:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L46
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaec.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.aadp
    public final synchronized void g(boolean z) {
    }

    @Override // defpackage.aadp
    public final synchronized boolean h() {
        return this.g.h();
    }

    public final synchronized int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b), this.c, Long.valueOf(this.d), this.g, false, false, Integer.valueOf(this.f)});
    }

    @Override // defpackage.aadp
    public final boolean i() {
        return true;
    }

    @Override // defpackage.aadp
    public final synchronized boolean j(CameraPosition cameraPosition, aaet aaetVar) {
        return this.g.j(cameraPosition, aaetVar);
    }

    public final synchronized String toString() {
        zsa zsaVarA;
        zsaVarA = zsa.a(this);
        zsaVarA.d("zoomBy", this.b);
        zsaVarA.b("focusPixel", this.c);
        zsaVarA.f("durationMs", this.d);
        zsaVarA.b("actualAnimation", this.g);
        zsaVarA.g("hasReachedClampingLimit", false);
        zsaVarA.e("animationReason", this.f);
        zsaVarA.g("isOuterExhausted", false);
        return zsaVarA.toString();
    }

    @Override // defpackage.aadp
    public final /* synthetic */ void k() {
    }
}
