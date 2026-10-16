package com.airbnb.lottie.d.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.s;
import com.airbnb.lottie.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: g, reason: collision with root package name */
    private com.airbnb.lottie.a.b.f f2233g;

    /* renamed from: h, reason: collision with root package name */
    private final List f2234h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f2235i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f2236j;

    /* renamed from: k, reason: collision with root package name */
    private float f2237k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2238l;

    public c(s sVar, e eVar, List list, com.airbnb.lottie.h hVar) {
        b bVar;
        b cVar;
        String str;
        super(sVar, eVar);
        this.f2234h = new ArrayList();
        this.f2235i = new RectF();
        this.f2236j = new RectF();
        new Paint();
        this.f2238l = true;
        com.airbnb.lottie.d.a.b bVarK = eVar.k();
        if (bVarK != null) {
            com.airbnb.lottie.a.b.f fVarA = bVarK.a();
            this.f2233g = fVarA;
            l(fVarA);
            this.f2233g.i(this);
        } else {
            this.f2233g = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(hVar.l().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    b bVar3 = (b) longSparseArray.get(longSparseArray.keyAt(i2));
                    if (bVar3 != null && (bVar = (b) longSparseArray.get(bVar3.f2223c.i())) != null) {
                        bVar3.q(bVar);
                    }
                }
                return;
            }
            e eVar2 = (e) list.get(size);
            int iY = eVar2.y();
            int i3 = iY - 1;
            if (iY == 0) {
                throw null;
            }
            if (i3 == 0) {
                cVar = new c(sVar, eVar2, hVar.m(eVar2.r()), hVar);
            } else if (i3 == 1) {
                cVar = new h(sVar, eVar2);
            } else if (i3 == 2) {
                cVar = new d(sVar, eVar2);
            } else if (i3 == 3) {
                cVar = new f(sVar, eVar2);
            } else if (i3 == 4) {
                cVar = new g(sVar, eVar2, this, hVar);
            } else if (i3 != 5) {
                switch (eVar2.y()) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                com.airbnb.lottie.g.c.a("Unknown layer type ".concat(str));
                cVar = null;
            } else {
                cVar = new k(sVar, eVar2);
            }
            if (cVar != null) {
                longSparseArray.put(cVar.f2223c.h(), cVar);
                if (bVar2 != null) {
                    bVar2.p(cVar);
                    bVar2 = null;
                } else {
                    this.f2234h.add(0, cVar);
                    int iZ = eVar2.z();
                    int i4 = iZ - 1;
                    if (iZ == 0) {
                        throw null;
                    }
                    if (i4 == 1 || i4 == 2) {
                        bVar2 = cVar;
                    }
                }
            }
            size--;
        }
    }

    @Override // com.airbnb.lottie.d.c.b, com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        super.a(obj, cVar);
        if (obj == x.E) {
            if (cVar == null) {
                com.airbnb.lottie.a.b.f fVar = this.f2233g;
                if (fVar != null) {
                    fVar.m(null);
                    return;
                }
                return;
            }
            com.airbnb.lottie.a.b.x xVar = new com.airbnb.lottie.a.b.x(cVar);
            this.f2233g = xVar;
            xVar.i(this);
            l(this.f2233g);
        }
    }

    @Override // com.airbnb.lottie.d.c.b, com.airbnb.lottie.a.a.f
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        List list = this.f2234h;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            RectF rectF2 = this.f2235i;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((b) list.get(size)).c(rectF2, this.f2221a, true);
            rectF.union(rectF2);
        }
    }

    @Override // com.airbnb.lottie.d.c.b
    final void m(Canvas canvas, Matrix matrix, int i2) throws Throwable {
        RectF rectF = this.f2236j;
        e eVar = this.f2223c;
        rectF.set(0.0f, 0.0f, eVar.b(), eVar.a());
        matrix.mapRect(rectF);
        canvas.save();
        List list = this.f2234h;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                canvas.restore();
                return;
            } else if ((!this.f2238l && "__container".equals(eVar.q())) || rectF.isEmpty() || canvas.clipRect(rectF)) {
                ((b) list.get(size)).b(canvas, matrix, i2);
            }
        }
    }

    @Override // com.airbnb.lottie.d.c.b
    protected final void o(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        int i3 = 0;
        while (true) {
            List list2 = this.f2234h;
            if (i3 >= list2.size()) {
                return;
            }
            ((b) list2.get(i3)).e(eVar, i2, list, eVar2);
            i3++;
        }
    }

    @Override // com.airbnb.lottie.d.c.b
    public final void r(float f2) {
        this.f2237k = f2;
        super.r(f2);
        if (this.f2233g != null) {
            float fB = this.f2222b.i().b() + 0.01f;
            e eVar = this.f2223c;
            f2 = ((((Float) this.f2233g.f()).floatValue() * eVar.j().e()) - eVar.j().f()) / fB;
        }
        if (this.f2233g == null) {
            f2 -= this.f2223c.c();
        }
        e eVar2 = this.f2223c;
        if (eVar2.d() != 0.0f && !"__container".equals(eVar2.q())) {
            f2 /= eVar2.d();
        }
        List list = this.f2234h;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((b) list.get(size)).r(f2);
            }
        }
    }

    public final float v() {
        return this.f2237k;
    }

    public final void w(boolean z) {
        this.f2238l = z;
    }
}
