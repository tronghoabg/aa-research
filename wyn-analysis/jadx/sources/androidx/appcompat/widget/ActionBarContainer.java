package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.wynauto.wyn.R;
import i.AbstractC2820a;
import java.util.WeakHashMap;
import k1.S;
import q.C3800a;
import q.R0;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17785a;

    /* renamed from: b, reason: collision with root package name */
    public View f17786b;

    /* renamed from: c, reason: collision with root package name */
    public View f17787c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f17788d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f17789e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f17790f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17791g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17792h;

    /* renamed from: i, reason: collision with root package name */
    public final int f17793i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3800a c3800a = new C3800a(this);
        WeakHashMap weakHashMap = S.f38779a;
        setBackground(c3800a);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2820a.f36438a);
        boolean z2 = false;
        this.f17788d = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f17789e = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f17793i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f17791g = true;
            this.f17790f = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f17791g ? !(this.f17788d != null || this.f17789e != null) : this.f17790f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f17788d;
        if (drawable != null && drawable.isStateful()) {
            this.f17788d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f17789e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f17789e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f17790f;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f17790f.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f17788d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f17789e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f17790f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f17786b = findViewById(R.id.action_bar);
        this.f17787c = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f17785a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        boolean z10 = true;
        if (this.f17791g) {
            Drawable drawable = this.f17790f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.f17788d == null) {
                z10 = false;
            } else if (this.f17786b.getVisibility() == 0) {
                this.f17788d.setBounds(this.f17786b.getLeft(), this.f17786b.getTop(), this.f17786b.getRight(), this.f17786b.getBottom());
            } else {
                View view = this.f17787c;
                if (view == null || view.getVisibility() != 0) {
                    this.f17788d.setBounds(0, 0, 0, 0);
                } else {
                    this.f17788d.setBounds(this.f17787c.getLeft(), this.f17787c.getTop(), this.f17787c.getRight(), this.f17787c.getBottom());
                }
            }
            this.f17792h = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i5, int i10) {
        int i11;
        if (this.f17786b == null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE && (i11 = this.f17793i) >= 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(i11, View.MeasureSpec.getSize(i10)), Integer.MIN_VALUE);
        }
        super.onMeasure(i5, i10);
        if (this.f17786b == null) {
            return;
        }
        View.MeasureSpec.getMode(i10);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f17788d;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f17788d);
        }
        this.f17788d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f17786b;
            if (view != null) {
                this.f17788d.setBounds(view.getLeft(), this.f17786b.getTop(), this.f17786b.getRight(), this.f17786b.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f17791g ? !(this.f17788d != null || this.f17789e != null) : this.f17790f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f17790f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f17790f);
        }
        this.f17790f = drawable;
        boolean z2 = this.f17791g;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f17790f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f17788d != null || this.f17789e != null) : this.f17790f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f17789e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f17789e);
        }
        this.f17789e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f17792h && this.f17789e != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f17791g ? !(this.f17788d != null || this.f17789e != null) : this.f17790f == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z2) {
        this.f17785a = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i5) {
        super.setVisibility(i5);
        boolean z2 = i5 == 0;
        Drawable drawable = this.f17788d;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f17789e;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f17790f;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f17788d;
        boolean z2 = this.f17791g;
        if (drawable == drawable2 && !z2) {
            return true;
        }
        if (drawable == this.f17789e && this.f17792h) {
            return true;
        }
        return (drawable == this.f17790f && z2) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i5) {
        if (i5 != 0) {
            return super.startActionModeForChild(view, callback, i5);
        }
        return null;
    }

    public void setTabContainer(R0 r02) {
    }
}
