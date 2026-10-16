package defpackage;

/* loaded from: classes2.dex */
final class phm implements paa {
    final /* synthetic */ paa a;
    final /* synthetic */ pho b;

    public phm(pho phoVar, paa paaVar) {
        this.a = paaVar;
        this.b = phoVar;
    }

    @Override // defpackage.paa
    public final void a(xpr xprVar, abow abowVar) {
        this.b.h(false, new oey(this.a, xprVar, abowVar, 16, (short[]) null));
    }

    @Override // defpackage.paa
    public final void b() {
        paa paaVar = this.a;
        paaVar.getClass();
        this.b.h(true, new pfp(paaVar, 8));
    }

    @Override // defpackage.paa
    public final void c() {
        paa paaVar = this.a;
        paaVar.getClass();
        this.b.h(true, new pfp(paaVar, 9));
    }

    @Override // defpackage.paa
    public final void d(xpr xprVar, abow abowVar) {
        this.b.h(false, new oey(this.a, xprVar, abowVar, 17, (short[]) null));
    }

    @Override // defpackage.paa
    public final void e() {
        paa paaVar = this.a;
        paaVar.getClass();
        this.b.h(true, new pfp(paaVar, 10));
    }

    @Override // defpackage.paa
    public final void f(int i) {
        this.b.h(i == 1, new hhx(this.a, i, 17));
    }
}
