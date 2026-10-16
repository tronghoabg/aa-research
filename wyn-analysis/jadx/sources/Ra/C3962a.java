package ra;

import R8.v;
import a2.k;
import com.applovin.shadow.okio.Segment;
import j$.util.Objects;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import ka.AbstractC3256n;
import pd.f;

/* renamed from: ra.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3962a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f44684a;

    /* renamed from: h, reason: collision with root package name */
    public long f44691h;

    /* renamed from: i, reason: collision with root package name */
    public int f44692i;

    /* renamed from: j, reason: collision with root package name */
    public String f44693j;
    public int[] k;

    /* renamed from: m, reason: collision with root package name */
    public String[] f44695m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f44696n;

    /* renamed from: o, reason: collision with root package name */
    public int f44697o = 2;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f44685b = new char[Segment.SHARE_MINIMUM];

    /* renamed from: c, reason: collision with root package name */
    public int f44686c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f44687d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f44688e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f44689f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f44690g = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f44694l = 1;

    static {
        k.f17189b = new k();
    }

    public C3962a(Reader reader) {
        int[] iArr = new int[32];
        this.k = iArr;
        iArr[0] = 6;
        this.f44695m = new String[32];
        this.f44696n = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f44684a = reader;
    }

    public String B() {
        return z(true);
    }

    public boolean D() throws IOException {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        return (iH == 2 || iH == 4 || iH == 17) ? false : true;
    }

    public final boolean J(char c10) throws c {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    final String P() {
        StringBuilder sbH = v.h(" at line ", this.f44688e + 1, " column ", (this.f44686c - this.f44689f) + 1, " path ");
        sbH.append(y());
        return sbH.toString();
    }

    public boolean Q() throws IOException {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 5) {
            this.f44690g = 0;
            int[] iArr = this.f44696n;
            int i5 = this.f44694l - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (iH != 6) {
            throw m0("a boolean");
        }
        this.f44690g = 0;
        int[] iArr2 = this.f44696n;
        int i10 = this.f44694l - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return false;
    }

    public double V() throws IOException, NumberFormatException {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f44690g = 0;
            int[] iArr = this.f44696n;
            int i5 = this.f44694l - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f44691h;
        }
        if (iH == 16) {
            this.f44693j = new String(this.f44685b, this.f44686c, this.f44692i);
            this.f44686c += this.f44692i;
        } else if (iH == 8 || iH == 9) {
            this.f44693j = b0(iH == 8 ? '\'' : '\"');
        } else if (iH == 10) {
            this.f44693j = d0();
        } else if (iH != 11) {
            throw m0("a double");
        }
        this.f44690g = 11;
        double d3 = Double.parseDouble(this.f44693j);
        if (this.f44697o != 1 && (Double.isNaN(d3) || Double.isInfinite(d3))) {
            l0("JSON forbids NaN and infinities: " + d3);
            throw null;
        }
        this.f44693j = null;
        this.f44690g = 0;
        int[] iArr2 = this.f44696n;
        int i10 = this.f44694l - 1;
        iArr2[i10] = iArr2[i10] + 1;
        return d3;
    }

    public int W() throws IOException, NumberFormatException {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            long j8 = this.f44691h;
            int i5 = (int) j8;
            if (j8 != i5) {
                throw new NumberFormatException("Expected an int but was " + this.f44691h + P());
            }
            this.f44690g = 0;
            int[] iArr = this.f44696n;
            int i10 = this.f44694l - 1;
            iArr[i10] = iArr[i10] + 1;
            return i5;
        }
        if (iH == 16) {
            this.f44693j = new String(this.f44685b, this.f44686c, this.f44692i);
            this.f44686c += this.f44692i;
        } else {
            if (iH != 8 && iH != 9 && iH != 10) {
                throw m0("an int");
            }
            if (iH == 10) {
                this.f44693j = d0();
            } else {
                this.f44693j = b0(iH == 8 ? '\'' : '\"');
            }
            try {
                int i11 = Integer.parseInt(this.f44693j);
                this.f44690g = 0;
                int[] iArr2 = this.f44696n;
                int i12 = this.f44694l - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        }
        this.f44690g = 11;
        double d3 = Double.parseDouble(this.f44693j);
        int i13 = (int) d3;
        if (i13 != d3) {
            throw new NumberFormatException("Expected an int but was " + this.f44693j + P());
        }
        this.f44693j = null;
        this.f44690g = 0;
        int[] iArr3 = this.f44696n;
        int i14 = this.f44694l - 1;
        iArr3[i14] = iArr3[i14] + 1;
        return i13;
    }

    public long X() throws IOException, NumberFormatException {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 15) {
            this.f44690g = 0;
            int[] iArr = this.f44696n;
            int i5 = this.f44694l - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f44691h;
        }
        if (iH == 16) {
            this.f44693j = new String(this.f44685b, this.f44686c, this.f44692i);
            this.f44686c += this.f44692i;
        } else {
            if (iH != 8 && iH != 9 && iH != 10) {
                throw m0("a long");
            }
            if (iH == 10) {
                this.f44693j = d0();
            } else {
                this.f44693j = b0(iH == 8 ? '\'' : '\"');
            }
            try {
                long j8 = Long.parseLong(this.f44693j);
                this.f44690g = 0;
                int[] iArr2 = this.f44696n;
                int i10 = this.f44694l - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return j8;
            } catch (NumberFormatException unused) {
            }
        }
        this.f44690g = 11;
        double d3 = Double.parseDouble(this.f44693j);
        long j10 = (long) d3;
        if (j10 != d3) {
            throw new NumberFormatException("Expected a long but was " + this.f44693j + P());
        }
        this.f44693j = null;
        this.f44690g = 0;
        int[] iArr3 = this.f44696n;
        int i11 = this.f44694l - 1;
        iArr3[i11] = iArr3[i11] + 1;
        return j10;
    }

    public String Y() throws IOException {
        String strB0;
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 14) {
            strB0 = d0();
        } else if (iH == 12) {
            strB0 = b0('\'');
        } else {
            if (iH != 13) {
                throw m0("a name");
            }
            strB0 = b0('\"');
        }
        this.f44690g = 0;
        this.f44695m[this.f44694l - 1] = strB0;
        return strB0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Z(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.C3962a.Z(boolean):int");
    }

    public void a() throws IOException {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 3) {
            throw m0("BEGIN_ARRAY");
        }
        f0(1);
        this.f44696n[this.f44694l - 1] = 0;
        this.f44690g = 0;
    }

    public void a0() {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 7) {
            throw m0("null");
        }
        this.f44690g = 0;
        int[] iArr = this.f44696n;
        int i5 = this.f44694l - 1;
        iArr[i5] = iArr[i5] + 1;
    }

    public void b() throws IOException {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 1) {
            throw m0("BEGIN_OBJECT");
        }
        f0(3);
        this.f44690g = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003d, code lost:
    
        r11.f44686c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r11.f44686c = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b0(char r12) throws ra.c {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f44686c
            int r3 = r11.f44687d
        L6:
            r4 = r3
            r3 = r2
        L8:
            char[] r5 = r11.f44685b
            r6 = 1
            r7 = 16
            if (r2 >= r4) goto L6b
            int r8 = r2 + 1
            char r2 = r5[r2]
            int r9 = r11.f44697o
            r10 = 3
            if (r9 != r10) goto L23
            r9 = 32
            if (r2 < r9) goto L1d
            goto L23
        L1d:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.l0(r12)
            throw r0
        L23:
            if (r2 != r12) goto L39
            r11.f44686c = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L31
            java.lang.String r12 = new java.lang.String
            r12.<init>(r5, r3, r8)
            return r12
        L31:
            r1.append(r5, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L39:
            r9 = 92
            if (r2 != r9) goto L5e
            r11.f44686c = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L4f
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r7)
            r1.<init>(r4)
        L4f:
            r1.append(r5, r3, r2)
            char r2 = r11.g0()
            r1.append(r2)
            int r2 = r11.f44686c
            int r3 = r11.f44687d
            goto L6
        L5e:
            r5 = 10
            if (r2 != r5) goto L69
            int r2 = r11.f44688e
            int r2 = r2 + r6
            r11.f44688e = r2
            r11.f44689f = r8
        L69:
            r2 = r8
            goto L8
        L6b:
            if (r1 != 0) goto L7b
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r7)
            r4.<init>(r1)
            r1 = r4
        L7b:
            int r4 = r2 - r3
            r1.append(r5, r3, r4)
            r11.f44686c = r2
            boolean r2 = r11.w(r6)
            if (r2 == 0) goto L8a
            goto L2
        L8a:
            java.lang.String r12 = "Unterminated string"
            r11.l0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.C3962a.b0(char):java.lang.String");
    }

    public String c0() throws IOException {
        String str;
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH == 10) {
            str = d0();
        } else if (iH == 8) {
            str = b0('\'');
        } else if (iH == 9) {
            str = b0('\"');
        } else if (iH == 11) {
            str = this.f44693j;
            this.f44693j = null;
        } else if (iH == 15) {
            str = Long.toString(this.f44691h);
        } else {
            if (iH != 16) {
                throw m0("a string");
            }
            str = new String(this.f44685b, this.f44686c, this.f44692i);
            this.f44686c += this.f44692i;
        }
        this.f44690g = 0;
        int[] iArr = this.f44696n;
        int i5 = this.f44694l - 1;
        iArr[i5] = iArr[i5] + 1;
        return str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f44690g = 0;
        this.k[0] = 8;
        this.f44694l = 1;
        this.f44684a.close();
    }

    public final void d() throws c {
        if (this.f44697o == 1) {
            return;
        }
        l0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d0() throws ra.c {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f44686c
            int r4 = r3 + r2
            int r5 = r7.f44687d
            char[] r6 = r7.f44685b
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.d()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.w(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f44686c
            r0.append(r6, r3, r2)
            int r3 = r7.f44686c
            int r3 = r3 + r2
            r7.f44686c = r3
            r2 = 1
            boolean r2 = r7.w(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f44686c
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f44686c
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f44686c
            int r2 = r2 + r1
            r7.f44686c = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.C3962a.d0():java.lang.String");
    }

    public int e0() throws IOException {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        switch (iH) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void f0(int i5) throws c {
        int i10 = this.f44694l;
        if (i10 - 1 >= 255) {
            throw new c("Nesting limit 255 reached" + P());
        }
        int[] iArr = this.k;
        if (i10 == iArr.length) {
            int i11 = i10 * 2;
            this.k = Arrays.copyOf(iArr, i11);
            this.f44696n = Arrays.copyOf(this.f44696n, i11);
            this.f44695m = (String[]) Arrays.copyOf(this.f44695m, i11);
        }
        int[] iArr2 = this.k;
        int i12 = this.f44694l;
        this.f44694l = i12 + 1;
        iArr2[i12] = i5;
    }

    public final char g0() throws c {
        int i5;
        if (this.f44686c == this.f44687d && !w(1)) {
            l0("Unterminated escape sequence");
            throw null;
        }
        int i10 = this.f44686c;
        int i11 = i10 + 1;
        this.f44686c = i11;
        char[] cArr = this.f44685b;
        char c10 = cArr[i10];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 == 'b') {
                            return '\b';
                        }
                        if (c10 == 'f') {
                            return '\f';
                        }
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 == 'r') {
                            return '\r';
                        }
                        if (c10 == 't') {
                            return '\t';
                        }
                        if (c10 != 'u') {
                            l0("Invalid escape sequence");
                            throw null;
                        }
                        if (i10 + 5 > this.f44687d && !w(4)) {
                            l0("Unterminated escape sequence");
                            throw null;
                        }
                        int i12 = this.f44686c;
                        int i13 = i12 + 4;
                        int i14 = 0;
                        while (i12 < i13) {
                            char c11 = cArr[i12];
                            int i15 = i14 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i5 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i5 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    l0("Malformed Unicode escape \\u".concat(new String(cArr, this.f44686c, 4)));
                                    throw null;
                                }
                                i5 = c11 - '7';
                            }
                            i14 = i5 + i15;
                            i12++;
                        }
                        this.f44686c += 4;
                        return (char) i14;
                    }
                }
            }
            return c10;
        }
        if (this.f44697o == 3) {
            l0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f44688e++;
        this.f44689f = i11;
        if (this.f44697o == 3) {
            l0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0218, code lost:
    
        if (J(r7) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0270 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.C3962a.h():int");
    }

    public final void h0(char c10) throws c {
        do {
            int i5 = this.f44686c;
            int i10 = this.f44687d;
            while (i5 < i10) {
                int i11 = i5 + 1;
                char c11 = this.f44685b[i5];
                if (c11 == c10) {
                    this.f44686c = i11;
                    return;
                }
                if (c11 == '\\') {
                    this.f44686c = i11;
                    g0();
                    i5 = this.f44686c;
                    i10 = this.f44687d;
                } else {
                    if (c11 == '\n') {
                        this.f44688e++;
                        this.f44689f = i11;
                    }
                    i5 = i11;
                }
            }
            this.f44686c = i5;
        } while (w(1));
        l0("Unterminated string");
        throw null;
    }

    public void i() throws IOException {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 4) {
            throw m0("END_ARRAY");
        }
        int i5 = this.f44694l;
        this.f44694l = i5 - 1;
        int[] iArr = this.f44696n;
        int i10 = i5 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f44690g = 0;
    }

    public final void i0() {
        char c10;
        do {
            if (this.f44686c >= this.f44687d && !w(1)) {
                return;
            }
            int i5 = this.f44686c;
            int i10 = i5 + 1;
            this.f44686c = i10;
            c10 = this.f44685b[i5];
            if (c10 == '\n') {
                this.f44688e++;
                this.f44689f = i10;
                return;
            }
        } while (c10 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0() throws ra.c {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f44686c
            int r2 = r1 + r0
            int r3 = r4.f44687d
            if (r2 >= r3) goto L51
            char[] r2 = r4.f44685b
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.d()
        L4b:
            int r1 = r4.f44686c
            int r1 = r1 + r0
            r4.f44686c = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f44686c = r1
            r0 = 1
            boolean r0 = r4.w(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.C3962a.j0():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void k0() throws IOException {
        int i5 = 0;
        do {
            int iH = this.f44690g;
            if (iH == 0) {
                iH = h();
            }
            switch (iH) {
                case 1:
                    f0(3);
                    i5++;
                    this.f44690g = 0;
                    break;
                case 2:
                    if (i5 == 0) {
                        this.f44695m[this.f44694l - 1] = null;
                    }
                    this.f44694l--;
                    i5--;
                    this.f44690g = 0;
                    break;
                case 3:
                    f0(1);
                    i5++;
                    this.f44690g = 0;
                    break;
                case 4:
                    this.f44694l--;
                    i5--;
                    this.f44690g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f44690g = 0;
                    break;
                case 8:
                    h0('\'');
                    this.f44690g = 0;
                    break;
                case 9:
                    h0('\"');
                    this.f44690g = 0;
                    break;
                case 10:
                    j0();
                    this.f44690g = 0;
                    break;
                case 12:
                    h0('\'');
                    if (i5 == 0) {
                        this.f44695m[this.f44694l - 1] = "<skipped>";
                    }
                    this.f44690g = 0;
                    break;
                case 13:
                    h0('\"');
                    if (i5 == 0) {
                        this.f44695m[this.f44694l - 1] = "<skipped>";
                    }
                    this.f44690g = 0;
                    break;
                case 14:
                    j0();
                    if (i5 == 0) {
                        this.f44695m[this.f44694l - 1] = "<skipped>";
                    }
                    this.f44690g = 0;
                    break;
                case 16:
                    this.f44686c += this.f44692i;
                    this.f44690g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i5 > 0);
        int[] iArr = this.f44696n;
        int i10 = this.f44694l - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final void l0(String str) throws c {
        StringBuilder sbJ = N0.a.j(str);
        sbJ.append(P());
        sbJ.append("\nSee ");
        sbJ.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new c(sbJ.toString());
    }

    public final IllegalStateException m0(String str) {
        String str2 = e0() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("Expected ", str, " but was ");
        sbW.append(f.s(e0()));
        sbW.append(P());
        sbW.append("\nSee ");
        sbW.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbW.toString());
    }

    public void o() throws IOException {
        int iH = this.f44690g;
        if (iH == 0) {
            iH = h();
        }
        if (iH != 2) {
            throw m0("END_OBJECT");
        }
        int i5 = this.f44694l;
        int i10 = i5 - 1;
        this.f44694l = i10;
        this.f44695m[i10] = null;
        int[] iArr = this.f44696n;
        int i11 = i5 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f44690g = 0;
    }

    public String toString() {
        return getClass().getSimpleName() + P();
    }

    public final boolean w(int i5) throws IOException {
        int i10;
        int i11;
        int i12 = this.f44689f;
        int i13 = this.f44686c;
        this.f44689f = i12 - i13;
        int i14 = this.f44687d;
        char[] cArr = this.f44685b;
        if (i14 != i13) {
            int i15 = i14 - i13;
            this.f44687d = i15;
            System.arraycopy(cArr, i13, cArr, 0, i15);
        } else {
            this.f44687d = 0;
        }
        this.f44686c = 0;
        do {
            int i16 = this.f44687d;
            int i17 = this.f44684a.read(cArr, i16, cArr.length - i16);
            if (i17 == -1) {
                return false;
            }
            i10 = this.f44687d + i17;
            this.f44687d = i10;
            if (this.f44688e == 0 && (i11 = this.f44689f) == 0 && i10 > 0 && cArr[0] == 65279) {
                this.f44686c++;
                this.f44689f = i11 + 1;
                i5++;
            }
        } while (i10 < i5);
        return true;
    }

    public String y() {
        return z(false);
    }

    public final String z(boolean z2) {
        StringBuilder sb2 = new StringBuilder("$");
        int i5 = 0;
        while (true) {
            int i10 = this.f44694l;
            if (i5 >= i10) {
                return sb2.toString();
            }
            int i11 = this.k[i5];
            switch (i11) {
                case 1:
                case 2:
                    int i12 = this.f44696n[i5];
                    if (z2 && i12 > 0 && i5 == i10 - 1) {
                        i12--;
                    }
                    sb2.append('[');
                    sb2.append(i12);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f44695m[i5];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(AbstractC3256n.g(i11, "Unknown scope value: "));
            }
            i5++;
        }
    }
}
