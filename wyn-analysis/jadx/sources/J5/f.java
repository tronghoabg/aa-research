package J5;

import A7.AbstractC0279p0;
import Va.M6;
import Yf.C1303i;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5632a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f5633b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5634c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5635d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5636e;

    public f(c cVar, e eVar, long j8, long j10, long j11, long j12, long j13, int i5) {
        this.f5635d = eVar;
        this.f5633b = i5;
        this.f5634c = new a(cVar, j8, j10, j11, j12, j13);
    }

    public static int B(h hVar, long j8, n nVar) {
        if (j8 == hVar.f5646d) {
            return 0;
        }
        nVar.f5655a = j8;
        return 1;
    }

    public static int C(s2.j jVar, long j8, n nVar) {
        if (j8 == jVar.f44898d) {
            return 0;
        }
        nVar.f5655a = j8;
        return 1;
    }

    public static /* synthetic */ void r(f fVar, String str, int i5, String str2, int i10) {
        if ((i10 & 2) != 0) {
            i5 = fVar.f5633b;
        }
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        fVar.q(i5, str, str2);
        throw null;
    }

    public static boolean w(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    public abstract int A(int i5);

    public void D(long j8) {
        switch (this.f5632a) {
            case 0:
                b bVar = (b) this.f5636e;
                if (bVar == null || bVar.f5620a != j8) {
                    a aVar = (a) this.f5634c;
                    this.f5636e = new b(j8, aVar.f5614a.a(j8), aVar.f5616c, aVar.f5617d, aVar.f5618e, aVar.f5619f, 0);
                    break;
                }
                break;
            default:
                b bVar2 = (b) this.f5636e;
                if (bVar2 == null || bVar2.f5620a != j8) {
                    s2.d dVar = (s2.d) this.f5634c;
                    this.f5636e = new b(j8, dVar.f44872a.a(j8), dVar.f44874c, dVar.f44875d, dVar.f44876e, dVar.f44877f, 1);
                    break;
                }
                break;
        }
    }

    public abstract int E();

    public String F(int i5, int i10) {
        return t().subSequence(i5, i10).toString();
    }

    public boolean G() {
        int iE = E();
        CharSequence charSequenceT = t();
        if (iE >= charSequenceT.length() || iE == -1 || charSequenceT.charAt(iE) != ',') {
            return false;
        }
        this.f5633b++;
        return true;
    }

    public void H(char c10) {
        int i5 = this.f5633b;
        if (i5 > 0 && c10 == '\"') {
            try {
                this.f5633b = i5 - 1;
                String strL = l();
                this.f5633b = i5;
                if (AbstractC3340k.a(strL, "null")) {
                    q(this.f5633b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f5633b = i5;
                throw th;
            }
        }
        String strR = Yf.r.r(Yf.r.f(c10));
        int i10 = this.f5633b;
        int i11 = i10 - 1;
        r(this, R8.v.g("Expected ", strR, ", but had '", (i10 == t().length() || i11 < 0) ? "EOF" : String.valueOf(t().charAt(i11)), "' instead"), i11, null, 4);
        throw null;
    }

    public int a(CharSequence charSequence, int i5) {
        int i10 = i5 + 4;
        if (i10 < charSequence.length()) {
            ((StringBuilder) this.f5636e).append((char) (s(charSequence, i5 + 3) + (s(charSequence, i5) << 12) + (s(charSequence, i5 + 1) << 8) + (s(charSequence, i5 + 2) << 4)));
            return i10;
        }
        this.f5633b = i5;
        o();
        if (this.f5633b + 4 < charSequence.length()) {
            return a(charSequence, this.f5633b);
        }
        r(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i5, int i10) {
        ((StringBuilder) this.f5636e).append(t(), i5, i10);
    }

    public abstract boolean c();

    public void d(int i5, String str) {
        if (t().length() - i5 < str.length()) {
            r(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != (t().charAt(i5 + i10) | ' ')) {
                r(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f5633b = str.length() + i5;
    }

    public abstract String e();

    public abstract byte f();

    public byte g(byte b5) {
        byte bF = f();
        if (bF == b5) {
            return bF;
        }
        String strR = Yf.r.r(b5);
        int i5 = this.f5633b;
        int i10 = i5 - 1;
        r(this, R8.v.g("Expected ", strR, ", but had '", (i5 == t().length() || i10 < 0) ? "EOF" : String.valueOf(t().charAt(i10)), "' instead"), i10, null, 4);
        throw null;
    }

    public abstract void h(char c10);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b4, code lost:
    
        r(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ba, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c3, code lost:
    
        throw new E5.Q((byte) 0, 9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c4, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c6, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01cb, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ce, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01cf, code lost:
    
        r(r22, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01d6, code lost:
    
        r(r22, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01db, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
    
        r12 = r6;
        r(r22, "Unexpected symbol '" + r8 + "' in numeric literal", 0, r12, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012a, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012b, code lost:
    
        r20 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0133, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0135, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0137, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0138, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013a, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013e, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0146, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0148, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0154, code lost:
    
        if (t().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0156, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0159, code lost:
    
        r(r22, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0162, code lost:
    
        r(r22, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0168, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0169, code lost:
    
        r22.f5633b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x016b, code lost:
    
        if (r21 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016d, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r20 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0172, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017c, code lost:
    
        if (r20 != true) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017e, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0183, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0188, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018e, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0196, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0198, code lost:
    
        r14 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019a, code lost:
    
        r(r22, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i() {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.f.i():long");
    }

    public String j() {
        String str = (String) this.f5635d;
        if (str == null) {
            return e();
        }
        AbstractC3340k.b(str);
        this.f5635d = null;
        return str;
    }

    public String k(CharSequence source, int i5, int i10) {
        AbstractC3340k.e(source, "source");
        char cCharAt = source.charAt(i10);
        boolean z2 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i5, i10);
                int iA = A(i10 + 1);
                if (iA == -1) {
                    r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA2 = iA + 1;
                char cCharAt2 = t().charAt(iA);
                if (cCharAt2 == 'u') {
                    iA2 = a(t(), iA2);
                } else {
                    char c10 = cCharAt2 < 'u' ? C1303i.f16859a[cCharAt2] : (char) 0;
                    if (c10 == 0) {
                        r(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    ((StringBuilder) this.f5636e).append(c10);
                }
                i5 = A(iA2);
                if (i5 == -1) {
                    r(this, "Unexpected EOF", i5, null, 4);
                    throw null;
                }
            } else {
                i10++;
                if (i10 >= source.length()) {
                    b(i5, i10);
                    i5 = A(i10);
                    if (i5 == -1) {
                        r(this, "Unexpected EOF", i5, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                    cCharAt = source.charAt(i10);
                }
            }
            i10 = i5;
            z2 = true;
            cCharAt = source.charAt(i10);
        }
        String strF = !z2 ? F(i5, i10) : n(i5, i10);
        this.f5633b = i10 + 1;
        return strF;
    }

    public String l() {
        String str = (String) this.f5635d;
        if (str != null) {
            AbstractC3340k.b(str);
            this.f5635d = null;
            return str;
        }
        int iE = E();
        if (iE >= t().length() || iE == -1) {
            r(this, "EOF", iE, null, 4);
            throw null;
        }
        byte bF = Yf.r.f(t().charAt(iE));
        if (bF == 1) {
            return j();
        }
        if (bF != 0) {
            r(this, "Expected beginning of the string, but got " + t().charAt(iE), 0, null, 6);
            throw null;
        }
        boolean z2 = false;
        while (Yf.r.f(t().charAt(iE)) == 0) {
            iE++;
            if (iE >= t().length()) {
                b(this.f5633b, iE);
                int iA = A(iE);
                if (iA == -1) {
                    this.f5633b = iE;
                    return n(0, 0);
                }
                iE = iA;
                z2 = true;
            }
        }
        String strF = !z2 ? F(this.f5633b, iE) : n(this.f5633b, iE);
        this.f5633b = iE;
        return strF;
    }

    public String m() {
        String strL = l();
        if (!AbstractC3340k.a(strL, "null") || t().charAt(this.f5633b - 1) == '\"') {
            return strL;
        }
        r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public String n(int i5, int i10) {
        b(i5, i10);
        StringBuilder sb2 = (StringBuilder) this.f5636e;
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        sb2.setLength(0);
        return string;
    }

    public void p() {
        if (f() == 10) {
            return;
        }
        r(this, "Expected EOF after parsing, but had " + t().charAt(this.f5633b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public void q(int i5, String message, String hint) {
        AbstractC3340k.e(message, "message");
        AbstractC3340k.e(hint, "hint");
        String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder sbQ = AbstractC0279p0.q(message, " at path: ");
        sbQ.append(((E4.n) this.f5634c).j());
        sbQ.append(strConcat);
        throw Yf.r.c(i5, t(), sbQ.toString());
    }

    public int s(CharSequence charSequence, int i5) {
        char cCharAt = charSequence.charAt(i5);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        r(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract CharSequence t();

    public String toString() {
        switch (this.f5632a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("JsonReader(source='");
                sb2.append((Object) t());
                sb2.append("', currentPosition=");
                return M6.r(sb2, this.f5633b, ')');
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        return B(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int u(J5.h r28, J5.n r29) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            java.lang.Object r3 = r0.f5636e
            J5.b r3 = (J5.b) r3
            u6.AbstractC4256a.j(r3)
            long r4 = r3.f5625f
            long r6 = r3.f5626g
            long r8 = r3.f5627h
            long r6 = r6 - r4
            int r10 = r0.f5633b
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            java.lang.Object r10 = r0.f5635d
            J5.e r10 = (J5.e) r10
            if (r6 > 0) goto L2a
            r0.f5636e = r7
            r10.s()
            int r1 = B(r1, r4, r2)
            return r1
        L2a:
            long r4 = r1.f5646d
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lc6
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lc6
            int r4 = (int) r4
            r1.j(r4)
            r4 = 0
            r1.f5648f = r4
            long r4 = r3.f5621b
            J5.d r4 = r10.t(r1, r4)
            r5 = -3
            int r6 = r4.f5629a
            if (r6 == r5) goto Lbc
            r5 = -2
            long r8 = r4.f5630b
            r15 = r11
            long r11 = r4.f5631c
            if (r6 == r5) goto L9b
            r4 = -1
            if (r6 == r4) goto L7c
            if (r6 != 0) goto L74
            long r3 = r1.f5646d
            long r3 = r11 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L6a
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 > 0) goto L6a
            int r3 = (int) r3
            r1.j(r3)
        L6a:
            r0.f5636e = r7
            r10.s()
            int r1 = B(r1, r11, r2)
            return r1
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L7c:
            r3.f5624e = r8
            r3.f5626g = r11
            long r4 = r3.f5623d
            long r6 = r3.f5625f
            long r13 = r3.f5622c
            r17 = r4
            long r4 = r3.f5621b
            r15 = r4
            r21 = r6
            r19 = r8
            r23 = r11
            r25 = r13
            long r4 = J5.b.a(r15, r17, r19, r21, r23, r25)
            r3.f5627h = r4
            goto L6
        L9b:
            r4 = r8
            r6 = r11
            r3.f5623d = r4
            r3.f5625f = r6
            long r8 = r3.f5624e
            long r10 = r3.f5626g
            long r12 = r3.f5622c
            long r14 = r3.f5621b
            r17 = r4
            r21 = r6
            r19 = r8
            r23 = r10
            r25 = r12
            r15 = r14
            long r4 = J5.b.a(r15, r17, r19, r21, r23, r25)
            r3.f5627h = r4
            goto L6
        Lbc:
            r0.f5636e = r7
            r10.s()
            int r1 = B(r1, r8, r2)
            return r1
        Lc6:
            int r1 = B(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.f.u(J5.h, J5.n):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        return C(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int v(s2.j r28, J5.n r29) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
        L6:
            java.lang.Object r3 = r0.f5636e
            J5.b r3 = (J5.b) r3
            Q1.k.h(r3)
            long r4 = r3.f5625f
            long r6 = r3.f5626g
            long r8 = r3.f5627h
            long r6 = r6 - r4
            int r10 = r0.f5633b
            long r10 = (long) r10
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            r7 = 0
            java.lang.Object r10 = r0.f5635d
            s2.g r10 = (s2.g) r10
            if (r6 > 0) goto L2a
            r0.f5636e = r7
            r10.s()
            int r1 = C(r1, r4, r2)
            return r1
        L2a:
            long r4 = r1.f44898d
            long r4 = r8 - r4
            r11 = 0
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 < 0) goto Lc6
            r13 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r6 > 0) goto Lc6
            int r4 = (int) r4
            r1.j(r4)
            r4 = 0
            r1.f44900f = r4
            long r4 = r3.f5621b
            s2.f r4 = r10.I(r1, r4)
            r5 = -3
            int r6 = r4.f44879a
            if (r6 == r5) goto Lbc
            r5 = -2
            long r8 = r4.f44880b
            r15 = r11
            long r11 = r4.f44881c
            if (r6 == r5) goto L9b
            r4 = -1
            if (r6 == r4) goto L7c
            if (r6 != 0) goto L74
            long r3 = r1.f44898d
            long r3 = r11 - r3
            int r5 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r5 < 0) goto L6a
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 > 0) goto L6a
            int r3 = (int) r3
            r1.j(r3)
        L6a:
            r0.f5636e = r7
            r10.s()
            int r1 = C(r1, r11, r2)
            return r1
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid case"
            r1.<init>(r2)
            throw r1
        L7c:
            r3.f5624e = r8
            r3.f5626g = r11
            long r4 = r3.f5623d
            long r6 = r3.f5625f
            long r13 = r3.f5622c
            r17 = r4
            long r4 = r3.f5621b
            r15 = r4
            r21 = r6
            r19 = r8
            r23 = r11
            r25 = r13
            long r4 = J5.b.b(r15, r17, r19, r21, r23, r25)
            r3.f5627h = r4
            goto L6
        L9b:
            r4 = r8
            r6 = r11
            r3.f5623d = r4
            r3.f5625f = r6
            long r8 = r3.f5624e
            long r10 = r3.f5626g
            long r12 = r3.f5622c
            long r14 = r3.f5621b
            r17 = r4
            r21 = r6
            r19 = r8
            r23 = r10
            r25 = r12
            r15 = r14
            long r4 = J5.b.b(r15, r17, r19, r21, r23, r25)
            r3.f5627h = r4
            goto L6
        Lbc:
            r0.f5636e = r7
            r10.s()
            int r1 = C(r1, r8, r2)
            return r1
        Lc6:
            int r1 = C(r1, r8, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.f.v(s2.j, J5.n):int");
    }

    public abstract String x(String str, boolean z2);

    public byte y() {
        CharSequence charSequenceT = t();
        int i5 = this.f5633b;
        while (true) {
            int iA = A(i5);
            if (iA == -1) {
                this.f5633b = iA;
                return (byte) 10;
            }
            char cCharAt = charSequenceT.charAt(iA);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f5633b = iA;
                return Yf.r.f(cCharAt);
            }
            i5 = iA + 1;
        }
    }

    public String z(boolean z2) {
        String strJ;
        byte bY = y();
        if (z2) {
            if (bY != 1 && bY != 0) {
                return null;
            }
            strJ = l();
        } else {
            if (bY != 1) {
                return null;
            }
            strJ = j();
        }
        this.f5635d = strJ;
        return strJ;
    }

    public f(s2.e eVar, s2.g gVar, long j8, long j10, long j11, long j12, long j13, int i5) {
        this.f5635d = gVar;
        this.f5633b = i5;
        this.f5634c = new s2.d(eVar, j8, j10, j11, j12, j13);
    }

    public f() {
        E4.n nVar = new E4.n((short) 0, 8);
        nVar.f2939c = new Object[8];
        int[] iArr = new int[8];
        for (int i5 = 0; i5 < 8; i5++) {
            iArr[i5] = -1;
        }
        nVar.f2940d = iArr;
        nVar.f2938b = -1;
        this.f5634c = nVar;
        this.f5636e = new StringBuilder();
    }

    public void o() {
    }
}
