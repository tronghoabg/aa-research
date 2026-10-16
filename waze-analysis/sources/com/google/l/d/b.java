package com.google.l.d;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.l.b.ac;
import com.google.l.b.m;
import com.google.l.s;
import com.waze.c.c.e;
import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class b implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    private final Reader f12423b;

    /* renamed from: i, reason: collision with root package name */
    private long f12430i;

    /* renamed from: j, reason: collision with root package name */
    private int f12431j;

    /* renamed from: k, reason: collision with root package name */
    private String f12432k;

    /* renamed from: l, reason: collision with root package name */
    private int[] f12433l;
    private String[] n;
    private int[] o;

    /* renamed from: c, reason: collision with root package name */
    private s f12424c = s.f12463b;

    /* renamed from: d, reason: collision with root package name */
    private final char[] f12425d = new char[1024];

    /* renamed from: e, reason: collision with root package name */
    private int f12426e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f12427f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f12428g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f12429h = 0;

    /* renamed from: a, reason: collision with root package name */
    int f12422a = 0;
    private int m = 1;

    static {
        m.f12382a = new a();
    }

    public b(Reader reader) {
        int[] iArr = new int[32];
        this.f12433l = iArr;
        iArr[0] = 6;
        this.n = new String[32];
        this.o = new int[32];
        this.f12423b = (Reader) Objects.requireNonNull(reader, "in == null");
    }

    private String A(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i2 = 0;
        while (true) {
            int i3 = this.m;
            if (i2 >= i3) {
                return sb.toString();
            }
            int i4 = this.f12433l[i2];
            switch (i4) {
                case 1:
                case 2:
                    int i5 = this.o[i2];
                    if (z && i5 > 0 && i2 == i3 - 1) {
                        i5--;
                    }
                    sb.append('[');
                    sb.append(i5);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.n[i2];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i4);
            }
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r0 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        r0.append(r4, r2, r3);
        r10.f12426e = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String B(char r11) throws com.google.l.d.d {
        /*
            r10 = this;
            r0 = 0
        L1:
            int r1 = r10.f12426e
            int r2 = r10.f12427f
            r3 = r2
            r2 = r1
        L7:
            char[] r4 = r10.f12425d
            r5 = 16
            r6 = 1
            if (r1 >= r3) goto L6f
            int r7 = r1 + 1
            char r1 = r4[r1]
            com.google.l.s r8 = r10.f12424c
            com.google.l.s r9 = com.google.l.s.f12464c
            if (r8 != r9) goto L24
            r8 = 32
            if (r1 < r8) goto L1d
            goto L24
        L1d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            com.google.l.d.d r10 = r10.y(r11)
            throw r10
        L24:
            if (r1 != r11) goto L3c
            int r11 = r7 - r2
            int r11 = r11 + (-1)
            r10.f12426e = r7
            if (r0 != 0) goto L34
            java.lang.String r10 = new java.lang.String
            r10.<init>(r4, r2, r11)
            return r10
        L34:
            r0.append(r4, r2, r11)
            java.lang.String r10 = r0.toString()
            return r10
        L3c:
            r8 = 92
            if (r1 != r8) goto L62
            int r1 = r7 - r2
            int r3 = r1 + (-1)
            r10.f12426e = r7
            if (r0 != 0) goto L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r0.<init>(r1)
        L52:
            r0.append(r4, r2, r3)
            char r1 = r10.d()
            r0.append(r1)
            int r2 = r10.f12426e
            int r3 = r10.f12427f
            r1 = r2
            goto L7
        L62:
            r4 = 10
            if (r1 != r4) goto L6d
            int r1 = r10.f12428g
            int r1 = r1 + r6
            r10.f12428g = r1
            r10.f12429h = r7
        L6d:
            r1 = r7
            goto L7
        L6f:
            int r3 = r1 - r2
            if (r0 != 0) goto L7f
            int r0 = r3 + r3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            int r0 = java.lang.Math.max(r0, r5)
            r7.<init>(r0)
            r0 = r7
        L7f:
            r0.append(r4, r2, r3)
            r10.f12426e = r1
            boolean r1 = r10.J(r6)
            if (r1 == 0) goto L8c
            goto L1
        L8c:
            java.lang.String r11 = "Unterminated string"
            com.google.l.d.d r10 = r10.y(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.d.b.B(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        D();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String C() throws com.google.l.d.d {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r5.f12426e
            int r3 = r3 + r2
            int r4 = r5.f12427f
            if (r3 >= r4) goto L4c
            char[] r4 = r5.f12425d
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.D()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.J(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.f12425d
            int r4 = r5.f12426e
            r1.append(r3, r4, r2)
            int r3 = r5.f12426e
            int r3 = r3 + r2
            r5.f12426e = r3
            r2 = 1
            boolean r2 = r5.J(r2)
            if (r2 != 0) goto L2
        L7b:
            char[] r2 = r5.f12425d
            if (r1 != 0) goto L87
            java.lang.String r1 = new java.lang.String
            int r3 = r5.f12426e
            r1.<init>(r2, r3, r0)
            goto L90
        L87:
            int r3 = r5.f12426e
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L90:
            int r2 = r5.f12426e
            int r2 = r2 + r0
            r5.f12426e = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.d.b.C():java.lang.String");
    }

    private final void D() throws d {
        if (this.f12424c != s.f12462a) {
            throw y("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void E(int i2) throws d {
        int i3 = this.m;
        if (i3 - 1 >= 1280) {
            throw new d("Nesting limit 1280 reached" + u());
        }
        int[] iArr = this.f12433l;
        if (i3 == iArr.length) {
            int i4 = i3 + i3;
            this.f12433l = Arrays.copyOf(iArr, i4);
            this.o = Arrays.copyOf(this.o, i4);
            this.n = (String[]) Arrays.copyOf(this.n, i4);
        }
        int[] iArr2 = this.f12433l;
        int i5 = this.m;
        this.m = i5 + 1;
        iArr2[i5] = i2;
    }

    private final void F(char c2) throws d {
        do {
            int i2 = this.f12426e;
            int i3 = this.f12427f;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c3 = this.f12425d[i2];
                if (c3 == c2) {
                    this.f12426e = i4;
                    return;
                }
                if (c3 == '\\') {
                    this.f12426e = i4;
                    d();
                    i2 = this.f12426e;
                    i3 = this.f12427f;
                } else {
                    if (c3 == '\n') {
                        this.f12428g++;
                        this.f12429h = i4;
                    }
                    i2 = i4;
                }
            }
            this.f12426e = i2;
        } while (J(1));
        throw y("Unterminated string");
    }

    private final void G() {
        char c2;
        do {
            if (this.f12426e >= this.f12427f && !J(1)) {
                return;
            }
            char[] cArr = this.f12425d;
            int i2 = this.f12426e;
            int i3 = i2 + 1;
            this.f12426e = i3;
            c2 = cArr[i2];
            if (c2 == '\n') {
                this.f12428g++;
                this.f12429h = i3;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0047, code lost:
    
        D();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void H() throws com.google.l.d.d {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r4.f12426e
            int r2 = r2 + r1
            int r3 = r4.f12427f
            if (r2 >= r3) goto L50
            char[] r3 = r4.f12425d
            char r2 = r3[r2]
            r3 = 9
            if (r2 == r3) goto L4a
            r3 = 10
            if (r2 == r3) goto L4a
            r3 = 12
            if (r2 == r3) goto L4a
            r3 = 13
            if (r2 == r3) goto L4a
            r3 = 32
            if (r2 == r3) goto L4a
            r3 = 35
            if (r2 == r3) goto L47
            r3 = 44
            if (r2 == r3) goto L4a
            r3 = 47
            if (r2 == r3) goto L47
            r3 = 61
            if (r2 == r3) goto L47
            r3 = 123(0x7b, float:1.72E-43)
            if (r2 == r3) goto L4a
            r3 = 125(0x7d, float:1.75E-43)
            if (r2 == r3) goto L4a
            r3 = 58
            if (r2 == r3) goto L4a
            r3 = 59
            if (r2 == r3) goto L47
            switch(r2) {
                case 91: goto L4a;
                case 92: goto L47;
                case 93: goto L4a;
                default: goto L44;
            }
        L44:
            int r1 = r1 + 1
            goto L2
        L47:
            r4.D()
        L4a:
            int r0 = r4.f12426e
            int r0 = r0 + r1
            r4.f12426e = r0
            return
        L50:
            r4.f12426e = r2
            r1 = 1
            boolean r1 = r4.J(r1)
            if (r1 == 0) goto L5a
            goto L1
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.d.b.H():void");
    }

    private final void I(String str) throws d {
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) > 127) {
                throw y("String contains non-ASCII characters: ".concat(String.valueOf(str)));
            }
        }
    }

    private final boolean J(int i2) throws IOException {
        int i3;
        int i4 = this.f12429h;
        int i5 = this.f12426e;
        this.f12429h = i4 - i5;
        char[] cArr = this.f12425d;
        int i6 = this.f12427f;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f12427f = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f12427f = 0;
        }
        this.f12426e = 0;
        do {
            Reader reader = this.f12423b;
            int i8 = this.f12427f;
            int i9 = reader.read(cArr, i8, 1024 - i8);
            if (i9 == -1) {
                return false;
            }
            i3 = this.f12427f + i9;
            this.f12427f = i3;
            if (this.f12428g == 0 && this.f12429h == 0 && i3 > 0 && cArr[0] == 65279) {
                this.f12426e++;
                this.f12429h = 1;
                i2++;
            }
        } while (i3 < i2);
        return true;
    }

    private final boolean K(char c2) throws d {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
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
        D();
        return false;
    }

    private final char d() throws d {
        int i2;
        if (this.f12426e == this.f12427f && !J(1)) {
            throw y("Unterminated escape sequence");
        }
        char[] cArr = this.f12425d;
        int i3 = this.f12426e;
        int i4 = i3 + 1;
        this.f12426e = i4;
        char c2 = cArr[i3];
        if (c2 != '\n') {
            if (c2 != '\"') {
                if (c2 != '\'') {
                    if (c2 != '/' && c2 != '\\') {
                        if (c2 == 'b') {
                            return '\b';
                        }
                        if (c2 == 'f') {
                            return '\f';
                        }
                        if (c2 == 'n') {
                            return '\n';
                        }
                        if (c2 == 'r') {
                            return '\r';
                        }
                        if (c2 == 't') {
                            return '\t';
                        }
                        if (c2 != 'u') {
                            throw y("Invalid escape sequence");
                        }
                        if (i3 + 5 > this.f12427f && !J(4)) {
                            throw y("Unterminated escape sequence");
                        }
                        int i5 = this.f12426e;
                        int i6 = i5 + 4;
                        int i7 = 0;
                        while (i5 < i6) {
                            int i8 = i7 << 4;
                            char c3 = cArr[i5];
                            if (c3 >= '0' && c3 <= '9') {
                                i2 = c3 - '0';
                            } else if (c3 >= 'a' && c3 <= 'f') {
                                i2 = c3 - 'W';
                            } else {
                                if (c3 < 'A' || c3 > 'F') {
                                    throw y("Malformed Unicode escape \\u".concat(new String(cArr, this.f12426e, 4)));
                                }
                                i2 = c3 - '7';
                            }
                            i7 = i8 + i2;
                            i5++;
                        }
                        this.f12426e += 4;
                        return (char) i7;
                    }
                }
            }
            return c2;
        }
        if (this.f12424c == s.f12464c) {
            throw y("Cannot escape a newline character in strict mode");
        }
        this.f12428g++;
        this.f12429h = i4;
        if (this.f12424c == s.f12464c) {
            throw y("Invalid escaped character \"'\" in strict mode");
        }
        return c2;
    }

    private final int n(boolean z) throws IOException {
        int i2;
        int i3 = this.f12426e;
        int i4 = this.f12427f;
        while (true) {
            if (i3 == i4) {
                this.f12426e = i3;
                if (!J(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(u()));
                    }
                    return -1;
                }
                i3 = this.f12426e;
                i4 = this.f12427f;
            }
            char[] cArr = this.f12425d;
            int i5 = i3 + 1;
            char c2 = cArr[i3];
            if (c2 == '\n') {
                this.f12428g++;
                this.f12429h = i5;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f12426e = i5;
                    if (i5 == i4) {
                        this.f12426e = i3;
                        boolean zJ = J(2);
                        this.f12426e++;
                        if (!zJ) {
                            return 47;
                        }
                    }
                    D();
                    int i6 = this.f12426e;
                    char c3 = cArr[i6];
                    if (c3 == '*') {
                        this.f12426e = i6 + 1;
                        while (true) {
                            if (this.f12426e + 2 > this.f12427f && !J(2)) {
                                throw y("Unterminated comment");
                            }
                            int i7 = this.f12426e;
                            if (cArr[i7] != '\n') {
                                while (true) {
                                    int i8 = this.f12426e;
                                    if (i2 >= 2) {
                                        i3 = i8 + 2;
                                        i4 = this.f12427f;
                                        break;
                                    }
                                    i2 = cArr[i8 + i2] == "*/".charAt(i2) ? i2 + 1 : 0;
                                }
                            } else {
                                this.f12428g++;
                                this.f12429h = i7 + 1;
                            }
                            this.f12426e++;
                        }
                    } else {
                        if (c3 != '/') {
                            return 47;
                        }
                        this.f12426e = i6 + 1;
                        G();
                        i3 = this.f12426e;
                        i4 = this.f12427f;
                    }
                } else {
                    if (c2 != '#') {
                        this.f12426e = i5;
                        return c2;
                    }
                    this.f12426e = i5;
                    D();
                    G();
                    i3 = this.f12426e;
                    i4 = this.f12427f;
                }
            }
            i3 = i5;
        }
    }

    private final d y(String str) throws d {
        throw new d(str + u() + "\nSee " + ac.a("malformed-json"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IllegalStateException z(String str) throws IOException {
        int iR = r();
        String strC = e.c(r());
        String strU = u();
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(strC);
        sb.append(strU);
        sb.append("\nSee ");
        sb.append(ac.a(iR == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
        return new IllegalStateException(sb.toString());
    }

    public double a() throws IOException, NumberFormatException {
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            this.f12422a = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f12430i;
        }
        if (iS == 16) {
            char[] cArr = this.f12425d;
            int i3 = this.f12426e;
            int i4 = this.f12431j;
            this.f12432k = new String(cArr, i3, i4);
            this.f12426e = i3 + i4;
        } else if (iS == 8 || iS == 9) {
            this.f12432k = B(iS == 8 ? '\'' : JsonFactory.DEFAULT_QUOTE_CHAR);
        } else if (iS == 10) {
            this.f12432k = C();
        } else if (iS != 11) {
            throw z("a double");
        }
        this.f12422a = 11;
        try {
            double d2 = Double.parseDouble(this.f12432k);
            if (this.f12424c != s.f12462a && (Double.isNaN(d2) || Double.isInfinite(d2))) {
                throw y("JSON forbids NaN and infinities: " + d2);
            }
            this.f12432k = null;
            this.f12422a = 0;
            int[] iArr2 = this.o;
            int i5 = this.m - 1;
            iArr2[i5] = iArr2[i5] + 1;
            return d2;
        } catch (NumberFormatException e2) {
            NumberFormatException numberFormatException = new NumberFormatException("Expected a double but was " + this.f12432k + u());
            numberFormatException.initCause(e2);
            throw numberFormatException;
        }
    }

    public int b() throws IOException, NumberFormatException {
        String strB;
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            long j2 = this.f12430i;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.f12422a = 0;
                int[] iArr = this.o;
                int i3 = this.m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + j2 + u());
        }
        if (iS == 16) {
            char[] cArr = this.f12425d;
            int i4 = this.f12426e;
            int i5 = this.f12431j;
            this.f12432k = new String(cArr, i4, i5);
            this.f12426e = i4 + i5;
        } else {
            if (iS != 8 && iS != 9 && iS != 10) {
                throw z("an int");
            }
            if (iS == 10) {
                strB = C();
                this.f12432k = strB;
            } else {
                strB = B(iS == 8 ? '\'' : JsonFactory.DEFAULT_QUOTE_CHAR);
                this.f12432k = strB;
            }
            I(strB);
            try {
                int i6 = Integer.parseInt(this.f12432k);
                this.f12422a = 0;
                int[] iArr2 = this.o;
                int i7 = this.m - 1;
                iArr2[i7] = iArr2[i7] + 1;
                return i6;
            } catch (NumberFormatException unused) {
            }
        }
        this.f12422a = 11;
        try {
            double d2 = Double.parseDouble(this.f12432k);
            int i8 = (int) d2;
            if (i8 == d2) {
                this.f12432k = null;
                this.f12422a = 0;
                int[] iArr3 = this.o;
                int i9 = this.m - 1;
                iArr3[i9] = iArr3[i9] + 1;
                return i8;
            }
            throw new NumberFormatException("Expected an int but was " + this.f12432k + u());
        } catch (NumberFormatException e2) {
            NumberFormatException numberFormatException = new NumberFormatException("Expected an int but was " + this.f12432k + u());
            numberFormatException.initCause(e2);
            throw numberFormatException;
        }
    }

    public long c() throws IOException, NumberFormatException {
        String strB;
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 15) {
            this.f12422a = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f12430i;
        }
        if (iS == 16) {
            char[] cArr = this.f12425d;
            int i3 = this.f12426e;
            int i4 = this.f12431j;
            this.f12432k = new String(cArr, i3, i4);
            this.f12426e = i3 + i4;
        } else {
            if (iS != 8 && iS != 9 && iS != 10) {
                throw z("a long");
            }
            if (iS == 10) {
                strB = C();
                this.f12432k = strB;
            } else {
                strB = B(iS == 8 ? '\'' : JsonFactory.DEFAULT_QUOTE_CHAR);
                this.f12432k = strB;
            }
            I(strB);
            try {
                long j2 = Long.parseLong(this.f12432k);
                this.f12422a = 0;
                int[] iArr2 = this.o;
                int i5 = this.m - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f12422a = 11;
        try {
            double d2 = Double.parseDouble(this.f12432k);
            long j3 = (long) d2;
            if (j3 == d2) {
                this.f12432k = null;
                this.f12422a = 0;
                int[] iArr3 = this.o;
                int i6 = this.m - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return j3;
            }
            throw new NumberFormatException("Expected a long but was " + this.f12432k + u());
        } catch (NumberFormatException e2) {
            NumberFormatException numberFormatException = new NumberFormatException("Expected a long but was " + this.f12432k + u());
            numberFormatException.initCause(e2);
            throw numberFormatException;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f12422a = 0;
        this.f12433l[0] = 8;
        this.m = 1;
        this.f12423b.close();
    }

    public String e() {
        return A(false);
    }

    public String f() {
        return A(true);
    }

    public String g() throws IOException {
        String strB;
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            strB = C();
        } else if (iS == 12) {
            strB = B('\'');
        } else {
            if (iS != 13) {
                throw z("a name");
            }
            strB = B(JsonFactory.DEFAULT_QUOTE_CHAR);
        }
        this.f12422a = 0;
        this.n[this.m - 1] = strB;
        return strB;
    }

    public String h() throws IOException {
        String string;
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 10) {
            string = C();
        } else if (iS == 8) {
            string = B('\'');
        } else if (iS == 9) {
            string = B(JsonFactory.DEFAULT_QUOTE_CHAR);
        } else if (iS == 11) {
            string = this.f12432k;
            this.f12432k = null;
        } else if (iS == 15) {
            string = Long.toString(this.f12430i);
        } else {
            if (iS != 16) {
                throw z("a string");
            }
            String str = new String(this.f12425d, this.f12426e, this.f12431j);
            this.f12426e += this.f12431j;
            string = str;
        }
        this.f12422a = 0;
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
        return string;
    }

    public void i() throws IOException {
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 3) {
            throw z("BEGIN_ARRAY");
        }
        E(1);
        this.o[this.m - 1] = 0;
        this.f12422a = 0;
    }

    public void j() throws IOException {
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 1) {
            throw z("BEGIN_OBJECT");
        }
        E(3);
        this.f12422a = 0;
    }

    public void k() throws IOException {
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 4) {
            throw z("END_ARRAY");
        }
        int i2 = this.m;
        this.m = i2 - 1;
        int[] iArr = this.o;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f12422a = 0;
    }

    public void l() throws IOException {
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 2) {
            throw z("END_OBJECT");
        }
        int i2 = this.m;
        int i3 = i2 - 1;
        this.m = i3;
        this.n[i3] = null;
        int[] iArr = this.o;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.f12422a = 0;
    }

    public void m() throws IOException {
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 7) {
            throw z("null");
        }
        this.f12422a = 0;
        int[] iArr = this.o;
        int i2 = this.m - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void o() throws IOException {
        int i2 = 0;
        do {
            int iS = this.f12422a;
            if (iS == 0) {
                iS = s();
            }
            switch (iS) {
                case 1:
                    E(3);
                    i2++;
                    this.f12422a = 0;
                    break;
                case 2:
                    if (i2 == 0) {
                        this.n[this.m - 1] = null;
                        i2 = 0;
                    }
                    this.m--;
                    i2--;
                    this.f12422a = 0;
                    break;
                case 3:
                    E(1);
                    i2++;
                    this.f12422a = 0;
                    break;
                case 4:
                    this.m--;
                    i2--;
                    this.f12422a = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f12422a = 0;
                    break;
                case 8:
                    F('\'');
                    this.f12422a = 0;
                    break;
                case 9:
                    F(JsonFactory.DEFAULT_QUOTE_CHAR);
                    this.f12422a = 0;
                    break;
                case 10:
                    H();
                    this.f12422a = 0;
                    break;
                case 12:
                    F('\'');
                    if (i2 == 0) {
                        this.n[this.m - 1] = "<skipped>";
                        i2 = 0;
                    }
                    this.f12422a = 0;
                    break;
                case 13:
                    F(JsonFactory.DEFAULT_QUOTE_CHAR);
                    if (i2 == 0) {
                        this.n[this.m - 1] = "<skipped>";
                        i2 = 0;
                    }
                    this.f12422a = 0;
                    break;
                case 14:
                    H();
                    if (i2 == 0) {
                        this.n[this.m - 1] = "<skipped>";
                        i2 = 0;
                    }
                    this.f12422a = 0;
                    break;
                case 16:
                    this.f12426e += this.f12431j;
                    this.f12422a = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i2 > 0);
        int[] iArr = this.o;
        int i3 = this.m - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    public boolean p() throws IOException {
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        return (iS == 2 || iS == 4 || iS == 17) ? false : true;
    }

    public boolean q() throws IOException {
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 5) {
            this.f12422a = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iS != 6) {
            throw z("a boolean");
        }
        this.f12422a = 0;
        int[] iArr2 = this.o;
        int i3 = this.m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public int r() throws IOException {
        int iS = this.f12422a;
        if (iS == 0) {
            iS = s();
        }
        switch (iS) {
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
            default:
                return 10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x019e, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0223, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0229, code lost:
    
        if (K(r1) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0241, code lost:
    
        if (r3 == 0) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0295 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int s() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.l.d.b.s():int");
    }

    public final s t() {
        return this.f12424c;
    }

    public String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(u());
    }

    String u() {
        int i2 = this.f12428g + 1;
        int i3 = this.f12426e - this.f12429h;
        return " at line " + i2 + " column " + (i3 + 1) + " path " + e();
    }

    public final void v(s sVar) {
        Objects.requireNonNull(sVar);
        this.f12424c = sVar;
    }

    public final boolean w() {
        return this.f12424c == s.f12462a;
    }
}
