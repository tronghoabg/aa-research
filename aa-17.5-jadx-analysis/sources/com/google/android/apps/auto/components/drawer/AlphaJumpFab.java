package com.google.android.apps.auto.components.drawer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.auto.sdk.ui.FloatingActionButton;
import com.google.android.projection.gearhead.R;
import defpackage.laz;
import defpackage.oxc;

/* loaded from: classes2.dex */
public class AlphaJumpFab extends FloatingActionButton {
    public final laz a;

    public AlphaJumpFab(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        Drawable drawable = getResources().getDrawable(R.drawable.ic_alpha_jump_fab);
        drawable.setColorFilter(getContext().getResources().getColor(R.color.gearhead_sdk_grey_50), PorterDuff.Mode.SRC_IN);
        int color = getContext().getResources().getColor(R.color.alpha_jump_fab_background);
        laz lazVar = new laz(drawable, getResources().getDimension(R.dimen.alpha_jump_fab_text_size), getResources().getDimension(R.dimen.alpha_jump_fab_icon_size), color);
        this.a = lazVar;
        lazVar.a("A");
        setImageDrawable(lazVar);
        oxc oxcVar = new oxc(getContext());
        oxcVar.b(color);
        setBackground(oxcVar);
        setFocusable(false);
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        setFocusable(false);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setFocusable(false);
    }
}
