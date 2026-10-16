package defpackage;

/* loaded from: classes.dex */
public final class vvs {
    public int a;
    public xxh b = xvy.a;
    public byte c;
    public int d;
    private boolean e;
    private yfq f;

    public final vvt a() {
        int i;
        if (this.f == null) {
            int i2 = yfq.d;
            this.f = yls.a;
        }
        if (this.c == 3 && (i = this.d) != 0) {
            return new vvt(i, this.a, this.e, this.b, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" enablement");
        }
        if ((this.c & 1) == 0) {
            sb.append(" batchSize");
        }
        if ((this.c & 2) == 0) {
            sb.append(" enableUrlAutoSanitization");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.c = (byte) (this.c | 2);
    }
}
