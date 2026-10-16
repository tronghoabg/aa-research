package com.waze.view.anim;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import com.waze.sharedui.views.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Interpolator f44979a = k.f39250a;

    public static Animator.AnimatorListener a(Runnable runnable) {
        return new e(runnable);
    }

    public static Animator.AnimatorListener b(View view) {
        return new e(new f(view, 1));
    }

    public static Animator.AnimatorListener c(View view) {
        return new e(new f(view, 0));
    }

    public static ViewPropertyAnimator d(View view) {
        return e(view, 300L);
    }

    public static ViewPropertyAnimator e(View view, long j2) {
        return f(view, j2, f44979a);
    }

    public static ViewPropertyAnimator f(View view, long j2, Interpolator interpolator) {
        return view.animate().setDuration(j2).setInterpolator(interpolator);
    }
}
