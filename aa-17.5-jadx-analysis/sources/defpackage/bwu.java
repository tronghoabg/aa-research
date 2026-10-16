package defpackage;

/* loaded from: classes.dex */
public final class bwu implements buj {
    private final buj a;
    private final int b;
    private int c;

    public bwu(buj bujVar, int i) {
        this.a = bujVar;
        this.b = i;
    }

    @Override // defpackage.buj
    public final Object a() {
        throw null;
    }

    @Override // defpackage.buj
    public final void b(afeg afegVar, Object obj) {
        this.a.b(afegVar, obj);
    }

    @Override // defpackage.buj
    public final void c() {
        throw null;
    }

    @Override // defpackage.buj
    public final void d(Object obj) {
        this.c++;
        this.a.d(obj);
    }

    @Override // defpackage.buj
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.buj
    public final void h() {
        if (this.c <= 0) {
            buz.b("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.h();
    }

    @Override // defpackage.buj
    public final void i(int i, Object obj) {
        this.a.i(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.buj
    public final void j(int i, Object obj) {
        this.a.j(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.buj
    public final void k(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.k(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.buj
    public final void l(int i, int i2) {
        this.a.l(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.buj
    public final /* synthetic */ void f() {
    }
}
