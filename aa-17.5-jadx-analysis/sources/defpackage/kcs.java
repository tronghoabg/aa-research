package defpackage;

import android.view.animation.Animation;

/* loaded from: classes2.dex */
public final class kcs extends oln {
    final /* synthetic */ kct a;
    final /* synthetic */ Runnable b;

    public kcs(kct kctVar, Runnable runnable) {
        this.a = kctVar;
        this.b = runnable;
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        this.b.run();
    }

    @Override // defpackage.oln, android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.a.setVisibility(0);
    }
}
