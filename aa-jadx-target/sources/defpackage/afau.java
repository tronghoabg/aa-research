package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afau<A, B> implements java.io.Serializable {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public afau(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.afau)) {
            return false;
        }
        defpackage.afau afauVar = (defpackage.afau) obj;
        return defpackage.afga.f(this.a, afauVar.a) && defpackage.afga.f(this.b, afauVar.b);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        java.lang.Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }
}
