package com.android.bubble;

/* JADX INFO: loaded from: classes2.dex */
public class CheckableImageButton extends defpackage.jf implements android.widget.Checkable {
    private static final int[] b = {android.R.attr.state_checked};
    public boolean a;

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        defpackage.ebt.n(this, new defpackage.fum(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), b) : super.onCreateDrawableState(i);
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.a != z) {
            this.a = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public CheckableImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(android.content.Context context) {
        this(context, null);
    }
}
