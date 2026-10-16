package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class je extends android.widget.EditText implements defpackage.eaq {
    private final defpackage.ix a;
    private final defpackage.jx b;
    private defpackage.ccw c;
    private final se d;
    private ajnd e;

    public je(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        defpackage.ne.d(this, getContext());
        defpackage.ix ixVar = new defpackage.ix(this);
        this.a = ixVar;
        ixVar.b(attributeSet, i);
        defpackage.jx jxVar = new defpackage.jx(this);
        this.b = jxVar;
        jxVar.c(attributeSet, i);
        jxVar.a();
        se seVar = new se(this);
        this.d = seVar;
        seVar.d(attributeSet, i);
        android.text.method.KeyListener keyListener = getKeyListener();
        if (se.e(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            android.text.method.KeyListener keyListenerF = se.f(keyListener);
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

    private final ajnd d() {
        ajnd ajndVar = this.e;
        if (ajndVar != null) {
            return ajndVar;
        }
        ajnd ajndVar2 = new ajnd(this, (byte[]) null);
        this.e = ajndVar2;
        return ajndVar2;
    }

    @Override // defpackage.eaq
    public final ead a(ead eadVar) {
        return dtg.k(this, eadVar);
    }

    final defpackage.ccw c() {
        defpackage.ccw ccwVar = this.c;
        if (ccwVar != null) {
            return ccwVar;
        }
        defpackage.ccw ccwVar2 = new defpackage.ccw(this, new defpackage.kzu(this, 1));
        this.c = ccwVar2;
        return ccwVar2;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        defpackage.ix ixVar = this.a;
        if (ixVar != null) {
            ixVar.a();
        }
        defpackage.jx jxVar = this.b;
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

    @Override // android.widget.TextView
    public final java.lang.String getFontVariationSettings() {
        return (java.lang.String) c().a;
    }

    @Override // android.widget.TextView
    public final android.view.textclassifier.TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final android.graphics.Typeface getTypeface() {
        return (android.graphics.Typeface) c().c;
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        java.lang.String[] strArrS;
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        defpackage.jx.f(this, inputConnectionOnCreateInputConnection, editorInfo);
        defpackage.ly.m(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && android.os.Build.VERSION.SDK_INT <= 30 && (strArrS = defpackage.ebt.s(this)) != null) {
            je$.ExternalSyntheticApiModelOutline0.m(editorInfo, strArrS);
            ajnd ajndVar = new ajnd(this);
            defpackage.a.ak(editorInfo, "editorInfo must be non-null");
            inputConnectionOnCreateInputConnection = new eea(inputConnectionOnCreateInputConnection, ajndVar);
        }
        return this.d.g(inputConnectionOnCreateInputConnection);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (android.os.Build.VERSION.SDK_INT < 30 || android.os.Build.VERSION.SDK_INT >= 33) {
            return;
        }
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(android.view.DragEvent dragEvent) {
        android.app.Activity activity;
        if (android.os.Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && defpackage.ebt.s(this) != null) {
            android.content.Context context = getContext();
            while (true) {
                if (!(context instanceof android.content.ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof android.app.Activity) {
                    activity = (android.app.Activity) context;
                    break;
                }
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
                android.util.Log.i("ReceiveContent", "Can't handle drop: no activity: view=".concat(toString()));
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                a$.ExternalSyntheticApiModelOutline2.m(activity, dragEvent);
                int offsetForPosition = getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
                beginBatchEdit();
                try {
                    android.text.Selection.setSelection((android.text.Spannable) getText(), offsetForPosition);
                    android.content.ClipData clipData = dragEvent.getClipData();
                    defpackage.ebt.c(this, (android.os.Build.VERSION.SDK_INT >= 31 ? new dzx(clipData, 3) : new dzz(clipData, 3)).a());
                    return true;
                } finally {
                    endBatchEdit();
                }
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (android.os.Build.VERSION.SDK_INT < 31 && defpackage.ebt.s(this) != null) {
            if (i != 16908322) {
                if (i == 16908337) {
                    i = 16908337;
                }
            }
            android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) getContext().getSystemService("clipboard");
            android.content.ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                dzx dzxVar = android.os.Build.VERSION.SDK_INT >= 31 ? new dzx(primaryClip, 1) : new dzz(primaryClip, 1);
                dzxVar.c(i == 16908322 ? 0 : 1);
                defpackage.ebt.c(this, dzxVar.a());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        defpackage.ix ixVar = this.a;
        if (ixVar != null) {
            ixVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        defpackage.ix ixVar = this.a;
        if (ixVar != null) {
            ixVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        defpackage.jx jxVar = this.b;
        if (jxVar != null) {
            jxVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        defpackage.jx jxVar = this.b;
        if (jxVar != null) {
            jxVar.a();
        }
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(java.lang.String str) {
        return c().e(str);
    }

    @Override // android.widget.TextView
    public final void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(se.f(keyListener));
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        defpackage.jx jxVar = this.b;
        if (jxVar != null) {
            jxVar.d(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface typeface) {
        c().d(typeface);
    }

    public je(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969210);
    }

    public je(android.content.Context context) {
        this(context, null);
    }
}
