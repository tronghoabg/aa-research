package com.airbnb.lottie.a.b;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t extends f {

    /* renamed from: d, reason: collision with root package name */
    protected com.airbnb.lottie.h.c f1909d;

    /* renamed from: e, reason: collision with root package name */
    protected com.airbnb.lottie.h.c f1910e;

    /* renamed from: f, reason: collision with root package name */
    private final PointF f1911f;

    /* renamed from: g, reason: collision with root package name */
    private final PointF f1912g;

    /* renamed from: h, reason: collision with root package name */
    private final f f1913h;

    /* renamed from: i, reason: collision with root package name */
    private final f f1914i;

    public t(f fVar, f fVar2) {
        super(Collections.EMPTY_LIST);
        this.f1911f = new PointF();
        this.f1912g = new PointF();
        this.f1913h = fVar;
        this.f1914i = fVar2;
        l(this.f1876b);
    }

    @Override // com.airbnb.lottie.a.b.f
    public final /* bridge */ /* synthetic */ Object f() {
        return o(0.0f);
    }

    @Override // com.airbnb.lottie.a.b.f
    final /* bridge */ /* synthetic */ Object g(com.airbnb.lottie.h.a aVar, float f2) {
        return o(f2);
    }

    @Override // com.airbnb.lottie.a.b.f
    public final void l(float f2) {
        f fVar = this.f1913h;
        fVar.l(f2);
        f fVar2 = this.f1914i;
        fVar2.l(f2);
        this.f1911f.set(((Float) fVar.f()).floatValue(), ((Float) fVar2.f()).floatValue());
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

    final PointF o(float f2) {
        float f3;
        Float f4;
        f fVar;
        com.airbnb.lottie.h.a aVarE;
        f fVar2;
        com.airbnb.lottie.h.a aVarE2;
        Float f5 = null;
        if (this.f1909d == null || (aVarE2 = (fVar2 = this.f1913h).e()) == null) {
            f3 = f2;
            f4 = null;
        } else {
            float fB = fVar2.b();
            Float f6 = aVarE2.f2439g;
            f3 = f2;
            f4 = (Float) this.f1909d.b(aVarE2.f2438f, f6 == null ? aVarE2.f2438f : f6.floatValue(), (Float) aVarE2.f2433a, (Float) aVarE2.f2434b, f2, f2, fB);
        }
        if (this.f1910e != null && (aVarE = (fVar = this.f1914i).e()) != null) {
            float fB2 = fVar.b();
            Float f7 = aVarE.f2439g;
            f5 = (Float) this.f1910e.b(aVarE.f2438f, f7 == null ? aVarE.f2438f : f7.floatValue(), (Float) aVarE.f2433a, (Float) aVarE.f2434b, f3, f3, fB2);
        }
        PointF pointF = this.f1912g;
        if (f4 == null) {
            pointF.set(this.f1911f.x, 0.0f);
        } else {
            pointF.set(f4.floatValue(), 0.0f);
        }
        PointF pointF2 = this.f1912g;
        if (f5 == null) {
            pointF2.set(pointF2.x, this.f1911f.y);
        } else {
            pointF2.set(pointF2.x, f5.floatValue());
        }
        return this.f1912g;
    }
}
