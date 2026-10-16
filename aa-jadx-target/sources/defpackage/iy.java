package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class iy extends android.widget.Button {
    public final defpackage.ix a;
    private final defpackage.jx b;
    private defpackage.ccw c;
    private defpackage.bil d;

    public iy(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        defpackage.ne.d(this, getContext());
        defpackage.ix ixVar = new defpackage.ix(this);
        this.a = ixVar;
        ixVar.b(attributeSet, i);
        defpackage.jx jxVar = new defpackage.jx(this);
        this.b = jxVar;
        jxVar.c(attributeSet, i);
        jxVar.a();
        c().I(attributeSet, i);
    }

    private final defpackage.bil c() {
        defpackage.bil bilVar = this.d;
        if (bilVar != null) {
            return bilVar;
        }
        defpackage.bil bilVar2 = new defpackage.bil((android.widget.TextView) this);
        this.d = bilVar2;
        return bilVar2;
    }

    final defpackage.ccw b() {
        defpackage.ccw ccwVar = this.c;
        if (ccwVar != null) {
            return ccwVar;
        }
        defpackage.ccw ccwVar2 = new defpackage.ccw(this, new defpackage.ba(this, 6));
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
    public final java.lang.String getFontVariationSettings() {
        return (java.lang.String) b().a;
    }

    @Override // android.widget.TextView
    public final android.graphics.Typeface getTypeface() {
        return (android.graphics.Typeface) b().c;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(android.widget.Button.class.getName());
    }

    @Override // android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        c();
        defpackage.emx emxVar = defpackage.emx.b;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        defpackage.ix ixVar = this.a;
        if (ixVar != null) {
            ixVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        defpackage.ix ixVar = this.a;
        if (ixVar != null) {
            ixVar.c(i);
        }
    }

    @Override // android.widget.TextView
    public final void setFilters(android.text.InputFilter[] inputFilterArr) {
        c();
        defpackage.emx emxVar = defpackage.emx.b;
        super.setFilters(inputFilterArr);
    }

    @Override // android.widget.TextView
    public final boolean setFontVariationSettings(java.lang.String str) {
        return b().e(str);
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
    public final void setTypeface(android.graphics.Typeface typeface) {
        b().d(typeface);
    }

    public iy(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130968782);
    }

    public iy(android.content.Context context) {
        this(context, null);
    }
}
