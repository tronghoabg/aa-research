package com.airbnb.lottie.a.a;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.a.b.x;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i implements f, com.airbnb.lottie.a.b.a, l {

    /* renamed from: a, reason: collision with root package name */
    float f1789a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1790b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1791c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.d.c.b f1792d;

    /* renamed from: e, reason: collision with root package name */
    private final LongSparseArray f1793e = new LongSparseArray();

    /* renamed from: f, reason: collision with root package name */
    private final LongSparseArray f1794f = new LongSparseArray();

    /* renamed from: g, reason: collision with root package name */
    private final Path f1795g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f1796h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f1797i;

    /* renamed from: j, reason: collision with root package name */
    private final List f1798j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1799k;

    /* renamed from: l, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1800l;
    private final com.airbnb.lottie.a.b.f m;
    private final com.airbnb.lottie.a.b.f n;
    private com.airbnb.lottie.a.b.f o;
    private x p;
    private final com.airbnb.lottie.s q;
    private final int r;
    private com.airbnb.lottie.a.b.f s;
    private com.airbnb.lottie.a.b.i t;
    private final int u;

    public i(com.airbnb.lottie.s sVar, com.airbnb.lottie.h hVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.e eVar) {
        Path path = new Path();
        this.f1795g = path;
        this.f1796h = new com.airbnb.lottie.a.a(1);
        this.f1797i = new RectF();
        this.f1798j = new ArrayList();
        this.f1789a = 0.0f;
        this.f1792d = bVar;
        this.f1790b = eVar.g();
        this.f1791c = eVar.h();
        this.q = sVar;
        this.u = eVar.i();
        path.setFillType(eVar.b());
        this.r = (int) (hVar.a() / 32.0f);
        com.airbnb.lottie.a.b.f fVarA = eVar.c().a();
        this.f1799k = fVarA;
        fVarA.i(this);
        bVar.l(fVarA);
        com.airbnb.lottie.a.b.f fVarA2 = eVar.d().a();
        this.f1800l = fVarA2;
        fVarA2.i(this);
        bVar.l(fVarA2);
        com.airbnb.lottie.a.b.f fVarA3 = eVar.f().a();
        this.m = fVarA3;
        fVarA3.i(this);
        bVar.l(fVarA3);
        com.airbnb.lottie.a.b.f fVarA4 = eVar.e().a();
        this.n = fVarA4;
        fVarA4.i(this);
        bVar.l(fVarA4);
        if (bVar.i() != null) {
            com.airbnb.lottie.a.b.f fVarA5 = bVar.i().a().a();
            this.s = fVarA5;
            fVarA5.i(this);
            bVar.l(this.s);
        }
        if (bVar.j() != null) {
            this.t = new com.airbnb.lottie.a.b.i(this, bVar, bVar.j());
        }
    }

    private final int h() {
        float f2 = this.r;
        float fD = this.m.d() * f2;
        com.airbnb.lottie.a.b.f fVar = this.n;
        int iRound = Math.round(fD);
        float fD2 = fVar.d() * f2;
        com.airbnb.lottie.a.b.f fVar2 = this.f1799k;
        int iRound2 = Math.round(fD2);
        int iRound3 = Math.round(fVar2.d() * f2);
        int i2 = iRound != 0 ? iRound * DisplayStrings.DS_REPORT_MENU_V2_ANIMAL_ON_SHOULDER_LABEL : 17;
        if (iRound2 != 0) {
            i2 = i2 * 31 * iRound2;
        }
        return iRound3 != 0 ? i2 * 31 * iRound3 : i2;
    }

    private final int[] i(int[] iArr) {
        x xVar = this.p;
        if (xVar != null) {
            Integer[] numArr = (Integer[]) xVar.f();
            int length = iArr.length;
            int length2 = numArr.length;
            int i2 = 0;
            if (length == length2) {
                while (i2 < iArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            } else {
                iArr = new int[length2];
                while (i2 < numArr.length) {
                    iArr[i2] = numArr[i2].intValue();
                    i2++;
                }
            }
        }
        return iArr;
    }

    @Override // com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        com.airbnb.lottie.a.b.i iVar;
        com.airbnb.lottie.a.b.i iVar2;
        com.airbnb.lottie.a.b.i iVar3;
        com.airbnb.lottie.a.b.i iVar4;
        com.airbnb.lottie.a.b.i iVar5;
        if (obj == com.airbnb.lottie.x.f2505d) {
            this.f1800l.m(cVar);
            return;
        }
        if (obj == com.airbnb.lottie.x.K) {
            com.airbnb.lottie.a.b.f fVar = this.o;
            if (fVar != null) {
                this.f1792d.n(fVar);
            }
            if (cVar == null) {
                this.o = null;
                return;
            }
            x xVar = new x(cVar);
            this.o = xVar;
            xVar.i(this);
            this.f1792d.l(this.o);
            return;
        }
        if (obj == com.airbnb.lottie.x.L) {
            x xVar2 = this.p;
            if (xVar2 != null) {
                this.f1792d.n(xVar2);
            }
            if (cVar == null) {
                this.p = null;
                return;
            }
            this.f1793e.clear();
            this.f1794f.clear();
            x xVar3 = new x(cVar);
            this.p = xVar3;
            xVar3.i(this);
            this.f1792d.l(this.p);
            return;
        }
        if (obj == com.airbnb.lottie.x.f2511j) {
            com.airbnb.lottie.a.b.f fVar2 = this.s;
            if (fVar2 != null) {
                fVar2.m(cVar);
                return;
            }
            x xVar4 = new x(cVar);
            this.s = xVar4;
            xVar4.i(this);
            this.f1792d.l(this.s);
            return;
        }
        if (obj == com.airbnb.lottie.x.f2506e && (iVar5 = this.t) != null) {
            iVar5.b(cVar);
            return;
        }
        if (obj == com.airbnb.lottie.x.G && (iVar4 = this.t) != null) {
            iVar4.f(cVar);
            return;
        }
        if (obj == com.airbnb.lottie.x.H && (iVar3 = this.t) != null) {
            iVar3.c(cVar);
            return;
        }
        if (obj == com.airbnb.lottie.x.I && (iVar2 = this.t) != null) {
            iVar2.e(cVar);
        } else {
            if (obj != com.airbnb.lottie.x.J || (iVar = this.t) == null) {
                return;
            }
            iVar.g(cVar);
        }
    }

    @Override // com.airbnb.lottie.a.a.f
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        Shader shader;
        Shader radialGradient;
        if (this.f1791c) {
            return;
        }
        Path path = this.f1795g;
        path.reset();
        int i3 = 0;
        while (true) {
            List list = this.f1798j;
            if (i3 >= list.size()) {
                break;
            }
            path.addPath(((n) list.get(i3)).i(), matrix);
            i3++;
        }
        path.computeBounds(this.f1797i, false);
        if (this.u == 1) {
            int iH = h();
            LongSparseArray longSparseArray = this.f1793e;
            long j2 = iH;
            shader = (LinearGradient) longSparseArray.get(j2);
            if (shader == null) {
                PointF pointF = (PointF) this.m.f();
                PointF pointF2 = (PointF) this.n.f();
                com.airbnb.lottie.d.b.d dVar = (com.airbnb.lottie.d.b.d) this.f1799k.f();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, i(dVar.e()), dVar.d(), Shader.TileMode.CLAMP);
                longSparseArray.put(j2, radialGradient);
                shader = radialGradient;
            }
        } else {
            int iH2 = h();
            LongSparseArray longSparseArray2 = this.f1794f;
            long j3 = iH2;
            shader = (RadialGradient) longSparseArray2.get(j3);
            if (shader == null) {
                PointF pointF3 = (PointF) this.m.f();
                PointF pointF4 = (PointF) this.n.f();
                com.airbnb.lottie.d.b.d dVar2 = (com.airbnb.lottie.d.b.d) this.f1799k.f();
                int[] iArrI = i(dVar2.e());
                float[] fArrD = dVar2.d();
                float f2 = pointF3.x;
                float f3 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f2, pointF4.y - f3);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                radialGradient = new RadialGradient(f2, f3, fHypot, iArrI, fArrD, Shader.TileMode.CLAMP);
                longSparseArray2.put(j3, radialGradient);
                shader = radialGradient;
            }
        }
        shader.setLocalMatrix(matrix);
        Paint paint = this.f1796h;
        paint.setShader(shader);
        com.airbnb.lottie.a.b.f fVar = this.o;
        if (fVar != null) {
            paint.setColorFilter((ColorFilter) fVar.f());
        }
        com.airbnb.lottie.a.b.f fVar2 = this.s;
        if (fVar2 != null) {
            float fFloatValue = ((Float) fVar2.f()).floatValue();
            if (fFloatValue == 0.0f) {
                paint.setMaskFilter(null);
            } else if (fFloatValue != this.f1789a) {
                paint.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f1789a = fFloatValue;
        }
        com.airbnb.lottie.a.b.i iVar = this.t;
        if (iVar != null) {
            iVar.a(paint);
        }
        float fIntValue = ((Integer) this.f1800l.f()).intValue();
        int i4 = com.airbnb.lottie.g.f.f2413a;
        paint.setAlpha(Math.max(0, Math.min(255, (int) ((((i2 / 255.0f) * fIntValue) / 100.0f) * 255.0f))));
        canvas.drawPath(path, paint);
    }

    @Override // com.airbnb.lottie.a.a.f
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f1795g;
        path.reset();
        int i2 = 0;
        while (true) {
            List list = this.f1798j;
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
        this.q.invalidateSelf();
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
                this.f1798j.add((n) dVar);
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        return this.f1790b;
    }
}
