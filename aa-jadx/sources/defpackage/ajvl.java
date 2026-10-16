package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajvl {
    public final java.lang.String a;
    public final int b;
    public final java.lang.String c;
    public final boolean d;

    public ajvl(java.lang.String str, int i, java.lang.String str2, boolean z) {
        defpackage.aguw.b(str, "Host");
        defpackage.aguw.e(str2, "Path");
        this.a = str.toLowerCase(java.util.Locale.ROOT);
        this.b = i;
        if (defpackage.agwh.a(str2)) {
            this.c = "/";
        } else {
            this.c = str2;
        }
        this.d = z;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[");
        if (this.d) {
            sb.append("(secure)");
        }
        sb.append(this.a);
        sb.append(':');
        sb.append(java.lang.Integer.toString(this.b));
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }
}
