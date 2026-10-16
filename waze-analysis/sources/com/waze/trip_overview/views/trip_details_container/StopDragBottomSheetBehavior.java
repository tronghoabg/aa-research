package com.waze.trip_overview.views.trip_details_container;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.g.b.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class StopDragBottomSheetBehavior extends BottomSheetBehavior<View> {
    private final Set s;
    private final float t;
    private boolean u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopDragBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x.f(context, "context");
        this.s = new LinkedHashSet();
        this.t = 0.2f;
        p(new f(this));
        s(true);
    }

    public final float Q() {
        return this.t;
    }

    public final void R(float f2) {
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            ((TripOverviewDetailsBottomSheet) it.next()).f(f2);
        }
    }

    public final void S(boolean z) {
        this.u = z;
    }

    public final void T(TripOverviewDetailsBottomSheet tripOverviewDetailsBottomSheet) {
        x.f(tripOverviewDetailsBottomSheet, "stopDragCallBack");
        this.s.add(tripOverviewDetailsBottomSheet);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        x.f(coordinatorLayout, "parent");
        x.f(view, "child");
        x.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = actionMasked == 1 || actionMasked == 3 || actionMasked == 6;
        if (this.u) {
            if (!z) {
                return true;
            }
            this.u = false;
        }
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, View view, View view2, float f2, float f3) {
        x.f(coordinatorLayout, "coordinatorLayout");
        x.f(view, "child");
        x.f(view2, TypedValues.AttributesType.S_TARGET);
        if (this.u) {
            return false;
        }
        return super.onNestedPreFling(coordinatorLayout, view, view2, f2, f3);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onNestedPreScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
        x.f(coordinatorLayout, "coordinatorLayout");
        x.f(view, "child");
        x.f(view2, TypedValues.AttributesType.S_TARGET);
        x.f(iArr, "consumed");
        if (this.u) {
            return;
        }
        super.onNestedPreScroll(coordinatorLayout, view, view2, i2, i3, iArr, i4);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        x.f(coordinatorLayout, "coordinatorLayout");
        x.f(view, "child");
        x.f(view2, "directTargetChild");
        x.f(view3, TypedValues.AttributesType.S_TARGET);
        if (this.u) {
            return false;
        }
        return super.onStartNestedScroll(coordinatorLayout, view, view2, view3, i2, i3);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void onStopNestedScroll(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
        x.f(coordinatorLayout, "coordinatorLayout");
        x.f(view, "child");
        x.f(view2, TypedValues.AttributesType.S_TARGET);
        if (this.u) {
            return;
        }
        super.onStopNestedScroll(coordinatorLayout, view, view2, i2);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        x.f(coordinatorLayout, "parent");
        x.f(view, "child");
        x.f(motionEvent, NotificationCompat.CATEGORY_EVENT);
        if (this.u) {
            return true;
        }
        try {
            return super.onTouchEvent(coordinatorLayout, view, motionEvent);
        } catch (Exception e2) {
            com.waze.shared_infra.i.h.f("StopDragBottomSheetBehavior:onTouchEvent", "failed with exception, user probably can't touch the bottom sheet", e2);
            return false;
        }
    }
}
