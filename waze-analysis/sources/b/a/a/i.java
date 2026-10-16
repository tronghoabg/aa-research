package b.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    double f1701a;

    /* renamed from: b, reason: collision with root package name */
    double f1702b;

    final void a(i iVar) {
        this.f1701a += iVar.f1701a;
        this.f1702b += iVar.f1702b;
    }

    final void b(h hVar, int i2) {
        this.f1701a += hVar.c(i2);
        this.f1702b += hVar.a(i2);
    }

    final void c(h hVar, int i2) {
        hVar.s(i2, this.f1701a);
        hVar.k(i2, this.f1702b);
    }

    final void d(i iVar) {
        double d2 = this.f1701a;
        double d3 = iVar.f1701a;
        double d4 = this.f1702b;
        double d5 = iVar.f1702b;
        this.f1701a = (d3 * d2) + (d4 * d5);
        this.f1702b = ((-d2) * d5) + (d4 * iVar.f1701a);
    }

    final void e(h hVar, int i2) {
        this.f1701a = hVar.c(i2);
        this.f1702b = hVar.a(i2);
    }

    final void f(i iVar) {
        double d2 = this.f1701a;
        double d3 = this.f1702b;
        iVar.f1701a = (d2 * d2) + ((-d3) * d3);
        double d4 = this.f1701a;
        iVar.f1702b = (d4 + d4) * d3;
    }

    final void g(i iVar) {
        this.f1701a -= iVar.f1701a;
        this.f1702b -= iVar.f1702b;
    }

    final void h(h hVar, int i2) {
        this.f1701a -= hVar.c(i2);
        this.f1702b -= hVar.a(i2);
    }

    final void i(i iVar, h hVar, int i2) {
        hVar.s(i2, this.f1701a - iVar.f1701a);
        hVar.k(i2, this.f1702b - iVar.f1702b);
    }
}
