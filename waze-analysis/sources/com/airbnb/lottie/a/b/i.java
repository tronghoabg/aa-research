package com.airbnb.lottie.a.b;

import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    private final a f1884a;

    /* renamed from: b, reason: collision with root package name */
    private final f f1885b;

    /* renamed from: c, reason: collision with root package name */
    private final f f1886c;

    /* renamed from: d, reason: collision with root package name */
    private final f f1887d;

    /* renamed from: e, reason: collision with root package name */
    private final f f1888e;

    /* renamed from: f, reason: collision with root package name */
    private final f f1889f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1890g = true;

    public i(a aVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.f.i iVar) {
        this.f1884a = aVar;
        f fVarA = iVar.a().a();
        this.f1885b = fVarA;
        fVarA.i(this);
        bVar.l(fVarA);
        f fVarA2 = iVar.d().a();
        this.f1886c = fVarA2;
        fVarA2.i(this);
        bVar.l(fVarA2);
        f fVarA3 = iVar.b().a();
        this.f1887d = fVarA3;
        fVarA3.i(this);
        bVar.l(fVarA3);
        f fVarA4 = iVar.c().a();
        this.f1888e = fVarA4;
        fVarA4.i(this);
        bVar.l(fVarA4);
        f fVarA5 = iVar.e().a();
        this.f1889f = fVarA5;
        fVarA5.i(this);
        bVar.l(fVarA5);
    }

    public final void a(Paint paint) {
        if (this.f1890g) {
            this.f1890g = false;
            double dFloatValue = ((Float) this.f1887d.f()).floatValue();
            float fFloatValue = ((Float) this.f1888e.f()).floatValue();
            double d2 = dFloatValue * 0.017453292519943295d;
            float fSin = ((float) Math.sin(d2)) * fFloatValue;
            float fCos = ((float) Math.cos(d2 + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.f1885b.f()).intValue();
            paint.setShadowLayer(((Float) this.f1889f.f()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.f1886c.f()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void b(com.airbnb.lottie.h.c cVar) {
        this.f1885b.f1877c = cVar;
    }

    public final void c(com.airbnb.lottie.h.c cVar) {
        this.f1887d.f1877c = cVar;
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        this.f1890g = true;
        this.f1884a.d();
    }

    public final void e(com.airbnb.lottie.h.c cVar) {
        this.f1888e.f1877c = cVar;
    }

    public final void f(com.airbnb.lottie.h.c cVar) {
        f fVar = this.f1886c;
        if (cVar == null) {
            fVar.f1877c = null;
        } else {
            fVar.f1877c = new h(this, cVar);
        }
    }

    public final void g(com.airbnb.lottie.h.c cVar) {
        this.f1889f.f1877c = cVar;
    }
}
