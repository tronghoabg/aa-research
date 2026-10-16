package defpackage;

import j$.util.Optional;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class kqf {
    public int a;
    public int b;
    public Object c;
    public Object d;

    public kqf(kqg kqgVar) {
        this.c = Optional.empty();
        this.d = Optional.empty();
        this.c = kqgVar.a;
        this.d = kqgVar.b;
        this.a = kqgVar.c;
        this.b = kqgVar.d;
    }

    public static final boolean w(int i) {
        return i == 32 || i == 10 || i == 13 || i == 9;
    }

    public final kqg a() {
        int i;
        int i2 = this.a;
        if (i2 != 0 && (i = this.b) != 0) {
            return new kqg((Optional) this.c, (Optional) this.d, i2, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" supportedConnection");
        }
        if (this.b == 0) {
            sb.append(" projectionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null bluetoothDevice");
        }
        this.d = optional;
    }

    public final void c(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null carInfoInternal");
        }
        this.c = optional;
    }

    public final void d(int i) {
        if (i == 0) {
            throw new NullPointerException("Null projectionType");
        }
        this.b = i;
    }

    public final void e(int i) {
        if (i == 0) {
            throw new NullPointerException("Null supportedConnection");
        }
        this.a = i;
    }

    public final float f(float f) {
        if (Float.isNaN(f)) {
            return Float.NaN;
        }
        t();
        return g();
    }

    public final float g() {
        Object obj = this.d;
        igl iglVar = (igl) obj;
        float fA = iglVar.a((String) this.c, this.a, this.b);
        if (!Float.isNaN(fA)) {
            this.a = ((igl) this.d).a;
        }
        return fA;
    }

    public final float h() {
        t();
        Object obj = this.d;
        igl iglVar = (igl) obj;
        float fA = iglVar.a((String) this.c, this.a, this.b);
        if (!Float.isNaN(fA)) {
            this.a = ((igl) this.d).a;
        }
        return fA;
    }

    public final int i() {
        int i = this.a;
        int i2 = this.b;
        if (i == i2) {
            return -1;
        }
        int i3 = i + 1;
        this.a = i3;
        if (i3 < i2) {
            return ((String) this.c).charAt(i3);
        }
        return -1;
    }

    public final iha j() {
        float fG = g();
        if (Float.isNaN(fG)) {
            return null;
        }
        int iU = u();
        return iU == 0 ? new iha(fG, 1) : new iha(fG, iU);
    }

    public final Boolean k(Object obj) {
        if (obj == null) {
            return null;
        }
        t();
        int i = this.a;
        if (i != this.b) {
            char cCharAt = ((String) this.c).charAt(i);
            if (cCharAt != '0') {
                if (cCharAt == '1') {
                    cCharAt = '1';
                }
            }
            this.a++;
            return Boolean.valueOf(cCharAt == '1');
        }
        return null;
    }

    public final Integer l() {
        int i = this.a;
        if (i == this.b) {
            return null;
        }
        Object obj = this.c;
        this.a = i + 1;
        return Integer.valueOf(((String) obj).charAt(i));
    }

    public final String m() {
        if (!r()) {
            int i = this.a;
            char cCharAt = ((String) this.c).charAt(i);
            if (cCharAt != '\'') {
                if (cCharAt == '\"') {
                    cCharAt = '\"';
                }
            }
            int i2 = i();
            while (i2 != -1) {
                if (i2 == cCharAt) {
                    int i3 = this.a;
                    this.a = i3 + 1;
                    return ((String) this.c).substring(i + 1, i3);
                }
                i2 = i();
            }
            this.a = i;
            return null;
        }
        return null;
    }

    public final String n(char c) {
        if (r()) {
            return null;
        }
        char cCharAt = ((String) this.c).charAt(this.a);
        if (w(cCharAt) || cCharAt == c) {
            return null;
        }
        int i = this.a;
        int i2 = i();
        while (i2 != -1 && i2 != c && !w(i2)) {
            i2 = i();
        }
        return ((String) this.c).substring(i, this.a);
    }

    public final void o() {
        while (true) {
            int i = this.a;
            if (i >= this.b || !w(((String) this.c).charAt(i))) {
                return;
            } else {
                this.a++;
            }
        }
    }

    public final boolean p(char c) {
        int i = this.a;
        boolean z = false;
        if (i < this.b && ((String) this.c).charAt(i) == c) {
            z = true;
        }
        if (z) {
            this.a++;
        }
        return z;
    }

    public final boolean q(String str) {
        int i = this.a;
        int i2 = this.b;
        int length = str.length();
        boolean z = false;
        if (i <= i2 - length) {
            if (((String) this.c).substring(i, i + length).equals(str)) {
                z = true;
            }
        }
        if (z) {
            this.a += length;
        }
        return z;
    }

    public final boolean r() {
        return this.a == this.b;
    }

    public final boolean s() {
        int i = this.a;
        if (i == this.b) {
            return false;
        }
        char cCharAt = ((String) this.c).charAt(i);
        if (cCharAt < 'a' || cCharAt > 'z') {
            return cCharAt >= 'A' && cCharAt <= 'Z';
        }
        return true;
    }

    public final boolean t() {
        o();
        int i = this.a;
        if (i == this.b || ((String) this.c).charAt(i) != ',') {
            return false;
        }
        this.a++;
        o();
        return true;
    }

    public final int u() {
        if (r()) {
            return 0;
        }
        char cCharAt = ((String) this.c).charAt(this.a);
        int i = this.a;
        if (cCharAt == '%') {
            this.a = i + 1;
            return 9;
        }
        if (i > this.b - 2) {
            return 0;
        }
        try {
            int iF = fxy.f(((String) this.c).substring(i, i + 2).toLowerCase(Locale.US));
            this.a += 2;
            return iF;
        } catch (IllegalArgumentException unused) {
            return 0;
        }
    }

    public final String v() {
        int i;
        boolean zR = r();
        int i2 = this.a;
        if (zR) {
            i = i2;
        } else {
            int iCharAt = ((String) this.c).charAt(i2);
            if (iCharAt == 45) {
                iCharAt = i();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int i3 = i();
                while (true) {
                    if ((i3 < 65 || i3 > 90) && ((i3 < 97 || i3 > 122) && !((i3 >= 48 && i3 <= 57) || i3 == 45 || i3 == 95))) {
                        break;
                    }
                    i3 = i();
                }
                i = this.a;
            }
            this.a = i2;
        }
        if (i == i2) {
            return null;
        }
        String strSubstring = ((String) this.c).substring(i2, i);
        this.a = i;
        return strSubstring;
    }

    public kqf(String str) {
        this.a = 0;
        this.b = 0;
        this.d = new igl();
        String strTrim = str.trim();
        this.c = strTrim;
        this.b = strTrim.length();
    }

    public kqf() {
        this.c = Optional.empty();
        this.d = Optional.empty();
    }

    public kqf(String str, byte[] bArr) {
        this(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }
}
