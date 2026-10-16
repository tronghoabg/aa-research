package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mnm {
    public java.lang.String a;
    public int b;
    public byte c;
    private char d;
    private boolean e;
    private boolean f;

    public final defpackage.mnn a() {
        if (this.c == 63) {
            return new defpackage.mnn(this.a, this.b, this.d, this.e, this.f);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" width");
        }
        if ((this.c & 2) == 0) {
            sb.append(" minWidth");
        }
        if ((this.c & 4) == 0) {
            sb.append(" maxWidth");
        }
        if ((this.c & 8) == 0) {
            sb.append(" border");
        }
        if ((this.c & 16) == 0) {
            sb.append(" autoWidth");
        }
        if ((this.c & 32) == 0) {
            sb.append(" leftAligned");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b() {
        this.e = true;
        this.c = (byte) (this.c | 16);
    }

    public final void c(char c) {
        this.d = c;
        this.c = (byte) (this.c | 8);
    }

    public final void d(boolean z) {
        this.f = z;
        this.c = (byte) (this.c | 32);
    }

    public final defpackage.hhr e() {
        if (this.c == 63) {
            return new defpackage.hhr(this.a, this.b, this.d, this.e, this.f);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" width");
        }
        if ((this.c & 2) == 0) {
            sb.append(" minWidth");
        }
        if ((this.c & 4) == 0) {
            sb.append(" maxWidth");
        }
        if ((this.c & 8) == 0) {
            sb.append(" border");
        }
        if ((this.c & 16) == 0) {
            sb.append(" autoWidth");
        }
        if ((this.c & 32) == 0) {
            sb.append(" leftAligned");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void f() {
        this.e = true;
        this.c = (byte) (this.c | 16);
    }

    public final void g(char c) {
        this.d = c;
        this.c = (byte) (this.c | 8);
    }

    public final void h(boolean z) {
        this.f = z;
        this.c = (byte) (this.c | 32);
    }
}
