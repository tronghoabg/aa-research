package com.google.android.projection.gearhead.rail.ui;

/* JADX INFO: loaded from: classes3.dex */
public class SlidableLinearLayout extends android.widget.LinearLayout {
    public android.view.View a;
    public boolean b;
    private final android.os.CountDownTimer c;

    public SlidableLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        long longPressTimeout = android.view.ViewConfiguration.getLongPressTimeout();
        this.c = new defpackage.xfl(this, longPressTimeout, longPressTimeout);
    }

    public static final boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        if (!view.isClickable()) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new android.graphics.Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i, int i2) {
        if (i == 130) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt.isSelected()) {
                    arrayList.add(childAt);
                    return;
                }
            }
            i = 130;
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.b = false;
            for (int i = 0; i < getChildCount(); i++) {
                android.view.View childAt = getChildAt(i);
                if (a(childAt, motionEvent)) {
                    this.a = childAt;
                    childAt.setPressed(true);
                    if (!this.a.isLongClickable()) {
                        break;
                    }
                    this.c.start();
                    break;
                }
            }
        } else if (motionEvent.getActionMasked() == 2) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                android.view.View childAt2 = getChildAt(i2);
                if (this.a != childAt2 && childAt2.isClickable() && a(childAt2, motionEvent)) {
                    android.view.View view = this.a;
                    if (view != null) {
                        view.setPressed(false);
                    }
                    childAt2.callOnClick();
                    this.c.cancel();
                    this.b = true;
                    this.a = childAt2;
                    childAt2.setPressed(true);
                }
            }
        } else if ((motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) && this.a != null) {
            if (!this.b) {
                this.c.cancel();
                if (motionEvent.getActionMasked() == 1) {
                    this.a.callOnClick();
                }
            }
            this.a.setPressed(false);
            this.a = null;
        }
        return true;
    }
}
