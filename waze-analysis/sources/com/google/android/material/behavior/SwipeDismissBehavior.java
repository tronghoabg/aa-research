package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ViewDragHelper;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a, reason: collision with root package name */
    ViewDragHelper f6244a;

    /* renamed from: b, reason: collision with root package name */
    m f6245b;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6249f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6250g;

    /* renamed from: c, reason: collision with root package name */
    int f6246c = 2;

    /* renamed from: d, reason: collision with root package name */
    float f6247d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    float f6248e = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    private final ViewDragHelper.Callback f6251h = new k(this);

    static float d(float f2) {
        return Math.min(Math.max(0.0f, f2), 1.0f);
    }

    public final void b(m mVar) {
        this.f6245b = mVar;
    }

    public boolean c(View view) {
        return true;
    }

    public final void e() {
        this.f6248e = d(0.6f);
    }

    public final void f() {
        this.f6247d = d(0.1f);
    }

    public final void g() {
        this.f6246c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zIsPointInChildBounds = this.f6249f;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zIsPointInChildBounds = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6249f = zIsPointInChildBounds;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6249f = false;
        }
        if (zIsPointInChildBounds) {
            ViewDragHelper viewDragHelperCreate = this.f6244a;
            if (viewDragHelperCreate == null) {
                viewDragHelperCreate = ViewDragHelper.create(coordinatorLayout, this.f6251h);
                this.f6244a = viewDragHelperCreate;
            }
            if (!this.f6250g && viewDragHelperCreate.shouldInterceptTouchEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i2) {
        if (v.getImportantForAccessibility() != 0) {
            return false;
        }
        v.setImportantForAccessibility(1);
        ViewCompat.removeAccessibilityAction(v, 1048576);
        if (!c(v)) {
            return false;
        }
        ViewCompat.replaceAccessibilityAction(v, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS, null, new l(this));
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f6244a == null) {
            return false;
        }
        if (this.f6250g && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f6244a.processTouchEvent(motionEvent);
        return true;
    }
}
