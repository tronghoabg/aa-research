package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class MonotonicCurveFit extends CurveFit {
    private static final String TAG = "MonotonicCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;
    private double[] mT;
    private double[][] mTangent;
    private double[][] mY;

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int i2;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.mSlopeTemp = new double[length2];
        int i3 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i3, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        for (int i4 = 0; i4 < length2; i4++) {
            int i5 = 0;
            while (i5 < i3) {
                int i6 = i5 + 1;
                double d2 = dArr[i6] - dArr[i5];
                double[] dArr5 = dArr3[i5];
                double d3 = (dArr2[i6][i4] - dArr2[i5][i4]) / d2;
                dArr5[i4] = d3;
                if (i5 == 0) {
                    dArr4[0][i4] = dArr3[0][i4];
                } else {
                    dArr4[i5][i4] = (dArr3[i5 - 1][i4] + d3) * 0.5d;
                }
                i5 = i6;
            }
            dArr4[i3][i4] = dArr3[length - 2][i4];
        }
        int i7 = 0;
        while (i7 < i3) {
            int i8 = 0;
            while (true) {
                i2 = i7 + 1;
                if (i8 < length2) {
                    double d4 = dArr3[i7][i8];
                    if (d4 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                        dArr4[i7][i8] = 0.0d;
                        dArr4[i2][i8] = 0.0d;
                    } else {
                        double d5 = dArr4[i7][i8] / d4;
                        double d6 = dArr4[i2][i8] / d4;
                        double dHypot = Math.hypot(d5, d6);
                        if (dHypot > 9.0d) {
                            double d7 = 3.0d / dHypot;
                            double[] dArr6 = dArr4[i7];
                            double[] dArr7 = dArr3[i7];
                            dArr6[i8] = d5 * d7 * dArr7[i8];
                            dArr4[i2][i8] = d7 * d6 * dArr7[i8];
                        }
                    }
                    i8++;
                }
            }
            i7 = i2;
        }
        this.mT = dArr;
        this.mY = dArr2;
        this.mTangent = dArr4;
    }

    private static MonotonicCurveFit buildWave(double[] dArr) {
        int length = dArr.length;
        int i2 = length * 3;
        int i3 = length - 1;
        int i4 = i2 - 2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, 1);
        double[] dArr3 = new double[i4];
        for (int i5 = 0; i5 < dArr.length; i5++) {
            double d2 = dArr[i5];
            int i6 = i5 + i3;
            dArr2[i6][0] = d2;
            double d3 = 1.0d / i3;
            double d4 = i5 * d3;
            dArr3[i6] = d4;
            if (i5 > 0) {
                int i7 = i3 + i3 + i5;
                dArr2[i7][0] = d2 + 1.0d;
                dArr3[i7] = 1.0d + d4;
                int i8 = i5 - 1;
                dArr2[i8][0] = (d2 - 1.0d) - d3;
                dArr3[i8] = (d4 - 1.0d) - d3;
            }
        }
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    private static double diff(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = 3.0d * d2;
        double d9 = d3 * d3;
        double d10 = 6.0d * d3;
        return ((((((((((-6.0d) * d9) * d5) + (d10 * d5)) + ((d9 * 6.0d) * d4)) - (d10 * d4)) + ((d8 * d7) * d9)) + ((d8 * d6) * d9)) - (((d2 + d2) * d7) * d3)) - (((4.0d * d2) * d6) * d3)) + (d2 * d6);
    }

    private static double interpolate(double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = d2 * d7;
        double d9 = d2 * d6;
        double d10 = d3 * d3;
        double d11 = d10 * d3;
        double d12 = 3.0d * d10;
        return (((((((((((-2.0d) * d11) * d5) + (d12 * d5)) + ((d11 + d11) * d4)) - (d12 * d4)) + d4) + (d8 * d11)) + (d11 * d9)) - (d8 * d10)) - (((d2 + d2) * d6) * d10)) + (d9 * d3);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, float[] fArr) {
        int i2;
        double[] dArr = this.mT;
        int length = dArr.length;
        int i3 = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            double d3 = dArr[0];
            if (d2 <= d3) {
                getSlope(d3, this.mSlopeTemp);
                for (int i4 = 0; i4 < length2; i4++) {
                    fArr[i4] = (float) (this.mY[0][i4] + ((d2 - this.mT[0]) * this.mSlopeTemp[i4]));
                }
                return;
            }
            i2 = length - 1;
            double d4 = dArr[i2];
            if (d2 >= d4) {
                getSlope(d4, this.mSlopeTemp);
                while (i3 < length2) {
                    fArr[i3] = (float) (this.mY[i2][i3] + ((d2 - this.mT[i2]) * this.mSlopeTemp[i3]));
                    i3++;
                }
                return;
            }
        } else {
            if (d2 <= dArr[0]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) this.mY[0][i5];
                }
                return;
            }
            i2 = length - 1;
            if (d2 >= dArr[i2]) {
                while (i3 < length2) {
                    fArr[i3] = (float) this.mY[i2][i3];
                    i3++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < i2) {
            if (d2 == this.mT[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.mY[i6][i7];
                }
            }
            double[] dArr2 = this.mT;
            int i8 = i6 + 1;
            double d5 = dArr2[i8];
            if (d2 < d5) {
                double d6 = dArr2[i6];
                double d7 = d5 - d6;
                double d8 = d2 - d6;
                while (i3 < length2) {
                    double[][] dArr3 = this.mY;
                    double d9 = dArr3[i6][i3];
                    double d10 = dArr3[i8][i3];
                    double[][] dArr4 = this.mTangent;
                    fArr[i3] = (float) interpolate(d7, d8 / d7, d9, d10, dArr4[i6][i3], dArr4[i8][i3]);
                    i3++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getSlope(double d2, double[] dArr) {
        double[] dArr2 = this.mT;
        int length = dArr2.length - 1;
        int length2 = this.mY[0].length;
        double d3 = dArr2[0];
        if (d2 > d3) {
            d3 = dArr2[length];
            if (d2 < d3) {
                d3 = d2;
            }
        }
        int i2 = 0;
        while (i2 < length) {
            double[] dArr3 = this.mT;
            int i3 = i2 + 1;
            double d4 = dArr3[i3];
            if (d3 <= d4) {
                double d5 = dArr3[i2];
                double d6 = d4 - d5;
                double d7 = d3 - d5;
                for (int i4 = 0; i4 < length2; i4++) {
                    double[][] dArr4 = this.mY;
                    double d8 = dArr4[i2][i4];
                    double d9 = dArr4[i3][i4];
                    double[][] dArr5 = this.mTangent;
                    dArr[i4] = diff(d6, d7 / d6, d8, d9, dArr5[i2][i4], dArr5[i3][i4]) / d6;
                }
                return;
            }
            i2 = i3;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mT;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getSlope(double d2, int i2) {
        double[] dArr = this.mT;
        int length = dArr.length - 1;
        int i3 = 0;
        double d3 = dArr[0];
        if (d2 >= d3) {
            d3 = dArr[length];
            if (d2 < d3) {
                d3 = d2;
            }
        }
        while (i3 < length) {
            double[] dArr2 = this.mT;
            int i4 = i3 + 1;
            double d4 = dArr2[i4];
            if (d3 <= d4) {
                double d5 = dArr2[i3];
                double d6 = d4 - d5;
                double[][] dArr3 = this.mY;
                double d7 = dArr3[i3][i2];
                double d8 = dArr3[i4][i2];
                double[][] dArr4 = this.mTangent;
                return diff(d6, (d3 - d5) / d6, d7, d8, dArr4[i3][i2], dArr4[i4][i2]) / d6;
            }
            i3 = i4;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static MonotonicCurveFit buildWave(String str) {
        double[] dArr = new double[str.length() >> 1];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (iIndexOf2 != -1) {
                dArr[i2] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i2 = i3;
            } else {
                dArr[i2] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
                return buildWave(Arrays.copyOf(dArr, i3));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void getPos(double d2, double[] dArr) {
        int i2;
        double[] dArr2 = this.mT;
        int length = dArr2.length;
        int i3 = 0;
        int length2 = this.mY[0].length;
        if (this.mExtrapolate) {
            double d3 = dArr2[0];
            if (d2 <= d3) {
                getSlope(d3, this.mSlopeTemp);
                for (int i4 = 0; i4 < length2; i4++) {
                    dArr[i4] = this.mY[0][i4] + ((d2 - this.mT[0]) * this.mSlopeTemp[i4]);
                }
                return;
            }
            i2 = length - 1;
            double d4 = dArr2[i2];
            if (d2 >= d4) {
                getSlope(d4, this.mSlopeTemp);
                while (i3 < length2) {
                    dArr[i3] = this.mY[i2][i3] + ((d2 - this.mT[i2]) * this.mSlopeTemp[i3]);
                    i3++;
                }
                return;
            }
        } else {
            if (d2 <= dArr2[0]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = this.mY[0][i5];
                }
                return;
            }
            i2 = length - 1;
            if (d2 >= dArr2[i2]) {
                while (i3 < length2) {
                    dArr[i3] = this.mY[i2][i3];
                    i3++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < i2) {
            if (d2 == this.mT[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.mY[i6][i7];
                }
            }
            double[] dArr3 = this.mT;
            int i8 = i6 + 1;
            double d5 = dArr3[i8];
            if (d2 < d5) {
                double d6 = dArr3[i6];
                double d7 = d5 - d6;
                double d8 = d2 - d6;
                while (i3 < length2) {
                    double[][] dArr4 = this.mY;
                    double d9 = dArr4[i6][i3];
                    double d10 = dArr4[i8][i3];
                    double[][] dArr5 = this.mTangent;
                    dArr[i3] = interpolate(d7, d8 / d7, d9, d10, dArr5[i6][i3], dArr5[i8][i3]);
                    i3++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double getPos(double d2, int i2) {
        int i3;
        double d3;
        double d4;
        double slope;
        double[] dArr = this.mT;
        int length = dArr.length;
        int i4 = 0;
        if (this.mExtrapolate) {
            double d5 = dArr[0];
            if (d2 <= d5) {
                d3 = this.mY[0][i2];
                d4 = d2 - d5;
                slope = getSlope(d5, i2);
            } else {
                i3 = length - 1;
                double d6 = dArr[i3];
                if (d2 >= d6) {
                    d3 = this.mY[i3][i2];
                    d4 = d2 - d6;
                    slope = getSlope(d6, i2);
                }
            }
            return d3 + (d4 * slope);
        }
        if (d2 <= dArr[0]) {
            return this.mY[0][i2];
        }
        i3 = length - 1;
        if (d2 >= dArr[i3]) {
            return this.mY[i3][i2];
        }
        while (i4 < i3) {
            double[] dArr2 = this.mT;
            double d7 = dArr2[i4];
            if (d2 == d7) {
                return this.mY[i4][i2];
            }
            int i5 = i4 + 1;
            double d8 = dArr2[i5];
            if (d2 < d8) {
                double d9 = d8 - d7;
                double d10 = d2 - d7;
                double[][] dArr3 = this.mY;
                double d11 = dArr3[i4][i2];
                double d12 = dArr3[i5][i2];
                double[][] dArr4 = this.mTangent;
                return interpolate(d9, d10 / d9, d11, d12, dArr4[i4][i2], dArr4[i5][i2]);
            }
            i4 = i5;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }
}
