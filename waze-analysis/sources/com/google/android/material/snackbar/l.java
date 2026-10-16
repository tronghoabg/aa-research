package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private h f6757a;

    public l(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.f();
        swipeDismissBehavior.e();
        swipeDismissBehavior.g();
    }

    public final void a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                u.a().f(this.f6757a);
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            u.a().g(this.f6757a);
        }
    }

    public final void b(o oVar) {
        this.f6757a = oVar.f6778c;
    }
}
