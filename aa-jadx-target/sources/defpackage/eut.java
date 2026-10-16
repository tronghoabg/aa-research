package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eut {
    public final int a;
    public defpackage.evk b = null;
    public android.os.Bundle c = null;

    public eut(int i) {
        this.a = i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.eut)) {
            return false;
        }
        defpackage.eut eutVar = (defpackage.eut) obj;
        if (this.a != eutVar.a || !defpackage.afga.f(this.b, eutVar.b)) {
            return false;
        }
        android.os.Bundle bundle = this.c;
        android.os.Bundle bundle2 = eutVar.c;
        if (defpackage.afga.f(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !defpackage.ckn.j(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        defpackage.evk evkVar = this.b;
        int iHashCode = evkVar != null ? evkVar.hashCode() : 0;
        int i = this.a;
        android.os.Bundle bundle = this.c;
        int i2 = (i * 31) + iHashCode;
        return bundle != null ? (i2 * 31) + defpackage.ckn.i(bundle) : i2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(java.lang.Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
