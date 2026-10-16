package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public interface UIHandlerCallback {
    void cloudRecognitionFailed();

    boolean ensureUserHasAcceptedTOS();

    android.content.Context getContext();

    android.view.inputmethod.InputConnection getCurrentInputConnection();

    java.lang.String getSourceTextToTranslate();

    void handleBackspace();

    boolean replaceLastCharacter(java.lang.CharSequence charSequence);

    void sendKeyChar(char c);

    void switchToNextInputMethod();

    void toggleEmojiMode();
}
