package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class tk {
    public java.lang.Object a;
    public java.lang.Object b = "";
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;

    public final defpackage.adpa a() {
        defpackage.ysr.bk(this.g != null, "Missing required scheme.");
        if (this.d == null) {
            defpackage.ysr.bk(this.a == null, "Cannot set port without host.");
            defpackage.ysr.bk(this.f == null, "Cannot set userInfo without host.");
        }
        return new defpackage.adpa(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    public final void b(java.lang.String str) throws xzp {
        if (str != null) {
            str = defpackage.adpa.b(str.toLowerCase(java.util.Locale.ROOT), defpackage.adpa.e);
        }
        this.d = str;
    }

    public final void c() {
        this.a = null;
    }

    public final void d(java.lang.String str) {
        java.lang.String strSubstring;
        int iIndexOf;
        if (str.startsWith("[") && str.endsWith("]") && (iIndexOf = str.indexOf(37)) > 0) {
            defpackage.adpa.e(str.substring(iIndexOf, str.length() - 1), "scope", defpackage.adpa.d, null);
        }
        int i = defpackage.zeb.a;
        str.getClass();
        int i2 = 4;
        if (str.startsWith("[") && str.endsWith("]")) {
            strSubstring = str.substring(1, str.length() - 1);
            i2 = 16;
        } else {
            strSubstring = str;
        }
        byte[] bArrD = defpackage.zeb.d(strSubstring, null);
        if (((bArrD == null || bArrD.length != i2) ? null : defpackage.zeb.a(bArrD, null)) == null) {
            defpackage.adpa.e(str, "host", defpackage.adpa.e, null);
        }
        this.d = str;
    }

    public final void e(java.lang.String str) {
        if (!str.isEmpty()) {
            if (defpackage.adpa.b.get(str.charAt(0))) {
                for (int i = 0; i < str.length(); i++) {
                    if (!defpackage.adpa.c.get(str.charAt(i))) {
                        throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Invalid character in scheme at index "));
                    }
                }
                this.g = str;
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("Scheme must start with an alphabetic char");
    }

    public final void f() {
        this.f = defpackage.adpa.b(null, defpackage.adpa.f);
    }
}
