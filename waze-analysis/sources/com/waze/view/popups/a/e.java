package com.waze.view.popups.a;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.waze.R;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e implements LayoutTransition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewGroup f45192a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f45193b;

    e(h hVar, ViewGroup viewGroup) {
        this.f45192a = viewGroup;
        Objects.requireNonNull(hVar);
        this.f45193b = hVar;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
        View viewFindViewById = this.f45193b.findViewById(R.id.DetailsPopupImageFrame);
        viewFindViewById.setVisibility(0);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(200L);
        animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
        animationSet.addAnimation(new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f));
        animationSet.setInterpolator(new OvershootInterpolator());
        viewFindViewById.startAnimation(animationSet);
        this.f45192a.getLayoutTransition().removeTransitionListener(this);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i2) {
    }
}
