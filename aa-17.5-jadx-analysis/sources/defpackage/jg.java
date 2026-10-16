package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes2.dex */
public final class jg extends MultiAutoCompleteTextView {
    private static final int[] a = {R.attr.popupBackground};
    private final iw b;
    private final jw c;
    private final rz d;

    public jg(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, com.google.android.projection.gearhead.R.attr.autoCompleteTextViewStyle);
        nb.d(this, getContext());
        lah lahVarC = lah.C(getContext(), attributeSet, a, com.google.android.projection.gearhead.R.attr.autoCompleteTextViewStyle, 0);
        if (lahVarC.y(0)) {
            setDropDownBackgroundDrawable(lahVarC.s(0));
        }
        lahVarC.w();
        iw iwVar = new iw(this);
        this.b = iwVar;
        iwVar.b(attributeSet, com.google.android.projection.gearhead.R.attr.autoCompleteTextViewStyle);
        jw jwVar = new jw(this);
        this.c = jwVar;
        jwVar.c(attributeSet, com.google.android.projection.gearhead.R.attr.autoCompleteTextViewStyle);
        jwVar.a();
        rz rzVar = new rz(this);
        this.d = rzVar;
        rzVar.d(attributeSet, com.google.android.projection.gearhead.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (rz.e(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerF = rz.f(keyListener);
            if (keyListenerF == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerF);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        iw iwVar = this.b;
        if (iwVar != null) {
            iwVar.a();
        }
        jw jwVar = this.c;
        if (jwVar != null) {
            jwVar.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        lv.m(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.d.g(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        iw iwVar = this.b;
        if (iwVar != null) {
            iwVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        iw iwVar = this.b;
        if (iwVar != null) {
            iwVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jw jwVar = this.c;
        if (jwVar != null) {
            jwVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jw jwVar = this.c;
        if (jwVar != null) {
            jwVar.a();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ca.e(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(rz.f(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jw jwVar = this.c;
        if (jwVar != null) {
            jwVar.d(context, i);
        }
    }
}
