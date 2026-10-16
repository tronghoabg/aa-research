package com.google.android.libraries.handwriting.base;

/* JADX INFO: loaded from: classes3.dex */
public class DummyRecognizer extends com.google.android.libraries.handwriting.base.HandwritingRecognizer {
    private static final com.google.android.libraries.handwriting.base.HandwritingRecognizer.HandwritingRecognizerSettings settings = new com.google.android.libraries.handwriting.base.HandwritingRecognizer.HandwritingRecognizerSettings();

    public DummyRecognizer() {
        this(null);
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public com.google.android.libraries.handwriting.base.HandwritingRecognizer.HandwritingRecognizerSettings getSettings() {
        return settings;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean isCloudRecognizer() {
        return false;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public boolean isSendingFeedback() {
        return false;
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public com.google.android.libraries.handwriting.base.RecognitionResult recognize(com.google.android.libraries.handwriting.base.StrokeList strokeList, com.google.android.libraries.handwriting.base.HandwritingRecognizer.CancelStruct cancelStruct) {
        return null;
    }

    public DummyRecognizer(defpackage.abxz abxzVar) {
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void setSendingFeedback(boolean z) {
    }
}
