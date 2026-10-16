package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acmh {
    public static volatile defpackage.adng a;
    public static volatile defpackage.adng b;
    public static volatile defpackage.adng c;
    public static volatile defpackage.adng d;
    public static volatile defpackage.adng e;

    private acmh() {
    }

    public static /* synthetic */ long A(long j) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j) + java.lang.Long.numberOfLeadingZeros(~j) + 54;
        if (iNumberOfLeadingZeros > 65) {
            return j * 1000;
        }
        if (iNumberOfLeadingZeros >= 64) {
            long j2 = j * 1000;
            if (j == 0 || j2 / j == 1000) {
                return j2;
            }
        }
        throw new java.lang.ArithmeticException();
    }

    public static defpackage.abpy B(android.os.Parcel parcel, defpackage.abpy abpyVar, defpackage.abol abolVar) throws defpackage.abpp {
        return C((com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse) parcel.readTypedObject(com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse.CREATOR), abpyVar, abolVar);
    }

    public static defpackage.abpy C(com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse protoParsers$InternalDontUse, defpackage.abpy abpyVar, defpackage.abol abolVar) throws defpackage.abpp {
        defpackage.abpy abpyVarS = abpyVar.s();
        if (protoParsers$InternalDontUse.b == null) {
            protoParsers$InternalDontUse.b = abpyVarS.K().h(protoParsers$InternalDontUse.a, abolVar).q();
        }
        return protoParsers$InternalDontUse.b;
    }

    public static void D(android.os.Parcel parcel, defpackage.abpy abpyVar) {
        parcel.writeTypedObject(new com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse(null, abpyVar), 0);
    }

    public static final void E(defpackage.abnv abnvVar, java.util.ArrayDeque arrayDeque) {
        if (!abnvVar.q()) {
            if (!(abnvVar instanceof abqm)) {
                throw new java.lang.IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(java.lang.String.valueOf(java.lang.String.valueOf(abnvVar.getClass()))));
            }
            abqm abqmVar = (abqm) abnvVar;
            int[] iArr = abqm.a;
            E(abqmVar.c, arrayDeque);
            E(abqmVar.e, arrayDeque);
            return;
        }
        int iH = H(abnvVar.d());
        int iO = abqm.o(iH + 1);
        if (arrayDeque.isEmpty() || ((defpackage.abnv) arrayDeque.peek()).d() >= iO) {
            arrayDeque.push(abnvVar);
            return;
        }
        int iO2 = abqm.o(iH);
        defpackage.abnv abqmVar2 = (defpackage.abnv) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((defpackage.abnv) arrayDeque.peek()).d() < iO2) {
            abqmVar2 = new abqm((defpackage.abnv) arrayDeque.pop(), abqmVar2);
        }
        abqm abqmVar3 = new abqm(abqmVar2, abnvVar);
        while (!arrayDeque.isEmpty()) {
            if (((defpackage.abnv) arrayDeque.peek()).d() >= abqm.o(H(abqmVar3.b) + 1)) {
                break;
            } else {
                abqmVar3 = new abqm((defpackage.abnv) arrayDeque.pop(), abqmVar3);
            }
        }
        arrayDeque.push(abqmVar3);
    }

    public static int F(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        if (i == 10) {
            return 11;
        }
        if (i == 35) {
            return 36;
        }
        if (i == 40) {
            return 41;
        }
        if (i == 21) {
            return 22;
        }
        if (i == 22) {
            return 23;
        }
        if (i == 37) {
            return 38;
        }
        if (i == 38) {
            return 39;
        }
        switch (i) {
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:5:0x0012 A[PHI: r5
  0x0012: PHI (r5v10 int) = (r5v1 int), (r5v1 int), (r5v2 int) binds: [B:4:0x0010, B:7:0x0018, B:24:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    public static defpackage.erh G(java.lang.String str) {
        int length = str.length();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 1; i2 < length; i2++) {
            if (!z) {
                char cCharAt = str.charAt(i2);
                switch (cCharAt) {
                    case '\t':
                    case '\n':
                    case ' ':
                    case ',':
                    case '-':
                        int i3 = i2 + 1;
                        java.lang.String strSubstring = str.substring(i, i2);
                        if (strSubstring.trim().length() > 0) {
                            arrayList.add(java.lang.Float.valueOf(java.lang.Float.parseFloat(strSubstring)));
                            boolean z2 = cCharAt != '-';
                            i = cCharAt == '-' ? i2 : i3;
                            z = z2;
                        } else {
                            i++;
                            z = false;
                        }
                        break;
                    case ')':
                    case 'A':
                    case 'C':
                    case 'H':
                    case 'L':
                    case 'M':
                    case 'Q':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'Z':
                    case 'a':
                    case 'c':
                    case 'h':
                    case 'l':
                    case 'm':
                    case 'q':
                    case 's':
                    case 't':
                    case 'v':
                    case 'z':
                        java.lang.String strSubstring2 = str.substring(i, i2);
                        if (strSubstring2.trim().length() > 0) {
                            arrayList.add(java.lang.Float.valueOf(java.lang.Float.parseFloat(strSubstring2)));
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
                return new defpackage.erh(arrayList);
            }
            z = false;
        }
        java.lang.String strSubstring3 = str.substring(i);
        if (strSubstring3.length() > 0) {
            try {
                arrayList.add(java.lang.Float.valueOf(java.lang.Float.parseFloat(strSubstring3)));
            } catch (java.lang.NumberFormatException unused) {
            }
            str.length();
        }
        return new defpackage.erh(arrayList);
    }

    private static final int H(int i) {
        int iBinarySearch = java.util.Arrays.binarySearch(abqm.a, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public static acmg a(defpackage.adjx adjxVar) {
        return acmg.b(new zlt(3), adjxVar);
    }

    public static final void b(java.lang.Object obj, defpackage.aclw aclwVar, java.util.LinkedHashMap linkedHashMap) {
        linkedHashMap.put(obj, aclwVar);
    }

    public static java.lang.Object c(java.lang.Object obj, java.lang.Class cls) {
        boolean z;
        if (!(obj instanceof acln)) {
            if (obj instanceof defpackage.aclo) {
                return c(((defpackage.aclo) obj).a(), cls);
            }
            throw new java.lang.IllegalStateException(java.lang.String.format("Given component holder %s does not implement %s or %s", obj.getClass(), acln.class, defpackage.aclo.class));
        }
        if (obj instanceof aclp) {
            java.lang.annotation.Annotation[] annotations = cls.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (annotations[i].annotationType().getCanonicalName().contentEquals("dagger.hilt.android.EarlyEntryPoint")) {
                    z = true;
                    break;
                }
                i++;
            }
            java.lang.Object[] objArr = {cls.getCanonicalName()};
            if (z) {
                throw new java.lang.IllegalStateException(java.lang.String.format("Interface, %s, annotated with @EarlyEntryPoint should be called with EarlyEntryPoints.get() rather than EntryPoints.get()", objArr));
            }
        }
        return cls.cast(obj);
    }

    public static android.graphics.Matrix d(java.lang.String str) {
        float fFloatValue;
        int i;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        java.lang.String strReplaceFirst = str;
        while (true) {
            float fFloatValue2 = 0.0f;
            if (strReplaceFirst.startsWith("matrix(")) {
                java.util.ArrayList arrayList = (java.util.ArrayList) G(strReplaceFirst.substring(7)).a;
                if (arrayList.size() == 6) {
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                    matrix2.setValues(new float[]{((java.lang.Float) arrayList.get(0)).floatValue(), ((java.lang.Float) arrayList.get(2)).floatValue(), ((java.lang.Float) arrayList.get(4)).floatValue(), ((java.lang.Float) arrayList.get(1)).floatValue(), ((java.lang.Float) arrayList.get(3)).floatValue(), ((java.lang.Float) arrayList.get(5)).floatValue(), 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                }
            } else if (strReplaceFirst.startsWith("translate(")) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) G(strReplaceFirst.substring(10)).a;
                if (arrayList2.size() > 0) {
                    matrix.preTranslate(((java.lang.Float) arrayList2.get(0)).floatValue(), arrayList2.size() > 1 ? ((java.lang.Float) arrayList2.get(1)).floatValue() : 0.0f);
                }
            } else if (strReplaceFirst.startsWith("scale(")) {
                java.util.ArrayList arrayList3 = (java.util.ArrayList) G(strReplaceFirst.substring(6)).a;
                if (arrayList3.size() > 0) {
                    float fFloatValue3 = ((java.lang.Float) arrayList3.get(0)).floatValue();
                    matrix.preScale(fFloatValue3, arrayList3.size() > 1 ? ((java.lang.Float) arrayList3.get(1)).floatValue() : fFloatValue3);
                }
            } else if (strReplaceFirst.startsWith("skewX(")) {
                java.util.ArrayList arrayList4 = (java.util.ArrayList) G(strReplaceFirst.substring(6)).a;
                if (arrayList4.size() > 0) {
                    matrix.preSkew((float) java.lang.Math.tan(((java.lang.Float) arrayList4.get(0)).floatValue()), 0.0f);
                }
            } else if (strReplaceFirst.startsWith("skewY(")) {
                java.util.ArrayList arrayList5 = (java.util.ArrayList) G(strReplaceFirst.substring(6)).a;
                if (arrayList5.size() > 0) {
                    matrix.preSkew(0.0f, (float) java.lang.Math.tan(((java.lang.Float) arrayList5.get(0)).floatValue()));
                }
            } else if (strReplaceFirst.startsWith("rotate(")) {
                java.util.ArrayList arrayList6 = (java.util.ArrayList) G(strReplaceFirst.substring(7)).a;
                if (arrayList6.size() > 0) {
                    float fFloatValue4 = ((java.lang.Float) arrayList6.get(0)).floatValue();
                    if (arrayList6.size() > 2) {
                        fFloatValue2 = ((java.lang.Float) arrayList6.get(1)).floatValue();
                        fFloatValue = ((java.lang.Float) arrayList6.get(2)).floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    matrix.preTranslate(fFloatValue2, fFloatValue);
                    matrix.preRotate(fFloatValue4);
                    matrix.preTranslate(-fFloatValue2, -fFloatValue);
                }
            } else {
                android.util.Log.w("SVG", defpackage.a.bp(strReplaceFirst, "Invalid transform (", ")"));
            }
            int iIndexOf = strReplaceFirst.indexOf(")");
            if (iIndexOf <= 0 || strReplaceFirst.length() <= (i = iIndexOf + 1)) {
                break;
            }
            strReplaceFirst = strReplaceFirst.substring(i).replaceFirst("[\\s,]*", "");
        }
        return matrix;
    }

    public static java.lang.String e(java.lang.String str) {
        return str.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("&", "&amp;");
    }

    public static java.lang.String f(java.lang.String str, org.xml.sax.Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            if (attributes.getLocalName(i).equals(str)) {
                return attributes.getValue(i);
            }
        }
        return null;
    }

    public static int g(ackw ackwVar, boolean z) {
        int i = z ? ackwVar.c : ackwVar.b;
        int i2 = z ? ackwVar.b : ackwVar.c;
        byte[][] bArr = ackwVar.a;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b2 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b3 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b3 == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += i5 - 2;
                    }
                    i5 = 1;
                    b2 = b3;
                }
            }
            if (i5 >= 5) {
                i3 += i5 - 2;
            }
        }
        return i3;
    }

    public static boolean h(byte[] bArr, int i, int i2) {
        if (i < 0 || bArr.length < i2) {
            return false;
        }
        while (i < i2) {
            if (bArr[i] == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean i(byte[][] bArr, int i, int i2, int i3) {
        if (i2 < 0 || bArr.length < i3) {
            return false;
        }
        while (i2 < i3) {
            if (bArr[i2][i] == 1) {
                return false;
            }
            i2++;
        }
        return true;
    }

    static int j(acbe acbeVar, int[] iArr) {
        int i = acbeVar.b;
        int i2 = (i << 10) + (i << 6) + i;
        int i3 = acbeVar.d;
        int i4 = i3 << 5;
        int i5 = i2 + i4 + i3;
        int i6 = acbeVar.f;
        int i7 = iArr[i5 + i6];
        int i8 = acbeVar.e;
        int i9 = i7 - iArr[i5 + i8];
        int i10 = acbeVar.c;
        int i11 = i10 << 5;
        int i12 = i2 + i11 + i10;
        int i13 = (i9 - iArr[i12 + i6]) + iArr[i12 + i8];
        int i14 = acbeVar.a;
        int i15 = (i14 << 10) + (i14 << 6) + i14;
        int i16 = i4 + i15 + i3;
        int i17 = i15 + i11 + i10;
        return (((i13 - iArr[i16 + i6]) + iArr[i16 + i8]) + iArr[i6 + i17]) - iArr[i17 + i8];
    }

    static int k(acbe acbeVar, int i, int[] iArr) {
        int i2;
        int i3;
        int i4 = i - 1;
        if (i4 == 0) {
            int i5 = acbeVar.a;
            int i6 = acbeVar.d;
            int i7 = acbeVar.f;
            int i8 = (i5 << 10) + (i5 << 6) + i5;
            int i9 = (i6 << 5) + i8 + i6;
            int i10 = -iArr[i9 + i7];
            int i11 = acbeVar.e;
            int i12 = i10 + iArr[i9 + i11];
            int i13 = acbeVar.c;
            int i14 = i8 + (i13 << 5) + i13;
            i2 = i12 + iArr[i7 + i14];
            i3 = iArr[i14 + i11];
        } else if (i4 != 1) {
            int i15 = acbeVar.b;
            int i16 = acbeVar.d;
            int i17 = acbeVar.e;
            int i18 = i16 << 5;
            int i19 = (i15 << 10) + (i15 << 6) + i15;
            int i20 = -iArr[i19 + i18 + i16 + i17];
            int i21 = acbeVar.c;
            int i22 = i21 << 5;
            int i23 = i20 + iArr[i19 + i22 + i21 + i17];
            int i24 = acbeVar.a;
            int i25 = (i24 << 10) + (i24 << 6) + i24;
            i2 = i23 + iArr[i18 + i25 + i16 + i17];
            i3 = iArr[i25 + i22 + i21 + i17];
        } else {
            int i26 = acbeVar.b;
            int i27 = acbeVar.c;
            int i28 = acbeVar.f;
            int i29 = i27 << 5;
            int i30 = (i26 << 10) + (i26 << 6) + i26 + i29 + i27;
            int i31 = -iArr[i30 + i28];
            int i32 = acbeVar.e;
            int i33 = i31 + iArr[i30 + i32];
            int i34 = acbeVar.a;
            int i35 = (i34 << 10) + (i34 << 6) + i34 + i29 + i27;
            i2 = i33 + iArr[i28 + i35];
            i3 = iArr[i35 + i32];
        }
        return i2 - i3;
    }

    static int l(acbe acbeVar, int i, int i2, int[] iArr) {
        int i3;
        int i4;
        int i5 = i - 1;
        if (i5 == 0) {
            int i6 = acbeVar.d;
            int i7 = acbeVar.f;
            int i8 = (i2 << 10) + (i2 << 6) + i2;
            int i9 = (i6 << 5) + i8 + i6;
            int i10 = iArr[i9 + i7];
            int i11 = acbeVar.e;
            int i12 = i10 - iArr[i9 + i11];
            int i13 = acbeVar.c;
            int i14 = i8 + (i13 << 5) + i13;
            i3 = i12 - iArr[i7 + i14];
            i4 = iArr[i14 + i11];
        } else if (i5 != 1) {
            int i15 = acbeVar.b;
            int i16 = acbeVar.d;
            int i17 = i16 << 5;
            int i18 = (i15 << 10) + (i15 << 6) + i15;
            int i19 = iArr[i18 + i17 + i16 + i2];
            int i20 = acbeVar.c;
            int i21 = i20 << 5;
            int i22 = i19 - iArr[((i18 + i21) + i20) + i2];
            int i23 = acbeVar.a;
            int i24 = (i23 << 10) + (i23 << 6) + i23;
            i3 = i22 - iArr[((i17 + i24) + i16) + i2];
            i4 = iArr[i24 + i21 + i20 + i2];
        } else {
            int i25 = acbeVar.b;
            int i26 = acbeVar.f;
            int i27 = i2 << 5;
            int i28 = (i25 << 10) + (i25 << 6) + i25 + i27 + i2;
            int i29 = iArr[i28 + i26];
            int i30 = acbeVar.e;
            int i31 = i29 - iArr[i28 + i30];
            int i32 = acbeVar.a;
            int i33 = (i32 << 10) + (i32 << 6) + i32 + i27 + i2;
            i3 = i31 - iArr[i26 + i33];
            i4 = iArr[i33 + i30];
        }
        return i3 + i4;
    }

    static final acbf m(acbe acbeVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        acbe acbeVar2 = acbeVar;
        int i8 = i;
        int[] iArr5 = iArr;
        int[] iArr6 = iArr2;
        int iK = k(acbeVar2, i8, iArr6);
        int iK2 = k(acbeVar2, i8, iArr3);
        int iK3 = k(acbeVar2, i8, iArr4);
        int iK4 = k(acbeVar2, i8, iArr5);
        double d2 = 0.0d;
        int i9 = -1;
        int i10 = i2;
        while (i10 < i3) {
            int iL = l(acbeVar2, i8, i10, iArr6) + iK;
            int iL2 = iK2 + l(acbeVar2, i8, i10, iArr3);
            int iL3 = iK3 + l(acbeVar2, i8, i10, iArr4);
            int iL4 = iK4 + l(acbeVar2, i8, i10, iArr5);
            if (iL4 != 0) {
                int i11 = iL * iL;
                int i12 = iL2 * iL2;
                int i13 = iL3 * iL3;
                int i14 = i4 - iL;
                int i15 = i5 - iL2;
                int i16 = i6 - iL3;
                int i17 = i7 - iL4;
                if (i17 != 0) {
                    double d3 = (((double) ((i11 + i12) + i13)) / ((double) iL4)) + (((double) (((i14 * i14) + (i15 * i15)) + (i16 * i16))) / ((double) i17));
                    if (d3 > d2) {
                        d2 = d3;
                        i9 = i10;
                    }
                }
            }
            i10++;
            acbeVar2 = acbeVar;
            i8 = i;
            iArr5 = iArr;
            iArr6 = iArr2;
        }
        return new acbf(i9, d2);
    }

    static final double n(acbe acbeVar, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, double[] dArr) {
        int iJ = j(acbeVar, iArr2);
        int iJ2 = j(acbeVar, iArr3);
        int iJ3 = j(acbeVar, iArr4);
        int i = acbeVar.b;
        int i2 = (i << 10) + (i << 6) + i;
        int i3 = acbeVar.d;
        int i4 = i3 << 5;
        int i5 = i2 + i4 + i3;
        int i6 = acbeVar.f;
        double d2 = dArr[i5 + i6];
        int i7 = acbeVar.e;
        double d3 = d2 - dArr[i5 + i7];
        int i8 = acbeVar.c;
        int i9 = i8 << 5;
        int i10 = i2 + i9 + i8;
        double d4 = (d3 - dArr[i10 + i6]) + dArr[i10 + i7];
        int i11 = acbeVar.a;
        int i12 = (i11 << 10) + (i11 << 6) + i11;
        int i13 = i4 + i12 + i3;
        int i14 = i12 + i9 + i8;
        return ((((d4 - dArr[i13 + i6]) + dArr[i13 + i7]) + dArr[i6 + i14]) - dArr[i14 + i7]) - (((double) (((iJ * iJ) + (iJ2 * iJ2)) + (iJ3 * iJ3))) / ((double) j(acbeVar, iArr)));
    }

    /* JADX WARN: Code duplicated, block: B:190:0x02c0 A[EDGE_INSN: B:190:0x02c0->B:77:0x02c0 BREAK  A[LOOP:6: B:28:0x016e->B:75:0x02b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0258  */
    /* JADX WARN: Code duplicated, block: B:56:0x025f  */
    /* JADX WARN: Code duplicated, block: B:57:0x026b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0276  */
    /* JADX WARN: Code duplicated, block: B:61:0x0281  */
    /* JADX WARN: Code duplicated, block: B:63:0x028c  */
    /* JADX WARN: Code duplicated, block: B:66:0x029e  */
    /* JADX WARN: Code duplicated, block: B:68:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:70:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b1 A[LOOP:6: B:28:0x016e->B:75:0x02b1, LOOP_END] */
    public static java.util.Map o(int[] iArr) {
        int iIntValue;
        int i;
        acbe[] acbeVarArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        java.lang.Boolean bool;
        double[] dArr;
        int i9;
        double d2;
        int i10;
        double d3;
        acbe acbeVar;
        double dN;
        acbe acbeVar2;
        double dN2;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i11 = 0;
        while (true) {
            iIntValue = 1;
            if (i11 >= iArr.length) {
                break;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iArr[i11]);
            java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(numValueOf);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(numValueOf, java.lang.Integer.valueOf(iIntValue));
            i11++;
        }
        int[] iArr2 = new int[35937];
        int[] iArr3 = new int[35937];
        int[] iArr4 = new int[35937];
        int[] iArr5 = new int[35937];
        double[] dArr2 = new double[35937];
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue2 = ((java.lang.Integer) entry.getKey()).intValue();
            int iIntValue3 = ((java.lang.Integer) entry.getValue()).intValue();
            double[][] dArr3 = defpackage.acbh.a;
            int i12 = iIntValue2 >> 16;
            int i13 = iIntValue2 >> 8;
            int i14 = iIntValue2 & 255;
            int i15 = i12 & 255;
            int i16 = (i15 >> 3) + 1;
            int i17 = i13 & 255;
            int i18 = (i17 >> 3) + 1;
            int i19 = (i16 << 10) + (i16 << 6) + i16 + (i18 << 5) + i18 + (i14 >> 3) + 1;
            iArr2[i19] = iArr2[i19] + iIntValue3;
            iArr3[i19] = iArr3[i19] + (i15 * iIntValue3);
            iArr4[i19] = iArr4[i19] + (i17 * iIntValue3);
            iArr5[i19] = iArr5[i19] + (i14 * iIntValue3);
            dArr2[i19] = dArr2[i19] + ((double) (iIntValue3 * ((i15 * i15) + (i17 * i17) + (i14 * i14))));
        }
        for (int i20 = 1; i20 < 33; i20++) {
            int[] iArr6 = new int[33];
            int[] iArr7 = new int[33];
            int[] iArr8 = new int[33];
            int[] iArr9 = new int[33];
            double[] dArr4 = new double[33];
            for (int i21 = 1; i21 < 33; i21++) {
                double d4 = 0.0d;
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                for (int i26 = 1; i26 < 33; i26++) {
                    int i27 = i21 << 5;
                    int i28 = (i20 << 10) + (i20 << 6) + i20 + i27 + i21 + i26;
                    i22 += iArr2[i28];
                    i23 += iArr3[i28];
                    i24 += iArr4[i28];
                    i25 += iArr5[i28];
                    d4 += dArr2[i28];
                    int i29 = iArr6[i26] + i22;
                    iArr6[i26] = i29;
                    int i30 = iArr7[i26] + i23;
                    iArr7[i26] = i30;
                    int i31 = iArr8[i26] + i24;
                    iArr8[i26] = i31;
                    int i32 = iArr9[i26] + i25;
                    iArr9[i26] = i32;
                    double d5 = dArr4[i26] + d4;
                    dArr4[i26] = d5;
                    int i33 = i20 - 1;
                    int i34 = (i33 << 10) + (i33 << 6) + i33 + i27 + i21 + i26;
                    iArr2[i28] = iArr2[i34] + i29;
                    iArr3[i28] = iArr3[i34] + i30;
                    iArr4[i28] = iArr4[i34] + i31;
                    iArr5[i28] = iArr5[i34] + i32;
                    dArr2[i28] = dArr2[i34] + d5;
                }
            }
        }
        int i35 = 0;
        int i36 = 16;
        acbe[] acbeVarArr2 = new acbe[16];
        for (int i37 = 0; i37 < 16; i37++) {
            acbeVarArr2[i37] = new acbe();
        }
        double[] dArr5 = new double[16];
        acbe acbeVar3 = acbeVarArr2[0];
        acbeVar3.b = 32;
        acbeVar3.d = 32;
        acbeVar3.f = 32;
        int i38 = 1;
        int i39 = 0;
        while (true) {
            if (i38 >= i36) {
                i = i36;
                acbeVarArr = acbeVarArr2;
                i2 = -1;
                break;
            }
            int i40 = i38;
            acbe acbeVar4 = acbeVarArr2[i39];
            acbe acbeVar5 = acbeVarArr2[i40];
            int iJ = j(acbeVar4, iArr3);
            int iJ2 = j(acbeVar4, iArr4);
            int iJ3 = j(acbeVar4, iArr5);
            int[] iArr10 = iArr5;
            int iJ4 = j(acbeVar4, iArr2);
            int[] iArr11 = iArr4;
            i = i36;
            i2 = -1;
            acbf acbfVarM = m(acbeVar4, 1, acbeVar4.a + iIntValue, acbeVar4.b, iJ, iJ2, iJ3, iJ4, iArr2, iArr3, iArr11, iArr10);
            int i41 = iIntValue;
            acbf acbfVarM2 = m(acbeVar4, 2, acbeVar4.c + iIntValue, acbeVar4.d, iJ, iJ2, iJ3, iJ4, iArr2, iArr3, iArr11, iArr10);
            acbeVarArr = acbeVarArr2;
            acbf acbfVarM3 = m(acbeVar4, 3, acbeVar4.e + 1, acbeVar4.f, iJ, iJ2, iJ3, iJ4, iArr2, iArr3, iArr11, iArr10);
            double d6 = acbfVarM.b;
            double d7 = acbfVarM2.b;
            double d8 = acbfVarM3.b;
            if (d6 < d7 || d6 < d8) {
                i5 = (d7 < d6 || d7 < d8) ? 3 : 2;
            } else {
                if (acbfVarM.a < 0) {
                    bool = java.lang.Boolean.FALSE;
                } else {
                    i5 = i41;
                }
                if (bool.booleanValue()) {
                    acbeVar = acbeVarArr[i39];
                    if (acbeVar.g > 1) {
                        dArr = dArr2;
                        dN = n(acbeVar, iArr2, iArr3, iArr11, iArr10, dArr);
                    } else {
                        dArr = dArr2;
                        dN = 0.0d;
                    }
                    dArr5[i39] = dN;
                    acbeVar2 = acbeVarArr[i40];
                    if (acbeVar2.g > 1) {
                        iArr4 = iArr11;
                        iArr5 = iArr10;
                        dN2 = n(acbeVar2, iArr2, iArr3, iArr4, iArr5, dArr);
                    } else {
                        iArr4 = iArr11;
                        iArr5 = iArr10;
                        dN2 = 0.0d;
                    }
                    dArr5[i40] = dN2;
                    i9 = i40;
                } else {
                    dArr = dArr2;
                    iArr4 = iArr11;
                    iArr5 = iArr10;
                    dArr5[i39] = 0.0d;
                    i9 = i40 - 1;
                }
                i36 = i9 + 1;
                d2 = dArr5[0];
                i39 = 0;
                for (i10 = 1; i10 <= i9; i10++) {
                    d3 = dArr5[i10];
                    if (d3 > d2) {
                        d2 = d3;
                    }
                    if (d3 > d2) {
                        i39 = i10;
                    }
                }
                if (d2 <= 0.0d) {
                    break;
                }
                i38 = i36;
                dArr2 = dArr;
                i36 = i;
                acbeVarArr2 = acbeVarArr;
                iIntValue = 1;
            }
            acbeVar5.b = acbeVar4.b;
            acbeVar5.d = acbeVar4.d;
            acbeVar5.f = acbeVar4.f;
            int i42 = i5 - 1;
            if (i42 == 0) {
                i6 = acbfVarM.a;
                acbeVar4.b = i6;
                acbeVar5.a = i6;
                i7 = acbeVar4.c;
                acbeVar5.c = i7;
                i8 = acbeVar4.e;
                acbeVar5.e = i8;
            } else if (i42 != i41) {
                i8 = acbfVarM3.a;
                acbeVar4.f = i8;
                i6 = acbeVar4.a;
                acbeVar5.a = i6;
                i7 = acbeVar4.c;
                acbeVar5.c = i7;
                acbeVar5.e = i8;
            } else {
                i7 = acbfVarM2.a;
                acbeVar4.d = i7;
                i6 = acbeVar4.a;
                acbeVar5.a = i6;
                acbeVar5.c = i7;
                i8 = acbeVar4.e;
                acbeVar5.e = i8;
            }
            acbeVar4.g = (acbeVar4.b - acbeVar4.a) * (acbeVar4.d - acbeVar4.c) * (acbeVar4.f - acbeVar4.e);
            acbeVar5.g = (acbeVar5.b - i6) * (acbeVar5.d - i7) * (acbeVar5.f - i8);
            bool = java.lang.Boolean.TRUE;
            if (bool.booleanValue()) {
                acbeVar = acbeVarArr[i39];
                if (acbeVar.g > 1) {
                    dArr = dArr2;
                    dN = n(acbeVar, iArr2, iArr3, iArr11, iArr10, dArr);
                } else {
                    dArr = dArr2;
                    dN = 0.0d;
                }
                dArr5[i39] = dN;
                acbeVar2 = acbeVarArr[i40];
                if (acbeVar2.g > 1) {
                    iArr4 = iArr11;
                    iArr5 = iArr10;
                    dN2 = n(acbeVar2, iArr2, iArr3, iArr4, iArr5, dArr);
                } else {
                    iArr4 = iArr11;
                    iArr5 = iArr10;
                    dN2 = 0.0d;
                }
                dArr5[i40] = dN2;
                i9 = i40;
            } else {
                dArr = dArr2;
                iArr4 = iArr11;
                iArr5 = iArr10;
                dArr5[i39] = 0.0d;
                i9 = i40 - 1;
            }
            i36 = i9 + 1;
            d2 = dArr5[0];
            i39 = 0;
            while (i10 <= i9) {
                d3 = dArr5[i10];
                if (d3 > d2) {
                    d2 = d3;
                }
                if (d3 > d2) {
                    i39 = i10;
                }
            }
            if (d2 <= 0.0d) {
                break;
                break;
            }
            i38 = i36;
            dArr2 = dArr;
            i36 = i;
            acbeVarArr2 = acbeVarArr;
            iIntValue = 1;
        }
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList();
        int i43 = 0;
        while (true) {
            i3 = -16777216;
            if (i43 >= i36) {
                break;
            }
            acbe acbeVar6 = acbeVarArr[i43];
            int iJ5 = j(acbeVar6, iArr2);
            if (iJ5 > 0) {
                arrayList.add(java.lang.Integer.valueOf((-16777216) | (((j(acbeVar6, iArr3) / iJ5) & 255) << 16) | (((j(acbeVar6, iArr4) / iJ5) & 255) << 8) | ((j(acbeVar6, iArr5) / iJ5) & 255)));
            }
            i43++;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.lang.Integer num2 : arrayList) {
            num2.intValue();
            linkedHashMap2.put(num2, 0);
        }
        java.util.Set setKeySet = linkedHashMap2.keySet();
        int size = setKeySet.size();
        int[] iArr12 = new int[size];
        java.util.Iterator it = setKeySet.iterator();
        int i44 = 0;
        while (it.hasNext()) {
            iArr12[i44] = ((java.lang.Integer) it.next()).intValue();
            i44++;
        }
        java.util.Random random = new java.util.Random(272008L);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        int length = iArr.length;
        double[][] dArr6 = new double[length][];
        int[] iArr13 = new int[length];
        int i45 = 0;
        for (int i46 : iArr) {
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i46);
            java.lang.Integer num3 = (java.lang.Integer) linkedHashMap3.get(numValueOf2);
            if (num3 == null) {
                dArr6[i45] = acal.c(i46);
                iArr13[i45] = i46;
                linkedHashMap3.put(numValueOf2, 1);
                i45++;
            } else {
                linkedHashMap3.put(numValueOf2, java.lang.Integer.valueOf(num3.intValue() + 1));
            }
        }
        int[] iArr14 = new int[i45];
        for (int i47 = 0; i47 < i45; i47++) {
            iArr14[i47] = ((java.lang.Integer) linkedHashMap3.get(java.lang.Integer.valueOf(iArr13[i47]))).intValue();
        }
        int iMin = java.lang.Math.min(i, i45);
        if (size != 0) {
            iMin = java.lang.Math.min(iMin, size);
        }
        double[][] dArr7 = new double[iMin][];
        int i48 = 0;
        for (int i49 = 0; i49 < size; i49++) {
            dArr7[i49] = acal.c(iArr12[i49]);
            i48++;
        }
        int i50 = iMin - i48;
        if (i50 > 0) {
            for (int i51 = 0; i51 < i50; i51++) {
            }
        }
        int[] iArr15 = new int[i45];
        for (int i52 = 0; i52 < i45; i52++) {
            iArr15[i52] = random.nextInt(iMin);
        }
        int[][] iArr16 = new int[iMin][];
        for (int i53 = 0; i53 < iMin; i53++) {
            iArr16[i53] = new int[iMin];
        }
        acbd[][] acbdVarArr = new acbd[iMin][];
        int i54 = 0;
        while (i54 < iMin) {
            acbdVarArr[i54] = new acbd[iMin];
            int i55 = i35;
            while (i55 < iMin) {
                acbdVarArr[i54][i55] = new acbd(i35);
                i55++;
                i35 = 0;
            }
            i54++;
            i35 = 0;
        }
        int[] iArr17 = new int[iMin];
        int i56 = 0;
        while (true) {
            if (i56 >= 10) {
                i4 = i3;
                break;
            }
            int i57 = 0;
            while (i57 < iMin) {
                int i58 = i57 + 1;
                int i59 = i58;
                while (i59 < iMin) {
                    double dB = acal.b(dArr7[i57], dArr7[i59]);
                    int i60 = i3;
                    acbd acbdVar = acbdVarArr[i59][i57];
                    acbdVar.b = dB;
                    acbdVar.a = i57;
                    acbd acbdVar2 = acbdVarArr[i57][i59];
                    acbdVar2.b = dB;
                    acbdVar2.a = i59;
                    i59++;
                    i3 = i60;
                }
                int i61 = i3;
                java.util.Arrays.sort(acbdVarArr[i57]);
                for (int i62 = 0; i62 < iMin; i62++) {
                    iArr16[i57][i62] = acbdVarArr[i57][i62].a;
                }
                i57 = i58;
                i3 = i61;
            }
            i4 = i3;
            int i63 = 0;
            int i64 = 0;
            while (i63 < i45) {
                double[] dArr8 = dArr6[i63];
                int i65 = iArr15[i63];
                double dB2 = acal.b(dArr8, dArr7[i65]);
                int[] iArr18 = iArr14;
                int[][] iArr19 = iArr16;
                double d9 = dB2;
                int i66 = i2;
                int i67 = 0;
                while (i67 < iMin) {
                    int i68 = i67;
                    int[] iArr20 = iArr15;
                    if (acbdVarArr[i65][i68].b < 4.0d * dB2) {
                        double dB3 = acal.b(dArr8, dArr7[i68]);
                        if (dB3 < d9) {
                            d9 = dB3;
                            i66 = i68;
                        }
                    }
                    i67 = i68 + 1;
                    iArr15 = iArr20;
                }
                int[] iArr21 = iArr15;
                int i69 = i2;
                if (i66 != i69 && java.lang.Math.abs(java.lang.Math.sqrt(d9) - java.lang.Math.sqrt(dB2)) > 3.0d) {
                    iArr21[i63] = i66;
                    i64++;
                }
                i63++;
                i2 = i69;
                iArr14 = iArr18;
                iArr16 = iArr19;
                iArr15 = iArr21;
            }
            int[] iArr22 = iArr14;
            int[][] iArr23 = iArr16;
            int[] iArr24 = iArr15;
            if (i64 == 0) {
                if (i56 != 0) {
                    break;
                }
                i56 = 0;
            }
            double[] dArr9 = new double[iMin];
            double[] dArr10 = new double[iMin];
            double[] dArr11 = new double[iMin];
            char c2 = 0;
            java.util.Arrays.fill(iArr17, 0);
            int i70 = 0;
            while (i70 < i45) {
                int i71 = iArr24[i70];
                double[] dArr12 = dArr6[i70];
                int i72 = iArr22[i70];
                iArr17[i71] = iArr17[i71] + i72;
                double[] dArr13 = dArr10;
                double d10 = i72;
                dArr9[i71] = dArr9[i71] + (dArr12[c2] * d10);
                dArr13[i71] = dArr13[i71] + (dArr12[1] * d10);
                dArr11[i71] = dArr11[i71] + (dArr12[2] * d10);
                i70++;
                dArr10 = dArr13;
                c2 = 0;
            }
            double[] dArr14 = dArr10;
            for (int i73 = 0; i73 < iMin; i73++) {
                int i74 = iArr17[i73];
                if (i74 == 0) {
                    dArr7[i73] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d11 = i74;
                    double d12 = dArr9[i73] / d11;
                    double d13 = dArr14[i73] / d11;
                    double d14 = dArr11[i73] / d11;
                    double[] dArr15 = dArr7[i73];
                    dArr15[0] = d12;
                    dArr15[1] = d13;
                    dArr15[2] = d14;
                }
            }
            i56++;
            iArr14 = iArr22;
            i3 = i4;
            iArr16 = iArr23;
            iArr15 = iArr24;
            i2 = -1;
        }
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        for (int i75 = 0; i75 < iMin; i75++) {
            int i76 = iArr17[i75];
            if (i76 != 0) {
                double[] dArr16 = dArr7[i75];
                double d15 = dArr16[0];
                double d16 = dArr16[1];
                double d17 = dArr16[2] / 200.0d;
                double[] dArr17 = defpackage.acbh.c;
                double d18 = (d15 + 16.0d) / 116.0d;
                double dT = defpackage.a.t((d16 / 500.0d) + d18) * dArr17[0];
                double dT2 = defpackage.a.t(d18) * dArr17[1];
                double dT3 = defpackage.a.t(d18 - d17) * dArr17[2];
                double[][] dArr18 = defpackage.acbh.b;
                double[] dArr19 = dArr18[0];
                double d19 = dArr19[0] * dT;
                double d20 = dArr19[1] * dT2;
                double d21 = dArr19[2] * dT3;
                double[] dArr20 = dArr18[1];
                double d22 = dArr20[0] * dT;
                double d23 = dArr20[1] * dT2;
                double d24 = dArr20[2] * dT3;
                double[] dArr21 = dArr18[2];
                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf((defpackage.a.aR((d19 + d20) + d21) << 16) | i4 | (defpackage.a.aR((d22 + d23) + d24) << 8) | defpackage.a.aR((dArr21[0] * dT) + (dArr21[1] * dT2) + (dArr21[2] * dT3)));
                if (!linkedHashMap4.containsKey(numValueOf3)) {
                    linkedHashMap4.put(numValueOf3, java.lang.Integer.valueOf(i76));
                }
            }
        }
        return linkedHashMap4;
    }

    public static final /* synthetic */ absa p(defpackage.abor aborVar) {
        absa absaVarQ = aborVar.q();
        absaVarQ.getClass();
        return absaVarQ;
    }

    public static final void q(defpackage.zbe zbeVar, defpackage.abor aborVar) {
        zbeVar.getClass();
        aborVar.t();
        absa absaVar = aborVar.b;
        absa absaVar2 = absa.a;
        absaVar.c = zbeVar.he;
        absaVar.b |= 1;
    }

    public static final void r(defpackage.abqv abqvVar, defpackage.abor aborVar) {
        aborVar.t();
        absa absaVar = aborVar.b;
        absa absaVar2 = absa.a;
        absaVar.d = abqvVar;
        absaVar.b |= 2;
    }

    public static final /* synthetic */ abrl s(defpackage.abor aborVar) {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.abrz) aborVar.b).c);
        listUnmodifiableList.getClass();
        return new abrl(listUnmodifiableList);
    }

    public static final /* synthetic */ defpackage.abrz t(defpackage.abor aborVar) {
        defpackage.abox aboxVarQ = aborVar.q();
        aboxVarQ.getClass();
        return (defpackage.abrz) aboxVarQ;
    }

    public static final void u(defpackage.abqv abqvVar, defpackage.abor aborVar) {
        aborVar.t();
        defpackage.abrz abrzVar = (defpackage.abrz) aborVar.b;
        defpackage.abrz abrzVar2 = defpackage.abrz.a;
        abrzVar.d = abqvVar;
        abrzVar.b |= 1;
    }

    public static final void v(defpackage.abqv abqvVar, defpackage.abor aborVar) {
        aborVar.t();
        defpackage.abrz abrzVar = (defpackage.abrz) aborVar.b;
        defpackage.abrz abrzVar2 = defpackage.abrz.a;
        abrzVar.e = abqvVar;
        abrzVar.b |= 2;
    }

    public static /* synthetic */ long w(long j, long j2) {
        boolean z = (j ^ j2) >= 0;
        long j3 = j - j2;
        if (z || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static defpackage.abqv x(j$.time.Instant instant) {
        return defpackage.abrx.c(instant.getEpochSecond(), instant.getNano());
    }

    public static j$.time.Duration y(defpackage.aboh abohVar) {
        defpackage.aboh abohVarD = defpackage.abrv.d(abohVar.b, abohVar.c);
        return j$.time.Duration.ofSeconds(abohVarD.b, abohVarD.c);
    }

    public static j$.time.Instant z(defpackage.abqv abqvVar) {
        defpackage.abqv abqvVarC = defpackage.abrx.c(abqvVar.b, abqvVar.c);
        return j$.time.Instant.ofEpochSecond(abqvVarC.b, abqvVarC.c);
    }
}
