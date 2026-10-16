package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class iw extends android.widget.AutoCompleteTextView {
    private static final int[] a = {android.R.attr.popupBackground};
    private final defpackage.ix b;
    private final defpackage.jx c;
    private final defpackage.se d;

    public iw(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        defpackage.ne.d(this, getContext());
        defpackage.lam lamVarC = defpackage.lam.C(getContext(), attributeSet, a, i, 0);
        if (lamVarC.y(0)) {
            setDropDownBackgroundDrawable(lamVarC.s(0));
        }
        lamVarC.w();
        defpackage.ix ixVar = new defpackage.ix(this);
        this.b = ixVar;
        ixVar.b(attributeSet, i);
        defpackage.jx jxVar = new defpackage.jx(this);
        this.c = jxVar;
        jxVar.c(attributeSet, i);
        jxVar.a();
        defpackage.se seVar = new defpackage.se(this);
        this.d = seVar;
        seVar.d(attributeSet, i);
        android.text.method.KeyListener keyListener = getKeyListener();
        if (defpackage.se.e(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            android.text.method.KeyListener keyListenerF = defpackage.se.f(keyListener);
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
        defpackage.ix ixVar = this.b;
        if (ixVar != null) {
            ixVar.a();
        }
        defpackage.jx jxVar = this.c;
        if (jxVar != null) {
            jxVar.a();
        }
    }

    @Override // android.widget.TextView
    public final android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        android.view.ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        defpackage.dtf.d(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        defpackage.ly.m(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.d.g(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        defpackage.ix ixVar = this.b;
        if (ixVar != null) {
            ixVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        defpackage.ix ixVar = this.b;
        if (ixVar != null) {
            ixVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        defpackage.jx jxVar = this.c;
        if (jxVar != null) {
            jxVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        defpackage.jx jxVar = this.c;
        if (jxVar != null) {
            jxVar.a();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(defpackage.ca.e(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(defpackage.se.f(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        defpackage.jx jxVar = this.c;
        if (jxVar != null) {
            jxVar.d(context, i);
        }
    }

    public iw(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.autoCompleteTextViewStyle);
    }

    public iw(android.content.Context context) {
        this(context, null);
    }
}
