package defpackage;

import android.view.animation.Animation;

/* loaded from: classes2.dex */
public final class kcw extends oln {
    final /* synthetic */ Runnable a;

    public kcw(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.a.run();
    }
}
