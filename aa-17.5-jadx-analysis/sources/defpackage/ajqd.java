package defpackage;

import java.util.Locale;

/* loaded from: classes2.dex */
public final class ajqd {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    static {
        new ajqd(null, -1, null, null);
    }

    public ajqd(ajpe ajpeVar, String str, String str2) {
        ahgm.e(ajpeVar, "Host");
        this.c = ajpeVar.a.toLowerCase(Locale.ROOT);
        int i = ajpeVar.c;
        this.d = i < 0 ? -1 : i;
        this.b = str == null ? null : str;
        this.a = str2.toUpperCase(Locale.ROOT);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajqd)) {
            return super.equals(obj);
        }
        ajqd ajqdVar = (ajqd) obj;
        return a.ao(this.c, ajqdVar.c) && this.d == ajqdVar.d && a.ao(this.b, ajqdVar.b) && a.ao(this.a, ajqdVar.a);
    }

    public final int hashCode() {
        return ahku.c(ahku.c((ahku.c(17, this.c) * 37) + this.d, this.b), this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        if (str != null) {
            sb.append(str.toUpperCase(Locale.ROOT));
            sb.append(' ');
        }
        String str2 = this.b;
        if (str2 != null) {
            sb.append('\'');
            sb.append(str2);
            sb.append('\'');
        } else {
            sb.append("<any realm>");
        }
        String str3 = this.c;
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

    public ajqd(String str, int i, String str2, String str3) {
        this.c = str == null ? null : str.toLowerCase(Locale.ROOT);
        this.d = i < 0 ? -1 : i;
        this.b = str2 == null ? null : str2;
        this.a = str3 != null ? str3.toUpperCase(Locale.ROOT) : null;
    }
}
