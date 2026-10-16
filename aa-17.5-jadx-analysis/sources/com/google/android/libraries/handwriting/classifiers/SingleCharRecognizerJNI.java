package com.google.android.libraries.handwriting.classifiers;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.handwriting.base.Util;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class SingleCharRecognizerJNI extends HandwritingRecognizer {
    private static final String TAG = "HWRCharRecoJNI";
    private boolean sendingFeedback = true;
    protected final SingleCharacterRecognizerSettings settings;
    private final long storage;

    public SingleCharRecognizerJNI(SingleCharacterRecognizerSettings singleCharacterRecognizerSettings, Context context) throws IOException {
        this.settings = singleCharacterRecognizerSettings;
        String str = singleCharacterRecognizerSettings.recognizerFile;
        if (str != null && str.length() > 0) {
            this.storage = initJNIFromFile(Util.maybeMakeFilenameFromUrl(context, str));
            return;
        }
        byte[] bArrBytesFromStream = Util.bytesFromStream(Util.openStream(singleCharacterRecognizerSettings.inkreader, context));
        if (!singleCharacterRecognizerSettings.classifierType.contentEquals("loglin")) {
            Log.e(TAG, "JNI classifier currently only knows loglin");
        }
        this.storage = initJNI(bArrBytesFromStream, Util.bytesFromStream(Util.openStream(singleCharacterRecognizerSettings.model, context)), singleCharacterRecognizerSettings.numResults);
    }

    private native int addAllowedClassesForLanguageJNI(long j, String str);

    private native int addAllowedClassesJNI(long j, String[] strArr);

    private native int addAllowedClassesRangeJNI(long j, int i, int i2);

    private native void clearAllowedClassesJNI(long j);

    private native void deinitJNI(long j);

    private native void gestureSearchJNI(long j, float[][][] fArr, int i, int i2, String[] strArr, float[] fArr2, boolean z);

    private native long initJNI(byte[] bArr, byte[] bArr2, int i);

    private native String[] recognizeJNI(long j, float[][][] fArr, int i, int i2, float[] fArr2);

    private native String[] supportedClassesJNI(long j);

    public int addAllowedClasses(CharSequence charSequence, CharSequence charSequence2) {
        return addAllowedClassesRangeJNI(this.storage, Character.codePointAt(charSequence, 0), Character.codePointAt(charSequence2, 0));
    }

    @ResultIgnorabilityUnspecified
    public int addAllowedClassesForLanguage(String str) {
        return addAllowedClassesForLanguageJNI(this.storage, str);
    }

    public void clearAllowedClasses() {
        clearAllowedClassesJNI(this.storage);
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void destroy() {
        deinitJNI(this.storage);
    }

    protected void finalize() throws Throwable {
        destroy();
        super.finalize();
    }

    public void gestureSearch(StrokeList strokeList, HandwritingRecognizer.CancelStruct cancelStruct, String[] strArr, float[] fArr, boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.storage;
        float[][][] fArrStrokesAsFloatArray = JNIHelpers.strokesAsFloatArray(strokeList);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        gestureSearchJNI(j, fArrStrokesAsFloatArray, strokeList.getWritingGuideWidth(), strokeList.getWritingGuideHeight(), strArr, fArr, z);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        Log.i(TAG, String.format("Copy: %d   Recognize: %d   Total: %d", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis)));
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public HandwritingRecognizer.HandwritingRecognizerSettings getSettings() {
        return this.settings;
    }

    protected native long initJNIFromAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor, long j, long j2);

    protected native long initJNIFromFile(String str);

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean isCloudRecognizer() {
        return false;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean isSendingFeedback() {
        return this.sendingFeedback && hasSecondaryRecognizer();
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public RecognitionResult recognize(StrokeList strokeList, HandwritingRecognizer.CancelStruct cancelStruct) {
        SingleCharacterRecognizerSettings singleCharacterRecognizerSettings = this.settings;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][][] fArrStrokesAsFloatArray = JNIHelpers.strokesAsFloatArray(strokeList);
        int i = singleCharacterRecognizerSettings.numResults;
        if (i == 0) {
            i = 20;
        }
        long j = this.storage;
        float[] fArr = new float[i];
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String[] strArrRecognizeJNI = recognizeJNI(j, fArrStrokesAsFloatArray, strokeList.getWritingGuideWidth(), strokeList.getWritingGuideHeight(), fArr);
        int length = strArrRecognizeJNI.length;
        SingleCharacterRecognizerSettings singleCharacterRecognizerSettings2 = this.settings;
        if (length > singleCharacterRecognizerSettings2.numResults) {
            singleCharacterRecognizerSettings2.numResults = length;
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        Log.i(TAG, String.format("Copy: %d   Recognize: %d   Total: %d", Long.valueOf(jCurrentTimeMillis2 - jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis2), Long.valueOf(jCurrentTimeMillis3 - jCurrentTimeMillis)));
        return new RecognitionResult(strArrRecognizeJNI, fArr);
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void setSendingFeedback(boolean z) {
        this.sendingFeedback = z;
    }

    public String[] supportedClasses() {
        return supportedClassesJNI(this.storage);
    }

    public int addAllowedClasses(String[] strArr) {
        return addAllowedClassesJNI(this.storage, strArr);
    }

    public SingleCharRecognizerJNI(SingleCharacterRecognizerSettings singleCharacterRecognizerSettings, AssetFileDescriptor assetFileDescriptor) {
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

    public SingleCharRecognizerJNI(InputStream inputStream, InputStream inputStream2, long j, String str, int i) throws IOException {
        SingleCharacterRecognizerSettings singleCharacterRecognizerSettings = new SingleCharacterRecognizerSettings();
        this.settings = singleCharacterRecognizerSettings;
        singleCharacterRecognizerSettings.numResults = i;
        singleCharacterRecognizerSettings.classifierType = str;
        singleCharacterRecognizerSettings.model = "from stream";
        singleCharacterRecognizerSettings.inkreader = "from stream";
        byte[] bArrBytesFromStream = Util.bytesFromStream(inputStream);
        if (!str.contentEquals("loglin")) {
            Log.e(TAG, "JNI classifier currently only knows loglin");
        }
        this.storage = initJNI(bArrBytesFromStream, Util.bytesFromStream(inputStream2), i);
    }
}
