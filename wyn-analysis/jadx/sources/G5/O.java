package G5;

import java.util.Arrays;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final int f4343a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4344b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4345c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4346d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4347e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4348f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4349g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4350h;

    /* renamed from: i, reason: collision with root package name */
    public final short[] f4351i;

    /* renamed from: j, reason: collision with root package name */
    public short[] f4352j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public short[] f4353l;

    /* renamed from: m, reason: collision with root package name */
    public int f4354m;

    /* renamed from: n, reason: collision with root package name */
    public short[] f4355n;

    /* renamed from: o, reason: collision with root package name */
    public int f4356o;

    /* renamed from: p, reason: collision with root package name */
    public int f4357p;

    /* renamed from: q, reason: collision with root package name */
    public int f4358q;

    /* renamed from: r, reason: collision with root package name */
    public int f4359r;

    /* renamed from: s, reason: collision with root package name */
    public int f4360s;

    /* renamed from: t, reason: collision with root package name */
    public int f4361t;

    /* renamed from: u, reason: collision with root package name */
    public int f4362u;

    /* renamed from: v, reason: collision with root package name */
    public int f4363v;

    public O(float f10, float f11, int i5, int i10, int i11) {
        this.f4343a = i5;
        this.f4344b = i10;
        this.f4345c = f10;
        this.f4346d = f11;
        this.f4347e = i5 / i11;
        this.f4348f = i5 / 400;
        int i12 = i5 / 65;
        this.f4349g = i12;
        int i13 = i12 * 2;
        this.f4350h = i13;
        this.f4351i = new short[i13];
        this.f4352j = new short[i13 * i10];
        this.f4353l = new short[i13 * i10];
        this.f4355n = new short[i13 * i10];
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
        short[] sArrC = c(this.f4353l, this.f4354m, i10);
        this.f4353l = sArrC;
        int i11 = this.f4344b;
        System.arraycopy(sArr, i5 * i11, sArrC, this.f4354m * i11, i11 * i10);
        this.f4354m += i10;
    }

    public final void b(short[] sArr, int i5, int i10) {
        int i11 = this.f4350h / i10;
        int i12 = this.f4344b;
        int i13 = i10 * i12;
        int i14 = i5 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f4351i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] c(short[] sArr, int i5, int i10) {
        int length = sArr.length;
        int i11 = this.f4344b;
        int i12 = length / i11;
        return i5 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int d(short[] sArr, int i5, int i10, int i11) {
        int i12 = i5 * this.f4344b;
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
        this.f4362u = i14 / i15;
        this.f4363v = i16 / i13;
        return i15;
    }

    public final void f() {
        float f10;
        float f11;
        float f12;
        double d3;
        int iD;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f4354m;
        float f13 = this.f4345c;
        float f14 = this.f4346d;
        float f15 = f13 / f14;
        float f16 = this.f4347e * f14;
        double d5 = f15;
        int i17 = this.f4343a;
        int i18 = this.f4344b;
        int i19 = 1;
        if (d5 > 1.00001d || d5 < 0.99999d) {
            int i20 = this.k;
            int i21 = this.f4350h;
            if (i20 >= i21) {
                int i22 = 0;
                while (true) {
                    int i23 = this.f4359r;
                    if (i23 > 0) {
                        int iMin = Math.min(i21, i23);
                        a(this.f4352j, i22, iMin);
                        this.f4359r -= iMin;
                        i22 += iMin;
                        f11 = f15;
                        f12 = f16;
                        d3 = d5;
                        f10 = 1.0f;
                    } else {
                        short[] sArr = this.f4352j;
                        int i24 = i17 > 4000 ? i17 / 4000 : i19;
                        f10 = 1.0f;
                        int i25 = this.f4349g;
                        int i26 = this.f4348f;
                        if (i18 == i19 && i24 == i19) {
                            iD = d(sArr, i22, i26, i25);
                            f11 = f15;
                            f12 = f16;
                            d3 = d5;
                        } else {
                            b(sArr, i22, i24);
                            f11 = f15;
                            f12 = f16;
                            short[] sArr2 = this.f4351i;
                            d3 = d5;
                            int iD2 = d(sArr2, 0, i26 / i24, i25 / i24);
                            if (i24 != 1) {
                                int i27 = iD2 * i24;
                                int i28 = i24 * 4;
                                int i29 = i27 - i28;
                                int i30 = i27 + i28;
                                if (i29 >= i26) {
                                    i26 = i29;
                                }
                                if (i30 <= i25) {
                                    i25 = i30;
                                }
                                if (i18 == 1) {
                                    iD = d(sArr, i22, i26, i25);
                                } else {
                                    b(sArr, i22, 1);
                                    iD = d(sArr2, 0, i26, i25);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i31 = this.f4362u;
                        int i32 = this.f4363v;
                        if (i31 == 0 || (i5 = this.f4360s) == 0 || i32 > i31 * 3 || i31 * 2 <= this.f4361t * 3) {
                            i5 = iD;
                        }
                        this.f4361t = i31;
                        this.f4360s = iD;
                        if (d3 > 1.0d) {
                            short[] sArr3 = this.f4352j;
                            if (f11 >= 2.0f) {
                                i11 = (int) (i5 / (f11 - 1.0f));
                            } else {
                                this.f4359r = (int) (((2.0f - f11) * i5) / (f11 - 1.0f));
                                i11 = i5;
                            }
                            short[] sArrC = c(this.f4353l, this.f4354m, i11);
                            this.f4353l = sArrC;
                            int i33 = i22 + i5;
                            int i34 = i22;
                            int i35 = i11;
                            e(i35, this.f4344b, sArrC, this.f4354m, sArr3, i34, sArr3, i33);
                            this.f4354m += i35;
                            i22 = i5 + i35 + i34;
                        } else {
                            int i36 = i22;
                            short[] sArr4 = this.f4352j;
                            if (f11 < 0.5f) {
                                i10 = (int) ((i5 * f11) / (1.0f - f11));
                            } else {
                                this.f4359r = (int) ((((2.0f * f11) - 1.0f) * i5) / (1.0f - f11));
                                i10 = i5;
                            }
                            int i37 = i5 + i10;
                            short[] sArrC2 = c(this.f4353l, this.f4354m, i37);
                            this.f4353l = sArrC2;
                            System.arraycopy(sArr4, i36 * i18, sArrC2, this.f4354m * i18, i5 * i18);
                            e(i10, this.f4344b, this.f4353l, this.f4354m + i5, sArr4, i36 + i5, sArr4, i36);
                            this.f4354m += i37;
                            i22 = i36 + i10;
                        }
                    }
                    if (i22 + i21 > i20) {
                        break;
                    }
                    i19 = 1;
                    f15 = f11;
                    f16 = f12;
                    d5 = d3;
                }
                int i38 = this.k - i22;
                short[] sArr5 = this.f4352j;
                System.arraycopy(sArr5, i22 * i18, sArr5, 0, i38 * i18);
                this.k = i38;
            }
            if (f12 != f10 || this.f4354m == i16) {
            }
            int i39 = (int) (i17 / f12);
            while (true) {
                if (i39 <= 16384 && i17 <= 16384) {
                    break;
                }
                i39 /= 2;
                i17 /= 2;
            }
            int i40 = this.f4354m - i16;
            short[] sArrC3 = c(this.f4355n, this.f4356o, i40);
            this.f4355n = sArrC3;
            System.arraycopy(this.f4353l, i16 * i18, sArrC3, this.f4356o * i18, i40 * i18);
            this.f4354m = i16;
            this.f4356o += i40;
            int i41 = 0;
            while (true) {
                i12 = this.f4356o;
                i13 = i12 - 1;
                if (i41 >= i13) {
                    break;
                }
                while (true) {
                    i14 = this.f4357p + 1;
                    int i42 = i14 * i39;
                    i15 = this.f4358q;
                    if (i42 <= i15 * i17) {
                        break;
                    }
                    this.f4353l = c(this.f4353l, this.f4354m, 1);
                    for (int i43 = 0; i43 < i18; i43++) {
                        short[] sArr6 = this.f4353l;
                        int i44 = (this.f4354m * i18) + i43;
                        short[] sArr7 = this.f4355n;
                        int i45 = (i41 * i18) + i43;
                        short s10 = sArr7[i45];
                        short s11 = sArr7[i45 + i18];
                        int i46 = this.f4358q * i17;
                        int i47 = this.f4357p;
                        int i48 = i47 * i39;
                        int i49 = (i47 + 1) * i39;
                        int i50 = i49 - i46;
                        int i51 = i49 - i48;
                        sArr6[i44] = (short) ((((i51 - i50) * s11) + (s10 * i50)) / i51);
                    }
                    this.f4358q++;
                    this.f4354m++;
                }
                this.f4357p = i14;
                if (i14 == i17) {
                    this.f4357p = 0;
                    AbstractC4256a.i(i15 == i39);
                    this.f4358q = 0;
                }
                i41++;
            }
            if (i13 == 0) {
                return;
            }
            short[] sArr8 = this.f4355n;
            System.arraycopy(sArr8, i13 * i18, sArr8, 0, (i12 - i13) * i18);
            this.f4356o -= i13;
            return;
        }
        a(this.f4352j, 0, this.k);
        this.k = 0;
        f12 = f16;
        f10 = 1.0f;
        if (f12 != f10) {
        }
    }
}
