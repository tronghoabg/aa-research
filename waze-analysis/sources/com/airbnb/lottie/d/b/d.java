package com.airbnb.lottie.d.b;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f2135a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f2136b;

    public d(float[] fArr, int[] iArr) {
        this.f2135a = fArr;
        this.f2136b = iArr;
    }

    private final void f(d dVar) {
        int i2 = 0;
        while (true) {
            int[] iArr = dVar.f2136b;
            if (i2 >= iArr.length) {
                return;
            }
            this.f2135a[i2] = dVar.f2135a[i2];
            this.f2136b[i2] = iArr[i2];
            i2++;
        }
    }

    public final int a() {
        return this.f2136b.length;
    }

    public final d b(float[] fArr) {
        int iH;
        int[] iArr = new int[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            float[] fArr2 = this.f2135a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f2);
            if (iBinarySearch >= 0) {
                iH = this.f2136b[iBinarySearch];
            } else {
                int i3 = -(iBinarySearch + 1);
                int[] iArr2 = this.f2136b;
                if (i3 == 0) {
                    iH = iArr2[0];
                } else {
                    int length = iArr2.length - 1;
                    if (i3 == length) {
                        iH = iArr2[length];
                    } else {
                        int i4 = i3 - 1;
                        float f3 = fArr2[i4];
                        iH = com.airbnb.lottie.f.d.h((f2 - f3) / (fArr2[i3] - f3), iArr2[i4], iArr2[i3]);
                    }
                }
            }
            iArr[i2] = iH;
        }
        return new d(fArr, iArr);
    }

    public final void c(d dVar, d dVar2, float f2) {
        int length;
        if (dVar.equals(dVar2)) {
            f(dVar);
            return;
        }
        if (f2 <= 0.0f) {
            f(dVar);
            return;
        }
        if (f2 >= 1.0f) {
            f(dVar2);
            return;
        }
        int[] iArr = dVar.f2136b;
        int length2 = iArr.length;
        int[] iArr2 = dVar2.f2136b;
        int length3 = iArr2.length;
        if (length2 != length3) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + length2 + " vs " + length3 + ")");
        }
        int i2 = 0;
        while (true) {
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            float[] fArr = this.f2135a;
            float f3 = dVar.f2135a[i2];
            float f4 = dVar2.f2135a[i2];
            int i3 = com.airbnb.lottie.g.f.f2413a;
            fArr[i2] = f3 + ((f4 - f3) * f2);
            this.f2136b[i2] = com.airbnb.lottie.f.d.h(f2, iArr[i2], iArr2[i2]);
            i2++;
        }
        while (true) {
            float[] fArr2 = this.f2135a;
            if (length >= fArr2.length) {
                return;
            }
            int length4 = iArr.length - 1;
            fArr2[length] = fArr2[length4];
            int[] iArr3 = this.f2136b;
            iArr3[length] = iArr3[length4];
            length++;
        }
    }

    public final float[] d() {
        return this.f2135a;
    }

    public final int[] e() {
        return this.f2136b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f2135a, dVar.f2135a) && Arrays.equals(this.f2136b, dVar.f2136b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f2135a) * 31) + Arrays.hashCode(this.f2136b);
    }
}
