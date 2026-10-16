package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gju {
    public static final defpackage.ypg a = defpackage.ypg.c("com/android/car/libraries/apphost/external/graphics/CachingColorExtractor");
    public final defpackage.kqe b;
    private final j$.util.concurrent.ConcurrentHashMap c;
    private final boolean d;

    public gju(defpackage.kqe kqeVar, j$.util.concurrent.ConcurrentHashMap concurrentHashMap, boolean z) {
        this.b = kqeVar;
        this.c = concurrentHashMap;
        this.d = z;
    }

    protected static final int[] b(android.graphics.Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:239:0x02bf A[EDGE_INSN: B:239:0x02bf->B:77:0x02bf BREAK  A[LOOP:6: B:28:0x0170->B:75:0x02b4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0258  */
    /* JADX WARN: Code duplicated, block: B:56:0x025f  */
    /* JADX WARN: Code duplicated, block: B:57:0x026c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0278  */
    /* JADX WARN: Code duplicated, block: B:61:0x0283  */
    /* JADX WARN: Code duplicated, block: B:63:0x028e  */
    /* JADX WARN: Code duplicated, block: B:66:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:68:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b4 A[LOOP:6: B:28:0x0170->B:75:0x02b4, LOOP_END] */
    public static final int c(android.graphics.Bitmap bitmap) {
        int iIntValue;
        double d;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        double[][] dArr;
        defpackage.woe woeVar;
        int i7;
        int i8;
        int i9;
        int i10;
        java.lang.Boolean bool;
        double[] dArr2;
        int i11;
        double d2;
        int i12;
        double d3;
        acbe acbeVar;
        double dH;
        acbe acbeVar2;
        double dH2;
        int[] iArrB = b(bitmap);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int length = iArrB.length;
        int i13 = 0;
        while (true) {
            iIntValue = 1;
            if (i13 >= length) {
                break;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(iArrB[i13]);
            java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(numValueOf);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(numValueOf, java.lang.Integer.valueOf(iIntValue));
            i13++;
        }
        int[] iArr = new int[35937];
        int[] iArr2 = new int[35937];
        int[] iArr3 = new int[35937];
        int[] iArr4 = new int[35937];
        double[] dArr3 = new double[35937];
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue2 = ((java.lang.Integer) entry.getKey()).intValue();
            int iIntValue3 = ((java.lang.Integer) entry.getValue()).intValue();
            double[][] dArr4 = defpackage.wod.a;
            int i14 = iIntValue2 >> 16;
            int i15 = iIntValue2 >> 8;
            int i16 = iIntValue2 & 255;
            int i17 = i14 & 255;
            int i18 = (i17 >> 3) + 1;
            int i19 = i15 & 255;
            int i20 = (i19 >> 3) + 1;
            int i21 = (i18 << 10) + (i18 << 6) + i18 + (i20 << 5) + i20 + (i16 >> 3) + 1;
            iArr[i21] = iArr[i21] + iIntValue3;
            iArr2[i21] = iArr2[i21] + (i17 * iIntValue3);
            iArr3[i21] = iArr3[i21] + (i19 * iIntValue3);
            iArr4[i21] = iArr4[i21] + (i16 * iIntValue3);
            dArr3[i21] = dArr3[i21] + ((double) (iIntValue3 * ((i17 * i17) + (i19 * i19) + (i16 * i16))));
        }
        int i22 = 1;
        while (true) {
            d = 0.0d;
            if (i22 >= 33) {
                break;
            }
            int[] iArr5 = new int[33];
            int[] iArr6 = new int[33];
            int[] iArr7 = new int[33];
            int[] iArr8 = new int[33];
            double[] dArr5 = new double[33];
            for (int i23 = 1; i23 < 33; i23++) {
                double d4 = 0.0d;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                for (int i28 = 1; i28 < 33; i28++) {
                    int i29 = i23 << 5;
                    int i30 = (i22 << 10) + (i22 << 6) + i22 + i29 + i23 + i28;
                    i24 += iArr[i30];
                    i25 += iArr2[i30];
                    i26 += iArr3[i30];
                    i27 += iArr4[i30];
                    d4 += dArr3[i30];
                    int i31 = iArr5[i28] + i24;
                    iArr5[i28] = i31;
                    int i32 = iArr6[i28] + i25;
                    iArr6[i28] = i32;
                    int i33 = iArr7[i28] + i26;
                    iArr7[i28] = i33;
                    int i34 = iArr8[i28] + i27;
                    iArr8[i28] = i34;
                    double d5 = dArr5[i28] + d4;
                    dArr5[i28] = d5;
                    int i35 = i22 - 1;
                    int i36 = (i35 << 10) + (i35 << 6) + i35 + i29 + i23 + i28;
                    iArr[i30] = iArr[i36] + i31;
                    iArr2[i30] = iArr2[i36] + i32;
                    iArr3[i30] = iArr3[i36] + i33;
                    iArr4[i30] = iArr4[i36] + i34;
                    dArr3[i30] = dArr3[i36] + d5;
                }
            }
            i22++;
        }
        int i37 = 0;
        int i38 = 16;
        acbe[] acbeVarArr = new acbe[16];
        for (int i39 = 0; i39 < 16; i39++) {
            acbeVarArr[i39] = new acbe();
        }
        double[] dArr6 = new double[16];
        acbe acbeVar3 = acbeVarArr[0];
        acbeVar3.b = 32;
        acbeVar3.d = 32;
        acbeVar3.f = 32;
        int i40 = 0;
        int i41 = 1;
        while (true) {
            i = -1;
            if (i41 >= i38) {
                i2 = i38;
                break;
            }
            int i42 = i41;
            acbe acbeVar4 = acbeVarArr[i40];
            acbe acbeVar5 = acbeVarArr[i42];
            int iD = defpackage.wpu.d(acbeVar4, iArr2);
            int iD2 = defpackage.wpu.d(acbeVar4, iArr3);
            int iD3 = defpackage.wpu.d(acbeVar4, iArr4);
            int[] iArr9 = iArr4;
            int iD4 = defpackage.wpu.d(acbeVar4, iArr);
            int[] iArr10 = iArr3;
            i2 = i38;
            acbf acbfVarG = defpackage.wpu.g(acbeVar4, 1, acbeVar4.a + iIntValue, acbeVar4.b, iD, iD2, iD3, iD4, iArr, iArr2, iArr10, iArr9);
            int i43 = iIntValue;
            acbf acbfVarG2 = defpackage.wpu.g(acbeVar4, 2, acbeVar4.c + iIntValue, acbeVar4.d, iD, iD2, iD3, iD4, iArr, iArr2, iArr10, iArr9);
            double[] dArr7 = dArr3;
            acbf acbfVarG3 = defpackage.wpu.g(acbeVar4, 3, acbeVar4.e + 1, acbeVar4.f, iD, iD2, iD3, iD4, iArr, iArr2, iArr10, iArr9);
            double d6 = acbfVarG.b;
            double d7 = acbfVarG2.b;
            double d8 = acbfVarG3.b;
            if (d6 < d7 || d6 < d8) {
                i7 = (d7 < d6 || d7 < d8) ? 3 : 2;
            } else {
                if (acbfVarG.a < 0) {
                    bool = java.lang.Boolean.FALSE;
                } else {
                    i7 = i43;
                }
                if (bool.booleanValue()) {
                    acbeVar = acbeVarArr[i40];
                    if (acbeVar.g > 1) {
                        dArr2 = dArr7;
                        dH = defpackage.wpu.h(acbeVar, iArr, iArr2, iArr10, iArr9, dArr2);
                    } else {
                        dArr2 = dArr7;
                        dH = 0.0d;
                    }
                    dArr6[i40] = dH;
                    acbeVar2 = acbeVarArr[i42];
                    if (acbeVar2.g > 1) {
                        iArr3 = iArr10;
                        iArr4 = iArr9;
                        dH2 = defpackage.wpu.h(acbeVar2, iArr, iArr2, iArr3, iArr4, dArr2);
                    } else {
                        iArr3 = iArr10;
                        iArr4 = iArr9;
                        dH2 = 0.0d;
                    }
                    dArr6[i42] = dH2;
                    i11 = i42;
                } else {
                    iArr3 = iArr10;
                    iArr4 = iArr9;
                    dArr2 = dArr7;
                    dArr6[i40] = 0.0d;
                    i11 = i42 - 1;
                }
                i38 = i11 + 1;
                d2 = dArr6[0];
                i40 = 0;
                for (i12 = 1; i12 <= i11; i12++) {
                    d3 = dArr6[i12];
                    if (d3 > d2) {
                        d2 = d3;
                    }
                    if (d3 > d2) {
                        i40 = i12;
                    }
                }
                if (d2 <= 0.0d) {
                    break;
                }
                i41 = i38;
                dArr3 = dArr2;
                i38 = i2;
                iIntValue = 1;
            }
            acbeVar5.b = acbeVar4.b;
            acbeVar5.d = acbeVar4.d;
            acbeVar5.f = acbeVar4.f;
            int i44 = i7 - 1;
            if (i44 == 0) {
                i8 = acbfVarG.a;
                acbeVar4.b = i8;
                acbeVar5.a = i8;
                i9 = acbeVar4.c;
                acbeVar5.c = i9;
                i10 = acbeVar4.e;
                acbeVar5.e = i10;
            } else if (i44 != i43) {
                i10 = acbfVarG3.a;
                acbeVar4.f = i10;
                i8 = acbeVar4.a;
                acbeVar5.a = i8;
                i9 = acbeVar4.c;
                acbeVar5.c = i9;
                acbeVar5.e = i10;
            } else {
                i9 = acbfVarG2.a;
                acbeVar4.d = i9;
                i8 = acbeVar4.a;
                acbeVar5.a = i8;
                acbeVar5.c = i9;
                i10 = acbeVar4.e;
                acbeVar5.e = i10;
            }
            acbeVar4.g = (acbeVar4.b - acbeVar4.a) * (acbeVar4.d - acbeVar4.c) * (acbeVar4.f - acbeVar4.e);
            acbeVar5.g = (acbeVar5.b - i8) * (acbeVar5.d - i9) * (acbeVar5.f - i10);
            bool = java.lang.Boolean.TRUE;
            if (bool.booleanValue()) {
                acbeVar = acbeVarArr[i40];
                if (acbeVar.g > 1) {
                    dArr2 = dArr7;
                    dH = defpackage.wpu.h(acbeVar, iArr, iArr2, iArr10, iArr9, dArr2);
                } else {
                    dArr2 = dArr7;
                    dH = 0.0d;
                }
                dArr6[i40] = dH;
                acbeVar2 = acbeVarArr[i42];
                if (acbeVar2.g > 1) {
                    iArr3 = iArr10;
                    iArr4 = iArr9;
                    dH2 = defpackage.wpu.h(acbeVar2, iArr, iArr2, iArr3, iArr4, dArr2);
                } else {
                    iArr3 = iArr10;
                    iArr4 = iArr9;
                    dH2 = 0.0d;
                }
                dArr6[i42] = dH2;
                i11 = i42;
            } else {
                iArr3 = iArr10;
                iArr4 = iArr9;
                dArr2 = dArr7;
                dArr6[i40] = 0.0d;
                i11 = i42 - 1;
            }
            i38 = i11 + 1;
            d2 = dArr6[0];
            i40 = 0;
            while (i12 <= i11) {
                d3 = dArr6[i12];
                if (d3 > d2) {
                    d2 = d3;
                }
                if (d3 > d2) {
                    i40 = i12;
                }
            }
            if (d2 <= 0.0d) {
                break;
                break;
            }
            i41 = i38;
            dArr3 = dArr2;
            i38 = i2;
            iIntValue = 1;
        }
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList();
        int i45 = 0;
        while (true) {
            i3 = -16777216;
            i4 = 8;
            if (i45 >= i38) {
                break;
            }
            acbe acbeVar6 = acbeVarArr[i45];
            int iD5 = defpackage.wpu.d(acbeVar6, iArr);
            if (iD5 > 0) {
                arrayList.add(java.lang.Integer.valueOf((-16777216) | (((defpackage.wpu.d(acbeVar6, iArr2) / iD5) & 255) << 16) | (((defpackage.wpu.d(acbeVar6, iArr3) / iD5) & 255) << 8) | ((defpackage.wpu.d(acbeVar6, iArr4) / iD5) & 255)));
            }
            i45++;
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.lang.Integer num2 : arrayList) {
            num2.intValue();
            linkedHashMap2.put(num2, 0);
        }
        java.util.Set setKeySet = linkedHashMap2.keySet();
        int size = setKeySet.size();
        int[] iArr11 = new int[size];
        java.util.Iterator it = setKeySet.iterator();
        int i46 = 0;
        while (it.hasNext()) {
            iArr11[i46] = ((java.lang.Integer) it.next()).intValue();
            i46++;
        }
        java.util.Random random = new java.util.Random(272008L);
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        int length2 = iArrB.length;
        double[][] dArr8 = new double[length2][];
        int[] iArr12 = new int[length2];
        int i47 = 0;
        for (int i48 : iArrB) {
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(i48);
            java.lang.Integer num3 = (java.lang.Integer) linkedHashMap3.get(numValueOf2);
            if (num3 == null) {
                dArr8[i47] = defpackage.wpu.l(i48);
                iArr12[i47] = i48;
                linkedHashMap3.put(numValueOf2, 1);
                i47++;
            } else {
                linkedHashMap3.put(numValueOf2, java.lang.Integer.valueOf(num3.intValue() + 1));
            }
        }
        int[] iArr13 = new int[i47];
        for (int i49 = 0; i49 < i47; i49++) {
            iArr13[i49] = ((java.lang.Integer) linkedHashMap3.get(java.lang.Integer.valueOf(iArr12[i49]))).intValue();
        }
        int iMin = java.lang.Math.min(i2, i47);
        if (size != 0) {
            iMin = java.lang.Math.min(iMin, size);
        }
        double[][] dArr9 = new double[iMin][];
        int i50 = 0;
        for (int i51 = 0; i51 < size; i51++) {
            dArr9[i51] = defpackage.wpu.l(iArr11[i51]);
            i50++;
        }
        int i52 = iMin - i50;
        if (i52 > 0) {
            for (int i53 = 0; i53 < i52; i53++) {
            }
        }
        int[] iArr14 = new int[i47];
        for (int i54 = 0; i54 < i47; i54++) {
            iArr14[i54] = random.nextInt(iMin);
        }
        int[][] iArr15 = new int[iMin][];
        for (int i55 = 0; i55 < iMin; i55++) {
            iArr15[i55] = new int[iMin];
        }
        acbd[][] acbdVarArr = new acbd[iMin][];
        for (int i56 = 0; i56 < iMin; i56++) {
            acbdVarArr[i56] = new acbd[iMin];
            for (int i57 = 0; i57 < iMin; i57++) {
                acbdVarArr[i56][i57] = new acbd(1);
            }
        }
        int[] iArr16 = new int[iMin];
        int i58 = 0;
        while (true) {
            if (i58 >= 10) {
                i5 = i3;
                i6 = i4;
                dArr = dArr9;
                break;
            }
            int i59 = i37;
            while (i59 < iMin) {
                int i60 = i59 + 1;
                int i61 = i60;
                while (i61 < iMin) {
                    int i62 = i3;
                    int i63 = i4;
                    double dK = defpackage.wpu.k(dArr9[i59], dArr9[i61]);
                    acbd acbdVar = acbdVarArr[i61][i59];
                    acbdVar.b = dK;
                    acbdVar.a = i59;
                    acbd acbdVar2 = acbdVarArr[i59][i61];
                    acbdVar2.b = dK;
                    acbdVar2.a = i61;
                    i61++;
                    i3 = i62;
                    i4 = i63;
                    dArr9 = dArr9;
                }
                int i64 = i3;
                int i65 = i4;
                double[][] dArr10 = dArr9;
                java.util.Arrays.sort(acbdVarArr[i59]);
                for (int i66 = i37; i66 < iMin; i66++) {
                    iArr15[i59][i66] = acbdVarArr[i59][i66].a;
                }
                i59 = i60;
                i3 = i64;
                i4 = i65;
                dArr9 = dArr10;
            }
            i5 = i3;
            i6 = i4;
            dArr = dArr9;
            int i67 = i37;
            int i68 = i67;
            while (i67 < i47) {
                double[] dArr11 = dArr8[i67];
                int i69 = iArr14[i67];
                double dK2 = defpackage.wpu.k(dArr11, dArr[i69]);
                int i70 = i37;
                int[] iArr17 = iArr13;
                double d9 = dK2;
                int i71 = i;
                while (i70 < iMin) {
                    int[][] iArr18 = iArr15;
                    int[] iArr19 = iArr14;
                    if (acbdVarArr[i69][i70].b < 4.0d * dK2) {
                        double dK3 = defpackage.wpu.k(dArr11, dArr[i70]);
                        if (dK3 < d9) {
                            d9 = dK3;
                            i71 = i70;
                        }
                    }
                    i70++;
                    iArr14 = iArr19;
                    iArr15 = iArr18;
                }
                int[][] iArr20 = iArr15;
                int[] iArr21 = iArr14;
                if (i71 != i && java.lang.Math.abs(java.lang.Math.sqrt(d9) - java.lang.Math.sqrt(dK2)) > 3.0d) {
                    iArr21[i67] = i71;
                    i68++;
                }
                i67++;
                iArr13 = iArr17;
                iArr14 = iArr21;
                iArr15 = iArr20;
                i = -1;
            }
            int[] iArr22 = iArr13;
            int[][] iArr23 = iArr15;
            int[] iArr24 = iArr14;
            if (i68 == 0) {
                if (i58 != 0) {
                    break;
                }
                i58 = i37;
            }
            double[] dArr12 = new double[iMin];
            double[] dArr13 = new double[iMin];
            double[] dArr14 = new double[iMin];
            int i72 = i37;
            java.util.Arrays.fill(iArr16, i72);
            int i73 = i72;
            while (i73 < i47) {
                int i74 = iArr24[i73];
                double[] dArr15 = dArr8[i73];
                int i75 = iArr22[i73];
                iArr16[i74] = iArr16[i74] + i75;
                double d10 = dArr12[i74];
                double d11 = dArr15[i72];
                double[] dArr16 = dArr12;
                double[] dArr17 = dArr13;
                double d12 = i75;
                dArr16[i74] = d10 + (d11 * d12);
                dArr17[i74] = dArr17[i74] + (dArr15[1] * d12);
                dArr14[i74] = dArr14[i74] + (dArr15[2] * d12);
                i73++;
                dArr12 = dArr16;
                dArr13 = dArr17;
                i72 = 0;
            }
            double[] dArr18 = dArr12;
            double[] dArr19 = dArr13;
            for (int i76 = 0; i76 < iMin; i76++) {
                int i77 = iArr16[i76];
                if (i77 == 0) {
                    dArr[i76] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d13 = i77;
                    double d14 = dArr18[i76] / d13;
                    double d15 = dArr19[i76] / d13;
                    double d16 = dArr14[i76] / d13;
                    double[] dArr20 = dArr[i76];
                    dArr20[0] = d14;
                    dArr20[1] = d15;
                    dArr20[2] = d16;
                }
            }
            i58++;
            i3 = i5;
            i4 = i6;
            dArr9 = dArr;
            iArr13 = iArr22;
            iArr14 = iArr24;
            iArr15 = iArr23;
            i37 = 0;
            i = -1;
        }
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        for (int i78 = 0; i78 < iMin; i78++) {
            int i79 = iArr16[i78];
            if (i79 != 0) {
                double[] dArr21 = dArr[i78];
                double d17 = dArr21[0];
                double d18 = dArr21[1];
                double d19 = dArr21[2] / 200.0d;
                double[] dArr22 = defpackage.wod.c;
                double d20 = (d17 + 16.0d) / 116.0d;
                double dT = defpackage.a.t((d18 / 500.0d) + d20) * dArr22[0];
                double dT2 = defpackage.a.t(d20) * dArr22[1];
                double dT3 = defpackage.a.t(d20 - d19) * dArr22[2];
                double[][] dArr23 = defpackage.wod.b;
                double[] dArr24 = dArr23[0];
                double d21 = dArr24[0] * dT;
                double d22 = dArr24[1] * dT2;
                double d23 = dArr24[2] * dT3;
                double[] dArr25 = dArr23[1];
                double d24 = dArr25[0] * dT;
                double d25 = dArr25[1] * dT2;
                double d26 = dArr25[2] * dT3;
                double[] dArr26 = dArr23[2];
                java.lang.Integer numValueOf3 = java.lang.Integer.valueOf((defpackage.a.aR((d21 + d22) + d23) << 16) | i5 | (defpackage.a.aR((d24 + d25) + d26) << 8) | defpackage.a.aR((dArr26[0] * dT) + (dArr26[1] * dT2) + (dArr26[2] * dT3)));
                if (!linkedHashMap4.containsKey(numValueOf3)) {
                    linkedHashMap4.put(numValueOf3, java.lang.Integer.valueOf(i79));
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int[] iArr25 = new int[360];
        for (java.util.Map.Entry entry2 : linkedHashMap4.entrySet()) {
            defpackage.woe woeVar2 = new defpackage.woe(((java.lang.Integer) entry2.getKey()).intValue());
            arrayList2.add(woeVar2);
            int iFloor = (int) java.lang.Math.floor(woeVar2.a);
            int iIntValue4 = ((java.lang.Integer) entry2.getValue()).intValue();
            iArr25[iFloor] = iArr25[iFloor] + iIntValue4;
            d += (double) iIntValue4;
        }
        double[] dArr27 = new double[360];
        for (int i80 = 0; i80 < 360; i80++) {
            double d27 = ((double) iArr25[i80]) / d;
            for (int i81 = i80 - 14; i81 < i80 + 16; i81++) {
                int iM = defpackage.wpu.m(i81);
                dArr27[iM] = dArr27[iM] + d27;
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int size2 = arrayList2.size();
        for (int i82 = 0; i82 < size2; i82++) {
            defpackage.woe woeVar3 = (defpackage.woe) arrayList2.get(i82);
            double d28 = dArr27[defpackage.wpu.m((int) java.lang.Math.round(woeVar3.a))];
            double d29 = woeVar3.b;
            if (d29 >= 5.0d && d28 > 0.01d) {
                arrayList3.add(new acbg(woeVar3, (d28 * 100.0d * 0.7d) + ((d29 - 48.0d) * (d29 < 48.0d ? 0.1d : 0.3d))));
            }
        }
        java.util.Collections.sort(arrayList3, new cjd(17));
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (int i83 = 90; i83 >= 15; i83--) {
            arrayList4.clear();
            int size3 = arrayList3.size();
            int i84 = 0;
            while (i84 < size3) {
                java.lang.Object obj = ((acbg) arrayList3.get(i84)).b;
                int size4 = arrayList4.size();
                int i85 = 0;
                do {
                    if (i85 >= size4) {
                        arrayList4.add(obj);
                        break;
                    }
                    woeVar = (defpackage.woe) arrayList4.get(i85);
                    i85++;
                } while (180.0d - java.lang.Math.abs(java.lang.Math.abs(((defpackage.woe) obj).a - woeVar.a) - 180.0d) >= i83);
                i84++;
                if (arrayList4.size() > 0) {
                    break;
                }
            }
            if (arrayList4.size() > 0) {
                break;
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        if (arrayList4.isEmpty()) {
            arrayList5.add(-1);
        } else {
            int size5 = arrayList4.size();
            for (int i86 = 0; i86 < size5; i86++) {
                arrayList5.add(java.lang.Integer.valueOf(((defpackage.woe) arrayList4.get(i86)).c));
            }
        }
        java.lang.Integer num4 = (java.lang.Integer) arrayList5.get(0);
        defpackage.ype ypeVar = (defpackage.ype) a.e().o(defpackage.yqn.a, "CarApp.H").ai(53);
        num4.getClass();
        ypeVar.y("Chose #%s", afzh.G(ahxs.a(num4.intValue()), i6));
        return num4.intValue();
    }

    public final int a(android.graphics.Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            ((defpackage.ype) a.h().o(defpackage.yqn.a, "CarApp.H").ai(56)).u("Bitmap was recycled while extracting the color.");
            return 0;
        }
        if (bitmap.getWidth() > 128 && bitmap.getHeight() > 128) {
            bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, 128, 128, false);
            bitmap.getClass();
        }
        if (!this.d) {
            return c(bitmap);
        }
        defpackage.ypg ypgVar = a;
        defpackage.ypu ypuVarE = ypgVar.e();
        defpackage.ypx ypxVar = defpackage.yqn.a;
        ((defpackage.ype) ypuVarE.o(ypxVar, "CarApp.H").ai(54)).u("Attempting to get computed color");
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = this.c;
        int[] iArrB = b(bitmap);
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(iArrB.length * 4);
        byteBufferAllocate.getClass();
        for (int i : iArrB) {
            byteBufferAllocate.putInt(i);
        }
        byteBufferAllocate.position(0);
        java.lang.Object objComputeIfAbsent = j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(concurrentHashMap, java.lang.Integer.valueOf(byteBufferAllocate.hashCode()), new defpackage.gjt(new defpackage.fzs(bitmap, 17), 0));
        objComputeIfAbsent.getClass();
        int iIntValue = ((java.lang.Number) objComputeIfAbsent).intValue();
        ((defpackage.ype) ypgVar.e().o(ypxVar, "CarApp.H").ai(55)).y("Computed color #%s", afzh.G(ahxs.a(iIntValue), 8));
        return iIntValue;
    }
}
