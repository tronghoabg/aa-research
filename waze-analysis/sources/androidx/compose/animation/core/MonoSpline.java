package androidx.compose.animation.core;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class MonoSpline {
    public static final int $stable = 8;
    private final float[] slopeTemp;
    private final float[][] tangents;
    private final float[] timePoints;
    private final float[][] values;

    public MonoSpline(float[] fArr, float[][] fArr2, float f2) {
        int i2;
        int i3;
        int length = fArr.length;
        int i4 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i5 = length - 1;
        float[][] fArrMakeFloatArray = makeFloatArray(i5, length2);
        float[][] fArrMakeFloatArray2 = makeFloatArray(length, length2);
        for (int i6 = 0; i6 < length2; i6++) {
            int i7 = length - 2;
            int i8 = 0;
            while (i8 < i5) {
                int i9 = i8 + 1;
                float f3 = fArr[i9] - fArr[i8];
                float[] fArr3 = fArrMakeFloatArray[i8];
                float f4 = (fArr2[i9][i6] - fArr2[i8][i6]) / f3;
                fArr3[i6] = f4;
                if (i8 == 0) {
                    fArrMakeFloatArray2[0][i6] = fArrMakeFloatArray[0][i6];
                } else {
                    fArrMakeFloatArray2[i8][i6] = (fArrMakeFloatArray[i8 - 1][i6] + f4) * 0.5f;
                }
                i8 = i9;
            }
            fArrMakeFloatArray2[i5][i6] = fArrMakeFloatArray[i7][i6];
        }
        if (!Float.isNaN(f2)) {
            for (int i10 = 0; i10 < length2; i10++) {
                float[] fArr4 = fArrMakeFloatArray[length - 2];
                float f5 = fArr4[i10] * (1.0f - f2);
                float[] fArr5 = fArrMakeFloatArray[0];
                float f6 = f5 + (fArr5[i10] * f2);
                fArr5[i10] = f6;
                fArr4[i10] = f6;
                fArrMakeFloatArray2[i5][i10] = f6;
                fArrMakeFloatArray2[0][i10] = f6;
            }
        }
        int i11 = 0;
        while (i11 < i5) {
            int i12 = i4;
            while (true) {
                i2 = i11 + 1;
                if (i12 < length2) {
                    float f7 = fArrMakeFloatArray[i11][i12];
                    if (f7 == 0.0f) {
                        fArrMakeFloatArray2[i11][i12] = 0.0f;
                        fArrMakeFloatArray2[i2][i12] = 0.0f;
                        i3 = length2;
                    } else {
                        float f8 = fArrMakeFloatArray2[i11][i12] / f7;
                        float f9 = fArrMakeFloatArray2[i2][i12] / f7;
                        i3 = length2;
                        float fHypot = (float) Math.hypot(f8, f9);
                        if (fHypot > 9.0d) {
                            float f10 = 3.0f / fHypot;
                            float[] fArr6 = fArrMakeFloatArray2[i11];
                            float[] fArr7 = fArrMakeFloatArray[i11];
                            fArr6[i12] = f8 * f10 * fArr7[i12];
                            fArrMakeFloatArray2[i2][i12] = f10 * f9 * fArr7[i12];
                        }
                    }
                    i12++;
                    length2 = i3;
                    i4 = 0;
                }
            }
            i11 = i2;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = fArrMakeFloatArray2;
    }

    public static /* synthetic */ void getPos$default(MonoSpline monoSpline, float f2, AnimationVector animationVector, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        monoSpline.getPos(f2, animationVector, i2);
    }

    public static /* synthetic */ void getSlope$default(MonoSpline monoSpline, float f2, AnimationVector animationVector, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        monoSpline.getSlope(f2, animationVector, i2);
    }

    private final float[][] makeFloatArray(int i2, int i3) {
        float[][] fArr = new float[i2][];
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4] = new float[i3];
        }
        return fArr;
    }

    public final void getPos(float f2, AnimationVector animationVector, int i2) {
        int i3;
        float[][] fArr = this.values;
        float[] fArr2 = this.timePoints;
        int length = fArr2.length;
        int i4 = 0;
        int length2 = fArr[0].length;
        if (f2 <= fArr2[0]) {
            i3 = 0;
        } else {
            i3 = length - 1;
            if (f2 < fArr2[i3]) {
                i3 = -1;
            }
        }
        if (i3 != -1) {
            getSlope(fArr2[i3], this.slopeTemp);
            while (i4 < length2) {
                animationVector.set$animation_core(i4, this.values[i3][i4] + ((f2 - this.timePoints[i3]) * this.slopeTemp[i4]));
                i4++;
            }
            return;
        }
        int i5 = length - 1;
        int i6 = i2;
        while (i6 < i5) {
            float[] fArr3 = this.timePoints;
            float f3 = fArr3[i6];
            if (f2 == f3) {
                while (i4 < length2) {
                    animationVector.set$animation_core(i4, this.values[i6][i4]);
                    i4++;
                }
                return;
            }
            int i7 = i6 + 1;
            float f4 = fArr3[i7];
            if (f2 < f4) {
                float f5 = f4 - f3;
                float f6 = f2 - f3;
                while (i4 < length2) {
                    float[][] fArr4 = this.values;
                    float f7 = fArr4[i6][i4];
                    float f8 = fArr4[i7][i4];
                    float[][] fArr5 = this.tangents;
                    animationVector.set$animation_core(i4, MonoSplineKt.hermiteInterpolate(f5, f6 / f5, f7, f8, fArr5[i6][i4], fArr5[i7][i4]));
                    i4++;
                }
                return;
            }
            i6 = i7;
        }
    }

    public final void getSlope(float f2, AnimationVector animationVector, int i2) {
        int i3;
        float[] fArr = this.timePoints;
        float[][] fArr2 = this.values;
        int length = fArr.length;
        int i4 = 0;
        int length2 = fArr2[0].length;
        if (f2 <= fArr[0]) {
            i3 = 0;
        } else {
            i3 = length - 1;
            if (f2 < fArr[i3]) {
                i3 = -1;
            }
        }
        float[][] fArr3 = this.tangents;
        if (i3 != -1) {
            float[] fArr4 = fArr3[i3];
            if (fArr4.length >= length2) {
                while (i4 < length2) {
                    animationVector.set$animation_core(i4, fArr4[i4]);
                    i4++;
                }
                return;
            }
            return;
        }
        int i5 = length - 1;
        int i6 = i2;
        while (i6 < i5) {
            int i7 = i6 + 1;
            float f3 = fArr[i7];
            if (f2 <= f3) {
                float f4 = fArr[i6];
                float f5 = f3 - f4;
                float f6 = f2 - f4;
                while (i4 < length2) {
                    animationVector.set$animation_core(i4, MonoSplineKt.hermiteDifferential(f5, f6 / f5, fArr2[i6][i4], fArr2[i7][i4], fArr3[i6][i4], fArr3[i7][i4]) / f5);
                    i4++;
                }
                return;
            }
            i6 = i7;
        }
    }

    private final float getSlope(float f2, int i2) {
        float[] fArr = this.timePoints;
        int length = fArr.length - 1;
        int i3 = 0;
        float f3 = fArr[0];
        if (f2 < f3) {
            f2 = f3;
        }
        float f4 = fArr[length];
        if (f2 > f4) {
            f2 = f4;
        }
        while (i3 < length) {
            int i4 = i3 + 1;
            float f5 = fArr[i4];
            if (f2 <= f5) {
                float[][] fArr2 = this.tangents;
                float[][] fArr3 = this.values;
                float f6 = fArr3[i3][i2];
                float f7 = fArr3[i4][i2];
                float f8 = fArr2[i3][i2];
                float f9 = fArr2[i4][i2];
                float f10 = fArr[i3];
                float f11 = f5 - f10;
                return MonoSplineKt.hermiteDifferential(f11, (f2 - f10) / f11, f6, f7, f8, f9) / f11;
            }
            i3 = i4;
        }
        return 0.0f;
    }

    private final void getSlope(float f2, float[] fArr) {
        int length = this.values[0].length;
        float[] fArr2 = this.timePoints;
        int length2 = fArr2.length - 1;
        float f3 = fArr2[0];
        if (f2 < f3) {
            f2 = f3;
        }
        float f4 = fArr2[length2];
        if (f2 > f4) {
            f2 = f4;
        }
        if (fArr.length >= length) {
            int i2 = 0;
            while (i2 < length2) {
                float[] fArr3 = this.timePoints;
                int i3 = i2 + 1;
                float f5 = fArr3[i3];
                if (f2 <= f5) {
                    float f6 = fArr3[i2];
                    float f7 = f5 - f6;
                    float f8 = f2 - f6;
                    for (int i4 = 0; i4 < length; i4++) {
                        float[][] fArr4 = this.values;
                        float f9 = fArr4[i2][i4];
                        float f10 = fArr4[i3][i4];
                        float[][] fArr5 = this.tangents;
                        fArr[i4] = MonoSplineKt.hermiteDifferential(f7, f8 / f7, f9, f10, fArr5[i2][i4], fArr5[i3][i4]) / f7;
                    }
                    return;
                }
                i2 = i3;
            }
        }
    }

    public final float getPos(float f2, int i2) {
        int i3;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i4 = 0;
        if (f2 <= fArr[0]) {
            i3 = 0;
        } else {
            i3 = length - 1;
            if (f2 < fArr[i3]) {
                i3 = -1;
            }
        }
        float[][] fArr2 = this.values;
        if (i3 != -1) {
            float f3 = fArr2[i3][i2];
            float f4 = fArr[i3];
            return f3 + ((f2 - f4) * getSlope(f4, i2));
        }
        int i5 = length - 1;
        while (i4 < i5) {
            float[] fArr3 = this.timePoints;
            float f5 = fArr3[i4];
            if (f2 == f5) {
                return fArr2[i4][i2];
            }
            int i6 = i4 + 1;
            float f6 = fArr3[i6];
            if (f2 < f6) {
                float[][] fArr4 = this.tangents;
                float f7 = f6 - f5;
                return MonoSplineKt.hermiteInterpolate(f7, (f2 - f5) / f7, fArr2[i4][i2], fArr2[i6][i2], fArr4[i4][i2], fArr4[i6][i2]);
            }
            i4 = i6;
        }
        return 0.0f;
    }
}
