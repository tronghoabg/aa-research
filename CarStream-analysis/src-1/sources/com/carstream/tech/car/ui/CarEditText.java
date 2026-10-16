package com.carstream.tech.car.ui;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.google.android.gms.car.input.CarEditable;
import com.google.android.gms.car.input.CarEditableListener;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public class CarEditText extends EditText implements CarEditable {
    public CarEditableListener a;
    public boolean b;

    public CarEditText(Context context) {
        super(context);
        this.b = true;
    }

    @Override // android.widget.TextView, android.view.View, com.google.android.gms.car.input.CarEditable
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.b) {
            return super.onCreateInputConnection(editorInfo);
        }
        return null;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        CarEditableListener carEditableListener = this.a;
        if (carEditableListener != null) {
            carEditableListener.onUpdateSelection(i, i2, i, i2);
        }
    }

    @Override // com.google.android.gms.car.input.CarEditable
    public final void setCarEditableListener(CarEditableListener carEditableListener) {
        this.a = carEditableListener;
    }

    @Override // com.google.android.gms.car.input.CarEditable
    public final void setInputEnabled(boolean z) {
        this.b = z;
    }
}
