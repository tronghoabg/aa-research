package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class p extends m {

    /* renamed from: d, reason: collision with root package name */
    private final PointF f1897d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f1898e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f1899f;

    /* renamed from: g, reason: collision with root package name */
    private final PathMeasure f1900g;

    /* renamed from: h, reason: collision with root package name */
    private o f1901h;

    public p(List list) {
        super(list);
        this.f1897d = new PointF();
        this.f1898e = new float[2];
        this.f1899f = new float[2];
        this.f1900g = new PathMeasure();
    }

    @Override // com.airbnb.lottie.a.b.f
    public final /* bridge */ /* synthetic */ Object g(com.airbnb.lottie.h.a aVar, float f2) {
        float f3;
        o oVar = (o) aVar;
        Path pathA = oVar.a();
        if (pathA == null) {
            return (PointF) aVar.f2433a;
        }
        com.airbnb.lottie.h.c cVar = this.f1877c;
        if (cVar != null) {
            f3 = f2;
            PointF pointF = (PointF) cVar.b(oVar.f2438f, oVar.f2439g.floatValue(), (PointF) oVar.f2433a, (PointF) oVar.f2434b, c(), f3, this.f1876b);
            if (pointF != null) {
                return pointF;
            }
        } else {
            f3 = f2;
        }
        if (this.f1901h != oVar) {
            this.f1900g.setPath(pathA, false);
            this.f1901h = oVar;
        }
        PathMeasure pathMeasure = this.f1900g;
        float length = pathMeasure.getLength();
        float f4 = f3 * length;
        float[] fArr = this.f1898e;
        float[] fArr2 = this.f1899f;
        pathMeasure.getPosTan(f4, fArr, fArr2);
        PointF pointF2 = this.f1897d;
        pointF2.set(fArr[0], fArr[1]);
        if (f4 < 0.0f) {
            pointF2.offset(fArr2[0] * f4, fArr2[1] * f4);
            return pointF2;
        }
        if (f4 > length) {
            float f5 = f4 - length;
            pointF2.offset(fArr2[0] * f5, fArr2[1] * f5);
        }
        return pointF2;
    }
}
