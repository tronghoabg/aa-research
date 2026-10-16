package com.waze.z.a.g;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.MuxerUtil;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class q implements Shape {

    /* renamed from: a, reason: collision with root package name */
    private final o f46083a;

    /* renamed from: b, reason: collision with root package name */
    private final t f46084b;

    public q(o oVar, t tVar) {
        h.g.b.x.f(oVar, "arrowLocation");
        h.g.b.x.f(tVar, "dimensions");
        this.f46083a = oVar;
        this.f46084b = tVar;
    }

    private final void a(Path path, i iVar) {
        float f2 = -1.0f;
        if (!h.g.b.x.n(iVar, m.f46076a) && !h.g.b.x.n(iVar, j.f46074a) && !h.g.b.x.n(iVar, k.f46075a) && !h.g.b.x.n(iVar, f.f46072a)) {
            f2 = 1.0f;
            if (!h.g.b.x.n(iVar, d.f46071a) && !h.g.b.x.n(iVar, a.f46059a) && !h.g.b.x.n(iVar, b.f46069a) && !h.g.b.x.n(iVar, g.f46073a)) {
                throw new h.i();
            }
        }
        r rVarB = iVar.b();
        r rVar = r.f46085a;
        int iOrdinal = rVarB.ordinal();
        t tVar = this.f46084b;
        if (iOrdinal != 1) {
            path.relativeLineTo((tVar.e() / 2.0f) * f2, tVar.d() * f2);
            path.relativeQuadraticTo((tVar.b() * f2) / 2.0f, tVar.a() * f2, tVar.b() * f2, 0.0f);
            path.relativeLineTo((tVar.e() / 2.0f) * f2, (-tVar.d()) * f2);
        } else {
            path.relativeLineTo((-tVar.d()) * f2, (tVar.e() / 2.0f) * f2);
            path.relativeQuadraticTo((-tVar.a()) * f2, (tVar.b() * f2) / 2.0f, 0.0f, tVar.b() * f2);
            path.relativeLineTo(tVar.d() * f2, (tVar.e() / 2.0f) * f2);
        }
    }

    private final void b(Path path, r rVar, float f2) {
        float f3;
        r rVar2 = r.f46085a;
        int iOrdinal = rVar.ordinal();
        if (iOrdinal == 0) {
            f3 = -1.0f;
        } else {
            if (iOrdinal != 2) {
                Objects.toString(rVar);
                throw new IllegalArgumentException("Illegal direction to drawCenter: ".concat(String.valueOf(rVar)));
            }
            f3 = 1.0f;
        }
        o oVar = this.f46083a;
        if (oVar.a() != p.f46080b || oVar.b() != rVar) {
            path.relativeLineTo(f2 * f3, 0.0f);
            return;
        }
        float f4 = ((f2 - this.f46084b.f()) / 2.0f) * f3;
        path.relativeLineTo(f4, 0.0f);
        h.g.b.x.d(oVar, "null cannot be cast to non-null type com.waze.design_components_compose.components.tooltip.ArrowLocation.NonEdgeLocation");
        a(path, (i) oVar);
        path.relativeLineTo(f4, 0.0f);
    }

    private final void c(Path path, h hVar) {
        float f2;
        r rVarB = hVar.b();
        r rVar = r.f46085a;
        int iOrdinal = rVarB.ordinal();
        if (iOrdinal == 0) {
            f2 = -1.0f;
        } else {
            if (iOrdinal != 2) {
                Objects.toString(hVar);
                throw new IllegalStateException("Edge arrow cannot have CENTER vertical location: ".concat(String.valueOf(hVar)));
            }
            f2 = 1.0f;
        }
        if ((hVar instanceof e) || (hVar instanceof l)) {
            t tVar = this.f46084b;
            path.relativeLineTo(0.0f, tVar.m() * f2);
            path.relativeLineTo(tVar.l() * f2, tVar.k() * f2);
            path.relativeQuadraticTo(0.0f, (tVar.c() - tVar.k()) * f2, tVar.g() * f2, (tVar.i() - tVar.k()) * f2);
            path.relativeLineTo(tVar.j() * f2, (-tVar.i()) * f2);
            return;
        }
        if (!(hVar instanceof c) && !(hVar instanceof n)) {
            throw new h.i();
        }
        t tVar2 = this.f46084b;
        path.relativeLineTo(tVar2.j() * f2, tVar2.i() * f2);
        path.relativeQuadraticTo(tVar2.g() * f2, (tVar2.c() - tVar2.i()) * f2, tVar2.g() * f2, (tVar2.k() - tVar2.i()) * f2);
        path.relativeLineTo(tVar2.l() * f2, tVar2.k() * (-f2));
        path.relativeLineTo(0.0f, (-tVar2.m()) * f2);
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final Outline mo2037createOutlinePq9zytI(long j2, LayoutDirection layoutDirection, Density density) {
        h.k kVar;
        float fN;
        float fM;
        h.g.b.x.f(layoutDirection, "layoutDirection");
        h.g.b.x.f(density, "density");
        t tVar = this.f46084b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2));
        float fM2 = tVar.m() + tVar.n();
        o oVar = this.f46083a;
        r rVarB = oVar.b();
        r rVar = r.f46086b;
        float fC = (fIntBitsToFloat - ((fM2 + fM2) + (rVarB == rVar ? 0.0f : tVar.c()))) - tVar.f();
        int i2 = (int) (j2 >> 32);
        if (oVar instanceof h) {
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
            float f2 = tVar.f() + tVar.m();
            float fN2 = tVar.n();
            float f3 = fIntBitsToFloat2 - (f2 + (fN2 + fN2));
            float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
            float fM3 = tVar.m() + tVar.n();
            float f4 = fIntBitsToFloat3 - (fM3 + fM3);
            kVar = oVar.b() == r.f46085a ? new h.k(Float.valueOf(f3), Float.valueOf(f4)) : new h.k(Float.valueOf(f4), Float.valueOf(f3));
        } else if ((oVar instanceof j) || (oVar instanceof a)) {
            float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
            float fM4 = tVar.m() + tVar.n();
            Float fValueOf = Float.valueOf(fIntBitsToFloat4 - (fM4 + fM4));
            kVar = new h.k(fValueOf, fValueOf);
        } else if (oVar.b() == rVar) {
            float fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            float fM5 = tVar.m() + tVar.n();
            Float fValueOf2 = Float.valueOf((fIntBitsToFloat5 - (fM5 + fM5)) - tVar.c());
            kVar = new h.k(fValueOf2, fValueOf2);
        } else {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            float f5 = tVar.f() + tVar.h();
            float fN3 = tVar.n() + tVar.m();
            float f6 = fIntBitsToFloat6 - (f5 + (fN3 + fN3));
            float fIntBitsToFloat7 = Float.intBitsToFloat(i2);
            float fM6 = tVar.m() + tVar.n();
            float f7 = fIntBitsToFloat7 - (fM6 + fM6);
            kVar = oVar.b() == r.f46085a ? new h.k(Float.valueOf(f6), Float.valueOf(f7)) : new h.k(Float.valueOf(f7), Float.valueOf(f6));
        }
        float fFloatValue = ((Number) kVar.a()).floatValue();
        float fFloatValue2 = ((Number) kVar.b()).floatValue();
        boolean z = oVar instanceof g;
        float fN4 = z ? tVar.n() + tVar.c() : tVar.n();
        r rVarB2 = oVar.b();
        r rVar2 = r.f46085a;
        if (rVarB2 == rVar2) {
            fN = tVar.n() + tVar.m();
            fM = tVar.c();
        } else {
            fN = tVar.n();
            fM = tVar.m();
        }
        float f8 = fN + fM;
        float f9 = fC / 2.0f;
        Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(fN4, f8);
        Path.relativeLineTo(0.0f, f9);
        if (z) {
            a(Path, (i) oVar);
        } else {
            Path.relativeLineTo(0.0f, tVar.f());
        }
        Path.relativeLineTo(0.0f, f9);
        if (oVar instanceof e) {
            c(Path, (h) oVar);
        } else if (oVar instanceof d) {
            Path.relativeQuadraticTo(0.0f, tVar.m(), tVar.m(), tVar.m());
            Path.relativeLineTo(tVar.h(), 0.0f);
            a(Path, (i) oVar);
        } else {
            Path.relativeQuadraticTo(0.0f, tVar.m(), tVar.m(), tVar.m());
        }
        b(Path, r.f46087c, fFloatValue2);
        if (oVar instanceof c) {
            c(Path, (h) oVar);
        } else if (oVar instanceof b) {
            a(Path, (i) oVar);
            Path.relativeLineTo(tVar.h(), 0.0f);
            Path.relativeQuadraticTo(tVar.m(), 0.0f, tVar.m(), -tVar.m());
        } else {
            Path.relativeQuadraticTo(tVar.m(), 0.0f, tVar.m(), -tVar.m());
        }
        float f10 = -f9;
        Path.relativeLineTo(0.0f, f10);
        if (h.g.b.x.n(oVar, f.f46072a)) {
            h.g.b.x.d(oVar, "null cannot be cast to non-null type com.waze.design_components_compose.components.tooltip.ArrowLocation.NonEdgeLocation");
            a(Path, (i) oVar);
        } else {
            Path.relativeLineTo(0.0f, -tVar.f());
        }
        Path.relativeLineTo(0.0f, f10);
        if (oVar instanceof l) {
            c(Path, (h) oVar);
        } else if (oVar instanceof k) {
            Path.relativeQuadraticTo(0.0f, -tVar.m(), -tVar.m(), -tVar.m());
            Path.relativeLineTo(-tVar.h(), 0.0f);
            a(Path, (i) oVar);
        } else {
            Path.relativeQuadraticTo(0.0f, -tVar.m(), -tVar.m(), -tVar.m());
        }
        b(Path, rVar2, fFloatValue);
        if (oVar instanceof n) {
            c(Path, (h) oVar);
        } else if (oVar instanceof m) {
            a(Path, (i) oVar);
            Path.relativeLineTo(-tVar.h(), 0.0f);
            Path.relativeQuadraticTo(-tVar.m(), 0.0f, -tVar.m(), tVar.m());
        } else {
            Path.relativeQuadraticTo(-tVar.m(), 0.0f, -tVar.m(), tVar.m());
        }
        return new Outline.Generic(Path);
    }
}
