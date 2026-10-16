package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dzp {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public dzp(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.dzp)) {
            return false;
        }
        defpackage.dzp dzpVar = (defpackage.dzp) obj;
        return j$.util.Objects.equals(dzpVar.a, this.a) && j$.util.Objects.equals(dzpVar.b, this.b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
