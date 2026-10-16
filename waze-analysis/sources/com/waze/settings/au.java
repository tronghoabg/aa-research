package com.waze.settings;

import android.animation.Animator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class au extends ar {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ av f36794a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ba f36795b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f36796c;

    au(av avVar, ba baVar) {
        this.f36794a = avVar;
        this.f36795b = baVar;
    }

    @Override // com.waze.settings.ar, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        h.g.b.x.f(animator, "var1");
        this.f36796c = true;
    }

    @Override // com.waze.settings.ar, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h.g.b.x.f(animator, "var1");
        this.f36794a.d();
        if (this.f36796c) {
            return;
        }
        this.f36795b.F = 0.0f;
    }
}
