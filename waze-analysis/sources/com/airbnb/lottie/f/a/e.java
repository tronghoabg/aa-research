package com.airbnb.lottie.f.a;

import java.io.EOFException;
import k.h;
import k.j;
import k.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class e extends d {

    /* renamed from: e, reason: collision with root package name */
    private static final k f2317e;

    /* renamed from: f, reason: collision with root package name */
    private static final k f2318f;

    /* renamed from: g, reason: collision with root package name */
    private static final k f2319g;

    /* renamed from: h, reason: collision with root package name */
    private static final k f2320h;

    /* renamed from: i, reason: collision with root package name */
    private static final k f2321i;

    /* renamed from: j, reason: collision with root package name */
    private final j f2322j;

    /* renamed from: k, reason: collision with root package name */
    private final h f2323k;

    /* renamed from: l, reason: collision with root package name */
    private int f2324l = 0;
    private long m;
    private int n;
    private String o;

    static {
        k kVar = k.f50843a;
        f2317e = okhttp3.internal.publicsuffix.a.d("'\\");
        f2318f = okhttp3.internal.publicsuffix.a.d("\"\\");
        f2319g = okhttp3.internal.publicsuffix.a.d("{}[]:, \n\t\r\f/\\;#=");
        f2320h = okhttp3.internal.publicsuffix.a.d("\n\r");
        f2321i = okhttp3.internal.publicsuffix.a.d("*/");
    }

    e(j jVar) {
        this.f2322j = jVar;
        this.f2323k = jVar.z();
        n(6);
    }

    private final void A(k kVar) throws b, EOFException {
        while (true) {
            long jM = this.f2322j.m(kVar);
            if (jM == -1) {
                throw d("Unterminated string");
            }
            long j2 = 1 + jM;
            h hVar = this.f2323k;
            if (hVar.b(jM) != 92) {
                hVar.Q(j2);
                return;
            } else {
                hVar.Q(j2);
                t();
            }
        }
    }

    private final void B() {
        long jM = this.f2322j.m(f2320h);
        this.f2323k.Q(jM != -1 ? jM + 1 : this.f2323k.q());
    }

    private final void C() {
        long jM = this.f2322j.m(f2319g);
        if (jM == -1) {
            jM = this.f2323k.q();
        }
        this.f2323k.Q(jM);
    }

    private final boolean D(int i2) throws b {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        z();
        return false;
    }

    private final char t() throws b, EOFException {
        int i2;
        j jVar = this.f2322j;
        if (!jVar.S(1L)) {
            throw d("Unterminated escape sequence");
        }
        h hVar = this.f2323k;
        byte bC = hVar.c();
        if (bC == 10 || bC == 34 || bC == 39 || bC == 47 || bC == 92) {
            return (char) bC;
        }
        if (bC == 98) {
            return '\b';
        }
        if (bC == 102) {
            return '\f';
        }
        if (bC == 110) {
            return '\n';
        }
        if (bC == 114) {
            return '\r';
        }
        if (bC == 116) {
            return '\t';
        }
        if (bC != 117) {
            throw d("Invalid escape sequence: \\" + ((char) bC));
        }
        if (!jVar.S(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(f()));
        }
        char c2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte b2 = hVar.b(i3);
            char c3 = (char) (c2 << 4);
            if (b2 >= 48 && b2 <= 57) {
                i2 = b2 - 48;
            } else if (b2 >= 97 && b2 <= 102) {
                i2 = b2 - 87;
            } else {
                if (b2 < 65 || b2 > 70) {
                    throw d("\\u".concat(hVar.w(4L)));
                }
                i2 = b2 - 55;
            }
            c2 = (char) (c3 + i2);
        }
        hVar.Q(4L);
        return c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01ad, code lost:
    
        if (D(r10) == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b1, code lost:
    
        if (r1 != 2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01b3, code lost:
    
        if (r9 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b9, code lost:
    
        if (r5 != Long.MIN_VALUE) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01bb, code lost:
    
        if (r7 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01be, code lost:
    
        r3 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c1, code lost:
    
        if (r5 != r16) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c3, code lost:
    
        if (r3 != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01c5, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c6, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01c7, code lost:
    
        if (r3 == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ca, code lost:
    
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01cb, code lost:
    
        r21.m = r5;
        r4.Q(r1);
        r21.f2324l = 16;
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01d7, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d8, code lost:
    
        if (r1 == 2) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01db, code lost:
    
        if (r1 == 4) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01de, code lost:
    
        if (r1 != 7) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01e0, code lost:
    
        r21.n = r2;
        r3 = 17;
        r21.f2324l = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x020d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x022b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int u() throws com.airbnb.lottie.f.a.b, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.f.a.e.u():int");
    }

    private final int v(String str, c cVar) {
        String[] strArr = cVar.f2310a;
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(strArr[i2])) {
                this.f2324l = 0;
                this.f2315c[this.f2313a - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r4.Q(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r5 != 47) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        if (r2.S(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        z();
        r3 = r4.b(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r3 == 42) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r4.c();
        r4.c();
        B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        r4.c();
        r4.c();
        r2 = r2.j(com.airbnb.lottie.f.a.e.f2321i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r2 == (-1)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        if (r5 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        r2 = r2 + r1.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        r2 = r4.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0072, code lost:
    
        r4.Q(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (r5 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        throw d("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
    
        if (r5 != 35) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
    
        z();
        B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int w(boolean r9) throws com.airbnb.lottie.f.a.b, java.io.EOFException {
        /*
            r8 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            k.j r2 = r8.f2322j
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r4 = r2.S(r4)
            if (r4 == 0) goto L8f
            k.h r4 = r8.f2323k
            long r5 = (long) r1
            byte r5 = r4.b(r5)
            r6 = 10
            if (r5 == r6) goto L8c
            r6 = 32
            if (r5 == r6) goto L8c
            r6 = 13
            if (r5 == r6) goto L8c
            r6 = 9
            if (r5 != r6) goto L25
            goto L8c
        L25:
            long r6 = (long) r1
            r4.Q(r6)
            r1 = 47
            if (r5 != r1) goto L7f
            r5 = 2
            boolean r3 = r2.S(r5)
            if (r3 != 0) goto L36
            return r1
        L36:
            r8.z()
            r5 = 1
            byte r3 = r4.b(r5)
            r5 = 42
            if (r3 == r5) goto L50
            if (r3 == r1) goto L46
            return r1
        L46:
            r4.c()
            r4.c()
            r8.B()
            goto L1
        L50:
            r4.c()
            r4.c()
            k.k r1 = com.airbnb.lottie.f.a.e.f2321i
            long r2 = r2.j(r1)
            r5 = -1
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 == 0) goto L64
            r5 = 1
            goto L65
        L64:
            r5 = r0
        L65:
            if (r5 == 0) goto L6e
            int r1 = r1.d()
            long r6 = (long) r1
            long r2 = r2 + r6
            goto L72
        L6e:
            long r2 = r4.q()
        L72:
            r4.Q(r2)
            if (r5 == 0) goto L78
            goto L1
        L78:
            java.lang.String r9 = "Unterminated comment"
            com.airbnb.lottie.f.a.b r8 = r8.d(r9)
            throw r8
        L7f:
            r1 = 35
            if (r5 != r1) goto L8b
            r8.z()
            r8.B()
            goto L1
        L8b:
            return r5
        L8c:
            r1 = r3
            goto L2
        L8f:
            if (r9 != 0) goto L93
            r8 = -1
            return r8
        L93:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.String r9 = "End of input"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.f.a.e.w(boolean):int");
    }

    private final String x(k kVar) throws b {
        StringBuilder sb = null;
        while (true) {
            long jM = this.f2322j.m(kVar);
            if (jM == -1) {
                throw d("Unterminated string");
            }
            h hVar = this.f2323k;
            if (hVar.b(jM) != 92) {
                if (sb == null) {
                    String strW = hVar.w(jM);
                    hVar.c();
                    return strW;
                }
                sb.append(hVar.w(jM));
                hVar.c();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(hVar.w(jM));
            hVar.c();
            sb.append(t());
        }
    }

    private final String y() {
        long jM = this.f2322j.m(f2319g);
        h hVar = this.f2323k;
        return jM != -1 ? hVar.w(jM) : hVar.v();
    }

    private final void z() throws b {
        throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    @Override // com.airbnb.lottie.f.a.d
    public final double a() throws b, NumberFormatException, EOFException {
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 16) {
            this.f2324l = 0;
            int[] iArr = this.f2316d;
            int i2 = this.f2313a - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.m;
        }
        if (iU == 17) {
            this.o = this.f2323k.w(this.n);
        } else if (iU == 9) {
            this.o = x(f2318f);
        } else if (iU == 8) {
            this.o = x(f2317e);
        } else if (iU == 10) {
            this.o = y();
        } else if (iU != 11) {
            throw new a(c.b(this, "Expected a double but was "));
        }
        this.f2324l = 11;
        try {
            double d2 = Double.parseDouble(this.o);
            if (Double.isNaN(d2) || Double.isInfinite(d2)) {
                throw new b("JSON forbids NaN and infinities: " + d2 + " at path " + f());
            }
            this.o = null;
            this.f2324l = 0;
            int[] iArr2 = this.f2316d;
            int i3 = this.f2313a - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return d2;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.o + " at path " + f());
        }
    }

    @Override // com.airbnb.lottie.f.a.d
    public final int b() throws b, NumberFormatException, EOFException {
        String strX;
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 16) {
            long j2 = this.m;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.f2324l = 0;
                int[] iArr = this.f2316d;
                int i3 = this.f2313a - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new a("Expected an int but was " + j2 + " at path " + f());
        }
        if (iU == 17) {
            this.o = this.f2323k.w(this.n);
        } else {
            if (iU == 9) {
                strX = x(f2318f);
            } else if (iU == 8) {
                strX = x(f2317e);
            } else if (iU != 11) {
                throw new a(c.b(this, "Expected an int but was "));
            }
            this.o = strX;
            try {
                int i4 = Integer.parseInt(strX);
                this.f2324l = 0;
                int[] iArr2 = this.f2316d;
                int i5 = this.f2313a - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.f2324l = 11;
        try {
            double d2 = Double.parseDouble(this.o);
            int i6 = (int) d2;
            if (i6 == d2) {
                this.o = null;
                this.f2324l = 0;
                int[] iArr3 = this.f2316d;
                int i7 = this.f2313a - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new a("Expected an int but was " + this.o + " at path " + f());
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.o + " at path " + f());
        }
    }

    @Override // com.airbnb.lottie.f.a.d
    public final int c(c cVar) throws b, EOFException {
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU < 12 || iU > 15) {
            return -1;
        }
        if (iU == 15) {
            return v(this.o, cVar);
        }
        int iG = this.f2322j.g(cVar.f2311b);
        if (iG != -1) {
            this.f2324l = 0;
            this.f2315c[this.f2313a - 1] = cVar.f2310a[iG];
            return iG;
        }
        String str = this.f2315c[this.f2313a - 1];
        String strG = g();
        int iV = v(strG, cVar);
        if (iV != -1) {
            return iV;
        }
        this.f2324l = 15;
        this.o = strG;
        this.f2315c[this.f2313a - 1] = str;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2324l = 0;
        this.f2314b[0] = 8;
        this.f2313a = 1;
        this.f2323k.N();
        this.f2322j.close();
    }

    @Override // com.airbnb.lottie.f.a.d
    public final String g() throws b, EOFException {
        String strX;
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 14) {
            strX = y();
        } else if (iU == 13) {
            strX = x(f2318f);
        } else if (iU == 12) {
            strX = x(f2317e);
        } else {
            if (iU != 15) {
                throw new a(c.b(this, "Expected a name but was "));
            }
            strX = this.o;
        }
        this.f2324l = 0;
        this.f2315c[this.f2313a - 1] = strX;
        return strX;
    }

    @Override // com.airbnb.lottie.f.a.d
    public final String h() throws b, EOFException {
        String strW;
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 10) {
            strW = y();
        } else if (iU == 9) {
            strW = x(f2318f);
        } else if (iU == 8) {
            strW = x(f2317e);
        } else if (iU == 11) {
            strW = this.o;
            this.o = null;
        } else if (iU == 16) {
            strW = Long.toString(this.m);
        } else {
            if (iU != 17) {
                throw new a(c.b(this, "Expected a string but was "));
            }
            strW = this.f2323k.w(this.n);
        }
        this.f2324l = 0;
        int[] iArr = this.f2316d;
        int i2 = this.f2313a - 1;
        iArr[i2] = iArr[i2] + 1;
        return strW;
    }

    @Override // com.airbnb.lottie.f.a.d
    public final void j() throws b, EOFException {
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 3) {
            throw new a(c.b(this, "Expected BEGIN_ARRAY but was "));
        }
        n(1);
        this.f2316d[this.f2313a - 1] = 0;
        this.f2324l = 0;
    }

    @Override // com.airbnb.lottie.f.a.d
    public final void k() throws b, EOFException {
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 1) {
            throw new a(c.b(this, "Expected BEGIN_OBJECT but was "));
        }
        n(3);
        this.f2324l = 0;
    }

    @Override // com.airbnb.lottie.f.a.d
    public final void l() throws b, EOFException {
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 4) {
            throw new a(c.b(this, "Expected END_ARRAY but was "));
        }
        int i2 = this.f2313a;
        this.f2313a = i2 - 1;
        int[] iArr = this.f2316d;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f2324l = 0;
    }

    @Override // com.airbnb.lottie.f.a.d
    public final void m() throws b, EOFException {
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU != 2) {
            throw new a(c.b(this, "Expected END_OBJECT but was "));
        }
        int i2 = this.f2313a;
        int i3 = i2 - 1;
        this.f2313a = i3;
        this.f2315c[i3] = null;
        int[] iArr = this.f2316d;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.f2324l = 0;
    }

    @Override // com.airbnb.lottie.f.a.d
    public final void o() throws b, EOFException {
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 14) {
            C();
        } else if (iU == 13) {
            A(f2318f);
        } else if (iU == 12) {
            A(f2317e);
        } else if (iU != 15) {
            throw new a(c.b(this, "Expected a name but was "));
        }
        this.f2324l = 0;
        this.f2315c[this.f2313a - 1] = "null";
    }

    @Override // com.airbnb.lottie.f.a.d
    public final void p() throws b, EOFException {
        int i2 = 0;
        do {
            int iU = this.f2324l;
            if (iU == 0) {
                iU = u();
            }
            if (iU == 3) {
                n(1);
            } else if (iU == 1) {
                n(3);
            } else {
                if (iU == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new a(c.b(this, "Expected a value but was "));
                    }
                    this.f2313a--;
                } else if (iU == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new a(c.b(this, "Expected a value but was "));
                    }
                    this.f2313a--;
                } else if (iU == 14 || iU == 10) {
                    C();
                } else if (iU == 9 || iU == 13) {
                    A(f2318f);
                } else if (iU == 8 || iU == 12) {
                    A(f2317e);
                } else if (iU == 17) {
                    this.f2323k.Q(this.n);
                } else if (iU == 18) {
                    throw new a(c.b(this, "Expected a value but was "));
                }
                this.f2324l = 0;
            }
            i2++;
            this.f2324l = 0;
        } while (i2 != 0);
        int[] iArr = this.f2316d;
        int i3 = this.f2313a - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f2315c[i3] = "null";
    }

    @Override // com.airbnb.lottie.f.a.d
    public final boolean q() throws b, EOFException {
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        return (iU == 2 || iU == 4 || iU == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.f.a.d
    public final boolean r() throws b, EOFException {
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        if (iU == 5) {
            this.f2324l = 0;
            int[] iArr = this.f2316d;
            int i2 = this.f2313a - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iU != 6) {
            throw new a(c.b(this, "Expected a boolean but was "));
        }
        this.f2324l = 0;
        int[] iArr2 = this.f2316d;
        int i3 = this.f2313a - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    @Override // com.airbnb.lottie.f.a.d
    public final int s() throws b, EOFException {
        int iU = this.f2324l;
        if (iU == 0) {
            iU = u();
        }
        switch (iU) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f2322j.toString() + ")";
    }
}
