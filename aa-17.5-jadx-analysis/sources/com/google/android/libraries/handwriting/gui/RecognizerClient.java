package com.google.android.libraries.handwriting.gui;

import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public interface RecognizerClient {
    void clear();

    void confirmFirstCandidate();

    void delete();

    void errorMessage(int i, Exception exc, String str);

    String getPostContext();

    String getPreContext();

    void initializing();

    boolean isShowDebugInfo();

    @ResultIgnorabilityUnspecified
    boolean onGoBacktoPreviousRecognition();

    void onInitialized(boolean z);

    void onLastStrokeWasRemoved();

    void onRecognitionEnd(RecognitionResult recognitionResult, int i, boolean z);

    void setStatusText(String str);

    void space();
}
