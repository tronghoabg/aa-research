package com.airbnb.lottie.g;

import android.view.Choreographer;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class e extends a implements Choreographer.FrameCallback {

    /* renamed from: j, reason: collision with root package name */
    private com.airbnb.lottie.h f2411j;

    /* renamed from: b, reason: collision with root package name */
    private float f2403b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2404c = false;

    /* renamed from: d, reason: collision with root package name */
    private long f2405d = 0;

    /* renamed from: e, reason: collision with root package name */
    private float f2406e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private float f2407f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    private int f2408g = 0;

    /* renamed from: h, reason: collision with root package name */
    private float f2409h = -2.1474836E9f;

    /* renamed from: i, reason: collision with root package name */
    private float f2410i = 2.1474836E9f;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f2402a = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2412k = false;

    private final boolean z() {
        return this.f2403b < 0.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        super.a();
        b(z());
        q();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        p();
        com.airbnb.lottie.h hVar = this.f2411j;
        if (hVar == null || !this.f2402a) {
            return;
        }
        long j3 = this.f2405d;
        long j4 = j3 != 0 ? j2 - j3 : 0L;
        float fE = (1.0E9f / hVar.e()) / Math.abs(this.f2403b);
        float f2 = this.f2406e;
        float f3 = j4 / fE;
        if (z()) {
            f3 = -f3;
        }
        float f4 = f2 + f3;
        float fJ = j();
        float fI = i();
        int i2 = f.f2413a;
        boolean z = f4 >= fJ && f4 <= fI;
        float f5 = this.f2406e;
        float fMax = Math.max(j(), Math.min(i(), f4));
        this.f2406e = fMax;
        if (this.f2412k) {
            fMax = (float) Math.floor(fMax);
        }
        this.f2407f = fMax;
        this.f2405d = j2;
        if (!this.f2412k || this.f2406e != f5) {
            g();
        }
        if (!z) {
            if (getRepeatCount() == -1 || this.f2408g < getRepeatCount()) {
                d();
                this.f2408g++;
                if (getRepeatMode() == 2) {
                    this.f2404c = !this.f2404c;
                    t();
                } else {
                    float fI2 = z() ? i() : j();
                    this.f2406e = fI2;
                    this.f2407f = fI2;
                }
                this.f2405d = j2;
            } else {
                float fJ2 = this.f2403b < 0.0f ? j() : i();
                this.f2406e = fJ2;
                this.f2407f = fJ2;
                q();
                b(z());
            }
        }
        if (this.f2411j != null) {
            float f6 = this.f2407f;
            float f7 = this.f2409h;
            if (f6 < f7 || f6 > this.f2410i) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f7), Float.valueOf(this.f2410i), Float.valueOf(this.f2407f)));
            }
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fI;
        float fJ;
        if (this.f2411j == null) {
            return 0.0f;
        }
        if (z()) {
            fI = i();
            fJ = this.f2407f;
        } else {
            fI = this.f2407f;
            fJ = j();
        }
        return (fI - fJ) / (i() - j());
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        com.airbnb.lottie.h hVar = this.f2411j;
        if (hVar == null) {
            return 0L;
        }
        return (long) hVar.a();
    }

    public final float h() {
        com.airbnb.lottie.h hVar = this.f2411j;
        if (hVar == null) {
            return 0.0f;
        }
        return (this.f2407f - hVar.f()) / (hVar.c() - hVar.f());
    }

    public final float i() {
        com.airbnb.lottie.h hVar = this.f2411j;
        if (hVar == null) {
            return 0.0f;
        }
        float f2 = this.f2410i;
        return f2 == 2.1474836E9f ? hVar.c() : f2;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f2402a;
    }

    public final float j() {
        com.airbnb.lottie.h hVar = this.f2411j;
        if (hVar == null) {
            return 0.0f;
        }
        float f2 = this.f2409h;
        return f2 == -2.1474836E9f ? hVar.f() : f2;
    }

    public final float k() {
        return this.f2403b;
    }

    public final void l() {
        this.f2411j = null;
        this.f2409h = -2.1474836E9f;
        this.f2410i = 2.1474836E9f;
    }

    public final void m() {
        q();
        b(z());
    }

    public final void n() {
        q();
        c();
    }

    public final void o() {
        this.f2402a = true;
        f(z());
        v((int) (z() ? i() : j()));
        this.f2405d = 0L;
        this.f2408g = 0;
        p();
    }

    protected final void p() {
        if (this.f2402a) {
            r(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    protected final void q() {
        r(true);
    }

    protected final void r(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f2402a = false;
        }
    }

    public final void s() {
        this.f2402a = true;
        p();
        this.f2405d = 0L;
        if (z() && this.f2407f == j()) {
            v(i());
        } else if (!z() && this.f2407f == i()) {
            v(j());
        }
        e();
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i2) {
        super.setRepeatMode(i2);
        if (i2 == 2 || !this.f2404c) {
            return;
        }
        this.f2404c = false;
        t();
    }

    public final void t() {
        this.f2403b = -this.f2403b;
    }

    public final void u(com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.h hVar2 = this.f2411j;
        this.f2411j = hVar;
        if (hVar2 == null) {
            w(Math.max(this.f2409h, hVar.f()), Math.min(this.f2410i, hVar.c()));
        } else {
            w((int) hVar.f(), (int) hVar.c());
        }
        float f2 = this.f2407f;
        this.f2407f = 0.0f;
        this.f2406e = 0.0f;
        v((int) f2);
        g();
    }

    public final void v(float f2) {
        if (this.f2406e == f2) {
            return;
        }
        float fJ = j();
        float fI = i();
        int i2 = f.f2413a;
        float fMax = Math.max(fJ, Math.min(fI, f2));
        this.f2406e = fMax;
        if (this.f2412k) {
            fMax = (float) Math.floor(fMax);
        }
        this.f2407f = fMax;
        this.f2405d = 0L;
        g();
    }

    public final void w(float f2, float f3) {
        if (f2 > f3) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f2), Float.valueOf(f3)));
        }
        com.airbnb.lottie.h hVar = this.f2411j;
        float f4 = hVar == null ? -3.4028235E38f : hVar.f();
        float fC = hVar == null ? Float.MAX_VALUE : hVar.c();
        int i2 = f.f2413a;
        float fMax = Math.max(f4, Math.min(fC, f2));
        float fMax2 = Math.max(f4, Math.min(fC, f3));
        if (fMax == this.f2409h && fMax2 == this.f2410i) {
            return;
        }
        this.f2409h = fMax;
        this.f2410i = fMax2;
        v((int) Math.max(fMax, Math.min(fMax2, this.f2407f)));
    }

    public final void x(float f2) {
        this.f2403b = f2;
    }

    public final void y(boolean z) {
        this.f2412k = z;
    }
}
