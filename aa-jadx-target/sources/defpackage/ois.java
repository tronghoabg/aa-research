package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ois extends defpackage.edd {
    public final android.content.Context a;
    public final java.util.concurrent.Executor b;
    public final defpackage.jrj c;
    public final defpackage.mkm d;
    public final j$.util.Optional e;

    public ois(android.content.Context context, java.util.concurrent.Executor executor, defpackage.jrj jrjVar, defpackage.mkm mkmVar, j$.util.Optional optional) {
        this.a = context;
        this.b = executor;
        this.c = jrjVar;
        this.d = mkmVar;
        this.e = optional;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.ois) {
            defpackage.ois oisVar = (defpackage.ois) obj;
            if (j$.util.Objects.equals(this.a, oisVar.a) && j$.util.Objects.equals(this.b, oisVar.b) && j$.util.Objects.equals(this.c, oisVar.c) && j$.util.Objects.equals(this.d, oisVar.d) && j$.util.Objects.equals(this.e, oisVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((j$.util.Objects.hashCode(this.a) * 31) + j$.util.Objects.hashCode(this.b)) * 31) + j$.util.Objects.hashCode(this.c)) * 31) + j$.util.Objects.hashCode(this.d)) * 31) + j$.util.Objects.hashCode(this.e);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {this.a, this.b, this.c, this.d, this.e};
        java.lang.String[] strArrSplit = "context;backgroundExecutor;androidAutoUiMode;sharedServiceConnectionFactory;carSensorReader".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ois[");
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
