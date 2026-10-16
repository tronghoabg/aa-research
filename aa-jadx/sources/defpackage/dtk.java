package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dtk {
    static android.app.Notification.Style a() {
        return new android.app.Notification.DecoratedCustomViewStyle();
    }

    public static android.graphics.Path b(java.lang.String str) {
        android.graphics.Path path = new android.graphics.Path();
        try {
            c(d(str), path);
            return path;
        } catch (java.lang.RuntimeException e) {
            throw new java.lang.RuntimeException("Error in parsing ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(defpackage.dvm[] dvmVarArr, android.graphics.Path path) {
        int i;
        float[] fArr;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        defpackage.dvm[] dvmVarArr2 = dvmVarArr;
        float[] fArr2 = new float[6];
        int length = dvmVarArr2.length;
        int i3 = 0;
        int i4 = 0;
        char c = 'm';
        while (i4 < length) {
            defpackage.dvm dvmVar = dvmVarArr2[i4];
            char c2 = dvmVar.a;
            float f10 = fArr2[i3];
            float f11 = fArr2[1];
            float f12 = fArr2[2];
            float f13 = fArr2[3];
            float f14 = fArr2[4];
            int i5 = i3;
            float f15 = fArr2[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f14, f15);
                    f10 = f14;
                    f12 = f10;
                    f11 = f15;
                    f13 = f11;
                    i = 2;
                    break;
            }
            float f16 = f14;
            float f17 = f15;
            float f18 = f10;
            float f19 = f11;
            int i6 = i5;
            for (float[] fArr3 = dvmVar.b; i6 < fArr3.length; fArr3 = fArr) {
                if (c2 == 'A') {
                    fArr = fArr3;
                    i2 = i6;
                    dvmVar = dvmVar;
                    float f20 = f18;
                    float f21 = f19;
                    i4 = i4;
                    c2 = c2;
                    int i7 = i2 + 6;
                    int i8 = i2 + 5;
                    defpackage.dvm.a(path, f20, f21, fArr[i8], fArr[i7], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : i5, fArr[i2 + 4] != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : i5);
                    f12 = fArr[i8];
                    f = fArr[i7];
                    f13 = f;
                    f2 = f12;
                } else if (c2 == 'C') {
                    fArr = fArr3;
                    i2 = i6;
                    i4 = i4;
                    dvmVar = dvmVar;
                    c2 = c2;
                    int i9 = i2 + 5;
                    int i10 = i2 + 4;
                    int i11 = i2 + 3;
                    int i12 = i2 + 2;
                    path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i12], fArr[i11], fArr[i10], fArr[i9]);
                    float f22 = fArr[i10];
                    float f23 = fArr[i9];
                    f12 = fArr[i12];
                    f13 = fArr[i11];
                    f = f23;
                    f2 = f22;
                } else if (c2 == 'H') {
                    fArr = fArr3;
                    i2 = i6;
                    dvmVar = dvmVar;
                    c2 = c2;
                    f = f19;
                    i4 = i4;
                    path.lineTo(fArr[i2], f);
                    f2 = fArr[i2];
                } else if (c2 == 'Q') {
                    fArr = fArr3;
                    i2 = i6;
                    i4 = i4;
                    dvmVar = dvmVar;
                    c2 = c2;
                    int i13 = i2 + 3;
                    int i14 = i2 + 2;
                    int i15 = i2 + 1;
                    path.quadTo(fArr[i2], fArr[i15], fArr[i14], fArr[i13]);
                    float f24 = fArr[i2];
                    float f25 = fArr[i15];
                    f2 = fArr[i14];
                    f13 = f25;
                    f = fArr[i13];
                    f12 = f24;
                } else if (c2 == 'V') {
                    fArr = fArr3;
                    i2 = i6;
                    i4 = i4;
                    dvmVar = dvmVar;
                    f2 = f18;
                    c2 = c2;
                    path.lineTo(f2, fArr[i2]);
                    f = fArr[i2];
                } else if (c2 != 'a') {
                    if (c2 == 'c') {
                        fArr = fArr3;
                        i2 = i6;
                        int i16 = i2 + 5;
                        int i17 = i2 + 4;
                        int i18 = i2 + 3;
                        int i19 = i2 + 2;
                        path.rCubicTo(fArr[i2], fArr[i2 + 1], fArr[i19], fArr[i18], fArr[i17], fArr[i16]);
                        float f26 = fArr[i19] + f18;
                        float f27 = fArr[i18] + f19;
                        f18 += fArr[i17];
                        f19 += fArr[i16];
                        f12 = f26;
                        f13 = f27;
                    } else if (c2 == 'h') {
                        fArr = fArr3;
                        i2 = i6;
                        path.rLineTo(fArr[i2], com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
                        f18 += fArr[i2];
                    } else if (c2 != 'q') {
                        if (c2 != 'v') {
                            if (c2 != 'L') {
                                if (c2 == 'M') {
                                    fArr = fArr3;
                                    i2 = i6;
                                    f4 = fArr[i2];
                                    f5 = fArr[i2 + 1];
                                    if (i2 > 0) {
                                        path.lineTo(f4, f5);
                                    } else {
                                        path.moveTo(f4, f5);
                                        f16 = f4;
                                        f = f5;
                                        f17 = f;
                                        f2 = f16;
                                    }
                                } else if (c2 != 'S') {
                                    if (c2 == 'T') {
                                        fArr = fArr3;
                                        i2 = i6;
                                        int i20 = i2 + 1;
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f19 = (f19 + f19) - f13;
                                            f18 = (f18 + f18) - f12;
                                        }
                                        path.quadTo(f18, f19, fArr[i2], fArr[i20]);
                                        float f28 = fArr[i2];
                                        f = fArr[i20];
                                        f12 = f18;
                                        f13 = f19;
                                        f2 = f28;
                                        dvmVar = dvmVar;
                                    } else if (c2 == 'l') {
                                        fArr = fArr3;
                                        i2 = i6;
                                        int i21 = i2 + 1;
                                        path.rLineTo(fArr[i2], fArr[i21]);
                                        f18 += fArr[i2];
                                        f3 = fArr[i21];
                                    } else if (c2 == 'm') {
                                        fArr = fArr3;
                                        i2 = i6;
                                        float f29 = fArr[i2];
                                        f18 += f29;
                                        float f30 = fArr[i2 + 1];
                                        f19 += f30;
                                        if (i2 > 0) {
                                            path.rLineTo(f29, f30);
                                        } else {
                                            path.rMoveTo(f29, f30);
                                            f2 = f18;
                                            f16 = f2;
                                            f = f19;
                                            f17 = f;
                                        }
                                    } else if (c2 != 's') {
                                        if (c2 == 't') {
                                            int i22 = i6 + 1;
                                            if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                                f8 = f19 - f13;
                                                f9 = f18 - f12;
                                            } else {
                                                f8 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                                                f9 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                                            }
                                            path.rQuadTo(f9, f8, fArr3[i6], fArr3[i22]);
                                            float f31 = f9 + f18;
                                            float f32 = f8 + f19;
                                            f18 += fArr3[i6];
                                            f19 += fArr3[i22];
                                            f13 = f32;
                                            f12 = f31;
                                        }
                                        fArr = fArr3;
                                        i2 = i6;
                                        f2 = f18;
                                        f = f19;
                                    } else {
                                        int i23 = i6 + 3;
                                        int i24 = i6 + 2;
                                        int i25 = i6 + 1;
                                        if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                            f6 = f19 - f13;
                                            f7 = f18 - f12;
                                        } else {
                                            f7 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                                            f6 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                                        }
                                        int i26 = i6;
                                        fArr = fArr3;
                                        i2 = i26;
                                        path.rCubicTo(f7, f6, fArr3[i26], fArr3[i25], fArr3[i24], fArr3[i23]);
                                        float f33 = fArr[i2] + f18;
                                        float f34 = fArr[i25] + f19;
                                        f18 += fArr[i24];
                                        f19 += fArr[i23];
                                        f12 = f33;
                                        f13 = f34;
                                    }
                                    c2 = c2;
                                } else {
                                    fArr = fArr3;
                                    i2 = i6;
                                    int i27 = i2 + 3;
                                    int i28 = i2 + 2;
                                    int i29 = i2 + 1;
                                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                        f19 = (f19 + f19) - f13;
                                        f18 = (f18 + f18) - f12;
                                    }
                                    path.cubicTo(f18, f19, fArr[i2], fArr[i29], fArr[i28], fArr[i27]);
                                    f12 = fArr[i2];
                                    f13 = fArr[i29];
                                    f2 = fArr[i28];
                                    f = fArr[i27];
                                }
                                dvmVar = dvmVar;
                            } else {
                                fArr = fArr3;
                                i2 = i6;
                                int i30 = i2 + 1;
                                path.lineTo(fArr[i2], fArr[i30]);
                                f4 = fArr[i2];
                                f5 = fArr[i30];
                            }
                            f = f5;
                            f2 = f4;
                            dvmVar = dvmVar;
                        } else {
                            fArr = fArr3;
                            i2 = i6;
                            path.rLineTo(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, fArr[i2]);
                            f3 = fArr[i2];
                        }
                        f19 += f3;
                    } else {
                        fArr = fArr3;
                        i2 = i6;
                        int i31 = i2 + 3;
                        int i32 = i2 + 2;
                        int i33 = i2 + 1;
                        path.rQuadTo(fArr[i2], fArr[i33], fArr[i32], fArr[i31]);
                        float f35 = fArr[i2] + f18;
                        float f36 = fArr[i33] + f19;
                        f18 += fArr[i32];
                        f19 += fArr[i31];
                        f13 = f36;
                        f12 = f35;
                    }
                    f2 = f18;
                    f = f19;
                    c2 = c2;
                } else {
                    fArr = fArr3;
                    i2 = i6;
                    int i34 = i2 + 6;
                    int i35 = i2 + 5;
                    int i36 = i2 + 4;
                    float f37 = fArr[i35] + f18;
                    float f38 = fArr[i34] + f19;
                    dvmVar = dvmVar;
                    defpackage.dvm.a(path, f18, f19, f37, f38, fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : i5, fArr[i36] != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : i5);
                    f2 = f18 + fArr[i35];
                    f = f19 + fArr[i34];
                    f12 = f2;
                    f13 = f;
                }
                i6 = i2 + i;
                path = path;
                dvmVar = dvmVar;
                c2 = c2;
                i4 = i4;
                f18 = f2;
                f19 = f;
                c = c2;
            }
            fArr2[i5] = f18;
            fArr2[1] = f19;
            fArr2[2] = f12;
            fArr2[3] = f13;
            fArr2[4] = f16;
            fArr2[5] = f17;
            c = dvmVar.a;
            i4++;
            dvmVarArr2 = dvmVarArr;
            i3 = i5;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[PHI: r13
  0x0099: PHI (r13v6 int) = (r13v1 int), (r13v1 int), (r13v1 int), (r13v5 int) binds: [B:38:0x0096, B:44:0x00a5, B:45:0x00a7, B:41:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8 A[Catch: NumberFormatException -> 0x00d4, TryCatch #0 {NumberFormatException -> 0x00d4, blocks: (B:29:0x0070, B:32:0x0084, B:34:0x008a, B:38:0x0096, B:51:0x00b1, B:53:0x00b7, B:56:0x00c8, B:58:0x00cd), top: B:67:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    public static defpackage.dvm[] d(java.lang.String str) {
        java.lang.String strTrim;
        int i;
        float[] fArrF;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i2 = 1;
        int i3 = 0;
        int i4 = 1;
        int i5 = 0;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if (((cCharAt - 'A') * (cCharAt - 'Z') > 0 && (cCharAt - 'a') * (cCharAt - 'z') > 0) || cCharAt == 'e' || cCharAt == 'E') {
                    i4++;
                } else {
                    strTrim = str.substring(i5, i4).trim();
                    if (strTrim.isEmpty()) {
                        i = i3;
                    } else {
                        if (strTrim.charAt(i3) != 'z' || strTrim.charAt(i3) == 'Z') {
                            i = i3;
                            fArrF = new float[i];
                        } else {
                            try {
                                float[] fArr = new float[strTrim.length()];
                                int length = strTrim.length();
                                int i6 = i2;
                                int i7 = i3;
                                while (i6 < length) {
                                    int i8 = i3;
                                    int i9 = i8;
                                    int i10 = i9;
                                    int i11 = i10;
                                    for (int i12 = i6; i12 < strTrim.length(); i12++) {
                                        char cCharAt2 = strTrim.charAt(i12);
                                        if (cCharAt2 == ' ') {
                                            i9 = 0;
                                            i10 = 1;
                                        } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                            switch (cCharAt2) {
                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                                                    i9 = 0;
                                                    i10 = 1;
                                                    break;
                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                                                    if (i12 == i6 || i9 != 0) {
                                                        i9 = 0;
                                                    } else {
                                                        i9 = 0;
                                                        i10 = 1;
                                                        i11 = 1;
                                                    }
                                                    break;
                                                case androidx.car.app.navigation.model.Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                                                    if (i8 == 0) {
                                                        i8 = 1;
                                                        i9 = 0;
                                                    } else {
                                                        i8 = 1;
                                                        i9 = 0;
                                                        i10 = 1;
                                                        i11 = 1;
                                                    }
                                                    break;
                                                default:
                                                    i9 = 0;
                                                    break;
                                            }
                                        } else {
                                            i9 = 1;
                                        }
                                        if (i10 != 0) {
                                            if (i6 < i12) {
                                                fArr[i7] = java.lang.Float.parseFloat(strTrim.substring(i6, i12));
                                                i7++;
                                            }
                                            if (i11 != 0) {
                                                i6 = i12;
                                            } else {
                                                i6 = i12 + 1;
                                            }
                                            i3 = 0;
                                        }
                                    }
                                    if (i6 < i12) {
                                        fArr[i7] = java.lang.Float.parseFloat(strTrim.substring(i6, i12));
                                        i7++;
                                    }
                                    if (i11 != 0) {
                                        i6 = i12;
                                    } else {
                                        i6 = i12 + 1;
                                    }
                                    i3 = 0;
                                }
                                fArrF = f(fArr, i7);
                                i = 0;
                            } catch (java.lang.NumberFormatException e) {
                                throw new java.lang.RuntimeException(defpackage.a.bp(strTrim, "error in parsing \"", "\""), e);
                            }
                        }
                        i(arrayList, strTrim.charAt(i), fArrF);
                    }
                    i5 = i4;
                    i4++;
                    i3 = i;
                    i2 = 1;
                }
            }
            strTrim = str.substring(i5, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i3) != 'z') {
                    i = i3;
                    fArrF = new float[i];
                } else {
                    i = i3;
                    fArrF = new float[i];
                }
                i(arrayList, strTrim.charAt(i), fArrF);
            } else {
                i = i3;
            }
            i5 = i4;
            i4++;
            i3 = i;
            i2 = 1;
        }
        if (i4 - i5 == i2 && i5 < str.length()) {
            i(arrayList, str.charAt(i5), new float[i3]);
        }
        return (defpackage.dvm[]) arrayList.toArray(new defpackage.dvm[i3]);
    }

    public static defpackage.dvm[] e(defpackage.dvm[] dvmVarArr) {
        defpackage.dvm[] dvmVarArr2 = new defpackage.dvm[dvmVarArr.length];
        for (int i = 0; i < dvmVarArr.length; i++) {
            dvmVarArr2[i] = new defpackage.dvm(dvmVarArr[i]);
        }
        return dvmVarArr2;
    }

    public static float[] f(float[] fArr, int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        int iMin = java.lang.Math.min(i, fArr.length);
        float[] fArr2 = new float[i];
        java.lang.System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static /* synthetic */ java.nio.channels.FileChannel h(java.io.FileOutputStream fileOutputStream) {
        return j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel());
    }

    private static void i(java.util.ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new defpackage.dvm(c, fArr));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r1 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        r11.a = r12;
        r11.b = null;
        r11.c = r3;
        r11.e = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (defpackage.aipw.c(r3, r11) == r13) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007b, code lost:
    
        r12 = r12;
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0077 -> B:26:0x0079). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.io.FileOutputStream r12, defpackage.afdk r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.egx
            if (r0 == 0) goto L13
            r0 = r13
            egx r0 = (defpackage.egx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            egx r0 = new egx
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r11 = r0.d
            afdr r13 = defpackage.afdr.a
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            long r3 = r0.c
            java.lang.Object r12 = r0.b
            java.lang.Object r12 = r0.a
            defpackage.afga.cz(r11)
            r11 = r0
            goto L79
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            defpackage.afga.cz(r11)
            r3 = 10
            r11 = r0
        L3c:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L7d
            r0 = r12
            java.io.FileOutputStream r0 = (java.io.FileOutputStream) r0     // Catch: java.io.IOException -> L5a
            java.nio.channels.FileChannel r5 = h(r0)     // Catch: java.io.IOException -> L5a
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L5a
            r0.getClass()     // Catch: java.io.IOException -> L5a
            return r0
        L5a:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L7c
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = defpackage.afzh.u(r1, r5, r6)
            if (r1 != r2) goto L7c
            r11.a = r12
            r0 = 0
            r11.b = r0
            r11.c = r3
            r11.e = r2
            java.lang.Object r0 = defpackage.aipw.c(r3, r11)
            if (r0 == r13) goto L7b
        L79:
            long r3 = r3 + r3
            goto L3c
        L7b:
            return r13
        L7c:
            throw r0
        L7d:
            java.io.FileOutputStream r12 = (java.io.FileOutputStream) r12
            java.nio.channels.FileChannel r0 = h(r12)
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            r1 = 0
            java.nio.channels.FileLock r11 = r0.lock(r1, r3, r5)
            r11.getClass()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dtk.g(java.io.FileOutputStream, afdk):java.lang.Object");
    }
}
