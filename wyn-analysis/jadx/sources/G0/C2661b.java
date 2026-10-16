package g0;

import A7.AbstractC0279p0;
import L0.i;
import U8.v0;
import android.graphics.Paint;
import android.graphics.Shader;
import ba.C1521a;
import c7.C1576l;
import d0.AbstractC2382a;
import d0.C2384c;
import e0.AbstractC2461m;
import e0.C2452d;
import e0.C2454f;
import e0.C2465q;
import e0.r;
import e0.z;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2661b implements InterfaceC2663d {

    /* renamed from: a, reason: collision with root package name */
    public final C2660a f35483a;

    /* renamed from: b, reason: collision with root package name */
    public final C1521a f35484b;

    /* renamed from: c, reason: collision with root package name */
    public C1576l f35485c;

    /* renamed from: d, reason: collision with root package name */
    public C1576l f35486d;

    public C2661b() {
        L0.c cVar = AbstractC2662c.f35487a;
        i iVar = i.f6806a;
        C2664e c2664e = new C2664e();
        long j8 = d0.f.f33949b;
        C2660a c2660a = new C2660a();
        c2660a.f35479a = cVar;
        c2660a.f35480b = iVar;
        c2660a.f35481c = c2664e;
        c2660a.f35482d = j8;
        this.f35483a = c2660a;
        this.f35484b = new C1521a(this);
    }

    public static C1576l a(C2661b c2661b, long j8, AbstractC2662c abstractC2662c, float f10, r rVar, int i5) {
        C1576l c1576lG = c2661b.g(abstractC2662c);
        if (f10 != 1.0f) {
            j8 = C2465q.a(j8, C2465q.c(j8) * f10);
        }
        Paint paint = (Paint) c1576lG.f19706b;
        AbstractC3340k.e(paint, "<this>");
        if (!C2465q.b(z.b(paint.getColor()), j8)) {
            c1576lG.e(j8);
        }
        if (((Shader) c1576lG.f19707c) != null) {
            c1576lG.f19707c = null;
            Paint paint2 = (Paint) c1576lG.f19706b;
            AbstractC3340k.e(paint2, "<this>");
            paint2.setShader(null);
        }
        if (!AbstractC3340k.a((r) c1576lG.f19708d, rVar)) {
            c1576lG.f(rVar);
        }
        if (c1576lG.f19705a != i5) {
            c1576lG.d(i5);
        }
        Paint paint3 = (Paint) c1576lG.f19706b;
        AbstractC3340k.e(paint3, "<this>");
        if (paint3.isFilterBitmap()) {
            return c1576lG;
        }
        Paint setNativeFilterQuality = (Paint) c1576lG.f19706b;
        AbstractC3340k.e(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(true);
        return c1576lG;
    }

    @Override // L0.b
    public final float b() {
        return this.f35483a.f35479a.b();
    }

    @Override // g0.InterfaceC2663d
    public final long c() {
        return this.f35484b.y();
    }

    @Override // g0.InterfaceC2663d
    public final void d(C2452d c2452d, long j8, AbstractC2662c style) {
        AbstractC3340k.e(style, "style");
        this.f35483a.f35481c.h(c2452d, j8, e(null, style, 1.0f, null, 1));
    }

    public final C1576l e(AbstractC2461m abstractC2461m, AbstractC2662c abstractC2662c, float f10, r rVar, int i5) {
        C1576l c1576lG = g(abstractC2662c);
        if (abstractC2461m != null) {
            abstractC2461m.a(f10, this.f35484b.y(), c1576lG);
        } else {
            AbstractC3340k.e((Paint) c1576lG.f19706b, "<this>");
            if (r4.getAlpha() / 255.0f != f10) {
                c1576lG.c(f10);
            }
        }
        if (!AbstractC3340k.a((r) c1576lG.f19708d, rVar)) {
            c1576lG.f(rVar);
        }
        if (c1576lG.f19705a != 3) {
            c1576lG.d(3);
        }
        Paint paint = (Paint) c1576lG.f19706b;
        AbstractC3340k.e(paint, "<this>");
        if (paint.isFilterBitmap() == i5) {
            return c1576lG;
        }
        Paint setNativeFilterQuality = (Paint) c1576lG.f19706b;
        AbstractC3340k.e(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(true ^ (i5 == 0));
        return c1576lG;
    }

    @Override // g0.InterfaceC2663d
    public final void f(C2452d image, long j8, long j10, long j11, long j12, float f10, r rVar, int i5) {
        f fVar = f.f35488b;
        AbstractC3340k.e(image, "image");
        this.f35483a.f35481c.b(image, j8, j10, j11, j12, e(null, fVar, f10, rVar, i5));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c7.C1576l g(g0.AbstractC2662c r10) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C2661b.g(g0.c):c7.l");
    }

    @Override // L0.b
    public final float getFontScale() {
        return this.f35483a.f35479a.getFontScale();
    }

    @Override // g0.InterfaceC2663d
    public final i getLayoutDirection() {
        return this.f35483a.f35480b;
    }

    @Override // g0.InterfaceC2663d
    public final void i(C2454f path, AbstractC2461m brush, float f10, AbstractC2662c style) {
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(brush, "brush");
        AbstractC3340k.e(style, "style");
        this.f35483a.f35481c.c(path, e(brush, style, f10, null, 1));
    }

    @Override // L0.b
    public final /* synthetic */ int j(float f10) {
        return AbstractC0279p0.a(this, f10);
    }

    @Override // g0.InterfaceC2663d
    public final void k(long j8, long j10, long j11, float f10, AbstractC2662c abstractC2662c, r rVar, int i5) {
        this.f35483a.f35481c.a(C2384c.b(j10), C2384c.c(j10), d0.f.d(j11) + C2384c.b(j10), d0.f.b(j11) + C2384c.c(j10), a(this, j8, abstractC2662c, f10, rVar, i5));
    }

    @Override // L0.b
    public final /* synthetic */ float l(long j8) {
        return AbstractC0279p0.b(j8, this);
    }

    @Override // L0.b
    public final float t(float f10) {
        return b() * f10;
    }

    @Override // g0.InterfaceC2663d
    public final C1521a u() {
        return this.f35484b;
    }

    @Override // g0.InterfaceC2663d
    public final void w(long j8, float f10, float f11, long j10, long j11, g gVar) {
        this.f35483a.f35481c.r(C2384c.b(j10), C2384c.c(j10), d0.f.d(j11) + C2384c.b(j10), d0.f.b(j11) + C2384c.c(j10), f10, f11, a(this, j8, gVar, 1.0f, null, 3));
    }

    @Override // g0.InterfaceC2663d
    public final long x() {
        long jY = this.f35484b.y();
        return v0.f(d0.f.d(jY) / 2.0f, d0.f.b(jY) / 2.0f);
    }

    @Override // L0.b
    public final /* synthetic */ long y(long j8) {
        return AbstractC0279p0.c(j8, this);
    }

    @Override // g0.InterfaceC2663d
    public final void z(long j8, long j10, long j11, long j12, AbstractC2662c style) {
        AbstractC3340k.e(style, "style");
        this.f35483a.f35481c.n(C2384c.b(j10), C2384c.c(j10), d0.f.d(j11) + C2384c.b(j10), d0.f.b(j11) + C2384c.c(j10), AbstractC2382a.b(j12), AbstractC2382a.c(j12), a(this, j8, style, 1.0f, null, 3));
    }
}
