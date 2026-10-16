package defpackage;

/* loaded from: classes2.dex */
final class sbd {
    public xxh a;
    public xxh b;
    public xxh c;
    private boolean d;
    private boolean e;
    private xxh f;
    private final xxh g;
    private byte h;

    public sbd() {
        xvy xvyVar = xvy.a;
        this.f = xvyVar;
        this.a = xvyVar;
        this.b = xvyVar;
        this.c = xvyVar;
        this.g = xvyVar;
    }

    public final sbe a() {
        if (this.h == 3) {
            return new sbe(this.d, this.e, this.f, this.a, this.b, this.c, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" showNotification");
        }
        if ((this.h & 2) == 0) {
            sb.append(" dismissNotification");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.h = (byte) (this.h | 2);
    }

    public final void c(boolean z) {
        this.d = z;
        this.h = (byte) (this.h | 1);
    }

    public final void d(String str) {
        this.f = xxh.h(str);
    }
}
