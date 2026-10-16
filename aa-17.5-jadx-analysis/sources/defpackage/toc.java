package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class toc implements Serializable, Comparable {
    public static final toc a = new toc(0, 0);
    static final long serialVersionUID = 3249100930050580838L;
    public final long b;
    public final long c;

    public toc(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public static toc c(abcd abcdVar) {
        return new toc(abcdVar.f, abcdVar.g);
    }

    public static toc d(String str) {
        str.getClass();
        int iIndexOf = str.indexOf(":");
        if (iIndexOf > 0) {
            woy.N(str.length() > 6 && iIndexOf > 2);
            woy.N(str.charAt(0) == '0' && str.charAt(1) == 'x');
            woy.N(str.charAt(iIndexOf + 1) == '0' && str.charAt(iIndexOf + 2) == 'x');
            return new toc(zeb.i(str.substring(2, iIndexOf), 16), zeb.i(str.substring(iIndexOf + 3), 16));
        }
        int length = str.length();
        if (length != 0) {
            int i = str.charAt(0) != '-' ? 0 : 1;
            if (length - i <= 20) {
                while (i < length) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt >= '0' && cCharAt <= '9') {
                        i++;
                    }
                }
                try {
                    return new toc(0L, str.indexOf(45) == 0 ? Long.parseLong(str) : zeb.i(str, 10));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException(a.bq(str, "malformed cdocid \"", "\""), e);
                }
            }
        }
        throw new IllegalArgumentException(a.bq(str, "malformed feature id \"", "\""));
    }

    public static toc e(String str) {
        if (str == null) {
            return null;
        }
        try {
            return d(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(toc tocVar) {
        tocVar.getClass();
        long j = this.b;
        long j2 = tocVar.b;
        if (j < j2) {
            return -1;
        }
        if (j == j2) {
            return Long.compare(this.c, tocVar.c);
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof toc)) {
            return false;
        }
        toc tocVar = (toc) obj;
        return this.b == tocVar.b && this.c == tocVar.c;
    }

    public final String f() {
        return "0x" + Long.toHexString(this.b) + ":0x" + Long.toHexString(this.c);
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return (int) (((j >>> 32) ^ (j ^ j2)) ^ (j2 >>> 32));
    }

    public final String toString() {
        return f();
    }
}
