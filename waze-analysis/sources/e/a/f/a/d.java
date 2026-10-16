package e.a.f.a;

import javax.security.auth.x500.X500Principal;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f47561a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47562b;

    /* renamed from: c, reason: collision with root package name */
    private int f47563c;

    /* renamed from: d, reason: collision with root package name */
    private int f47564d;

    /* renamed from: e, reason: collision with root package name */
    private int f47565e;

    /* renamed from: f, reason: collision with root package name */
    private int f47566f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f47567g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f47561a = name;
        this.f47562b = name.length();
    }

    private final char b() {
        int i2;
        int i3;
        int i4 = this.f47563c + 1;
        this.f47563c = i4;
        int i5 = this.f47562b;
        if (i4 == i5) {
            throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.f47561a)));
        }
        char c2 = this.f47567g[i4];
        if (c2 != ' ' && c2 != '%' && c2 != '\\' && c2 != '_' && c2 != '\"' && c2 != '#') {
            switch (c2) {
                default:
                    switch (c2) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iC = c(i4);
                            this.f47563c++;
                            if (iC >= 128) {
                                if (iC < 192 || iC > 247) {
                                    iC = 63;
                                } else {
                                    if (iC <= 223) {
                                        i2 = iC & 31;
                                        i3 = 1;
                                    } else if (iC <= 239) {
                                        i2 = iC & 15;
                                        i3 = 2;
                                    } else {
                                        i2 = iC & 7;
                                        i3 = 3;
                                    }
                                    for (int i6 = 0; i6 < i3; i6++) {
                                        int i7 = this.f47563c;
                                        int i8 = i7 + 1;
                                        this.f47563c = i8;
                                        if (i8 != i5 && this.f47567g[i8] == '\\') {
                                            int i9 = i7 + 2;
                                            this.f47563c = i9;
                                            int iC2 = c(i9);
                                            this.f47563c++;
                                            if ((iC2 & 192) == 128) {
                                                i2 = (i2 << 6) + (iC2 & 63);
                                            }
                                        }
                                        iC = 63;
                                    }
                                    iC = (char) i2;
                                }
                            }
                            return (char) iC;
                    }
                case '*':
                case '+':
                case ',':
                    return c2;
            }
        }
        return c2;
    }

    private final int c(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        if (i5 >= this.f47562b) {
            throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.f47561a)));
        }
        char[] cArr = this.f47567g;
        char c2 = cArr[i2];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.f47561a)));
            }
            i3 = c2 - '7';
        }
        char c3 = cArr[i5];
        if (c3 >= '0' && c3 <= '9') {
            i4 = c3 - '0';
        } else if (c3 >= 'a' && c3 <= 'f') {
            i4 = c3 - 'W';
        } else {
            if (c3 < 'A' || c3 > 'F') {
                throw new IllegalStateException("Malformed DN: ".concat(String.valueOf(this.f47561a)));
            }
            i4 = c3 - '7';
        }
        return (i3 << 4) + i4;
    }

    private final String d() {
        int i2;
        int i3;
        int i4;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        while (true) {
            i2 = this.f47563c;
            i3 = this.f47562b;
            if (i2 >= i3 || this.f47567g[i2] != ' ') {
                break;
            }
            this.f47563c = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.f47564d = i2;
        this.f47563c = i2 + 1;
        while (true) {
            i4 = this.f47563c;
            if (i4 >= i3 || (c6 = this.f47567g[i4]) == '=' || c6 == ' ') {
                break;
            }
            this.f47563c = i4 + 1;
        }
        if (i4 >= i3) {
            throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.f47561a)));
        }
        this.f47565e = i4;
        if (this.f47567g[i4] == ' ') {
            while (true) {
                i4 = this.f47563c;
                if (i4 >= i3 || (c5 = this.f47567g[i4]) == '=' || c5 != ' ') {
                    break;
                }
                this.f47563c = i4 + 1;
            }
            if (this.f47567g[i4] != '=' || i4 == i3) {
                throw new IllegalStateException("Unexpected end of DN: ".concat(String.valueOf(this.f47561a)));
            }
        }
        this.f47563c = i4 + 1;
        while (true) {
            int i5 = this.f47563c;
            if (i5 >= i3 || this.f47567g[i5] != ' ') {
                break;
            }
            this.f47563c = i5 + 1;
        }
        int i6 = this.f47565e;
        int i7 = this.f47564d;
        if (i6 - i7 > 4) {
            char[] cArr = this.f47567g;
            if (cArr[i7 + 3] == '.' && (((c2 = cArr[i7]) == 'O' || c2 == 'o') && (((c3 = cArr[i7 + 1]) == 'I' || c3 == 'i') && ((c4 = cArr[i7 + 2]) == 'D' || c4 == 'd')))) {
                i7 += 4;
                this.f47564d = i7;
            }
        }
        return new String(this.f47567g, i7, i6 - i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        r7 = r15.f47564d;
        r4 = new java.lang.String(r6, r7, r15.f47565e - r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010e, code lost:
    
        r15.f47565e = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.f.a.d.a():java.lang.String");
    }
}
