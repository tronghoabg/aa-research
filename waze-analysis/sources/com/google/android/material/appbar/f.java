package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class f<V extends View> extends i<V> {

    /* renamed from: a, reason: collision with root package name */
    OverScroller f6189a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f6190b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6191c;

    /* renamed from: d, reason: collision with root package name */
    private int f6192d;

    /* renamed from: e, reason: collision with root package name */
    private int f6193e;

    /* renamed from: f, reason: collision with root package name */
    private int f6194f;

    /* renamed from: g, reason: collision with root package name */
    private VelocityTracker f6195g;

    public f() {
        this.f6192d = -1;
        this.f6194f = -1;
    }

    int a(View view) {
        throw null;
    }

    boolean b(View view) {
        throw null;
    }

    void d(View view) {
        throw null;
    }

    void e(CoordinatorLayout coordinatorLayout, View view, int i2, int i3) {
        throw null;
    }

    void f(View view) {
        throw null;
    }

    void g() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r6.f6194f
            if (r0 >= 0) goto L12
            android.content.Context r0 = r7.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r6.f6194f = r0
        L12:
            int r0 = r9.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L3f
            boolean r0 = r6.f6191c
            if (r0 == 0) goto L3f
            int r0 = r6.f6192d
            if (r0 != r3) goto L25
            goto L8d
        L25:
            int r0 = r9.findPointerIndex(r0)
            if (r0 == r3) goto L8d
            float r0 = r9.getY(r0)
            int r0 = (int) r0
            int r1 = r6.f6193e
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r6.f6194f
            if (r1 <= r5) goto L3f
            r6.f6193e = r0
            return r2
        L3f:
            int r0 = r9.getActionMasked()
            if (r0 != 0) goto L86
            r6.f6192d = r3
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            boolean r3 = r6.b(r8)
            if (r3 == 0) goto L5f
            boolean r7 = r7.isPointInChildBounds(r8, r0, r1)
            if (r7 == 0) goto L5f
            r7 = r2
            goto L60
        L5f:
            r7 = r4
        L60:
            r6.f6191c = r7
            if (r7 == 0) goto L86
            r6.f6193e = r1
            int r7 = r9.getPointerId(r4)
            r6.f6192d = r7
            android.view.VelocityTracker r7 = r6.f6195g
            if (r7 != 0) goto L76
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.f6195g = r7
        L76:
            android.widget.OverScroller r7 = r6.f6189a
            if (r7 == 0) goto L86
            boolean r7 = r7.isFinished()
            if (r7 != 0) goto L86
            android.widget.OverScroller r6 = r6.f6189a
            r6.abortAnimation()
            return r2
        L86:
            android.view.VelocityTracker r6 = r6.f6195g
            if (r6 == 0) goto L8d
            r6.addMovement(r9)
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.f.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r20, V r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.f.onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6192d = -1;
        this.f6194f = -1;
    }
}
