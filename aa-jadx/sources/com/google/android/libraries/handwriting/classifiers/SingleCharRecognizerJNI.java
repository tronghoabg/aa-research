package com.google.android.libraries.handwriting.classifiers;

/* JADX INFO: loaded from: classes3.dex */
public class SingleCharRecognizerJNI extends com.google.android.libraries.handwriting.base.HandwritingRecognizer {
    private static final java.lang.String TAG = "HWRCharRecoJNI";
    private boolean sendingFeedback = true;
    protected final com.google.android.libraries.handwriting.classifiers.SingleCharacterRecognizerSettings settings;
    private final long storage;

    public SingleCharRecognizerJNI(com.google.android.libraries.handwriting.classifiers.SingleCharacterRecognizerSettings singleCharacterRecognizerSettings, android.content.Context context) throws java.io.IOException {
        this.settings = singleCharacterRecognizerSettings;
        java.lang.String str = singleCharacterRecognizerSettings.recognizerFile;
        if (str != null && str.length() > 0) {
            this.storage = initJNIFromFile(com.google.android.libraries.handwriting.base.Util.maybeMakeFilenameFromUrl(context, str));
            return;
        }
        byte[] bArrBytesFromStream = com.google.android.libraries.handwriting.base.Util.bytesFromStream(com.google.android.libraries.handwriting.base.Util.openStream(singleCharacterRecognizerSettings.inkreader, context));
        if (!singleCharacterRecognizerSettings.classifierType.contentEquals("loglin")) {
            android.util.Log.e(TAG, "JNI classifier currently only knows loglin");
        }
        this.storage = initJNI(bArrBytesFromStream, com.google.android.libraries.handwriting.base.Util.bytesFromStream(com.google.android.libraries.handwriting.base.Util.openStream(singleCharacterRecognizerSettings.model, context)), singleCharacterRecognizerSettings.numResults);
    }

    private native int addAllowedClassesForLanguageJNI(long j, java.lang.String str);

    private native int addAllowedClassesJNI(long j, java.lang.String[] strArr);

    private native int addAllowedClassesRangeJNI(long j, int i, int i2);

    private native void clearAllowedClassesJNI(long j);

    private native void deinitJNI(long j);

    private native void gestureSearchJNI(long j, float[][][] fArr, int i, int i2, java.lang.String[] strArr, float[] fArr2, boolean z);

    private native long initJNI(byte[] bArr, byte[] bArr2, int i);

    private native java.lang.String[] recognizeJNI(long j, float[][][] fArr, int i, int i2, float[] fArr2);

    private native java.lang.String[] supportedClassesJNI(long j);

