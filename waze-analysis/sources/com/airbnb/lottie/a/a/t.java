package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.ae;
import com.airbnb.lottie.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class t extends b {

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.d.c.b f1858d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1859e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1860f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1861g;

    /* renamed from: h, reason: collision with root package name */
    private com.airbnb.lottie.a.b.f f1862h;

    public t(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.q qVar) {
        super(sVar, bVar, com.airbnb.lottie.b.o.d(qVar.j()), ae.c(qVar.k()), qVar.b(), qVar.f(), qVar.e(), qVar.h(), qVar.d());
        this.f1858d = bVar;
        this.f1859e = qVar.g();
        this.f1860f = qVar.i();
        com.airbnb.lottie.a.b.f fVarA = qVar.c().a();
        this.f1861g = fVarA;
        fVarA.i(this);
        bVar.l(fVarA);
    }

    @Override // com.airbnb.lottie.a.a.b, com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        super.a(obj, cVar);
        if (obj == x.f2503b) {
            this.f1861g.m(cVar);
            return;
        }
        if (obj == x.K) {
            com.airbnb.lottie.a.b.f fVar = this.f1862h;
            if (fVar != null) {
                this.f1858d.n(fVar);
            }
            if (cVar == null) {
                this.f1862h = null;
                return;
            }
            com.airbnb.lottie.a.b.x xVar = new com.airbnb.lottie.a.b.x(cVar);
            this.f1862h = xVar;
            xVar.i(this);
            this.f1858d.l(this.f1861g);
        }
    }

    @Override // com.airbnb.lottie.a.a.b, com.airbnb.lottie.a.a.f
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        if (this.f1860f) {
            return;
        }
        Paint paint = this.f1748b;
        paint.setColor(((com.airbnb.lottie.a.b.g) this.f1861g).o());
        com.airbnb.lottie.a.b.f fVar = this.f1862h;
        if (fVar != null) {
            paint.setColorFilter((ColorFilter) fVar.f());
        }
        super.b(canvas, matrix, i2);
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        return this.f1859e;
    }
}
