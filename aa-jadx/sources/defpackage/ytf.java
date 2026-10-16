package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ytf {
    public int a = 0;
    public int b = -1;
    protected final java.lang.Object[] c;
    public final java.lang.StringBuilder d;
    public int e;
    private final defpackage.yrv f;

    protected ytf(defpackage.yrv yrvVar, java.lang.Object[] objArr, java.lang.StringBuilder sb) {
        yrvVar.getClass();
        this.f = yrvVar;
        this.e = 0;
        objArr.getClass();
        this.c = objArr;
        this.d = sb;
    }

    public static void c(java.lang.StringBuilder sb, java.lang.Object obj, java.lang.String str) {
        java.lang.String strA;
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        try {
            strA = defpackage.yqw.c(obj);
        } catch (java.lang.RuntimeException e) {
            strA = defpackage.yqw.a(obj, e);
        }
        sb.append(strA);
        sb.append("]");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016d  */
    /* JADX WARN: Code duplicated, block: B:106:0x018e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0196  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:130:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:136:0x020b  */
    /* JADX WARN: Code duplicated, block: B:138:0x020f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0213  */
    /* JADX WARN: Code duplicated, block: B:140:0x0219  */
    /* JADX WARN: Code duplicated, block: B:148:0x023b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0244  */
    /* JADX WARN: Code duplicated, block: B:152:0x024c A[LOOP:4: B:81:0x0126->B:152:0x024c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x0264 A[LOOP:2: B:45:0x00a8->B:159:0x0264, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x026c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0120 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:80:0x0124  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Code duplicated, block: B:89:0x014c  */
    /* JADX WARN: Code duplicated, block: B:96:0x015b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    public static void e(defpackage.yqt yqtVar, java.lang.StringBuilder sb) {
        java.lang.String strA;
        int i;
        char cCharAt;
        int i2;
        int i3;
        char cCharAt2;
        int i4;
        boolean z;
        int i5;
        defpackage.yqq yqqVar;
        int i6;
        int i7;
        char cCharAt3;
        char c;
        int i8;
        int i9;
        char cCharAt4;
        char c2;
        int i10;
        defpackage.yqp yqpVar;
        int i11;
        int i12;
        defpackage.ysz yszVar;
        defpackage.ytb ytaVar;
        defpackage.ytb ytdVar;
        int i13;
        java.lang.StringBuilder sb2;
        java.lang.Object[] objArr;
        java.lang.Object obj;
        if (yqtVar.d() == null) {
            java.lang.Object objE = yqtVar.e();
            try {
                strA = defpackage.yqw.c(objE);
            } catch (java.lang.RuntimeException e) {
                strA = defpackage.yqw.a(objE, e);
            }
            sb.append(strA);
            return;
        }
        defpackage.ytf ytfVar = new defpackage.ytf(yqtVar.d(), yqtVar.i(), sb);
        java.lang.String strB = ytfVar.b();
        int i14 = 0;
        int iB = defpackage.yti.b(strB, 0);
        int i15 = -1;
        int i16 = 0;
        int i17 = -1;
        while (true) {
            int i18 = 1;
            if (iB < 0) {
                int i19 = ytfVar.a;
                if (((i19 + 1) & i19) != 0 || (ytfVar.b > 31 && i19 != -1)) {
                    throw new defpackage.yth(java.lang.String.format("unreferenced arguments [first missing index=%d]", java.lang.Integer.valueOf(java.lang.Integer.numberOfTrailingZeros(~i19))));
                }
                defpackage.ytg ytgVarA = ytfVar.a();
                java.lang.String strB2 = ytfVar.b();
                int i20 = ytfVar.e;
                int length = ytfVar.b().length();
                java.lang.StringBuilder sb3 = ytfVar.d;
                ytgVarA.a(sb3, strB2, i20, length);
                if (yqtVar.i().length > ytfVar.b + 1) {
                    sb3.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                    return;
                }
                return;
            }
            int i21 = iB + 1;
            int i22 = i14;
            int i23 = i21;
            while (true) {
                if (i23 >= strB.length()) {
                    throw defpackage.yth.c("unterminated parameter", strB, iB);
                }
                i = i23 + 1;
                cCharAt = strB.charAt(i23);
                char c3 = (char) (cCharAt - '0');
                if (c3 < '\n') {
                    i22 = (i22 * 10) + c3;
                    if (i22 >= 1000000) {
                        throw defpackage.yth.b("index too large", strB, iB, i);
                    }
                    i23 = i;
                }
            }
            if (cCharAt != '$') {
                if (cCharAt != '<') {
                    i17 = i16;
                    i16++;
                } else {
                    if (i17 == i15) {
                        throw defpackage.yth.b("invalid relative parameter", strB, iB, i);
                    }
                    if (i == strB.length()) {
                        throw defpackage.yth.c("unterminated parameter", strB, iB);
                    }
                    i2 = i23 + 2;
                    strB.charAt(i);
                }
                i3 = i + i15;
                while (true) {
                    if (i3 < strB.length()) {
                        throw defpackage.yth.c("unterminated parameter", strB, iB);
                    }
                    if (((char) ((strB.charAt(i3) & (-33)) - 65)) < 26) {
                        break;
                    }
                    i3++;
                    i15 = -1;
                }
                cCharAt2 = strB.charAt(i3);
                i4 = cCharAt2 & ' ';
                if (i4 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                defpackage.yqq yqqVar2 = defpackage.yqq.a;
                if (i21 == i3 || z) {
                    if (true != z) {
                        i5 = 0;
                    } else {
                        i5 = 128;
                    }
                    while (true) {
                        if (i21 == i3) {
                            yqqVar = new defpackage.yqq(i5, i15, i15);
                        } else {
                            i6 = i18;
                            i7 = i21 + 1;
                            cCharAt3 = strB.charAt(i21);
                            c = '.';
                            if (cCharAt3 < ' ' && cCharAt3 <= '0') {
                                int iA = defpackage.yqq.a(cCharAt3);
                                if (iA < 0) {
                                    if (cCharAt3 != '.') {
                                        throw defpackage.yth.a("invalid flag", strB, i21);
                                    }
                                    yqqVar = new defpackage.yqq(i5, -1, defpackage.yqq.b(strB, i7, i3));
                                    break;
                                } else {
                                    i10 = i6 << iA;
                                    if ((i5 & i10) != 0) {
                                        throw defpackage.yth.a("repeated flag", strB, i21);
                                    }
                                    i5 |= i10;
                                    i21 = i7;
                                    i18 = i6;
                                    i15 = -1;
                                }
                            } else {
                                if (cCharAt3 > '9') {
                                    throw defpackage.yth.a("invalid flag", strB, i21);
                                }
                                i8 = cCharAt3 - '0';
                                while (true) {
                                    if (i7 == i3) {
                                        yqqVar = new defpackage.yqq(i5, i8, -1);
                                        break;
                                    }
                                    i9 = i7 + 1;
                                    cCharAt4 = strB.charAt(i7);
                                    if (cCharAt4 == c) {
                                        yqqVar = new defpackage.yqq(i5, i8, defpackage.yqq.b(strB, i9, i3));
                                        break;
                                    }
                                    c2 = (char) (cCharAt4 - '0');
                                    if (c2 >= '\n') {
                                        throw defpackage.yth.a("invalid width character", strB, i7);
                                    }
                                    i8 = (i8 * 10) + c2;
                                    if (i8 > 999999) {
                                        throw defpackage.yth.b("width too large", strB, i21, i3);
                                    }
                                    i7 = i9;
                                    c = '.';
                                }
                            }
                        }
                    }
                    yqpVar = defpackage.yqp.k[(cCharAt2 | ' ') - 97];
                    if (i4 == 0 && (yqpVar == null || (yqpVar.n & 128) == 0)) {
                        yqpVar = null;
                    }
                    i11 = i3 + 1;
                    if (yqpVar != null) {
                        if (!yqqVar.e(yqpVar.n, yqpVar.m.f)) {
                            throw defpackage.yth.b("invalid format specifier", strB, iB, i11);
                        }
                        java.util.Map map = defpackage.ytc.c;
                        if (i17 < 10 || !yqqVar.c()) {
                            ytdVar = new defpackage.ytc(i17, yqpVar, yqqVar);
                            ytaVar = ytdVar;
                        } else {
                            defpackage.ytb[] ytbVarArr = (defpackage.ytc[]) defpackage.ytc.c.get(yqpVar);
                            ytbVarArr.getClass();
                            ytaVar = ytbVarArr[i17];
                        }
                    } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                        if (!yqqVar.e(160, false)) {
                            throw defpackage.yth.b("invalid format specification", strB, iB, i11);
                        }
                        i12 = i3 + 2;
                        if (i12 > strB.length()) {
                            throw defpackage.yth.a("truncated format specifier", strB, iB);
                        }
                        yszVar = (defpackage.ysz) defpackage.ysz.F.get(java.lang.Character.valueOf(strB.charAt(i11)));
                        if (yszVar == null) {
                            throw defpackage.yth.a("illegal date/time conversion", strB, i11);
                        }
                        ytaVar = new defpackage.yta(yqqVar, i17, yszVar);
                        i11 = i12;
                    } else {
                        if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                            throw defpackage.yth.b("invalid format specification", strB, iB, i11);
                        }
                        if (!yqqVar.e(160, false)) {
                            throw defpackage.yth.b("invalid format specification", strB, iB, i11);
                        }
                        ytdVar = new defpackage.ytd(yqqVar, i17);
                        ytaVar = ytdVar;
                    }
                    i13 = ytaVar.a;
                    if (i13 < 32) {
                        ytfVar.a |= i6 << i13;
                    }
                    ytfVar.b = java.lang.Math.max(ytfVar.b, i13);
                    defpackage.ytg ytgVarA2 = ytfVar.a();
                    java.lang.String strB3 = ytfVar.b();
                    int i24 = ytfVar.e;
                    sb2 = ytfVar.d;
                    ytgVarA2.a(sb2, strB3, i24, iB);
                    objArr = ytfVar.c;
                    if (i13 < objArr.length) {
                        obj = objArr[i13];
                        if (obj != null) {
                            ytaVar.a(ytfVar, obj);
                        } else {
                            sb2.append("null");
                        }
                    } else {
                        sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                    }
                    ytfVar.e = i11;
                    iB = defpackage.yti.b(strB, i11);
                    i14 = 0;
                    i15 = -1;
                } else {
                    yqqVar = defpackage.yqq.a;
                }
                i6 = i18;
                yqpVar = defpackage.yqp.k[(cCharAt2 | ' ') - 97];
                if (i4 == 0) {
                    yqpVar = null;
                }
                i11 = i3 + 1;
                if (yqpVar != null) {
                    if (cCharAt2 != 't') {
                    }
                    if (!yqqVar.e(160, false)) {
                        throw defpackage.yth.b("invalid format specification", strB, iB, i11);
                    }
                    i12 = i3 + 2;
                    if (i12 > strB.length()) {
                        throw defpackage.yth.a("truncated format specifier", strB, iB);
                    }
                    yszVar = (defpackage.ysz) defpackage.ysz.F.get(java.lang.Character.valueOf(strB.charAt(i11)));
                    if (yszVar == null) {
                        throw defpackage.yth.a("illegal date/time conversion", strB, i11);
                    }
                    ytaVar = new defpackage.yta(yqqVar, i17, yszVar);
                    i11 = i12;
                } else {
                    if (!yqqVar.e(yqpVar.n, yqpVar.m.f)) {
                        throw defpackage.yth.b("invalid format specifier", strB, iB, i11);
                    }
                    java.util.Map map2 = defpackage.ytc.c;
                    if (i17 < 10) {
                    }
                    ytdVar = new defpackage.ytc(i17, yqpVar, yqqVar);
                    ytaVar = ytdVar;
                }
                i13 = ytaVar.a;
                if (i13 < 32) {
                    ytfVar.a |= i6 << i13;
                }
                ytfVar.b = java.lang.Math.max(ytfVar.b, i13);
                defpackage.ytg ytgVarA3 = ytfVar.a();
                java.lang.String strB4 = ytfVar.b();
                int i25 = ytfVar.e;
                sb2 = ytfVar.d;
                ytgVarA3.a(sb2, strB4, i25, iB);
                objArr = ytfVar.c;
                if (i13 < objArr.length) {
                    obj = objArr[i13];
                    if (obj != null) {
                        ytaVar.a(ytfVar, obj);
                    } else {
                        sb2.append("null");
                    }
                } else {
                    sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                }
                ytfVar.e = i11;
                iB = defpackage.yti.b(strB, i11);
                i14 = 0;
                i15 = -1;
            } else {
                if (i23 - i21 == 0) {
                    throw defpackage.yth.b("missing index", strB, iB, i);
                }
                if (strB.charAt(i21) == '0') {
                    throw defpackage.yth.b("index has leading zero", strB, iB, i);
                }
                int i26 = i22 - 1;
                if (i == strB.length()) {
                    throw defpackage.yth.c("unterminated parameter", strB, iB);
                }
                i2 = i23 + 2;
                strB.charAt(i);
                i17 = i26;
            }
            i21 = i;
            i = i2;
            i3 = i + i15;
            while (true) {
                if (i3 < strB.length()) {
                    throw defpackage.yth.c("unterminated parameter", strB, iB);
                }
                if (((char) ((strB.charAt(i3) & (-33)) - 65)) < 26) {
                    break;
                }
                i3++;
                i15 = -1;
            }
            cCharAt2 = strB.charAt(i3);
            i4 = cCharAt2 & ' ';
            if (i4 == 0) {
                z = true;
            } else {
                z = false;
            }
            defpackage.yqq yqqVar3 = defpackage.yqq.a;
            if (i21 == i3) {
                if (true != z) {
                    i5 = 0;
                } else {
                    i5 = 128;
                }
                while (true) {
                    if (i21 == i3) {
                        yqqVar = new defpackage.yqq(i5, i15, i15);
                        i6 = i18;
                        break;
                    }
                    i6 = i18;
                    i7 = i21 + 1;
                    cCharAt3 = strB.charAt(i21);
                    c = '.';
                    if (cCharAt3 < ' ') {
                    }
                    if (cCharAt3 > '9') {
                        throw defpackage.yth.a("invalid flag", strB, i21);
                    }
                    i8 = cCharAt3 - '0';
                    while (true) {
                        if (i7 == i3) {
                            yqqVar = new defpackage.yqq(i5, i8, -1);
                            break;
                        }
                        i9 = i7 + 1;
                        cCharAt4 = strB.charAt(i7);
                        if (cCharAt4 == c) {
                            yqqVar = new defpackage.yqq(i5, i8, defpackage.yqq.b(strB, i9, i3));
                            break;
                        }
                        c2 = (char) (cCharAt4 - '0');
                        if (c2 >= '\n') {
                            throw defpackage.yth.a("invalid width character", strB, i7);
                        }
                        i8 = (i8 * 10) + c2;
                        if (i8 > 999999) {
                            throw defpackage.yth.b("width too large", strB, i21, i3);
                        }
                        i7 = i9;
                        c = '.';
                    }
                    i5 |= i10;
                    i21 = i7;
                    i18 = i6;
                    i15 = -1;
                }
            } else {
                if (true != z) {
                    i5 = 0;
                } else {
                    i5 = 128;
                }
                while (true) {
                    if (i21 == i3) {
                        yqqVar = new defpackage.yqq(i5, i15, i15);
                        i6 = i18;
                        break;
                    }
                    i6 = i18;
                    i7 = i21 + 1;
                    cCharAt3 = strB.charAt(i21);
                    c = '.';
                    if (cCharAt3 < ' ') {
                    }
                    if (cCharAt3 > '9') {
                        throw defpackage.yth.a("invalid flag", strB, i21);
                    }
                    i8 = cCharAt3 - '0';
                    while (true) {
                        if (i7 == i3) {
                            yqqVar = new defpackage.yqq(i5, i8, -1);
                            break;
                        }
                        i9 = i7 + 1;
                        cCharAt4 = strB.charAt(i7);
                        if (cCharAt4 == c) {
                            yqqVar = new defpackage.yqq(i5, i8, defpackage.yqq.b(strB, i9, i3));
                            break;
                        }
                        c2 = (char) (cCharAt4 - '0');
                        if (c2 >= '\n') {
                            throw defpackage.yth.a("invalid width character", strB, i7);
                        }
                        i8 = (i8 * 10) + c2;
                        if (i8 > 999999) {
                            throw defpackage.yth.b("width too large", strB, i21, i3);
                        }
                        i7 = i9;
                        c = '.';
                    }
                    i5 |= i10;
                    i21 = i7;
                    i18 = i6;
                    i15 = -1;
                }
            }
            yqpVar = defpackage.yqp.k[(cCharAt2 | ' ') - 97];
            if (i4 == 0) {
                yqpVar = null;
            }
            i11 = i3 + 1;
            if (yqpVar != null) {
                if (cCharAt2 != 't') {
                }
                if (!yqqVar.e(160, false)) {
                    throw defpackage.yth.b("invalid format specification", strB, iB, i11);
                }
                i12 = i3 + 2;
                if (i12 > strB.length()) {
                    throw defpackage.yth.a("truncated format specifier", strB, iB);
                }
                yszVar = (defpackage.ysz) defpackage.ysz.F.get(java.lang.Character.valueOf(strB.charAt(i11)));
                if (yszVar == null) {
                    throw defpackage.yth.a("illegal date/time conversion", strB, i11);
                }
                ytaVar = new defpackage.yta(yqqVar, i17, yszVar);
                i11 = i12;
            } else {
                if (!yqqVar.e(yqpVar.n, yqpVar.m.f)) {
                    throw defpackage.yth.b("invalid format specifier", strB, iB, i11);
                }
                java.util.Map map3 = defpackage.ytc.c;
                if (i17 < 10) {
                }
                ytdVar = new defpackage.ytc(i17, yqpVar, yqqVar);
                ytaVar = ytdVar;
            }
            i13 = ytaVar.a;
            if (i13 < 32) {
                ytfVar.a |= i6 << i13;
            }
            ytfVar.b = java.lang.Math.max(ytfVar.b, i13);
            defpackage.ytg ytgVarA4 = ytfVar.a();
            java.lang.String strB5 = ytfVar.b();
            int i27 = ytfVar.e;
            sb2 = ytfVar.d;
            ytgVarA4.a(sb2, strB5, i27, iB);
            objArr = ytfVar.c;
            if (i13 < objArr.length) {
                obj = objArr[i13];
                if (obj != null) {
                    ytaVar.a(ytfVar, obj);
                } else {
                    sb2.append("null");
                }
            } else {
                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
            }
            ytfVar.e = i11;
            iB = defpackage.yti.b(strB, i11);
            i14 = 0;
            i15 = -1;
        }
    }

    public final defpackage.ytg a() {
        return this.f.a;
    }

    public final java.lang.String b() {
        return this.f.b;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0133  */
    /* JADX WARN: Code duplicated, block: B:15:0x0022  */
    /* JADX WARN: Code duplicated, block: B:31:0x003f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0094  */
    public final void d(java.lang.Object obj, defpackage.yqp yqpVar, defpackage.yqq yqqVar) {
        java.lang.String strA;
        defpackage.yqq yqqVar2;
        boolean zIsValidCodePoint;
        int iOrdinal = yqpVar.m.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zIsValidCodePoint = obj instanceof java.lang.Boolean;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw null;
                    }
                    if ((obj instanceof java.lang.Double) || (obj instanceof java.lang.Float) || (obj instanceof java.math.BigDecimal)) {
                        zIsValidCodePoint = true;
                    } else {
                        zIsValidCodePoint = false;
                    }
                } else if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Long) || (obj instanceof java.lang.Byte) || (obj instanceof java.lang.Short) || (obj instanceof java.math.BigInteger)) {
                    zIsValidCodePoint = true;
                } else {
                    zIsValidCodePoint = false;
                }
            } else if (obj instanceof java.lang.Character) {
                zIsValidCodePoint = true;
            } else if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Byte) || (obj instanceof java.lang.Short)) {
                zIsValidCodePoint = java.lang.Character.isValidCodePoint(((java.lang.Number) obj).intValue());
            } else {
                zIsValidCodePoint = false;
            }
            if (!zIsValidCodePoint) {
                c(this.d, obj, yqpVar.o);
                return;
            }
        }
        java.lang.StringBuilder sb = this.d;
        int iOrdinal2 = yqpVar.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                if (yqqVar.c()) {
                    sb.append(obj);
                    return;
                }
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 5) {
                        if (yqqVar.c()) {
                            yqqVar2 = yqqVar;
                        } else {
                            int i = yqqVar.b;
                            int i2 = i & 128;
                            if (i2 == 0) {
                                yqqVar2 = defpackage.yqq.a;
                            } else if (i2 == i && yqqVar.c == -1 && yqqVar.d == -1) {
                                yqqVar2 = yqqVar;
                            } else {
                                yqqVar2 = new defpackage.yqq(i2, -1, -1);
                            }
                        }
                        if (yqqVar2.equals(yqqVar)) {
                            java.lang.Number number = (java.lang.Number) obj;
                            boolean zD = yqqVar.d();
                            long jLongValue = number.longValue();
                            if (number instanceof java.lang.Long) {
                                defpackage.yqw.d(sb, jLongValue, zD);
                                return;
                            }
                            if (number instanceof java.lang.Integer) {
                                defpackage.yqw.d(sb, jLongValue & 4294967295L, zD);
                                return;
                            }
                            if (number instanceof java.lang.Byte) {
                                defpackage.yqw.d(sb, jLongValue & 255, zD);
                                return;
                            }
                            if (number instanceof java.lang.Short) {
                                defpackage.yqw.d(sb, jLongValue & 65535, zD);
                                return;
                            } else {
                                if (!(number instanceof java.math.BigInteger)) {
                                    throw new java.lang.IllegalStateException("unsupported number type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(number.getClass()))));
                                }
                                java.lang.String string = ((java.math.BigInteger) number).toString(16);
                                if (zD) {
                                    string = string.toUpperCase(defpackage.yqw.a);
                                }
                                sb.append(string);
                                return;
                            }
                        }
                    }
                } else if (yqqVar.c()) {
                    sb.append(obj);
                    return;
                }
            } else if (yqqVar.c()) {
                if (obj instanceof java.lang.Character) {
                    sb.append(obj);
                    return;
                }
                int iIntValue = ((java.lang.Number) obj).intValue();
                if ((iIntValue >>> 16) == 0) {
                    sb.append((char) iIntValue);
                    return;
                } else {
                    sb.append(java.lang.Character.toChars(iIntValue));
                    return;
                }
            }
        } else {
            if (obj instanceof java.util.Formattable) {
                java.util.Formattable formattable = (java.util.Formattable) obj;
                int i3 = yqqVar.b;
                int i4 = i3 & 162;
                if (i4 != 0) {
                    i4 = ((i3 & 32) == 0 ? 0 : 1) | ((i3 & 128) != 0 ? 2 : 0) | ((i3 & 2) == 0 ? 0 : 4);
                }
                int length = sb.length();
                java.util.Formatter formatter = new java.util.Formatter(sb, defpackage.yqw.a);
                try {
                    formattable.formatTo(formatter, i4, yqqVar.c, yqqVar.d);
                    return;
                } catch (java.lang.RuntimeException e) {
                    sb.setLength(length);
                    try {
                        formatter.out().append(defpackage.yqw.a(formattable, e));
                        return;
                    } catch (java.io.IOException unused) {
                        return;
                    }
                }
            }
            if (yqqVar.c()) {
                try {
                    strA = defpackage.yqw.c(obj);
                } catch (java.lang.RuntimeException e2) {
                    strA = defpackage.yqw.a(obj, e2);
                }
                sb.append(strA);
                return;
            }
        }
        java.lang.String string2 = yqpVar.o;
        if (!yqqVar.c()) {
            int i5 = yqpVar.l;
            if (yqqVar.d()) {
                i5 &= 65503;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("%");
            yqqVar.f(sb2);
            sb2.append((char) i5);
            string2 = sb2.toString();
        }
        sb.append(java.lang.String.format(defpackage.yqw.a, string2, obj));
    }
}
