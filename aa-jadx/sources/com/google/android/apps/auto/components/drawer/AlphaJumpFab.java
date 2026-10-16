package com.google.android.apps.auto.components.drawer;

/* JADX INFO: loaded from: classes2.dex */
public class AlphaJumpFab extends com.google.android.apps.auto.sdk.ui.FloatingActionButton {
    public final defpackage.lbe a;

    public AlphaJumpFab(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.google.android.projection.gearhead.R.drawable.ic_alpha_jump_fab);
        drawable.setColorFilter(getContext().getResources().getColor(com.google.android.projection.gearhead.R.color.gearhead_sdk_grey_50), android.graphics.PorterDuff.Mode.SRC_IN);
        int color = getContext().getResources().getColor(com.google.android.projection.gearhead.R.color.alpha_jump_fab_background);
        defpackage.lbe lbeVar = new defpackage.lbe(drawable, getResources().getDimension(com.google.android.projection.gearhead.R.dimen.alpha_jump_fab_text_size), getResources().getDimension(com.google.android.projection.gearhead.R.dimen.alpha_jump_fab_icon_size), color);
        this.a = lbeVar;
        lbeVar.a("A");
        setImageDrawable(lbeVar);
        defpackage.oxz oxzVar = new defpackage.oxz(getContext());
        oxzVar.b(color);
        setBackground(oxzVar);
        setFocusable(false);
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        setFocusable(false);
    }

    @Override // android.view.View
    public final void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        setFocusable(false);
    }
}
