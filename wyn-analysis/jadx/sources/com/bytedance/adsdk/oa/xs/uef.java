package com.bytedance.adsdk.oa.xs;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.oa.xs;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class uef<T> {

    /* renamed from: ab, reason: collision with root package name */
    private float f24603ab;
    public PointF bcc;
    private int cq;
    public PointF cz;
    private float dj;
    private int dz;
    public final float ivm;
    public final Interpolator lw;
    public final Interpolator moa;

    /* renamed from: oa, reason: collision with root package name */
    public T f24604oa;
    public final T uef;
    private float wk;
    private float wrv;
    public Float xs;
    public final Interpolator yo;
    private final xs zjm;

    public uef(xs xsVar, T t10, T t11, Interpolator interpolator, float f10, Float f11) {
        this.dj = -3987645.8f;
        this.wrv = -3987645.8f;
        this.cq = 784923401;
        this.dz = 784923401;
        this.wk = Float.MIN_VALUE;
        this.f24603ab = Float.MIN_VALUE;
        this.bcc = null;
        this.cz = null;
        this.zjm = xsVar;
        this.uef = t10;
        this.f24604oa = t11;
        this.yo = interpolator;
        this.moa = null;
        this.lw = null;
        this.ivm = f10;
        this.xs = f11;
    }

    public int bcc() {
        if (this.cq == 784923401) {
            this.cq = ((Integer) this.uef).intValue();
        }
        return this.cq;
    }

    public int cz() {
        if (this.dz == 784923401) {
            this.dz = ((Integer) this.f24604oa).intValue();
        }
        return this.dz;
    }

    public float ivm() {
        if (this.dj == -3987645.8f) {
            this.dj = ((Float) this.uef).floatValue();
        }
        return this.dj;
    }

    public boolean lw() {
        return this.yo == null && this.moa == null && this.lw == null;
    }

    public float moa() {
        if (this.zjm == null) {
            return 1.0f;
        }
        if (this.f24603ab == Float.MIN_VALUE) {
            if (this.xs == null) {
                this.f24603ab = 1.0f;
            } else {
                this.f24603ab = ((this.xs.floatValue() - this.ivm) / this.zjm.bs()) + yo();
            }
        }
        return this.f24603ab;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.uef + ", endValue=" + this.f24604oa + ", startFrame=" + this.ivm + ", endFrame=" + this.xs + ", interpolator=" + this.yo + '}';
    }

    public uef<T> uef(T t10, T t11) {
        return new uef<>(t10, t11);
    }

    public float xs() {
        if (this.wrv == -3987645.8f) {
            this.wrv = ((Float) this.f24604oa).floatValue();
        }
        return this.wrv;
    }

    public float yo() {
        xs xsVar = this.zjm;
        if (xsVar == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (this.wk == Float.MIN_VALUE) {
            this.wk = (this.ivm - xsVar.ivm()) / this.zjm.bs();
        }
        return this.wk;
    }

    public boolean uef(float f10) {
        return f10 >= yo() && f10 < moa();
    }

    public uef(xs xsVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.dj = -3987645.8f;
        this.wrv = -3987645.8f;
        this.cq = 784923401;
        this.dz = 784923401;
        this.wk = Float.MIN_VALUE;
        this.f24603ab = Float.MIN_VALUE;
        this.bcc = null;
        this.cz = null;
        this.zjm = xsVar;
        this.uef = t10;
        this.f24604oa = t11;
        this.yo = null;
        this.moa = interpolator;
        this.lw = interpolator2;
        this.ivm = f10;
        this.xs = f11;
    }

    public uef(xs xsVar, T t10, T t11, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.dj = -3987645.8f;
        this.wrv = -3987645.8f;
        this.cq = 784923401;
        this.dz = 784923401;
        this.wk = Float.MIN_VALUE;
        this.f24603ab = Float.MIN_VALUE;
        this.bcc = null;
        this.cz = null;
        this.zjm = xsVar;
        this.uef = t10;
        this.f24604oa = t11;
        this.yo = interpolator;
        this.moa = interpolator2;
        this.lw = interpolator3;
        this.ivm = f10;
        this.xs = f11;
    }

    public uef(T t10) {
        this.dj = -3987645.8f;
        this.wrv = -3987645.8f;
        this.cq = 784923401;
        this.dz = 784923401;
        this.wk = Float.MIN_VALUE;
        this.f24603ab = Float.MIN_VALUE;
        this.bcc = null;
        this.cz = null;
        this.zjm = null;
        this.uef = t10;
        this.f24604oa = t10;
        this.yo = null;
        this.moa = null;
        this.lw = null;
        this.ivm = Float.MIN_VALUE;
        this.xs = Float.valueOf(Float.MAX_VALUE);
    }

    private uef(T t10, T t11) {
        this.dj = -3987645.8f;
        this.wrv = -3987645.8f;
        this.cq = 784923401;
        this.dz = 784923401;
        this.wk = Float.MIN_VALUE;
        this.f24603ab = Float.MIN_VALUE;
        this.bcc = null;
        this.cz = null;
        this.zjm = null;
        this.uef = t10;
        this.f24604oa = t11;
        this.yo = null;
        this.moa = null;
        this.lw = null;
        this.ivm = Float.MIN_VALUE;
        this.xs = Float.valueOf(Float.MAX_VALUE);
    }
}
