package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class tpa implements java.io.Serializable, java.lang.Comparable {
    public static final defpackage.tpa a = new defpackage.tpa(0, 0);
    static final long serialVersionUID = 3249100930050580838L;
    public final long b;
    public final long c;

    public tpa(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public static defpackage.tpa c(defpackage.abdg abdgVar) {
        return new defpackage.tpa(abdgVar.f, abdgVar.g);
    }

    public static defpackage.tpa d(java.lang.String str) {
        str.getClass();
        int iIndexOf = str.indexOf(":");
        if (iIndexOf > 0) {
            defpackage.ysr.aX(str.length() > 6 && iIndexOf > 2);
            defpackage.ysr.aX(str.charAt(0) == '0' && str.charAt(1) == 'x');
            defpackage.ysr.aX(str.charAt(iIndexOf + 1) == '0' && str.charAt(iIndexOf + 2) == 'x');
            return new defpackage.tpa(defpackage.zfh.i(str.substring(2, iIndexOf), 16), defpackage.zfh.i(str.substring(iIndexOf + 3), 16));
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
                    return new defpackage.tpa(0L, str.indexOf(45) == 0 ? java.lang.Long.parseLong(str) : defpackage.zfh.i(str, 10));
                } catch (java.lang.NumberFormatException e) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "malformed cdocid \"", "\""), e);
                }
            }
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "malformed feature id \"", "\""));
    }

    public static defpackage.tpa e(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            return d(str);
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(defpackage.tpa tpaVar) {
        tpaVar.getClass();
        long j = this.b;
        long j2 = tpaVar.b;
        if (j < j2) {
            return -1;
        }
        if (j == j2) {
            return java.lang.Long.compare(this.c, tpaVar.c);
        }
        return 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.tpa)) {
            return false;
        }
        defpackage.tpa tpaVar = (defpackage.tpa) obj;
        return this.b == tpaVar.b && this.c == tpaVar.c;
    }

    public final java.lang.String f() {
        return "0x" + java.lang.Long.toHexString(this.b) + ":0x" + java.lang.Long.toHexString(this.c);
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return (int) (((j >>> 32) ^ (j ^ j2)) ^ (j2 >>> 32));
    }

    public final java.lang.String toString() {
        return f();
    }
}
