package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class acle {
    public defpackage.acks a;
    public defpackage.ackr b;
    public defpackage.ackv c;
    public int d = -1;
    public defpackage.ackw e;

    public static boolean a(int i) {
        return i >= 0 && i < 8;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(200);
        sb.append("<<\n mode: ");
        sb.append(this.a);
        sb.append("\n ecLevel: ");
        sb.append(this.b);
        sb.append("\n version: ");
        sb.append(this.c);
        sb.append("\n maskPattern: ");
        sb.append(this.d);
        if (this.e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
