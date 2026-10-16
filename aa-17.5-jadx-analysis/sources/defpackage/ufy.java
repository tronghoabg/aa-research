package defpackage;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.widget.Scroller;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class ufy extends ttg {
    public static final /* synthetic */ int a = 0;
    private final float[] A;
    private final float[] B;
    private final float[] C;
    private final float[] D;
    private ttn E;
    private final ufv F;
    private final ufv G;
    private final usy H;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private boolean y;
    private boolean z;

    public ufy(Context context, usy usyVar, std stdVar) {
        super(stdVar);
        this.A = new float[4];
        this.B = new float[4];
        this.C = new float[4];
        this.D = new float[4];
        this.H = usyVar;
        this.E = usyVar.o();
        ufv ufvVar = new ufv(context);
        this.F = ufvVar;
        this.G = ufvVar;
    }

    final synchronized void A(float f) {
        float f2 = this.s + f;
        this.s = f2;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.y = false;
        }
        tsy.a(this.E.n + f2);
    }

    final synchronized void B(float f, float f2, float f3) {
        float f4 = this.s + f;
        this.s = f4;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.w = f2;
            this.x = f3;
            this.y = true;
        }
        tsy.a(this.E.n + f4);
    }

    @Override // defpackage.ttg, defpackage.tti
    public final int a(long j) {
        float f;
        float f2;
        float f3;
        float fMax;
        float fMax2;
        ttn ttnVarA;
        ttn ttnVarA2;
        synchronized (this) {
            float f4 = this.w;
            float f5 = this.x;
            if (this.z) {
                v();
                float f6 = this.u;
                float[] fArr = this.D;
                f = f6 + fArr[0];
                f2 = this.v + fArr[1];
                fMax = this.r + fArr[2];
                fMax2 = this.s + fArr[3];
                f3 = this.t;
                this.t = BitmapDescriptorFactory.HUE_RED;
                this.s = BitmapDescriptorFactory.HUE_RED;
                this.r = BitmapDescriptorFactory.HUE_RED;
                this.v = BitmapDescriptorFactory.HUE_RED;
                this.u = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = this.u;
                f2 = this.v;
                f3 = this.t;
                float f7 = this.r;
                float f8 = f7 * f7;
                fMax = f7 < BitmapDescriptorFactory.HUE_RED ? Math.max(f7, f8 * (-10.0f)) : Math.min(f7, f8 * 10.0f);
                float f9 = this.s;
                float f10 = f9 * f9;
                fMax2 = f9 < BitmapDescriptorFactory.HUE_RED ? Math.max(f9, f10 * (-0.1f)) : Math.min(f9, f10 * 0.1f);
                this.r -= fMax;
                this.s -= fMax2;
                this.u -= f;
                this.v -= f2;
                this.t -= f3;
            }
            if (this.h != 0) {
                if (Math.abs(f) < 0.1d && Math.abs(f2) < 0.1d && Math.abs(fMax) < 1.0E-4d && Math.abs(fMax2) < 0.001d && f3 == BitmapDescriptorFactory.HUE_RED) {
                    ufv ufvVar = this.G;
                    if (ufvVar.h == ufvVar.g) {
                    }
                }
                boolean z = ((f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) || (this.h & ttn.c) == 0) ? false : true;
                boolean z2 = (fMax2 == BitmapDescriptorFactory.HUE_RED || (this.h & ttn.f) == 0) ? false : true;
                boolean z3 = (fMax == BitmapDescriptorFactory.HUE_RED || (this.h & ttn.d) == 0) ? false : true;
                boolean z4 = (f3 == BitmapDescriptorFactory.HUE_RED || (this.h & ttn.e) == 0) ? false : true;
                if (z) {
                    usy usyVar = this.H;
                    ttn ttnVarK = tsw.k(usyVar, this.E, f, f2);
                    this.E = ttnVarK;
                    if (z2 || z3 || z4) {
                        usyVar.t(ttnVarK);
                    }
                }
                if (z2) {
                    if (this.y) {
                        usy usyVar2 = this.H;
                        int i = tsw.a;
                        ttn ttnVarO = usyVar2.o();
                        float fK = usyVar2.k();
                        tto ttoVar = ttnVarO.o;
                        float fA = f4 - (fK * ttoVar.a());
                        float fJ = f5 - (usyVar2.j() * ttoVar.b());
                        ttl ttlVar = new ttl(tsw.k(usyVar2, ttnVarO, fA, fJ));
                        ttlVar.g = ttnVarO.n + fMax2;
                        usyVar2.e.c(ttlVar);
                        ttn ttnVarA3 = ttlVar.a();
                        usyVar2.t(ttnVarA3);
                        ttnVarA2 = tsw.k(usyVar2, ttnVarA3, -fA, -fJ);
                        this.E = ttnVarA2;
                    } else {
                        ttn ttnVar = this.E;
                        ttn ttnVar2 = ttn.a;
                        ttl ttlVar2 = new ttl(ttnVar);
                        ttlVar2.g = this.E.n + fMax2;
                        ttnVarA2 = ttlVar2.a();
                        this.E = ttnVarA2;
                    }
                    if (z3 || z4) {
                        this.H.t(ttnVarA2);
                    }
                }
                if (z3) {
                    ttn ttnVar3 = this.E;
                    float f11 = ttnVar3.l + fMax;
                    if (this.y) {
                        ttnVarA = tsw.j(this.H, ttnVar3, f11, f4, f5);
                        this.E = ttnVarA;
                    } else {
                        ttl ttlVar3 = new ttl(ttnVar3);
                        ttlVar3.e = f11;
                        ttnVarA = ttlVar3.a();
                        this.E = ttnVarA;
                    }
                    if (z4) {
                        this.H.t(ttnVarA);
                    }
                }
                if (z4) {
                    ttn ttnVar4 = this.E;
                    ttn ttnVar5 = ttn.a;
                    ttl ttlVar4 = new ttl(ttnVar4);
                    ttlVar4.f = this.E.m + f3;
                    this.E = ttlVar4.a();
                }
                usy usyVar3 = this.H;
                ttn ttnVar6 = this.E;
                ttn ttnVar7 = ttn.a;
                ttl ttlVar5 = new ttl(ttnVar6);
                usyVar3.e.c(ttlVar5);
                this.E = ttlVar5.a();
                return 6;
            }
            this.t = BitmapDescriptorFactory.HUE_RED;
            this.r = BitmapDescriptorFactory.HUE_RED;
            this.s = BitmapDescriptorFactory.HUE_RED;
            this.v = BitmapDescriptorFactory.HUE_RED;
            this.u = BitmapDescriptorFactory.HUE_RED;
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021 A[Catch: all -> 0x0069, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0012, B:13:0x001b, B:16:0x0023, B:18:0x0029, B:19:0x002c, B:21:0x0032, B:22:0x0035, B:24:0x003b, B:25:0x003e, B:27:0x0042, B:29:0x004a, B:32:0x0053, B:34:0x0059, B:35:0x005c, B:37:0x0062, B:31:0x0050, B:15:0x0021), top: B:46:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029 A[Catch: all -> 0x0069, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0012, B:13:0x001b, B:16:0x0023, B:18:0x0029, B:19:0x002c, B:21:0x0032, B:22:0x0035, B:24:0x003b, B:25:0x003e, B:27:0x0042, B:29:0x004a, B:32:0x0053, B:34:0x0059, B:35:0x005c, B:37:0x0062, B:31:0x0050, B:15:0x0021), top: B:46:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032 A[Catch: all -> 0x0069, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0012, B:13:0x001b, B:16:0x0023, B:18:0x0029, B:19:0x002c, B:21:0x0032, B:22:0x0035, B:24:0x003b, B:25:0x003e, B:27:0x0042, B:29:0x004a, B:32:0x0053, B:34:0x0059, B:35:0x005c, B:37:0x0062, B:31:0x0050, B:15:0x0021), top: B:46:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[Catch: all -> 0x0069, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0012, B:13:0x001b, B:16:0x0023, B:18:0x0029, B:19:0x002c, B:21:0x0032, B:22:0x0035, B:24:0x003b, B:25:0x003e, B:27:0x0042, B:29:0x004a, B:32:0x0053, B:34:0x0059, B:35:0x005c, B:37:0x0062, B:31:0x0050, B:15:0x0021), top: B:46:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042 A[Catch: all -> 0x0069, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x000e, B:9:0x0012, B:13:0x001b, B:16:0x0023, B:18:0x0029, B:19:0x002c, B:21:0x0032, B:22:0x0035, B:24:0x003b, B:25:0x003e, B:27:0x0042, B:29:0x004a, B:32:0x0053, B:34:0x0059, B:35:0x005c, B:37:0x0062, B:31:0x0050, B:15:0x0021), top: B:46:0x0001 }] */
    @Override // defpackage.ttg, defpackage.tti
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized int b() {
        /*
            r4 = this;
            monitor-enter(r4)
            float r0 = r4.u     // Catch: java.lang.Throwable -> L69
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L21
            float r0 = r4.v     // Catch: java.lang.Throwable -> L69
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L21
            boolean r0 = r4.y     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L18
            float r2 = r4.r     // Catch: java.lang.Throwable -> L69
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L21
        L18:
            r2 = 0
            if (r0 == 0) goto L23
            float r0 = r4.s     // Catch: java.lang.Throwable -> L69
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L23
        L21:
            int r2 = defpackage.ttn.c     // Catch: java.lang.Throwable -> L69
        L23:
            float r0 = r4.r     // Catch: java.lang.Throwable -> L69
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L2c
            int r0 = defpackage.ttn.d     // Catch: java.lang.Throwable -> L69
            r2 = r2 | r0
        L2c:
            float r0 = r4.t     // Catch: java.lang.Throwable -> L69
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L35
            int r0 = defpackage.ttn.e     // Catch: java.lang.Throwable -> L69
            r2 = r2 | r0
        L35:
            float r0 = r4.s     // Catch: java.lang.Throwable -> L69
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L3e
            int r0 = defpackage.ttn.f     // Catch: java.lang.Throwable -> L69
            r2 = r2 | r0
        L3e:
            boolean r0 = r4.z     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L67
            ufv r0 = r4.G     // Catch: java.lang.Throwable -> L69
            float r3 = r0.c     // Catch: java.lang.Throwable -> L69
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L50
            float r3 = r0.d     // Catch: java.lang.Throwable -> L69
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L53
        L50:
            int r3 = defpackage.ttn.c     // Catch: java.lang.Throwable -> L69
            r2 = r2 | r3
        L53:
            float r3 = r0.e     // Catch: java.lang.Throwable -> L69
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L5c
            int r3 = defpackage.ttn.d     // Catch: java.lang.Throwable -> L69
            r2 = r2 | r3
        L5c:
            float r0 = r0.f     // Catch: java.lang.Throwable -> L69
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L67
            int r0 = defpackage.ttn.f     // Catch: java.lang.Throwable -> L69
            r0 = r0 | r2
            monitor-exit(r4)
            return r0
        L67:
            monitor-exit(r4)
            return r2
        L69:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L69
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufy.b():int");
    }

    @Override // defpackage.ttg, defpackage.tti
    public final long c() {
        return 0L;
    }

    @Override // defpackage.ttg, defpackage.tti
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ttg, defpackage.tti
    public final Object f(int i) {
        return this.E.c(i);
    }

    @Override // defpackage.ttg, defpackage.tti
    public final Object g(int i) {
        return null;
    }

    @Override // defpackage.ttg, defpackage.tti
    public final void k(int i) {
        this.h = i;
    }

    final synchronized float l() {
        return this.E.l;
    }

    final synchronized float q() {
        return this.G.e;
    }

    final synchronized float r(float f) {
        float f2;
        f2 = this.r + f;
        this.r = f2;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.y = false;
        }
        return tsy.b(this.E.l + f2);
    }

    final synchronized float s(float f, float f2, float f3) {
        float f4;
        f4 = this.r + f;
        this.r = f4;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            this.w = f2;
            this.x = f3;
            this.y = true;
        }
        return tsy.b(this.E.l + f4);
    }

    final synchronized void t() {
        this.z = false;
        ufv ufvVar = this.G;
        ufvVar.j.p();
        ufvVar.h = ufvVar.g;
    }

    final synchronized void u(float[] fArr) {
        this.z = true;
        float[] fArr2 = this.A;
        int length = fArr2.length;
        System.arraycopy(fArr, 0, fArr2, 0, 4);
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        float f4 = fArr2[3];
        float fAbs = f3 == BitmapDescriptorFactory.HUE_RED ? 1.0f : Math.abs(15.0f / f3);
        if (fAbs < 1.0f) {
            f *= fAbs;
            f2 *= fAbs;
            f3 *= fAbs;
            f4 *= fAbs;
        }
        ufv ufvVar = this.G;
        int iRound = (int) Math.round(Math.hypot(f, f2));
        float f5 = ufvVar.a;
        float f6 = 4.0f * f5;
        float f7 = ufvVar.b;
        int iRound2 = Math.round(f3 * f5);
        int iRound3 = Math.round(f4 * f7);
        int iA = ufvVar.a(iRound, Alert.DURATION_SHOW_INDEFINITELY);
        ufvVar.c = iRound == 0 ? 0.0f : (iA * f) / iRound;
        ufvVar.d = iRound == 0 ? 0.0f : (iA * f2) / iRound;
        int i = (int) f6;
        ufvVar.e = ufvVar.a(iRound2, i) / f5;
        ufvVar.f = ufvVar.a(iRound3, Alert.DURATION_SHOW_INDEFINITELY) / f7;
        int iAbs = Math.abs(iRound2);
        int iAbs2 = Math.abs(iRound3);
        int iAu = wub.au(iRound, iAbs, iAbs2);
        if (iAu == iRound) {
            ufvVar.g = ufvVar.a(iRound, Alert.DURATION_SHOW_INDEFINITELY);
        } else if (iAu == iAbs) {
            ufvVar.g = ufvVar.a(iAbs, i);
        } else {
            ufvVar.g = ufvVar.a(iAbs2, Alert.DURATION_SHOW_INDEFINITELY);
        }
        ufvVar.h = 0;
        Arrays.fill(this.B, BitmapDescriptorFactory.HUE_RED);
    }

    final synchronized void v() {
        float[] fArr = this.C;
        ufv ufvVar = this.G;
        int i = 0;
        if (ufvVar.g == 0 || AnimationUtils.currentAnimationTimeMillis() < ufvVar.i.get()) {
            Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
        } else {
            Object obj = ufvVar.j.a;
            ((Scroller) obj).computeScrollOffset();
            int currX = ((Scroller) obj).getCurrX();
            ufvVar.h = currX;
            float f = ufvVar.g;
            float f2 = ufvVar.c;
            int i2 = uzg.a;
            float f3 = currX / f;
            fArr[0] = ((f2 + BitmapDescriptorFactory.HUE_RED) * f3) + BitmapDescriptorFactory.HUE_RED;
            fArr[1] = ((ufvVar.d + BitmapDescriptorFactory.HUE_RED) * f3) + BitmapDescriptorFactory.HUE_RED;
            fArr[2] = ((ufvVar.e + BitmapDescriptorFactory.HUE_RED) * f3) + BitmapDescriptorFactory.HUE_RED;
            fArr[3] = ((ufvVar.f + BitmapDescriptorFactory.HUE_RED) * f3) + BitmapDescriptorFactory.HUE_RED;
        }
        while (true) {
            int length = fArr.length;
            if (i < 4) {
                float[] fArr2 = this.D;
                float f4 = fArr[i];
                float[] fArr3 = this.B;
                fArr2[i] = f4 - fArr3[i];
                fArr3[i] = fArr[i];
                i++;
            }
        }
    }

    final synchronized void w(float f, float f2) {
        this.u += f;
        this.v += f2;
    }

    final synchronized void x(float f) {
        this.t += f;
    }

    final synchronized boolean y() {
        return this.z;
    }

    @ResultIgnorabilityUnspecified
    public final void z(ttn ttnVar) {
        ttnVar.getClass();
        this.E = ttnVar;
    }
}
