package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class g implements n, com.airbnb.lottie.a.b.a, l {

    /* renamed from: b, reason: collision with root package name */
    private final String f1770b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.s f1771c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1772d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.a.b.f f1773e;

    /* renamed from: f, reason: collision with root package name */
    private final com.airbnb.lottie.d.b.b f1774f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1776h;

    /* renamed from: a, reason: collision with root package name */
    private final Path f1769a = new Path();

    /* renamed from: g, reason: collision with root package name */
    private final c f1775g = new c();

    public g(com.airbnb.lottie.s sVar, com.airbnb.lottie.d.c.b bVar, com.airbnb.lottie.d.b.b bVar2) {
        this.f1770b = bVar2.d();
        this.f1771c = sVar;
        com.airbnb.lottie.a.b.f fVarA = bVar2.b().a();
        this.f1772d = fVarA;
        com.airbnb.lottie.a.b.f fVarA2 = bVar2.c().a();
        this.f1773e = fVarA2;
        this.f1774f = bVar2;
        bVar.l(fVarA);
        bVar.l(fVarA2);
        fVarA.i(this);
        fVarA2.i(this);
    }

    @Override // com.airbnb.lottie.d.f
    public final void a(Object obj, com.airbnb.lottie.h.c cVar) {
        if (obj == x.f2512k) {
            this.f1772d.m(cVar);
        } else if (obj == x.n) {
            this.f1773e.m(cVar);
        }
    }

    @Override // com.airbnb.lottie.a.b.a
    public final void d() {
        this.f1776h = false;
        this.f1771c.invalidateSelf();
    }

    @Override // com.airbnb.lottie.d.f
    public final void e(com.airbnb.lottie.d.e eVar, int i2, List list, com.airbnb.lottie.d.e eVar2) {
        com.airbnb.lottie.g.f.d(eVar, i2, list, eVar2, this);
    }

    @Override // com.airbnb.lottie.a.a.d
    public final void f(List list, List list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            d dVar = (d) list.get(i2);
            if (dVar instanceof u) {
                u uVar = (u) dVar;
                if (uVar.i() == 1) {
                    this.f1775g.a(uVar);
                    uVar.e(this);
                }
            }
        }
    }

    @Override // com.airbnb.lottie.a.a.d
    public final String g() {
        return this.f1770b;
    }

    @Override // com.airbnb.lottie.a.a.n
    public final Path i() {
        boolean z = this.f1776h;
        Path path = this.f1769a;
        if (z) {
            return path;
        }
        path.reset();
        com.airbnb.lottie.d.b.b bVar = this.f1774f;
        if (bVar.e()) {
            this.f1776h = true;
            return path;
        }
        PointF pointF = (PointF) this.f1772d.f();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        path.reset();
        float f4 = f3 * 0.55228f;
        float f5 = -f2;
        float f6 = -f4;
        float f7 = f4 + 0.0f;
        float f8 = 0.55228f * f2;
        float f9 = -f8;
        float f10 = f8 + 0.0f;
        float f11 = -f3;
        if (bVar.f()) {
            path.moveTo(0.0f, f11);
            path.cubicTo(f9, f11, f5, f6, f5, 0.0f);
            path.cubicTo(f5, f7, f9, f3, 0.0f, f3);
            path.cubicTo(f10, f3, f2, f7, f2, 0.0f);
            path.cubicTo(f2, f6, f10, f11, 0.0f, f11);
        } else {
            path.moveTo(0.0f, f11);
            path.cubicTo(f10, f11, f2, f6, f2, 0.0f);
            path.cubicTo(f2, f7, f10, f3, 0.0f, f3);
            path.cubicTo(f9, f3, f5, f7, f5, 0.0f);
            path.cubicTo(f5, f6, f9, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.f1773e.f();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f1775g.b(path);
        this.f1776h = true;
        return path;
    }
}
