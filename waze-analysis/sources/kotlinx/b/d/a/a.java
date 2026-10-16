package kotlinx.b.d.a;

import com.fasterxml.jackson.core.JsonFactory;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f51108a;

    /* renamed from: b, reason: collision with root package name */
    public final s f51109b;

    /* renamed from: c, reason: collision with root package name */
    private String f51110c;

    /* renamed from: d, reason: collision with root package name */
    private final StringBuilder f51111d;

    /* renamed from: e, reason: collision with root package name */
    private final String f51112e;

    public a(String str) {
        h.g.b.x.f(str, "source");
        this.f51109b = new s();
        this.f51111d = new StringBuilder();
        this.f51112e = str;
    }

    public static /* synthetic */ void s(a aVar, String str, int i2, String str2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = aVar.f51108a;
        }
        if ((i3 & 4) != 0) {
            str2 = "";
        }
        aVar.u(str, i2, str2);
    }

    private final int v(CharSequence charSequence, int i2) {
        int i3 = i2 + 4;
        if (i3 >= charSequence.length()) {
            this.f51108a = i2;
            if (i3 < charSequence.length()) {
                return v(charSequence, this.f51108a);
            }
            s(this, "Unexpected EOF during unicode escape", 0, null, 6);
            throw new h.e();
        }
        StringBuilder sb = this.f51111d;
        int iW = w(charSequence, i2) << 12;
        int iW2 = w(charSequence, i2 + 1) << 8;
        sb.append((char) (iW + iW2 + (w(charSequence, i2 + 2) << 4) + w(charSequence, i2 + 3)));
        return i3;
    }

    private final int w(CharSequence charSequence, int i2) {
        char cCharAt = charSequence.charAt(i2);
        if (cCharAt >= '0' && cCharAt < ':') {
            return cCharAt - '0';
        }
        if (cCharAt >= 'a' && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if (cCharAt >= 'A' && cCharAt < 'G') {
            return cCharAt - '7';
        }
        s(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw new h.e();
    }

    private final String x(int i2, int i3) {
        g(i2, i3);
        StringBuilder sb = this.f51111d;
        String string = sb.toString();
        h.g.b.x.e(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    private final String y() {
        String str = this.f51110c;
        h.g.b.x.c(str);
        this.f51110c = null;
        return str;
    }

    private final void z(String str, int i2) {
        if (o().length() - i2 < str.length()) {
            s(this, "Unexpected end of boolean literal", 0, null, 6);
            throw new h.e();
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (str.charAt(i3) != (o().charAt(i2 + i3) | ' ')) {
                s(this, "Expected valid boolean literal prefix, but had '" + e() + '\'', 0, null, 6);
                throw new h.e();
            }
        }
        this.f51108a = i2 + str.length();
    }

    public final byte a(byte b2) {
        byte bL = l();
        if (bL == b2) {
            return bL;
        }
        int i2 = this.f51108a;
        int i3 = i2 - 1;
        String strValueOf = (i2 == o().length() || i3 < 0) ? "EOF" : String.valueOf(o().charAt(i3));
        s(this, "Expected " + aj.N(b2) + ", but had '" + strValueOf + "' instead", i3, null, 4);
        throw new h.e();
    }

    public final byte b() {
        CharSequence charSequenceO = o();
        int i2 = this.f51108a;
        while (true) {
            int iM = m(i2);
            if (iM == -1) {
                this.f51108a = -1;
                return (byte) 10;
            }
            char cCharAt = charSequenceO.charAt(iM);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f51108a = iM;
                return aj.M(cCharAt);
            }
            i2 = iM + 1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ca, code lost:
    
        throw new h.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cb, code lost:
    
        if (r10 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01cd, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01d2, code lost:
    
        if (r13 == Long.MIN_VALUE) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d5, code lost:
    
        return -r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d6, code lost:
    
        s(r24, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e0, code lost:
    
        throw new h.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e1, code lost:
    
        s(r24, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ed, code lost:
    
        throw new h.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0121, code lost:
    
        s(r24, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013e, code lost:
    
        throw new h.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0144, code lost:
    
        if (r11 == r1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0146, code lost:
    
        if (r10 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        if (r1 == (r11 - 1)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        if (r21 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        if (r11 == r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015a, code lost:
    
        if (o().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015c, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015f, code lost:
    
        s(r24, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016b, code lost:
    
        throw new h.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        s(r24, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0176, code lost:
    
        throw new h.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0177, code lost:
    
        r24.f51108a = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0179, code lost:
    
        if (r12 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017b, code lost:
    
        r1 = r8;
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017f, code lost:
    
        if (r18 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0181, code lost:
    
        r1 = java.lang.Math.pow(10.0d, -r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0187, code lost:
    
        r1 = java.lang.Math.pow(10.0d, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018b, code lost:
    
        r3 = r3 * r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0190, code lost:
    
        if (r3 > 9.223372036854776E18d) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0196, code lost:
    
        if (r3 < (-9.223372036854776E18d)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019e, code lost:
    
        if (java.lang.Math.floor(r3) != r3) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a0, code lost:
    
        r13 = (long) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a2, code lost:
    
        s(r24, "Can't convert " + r3 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01bf, code lost:
    
        throw new h.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c0, code lost:
    
        s(r24, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[PHI: r15
  0x00b1: PHI (r15v5 char) = (r15v4 char), (r15v6 char) binds: [B:29:0x0096, B:36:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c() {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.b.d.a.a.c():long");
    }

    public final String d() {
        return this.f51110c != null ? y() : p();
    }

    public final String e() {
        if (this.f51110c != null) {
            return y();
        }
        int iN = n();
        if (iN >= o().length() || iN == -1) {
            s(this, "EOF", iN, null, 4);
            throw new h.e();
        }
        byte bM = aj.M(o().charAt(iN));
        if (bM == 1) {
            return d();
        }
        if (bM != 0) {
            s(this, "Expected beginning of the string, but got " + o().charAt(iN), 0, null, 6);
            throw new h.e();
        }
        boolean z = false;
        while (aj.M(o().charAt(iN)) == 0) {
            iN++;
            if (iN >= o().length()) {
                g(this.f51108a, iN);
                int iM = m(iN);
                if (iM == -1) {
                    this.f51108a = iN;
                    return x(0, 0);
                }
                iN = iM;
                z = true;
            }
        }
        int i2 = this.f51108a;
        String strF = !z ? f(i2, iN) : x(i2, iN);
        this.f51108a = iN;
        return strF;
    }

    public final String f(int i2, int i3) {
        return o().subSequence(i2, i3).toString();
    }

    protected final void g(int i2, int i3) {
        this.f51111d.append(o(), i2, i3);
    }

    public final void h() {
        this.f51110c = null;
    }

    protected final void i(char c2) {
        int i2 = this.f51108a;
        if (i2 > 0 && c2 == '\"') {
            try {
                this.f51108a = i2 - 1;
                String strE = e();
                this.f51108a = i2;
                if (h.g.b.x.n(strE, "null")) {
                    u("Expected string literal but 'null' literal was found", this.f51108a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new h.e();
                }
                c2 = '\"';
            } catch (Throwable th) {
                this.f51108a = i2;
                throw th;
            }
        }
        String strN = aj.N(aj.M(c2));
        int i3 = this.f51108a;
        int i4 = i3 - 1;
        s(this, "Expected " + strN + ", but had '" + ((i3 == o().length() || i4 < 0) ? "EOF" : String.valueOf(o().charAt(i4))) + "' instead", i4, null, 4);
        throw new h.e();
    }

    public final boolean j() {
        boolean z;
        boolean z2;
        int iN = n();
        if (iN == o().length()) {
            s(this, "EOF", 0, null, 6);
            throw new h.e();
        }
        if (o().charAt(iN) == '\"') {
            iN++;
            z = true;
        } else {
            z = false;
        }
        int iM = m(iN);
        if (iM >= o().length() || iM == -1) {
            s(this, "EOF", 0, null, 6);
            throw new h.e();
        }
        int i2 = iM + 1;
        int iCharAt = o().charAt(iM) | ' ';
        if (iCharAt == 102) {
            z("alse", i2);
            z2 = false;
        } else {
            if (iCharAt != 116) {
                s(this, "Expected valid boolean literal prefix, but had '" + e() + '\'', 0, null, 6);
                throw new h.e();
            }
            z("rue", i2);
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (this.f51108a == o().length()) {
            s(this, "EOF", 0, null, 6);
            throw new h.e();
        }
        if (o().charAt(this.f51108a) == '\"') {
            this.f51108a++;
            return z2;
        }
        s(this, "Expected closing quotation mark", 0, null, 6);
        throw new h.e();
    }

    public final boolean k() {
        int iN = n();
        CharSequence charSequenceO = o();
        if (iN >= charSequenceO.length() || iN == -1 || charSequenceO.charAt(iN) != ',') {
            return false;
        }
        this.f51108a++;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        r5.f51108a = r1.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        return 10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte l() {
        /*
            r5 = this;
            int r0 = r5.f51108a
        L2:
            java.lang.String r1 = r5.f51112e
            r2 = -1
            r3 = 10
            if (r0 == r2) goto L35
            int r2 = r1.length()
            if (r0 >= r2) goto L35
            int r2 = r0 + 1
            char r0 = r1.charAt(r0)
            r1 = r5
            kotlinx.b.d.a.a r1 = (kotlinx.b.d.a.a) r1
            r1 = 32
            r4 = 1
            if (r0 == r1) goto L2a
            if (r0 == r3) goto L2a
            r1 = 13
            if (r0 == r1) goto L2a
            r1 = 9
            if (r0 != r1) goto L29
            r0 = r1
            goto L2a
        L29:
            r4 = 0
        L2a:
            if (r4 == 0) goto L2e
            r0 = r2
            goto L2
        L2e:
            r5.f51108a = r2
            byte r5 = kotlinx.coroutines.aj.M(r0)
            return r5
        L35:
            int r0 = r1.length()
            r5.f51108a = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.b.d.a.a.l():byte");
    }

    public final int m(int i2) {
        if (i2 < this.f51112e.length()) {
            return i2;
        }
        return -1;
    }

    public final int n() {
        char cCharAt;
        int i2 = this.f51108a;
        if (i2 == -1) {
            return -1;
        }
        String str = this.f51112e;
        while (i2 < str.length() && ((cCharAt = str.charAt(i2)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i2++;
        }
        this.f51108a = i2;
        return i2;
    }

    public final /* synthetic */ CharSequence o() {
        return this.f51112e;
    }

    public final String p() {
        q(JsonFactory.DEFAULT_QUOTE_CHAR);
        String str = this.f51112e;
        int i2 = this.f51108a;
        String str2 = str;
        int iW = h.n.o.W(str2, JsonFactory.DEFAULT_QUOTE_CHAR, i2, 4);
        if (iW == -1) {
            e();
            String strN = aj.N((byte) 1);
            int i3 = this.f51108a;
            s(this, "Expected " + strN + ", but had '" + ((i3 == o().length() || i3 < 0) ? "EOF" : String.valueOf(o().charAt(i3))) + "' instead", i3, null, 4);
            throw new h.e();
        }
        int i4 = i2;
        while (i4 < iW) {
            if (str.charAt(i4) == '\\') {
                int iM = this.f51108a;
                h.g.b.x.f(str2, "source");
                char cCharAt = str2.charAt(i4);
                boolean z = false;
                while (true) {
                    int i5 = i4 + 1;
                    if (cCharAt == '\"') {
                        String strF = !z ? f(iM, i4) : x(iM, i4);
                        this.f51108a = i5;
                        return strF;
                    }
                    if (cCharAt == '\\') {
                        g(iM, i4);
                        int iM2 = m(i5);
                        if (iM2 == -1) {
                            s(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw new h.e();
                        }
                        int iV = iM2 + 1;
                        char cCharAt2 = o().charAt(iM2);
                        if (cCharAt2 == 'u') {
                            iV = v(o(), iV);
                        } else {
                            char c2 = cCharAt2 < 'u' ? h.f51160a[cCharAt2] : (char) 0;
                            if (c2 == 0) {
                                s(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw new h.e();
                            }
                            this.f51111d.append(c2);
                        }
                        iM = m(iV);
                        if (iM == -1) {
                            s(this, "Unexpected EOF", -1, null, 4);
                            throw new h.e();
                        }
                    } else if (i5 >= str2.length()) {
                        g(iM, i5);
                        iM = m(i5);
                        if (iM == -1) {
                            s(this, "Unexpected EOF", -1, null, 4);
                            throw new h.e();
                        }
                    } else {
                        i4 = i5;
                        cCharAt = str2.charAt(i4);
                    }
                    i4 = iM;
                    z = true;
                    cCharAt = str2.charAt(i4);
                }
            } else {
                i4++;
            }
        }
        this.f51108a = iW + 1;
        String strSubstring = str.substring(i2, iW);
        h.g.b.x.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final void q(char c2) {
        if (this.f51108a == -1) {
            i(c2);
        }
        String str = this.f51112e;
        int i2 = this.f51108a;
        while (i2 < str.length()) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            boolean z = true;
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r') {
                if (cCharAt == '\t') {
                    cCharAt = '\t';
                } else {
                    z = false;
                }
            }
            if (!z) {
                this.f51108a = i3;
                if (cCharAt == c2) {
                    return;
                } else {
                    i(c2);
                }
            }
            i2 = i3;
        }
        this.f51108a = -1;
        i(c2);
    }

    public final boolean r() {
        int i2 = this.f51108a;
        if (i2 != -1) {
            String str = this.f51112e;
            while (i2 < str.length()) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                    this.f51108a = i2;
                    return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
                }
                i2++;
            }
            this.f51108a = i2;
        }
        return false;
    }

    public final String t() {
        if (b() != 1) {
            return null;
        }
        String strD = d();
        this.f51110c = strD;
        return strD;
    }

    public final String toString() {
        return "JsonReader(source='" + ((Object) o()) + "', currentPosition=" + this.f51108a + ')';
    }

    public final void u(String str, int i2, String str2) {
        String str3;
        h.g.b.x.f(str, "message");
        h.g.b.x.f(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = "\n" + str2;
        }
        throw kotlinx.coroutines.d.d.f(i2, str + " at path: " + this.f51109b.a() + str3, o());
    }

    public a() {
        this.f51109b = new s();
        this.f51111d = new StringBuilder();
    }
}
