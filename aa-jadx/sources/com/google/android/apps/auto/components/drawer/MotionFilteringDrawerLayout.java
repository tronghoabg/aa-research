package com.google.android.apps.auto.components.drawer;

/* JADX INFO: loaded from: classes2.dex */
public class MotionFilteringDrawerLayout extends androidx.drawerlayout.widget.DrawerLayout {
    private defpackage.lbg k;
    private final android.content.Context l;

    public MotionFilteringDrawerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = context;
        y(1.0f);
        setFocusable(0);
        this.g = getContext().getDrawable(android.R.color.transparent);
        invalidate();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public final void k(int i) {
        super.k(android.graphics.Color.argb((int) (android.graphics.Color.alpha(i) * 0.8f), android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i)));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (u()) {
            defpackage.lbg lbgVar = this.k;
            int actionMasked = motionEvent.getActionMasked();
            int actionIndex = motionEvent.getActionIndex();
            if (actionMasked == 0) {
                lbgVar.a();
            } else if (actionMasked != 0) {
                if (actionMasked == 1) {
                    lbgVar.a();
                } else if (actionMasked == 2) {
                    int pointerCount = motionEvent.getPointerCount();
                    boolean z = false;
                    for (int i = 0; i < pointerCount; i++) {
                        int pointerId = motionEvent.getPointerId(i);
                        if (lbgVar.c(pointerId)) {
                            if (java.lang.Math.abs(motionEvent.getAxisValue(0, i) - lbgVar.b[pointerId]) <= lbgVar.a) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        return false;
                    }
                } else if (actionMasked == 3) {
                    lbgVar.a();
                } else if (actionMasked == 5) {
                    lbgVar.b(motionEvent.getAxisValue(0, actionIndex), motionEvent.getPointerId(actionIndex));
                } else if (actionMasked == 6) {
                    int pointerId2 = motionEvent.getPointerId(actionIndex);
                    if (lbgVar.c(pointerId2)) {
                        lbgVar.b[pointerId2] = 0.0f;
                        lbgVar.c = (~(1 << pointerId2)) & lbgVar.c;
                    }
                }
            }
            lbgVar.b(motionEvent.getAxisValue(0), motionEvent.getPointerId(0));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void y(float f) {
        this.k = new defpackage.lbg(android.view.ViewConfiguration.get(this.l).getScaledTouchSlop() * f);
    }

    public MotionFilteringDrawerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MotionFilteringDrawerLayout(android.content.Context context) {
        this(context, null);
    }
}
