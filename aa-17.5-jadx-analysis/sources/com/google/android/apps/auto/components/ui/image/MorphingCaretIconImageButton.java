package com.google.android.apps.auto.components.ui.image;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class MorphingCaretIconImageButton extends ImageButton {
    private static final int[] a = {R.attr.state_up};
    private static final int[] b = {R.attr.state_down};
    private final boolean c;

    public MorphingCaretIconImageButton(Context context) {
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

    public MorphingCaretIconImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = true;
    }
}
