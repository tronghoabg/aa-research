package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vxi {
    public defpackage.xyn a = defpackage.xxe.a;
    public byte b;
    public int c;

    public final defpackage.vxj a() {
        int i;
        if (this.b == 1 && (i = this.c) != 0) {
            return new defpackage.vxj(i, this.a);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.b == 0) {
            sb.append(" manualCapture");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
