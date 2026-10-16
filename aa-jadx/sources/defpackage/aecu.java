package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aecu {
    public final java.lang.String a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public aecu(javax.security.auth.x500.X500Principal x500Principal) {
        java.lang.String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    public final char a() {
        int i;
        int i2;
        int i3 = this.c + 1;
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(this.a)));
        }
        char c = this.g[i3];
        if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
            switch (c) {
                default:
                    switch (c) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iB = b(i3);
                            this.c++;
                            if (iB >= 128) {
                                if (iB < 192 || iB > 247) {
                                    iB = 63;
                                } else {
                                    if (iB <= 223) {
                                        i = iB & 31;
                                        i2 = 1;
                                    } else if (iB <= 239) {
                                        i = iB & 15;
                                        i2 = 2;
                                    } else {
                                        i = iB & 7;
                                        i2 = 3;
                                    }
                                    int i5 = 0;
                                    while (true) {
                                        if (i5 < i2) {
                                            int i6 = this.c;
                                            int i7 = i6 + 1;
                                            this.c = i7;
                                            if (i7 != i4 && this.g[i7] == '\\') {
                                                int i8 = i6 + 2;
                                                this.c = i8;
                                                int iB2 = b(i8);
                                                this.c++;
                                                if ((iB2 & 192) == 128) {
                                                    i = (i << 6) + (iB2 & 63);
                                                    i5++;
                                                }
                                            }
                                            iB = 63;
                                        } else {
                                            iB = (char) i;
                                        }
                                    }
                                }
                            }
                            return (char) iB;
                    }
                case androidx.car.app.navigation.model.Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    return c;
            }
        }
        return c;
    }

    public final int b(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.b) {
            throw new java.lang.IllegalStateException("Malformed DN: ".concat(java.lang.String.valueOf(this.a)));
        }
        char[] cArr = this.g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new java.lang.IllegalStateException("Malformed DN: ".concat(java.lang.String.valueOf(this.a)));
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new java.lang.IllegalStateException("Malformed DN: ".concat(java.lang.String.valueOf(this.a)));
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    public final java.lang.String c() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        while (true) {
            i = this.c;
            i2 = this.b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.d = i;
        this.c = i + 1;
        while (true) {
            i3 = this.c;
            if (i3 >= i2 || (c5 = this.g[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.c = i3 + 1;
        }
        if (i3 >= i2) {
            throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(this.a)));
        }
        this.e = i3;
        if (this.g[i3] == ' ') {
            while (true) {
                i3 = this.c;
                if (i3 >= i2 || (c4 = this.g[i3]) == '=' || c4 != ' ') {
                    break;
                }
                this.c = i3 + 1;
            }
            if (this.g[i3] != '=' || i3 == i2) {
                throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(this.a)));
            }
        }
        this.c = i3 + 1;
        while (true) {
            int i4 = this.c;
            if (i4 >= i2 || this.g[i4] != ' ') {
                break;
            }
            this.c = i4 + 1;
        }
        int i5 = this.e;
        int i6 = this.d;
        if (i5 - i6 > 4) {
            char[] cArr = this.g;
            if (cArr[i6 + 3] == '.' && (((c = cArr[i6]) == 'O' || c == 'o') && (((c2 = cArr[i6 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i6 + 2]) == 'D' || c3 == 'd')))) {
                i6 += 4;
                this.d = i6;
            }
        }
        return new java.lang.String(this.g, i6, i5 - i6);
    }
}
