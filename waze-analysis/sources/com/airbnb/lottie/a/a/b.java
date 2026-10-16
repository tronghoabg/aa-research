package com.airbnb.lottie.a.a;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class b implements com.airbnb.lottie.a.b.a, l, f {

    /* renamed from: a, reason: collision with root package name */
    protected final com.airbnb.lottie.d.c.b f1747a;

    /* renamed from: b, reason: collision with root package name */
    final Paint f1748b;

    /* renamed from: c, reason: collision with root package name */
    float f1749c;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.s f1754h;

    /* renamed from: j, reason: collision with root package name */
    private final float[] f1756j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1757k;

    /* renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1758l;
    private final List m;
    private final com.airbnb.lottie.a.b.f n;
    private com.airbnb.lottie.a.b.f o;
    private com.airbnb.lottie.a.b.f p;
    private com.airbnb.lottie.a.b.i q;

    /* renamed from: d, reason: collision with root package name */
    private final PathMeasure f1750d = new PathMeasure();

    /* renamed from: e, reason: collision with root package name */
    private final Path f1751e = new Path();

    /* renamed from: f, reason: collision with root package name */
    private final Path f1752f = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final RectF f1753g = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final List f1755i = new ArrayList();

    b(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, Paint.Cap cap, Paint.Join join, float f2, com.airbnb.lottie.d.a.d dVar, com.airbnb.lottie.d.a.b bVar2, List list, com.airbnb.lottie.d.a.b bVar3) {
        com.airbnb.lottie.a.a aVar = new com.airbnb.lottie.a.a(1);
        this.f1748b = aVar;
        this.f1749c = 0.0f;
        this.f1754h = sVar;
        this.f1747a = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f2);
        this.f1758l = dVar.a();
        this.f1757k = bVar2.a();
        if (bVar3 == null) {
            this.n = null;
        } else {
            this.n = bVar3.a();
        }
        this.m = new ArrayList(list.size());
        this.f1756j = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.m.add(((com.airbnb.lottie.d.a.b) list.get(i2)).a());
        }
        bVar.l(this.f1758l);
        bVar.l(this.f1757k);
        for (int i3 = 0; i3 < this.m.size(); i3++) {
            bVar.l((com.airbnb.lottie.a.b.f) this.m.get(i3));
        }
        com.airbnb.lottie.a.b.f fVar = this.n;
        if (fVar != null) {
            bVar.l(fVar);
        }
        this.f1758l.i(this);
        this.f1757k.i(this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((com.airbnb.lottie.a.b.f) this.m.get(i4)).i(this);
        }
        com.airbnb.lottie.a.b.f fVar2 = this.n;
        if (fVar2 != null) {
            fVar2.i(this);
        }
        if (bVar.i() != null) {
            com.airbnb.lottie.a.b.f fVarA = bVar.i().a().a();
            this.p = fVarA;
            fVarA.i(this);
            bVar.l(this.p);
        }
        if (bVar.j() != null) {
            this.q = new com.airbnb.lottie.a.b.i(this, bVar, bVar.j());
        }
    }

    @Override // com.airbnb.lottie.d.f
    public void a(Object obj, com.airbnb.lottie.h.c cVar) {
        com.airbnb.lottie.a.b.i iVar;
        com.airbnb.lottie.a.b.i iVar2;
        com.airbnb.lottie.a.b.i iVar3;
        com.airbnb.lottie.a.b.i iVar4;
        com.airbnb.lottie.a.b.i iVar5;
        if (obj == x.f2505d) {
            this.f1758l.m(cVar);
            return;
        }
        if (obj == x.s) {
            this.f1757k.m(cVar);
            return;
        }
        if (obj == x.K) {
            com.airbnb.lottie.a.b.f fVar = this.o;
            if (fVar != null) {
                this.f1747a.n(fVar);
            }
            if (cVar == null) {
                this.o = null;
                return;
            }
            com.airbnb.lottie.a.b.x xVar = new com.airbnb.lottie.a.b.x(cVar);
            this.o = xVar;
            xVar.i(this);
            this.f1747a.l(this.o);
            return;
        }
        if (obj == x.f2511j) {
            com.airbnb.lottie.a.b.f fVar2 = this.p;
            if (fVar2 != null) {
                fVar2.m(cVar);
                return;
            }
            com.airbnb.lottie.a.b.x xVar2 = new com.airbnb.lottie.a.b.x(cVar);
            this.p = xVar2;
            xVar2.i(this);
            this.f1747a.l(this.p);
            return;
        }
        if (obj == x.f2506e && (iVar5 = this.q) != null) {
            iVar5.b(cVar);
            return;
        }
        if (obj == x.G && (iVar4 = this.q) != null) {
            iVar4.f(cVar);
            return;
        }
        if (obj == x.H && (iVar3 = this.q) != null) {
            iVar3.c(cVar);
            return;
        }
        if (obj == x.I && (iVar2 = this.q) != null) {
            iVar2.e(cVar);
        } else {
            if (obj != x.J || (iVar = this.q) == null) {
                return;
            }
            iVar.g(cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01ed  */
    @Override // com.airbnb.lottie.a.a.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.b.b(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    @Override // com.airbnb.lottie.a.a.f
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f1751e;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.f1755i;
            if (i2 >= list.size()) {
                RectF rectF2 = this.f1753g;
                path.computeBounds(rectF2, false);
                float fO = ((com.airbnb.lottie.a.b.j) this.f1757k).o() / 2.0f;
                rectF2.set(rectF2.left - fO, rectF2.top - fO, rectF2.right + fO, rectF2.bottom + fO);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            a aVar = (a) list.get(i2);
            for (int i3 = 0; i3 < aVar.f1745a.size(); i3++) {
                path.addPath(((n) aVar.f1745a.get(i3)).i(), matrix);
            }
            i2++;
        }
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        this.f1754h.invalidateSelf();
    }

    @Override // com.airbnb.lottie.d.f
    public final void e(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        com.airbnb.lottie.g.f.d(eVar, i2, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.a.a.d
    public final void f(List list, List list2) {
        a aVar = null;
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            d dVar = (d) list.get(size);
            if (dVar instanceof u) {
                u uVar2 = (u) dVar;
                if (uVar2.i() == 2) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.e(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            d dVar2 = (d) list2.get(size2);
            if (dVar2 instanceof u) {
                u uVar3 = (u) dVar2;
                if (uVar3.i() == 2) {
                    if (aVar != null) {
                        this.f1755i.add(aVar);
                    }
                    a aVar2 = new a(uVar3);
                    uVar3.e(this);
                    aVar = aVar2;
                }
            }
            if (dVar2 instanceof n) {
                if (aVar == null) {
                    aVar = new a(uVar);
                }
                aVar.f1745a.add((n) dVar2);
            }
        }
        if (aVar != null) {
            this.f1755i.add(aVar);
        }
    }
}
