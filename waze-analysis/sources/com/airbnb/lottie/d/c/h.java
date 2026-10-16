package com.airbnb.lottie.d.c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.a.b.w;
import com.airbnb.lottie.s;
import com.airbnb.lottie.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class h extends b {

    /* renamed from: g, reason: collision with root package name */
    private final RectF f2259g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f2260h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f2261i;

    /* renamed from: j, reason: collision with root package name */
    private final Path f2262j;

    /* renamed from: k, reason: collision with root package name */
    private final e f2263k;

    /* renamed from: l, reason: collision with root package name */
    private com.airbnb.lottie.a.b.f f2264l;
    private com.airbnb.lottie.a.b.f m;

    h(s sVar, e eVar) {
        super(sVar, eVar);
        this.f2259g = new RectF();
        com.airbnb.lottie.a.a aVar = new com.airbnb.lottie.a.a();
        this.f2260h = aVar;
        this.f2261i = new float[8];
        this.f2262j = new Path();
        this.f2263k = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.e());
    }

    @Override // com.airbnb.lottie.d.c.b, com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        super.a(obj, cVar);
        if (obj == x.K) {
            if (cVar == null) {
                this.f2264l = null;
                return;
            } else {
                this.f2264l = new com.airbnb.lottie.a.b.x(cVar);
                return;
            }
        }
        if (obj == x.f2502a) {
            if (cVar != null) {
                this.m = new com.airbnb.lottie.a.b.x(cVar);
            } else {
                this.m = null;
                this.f2260h.setColor(this.f2263k.e());
            }
        }
    }

    @Override // com.airbnb.lottie.d.c.b, com.airbnb.lottie.a.a.f
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        e eVar = this.f2263k;
        float fG = eVar.g();
        float f2 = eVar.f();
        RectF rectF2 = this.f2259g;
        rectF2.set(0.0f, 0.0f, fG, f2);
        this.f2221a.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // com.airbnb.lottie.d.c.b
    public final void m(Canvas canvas, Matrix matrix, int i2) {
        e eVar = this.f2263k;
        int iAlpha = Color.alpha(eVar.e());
        if (iAlpha == 0) {
            return;
        }
        com.airbnb.lottie.a.b.f fVar = this.m;
        Integer num = fVar == null ? null : (Integer) fVar.f();
        Paint paint = this.f2260h;
        if (num != null) {
            paint.setColor(num.intValue());
        } else {
            paint.setColor(eVar.e());
        }
        w wVar = this.f2224d;
        int iIntValue = wVar.d() == null ? 100 : ((Integer) wVar.d().f()).intValue();
        Paint paint2 = this.f2260h;
        int i3 = (int) ((i2 / 255.0f) * (((iAlpha / 255.0f) * iIntValue) / 100.0f) * 255.0f);
        paint2.setAlpha(i3);
        com.airbnb.lottie.a.b.f fVar2 = this.f2264l;
        if (fVar2 != null) {
            paint2.setColorFilter((ColorFilter) fVar2.f());
        }
        if (i3 > 0) {
            float[] fArr = this.f2261i;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = eVar.g();
            fArr[3] = 0.0f;
            fArr[4] = eVar.g();
            fArr[5] = eVar.f();
            fArr[6] = 0.0f;
            fArr[7] = eVar.f();
            matrix.mapPoints(fArr);
            Path path = this.f2262j;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, paint2);
        }
    }
}
