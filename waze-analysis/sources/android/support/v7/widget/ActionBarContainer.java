package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    Drawable f864a;

    /* renamed from: b, reason: collision with root package name */
    Drawable f865b;

    /* renamed from: c, reason: collision with root package name */
    Drawable f866c;

    /* renamed from: d, reason: collision with root package name */
    boolean f867d;

    /* renamed from: e, reason: collision with root package name */
    boolean f868e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f869f;

    /* renamed from: g, reason: collision with root package name */
    private View f870g;

    /* renamed from: h, reason: collision with root package name */
    private View f871h;

    /* renamed from: i, reason: collision with root package name */
    private int f872i;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new c(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.a.a.f479a);
        boolean z = false;
        this.f864a = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f865b = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f872i = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f867d = true;
            this.f866c = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f867d ? !(this.f864a != null || this.f865b != null) : this.f866c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public final void a(boolean z) {
        this.f869f = z;
        setDescendantFocusability(true != z ? 262144 : 393216);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f864a;
        if (drawable != null && drawable.isStateful()) {
            this.f864a.setState(getDrawableState());
        }
        Drawable drawable2 = this.f865b;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f865b.setState(getDrawableState());
        }
        Drawable drawable3 = this.f866c;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f866c.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f864a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f865b;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f866c;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f870g = findViewById(R.id.action_bar);
        this.f871h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f869f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        View view;
        super.onLayout(z, i2, i3, i4, i5);
        if (this.f867d) {
            Drawable drawable = this.f866c;
            if (drawable == null) {
                return;
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.f864a != null) {
                z2 = true;
                if (this.f870g.getVisibility() == 0 || ((view = this.f871h) != null && view.getVisibility() == 0)) {
                    this.f864a.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    this.f864a.setBounds(0, 0, 0, 0);
                }
            } else {
                z2 = false;
            }
            this.f868e = false;
            if (!z2) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        if (this.f870g == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && (i4 = this.f872i) >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.f870g == null) {
            return;
        }
        View.MeasureSpec.getMode(i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.f864a;
        boolean z = i2 == 0;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f865b;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f866c;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f864a || this.f867d) {
            return (drawable == this.f866c && this.f867d) || super.verifyDrawable(drawable);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }
}
