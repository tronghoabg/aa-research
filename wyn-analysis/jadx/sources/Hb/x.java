package hb;

import cg.C1618g;
import cg.C1621j;
import cg.InterfaceC1620i;
import io.ktor.utils.io.T;
import java.io.EOFException;
import java.io.IOException;
import java.math.BigDecimal;

/* loaded from: classes4.dex */
public final class x extends w {

    /* renamed from: m, reason: collision with root package name */
    public static final C1621j f36364m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1621j f36365n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1621j f36366o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1621j f36367p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1621j f36368q;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1620i f36369g;

    /* renamed from: h, reason: collision with root package name */
    public final C1618g f36370h;

    /* renamed from: i, reason: collision with root package name */
    public int f36371i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f36372j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public String f36373l;

    static {
        C1621j c1621j = C1621j.f19903d;
        f36364m = ab.b.c("'\\");
        f36365n = ab.b.c("\"\\");
        f36366o = ab.b.c("{}[]:, \n\t\r\f/\\;#=");
        f36367p = ab.b.c("\n\r");
        f36368q = ab.b.c("*/");
    }

    public x(InterfaceC1620i interfaceC1620i) {
        if (interfaceC1620i == null) {
            throw new NullPointerException("source == null");
        }
        this.f36369g = interfaceC1620i;
        this.f36370h = interfaceC1620i.getBuffer();
        V(6);
    }

