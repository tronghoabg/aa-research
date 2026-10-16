package com.google.android.gearhead.appdecor;

/* JADX INFO: loaded from: classes2.dex */
public class TopDownInsetDispatchFrameLayout extends android.widget.FrameLayout {
    private android.view.View.OnApplyWindowInsetsListener a;

    public TopDownInsetDispatchFrameLayout(android.content.Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets windowInsets) {
        android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.a;
        android.view.WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener != null ? onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets) : onApplyWindowInsets(windowInsets);
        if (!windowInsetsOnApplyWindowInsets.isConsumed()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchApplyWindowInsets(windowInsetsOnApplyWindowInsets);
            }
        }
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.a = onApplyWindowInsetsListener;
        super.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
    }

    public TopDownInsetDispatchFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TopDownInsetDispatchFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
