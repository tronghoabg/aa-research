package com.google.android.libraries.handwriting.classifiers;

import android.util.Log;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.LogV;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class HandwritingRecognizerJNI extends HandwritingRecognizer {
    private static final String TAG = "HWRRecoJNI";
    private boolean sendingFeedback = true;
    protected long storage;

    protected static class JNIResult {
        String[] results;
        float[] scores;
        int[][][][] segmentationPoints;
        String[][] segmentationStrings;

        protected JNIResult() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(Locale.ROOT, "results.length:%d \n", Integer.valueOf(this.results.length)));
            sb.append(String.format(Locale.ROOT, "scores.length:%d \n", Integer.valueOf(this.scores.length)));
            sb.append(String.format(Locale.ROOT, "segmentationStrings.length:%d \n", Integer.valueOf(this.segmentationStrings.length)));
            sb.append(String.format(Locale.ROOT, "segmentationPoints.length:%d \n", Integer.valueOf(this.segmentationPoints.length)));
            for (int i = 0; i < this.results.length; i++) {
                sb.append(String.format(Locale.ROOT, "Result %d: %s %f \n", Integer.valueOf(i), this.results[i], Float.valueOf(this.scores[i])));
                sb.append(String.format(Locale.ROOT, "num_segments: %d\n", Integer.valueOf(this.segmentationStrings[i].length)));
                sb.append("segmentation: \n");
                int i2 = 0;
                while (true) {
                    String[] strArr = this.segmentationStrings[i];
                    if (i2 < strArr.length) {
                        sb.append(strArr[i2]);
                        sb.append(" : ");
                        for (int i3 = 0; i3 < this.segmentationPoints[i][i2].length; i3++) {
                            sb.append("(s=");
                            sb.append(this.segmentationPoints[i][i2][i3][0]);
                            sb.append(" p=");
                            sb.append(this.segmentationPoints[i][i2][i3][1]);
                            sb.append(")-(s=");
                            sb.append(this.segmentationPoints[i][i2][i3][2]);
                            sb.append(" p=");
                            sb.append(this.segmentationPoints[i][i2][i3][3]);
                            sb.append(") ");
                        }
                        sb.append("\n");
                        i2++;
                    }
                }
                sb.append("\n");
            }
            return sb.toString();
        }
    }

    public abstract void deinitJNI(long j);

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void destroy() {
        Log.i(TAG, toString() + ".destroy() storage: " + this.storage);
        long j = this.storage;
        if (j == 0) {
            return;
        }
        deinitJNI(j);
        this.storage = 0L;
    }

    protected void finalize() throws Throwable {
        destroy();
        super.finalize();
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean isCloudRecognizer() {
        return false;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean isSendingFeedback() {
        return this.sendingFeedback && hasSecondaryRecognizer();
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    @ResultIgnorabilityUnspecified
    public RecognitionResult recognize(StrokeList strokeList, HandwritingRecognizer.CancelStruct cancelStruct) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][][] fArrStrokesAsFloatArray = JNIHelpers.strokesAsFloatArray(strokeList);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        JNIResult jNIResult = new JNIResult();
        recognizeJNI(this.storage, fArrStrokesAsFloatArray, strokeList.getWritingGuideWidth(), strokeList.getWritingGuideHeight(), strokeList.getPreContext(), strokeList.getInputType(), jNIResult);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        LogV.i(2, TAG, String.format(Locale.ROOT, "Copy: %d   Recognize: %d   Total: %d", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis)));
        return new RecognitionResult(jNIResult.results, jNIResult.scores, jNIResult.segmentationStrings, jNIResult.segmentationPoints);
    }

    protected abstract void recognizeJNI(long j, float[][][] fArr, int i, int i2, String str, String str2, JNIResult jNIResult);

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void setSendingFeedback(boolean z) {
        this.sendingFeedback = z;
    }
}
