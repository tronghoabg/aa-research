package com.google.android.libraries.handwriting.classifiers;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HandwritingRecognizerJNI extends com.google.android.libraries.handwriting.base.HandwritingRecognizer {
    private static final java.lang.String TAG = "HWRRecoJNI";
    private boolean sendingFeedback = true;
    protected long storage;

    protected static class JNIResult {
        java.lang.String[] results;
        float[] scores;
        int[][][][] segmentationPoints;
        java.lang.String[][] segmentationStrings;

        protected JNIResult() {
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(java.lang.String.format(java.util.Locale.ROOT, "results.length:%d \n", java.lang.Integer.valueOf(this.results.length)));
            sb.append(java.lang.String.format(java.util.Locale.ROOT, "scores.length:%d \n", java.lang.Integer.valueOf(this.scores.length)));
            sb.append(java.lang.String.format(java.util.Locale.ROOT, "segmentationStrings.length:%d \n", java.lang.Integer.valueOf(this.segmentationStrings.length)));
            sb.append(java.lang.String.format(java.util.Locale.ROOT, "segmentationPoints.length:%d \n", java.lang.Integer.valueOf(this.segmentationPoints.length)));
            for (int i = 0; i < this.results.length; i++) {
                sb.append(java.lang.String.format(java.util.Locale.ROOT, "Result %d: %s %f \n", java.lang.Integer.valueOf(i), this.results[i], java.lang.Float.valueOf(this.scores[i])));
                sb.append(java.lang.String.format(java.util.Locale.ROOT, "num_segments: %d\n", java.lang.Integer.valueOf(this.segmentationStrings[i].length)));
                sb.append("segmentation: \n");
                int i2 = 0;
                while (true) {
                    java.lang.String[] strArr = this.segmentationStrings[i];
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
        android.util.Log.i(TAG, toString() + ".destroy() storage: " + this.storage);
        long j = this.storage;
        if (j == 0) {
            return;
        }
        deinitJNI(j);
        this.storage = 0L;
    }

    protected void finalize() throws java.lang.Throwable {
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
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public com.google.android.libraries.handwriting.base.RecognitionResult recognize(com.google.android.libraries.handwriting.base.StrokeList strokeList, com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct cancelStruct) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        float[][][] fArrStrokesAsFloatArray = com.google.android.libraries.handwriting.classifiers.JNIHelpers.strokesAsFloatArray(strokeList);
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        com.google.android.libraries.handwriting.classifiers.HandwritingRecognizerJNI.JNIResult jNIResult = new com.google.android.libraries.handwriting.classifiers.HandwritingRecognizerJNI.JNIResult();
        recognizeJNI(this.storage, fArrStrokesAsFloatArray, strokeList.getWritingGuideWidth(), strokeList.getWritingGuideHeight(), strokeList.getPreContext(), strokeList.getInputType(), jNIResult);
        long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
        com.google.android.libraries.handwriting.base.LogV.i(2, TAG, java.lang.String.format(java.util.Locale.ROOT, "Copy: %d   Recognize: %d   Total: %d", java.lang.Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), java.lang.Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2), java.lang.Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis)));
        return new com.google.android.libraries.handwriting.base.RecognitionResult(jNIResult.results, jNIResult.scores, jNIResult.segmentationStrings, jNIResult.segmentationPoints);
    }

    protected abstract void recognizeJNI(long j, float[][][] fArr, int i, int i2, java.lang.String str, java.lang.String str2, com.google.android.libraries.handwriting.classifiers.HandwritingRecognizerJNI.JNIResult jNIResult);

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void setSendingFeedback(boolean z) {
        this.sendingFeedback = z;
    }
}
