package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bxa implements defpackage.buq {
    private final defpackage.buq a;
    private final int b;
    private int c;

    public bxa(defpackage.buq buqVar, int i) {
        this.a = buqVar;
        this.b = i;
    }

    @Override // defpackage.buq
    public final java.lang.Object a() {
        throw null;
    }

    @Override // defpackage.buq
    public final void b(defpackage.affg affgVar, java.lang.Object obj) {
        this.a.b(affgVar, obj);
    }

    @Override // defpackage.buq
    public final void c() {
        throw null;
    }

    @Override // defpackage.buq
    public final void d(java.lang.Object obj) {
        this.c++;
        this.a.d(obj);
    }

    @Override // defpackage.buq
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.buq
    public final void h() {
        if (this.c <= 0) {
            defpackage.bvg.b("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.h();
    }

    @Override // defpackage.buq
    public final void i(int i, java.lang.Object obj) {
        this.a.i(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.buq
    public final void j(int i, java.lang.Object obj) {
        this.a.j(i + (this.c == 0 ? this.b : 0), obj);
    }

    @Override // defpackage.buq
    public final void k(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.k(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.buq
    public final void l(int i, int i2) {
        this.a.l(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.buq
    public final /* synthetic */ void f() {
    }
}
