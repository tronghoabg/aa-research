package com.google.android.apps.auto.components.apphost.signin;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.material.textfield.TextInputEditText;
import defpackage.afeu;
import defpackage.gkt;
import defpackage.gms;
import defpackage.jzn;
import defpackage.jzo;
import defpackage.mof;
import defpackage.vw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006#"}, d2 = {"Lcom/google/android/apps/auto/components/apphost/signin/MaterialCarRestrictedEditText;", "Lcom/google/android/material/textfield/TextInputEditText;", "Lcom/android/car/libraries/apphost/input/CarEditable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lastSelEnd", "", "lastSelStart", "cursorClamped", "", "carEditableListener", "Lcom/android/car/libraries/apphost/input/CarEditableListener;", "listener", "Lcom/google/android/apps/auto/components/apphost/signin/MaterialCarRestrictedEditText$KeyListener;", "setKeyListener", "", "onSelectionChanged", "selStart", "selEnd", "startActionMode", "Landroid/view/ActionMode;", "callback", "Landroid/view/ActionMode$Callback;", "setCarEditableListener", "setInputEnabled", "enabled", "onCreateInputConnection", "Landroid/view/inputmethod/InputConnection;", "outAttrs", "Landroid/view/inputmethod/EditorInfo;", "KeyListener", "java.com.google.android.apps.auto.components.apphost.signin_signin"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaterialCarRestrictedEditText extends TextInputEditText implements gkt {
    private int a;
    private int b;
    private gms c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialCarRestrictedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        setInputType(getInputType() | 524288);
        setTextIsSelectable(false);
        setCursorVisible(false);
        setLongClickable(false);
        Editable text = getText();
        if (text != null) {
            setSelection(text.length());
        }
        setOnEditorActionListener(new jzn());
        setCustomSelectionActionModeCallback(new mof(1));
    }

    @Override // defpackage.gkt
    public final void fs(gms gmsVar) {
        this.c = gmsVar;
    }

    @Override // com.google.android.material.textfield.TextInputEditText, defpackage.jd, android.widget.TextView, android.view.View, defpackage.gkt
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        return new jzo(super.onCreateInputConnection(editorInfo));
    }

    @Override // android.widget.TextView
    protected final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        gms gmsVar = this.c;
        if (gmsVar != null) {
            ((vw) gmsVar.a).a(this.b, this.a, i, i2);
        }
        this.b = i;
        this.a = i2;
    }

    @Override // android.view.View
    public final ActionMode startActionMode(ActionMode.Callback callback) {
        callback.getClass();
        return null;
    }

    public /* synthetic */ MaterialCarRestrictedEditText(Context context, AttributeSet attributeSet, int i, afeu afeuVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
