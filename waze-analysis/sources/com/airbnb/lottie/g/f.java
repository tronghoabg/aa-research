package com.airbnb.lottie.g;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.a.a.l;
import com.airbnb.lottie.d.b.m;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2413a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final PointF f2414b = new PointF();

    static int a(float f2, float f3) {
        int i2 = (int) f2;
        int i3 = (int) f3;
        int i4 = i2 / i3;
        int i5 = i2 % i3;
        if ((i2 ^ i3) < 0 && i5 != 0) {
            i4--;
        }
        return i2 - (i3 * i4);
    }

    public static PointF b(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void c(m mVar, Path path) {
        Path path2;
        path.reset();
        PointF pointFA = mVar.a();
        path.moveTo(pointFA.x, pointFA.y);
        PointF pointF = f2414b;
        pointF.set(pointFA.x, pointFA.y);
        int i2 = 0;
        while (i2 < mVar.b().size()) {
            com.airbnb.lottie.d.a aVar = (com.airbnb.lottie.d.a) mVar.b().get(i2);
            PointF pointFA2 = aVar.a();
            PointF pointFB = aVar.b();
            PointF pointFC = aVar.c();
            if (pointFA2.equals(pointF) && pointFB.equals(pointFC)) {
                path.lineTo(pointFC.x, pointFC.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFA2.x, pointFA2.y, pointFB.x, pointFB.y, pointFC.x, pointFC.y);
            }
            pointF.set(pointFC.x, pointFC.y);
            i2++;
            path = path2;
        }
        Path path3 = path;
        if (mVar.f()) {
            path3.close();
        }
    }

    public static void d(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2, l lVar) {
        if (eVar.e(lVar.g(), i2)) {
            list.add(eVar2.b(lVar.g()).c(lVar));
        }
    }
}
