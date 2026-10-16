package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.db;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.core.view.GravityCompat;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class h extends db {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f6595a;

    /* renamed from: b, reason: collision with root package name */
    boolean f6596b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f6597c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f6598d;

    /* renamed from: e, reason: collision with root package name */
    private final Rect f6599e;

    /* renamed from: f, reason: collision with root package name */
    private int f6600f;

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f6598d = new Rect();
        this.f6599e = new Rect();
        this.f6600f = 119;
        this.f6595a = true;
        this.f6596b = false;
        TypedArray typedArrayA = n.a(context, attributeSet, j.f6602a, i2, 0, new int[0]);
        this.f6600f = typedArrayA.getInt(1, this.f6600f);
        Drawable drawable = typedArrayA.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f6595a = typedArrayA.getBoolean(2, true);
        typedArrayA.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f6597c;
        if (drawable != null) {
            if (this.f6596b) {
                this.f6596b = false;
                Rect rect = this.f6598d;
                Rect rect2 = this.f6599e;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f6595a) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f6600f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f6597c;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f6597c;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f6597c.setState(getDrawableState());
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.f6597c;
    }

    @Override // android.view.View
    public final int getForegroundGravity() {
        return this.f6600f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6597c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.support.v7.widget.db, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f6596b = z | this.f6596b;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f6596b = true;
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f6597c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f6597c);
            }
            this.f6597c = drawable;
            this.f6596b = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f6600f == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setForegroundGravity(int i2) {
        if (this.f6600f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= GravityCompat.START;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f6600f = i2;
            if (i2 == 119 && this.f6597c != null) {
                this.f6597c.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f6597c;
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h(Context context) {
        this(context, null);
    }
}
