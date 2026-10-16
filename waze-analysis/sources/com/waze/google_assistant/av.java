package com.waze.google_assistant;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class av extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aw f24117a;

    av(aw awVar) {
        Objects.requireNonNull(awVar);
        this.f24117a = awVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f24117a.f24124g = false;
    }
}
