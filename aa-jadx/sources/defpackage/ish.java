package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ish {
    public defpackage.xij a;
    public defpackage.xik b;
    public java.lang.Long c;
    public int d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private byte i;

    public final defpackage.isi a() {
        if (this.i == 15) {
            return new defpackage.isi(this.a, this.b, this.c, this.e, this.f, this.g, this.h, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" unsolicited");
        }
        if ((this.i & 2) == 0) {
            sb.append(" responseTimeout");
        }
        if ((this.i & 4) == 0) {
            sb.append(" currentAttempt");
        }
        if ((this.i & 8) == 0) {
            sb.append(" maxAttempts");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.g = i;
        this.i = (byte) (this.i | 4);
    }

    public final void c(int i) {
        this.h = i;
        this.i = (byte) (this.i | 8);
    }

    public final void d(boolean z) {
        this.f = z;
        this.i = (byte) (this.i | 2);
    }

    public final void e(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 1);
    }
}
