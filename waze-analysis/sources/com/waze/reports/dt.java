package com.waze.reports;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dt implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f33877a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AnimationSet f33878b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ du f33879c;

    dt(du duVar, View view, AnimationSet animationSet) {
        this.f33877a = view;
        this.f33878b = animationSet;
        Objects.requireNonNull(duVar);
        this.f33879c = duVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(final Animation animation) {
        final View view = this.f33877a;
        final AnimationSet animationSet = this.f33878b;
        this.f33879c.post(new Runnable() { // from class: com.waze.reports.ds
            @Override // java.lang.Runnable
            public final void run() {
                animation.setAnimationListener(this.f33873a.f33879c.F);
                view.findViewById(R.id.sos_report_extra_animation_pulse).startAnimation(animationSet);
            }
        });
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
