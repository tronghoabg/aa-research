package com.google.android.material.g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.support.v7.widget.ap;
import android.util.AttributeSet;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.focus.d;
import com.google.android.material.internal.n;
import com.google.android.material.internal.t;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private static final int[][] f6541a = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f6542b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6543c;

    public a(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListN;
        super(com.google.android.material.theme.a.a.a(context, attributeSet, com.waze.R.attr.radioButtonStyle, com.waze.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayA = n.a(context2, attributeSet, b.f6544a, com.waze.R.attr.radioButtonStyle, com.waze.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayA.hasValue(0)) {
            CompoundButtonCompat.setButtonTintList(this, t.n(context2, typedArrayA, 0));
        }
        if (typedArrayA.hasValue(1) && (colorStateListN = t.n(context2, typedArrayA, 1)) != null) {
            Drawable background = getBackground();
            background = background instanceof DrawableWrapper ? ((DrawableWrapper) background).getDrawable() : background;
            if (background instanceof RippleDrawable) {
                ((RippleDrawable) background).setColor(colorStateListN);
            }
        }
        this.f6543c = typedArrayA.getBoolean(2, false);
        typedArrayA.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f6543c && CompoundButtonCompat.getButtonTintList(this) == null) {
            this.f6543c = true;
            ColorStateList colorStateList = this.f6542b;
            if (colorStateList == null) {
                int iB = d.b(this, com.waze.R.attr.colorControlActivated);
                int iB2 = d.b(this, com.waze.R.attr.colorOnSurface);
                int iB3 = d.b(this, com.waze.R.attr.colorSurface);
                int[][] iArr = f6541a;
                int length = iArr.length;
                ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{d.d(iB3, iB, 1.0f), d.d(iB3, iB2, 0.54f), d.d(iB3, iB2, 0.38f), d.d(iB3, iB2, 0.38f)});
                this.f6542b = colorStateList2;
                colorStateList = colorStateList2;
            }
            CompoundButtonCompat.setButtonTintList(this, colorStateList);
        }
    }
}
