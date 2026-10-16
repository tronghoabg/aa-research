package com.google.android.apps.auto.components.ui.touch;

/* JADX INFO: loaded from: classes2.dex */
public class TouchStealingFrameLayout extends android.widget.FrameLayout {
    public boolean a;

    public TouchStealingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return this.a;
    }

    public TouchStealingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TouchStealingFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public TouchStealingFrameLayout(android.content.Context context) {
        this(context, null);
    }
}
