package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xyo implements java.io.Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final java.lang.Object a;
    public final java.lang.Object b;

    public xyo(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.xyo) {
            defpackage.xyo xyoVar = (defpackage.xyo) obj;
            if (j$.util.Objects.equals(this.a, xyoVar.a) && j$.util.Objects.equals(this.b, xyoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.Object obj = this.b;
        return "(" + java.lang.String.valueOf(this.a) + ", " + java.lang.String.valueOf(obj) + ")";
    }
}
