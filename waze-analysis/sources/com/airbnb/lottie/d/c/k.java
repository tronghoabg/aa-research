package com.airbnb.lottie.d.c;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.collection.LongSparseArray;
import com.airbnb.lottie.a.b.v;
import com.airbnb.lottie.s;
import com.airbnb.lottie.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class k extends b {
    private com.airbnb.lottie.a.b.f A;

    /* renamed from: g, reason: collision with root package name */
    private final StringBuilder f2267g;

    /* renamed from: h, reason: collision with root package name */
    private final RectF f2268h;

    /* renamed from: i, reason: collision with root package name */
    private final Matrix f2269i;

    /* renamed from: j, reason: collision with root package name */
    private final Paint f2270j;

    /* renamed from: k, reason: collision with root package name */
    private final Paint f2271k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f2272l;
    private final LongSparseArray m;
    private final List n;
    private final v o;
    private final s p;
    private final com.airbnb.lottie.h q;
    private com.airbnb.lottie.a.b.f r;
    private com.airbnb.lottie.a.b.f s;
    private com.airbnb.lottie.a.b.f t;
    private com.airbnb.lottie.a.b.f u;
    private com.airbnb.lottie.a.b.f v;
    private com.airbnb.lottie.a.b.f w;
    private com.airbnb.lottie.a.b.f x;
    private com.airbnb.lottie.a.b.f y;
    private com.airbnb.lottie.a.b.f z;

    k(s sVar, e eVar) {
        com.airbnb.lottie.d.a.b bVar;
        com.airbnb.lottie.d.a.b bVar2;
        com.airbnb.lottie.d.a.a aVar;
        com.airbnb.lottie.d.a.a aVar2;
        super(sVar, eVar);
        this.f2267g = new StringBuilder(2);
        this.f2268h = new RectF();
        this.f2269i = new Matrix();
        this.f2270j = new i(this, null);
        this.f2271k = new i(this);
        this.f2272l = new HashMap();
        this.m = new LongSparseArray();
        this.n = new ArrayList();
        this.p = sVar;
        this.q = eVar.j();
        v vVarA = eVar.l().a();
        this.o = vVarA;
        vVarA.i(this);
        l(vVarA);
        com.airbnb.lottie.d.a.k kVarM = eVar.m();
        if (kVarM != null && (aVar2 = kVarM.f2102a) != null) {
            com.airbnb.lottie.a.b.f fVarA = aVar2.a();
            this.r = fVarA;
            fVarA.i(this);
            l(this.r);
        }
        if (kVarM != null && (aVar = kVarM.f2103b) != null) {
            com.airbnb.lottie.a.b.f fVarA2 = aVar.a();
            this.t = fVarA2;
            fVarA2.i(this);
            l(this.t);
        }
        if (kVarM != null && (bVar2 = kVarM.f2104c) != null) {
            com.airbnb.lottie.a.b.f fVarA3 = bVar2.a();
            this.v = fVarA3;
            fVarA3.i(this);
            l(this.v);
        }
        if (kVarM == null || (bVar = kVarM.f2105d) == null) {
            return;
        }
        com.airbnb.lottie.a.b.f fVarA4 = bVar.a();
        this.x = fVarA4;
        fVarA4.i(this);
        l(this.x);
    }

    private static final List A(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private final j v(int i2) {
        List list = this.n;
        for (int size = list.size(); size < i2; size++) {
            list.add(new j(null));
        }
        return (j) list.get(i2 - 1);
    }

    private final List w(String str, float f2, com.airbnb.lottie.d.c cVar, float f3, float f4, boolean z) {
        float fMeasureText;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        while (i2 < str.length()) {
            int i6 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (z) {
                com.airbnb.lottie.d.d dVar = (com.airbnb.lottie.d.d) this.q.i().get((((cCharAt * 31) + cVar.b().hashCode()) * 31) + cVar.d().hashCode());
                if (dVar != null) {
                    float fA = ((float) dVar.a()) * f3;
                    int i7 = com.airbnb.lottie.g.k.f2415a;
                    fMeasureText = fA * Resources.getSystem().getDisplayMetrics().density;
                } else {
                    i2 = i6;
                }
            } else {
                fMeasureText = this.f2270j.measureText(str.substring(i2, i6));
            }
            float f8 = fMeasureText + f4;
            if (cCharAt == ' ') {
                z2 = true;
                f7 = f8;
            } else if (z2) {
                z2 = false;
                i5 = i2;
                f6 = f8;
            } else {
                f6 += f8;
                z2 = false;
            }
            f5 += f8;
            if (f2 > 0.0f && f5 >= f2 && cCharAt != ' ') {
                i3++;
                j jVarV = v(i3);
                if (i5 == i4) {
                    jVarV.c(str.substring(i4, i2).trim(), (f5 - f8) - ((r9.length() - r7.length()) * f7));
                    i4 = i2;
                    i5 = i4;
                    f5 = f8;
                    f6 = f5;
                } else {
                    jVarV.c(str.substring(i4, i5 - 1).trim(), ((f5 - f6) - ((r4.length() - r7.length()) * f7)) - f7);
                    f5 = f6;
                    i4 = i5;
                }
            }
            i2 = i6;
        }
        if (f5 > 0.0f) {
            i3++;
            v(i3).c(str.substring(i4), f5);
        }
        return this.n.subList(0, i3);
    }

    private final boolean x(Canvas canvas, com.airbnb.lottie.d.b bVar, int i2, float f2) {
        PointF pointF = bVar.f2127k;
        PointF pointF2 = bVar.f2128l;
        float fA = com.airbnb.lottie.g.k.a();
        float f3 = (i2 * bVar.f2121e * fA) + (pointF == null ? 0.0f : (bVar.f2121e * fA) + pointF.y);
        if (this.p.P() && pointF2 != null && pointF != null && f3 >= pointF.y + pointF2.y + bVar.f2119c) {
            return false;
        }
        float f4 = pointF == null ? 0.0f : pointF.x;
        float f5 = pointF2 != null ? pointF2.x : 0.0f;
        int i3 = bVar.m;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 == 0) {
            canvas.translate(f4, f3);
        } else if (i4 == 1) {
            canvas.translate((f4 + f5) - f2, f3);
        } else if (i4 == 2) {
            canvas.translate((f4 + (f5 / 2.0f)) - (f2 / 2.0f), f3);
        }
        return true;
    }

    private static final void y(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private static final void z(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // com.airbnb.lottie.d.c.b, com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        super.a(obj, cVar);
        if (obj == x.f2502a) {
            com.airbnb.lottie.a.b.f fVar = this.s;
            if (fVar != null) {
                n(fVar);
            }
            if (cVar == null) {
                this.s = null;
                return;
            }
            com.airbnb.lottie.a.b.x xVar = new com.airbnb.lottie.a.b.x(cVar);
            this.s = xVar;
            xVar.i(this);
            l(this.s);
            return;
        }
        if (obj == x.f2503b) {
            com.airbnb.lottie.a.b.f fVar2 = this.u;
            if (fVar2 != null) {
                n(fVar2);
            }
            if (cVar == null) {
                this.u = null;
                return;
            }
            com.airbnb.lottie.a.b.x xVar2 = new com.airbnb.lottie.a.b.x(cVar);
            this.u = xVar2;
            xVar2.i(this);
            l(this.u);
            return;
        }
        if (obj == x.s) {
            com.airbnb.lottie.a.b.f fVar3 = this.w;
            if (fVar3 != null) {
                n(fVar3);
            }
            if (cVar == null) {
                this.w = null;
                return;
            }
            com.airbnb.lottie.a.b.x xVar3 = new com.airbnb.lottie.a.b.x(cVar);
            this.w = xVar3;
            xVar3.i(this);
            l(this.w);
            return;
        }
        if (obj == x.t) {
            com.airbnb.lottie.a.b.f fVar4 = this.y;
            if (fVar4 != null) {
                n(fVar4);
            }
            if (cVar == null) {
                this.y = null;
                return;
            }
            com.airbnb.lottie.a.b.x xVar4 = new com.airbnb.lottie.a.b.x(cVar);
            this.y = xVar4;
            xVar4.i(this);
            l(this.y);
            return;
        }
        if (obj == x.F) {
            com.airbnb.lottie.a.b.f fVar5 = this.z;
            if (fVar5 != null) {
                n(fVar5);
            }
            if (cVar == null) {
                this.z = null;
                return;
            }
            com.airbnb.lottie.a.b.x xVar5 = new com.airbnb.lottie.a.b.x(cVar);
            this.z = xVar5;
            xVar5.i(this);
            l(this.z);
            return;
        }
        if (obj != x.M) {
            if (obj == x.O) {
                this.o.o(cVar);
                return;
            }
            return;
        }
        com.airbnb.lottie.a.b.f fVar6 = this.A;
        if (fVar6 != null) {
            n(fVar6);
        }
        if (cVar == null) {
            this.A = null;
            return;
        }
        com.airbnb.lottie.a.b.x xVar6 = new com.airbnb.lottie.a.b.x(cVar);
        this.A = xVar6;
        xVar6.i(this);
        l(this.A);
    }

    @Override // com.airbnb.lottie.d.c.b, com.airbnb.lottie.a.a.f
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        com.airbnb.lottie.h hVar = this.q;
        rectF.set(0.0f, 0.0f, hVar.h().width(), hVar.h().height());
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    @Override // com.airbnb.lottie.d.c.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void m(android.graphics.Canvas r27, android.graphics.Matrix r28, int r29) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.d.c.k.m(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }
}
