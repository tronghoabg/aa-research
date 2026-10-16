package com.google.android.material.snackbar;

import R.e;
import ae.b;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.unity3d.services.UnityAdsConstants;
import e8.AbstractC2474a;

/* loaded from: classes4.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: h, reason: collision with root package name */
    public final b f27008h;

    public BaseTransientBottomBar$Behavior() {
        b bVar = new b();
        this.f26786e = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.1f), 1.0f);
        this.f26787f = Math.min(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.6f), 1.0f);
        this.f26785d = 0;
        this.f27008h = bVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, V0.a
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f27008h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (e.f10013b == null) {
                    e.f10013b = new e();
                }
                synchronized (e.f10013b.f10014a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (e.f10013b == null) {
                e.f10013b = new e();
            }
            e.f10013b.a();
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.f27008h.getClass();
        return view instanceof AbstractC2474a;
    }
}
