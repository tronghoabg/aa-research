package com.airbnb.lottie.d.c;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.s;
import com.airbnb.lottie.t;
import com.airbnb.lottie.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: g, reason: collision with root package name */
    private final Paint f2239g;

    /* renamed from: h, reason: collision with root package name */
    private final Rect f2240h;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f2241i;

    /* renamed from: j, reason: collision with root package name */
    private final t f2242j;

    /* renamed from: k, reason: collision with root package name */
    private com.airbnb.lottie.a.b.f f2243k;

    /* renamed from: l, reason: collision with root package name */
    private com.airbnb.lottie.a.b.f f2244l;

    d(s sVar, e eVar) {
        super(sVar, eVar);
        this.f2239g = new com.airbnb.lottie.a.a(3);
        this.f2240h = new Rect();
        this.f2241i = new Rect();
        this.f2242j = sVar.j(eVar.r());
    }

    @Override // com.airbnb.lottie.d.c.b, com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        super.a(obj, cVar);
        if (obj == x.K) {
            if (cVar == null) {
                this.f2243k = null;
                return;
            } else {
                this.f2243k = new com.airbnb.lottie.a.b.x(cVar);
                return;
            }
        }
        if (obj == x.N) {
            if (cVar == null) {
                this.f2244l = null;
            } else {
                this.f2244l = new com.airbnb.lottie.a.b.x(cVar);
            }
        }
    }

    @Override // com.airbnb.lottie.d.c.b, com.airbnb.lottie.a.a.f
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        if (this.f2242j != null) {
            float fA = com.airbnb.lottie.g.k.a();
            rectF.set(0.0f, 0.0f, r3.b() * fA, r3.a() * fA);
            this.f2221a.mapRect(rectF);
        }
    }

    @Override // com.airbnb.lottie.d.c.b
    public final void m(Canvas canvas, Matrix matrix, int i2) {
        Bitmap bitmapG;
        com.airbnb.lottie.a.b.f fVar = this.f2244l;
        if (fVar == null || (bitmapG = (Bitmap) fVar.f()) == null) {
            bitmapG = this.f2222b.g(this.f2223c.r());
            if (bitmapG == null) {
                t tVar = this.f2242j;
                bitmapG = tVar != null ? tVar.c() : null;
            }
        }
        if (bitmapG == null || bitmapG.isRecycled() || this.f2242j == null) {
            return;
        }
        int i3 = com.airbnb.lottie.g.k.f2415a;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        Paint paint = this.f2239g;
        paint.setAlpha(i2);
        com.airbnb.lottie.a.b.f fVar2 = this.f2243k;
        if (fVar2 != null) {
            paint.setColorFilter((ColorFilter) fVar2.f());
        }
        canvas.save();
        canvas.concat(matrix);
        Rect rect = this.f2240h;
        rect.set(0, 0, bitmapG.getWidth(), bitmapG.getHeight());
        Rect rect2 = this.f2241i;
        rect2.set(0, 0, (int) (bitmapG.getWidth() * f2), (int) (bitmapG.getHeight() * f2));
        canvas.drawBitmap(bitmapG, rect, rect2, paint);
        canvas.restore();
    }
}
