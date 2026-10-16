package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mpl {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private byte g;

    public final defpackage.mpm a() {
        if (this.g == 63) {
            return new defpackage.mpm(this.a, this.b, this.c, this.d, this.e, this.f);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" showLeft");
        }
        if ((this.g & 2) == 0) {
            sb.append(" showTop");
        }
        if ((this.g & 4) == 0) {
            sb.append(" showRight");
        }
        if ((this.g & 8) == 0) {
            sb.append(" showBottom");
        }
        if ((this.g & 16) == 0) {
            sb.append(" isGradient");
        }
        if ((this.g & 32) == 0) {
            sb.append(" focusable");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 32);
    }

    public final void c(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 16);
    }

    public final void d(boolean z) {
        this.d = z;
        this.g = (byte) (this.g | 8);
    }

    public final void e(boolean z) {
        this.a = z;
        this.g = (byte) (this.g | 1);
    }

    public final void f(boolean z) {
        this.c = z;
        this.g = (byte) (this.g | 4);
    }

    public final void g(boolean z) {
        this.b = z;
        this.g = (byte) (this.g | 2);
    }
}
