package defpackage;

import java.nio.charset.CharacterCodingException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class tf {
    public Object a;
    public Object b = "";
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public final adnz a() {
        woy.aa(this.g != null, "Missing required scheme.");
        if (this.d == null) {
            woy.aa(this.a == null, "Cannot set port without host.");
            woy.aa(this.f == null, "Cannot set userInfo without host.");
        }
        return new adnz(this);
    }

    public final void b(String str) throws CharacterCodingException {
        if (str != null) {
            str = adnz.b(str.toLowerCase(Locale.ROOT), adnz.e);
        }
        this.d = str;
    }

    public final void c() {
        this.a = null;
    }

    public final void d(String str) {
        String strSubstring;
        int iIndexOf;
        if (str.startsWith("[") && str.endsWith("]") && (iIndexOf = str.indexOf(37)) > 0) {
            adnz.e(str.substring(iIndexOf, str.length() - 1), "scope", adnz.d, null);
        }
        int i = zcv.a;
        str.getClass();
        int i2 = 4;
        if (str.startsWith("[") && str.endsWith("]")) {
            strSubstring = str.substring(1, str.length() - 1);
            i2 = 16;
        } else {
            strSubstring = str;
        }
        byte[] bArrD = zcv.d(strSubstring, null);
        if (((bArrD == null || bArrD.length != i2) ? null : zcv.a(bArrD, null)) == null) {
            adnz.e(str, "host", adnz.e, null);
        }
        this.d = str;
    }

    public final void e(String str) {
        if (!str.isEmpty()) {
            if (adnz.b.get(str.charAt(0))) {
                for (int i = 0; i < str.length(); i++) {
                    if (!adnz.c.get(str.charAt(i))) {
                        throw new IllegalArgumentException(a.bp(i, "Invalid character in scheme at index "));
                    }
                }
                this.g = str;
                return;
            }
        }
        throw new IllegalArgumentException("Scheme must start with an alphabetic char");
    }

    public final void f() {
        this.f = adnz.b(null, adnz.f);
    }
}
