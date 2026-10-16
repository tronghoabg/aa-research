package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abgq {
    private byte[] a;
    private int b;
    private int c;

    final void a() {
        this.a = defpackage.abgs.r;
    }

    public final void b(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = this.b; i < this.b + this.c; i++) {
            int i2 = this.a[i] & 255;
            if (i2 < 8) {
                sb.append("\\00".concat(java.lang.String.valueOf(java.lang.Integer.toOctalString(i2))));
            } else if (i2 == 9) {
                sb.append("\\t");
            } else if (i2 == 10) {
                sb.append("\\n");
            } else if (i2 == 13) {
                sb.append("\\r");
            } else if (i2 < 32) {
                sb.append("\\0".concat(java.lang.String.valueOf(java.lang.Integer.toOctalString(i2))));
            } else if (i2 > 126) {
                sb.append("\\".concat(java.lang.String.valueOf(java.lang.Integer.toOctalString(i2))));
            } else if (i2 == 34) {
                sb.append("\\\"");
            } else if (i2 == 39) {
                sb.append("\\'");
            } else if (i2 == 92) {
                sb.append("\\\\");
            } else {
                sb.append((char) i2);
            }
        }
        return sb.toString();
    }
}