    public int addAllowedClasses(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        return addAllowedClassesRangeJNI(this.storage, java.lang.Character.codePointAt(charSequence, 0), java.lang.Character.codePointAt(charSequence2, 0));
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public int addAllowedClassesForLanguage(java.lang.String str) {
        return addAllowedClassesForLanguageJNI(this.storage, str);
    }

    public void clearAllowedClasses() {
        clearAllowedClassesJNI(this.storage);
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void destroy() {
        deinitJNI(this.storage);
    }

    protected void finalize() throws java.lang.Throwable {
        destroy();
        super.finalize();
    }

    public void gestureSearch(com.google.android.libraries.handwriting.base.StrokeList strokeList, com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct cancelStruct, java.lang.String[] strArr, float[] fArr, boolean z) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = this.storage;
        float[][][] fArrStrokesAsFloatArray = com.google.android.libraries.handwriting.classifiers.JNIHelpers.strokesAsFloatArray(strokeList);
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        gestureSearchJNI(j, fArrStrokesAsFloatArray, strokeList.getWritingGuideWidth(), strokeList.getWritingGuideHeight(), strArr, fArr, z);
        long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
        android.util.Log.i(TAG, java.lang.String.format("Copy: %d   Recognize: %d   Total: %d", java.lang.Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), java.lang.Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2), java.lang.Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis)));
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public com.google.android.libraries.handwriting.base.HandwritingRecognizer.HandwritingRecognizerSettings getSettings() {
        return this.settings;
    }

    protected native long initJNIFromAssetFileDescriptor(android.content.res.AssetFileDescriptor assetFileDescriptor, long j, long j2);

    protected native long initJNIFromFile(java.lang.String str);

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean isCloudRecognizer() {
        return false;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean isSendingFeedback() {
        return this.sendingFeedback && hasSecondaryRecognizer();
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public com.google.android.libraries.handwriting.base.RecognitionResult recognize(com.google.android.libraries.handwriting.base.StrokeList strokeList, com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct cancelStruct) {
        com.google.android.libraries.handwriting.classifiers.SingleCharacterRecognizerSettings singleCharacterRecognizerSettings = this.settings;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        float[][][] fArrStrokesAsFloatArray = com.google.android.libraries.handwriting.classifiers.JNIHelpers.strokesAsFloatArray(strokeList);
        int i = singleCharacterRecognizerSettings.numResults;
        if (i == 0) {
            i = 20;
        }
        long j = this.storage;
        float[] fArr = new float[i];
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.lang.String[] strArrRecognizeJNI = recognizeJNI(j, fArrStrokesAsFloatArray, strokeList.getWritingGuideWidth(), strokeList.getWritingGuideHeight(), fArr);
        int length = strArrRecognizeJNI.length;
        com.google.android.libraries.handwriting.classifiers.SingleCharacterRecognizerSettings singleCharacterRecognizerSettings2 = this.settings;
        if (length > singleCharacterRecognizerSettings2.numResults) {
            singleCharacterRecognizerSettings2.numResults = length;
        }
        long jCurrentTimeMillis3 = java.lang.System.currentTimeMillis();
        android.util.Log.i(TAG, java.lang.String.format("Copy: %d   Recognize: %d   Total: %d", java.lang.Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), java.lang.Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2), java.lang.Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis)));
        return new com.google.android.libraries.handwriting.base.RecognitionResult(strArrRecognizeJNI, fArr);
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void setSendingFeedback(boolean z) {
        this.sendingFeedback = z;
    }

    public java.lang.String[] supportedClasses() {
        return supportedClassesJNI(this.storage);
    }

    public int addAllowedClasses(java.lang.String[] strArr) {
        return addAllowedClassesJNI(this.storage, strArr);
    }

    public SingleCharRecognizerJNI(com.google.android.libraries.handwriting.classifiers.SingleCharacterRecognizerSettings singleCharacterRecognizerSettings, android.content.res.AssetFileDescriptor assetFileDescriptor) {
        long startOffset;
        long length;
        this.settings = singleCharacterRecognizerSettings;
        if (assetFileDescriptor != null) {
            startOffset = assetFileDescriptor.getStartOffset();
            length = assetFileDescriptor.getLength();
        } else {
            startOffset = 0;
            length = 0;
        }
        this.storage = initJNIFromAssetFileDescriptor(assetFileDescriptor, startOffset, length);
    }

    public SingleCharRecognizerJNI(java.io.InputStream inputStream, java.io.InputStream inputStream2, long j, java.lang.String str, int i) throws java.io.IOException {
        com.google.android.libraries.handwriting.classifiers.SingleCharacterRecognizerSettings singleCharacterRecognizerSettings = new com.google.android.libraries.handwriting.classifiers.SingleCharacterRecognizerSettings();
        this.settings = singleCharacterRecognizerSettings;
        singleCharacterRecognizerSettings.numResults = i;
        singleCharacterRecognizerSettings.classifierType = str;
        singleCharacterRecognizerSettings.model = "from stream";
        singleCharacterRecognizerSettings.inkreader = "from stream";
        byte[] bArrBytesFromStream = com.google.android.libraries.handwriting.base.Util.bytesFromStream(inputStream);
        if (!str.contentEquals("loglin")) {
            android.util.Log.e(TAG, "JNI classifier currently only knows loglin");
        }
        this.storage = initJNI(bArrBytesFromStream, com.google.android.libraries.handwriting.base.Util.bytesFromStream(inputStream2), i);
    }
}
