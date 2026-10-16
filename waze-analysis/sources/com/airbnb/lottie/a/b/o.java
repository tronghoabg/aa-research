package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class o extends com.airbnb.lottie.h.a {

    /* renamed from: j, reason: collision with root package name */
    private Path f1895j;

    /* renamed from: k, reason: collision with root package name */
    private final com.airbnb.lottie.h.a f1896k;

    public o(com.airbnb.lottie.h hVar, com.airbnb.lottie.h.a aVar) {
        super(hVar, (PointF) aVar.f2433a, (PointF) aVar.f2434b, aVar.f2435c, aVar.f2436d, aVar.f2437e, aVar.f2438f, aVar.f2439g);
        this.f1896k = aVar;
        b();
    }

    final Path a() {
        return this.f1895j;
    }

    public final void b() {
        Object obj;
        Object obj2;
        Object obj3 = this.f2434b;
        boolean z = false;
        if (obj3 != null && (obj2 = this.f2433a) != null && ((PointF) obj2).equals(((PointF) obj3).x, ((PointF) this.f2434b).y)) {
            z = true;
        }
        Object obj4 = this.f2433a;
        if (obj4 == null || (obj = this.f2434b) == null || z) {
            return;
        }
        com.airbnb.lottie.h.a aVar = this.f1896k;
        PointF pointF = (PointF) obj4;
        PointF pointF2 = (PointF) obj;
        PointF pointF3 = aVar.f2440h;
        PointF pointF4 = aVar.f2441i;
        int i2 = com.airbnb.lottie.g.k.f2415a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
        }
        this.f1895j = path;
    }
}
