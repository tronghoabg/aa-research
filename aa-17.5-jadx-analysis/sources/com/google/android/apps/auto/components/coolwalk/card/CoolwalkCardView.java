package com.google.android.apps.auto.components.coolwalk.card;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import com.google.android.material.card.MaterialCardView;
import com.google.android.projection.gearhead.R;
import defpackage.kwi;
import defpackage.kwj;
import defpackage.wuk;

/* loaded from: classes2.dex */
public class CoolwalkCardView extends MaterialCardView implements kwj {
    public final kwi f;
    private boolean i;

    public CoolwalkCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
        wuk wukVarFD = fD();
        context.getClass();
        wukVarFD.getClass();
        kwi kwiVar = new kwi(context, wukVarFD, null, null, null, null);
        this.f = kwiVar;
        setWillNotDraw(false);
        kwiVar.setLayoutDirection(getLayoutDirection());
        kwiVar.setState(getDrawableState());
        kwiVar.setCallback(this);
    }

    @Override // defpackage.kwj
    public final kwi c() {
        return this.f;
    }

    @Override // com.google.android.material.card.MaterialCardView, defpackage.wuv
    public final void d(wuk wukVar) {
        wuk wukVarFD = fD();
        super.d(wukVar);
        kwi kwiVar = this.f;
        if (kwiVar.a() == wukVarFD) {
            kwiVar.d(wukVar);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        this.f.setHotspot(f, f2);
        super.drawableHotspotChanged(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        kwi kwiVar = this.f;
        if (kwiVar.setState(getDrawableState())) {
            invalidateDrawable(kwiVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        this.f.jumpToCurrentState();
        super.jumpDrawablesToCurrentState();
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        super.onDrawForeground(canvas);
        if (this.i) {
            this.i = false;
            Rect rect = new Rect();
            Rect rect2 = new Rect();
            rect.set(0, 0, getWidth(), getHeight());
            kwi kwiVar = this.f;
            Gravity.apply(119, kwiVar.getIntrinsicWidth(), kwiVar.getIntrinsicHeight(), rect, rect2, getLayoutDirection());
            kwiVar.setBounds(rect2);
        }
        this.f.draw(canvas);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        this.i = true;
        super.onScrollChanged(i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        kwi kwiVar = this.f;
        if (z != kwiVar.isVisible()) {
            kwiVar.setVisible(z, false);
        }
        super.onVisibilityAggregated(z);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return this.f == drawable || super.verifyDrawable(drawable);
    }

    public CoolwalkCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public CoolwalkCardView(Context context) {
        this(context, null);
    }
}
