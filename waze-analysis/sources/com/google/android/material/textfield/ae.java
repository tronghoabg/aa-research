package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ae extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f6829a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TextView f6830b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f6831c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TextView f6832d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ af f6833e;

    ae(af afVar, int i2, TextView textView, int i3, TextView textView2) {
        this.f6829a = i2;
        this.f6830b = textView;
        this.f6831c = i3;
        this.f6832d = textView2;
        Objects.requireNonNull(afVar);
        this.f6833e = afVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        af afVar = this.f6833e;
        afVar.n = this.f6829a;
        afVar.f6845l = null;
        TextView textView = this.f6830b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f6831c == 1 && afVar.r != null) {
                afVar.r.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f6832d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f6832d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