    @Override // hb.w
    public final long B() throws T, NumberFormatException, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 == 16) {
            this.f36371i = 0;
            int[] iArr = this.f36361d;
            int i5 = this.f36358a - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f36372j;
        }
        if (iD0 == 17) {
            long j8 = this.k;
            C1618g c1618g = this.f36370h;
            c1618g.getClass();
            this.f36373l = c1618g.readString(j8, Bf.a.f1670a);
        } else if (iD0 == 9 || iD0 == 8) {
            String strJ0 = iD0 == 9 ? j0(f36365n) : j0(f36364m);
            this.f36373l = strJ0;
            try {
                long j10 = Long.parseLong(strJ0);
                this.f36371i = 0;
                int[] iArr2 = this.f36361d;
                int i10 = this.f36358a - 1;
                iArr2[i10] = iArr2[i10] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        } else if (iD0 != 11) {
            throw new E5.Q("Expected a long but was " + P() + " at path " + i(), 11);
        }
        this.f36371i = 11;
        try {
            long jLongValueExact = new BigDecimal(this.f36373l).longValueExact();
            this.f36373l = null;
            this.f36371i = 0;
            int[] iArr3 = this.f36361d;
            int i11 = this.f36358a - 1;
            iArr3[i11] = iArr3[i11] + 1;
            return jLongValueExact;
        } catch (ArithmeticException | NumberFormatException unused2) {
            throw new E5.Q("Expected a long but was " + this.f36373l + " at path " + i(), 11);
        }
    }

    @Override // hb.w
    public final void D() throws T, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 == 7) {
            this.f36371i = 0;
            int[] iArr = this.f36361d;
            int i5 = this.f36358a - 1;
            iArr[i5] = iArr[i5] + 1;
            return;
        }
        throw new E5.Q("Expected null but was " + P() + " at path " + i(), 11);
    }

    @Override // hb.w
    public final String J() throws T, EOFException {
        String string;
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 == 10) {
            string = k0();
        } else if (iD0 == 9) {
            string = j0(f36365n);
        } else if (iD0 == 8) {
            string = j0(f36364m);
        } else if (iD0 == 11) {
            string = this.f36373l;
            this.f36373l = null;
        } else if (iD0 == 16) {
            string = Long.toString(this.f36372j);
        } else {
            if (iD0 != 17) {
                throw new E5.Q("Expected a string but was " + P() + " at path " + i(), 11);
            }
            long j8 = this.k;
            C1618g c1618g = this.f36370h;
            c1618g.getClass();
            string = c1618g.readString(j8, Bf.a.f1670a);
        }
        this.f36371i = 0;
        int[] iArr = this.f36361d;
        int i5 = this.f36358a - 1;
        iArr[i5] = iArr[i5] + 1;
        return string;
    }

    @Override // hb.w
    public final v P() throws T, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        switch (iD0) {
            case 1:
                return v.f36350c;
            case 2:
                return v.f36351d;
            case 3:
                return v.f36348a;
            case 4:
                return v.f36349b;
            case 5:
            case 6:
                return v.f36355h;
            case 7:
                return v.f36356i;
            case 8:
            case 9:
            case 10:
            case 11:
                return v.f36353f;
            case 12:
            case 13:
            case 14:
            case 15:
                return v.f36352e;
            case 16:
            case 17:
                return v.f36354g;
            case 18:
                return v.f36357j;
            default:
                throw new AssertionError();
        }
    }

    @Override // hb.w
    public final void Q() {
        if (o()) {
            this.f36373l = h0();
            this.f36371i = 11;
        }
    }

    @Override // hb.w
    public final int W(u uVar) throws T, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 < 12 || iD0 > 15) {
            return -1;
        }
        if (iD0 == 15) {
            return e0(this.f36373l, uVar);
        }
        int iR = this.f36369g.r(uVar.f36347b);
        if (iR != -1) {
            this.f36371i = 0;
            this.f36360c[this.f36358a - 1] = uVar.f36346a[iR];
            return iR;
        }
        String str = this.f36360c[this.f36358a - 1];
        String strH0 = h0();
        int iE0 = e0(strH0, uVar);
        if (iE0 == -1) {
            this.f36371i = 15;
            this.f36373l = strH0;
            this.f36360c[this.f36358a - 1] = str;
        }
        return iE0;
    }

    @Override // hb.w
    public final int X(u uVar) throws T, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 < 8 || iD0 > 11) {
            return -1;
        }
        if (iD0 == 11) {
            return f0(this.f36373l, uVar);
        }
        int iR = this.f36369g.r(uVar.f36347b);
        if (iR != -1) {
            this.f36371i = 0;
            int[] iArr = this.f36361d;
            int i5 = this.f36358a - 1;
            iArr[i5] = iArr[i5] + 1;
            return iR;
        }
        String strJ = J();
        int iF0 = f0(strJ, uVar);
        if (iF0 == -1) {
            this.f36371i = 11;
            this.f36373l = strJ;
            this.f36361d[this.f36358a - 1] = r0[r1] - 1;
        }
        return iF0;
    }

    @Override // hb.w
    public final void Y() throws T, EOFException {
        if (this.f36363f) {
            v vVarP = P();
            h0();
            throw new E5.Q("Cannot skip unexpected " + vVarP + " at " + i(), 11);
        }
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 == 14) {
            long jM = this.f36369g.m(f36366o);
            C1618g c1618g = this.f36370h;
            if (jM == -1) {
                jM = c1618g.f19902b;
            }
            c1618g.skip(jM);
        } else if (iD0 == 13) {
            m0(f36365n);
        } else if (iD0 == 12) {
            m0(f36364m);
        } else if (iD0 != 15) {
            throw new E5.Q("Expected a name but was " + P() + " at path " + i(), 11);
        }
        this.f36371i = 0;
        this.f36360c[this.f36358a - 1] = "null";
    }

    @Override // hb.w
    public final void Z() throws T, EOFException {
        if (this.f36363f) {
            throw new E5.Q("Cannot skip unexpected " + P() + " at " + i(), 11);
        }
        int i5 = 0;
        do {
            int iD0 = this.f36371i;
            if (iD0 == 0) {
                iD0 = d0();
            }
            if (iD0 == 3) {
                V(1);
            } else if (iD0 == 1) {
                V(3);
            } else {
                if (iD0 == 4) {
                    i5--;
                    if (i5 < 0) {
                        throw new E5.Q("Expected a value but was " + P() + " at path " + i(), 11);
                    }
                    this.f36358a--;
                } else if (iD0 == 2) {
                    i5--;
                    if (i5 < 0) {
                        throw new E5.Q("Expected a value but was " + P() + " at path " + i(), 11);
                    }
                    this.f36358a--;
                } else {
                    C1618g c1618g = this.f36370h;
                    if (iD0 == 14 || iD0 == 10) {
                        long jM = this.f36369g.m(f36366o);
                        if (jM == -1) {
                            jM = c1618g.f19902b;
                        }
                        c1618g.skip(jM);
                    } else if (iD0 == 9 || iD0 == 13) {
                        m0(f36365n);
                    } else if (iD0 == 8 || iD0 == 12) {
                        m0(f36364m);
                    } else if (iD0 == 17) {
                        c1618g.skip(this.k);
                    } else if (iD0 == 18) {
                        throw new E5.Q("Expected a value but was " + P() + " at path " + i(), 11);
                    }
                }
                this.f36371i = 0;
            }
            i5++;
            this.f36371i = 0;
        } while (i5 != 0);
        int[] iArr = this.f36361d;
        int i10 = this.f36358a - 1;
        iArr[i10] = iArr[i10] + 1;
        this.f36360c[i10] = "null";
    }

    @Override // hb.w
    public final void a() throws T, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 == 3) {
            V(1);
            this.f36361d[this.f36358a - 1] = 0;
            this.f36371i = 0;
        } else {
            throw new E5.Q("Expected BEGIN_ARRAY but was " + P() + " at path " + i(), 11);
        }
    }

    @Override // hb.w
    public final void b() throws T, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 == 1) {
            V(3);
            this.f36371i = 0;
        } else {
            throw new E5.Q("Expected BEGIN_OBJECT but was " + P() + " at path " + i(), 11);
        }
    }

    public final void c0() throws T {
        if (this.f36362e) {
            return;
        }
        a0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36371i = 0;
        this.f36359b[0] = 8;
        this.f36358a = 1;
        this.f36370h.a();
        this.f36369g.close();
    }

    @Override // hb.w
    public final void d() throws T, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 != 4) {
            throw new E5.Q("Expected END_ARRAY but was " + P() + " at path " + i(), 11);
        }
        int i5 = this.f36358a;
        this.f36358a = i5 - 1;
        int[] iArr = this.f36361d;
        int i10 = i5 - 2;
        iArr[i10] = iArr[i10] + 1;
        this.f36371i = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01b5, code lost:
    
        if (g0(r7) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b8, code lost:
    
        if (r2 != 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ba, code lost:
    
        if (r5 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01c0, code lost:
    
        if (r18 != Long.MIN_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01c2, code lost:
    
        if (r6 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01c5, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01c9, code lost:
    
        if (r18 != r16) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01cb, code lost:
    
        if (r6 != 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01cd, code lost:
    
        if (r6 == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01cf, code lost:
    
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01d2, code lost:
    
        r8 = -r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01d5, code lost:
    
        r23.f36372j = r8;
        r11.skip(r4);
        r10 = 16;
        r23.f36371i = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e0, code lost:
    
        if (r2 == r3) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e3, code lost:
    
        if (r2 == 4) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01e6, code lost:
    
        if (r2 != 7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01e8, code lost:
    
        r23.k = r4;
        r10 = 17;
        r23.f36371i = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0146, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d0() throws io.ktor.utils.io.T, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.x.d0():int");
    }

    public final int e0(String str, u uVar) {
        int length = uVar.f36346a.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(uVar.f36346a[i5])) {
                this.f36371i = 0;
                this.f36360c[this.f36358a - 1] = str;
                return i5;
            }
        }
        return -1;
    }

    public final int f0(String str, u uVar) {
        int length = uVar.f36346a.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(uVar.f36346a[i5])) {
                this.f36371i = 0;
                int[] iArr = this.f36361d;
                int i10 = this.f36358a - 1;
                iArr[i10] = iArr[i10] + 1;
                return i5;
            }
        }
        return -1;
    }

    public final boolean g0(int i5) throws T {
        if (i5 == 9 || i5 == 10 || i5 == 12 || i5 == 13 || i5 == 32) {
            return false;
        }
        if (i5 != 35) {
            if (i5 == 44) {
                return false;
            }
            if (i5 != 47 && i5 != 61) {
                if (i5 == 123 || i5 == 125 || i5 == 58) {
                    return false;
                }
                if (i5 != 59) {
                    switch (i5) {
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
        c0();
        return false;
    }

    @Override // hb.w
    public final void h() throws T, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 != 2) {
            throw new E5.Q("Expected END_OBJECT but was " + P() + " at path " + i(), 11);
        }
        int i5 = this.f36358a;
        int i10 = i5 - 1;
        this.f36358a = i10;
        this.f36360c[i10] = null;
        int[] iArr = this.f36361d;
        int i11 = i5 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f36371i = 0;
    }

    public final String h0() throws T, EOFException {
        String strJ0;
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 == 14) {
            strJ0 = k0();
        } else if (iD0 == 13) {
            strJ0 = j0(f36365n);
        } else if (iD0 == 12) {
            strJ0 = j0(f36364m);
        } else {
            if (iD0 != 15) {
                throw new E5.Q("Expected a name but was " + P() + " at path " + i(), 11);
            }
            strJ0 = this.f36373l;
            this.f36373l = null;
        }
        this.f36371i = 0;
        this.f36360c[this.f36358a - 1] = strJ0;
        return strJ0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0026, code lost:
    
        r1.skip(r3);
        r2 = hb.x.f36367p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r6 != 47) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r5.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        c0();
        r10 = r1.o(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r10 == 42) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r10 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r5 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r5 = r1.f19902b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        r1.readByte();
        r1.readByte();
        r5 = r5.s(hb.x.f36368q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r5 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        r5 = r5 + r2.f19904a.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        r5 = r1.f19902b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        r1.skip(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        if (r3 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0085, code lost:
    
        a0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        if (r6 != 35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        c0();
        r5 = r5.m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
    
        if (r5 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009d, code lost:
    
        r5 = r1.f19902b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009f, code lost:
    
        r1.skip(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i0(boolean r13) throws io.ktor.utils.io.T, java.io.EOFException {
        /*
            r12 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            cg.i r5 = r12.f36369g
            boolean r3 = r5.request(r3)
            if (r3 == 0) goto La8
            long r3 = (long) r1
            cg.g r1 = r12.f36370h
            byte r6 = r1.o(r3)
            r7 = 10
            if (r6 == r7) goto La5
            r7 = 32
            if (r6 == r7) goto La5
            r7 = 13
            if (r6 == r7) goto La5
            r7 = 9
            if (r6 != r7) goto L26
            goto La5
        L26:
            r1.skip(r3)
            cg.j r2 = hb.x.f36367p
            r3 = -1
            r7 = 1
            r9 = 47
            if (r6 != r9) goto L8c
            r10 = 2
            boolean r10 = r5.request(r10)
            if (r10 != 0) goto L3d
            goto La4
        L3d:
            r12.c0()
            byte r10 = r1.o(r7)
            r11 = 42
            if (r10 == r11) goto L61
            if (r10 == r9) goto L4b
            goto La4
        L4b:
            r1.readByte()
            r1.readByte()
            long r5 = r5.m(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L5b
            long r5 = r5 + r7
            goto L5d
        L5b:
            long r5 = r1.f19902b
        L5d:
            r1.skip(r5)
            goto L1
        L61:
            r1.readByte()
            r1.readByte()
            cg.j r2 = hb.x.f36368q
            long r5 = r5.s(r2)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = r0
        L74:
            if (r3 == 0) goto L7c
            byte[] r2 = r2.f19904a
            int r2 = r2.length
            long r7 = (long) r2
            long r5 = r5 + r7
            goto L7e
        L7c:
            long r5 = r1.f19902b
        L7e:
            r1.skip(r5)
            if (r3 == 0) goto L85
            goto L1
        L85:
            java.lang.String r13 = "Unterminated comment"
            r12.a0(r13)
            r13 = 0
            throw r13
        L8c:
            r9 = 35
            if (r6 != r9) goto La4
            r12.c0()
            long r5 = r5.m(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L9d
            long r5 = r5 + r7
            goto L9f
        L9d:
            long r5 = r1.f19902b
        L9f:
            r1.skip(r5)
            goto L1
        La4:
            return r6
        La5:
            r1 = r2
            goto L2
        La8:
            if (r13 != 0) goto Lac
            r13 = -1
            return r13
        Lac:
            java.io.EOFException r13 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.x.i0(boolean):int");
    }

    public final String j0(C1621j c1621j) throws T, EOFException {
        StringBuilder sb2 = null;
        while (true) {
            long jM = this.f36369g.m(c1621j);
            if (jM == -1) {
                a0("Unterminated string");
                throw null;
            }
            C1618g c1618g = this.f36370h;
            if (c1618g.o(jM) != 92) {
                if (sb2 == null) {
                    String string = c1618g.readString(jM, Bf.a.f1670a);
                    c1618g.readByte();
                    return string;
                }
                sb2.append(c1618g.readString(jM, Bf.a.f1670a));
                c1618g.readByte();
                return sb2.toString();
            }
            if (sb2 == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(c1618g.readString(jM, Bf.a.f1670a));
            c1618g.readByte();
            sb2.append(l0());
        }
    }

    public final String k0() {
        long jM = this.f36369g.m(f36366o);
        C1618g c1618g = this.f36370h;
        if (jM == -1) {
            return c1618g.readUtf8();
        }
        c1618g.getClass();
        return c1618g.readString(jM, Bf.a.f1670a);
    }

    public final char l0() throws T, EOFException {
        int i5;
        InterfaceC1620i interfaceC1620i = this.f36369g;
        if (!interfaceC1620i.request(1L)) {
            a0("Unterminated escape sequence");
            throw null;
        }
        C1618g c1618g = this.f36370h;
        byte b5 = c1618g.readByte();
        if (b5 == 10 || b5 == 34 || b5 == 39 || b5 == 47 || b5 == 92) {
            return (char) b5;
        }
        if (b5 == 98) {
            return '\b';
        }
        if (b5 == 102) {
            return '\f';
        }
        if (b5 == 110) {
            return '\n';
        }
        if (b5 == 114) {
            return '\r';
        }
        if (b5 == 116) {
            return '\t';
        }
        if (b5 != 117) {
            if (this.f36362e) {
                return (char) b5;
            }
            a0("Invalid escape sequence: \\" + ((char) b5));
            throw null;
        }
        if (!interfaceC1620i.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + i());
        }
        char c10 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            byte bO = c1618g.o(i10);
            char c11 = (char) (c10 << 4);
            if (bO >= 48 && bO <= 57) {
                i5 = bO - 48;
            } else if (bO >= 97 && bO <= 102) {
                i5 = bO - 87;
            } else {
                if (bO < 65 || bO > 70) {
                    a0("\\u".concat(c1618g.readString(4L, Bf.a.f1670a)));
                    throw null;
                }
                i5 = bO - 55;
            }
            c10 = (char) (i5 + c11);
        }
        c1618g.skip(4L);
        return c10;
    }

    public final void m0(C1621j c1621j) throws T, EOFException {
        while (true) {
            long jM = this.f36369g.m(c1621j);
            if (jM == -1) {
                a0("Unterminated string");
                throw null;
            }
            C1618g c1618g = this.f36370h;
            if (c1618g.o(jM) != 92) {
                c1618g.skip(jM + 1);
                return;
            } else {
                c1618g.skip(jM + 1);
                l0();
            }
        }
    }

    @Override // hb.w
    public final boolean o() throws T, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        return (iD0 == 2 || iD0 == 4 || iD0 == 18) ? false : true;
    }

    public final String toString() {
        return "JsonReader(" + this.f36369g + ")";
    }

    @Override // hb.w
    public final boolean w() throws T, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 == 5) {
            this.f36371i = 0;
            int[] iArr = this.f36361d;
            int i5 = this.f36358a - 1;
            iArr[i5] = iArr[i5] + 1;
            return true;
        }
        if (iD0 == 6) {
            this.f36371i = 0;
            int[] iArr2 = this.f36361d;
            int i10 = this.f36358a - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return false;
        }
        throw new E5.Q("Expected a boolean but was " + P() + " at path " + i(), 11);
    }

    @Override // hb.w
    public final double y() throws T, NumberFormatException, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 == 16) {
            this.f36371i = 0;
            int[] iArr = this.f36361d;
            int i5 = this.f36358a - 1;
            iArr[i5] = iArr[i5] + 1;
            return this.f36372j;
        }
        if (iD0 == 17) {
            long j8 = this.k;
            C1618g c1618g = this.f36370h;
            c1618g.getClass();
            this.f36373l = c1618g.readString(j8, Bf.a.f1670a);
        } else if (iD0 == 9) {
            this.f36373l = j0(f36365n);
        } else if (iD0 == 8) {
            this.f36373l = j0(f36364m);
        } else if (iD0 == 10) {
            this.f36373l = k0();
        } else if (iD0 != 11) {
            throw new E5.Q("Expected a double but was " + P() + " at path " + i(), 11);
        }
        this.f36371i = 11;
        try {
            double d3 = Double.parseDouble(this.f36373l);
            if (!this.f36362e && (Double.isNaN(d3) || Double.isInfinite(d3))) {
                throw new T("JSON forbids NaN and infinities: " + d3 + " at path " + i());
            }
            this.f36373l = null;
            this.f36371i = 0;
            int[] iArr2 = this.f36361d;
            int i10 = this.f36358a - 1;
            iArr2[i10] = iArr2[i10] + 1;
            return d3;
        } catch (NumberFormatException unused) {
            throw new E5.Q("Expected a double but was " + this.f36373l + " at path " + i(), 11);
        }
    }

    @Override // hb.w
    public final int z() throws T, NumberFormatException, EOFException {
        int iD0 = this.f36371i;
        if (iD0 == 0) {
            iD0 = d0();
        }
        if (iD0 == 16) {
            long j8 = this.f36372j;
            int i5 = (int) j8;
            if (j8 == i5) {
                this.f36371i = 0;
                int[] iArr = this.f36361d;
                int i10 = this.f36358a - 1;
                iArr[i10] = iArr[i10] + 1;
                return i5;
            }
            throw new E5.Q("Expected an int but was " + this.f36372j + " at path " + i(), 11);
        }
        if (iD0 == 17) {
            long j10 = this.k;
            C1618g c1618g = this.f36370h;
            c1618g.getClass();
            this.f36373l = c1618g.readString(j10, Bf.a.f1670a);
        } else if (iD0 == 9 || iD0 == 8) {
            String strJ0 = iD0 == 9 ? j0(f36365n) : j0(f36364m);
            this.f36373l = strJ0;
            try {
                int i11 = Integer.parseInt(strJ0);
                this.f36371i = 0;
                int[] iArr2 = this.f36361d;
                int i12 = this.f36358a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return i11;
            } catch (NumberFormatException unused) {
            }
        } else if (iD0 != 11) {
            throw new E5.Q("Expected an int but was " + P() + " at path " + i(), 11);
        }
        this.f36371i = 11;
        try {
            double d3 = Double.parseDouble(this.f36373l);
            int i13 = (int) d3;
            if (i13 != d3) {
                throw new E5.Q("Expected an int but was " + this.f36373l + " at path " + i(), 11);
            }
            this.f36373l = null;
            this.f36371i = 0;
            int[] iArr3 = this.f36361d;
            int i14 = this.f36358a - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return i13;
        } catch (NumberFormatException unused2) {
            throw new E5.Q("Expected an int but was " + this.f36373l + " at path " + i(), 11);
        }
    }
}
