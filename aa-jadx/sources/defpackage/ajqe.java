package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ajqe implements java.lang.Cloneable, java.io.Serializable {
    private static final long serialVersionUID = -7529410654042457626L;
    public final java.lang.String a;
    protected final java.lang.String b;
    public final int c;
    public final java.lang.String d;
    public final java.net.InetAddress e;

    public ajqe(java.lang.String str, int i, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("Host name may not be null");
        }
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("Host name may not be empty");
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (java.lang.Character.isWhitespace(str.charAt(i2))) {
                throw new java.lang.IllegalArgumentException("Host name may not contain blanks");
            }
        }
        this.a = str;
        this.b = str.toLowerCase(java.util.Locale.ROOT);
        if (str2 != null) {
            this.d = str2.toLowerCase(java.util.Locale.ROOT);
        } else {
            this.d = "http";
        }
        this.c = i;
        this.e = null;
    }

    public final java.lang.String a() {
        int i = this.c;
        java.lang.String str = this.a;
        if (i == -1) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 6);
        sb.append(str);
        sb.append(":");
        sb.append(java.lang.Integer.toString(i));
        return sb.toString();
    }

    public final java.lang.String b() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.d);
        sb.append("://");
        sb.append(this.a);
        int i = this.c;
        if (i != -1) {
            sb.append(':');
            sb.append(java.lang.Integer.toString(i));
        }
        return sb.toString();
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        return super.clone();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ajqe) {
            defpackage.ajqe ajqeVar = (defpackage.ajqe) obj;
            if (this.b.equals(ajqeVar.b) && this.c == ajqeVar.c && this.d.equals(ajqeVar.d)) {
                java.net.InetAddress inetAddress = ajqeVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return defpackage.agwh.c((defpackage.agwh.c(17, this.b) * 37) + this.c, this.d);
    }

    public final java.lang.String toString() {
        return b();
    }
}
