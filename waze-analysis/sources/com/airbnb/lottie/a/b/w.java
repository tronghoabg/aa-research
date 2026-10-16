package com.airbnb.lottie.a.b;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Matrix f1918a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f1919b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f1920c;

    /* renamed from: d, reason: collision with root package name */
    private final Matrix f1921d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f1922e;

    /* renamed from: f, reason: collision with root package name */
    private f f1923f;

    /* renamed from: g, reason: collision with root package name */
    private f f1924g;

    /* renamed from: h, reason: collision with root package name */
    private f f1925h;

    /* renamed from: i, reason: collision with root package name */
    private f f1926i;

    /* renamed from: j, reason: collision with root package name */
    private f f1927j;

    /* renamed from: k, reason: collision with root package name */
    private j f1928k;

    /* renamed from: l, reason: collision with root package name */
    private j f1929l;
    private f m;
    private f n;
    private final boolean o;

    public w(com.airbnb.lottie.d.a.l lVar) {
        this.f1923f = lVar.h() == null ? null : lVar.h().a();
        this.f1924g = lVar.j() == null ? null : lVar.j().a();
        this.f1925h = lVar.i() == null ? null : lVar.i().a();
        this.f1926i = lVar.c() == null ? null : lVar.c().a();
        this.f1928k = lVar.d() == null ? null : (j) lVar.d().a();
        this.o = lVar.k();
        if (this.f1928k != null) {
            this.f1919b = new Matrix();
            this.f1920c = new Matrix();
            this.f1921d = new Matrix();
            this.f1922e = new float[9];
        } else {
            this.f1919b = null;
            this.f1920c = null;
            this.f1921d = null;
            this.f1922e = null;
        }
        this.f1929l = lVar.e() == null ? null : (j) lVar.e().a();
        if (lVar.g() != null) {
            this.f1927j = lVar.g().a();
        }
        if (lVar.f() != null) {
            this.m = lVar.f().a();
        } else {
            this.m = null;
        }
        if (lVar.b() != null) {
            this.n = lVar.b().a();
        } else {
            this.n = null;
        }
    }

    private final void j() {
        for (int i2 = 0; i2 < 9; i2++) {
            this.f1922e[i2] = 0.0f;
        }
    }

    public final Matrix a() {
        PointF pointF;
        com.airbnb.lottie.h.d dVar;
        PointF pointF2;
        Matrix matrix = this.f1918a;
        matrix.reset();
        f fVar = this.f1924g;
        if (fVar != null && (pointF2 = (PointF) fVar.f()) != null && (pointF2.x != 0.0f || pointF2.y != 0.0f)) {
            matrix.preTranslate(pointF2.x, pointF2.y);
        }
        if (!this.o) {
            f fVar2 = this.f1926i;
            if (fVar2 != null) {
                float fFloatValue = fVar2 instanceof x ? ((Float) fVar2.f()).floatValue() : ((j) fVar2).o();
                if (fFloatValue != 0.0f) {
                    matrix.preRotate(fFloatValue);
                }
            }
        } else if (fVar != null) {
            float f2 = fVar.f1876b;
            PointF pointF3 = (PointF) fVar.f();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            fVar.l(1.0E-4f + f2);
            PointF pointF4 = (PointF) fVar.f();
            fVar.l(f2);
            matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        if (this.f1928k != null) {
            float fCos = this.f1929l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r4.o()) + 90.0f));
            float fSin = this.f1929l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r6.o()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r1.o()));
            j();
            float[] fArr = this.f1922e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f5 = -fSin;
            fArr[3] = f5;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix2 = this.f1919b;
            matrix2.setValues(fArr);
            j();
            fArr[0] = 1.0f;
            fArr[3] = fTan;
            fArr[4] = 1.0f;
            fArr[8] = 1.0f;
            Matrix matrix3 = this.f1920c;
            matrix3.setValues(fArr);
            j();
            fArr[0] = fCos;
            fArr[1] = f5;
            fArr[3] = fSin;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            Matrix matrix4 = this.f1921d;
            matrix4.setValues(fArr);
            matrix3.preConcat(matrix2);
            matrix4.preConcat(matrix3);
            matrix.preConcat(matrix4);
        }
        f fVar3 = this.f1925h;
        if (fVar3 != null && (dVar = (com.airbnb.lottie.h.d) fVar3.f()) != null && (dVar.a() != 1.0f || dVar.b() != 1.0f)) {
            matrix.preScale(dVar.a(), dVar.b());
        }
        f fVar4 = this.f1923f;
        if (fVar4 != null && (pointF = (PointF) fVar4.f()) != null && (pointF.x != 0.0f || pointF.y != 0.0f)) {
            matrix.preTranslate(-pointF.x, -pointF.y);
        }
        return matrix;
    }

    public final Matrix b(float f2) {
        f fVar = this.f1924g;
        PointF pointF = fVar == null ? null : (PointF) fVar.f();
        f fVar2 = this.f1925h;
        com.airbnb.lottie.h.d dVar = fVar2 == null ? null : (com.airbnb.lottie.h.d) fVar2.f();
        Matrix matrix = this.f1918a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f2, pointF.y * f2);
        }
        if (dVar != null) {
            double d2 = f2;
            matrix.preScale((float) Math.pow(dVar.a(), d2), (float) Math.pow(dVar.b(), d2));
        }
        f fVar3 = this.f1926i;
        if (fVar3 != null) {
            float fFloatValue = ((Float) fVar3.f()).floatValue();
            f fVar4 = this.f1923f;
            PointF pointF2 = fVar4 != null ? (PointF) fVar4.f() : null;
            matrix.preRotate(fFloatValue * f2, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return matrix;
    }

    public final f c() {
        return this.n;
    }

    public final f d() {
        return this.f1927j;
    }

    public final f e() {
        return this.m;
    }

    public final void f(com.airbnb.lottie.d.c.b bVar) {
        bVar.l(this.f1927j);
        bVar.l(this.m);
        bVar.l(this.n);
        bVar.l(this.f1923f);
        bVar.l(this.f1924g);
        bVar.l(this.f1925h);
        bVar.l(this.f1926i);
        bVar.l(this.f1928k);
        bVar.l(this.f1929l);
    }

    public final void g(a aVar) {
        f fVar = this.f1927j;
        if (fVar != null) {
            fVar.i(aVar);
        }
        f fVar2 = this.m;
        if (fVar2 != null) {
            fVar2.i(aVar);
        }
        f fVar3 = this.n;
        if (fVar3 != null) {
            fVar3.i(aVar);
        }
        f fVar4 = this.f1923f;
        if (fVar4 != null) {
            fVar4.i(aVar);
        }
        f fVar5 = this.f1924g;
        if (fVar5 != null) {
            fVar5.i(aVar);
        }
        f fVar6 = this.f1925h;
        if (fVar6 != null) {
            fVar6.i(aVar);
        }
        f fVar7 = this.f1926i;
        if (fVar7 != null) {
            fVar7.i(aVar);
        }
        j jVar = this.f1928k;
        if (jVar != null) {
            jVar.i(aVar);
        }
        j jVar2 = this.f1929l;
        if (jVar2 != null) {
            jVar2.i(aVar);
        }
    }

    public final void h(float f2) {
        f fVar = this.f1927j;
        if (fVar != null) {
            fVar.l(f2);
        }
        f fVar2 = this.m;
        if (fVar2 != null) {
            fVar2.l(f2);
        }
        f fVar3 = this.n;
        if (fVar3 != null) {
            fVar3.l(f2);
        }
        f fVar4 = this.f1923f;
        if (fVar4 != null) {
            fVar4.l(f2);
        }
        f fVar5 = this.f1924g;
        if (fVar5 != null) {
            fVar5.l(f2);
        }
        f fVar6 = this.f1925h;
        if (fVar6 != null) {
            fVar6.l(f2);
        }
        f fVar7 = this.f1926i;
        if (fVar7 != null) {
            fVar7.l(f2);
        }
        j jVar = this.f1928k;
        if (jVar != null) {
            jVar.l(f2);
        }
        j jVar2 = this.f1929l;
        if (jVar2 != null) {
            jVar2.l(f2);
        }
    }

    public final boolean i(Object obj, com.airbnb.lottie.h.c cVar) {
        if (obj == com.airbnb.lottie.x.f2507f) {
            f fVar = this.f1923f;
            if (fVar == null) {
                this.f1923f = new x(cVar, new PointF());
                return true;
            }
            fVar.f1877c = cVar;
            return true;
        }
        if (obj == com.airbnb.lottie.x.f2508g) {
            f fVar2 = this.f1924g;
            if (fVar2 == null) {
                this.f1924g = new x(cVar, new PointF());
                return true;
            }
            fVar2.f1877c = cVar;
            return true;
        }
        if (obj == com.airbnb.lottie.x.f2509h) {
            f fVar3 = this.f1924g;
            if (fVar3 instanceof t) {
                t tVar = (t) fVar3;
                com.airbnb.lottie.h.c cVar2 = tVar.f1909d;
                tVar.f1909d = cVar;
                return true;
            }
        }
        if (obj == com.airbnb.lottie.x.f2510i) {
            f fVar4 = this.f1924g;
            if (fVar4 instanceof t) {
                t tVar2 = (t) fVar4;
                com.airbnb.lottie.h.c cVar3 = tVar2.f1910e;
                tVar2.f1910e = cVar;
                return true;
            }
        }
        if (obj == com.airbnb.lottie.x.o) {
            f fVar5 = this.f1925h;
            if (fVar5 == null) {
                this.f1925h = new x(cVar, new com.airbnb.lottie.h.d());
                return true;
            }
            fVar5.f1877c = cVar;
            return true;
        }
        if (obj == com.airbnb.lottie.x.p) {
            f fVar6 = this.f1926i;
            if (fVar6 == null) {
                this.f1926i = new x(cVar, Float.valueOf(0.0f));
                return true;
            }
            fVar6.f1877c = cVar;
            return true;
        }
        if (obj == com.airbnb.lottie.x.f2504c) {
            f fVar7 = this.f1927j;
            if (fVar7 == null) {
                this.f1927j = new x(cVar, 100);
                return true;
            }
            fVar7.f1877c = cVar;
            return true;
        }
        if (obj == com.airbnb.lottie.x.C) {
            f fVar8 = this.m;
            if (fVar8 == null) {
                this.m = new x(cVar, Float.valueOf(100.0f));
                return true;
            }
            fVar8.f1877c = cVar;
            return true;
        }
        if (obj == com.airbnb.lottie.x.D) {
            f fVar9 = this.n;
            if (fVar9 == null) {
                this.n = new x(cVar, Float.valueOf(100.0f));
                return true;
            }
            fVar9.f1877c = cVar;
            return true;
        }
        if (obj == com.airbnb.lottie.x.q) {
            j jVar = this.f1928k;
            if (jVar == null) {
                jVar = new j(Collections.singletonList(new com.airbnb.lottie.h.a(Float.valueOf(0.0f))));
                this.f1928k = jVar;
            }
            jVar.f1877c = cVar;
            return true;
        }
        if (obj != com.airbnb.lottie.x.r) {
            return false;
        }
        j jVar2 = this.f1929l;
        if (jVar2 == null) {
            jVar2 = new j(Collections.singletonList(new com.airbnb.lottie.h.a(Float.valueOf(0.0f))));
            this.f1929l = jVar2;
        }
        jVar2.f1877c = cVar;
        return true;
    }
}
