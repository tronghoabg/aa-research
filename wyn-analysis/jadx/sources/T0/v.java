package t0;

import A7.AbstractC0279p0;
import ba.C1521a;
import d0.AbstractC2382a;
import d0.C2384c;
import e0.AbstractC2461m;
import e0.C2452d;
import e0.C2454f;
import e0.InterfaceC2463o;
import g0.AbstractC2662c;
import g0.C2661b;
import g0.InterfaceC2663d;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class v implements InterfaceC2663d {

    /* renamed from: a, reason: collision with root package name */
    public final C2661b f45543a = new C2661b();

    /* renamed from: b, reason: collision with root package name */
    public C4058f f45544b;

    public final void a() {
        InterfaceC2463o interfaceC2463oV = this.f45543a.f35484b.v();
        C4058f c4058f = this.f45544b;
        AbstractC3340k.b(c4058f);
        C4058f c4058f2 = (C4058f) ((X0.E) c4058f.f15790d);
        if (c4058f2 != null) {
            c4058f2.j(interfaceC2463oV);
        } else {
            ((y) c4058f.f15788b).Z(interfaceC2463oV);
        }
    }

    @Override // L0.b
    public final float b() {
        return this.f45543a.b();
    }

    @Override // g0.InterfaceC2663d
    public final long c() {
        return this.f45543a.f35484b.y();
    }

    @Override // g0.InterfaceC2663d
    public final void d(C2452d c2452d, long j8, AbstractC2662c style) {
        AbstractC3340k.e(style, "style");
        this.f45543a.d(c2452d, j8, style);
    }

    public final void e(AbstractC2461m brush, long j8, long j10, float f10, AbstractC2662c style) {
        AbstractC3340k.e(brush, "brush");
        AbstractC3340k.e(style, "style");
        C2661b c2661b = this.f45543a;
        c2661b.getClass();
        AbstractC3340k.e(brush, "brush");
        AbstractC3340k.e(style, "style");
        c2661b.f35483a.f35481c.a(C2384c.b(j8), C2384c.c(j8), d0.f.d(j10) + C2384c.b(j8), d0.f.b(j10) + C2384c.c(j8), c2661b.e(brush, style, f10, null, 1));
    }

    @Override // g0.InterfaceC2663d
    public final void f(C2452d image, long j8, long j10, long j11, long j12, float f10, e0.r rVar, int i5) {
        AbstractC3340k.e(image, "image");
        this.f45543a.f(image, j8, j10, j11, j12, f10, rVar, i5);
    }

    public final void g(AbstractC2461m brush, long j8, long j10, long j11, float f10, AbstractC2662c style) {
        AbstractC3340k.e(brush, "brush");
        AbstractC3340k.e(style, "style");
        C2661b c2661b = this.f45543a;
        c2661b.getClass();
        AbstractC3340k.e(brush, "brush");
        AbstractC3340k.e(style, "style");
        c2661b.f35483a.f35481c.n(C2384c.b(j8), C2384c.c(j8), d0.f.d(j10) + C2384c.b(j8), d0.f.b(j10) + C2384c.c(j8), AbstractC2382a.b(j11), AbstractC2382a.c(j11), c2661b.e(brush, style, f10, null, 1));
    }

    @Override // L0.b
    public final float getFontScale() {
        return this.f45543a.getFontScale();
    }

    @Override // g0.InterfaceC2663d
    public final L0.i getLayoutDirection() {
        return this.f45543a.f35483a.f35480b;
    }

    @Override // g0.InterfaceC2663d
    public final void i(C2454f path, AbstractC2461m brush, float f10, AbstractC2662c style) {
        AbstractC3340k.e(path, "path");
        AbstractC3340k.e(brush, "brush");
        AbstractC3340k.e(style, "style");
        this.f45543a.i(path, brush, f10, style);
    }

    @Override // L0.b
    public final int j(float f10) {
        C2661b c2661b = this.f45543a;
        c2661b.getClass();
        return AbstractC0279p0.a(c2661b, f10);
    }

    @Override // g0.InterfaceC2663d
    public final void k(long j8, long j10, long j11, float f10, AbstractC2662c abstractC2662c, e0.r rVar, int i5) {
        this.f45543a.k(j8, j10, j11, f10, abstractC2662c, rVar, i5);
    }

    @Override // L0.b
    public final float l(long j8) {
        C2661b c2661b = this.f45543a;
        c2661b.getClass();
        return AbstractC0279p0.b(j8, c2661b);
    }

    @Override // L0.b
    public final float t(float f10) {
        return this.f45543a.b() * f10;
    }

    @Override // g0.InterfaceC2663d
    public final C1521a u() {
        return this.f45543a.f35484b;
    }

    @Override // g0.InterfaceC2663d
    public final void w(long j8, float f10, float f11, long j10, long j11, g0.g gVar) {
        this.f45543a.w(j8, f10, f11, j10, j11, gVar);
    }

    @Override // g0.InterfaceC2663d
    public final long x() {
        return this.f45543a.x();
    }

    @Override // L0.b
    public final long y(long j8) {
        C2661b c2661b = this.f45543a;
        c2661b.getClass();
        return AbstractC0279p0.c(j8, c2661b);
    }

    @Override // g0.InterfaceC2663d
    public final void z(long j8, long j10, long j11, long j12, AbstractC2662c style) {
        AbstractC3340k.e(style, "style");
        this.f45543a.z(j8, j10, j11, j12, style);
    }
}
