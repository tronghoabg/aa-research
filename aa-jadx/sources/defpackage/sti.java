package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sti {
    public int a;
    public int b;
    private java.lang.String c;
    private byte d;

    public final void a() {
        this.c = "";
    }

    public final void b() {
        this.d = (byte) 1;
    }

    public final void c() {
        if (this.d == 1 && this.c != null && this.a != 0 && this.b != 0) {
            int i = defpackage.stj.a;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == null) {
            sb.append(" fileOwner");
        }
        if (this.d == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.a == 0) {
            sb.append(" fileChecks");
        }
        if (this.b == 0) {
            sb.append(" filePurpose");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
