package vd;

import A7.C0237b0;
import java.util.concurrent.atomic.AtomicLong;
import md.AbstractC3541i;
import md.C3534b;
import md.b0;
import md.k0;

/* loaded from: classes5.dex */
public final class n extends AbstractC3541i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3541i f47204b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f47205c;

    public n(p pVar, AbstractC3541i abstractC3541i) {
        this.f47205c = pVar;
        this.f47204b = abstractC3541i;
    }

    @Override // md.AbstractC3541i
    public final void a() {
        this.f47204b.a();
    }

    @Override // md.AbstractC3541i
    public final void b() {
        this.f47204b.b();
    }

    @Override // md.AbstractC3541i
    public final void c(int i5) {
        this.f47204b.c(i5);
    }

    @Override // md.AbstractC3541i
    public final void d(int i5, long j8) {
        this.f47204b.d(i5, j8);
    }

    @Override // md.AbstractC3541i
    public final void e(b0 b0Var) {
        this.f47204b.e(b0Var);
    }

    @Override // md.AbstractC3541i
    public final void f(long j8) {
        this.f47204b.f(j8);
    }

    @Override // md.AbstractC3541i
    public final void g(long j8) {
        this.f47204b.g(j8);
    }

    @Override // md.AbstractC3541i
    public final void h() {
        this.f47204b.h();
    }

    @Override // md.AbstractC3541i
    public final void i(int i5) {
        this.f47204b.i(i5);
    }

    @Override // md.AbstractC3541i
    public final void j(int i5, long j8, long j10) {
        this.f47204b.j(i5, j8, j10);
    }

    @Override // md.AbstractC3541i
    public final void k(long j8) {
        this.f47204b.k(j8);
    }

    @Override // md.AbstractC3541i
    public final void l(long j8) {
        this.f47204b.l(j8);
    }

    @Override // md.AbstractC3541i
    public final void m(k0 k0Var) {
        k kVar = this.f47205c.f47207a;
        boolean zF = k0Var.f();
        m mVar = kVar.f47188a;
        if (mVar.f47201e != null || mVar.f47202f != null) {
            if (zF) {
                ((AtomicLong) kVar.f47189b.f45906a).getAndIncrement();
            } else {
                ((AtomicLong) kVar.f47189b.f45907b).getAndIncrement();
            }
        }
        this.f47204b.m(k0Var);
    }

    @Override // md.AbstractC3541i
    public final void n(C3534b c3534b, b0 b0Var) {
        this.f47204b.n(c3534b, b0Var);
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f47204b, "delegate");
        return c0237b0S.toString();
    }
}
