package defpackage;

import java.io.Serializable;
import java.net.InetAddress;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class ajpe implements Cloneable, Serializable {
    private static final long serialVersionUID = -7529410654042457626L;
    public final String a;
    protected final String b;
    public final int c;
    public final String d;
    public final InetAddress e;

    public ajpe(String str, int i, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Host name may not be null");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("Host name may not be empty");
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (Character.isWhitespace(str.charAt(i2))) {
                throw new IllegalArgumentException("Host name may not contain blanks");
            }
        }
        this.a = str;
        this.b = str.toLowerCase(Locale.ROOT);
        if (str2 != null) {
            this.d = str2.toLowerCase(Locale.ROOT);
        } else {
            this.d = "http";
        }
        this.c = i;
        this.e = null;
    }

    public final String a() {
        int i = this.c;
        String str = this.a;
        if (i == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 6);
        sb.append(str);
        sb.append(":");
        sb.append(Integer.toString(i));
        return sb.toString();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append("://");
        sb.append(this.a);
        int i = this.c;
        if (i != -1) {
            sb.append(':');
            sb.append(Integer.toString(i));
        }
        return sb.toString();
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajpe) {
            ajpe ajpeVar = (ajpe) obj;
            if (this.b.equals(ajpeVar.b) && this.c == ajpeVar.c && this.d.equals(ajpeVar.d)) {
                InetAddress inetAddress = ajpeVar.e;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ahku.c((ahku.c(17, this.b) * 37) + this.c, this.d);
    }

    public final String toString() {
        return b();
    }
}
