package com.airbnb.lottie.a.b;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: c, reason: collision with root package name */
    protected com.airbnb.lottie.h.c f1877c;

    /* renamed from: e, reason: collision with root package name */
    private final c f1879e;

    /* renamed from: a, reason: collision with root package name */
    final List f1875a = new ArrayList(1);

    /* renamed from: d, reason: collision with root package name */
    private boolean f1878d = false;

    /* renamed from: b, reason: collision with root package name */
    protected float f1876b = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private Object f1880f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f1881g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f1882h = -1.0f;

    f(List list) {
        c eVar;
        if (list.isEmpty()) {
            eVar = new b();
        } else {
            eVar = list.size() == 1 ? new e(list) : new d(list);
        }
        this.f1879e = eVar;
    }

    private final float o() {
        float f2 = this.f1881g;
        if (f2 != -1.0f) {
            return f2;
        }
        float fB = this.f1879e.b();
        this.f1881g = fB;
        return fB;
    }

    float a() {
        float f2 = this.f1882h;
        if (f2 != -1.0f) {
            return f2;
        }
        float fA = this.f1879e.a();
        this.f1882h = fA;
        return fA;
    }

    protected final float b() {
        Interpolator interpolator;
        com.airbnb.lottie.h.a aVarE = e();
        if (aVarE == null || aVarE.j() || (interpolator = aVarE.f2435c) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(c());
    }

    final float c() {
        if (this.f1878d) {
            return 0.0f;
        }
        com.airbnb.lottie.h.a aVarE = e();
        if (aVarE.j()) {
            return 0.0f;
        }
        return (this.f1876b - aVarE.e()) / (aVarE.c() - aVarE.e());
    }

    public final float d() {
        return this.f1876b;
    }

    protected final com.airbnb.lottie.h.a e() {
        return this.f1879e.c();
    }

    public Object f() {
        Interpolator interpolator;
        float fC = c();
        if (this.f1877c == null && this.f1879e.d(fC)) {
            return this.f1880f;
        }
        com.airbnb.lottie.h.a aVarE = e();
        Interpolator interpolator2 = aVarE.f2436d;
        Object objG = (interpolator2 == null || (interpolator = aVarE.f2437e) == null) ? g(aVarE, b()) : h(aVarE, fC, interpolator2.getInterpolation(fC), interpolator.getInterpolation(fC));
        this.f1880f = objG;
        return objG;
    }

    abstract Object g(com.airbnb.lottie.h.a aVar, float f2);

    protected Object h(com.airbnb.lottie.h.a aVar, float f2, float f3, float f4) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public final void i(a aVar) {
        this.f1875a.add(aVar);
    }

    public void j() {
        int i2 = 0;
        while (true) {
            List list = this.f1875a;
            if (i2 >= list.size()) {
                return;
            }
            ((a) list.get(i2)).d();
            i2++;
        }
    }

    public final void k() {
        this.f1878d = true;
    }

    public void l(float f2) {
        c cVar = this.f1879e;
        if (cVar.e()) {
            return;
        }
        if (f2 < o()) {
            f2 = o();
        } else if (f2 > a()) {
            f2 = a();
        }
        if (f2 != this.f1876b) {
            this.f1876b = f2;
            if (cVar.f(f2)) {
                j();
            }
        }
    }

    public final void m(com.airbnb.lottie.h.c cVar) {
        this.f1877c = cVar;
    }

    public final boolean n() {
        return this.f1877c != null;
    }
}
