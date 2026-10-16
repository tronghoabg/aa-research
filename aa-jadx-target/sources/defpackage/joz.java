package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class joz extends defpackage.edd {
    public final defpackage.jnp a;
    public final defpackage.rxr b;

    public joz(defpackage.jnp jnpVar, defpackage.rxr rxrVar) {
        this.a = jnpVar;
        this.b = rxrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.joz) {
            defpackage.joz jozVar = (defpackage.joz) obj;
            if (j$.util.Objects.equals(this.a, jozVar.a) && j$.util.Objects.equals(this.b, jozVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return defpackage.a.U(this.a, this.b);
    }

    public final java.lang.String toString() {
        int i = 0;
        java.lang.Object[] objArr = {this.a, this.b};
        java.lang.String[] strArrSplit = "session;callback".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("joz[");
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
