package od;

import A7.C0237b0;
import Va.X7;
import md.C3551t;
import md.InterfaceC3543k;
import td.C4157a;

/* renamed from: od.j0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3696j0 implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f41995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3699k0 f41996b;

    public C3696j0(C3699k0 c3699k0, r rVar) {
        this.f41996b = c3699k0;
        this.f41995a = rVar;
    }

    @Override // od.X1
    public final void a(InterfaceC3543k interfaceC3543k) {
        this.f41995a.a(interfaceC3543k);
    }

    @Override // od.r
    public final void b(int i5) {
        this.f41995a.b(i5);
    }

    @Override // od.X1
    public final void c(C4157a c4157a) {
        this.f41995a.c(c4157a);
    }

    @Override // od.X1
    public final void d(int i5) {
        this.f41995a.d(i5);
    }

    @Override // od.r
    public final void e(int i5) {
        this.f41995a.e(i5);
    }

    @Override // od.r
    public final void f(md.r rVar) {
        this.f41995a.f(rVar);
    }

    @Override // od.X1
    public final void flush() {
        this.f41995a.flush();
    }

    @Override // od.r
    public final void g(md.k0 k0Var) {
        this.f41995a.g(k0Var);
    }

    @Override // od.X1
    public final void h() {
        this.f41995a.h();
    }

    @Override // od.r
    public final void i(N.J0 j02) {
        this.f41995a.i(j02);
    }

    @Override // od.X1
    public final boolean isReady() {
        return this.f41995a.isReady();
    }

    @Override // od.r
    public final void j() {
        this.f41995a.j();
    }

    @Override // od.r
    public final void k(InterfaceC3724t interfaceC3724t) {
        X7 x72 = this.f41996b.f42001b;
        ((InterfaceC3734w0) x72.f13842b).a();
        ((Y1) x72.f13841a).d();
        this.f41995a.k(new a2(2, this, interfaceC3724t));
    }

    @Override // od.r
    public final void l(C3551t c3551t) {
        this.f41995a.l(c3551t);
    }

    public final String toString() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f41995a, "delegate");
        return c0237b0S.toString();
    }
}
