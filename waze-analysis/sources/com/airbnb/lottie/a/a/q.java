package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.w;
import com.airbnb.lottie.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class q implements f, n, k, com.airbnb.lottie.a.b.a, l {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f1838a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Path f1839b = new Path();

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.s f1840c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.d.c.b f1841d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1842e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1843f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1844g;

    /* renamed from: h, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1845h;

    /* renamed from: i, reason: collision with root package name */
    private final w f1846i;

    /* renamed from: j, reason: collision with root package name */
    private e f1847j;

    public q(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.k kVar) {
        this.f1840c = sVar;
        this.f1841d = bVar;
        this.f1842e = kVar.e();
        this.f1843f = kVar.f();
        com.airbnb.lottie.a.b.f fVarA = kVar.b().a();
        this.f1844g = fVarA;
        bVar.l(fVarA);
        fVarA.i(this);
        com.airbnb.lottie.a.b.f fVarA2 = kVar.c().a();
        this.f1845h = fVarA2;
        bVar.l(fVarA2);
        fVarA2.i(this);
        w wVar = new w(kVar.d());
        this.f1846i = wVar;
        wVar.f(bVar);
        wVar.g(this);
    }

    @Override // com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        if (this.f1846i.i(obj, cVar)) {
            return;
        }
        if (obj == x.u) {
            this.f1844g.m(cVar);
        } else if (obj == x.v) {
            this.f1845h.m(cVar);
        }
    }

    @Override // com.airbnb.lottie.a.a.f
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        float fFloatValue = ((Float) this.f1844g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f1845h.f()).floatValue();
        w wVar = this.f1846i;
        float fFloatValue3 = ((Float) wVar.e().f()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) wVar.c().f()).floatValue() / 100.0f;
        int i3 = (int) fFloatValue;
        while (true) {
            i3--;
            if (i3 < 0) {
                return;
            }
            Matrix matrix2 = this.f1838a;
            matrix2.set(matrix);
            float f2 = i3;
            matrix2.preConcat(wVar.b(f2 + fFloatValue2));
            int i4 = com.airbnb.lottie.g.f.f2413a;
            this.f1847j.b(canvas, matrix2, (int) (i2 * (((f2 / fFloatValue) * (fFloatValue4 - fFloatValue3)) + fFloatValue3)));
        }
    }

    @Override // com.airbnb.lottie.a.a.f
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.f1847j.c(rectF, matrix, z);
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        this.f1840c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.d.f
    public final void e(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        com.airbnb.lottie.g.f.d(eVar, i2, list, eVar2, this);
        for (int i3 = 0; i3 < this.f1847j.j().size(); i3++) {
            d dVar = (d) this.f1847j.j().get(i3);
            if (dVar instanceof l) {
                com.airbnb.lottie.g.f.d(eVar, i2, list, eVar2, (l) dVar);
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.d
    public final void f(List list, List list2) {
        this.f1847j.f(list, list2);
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        return this.f1842e;
    }

    @Override // com.airbnb.lottie.a.a.k
    public final void h(ListIterator listIterator) {
        if (this.f1847j == null) {
            while (listIterator.hasPrevious() && listIterator.previous() != this) {
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add((d) listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            this.f1847j = new e(this.f1840c, this.f1841d, "Repeater", this.f1843f, arrayList, null);
        }
    }

    @Override // com.airbnb.lottie.a.a.n
    public final Path i() {
        Path pathI = this.f1847j.i();
        Path path = this.f1839b;
        path.reset();
        float fFloatValue = ((Float) this.f1844g.f()).floatValue();
        float fFloatValue2 = ((Float) this.f1845h.f()).floatValue();
        int i2 = (int) fFloatValue;
        while (true) {
            i2--;
            if (i2 < 0) {
                return path;
            }
            Matrix matrix = this.f1838a;
            matrix.set(this.f1846i.b(i2 + fFloatValue2));
            path.addPath(pathI, matrix);
        }
    }
}
