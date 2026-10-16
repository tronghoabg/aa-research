package defpackage;

import android.view.animation.Animation;

/* loaded from: classes2.dex */
public final class kcz extends oln {
    final /* synthetic */ Runnable a;

    public kcz(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.a.run();
    }
}
