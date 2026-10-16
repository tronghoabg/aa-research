package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vwn {
    public int a;
    public defpackage.xyn b = defpackage.xxe.a;
    public byte c;
    public int d;
    private boolean e;
    private defpackage.ygw f;

    public final defpackage.vwo a() {
        int i;
        if (this.f == null) {
            int i2 = defpackage.ygw.d;
            this.f = defpackage.ymx.a;
        }
        if (this.c == 3 && (i = this.d) != 0) {
            return new defpackage.vwo(i, this.a, this.e, this.b, this.f);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.c = (byte) (this.c | 2);
    }
}
