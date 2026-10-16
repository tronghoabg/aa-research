package com.google.android.gms.car.input;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public interface CarEditable {
    InputConnection onCreateInputConnection(EditorInfo editorInfo);

    void setCarEditableListener(CarEditableListener carEditableListener);

    void setInputEnabled(boolean z);
}
