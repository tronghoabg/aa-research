package com.airbnb.lottie.a.b;

import android.graphics.PointF;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class q extends m {

    /* renamed from: d, reason: collision with root package name */
    private final PointF f1902d;

    public q(List list) {
        super(list);
        this.f1902d = new PointF();
    }

    @Override // com.airbnb.lottie.a.b.f
    public final /* synthetic */ Object g(com.airbnb.lottie.h.a aVar, float f2) {
        return h(aVar, f2, f2, f2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.airbnb.lottie.a.b.f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final PointF h(com.airbnb.lottie.h.a aVar, float f2, float f3, float f4) {
        Object obj;
        PointF pointF;
        Object obj2 = aVar.f2433a;
        if (obj2 == null || (obj = aVar.f2434b) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        com.airbnb.lottie.h.c cVar = this.f1877c;
        if (cVar != null && (pointF = (PointF) cVar.b(aVar.f2438f, aVar.f2439g.floatValue(), pointF2, pointF3, f2, c(), this.f1876b)) != null) {
            return pointF;
        }
        PointF pointF4 = this.f1902d;
        pointF4.set(pointF2.x + (f3 * (pointF3.x - pointF2.x)), pointF2.y + (f4 * (pointF3.y - pointF2.y)));
        return pointF4;
    }
}
