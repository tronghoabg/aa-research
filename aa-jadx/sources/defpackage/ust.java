package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ust {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/internal/vector/gl/GeometryUtil");
    public static final float b = 360.62445f;

    public static int a(int i, int i2, int i3) {
        int i4;
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            i4 = i2 != 1 ? 24 : 8;
        } else {
            i4 = 6;
        }
        return ((i - 1) * i4) + 6 + i3 + i3;
    }

    public static int b(float f, float f2, float f3) {
        if (f3 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return (((int) java.lang.Math.ceil((f * 1.1f) / (f2 * f3))) + 1) * 6;
        }
        return 25;
    }

    public static final defpackage.uti f(java.lang.String str, int i, boolean z, int i2, defpackage.uuv uuvVar) {
        return defpackage.uti.o(str, i2, i, z, false, uuvVar);
    }

    public static final boolean g() {
        return defpackage.uuy.a().b();
    }

    public final void c(int[] iArr, int[] iArr2, defpackage.tpm tpmVar, float[] fArr, defpackage.uti utiVar, int i, int i2, int i3, int[] iArr3, boolean z, float[] fArr2, float[] fArr3, float[] fArr4, boolean z2, float f, float f2, int[] iArr4, int[] iArr5) {
        if (z) {
            defpackage.uta.f(iArr, tpmVar.a, tpmVar.b, iArr2, fArr2, fArr3, fArr4, f, f2, utiVar);
        } else {
            defpackage.uta.h(iArr.length, iArr, 0, tpmVar.a, tpmVar.b, fArr, i, i2, i3, 0, iArr3, null, iArr2, z2, f2, iArr4, iArr5, utiVar);
        }
    }

    public final void d(int[] iArr, defpackage.tpm tpmVar, float f, defpackage.uti utiVar, int i, int i2, int i3, float f2, int i4, boolean z, float f3, float f4, float f5, float f6, float f7) {
        iArr = iArr;
        char c = 1;
        int length = iArr.length >> 1;
        char c2 = 0;
        float[] fArr = {f};
        int[] iArr2 = {i4};
        float[] fArr2 = {f3};
        float[] fArr3 = {f4};
        float[] fArr4 = {f5};
        length = 0;
        while (c2 <= 0) {
            int i5 = length - length;
            char c3 = c;
            iArr2 = iArr2;
            int[] iArr3 = {i5};
            if (z) {
                defpackage.uta.f(iArr, tpmVar.a, tpmVar.b, null, fArr2, fArr3, fArr4, f6, f7, utiVar);
                c2 = c3;
                c = c2;
            } else {
                float[] fArr5 = fArr3;
                float[] fArr6 = fArr;
                defpackage.uta.h(i5 + i5, iArr, length + length, tpmVar.a, tpmVar.b, fArr6, i, i2, i3, (int) (4.0f * f2), iArr2, null, iArr3, false, f7, null, null, utiVar);
                fArr = fArr6;
                fArr2 = fArr2;
                fArr3 = fArr5;
                fArr4 = fArr4;
                c2 = c3;
                c = c2;
            }
        }
    }

    public final defpackage.uti e(java.lang.String str, int i) {
        return defpackage.uti.o(str, 0, i, false, true, null);
    }
}
