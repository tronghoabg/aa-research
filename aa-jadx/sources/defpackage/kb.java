package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class kb extends android.widget.TextView {
    private final defpackage.ix a;
    private final defpackage.jx b;
    private boolean c;
    private defpackage.jy d;
    private defpackage.ccw e;
    private defpackage.bil f;

    public kb(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        this.d = null;
        defpackage.ne.d(this, getContext());
        defpackage.ix ixVar = new defpackage.ix(this);
        this.a = ixVar;
        ixVar.b(attributeSet, i);
        defpackage.jx jxVar = new defpackage.jx(this);
        this.b = jxVar;
        jxVar.c(attributeSet, i);
        jxVar.a();
        a().I(attributeSet, i);
    }

    private final defpackage.bil a() {
        defpackage.bil bilVar = this.f;
        if (bilVar != null) {
            return bilVar;
        }
        defpackage.bil bilVar2 = new defpackage.bil((android.widget.TextView) this);
        this.f = bilVar2;
        return bilVar2;
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
    public final int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public final int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public final int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public final android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        android.view.ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        defpackage.dtf.d(customSelectionActionModeCallback);
        return customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public final java.lang.String getFontVariationSettings() {
        return (java.lang.String) l().a;
    }

    @Override // android.widget.TextView
    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // android.widget.TextView
    public final android.view.textclassifier.TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView
    public final android.graphics.Typeface getTypeface() {
        return (android.graphics.Typeface) l().c;
    }

    final defpackage.jy k() {
        if (this.d == null) {
            this.d = android.os.Build.VERSION.SDK_INT >= 34 ? new defpackage.ka(this) : new defpackage.jz(this);
        }
        return this.d;
    }

    final defpackage.ccw l() {
        defpackage.ccw ccwVar = this.e;
        if (ccwVar != null) {
            return ccwVar;
        }
        defpackage.ccw ccwVar2 = new defpackage.ccw(this, new defpackage.ba(this, 7));
        this.e = ccwVar2;
        return ccwVar2;
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        defpackage.jx.f(this, inputConnectionOnCreateInputConnection, editorInfo);
        defpackage.ly.m(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (android.os.Build.VERSION.SDK_INT < 30 || android.os.Build.VERSION.SDK_INT >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        a();
        defpackage.emx emxVar = defpackage.emx.b;
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws java.lang.IllegalArgumentException {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws java.lang.IllegalArgumentException {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
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
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        android.content.Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? defpackage.ca.e(context, i) : null, i2 != 0 ? defpackage.ca.e(context, i2) : null, i3 != 0 ? defpackage.ca.e(context, i3) : null, i4 != 0 ? defpackage.ca.e(context, i4) : null);
        defpackage.jx jxVar = this.b;
        if (jxVar != null) {
            jxVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        android.content.Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? defpackage.ca.e(context, i) : null, i2 != 0 ? defpackage.ca.e(context, i2) : null, i3 != 0 ? defpackage.ca.e(context, i3) : null, i4 != 0 ? defpackage.ca.e(context, i4) : null);
        defpackage.jx jxVar = this.b;
        if (jxVar != null) {
            jxVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(android.text.InputFilter[] inputFilterArr) {
        a();
        defpackage.emx emxVar = defpackage.emx.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final void setFirstBaselineToTopHeight(int i) {
        k().a(i);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(java.lang.String str) {
        return l().e(str);
    }

    @Override // android.widget.TextView
    public final void setLastBaselineToBottomHeight(int i) {
        k().b(i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            k().c(i, f);
        } else {
            defpackage.dtf.c(this, i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(android.content.Context context, int i) {
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
    public final void setTypeface(android.graphics.Typeface typeface, int i) {
        if (this.c) {
            return;
        }
        if (typeface != null && i > 0) {
            android.content.Context context = getContext();
            defpackage.dvw dvwVar = defpackage.dvo.a;
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context cannot be null");
            }
            typeface = android.graphics.Typeface.create(typeface, i);
        }
        this.c = true;
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.c = false;
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i) {
        defpackage.dtf.b(this, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface typeface) {
        l().d(typeface);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        defpackage.jx jxVar = this.b;
        if (jxVar != null) {
            jxVar.a();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        defpackage.jx jxVar = this.b;
        if (jxVar != null) {
            jxVar.a();
        }
    }

    public kb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public kb(android.content.Context context) {
        this(context, null);
    }
}
