package com.airbnb.lottie.d.b;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final List f2185a;

    /* renamed from: b, reason: collision with root package name */
    private PointF f2186b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2187c;

    public m(PointF pointF, boolean z, List list) {
        this.f2186b = pointF;
        this.f2187c = z;
        this.f2185a = new ArrayList(list);
    }

    public final PointF a() {
        return this.f2186b;
    }

    public final List b() {
        return this.f2185a;
    }

    public final void c(m mVar, m mVar2, float f2) {
        if (this.f2186b == null) {
            this.f2186b = new PointF();
        }
        boolean z = true;
        if (!mVar.f2187c && !mVar2.f2187c) {
            z = false;
        }
        this.f2187c = z;
        List list = mVar.f2185a;
        int size = list.size();
        List list2 = mVar2.f2185a;
        if (size != list2.size()) {
            com.airbnb.lottie.g.c.a("Curves must have the same number of control points. Shape 1: " + list.size() + "\tShape 2: " + list2.size());
        }
        int iMin = Math.min(list.size(), list2.size());
        List list3 = this.f2185a;
        if (list3.size() < iMin) {
            for (int size2 = list3.size(); size2 < iMin; size2++) {
                list3.add(new com.airbnb.lottie.d.a());
            }
        } else if (list3.size() > iMin) {
            int size3 = list3.size();
            while (true) {
                size3--;
                if (size3 < iMin) {
                    break;
                } else {
                    list3.remove(list3.size() - 1);
                }
            }
        }
        PointF pointF = mVar.f2186b;
        PointF pointF2 = mVar2.f2186b;
        float f3 = pointF.x;
        float f4 = pointF2.x;
        int i2 = com.airbnb.lottie.g.f.f2413a;
        float f5 = pointF.y;
        e(f3 + ((f4 - f3) * f2), f5 + ((pointF2.y - f5) * f2));
        int size4 = list3.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                return;
            }
            com.airbnb.lottie.d.a aVar = (com.airbnb.lottie.d.a) list.get(size4);
            com.airbnb.lottie.d.a aVar2 = (com.airbnb.lottie.d.a) list2.get(size4);
            PointF pointFA = aVar.a();
            PointF pointFB = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB2 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            com.airbnb.lottie.d.a aVar3 = (com.airbnb.lottie.d.a) list3.get(size4);
            float f6 = pointFA.x;
            float f7 = f6 + ((pointFA2.x - f6) * f2);
            float f8 = pointFA.y;
            aVar3.d(f7, f8 + ((pointFA2.y - f8) * f2));
            com.airbnb.lottie.d.a aVar4 = (com.airbnb.lottie.d.a) list3.get(size4);
            float f9 = pointFB.x;
            float f10 = f9 + ((pointFB2.x - f9) * f2);
            float f11 = pointFB.y;
            aVar4.e(f10, f11 + ((pointFB2.y - f11) * f2));
            com.airbnb.lottie.d.a aVar5 = (com.airbnb.lottie.d.a) list3.get(size4);
            float f12 = pointFC.x;
            float f13 = f12 + ((pointFC2.x - f12) * f2);
            float f14 = pointFC.y;
            aVar5.f(f13, f14 + ((pointFC2.y - f14) * f2));
        }
    }

    public final void d(boolean z) {
        this.f2187c = z;
    }

    public final void e(float f2, float f3) {
        PointF pointF = this.f2186b;
        if (pointF == null) {
            pointF = new PointF();
            this.f2186b = pointF;
        }
        pointF.set(f2, f3);
    }

    public final boolean f() {
        return this.f2187c;
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f2185a.size() + "closed=" + this.f2187c + "}";
    }

    public m() {
        this.f2185a = new ArrayList();
    }
}
