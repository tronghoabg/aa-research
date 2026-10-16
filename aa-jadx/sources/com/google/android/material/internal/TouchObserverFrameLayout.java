package com.google.android.material.internal;

/* JADX INFO: loaded from: classes3.dex */
public class TouchObserverFrameLayout extends android.widget.FrameLayout {
    public android.view.View.OnTouchListener a;

    public TouchObserverFrameLayout(android.content.Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View.OnTouchListener onTouchListener = this.a;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setOnTouchListener(android.view.View.OnTouchListener onTouchListener) {
        this.a = onTouchListener;
    }

    public TouchObserverFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchObserverFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
