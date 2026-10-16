package defpackage;

/* loaded from: classes3.dex */
public final class uix {
    public byte[] a;
    private String b;
    private int c;
    private int d;
    private int e;
    private int f;
    private uiz g;
    private byte h;

    public final uiy a() {
        String str;
        uiz uizVar;
        if (this.h != 15 || (str = this.b) == null || (uizVar = this.g) == null) {
            throw new IllegalStateException();
        }
        return new uiy(str, this.a, this.c, this.d, this.e, this.f, uizVar);
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

    public final void e(uiz uizVar) {
        uizVar.getClass();
        this.g = uizVar;
    }

    public final void f(String str) {
        str.getClass();
        this.b = str;
    }

    public final void g(int i) {
        this.c = i;
        this.h = (byte) (this.h | 1);
    }
}
