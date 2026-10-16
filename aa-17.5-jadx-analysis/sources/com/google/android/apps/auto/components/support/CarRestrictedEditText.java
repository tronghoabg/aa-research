package com.google.android.apps.auto.components.support;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import defpackage.lbf;
import defpackage.mof;
import defpackage.mog;
import defpackage.moh;
import defpackage.rly;
import defpackage.vw;

/* loaded from: classes2.dex */
public class CarRestrictedEditText extends EditText implements rly {
    public moh a;
    private int b;
    private int c;
    private vw d;

    public CarRestrictedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
        setInputType(getInputType() | 524288);
        setTextIsSelectable(false);
        setLongClickable(false);
        setSelection(getText().length());
        setOnEditorActionListener(new lbf(this, 2));
        setCustomSelectionActionModeCallback(new mof(0));
    }

    @Override // defpackage.rly
    public final void a(vw vwVar) {
        this.d = vwVar;
    }

    @Override // android.widget.TextView, android.view.View, defpackage.rly
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return new mog(this, super.onCreateInputConnection(editorInfo));
    }

    @Override // android.widget.TextView
    protected final void onSelectionChanged(int i, int i2) {
        vw vwVar = this.d;
        if (vwVar != null) {
            vwVar.a(this.c, this.b, i, i2);
        }
        this.c = i;
        this.b = i2;
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback) {
        return null;
    }
}
