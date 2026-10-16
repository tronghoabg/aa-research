package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class ajqt implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;
    public final java.lang.String d = "HTTP";
    public final int e;
    public final int f;

    public ajqt(int i, int i2) {
        defpackage.aguw.d(i, "Protocol major version");
        this.e = i;
        defpackage.aguw.d(i2, "Protocol minor version");
        this.f = i2;
    }

    public final boolean a(defpackage.ajqt ajqtVar) {
        if (ajqtVar != null) {
            java.lang.String str = this.d;
            java.lang.String str2 = ajqtVar.d;
            if (str.equals(str2)) {
                boolean zEquals = str.equals(str2);
                java.lang.Object[] objArr = {this, ajqtVar};
                if (!zEquals) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format("Versions for different protocols cannot be compared: %s %s", objArr));
                }
                int i = this.e - ajqtVar.e;
                if (i == 0) {
                    i = this.f - ajqtVar.f;
                }
                if (i <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ajqt)) {
            return false;
        }
        defpackage.ajqt ajqtVar = (defpackage.ajqt) obj;
        return this.d.equals(ajqtVar.d) && this.e == ajqtVar.e && this.f == ajqtVar.f;
    }

    public final int hashCode() {
        return this.f ^ ((this.e * 100000) ^ this.d.hashCode());
    }

    public final java.lang.String toString() {
        return this.d + '/' + java.lang.Integer.toString(this.e) + '.' + java.lang.Integer.toString(this.f);
    }
}
