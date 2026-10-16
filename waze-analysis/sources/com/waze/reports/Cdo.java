package com.waze.reports;

import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import com.waze.view.button.ReportMenuButton;
import j$.util.Objects;

/* compiled from: WazeSource */
/* renamed from: com.waze.reports.do, reason: invalid class name */
/* loaded from: classes7.dex */
final class Cdo implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f33856a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dr f33857b;

    Cdo(dr drVar, boolean z) {
        this.f33856a = z;
        Objects.requireNonNull(drVar);
        this.f33857b = drVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        dr drVar = this.f33857b;
        drVar.s.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        drVar.m.setVisibility(0);
        drVar.u.c();
        drVar.m.animate().alpha(1.0f).setDuration(250L).start();
        boolean z = this.f33856a;
        if (z || drVar.f33861a) {
            for (int i2 = 0; i2 < drVar.f33868h.size(); i2++) {
                ReportMenuButton reportMenuButton = (ReportMenuButton) drVar.f33868h.get(i2);
                reportMenuButton.setEnabled(false);
                reportMenuButton.setClickable(false);
                if (reportMenuButton != drVar.f33872l) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillAfter(true);
                    reportMenuButton.startAnimation(alphaAnimation);
                }
                TextView textView = (TextView) drVar.f33869i.get(i2);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation2.setDuration(0L);
                alphaAnimation2.setFillAfter(true);
                textView.startAnimation(alphaAnimation2);
            }
            drVar.f33864d.clearAnimation();
            if (drVar.f33865e != null) {
                drVar.f33865e.R(true == z ? 50 : 0, 150, null);
                drVar.f33865e.L();
                return;
            }
            return;
        }
        int size = drVar.f33868h.size() - 1;
        int i3 = 20;
        while (size >= 0) {
            ee eeVar = size == 0 ? new ee() : null;
            ReportMenuButton reportMenuButton2 = (ReportMenuButton) drVar.f33868h.get(size);
            reportMenuButton2.clearAnimation();
            reportMenuButton2.j(i, eeVar);
            i += i3;
            double d2 = i3;
            reportMenuButton2.invalidate();
            TextView textView2 = (TextView) drVar.f33869i.get(size);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.addAnimation(new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.5f, 1, 0.0f));
            animationSet.setInterpolator(new DecelerateInterpolator());
            animationSet.setFillBefore(true);
            animationSet.setStartOffset(i);
            animationSet.setDuration(150L);
            textView2.startAnimation(animationSet);
            i3 = (int) (d2 * 1.1d);
            size--;
        }
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation3.setDuration(150L);
        alphaAnimation3.setStartOffset(i);
        drVar.n.startAnimation(alphaAnimation3);
        drVar.o.startAnimation(alphaAnimation3);
    }
}
