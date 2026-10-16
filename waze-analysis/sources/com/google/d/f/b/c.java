package com.google.d.f.b;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final long f7753a;

    /* renamed from: b, reason: collision with root package name */
    private static final c f7754b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7755c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7756d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7757e;

    static {
        long jCharAt = 0;
        for (int i2 = 0; i2 < 7; i2++) {
            jCharAt |= (i2 + 1) << ((int) ((" #(+,-0".charAt(i2) - ' ') * 3));
        }
        f7753a = jCharAt;
        f7754b = new c(0, -1, -1);
    }

    private c(int i2, int i3, int i4) {
        this.f7755c = i2;
        this.f7756d = i3;
        this.f7757e = i4;
    }

    static int d(String str, boolean z) {
        int i2 = true != z ? 0 : 128;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iM = m(str.charAt(i3));
            if (iM < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i2 |= 1 << iM;
        }
        return i2;
    }

    public static c e() {
        return f7754b;
    }

    public static c f(String str, int i2, int i3, boolean z) {
        if (i2 == i3 && !z) {
            return f7754b;
        }
        int i4 = true != z ? 0 : 128;
        while (i2 != i3) {
            int i5 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < ' ' || cCharAt > '0') {
                if (cCharAt > '9') {
                    throw com.google.d.f.e.e.a("invalid flag", str, i2);
                }
                int i6 = cCharAt - '0';
                while (i5 != i3) {
                    int i7 = i5 + 1;
                    char cCharAt2 = str.charAt(i5);
                    if (cCharAt2 == '.') {
                        return new c(i4, i6, n(str, i7, i3));
                    }
                    char c2 = (char) (cCharAt2 - '0');
                    if (c2 >= '\n') {
                        throw com.google.d.f.e.e.a("invalid width character", str, i5);
                    }
                    i6 = (i6 * 10) + c2;
                    if (i6 > 999999) {
                        throw com.google.d.f.e.e.b("width too large", str, i2, i3);
                    }
                    i5 = i7;
                }
                return new c(i4, i6, -1);
            }
            int iM = m(cCharAt);
            if (iM < 0) {
                if (cCharAt == '.') {
                    return new c(i4, -1, n(str, i5, i3));
                }
                throw com.google.d.f.e.e.a("invalid flag", str, i2);
            }
            int i8 = 1 << iM;
            if ((i4 & i8) != 0) {
                throw com.google.d.f.e.e.a("repeated flag", str, i2);
            }
            i4 |= i8;
            i2 = i5;
        }
        return new c(i4, -1, -1);
    }

    private static int m(char c2) {
        return ((int) ((f7753a >>> ((c2 - ' ') * 3)) & 7)) - 1;
    }

    private static int n(String str, int i2, int i3) {
        if (i2 == i3) {
            throw com.google.d.f.e.e.a("missing precision", str, i2 - 1);
        }
        int i4 = 0;
        for (int i5 = i2; i5 < i3; i5++) {
            char cCharAt = (char) (str.charAt(i5) - '0');
            if (cCharAt >= '\n') {
                throw com.google.d.f.e.e.a("invalid precision character", str, i5);
            }
            i4 = (i4 * 10) + cCharAt;
            if (i4 > 999999) {
                throw com.google.d.f.e.e.b("precision too large", str, i2, i3);
            }
        }
        if (i4 != 0) {
            return i4;
        }
        if (i3 == i2 + 1) {
            return 0;
        }
        throw com.google.d.f.e.e.b("invalid precision", str, i2, i3);
    }

    public final int a() {
        return this.f7755c;
    }

    public final int b() {
        return this.f7757e;
    }

    public final int c() {
        return this.f7756d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f7755c == this.f7755c && cVar.f7756d == this.f7756d && cVar.f7757e == this.f7757e) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(b bVar) {
        return j(bVar.b(), bVar.d().a());
    }

    public final boolean h() {
        return this == f7754b;
    }

    public final int hashCode() {
        return (((this.f7755c * 31) + this.f7756d) * 31) + this.f7757e;
    }

    public final boolean i() {
        return (this.f7755c & 128) != 0;
    }

    public final boolean j(int i2, boolean z) {
        int i3;
        if (h()) {
            return true;
        }
        int i4 = this.f7755c;
        if (((~i2) & i4) != 0) {
            return false;
        }
        if (!z && this.f7757e != -1) {
            return false;
        }
        int i5 = this.f7756d;
        if ((i4 & 9) == 9 || (i3 = i4 & 96) == 96) {
            return false;
        }
        return i3 == 0 || i5 != -1;
    }

    public final void k(StringBuilder sb) {
        if (h()) {
            return;
        }
        int i2 = this.f7755c;
        int i3 = 0;
        while (true) {
            int i4 = i2 & (-129);
            int i5 = 1 << i3;
            if (i5 > i4) {
                break;
            }
            if ((i4 & i5) != 0) {
                sb.append(" #(+,-0".charAt(i3));
            }
            i3++;
        }
        int i6 = this.f7756d;
        if (i6 != -1) {
            sb.append(i6);
        }
        int i7 = this.f7757e;
        if (i7 != -1) {
            sb.append('.');
            sb.append(i7);
        }
    }

    public final c l() {
        if (!h()) {
            int i2 = this.f7755c;
            int i3 = i2 & 128;
            if (i3 == 0) {
                return f7754b;
            }
            if (i3 != i2 || this.f7756d != -1 || this.f7757e != -1) {
                return new c(i3, -1, -1);
            }
        }
        return this;
    }
}
