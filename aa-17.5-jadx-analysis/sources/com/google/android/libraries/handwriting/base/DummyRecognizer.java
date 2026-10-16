package com.google.android.libraries.handwriting.base;

import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import defpackage.abww;

/* loaded from: classes3.dex */
public class DummyRecognizer extends HandwritingRecognizer {
    private static final HandwritingRecognizer.HandwritingRecognizerSettings settings = new HandwritingRecognizer.HandwritingRecognizerSettings();

    public DummyRecognizer() {
        this(null);
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public HandwritingRecognizer.HandwritingRecognizerSettings getSettings() {
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
    public RecognitionResult recognize(StrokeList strokeList, HandwritingRecognizer.CancelStruct cancelStruct) {
        return null;
    }

    public DummyRecognizer(abww abwwVar) {
    }

    @Override // com.google.android.libraries.handwriting.base.HandwritingRecognizer
    public void setSendingFeedback(boolean z) {
    }
}
