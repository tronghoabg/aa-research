package com.google.android.projection.gearhead.rail.ui;

import android.content.Context;
import android.graphics.Rect;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import defpackage.xel;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class SlidableLinearLayout extends LinearLayout {
    public View a;
    public boolean b;
    private final CountDownTimer c;

    public SlidableLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        this.c = new xel(this, longPressTimeout, longPressTimeout);
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        if (!view.isClickable()) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        if (i == 130) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
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
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (motionEvent.getActionMasked() == 0) {
            this.b = false;
            while (true) {
                if (i >= getChildCount()) {
                    break;
                }
                View childAt = getChildAt(i);
                if (a(childAt, motionEvent)) {
                    this.a = childAt;
                    childAt.setPressed(true);
                    if (this.a.isLongClickable()) {
                        this.c.start();
                    }
                } else {
                    i++;
                }
            }
        } else if (motionEvent.getActionMasked() == 2) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt2 = getChildAt(i2);
                if (this.a != childAt2 && childAt2.isClickable() && a(childAt2, motionEvent)) {
                    View view = this.a;
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
