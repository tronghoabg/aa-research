package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xyb implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    public final java.lang.Object a;
    private final defpackage.xyc b;

    public xyb(defpackage.xyc xycVar, java.lang.Object obj) {
        this.b = xycVar;
        this.a = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.xyb)) {
            return false;
        }
        defpackage.xyb xybVar = (defpackage.xyb) obj;
        defpackage.xyc xycVar = this.b;
        if (xycVar.equals(xybVar.b)) {
            return xycVar.d(this.a, xybVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.c(this.a);
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.a;
        return this.b.toString() + ".wrap(" + java.lang.String.valueOf(obj) + ")";
    }
}
