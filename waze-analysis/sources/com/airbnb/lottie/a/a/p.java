package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class p implements com.airbnb.lottie.a.b.a, l, n {

    /* renamed from: c, reason: collision with root package name */
    private final String f1829c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f1830d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.s f1831e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1832f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1833g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1834h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1837k;

    /* renamed from: a, reason: collision with root package name */
    private final Path f1827a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final RectF f1828b = new RectF();

    /* renamed from: i, reason: collision with root package name */
    private final c f1835i = new c();

    /* renamed from: j, reason: collision with root package name */
    private com.airbnb.lottie.a.b.f f1836j = null;

    public p(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.j jVar) {
        this.f1829c = jVar.e();
        this.f1830d = jVar.f();
        this.f1831e = sVar;
        com.airbnb.lottie.a.b.f fVarA = jVar.c().a();
        this.f1832f = fVarA;
        com.airbnb.lottie.a.b.f fVarA2 = jVar.d().a();
        this.f1833g = fVarA2;
        com.airbnb.lottie.a.b.f fVarA3 = jVar.b().a();
        this.f1834h = fVarA3;
        bVar.l(fVarA);
        bVar.l(fVarA2);
        bVar.l(fVarA3);
        fVarA.i(this);
        fVarA2.i(this);
        fVarA3.i(this);
    }

    @Override // com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        if (obj == x.f2513l) {
            this.f1833g.m(cVar);
        } else if (obj == x.n) {
            this.f1832f.m(cVar);
        } else if (obj == x.m) {
            this.f1834h.m(cVar);
        }
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        this.f1837k = false;
        this.f1831e.invalidateSelf();
    }

    @Override // com.airbnb.lottie.d.f
    public final void e(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        com.airbnb.lottie.g.f.d(eVar, i2, list, eVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    @Override // com.airbnb.lottie.a.a.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L33
            java.lang.Object r0 = r5.get(r6)
            com.airbnb.lottie.a.a.d r0 = (com.airbnb.lottie.a.a.d) r0
            boolean r1 = r0 instanceof com.airbnb.lottie.a.a.u
            if (r1 == 0) goto L24
            r1 = r0
            com.airbnb.lottie.a.a.u r1 = (com.airbnb.lottie.a.a.u) r1
            int r2 = r1.i()
            r3 = 1
            if (r2 != r3) goto L24
            com.airbnb.lottie.a.a.c r0 = r4.f1835i
            r0.a(r1)
            r1.e(r4)
            goto L30
        L24:
            boolean r1 = r0 instanceof com.airbnb.lottie.a.a.r
            if (r1 == 0) goto L30
            com.airbnb.lottie.a.a.r r0 = (com.airbnb.lottie.a.a.r) r0
            com.airbnb.lottie.a.b.f r0 = r0.a()
            r4.f1836j = r0
        L30:
            int r6 = r6 + 1
            goto L1
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.p.f(java.util.List, java.util.List):void");
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        return this.f1829c;
    }

    @Override // com.airbnb.lottie.a.a.n
    public final Path i() {
        com.airbnb.lottie.a.b.f fVar;
        boolean z = this.f1837k;
        Path path = this.f1827a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.f1830d) {
            this.f1837k = true;
            return path;
        }
        PointF pointF = (PointF) this.f1833g.f();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        float fO = ((com.airbnb.lottie.a.b.j) this.f1834h).o();
        if (fO == 0.0f && (fVar = this.f1836j) != null) {
            fO = Math.min(((Float) fVar.f()).floatValue(), Math.min(f2, f3));
        }
        float fMin = Math.min(f2, f3);
        if (fO > fMin) {
            fO = fMin;
        }
        PointF pointF2 = (PointF) this.f1832f.f();
        path.moveTo(pointF2.x + f2, (pointF2.y - f3) + fO);
        path.lineTo(pointF2.x + f2, (pointF2.y + f3) - fO);
        if (fO > 0.0f) {
            float f4 = fO + fO;
            RectF rectF = this.f1828b;
            rectF.set((pointF2.x + f2) - f4, (pointF2.y + f3) - f4, pointF2.x + f2, pointF2.y + f3);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x - f2) + fO, pointF2.y + f3);
        if (fO > 0.0f) {
            float f5 = fO + fO;
            RectF rectF2 = this.f1828b;
            rectF2.set(pointF2.x - f2, (pointF2.y + f3) - f5, (pointF2.x - f2) + f5, pointF2.y + f3);
            path.arcTo(rectF2, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f2, (pointF2.y - f3) + fO);
        if (fO > 0.0f) {
            float f6 = fO + fO;
            RectF rectF3 = this.f1828b;
            rectF3.set(pointF2.x - f2, pointF2.y - f3, (pointF2.x - f2) + f6, (pointF2.y - f3) + f6);
            path.arcTo(rectF3, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f2) - fO, pointF2.y - f3);
        if (fO > 0.0f) {
            float f7 = fO + fO;
            RectF rectF4 = this.f1828b;
            rectF4.set((pointF2.x + f2) - f7, pointF2.y - f3, pointF2.x + f2, (pointF2.y - f3) + f7);
            path.arcTo(rectF4, 270.0f, 90.0f, false);
        }
        path.close();
        this.f1835i.b(path);
        this.f1837k = true;
        return path;
    }
}
