package com.google.android.material.snackbar;

/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends android.widget.LinearLayout {
    public android.widget.TextView a;
    public android.widget.Button b;
    public final android.animation.TimeInterpolator c;
    public int d;

    public SnackbarContentLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = defpackage.wqn.c(context, com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator, defpackage.wlm.b);
    }

    private final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.a.getPaddingTop() == i2 && this.a.getPaddingBottom() == i3) {
            return z;
        }
        android.widget.TextView textView = this.a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
        } else {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        }
        return true;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (android.widget.TextView) findViewById(com.google.android.projection.gearhead.R.id.snackbar_text);
        this.b = (android.widget.Button) findViewById(com.google.android.projection.gearhead.R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.design_snackbar_padding_vertical);
        android.text.Layout layout = this.a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.d <= 0 || this.b.getMeasuredWidth() <= this.d) {
            if (true != z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public SnackbarContentLayout(android.content.Context context) {
        this(context, null);
    }
}
