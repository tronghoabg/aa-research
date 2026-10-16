package org.apache.tika.detect;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class NNTrainedModel extends TrainedModel {
    private final float[][] Theta1;
    private final float[][] Theta2;
    private final int numOfHidden;
    private final int numOfInputs;
    private final int numOfOutputs;

    public NNTrainedModel(int i5, int i10, int i11, float[] fArr) {
        this.numOfInputs = i5;
        this.numOfHidden = i10;
        this.numOfOutputs = i11;
        Class cls = Float.TYPE;
        this.Theta1 = (float[][]) Array.newInstance((Class<?>) cls, i10, i5 + 1);
        this.Theta2 = (float[][]) Array.newInstance((Class<?>) cls, i11, i10 + 1);
        populateThetas(fArr);
    }

    private void populateThetas(float[] fArr) {
        float[][] fArr2 = this.Theta1;
        int length = fArr2.length;
        int length2 = fArr2[0].length;
        int i5 = 0;
        for (int i10 = 0; i10 < length2; i10++) {
            for (int i11 = 0; i11 < length; i11++) {
                this.Theta1[i11][i10] = fArr[i5];
                i5++;
            }
        }
        float[][] fArr3 = this.Theta2;
        int length3 = fArr3.length;
        int length4 = fArr3[0].length;
        for (int i12 = 0; i12 < length4; i12++) {
            for (int i13 = 0; i13 < length3; i13++) {
                this.Theta2[i13][i12] = fArr[i5];
                i5++;
            }
        }
    }

    @Override // org.apache.tika.detect.TrainedModel
    public double predict(double[] dArr) {
        return 0.0d;
    }

    @Override // org.apache.tika.detect.TrainedModel
    public float predict(float[] fArr) {
        float[][] fArr2 = this.Theta1;
        int length = fArr2.length;
        int length2 = fArr2[0].length;
        float[] fArr3 = new float[length + 1];
        fArr3[0] = 1.0f;
        int i5 = 0;
        while (true) {
            double d3 = 0.0d;
            if (i5 >= length) {
                break;
            }
            for (int i10 = 0; i10 < length2; i10++) {
                d3 += this.Theta1[i5][i10] * fArr[i10];
            }
            i5++;
            fArr3[i5] = (float) (1.0d / (Math.exp(-d3) + 1.0d));
        }
        float[][] fArr4 = this.Theta2;
        int length3 = fArr4.length;
        int length4 = fArr4[0].length;
        float[] fArr5 = new float[length3];
        for (int i11 = 0; i11 < length3; i11++) {
            double d5 = 0.0d;
            for (int i12 = 0; i12 < length4; i12++) {
                d5 += this.Theta2[i11][i12] * fArr3[i12];
            }
            fArr5[i11] = (float) (1.0d / (Math.exp(-d5) + 1.0d));
        }
        return fArr5[0];
    }
}
