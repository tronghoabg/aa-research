package com.airbnb.lottie.d.c;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.n;
import com.airbnb.lottie.a.b.w;
import com.airbnb.lottie.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class b implements com.airbnb.lottie.a.a.f, com.airbnb.lottie.a.b.a, com.airbnb.lottie.d.f {

    /* renamed from: a, reason: collision with root package name */
    final Matrix f2221a;

    /* renamed from: b, reason: collision with root package name */
    final s f2222b;

    /* renamed from: c, reason: collision with root package name */
    final e f2223c;

    /* renamed from: d, reason: collision with root package name */
    final w f2224d;

    /* renamed from: e, reason: collision with root package name */
    float f2225e;

    /* renamed from: f, reason: collision with root package name */
    BlurMaskFilter f2226f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f2227g = new Path();

    /* renamed from: h, reason: collision with root package name */
    private final Matrix f2228h = new Matrix();

    /* renamed from: i, reason: collision with root package name */
    private final Matrix f2229i = new Matrix();

    /* renamed from: j, reason: collision with root package name */
    private final Paint f2230j = new com.airbnb.lottie.a.a(1);

    /* renamed from: k, reason: collision with root package name */
    private final Paint f2231k = new com.airbnb.lottie.a.a(PorterDuff.Mode.DST_IN, null);

    /* renamed from: l, reason: collision with root package name */
    private final Paint f2232l = new com.airbnb.lottie.a.a(PorterDuff.Mode.DST_OUT, null);
    private final Paint m;
    private final Paint n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private final RectF r;
    private final RectF s;
    private n t;
    private com.airbnb.lottie.a.b.j u;
    private b v;
    private b w;
    private List x;
    private final List y;
    private boolean z;

    b(s sVar, e eVar) {
        com.airbnb.lottie.a.a aVar = new com.airbnb.lottie.a.a(1);
        this.m = aVar;
        this.n = new com.airbnb.lottie.a.a(PorterDuff.Mode.CLEAR);
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.f2221a = new Matrix();
        this.y = new ArrayList();
        this.z = true;
        this.f2225e = 0.0f;
        this.f2222b = sVar;
        this.f2223c = eVar;
        eVar.q();
        if (eVar.z() == 3) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        w wVar = new w(eVar.n());
        this.f2224d = wVar;
        wVar.g(this);
        if (eVar.u() != null && !eVar.u().isEmpty()) {
            n nVar = new n(eVar.u());
            this.t = nVar;
            Iterator it = nVar.a().iterator();
            while (it.hasNext()) {
                ((com.airbnb.lottie.a.b.f) it.next()).i(this);
            }
            for (com.airbnb.lottie.a.b.f fVar : this.t.c()) {
                l(fVar);
                fVar.i(this);
            }
        }
        if (this.f2223c.t().isEmpty()) {
            y(true);
            return;
        }
        com.airbnb.lottie.a.b.j jVar = new com.airbnb.lottie.a.b.j(this.f2223c.t());
        this.u = jVar;
        jVar.k();
        this.u.i(new com.airbnb.lottie.a.b.a() { // from class: com.airbnb.lottie.d.c.a
            @Override // com.airbnb.lottie.a.b.a
            public final void d() {
                b bVar = this.f2220a;
                bVar.y(bVar.u.o() == 1.0f);
            }
        });
        y(((Float) this.u.f()).floatValue() == 1.0f);
        l(this.u);
    }

    private final void v() {
        if (this.x != null) {
            return;
        }
        if (this.w == null) {
            this.x = Collections.EMPTY_LIST;
            return;
        }
        this.x = new ArrayList();
        for (b bVar = this.w; bVar != null; bVar = bVar.w) {
            this.x.add(bVar);
        }
    }

    private final void w(Canvas canvas) {
        RectF rectF = this.o;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.n);
    }

    private final void x() {
        this.f2222b.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(boolean z) {
        if (z != this.z) {
            this.z = z;
            x();
        }
    }

    private final void z() {
        this.f2223c.q();
    }

    @Override // com.airbnb.lottie.d.f
    public void a(Object obj, com.airbnb.lottie.h.c cVar) {
        this.f2224d.i(obj, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0115  */
    @Override // com.airbnb.lottie.a.a.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.d.c.b.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // com.airbnb.lottie.a.a.f
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        v();
        Matrix matrix2 = this.f2221a;
        matrix2.set(matrix);
        if (z) {
            List list = this.x;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        matrix2.preConcat(((b) this.x.get(size)).f2224d.a());
                    }
                }
            } else {
                b bVar = this.w;
                if (bVar != null) {
                    matrix2.preConcat(bVar.f2224d.a());
                }
            }
        }
        matrix2.preConcat(this.f2224d.a());
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        x();
    }

    @Override // com.airbnb.lottie.d.f
    public final void e(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        b bVar = this.v;
        if (bVar != null) {
            com.airbnb.lottie.d.e eVarB = eVar2.b(bVar.g());
            if (eVar.e(this.v.g(), i2)) {
                list.add(eVarB.c(this.v));
            }
            if (eVar.g(g(), i2)) {
                this.v.o(eVar, eVar.a(this.v.g(), i2) + i2, list, eVarB);
            }
        }
        if (eVar.f(g(), i2)) {
            if (!"__container".equals(g())) {
                eVar2 = eVar2.b(g());
                if (eVar.e(g(), i2)) {
                    list.add(eVar2.c(this));
                }
            }
            if (eVar.g(g(), i2)) {
                o(eVar, i2 + eVar.a(g(), i2), list, eVar2);
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        return this.f2223c.q();
    }

    public final BlurMaskFilter h(float f2) {
        if (this.f2225e == f2) {
            return this.f2226f;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f2226f = blurMaskFilter;
        this.f2225e = f2;
        return blurMaskFilter;
    }

    public com.airbnb.lottie.d.b.a i() {
        return this.f2223c.o();
    }

    public com.airbnb.lottie.f.i j() {
        return this.f2223c.p();
    }

    public final void l(com.airbnb.lottie.a.b.f fVar) {
        if (fVar == null) {
            return;
        }
        this.y.add(fVar);
    }

    abstract void m(Canvas canvas, Matrix matrix, int i2);

    public final void n(com.airbnb.lottie.a.b.f fVar) {
        this.y.remove(fVar);
    }

    final void p(b bVar) {
        this.v = bVar;
    }

    final void q(b bVar) {
        this.w = bVar;
    }

    void r(float f2) {
        this.f2224d.h(f2);
        int i2 = 0;
        if (this.t != null) {
            for (int i3 = 0; i3 < this.t.a().size(); i3++) {
                ((com.airbnb.lottie.a.b.f) this.t.a().get(i3)).l(f2);
            }
        }
        com.airbnb.lottie.a.b.j jVar = this.u;
        if (jVar != null) {
            jVar.l(f2);
        }
        b bVar = this.v;
        if (bVar != null) {
            bVar.r(f2);
        }
        while (true) {
            List list = this.y;
            if (i2 >= list.size()) {
                return;
            }
            ((com.airbnb.lottie.a.b.f) list.get(i2)).l(f2);
            i2++;
        }
    }

    final boolean s() {
        n nVar = this.t;
        return (nVar == null || nVar.a().isEmpty()) ? false : true;
    }

    final boolean t() {
        return this.v != null;
    }

    public final int u() {
        return this.f2223c.x();
    }

    @Override // com.airbnb.lottie.a.a.d
    public final void f(List list, List list2) {
    }

    void o(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
    }
}
