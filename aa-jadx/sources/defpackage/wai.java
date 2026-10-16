package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wai {
    public boolean a;
    public byte b;
    private boolean c;

    public final defpackage.waj a() {
        if (this.b == 3) {
            return new defpackage.waj(this.c, this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" useEventNamePostfix");
        }
        if ((this.b & 2) == 0) {
            sb.append(" includeEventNameTag");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = z;
        this.b = (byte) (this.b | 1);
    }
}
