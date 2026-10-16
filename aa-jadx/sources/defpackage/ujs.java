package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ujs {
    public byte[] a;
    private java.lang.String b;
    private int c;
    private int d;
    private int e;
    private int f;
    private defpackage.uju g;
    private byte h;

    public final defpackage.ujt a() {
        java.lang.String str;
        defpackage.uju ujuVar;
        if (this.h != 15 || (str = this.b) == null || (ujuVar = this.g) == null) {
            throw new java.lang.IllegalStateException();
        }
        return new defpackage.ujt(str, this.a, this.c, this.d, this.e, this.f, ujuVar);
    }

    public final void b(int i) {
        this.f = i;
        this.h = (byte) (this.h | 8);
    }

    public final void c(int i) {
        this.e = i;
        this.h = (byte) (this.h | 4);
    }

    public final void d(int i) {
        this.d = i;
        this.h = (byte) (this.h | 2);
    }

    public final void e(defpackage.uju ujuVar) {
        ujuVar.getClass();
        this.g = ujuVar;
    }

    public final void f(java.lang.String str) {
        str.getClass();
        this.b = str;
    }

    public final void g(int i) {
        this.c = i;
        this.h = (byte) (this.h | 1);
    }
}
