package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.graphics.BlendModeCompat;
import androidx.core.graphics.PaintCompat;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class h implements f, com.airbnb.lottie.a.b.a, l {

    /* renamed from: a, reason: collision with root package name */
    float f1777a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f1778b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f1779c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.d.c.b f1780d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1781e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1782f;

    /* renamed from: g, reason: collision with root package name */
    private final List f1783g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1784h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1785i;

    /* renamed from: j, reason: collision with root package name */
    private com.airbnb.lottie.a.b.f f1786j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.s f1787k;

    /* renamed from: l, reason: collision with root package name */
    private com.airbnb.lottie.a.b.f f1788l;
    private com.airbnb.lottie.a.b.i m;

    public h(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.n nVar) {
        Path path = new Path();
        this.f1778b = path;
        com.airbnb.lottie.a.a aVar = new com.airbnb.lottie.a.a(1);
        this.f1779c = aVar;
        this.f1783g = new ArrayList();
        this.f1780d = bVar;
        this.f1781e = nVar.e();
        this.f1782f = nVar.f();
        this.f1787k = sVar;
        if (bVar.i() != null) {
            com.airbnb.lottie.a.b.f fVarA = bVar.i().a().a();
            this.f1788l = fVarA;
            fVarA.i(this);
            bVar.l(this.f1788l);
        }
        if (bVar.j() != null) {
            this.m = new com.airbnb.lottie.a.b.i(this, bVar, bVar.j());
        }
        BlendModeCompat blendModeCompat = null;
        if (nVar.c() == null) {
            this.f1784h = null;
            this.f1785i = null;
            return;
        }
        int iU = bVar.u() - 1;
        if (iU != 0) {
            if (iU == 16) {
                blendModeCompat = BlendModeCompat.PLUS;
            } else if (iU == 2) {
                blendModeCompat = BlendModeCompat.SCREEN;
            } else if (iU == 3) {
                blendModeCompat = BlendModeCompat.OVERLAY;
            } else if (iU == 4) {
                blendModeCompat = BlendModeCompat.DARKEN;
            } else if (iU == 5) {
                blendModeCompat = BlendModeCompat.LIGHTEN;
            }
        }
        PaintCompat.setBlendMode(aVar, blendModeCompat);
        path.setFillType(nVar.b());
        com.airbnb.lottie.a.b.f fVarA2 = nVar.c().a();
        this.f1784h = fVarA2;
        fVarA2.i(this);
        bVar.l(fVarA2);
        com.airbnb.lottie.a.b.f fVarA3 = nVar.d().a();
        this.f1785i = fVarA3;
        fVarA3.i(this);
        bVar.l(fVarA3);
    }

    @Override // com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        com.airbnb.lottie.a.b.i iVar;
        com.airbnb.lottie.a.b.i iVar2;
        com.airbnb.lottie.a.b.i iVar3;
        com.airbnb.lottie.a.b.i iVar4;
        com.airbnb.lottie.a.b.i iVar5;
        if (obj == x.f2502a) {
            this.f1784h.m(cVar);
            return;
        }
        if (obj == x.f2505d) {
            this.f1785i.m(cVar);
            return;
        }
        if (obj == x.K) {
            com.airbnb.lottie.a.b.f fVar = this.f1786j;
            if (fVar != null) {
                this.f1780d.n(fVar);
            }
            if (cVar == null) {
                this.f1786j = null;
                return;
            }
            com.airbnb.lottie.a.b.x xVar = new com.airbnb.lottie.a.b.x(cVar);
            this.f1786j = xVar;
            xVar.i(this);
            this.f1780d.l(this.f1786j);
            return;
        }
        if (obj == x.f2511j) {
            com.airbnb.lottie.a.b.f fVar2 = this.f1788l;
            if (fVar2 != null) {
                fVar2.m(cVar);
                return;
            }
            com.airbnb.lottie.a.b.x xVar2 = new com.airbnb.lottie.a.b.x(cVar);
            this.f1788l = xVar2;
            xVar2.i(this);
            this.f1780d.l(this.f1788l);
            return;
        }
        if (obj == x.f2506e && (iVar5 = this.m) != null) {
            iVar5.b(cVar);
            return;
        }
        if (obj == x.G && (iVar4 = this.m) != null) {
            iVar4.f(cVar);
            return;
        }
        if (obj == x.H && (iVar3 = this.m) != null) {
            iVar3.c(cVar);
            return;
        }
        if (obj == x.I && (iVar2 = this.m) != null) {
            iVar2.e(cVar);
        } else {
            if (obj != x.J || (iVar = this.m) == null) {
                return;
            }
            iVar.g(cVar);
        }
    }

    @Override // com.airbnb.lottie.a.a.f
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        if (this.f1782f) {
            return;
        }
        int iO = ((com.airbnb.lottie.a.b.g) this.f1784h).o();
        float fIntValue = ((Integer) this.f1785i.f()).intValue();
        Paint paint = this.f1779c;
        int i3 = com.airbnb.lottie.g.f.f2413a;
        int iMin = Math.min(255, (int) ((((i2 / 255.0f) * fIntValue) / 100.0f) * 255.0f));
        int i4 = 0;
        paint.setColor((Math.max(0, iMin) << 24) | (iO & ViewCompat.MEASURED_SIZE_MASK));
        com.airbnb.lottie.a.b.f fVar = this.f1786j;
        if (fVar != null) {
            paint.setColorFilter((ColorFilter) fVar.f());
        }
        com.airbnb.lottie.a.b.f fVar2 = this.f1788l;
        if (fVar2 != null) {
            float fFloatValue = ((Float) fVar2.f()).floatValue();
            if (fFloatValue == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue != this.f1777a) {
                paint.setMaskFilter(this.f1780d.h(fFloatValue));
            }
            this.f1777a = fFloatValue;
        }
        com.airbnb.lottie.a.b.i iVar = this.m;
        if (iVar != null) {
            iVar.a(paint);
        }
        Path path = this.f1778b;
        path.reset();
        while (true) {
            List list = this.f1783g;
            if (i4 >= list.size()) {
                canvas.drawPath(path, paint);
                return;
            } else {
                path.addPath(((n) list.get(i4)).i(), matrix);
                i4++;
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.f
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f1778b;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.f1783g;
            if (i2 >= list.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((n) list.get(i2)).i(), matrix);
                i2++;
            }
        }
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        this.f1787k.invalidateSelf();
    }

    @Override // com.airbnb.lottie.d.f
    public final void e(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        com.airbnb.lottie.g.f.d(eVar, i2, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.a.a.d
    public final void f(List list, List list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            d dVar = (d) list2.get(i2);
            if (dVar instanceof n) {
                this.f1783g.add((n) dVar);
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        return this.f1781e;
    }
}
