package W7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import q.AbstractC3848y0;

/* loaded from: classes4.dex */
public abstract class d extends AbstractC3848y0 {

    /* renamed from: p, reason: collision with root package name */
    public Drawable f15254p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f15255q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f15256r;

    /* renamed from: s, reason: collision with root package name */
    public int f15257s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f15258t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f15259u;

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15255q = new Rect();
        this.f15256r = new Rect();
        this.f15257s = 119;
        this.f15258t = true;
        this.f15259u = false;
        int[] iArr = I7.a.f5405g;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f15257s = typedArrayObtainStyledAttributes.getInt(1, this.f15257s);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f15258t = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f15254p;
        if (drawable != null) {
            if (this.f15259u) {
                this.f15259u = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f15258t;
                Rect rect = this.f15255q;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i5 = this.f15257s;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f15256r;
                Gravity.apply(i5, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f15254p;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f15254p;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f15254p.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f15254p;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f15257s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f15254p;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // q.AbstractC3848y0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        this.f15259u = z2 | this.f15259u;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i5, int i10, int i11, int i12) {
        super.onSizeChanged(i5, i10, i11, i12);
        this.f15259u = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f15254p;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f15254p);
            }
            this.f15254p = drawable;
            this.f15259u = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f15257s == 119) {
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
    public void setForegroundGravity(int i5) {
        if (this.f15257s != i5) {
            if ((8388615 & i5) == 0) {
                i5 |= 8388611;
            }
            if ((i5 & 112) == 0) {
                i5 |= 48;
            }
            this.f15257s = i5;
            if (i5 == 119 && this.f15254p != null) {
                this.f15254p.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f15254p;
    }
}
