package com.google.android.libraries.handwriting.gui;

/* JADX INFO: loaded from: classes3.dex */
public interface UndoButtonInterface {

    public enum UndoButtonState {
        NONE,
        BACK,
        UNDO
    }

    com.google.android.libraries.handwriting.gui.UndoButtonInterface.UndoButtonState getState();

    void setOnClickListener(android.view.View.OnClickListener onClickListener);

    void setState(com.google.android.libraries.handwriting.gui.UndoButtonInterface.UndoButtonState undoButtonState);
}
