package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import h.a.c;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;

    private static final float[][] Matrix(int i2, int i3) {
        float[][] fArr = new float[i2][];
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4] = new float[i3];
        }
        return fArr;
    }

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        m9716addPointerInputChange0AR0LA0(velocityTracker, pointerInputChange, Offset.Companion.m7996getZeroF1C5BW0());
    }

    /* renamed from: addPointerInputChange-0AR0LA0, reason: not valid java name */
    public static final void m9716addPointerInputChange0AR0LA0(VelocityTracker velocityTracker, PointerInputChange pointerInputChange, long j2) {
        velocityTracker.getPlatformVelocityTracker$ui().mo9704addPointerInputChangeUv8p0NA(pointerInputChange, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i2, boolean z) {
        int i3 = i2 - 1;
        float f2 = fArr2[i3];
        float fSqrt = 0.0f;
        int i4 = i3;
        while (i4 > 0) {
            int i5 = i4 - 1;
            float f3 = fArr2[i5];
            if (f2 != f3) {
                float f4 = z ? -fArr[i5] : fArr[i4] - fArr[i5];
                float fSignum = Math.signum(fSqrt);
                float fAbs = Math.abs(fSqrt);
                float f5 = f4 / (f2 - f3);
                fSqrt += (f5 - (fSignum * ((float) Math.sqrt(fAbs + fAbs)))) * Math.abs(f5);
                if (i4 == i3) {
                    fSqrt *= 0.5f;
                }
            }
            i4 = i5;
            f2 = f3;
        }
        float fSignum2 = Math.signum(fSqrt);
        float fAbs2 = Math.abs(fSqrt);
        return fSignum2 * ((float) Math.sqrt(fAbs2 + fAbs2));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f2 += fArr[i2] * fArr2[i2];
        }
        return f2;
    }

    private static final float get(float[][] fArr, int i2, int i3) {
        return fArr[i2][i3];
    }

    private static final float kineticEnergyToVelocity(float f2) {
        float fSignum = Math.signum(f2);
        float fAbs = Math.abs(f2);
        return fSignum * ((float) Math.sqrt(fAbs + fAbs));
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    public static final float[] polyFitLeastSquares(float[] fArr, float[] fArr2, int i2, int i3, float[] fArr3) {
        int i4;
        int i5 = i3;
        if (i5 <= 0) {
            InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i2 == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
            i4 = 0;
        } else {
            i4 = i2;
        }
        if (i5 >= i4) {
            i5 = i4 - 1;
        }
        int i6 = i5 + 1;
        float[][] fArr4 = new float[i6][];
        for (int i7 = 0; i7 < i6; i7++) {
            fArr4[i7] = new float[i4];
        }
        for (int i8 = 0; i8 < i4; i8++) {
            fArr4[0][i8] = 1.0f;
            for (int i9 = 1; i9 < i6; i9++) {
                fArr4[i9][i8] = fArr4[i9 - 1][i8] * fArr[i8];
            }
        }
        float[][] fArr5 = new float[i6][];
        for (int i10 = 0; i10 < i6; i10++) {
            fArr5[i10] = new float[i4];
        }
        float[][] fArr6 = new float[i6][];
        for (int i11 = 0; i11 < i6; i11++) {
            fArr6[i11] = new float[i6];
        }
        int i12 = 0;
        while (i12 < i6) {
            float[] fArr7 = fArr5[i12];
            c.aq(fArr4[i12], fArr7, 0, 0, i4);
            for (int i13 = 0; i13 < i12; i13++) {
                float[] fArr8 = fArr5[i13];
                float fDot = dot(fArr7, fArr8);
                for (int i14 = 0; i14 < i4; i14++) {
                    fArr7[i14] = fArr7[i14] - (fArr8[i14] * fDot);
                }
            }
            float fSqrt = (float) Math.sqrt(dot(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f2 = 1.0f / fSqrt;
            for (int i15 = 0; i15 < i4; i15++) {
                fArr7[i15] = fArr7[i15] * f2;
            }
            float[] fArr9 = fArr6[i12];
            int i16 = 0;
            while (i16 < i6) {
                fArr9[i16] = i16 < i12 ? 0.0f : dot(fArr7, fArr4[i16]);
                i16++;
            }
            i12++;
        }
        for (int i17 = i5; i17 >= 0; i17--) {
            float fDot2 = dot(fArr5[i17], fArr2);
            float[] fArr10 = fArr6[i17];
            int i18 = i17 + 1;
            if (i18 <= i5) {
                int i19 = i5;
                while (true) {
                    fDot2 -= fArr10[i19] * fArr3[i19];
                    if (i19 != i18) {
                        i19--;
                    }
                }
            }
            fArr3[i17] = fDot2 / fArr10[i17];
        }
        return fArr3;
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i2, int i3, float[] fArr3, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            int i5 = i3 + 1;
            if (i5 < 0) {
                i5 = 0;
            }
            fArr3 = new float[i5];
        }
        polyFitLeastSquares(fArr, fArr2, i2, i3, fArr3);
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i2, long j2, float f2) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i2] = new DataPointAtTime(j2, f2);
        } else {
            dataPointAtTime.setTime(j2);
            dataPointAtTime.setDataPoint(f2);
        }
    }

    private static final void set(float[][] fArr, int i2, int i3, float f2) {
        fArr[i2][i3] = f2;
    }
}
