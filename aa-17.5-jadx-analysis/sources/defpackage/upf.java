package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;

/* loaded from: classes3.dex */
public final class upf {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/resource/IconLoader");
    private static final int b = Color.argb(255, 0, 0, 0);
    private final aezk c;

    public upf(aezk aezkVar) {
        this.c = aezkVar;
    }

    private static Bitmap b(Bitmap bitmap, int i, int i2, Rect rect) {
        int[] iArr;
        woy.Z(bitmap.getHeight() > 0 && (bitmap.getHeight() + (-2)) % 4 == 0);
        woy.Z(bitmap.getWidth() > 0 && (bitmap.getWidth() + (-2)) % 4 == 0);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i3 = height - 1;
        int i4 = width - 2;
        int i5 = height - 2;
        int[] iArr2 = new int[width * height];
        bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        aeiy aeiyVar = new aeiy();
        int i6 = -1;
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        boolean z = false;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            iArr = iArr2;
            if (i8 >= width - 1) {
                break;
            }
            boolean z2 = iArr[i8] == -16777216;
            int i12 = iArr[i8 + (i3 * width)];
            if (z2 != z) {
                aeiyVar.c(i9);
                z = z2;
                i9 = 0;
            }
            i9++;
            if (z2) {
                i11++;
            } else {
                i10++;
            }
            if (i12 == -16777216) {
                if (i6 == -1) {
                    i6 = i8 - 1;
                }
                i7++;
            }
            i8++;
            iArr2 = iArr;
        }
        aeiyVar.c(i9);
        int[] iArrL = aeiyVar.L(new int[aeiyVar.b]);
        aeiyVar.clear();
        int i13 = 1;
        int i14 = 0;
        int i15 = -1;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        boolean z3 = false;
        while (i13 < i3) {
            int i19 = i3;
            int i20 = i13;
            boolean z4 = iArr[i13 * width] == -16777216;
            int i21 = iArr[(r22 + width) - 1];
            if (z4 != z3) {
                aeiyVar.c(i17);
                z3 = z4;
                i17 = 0;
            }
            i17++;
            if (z4) {
                i18++;
            } else {
                i16++;
            }
            if (i21 == -16777216) {
                if (i15 == -1) {
                    i15 = i20 - 1;
                }
                i14++;
            }
            i13 = i20 + 1;
            i3 = i19;
        }
        aeiyVar.c(i17);
        int[] iArrL2 = aeiyVar.L(new int[aeiyVar.b]);
        float fH = uqw.h(i, i11, i10, i7);
        float fH2 = uqw.h(i2, i18, i16, i14);
        int iJ = uqw.j(fH, i10, i11);
        int i22 = uqw.i(fH2, i16, i18);
        rect.set(new Rect(i6, i15, iJ - ((iJ - i6) - Math.max(i7, i)), i22 - ((i22 - i15) - Math.max(i14, i2))));
        if (i4 <= 0 || i5 <= 0) {
            return null;
        }
        float fH3 = uqw.h(i, i11, i10, i7);
        float fH4 = uqw.h(i2, i18, i16, i14);
        if (fH3 == 1.0f && fH4 == 1.0f) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, width + 1, width, 0, 0, i4, i5);
            return bitmapCreateBitmap;
        }
        int iJ2 = uqw.j(fH3, i10, i11);
        int i23 = uqw.i(fH4, i16, i18);
        if (iJ2 <= 0 || i23 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iJ2, i23, Bitmap.Config.ARGB_8888);
        float fH5 = uqw.h(i, i11, i10, i7);
        float fH6 = uqw.h(i2, i18, i16, i14);
        int iJ3 = uqw.j(fH5, i10, i11);
        int i24 = uqw.i(fH6, i16, i18);
        float[] fArrG = uqw.g(iArrL, fH5);
        float[] fArrG2 = uqw.g(iArrL2, fH6);
        int[] iArr3 = new int[iJ3 * i24];
        for (int i25 = 0; i25 < i24; i25++) {
            for (int i26 = 0; i26 < iJ3; i26++) {
                iArr3[(i25 * iJ3) + i26] = iArr[((int) uqw.f(fArrG, i26 + 0.5f)) + (((int) uqw.f(fArrG2, i25 + 0.5f)) * width)];
            }
        }
        bitmapCreateBitmap2.setPixels(iArr3, 0, iJ2, 0, 0, iJ2, i23);
        return bitmapCreateBitmap2;
    }

    private static final boolean c(uiy uiyVar) {
        return !uiyVar.h.equals(uiy.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0484  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap a(android.graphics.Bitmap[] r26, defpackage.upq r27, android.graphics.Rect r28) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upf.a(android.graphics.Bitmap[], upq, android.graphics.Rect):android.graphics.Bitmap");
    }
}
