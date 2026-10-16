package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.w;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class e implements f, n, com.airbnb.lottie.a.b.a, com.airbnb.lottie.d.f {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f1760a;

    /* renamed from: b, reason: collision with root package name */
    private final Path f1761b;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f1762c;

    /* renamed from: d, reason: collision with root package name */
    private final String f1763d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1764e;

    /* renamed from: f, reason: collision with root package name */
    private final List f1765f;

    /* renamed from: g, reason: collision with root package name */
    private final com.airbnb.lottie.s f1766g;

    /* renamed from: h, reason: collision with root package name */
    private List f1767h;

    /* renamed from: i, reason: collision with root package name */
    private w f1768i;

    e(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, String str, boolean z, List list, com.airbnb.lottie.d.a.l lVar) {
        new com.airbnb.lottie.a.a();
        new RectF();
        this.f1760a = new Matrix();
        this.f1761b = new Path();
        this.f1762c = new RectF();
        this.f1763d = str;
        this.f1766g = sVar;
        this.f1764e = z;
        this.f1765f = list;
        if (lVar != null) {
            w wVar = new w(lVar);
            this.f1768i = wVar;
            wVar.f(bVar);
            this.f1768i.g(this);
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            d dVar = (d) list.get(size);
            if (dVar instanceof k) {
                arrayList.add((k) dVar);
            }
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                ((k) arrayList.get(size2)).h(list.listIterator(list.size()));
            }
        }
    }

    @Override // com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        w wVar = this.f1768i;
        if (wVar != null) {
            wVar.i(obj, cVar);
        }
    }

    @Override // com.airbnb.lottie.a.a.f
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        if (this.f1764e) {
            return;
        }
        Matrix matrix2 = this.f1760a;
        matrix2.set(matrix);
        w wVar = this.f1768i;
        if (wVar != null) {
            matrix2.preConcat(wVar.a());
            i2 = (int) (((((this.f1768i.d() == null ? 100 : ((Integer) this.f1768i.d().f()).intValue()) / 100.0f) * i2) / 255.0f) * 255.0f);
        }
        List list = this.f1765f;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Object obj = list.get(size);
            if (obj instanceof f) {
                ((f) obj).b(canvas, matrix2, i2);
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.f
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.f1760a;
        matrix2.set(matrix);
        w wVar = this.f1768i;
        if (wVar != null) {
            matrix2.preConcat(wVar.a());
        }
        RectF rectF2 = this.f1762c;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.f1765f;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = (d) list.get(size);
            if (dVar instanceof f) {
                ((f) dVar).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        this.f1766g.invalidateSelf();
    }

    @Override // com.airbnb.lottie.d.f
    public final void e(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        String str = this.f1763d;
        if (!eVar.f(str, i2) && !"__container".equals(str)) {
            return;
        }
        if (!"__container".equals(str)) {
            eVar2 = eVar2.b(str);
            if (eVar.e(str, i2)) {
                list.add(eVar2.c(this));
            }
        }
        if (!eVar.g(str, i2)) {
            return;
        }
        int iA = i2 + eVar.a(str, i2);
        int i3 = 0;
        while (true) {
            List list2 = this.f1765f;
            if (i3 >= list2.size()) {
                return;
            }
            d dVar = (d) list2.get(i3);
            if (dVar instanceof com.airbnb.lottie.d.f) {
                ((com.airbnb.lottie.d.f) dVar).e(eVar, iA, list, eVar2);
            }
            i3++;
        }
    }

    @Override // com.airbnb.lottie.a.a.d
    public final void f(List list, List list2) {
        List list3 = this.f1765f;
        ArrayList arrayList = new ArrayList(list.size() + list3.size());
        arrayList.addAll(list);
        int size = list3.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = (d) list3.get(size);
            dVar.f(arrayList, list3.subList(0, size));
            arrayList.add(dVar);
        }
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        throw null;
    }

    final Matrix h() {
        w wVar = this.f1768i;
        if (wVar != null) {
            return wVar.a();
        }
        Matrix matrix = this.f1760a;
        matrix.reset();
        return matrix;
    }

    @Override // com.airbnb.lottie.a.a.n
    public final Path i() {
        Matrix matrix = this.f1760a;
        matrix.reset();
        w wVar = this.f1768i;
        if (wVar != null) {
            matrix.set(wVar.a());
        }
        Path path = this.f1761b;
        path.reset();
        if (!this.f1764e) {
            List list = this.f1765f;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                d dVar = (d) list.get(size);
                if (dVar instanceof n) {
                    path.addPath(((n) dVar).i(), matrix);
                }
            }
        }
        return path;
    }

    public final List j() {
        return this.f1765f;
    }

    final List k() {
        if (this.f1767h == null) {
            this.f1767h = new ArrayList();
            int i2 = 0;
            while (true) {
                List list = this.f1765f;
                if (i2 >= list.size()) {
                    break;
                }
                d dVar = (d) list.get(i2);
                if (dVar instanceof n) {
                    this.f1767h.add((n) dVar);
                }
                i2++;
            }
        }
        return this.f1767h;
    }

    public e(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.o oVar, com.airbnb.lottie.h hVar) {
        com.airbnb.lottie.d.a.l lVar;
        String strB = oVar.b();
        boolean zD = oVar.d();
        List listC = oVar.c();
        ArrayList arrayList = new ArrayList(listC.size());
        int i2 = 0;
        for (int i3 = 0; i3 < listC.size(); i3++) {
            d dVarA = ((com.airbnb.lottie.d.b.c) listC.get(i3)).a(sVar, hVar, bVar);
            if (dVarA != null) {
                arrayList.add(dVarA);
            }
        }
        List listC2 = oVar.c();
        while (true) {
            if (i2 >= listC2.size()) {
                lVar = null;
                break;
            }
            com.airbnb.lottie.d.b.c cVar = (com.airbnb.lottie.d.b.c) listC2.get(i2);
            if (cVar instanceof com.airbnb.lottie.d.a.l) {
                lVar = (com.airbnb.lottie.d.a.l) cVar;
                break;
            }
            i2++;
        }
        this(sVar, bVar, strB, zD, arrayList, lVar);
    }
}
