package com.airbnb.lottie.d;

import android.graphics.PointF;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f2117a;

    /* renamed from: b, reason: collision with root package name */
    public String f2118b;

    /* renamed from: c, reason: collision with root package name */
    public float f2119c;

    /* renamed from: d, reason: collision with root package name */
    public int f2120d;

    /* renamed from: e, reason: collision with root package name */
    public float f2121e;

    /* renamed from: f, reason: collision with root package name */
    public float f2122f;

    /* renamed from: g, reason: collision with root package name */
    public int f2123g;

    /* renamed from: h, reason: collision with root package name */
    public int f2124h;

    /* renamed from: i, reason: collision with root package name */
    public float f2125i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2126j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f2127k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f2128l;
    public int m;

    public b(String str, String str2, float f2, int i2, int i3, float f3, float f4, int i4, int i5, float f5, boolean z, PointF pointF, PointF pointF2) {
        a(str, str2, f2, i2, i3, f3, f4, i4, i5, f5, z, pointF, pointF2);
    }

    public final void a(String str, String str2, float f2, int i2, int i3, float f3, float f4, int i4, int i5, float f5, boolean z, PointF pointF, PointF pointF2) {
        this.f2117a = str;
        this.f2118b = str2;
        this.f2119c = f2;
        this.m = i2;
        this.f2120d = i3;
        this.f2121e = f3;
        this.f2122f = f4;
        this.f2123g = i4;
        this.f2124h = i5;
        this.f2125i = f5;
        this.f2126j = z;
        this.f2127k = pointF;
        this.f2128l = pointF2;
    }

    public final int hashCode() {
        float fHashCode = (((this.f2117a.hashCode() * 31) + this.f2118b.hashCode()) * 31) + this.f2119c;
        int i2 = this.m;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        int i4 = (((((int) fHashCode) * 31) + i3) * 31) + this.f2120d;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f2121e);
        return (((i4 * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f2123g;
    }

    public b() {
    }
}
