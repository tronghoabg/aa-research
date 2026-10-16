package com.bytedance.adsdk.oa.ivm;

import android.view.Choreographer;
import com.bytedance.adsdk.oa.xs;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class yo extends uef implements Choreographer.FrameCallback {
    private xs zjm;

    /* renamed from: oa, reason: collision with root package name */
    private float f24562oa = 1.0f;
    private boolean yo = false;
    private long moa = 0;
    private float lw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float ivm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private int xs = 0;
    private float bcc = -2.1474836E9f;
    private float cz = 2.1474836E9f;
    protected boolean uef = false;
    private boolean dj = false;

    private boolean dhk() {
        return zjm() < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private float oib() {
        xs xsVar = this.zjm;
        if (xsVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / xsVar.wrv()) / Math.abs(this.f24562oa);
    }

    private void tpx() {
        if (this.zjm == null) {
            return;
        }
        float f10 = this.ivm;
        if (f10 < this.bcc || f10 > this.cz) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.bcc), Float.valueOf(this.cz), Float.valueOf(this.ivm)));
        }
    }

    public float ab() {
        xs xsVar = this.zjm;
        if (xsVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = this.cz;
        return f10 == 2.1474836E9f ? xsVar.xs() : f10;
    }

    public void bcc() {
        this.zjm = null;
        this.bcc = -2.1474836E9f;
        this.cz = 2.1474836E9f;
    }

    public void bs() {
        if (isRunning()) {
            moa(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        oa();
        sy();
    }

    public void cq() {
        sy();
        moa();
    }

    public void cz() {
        yo(-zjm());
    }

    public void dj() {
        this.uef = true;
        uef(dhk());
        uef((int) (dhk() ? ab() : wk()));
        this.moa = 0L;
        this.xs = 0;
        bs();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j8) {
        bs();
        if (this.zjm == null || !isRunning()) {
            return;
        }
        com.bytedance.adsdk.oa.lw.uef("LottieValueAnimator#doFrame");
        float fOib = (this.moa != 0 ? j8 - r1 : 0L) / oib();
        float f10 = this.lw;
        if (dhk()) {
            fOib = -fOib;
        }
        float f11 = f10 + fOib;
        boolean zYo = lw.yo(f11, wk(), ab());
        float f12 = this.lw;
        float fOa = lw.oa(f11, wk(), ab());
        this.lw = fOa;
        if (this.dj) {
            fOa = (float) Math.floor(fOa);
        }
        this.ivm = fOa;
        this.moa = j8;
        if (!this.dj || this.lw != f12) {
            yo();
        }
        if (!zYo) {
            if (getRepeatCount() == -1 || this.xs < getRepeatCount()) {
                uef();
                this.xs++;
                if (getRepeatMode() == 2) {
                    this.yo = !this.yo;
                    cz();
                } else {
                    float fAb = dhk() ? ab() : wk();
                    this.lw = fAb;
                    this.ivm = fAb;
                }
                this.moa = j8;
            } else {
                float fWk = this.f24562oa < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? wk() : ab();
                this.lw = fWk;
                this.ivm = fWk;
                sy();
                oa(dhk());
            }
        }
        tpx();
        com.bytedance.adsdk.oa.lw.oa("LottieValueAnimator#doFrame");
    }

    public void dz() {
        this.uef = true;
        bs();
        this.moa = 0L;
        if (dhk() && xs() == wk()) {
            uef(ab());
        } else if (!dhk() && xs() == ab()) {
            uef(wk());
        }
        lw();
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fWk;
        float fAb;
        float fWk2;
        if (this.zjm == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (dhk()) {
            fWk = ab() - this.ivm;
            fAb = ab();
            fWk2 = wk();
        } else {
            fWk = this.ivm - wk();
            fAb = ab();
            fWk2 = wk();
        }
        return fWk / (fAb - fWk2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(ivm());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        xs xsVar = this.zjm;
        if (xsVar == null) {
            return 0L;
        }
        return (long) xsVar.lw();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.uef;
    }

    public float ivm() {
        xs xsVar = this.zjm;
        return xsVar == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.ivm - xsVar.ivm()) / (this.zjm.xs() - this.zjm.ivm());
    }

    public void moa(boolean z2) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z2) {
            this.uef = false;
        }
    }

    public void oa(float f10) {
        uef(this.bcc, f10);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i5) {
        super.setRepeatMode(i5);
        if (i5 == 2 || !this.yo) {
            return;
        }
        this.yo = false;
        cz();
    }

    public void sy() {
        moa(true);
    }

    public void uef(xs xsVar) {
        boolean z2 = this.zjm == null;
        this.zjm = xsVar;
        if (z2) {
            uef(Math.max(this.bcc, xsVar.ivm()), Math.min(this.cz, xsVar.xs()));
        } else {
            uef((int) xsVar.ivm(), (int) xsVar.xs());
        }
        float f10 = this.ivm;
        this.ivm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.lw = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        uef((int) f10);
        yo();
    }

    public float wk() {
        xs xsVar = this.zjm;
        if (xsVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f10 = this.bcc;
        return f10 == -2.1474836E9f ? xsVar.ivm() : f10;
    }

    public void wrv() {
        sy();
        oa(dhk());
    }

    public float xs() {
        return this.ivm;
    }

    public void yo(boolean z2) {
        this.dj = z2;
    }

    public float zjm() {
        return this.f24562oa;
    }

    @Override // com.bytedance.adsdk.oa.ivm.uef
    public void oa() {
        super.oa();
        oa(dhk());
    }

    public void yo(float f10) {
        this.f24562oa = f10;
    }

    public void uef(float f10) {
        if (this.lw == f10) {
            return;
        }
        float fOa = lw.oa(f10, wk(), ab());
        this.lw = fOa;
        if (this.dj) {
            fOa = (float) Math.floor(fOa);
        }
        this.ivm = fOa;
        this.moa = 0L;
        yo();
    }

    public void uef(int i5) {
        uef(i5, (int) this.cz);
    }

    public void uef(float f10, float f11) {
        if (f10 <= f11) {
            xs xsVar = this.zjm;
            float fIvm = xsVar == null ? -3.4028235E38f : xsVar.ivm();
            xs xsVar2 = this.zjm;
            float fXs = xsVar2 == null ? Float.MAX_VALUE : xsVar2.xs();
            float fOa = lw.oa(f10, fIvm, fXs);
            float fOa2 = lw.oa(f11, fIvm, fXs);
            if (fOa == this.bcc && fOa2 == this.cz) {
                return;
            }
            this.bcc = fOa;
            this.cz = fOa2;
            uef((int) lw.oa(this.ivm, fOa, fOa2));
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f10 + ") must be <= maxFrame (" + f11 + ")");
    }
}
