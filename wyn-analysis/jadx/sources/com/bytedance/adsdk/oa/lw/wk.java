package com.bytedance.adsdk.oa.lw;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class wk implements rl<com.bytedance.adsdk.oa.yo.oa.moa> {
    private int uef;

    public wk(int i5) {
        this.uef = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.oa.lw.rl
    /* renamed from: uef, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.adsdk.oa.yo.oa.moa oa(android.util.JsonReader r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.lw.wk.oa(android.util.JsonReader, float):com.bytedance.adsdk.oa.yo.oa.moa");
    }

    private com.bytedance.adsdk.oa.yo.oa.moa uef(com.bytedance.adsdk.oa.yo.oa.moa moaVar, List<Float> list) {
        int i5 = this.uef * 4;
        if (list.size() <= i5) {
            return moaVar;
        }
        float[] fArrUef = moaVar.uef();
        int[] iArrOa = moaVar.oa();
        int size = (list.size() - i5) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i10 = 0;
        while (i5 < list.size()) {
            if (i5 % 2 == 0) {
                fArr[i10] = list.get(i5).floatValue();
            } else {
                fArr2[i10] = list.get(i5).floatValue();
                i10++;
            }
            i5++;
        }
        float[] fArrUef2 = uef(moaVar.uef(), fArr);
        int length = fArrUef2.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            float f10 = fArrUef2[i11];
            int iBinarySearch = Arrays.binarySearch(fArrUef, f10);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f10);
            if (iBinarySearch >= 0 && iBinarySearch2 <= 0) {
                iArr[i11] = uef(f10, iArrOa[iBinarySearch], fArr, fArr2);
            } else {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i11] = uef(f10, fArr2[iBinarySearch2], fArrUef, iArrOa);
            }
        }
        return new com.bytedance.adsdk.oa.yo.oa.moa(fArrUef2, iArr);
    }

    public int uef(float f10, float f11, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f10 != fArr[0]) {
            for (int i5 = 1; i5 < fArr.length; i5++) {
                float f12 = fArr[i5];
                if (f12 >= f10 || i5 == fArr.length - 1) {
                    int i10 = i5 - 1;
                    float f13 = fArr[i10];
                    float f14 = (f10 - f13) / (f12 - f13);
                    int i11 = iArr[i5];
                    int i12 = iArr[i10];
                    return Color.argb((int) (f11 * 255.0f), com.bytedance.adsdk.oa.ivm.oa.uef(f14, Color.red(i12), Color.red(i11)), com.bytedance.adsdk.oa.ivm.oa.uef(f14, Color.green(i12), Color.green(i11)), com.bytedance.adsdk.oa.ivm.oa.uef(f14, Color.blue(i12), Color.blue(i11)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int uef(float f10, int i5, float[] fArr, float[] fArr2) {
        float fUef;
        if (fArr2.length >= 2 && f10 > fArr[0]) {
            for (int i10 = 1; i10 < fArr.length; i10++) {
                float f11 = fArr[i10];
                if (f11 >= f10 || i10 == fArr.length - 1) {
                    if (f11 <= f10) {
                        fUef = fArr2[i10];
                    } else {
                        int i11 = i10 - 1;
                        float f12 = fArr[i11];
                        fUef = com.bytedance.adsdk.oa.ivm.lw.uef(fArr2[i11], fArr2[i10], (f10 - f12) / (f11 - f12));
                    }
                    return Color.argb((int) (fUef * 255.0f), Color.red(i5), Color.green(i5), Color.blue(i5));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i5), Color.green(i5), Color.blue(i5));
    }

    public static float[] uef(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            float f10 = i10 < fArr.length ? fArr[i10] : Float.NaN;
            float f11 = i11 < fArr2.length ? fArr2[i11] : Float.NaN;
            if (!Float.isNaN(f11) && f10 >= f11) {
                if (!Float.isNaN(f10) && f11 >= f10) {
                    fArr3[i12] = f10;
                    i10++;
                    i11++;
                    i5++;
                } else {
                    fArr3[i12] = f11;
                    i11++;
                }
            } else {
                fArr3[i12] = f10;
                i10++;
            }
        }
        return i5 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i5);
    }
}
