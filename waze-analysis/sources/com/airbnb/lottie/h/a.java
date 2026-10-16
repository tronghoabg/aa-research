package com.airbnb.lottie.h;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.airbnb.lottie.h;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2433a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2434b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f2435c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f2436d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f2437e;

    /* renamed from: f, reason: collision with root package name */
    public final float f2438f;

    /* renamed from: g, reason: collision with root package name */
    public Float f2439g;

    /* renamed from: h, reason: collision with root package name */
    public PointF f2440h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f2441i;

    /* renamed from: j, reason: collision with root package name */
    private final h f2442j;

    /* renamed from: k, reason: collision with root package name */
    private float f2443k;

    /* renamed from: l, reason: collision with root package name */
    private float f2444l;
    private int m;
    private int n;
    private float o;
    private float p;

    public a(Object obj) {
        this.f2443k = -3987645.8f;
        this.f2444l = -3987645.8f;
        this.m = 784923401;
        this.n = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.f2440h = null;
        this.f2441i = null;
        this.f2442j = null;
        this.f2433a = obj;
        this.f2434b = obj;
        this.f2435c = null;
        this.f2436d = null;
        this.f2437e = null;
        this.f2438f = Float.MIN_VALUE;
        this.f2439g = Float.valueOf(Float.MAX_VALUE);
    }

    public static final a k(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    public final float c() {
        h hVar = this.f2442j;
        if (hVar == null) {
            return 1.0f;
        }
        float f2 = this.p;
        if (f2 != Float.MIN_VALUE) {
            return f2;
        }
        if (this.f2439g == null) {
            this.p = 1.0f;
            return 1.0f;
        }
        float fE = e() + ((this.f2439g.floatValue() - this.f2438f) / hVar.b());
        this.p = fE;
        return fE;
    }

    public final float d() {
        float f2 = this.f2444l;
        if (f2 != -3987645.8f) {
            return f2;
        }
        float fFloatValue = ((Float) this.f2434b).floatValue();
        this.f2444l = fFloatValue;
        return fFloatValue;
    }

    public final float e() {
        h hVar = this.f2442j;
        if (hVar == null) {
            return 0.0f;
        }
        float f2 = this.o;
        if (f2 != Float.MIN_VALUE) {
            return f2;
        }
        float f3 = (this.f2438f - hVar.f()) / hVar.b();
        this.o = f3;
        return f3;
    }

    public final float f() {
        float f2 = this.f2443k;
        if (f2 != -3987645.8f) {
            return f2;
        }
        float fFloatValue = ((Float) this.f2433a).floatValue();
        this.f2443k = fFloatValue;
        return fFloatValue;
    }

    public final int g() {
        int i2 = this.n;
        if (i2 != 784923401) {
            return i2;
        }
        int iIntValue = ((Integer) this.f2434b).intValue();
        this.n = iIntValue;
        return iIntValue;
    }

    public final int h() {
        int i2 = this.m;
        if (i2 != 784923401) {
            return i2;
        }
        int iIntValue = ((Integer) this.f2433a).intValue();
        this.m = iIntValue;
        return iIntValue;
    }

    public final boolean i(float f2) {
        return f2 >= e() && f2 < c();
    }

    public final boolean j() {
        return this.f2435c == null && this.f2436d == null && this.f2437e == null;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f2433a);
        String strValueOf2 = String.valueOf(this.f2434b);
        Interpolator interpolator = this.f2435c;
        return "Keyframe{startValue=" + strValueOf + ", endValue=" + strValueOf2 + ", startFrame=" + this.f2438f + ", endFrame=" + this.f2439g + ", interpolator=" + String.valueOf(interpolator) + "}";
    }

    public a(h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, float f2) {
        this.f2443k = -3987645.8f;
        this.f2444l = -3987645.8f;
        this.m = 784923401;
        this.n = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.f2440h = null;
        this.f2441i = null;
        this.f2442j = hVar;
        this.f2433a = obj;
        this.f2434b = obj2;
        this.f2435c = null;
        this.f2436d = interpolator;
        this.f2437e = interpolator2;
        this.f2438f = f2;
        this.f2439g = null;
    }

    protected a(h hVar, Object obj, Object obj2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f2, Float f3) {
        this.f2443k = -3987645.8f;
        this.f2444l = -3987645.8f;
        this.m = 784923401;
        this.n = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.f2440h = null;
        this.f2441i = null;
        this.f2442j = hVar;
        this.f2433a = obj;
        this.f2434b = obj2;
        this.f2435c = interpolator;
        this.f2436d = interpolator2;
        this.f2437e = interpolator3;
        this.f2438f = f2;
        this.f2439g = f3;
    }

    public a(h hVar, Object obj, Object obj2, Interpolator interpolator, float f2, Float f3) {
        this.f2443k = -3987645.8f;
        this.f2444l = -3987645.8f;
        this.m = 784923401;
        this.n = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.f2440h = null;
        this.f2441i = null;
        this.f2442j = hVar;
        this.f2433a = obj;
        this.f2434b = obj2;
        this.f2435c = interpolator;
        this.f2436d = null;
        this.f2437e = null;
        this.f2438f = f2;
        this.f2439g = f3;
    }

    private a(Object obj, Object obj2) {
        this.f2443k = -3987645.8f;
        this.f2444l = -3987645.8f;
        this.m = 784923401;
        this.n = 784923401;
        this.o = Float.MIN_VALUE;
        this.p = Float.MIN_VALUE;
        this.f2440h = null;
        this.f2441i = null;
        this.f2442j = null;
        this.f2433a = obj;
        this.f2434b = obj2;
        this.f2435c = null;
        this.f2436d = null;
        this.f2437e = null;
        this.f2438f = Float.MIN_VALUE;
        this.f2439g = Float.valueOf(Float.MAX_VALUE);
    }
}
