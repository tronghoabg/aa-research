package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public interface RecognizerClient {
    void clear();

    void confirmFirstCandidate();

    void delete();

    void errorMessage(int i, java.lang.Exception exc, java.lang.String str);

    java.lang.String getPostContext();

    java.lang.String getPreContext();

    void initializing();

    boolean isShowDebugInfo();

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    boolean onGoBacktoPreviousRecognition();

    void onInitialized(boolean z);

    void onLastStrokeWasRemoved();

    void onRecognitionEnd(com.google.android.libraries.handwriting.base.RecognitionResult recognitionResult, int i, boolean z);

    void setStatusText(java.lang.String str);

    void space();
}
