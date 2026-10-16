package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class LinearCurveFit extends CurveFit {
    private static final String TAG = "LinearCurveFit";
    private boolean mExtrapolate = true;
    double[] mSlopeTemp;
    private double[] mT;
    private double mTotalLength;
    private double[][] mY;

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.mTotalLength = Double.NaN;
        int length = dArr2[0].length;
        this.mSlopeTemp = new double[length];
        this.mT = dArr;
        this.mY = dArr2;
        if (length <= 2) {
            return;
        }
        int i2 = 0;
        double d2 = 0.0d;
        while (true) {
            double d3 = d2;
            if (i2 >= dArr.length) {
                this.mTotalLength = AudioStats.AUDIO_AMPLITUDE_NONE;
                return;
            }
            double d4 = dArr2[i2][0];
            if (i2 > 0) {
                Math.hypot(d4 - d2, d4 - d3);
            }
            i2++;
            d2 = d4;
        }
    }

    private double getLength2D(double d2) {
        if (Double.isNaN(this.mTotalLength)) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        double[] dArr = this.mT;
        int length = dArr.length;
        if (d2 <= dArr[0]) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        int i2 = length - 1;
        if (d2 >= dArr[i2]) {
            return this.mTotalLength;
        }
        double dHypot = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i3 = 0;
        while (i3 < i2) {
            double[] dArr2 = this.mY[i3];
            double d5 = dArr2[0];
            double d6 = dArr2[1];
            if (i3 > 0) {
                dHypot += Math.hypot(d5 - d3, d6 - d4);
            }
            double[] dArr3 = this.mT;
            double d7 = dArr3[i3];
            if (d2 == d7) {
                return dHypot;
            }
            int i4 = i3 + 1;
            double d8 = dArr3[i4];
            if (d2 < d8) {
                double[][] dArr4 = this.mY;
                double[] dArr5 = dArr4[i3];
                double d9 = dArr5[0];
                double[] dArr6 = dArr4[i4];
                double d10 = dArr6[0];
                double d11 = dArr5[1];
                double d12 = dArr6[1];
                double d13 = (d2 - d7) / (d8 - d7);
                double d14 = 1.0d - d13;
                return dHypot + Math.hypot(d6 - ((d11 * d14) + (d12 * d13)), d5 - ((d9 * d14) + (d10 * d13)));
            }
            i3 = i4;
            d3 = d5;
            d4 = d6;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
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
                    double d9 = d8 / d7;
                    double[][] dArr3 = this.mY;
                    fArr[i3] = (float) ((dArr3[i6][i3] * (1.0d - d9)) + (dArr3[i8][i3] * d9));
                    i3++;
                }
                return;
            }
            i6 = i8;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0011 A[PHI: r4
  0x0011: PHI (r4v3 double) = (r4v0 double), (r4v1 double) binds: [B:3:0x000f, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getSlope(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.mT
            int r1 = r0.length
            int r1 = r1 + (-1)
            double[][] r2 = r12.mY
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L13
        L11:
            r13 = r4
            goto L1a
        L13:
            r4 = r0[r1]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto L11
        L1a:
            r0 = r3
        L1b:
            if (r0 >= r1) goto L3f
            double[] r4 = r12.mT
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L3d
            r13 = r4[r0]
            double r6 = r6 - r13
        L2a:
            if (r3 >= r2) goto L3f
            double[][] r13 = r12.mY
            r14 = r13[r0]
            r8 = r14[r3]
            r13 = r13[r5]
            r10 = r13[r3]
            double r10 = r10 - r8
            double r10 = r10 / r6
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2a
        L3d:
            r0 = r5
            goto L1b
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.LinearCurveFit.getSlope(double, double[]):void");
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] getTimePoints() {
        return this.mT;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000c A[PHI: r3
  0x000c: PHI (r3v3 double) = (r3v0 double), (r3v1 double) binds: [B:3:0x000a, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double getSlope(double r8, int r10) {
        /*
            r7 = this;
            double[] r0 = r7.mT
            int r1 = r0.length
            int r1 = r1 + (-1)
            r2 = 0
            r3 = r0[r2]
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 >= 0) goto Le
        Lc:
            r8 = r3
            goto L15
        Le:
            r3 = r0[r1]
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L15
            goto Lc
        L15:
            if (r2 >= r1) goto L33
            double[] r0 = r7.mT
            int r3 = r2 + 1
            r4 = r0[r3]
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 <= 0) goto L23
            r2 = r3
            goto L15
        L23:
            r8 = r0[r2]
            double r4 = r4 - r8
            double[][] r7 = r7.mY
            r8 = r7[r2]
            r0 = r8[r10]
            r7 = r7[r3]
            r8 = r7[r10]
            double r8 = r8 - r0
            double r8 = r8 / r4
            return r8
        L33:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.motion.utils.LinearCurveFit.getSlope(double, int):double");
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
                    double d9 = d8 / d7;
                    double[][] dArr4 = this.mY;
                    dArr[i3] = (dArr4[i6][i3] * (1.0d - d9)) + (dArr4[i8][i3] * d9);
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
                double[][] dArr3 = this.mY;
                double d9 = (d2 - d7) / (d8 - d7);
                return (dArr3[i4][i2] * (1.0d - d9)) + (dArr3[i5][i2] * d9);
            }
            i4 = i5;
        }
        return AudioStats.AUDIO_AMPLITUDE_NONE;
    }
}
