package O1;

import Q1.k;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f8814a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8815b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8816c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8817d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8818e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8819f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8820g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8821h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f8822i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f8823j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f8824l;

    /* renamed from: m, reason: collision with root package name */
    public int f8825m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f8826n;

    /* renamed from: o, reason: collision with root package name */
    public int f8827o;

    /* renamed from: p, reason: collision with root package name */
    public int f8828p;

    /* renamed from: q, reason: collision with root package name */
    public int f8829q;

    /* renamed from: r, reason: collision with root package name */
    public int f8830r;

    /* renamed from: s, reason: collision with root package name */
    public int f8831s;

    /* renamed from: t, reason: collision with root package name */
    public int f8832t;

    /* renamed from: u, reason: collision with root package name */
    public int f8833u;

    /* renamed from: v, reason: collision with root package name */
    public int f8834v;

    /* renamed from: w, reason: collision with root package name */
    public double f8835w;

    public f(float f10, float f11, int i5, int i10, int i11) {
        this.f8814a = i5;
        this.f8815b = i10;
        this.f8816c = f10;
        this.f8817d = f11;
        this.f8818e = i5 / i11;
        this.f8819f = i5 / 400;
        int i12 = i5 / 65;
        this.f8820g = i12;
        int i13 = i12 * 2;
        this.f8821h = i13;
        this.f8822i = new short[i13];
        this.f8823j = new short[i13 * i10];
        this.f8824l = new short[i13 * i10];
        this.f8826n = new short[i13 * i10];
    }

    public static void e(int i5, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i5; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i5 - i18) * sArr2[i17])) / i5);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public final void a(short[] sArr, int i5, int i10) {
        short[] sArrC = c(this.f8824l, this.f8825m, i10);
        this.f8824l = sArrC;
        int i11 = this.f8815b;
        System.arraycopy(sArr, i5 * i11, sArrC, this.f8825m * i11, i11 * i10);
        this.f8825m += i10;
    }

    public final void b(short[] sArr, int i5, int i10) {
        int i11 = this.f8821h / i10;
        int i12 = this.f8815b;
        int i13 = i10 * i12;
        int i14 = i5 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f8822i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] c(short[] sArr, int i5, int i10) {
        int length = sArr.length;
        int i11 = this.f8815b;
        int i12 = length / i11;
        return i5 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int d(short[] sArr, int i5, int i10, int i11) {
        int i12 = i5 * this.f8815b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                iAbs += Math.abs(sArr[i12 + i17] - sArr[(i12 + i10) + i17]);
            }
            if (iAbs * i15 < i14 * i10) {
                i15 = i10;
                i14 = iAbs;
            }
            if (iAbs * i13 > i16 * i10) {
                i13 = i10;
                i16 = iAbs;
            }
            i10++;
        }
        this.f8833u = i14 / i15;
        this.f8834v = i16 / i13;
        return i15;
    }

    public final void f() {
        float f10;
        double d3;
        int iD;
        int i5;
        int i10;
        int iRound;
        int i11;
        int i12;
        int i13;
        long j8;
        long j10;
        int i14 = this.f8825m;
        float f11 = this.f8816c;
        float f12 = this.f8817d;
        double d5 = f11 / f12;
        float f13 = this.f8818e * f12;
        int i15 = this.f8814a;
        int i16 = this.f8815b;
        int i17 = 0;
        int i18 = 1;
        if (d5 > 1.00001d || d5 < 0.99999d) {
            int i19 = this.k;
            int i20 = this.f8821h;
            if (i19 >= i20) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f8830r;
                    if (i22 > 0) {
                        int iMin = Math.min(i20, i22);
                        a(this.f8823j, i21, iMin);
                        this.f8830r -= iMin;
                        i21 += iMin;
                        f10 = f13;
                        d3 = d5;
                    } else {
                        short[] sArr = this.f8823j;
                        int i23 = i15 > 4000 ? i15 / 4000 : i18;
                        int i24 = this.f8820g;
                        int i25 = this.f8819f;
                        if (i16 == i18 && i23 == i18) {
                            iD = d(sArr, i21, i25, i24);
                            f10 = f13;
                            d3 = d5;
                        } else {
                            b(sArr, i21, i23);
                            f10 = f13;
                            d3 = d5;
                            short[] sArr2 = this.f8822i;
                            int iD2 = d(sArr2, i17, i25 / i23, i24 / i23);
                            if (i23 != 1) {
                                int i26 = iD2 * i23;
                                int i27 = i23 * 4;
                                int i28 = i26 - i27;
                                int i29 = i26 + i27;
                                if (i28 >= i25) {
                                    i25 = i28;
                                }
                                if (i29 <= i24) {
                                    i24 = i29;
                                }
                                if (i16 == 1) {
                                    iD = d(sArr, i21, i25, i24);
                                } else {
                                    b(sArr, i21, 1);
                                    iD = d(sArr2, i17, i25, i24);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i30 = this.f8833u;
                        int i31 = this.f8834v;
                        if (i30 == 0 || (i5 = this.f8831s) == 0 || i31 > i30 * 3 || i30 * 2 <= this.f8832t * 3) {
                            i5 = iD;
                        }
                        this.f8832t = i30;
                        this.f8831s = iD;
                        if (d3 > 1.0d) {
                            short[] sArr3 = this.f8823j;
                            if (d3 >= 2.0d) {
                                double d10 = (i5 / (d3 - 1.0d)) + this.f8835w;
                                iRound = (int) Math.round(d10);
                                this.f8835w = d10 - iRound;
                            } else {
                                double d11 = (((2.0d - d3) * i5) / (d3 - 1.0d)) + this.f8835w;
                                int iRound2 = (int) Math.round(d11);
                                this.f8830r = iRound2;
                                this.f8835w = d11 - iRound2;
                                iRound = i5;
                            }
                            short[] sArrC = c(this.f8824l, this.f8825m, iRound);
                            this.f8824l = sArrC;
                            int i32 = i21 + i5;
                            int i33 = i21;
                            int i34 = iRound;
                            e(i34, this.f8815b, sArrC, this.f8825m, sArr3, i33, sArr3, i32);
                            this.f8825m += i34;
                            i21 = i5 + i34 + i33;
                        } else {
                            int i35 = i21;
                            short[] sArr4 = this.f8823j;
                            if (d3 < 0.5d) {
                                double d12 = ((i5 * d3) / (1.0d - d3)) + this.f8835w;
                                int iRound3 = (int) Math.round(d12);
                                this.f8835w = d12 - iRound3;
                                i10 = iRound3;
                            } else {
                                double d13 = ((((d3 * 2.0d) - 1.0d) * i5) / (1.0d - d3)) + this.f8835w;
                                int iRound4 = (int) Math.round(d13);
                                this.f8830r = iRound4;
                                this.f8835w = d13 - iRound4;
                                i10 = i5;
                            }
                            int i36 = i5 + i10;
                            short[] sArrC2 = c(this.f8824l, this.f8825m, i36);
                            this.f8824l = sArrC2;
                            System.arraycopy(sArr4, i35 * i16, sArrC2, this.f8825m * i16, i5 * i16);
                            e(i10, this.f8815b, this.f8824l, this.f8825m + i5, sArr4, i35 + i5, sArr4, i35);
                            this.f8825m += i36;
                            i21 = i35 + i10;
                        }
                    }
                    if (i21 + i20 > i19) {
                        break;
                    }
                    i17 = 0;
                    i18 = 1;
                    f13 = f10;
                    d5 = d3;
                }
                int i37 = this.k - i21;
                short[] sArr5 = this.f8823j;
                System.arraycopy(sArr5, i21 * i16, sArr5, 0, i37 * i16);
                this.k = i37;
            }
            if (f10 != 1.0f || this.f8825m == i14) {
            }
            long j11 = (long) (i15 / f10);
            long j12 = i15;
            while (j11 != 0 && j12 != 0 && j11 % 2 == 0 && j12 % 2 == 0) {
                j11 /= 2;
                j12 /= 2;
            }
            int i38 = this.f8825m - i14;
            short[] sArrC3 = c(this.f8826n, this.f8827o, i38);
            this.f8826n = sArrC3;
            System.arraycopy(this.f8824l, i14 * i16, sArrC3, this.f8827o * i16, i38 * i16);
            this.f8825m = i14;
            this.f8827o += i38;
            int i39 = 0;
            while (true) {
                i11 = this.f8827o;
                i12 = i11 - 1;
                if (i39 >= i12) {
                    break;
                }
                while (true) {
                    i13 = this.f8828p + 1;
                    j8 = i13;
                    long j13 = j8 * j11;
                    j10 = this.f8829q;
                    if (j13 <= j10 * j12) {
                        break;
                    }
                    this.f8824l = c(this.f8824l, this.f8825m, 1);
                    int i40 = 0;
                    while (i40 < i16) {
                        short[] sArr6 = this.f8824l;
                        int i41 = (this.f8825m * i16) + i40;
                        short[] sArr7 = this.f8826n;
                        int i42 = (i39 * i16) + i40;
                        short s10 = sArr7[i42];
                        short s11 = sArr7[i42 + i16];
                        long j14 = j11;
                        int i43 = i39;
                        long j15 = (r12 + 1) * j14;
                        long j16 = j15 - (this.f8829q * j12);
                        long j17 = j15 - (this.f8828p * j14);
                        sArr6[i41] = (short) ((((j17 - j16) * s11) + (s10 * j16)) / j17);
                        i40++;
                        i39 = i43;
                        j11 = j14;
                    }
                    this.f8829q++;
                    this.f8825m++;
                    i39 = i39;
                    j11 = j11;
                }
                long j18 = j11;
                int i44 = i39;
                this.f8828p = i13;
                if (j8 == j12) {
                    this.f8828p = 0;
                    k.g(j10 == j18);
                    this.f8829q = 0;
                }
                i39 = i44 + 1;
                j11 = j18;
            }
            if (i12 == 0) {
                return;
            }
            short[] sArr8 = this.f8826n;
            System.arraycopy(sArr8, i12 * i16, sArr8, 0, (i11 - i12) * i16);
            this.f8827o -= i12;
            return;
        }
        a(this.f8823j, 0, this.k);
        this.k = 0;
        f10 = f13;
        if (f10 != 1.0f) {
        }
    }
}
