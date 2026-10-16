package androidx.compose.ui.platform;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class InvertMatrixKt {
    /* renamed from: invertTo-JiSxe2E, reason: not valid java name */
    public static final boolean m10252invertToJiSxe2E(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f4 * f9) - (f5 * f8);
        float f19 = (f10 * f15) - (f11 * f14);
        float f20 = (f3 * f9) - (f5 * f7);
        float f21 = (f10 * f16) - (f12 * f14);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f10 * f17) - (f13 * f14);
        float f24 = (f2 * f9) - (f5 * f6);
        float f25 = (f11 * f16) - (f12 * f15);
        float f26 = (f2 * f8) - (f4 * f6);
        float f27 = (f11 * f17) - (f13 * f15);
        float f28 = (f2 * f7) - (f3 * f6);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (((((f28 * f29) - (f26 * f27)) + (f24 * f25)) + (f22 * f23)) - (f20 * f21)) + (f18 * f19);
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = (((f7 * f29) - (f8 * f27)) + (f9 * f25)) * f31;
            fArr2[1] = ((((-f3) * f29) + (f4 * f27)) - (f5 * f25)) * f31;
            fArr2[2] = (((f15 * f18) - (f16 * f20)) + (f17 * f22)) * f31;
            fArr2[3] = ((((-f11) * f18) + (f12 * f20)) - (f13 * f22)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f32 * f29) + (f8 * f23)) - (f9 * f21)) * f31;
            fArr2[5] = (((f29 * f2) - (f4 * f23)) + (f5 * f21)) * f31;
            float f33 = -f14;
            fArr2[6] = (((f33 * f18) + (f16 * f24)) - (f17 * f26)) * f31;
            fArr2[7] = (((f18 * f10) - (f12 * f24)) + (f13 * f26)) * f31;
            fArr2[8] = (((f6 * f27) - (f7 * f23)) + (f9 * f19)) * f31;
            fArr2[9] = ((((-f2) * f27) + (f23 * f3)) - (f5 * f19)) * f31;
            fArr2[10] = (((f14 * f20) - (f15 * f24)) + (f17 * f28)) * f31;
            fArr2[11] = ((((-f10) * f20) + (f24 * f11)) - (f13 * f28)) * f31;
            fArr2[12] = (((f32 * f25) + (f7 * f21)) - (f8 * f19)) * f31;
            fArr2[13] = (((f2 * f25) - (f3 * f21)) + (f4 * f19)) * f31;
            fArr2[14] = (((f33 * f22) + (f15 * f26)) - (f16 * f28)) * f31;
            fArr2[15] = (((f10 * f22) - (f11 * f26)) + (f12 * f28)) * f31;
        }
        return f30 != 0.0f;
    }
}
