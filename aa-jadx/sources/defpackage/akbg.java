package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbg implements java.lang.Cloneable, java.io.Serializable, defpackage.ajqp {
    private static final long serialVersionUID = -6437800749411518984L;
    public final java.lang.String a;
    public final java.lang.String b;

    public akbg(java.lang.String str, java.lang.String str2) {
        defpackage.aguw.e(str, "Name");
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ajqp
    public final java.lang.String b() {
        return this.a;
    }

    @Override // defpackage.ajqp
    public final java.lang.String c() {
        return this.b;
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ajqp) {
            defpackage.akbg akbgVar = (defpackage.akbg) obj;
            if (this.a.equals(akbgVar.a) && defpackage.a.an(this.b, akbgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return defpackage.agwh.c(defpackage.agwh.c(17, this.a), this.b);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.b;
        java.lang.String str2 = this.a;
        if (str == null) {
            return str2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str2.length() + 1 + str.length());
        sb.append(str2);
        sb.append("=");
        sb.append(str);
        return sb.toString();
    }
}
