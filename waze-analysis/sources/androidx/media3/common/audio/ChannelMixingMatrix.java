package androidx.media3.common.audio;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    public ChannelMixingMatrix(int i2, int i3, float[] fArr) {
        an.m(i2 > 0, "Input channel count must be positive.");
        an.m(i3 > 0, "Output channel count must be positive.");
        an.m(fArr.length == i2 * i3, "Coefficient array length is invalid.");
        this.inputChannelCount = i2;
        this.outputChannelCount = i3;
        checkCoefficientsValid(fArr);
        this.coefficients = fArr;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            while (i5 < i3) {
                float mixingCoefficient = getMixingCoefficient(i4, i5);
                boolean z4 = i4 == i5;
                if (mixingCoefficient != 1.0f && z4) {
                    z3 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z = false;
                    if (!z4) {
                        z2 = false;
                    }
                }
                i5++;
            }
            i4++;
        }
        this.isZero = z;
        boolean z5 = isSquare() && z2;
        this.isDiagonal = z5;
        this.isIdentity = z5 && z3;
    }

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (fArr[i2] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i2 + " is negative.");
            }
        }
        return fArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static float[] createConstantGainMixingCoefficients(int r3, int r4) {
        /*
            if (r3 != r4) goto L7
            float[] r3 = initializeIdentityMatrix(r4)
            return r3
        L7:
            r0 = 2
            r1 = 1
            if (r3 != r1) goto L11
            if (r4 != r0) goto L10
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L17
        L10:
            r3 = r1
        L11:
            if (r3 != r0) goto L1f
            if (r4 != r1) goto L20
            r3 = 1056964608(0x3f000000, float:0.5)
        L17:
            float[] r4 = new float[r0]
            r0 = 0
            r4[r0] = r3
            r4[r1] = r3
            return r4
        L1f:
            r0 = r3
        L20:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Default channel mixing coefficients for "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "->"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = " are not yet implemented."
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.audio.ChannelMixingMatrix.createConstantGainMixingCoefficients(int, int):float[]");
    }

    private static float[] createConstantPowerMixingCoefficients(int i2, int i3) {
        if (i3 == 1) {
            return getConstantPowerCoefficientsToMono(i2);
        }
        if (i3 == 2) {
            return getConstantPowerCoefficientsToStereo(i2);
        }
        if (i2 == i3) {
            return initializeIdentityMatrix(i3);
        }
        throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i2 + "->" + i3 + " are not implemented.");
    }

    public static ChannelMixingMatrix createForConstantGain(int i2, int i3) {
        return new ChannelMixingMatrix(i2, i3, createConstantGainMixingCoefficients(i2, i3));
    }

    public static ChannelMixingMatrix createForConstantPower(int i2, int i3) {
        return new ChannelMixingMatrix(i2, i3, createConstantPowerMixingCoefficients(i2, i3));
    }

    private static float[] getConstantPowerCoefficientsToMono(int i2) {
        switch (i2) {
            case 1:
                return new float[]{1.0f};
            case 2:
                return new float[]{0.7071f, 0.7071f};
            case 3:
                return new float[]{0.7071f, 0.7071f, 1.0f};
            case 4:
                return new float[]{0.7071f, 0.7071f, 0.5f, 0.5f};
            case 5:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.5f, 0.5f};
            case 6:
                return new float[]{0.7071f, 0.7071f, 1.0f, 0.7071f, 0.5f, 0.5f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i2 + "->1 are not implemented.");
        }
    }

    private static float[] getConstantPowerCoefficientsToStereo(int i2) {
        switch (i2) {
            case 1:
                return new float[]{0.7071f, 0.7071f};
            case 2:
                return new float[]{1.0f, 0.0f, 0.0f, 1.0f};
            case 3:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 1.0f, 0.7071f};
            case 4:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.0f, 0.7071f};
            case 5:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.0f, 0.7071f};
            case 6:
                return new float[]{1.0f, 0.0f, 0.7071f, 0.5f, 0.7071f, 0.0f, 0.0f, 1.0f, 0.7071f, 0.5f, 0.0f, 0.7071f};
            default:
                throw new UnsupportedOperationException("Default constant power channel mixing coefficients for " + i2 + "->2 are not implemented.");
        }
    }

    private static float[] initializeIdentityMatrix(int i2) {
        float[] fArr = new float[i2 * i2];
        for (int i3 = 0; i3 < i2; i3++) {
            fArr[(i2 * i3) + i3] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i2, int i3) {
        return this.coefficients[(i2 * this.outputChannelCount) + i3];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        return this.inputChannelCount == this.outputChannelCount;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public ChannelMixingMatrix scaleBy(float f2) {
        float[] fArr = new float[this.coefficients.length];
        int i2 = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i2 >= fArr2.length) {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
            fArr[i2] = fArr2[i2] * f2;
            i2++;
        }
    }
}
