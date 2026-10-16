package qd;

import javax.security.auth.x500.X500Principal;

/* renamed from: qd.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3888c {

    /* renamed from: a, reason: collision with root package name */
    public final String f44214a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44215b;

    /* renamed from: c, reason: collision with root package name */
    public int f44216c;

    /* renamed from: d, reason: collision with root package name */
    public int f44217d;

    /* renamed from: e, reason: collision with root package name */
    public int f44218e;

    /* renamed from: f, reason: collision with root package name */
    public int f44219f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f44220g;

    public C3888c(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f44214a = name;
        this.f44215b = name.length();
    }

    public final int a(int i5) {
        int i10;
        int i11;
        int i12 = i5 + 1;
        int i13 = this.f44215b;
        String str = this.f44214a;
        if (i12 >= i13) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f44220g;
        char c10 = cArr[i5];
        if (c10 >= '0' && c10 <= '9') {
            i10 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i10 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i10 = c10 - '7';
        }
        char c11 = cArr[i12];
        if (c11 >= '0' && c11 <= '9') {
            i11 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i11 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i11 = c11 - '7';
        }
        return (i10 << 4) + i11;
    }

    public final char b() {
        int i5;
        int i10;
        int i11 = this.f44216c + 1;
        this.f44216c = i11;
        int i12 = this.f44215b;
        if (i11 == i12) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f44214a);
        }
        char c10 = this.f44220g[i11];
        if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
            switch (c10) {
                default:
                    switch (c10) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iA = a(i11);
                            this.f44216c++;
                            if (iA < 128) {
                                return (char) iA;
                            }
                            if (iA < 192 || iA > 247) {
                                return '?';
                            }
                            if (iA <= 223) {
                                i5 = iA & 31;
                                i10 = 1;
                            } else if (iA <= 239) {
                                i5 = iA & 15;
                                i10 = 2;
                            } else {
                                i5 = iA & 7;
                                i10 = 3;
                            }
                            for (int i13 = 0; i13 < i10; i13++) {
                                int i14 = this.f44216c;
                                int i15 = i14 + 1;
                                this.f44216c = i15;
                                if (i15 == i12 || this.f44220g[i15] != '\\') {
                                    return '?';
                                }
                                int i16 = i14 + 2;
                                this.f44216c = i16;
                                int iA2 = a(i16);
                                this.f44216c++;
                                if ((iA2 & 192) != 128) {
                                    return '?';
                                }
                                i5 = (i5 << 6) + (iA2 & 63);
                            }
                            return (char) i5;
                    }
                case '*':
                case '+':
                case ',':
                    return c10;
            }
        }
        return c10;
    }

    public final String c() {
        int i5;
        int i10;
        int i11;
        char c10;
        int i12;
        char c11;
        char c12;
        while (true) {
            i5 = this.f44216c;
            i10 = this.f44215b;
            if (i5 >= i10 || this.f44220g[i5] != ' ') {
                break;
            }
            this.f44216c = i5 + 1;
        }
        if (i5 == i10) {
            return null;
        }
        this.f44217d = i5;
        this.f44216c = i5 + 1;
        while (true) {
            i11 = this.f44216c;
            if (i11 >= i10 || (c12 = this.f44220g[i11]) == '=' || c12 == ' ') {
                break;
            }
            this.f44216c = i11 + 1;
        }
        String str = this.f44214a;
        if (i11 >= i10) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f44218e = i11;
        if (this.f44220g[i11] == ' ') {
            while (true) {
                i12 = this.f44216c;
                if (i12 >= i10 || (c11 = this.f44220g[i12]) == '=' || c11 != ' ') {
                    break;
                }
                this.f44216c = i12 + 1;
            }
            if (this.f44220g[i12] != '=' || i12 == i10) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f44216c++;
        while (true) {
            int i13 = this.f44216c;
            if (i13 >= i10 || this.f44220g[i13] != ' ') {
                break;
            }
            this.f44216c = i13 + 1;
        }
        int i14 = this.f44218e;
        int i15 = this.f44217d;
        if (i14 - i15 > 4) {
            char[] cArr = this.f44220g;
            if (cArr[i15 + 3] == '.' && (((c10 = cArr[i15]) == 'O' || c10 == 'o') && ((cArr[i15 + 1] == 'I' || cArr[i15 + 1] == 'i') && (cArr[i15 + 2] == 'D' || cArr[i15 + 2] == 'd')))) {
                this.f44217d = i15 + 4;
            }
        }
        char[] cArr2 = this.f44220g;
        int i16 = this.f44217d;
        return new String(cArr2, i16, i14 - i16);
    }
}
