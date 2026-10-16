package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class urw {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/vector/gl/GeometryUtil");
    public static final float b = ((float) Math.sqrt(2.0d)) * 255.0f;

    public static int a(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        return ((i - 1) * (i2 != 0 ? i2 != 1 ? 24 : 8 : 6)) + 6 + i3 + i3;
    }

    public static int b(float f, float f2, float f3) {
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            return (((int) Math.ceil((f * 1.1f) / (f2 * f3))) + 1) * 6;
        }
        return 25;
    }

    public static final usm f(String str, int i, boolean z, int i2, utz utzVar) {
        return usm.o(str, i2, i, z, false, utzVar);
    }

    public static final boolean g() {
        return uuc.a().b();
    }

    public final void c(int[] iArr, int[] iArr2, too tooVar, float[] fArr, usm usmVar, int i, int i2, int i3, int[] iArr3, boolean z, float[] fArr2, float[] fArr3, float[] fArr4, boolean z2, float f, float f2, int[] iArr4, int[] iArr5) {
        if (z) {
            use.f(iArr, tooVar.a, tooVar.b, iArr2, fArr2, fArr3, fArr4, f, f2, usmVar);
        } else {
            use.h(iArr.length, iArr, 0, tooVar.a, tooVar.b, fArr, i, i2, i3, 0, iArr3, null, iArr2, z2, f2, iArr4, iArr5, usmVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void d(int[] iArr, too tooVar, float f, usm usmVar, int i, int i2, int i3, float f2, int i4, boolean z, float f3, float f4, float f5, float f6, float f7) {
        int[] iArr2 = iArr;
        boolean z2 = true;
        int length = iArr2.length >> 1;
        ?? r2 = 0;
        float[] fArr = {f};
        int[] iArr3 = {i4};
        float[] fArr2 = {f3};
        float[] fArr3 = {f4};
        float[] fArr4 = {f5};
        int i5 = 0;
        while (r2 <= 0) {
            int i6 = length - i5;
            boolean z3 = z2;
            int[] iArr4 = iArr3;
            int[] iArr5 = {i6};
            if (z) {
                use.f(iArr2, tooVar.a, tooVar.b, null, fArr2, fArr3, fArr4, f6, f7, usmVar);
                iArr2 = iArr;
                iArr3 = iArr4;
                r2 = z3;
                z2 = r2 == true ? 1 : 0;
                i5 = length;
            } else {
                float[] fArr5 = fArr3;
                float[] fArr6 = fArr;
                use.h(i6 + i6, iArr, i5 + i5, tooVar.a, tooVar.b, fArr6, i, i2, i3, (int) (4.0f * f2), iArr4, null, iArr5, false, f7, null, null, usmVar);
                iArr2 = iArr;
                fArr = fArr6;
                iArr3 = iArr4;
                i5 = length;
                fArr2 = fArr2;
                fArr3 = fArr5;
                fArr4 = fArr4;
                r2 = z3;
                z2 = r2 == true ? 1 : 0;
            }
        }
    }

    public final usm e(String str, int i) {
        return usm.o(str, 0, i, false, true, null);
    }
}
