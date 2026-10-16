package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class StepCurve extends Easing {
    private static final boolean DEBUG = false;
    MonotonicCurveFit mCurveFit;

    StepCurve(String str) {
        this.mStr = str;
        double[] dArr = new double[this.mStr.length() >> 1];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (iIndexOf2 == -1) {
                dArr[i2] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
                this.mCurveFit = genSpline(Arrays.copyOf(dArr, i3));
                return;
            } else {
                dArr[i2] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i2 = i3;
            }
        }
    }

    private static MonotonicCurveFit genSpline(double[] dArr) {
        int length = dArr.length;
        int i2 = length * 3;
        int i3 = length - 1;
        int i4 = i2 - 2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i4, 1);
        double[] dArr3 = new double[i4];
        for (int i5 = 0; i5 < dArr.length; i5++) {
            double d2 = 1.0d / i3;
            double d3 = dArr[i5];
            int i6 = i5 + i3;
            dArr2[i6][0] = d3;
            double d4 = i5 * d2;
            dArr3[i6] = d4;
            if (i5 > 0) {
                int i7 = i3 + i3 + i5;
                dArr2[i7][0] = d3 + 1.0d;
                dArr3[i7] = 1.0d + d4;
                int i8 = i5 - 1;
                dArr2[i8][0] = (d3 - 1.0d) - d2;
                dArr3[i8] = (d4 - 1.0d) - d2;
            }
        }
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        System.out.println(" 0 " + monotonicCurveFit.getPos(AudioStats.AUDIO_AMPLITUDE_NONE, 0));
        System.out.println(" 1 " + monotonicCurveFit.getPos(1.0d, 0));
        return monotonicCurveFit;
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double get(double d2) {
        return this.mCurveFit.getPos(d2, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double getDiff(double d2) {
        return this.mCurveFit.getSlope(d2, 0);
    }

    private static MonotonicCurveFit genSpline(String str) {
        String[] strArrSplit = str.split("\\s+");
        int length = strArrSplit.length;
        double[] dArr = new double[length];
        for (int i2 = 0; i2 < length; i2++) {
            dArr[i2] = Double.parseDouble(strArrSplit[i2]);
        }
        return genSpline(dArr);
    }
}
