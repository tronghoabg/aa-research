package com.waze.trip_overview.c;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class a extends Visibility {
    @Override // androidx.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        x.f(viewGroup, "rootView");
        x.f(view, "animatedView");
        x.f(view, "animatedView");
        Float fValueOf = Float.valueOf(view.getHeight());
        if (fValueOf.floatValue() <= 0.0f) {
            fValueOf = null;
        }
        if (fValueOf == null) {
            return null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", fValueOf.floatValue(), 0.0f);
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setStartDelay(400L);
        objectAnimatorOfFloat.setInterpolator(d.f41281a);
        return objectAnimatorOfFloat;
    }

    @Override // androidx.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        x.f(viewGroup, "rootView");
        x.f(view, "animatedView");
        x.f(view, "animatedView");
        Float fValueOf = Float.valueOf(view.getHeight());
        if (fValueOf.floatValue() <= 0.0f) {
            fValueOf = null;
        }
        if (fValueOf == null) {
            return null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, fValueOf.floatValue());
        objectAnimatorOfFloat.setDuration(400L);
        objectAnimatorOfFloat.setStartDelay(0L);
        objectAnimatorOfFloat.setInterpolator(d.f41282b);
        return objectAnimatorOfFloat;
    }
}
