package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public final class wsx extends jj {
    private static final int[][] a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList b;
    private boolean c;

    public wsx(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListH;
        super(wxp.a(context, attributeSet, com.google.android.projection.gearhead.R.attr.radioButtonStyle, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayA = wqr.a(context2, attributeSet, wsy.a, com.google.android.projection.gearhead.R.attr.radioButtonStyle, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayA.hasValue(0)) {
            setButtonTintList(wub.h(context2, typedArrayA, 0));
        }
        if (typedArrayA.hasValue(1) && (colorStateListH = wub.h(context2, typedArrayA, 1)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(colorStateListH);
            }
        }
        this.c = typedArrayA.getBoolean(2, false);
        typedArrayA.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.c && getButtonTintList() == null) {
            this.c = true;
            ColorStateList colorStateList = this.b;
            if (colorStateList == null) {
                int iM = woy.m(this, com.google.android.projection.gearhead.R.attr.colorControlActivated);
                int iM2 = woy.m(this, com.google.android.projection.gearhead.R.attr.colorOnSurface);
                int iM3 = woy.m(this, com.google.android.projection.gearhead.R.attr.colorSurface);
                int[][] iArr = a;
                int length = iArr.length;
                ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{woy.o(iM3, iM, 1.0f), woy.o(iM3, iM2, 0.54f), woy.o(iM3, iM2, 0.38f), woy.o(iM3, iM2, 0.38f)});
                this.b = colorStateList2;
                colorStateList = colorStateList2;
            }
            setButtonTintList(colorStateList);
        }
    }
}
