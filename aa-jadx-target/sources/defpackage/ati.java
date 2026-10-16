package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ati {
    public static final defpackage.atb a = new defpackage.asz(3);
    public static final defpackage.atb b = new defpackage.asz(2);
    public static final defpackage.ath c = new defpackage.atg(0);
    public static final defpackage.ath d = new defpackage.atg(1);
    public static final defpackage.atc e = new defpackage.atd(1);
    public static final defpackage.atc f = new defpackage.atd(3);
    public static final defpackage.atc g = new defpackage.atd(2);
    public static final defpackage.atc h = new defpackage.atd(0);

    public static final void a(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        float f2 = (i - i4) / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = java.lang.Math.round(f2);
                f2 += i6;
                i2++;
                i5++;
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i7 = iArr[length];
            iArr2[length] = java.lang.Math.round(f2);
            f2 += i7;
        }
    }

    public static final void b(int[] iArr, int[] iArr2, boolean z) {
        int i = 0;
        if (!z) {
            int length = iArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i < length) {
                int i4 = iArr[i];
                iArr2[i3] = i2;
                i2 += i4;
                i++;
                i3++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            int i5 = iArr[length2];
            iArr2[length2] = i;
            i += i5;
        }
    }

    public static final void c(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        int i5 = i - i4;
        if (!z) {
            int i6 = 0;
            while (i2 < length) {
                int i7 = iArr[i2];
                iArr2[i6] = i5;
                i5 += i7;
                i2++;
                i6++;
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i8 = iArr[length];
            iArr2[length] = i5;
            i5 += i8;
        }
    }

    public static final void d(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        float f2 = length == 0 ? 0.0f : (i - i4) / length;
        float f3 = f2 / 2.0f;
        if (!z) {
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = java.lang.Math.round(f3);
                f3 += i6 + f2;
                i2++;
                i5++;
            }
            return;
        }
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            int i7 = iArr[length];
            iArr2[length] = java.lang.Math.round(f3);
            f3 += i7 + f2;
        }
    }

    public static final void e(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float fMax = (i - i3) / java.lang.Math.max(defpackage.afga.bF(iArr), 1);
        float f2 = 0.0f;
        if (z && iArr.length == 1) {
            f2 = fMax;
        }
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = java.lang.Math.round(f2);
                f2 += i6 + fMax;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (length2 < 0) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = java.lang.Math.round(f2);
            f2 += i7 + fMax;
        }
    }

    public static final void f(int i, int[] iArr, int[] iArr2, boolean z) {
        int length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = iArr.length;
            if (i3 >= length) {
                break;
            }
            i4 += iArr[i3];
            i3++;
        }
        float f2 = (i - i4) / (length + 1);
        if (z) {
            float f3 = f2;
            for (int i5 = length - 1; i5 >= 0; i5--) {
                int i6 = iArr[i5];
                iArr2[i5] = java.lang.Math.round(f3);
                f3 += i6 + f2;
            }
            return;
        }
        float f4 = f2;
        int i7 = 0;
        while (i2 < length) {
            int i8 = iArr[i2];
            iArr2[i7] = java.lang.Math.round(f4);
            f4 += i8 + f2;
            i2++;
            i7++;
        }
    }

    public static final defpackage.atc g(float f2) {
        return new defpackage.ate(f2, true, new defpackage.asy());
    }

    public static final defpackage.atb h(float f2, defpackage.cft cftVar) {
        return new defpackage.ate(f2, true, new defpackage.asx(cftVar, 1));
    }

    public static final defpackage.ath i(float f2, defpackage.cfy cfyVar) {
        return new defpackage.ate(f2, false, new defpackage.asx(cfyVar, 0));
    }
}
