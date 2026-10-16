package com.waze.view.bottom;

import android.animation.Animator;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BottomNotificationIcon f45001a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45002b;

    b(BottomNotificationIcon bottomNotificationIcon, int i2, byte[] bArr) {
        this.f45002b = i2;
        Objects.requireNonNull(bottomNotificationIcon);
        this.f45001a = bottomNotificationIcon;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i2 = this.f45002b;
        BottomNotificationIcon bottomNotificationIcon = this.f45001a;
        if (i2 != 0) {
            if (bottomNotificationIcon.mAnimationListener != null) {
                bottomNotificationIcon.mAnimationListener.a();
            }
            bottomNotificationIcon.mDrawRadar = bottomNotificationIcon.mShouldDrawRadar;
            bottomNotificationIcon.postInvalidate();
            return;
        }
        if (bottomNotificationIcon.mAnimationListener != null) {
            bottomNotificationIcon.mAnimationListener.a();
        }
        if (bottomNotificationIcon.mRadarRotator != null) {
            bottomNotificationIcon.mRadarRotator.end();
        }
        bottomNotificationIcon.post(new a(this));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    b(BottomNotificationIcon bottomNotificationIcon, int i2) {
        this.f45002b = i2;
        Objects.requireNonNull(bottomNotificationIcon);
        this.f45001a = bottomNotificationIcon;
    }
}
