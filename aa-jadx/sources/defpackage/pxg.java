package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pxg {
    public final java.lang.String a;
    public final java.lang.Object b;

    public pxg(java.lang.String str, java.lang.Object obj) {
        this.a = str;
        obj.getClass();
        this.b = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pxg) {
            defpackage.pxg pxgVar = (defpackage.pxg) obj;
            if (this.a.equals(pxgVar.a) && this.b.equals(pxgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.b.hashCode() ^ (iHashCode * 1000003);
    }

    public final java.lang.String toString() {
        return "{" + this.a + ", " + this.b.toString() + "}";
    }

    public pxg() {
        throw null;
    }
}
