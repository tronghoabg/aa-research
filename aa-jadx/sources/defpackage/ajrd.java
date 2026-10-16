package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajrd {
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final int d;

    static {
        new defpackage.ajrd(null, -1, null, null);
    }

    public ajrd(defpackage.ajqe ajqeVar, java.lang.String str, java.lang.String str2) {
        defpackage.aguw.e(ajqeVar, "Host");
        this.c = ajqeVar.a.toLowerCase(java.util.Locale.ROOT);
        int i = ajqeVar.c;
        this.d = i < 0 ? -1 : i;
        this.b = str == null ? null : str;
        this.a = str2.toUpperCase(java.util.Locale.ROOT);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof defpackage.ajrd)) {
            return super.equals(obj);
        }
        defpackage.ajrd ajrdVar = (defpackage.ajrd) obj;
        return defpackage.a.an(this.c, ajrdVar.c) && this.d == ajrdVar.d && defpackage.a.an(this.b, ajrdVar.b) && defpackage.a.an(this.a, ajrdVar.a);
    }

    public final int hashCode() {
        return defpackage.agwh.c(defpackage.agwh.c((defpackage.agwh.c(17, this.c) * 37) + this.d, this.b), this.a);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = this.a;
        if (str != null) {
            sb.append(str.toUpperCase(java.util.Locale.ROOT));
            sb.append(' ');
        }
        java.lang.String str2 = this.b;
        if (str2 != null) {
            sb.append('\'');
            sb.append(str2);
            sb.append('\'');
        } else {
            sb.append("<any realm>");
        }
        java.lang.String str3 = this.c;
        if (str3 != null) {
            sb.append('@');
            sb.append(str3);
            int i = this.d;
            if (i >= 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public ajrd(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
        this.c = str == null ? null : str.toLowerCase(java.util.Locale.ROOT);
        this.d = i < 0 ? -1 : i;
        this.b = str2 == null ? null : str2;
        this.a = str3 != null ? str3.toUpperCase(java.util.Locale.ROOT) : null;
    }
}
