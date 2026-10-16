package com.waze.main_screen.g.b;

import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.waze.R;
import com.waze.sharedui.views.WazeTextView;
import com.waze.view.map.SpeedometerColoredView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f26360a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f26361b;

    c(d dVar, int i2, byte[] bArr) {
        this.f26361b = i2;
        Objects.requireNonNull(dVar);
        this.f26360a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26361b != 0) {
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new ScaleAnimation(1.9f, 1.0f, 1.9f, 1.0f, 1, 0.5f, 1, 0.5f));
            d dVar = this.f26360a;
            animationSet.addAnimation(new TranslateAnimation(dVar.f26369h, 0.0f, dVar.f26370i, 0.0f));
            animationSet.setDuration(300L);
            animationSet.setInterpolator(new DecelerateInterpolator());
            dVar.findViewById(R.id.speedLimitWarnLayout).startAnimation(animationSet);
            if (dVar.j()) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setAnimationListener(new b(this));
                WazeTextView wazeTextView = dVar.f26367f;
                wazeTextView.setVisibility(0);
                wazeTextView.startAnimation(alphaAnimation);
                return;
            }
            return;
        }
        d dVar2 = this.f26360a;
        if (!dVar2.f26372k.f26350c) {
            SpeedometerColoredView speedometerColoredView = dVar2.f26368g;
            speedometerColoredView.a(dVar2.f26372k.f26355h);
            speedometerColoredView.c(dVar2.f26372k.f26351d);
            speedometerColoredView.invalidate();
            if (dVar2.f26372k.f26356i) {
                if (dVar2.f26372k.f26351d < dVar2.f26372k.f26352e) {
                    dVar2.f26372k = dVar2.f26372k.a(dVar2.f26372k.f26351d + 3.0f);
                } else {
                    dVar2.f26372k = dVar2.f26372k.e(true);
                }
            } else if (dVar2.f26372k.f26351d > dVar2.f26372k.f26352e) {
                dVar2.f26372k = dVar2.f26372k.a(dVar2.f26372k.f26351d - 3.0f);
            } else {
                dVar2.f26372k = dVar2.f26372k.e(true);
            }
        }
        if (dVar2.f26372k.f26350c) {
            return;
        }
        dVar2.postDelayed(dVar2.n, 10L);
    }

    c(d dVar, int i2) {
        this.f26361b = i2;
        Objects.requireNonNull(dVar);
        this.f26360a = dVar;
    }
}
