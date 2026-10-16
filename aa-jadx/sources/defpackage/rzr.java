package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rzr {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private byte i;

    public final defpackage.rzs a() {
        if (this.i == -1) {
            return new defpackage.rzs(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" configured");
        }
        if ((this.i & 2) == 0) {
            sb.append(" connected");
        }
        if ((this.i & 4) == 0) {
            sb.append(" dataUnlocked");
        }
        if ((this.i & 8) == 0) {
            sb.append(" functionAccessory");
        }
        if ((this.i & 16) == 0) {
            sb.append(" functionAdb");
        }
        if ((this.i & 32) == 0) {
            sb.append(" functionAudioSource");
        }
        if ((this.i & 64) == 0) {
            sb.append(" functionMtp");
        }
        if ((this.i & 128) == 0) {
            sb.append(" functionPtp");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.a = z;
        this.i = (byte) (this.i | 1);
    }

    public final void c(boolean z) {
        this.b = z;
        this.i = (byte) (this.i | 2);
    }

    public final void d(boolean z) {
        this.c = z;
        this.i = (byte) (this.i | 4);
    }

    public final void e(boolean z) {
        this.d = z;
        this.i = (byte) (this.i | 8);
    }

    public final void f(boolean z) {
        this.e = z;
        this.i = (byte) (this.i | 16);
    }

    public final void g(boolean z) {
        this.f = z;
        this.i = (byte) (this.i | 32);
    }

    public final void h(boolean z) {
        this.g = z;
        this.i = (byte) (this.i | 64);
    }

    public final void i(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | (-128));
    }
}
