package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajlh {
    public final defpackage.ajja a;
    public final int b;
    public final java.lang.String c;

    public ajlh(defpackage.ajja ajjaVar, int i, java.lang.String str) {
        str.getClass();
        this.a = ajjaVar;
        this.b = i;
        this.c = str;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == defpackage.ajja.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
