package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rgb {
    public defpackage.xij a;
    public defpackage.xik b;
    private boolean c;
    private boolean d;
    private int e;
    private int f;
    private boolean g;
    private byte h;

    public final defpackage.rgc a() {
        if (this.h == 31) {
            return new defpackage.rgc(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.h & 1) == 0) {
            sb.append(" unsolicited");
        }
        if ((this.h & 2) == 0) {
            sb.append(" responseTimeout");
        }
        if ((this.h & 4) == 0) {
            sb.append(" currentAttempt");
        }
        if ((this.h & 8) == 0) {
            sb.append(" maxAttempts");
        }
        if ((this.h & 16) == 0) {
            sb.append(" restoreLossTr");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.e = i;
        this.h = (byte) (this.h | 4);
    }

    public final void c(int i) {
        this.f = i;
        this.h = (byte) (this.h | 8);
    }

    public final void d(boolean z) {
        this.d = z;
        this.h = (byte) (this.h | 2);
    }

    public final void e(boolean z) {
        this.g = z;
        this.h = (byte) (this.h | 16);
    }

    public final void f(boolean z) {
        this.c = z;
        this.h = (byte) (this.h | 1);
    }
}
