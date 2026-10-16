package com.waze.settings;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aq extends ar {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f36787a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewGroup.LayoutParams f36788b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36789c;

    aq(View view, ViewGroup.LayoutParams layoutParams) {
        this.f36787a = view;
        this.f36788b = layoutParams;
    }

    @Override // com.waze.settings.ar, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        h.g.b.x.f(animator, "var1");
        this.f36789c = true;
    }

    @Override // com.waze.settings.ar, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h.g.b.x.f(animator, "var1");
        if (this.f36789c) {
            return;
        }
        View view = this.f36787a;
        view.setLayoutParams(this.f36788b);
        view.setVisibility(8);
    }
}
