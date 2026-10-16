package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abgo extends defpackage.abgs {
    public final defpackage.abol a;
    public final defpackage.abgp b = new defpackage.abgp(1);
    public final defpackage.abgr c = new defpackage.abgr();
    private final defpackage.abgr e = new defpackage.abgr();
    public defpackage.abgq d = null;

    public abgo(defpackage.abol abolVar) {
        this.a = abolVar;
    }

    public final int a() {
        return this.e.b;
    }

    @Override // defpackage.abgs
    public final void b() {
        super.b();
        this.b.c();
        this.c.c();
        this.e.c();
        defpackage.abgq abgqVar = this.d;
        if (abgqVar != null) {
            abgqVar.a();
        }
    }

    @Override // defpackage.abgs
    protected final void c(int i, int i2, int i3) {
        if (i == 1) {
            this.c.f(i2, i3);
        } else if (i == 2) {
            this.e.f(i2, i3);
        } else {
            if (i != 4) {
                return;
            }
            this.b.d(0, i2, i3);
        }
    }

    public final long d(int i) {
        defpackage.abgr abgrVar = this.c;
        return j(abgrVar.b(i), abgrVar.a(i));
    }

    public final defpackage.abed e(int i) throws defpackage.abpp {
        defpackage.abed abedVar = defpackage.abed.a;
        defpackage.abqe abqeVarL = defpackage.abox.L(defpackage.abed.class);
        byte[] bArr = this.s;
        defpackage.abgr abgrVar = this.e;
        return (defpackage.abed) abqeVarL.k(bArr, abgrVar.b(i), abgrVar.a(i), this.a);
    }

    @Override // defpackage.abgs
    protected final boolean p(int i) {
        return i == 3;
    }
}
