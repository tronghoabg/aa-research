package com.airbnb.lottie.f;

import android.graphics.Color;
import android.graphics.PointF;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class k implements ag {

    /* renamed from: g, reason: collision with root package name */
    private final /* synthetic */ int f2362g;

    /* renamed from: f, reason: collision with root package name */
    public static final k f2361f = new k(5);

    /* renamed from: e, reason: collision with root package name */
    public static final k f2360e = new k(4);

    /* renamed from: d, reason: collision with root package name */
    public static final k f2359d = new k(3);

    /* renamed from: c, reason: collision with root package name */
    public static final k f2358c = new k(2);

    /* renamed from: b, reason: collision with root package name */
    public static final k f2357b = new k(1);

    /* renamed from: a, reason: collision with root package name */
    public static final k f2356a = new k(0);

    private k(int i2) {
        this.f2362g = i2;
    }

    @Override // com.airbnb.lottie.f.ag
    public final /* synthetic */ Object a(com.airbnb.lottie.f.a.d dVar, float f2) {
        boolean z;
        int i2 = this.f2362g;
        if (i2 == 0) {
            return Float.valueOf(q.a(dVar) * f2);
        }
        if (i2 == 1) {
            z = dVar.s() == 1;
            if (z) {
                dVar.j();
            }
            double dA = dVar.a();
            double dA2 = dVar.a();
            double dA3 = dVar.a();
            double dA4 = dVar.s() == 7 ? dVar.a() : 1.0d;
            if (z) {
                dVar.l();
            }
            if (dA <= 1.0d && dA2 <= 1.0d && dA3 <= 1.0d) {
                dA *= 255.0d;
                dA2 *= 255.0d;
                dA3 *= 255.0d;
                if (dA4 <= 1.0d) {
                    dA4 *= 255.0d;
                }
            }
            return Integer.valueOf(Color.argb((int) dA4, (int) dA, (int) dA2, (int) dA3));
        }
        if (i2 == 2) {
            return Integer.valueOf(Math.round(q.a(dVar) * f2));
        }
        if (i2 == 3) {
            return q.c(dVar, f2);
        }
        if (i2 != 4) {
            z = dVar.s() == 1;
            if (z) {
                dVar.j();
            }
            float fA = (float) dVar.a();
            float fA2 = (float) dVar.a();
            while (dVar.q()) {
                dVar.p();
            }
            if (z) {
                dVar.l();
            }
            return new com.airbnb.lottie.h.d((fA / 100.0f) * f2, (fA2 / 100.0f) * f2);
        }
        int iS = dVar.s();
        if (iS == 1) {
            return q.c(dVar, f2);
        }
        if (iS == 3) {
            return q.c(dVar, f2);
        }
        if (iS != 7) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(com.waze.c.c.e.c(iS)));
        }
        PointF pointF = new PointF(((float) dVar.a()) * f2, ((float) dVar.a()) * f2);
        while (dVar.q()) {
            dVar.p();
        }
        return pointF;
    }
}
