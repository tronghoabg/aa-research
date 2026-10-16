package com.waze.reports;

import android.view.ViewTreeObserver;
import android.view.animation.OvershootInterpolator;
import android.view.animation.TranslateAnimation;
import com.waze.view.button.ReportMenuButton;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class de implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ReportMenuButton f33831a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ReportMenuButton f33832b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f33833c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ di f33834d;

    de(di diVar, ReportMenuButton reportMenuButton, ReportMenuButton reportMenuButton2, int i2) {
        this.f33831a = reportMenuButton;
        this.f33832b = reportMenuButton2;
        this.f33833c = i2;
        Objects.requireNonNull(diVar);
        this.f33834d = diVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ReportMenuButton reportMenuButton = this.f33831a;
        reportMenuButton.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        int[] iArr = new int[2];
        this.f33832b.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        reportMenuButton.getLocationOnScreen(iArr2);
        TranslateAnimation translateAnimation = new TranslateAnimation(iArr[0] - iArr2[0], 0.0f, iArr[1] - iArr2[1], 0.0f);
        translateAnimation.setInterpolator(new OvershootInterpolator(0.5f));
        translateAnimation.setDuration(400L);
        translateAnimation.setStartOffset(this.f33833c >> 1);
        translateAnimation.setFillAfter(true);
        reportMenuButton.startAnimation(translateAnimation);
        translateAnimation.setAnimationListener(new dd(this));
    }
}
