package com.google.android.libraries.handwriting.gui;

import android.view.View;

/* loaded from: classes3.dex */
public interface UndoButtonInterface {

    public enum UndoButtonState {
        NONE,
        BACK,
        UNDO
    }

    UndoButtonState getState();

    void setOnClickListener(View.OnClickListener onClickListener);

    void setState(UndoButtonState undoButtonState);
}
