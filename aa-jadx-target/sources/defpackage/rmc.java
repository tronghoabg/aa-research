package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rmc {
    public defpackage.rmo a;
    private boolean b;
    private int c;
    private byte d;

    public final defpackage.rmd a() {
        defpackage.rmo rmoVar;
        if (this.d == 3 && (rmoVar = this.a) != null) {
            return new defpackage.rmd(this.b, this.c, rmoVar);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" isEnabled");
        }
        if ((this.d & 2) == 0) {
            sb.append(" bufferSize");
        }
        if (this.a == null) {
            sb.append(" galMessageFilter");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.c = i;
        this.d = (byte) (this.d | 2);
    }

    public final void c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 1);
    }
}
