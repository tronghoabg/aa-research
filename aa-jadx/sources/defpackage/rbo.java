package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rbo {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;
    private byte i;

    public final defpackage.rbp a() {
        if (this.i == -1) {
            return new defpackage.rbp(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" useConfigurationContext");
        }
        if ((this.i & 2) == 0) {
            sb.append(" persistProjectionConfigurationContext");
        }
        if ((this.i & 4) == 0) {
            sb.append(" useInternalContext");
        }
        if ((this.i & 8) == 0) {
            sb.append(" crashIfUnableToConfigure");
        }
        if ((this.i & 16) == 0) {
            sb.append(" delayBetweenConfigChecks");
        }
        if ((this.i & 32) == 0) {
            sb.append(" maxConfigChecks");
        }
        if ((this.i & 64) == 0) {
            sb.append(" coolwalkEnabled");
        }
        if ((this.i & 128) == 0) {
            sb.append(" localFocusModeEnabled");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.g = z;
        this.i = (byte) (this.i | 64);
    }

    public final void c(boolean z) {
        this.d = z;
        this.i = (byte) (this.i | 8);
    }

    public final void d(int i) {
        this.e = i;
        this.i = (byte) (this.i | 16);
    }

    public final void e(boolean z) {
        this.h = z;
        this.i = (byte) (this.i | (-128));
    }

    public final void f(int i) {
        this.f = i;
        this.i = (byte) (this.i | 32);
    }

    public final void g(boolean z) {
        this.b = z;
        this.i = (byte) (this.i | 2);
    }

    public final void h(boolean z) {
        this.a = z;
        this.i = (byte) (this.i | 1);
    }

    public final void i(boolean z) {
        this.c = z;
        this.i = (byte) (this.i | 4);
    }
}
