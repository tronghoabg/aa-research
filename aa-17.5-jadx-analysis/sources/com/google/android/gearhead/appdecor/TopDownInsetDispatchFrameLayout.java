package com.google.android.gearhead.appdecor;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class TopDownInsetDispatchFrameLayout extends FrameLayout {
    private View.OnApplyWindowInsetsListener a;

    public TopDownInsetDispatchFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.a;
        WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets) : onApplyWindowInsets(windowInsets);
        if (!windowInsetsOnApplyWindowInsets.isConsumed()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchApplyWindowInsets(windowInsetsOnApplyWindowInsets);
            }
        }
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.a = onApplyWindowInsetsListener;
        super.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
    }

    public TopDownInsetDispatchFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopDownInsetDispatchFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
