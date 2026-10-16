package com.waze.sdk;

import android.animation.Animator;
import android.content.res.Resources;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f35396a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f35397b;

    o(ae aeVar, boolean z) {
        this.f35396a = z;
        Objects.requireNonNull(aeVar);
        this.f35397b = aeVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        if (!this.f35396a) {
            this.f35397b.f35224j.setVisibility(8);
        }
        ae aeVar = this.f35397b;
        aeVar.f35224j.getLayoutParams().width = -1;
        aeVar.f35224j.getLayoutParams().height = -1;
        aeVar.f35224j.setLayoutParams(aeVar.f35224j.getLayoutParams());
        aeVar.f35224j.setTranslationX(0.0f);
        aeVar.f35224j.setTranslationY(0.0f);
        aeVar.f35221g.getLayoutParams().width = -1;
        aeVar.f35221g.setLayoutParams(aeVar.f35221g.getLayoutParams());
        aeVar.f35221g.setTranslationX(0.0f);
        aeVar.f35221g.setTranslationY(0.0f);
        aeVar.av();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
