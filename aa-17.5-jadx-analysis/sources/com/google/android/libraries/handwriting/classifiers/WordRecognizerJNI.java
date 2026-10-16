package com.google.android.libraries.handwriting.classifiers;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.util.Log;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.Stroke;
import com.google.android.libraries.handwriting.base.Util;
import com.google.android.libraries.handwriting.classifiers.HandwritingRecognizerJNI;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.a;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public class WordRecognizerJNI extends HandwritingRecognizerJNI {
    private static final String TAG = "HWRWordRecoJNI";
    protected final WordRecognizerJNISettings settings;
    private long t0;

    public WordRecognizerJNI(WordRecognizerJNISettings wordRecognizerJNISettings, Context context) throws IOException {
        long size;
        FileInputStream fileInputStream;
        long size2;
        Log.i(TAG, "Creating (settings, context): ".concat(toString()));
        this.settings = wordRecognizerJNISettings;
        String str = wordRecognizerJNISettings.recognizerFile;
        if (str == null) {
            this.storage = 0L;
            throw new IOException("Settings have neither a spec nor a file.");
        }
        String strMaybeMakeFilenameFromUrl = Util.maybeMakeFilenameFromUrl(context, str);
        String strMaybeMakeFilenameFromUrl2 = Util.maybeMakeFilenameFromUrl(context, wordRecognizerJNISettings.languageModelFile);
        String strMaybeMakeFilenameFromUrl3 = Util.maybeMakeFilenameFromUrl(context, wordRecognizerJNISettings.wordlistFile);
        if (!new File(strMaybeMakeFilenameFromUrl).exists()) {
            throw new IOException(String.valueOf(strMaybeMakeFilenameFromUrl).concat(" does not exist."));
        }
        FileInputStream fileInputStream2 = new FileInputStream(strMaybeMakeFilenameFromUrl);
        FileInputStream fileInputStream3 = null;
        if (strMaybeMakeFilenameFromUrl2 != null) {
            fileInputStream = new FileInputStream(strMaybeMakeFilenameFromUrl2);
            size = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size();
        } else {
            size = 0;
            fileInputStream = null;
        }
        if (strMaybeMakeFilenameFromUrl3 != null) {
            fileInputStream3 = new FileInputStream(strMaybeMakeFilenameFromUrl3);
            size2 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream3.getChannel()).size();
        } else {
            size2 = 0;
        }
        FileInputStream fileInputStream4 = fileInputStream3;
        FileInputStream fileInputStream5 = fileInputStream;
        this.storage = initJNIFromFileInputStream(fileInputStream2, 0L, DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream2.getChannel()).size(), fileInputStream5, 0L, size, fileInputStream4, 0L, size2, wordRecognizerJNISettings.languageCodeOverride, wordRecognizerJNISettings.deviceType);
        fileInputStream2.close();
        if (fileInputStream5 != null) {
            fileInputStream5.close();
        }
        if (fileInputStream4 != null) {
            fileInputStream4.close();
        }
        long j = this.storage;
        if (j == 0) {
            throw new IOException("Couldn't initialize recognizer from ".concat(String.valueOf(strMaybeMakeFilenameFromUrl)));
        }
        Log.i(TAG, a.bN(j, "storage = "));
    }

    private native void addStroke(long j, long j2, float[][] fArr);

    private native void decode(long j, long j2, HandwritingRecognizerJNI.JNIResult jNIResult);

    private native void finalizeRecognition(long j, long j2);

    private native long getLattice(long j, long j2);

    private native long getLatticeInterface(long j, long j2);

    private native void setCustomCharacterRestriction(long j, String str, String str2);

    private native long startRecognition(long j, int i, int i2, String str);

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void addStroke(long j, Stroke stroke) {
        if (this.t0 == -1 && !stroke.isEmpty()) {
            this.t0 = stroke.get(0).t;
        }
        addStroke(this.storage, j, JNIHelpers.strokeAsFloatArray(stroke, this.t0));
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    @ResultIgnorabilityUnspecified
    public RecognitionResult decode(long j) {
        HandwritingRecognizerJNI.JNIResult jNIResult = new HandwritingRecognizerJNI.JNIResult();
        decode(this.storage, j, jNIResult);
        return new RecognitionResult(jNIResult.results, jNIResult.scores);
    }

    @Override // com.google.android.libraries.handwriting.classifiers.HandwritingRecognizerJNI
    public native void deinitJNI(long j);

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void finalizeRecognition(long j) {
        finalizeRecognition(this.storage, j);
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public long getLattice(long j) {
        return getLattice(this.storage, j);
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public long getLatticeInterface(long j) {
        return getLatticeInterface(this.storage, j);
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public HandwritingRecognizer.HandwritingRecognizerSettings getSettings() {
        return this.settings;
    }

    protected native long initJNICompiledInputToolsNativePointer(String str, String str2, long j);

    protected native long initJNIFromAssetFileDescriptor(AssetFileDescriptor assetFileDescriptor, long j, long j2, AssetFileDescriptor assetFileDescriptor2, long j3, long j4, AssetFileDescriptor assetFileDescriptor3, long j5, long j6, String str, int i);

    protected native long initJNIFromAssetFileDescriptorForI18n(AssetFileDescriptor assetFileDescriptor, long j, long j2);

    protected native long initJNIFromFileInputStream(FileInputStream fileInputStream, long j, long j2, FileInputStream fileInputStream2, long j3, long j4, FileInputStream fileInputStream3, long j5, long j6, String str, int i);

    protected native long initJNIFromFileInputStreamForI18n(FileInputStream fileInputStream, long j, long j2);

    @Override // com.google.android.libraries.handwriting.classifiers.HandwritingRecognizerJNI
    protected native void recognizeJNI(long j, float[][][] fArr, int i, int i2, String str, String str2, HandwritingRecognizerJNI.JNIResult jNIResult);

    public void setCustomCharacterRestriction(String str, String str2) {
        setCustomCharacterRestriction(this.storage, str, str2);
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public long startRecognition(int i, int i2, String str) {
        this.t0 = -1L;
        return startRecognition(this.storage, i, i2, str);
    }

    public static class WordRecognizerJNISettings extends HandwritingRecognizer.HandwritingRecognizerSettings {
        final int deviceType;
        final String languageCodeOverride;
        final String languageModelFile;
        final String recognizerFile;
        final String wordlistFile;

        public WordRecognizerJNISettings(String str, String str2, String str3, String str4, HandwritingRecognizer.HandwritingRecognizerSettings.GBoardHandwritingRecognizerSettings gBoardHandwritingRecognizerSettings, int i) {
            this.recognizerFile = str;
            this.languageModelFile = str2;
            this.wordlistFile = str3;
            this.languageCodeOverride = str4;
            this.deviceType = i;
            this.gBoardHandwritingRecognizerSettings = gBoardHandwritingRecognizerSettings;
        }

        public WordRecognizerJNISettings(String str, String str2, String str3, String str4) {
            this(str, str2, str3, str4, null, 0);
        }

        public WordRecognizerJNISettings(String str, String str2, String str3, String str4, int i) {
            this(str, str2, str3, str4, null, i);
        }

        public WordRecognizerJNISettings(String str, String str2, String str3, String str4, HandwritingRecognizer.HandwritingRecognizerSettings.GBoardHandwritingRecognizerSettings gBoardHandwritingRecognizerSettings) {
            this(str, str2, str3, str4, gBoardHandwritingRecognizerSettings, 0);
        }

        public WordRecognizerJNISettings() {
            this((String) null, (String) null, (String) null, (String) null, (HandwritingRecognizer.HandwritingRecognizerSettings.GBoardHandwritingRecognizerSettings) null);
        }
    }

    public WordRecognizerJNI(WordRecognizerJNISettings wordRecognizerJNISettings, AssetFileDescriptor assetFileDescriptor) throws IOException {
        Log.i(TAG, "Creating (settings, reconame, pointer): ".concat(toString()));
        this.settings = wordRecognizerJNISettings;
        long jInitJNIFromAssetFileDescriptorForI18n = initJNIFromAssetFileDescriptorForI18n(assetFileDescriptor, assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        this.storage = jInitJNIFromAssetFileDescriptorForI18n;
        Log.i(TAG, "storage = " + jInitJNIFromAssetFileDescriptorForI18n);
    }

    public WordRecognizerJNI(WordRecognizerJNISettings wordRecognizerJNISettings, AssetFileDescriptor assetFileDescriptor, AssetFileDescriptor assetFileDescriptor2) {
        this(wordRecognizerJNISettings, assetFileDescriptor, assetFileDescriptor2, (AssetFileDescriptor) null);
    }

    public WordRecognizerJNI(WordRecognizerJNISettings wordRecognizerJNISettings, AssetFileDescriptor assetFileDescriptor, AssetFileDescriptor assetFileDescriptor2, AssetFileDescriptor assetFileDescriptor3) {
        long startOffset;
        long length;
        long startOffset2;
        long length2;
        long j;
        long length3;
        Log.i(TAG, "Creating (settings, fd, fd): ".concat(toString()));
        this.settings = wordRecognizerJNISettings;
        if (assetFileDescriptor != null) {
            startOffset = assetFileDescriptor.getStartOffset();
            length = assetFileDescriptor.getLength();
        } else {
            startOffset = 0;
            length = 0;
        }
        if (assetFileDescriptor2 != null) {
            startOffset2 = assetFileDescriptor2.getStartOffset();
            length2 = assetFileDescriptor2.getLength();
        } else {
            startOffset2 = 0;
            length2 = 0;
        }
        if (assetFileDescriptor3 != null) {
            long startOffset3 = assetFileDescriptor3.getStartOffset();
            length3 = assetFileDescriptor3.getLength();
            j = startOffset3;
        } else {
            j = 0;
            length3 = 0;
        }
        long jInitJNIFromAssetFileDescriptor = initJNIFromAssetFileDescriptor(assetFileDescriptor, startOffset, length, assetFileDescriptor2, startOffset2, length2, assetFileDescriptor3, j, length3, wordRecognizerJNISettings.languageCodeOverride, wordRecognizerJNISettings.deviceType);
        this.storage = jInitJNIFromAssetFileDescriptor;
        Log.i(TAG, "storage = " + jInitJNIFromAssetFileDescriptor);
    }

    public WordRecognizerJNI(WordRecognizerJNISettings wordRecognizerJNISettings, FileInputStream fileInputStream) throws IOException {
        Log.i(TAG, "Creating (settings, reconame, pointer): ".concat(toString()));
        this.settings = wordRecognizerJNISettings;
        long jInitJNIFromFileInputStreamForI18n = initJNIFromFileInputStreamForI18n(fileInputStream, 0L, DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel()).size());
        this.storage = jInitJNIFromFileInputStreamForI18n;
        Log.i(TAG, "storage = " + jInitJNIFromFileInputStreamForI18n);
    }

    public WordRecognizerJNI(WordRecognizerJNISettings wordRecognizerJNISettings, String str, String str2, long j) {
        Log.i(TAG, "Creating (settings, reconame, pointer): ".concat(toString()));
        this.settings = wordRecognizerJNISettings;
        long jInitJNICompiledInputToolsNativePointer = initJNICompiledInputToolsNativePointer(str, str2, j);
        this.storage = jInitJNICompiledInputToolsNativePointer;
        Log.i(TAG, "storage = " + jInitJNICompiledInputToolsNativePointer);
    }
}
