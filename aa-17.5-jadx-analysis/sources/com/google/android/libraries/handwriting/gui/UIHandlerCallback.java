package com.google.android.libraries.handwriting.gui;

import android.content.Context;
import android.view.inputmethod.InputConnection;

/* loaded from: classes3.dex */
public interface UIHandlerCallback {
    void cloudRecognitionFailed();

    boolean ensureUserHasAcceptedTOS();

    Context getContext();

    InputConnection getCurrentInputConnection();

    String getSourceTextToTranslate();

    void handleBackspace();

    boolean replaceLastCharacter(CharSequence charSequence);

    void sendKeyChar(char c);

    void switchToNextInputMethod();

    void toggleEmojiMode();
}
