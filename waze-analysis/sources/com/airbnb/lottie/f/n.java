package com.airbnb.lottie.f;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n implements ag {

    /* renamed from: a, reason: collision with root package name */
    private int f2366a;

    public n(int i2) {
        this.f2366a = i2;
    }

    @Override // com.airbnb.lottie.f.ag
    public final /* bridge */ /* synthetic */ Object a(com.airbnb.lottie.f.a.d dVar, float f2) {
        int i2;
        int iArgb;
        int i3;
        float f3;
        int iArgb2;
        float f4;
        ArrayList arrayList = new ArrayList();
        int iS = dVar.s();
        int i4 = 1;
        if (iS == 1) {
            dVar.j();
        }
        while (dVar.q()) {
            arrayList.add(Float.valueOf((float) dVar.a()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f2366a = 2;
        }
        if (iS == 1) {
            dVar.l();
        }
        int size = this.f2366a;
        if (size == -1) {
            size = arrayList.size() / 4;
            this.f2366a = size;
        }
        float[] fArr = new float[size];
        int[] iArr = new int[size];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = this.f2366a * 4;
            if (i5 >= i2) {
                break;
            }
            int i8 = i5 / 4;
            double dFloatValue = ((Float) arrayList.get(i5)).floatValue();
            int i9 = i5 % 4;
            if (i9 == 0) {
                float f5 = (float) dFloatValue;
                if (i8 <= 0 || fArr[i8 - 1] < f5) {
                    fArr[i8] = f5;
                } else {
                    fArr[i8] = f5 + 0.01f;
                }
            } else if (i9 == 1) {
                i6 = (int) (dFloatValue * 255.0d);
            } else if (i9 == 2) {
                i7 = (int) (dFloatValue * 255.0d);
            } else if (i9 == 3) {
                iArr[i8] = Color.argb(255, i6, i7, (int) (dFloatValue * 255.0d));
            }
            i5++;
        }
        com.airbnb.lottie.d.b.d dVar2 = new com.airbnb.lottie.d.b.d(fArr, iArr);
        if (arrayList.size() <= i2) {
            return dVar2;
        }
        float[] fArrD = dVar2.d();
        int[] iArrE = dVar2.e();
        int size2 = (arrayList.size() - i2) / 2;
        float[] fArr2 = new float[size2];
        float[] fArr3 = new float[size2];
        int i10 = 0;
        while (i2 < arrayList.size()) {
            if (i2 % 2 == 0) {
                fArr2[i10] = ((Float) arrayList.get(i2)).floatValue();
            } else {
                fArr3[i10] = ((Float) arrayList.get(i2)).floatValue();
                i10++;
            }
            i2++;
        }
        float[] fArrD2 = dVar2.d();
        int length = fArrD2.length;
        if (length == 0) {
            fArrD2 = fArr2;
        } else if (size2 != 0) {
            int i11 = length + size2;
            float[] fArr4 = new float[i11];
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                float f6 = i13 < fArrD2.length ? fArrD2[i13] : Float.NaN;
                float f7 = i14 < size2 ? fArr2[i14] : Float.NaN;
                if (Float.isNaN(f7) || f6 < f7) {
                    fArr4[i15] = f6;
                    i13++;
                } else {
                    i14++;
                    if (Float.isNaN(f6) || f7 < f6) {
                        fArr4[i15] = f7;
                    } else {
                        i13++;
                        fArr4[i15] = f6;
                        i12++;
                    }
                }
            }
            fArrD2 = i12 == 0 ? fArr4 : Arrays.copyOf(fArr4, i11 - i12);
        }
        int length2 = fArrD2.length;
        int[] iArr2 = new int[length2];
        int i16 = 0;
        while (i16 < length2) {
            float f8 = fArrD2[i16];
            int iBinarySearch = Arrays.binarySearch(fArrD, f8);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f8);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f9 = fArr3[iBinarySearch2];
                if (iArrE.length < 2 || f8 == fArrD[0]) {
                    iArgb = iArrE[0];
                } else {
                    int i17 = 1;
                    while (true) {
                        int length3 = fArrD.length;
                        if (i17 >= length3) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        i3 = length3 - 1;
                        f3 = fArrD[i17];
                        if (f3 >= f8 || i17 == i3) {
                            break;
                        }
                        i17++;
                    }
                    int i18 = (int) (f9 * 255.0f);
                    if (i17 != i3 || f8 < f3) {
                        int i19 = i17 - 1;
                        float f10 = fArrD[i19];
                        int iH = d.h((f8 - f10) / (f3 - f10), iArrE[i19], iArrE[i17]);
                        iArgb = Color.argb(i18, Color.red(iH), Color.green(iH), Color.blue(iH));
                    } else {
                        iArgb = Color.argb(i18, Color.red(iArrE[i17]), Color.green(iArrE[i17]), Color.blue(iArrE[i17]));
                    }
                }
                iArr2[i16] = iArgb;
            } else {
                int i20 = iArrE[iBinarySearch];
                if (size2 >= 2 && f8 > fArr2[0]) {
                    for (int i21 = i4; i21 < size2; i21++) {
                        float f11 = fArr2[i21];
                        if (f11 >= f8 || i21 == size2 - 1) {
                            if (f11 <= f8) {
                                f4 = fArr3[i21];
                            } else {
                                int i22 = i21 - 1;
                                float f12 = fArr2[i22];
                                float f13 = f11 - f12;
                                float f14 = f8 - f12;
                                float f15 = fArr3[i22];
                                float f16 = fArr3[i21];
                                int i23 = com.airbnb.lottie.g.f.f2413a;
                                f4 = f15 + ((f14 / f13) * (f16 - f15));
                            }
                            iArgb2 = Color.argb((int) (f4 * 255.0f), Color.red(i20), Color.green(i20), Color.blue(i20));
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                iArgb2 = Color.argb((int) (fArr3[0] * 255.0f), Color.red(i20), Color.green(i20), Color.blue(i20));
                iArr2[i16] = iArgb2;
            }
            i16++;
            i4 = 1;
        }
        return new com.airbnb.lottie.d.b.d(fArrD2, iArr2);
    }
}
