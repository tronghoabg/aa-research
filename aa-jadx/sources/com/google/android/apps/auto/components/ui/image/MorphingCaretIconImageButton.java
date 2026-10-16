package com.google.android.apps.auto.components.ui.image;

/* JADX INFO: loaded from: classes2.dex */
public class MorphingCaretIconImageButton extends android.widget.ImageButton {
    private static final int[] a = {com.google.android.projection.gearhead.R.attr.state_up};
    private static final int[] b = {com.google.android.projection.gearhead.R.attr.state_down};
    private final boolean c;

    public MorphingCaretIconImageButton(android.content.Context context) {
        super(context);
        this.c = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.c) {
            mergeDrawableStates(iArrOnCreateDrawableState, a);
            return iArrOnCreateDrawableState;
        }
        mergeDrawableStates(iArrOnCreateDrawableState, b);
        return iArrOnCreateDrawableState;
    }

    public MorphingCaretIconImageButton(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
    }
}
