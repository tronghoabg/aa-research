package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class sca {
    public defpackage.xyn a;
    public defpackage.xyn b;
    public defpackage.xyn c;
    private boolean d;
    private boolean e;
    private defpackage.xyn f;
    private final defpackage.xyn g;
    private byte h;

    public sca() {
        defpackage.xxe xxeVar = defpackage.xxe.a;
        this.f = xxeVar;
        this.a = xxeVar;
        this.b = xxeVar;
        this.c = xxeVar;
        this.g = xxeVar;
    }

    public final defpackage.scb a() {
        if (this.h == 3) {
            return new defpackage.scb(this.d, this.e, this.f, this.a, this.b, this.c, this.g);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" showNotification");
        }
        if ((this.h & 2) == 0) {
            sb.append(" dismissNotification");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.h = (byte) (this.h | 2);
    }

    public final void c(boolean z) {
        this.d = z;
        this.h = (byte) (this.h | 1);
    }

    public final void d(java.lang.String str) {
        this.f = defpackage.xyn.h(str);
    }
}
