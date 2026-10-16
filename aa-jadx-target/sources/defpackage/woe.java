package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class woe {
    public final double a;
    public final double b;
    public final int c;

    public woe(int i) {
        this.c = i;
        int i2 = defpackage.woc.b;
        defpackage.woh wohVar = defpackage.woh.a;
        double[][] dArr = defpackage.wod.a;
        int i3 = (i >> 16) & 255;
        double dU = defpackage.a.u(i3);
        int i4 = (i >> 8) & 255;
        double dU2 = defpackage.a.u(i4);
        int i5 = i & 255;
        double dU3 = defpackage.a.u(i5);
        double[][] dArr2 = defpackage.woc.a;
        double[] dArr3 = dArr2[0];
        double d = (0.41233895d * dU) + (0.35762064d * dU2) + (0.18051042d * dU3);
        double d2 = dArr3[0] * d;
        double d3 = (0.2126d * dU) + (0.7152d * dU2) + (0.0722d * dU3);
        double d4 = dArr3[1] * d3;
        double d5 = (dU * 0.01932141d) + (dU2 * 0.11916382d) + (dU3 * 0.95034478d);
        double d6 = dArr3[2] * d5;
        double[] dArr4 = dArr2[1];
        double d7 = dArr4[0] * d;
        double d8 = dArr4[1] * d3;
        double d9 = dArr4[2] * d5;
        double[] dArr5 = dArr2[2];
        double d10 = d * dArr5[0];
        double d11 = d3 * dArr5[1];
        double d12 = d5 * dArr5[2];
        double[] dArr6 = wohVar.g;
        double d13 = dArr6[0] * (d2 + d4 + d6);
        double d14 = dArr6[1] * (d7 + d8 + d9);
        double d15 = dArr6[2] * (d10 + d11 + d12);
        double dPow = java.lang.Math.pow((wohVar.h * java.lang.Math.abs(d13)) / 100.0d, 0.42d);
        double dPow2 = java.lang.Math.pow((wohVar.h * java.lang.Math.abs(d14)) / 100.0d, 0.42d);
        double dPow3 = java.lang.Math.pow((wohVar.h * java.lang.Math.abs(d15)) / 100.0d, 0.42d);
        double dSignum = ((java.lang.Math.signum(d13) * 400.0d) * dPow) / (dPow + 27.13d);
        double dSignum2 = ((java.lang.Math.signum(d14) * 400.0d) * dPow2) / (dPow2 + 27.13d);
        double dSignum3 = ((java.lang.Math.signum(d15) * 400.0d) * dPow3) / (dPow3 + 27.13d);
        double d16 = (((dSignum * 11.0d) + ((-12.0d) * dSignum2)) + dSignum3) / 11.0d;
        double d17 = ((dSignum + dSignum2) - (dSignum3 + dSignum3)) / 9.0d;
        double degrees = java.lang.Math.toDegrees(java.lang.Math.atan2(d17, d16));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        } else if (degrees >= 360.0d) {
            degrees -= 360.0d;
        }
        double d18 = dSignum2 * 20.0d;
        double d19 = (((((40.0d * dSignum) + d18) + dSignum3) / 20.0d) * wohVar.c) / wohVar.b;
        double d20 = wohVar.e;
        double dPow4 = java.lang.Math.pow(d19, wohVar.j * 0.69d) * 100.0d;
        double d21 = wohVar.e;
        double d22 = dPow4 / 100.0d;
        double d23 = wohVar.b;
        double d24 = wohVar.i;
        double dPow5 = java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, wohVar.f), 0.73d) * java.lang.Math.pow((((((java.lang.Math.cos(java.lang.Math.toRadians(degrees < 20.14d ? degrees + 360.0d : degrees) + 2.0d) + 3.8d) * 0.25d) * 3846.153846153846d) * wohVar.d) * java.lang.Math.hypot(d16, d17)) / (((((dSignum * 20.0d) + d18) + (21.0d * dSignum3)) / 20.0d) + 0.305d), 0.9d) * java.lang.Math.sqrt(d22);
        double d25 = wohVar.i;
        double d26 = wohVar.e;
        double d27 = wohVar.b;
        this.a = degrees;
        this.b = dPow5;
        defpackage.a.s(defpackage.a.r(new double[]{defpackage.a.u(i3), defpackage.a.u(i4), defpackage.a.u(i5)}, defpackage.wod.a)[1] / 100.0d);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:102:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:103:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:111:0x033f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0342  */
    /* JADX WARN: Code duplicated, block: B:115:0x0345  */
    /* JADX WARN: Code duplicated, block: B:117:0x0348  */
    /* JADX WARN: Code duplicated, block: B:119:0x034c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0353  */
    /* JADX WARN: Code duplicated, block: B:145:0x034d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:55:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:59:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:62:0x0202  */
    /* JADX WARN: Code duplicated, block: B:64:0x0212  */
    /* JADX WARN: Code duplicated, block: B:65:0x021e  */
    /* JADX WARN: Code duplicated, block: B:67:0x022b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x022d  */
    /* JADX WARN: Code duplicated, block: B:70:0x023e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0249  */
    /* JADX WARN: Code duplicated, block: B:72:0x0254  */
    /* JADX WARN: Code duplicated, block: B:74:0x0265  */
    /* JADX WARN: Code duplicated, block: B:75:0x0270  */
    /* JADX WARN: Code duplicated, block: B:78:0x0281  */
    /* JADX WARN: Code duplicated, block: B:79:0x0284  */
    /* JADX WARN: Code duplicated, block: B:81:0x028a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0293  */
    /* JADX WARN: Code duplicated, block: B:85:0x0297  */
    /* JADX WARN: Code duplicated, block: B:87:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:88:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:92:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d8  */
    public static defpackage.woe a(double d, double d2, double d3) {
        int iA;
        int i;
        double[] dArr;
        double d4;
        double[] dArr2;
        boolean z;
        int i2;
        double d5;
        double d6;
        int i3;
        double[] dArr3;
        double dA;
        double[] dArr4;
        int i4;
        double d7;
        double d8;
        int iB;
        int iC;
        double d9;
        int i5;
        int iFloor;
        double[] dArrX;
        double dA2;
        boolean zG;
        double d10;
        double d11;
        double d12;
        int i6;
        double d13;
        double d14;
        double d15;
        double d16;
        double[] dArr5;
        double d17;
        double[] dArr6;
        double dA3;
        double d18;
        double d19;
        double d20;
        double d21;
        int i7 = defpackage.wof.e;
        double d22 = d3 + 16.0d;
        if (d2 < 1.0E-4d || d3 < 1.0E-4d || d3 > 99.9999d) {
            double[][] dArr7 = defpackage.wod.a;
            int iAR = defpackage.a.aR(defpackage.a.t(d22 / 116.0d) * 100.0d);
            iA = (iAR << 8) | (iAR << 16) | (-16777216) | iAR;
        } else {
            double d23 = d % 360.0d;
            double d24 = 0.0d;
            if (d23 < 0.0d) {
                d23 += 360.0d;
            }
            double[][] dArr8 = defpackage.wod.a;
            double dT = defpackage.a.t(d22 / 116.0d) * 100.0d;
            double dSqrt = java.lang.Math.sqrt(dT) * 11.0d;
            defpackage.woh wohVar = defpackage.woh.a;
            double dPow = 1.0d / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, wohVar.f), 0.73d);
            double d25 = (d23 / 180.0d) * 3.141592653589793d;
            double dCos = (java.lang.Math.cos(d25 + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * wohVar.d;
            double dSin = java.lang.Math.sin(d25);
            double dCos2 = java.lang.Math.cos(d25);
            int i8 = 0;
            while (true) {
                double d26 = d24;
                if (i8 < 5) {
                    i = 1;
                    double d27 = dSqrt / 100.0d;
                    double dPow2 = java.lang.Math.pow(((d2 == d26 || dSqrt == d26) ? d26 : d2 / java.lang.Math.sqrt(d27)) * dPow, 1.1111111111111112d);
                    double d28 = wohVar.b;
                    double d29 = dPow;
                    double d30 = wohVar.e;
                    double d31 = dCos2;
                    double dPow3 = (d28 * java.lang.Math.pow(d27, 1.4492753623188408d / wohVar.j)) / wohVar.c;
                    double d32 = (((0.305d + dPow3) * 23.0d) * dPow2) / (((23.0d * dCos) + ((dPow2 * 11.0d) * d31)) + ((dPow2 * 108.0d) * dSin));
                    double d33 = d32 * d31;
                    double d34 = d32 * dSin;
                    double d35 = dPow3 * 460.0d;
                    double[] dArrR = defpackage.a.r(new double[]{defpackage.acmj.f((((451.0d * d33) + d35) + (288.0d * d34)) / 1403.0d), defpackage.acmj.f(((d35 - (891.0d * d33)) - (261.0d * d34)) / 1403.0d), defpackage.acmj.f(((d35 - (d33 * 220.0d)) - (d34 * 6300.0d)) / 1403.0d)}, defpackage.wof.b);
                    double d36 = dArrR[0];
                    if (d36 >= d26) {
                        double d37 = dArrR[1];
                        if (d37 >= d26) {
                            double d38 = dArrR[2];
                            if (d38 >= d26) {
                                double[] dArr9 = defpackage.wof.c;
                                double d39 = (dArr9[0] * d36) + (dArr9[1] * d37) + (dArr9[2] * d38);
                                if (d39 > d26) {
                                    if (i8 != 4) {
                                        double d40 = d39 - dT;
                                        if (java.lang.Math.abs(d40) >= 0.002d) {
                                            dSqrt -= (d40 * dSqrt) / (d39 + d39);
                                            i8++;
                                            d24 = d26;
                                            dCos = dCos;
                                            dPow = d29;
                                            dCos2 = d31;
                                        }
                                    }
                                    if (dArrR[0] <= 100.01d && dArrR[1] <= 100.01d && dArrR[2] <= 100.01d) {
                                        iA = defpackage.wod.a(dArrR);
                                    }
                                    if (iA == 0) {
                                        dArr = new double[3];
                                        d4 = -1.0d;
                                        dArr[0] = -1.0d;
                                        dArr[i] = -1.0d;
                                        dArr[2] = -1.0d;
                                        dArr2 = dArr;
                                        z = false;
                                        i2 = 0;
                                        d5 = d26;
                                        d6 = d5;
                                        i3 = i;
                                        while (i2 < 12) {
                                            double[] dArr10 = defpackage.wof.c;
                                            d10 = dArr10[0];
                                            d11 = dArr10[i];
                                            d12 = dArr10[2];
                                            i6 = i2 % 4;
                                            if (i2 % 2 == 0) {
                                                d13 = d26;
                                            } else {
                                                d13 = 100.0d;
                                            }
                                            d14 = d4;
                                            if (i6 <= i) {
                                                d15 = d26;
                                            } else {
                                                d15 = 100.0d;
                                            }
                                            if (i2 < 4) {
                                                d21 = ((dT - (d11 * d15)) - (d12 * d13)) / d10;
                                                if (defpackage.a.w(d21)) {
                                                    dArr5 = new double[]{d21, d15, d13};
                                                } else {
                                                    dArr5 = new double[]{d14, d14, d14};
                                                }
                                            } else if (i2 < 8) {
                                                d17 = ((dT - (d10 * d13)) - (d12 * d15)) / d11;
                                                if (defpackage.a.w(d17)) {
                                                    dArr5 = new double[]{d13, d17, d15};
                                                } else {
                                                    dArr5 = new double[]{d14, d14, d14};
                                                }
                                            } else {
                                                d16 = ((dT - (d10 * d15)) - (d11 * d13)) / d12;
                                                if (defpackage.a.w(d16)) {
                                                    dArr5 = new double[]{d15, d13, d16};
                                                } else {
                                                    dArr5 = new double[]{d14, d14, d14};
                                                }
                                            }
                                            dArr6 = dArr5;
                                            if (dArr6[0] < d26) {
                                                dA3 = defpackage.wof.a(dArr6);
                                                if (z) {
                                                    if (i3 == 0) {
                                                        d18 = d6;
                                                        if (defpackage.acmj.g(d5, dA3, d6)) {
                                                            dA3 = dA3;
                                                        } else {
                                                            d6 = d18;
                                                        }
                                                        i3 = 0;
                                                    } else {
                                                        d18 = d6;
                                                    }
                                                    d19 = d5;
                                                    d5 = d19;
                                                    d20 = dA3;
                                                    if (defpackage.acmj.g(d19, d25, dA3)) {
                                                        dArr2 = dArr6;
                                                        d6 = d20;
                                                    } else {
                                                        dArr = dArr6;
                                                        d6 = d18;
                                                        d5 = d20;
                                                    }
                                                    i3 = 0;
                                                } else {
                                                    dArr = dArr6;
                                                    dArr2 = dArr;
                                                    d5 = dA3;
                                                    d6 = d5;
                                                }
                                                z = true;
                                            }
                                            i2++;
                                            d4 = d14;
                                            i = 1;
                                        }
                                        double[][] dArr11 = {dArr, dArr2};
                                        dArr3 = dArr11[0];
                                        dA = defpackage.wof.a(dArr3);
                                        dArr4 = dArr11[1];
                                        for (i4 = 0; i4 < 3; i4++) {
                                            d7 = dArr3[i4];
                                            d8 = dArr4[i4];
                                            if (d7 == d8) {
                                                if (d7 < d8) {
                                                    iB = defpackage.wof.c(defpackage.a.v(d7));
                                                    iC = defpackage.wof.b(defpackage.a.v(dArr4[i4]));
                                                } else {
                                                    iB = defpackage.wof.b(defpackage.a.v(d7));
                                                    iC = defpackage.wof.c(defpackage.a.v(dArr4[i4]));
                                                }
                                                d9 = dA;
                                                for (i5 = 0; i5 < 8 && java.lang.Math.abs(iC - iB) > 1; i5++) {
                                                    iFloor = (int) java.lang.Math.floor(((double) (iB + iC)) / 2.0d);
                                                    double d41 = defpackage.wof.d[iFloor];
                                                    double d42 = dArr3[i4];
                                                    dArrX = defpackage.a.x(dArr3, (d41 - d42) / (dArr4[i4] - d42), dArr4);
                                                    dA2 = defpackage.wof.a(dArrX);
                                                    zG = defpackage.acmj.g(d9, d25, dA2);
                                                    if (true == zG) {
                                                        iC = iFloor;
                                                    }
                                                    if (true != zG) {
                                                        iB = iFloor;
                                                    }
                                                    if (true == zG) {
                                                        dArr4 = dArrX;
                                                    }
                                                    if (true != zG) {
                                                        d9 = dA2;
                                                    }
                                                    if (true != zG) {
                                                        dArr3 = dArrX;
                                                    }
                                                }
                                                dA = d9;
                                            }
                                        }
                                        iA = defpackage.wod.a(defpackage.a.y(dArr3, dArr4));
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i = 1;
                }
                iA = 0;
                if (iA == 0) {
                    dArr = new double[3];
                    d4 = -1.0d;
                    dArr[0] = -1.0d;
                    dArr[i] = -1.0d;
                    dArr[2] = -1.0d;
                    dArr2 = dArr;
                    z = false;
                    i2 = 0;
                    d5 = d26;
                    d6 = d5;
                    i3 = i;
                    while (i2 < 12) {
                        double[] dArr12 = defpackage.wof.c;
                        d10 = dArr12[0];
                        d11 = dArr12[i];
                        d12 = dArr12[2];
                        i6 = i2 % 4;
                        if (i2 % 2 == 0) {
                            d13 = d26;
                        } else {
                            d13 = 100.0d;
                        }
                        d14 = d4;
                        if (i6 <= i) {
                            d15 = d26;
                        } else {
                            d15 = 100.0d;
                        }
                        if (i2 < 4) {
                            d21 = ((dT - (d11 * d15)) - (d12 * d13)) / d10;
                            if (defpackage.a.w(d21)) {
                                dArr5 = new double[]{d21, d15, d13};
                            } else {
                                dArr5 = new double[]{d14, d14, d14};
                            }
                        } else if (i2 < 8) {
                            d17 = ((dT - (d10 * d13)) - (d12 * d15)) / d11;
                            if (defpackage.a.w(d17)) {
                                dArr5 = new double[]{d13, d17, d15};
                            } else {
                                dArr5 = new double[]{d14, d14, d14};
                            }
                        } else {
                            d16 = ((dT - (d10 * d15)) - (d11 * d13)) / d12;
                            if (defpackage.a.w(d16)) {
                                dArr5 = new double[]{d15, d13, d16};
                            } else {
                                dArr5 = new double[]{d14, d14, d14};
                            }
                        }
                        dArr6 = dArr5;
                        if (dArr6[0] < d26) {
                            dA3 = defpackage.wof.a(dArr6);
                            if (z) {
                                dArr = dArr6;
                                dArr2 = dArr;
                                d5 = dA3;
                                d6 = d5;
                            } else {
                                if (i3 == 0) {
                                    d18 = d6;
                                    if (defpackage.acmj.g(d5, dA3, d6)) {
                                        dA3 = dA3;
                                    } else {
                                        d6 = d18;
                                    }
                                    i3 = 0;
                                } else {
                                    d18 = d6;
                                }
                                d19 = d5;
                                d5 = d19;
                                d20 = dA3;
                                if (defpackage.acmj.g(d19, d25, dA3)) {
                                    dArr2 = dArr6;
                                    d6 = d20;
                                } else {
                                    dArr = dArr6;
                                    d6 = d18;
                                    d5 = d20;
                                }
                                i3 = 0;
                            }
                            z = true;
                        }
                        i2++;
                        d4 = d14;
                        i = 1;
                    }
                    double[][] dArr13 = {dArr, dArr2};
                    dArr3 = dArr13[0];
                    dA = defpackage.wof.a(dArr3);
                    dArr4 = dArr13[1];
                    while (i4 < 3) {
                        d7 = dArr3[i4];
                        d8 = dArr4[i4];
                        if (d7 == d8) {
                            if (d7 < d8) {
                                iB = defpackage.wof.c(defpackage.a.v(d7));
                                iC = defpackage.wof.b(defpackage.a.v(dArr4[i4]));
                            } else {
                                iB = defpackage.wof.b(defpackage.a.v(d7));
                                iC = defpackage.wof.c(defpackage.a.v(dArr4[i4]));
                            }
                            d9 = dA;
                            while (i5 < 8) {
                                iFloor = (int) java.lang.Math.floor(((double) (iB + iC)) / 2.0d);
                                double d43 = defpackage.wof.d[iFloor];
                                double d44 = dArr3[i4];
                                dArrX = defpackage.a.x(dArr3, (d43 - d44) / (dArr4[i4] - d44), dArr4);
                                dA2 = defpackage.wof.a(dArrX);
                                zG = defpackage.acmj.g(d9, d25, dA2);
                                if (true == zG) {
                                    iC = iFloor;
                                }
                                if (true != zG) {
                                    iB = iFloor;
                                }
                                if (true == zG) {
                                    dArr4 = dArrX;
                                }
                                if (true != zG) {
                                    d9 = dA2;
                                }
                                if (true != zG) {
                                    dArr3 = dArrX;
                                }
                            }
                            dA = d9;
                        }
                    }
                    iA = defpackage.wod.a(defpackage.a.y(dArr3, dArr4));
                }
            }
        }
        return new defpackage.woe(iA);
    }
}
