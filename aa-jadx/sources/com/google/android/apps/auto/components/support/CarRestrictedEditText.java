package com.google.android.apps.auto.components.support;

/* JADX INFO: loaded from: classes2.dex */
public class CarRestrictedEditText extends android.widget.EditText implements defpackage.rmu {
    public defpackage.mon a;
    private int b;
    private int c;
    private defpackage.wd d;

    public CarRestrictedEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.c = 0;
        setInputType(getInputType() | 524288);
        setTextIsSelectable(false);
        setLongClickable(false);
        setSelection(getText().length());
        setOnEditorActionListener(new defpackage.lbk(this, 2));
        setCustomSelectionActionModeCallback(new defpackage.mol(0));
    }

    @Override // defpackage.rmu
    public final void a(defpackage.wd wdVar) {
        this.d = wdVar;
    }

    @Override // android.widget.TextView, android.view.View, defpackage.rmu
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        return new defpackage.mom(this, super.onCreateInputConnection(editorInfo));
    }

    @Override // android.widget.TextView
    protected final void onSelectionChanged(int i, int i2) {
        defpackage.wd wdVar = this.d;
        if (wdVar != null) {
            wdVar.a(this.c, this.b, i, i2);
        }
        this.c = i;
        this.b = i2;
    }

    @Override // android.view.View
    public final android.view.ActionMode startActionMode(android.view.ActionMode.Callback callback) {
        return null;
    }
}
