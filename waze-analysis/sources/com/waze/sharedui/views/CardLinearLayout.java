package com.waze.sharedui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class CardLinearLayout extends c {

    /* renamed from: a, reason: collision with root package name */
    private final d f39123a;

    public CardLinearLayout(Context context) {
        super(context);
        this.f39123a = new d(this);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f39123a.f39223a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f39123a.f39223a;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f39123a.f39223a;
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f39123a.f39223a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f39123a.b(canvas);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f39123a.c(i2, i3);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        d dVar = this.f39123a;
        return dVar.f39223a == null ? super.verifyDrawable(drawable) : super.verifyDrawable(drawable) || drawable == dVar.f39223a;
    }

    public CardLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39123a = new d(this, attributeSet);
    }
}
